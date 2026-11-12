package com.xiaomi.fitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TextSpannableUtil;
import defpackage.eri;
import defpackage.jui;
import defpackage.lpi;

/* JADX INFO: loaded from: classes10.dex */
public class TodayHealthDataTitleView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f13348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13349b;
    public LinearLayout c;
    public TextView d;
    public View e;
    public float f;
    public float g;
    public float h;
    public ImageView i;

    public TodayHealthDataTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 33.0f;
        this.g = 20.0f;
        this.h = 15.0f;
        LayoutInflater.from(context).inflate(jui.Z7, this);
    }

    public void a(Context context, String str, String str2, String str3) {
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.f13348a.setText(TextSpannableUtil.getSpannableWithTypeface(context, this.f, str, lpi.c, str2));
        this.f13348a.setIncludeFontPadding(false);
        this.f13349b.setVisibility(0);
        this.f13349b.setText(str3);
        this.f13349b.setTextSize(this.h);
    }

    public void b(Context context, String str, String str2, String str3, boolean z) {
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.f13348a.setText(TextSpannableUtil.getSpannableWithTypeface(context, this.f, str, lpi.c, str2));
        this.f13348a.setIncludeFontPadding(false);
        this.f13349b.setVisibility(0);
        this.f13349b.setText(str3);
        this.f13349b.setTextSize(this.h);
        if (z) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(8);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearLayout) findViewById(eri.Za);
        this.f13348a = (TextView) findViewById(eri.yn);
        this.f13349b = (TextView) findViewById(eri.vn);
        this.d = (TextView) findViewById(eri.C4);
        this.i = (ImageView) findViewById(eri.hj);
        this.e = findViewById(eri.e);
        if (AppUtil.getTxtFontSize(getContext()) >= 1.25f) {
            this.f = 22.0f;
            this.g = 17.0f;
            this.h = 11.0f;
        }
        setFocusable(true);
    }
}
