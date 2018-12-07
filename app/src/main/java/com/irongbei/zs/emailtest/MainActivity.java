package com.irongbei.zs.emailtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    MailBoxAssociateView view;
    private String[] email_sufixs = new String[]{"@qq.com", "@163.com", "@126.com", "@gmail.com", "@sina.com", "@hotmail.com",
            "@yahoo.cn", "@sohu.com", "@foxmail.com", "@139.com", "@yeah.net", "@vip.qq.com", "@vip.sina.com"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.imageviewedittextone);
        MailBoxAssociateTokenizer mailBoxAssociateTokenizer = new MailBoxAssociateTokenizer();
        ArrayAdapter<String> adapter = new ArrayAdapter(MainActivity.this, R.layout.auto_textview, email_sufixs);
        view.setAdapter(adapter);
        view.setTokenizer(mailBoxAssociateTokenizer);


    }
}
