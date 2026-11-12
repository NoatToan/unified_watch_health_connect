package com.xiaomi.fitness.share.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.xiaomi.fitness.baseui.extension.ViewGroupExtendKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.bsi;
import defpackage.byi;
import defpackage.ivi;
import defpackage.xr5;

/* JADX INFO: loaded from: classes8.dex */
public class TraceDistanceView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ShareBoldTextView f12900b;
    public ShareBoldTextView c;
    public ValueAnimator d;
    public float e;

    public TraceDistanceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        this.f12899a = context;
        LayoutInflater.from(context).inflate(ivi.u1, this);
    }

    public final /* synthetic */ void c(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        f.floatValue();
        this.f12900b.setText(String.format("%.2f", f));
        this.c.setText(this.f12899a.getResources().getQuantityString(byi.z, xr5.j(this.e)));
    }

    public void d(long j, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        this.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.d.setInterpolator(new AccelerateDecelerateInterpolator());
        this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fkp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f17881a.c(valueAnimator);
            }
        });
        this.d.start();
    }

    public void e() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12900b = (ShareBoldTextView) findViewById(bsi.z8);
        ShareBoldTextView shareBoldTextView = (ShareBoldTextView) findViewById(bsi.f9);
        this.c = shareBoldTextView;
        shareBoldTextView.setVisibility(8);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int length = this.f12900b.getText().length();
        float fD = this.f12900b.d("0.00");
        if (length == 4) {
            fD += DisplayUtil.dip2px(3.0f);
        } else if (length == 5) {
            fD = DisplayUtil.dip2px(3.0f) + this.f12900b.d("10.00");
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
        ViewGroupExtendKt.setMarginRelative(layoutParams, (int) fD, 0, 0, 0);
        this.c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f12900b.getLayoutParams();
        layoutParams2.width = (int) this.f12900b.getTextWidth();
        this.f12900b.setLayoutParams(layoutParams2);
    }

    public void setDistance(float f) {
        this.e = f;
    }

    public void setDistanceTxt(float f) {
        this.f12900b.setText(String.format("%.2f", Float.valueOf(f)));
        this.c.setText(this.f12899a.getResources().getQuantityString(byi.z, xr5.j(f)));
        invalidate();
    }
}
