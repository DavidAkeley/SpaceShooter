package com.keepkoding;

import java.awt.Graphics2D;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

class EnemyShip extends Ship {

    private static final int
            enemySpriteWidth = 32,
            enemySpriteLength = 32;
    private int spawnCount;
    private List<int[]> enemyPositions = new ArrayList<>();

    EnemyShip() {
        spawnEnemy(1);
    }

    private int randCoord(int min, int max) {
        return (int)(Math.random() * max) + min;
    }

    @Override
    void paint(Graphics2D g) {
        g.setColor(Color.RED);
        for (int[] coord : enemyPositions) {
            g.fillOval(coord[0], coord[1], enemySpriteWidth, enemySpriteLength);
        }
    }

    void spawnEnemy(int count) {
        this.spawnCount = count;
        while (enemyPositions.size() < spawnCount) {
            enemyPositions.add(new int[] {randCoord(0, SpaceShooter.screenWidth)
                    , randCoord(0, SpaceShooter.screenHeight)});
        }
    }

    int getSpawnCount() {
        return spawnCount;
    }
}