package com.austinv11.peripheralsplusplus.blocks;

import com.austinv11.peripheralsplusplus.init.ModBlocks;
import com.austinv11.peripheralsplusplus.tiles.TileEntityAnalyzerButterfly;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAnalyzerButterfly extends BlockAnalyzer {
	
	public BlockAnalyzerButterfly() {
		super();
		this.setBlockName("butterflyAnalyzer");
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityAnalyzerButterfly();
	}

	public Block getBlock(){
		return ModBlocks.butterflyAnalyzer;
	}
}
