package com.btk.collectiondemo;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {

    @Override
    public int compare(User user, User t1) {
        if (user.getUserName().equals(t1.getUserName())) {
            return 0;
        }
        return 1;
    }
}
