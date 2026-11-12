package com.xiaomi.fitness.baseui.calendar.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public class ExpandLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f11619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11620b;
    public boolean c;
    public long d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ExpandLinearLayout.this.f11620b <= 0) {
                ExpandLinearLayout expandLinearLayout = ExpandLinearLayout.this;
                expandLinearLayout.f11620b = expandLinearLayout.f11619a.getMeasuredHeight();
            }
        }
    }

    public ExpandLinearLayout(Context context) {
        this(context, null);
    }

    public final void e(long j) {
        ValueAnimator valueAnimatorOfFloat = this.c ? ValueAnimator.ofFloat(0.0f, this.f11620b) : ValueAnimator.ofFloat(this.f11620b, 0.0f);
        long j2 = j / 2;
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setStartDelay(j2);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ti8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f34734a.j(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void f() {
        this.c = false;
        e(this.d);
    }

    public void g() {
        this.c = true;
        e(this.d);
    }

    public void h(boolean z) {
        this.c = z;
        if (z) {
            return;
        }
        e(100L);
    }

    public final void i() {
        this.f11619a = this;
        this.c = true;
        this.d = 300L;
        k();
    }

    public final /* synthetic */ void j(ValueAnimator valueAnimator) {
        l(this.f11619a, (int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void k() {
        this.f11619a.post(new a());
    }

    public void l(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
        if (!this.c && i <= 20) {
            setVisibility(8);
        } else if (i >= 20) {
            setVisibility(0);
        }
    }

    public void m() {
        if (this.c) {
            f();
        } else {
            g();
        }
    }

    public void setAnimationDuration(long j) {
        this.d = j;
    }

    public void setDefViewHeight(int i) {
        this.f11620b = i;
    }

    public ExpandLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i();
    }
}
