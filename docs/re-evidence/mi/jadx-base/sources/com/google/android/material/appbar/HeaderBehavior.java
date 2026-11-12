package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.c;
import defpackage.r8f;

/* JADX INFO: loaded from: classes5.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    public Runnable d;
    public OverScroller e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public VelocityTracker j;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f8527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f8528b;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.f8527a = coordinatorLayout;
            this.f8528b = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f8528b == null || (overScroller = HeaderBehavior.this.e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.j(this.f8527a, this.f8528b);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.l(this.f8527a, this.f8528b, headerBehavior.e.getCurrY());
            c.i0(this.f8528b, this);
        }
    }

    public HeaderBehavior() {
        this.g = -1;
        this.i = -1;
    }

    public boolean d(V v) {
        return false;
    }

    public final void e() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v.getContext());
        }
        this.e.fling(0, a(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.e.computeScrollOffset()) {
            j(coordinatorLayout, v);
            return false;
        }
        a aVar = new a(coordinatorLayout, v);
        this.d = aVar;
        c.i0(v, aVar);
        return true;
    }

    public int g(V v) {
        return -v.getHeight();
    }

    public int h(V v) {
        return v.getHeight();
    }

    public int i() {
        return a();
    }

    public void j(CoordinatorLayout coordinatorLayout, V v) {
    }

    public final int k(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return m(coordinatorLayout, v, i() - i, i2, i3);
    }

    public int l(CoordinatorLayout coordinatorLayout, V v, int i) {
        return m(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iB;
        int iA = a();
        if (i2 == 0 || iA < i2 || iA > i3 || iA == (iB = r8f.b(i, i2, i3))) {
            return 0;
        }
        c(iB);
        return iA - iB;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f) {
            int i = this.g;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.h) > this.i) {
                this.h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = d(v) && coordinatorLayout.z(v, x, y2);
            this.f = z;
            if (z) {
                this.h = y2;
                this.g = motionEvent.getPointerId(0);
                e();
                OverScroller overScroller = this.e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.j.computeCurrentVelocity(1000);
                f(coordinatorLayout, v, -h(v), 0, this.j.getYVelocity(this.g));
                z = true;
            }
            this.f = false;
            this.g = -1;
            velocityTracker = this.j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.j = null;
            }
            velocityTracker2 = this.j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f) {
                return true;
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int i = this.h - y;
            this.h = y;
            k(coordinatorLayout, v, i, g(v), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.g = motionEvent.getPointerId(i2);
                this.h = (int) (motionEvent.getY(i2) + 0.5f);
            }
        }
        z = false;
        velocityTracker2 = this.j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f || z;
        z = false;
        this.f = false;
        this.g = -1;
        velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j = null;
        }
        velocityTracker2 = this.j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f) {
            return true;
        }
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        this.i = -1;
    }
}
