package com.stackroute.unittest.pe5;
/*
        Write a program where an array of strings is input and output is a Map< String ,boolean> where
    each different string is a key and its value is true if that string appears 2 or more times in the array
    Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
    Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
*/



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayStringToMap {
    
    public Map<String, Boolean> checkWordsOccurence(String[] input){
        Map<String,Integer> map=new HashMap<String, Integer>();

        for(String str:input){
            Integer num=map.get(str);
            num=(num==null)?1:++num;
            map.put(str,num);
        }
        Map<String,Boolean> result=new HashMap<String, Boolean>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>=2){ // to check if the string in the map is present more than twice
                result.put(entry.getKey(),true); // if present put set it to True and add it to result map
            }
            else
                result.put(entry.getKey(),false);// if its not present more than once set it to False and add it to result map
        }
        return result;
    }


}
