package com.huawei.ui.homehealth.device.util;

import android.content.Context;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes17.dex */
public class NestScrollHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f25335a = ViewConfiguration.getScrollFriction();
    private static final float e = (float) (Math.log(0.78d) / Math.log(0.9d));
    private float d;

    public NestScrollHelper(Context context) {
        this.d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    private double b(double d) {
        return Math.log((Math.abs(d) * 0.3499999940395355d) / ((double) (f25335a * this.d)));
    }

    private double e(double d) {
        double d2 = e;
        return ((d2 - 1.0d) * Math.log(d / ((double) (f25335a * this.d)))) / d2;
    }

    public double c(int i) {
        double dB = b(i);
        double d = e;
        return ((double) (f25335a * this.d)) * Math.exp((d / (d - 1.0d)) * dB);
    }

    public double c(double d) {
        return Math.abs(((Math.exp(e(d)) * ((double) f25335a)) * ((double) this.d)) / 0.3499999940395355d);
    }

    public double a(double d) {
        return Math.exp(b(d) / (((double) e) - 1.0d)) * 1000.0d;
    }
}
