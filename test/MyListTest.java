import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyListTest {

    MyArray obj = new MyArray();
    @Test
    public void testObjectExists(){
        assertNotNull(obj);
    }

    @Test
    public void testAddMethod(){
        obj.add(3);
       assertEquals(1,obj.size());

    }
    @Test
    public void testSetMethod(){
        obj.add("tosin");
        obj.set(0, "tolani");
        assertEquals("tolani",obj.get(0));
    }
















}

