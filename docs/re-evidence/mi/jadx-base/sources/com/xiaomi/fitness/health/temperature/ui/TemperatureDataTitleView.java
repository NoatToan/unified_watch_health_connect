package com.xiaomi.fitness.health.temperature.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.eri;
import defpackage.jui;

/* JADX INFO: loaded from: classes9.dex */
public class TemperatureDataTitleView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12303b;
    public TextView c;
    public View d;
    public TextView e;
    public View f;
    public View g;
    public boolean h;
    public boolean i;

    public TemperatureDataTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(jui.W7, this);
    }

    public void a(boolean z, String str, String str2) {
        this.h = z;
        this.c.setVisibility(0);
        this.c.setText(str);
        this.e.setVisibility(8);
        this.d.setVisibility(0);
        this.f.setVisibility(z ? 0 : 8);
        this.f12302a.setText(str2);
    }

    public void b(boolean z, String str, String str2) {
        this.i = z;
        this.c.setVisibility(0);
        this.c.setText(str);
        this.e.setVisibility(8);
        this.d.setVisibility(0);
        this.g.setVisibility(z ? 0 : 8);
        this.f12303b.setText(str2);
    }

    public void c(boolean z) {
        if (z) {
            this.c.setVisibility(4);
            if (this.h) {
                this.f12302a.setVisibility(4);
            }
            if (this.i) {
                this.f12303b.setVisibility(4);
                return;
            }
            return;
        }
        this.c.setVisibility(0);
        if (this.h) {
            this.f12302a.setVisibility(0);
        }
        if (this.i) {
            this.f12303b.setVisibility(0);
        }
    }

    public void d(String str) {
        this.e.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(eri.Za);
        this.f = findViewById(eri.Ua);
        this.g = findViewById(eri.Ya);
        this.f12302a = (TextView) findViewById(eri.e5);
        this.f12303b = (TextView) findViewById(eri.Pe);
        this.c = (TextView) findViewById(eri.vn);
        this.e = (TextView) findViewById(eri.C4);
        setFocusable(true);
    }
}
