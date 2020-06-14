package net.minecraft.entity.witherskulls;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.entity.wither.*;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.Explosion;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityWaterSkull
  extends EntityWitherSkull
{
  public EntityWaterSkull(World worldIn)
  {
    super(worldIn);
    setSize(0.5F, 0.5F);
  }
  
  public EntityWaterSkull(World worldIn, EntityLivingBase p_i1794_2_, double p_i1794_3_, double p_i1794_5_, double p_i1794_7_)
  {
    super(worldIn, p_i1794_2_, p_i1794_3_, p_i1794_5_, p_i1794_7_);
    setSize(0.5F, 0.5F);
  }
  
  @SideOnly(Side.CLIENT)
  public EntityWaterSkull(World worldIn, double p_i1795_2_, double p_i1795_4_, double p_i1795_6_, double p_i1795_8_, double p_i1795_10_, double p_i1795_12_)
  {
    super(worldIn, p_i1795_2_, p_i1795_4_, p_i1795_6_, p_i1795_8_, p_i1795_10_, p_i1795_12_);
    setSize(0.5F, 0.5F);
  }
  
  protected void onImpact(MovingObjectPosition movingObject)
  {
    if (!this.worldObj.isRemote)
    {
      if (movingObject.entityHit != null)
      {
        if (this.shootingEntity != null)
        {
        	float dam = 12F;
            if (movingObject.entityHit instanceof EntityEnderman || movingObject.entityHit instanceof EntityBlaze || movingObject.entityHit instanceof EntitySnowman || movingObject.entityHit instanceof EntityBlazeWither || movingObject.entityHit instanceof EntityFireWither || movingObject.entityHit instanceof EntityMagmaWither)
            {
            	dam *= 5F;
            }
        	
          if (movingObject.entityHit.attackEntityFrom(DamageSource.drown, dam))
          {
            boolean flag = true;
            if ((this.shootingEntity != null) && ((this.shootingEntity instanceof EntityLiving))) {
              flag = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing");
            }
            if (flag)
            {
              BlockPos blockpos = new BlockPos(movingObject.entityHit.posX, movingObject.entityHit.posY + movingObject.entityHit.getEyeHeight(), movingObject.entityHit.posZ);
              Block block = this.worldObj.getBlockState(new BlockPos(blockpos)).getBlock();
              if (block.getBlockHardness(worldObj, blockpos) != -1F && !block.isOpaqueCube()) {
                this.worldObj.setBlockState(blockpos, Blocks.water.getDefaultState());
                this.worldObj.setBlockState(blockpos.up(), Blocks.flowing_water.getDefaultState());
                this.worldObj.scheduleUpdate(blockpos, this.worldObj.getBlockState(blockpos).getBlock(), this.worldObj.getBlockState(blockpos).getBlock().tickRate(this.worldObj));
              }
            }
            movingObject.entityHit.attackEntityFrom(DamageSource.causeMobDamage(this.shootingEntity), 24.0F);
            if (!movingObject.entityHit.isEntityAlive()) {
              this.shootingEntity.heal(5.0F);
            } else {
              func_174815_a(this.shootingEntity, movingObject.entityHit);
            }
          }
        }
        else {
          movingObject.entityHit.attackEntityFrom(DamageSource.drown, 12.0F);
        }
        if ((movingObject.entityHit instanceof EntityLivingBase))
        {
          byte b0 = 0;
          if (this.worldObj.getDifficulty() == EnumDifficulty.NORMAL) {
            b0 = 10;
          } else if (this.worldObj.getDifficulty() == EnumDifficulty.HARD) {
            b0 = 40;
          }
          if (b0 > 0) {
            ((EntityLivingBase)movingObject.entityHit).addPotionEffect(new PotionEffect(Potion.wither.id, 20 * b0, 1));
          }
        }
      }
      else
      {
        boolean flag = true;
        if ((this.shootingEntity != null) && ((this.shootingEntity instanceof EntityLiving))) {
          flag = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing");
        }
        if (flag)
        {
          BlockPos blockpos = movingObject.getBlockPos().offset(movingObject.sideHit);
          Block block = this.worldObj.getBlockState(new BlockPos(blockpos)).getBlock();
          if (block.getBlockHardness(worldObj, blockpos) != -1F && !block.isOpaqueCube()) {
            this.worldObj.setBlockState(blockpos, Blocks.water.getDefaultState());
            this.worldObj.setBlockState(blockpos.up(), Blocks.flowing_water.getDefaultState());
            this.worldObj.scheduleUpdate(blockpos, this.worldObj.getBlockState(blockpos).getBlock(), this.worldObj.getBlockState(blockpos).getBlock().tickRate(this.worldObj));
          }
        }
      }
      this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "random.explode", 4.0F, (1.0F + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F) * 0.7F);
      
      setDead();
    }
  }
}