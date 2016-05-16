package com.example.liaopenghui.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = (TextView) findViewById(R.id.tv_title);
        //通过 %1$s设置占位符,只替换占位符中的文字
        String  title = getString(R.string.title1,"小公主","小红红","大小姐");
        textView1.setText(title);
        //android:autoLink属性 设置是否当文本为URL链接/email/电话号码/map时，文本显示为可点击的链接。可选值(none/web/email/phone/map/all)
        //android:cursorVisible   设定光标为显示/隐藏，默认显示。
        //android:digits  设置允许输入哪些字符。如“1234567890.+-*/%\n()”
        //android:ellipsize  设置当文字过长时,该控件该如何显示。有如下值设置：”start”—–省略号显示在开头；”end”——省略号显示在结尾；”middle”—-省略号显示在中间；”marquee” ——以跑马灯的方式显示(动画横向移动)
        //android:lineSpacingExtra
    }
}
