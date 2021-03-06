package epicsquid.mysticalworld.materials;

import epicsquid.mysticallib.event.RegisterContentEvent;
import epicsquid.mysticallib.item.*;
import epicsquid.mysticallib.material.MaterialTypes;
import epicsquid.mysticalworld.MysticalWorld;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import javax.annotation.Nonnull;

public class Tools {
  public static void registerTools(@Nonnull RegisterContentEvent event) {
    for (Metal metal : Metal.values()) {
      if (!metal.hasTool()) continue;

      event.addItem(new ItemAxeBase(metal.getMaterial(), metal.name() + "_axe", metal.getMaterial().getHarvestLevel(), metal.getMaterial().getMaxUses(), metal.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemHoeBase(metal.getMaterial(), metal.name() + "_hoe", metal.getMaterial().getHarvestLevel(), metal.getMaterial().getMaxUses(), metal.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemPickaxeBase(metal.getMaterial(), metal.name() + "_pickaxe", metal.getMaterial().getHarvestLevel(), metal.getMaterial().getMaxUses(), metal.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemShovelBase(metal.getMaterial(), metal.name() + "_shovel", metal.getMaterial().getHarvestLevel(), metal.getMaterial().getMaxUses(), metal.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemSwordBase(metal.getMaterial(), metal.name() + "_sword", metal.getMaterial().getHarvestLevel(), metal.getMaterial().getMaxUses(), metal.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
    }
    for (Gem gem : Gem.values()) {
      if (!gem.hasTool()) continue;

      event.addItem(new ItemAxeBase(gem.getMaterial(), gem.name() + "_axe", gem.getMaterial().getHarvestLevel(), gem.getMaterial().getMaxUses(), gem.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemHoeBase(gem.getMaterial(), gem.name() + "_hoe", gem.getMaterial().getHarvestLevel(), gem.getMaterial().getMaxUses(), gem.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemPickaxeBase(gem.getMaterial(), gem.name() + "_pickaxe", gem.getMaterial().getHarvestLevel(), gem.getMaterial().getMaxUses(), gem.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemShovelBase(gem.getMaterial(), gem.name() + "_shovel", gem.getMaterial().getHarvestLevel(), gem.getMaterial().getMaxUses(), gem.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemSwordBase(gem.getMaterial(), gem.name() + "_sword", gem.getMaterial().getHarvestLevel(), gem.getMaterial().getMaxUses(), gem.getMaterial().getEnchantability()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
    }
  }
}
