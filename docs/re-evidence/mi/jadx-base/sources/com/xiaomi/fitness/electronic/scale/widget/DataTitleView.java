package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocalLanguageUtil;
import com.xiaomi.fitness.common.utils.TextSpannableUtil;
import defpackage.bri;
import defpackage.gui;
import defpackage.kpi;

/* JADX INFO: loaded from: classes8.dex */
public class DataTitleView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12139b;
    public LinearLayout c;
    public TextView d;
    public float e;
    public float f;
    public float g;

    public DataTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 33.0f;
        this.f = 20.0f;
        this.g = 12.0f;
        LayoutInflater.from(context).inflate(gui.m0, this);
    }

    public void a(Context context, String str, String str2, String str3) {
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.f12138a.setText(TextSpannableUtil.getSpannableWithTypeface(context, this.e, str, kpi.f24141a, str2));
        this.f12138a.setIncludeFontPadding(false);
        this.f12139b.setVisibility(0);
        this.f12139b.setText(str3);
        this.f12139b.setTextSize(this.g);
    }

    public void b(String str) {
        this.d.setVisibility(0);
        this.c.setVisibility(8);
        if (LocalLanguageUtil.INSTANCE.languageGreek()) {
            this.d.setTextSize(this.f);
        }
        this.d.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearLayout) findViewById(bri.k2);
        this.f12138a = (TextView) findViewById(bri.Y5);
        this.f12139b = (TextView) findViewById(bri.X5);
        this.d = (TextView) findViewById(bri.n0);
        if (AppUtil.getTxtFontSize(getContext()) > 1.25f) {
            this.e = 26.0f;
            this.f = 17.0f;
            this.g = 10.0f;
        }
    }
}
