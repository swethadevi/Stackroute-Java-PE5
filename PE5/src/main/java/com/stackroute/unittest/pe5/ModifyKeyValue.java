package com.stackroute.unittest.pe5;

import java.util.Map;

/*
    Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
    Modify and return the given map as follows:
    a. If the key `val1` has
    b. Set the key `val1` to
    Example 1:
    The map {"val1": "java",
    "java"}
    Example 2:
    The map {"val1": "mars",
    "mars"}
    a value, set the key `val2` to have that value, and
    have the value `" "` (empty string ).
    "val2": "c++"} should return {"val1": " ", "val2":
    "val2": "saturn"}
    should return {"val1": " ", "val2":
 */
public class ModifyKeyValue {

    public Map<String,String> modifyKeyValueInMap(Map<String,String> map){
        for(Map.Entry<String,String> entry:map.entrySet()){
            if(entry.getKey().equals("val1")&&entry.getValue()!=null){
                String value=entry.getValue();
                map.put("val1"," ");
                map.put("val2",value);
            }
            else{
                continue;
            }
        }
        return map;
    }
}
