package com.lanou.dllo.checkbox;
import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends Activity {

    //首页完成了
    //登陆页

    private ListView listView; //listview控件
    private ArrayList<String> contentStrings = new ArrayList<String>(); //数据源
    private ListViewAdpter adapter;  //适配器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        initData(); //初始化数据
        setListener();  //绑定事件
    }
    private void initData() {
        contentStrings.add("第1项");
        contentStrings.add("第2项");
        contentStrings.add("第3项");
        contentStrings.add("第4项");
        contentStrings.add("第5项");
        contentStrings.add("第6项");
        contentStrings.add("第7项");
        contentStrings.add("第8项");
        contentStrings.add("第9项");
        contentStrings.add("第10项");
        contentStrings.add("第11项");
        contentStrings.add("第12项");
        contentStrings.add("第13项");
        adapter=new ListViewAdpter(contentStrings, this);
        listView.setAdapter(adapter);
    }

    private void setListener() {

        listView.setOnItemClickListener(new OnItemClickListener() { //点击每项item时候执行
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                Toast.makeText(MainActivity.this, "点击事件，执行你的操作", Toast.LENGTH_SHORT).show();
            }
        });

    }



}
