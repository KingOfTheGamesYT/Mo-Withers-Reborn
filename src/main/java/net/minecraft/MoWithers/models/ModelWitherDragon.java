package net.minecraft.MoWithers.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.wither.EntityWitherDragon;
import net.minecraft.util.MathHelper;

public class ModelWitherDragon
  extends ModelBase
{
  public ModelRenderer upperhead;
  public ModelRenderer neck;
  public ModelRenderer upperlip;
  public ModelRenderer scale1;
  public ModelRenderer scale1_1;
  public ModelRenderer jaw;
  public ModelRenderer nostril1;
  public ModelRenderer nostril2;
  public ModelRenderer midsection;
  public ModelRenderer right1;
  public ModelRenderer left1;
  public ModelRenderer bottom1;
  public ModelRenderer rib1;
  public ModelRenderer rib2;
  public ModelRenderer rib3;
  public ModelRenderer rib4;
  public ModelRenderer rib5;
  public ModelRenderer rib6;
  public ModelRenderer rib7;
  public ModelRenderer rib8;
  public ModelRenderer bottom2;
  public ModelRenderer bottom3;
  public ModelRenderer right2;
  public ModelRenderer right3;
  public ModelRenderer right4;
  public ModelRenderer right5;
  public ModelRenderer right6;
  public ModelRenderer[] upperheads;
  public ModelRenderer rightfinger11;
  public ModelRenderer rightfinger21;
  public ModelRenderer upperlip1;
  public ModelRenderer scale11;
  public ModelRenderer scale12;
  public ModelRenderer jaw1;
  public ModelRenderer nostril11;
  public ModelRenderer nostril12;
  public ModelRenderer rightfinger12;
  public ModelRenderer rightfinger22;
  public ModelRenderer left2;
  public ModelRenderer left3;
  public ModelRenderer left4;
  public ModelRenderer left5;
  public ModelRenderer left6;
  public ModelRenderer leftfinger11;
  public ModelRenderer leftfinger12;
  public ModelRenderer upperlip2;
  public ModelRenderer scale21;
  public ModelRenderer scale22;
  public ModelRenderer jaw2;
  public ModelRenderer nostril21;
  public ModelRenderer nostril22;
  public ModelRenderer leftfinger21;
  public ModelRenderer leftfinger22;
  
  public ModelWitherDragon(float f)
  {
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.left5 = new ModelRenderer(this, 192, 104);
    this.left5.setRotationPoint(8.0F, 0.0F, 0.0F);
    this.left5.addBox(0.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.right3 = new ModelRenderer(this, 192, 104);
    this.right3.mirror = true;
    this.right3.setRotationPoint(-8.0F, 0.0F, 0.0F);
    this.right3.addBox(-8.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.rib1 = new ModelRenderer(this, 112, 136);
    this.rib1.setRotationPoint(0.0F, 5.0F, 0.0F);
    this.rib1.addBox(-15.0F, -2.0F, -2.0F, 30, 4, 4, f);
    this.scale11 = new ModelRenderer(this, 0, 0);
    this.scale11.mirror = true;
    this.scale11.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.scale11.addBox(-4.0F, -9.0F, -3.0F, 2, 3, 6, f);
    this.rightfinger12 = new ModelRenderer(this, 0, 104);
    this.rightfinger12.mirror = true;
    this.rightfinger12.setRotationPoint(-38.0F, 0.0F, 0.0F);
    this.rightfinger12.addBox(-40.0F, -2.0F, -2.0F, 40, 4, 4, f);
    this.rib2 = new ModelRenderer(this, 112, 136);
    this.rib2.setRotationPoint(0.0F, 10.0F, 0.0F);
    this.rib2.addBox(-14.0F, -2.0F, -2.0F, 28, 4, 4, f);
    this.scale21 = new ModelRenderer(this, 0, 0);
    this.scale21.mirror = true;
    this.scale21.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.scale21.addBox(-4.0F, -9.0F, -3.0F, 2, 3, 6, f);
    this.rib5 = new ModelRenderer(this, 112, 136);
    this.rib5.setRotationPoint(0.0F, 25.0F, 0.0F);
    this.rib5.addBox(-13.0F, -2.0F, -2.0F, 26, 4, 4, f);
    this.rib4 = new ModelRenderer(this, 112, 136);
    this.rib4.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.rib4.addBox(-14.0F, -2.0F, -2.0F, 28, 4, 4, f);
    this.upperlip1 = new ModelRenderer(this, 176, 0);
    this.upperlip1.mirror = true;
    this.upperlip1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.upperlip1.addBox(-4.0F, -1.0F, -18.0F, 8, 4, 12, f);
    this.rib3 = new ModelRenderer(this, 112, 136);
    this.rib3.setRotationPoint(0.0F, 15.0F, 0.0F);
    this.rib3.addBox(-14.0F, -2.0F, -2.0F, 28, 4, 4, f);
    this.right5 = new ModelRenderer(this, 192, 104);
    this.right5.mirror = true;
    this.right5.setRotationPoint(-8.0F, 0.0F, 0.0F);
    this.right5.addBox(-8.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.neck = new ModelRenderer(this, 192, 120);
    this.neck.setRotationPoint(0.0F, -57.0F, 0.0F);
    this.neck.addBox(-5.0F, 0.0F, -5.0F, 10, 10, 10, f);
    this.right1 = new ModelRenderer(this, 192, 104);
    this.right1.mirror = true;
    this.right1.setRotationPoint(-4.0F, 5.0F, 0.0F);
    this.right1.addBox(-8.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.nostril22 = new ModelRenderer(this, 112, 0);
    this.nostril22.setRotationPoint(3.0F, 0.0F, -15.0F);
    this.nostril22.addBox(-1.0F, -3.0F, -2.0F, 2, 2, 4, f);
    this.left1 = new ModelRenderer(this, 192, 104);
    this.left1.setRotationPoint(4.0F, 5.0F, 0.0F);
    this.left1.addBox(0.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.bottom1 = new ModelRenderer(this, 64, 59);
    this.bottom1.setRotationPoint(0.0F, 50.0F, 0.0F);
    this.bottom1.addBox(-3.5F, 0.0F, -3.5F, 7, 7, 7, f);
    this.nostril12 = new ModelRenderer(this, 112, 0);
    this.nostril12.setRotationPoint(3.0F, 0.0F, -15.0F);
    this.nostril12.addBox(-1.0F, -3.0F, -2.0F, 2, 2, 4, f);
    this.left4 = new ModelRenderer(this, 192, 104);
    this.left4.setRotationPoint(8.0F, 0.0F, 0.0F);
    this.left4.addBox(0.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.left2 = new ModelRenderer(this, 192, 104);
    this.left2.setRotationPoint(8.0F, 0.0F, 0.0F);
    this.left2.addBox(0.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.leftfinger21 = new ModelRenderer(this, 0, 104);
    this.leftfinger21.setRotationPoint(40.0F, 0.0F, 0.0F);
    this.leftfinger21.addBox(0.0F, -2.0F, -2.0F, 40, 4, 4, f);
    this.rightfinger11 = new ModelRenderer(this, 0, 104);
    this.rightfinger11.mirror = true;
    this.rightfinger11.setRotationPoint(-8.0F, -4.0F, 2.0F);
    this.rightfinger11.addBox(-40.0F, -2.0F, -2.0F, 40, 4, 4, f);
    this.rightfinger21 = new ModelRenderer(this, 0, 114);
    this.rightfinger21.mirror = true;
    this.rightfinger21.setRotationPoint(4.0F, 0.0F, 1.5F);
    this.rightfinger21.addBox(-30.0F, -1.5F, -1.5F, 30, 3, 3, f);
    this.right6 = new ModelRenderer(this, 192, 104);
    this.right6.setRotationPoint(-8.0F, 0.0F, 0.0F);
    this.right6.addBox(-8.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.rib6 = new ModelRenderer(this, 112, 136);
    this.rib6.setRotationPoint(0.0F, 30.0F, 0.0F);
    this.rib6.addBox(-12.0F, -2.0F, -2.0F, 24, 4, 4, f);
    this.nostril2 = new ModelRenderer(this, 112, 0);
    this.nostril2.setRotationPoint(4.0F, 0.0F, -20.0F);
    this.nostril2.addBox(-1.0F, -3.0F, -2.0F, 2, 2, 4, f);
    this.left6 = new ModelRenderer(this, 192, 104);
    this.left6.setRotationPoint(8.0F, 0.0F, 0.0F);
    this.left6.addBox(0.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.rightfinger22 = new ModelRenderer(this, 0, 114);
    this.rightfinger22.mirror = true;
    this.rightfinger22.setRotationPoint(-28.0F, 0.0F, 0.0F);
    this.rightfinger22.addBox(-30.0F, -1.5F, -1.5F, 30, 3, 3, f);
    this.jaw2 = new ModelRenderer(this, 176, 16);
    this.jaw2.setRotationPoint(0.0F, 3.0F, -8.0F);
    this.jaw2.addBox(-4.0F, 0.0F, -10.0F, 8, 3, 12, f);
    this.scale1_1 = new ModelRenderer(this, 0, 0);
    this.scale1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.scale1_1.addBox(3.0F, -12.0F, -2.0F, 2, 4, 6, f);
    this.nostril1 = new ModelRenderer(this, 112, 0);
    this.nostril1.mirror = true;
    this.nostril1.setRotationPoint(-4.0F, 0.0F, -20.0F);
    this.nostril1.addBox(-1.0F, -3.0F, -2.0F, 2, 2, 4, f);
    this.leftfinger12 = new ModelRenderer(this, 0, 114);
    this.leftfinger12.setRotationPoint(-6.0F, 0.0F, 1.5F);
    this.leftfinger12.addBox(0.0F, -1.5F, -1.5F, 30, 3, 3, f);
    this.right4 = new ModelRenderer(this, 192, 104);
    this.right4.mirror = true;
    this.right4.setRotationPoint(-8.0F, 0.0F, 0.0F);
    this.right4.addBox(-8.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.bottom3 = new ModelRenderer(this, 64, 88);
    this.bottom3.setRotationPoint(0.0F, 7.0F, 0.0F);
    this.bottom3.addBox(-3.5F, 0.0F, -3.5F, 7, 7, 7, f);
    this.midsection = new ModelRenderer(this, 64, 0);
    this.midsection.setRotationPoint(0.0F, 10.0F, 0.0F);
    this.midsection.addBox(-4.0F, 0.0F, -4.0F, 8, 50, 8, f);
    this.upperheads = new ModelRenderer[2];
    this.upperheads[0] = new ModelRenderer(this, 112, 62);
    this.upperheads[0].mirror = true;
    this.upperheads[0].setRotationPoint(-6.0F, -6.0F, -4.0F);
    this.upperheads[0].addBox(-6.0F, -6.0F, -6.0F, 12, 12, 12, f);
    this.upperheads[1] = new ModelRenderer(this, 112, 62);
    this.upperheads[1].setRotationPoint(6.0F, -6.0F, -4.0F);
    this.upperheads[1].addBox(-6.0F, -6.0F, -6.0F, 12, 12, 12, f);
    this.upperlip2 = new ModelRenderer(this, 176, 0);
    this.upperlip2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.upperlip2.addBox(-4.0F, -1.0F, -18.0F, 8, 4, 12, f);
    this.jaw1 = new ModelRenderer(this, 176, 16);
    this.jaw1.mirror = true;
    this.jaw1.setRotationPoint(0.0F, 3.0F, -8.0F);
    this.jaw1.addBox(-4.0F, 0.0F, -10.0F, 8, 3, 12, f);
    this.upperlip = new ModelRenderer(this, 176, 44);
    this.upperlip.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.upperlip.addBox(-6.0F, -1.0F, -24.0F, 12, 5, 16, f);
    this.scale12 = new ModelRenderer(this, 0, 0);
    this.scale12.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.scale12.addBox(2.0F, -9.0F, -3.0F, 2, 3, 6, f);
    this.rib7 = new ModelRenderer(this, 112, 136);
    this.rib7.setRotationPoint(0.0F, 35.0F, 0.0F);
    this.rib7.addBox(-12.0F, -2.0F, -2.0F, 24, 4, 4, f);
    this.upperhead = new ModelRenderer(this, 112, 30);
    this.upperhead.setRotationPoint(0.0F, -65.0F, 0.0F);
    this.upperhead.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16, f);
    this.bottom2 = new ModelRenderer(this, 64, 73);
    this.bottom2.setRotationPoint(0.0F, 7.0F, 0.0F);
    this.bottom2.addBox(-3.5F, 0.0F, -3.5F, 7, 7, 7, f);
    this.leftfinger22 = new ModelRenderer(this, 0, 114);
    this.leftfinger22.setRotationPoint(28.0F, 0.0F, 0.0F);
    this.leftfinger22.addBox(0.0F, -1.5F, -1.5F, 30, 3, 3, f);
    this.jaw = new ModelRenderer(this, 176, 65);
    this.jaw.setRotationPoint(0.0F, 4.0F, -8.0F);
    this.jaw.addBox(-6.0F, 0.0F, -16.0F, 12, 4, 16, 0.0F);
    this.left3 = new ModelRenderer(this, 192, 104);
    this.left3.setRotationPoint(8.0F, 0.0F, 0.0F);
    this.left3.addBox(0.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.nostril21 = new ModelRenderer(this, 112, 0);
    this.nostril21.mirror = true;
    this.nostril21.setRotationPoint(-3.0F, 0.0F, -15.0F);
    this.nostril21.addBox(-1.0F, -3.0F, -2.0F, 2, 2, 4, f);
    this.scale22 = new ModelRenderer(this, 0, 0);
    this.scale22.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.scale22.addBox(2.0F, -9.0F, -3.0F, 2, 3, 6, f);
    this.rib8 = new ModelRenderer(this, 112, 136);
    this.rib8.setRotationPoint(0.0F, 40.0F, 0.0F);
    this.rib8.addBox(-12.0F, -2.0F, -2.0F, 24, 4, 4, f);
    this.nostril11 = new ModelRenderer(this, 112, 0);
    this.nostril11.mirror = true;
    this.nostril11.setRotationPoint(-3.0F, 0.0F, -15.0F);
    this.nostril11.addBox(-1.0F, -3.0F, -2.0F, 2, 2, 4, f);
    this.scale1 = new ModelRenderer(this, 0, 0);
    this.scale1.mirror = true;
    this.scale1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.scale1.addBox(-5.0F, -12.0F, -2.0F, 2, 4, 6, f);
    this.right2 = new ModelRenderer(this, 192, 104);
    this.right2.mirror = true;
    this.right2.setRotationPoint(-8.0F, 0.0F, 0.0F);
    this.right2.addBox(-8.0F, -4.0F, -4.0F, 8, 8, 8, f);
    this.leftfinger11 = new ModelRenderer(this, 0, 104);
    this.leftfinger11.setRotationPoint(8.0F, -4.0F, 2.0F);
    this.leftfinger11.addBox(0.0F, -2.0F, -2.0F, 40, 4, 4, f);
    this.left4.addChild(this.left5);
    this.right2.addChild(this.right3);
    this.midsection.addChild(this.rib1);
    this.upperheads[0].addChild(this.scale11);
    this.rightfinger11.addChild(this.rightfinger12);
    this.midsection.addChild(this.rib2);
    this.upperheads[1].addChild(this.scale21);
    this.midsection.addChild(this.rib5);
    this.midsection.addChild(this.rib4);
    this.upperheads[0].addChild(this.upperlip1);
    this.midsection.addChild(this.rib3);
    this.right4.addChild(this.right5);
    this.neck.addChild(this.right1);
    this.upperlip2.addChild(this.nostril22);
    this.neck.addChild(this.left1);
    this.midsection.addChild(this.bottom1);
    this.upperlip1.addChild(this.nostril12);
    this.left3.addChild(this.left4);
    this.left1.addChild(this.left2);
    this.leftfinger11.addChild(this.leftfinger21);
    this.right6.addChild(this.rightfinger11);
    this.right6.addChild(this.rightfinger21);
    this.right5.addChild(this.right6);
    this.midsection.addChild(this.rib6);
    this.upperlip.addChild(this.nostril2);
    this.left5.addChild(this.left6);
    this.rightfinger21.addChild(this.rightfinger22);
    this.upperheads[1].addChild(this.jaw2);
    this.upperhead.addChild(this.scale1_1);
    this.upperlip.addChild(this.nostril1);
    this.left6.addChild(this.leftfinger12);
    this.right3.addChild(this.right4);
    this.bottom2.addChild(this.bottom3);
    this.neck.addChild(this.midsection);
    this.right6.addChild(this.upperheads[0]);
    this.upperheads[1].addChild(this.upperlip2);
    this.upperheads[0].addChild(this.jaw1);
    this.upperhead.addChild(this.upperlip);
    this.upperheads[0].addChild(this.scale12);
    this.midsection.addChild(this.rib7);
    this.bottom1.addChild(this.bottom2);
    this.leftfinger12.addChild(this.leftfinger22);
    this.upperhead.addChild(this.jaw);
    this.left6.addChild(this.upperheads[1]);
    this.left2.addChild(this.left3);
    this.upperlip2.addChild(this.nostril21);
    this.upperheads[1].addChild(this.scale22);
    this.midsection.addChild(this.rib8);
    this.upperlip1.addChild(this.nostril11);
    this.upperhead.addChild(this.scale1);
    this.right1.addChild(this.right2);
    this.left6.addChild(this.leftfinger11);
  }
  
  public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_)
  {
    setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);
    this.neck.render(p_78088_7_);
    this.upperhead.render(p_78088_7_);
  }
  
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
  {
    float f6 = MathHelper.cos(p_78087_3_ * 0.1F);
    float f7 = MathHelper.cos(p_78087_3_ * 0.05F);
    this.rightfinger11.rotateAngleZ = (-0.5F + (0.3F + 0.05F * f6) * 3.1415927F);
    this.rightfinger21.rotateAngleZ = (0.5F + -(0.4F + 0.075F * f6) * 3.1415927F);
    this.rightfinger12.rotateAngleZ = (-(0.3F + 0.05F * f6) * 3.1415927F);
    this.rightfinger22.rotateAngleZ = (-(0.2F + 0.1F * f6) * 3.1415927F);
    this.leftfinger11.rotateAngleZ = (0.5F + -(0.3F + 0.05F * f6) * 3.1415927F);
    this.leftfinger21.rotateAngleZ = ((0.4F + 0.075F * f6) * 3.1415927F);
    this.leftfinger12.rotateAngleZ = ((0.3F + 0.075F * f6) * 3.1415927F);
    this.leftfinger22.rotateAngleZ = ((0.2F + 0.1F * f6) * 3.1415927F);
    this.right1.rotateAngleZ = (-(0.1F + 0.125F * f7) * 3.1415927F);
    this.right2.rotateAngleZ = ((0.025F + 0.0325F * f7) * 3.1415927F);
    this.right3.rotateAngleZ = ((0.025F + 0.0325F * f7) * 3.1415927F);
    this.right4.rotateAngleZ = ((0.025F + 0.0325F * f7) * 3.1415927F);
    this.right5.rotateAngleZ = ((0.0325F + 0.05F * f7) * 3.1415927F);
    this.right6.rotateAngleZ = ((0.0325F + 0.05F * f7) * 3.1415927F);
    this.upperheads[0].rotateAngleZ = (-(0.05F + 0.075F * f7) * 3.1415927F);
    this.left1.rotateAngleZ = ((0.1F + 0.125F * f7) * 3.1415927F);
    this.left2.rotateAngleZ = (-(0.025F + 0.0325F * f7) * 3.1415927F);
    this.left3.rotateAngleZ = (-(0.025F + 0.0325F * f7) * 3.1415927F);
    this.left4.rotateAngleZ = (-(0.025F + 0.0325F * f7) * 3.1415927F);
    this.left5.rotateAngleZ = (-(0.0325F + 0.05F * f7) * 3.1415927F);
    this.left6.rotateAngleZ = (-(0.0325F + 0.05F * f7) * 3.1415927F);
    this.upperheads[1].rotateAngleZ = ((0.05F + 0.075F * f7) * 3.1415927F);
    this.jaw.rotateAngleX = ((0.05F + 0.05F * f6) * 3.1415927F);
    this.jaw1.rotateAngleX = ((0.05F + 0.05F * f6) * 3.1415927F);
    this.jaw2.rotateAngleX = ((0.05F + 0.05F * f6) * 3.1415927F);
    this.midsection.rotateAngleX = ((0.06F + 0.05F * f6) * 3.1415927F);
    this.bottom1.rotateAngleX = ((0.1F + 0.05F * f6) * 3.1415927F);
    this.bottom2.rotateAngleX = ((0.1F + 0.05F * f7) * 3.1415927F);
    this.bottom3.rotateAngleX = ((0.1F + 0.05F * f6) * 3.1415927F);
    this.upperhead.rotateAngleY = (p_78087_4_ / 57.295776F);
    this.upperhead.rotateAngleX = (p_78087_5_ / 57.295776F);
    this.upperhead.rotationPointY = ((-20.0F + 0.025F * f6) * 3.1415927F);
  }
  
  public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_)
  {
    EntityWitherDragon entitywither = (EntityWitherDragon)p_78086_1_;
    
    this.upperheads[0].rotateAngleY = ((entitywither.func_82207_a(0) - p_78086_1_.renderYawOffset) / 57.295776F);
    this.upperheads[0].rotateAngleX = (entitywither.func_82210_r(0) / 57.295776F);
    this.upperheads[1].rotateAngleY = ((entitywither.func_82207_a(1) - p_78086_1_.renderYawOffset) / 57.295776F);
    this.upperheads[1].rotateAngleX = (entitywither.func_82210_r(1) / 57.295776F);
  }
}