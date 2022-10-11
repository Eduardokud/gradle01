package ru.netology.service;


import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {



    @Test
    public void underLimit() {
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(expected, actual);

    }
    @Test
    public void moreLimit() {
        int expected =800;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1200);
        assertEquals(expected, actual);

    }
    @Test
    public void equalLimit() {
        int expected =0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(expected, actual);

    }
}

