package com.getranked.alpha.fragments;

import android.app.DownloadManager;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Usama on 10/5/2017.
 */

public class FragmentAccountsinglton {
    private static FragmentAccountsinglton minstance;
    private RequestQueue requestQueue;
    private static Context mCtx;

    private FragmentAccountsinglton(Context context){
        mCtx =context;
        requestQueue = getRequestQueue();
    }
    public RequestQueue getRequestQueue(){
        if (requestQueue==null){
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return requestQueue;
    }
    public static synchronized FragmentAccountsinglton getInstance(Context context){
        if(minstance==null){
            minstance = new FragmentAccountsinglton(context);


        }
        return minstance;

    }

    public<T> void addToRequestque(Request<T> request){

            requestQueue.add(request);
    }
}
