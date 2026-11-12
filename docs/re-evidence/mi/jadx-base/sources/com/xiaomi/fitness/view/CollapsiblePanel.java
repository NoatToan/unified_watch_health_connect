package com.xiaomi.fitness.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.xiaomi.fitness.common.utils.AnimationUtil;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CollapsiblePanel extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f13330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f13331b;
    public LinearLayout c;
    public a d;
    public c e;
    public AnimatorSet f;
    public int g;
    public List<View> h;
    public int i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (CollapsiblePanel.this.g == 3) {
                CollapsiblePanel.this.n(4);
            } else if (CollapsiblePanel.this.g != 2) {
                return;
            } else {
                CollapsiblePanel.this.n(5);
            }
            CollapsiblePanel.this.requestLayout();
        }
    }

    public interface b {
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsiblePanel.this.g();
        }

        public c() {
        }
    }

    public CollapsiblePanel(Context context) {
        this(context, null);
    }

    private int getTotalHeight() {
        int childCount = this.c.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.c.getChildAt(i2);
            if (!i(childAt)) {
                childAt.measure(this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = this.i;
                if (i3 == 0) {
                    i3 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
                i += i3;
            }
        }
        return i;
    }

    public void e(View... viewArr) {
        this.h = Arrays.asList(viewArr);
        for (int i = 0; i < this.h.size(); i++) {
            this.c.addView(this.h.get(i));
        }
    }

    public void f() {
        if (AnimationUtil.INSTANCE.getAnimationScale(getContext()) <= 0.0f) {
            m(0);
            n(4);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(this.e);
        this.f.play(valueAnimatorOfFloat);
        this.f.start();
        n(3);
    }

    public final void g() {
        int i = this.g;
        int i2 = 0;
        if (i == 3) {
            int height = this.c.getHeight() - 50;
            if (height <= 0) {
                post(new Runnable() { // from class: z34
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40831a.l();
                    }
                });
            } else {
                i2 = height;
            }
        } else {
            if (i != 2) {
                return;
            }
            int i3 = this.i;
            int height2 = this.c.getHeight() + (i3 != 0 ? i3 / 5 : 50);
            int childCount = this.c.getChildCount();
            boolean z = true;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = this.c.getChildAt(i5);
                if (!i(childAt)) {
                    childAt.measure(this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight == 0) {
                        z = false;
                    }
                    int i6 = this.i;
                    if (i6 == 0) {
                        i6 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                    i4 += i6;
                }
            }
            if (!z || i4 > height2) {
                i2 = height2;
            } else {
                post(new Runnable() { // from class: z34
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40831a.l();
                    }
                });
                i2 = i4;
            }
        }
        m(i2);
    }

    public final void h(Context context) {
        setOrientation(1);
        setGravity(1);
        this.f13331b = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        this.f13330a = new FrameLayout(context);
        addView(this.f13331b);
        addView(this.c);
        addView(this.f13330a);
        this.d = new a();
        this.e = new c();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f = animatorSet;
        animatorSet.setInterpolator(new AccelerateInterpolator());
        this.f.setDuration(200L);
        this.f.addListener(this.d);
    }

    public final boolean i(View view) {
        if (!(view instanceof ViewGroup) || view.getVisibility() == 8) {
            return view.getVisibility() == 8;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount && viewGroup.getChildAt(i).getVisibility() == 8; i++) {
        }
        return false;
    }

    public boolean j() {
        return this.g == 4;
    }

    public void k() {
        if (AnimationUtil.INSTANCE.getAnimationScale(getContext()) <= 0.0f) {
            m(getTotalHeight());
            n(5);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(this.e);
        this.f.play(valueAnimatorOfFloat);
        this.f.start();
        n(2);
    }

    public final void l() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void m(int i) {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.height = i;
        this.c.setLayoutParams(layoutParams);
    }

    public final void n(int i) {
        this.g = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AnimatorSet animatorSet = this.f;
        return (animatorSet != null && animatorSet.isRunning()) || super.onInterceptTouchEvent(motionEvent);
    }

    public void setBottomView(View view) {
        this.f13330a.addView(view);
    }

    public void setOnPanelStateChangedListener(b bVar) {
    }

    public void setTopView(View view) {
        this.f13331b.addView(view);
    }

    public void setViewHeight(int i) {
        this.i = i;
    }

    public CollapsiblePanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsiblePanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 1;
        h(context);
    }
}
