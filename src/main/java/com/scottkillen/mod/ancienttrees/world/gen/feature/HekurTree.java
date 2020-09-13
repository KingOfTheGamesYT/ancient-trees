package com.scottkillen.mod.dendrology.world.gen.feature;

import com.google.common.base.Objects;
import com.scottkillen.mod.dendrology.world.gen.feature.hekur.LargeHekurTree;
import com.scottkillen.mod.dendrology.world.gen.feature.hekur.NormalHekurTree;
import com.scottkillen.mod.koresample.tree.DefinesTree;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import java.util.Random;

public class HekurTree extends AbstractTree
{
    private final AbstractTree treeGen;
    private final AbstractTree largeTreeGen;

    public HekurTree(boolean fromSapling)
    {
        super(fromSapling);
        treeGen = new NormalHekurTree(fromSapling);
        largeTreeGen = new LargeHekurTree(fromSapling);
    }

    public HekurTree() { this(true); }

    @Override
    public void setTree(DefinesTree tree)
    {
        treeGen.setTree(tree);
        largeTreeGen.setTree(tree);
    }

    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).add("treeGen", treeGen).add("largeTreeGen", largeTreeGen).toString();
    }

    @Override
    public boolean generate(World world, Random rand, int x, int y, int z)
    {
        int y1 = y;
        while (world.getBlock(x, y1 - 1, z).getMaterial().equals(Material.water)) y1--;

        if (rand.nextInt(10) < 9) return treeGen.generate(world, rand, x, y1, z);

        return largeTreeGen.generate(world, rand, x, y1, z);
    }
}
