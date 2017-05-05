package com.neolo.bears.bears;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.neolo.bears.bears.adapter.GuidePagerAdapter;
import com.neolo.bears.bears.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends BaseActivity {

    private List<View> views;
    @Override
    protected int getLayoutId() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//NO TITLE
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        return R.layout.activity_guide;
    }

    @Override
    protected void setSubView() {

        views = new ArrayList<View>();
        LayoutInflater inflater = LayoutInflater.from(this);

        //把引导页加入到集合中
        views.add(inflater.inflate(R.layout.view_guide_01, null));
        views.add(inflater.inflate(R.layout.view_guide_02, null));
        views.add(inflater.inflate(R.layout.view_guide_03, null));
        views.add(inflater.inflate(R.layout.view_guide_04, null));

        GuidePagerAdapter guidePagerAdapter = new GuidePagerAdapter(views, this);
        ((ViewPager)findViewById(R.id.viewpager_guide)).setAdapter(guidePagerAdapter);
    }

    @Override
    protected void initEvent() {

    }
}
