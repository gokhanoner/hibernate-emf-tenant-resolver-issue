package com.test;

import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryTest {
    @Test
    public void testEMFCreation() {
        EntityManagerFactory testPU = Persistence.createEntityManagerFactory("testPU");
        Assert.assertNotNull(testPU);
    }
}
