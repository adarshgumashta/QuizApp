package com.example.quizgameapp.utils;

import android.arch.persistence.room.Room;

import com.example.quizgameapp.constant.GlobalConstant;
import com.example.quizgameapp.room_database.AppDatabase;

import static com.facebook.FacebookSdk.getApplicationContext;

/**
 * Developed by AbhiAndroid.com
 */

public class MySingleton {
    private static final MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {
    }
    public AppDatabase  getRoomInstance(){
       /* AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, GlobalConstant.getInstance().ROOM_DATABASE).build();*/
        AppDatabase db=  Room.databaseBuilder(getApplicationContext(), AppDatabase.class, GlobalConstant.getInstance().ROOM_DATABASE).allowMainThreadQueries().build();
        return db;
    }
}
