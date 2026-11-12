package com.xiaomi.hm.health.relation.copy;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.relation.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class HMScrollView extends FrameLayout implements View.OnTouchListener {
    private static final String C = HMScrollView.class.getSimpleName();
    private static final int D = 250;
    private static final int E = -1;
    public static final float SCALE_DEFAULT_RATION = 1.0f;
    private OnHMScrollViewStateChanged A;
    private boolean B;
    private long a;
    private OverScroller b;
    private final Context c;
    private View d;
    private float e;
    private float f;
    private boolean g;
    private VelocityTracker h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private HMExpandHeadView n;
    private int o;
    private float p;
    private float q;
    private boolean r;
    private boolean s;
    private final float t;
    private final float u;
    private float v;
    private boolean w;
    private boolean x;
    private ValueAnimator y;
    private boolean z;

    public interface OnHMScrollViewStateChanged {
        void onBottomExpand(float f);

        void onExpandViewExpand(float f);

        void onExpandViewExpandStart();

        void onExpandViewRelease(float f);

        void onScrollerScroll(float f);
    }

    public class a implements Animator.AnimatorListener {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ float b;

        public a(boolean z, float f) {
            this.a = z;
            this.b = f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            HMScrollView.this.x = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HMScrollView.this.x = false;
            if (this.a || HMScrollView.this.A == null) {
                return;
            }
            HMLog.i(HMScrollView.C, "onAnimationEnd onExpandViewReelase " + this.b + " " + HMScrollView.this.y.toString(), new Object[0]);
            HMScrollView.this.A.onExpandViewRelease(this.b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HMScrollView.this.x = true;
        }
    }

    public HMScrollView(Context context) {
        this(context, null);
    }

    private int g(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private int h(Rect rect) {
        HMLog.i(C, "computeScrollDeltaToGetChildRectOnScreen....", new Object[0]);
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        int i2 = rect.bottom;
        if (i2 > i && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        }
        if (rect.top >= scrollY || i2 >= i) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    private View i(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3 && z4) {
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (z4) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private void j(int i) {
        HMLog.i(C, "fling...", new Object[0]);
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            this.b.fling(getScrollX(), getScrollY(), 0, i / 2, 0, 0, 0, Math.max(0, getChildAt(0).getHeight() - height), 0, height / 2);
            postInvalidateOnAnimation();
        }
    }

    private boolean k(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    private void l() {
        View childAt = getChildAt(0);
        this.d = childAt;
        childAt.setPadding(0, 0, 0, 0);
    }

    private void m() {
        this.b = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.c);
        this.j = viewConfiguration.getScaledTouchSlop();
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
        setOnTouchListener(this);
        post(new Runnable() { // from class: le3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        scrollTo(0, this.d.getPaddingTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(boolean z, ValueAnimator valueAnimator) {
        HMLog.i(C, "onAnimationUpdate " + valueAnimator.getAnimatedValue(), new Object[0]);
        u(((Float) valueAnimator.getAnimatedValue()).floatValue(), z);
    }

    private void p() {
        if (this.A != null) {
            float scrollY = getScrollY() - this.d.getPaddingTop();
            if (this.p != scrollY) {
                this.p = scrollY;
                this.A.onScrollerScroll(scrollY);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.m) {
            int i = action == 0 ? 1 : 0;
            this.e = motionEvent.getY(i);
            this.m = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.h;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean r(Rect rect, boolean z) {
        int iH = h(rect);
        boolean z2 = iH != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iH);
            } else {
                t(0, iH);
            }
        }
        return z2;
    }

    private void s() {
        if (this.i) {
            return;
        }
        this.i = true;
        requestLayout();
    }

    private void t(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250) {
            int iMax = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            this.b.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, iMax)) - scrollY);
            invalidate();
        } else {
            if (!this.b.isFinished()) {
                this.b.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.a = AnimationUtils.currentAnimationTimeMillis();
    }

    private void u(float f, boolean z) {
        String str = C;
        HMLog.i(str, "zoom " + f, new Object[0]);
        if (this.n == null) {
            return;
        }
        if ((this.w || !z) && f >= 0.0f) {
            if (f == 0.0f && this.v == 1.0f) {
                return;
            }
            HMLog.i(str, "mHeadViewRawHeight " + this.o, new Object[0]);
            int i = this.o;
            float f2 = (((float) i) + f) / ((float) i);
            HMLog.i(str, "ratio " + f2, new Object[0]);
            if (f2 > 1.6f && this.v == 1.6f) {
                this.q = this.e - (this.o * 0.6f);
                return;
            }
            if (f2 > 1.6f) {
                this.v = 1.6f;
                f = this.o * (1.6f - 1.0f);
                this.q = this.e - f;
            } else {
                this.v = f2;
            }
            OnHMScrollViewStateChanged onHMScrollViewStateChanged = this.A;
            if (onHMScrollViewStateChanged != null) {
                onHMScrollViewStateChanged.onExpandViewExpand((int) f);
            }
            this.n.zoom(this.v, (int) (this.o + f));
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
        l();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.b.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.b.getCurrX();
            int currY = this.b.getCurrY();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                int iG = g(currX, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
                int iG2 = g(currY, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
                if (iG != scrollX || iG2 != scrollY) {
                    setScrollX(iG);
                    setScrollY(iG2);
                    onScrollChanged(iG, iG2, scrollX, scrollY);
                }
            }
            awakenScrollBars();
            postInvalidate();
        }
        p();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return getChildCount() == 0 ? (getHeight() - getPaddingBottom()) - getPaddingTop() : getChildAt(0).getBottom();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getScaleFirstRatio() {
        return 1.35f;
    }

    public float getScaleFirstRatioHeight() {
        return this.o * 0.35000002f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (getScrollY() < verticalFadingEdgeLength) {
            return getScrollY() / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean isManual() {
        return this.z;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(i, View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 2 && this.g) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            float y = motionEvent.getY();
            float x = motionEvent.getX();
            if (k((int) motionEvent.getX(), (int) y)) {
                this.e = y;
                this.f = x;
                this.m = motionEvent.getPointerId(0);
                if (!this.b.isOverScrolled() || this.b.isFinished()) {
                    this.g = !this.b.isFinished();
                } else {
                    this.g = false;
                    this.b.abortAnimation();
                }
            } else {
                this.g = false;
            }
        } else if (i == 1) {
            this.g = false;
            this.m = -1;
        } else if (i == 2) {
            int i2 = this.m;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float x2 = motionEvent.getX(iFindPointerIndex);
                int iAbs = (int) Math.abs(y2 - this.e);
                int iAbs2 = (int) Math.abs(x2 - this.f);
                if (iAbs > this.j && iAbs > iAbs2) {
                    this.g = true;
                    this.e = y2;
                    this.f = x2;
                }
            }
        } else if (i == 3) {
            this.g = false;
            this.m = -1;
        } else if (i == 6) {
            q(motionEvent);
        }
        return this.g;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.i && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        return viewFindNextFocus != null && viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.b.forceFinished(true);
        this.z = true;
        if (motionEvent.getAction() != 1) {
            motionEvent.getAction();
            return false;
        }
        if (this.n != null && this.A != null) {
            this.r = false;
            this.s = true;
            HMLog.i(C, "mCurrentScaleRatio... " + this.v, new Object[0]);
            if (this.B) {
                float f = this.v;
                if (f >= 1.6f || f >= 1.35f) {
                    replyViewToRatio(1.35f, true);
                    this.A.onExpandViewRelease(1.35f);
                } else if (f > 1.0f) {
                    replyViewToRatio(1.0f, true);
                    this.A.onExpandViewRelease(1.0f);
                } else {
                    this.s = false;
                }
            } else {
                replyViewToRatio(1.0f, true);
                this.A.onExpandViewRelease(1.0f);
            }
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.x) {
            HMLog.i(C, "正在replying anim 中， 不接受touch事件...", new Object[0]);
            return false;
        }
        if (this.h == null) {
            this.h = VelocityTracker.obtain();
        }
        this.h.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float y = motionEvent.getY();
            boolean zK = k((int) motionEvent.getX(), (int) y);
            this.g = zK;
            if (!zK) {
                return false;
            }
            if (!this.b.isFinished()) {
                this.b.abortAnimation();
            }
            this.e = y;
            this.m = motionEvent.getPointerId(0);
            float f = this.v;
            if (f > 1.0f) {
                this.r = true;
                this.q = this.e - ((f - 1.0f) * this.o);
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 6) {
                        q(motionEvent);
                    }
                } else if (this.g && getChildCount() > 0) {
                    this.m = -1;
                    this.g = false;
                    VelocityTracker velocityTracker = this.h;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.h = null;
                    }
                }
            } else if (this.g) {
                OnHMScrollViewStateChanged onHMScrollViewStateChanged = this.A;
                if (onHMScrollViewStateChanged != null && this.s) {
                    onHMScrollViewStateChanged.onExpandViewExpandStart();
                    this.s = false;
                }
                int iFindPointerIndex = motionEvent.findPointerIndex(this.m);
                if (iFindPointerIndex == -1) {
                    HMLog.w(C, "Invalid pointerId=" + this.m + " in onTouchEvent", new Object[0]);
                } else {
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    int i = (int) (this.e - y2);
                    this.e = y2;
                    if (!this.r) {
                        this.q = y2;
                    }
                    int paddingTop = this.d.getPaddingTop() - getScrollY();
                    String str = C;
                    HMLog.i(str, "deltaY " + i, new Object[0]);
                    HMLog.i(str, "cal " + paddingTop, new Object[0]);
                    if (i > 0) {
                        float f2 = y2 - this.q;
                        if (paddingTop != 0) {
                            if (i < paddingTop) {
                                i = paddingTop;
                            }
                            scrollBy(0, i);
                        } else if (f2 < 0.0f) {
                            u(0.0f, true);
                            this.r = true;
                            scrollBy(0, -((int) f2));
                        } else {
                            u(f2, true);
                            this.r = true;
                        }
                    } else {
                        if (i < paddingTop) {
                            i = paddingTop;
                        }
                        scrollBy(0, i);
                        if (paddingTop == 0) {
                            u(y2 - this.q, true);
                            this.r = true;
                        }
                    }
                }
            }
        } else if (this.g) {
            VelocityTracker velocityTracker2 = this.h;
            velocityTracker2.computeCurrentVelocity(2000, this.l);
            int yVelocity = (int) velocityTracker2.getYVelocity(this.m);
            if (getChildCount() > 0 && Math.abs(yVelocity) > this.k) {
                j(-yVelocity);
            }
            this.m = -1;
            this.g = false;
            VelocityTracker velocityTracker3 = this.h;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.h = null;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        HMLog.i(C, "overScrollBy deltaY " + i2 + " scrollY " + i4 + " scrollRangeY " + i6 + " maxOverScrollY " + i8 + " isTouchEvent " + z, new Object[0]);
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public void replyViewToRatio(float f, final boolean z) {
        String str = C;
        HMLog.i(str, "from currentRatio " + this.v + " replyViewToRatio " + f, new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("enableExpand ");
        sb.append(this.w);
        HMLog.i(str, sb.toString(), new Object[0]);
        if (!this.w || this.n == null || Float.compare(this.v, f) == 0.0f) {
            return;
        }
        this.z = z;
        int i = this.o;
        float f2 = i * (this.v - 1.0f);
        float f3 = i * (f - 1.0f);
        HMLog.i(str, "currentDistance " + f2 + " destDistance " + f3, new Object[0]);
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.y.cancel();
        }
        ValueAnimator duration = ObjectAnimator.ofFloat(f2, f3).setDuration(200L);
        this.y = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ke3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.a.o(z, valueAnimator2);
            }
        });
        this.y.addListener(new a(z, f));
        this.y.start();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return r(rect, z);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iG = g(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iG2 = g(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iG == getScrollX() && iG2 == getScrollY()) {
                return;
            }
            super.scrollTo(iG, iG2);
        }
    }

    public void setDividerScroll(boolean z) {
        this.B = z;
    }

    public void setEnableExpand(boolean z) {
        this.w = z;
    }

    public void setHeadView(HMExpandHeadView hMExpandHeadView) {
        this.n = hMExpandHeadView;
    }

    public void setHeadViewRawHeight(int i) {
        this.o = i;
    }

    public void setOnHMScrollViewStateChanged(OnHMScrollViewStateChanged onHMScrollViewStateChanged) {
        this.A = onHMScrollViewStateChanged;
    }

    public final void smoothScrollTo(int i, int i2) {
        t(i - getScrollX(), i2 - getScrollY());
    }

    public final void smoothScrollToBottom() {
        smoothScrollTo(0, (this.d.getHeight() - this.d.getPaddingTop()) - getHeight());
    }

    public final void smoothScrollToTop() {
        smoothScrollTo(0, this.d.getPaddingTop());
    }

    public HMScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HMScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        this.m = -1;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = false;
        this.s = true;
        this.t = 1.35f;
        this.u = 1.6f;
        this.v = 1.0f;
        this.w = true;
        this.x = false;
        this.z = false;
        this.B = false;
        this.c = context;
        this.o = Utils.dip2px(context, 246.0f);
        m();
        s();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            l();
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            l();
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
