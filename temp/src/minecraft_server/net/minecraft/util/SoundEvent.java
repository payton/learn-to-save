package net.minecraft.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;

public class SoundEvent {
   public static final RegistryNamespaced<ResourceLocation, SoundEvent> field_187505_a = new RegistryNamespaced();
   private final ResourceLocation field_187506_b;
   private static int field_187507_c;

   public SoundEvent(ResourceLocation p_i46834_1_) {
      this.field_187506_b = p_i46834_1_;
   }

   public static void func_187504_b() {
      func_187502_a("ambient.cave");
      func_187502_a("block.anvil.break");
      func_187502_a("block.anvil.destroy");
      func_187502_a("block.anvil.fall");
      func_187502_a("block.anvil.hit");
      func_187502_a("block.anvil.land");
      func_187502_a("block.anvil.place");
      func_187502_a("block.anvil.step");
      func_187502_a("block.anvil.use");
      func_187502_a("block.brewing_stand.brew");
      func_187502_a("block.chest.close");
      func_187502_a("block.chest.locked");
      func_187502_a("block.chest.open");
      func_187502_a("block.chorus_flower.death");
      func_187502_a("block.chorus_flower.grow");
      func_187502_a("block.cloth.break");
      func_187502_a("block.cloth.fall");
      func_187502_a("block.cloth.hit");
      func_187502_a("block.cloth.place");
      func_187502_a("block.cloth.step");
      func_187502_a("block.comparator.click");
      func_187502_a("block.dispenser.dispense");
      func_187502_a("block.dispenser.fail");
      func_187502_a("block.dispenser.launch");
      func_187502_a("block.enchantment_table.use");
      func_187502_a("block.end_gateway.spawn");
      func_187502_a("block.enderchest.close");
      func_187502_a("block.enderchest.open");
      func_187502_a("block.fence_gate.close");
      func_187502_a("block.fence_gate.open");
      func_187502_a("block.fire.ambient");
      func_187502_a("block.fire.extinguish");
      func_187502_a("block.furnace.fire_crackle");
      func_187502_a("block.glass.break");
      func_187502_a("block.glass.fall");
      func_187502_a("block.glass.hit");
      func_187502_a("block.glass.place");
      func_187502_a("block.glass.step");
      func_187502_a("block.grass.break");
      func_187502_a("block.grass.fall");
      func_187502_a("block.grass.hit");
      func_187502_a("block.grass.place");
      func_187502_a("block.grass.step");
      func_187502_a("block.gravel.break");
      func_187502_a("block.gravel.fall");
      func_187502_a("block.gravel.hit");
      func_187502_a("block.gravel.place");
      func_187502_a("block.gravel.step");
      func_187502_a("block.iron_door.close");
      func_187502_a("block.iron_door.open");
      func_187502_a("block.iron_trapdoor.close");
      func_187502_a("block.iron_trapdoor.open");
      func_187502_a("block.ladder.break");
      func_187502_a("block.ladder.fall");
      func_187502_a("block.ladder.hit");
      func_187502_a("block.ladder.place");
      func_187502_a("block.ladder.step");
      func_187502_a("block.lava.ambient");
      func_187502_a("block.lava.extinguish");
      func_187502_a("block.lava.pop");
      func_187502_a("block.lever.click");
      func_187502_a("block.metal.break");
      func_187502_a("block.metal.fall");
      func_187502_a("block.metal.hit");
      func_187502_a("block.metal.place");
      func_187502_a("block.metal.step");
      func_187502_a("block.metal_pressureplate.click_off");
      func_187502_a("block.metal_pressureplate.click_on");
      func_187502_a("block.note.basedrum");
      func_187502_a("block.note.bass");
      func_187502_a("block.note.harp");
      func_187502_a("block.note.hat");
      func_187502_a("block.note.pling");
      func_187502_a("block.note.snare");
      func_187502_a("block.piston.contract");
      func_187502_a("block.piston.extend");
      func_187502_a("block.portal.ambient");
      func_187502_a("block.portal.travel");
      func_187502_a("block.portal.trigger");
      func_187502_a("block.redstone_torch.burnout");
      func_187502_a("block.sand.break");
      func_187502_a("block.sand.fall");
      func_187502_a("block.sand.hit");
      func_187502_a("block.sand.place");
      func_187502_a("block.sand.step");
      func_187502_a("block.shulker_box.close");
      func_187502_a("block.shulker_box.open");
      func_187502_a("block.slime.break");
      func_187502_a("block.slime.fall");
      func_187502_a("block.slime.hit");
      func_187502_a("block.slime.place");
      func_187502_a("block.slime.step");
      func_187502_a("block.snow.break");
      func_187502_a("block.snow.fall");
      func_187502_a("block.snow.hit");
      func_187502_a("block.snow.place");
      func_187502_a("block.snow.step");
      func_187502_a("block.stone.break");
      func_187502_a("block.stone.fall");
      func_187502_a("block.stone.hit");
      func_187502_a("block.stone.place");
      func_187502_a("block.stone.step");
      func_187502_a("block.stone_button.click_off");
      func_187502_a("block.stone_button.click_on");
      func_187502_a("block.stone_pressureplate.click_off");
      func_187502_a("block.stone_pressureplate.click_on");
      func_187502_a("block.tripwire.attach");
      func_187502_a("block.tripwire.click_off");
      func_187502_a("block.tripwire.click_on");
      func_187502_a("block.tripwire.detach");
      func_187502_a("block.water.ambient");
      func_187502_a("block.waterlily.place");
      func_187502_a("block.wood.break");
      func_187502_a("block.wood.fall");
      func_187502_a("block.wood.hit");
      func_187502_a("block.wood.place");
      func_187502_a("block.wood.step");
      func_187502_a("block.wood_button.click_off");
      func_187502_a("block.wood_button.click_on");
      func_187502_a("block.wood_pressureplate.click_off");
      func_187502_a("block.wood_pressureplate.click_on");
      func_187502_a("block.wooden_door.close");
      func_187502_a("block.wooden_door.open");
      func_187502_a("block.wooden_trapdoor.close");
      func_187502_a("block.wooden_trapdoor.open");
      func_187502_a("enchant.thorns.hit");
      func_187502_a("entity.armorstand.break");
      func_187502_a("entity.armorstand.fall");
      func_187502_a("entity.armorstand.hit");
      func_187502_a("entity.armorstand.place");
      func_187502_a("entity.arrow.hit");
      func_187502_a("entity.arrow.hit_player");
      func_187502_a("entity.arrow.shoot");
      func_187502_a("entity.bat.ambient");
      func_187502_a("entity.bat.death");
      func_187502_a("entity.bat.hurt");
      func_187502_a("entity.bat.loop");
      func_187502_a("entity.bat.takeoff");
      func_187502_a("entity.blaze.ambient");
      func_187502_a("entity.blaze.burn");
      func_187502_a("entity.blaze.death");
      func_187502_a("entity.blaze.hurt");
      func_187502_a("entity.blaze.shoot");
      func_187502_a("entity.bobber.splash");
      func_187502_a("entity.bobber.throw");
      func_187502_a("entity.cat.ambient");
      func_187502_a("entity.cat.death");
      func_187502_a("entity.cat.hiss");
      func_187502_a("entity.cat.hurt");
      func_187502_a("entity.cat.purr");
      func_187502_a("entity.cat.purreow");
      func_187502_a("entity.chicken.ambient");
      func_187502_a("entity.chicken.death");
      func_187502_a("entity.chicken.egg");
      func_187502_a("entity.chicken.hurt");
      func_187502_a("entity.chicken.step");
      func_187502_a("entity.cow.ambient");
      func_187502_a("entity.cow.death");
      func_187502_a("entity.cow.hurt");
      func_187502_a("entity.cow.milk");
      func_187502_a("entity.cow.step");
      func_187502_a("entity.creeper.death");
      func_187502_a("entity.creeper.hurt");
      func_187502_a("entity.creeper.primed");
      func_187502_a("entity.donkey.ambient");
      func_187502_a("entity.donkey.angry");
      func_187502_a("entity.donkey.chest");
      func_187502_a("entity.donkey.death");
      func_187502_a("entity.donkey.hurt");
      func_187502_a("entity.egg.throw");
      func_187502_a("entity.elder_guardian.ambient");
      func_187502_a("entity.elder_guardian.ambient_land");
      func_187502_a("entity.elder_guardian.curse");
      func_187502_a("entity.elder_guardian.death");
      func_187502_a("entity.elder_guardian.death_land");
      func_187502_a("entity.elder_guardian.hurt");
      func_187502_a("entity.elder_guardian.flop");
      func_187502_a("entity.elder_guardian.hurt_land");
      func_187502_a("entity.enderdragon.ambient");
      func_187502_a("entity.enderdragon.death");
      func_187502_a("entity.enderdragon.flap");
      func_187502_a("entity.enderdragon.growl");
      func_187502_a("entity.enderdragon.hurt");
      func_187502_a("entity.enderdragon.shoot");
      func_187502_a("entity.enderdragon_fireball.explode");
      func_187502_a("entity.endereye.launch");
      func_187502_a("entity.endermen.ambient");
      func_187502_a("entity.endermen.death");
      func_187502_a("entity.endermen.hurt");
      func_187502_a("entity.endermen.scream");
      func_187502_a("entity.endermen.stare");
      func_187502_a("entity.endermen.teleport");
      func_187502_a("entity.endermite.ambient");
      func_187502_a("entity.endermite.death");
      func_187502_a("entity.endermite.hurt");
      func_187502_a("entity.endermite.step");
      func_187502_a("entity.enderpearl.throw");
      func_187502_a("entity.evocation_fangs.attack");
      func_187502_a("entity.evocation_illager.ambient");
      func_187502_a("entity.evocation_illager.cast_spell");
      func_187502_a("entity.evocation_illager.death");
      func_187502_a("entity.evocation_illager.hurt");
      func_187502_a("entity.evocation_illager.prepare_attack");
      func_187502_a("entity.evocation_illager.prepare_summon");
      func_187502_a("entity.evocation_illager.prepare_wololo");
      func_187502_a("entity.experience_bottle.throw");
      func_187502_a("entity.experience_orb.pickup");
      func_187502_a("entity.firework.blast");
      func_187502_a("entity.firework.blast_far");
      func_187502_a("entity.firework.large_blast");
      func_187502_a("entity.firework.large_blast_far");
      func_187502_a("entity.firework.launch");
      func_187502_a("entity.firework.shoot");
      func_187502_a("entity.firework.twinkle");
      func_187502_a("entity.firework.twinkle_far");
      func_187502_a("entity.generic.big_fall");
      func_187502_a("entity.generic.burn");
      func_187502_a("entity.generic.death");
      func_187502_a("entity.generic.drink");
      func_187502_a("entity.generic.eat");
      func_187502_a("entity.generic.explode");
      func_187502_a("entity.generic.extinguish_fire");
      func_187502_a("entity.generic.hurt");
      func_187502_a("entity.generic.small_fall");
      func_187502_a("entity.generic.splash");
      func_187502_a("entity.generic.swim");
      func_187502_a("entity.ghast.ambient");
      func_187502_a("entity.ghast.death");
      func_187502_a("entity.ghast.hurt");
      func_187502_a("entity.ghast.scream");
      func_187502_a("entity.ghast.shoot");
      func_187502_a("entity.ghast.warn");
      func_187502_a("entity.guardian.ambient");
      func_187502_a("entity.guardian.ambient_land");
      func_187502_a("entity.guardian.attack");
      func_187502_a("entity.guardian.death");
      func_187502_a("entity.guardian.death_land");
      func_187502_a("entity.guardian.flop");
      func_187502_a("entity.guardian.hurt");
      func_187502_a("entity.guardian.hurt_land");
      func_187502_a("entity.horse.ambient");
      func_187502_a("entity.horse.angry");
      func_187502_a("entity.horse.armor");
      func_187502_a("entity.horse.breathe");
      func_187502_a("entity.horse.death");
      func_187502_a("entity.horse.eat");
      func_187502_a("entity.horse.gallop");
      func_187502_a("entity.horse.hurt");
      func_187502_a("entity.horse.jump");
      func_187502_a("entity.horse.land");
      func_187502_a("entity.horse.saddle");
      func_187502_a("entity.horse.step");
      func_187502_a("entity.horse.step_wood");
      func_187502_a("entity.hostile.big_fall");
      func_187502_a("entity.hostile.death");
      func_187502_a("entity.hostile.hurt");
      func_187502_a("entity.hostile.small_fall");
      func_187502_a("entity.hostile.splash");
      func_187502_a("entity.hostile.swim");
      func_187502_a("entity.husk.ambient");
      func_187502_a("entity.husk.death");
      func_187502_a("entity.husk.hurt");
      func_187502_a("entity.husk.step");
      func_187502_a("entity.irongolem.attack");
      func_187502_a("entity.irongolem.death");
      func_187502_a("entity.irongolem.hurt");
      func_187502_a("entity.irongolem.step");
      func_187502_a("entity.item.break");
      func_187502_a("entity.item.pickup");
      func_187502_a("entity.itemframe.add_item");
      func_187502_a("entity.itemframe.break");
      func_187502_a("entity.itemframe.place");
      func_187502_a("entity.itemframe.remove_item");
      func_187502_a("entity.itemframe.rotate_item");
      func_187502_a("entity.leashknot.break");
      func_187502_a("entity.leashknot.place");
      func_187502_a("entity.lightning.impact");
      func_187502_a("entity.lightning.thunder");
      func_187502_a("entity.lingeringpotion.throw");
      func_187502_a("entity.llama.ambient");
      func_187502_a("entity.llama.angry");
      func_187502_a("entity.llama.chest");
      func_187502_a("entity.llama.death");
      func_187502_a("entity.llama.eat");
      func_187502_a("entity.llama.hurt");
      func_187502_a("entity.llama.spit");
      func_187502_a("entity.llama.step");
      func_187502_a("entity.llama.swag");
      func_187502_a("entity.magmacube.death");
      func_187502_a("entity.magmacube.hurt");
      func_187502_a("entity.magmacube.jump");
      func_187502_a("entity.magmacube.squish");
      func_187502_a("entity.minecart.inside");
      func_187502_a("entity.minecart.riding");
      func_187502_a("entity.mooshroom.shear");
      func_187502_a("entity.mule.ambient");
      func_187502_a("entity.mule.chest");
      func_187502_a("entity.mule.death");
      func_187502_a("entity.mule.hurt");
      func_187502_a("entity.painting.break");
      func_187502_a("entity.painting.place");
      func_187502_a("entity.pig.ambient");
      func_187502_a("entity.pig.death");
      func_187502_a("entity.pig.hurt");
      func_187502_a("entity.pig.saddle");
      func_187502_a("entity.pig.step");
      func_187502_a("entity.player.attack.crit");
      func_187502_a("entity.player.attack.knockback");
      func_187502_a("entity.player.attack.nodamage");
      func_187502_a("entity.player.attack.strong");
      func_187502_a("entity.player.attack.sweep");
      func_187502_a("entity.player.attack.weak");
      func_187502_a("entity.player.big_fall");
      func_187502_a("entity.player.breath");
      func_187502_a("entity.player.burp");
      func_187502_a("entity.player.death");
      func_187502_a("entity.player.hurt");
      func_187502_a("entity.player.levelup");
      func_187502_a("entity.player.small_fall");
      func_187502_a("entity.player.splash");
      func_187502_a("entity.player.swim");
      func_187502_a("entity.polar_bear.ambient");
      func_187502_a("entity.polar_bear.baby_ambient");
      func_187502_a("entity.polar_bear.death");
      func_187502_a("entity.polar_bear.hurt");
      func_187502_a("entity.polar_bear.step");
      func_187502_a("entity.polar_bear.warning");
      func_187502_a("entity.rabbit.ambient");
      func_187502_a("entity.rabbit.attack");
      func_187502_a("entity.rabbit.death");
      func_187502_a("entity.rabbit.hurt");
      func_187502_a("entity.rabbit.jump");
      func_187502_a("entity.sheep.ambient");
      func_187502_a("entity.sheep.death");
      func_187502_a("entity.sheep.hurt");
      func_187502_a("entity.sheep.shear");
      func_187502_a("entity.sheep.step");
      func_187502_a("entity.shulker.ambient");
      func_187502_a("entity.shulker.close");
      func_187502_a("entity.shulker.death");
      func_187502_a("entity.shulker.hurt");
      func_187502_a("entity.shulker.hurt_closed");
      func_187502_a("entity.shulker.open");
      func_187502_a("entity.shulker.shoot");
      func_187502_a("entity.shulker.teleport");
      func_187502_a("entity.shulker_bullet.hit");
      func_187502_a("entity.shulker_bullet.hurt");
      func_187502_a("entity.silverfish.ambient");
      func_187502_a("entity.silverfish.death");
      func_187502_a("entity.silverfish.hurt");
      func_187502_a("entity.silverfish.step");
      func_187502_a("entity.skeleton.ambient");
      func_187502_a("entity.skeleton.death");
      func_187502_a("entity.skeleton.hurt");
      func_187502_a("entity.skeleton.shoot");
      func_187502_a("entity.skeleton.step");
      func_187502_a("entity.skeleton_horse.ambient");
      func_187502_a("entity.skeleton_horse.death");
      func_187502_a("entity.skeleton_horse.hurt");
      func_187502_a("entity.slime.attack");
      func_187502_a("entity.slime.death");
      func_187502_a("entity.slime.hurt");
      func_187502_a("entity.slime.jump");
      func_187502_a("entity.slime.squish");
      func_187502_a("entity.small_magmacube.death");
      func_187502_a("entity.small_magmacube.hurt");
      func_187502_a("entity.small_magmacube.squish");
      func_187502_a("entity.small_slime.death");
      func_187502_a("entity.small_slime.hurt");
      func_187502_a("entity.small_slime.jump");
      func_187502_a("entity.small_slime.squish");
      func_187502_a("entity.snowball.throw");
      func_187502_a("entity.snowman.ambient");
      func_187502_a("entity.snowman.death");
      func_187502_a("entity.snowman.hurt");
      func_187502_a("entity.snowman.shoot");
      func_187502_a("entity.spider.ambient");
      func_187502_a("entity.spider.death");
      func_187502_a("entity.spider.hurt");
      func_187502_a("entity.spider.step");
      func_187502_a("entity.splash_potion.break");
      func_187502_a("entity.splash_potion.throw");
      func_187502_a("entity.squid.ambient");
      func_187502_a("entity.squid.death");
      func_187502_a("entity.squid.hurt");
      func_187502_a("entity.stray.ambient");
      func_187502_a("entity.stray.death");
      func_187502_a("entity.stray.hurt");
      func_187502_a("entity.stray.step");
      func_187502_a("entity.tnt.primed");
      func_187502_a("entity.vex.ambient");
      func_187502_a("entity.vex.charge");
      func_187502_a("entity.vex.death");
      func_187502_a("entity.vex.hurt");
      func_187502_a("entity.villager.ambient");
      func_187502_a("entity.villager.death");
      func_187502_a("entity.villager.hurt");
      func_187502_a("entity.villager.no");
      func_187502_a("entity.villager.trading");
      func_187502_a("entity.villager.yes");
      func_187502_a("entity.vindication_illager.ambient");
      func_187502_a("entity.vindication_illager.death");
      func_187502_a("entity.vindication_illager.hurt");
      func_187502_a("entity.witch.ambient");
      func_187502_a("entity.witch.death");
      func_187502_a("entity.witch.drink");
      func_187502_a("entity.witch.hurt");
      func_187502_a("entity.witch.throw");
      func_187502_a("entity.wither.ambient");
      func_187502_a("entity.wither.break_block");
      func_187502_a("entity.wither.death");
      func_187502_a("entity.wither.hurt");
      func_187502_a("entity.wither.shoot");
      func_187502_a("entity.wither.spawn");
      func_187502_a("entity.wither_skeleton.ambient");
      func_187502_a("entity.wither_skeleton.death");
      func_187502_a("entity.wither_skeleton.hurt");
      func_187502_a("entity.wither_skeleton.step");
      func_187502_a("entity.wolf.ambient");
      func_187502_a("entity.wolf.death");
      func_187502_a("entity.wolf.growl");
      func_187502_a("entity.wolf.howl");
      func_187502_a("entity.wolf.hurt");
      func_187502_a("entity.wolf.pant");
      func_187502_a("entity.wolf.shake");
      func_187502_a("entity.wolf.step");
      func_187502_a("entity.wolf.whine");
      func_187502_a("entity.zombie.ambient");
      func_187502_a("entity.zombie.attack_door_wood");
      func_187502_a("entity.zombie.attack_iron_door");
      func_187502_a("entity.zombie.break_door_wood");
      func_187502_a("entity.zombie.death");
      func_187502_a("entity.zombie.hurt");
      func_187502_a("entity.zombie.infect");
      func_187502_a("entity.zombie.step");
      func_187502_a("entity.zombie_horse.ambient");
      func_187502_a("entity.zombie_horse.death");
      func_187502_a("entity.zombie_horse.hurt");
      func_187502_a("entity.zombie_pig.ambient");
      func_187502_a("entity.zombie_pig.angry");
      func_187502_a("entity.zombie_pig.death");
      func_187502_a("entity.zombie_pig.hurt");
      func_187502_a("entity.zombie_villager.ambient");
      func_187502_a("entity.zombie_villager.converted");
      func_187502_a("entity.zombie_villager.cure");
      func_187502_a("entity.zombie_villager.death");
      func_187502_a("entity.zombie_villager.hurt");
      func_187502_a("entity.zombie_villager.step");
      func_187502_a("item.armor.equip_chain");
      func_187502_a("item.armor.equip_diamond");
      func_187502_a("item.armor.equip_elytra");
      func_187502_a("item.armor.equip_generic");
      func_187502_a("item.armor.equip_gold");
      func_187502_a("item.armor.equip_iron");
      func_187502_a("item.armor.equip_leather");
      func_187502_a("item.bottle.empty");
      func_187502_a("item.bottle.fill");
      func_187502_a("item.bottle.fill_dragonbreath");
      func_187502_a("item.bucket.empty");
      func_187502_a("item.bucket.empty_lava");
      func_187502_a("item.bucket.fill");
      func_187502_a("item.bucket.fill_lava");
      func_187502_a("item.chorus_fruit.teleport");
      func_187502_a("item.elytra.flying");
      func_187502_a("item.firecharge.use");
      func_187502_a("item.flintandsteel.use");
      func_187502_a("item.hoe.till");
      func_187502_a("item.shield.block");
      func_187502_a("item.shield.break");
      func_187502_a("item.shovel.flatten");
      func_187502_a("item.totem.use");
      func_187502_a("music.creative");
      func_187502_a("music.credits");
      func_187502_a("music.dragon");
      func_187502_a("music.end");
      func_187502_a("music.game");
      func_187502_a("music.menu");
      func_187502_a("music.nether");
      func_187502_a("record.11");
      func_187502_a("record.13");
      func_187502_a("record.blocks");
      func_187502_a("record.cat");
      func_187502_a("record.chirp");
      func_187502_a("record.far");
      func_187502_a("record.mall");
      func_187502_a("record.mellohi");
      func_187502_a("record.stal");
      func_187502_a("record.strad");
      func_187502_a("record.wait");
      func_187502_a("record.ward");
      func_187502_a("ui.button.click");
      func_187502_a("weather.rain");
      func_187502_a("weather.rain.above");
   }

   private static void func_187502_a(String p_187502_0_) {
      ResourceLocation resourcelocation = new ResourceLocation(p_187502_0_);
      field_187505_a.func_177775_a(field_187507_c++, resourcelocation, new SoundEvent(resourcelocation));
   }
}
