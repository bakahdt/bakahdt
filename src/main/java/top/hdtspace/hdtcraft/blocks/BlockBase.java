package top.hdtspace.hdtcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import top.hdtspace.hdtcraft.Main;
import top.hdtspace.hdtcraft.init.ModBlocks;
import top.hdtspace.hdtcraft.init.ModItems;
import top.hdtspace.hdtcraft.util.IHasModel;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setSoundType(SoundType.STONE);
        setHardness(5.0f);
        setResistance(6.0f);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
