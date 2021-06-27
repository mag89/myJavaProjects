package codingBat.map_1.mapBully;


import java.util.Map;

/*

Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the
 key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String a = map.get("a");

            if (!a.equals("")) {
                map.put("b", a);
                map.put("a", "");
            }
        }
        return map;

    }

}
