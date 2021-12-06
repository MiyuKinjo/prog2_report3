package jp.ac.uryukyu.ie.e215751;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        for(int i = 0;i < 3;i++){
            int defaultWarriorAttck = 10;
            Warrior demoWarrior = new Warrior("デモ勇者", 100, defaultWarriorAttck);
            Enemy slime = new Enemy("スライムもどき", 100, 5);
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(defaultWarriorAttck * 3/2, 100 - slime.getHitPoint() );
        }
    }  
}
