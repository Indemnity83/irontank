package com.indemnity83.irontanks.common.tiles;

import com.indemnity83.irontanks.common.blocks.IronTankType;

public class TileDiamondTank extends TileTank {
    int getCapacity() {
        return IronTankType.DIAMOND.capacity;
    }
}
