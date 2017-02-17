package com.gosuncn.flavor;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gosuncn.flavor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        String flavor=null;
        if(BuildConfig.FLAVOR.equals("flavor1")){
            flavor="baidu";
        }else if(BuildConfig.FLAVOR.equals("flavor2")){
            flavor="wandoujia";
        }else{
            flavor="unknow";
        }
        binding.tvContent.setText(FlavorTest.getContent()+"----"+flavor);

    }

    public void onClickTurn(View view) {
        Intent intent=new Intent(this,FlavorActivity.class);
        startActivity(intent);
    }
}
