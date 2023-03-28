package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalcAboveBoundary() {
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcBelowBoundary() {
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcIfAmountEqualsBoundary() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
