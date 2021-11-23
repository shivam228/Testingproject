package com.example.Scientific;

import com.example.Operations.printthreetimes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class printthreetimeTest {
    printthreetimes three = new printthreetimes();
    int res;
    @Test
    public void calculate() {
        res = three.print(0);
        assertEquals(0, res);
        res = three.print(1);
        assertEquals(3, res);
        res = three.print(2);
        assertEquals(9, res);

    }
}
