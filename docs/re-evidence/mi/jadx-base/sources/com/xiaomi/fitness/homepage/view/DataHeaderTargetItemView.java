package com.xiaomi.fitness.homepage.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.util.TargetUtil;
import defpackage.eri;
import defpackage.jui;

/* JADX INFO: loaded from: classes9.dex */
public class DataHeaderTargetItemView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12348b;
    public ImageView c;
    public float d;
    public float e;

    public DataHeaderTargetItemView(Context context) {
        super(context);
        this.d = 16.0f;
        this.e = 12.0f;
        LayoutInflater.from(context).inflate(jui.g7, this);
    }

    public void g(int i, String str, String str2) {
        this.c.setImageResource(i);
        this.f12348b.setTextSize(this.e);
        this.f12347a.setTextSize(this.d);
        this.f12348b.setText(str2);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12348b.setFallbackLineSpacing(false);
        }
        TargetUtil.displayTargetValueStr(this.f12347a, str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12347a = (TextView) findViewById(eri.bo);
        this.f12348b = (TextView) findViewById(eri.co);
        this.c = (ImageView) findViewById(eri.B7);
        if (AppUtil.getTxtFontSize(getContext()) >= 1.25f) {
            this.d = 12.0f;
            this.e = 9.0f;
        }
    }

    public DataHeaderTargetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 16.0f;
        this.e = 12.0f;
        LayoutInflater.from(context).inflate(jui.g7, this);
    }

    public DataHeaderTargetItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 16.0f;
        this.e = 12.0f;
        LayoutInflater.from(context).inflate(jui.g7, this);
    }
}
