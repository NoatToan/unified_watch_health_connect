package miuix.appcompat.internal.app.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.dyq;
import defpackage.rki;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollingTabTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f26450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26451b;
    public int c;
    public ValueAnimator d;
    public int e;
    public boolean f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollingTabTextView.this.e = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ScrollingTabTextView.this.invalidate();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ScrollingTabTextView scrollingTabTextView = ScrollingTabTextView.this;
            scrollingTabTextView.e = scrollingTabTextView.getWidth();
        }
    }

    public ScrollingTabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public final void b() {
        ColorStateList textColors = getTextColors();
        this.f26450a = textColors;
        this.f26451b = textColors.getColorForState(TextView.ENABLED_STATE_SET, getResources().getColor(rki.f32641a));
        this.c = this.f26450a.getColorForState(TextView.ENABLED_SELECTED_STATE_SET, getResources().getColor(rki.f32642b));
    }

    public void c(boolean z) {
        int width;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null) {
            this.d = new ValueAnimator();
        } else {
            valueAnimator.cancel();
        }
        this.f = z;
        int width2 = 0;
        if (z) {
            width = getWidth();
        } else {
            width2 = getWidth();
            width = 0;
        }
        this.d.setIntValues(width2, width);
        this.d.setDuration(200L);
        this.d.addUpdateListener(new a());
        this.d.addListener(new b());
        this.d.start();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int scrollX;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.onDraw(canvas);
            return;
        }
        int i = ((!this.f || isSelected()) && (this.f || !isSelected())) ? this.c : this.f26451b;
        setTextColor(i);
        boolean zE = dyq.e(this);
        int scrollX2 = this.e;
        int height = getHeight();
        if (zE) {
            scrollX = getScrollX();
            scrollX2 += getScrollX();
        } else {
            scrollX = 0;
        }
        canvas.save();
        canvas.clipRect(scrollX, 0, scrollX2, height);
        super.onDraw(canvas);
        canvas.restore();
        int i2 = this.f26451b;
        if (i == i2) {
            i = this.c;
        } else if (i == this.c) {
            i = i2;
        }
        setTextColor(i);
        int scrollX3 = this.e;
        int width = getWidth();
        if (zE) {
            scrollX3 += getScrollX();
            width += getScrollX();
        }
        canvas.save();
        canvas.clipRect(scrollX3, 0, width, height);
        super.onDraw(canvas);
        canvas.restore();
        setTextColor(this.f26450a);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        b();
    }
}
