package com.btk.collectiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        treemapDemo();
    }

    private void treesetdemo() {

        TreeSet<User> userTreeSet = new TreeSet<>();

        User user1 = new User(1,"abc");
        User user2 = new User(2,"def");

        userTreeSet.add(user1);
        userTreeSet.add(user2);

        Iterator<User> userIterator = userTreeSet.iterator();

        while(userIterator.hasNext()) {
            Log.v("===","value:"+userIterator.next().getUserName());
        }
    }

    private void treemapDemo() {

        TreeMap<User,Integer> userTreeMap = new TreeMap<>(new UserNameComparator());

        User user1 = new User(1,"kbc");
        User user2 = new User(2,"xbc");
        User user3 = new User(3,"qbc");
        User user4 = new User(4,"abc");
        User user5 = new User(5,"def");
        User user6 = new User(6,"mbc");


        userTreeMap.put(user1,1);
        userTreeMap.put(user2,2);
        userTreeMap.put(user3,4);
        userTreeMap.put(user6,92);
        userTreeMap.put(user4,7);
        userTreeMap.put(user5,12);


        for(Map.Entry entry : userTreeMap.entrySet()) {
            Log.v("===","value:"+entry.getValue());
        }

    }
}
