package jp.ac.uryukyu.ie.e165741;

/**
 * Created by e1657 on 2017/02/01.
 */
import java.util.HashMap;
import java.util.ArrayList;
public class Cardstack {
    private static HashMap Suit ;
    private static ArrayList number ;
    public  void firstcardstack(){
        Suit = new HashMap<Integer, String>();
        number = new ArrayList<Integer>();
        Suit.put(0, "スペード・");
        Suit.put(1,"ダイヤ・");
        Suit.put(2,"ハート・");
        Suit.put(3,"クラブ・");
        Suit.put(4,"Joker・");
        int i =0;
        int n = 0;
        while(i<52){
            n++;
            number.add(n);
            if(n>12){
                n=0;
            }
            i++;
        }
        number.add(0);
    }
    public static HashMap getSuit(){
        return Suit;
    }
    public static ArrayList getList(){
        return number;
    }
}
