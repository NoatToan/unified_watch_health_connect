package com.xiaomi.fitness.share.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.bsi;
import defpackage.byi;
import defpackage.ivi;
import defpackage.xr5;

/* JADX INFO: loaded from: classes8.dex */
public class TraceAMapDistanceView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12898b;
    public TextView c;
    public TextView d;
    public ValueAnimator e;
    public float f;

    public TraceAMapDistanceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        this.f12897a = context;
        LayoutInflater.from(context).inflate(ivi.t1, this);
    }

    public final /* synthetic */ void c(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        f.floatValue();
        this.f12898b.setText(String.format("%.2f", f));
        this.c.setText(this.f12897a.getResources().getQuantityString(byi.z, xr5.j(this.f)));
    }

    public void d() {
        this.e.pause();
    }

    public void e() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    public void f(long j, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        this.e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bkp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4322a.c(valueAnimator);
            }
        });
        this.e.start();
    }

    public void g() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12898b = (TextView) findViewById(bsi.z8);
        this.c = (TextView) findViewById(bsi.f9);
        this.d = (TextView) findViewById(bsi.L6);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12898b.getText().length();
    }

    public void setDistance(float f) {
        this.f = f;
    }

    public void setDistanceTxt(float f) {
        this.f12898b.setText(String.format("%.2f", Float.valueOf(f)));
        this.c.setText(this.f12897a.getResources().getQuantityString(byi.z, xr5.j(f)));
        invalidate();
    }

    public void setSportType(String str) {
        this.d.setText(str);
    }
}
