package jp.ac.uryukyu.ie.e215751;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    public Enemy(String name,int hitPoint,int attack){
        super(name,hitPoint,attack);
    }
    public void wounded(int damage){
        super.setHitPoint(super.getHitPoint() - damage);
        if( super.getHitPoint() < 0 ) {
            super.setDead(true);
        System.out.printf("モンスター%sは倒れた。",this.getName());
        }
    }
    
}