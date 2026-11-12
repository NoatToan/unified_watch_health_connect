package com.xiaomi.fitness.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocalLanguageUtil;
import com.xiaomi.fitness.common.utils.TextSpannableUtil;
import defpackage.eri;
import defpackage.jui;
import defpackage.lpi;

/* JADX INFO: loaded from: classes10.dex */
public class DataTitleView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f13336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13337b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public TextView f;
    public float g;
    public float h;
    public float i;
    public ImageView j;

    public DataTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 33.0f;
        this.h = 20.0f;
        this.i = 12.0f;
        LayoutInflater.from(context).inflate(jui.V6, this);
    }

    public void a(Context context, String str, String str2, String str3) {
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.f13336a.setText(TextSpannableUtil.getSpannableWithTypeface(context, this.g, str, lpi.c, str2));
        this.f13336a.setIncludeFontPadding(false);
        this.f13337b.setVisibility(0);
        this.f13337b.setText(str3);
        this.f13337b.setTextSize(this.i);
    }

    public void b(Context context, String str, String str2, String str3, Typeface typeface) {
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.f13336a.setText(TextSpannableUtil.getSpannableWithTypeface(typeface, context, this.g, str, str2));
        this.f13336a.setIncludeFontPadding(false);
        this.f13337b.setVisibility(0);
        this.f13337b.setText(str3);
        this.f13337b.setTextSize(this.i);
    }

    public void c(String str) {
        this.d.setVisibility(0);
        this.c.setVisibility(8);
        if (LocalLanguageUtil.INSTANCE.languageGreek()) {
            this.d.setTextSize(this.h);
        }
        this.d.setText(str);
    }

    public void d(Context context, String str, String str2, String... strArr) {
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.f13336a.setText(TextSpannableUtil.getSpannableWithTypeface(context, this.g, str2, lpi.c, strArr));
        this.f13336a.setIncludeFontPadding(false);
        this.f13337b.setVisibility(0);
        this.f13337b.setText(str);
        this.f13337b.setTextSize(this.i);
    }

    public void e(Drawable drawable) {
        this.j.setBackground(drawable);
        this.j.setVisibility(0);
    }

    public void f(float f) {
        this.g = f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearLayout) findViewById(eri.Za);
        this.f13336a = (TextView) findViewById(eri.yn);
        this.f13337b = (TextView) findViewById(eri.vn);
        this.d = (TextView) findViewById(eri.C4);
        this.j = (ImageView) findViewById(eri.hj);
        this.e = (TextView) findViewById(eri.ib);
        this.f = (TextView) findViewById(eri.Zi);
        if (AppUtil.getTxtFontSize(getContext()) >= 1.25f) {
            this.g = 22.0f;
            this.h = 17.0f;
            this.i = 8.0f;
        }
        setFocusable(true);
    }
}
