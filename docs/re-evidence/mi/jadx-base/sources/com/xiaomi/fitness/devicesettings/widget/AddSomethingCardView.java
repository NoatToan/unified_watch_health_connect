package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.eui;
import defpackage.zqi;

/* JADX INFO: loaded from: classes8.dex */
public class AddSomethingCardView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f12016b;

    public AddSomethingCardView(Context context) {
        this(context, null);
    }

    public void setAddImage(Drawable drawable) {
        this.f12016b.setImageDrawable(drawable);
    }

    public void setTitle(String str) {
        this.f12015a.setText(str);
    }

    public AddSomethingCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddSomethingCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(eui.c2, (ViewGroup) this, true);
        this.f12015a = (TextView) viewInflate.findViewById(zqi.ta);
        this.f12016b = (ImageView) viewInflate.findViewById(zqi.E3);
    }
}
