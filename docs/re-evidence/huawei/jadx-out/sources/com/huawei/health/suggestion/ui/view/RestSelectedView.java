package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.suggestion.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes31.dex */
public class RestSelectedView extends LinearLayout {
    public RestSelectedView(Context context) {
        super(context);
    }

    public RestSelectedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public RestSelectedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        if (LanguageUtil.o(context)) {
            LayoutInflater.from(context).inflate(R.layout.sug_reset_selected_chinese, (ViewGroup) this, true);
        } else if (LanguageUtil.p(context)) {
            LayoutInflater.from(context).inflate(R.layout.sug_reset_selected_german, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(context).inflate(R.layout.sug_reset_selected_not_chinese, (ViewGroup) this, true);
        }
    }
}
