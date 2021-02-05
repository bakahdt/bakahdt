package top.hdtspace.hdtcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import top.hdtspace.hdtcraft.Main;
import top.hdtspace.hdtcraft.init.ModItems;
import top.hdtspace.hdtcraft.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
