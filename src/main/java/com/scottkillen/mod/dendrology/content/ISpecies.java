package com.scottkillen.mod.dendrology.content;

import com.scottkillen.mod.dendrology.block.ModLeavesBlock;
import com.scottkillen.mod.dendrology.block.ModLogBlock;
import com.scottkillen.mod.dendrology.block.ModPlanksBlock;
import com.scottkillen.mod.dendrology.block.ModSaplingBlock;
import com.scottkillen.mod.dendrology.block.ModStairsBlock;
import com.scottkillen.mod.dendrology.block.ModWoodSlabBlock;
import com.scottkillen.mod.kore.trees.DescribesLeaves;
import com.scottkillen.mod.kore.trees.DescribesSlabs;
import com.scottkillen.mod.kore.trees.ProvidesAbstractTree;

public interface ISpecies extends DescribesLeaves, DescribesSlabs, ProvidesAbstractTree
{
    ModLeavesBlock getLeavesBlock();

    void setLeavesBlock(ModLeavesBlock block);

    int getLeavesMeta();

    void setLeavesMeta(int meta);

    ModLogBlock getLogBlock();

    void setLogBlock(ModLogBlock logBlock);

    int getLogMeta();

    void setLogMeta(int meta);

    void setPlanksBlock(ModPlanksBlock block);

    int getPlanksMeta();

    void setPlanksMeta(int meta);

    void setSaplingBlock(ModSaplingBlock block);

    void setSaplingMeta(int meta);

    void setSlabBlock(ModWoodSlabBlock block, boolean isDouble);

    void setSlabMeta(int meta);

    ModStairsBlock getStairsBlock();

    void setStairsBlock(ModStairsBlock block);
}
