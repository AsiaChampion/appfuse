package com.feiniu.model;

/**
 * <B>Description:</B> <br>
 * <B>Create on:</B> 2017年11月16 11:10<br>
 *
 * @author yajun.he
 * @version 1.0
 */
public class BaseObjectTest extends BaseObject{
    private String name = "lilei";

    public static void main(String[] args) {
        BaseObject t = new User();
        System.out.println(t.toString());
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}