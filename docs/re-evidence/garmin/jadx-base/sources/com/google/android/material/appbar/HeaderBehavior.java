package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;

    public class FlingRunnable implements Runnable {
        private final V layout;
        private final CoordinatorLayout parent;

        public FlingRunnable(CoordinatorLayout coordinatorLayout, V v14) {
            this.parent = coordinatorLayout;
            this.layout = v14;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.layout == null || (overScroller = HeaderBehavior.this.scroller) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            if (!zComputeScrollOffset) {
                headerBehavior.onFlingFinished(this.parent, this.layout);
                return;
            }
            headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
            V v14 = this.layout;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            v14.postOnAnimation(this);
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    public boolean canDragView(V v14) {
        return false;
    }

    public final boolean fling(CoordinatorLayout coordinatorLayout, V v14, int i14, int i15, float f14) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v14.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v14.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f14), 0, 0, i14, i15);
        if (!this.scroller.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v14);
            return false;
        }
        FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v14);
        this.flingRunnable = flingRunnable;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        v14.postOnAnimation(flingRunnable);
        return true;
    }

    public int getMaxDragOffset(V v14) {
        return -v14.getHeight();
    }

    public int getScrollRangeForDragFling(V v14) {
        return v14.getHeight();
    }

    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    public void onFlingFinished(CoordinatorLayout coordinatorLayout, V v14) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i14 = this.activePointerId;
            if (i14 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i14)) == -1) {
                return false;
            }
            int y14 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y14 - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y14;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x14 = (int) motionEvent.getX();
            int y15 = (int) motionEvent.getY();
            boolean z14 = canDragView(v14) && coordinatorLayout.isPointInChildBounds(v14, x14, y15);
            this.isBeingDragged = z14;
            if (z14) {
                this.lastMotionY = y15;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
        boolean z14;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.velocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.velocityTracker.computeCurrentVelocity(1000);
                fling(coordinatorLayout, v14, -getScrollRangeForDragFling(v14), 0, this.velocityTracker.getYVelocity(this.activePointerId));
                z14 = true;
            }
            this.isBeingDragged = false;
            this.activePointerId = -1;
            velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.isBeingDragged) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y14 = (int) motionEvent.getY(iFindPointerIndex);
            int i14 = this.lastMotionY - y14;
            this.lastMotionY = y14;
            scroll(coordinatorLayout, v14, i14, getMaxDragOffset(v14), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i15 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.activePointerId = motionEvent.getPointerId(i15);
                this.lastMotionY = (int) (motionEvent.getY(i15) + 0.5f);
            }
        }
        z14 = false;
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.isBeingDragged || z14;
        z14 = false;
        this.isBeingDragged = false;
        this.activePointerId = -1;
        velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.isBeingDragged) {
        }
    }

    public final int scroll(CoordinatorLayout coordinatorLayout, V v14, int i14, int i15, int i16) {
        return setHeaderTopBottomOffset(coordinatorLayout, v14, getTopBottomOffsetForScrollingSibling() - i14, i15, i16);
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v14, int i14, int i15, int i16) {
        int iB;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i15 == 0 || topAndBottomOffset < i15 || topAndBottomOffset > i16 || topAndBottomOffset == (iB = g7.a.b(i14, i15, i16))) {
            return 0;
        }
        setTopAndBottomOffset(iB);
        return topAndBottomOffset - iB;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v14, int i14) {
        return setHeaderTopBottomOffset(coordinatorLayout, v14, i14, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
