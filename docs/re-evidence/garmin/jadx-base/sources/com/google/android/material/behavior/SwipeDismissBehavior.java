package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.customview.widget.c;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.WeakHashMap;
import l7.f;
import l7.h;

/* JADX INFO: loaded from: classes14.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    c viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final c.AbstractC0092c dragCallback = new c.AbstractC0092c() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(View view2, float f14) {
            if (f14 == 0.0f) {
                return Math.abs(view2.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view2.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            boolean z14 = view2.getLayoutDirection() == 1;
            int i14 = SwipeDismissBehavior.this.swipeDirection;
            if (i14 == 2) {
                return true;
            }
            if (i14 == 0) {
                if (z14) {
                    return f14 < 0.0f;
                }
                return f14 > 0.0f;
            }
            if (i14 == 1) {
                if (z14) {
                    return f14 > 0.0f;
                }
                if (f14 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public int clampViewPositionHorizontal(View view2, int i14, int i15) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            boolean z14 = view2.getLayoutDirection() == 1;
            int i16 = SwipeDismissBehavior.this.swipeDirection;
            if (i16 == 0) {
                width = this.originalCapturedViewLeft;
                if (z14) {
                    width -= view2.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width3 = view2.getWidth();
                    width2 = width3 + width;
                }
            } else if (i16 == 1) {
                width = this.originalCapturedViewLeft;
                if (z14) {
                    width3 = view2.getWidth();
                    width2 = width3 + width;
                } else {
                    width -= view2.getWidth();
                    width2 = this.originalCapturedViewLeft;
                }
            } else {
                width = this.originalCapturedViewLeft - view2.getWidth();
                width2 = view2.getWidth() + this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i14, width2);
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public int clampViewPositionVertical(View view2, int i14, int i15) {
            return view2.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public int getViewHorizontalDragRange(View view2) {
            return view2.getWidth();
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public void onViewCaptured(View view2, int i14) {
            this.activePointerId = i14;
            this.originalCapturedViewLeft = view2.getLeft();
            ViewParent parent = view2.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public void onViewDragStateChanged(int i14) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i14);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public void onViewPositionChanged(View view2, int i14, int i15, int i16, int i17) {
            float width = view2.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view2.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float fAbs = Math.abs(i14 - this.originalCapturedViewLeft);
            if (fAbs <= width) {
                view2.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view2.setAlpha(0.0f);
            } else {
                view2.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // androidx.customview.widget.c.AbstractC0092c
        public void onViewReleased(View view2, float f14, float f15) {
            int i14;
            boolean z14;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view2.getWidth();
            if (shouldDismiss(view2, f14)) {
                if (f14 >= 0.0f) {
                    int left = view2.getLeft();
                    int i15 = this.originalCapturedViewLeft;
                    if (left < i15) {
                        i14 = this.originalCapturedViewLeft - width;
                    } else {
                        i14 = i15 + width;
                    }
                } else {
                    i14 = this.originalCapturedViewLeft - width;
                }
                z14 = true;
            } else {
                i14 = this.originalCapturedViewLeft;
                z14 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.s(i14, view2.getTop())) {
                SettleRunnable settleRunnable = new SettleRunnable(view2, z14);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.postOnAnimation(settleRunnable);
            } else {
                if (!z14 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view2);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public boolean tryCaptureView(View view2, int i14) {
            int i15 = this.activePointerId;
            return (i15 == -1 || i15 == i14) && SwipeDismissBehavior.this.canSwipeDismissView(view2);
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view2);

        void onDragStateChanged(int i14);
    }

    public class SettleRunnable implements Runnable {
        private final boolean dismiss;

        /* JADX INFO: renamed from: view, reason: collision with root package name */
        private final View f53165view;

        public SettleRunnable(View view2, boolean z14) {
            this.f53165view = view2;
            this.dismiss = z14;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            c cVar = SwipeDismissBehavior.this.viewDragHelper;
            if (cVar != null && cVar.h()) {
                View view2 = this.f53165view;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.postOnAnimation(this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.f53165view);
            }
        }
    }

    public static float clamp(float f14, float f15, float f16) {
        return Math.min(Math.max(f14, f15), f16);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? c.i(viewGroup, this.sensitivity, this.dragCallback) : c.j(viewGroup, this.dragCallback);
        }
    }

    public static float fraction(float f14, float f15, float f16) {
        return (f16 - f14) / (f15 - f14);
    }

    private void updateAccessibilityActions(View view2) {
        s0.n(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, view2);
        if (canSwipeDismissView(view2)) {
            s0.p(view2, f.a.f110575n, null, new h() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // l7.h
                public boolean perform(View view3, h.a aVar) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view3)) {
                        return false;
                    }
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    boolean z14 = view3.getLayoutDirection() == 1;
                    int i14 = SwipeDismissBehavior.this.swipeDirection;
                    view3.offsetLeftAndRight((!(i14 == 0 && z14) && (i14 != 1 || z14)) ? view3.getWidth() : -view3.getWidth());
                    view3.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view3);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(View view2) {
        return true;
    }

    public int getDragState() {
        c cVar = this.viewDragHelper;
        if (cVar != null) {
            return cVar.f6630a;
        }
        return 0;
    }

    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v14, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (zIsPointInChildBounds) {
            ensureViewDragHelper(coordinatorLayout);
            if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.t(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v14, int i14) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v14, i14);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (v14.getImportantForAccessibility() == 0) {
            v14.setImportantForAccessibility(1);
            updateAccessibilityActions(v14);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.m(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f14) {
        this.dragDismissThreshold = clamp(0.0f, f14, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f14) {
        this.alphaEndSwipeDistance = clamp(0.0f, f14, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f14) {
        this.sensitivity = f14;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f14) {
        this.alphaStartSwipeDistance = clamp(0.0f, f14, 1.0f);
    }

    public void setSwipeDirection(int i14) {
        this.swipeDirection = i14;
    }

    public static int clamp(int i14, int i15, int i16) {
        return Math.min(Math.max(i14, i15), i16);
    }
}
