package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void remain() {
        int amount = 1800;
        int expected = 200;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remainInt() {
        int amount = 2000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}