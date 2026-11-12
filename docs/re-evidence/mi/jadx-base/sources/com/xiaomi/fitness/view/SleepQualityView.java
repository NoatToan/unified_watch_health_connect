package com.xiaomi.fitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.eri;
import defpackage.jui;

/* JADX INFO: loaded from: classes10.dex */
public class SleepQualityView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f13344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13345b;
    public TextView c;
    public Context d;
    public View e;

    public SleepQualityView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context;
        LayoutInflater.from(context).inflate(jui.G7, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(eri.Vn);
        this.f13345b = (TextView) findViewById(eri.Xn);
        this.f13344a = (TextView) findViewById(eri.Wn);
        this.e = findViewById(eri.gg);
    }

    public void setDividerLineVisibility(int i) {
        this.e.setVisibility(i);
    }
}
