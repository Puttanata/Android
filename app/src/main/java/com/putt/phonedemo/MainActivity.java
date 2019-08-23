package com.putt.phonedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static final String KEY = "a19f7a97539e8abc";
    Button button;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        button = findViewById(R.id.bt_query);
        textView = findViewById(R.id.tv_consequence);
        editText = findViewById(R.id.et_phone);

    }

    public void query(View v) {
        //调用封装好的retrofit请求方法
        RetrofitHelper retrofitHelper = new RetrofitHelper();
        retrofitHelper.getData(KEY, editText.getText().toString())
                .subscribeOn(Schedulers.io())//IO线程
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<LocationRes>() {
                    //执行onNext后执行
                    @Override
                    public void onCompleted() {
                        Toast.makeText(MainActivity.this, "onCompleted！", Toast.LENGTH_SHORT).show();
                    }

                    //请求失败
                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    //请求成功
                    @Override
                    public void onNext(LocationRes locationRes) {
                        textView.setText(locationRes.getResult().toString());
                    }
                });


    }

}
