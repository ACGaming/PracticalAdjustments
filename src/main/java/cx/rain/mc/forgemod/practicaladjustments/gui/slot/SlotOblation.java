package cx.rain.mc.forgemod.practicaladjustments.gui.slot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class SlotOblation extends SlotItemHandler {
    public SlotOblation(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(@Nonnull ItemStack stack) {
        return stack.isItemEqual(new ItemStack(Items.EMERALD))
                || stack.isItemEqual(new ItemStack(Items.DIAMOND));
    }
}
