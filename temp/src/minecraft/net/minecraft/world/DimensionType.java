package net.minecraft.world;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.WorldProviderSurface;

public enum DimensionType {
   OVERWORLD(0, "Overworld", "", WorldProviderSurface.class),
   NETHER(-1, "Nether", "_nether", WorldProviderHell.class),
   THE_END(1, "The End", "_end", WorldProviderEnd.class);

   private final int field_186074_d;
   private final String field_186075_e;
   private final String field_186076_f;
   private final Class<? extends WorldProvider> field_186077_g;

   private DimensionType(int p_i46672_3_, String p_i46672_4_, String p_i46672_5_, Class<? extends WorldProvider> p_i46672_6_) {
      this.field_186074_d = p_i46672_3_;
      this.field_186075_e = p_i46672_4_;
      this.field_186076_f = p_i46672_5_;
      this.field_186077_g = p_i46672_6_;
   }

   public int func_186068_a() {
      return this.field_186074_d;
   }

   public String func_186065_b() {
      return this.field_186075_e;
   }

   public String func_186067_c() {
      return this.field_186076_f;
   }

   public WorldProvider func_186070_d() {
      try {
         Constructor<? extends WorldProvider> constructor = this.field_186077_g.getConstructor(new Class[0]);
         return (WorldProvider)constructor.newInstance(new Object[0]);
      } catch (NoSuchMethodException nosuchmethodexception) {
         throw new Error("Could not create new dimension", nosuchmethodexception);
      } catch (InvocationTargetException invocationtargetexception) {
         throw new Error("Could not create new dimension", invocationtargetexception);
      } catch (InstantiationException instantiationexception) {
         throw new Error("Could not create new dimension", instantiationexception);
      } catch (IllegalAccessException illegalaccessexception) {
         throw new Error("Could not create new dimension", illegalaccessexception);
      }
   }

   public static DimensionType func_186069_a(int p_186069_0_) {
      for(DimensionType dimensiontype : values()) {
         if(dimensiontype.func_186068_a() == p_186069_0_) {
            return dimensiontype;
         }
      }

      throw new IllegalArgumentException("Invalid dimension id " + p_186069_0_);
   }
}
