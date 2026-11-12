package com.facebook.react.views.slider;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: classes4.dex */
public class ReactSlider extends AppCompatSeekBar {
    public static int g = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f7553b;
    public double c;
    public double d;
    public double e;
    public double f;

    public ReactSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7553b = 0.0d;
        this.c = 0.0d;
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
        a();
    }

    private double getStepValue() {
        double d = this.e;
        return d > 0.0d ? d : this.f;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.c - this.f7553b) / getStepValue());
    }

    public final void a() {
    }

    public double b(int i) {
        return i == getMax() ? this.c : (((double) i) * getStepValue()) + this.f7553b;
    }

    public final void c() {
        if (this.e == 0.0d) {
            this.f = (this.c - this.f7553b) / ((double) g);
        }
        setMax(getTotalSteps());
        d();
    }

    public final void d() {
        double d = this.d;
        double d2 = this.f7553b;
        setProgress((int) Math.round(((d - d2) / (this.c - d2)) * ((double) getTotalSteps())));
    }

    public void setMaxValue(double d) {
        this.c = d;
        c();
    }

    public void setMinValue(double d) {
        this.f7553b = d;
        c();
    }

    public void setStep(double d) {
        this.e = d;
        c();
    }

    public void setValue(double d) {
        this.d = d;
        d();
    }
}
