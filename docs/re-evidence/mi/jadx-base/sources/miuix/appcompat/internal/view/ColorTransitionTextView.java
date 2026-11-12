package miuix.appcompat.internal.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import defpackage.rki;

/* JADX INFO: loaded from: classes3.dex */
public class ColorTransitionTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f26485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26486b;
    public int c;
    public int d;
    public int e;
    public ValueAnimator f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ColorTransitionTextView.this.e = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ColorTransitionTextView.this.invalidate();
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26488a;

        public b(boolean z) {
            this.f26488a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f26488a) {
                ColorTransitionTextView colorTransitionTextView = ColorTransitionTextView.this;
                colorTransitionTextView.setTextColor(colorTransitionTextView.d);
            } else {
                ColorTransitionTextView colorTransitionTextView2 = ColorTransitionTextView.this;
                colorTransitionTextView2.setTextColor(colorTransitionTextView2.c);
            }
        }
    }

    public ColorTransitionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26486b = false;
        d();
    }

    public final void d() {
        ColorStateList textColors = getTextColors();
        this.f26485a = textColors;
        int colorForState = textColors.getColorForState(TextView.ENABLED_STATE_SET, getResources().getColor(rki.c));
        this.c = colorForState;
        int colorForState2 = this.f26485a.getColorForState(TextView.ENABLED_SELECTED_STATE_SET, colorForState);
        this.d = colorForState2;
        if (this.c != colorForState2) {
            this.f26486b = true;
        }
    }

    public void e(boolean z, boolean z2) {
        if (!z2) {
            if (z) {
                setTextColor(this.d);
            } else {
                setTextColor(this.c);
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator == null) {
            this.f = new ValueAnimator();
        } else {
            valueAnimator.cancel();
        }
        if (z) {
            this.f.setIntValues(getCurrentTextColor(), this.d);
        } else {
            this.f.setIntValues(getCurrentTextColor(), this.c);
        }
        this.f.setDuration(50L);
        this.f.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f.setEvaluator(new ArgbEvaluator());
        this.f.addUpdateListener(new a());
        this.f.addListener(new b(z));
        this.f.start();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        if (!this.f26486b || (valueAnimator = this.f) == null || !valueAnimator.isRunning()) {
            super.onDraw(canvas);
        } else {
            setTextColor(this.e);
            super.onDraw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(false);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        d();
    }
}
