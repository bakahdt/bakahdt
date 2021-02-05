package top.hdtspace.hdtcraft.init;

import top.hdtspace.hdtcraft.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block SENIOR_MACHINE = new BlockBase("senior_machine", Material.IRON);
}
