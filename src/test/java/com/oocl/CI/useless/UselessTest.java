package com.oocl.CI.useless;

import org.junit.Assert;
import org.junit.Test;

public class UselessTest {

    @Test
    public void should_test_failure() {
        Assert.assertEquals("a", "A");
    }
}
