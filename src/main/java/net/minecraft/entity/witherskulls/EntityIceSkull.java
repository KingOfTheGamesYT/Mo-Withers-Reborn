package net.minecraft.entity.witherskulls;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityIceSkull
  extends EntityWitherSkull
{
  public EntityIceSkull(World worldIn)
  {
    super(worldIn);
    setSize(0.5F, 0.5F);
  }
  
  public EntityIceSkull(World worldIn, EntityLivingBase p_i1794_2_, double p_i1794_3_, double p_i1794_5_, double p_i1794_7_)
  {
    super(worldIn, p_i1794_2_, p_i1794_3_, p_i1794_5_, p_i1794_7_);
    setSize(0.5F, 0.5F);
  }
  
  @SideOnly(Side.CLIENT)
  public EntityIceSkull(World worldIn, double p_i1795_2_, double p_i1795_4_, double p_i1795_6_, double p_i1795_8_, double p_i1795_10_, double p_i1795_12_)
  {
    super(worldIn, p_i1795_2_, p_i1795_4_, p_i1795_6_, p_i1795_8_, p_i1795_10_, p_i1795_12_);
    setSize(0.5F, 0.5F);
  }
  
  protected void onImpact(RayTraceResult movingObject)
  {
    if (!this.worldObj.isRemote)
    {
      if (movingObject.entityHit != null)
      {
        if (this.shootingEntity != null)
        {
          if (movingObject.entityHit.attackEntityFrom(DamageSource.causeMobDamage(this.shootingEntity), 12.0F))
          {
            boolean flag = true;
            if ((this.shootingEntity != null) && ((this.shootingEntity instanceof EntityLiving))) {
              flag = this.worldObj.getGameRules().getBoolean("mobGriefing");
            }
            if (flag)
            {
              BlockPos blockpos = new BlockPos(movingObject.entityHit.posX, movingObject.entityHit.posY + movingObject.entityHit.getEyeHeight(), movingObject.entityHit.posZ);
              Block block = this.worldObj.getBlockState(new BlockPos(blockpos)).getBlock();
              if (block.getBlockHardness(worldObj, blockpos) != -1F && !block.isOpaqueCube() && block != Blocks.ICE && block != Blocks.PACKED_ICE) {
                if (this.rand.nextInt(20) == 0) {
                  this.worldObj.setBlockState(blockpos, Blocks.PACKED_ICE.getDefaultState());
                } else {
                  this.worldObj.setBlockState(blockpos, Blocks.ICE.getDefaultState());
                }
              }
            }
            movingObject.entityHit.attackEntityFrom(DamageSource.fallingBlock, 12.0F);
            if (!movingObject.entityHit.isEntityAlive()) {
              this.shootingEntity.heal(5.0F);
            } else {
              applyEnchantments(this.shootingEntity, movingObject.entityHit);
            }
          }
        }
        else {
          movingObject.entityHit.attackEntityFrom(DamageSource.fallingBlock, 12.0F);
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
            ((EntityLivingBase)movingObject.entityHit).addPotionEffect(new PotionEffect(MobEffects.WITHER, 20 * b0, 1));
          }
        }
      }
      else
      {
        boolean flag = true;
        if ((this.shootingEntity != null) && ((this.shootingEntity instanceof EntityLiving))) {
          flag = this.worldObj.getGameRules().getBoolean("mobGriefing");
        }
        if (flag)
        {
          BlockPos blockpos = movingObject.getBlockPos().offset(movingObject.sideHit);
          Block block = this.worldObj.getBlockState(new BlockPos(blockpos)).getBlock();
          if (block.getBlockHardness(worldObj, blockpos) != -1F && !block.isOpaqueCube() && block != Blocks.ICE && block != Blocks.PACKED_ICE) {
            if (this.rand.nextInt(20) == 0) {
              this.worldObj.setBlockState(blockpos, Blocks.PACKED_ICE.getDefaultState());
            } else {
              this.worldObj.setBlockState(blockpos, Blocks.ICE.getDefaultState());
            }
          }
        }
      }
      this.playSound(SoundEvents.ENTITY_GENERIC_EXPLODE, 4.0F, (1.0F + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F) * 0.7F);
      setDead();
    }
  }
}