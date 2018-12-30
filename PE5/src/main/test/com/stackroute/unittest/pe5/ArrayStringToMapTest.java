package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayStringToMapTest {

    ArrayStringToMap obj;
    @Before
    public void setUp() throws Exception {
        obj = new ArrayStringToMap();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkWordsOccurence(){
        String  arr[] ={"a","b","c","d","a","c","c"};
        Map<String,Boolean> map=new HashMap<String,Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        System.out.println(map);
        assertEquals(map,obj.checkWordsOccurence(arr));
    }

    @Test
    public void checkWordsOccurence1(){
        String  arr[] ={"Boeing","IBM","NIIT","NIIT","Oracle","NIIT","Boeing"};
        Map<String,Boolean> map=new HashMap<String,Boolean>();
        map.put("Boeing",true);
        map.put("IBM",false);
        map.put("NIIT",true);
        map.put("Oracle",false);
        System.out.println(map);
        assertEquals(map,obj.checkWordsOccurence(arr));
    }
    @Test
    public void checkWordsOccurence2(){
        String  arr[] ={"IBM","NIIT","NIIT","Oracle","NIIT","Boeing"};
        Map<String,Boolean> map=new HashMap<String,Boolean>();
        map.put("Boeing",true);
        map.put("IBM",false);
        map.put("NIIT",false);
        map.put("Oracle",false);
        System.out.println(map);
        assertNotEquals(map,obj.checkWordsOccurence(arr));
    }
}