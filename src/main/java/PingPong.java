/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evans
 */
public class PingPong {

    public List<Object> runPingPong(int countUpTo) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 1; i <= countUpTo; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("pingpong");
            } else if (i % 3 == 0) {
                result.add("ping");
            } else if (i % 5 == 0) {
                result.add("pong");
            } else {
                result.add(i);
            }
        }
        return result;
    }


}
