package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes31.dex */
public class BounceScrollView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f10177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10178c;
    private boolean d;
    private float e;
    private float f;
    private Rect h;
    private float j;

    public BounceScrollView(Context context) {
        super(context);
        this.h = new Rect();
        this.f10176a = false;
        this.f10178c = false;
        this.d = false;
        c();
    }

    public BounceScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new Rect();
        this.f10176a = false;
        this.f10178c = false;
        this.d = false;
        c();
    }

    private void c() {
        setOverScrollMode(2);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() <= 0 || !(getChildAt(0) instanceof ViewGroup)) {
            return;
        }
        this.f10177b = (ViewGroup) getChildAt(0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup viewGroup = this.f10177b;
        if (viewGroup == null) {
            return;
        }
        this.h.set(viewGroup.getLeft(), this.f10177b.getTop(), this.f10177b.getRight(), this.f10177b.getBottom());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f10177b == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        b();
        if (motionEvent.getX() >= this.h.right || motionEvent.getX() <= this.h.left) {
            if (this.d) {
                a();
            }
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10176a = d();
            this.f10178c = e();
            this.f = motionEvent.getX();
            this.e = motionEvent.getX();
            this.j = motionEvent.getY();
        } else if (action == 1) {
            if (this.d) {
                a();
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.d) {
                    a();
                    return true;
                }
            }
        } else if (!this.f10176a && !this.f10178c) {
            this.f = motionEvent.getX();
            this.f10176a = d();
            this.f10178c = e();
        } else if (e(motionEvent)) {
            int i = (int) (((int) (this.e - this.f)) * 0.3f);
            this.f10177b.layout(this.h.left + i, this.h.top, this.h.right + i, this.h.bottom);
            this.d = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private boolean e(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = (int) (x - this.f);
        int iAbs = (int) Math.abs(x - this.e);
        int iAbs2 = (int) Math.abs(y - this.j);
        boolean z2 = this.f10176a;
        boolean z3 = true;
        if (!z2 && i > 0) {
            z = true;
        }
        boolean z4 = this.f10178c;
        if (!z4 && i < 0) {
            z = true;
        }
        if (!z4 && !z2 && iAbs > iAbs2) {
            z = true;
        }
        if (this.f10177b.getLeft() <= this.h.left && this.f10177b.getRight() >= this.h.right) {
            z3 = z;
        }
        this.e = motionEvent.getX();
        this.j = motionEvent.getY();
        return z3;
    }

    private void a() {
        if (this.d) {
            TranslateAnimation translateAnimation = new TranslateAnimation(this.f10177b.getLeft(), this.h.left, 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f10177b.layout(this.h.left, this.h.top, this.h.right, this.h.bottom);
            this.f10177b.startAnimation(translateAnimation);
            this.f10176a = false;
            this.f10178c = false;
            this.d = false;
        }
    }

    private boolean d() {
        ViewGroup viewGroup = this.f10177b;
        if (viewGroup != null) {
            return ViewCompat.canScrollHorizontally(viewGroup, -1);
        }
        return true;
    }

    private boolean e() {
        ViewGroup viewGroup = this.f10177b;
        if (viewGroup != null) {
            return ViewCompat.canScrollHorizontally(viewGroup, 1);
        }
        return true;
    }

    private void b() {
        ViewParent parent = this;
        while (!(parent instanceof ViewPager)) {
            if (parent == null) {
                return;
            } else {
                parent = parent.getParent();
            }
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }
}
