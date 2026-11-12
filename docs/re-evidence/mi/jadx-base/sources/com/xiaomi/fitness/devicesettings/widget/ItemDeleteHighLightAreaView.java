package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.wzi;
import defpackage.zqi;

/* JADX INFO: loaded from: classes8.dex */
public class ItemDeleteHighLightAreaView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f12027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12028b;

    public ItemDeleteHighLightAreaView(Context context) {
        this(context, null);
    }

    public void a() {
        this.f12027a.setImageResource(jni.P0);
        this.f12028b.setText(wzi.Z9);
        this.f12028b.setTextColor(getResources().getColor(cji.H));
        setBackgroundColor(getResources().getColor(cji.j));
    }

    public void b() {
        this.f12027a.setImageResource(jni.O0);
        this.f12028b.setText(wzi.Y9);
        this.f12028b.setTextColor(getResources().getColor(cji.E));
        setBackgroundColor(getResources().getColor(cji.w));
    }

    public ItemDeleteHighLightAreaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemDeleteHighLightAreaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(eui.V2, (ViewGroup) this, true);
        this.f12027a = (ImageView) viewInflate.findViewById(zqi.G3);
        this.f12028b = (TextView) viewInflate.findViewById(zqi.ja);
    }
}
