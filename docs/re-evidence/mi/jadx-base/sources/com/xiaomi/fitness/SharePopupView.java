package com.xiaomi.fitness;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.cvi;
import defpackage.wri;

/* JADX INFO: loaded from: classes7.dex */
public class SharePopupView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatTextView f11480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatTextView f11481b;
    public AppCompatTextView c;
    public AppCompatTextView d;

    public SharePopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SharePopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SharePopupView(Context context, View.OnClickListener onClickListener) {
        super(context);
        LayoutInflater.from(context).inflate(cvi.f14772a, (ViewGroup) this, true);
        this.f11480a = (AppCompatTextView) findViewById(wri.d);
        this.f11481b = (AppCompatTextView) findViewById(wri.c);
        this.c = (AppCompatTextView) findViewById(wri.f38286a);
        this.d = (AppCompatTextView) findViewById(wri.f38287b);
        this.f11480a.setOnClickListener(onClickListener);
        this.f11481b.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
    }
}
