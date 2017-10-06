package com.getranked.alpha.fragments;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.getranked.alpha.R;
import com.getranked.alpha.adapters.UsefulViewPagerAdapter;
import com.getranked.alpha.controller.AppController;
import com.getranked.alpha.models.Constants;
import com.getranked.alpha.models.MOUsefulLinkForms;
import com.getranked.alpha.models.MOUsefulLinksContacts;
import com.getranked.alpha.models.MOUsefulLinksContactsList;
import com.getranked.alpha.restclient.RestServiceClient;
import com.getranked.alpha.utils.UtilsManager;

import org.androidannotations.annotations.Bean;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;
import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Usama on 10/6/2017.
 */

public class FragmentImages extends Fragment  {

//
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.fragment_useful_, container, false);
//
//
//        SharedPreferences settings = getActivity()
//                .getSharedPreferences(Constants.PREFS_NAME, MODE_PRIVATE);
//
//
//
//
//
//        return rootView;
//    }
//




}

