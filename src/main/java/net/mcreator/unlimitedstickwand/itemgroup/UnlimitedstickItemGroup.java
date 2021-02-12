
package net.mcreator.unlimitedstickwand.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.unlimitedstickwand.item.PoweringotItem;
import net.mcreator.unlimitedstickwand.UnlimitedStickWandModElements;

@UnlimitedStickWandModElements.ModElement.Tag
public class UnlimitedstickItemGroup extends UnlimitedStickWandModElements.ModElement {
	public UnlimitedstickItemGroup(UnlimitedStickWandModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabunlimitedstick") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PoweringotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
