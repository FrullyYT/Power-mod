
package net.mcreator.unlimitedstickwand.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.unlimitedstickwand.itemgroup.UnlimitedstickItemGroup;
import net.mcreator.unlimitedstickwand.UnlimitedStickWandModElements;

@UnlimitedStickWandModElements.ModElement.Tag
public class PowercellItem extends UnlimitedStickWandModElements.ModElement {
	@ObjectHolder("unlimited_stick_wand:powercell")
	public static final Item block = null;
	public PowercellItem(UnlimitedStickWandModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(UnlimitedstickItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("powercell");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
