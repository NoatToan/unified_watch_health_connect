package com.xiaomi.fitness.health.pai.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.chart.entrys.PaiEntry;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;

/* JADX INFO: loaded from: classes9.dex */
public class PaiLimitGridView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f12257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12258b;
    public TextView c;
    public TextView d;
    public Context e;

    public PaiLimitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        LayoutInflater.from(context).inflate(jui.o7, this);
    }

    public void a(float f, float f2, float f3, float f4) {
        int i = (int) f2;
        int i2 = (int) f3;
        int i3 = (int) f4;
        int i4 = ((((int) f) - i) - i2) - i3;
        int iMax = Math.max(i3, Math.max(i, i2));
        int iMin = Math.min(i3, Math.min(i, i2));
        if (i4 == 1) {
            if (iMax == i) {
                i++;
            } else if (iMax == i2) {
                i2++;
            } else {
                i3++;
            }
        } else if (i4 == 2) {
            if (iMin == i) {
                i2++;
            } else if (iMin == i2) {
                i++;
            } else {
                i2++;
                i++;
            }
            i3++;
        }
        this.f12258b.setText(Integer.toString(i));
        this.c.setText(Integer.toString(i2));
        this.d.setText(Integer.toString(i3));
        this.f12257a.setVisibility(0);
    }

    public void b(PaiEntry paiEntry) {
        if (paiEntry != null) {
            this.f12258b.setText(Integer.toString((int) paiEntry.c));
            this.c.setText(Integer.toString((int) paiEntry.d));
            this.d.setText(Integer.toString((int) paiEntry.e));
            this.f12257a.setVisibility(0);
            return;
        }
        String str = "0" + ((Object) this.e.getText(c0j.n7));
        this.f12258b.setText(str);
        this.c.setText(str);
        this.d.setText(str);
        this.f12257a.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12257a = (LinearLayout) findViewById(eri.E9);
        this.f12258b = (TextView) findViewById(eri.Wl);
        this.c = (TextView) findViewById(eri.Yl);
        this.d = (TextView) findViewById(eri.Xl);
    }
}
