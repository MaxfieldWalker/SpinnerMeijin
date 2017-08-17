package com.inoueken.handspinner;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by y-fujiwr on 2017/08/17.
 */

public class HandspinnerTest {
    @Test
    public void addVelocityTest() throws InterruptedException {
        Handspinner hs = new Handspinner();
        hs.rotate();
        hs.addForce(1.0f);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(hs.getAngle());
        assert(hs.getAngle()>=0);
    }
    @Test
    public void addInverseVelocityTest() throws InterruptedException {
        Handspinner hs = new Handspinner();
        hs.rotate();
        hs.addForce(-1.0f);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(hs.getAngle());
        assert(hs.getAngle()<=0);
    }
    @Test
    public void rotationCountTest() throws InterruptedException {
        Handspinner hs = new Handspinner();
        hs.rotate();
        hs.addForce(30.0f);
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(hs.getAngle());
        System.out.println(hs.getRotationCount());
        assert(hs.getRotationCount()>0);
    }
    @Test
    public void inverseRotationCountTest() throws InterruptedException {
        Handspinner hs = new Handspinner();
        hs.rotate();
        hs.addForce(-30.0f);
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(hs.getAngle());
        System.out.println(hs.getRotationCount());
        assert(hs.getRotationCount()>0);
    }

}
