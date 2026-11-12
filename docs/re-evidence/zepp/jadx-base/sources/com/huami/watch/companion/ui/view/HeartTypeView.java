package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class HeartTypeView extends LinearLayout {
    private TextView a;
    private TextView b;
    private TextView c;

    public HeartTypeView(Context context) {
        this(context, null);
    }

    public void cleanSelected() {
        this.b.setSelected(false);
        this.c.setSelected(false);
    }

    public float getPercent() {
        String string = this.c.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return 0.0f;
        }
        return Float.parseFloat(string) / 100.0f;
    }

    public int getValue() {
        String string = this.b.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return 0;
        }
        return Integer.parseInt(string);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }

    public void setPercent(int i) {
        this.c.setText(String.valueOf(i));
    }

    public void setPercentEnabled(boolean z) {
        this.c.setEnabled(z);
    }

    public void setPercentSelected(boolean z) {
        this.c.setSelected(z);
    }

    public void setPercentTag(int i) {
        this.c.setTag(Integer.valueOf(i));
    }

    public void setTitle(int i) {
        this.a.setText(i);
    }

    public void setValue(int i) {
        this.b.setText(String.valueOf(i));
    }

    public void setValueClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
    }

    public void setValueSelected(boolean z) {
        this.b.setSelected(z);
    }

    public void setValueTag(int i) {
        this.b.setTag(Integer.valueOf(i));
    }

    public HeartTypeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setTitle(String str) {
        this.a.setText(str);
    }

    public HeartTypeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.view_heart_type, this);
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.value);
        this.c = (TextView) findViewById(R.id.percent);
    }
}
