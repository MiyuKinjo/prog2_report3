package jp.ac.uryukyu.ie.e215751;

public class Warrior extends Hero{
    public Warrior(String name,int hitPoint,int attack){
        super(name,hitPoint,attack);
    }
    

    public void attackWithWeponSkill(LivingThing enemy){
        if (isDead() == true){
            int attack = 0;
        }else{
            int damage = getAttack() * 3/2;
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.getName(), enemy.getName(), damage);
            enemy.wounded(damage);
        }
    }
    
    
}
