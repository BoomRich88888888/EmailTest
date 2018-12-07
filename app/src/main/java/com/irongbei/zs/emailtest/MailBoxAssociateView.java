package com.irongbei.zs.emailtest;

import android.content.Context;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.util.AttributeSet;

/**
 * Create By: guodaying
 * CreateDate: 2018/12/7 10:30
 * Describe:
 */
public class MailBoxAssociateView extends AppCompatMultiAutoCompleteTextView {
    public MailBoxAssociateView(Context context) {
        super(context);
    }

    public MailBoxAssociateView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MailBoxAssociateView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean enoughToFilter() {
        // 如果字符中包含'@'并且不在第一位，则满足条件
        return getText().toString().contains("@") && getText().toString().indexOf("@") > 0;
    }
}