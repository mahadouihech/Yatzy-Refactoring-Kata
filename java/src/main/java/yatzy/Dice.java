package yatzy;

import java.util.List;

public record Dice(int d1, int d2, int d3, int d4, int d5 ) {
public List<Integer> getRollAsList(){
    return List.of(d1,d2,d3,d4,d5);
}
}