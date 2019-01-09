package com.example.quizgameapp.interfaces;


/**
 * Developed by AbhiAndroid.com
 */

public interface VolleyResponse {
    public interface ResultListener{
        public void onSuccess(String result);
    }
    public interface ErrorListener{
        public void onError(String error);
    }
}
