
package net.mcreator.unlimitedstickwand.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.unlimitedstickwand.itemgroup.UnlimitedstickItemGroup;
import net.mcreator.unlimitedstickwand.UnlimitedStickWandModElements;

import java.util.List;

@UnlimitedStickWandModElements.ModElement.Tag
public class PowerStickItem extends UnlimitedStickWandModElements.ModElement {
	@ObjectHolder("unlimited_stick_wand:power_stick")
	public static final Item block = null;
	public PowerStickItem(UnlimitedStickWandModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 148f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PoweressenceItem.block, (int) (1)));
			}
		}, 3, 0f, new Item.Properties().group(UnlimitedstickItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("better stick"));
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("power_stick"));
	}
}
