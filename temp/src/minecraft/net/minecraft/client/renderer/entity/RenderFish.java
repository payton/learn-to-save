package net.minecraft.client.renderer.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class RenderFish extends Render<EntityFishHook> {
   private static final ResourceLocation field_110792_a = new ResourceLocation("textures/particle/particles.png");

   public RenderFish(RenderManager p_i46175_1_) {
      super(p_i46175_1_);
   }

   public void func_76986_a(EntityFishHook p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      EntityPlayer entityplayer = p_76986_1_.func_190619_l();
      if(entityplayer != null && !this.field_188301_f) {
         GlStateManager.func_179094_E();
         GlStateManager.func_179109_b((float)p_76986_2_, (float)p_76986_4_, (float)p_76986_6_);
         GlStateManager.func_179091_B();
         GlStateManager.func_179152_a(0.5F, 0.5F, 0.5F);
         this.func_180548_c(p_76986_1_);
         Tessellator tessellator = Tessellator.func_178181_a();
         VertexBuffer vertexbuffer = tessellator.func_178180_c();
         int i = 1;
         int j = 2;
         float f = 0.0625F;
         float f1 = 0.125F;
         float f2 = 0.125F;
         float f3 = 0.1875F;
         float f4 = 1.0F;
         float f5 = 0.5F;
         float f6 = 0.5F;
         GlStateManager.func_179114_b(180.0F - this.field_76990_c.field_78735_i, 0.0F, 1.0F, 0.0F);
         GlStateManager.func_179114_b((float)(this.field_76990_c.field_78733_k.field_74320_O == 2?-1:1) * -this.field_76990_c.field_78732_j, 1.0F, 0.0F, 0.0F);
         if(this.field_188301_f) {
            GlStateManager.func_179142_g();
            GlStateManager.func_187431_e(this.func_188298_c(p_76986_1_));
         }

         vertexbuffer.func_181668_a(7, DefaultVertexFormats.field_181710_j);
         vertexbuffer.func_181662_b(-0.5D, -0.5D, 0.0D).func_187315_a(0.0625D, 0.1875D).func_181663_c(0.0F, 1.0F, 0.0F).func_181675_d();
         vertexbuffer.func_181662_b(0.5D, -0.5D, 0.0D).func_187315_a(0.125D, 0.1875D).func_181663_c(0.0F, 1.0F, 0.0F).func_181675_d();
         vertexbuffer.func_181662_b(0.5D, 0.5D, 0.0D).func_187315_a(0.125D, 0.125D).func_181663_c(0.0F, 1.0F, 0.0F).func_181675_d();
         vertexbuffer.func_181662_b(-0.5D, 0.5D, 0.0D).func_187315_a(0.0625D, 0.125D).func_181663_c(0.0F, 1.0F, 0.0F).func_181675_d();
         tessellator.func_78381_a();
         if(this.field_188301_f) {
            GlStateManager.func_187417_n();
            GlStateManager.func_179119_h();
         }

         GlStateManager.func_179101_C();
         GlStateManager.func_179121_F();
         int k = entityplayer.func_184591_cq() == EnumHandSide.RIGHT?1:-1;
         ItemStack itemstack = entityplayer.func_184614_ca();
         if(itemstack.func_77973_b() != Items.field_151112_aM) {
            k = -k;
         }

         float f7 = entityplayer.func_70678_g(p_76986_9_);
         float f8 = MathHelper.func_76126_a(MathHelper.func_76129_c(f7) * 3.1415927F);
         float f9 = (entityplayer.field_70760_ar + (entityplayer.field_70761_aq - entityplayer.field_70760_ar) * p_76986_9_) * 0.017453292F;
         double d0 = (double)MathHelper.func_76126_a(f9);
         double d1 = (double)MathHelper.func_76134_b(f9);
         double d2 = (double)k * 0.35D;
         double d3 = 0.8D;
         double d4;
         double d5;
         double d6;
         double d7;
         if((this.field_76990_c.field_78733_k == null || this.field_76990_c.field_78733_k.field_74320_O <= 0) && entityplayer == Minecraft.func_71410_x().field_71439_g) {
            float f10 = this.field_76990_c.field_78733_k.field_74334_X;
            f10 = f10 / 100.0F;
            Vec3d vec3d = new Vec3d((double)k * -0.36D * (double)f10, -0.045D * (double)f10, 0.4D);
            vec3d = vec3d.func_178789_a(-(entityplayer.field_70127_C + (entityplayer.field_70125_A - entityplayer.field_70127_C) * p_76986_9_) * 0.017453292F);
            vec3d = vec3d.func_178785_b(-(entityplayer.field_70126_B + (entityplayer.field_70177_z - entityplayer.field_70126_B) * p_76986_9_) * 0.017453292F);
            vec3d = vec3d.func_178785_b(f8 * 0.5F);
            vec3d = vec3d.func_178789_a(-f8 * 0.7F);
            d4 = entityplayer.field_70169_q + (entityplayer.field_70165_t - entityplayer.field_70169_q) * (double)p_76986_9_ + vec3d.field_72450_a;
            d5 = entityplayer.field_70167_r + (entityplayer.field_70163_u - entityplayer.field_70167_r) * (double)p_76986_9_ + vec3d.field_72448_b;
            d6 = entityplayer.field_70166_s + (entityplayer.field_70161_v - entityplayer.field_70166_s) * (double)p_76986_9_ + vec3d.field_72449_c;
            d7 = (double)entityplayer.func_70047_e();
         } else {
            d4 = entityplayer.field_70169_q + (entityplayer.field_70165_t - entityplayer.field_70169_q) * (double)p_76986_9_ - d1 * d2 - d0 * 0.8D;
            d5 = entityplayer.field_70167_r + (double)entityplayer.func_70047_e() + (entityplayer.field_70163_u - entityplayer.field_70167_r) * (double)p_76986_9_ - 0.45D;
            d6 = entityplayer.field_70166_s + (entityplayer.field_70161_v - entityplayer.field_70166_s) * (double)p_76986_9_ - d0 * d2 + d1 * 0.8D;
            d7 = entityplayer.func_70093_af()?-0.1875D:0.0D;
         }

         double d13 = p_76986_1_.field_70169_q + (p_76986_1_.field_70165_t - p_76986_1_.field_70169_q) * (double)p_76986_9_;
         double d8 = p_76986_1_.field_70167_r + (p_76986_1_.field_70163_u - p_76986_1_.field_70167_r) * (double)p_76986_9_ + 0.25D;
         double d9 = p_76986_1_.field_70166_s + (p_76986_1_.field_70161_v - p_76986_1_.field_70166_s) * (double)p_76986_9_;
         double d10 = (double)((float)(d4 - d13));
         double d11 = (double)((float)(d5 - d8)) + d7;
         double d12 = (double)((float)(d6 - d9));
         GlStateManager.func_179090_x();
         GlStateManager.func_179140_f();
         vertexbuffer.func_181668_a(3, DefaultVertexFormats.field_181706_f);
         int l = 16;

         for(int i1 = 0; i1 <= 16; ++i1) {
            float f11 = (float)i1 / 16.0F;
            vertexbuffer.func_181662_b(p_76986_2_ + d10 * (double)f11, p_76986_4_ + d11 * (double)(f11 * f11 + f11) * 0.5D + 0.25D, p_76986_6_ + d12 * (double)f11).func_181669_b(0, 0, 0, 255).func_181675_d();
         }

         tessellator.func_78381_a();
         GlStateManager.func_179145_e();
         GlStateManager.func_179098_w();
         super.func_76986_a(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
      }
   }

   protected ResourceLocation func_110775_a(EntityFishHook p_110775_1_) {
      return field_110792_a;
   }
}
