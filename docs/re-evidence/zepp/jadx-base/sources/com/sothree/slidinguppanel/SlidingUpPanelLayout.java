package com.sothree.slidinguppanel;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class SlidingUpPanelLayout extends ViewGroup {
    private static final int J = 68;
    private static final float K = 1.0f;
    private static final int M = 4;
    private static final int N = -1728053248;
    private static final int O = 400;
    private static final boolean P = false;
    private static final boolean Q = true;
    private static final int S = 0;
    public static final String SLIDING_STATE = "sliding_state";
    private float A;
    private float B;
    private boolean C;
    private final List<PanelSlideListener> D;
    private View.OnClickListener E;
    private final ViewDragHelper F;
    private boolean G;
    private final Rect H;
    private int a;
    private int b;
    private final Paint c;
    private final Drawable d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private View k;
    private int l;
    private View m;
    private int n;
    private ScrollableViewHelper o;
    private View p;
    private View q;
    private PanelState r;
    private PanelState s;
    private float t;
    private int u;
    private float v;
    private boolean w;
    private boolean x;
    private float y;
    private float z;
    private static final String I = SlidingUpPanelLayout.class.getSimpleName();
    private static PanelState L = PanelState.COLLAPSED;
    private static final int[] R = {R.attr.gravity};

    public interface PanelSlideListener {
        void onPanelSlide(View view, float f);

        void onPanelStateChanged(View view, PanelState panelState, PanelState panelState2);
    }

    public enum PanelState {
        EXPANDED,
        COLLAPSED,
        ANCHORED,
        HIDDEN,
        DRAGGING
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener
        public void onPanelSlide(View view, float f) {
        }

        @Override // com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener
        public void onPanelStateChanged(View view, PanelState panelState, PanelState panelState2) {
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SlidingUpPanelLayout.this.isEnabled() && SlidingUpPanelLayout.this.isTouchEnabled()) {
                PanelState panelState = SlidingUpPanelLayout.this.r;
                PanelState panelState2 = PanelState.EXPANDED;
                if (panelState != panelState2) {
                    PanelState panelState3 = SlidingUpPanelLayout.this.r;
                    PanelState panelState4 = PanelState.ANCHORED;
                    if (panelState3 != panelState4) {
                        if (SlidingUpPanelLayout.this.v < 1.0f) {
                            SlidingUpPanelLayout.this.setPanelState(panelState4);
                            return;
                        } else {
                            SlidingUpPanelLayout.this.setPanelState(panelState2);
                            return;
                        }
                    }
                }
                SlidingUpPanelLayout.this.setPanelState(PanelState.COLLAPSED);
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PanelState.values().length];
            a = iArr;
            try {
                iArr[PanelState.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PanelState.ANCHORED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[PanelState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[PanelState.COLLAPSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c extends ViewDragHelper.Callback {
        private c() {
        }

        @Override // com.sothree.slidinguppanel.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            int iP = SlidingUpPanelLayout.this.p(0.0f);
            int iP2 = SlidingUpPanelLayout.this.p(1.0f);
            return SlidingUpPanelLayout.this.h ? Math.min(Math.max(i, iP2), iP) : Math.min(Math.max(i, iP), iP2);
        }

        @Override // com.sothree.slidinguppanel.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            return SlidingUpPanelLayout.this.u;
        }

        @Override // com.sothree.slidinguppanel.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            SlidingUpPanelLayout.this.w();
        }

        @Override // com.sothree.slidinguppanel.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (SlidingUpPanelLayout.this.F == null || SlidingUpPanelLayout.this.F.getViewDragState() != 0) {
                return;
            }
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            slidingUpPanelLayout.t = slidingUpPanelLayout.q(slidingUpPanelLayout.p.getTop());
            SlidingUpPanelLayout.this.o();
            if (SlidingUpPanelLayout.this.t == 1.0f) {
                SlidingUpPanelLayout.this.y();
                SlidingUpPanelLayout.this.setPanelStateInternal(PanelState.EXPANDED);
            } else if (SlidingUpPanelLayout.this.t == 0.0f) {
                SlidingUpPanelLayout.this.setPanelStateInternal(PanelState.COLLAPSED);
            } else if (SlidingUpPanelLayout.this.t < 0.0f) {
                SlidingUpPanelLayout.this.setPanelStateInternal(PanelState.HIDDEN);
                SlidingUpPanelLayout.this.p.setVisibility(4);
            } else {
                SlidingUpPanelLayout.this.y();
                SlidingUpPanelLayout.this.setPanelStateInternal(PanelState.ANCHORED);
            }
        }

        @Override // com.sothree.slidinguppanel.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingUpPanelLayout.this.v(i2);
            SlidingUpPanelLayout.this.invalidate();
        }

        @Override // com.sothree.slidinguppanel.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int iP;
            if (SlidingUpPanelLayout.this.h) {
                f2 = -f2;
            }
            if (f2 > 0.0f && SlidingUpPanelLayout.this.t <= SlidingUpPanelLayout.this.v) {
                SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
                iP = slidingUpPanelLayout.p(slidingUpPanelLayout.v);
            } else if (f2 > 0.0f && SlidingUpPanelLayout.this.t > SlidingUpPanelLayout.this.v) {
                iP = SlidingUpPanelLayout.this.p(1.0f);
            } else if (f2 < 0.0f && SlidingUpPanelLayout.this.t >= SlidingUpPanelLayout.this.v) {
                SlidingUpPanelLayout slidingUpPanelLayout2 = SlidingUpPanelLayout.this;
                iP = slidingUpPanelLayout2.p(slidingUpPanelLayout2.v);
            } else if (f2 < 0.0f && SlidingUpPanelLayout.this.t < SlidingUpPanelLayout.this.v) {
                iP = SlidingUpPanelLayout.this.p(0.0f);
            } else if (SlidingUpPanelLayout.this.t >= (SlidingUpPanelLayout.this.v + 1.0f) / 2.0f) {
                iP = SlidingUpPanelLayout.this.p(1.0f);
            } else if (SlidingUpPanelLayout.this.t >= SlidingUpPanelLayout.this.v / 2.0f) {
                SlidingUpPanelLayout slidingUpPanelLayout3 = SlidingUpPanelLayout.this;
                iP = slidingUpPanelLayout3.p(slidingUpPanelLayout3.v);
            } else {
                iP = SlidingUpPanelLayout.this.p(0.0f);
            }
            if (SlidingUpPanelLayout.this.F != null) {
                SlidingUpPanelLayout.this.F.settleCapturedViewAt(view.getLeft(), iP);
            }
            SlidingUpPanelLayout.this.invalidate();
        }

        @Override // com.sothree.slidinguppanel.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            return !SlidingUpPanelLayout.this.w && view == SlidingUpPanelLayout.this.p;
        }

        public /* synthetic */ c(SlidingUpPanelLayout slidingUpPanelLayout, a aVar) {
            this();
        }
    }

    public SlidingUpPanelLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void o() {
        if (this.g > 0) {
            ViewCompat.setTranslationY(this.q, getCurrentParallaxOffset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int p(float f) {
        View view = this.p;
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        int i = (int) (f * this.u);
        return this.h ? ((getMeasuredHeight() - getPaddingBottom()) - this.e) - i : (getPaddingTop() - measuredHeight) + this.e + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float q(int i) {
        int iP = p(0.0f);
        return (this.h ? iP - i : i - iP) / this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPanelStateInternal(PanelState panelState) {
        PanelState panelState2 = this.r;
        if (panelState2 == panelState) {
            return;
        }
        this.r = panelState;
        s(this, panelState2, panelState);
    }

    private static boolean t(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean u(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i3 = iArr2[0] + i;
        int i4 = iArr2[1] + i2;
        return i3 >= iArr[0] && i3 < iArr[0] + view.getWidth() && i4 >= iArr[1] && i4 < iArr[1] + view.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(int i) {
        PanelState panelState = this.r;
        PanelState panelState2 = PanelState.DRAGGING;
        if (panelState != panelState2) {
            this.s = panelState;
        }
        setPanelStateInternal(panelState2);
        this.t = q(i);
        o();
        r(this.p);
        LayoutParams layoutParams = (LayoutParams) this.q.getLayoutParams();
        int height = ((getHeight() - getPaddingBottom()) - getPaddingTop()) - this.e;
        if (this.t > 0.0f || this.i) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1 || this.i) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -1;
            this.q.requestLayout();
            return;
        }
        int paddingBottom = this.h ? i - getPaddingBottom() : ((getHeight() - getPaddingBottom()) - this.p.getMeasuredHeight()) - i;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = paddingBottom;
        if (paddingBottom == height) {
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -1;
        }
        this.q.requestLayout();
    }

    public void addPanelSlideListener(PanelSlideListener panelSlideListener) {
        synchronized (this.D) {
            this.D.add(panelSlideListener);
        }
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && ViewCompat.canScrollHorizontally(view, -i);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        ViewDragHelper viewDragHelper = this.F;
        if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
            return;
        }
        if (isEnabled()) {
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            this.F.abort();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (!isEnabled() || !isTouchEnabled() || (this.w && actionMasked != 0)) {
            this.F.abort();
            return super.dispatchTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.C = false;
            this.y = x;
            this.z = y;
        } else if (actionMasked == 2) {
            float f = x - this.y;
            float f2 = y - this.z;
            this.y = x;
            this.z = y;
            if (Math.abs(f) > Math.abs(f2)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (!u(this.m, (int) this.A, (int) this.B)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            boolean z = this.h;
            if ((z ? 1 : -1) * f2 > 0.0f) {
                if (this.o.getScrollableViewScrollPosition(this.m, z) > 0) {
                    this.C = true;
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (this.C) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    motionEvent.setAction(0);
                }
                this.C = false;
                return onTouchEvent(motionEvent);
            }
            if (f2 * (z ? 1 : -1) < 0.0f) {
                if (this.t < 1.0f) {
                    this.C = false;
                    return onTouchEvent(motionEvent);
                }
                if (!this.C && this.F.isDragging()) {
                    this.F.cancel();
                    motionEvent.setAction(0);
                }
                this.C = true;
                return super.dispatchTouchEvent(motionEvent);
            }
        } else if (actionMasked == 1 && this.C) {
            this.F.s(0);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        View view;
        int bottom;
        int bottom2;
        super.draw(canvas);
        if (this.d == null || (view = this.p) == null) {
            return;
        }
        int right = view.getRight();
        if (this.h) {
            bottom = this.p.getTop() - this.f;
            bottom2 = this.p.getTop();
        } else {
            bottom = this.p.getBottom();
            bottom2 = this.p.getBottom() + this.f;
        }
        this.d.setBounds(this.p.getLeft(), bottom, right, bottom2);
        this.d.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        int iSave = canvas.save(2);
        View view2 = this.p;
        if (view2 == null || view2 == view) {
            zDrawChild = super.drawChild(canvas, view, j);
        } else {
            canvas.getClipBounds(this.H);
            if (!this.i) {
                if (this.h) {
                    Rect rect = this.H;
                    rect.bottom = Math.min(rect.bottom, this.p.getTop());
                } else {
                    Rect rect2 = this.H;
                    rect2.top = Math.max(rect2.top, this.p.getBottom());
                }
            }
            if (this.j) {
                canvas.clipRect(this.H);
            }
            zDrawChild = super.drawChild(canvas, view, j);
            int i = this.b;
            if (i != 0) {
                float f = this.t;
                if (f > 0.0f) {
                    this.c.setColor((i & 16777215) | (((int) ((((-16777216) & i) >>> 24) * f)) << 24));
                    canvas.drawRect(this.H, this.c);
                }
            }
        }
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getAnchorPoint() {
        return this.v;
    }

    public int getCoveredFadeColor() {
        return this.b;
    }

    public int getCurrentParallaxOffset() {
        int iMax = (int) (this.g * Math.max(this.t, 0.0f));
        return this.h ? -iMax : iMax;
    }

    public int getMinFlingVelocity() {
        return this.a;
    }

    public int getPanelHeight() {
        return this.e;
    }

    public PanelState getPanelState() {
        return this.r;
    }

    public int getShadowHeight() {
        return this.f;
    }

    public boolean isClipPanel() {
        return this.j;
    }

    public boolean isOverlayed() {
        return this.i;
    }

    public boolean isTouchEnabled() {
        return (!this.x || this.p == null || this.r == PanelState.HIDDEN) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.l;
        if (i != -1) {
            setDragView(findViewById(i));
        }
        int i2 = this.n;
        if (i2 != -1) {
            setScrollableView(findViewById(i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        if (this.C || !isTouchEnabled()) {
            this.F.abort();
            return false;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float fAbs = Math.abs(x - this.A);
        float fAbs2 = Math.abs(y - this.B);
        int touchSlop = this.F.getTouchSlop();
        if (actionMasked == 0) {
            this.w = false;
            this.A = x;
            this.B = y;
            if (!u(this.k, (int) x, (int) y)) {
                this.F.cancel();
                this.w = true;
                return false;
            }
        } else if (actionMasked == 1) {
            if (this.F.isDragging()) {
                this.F.processTouchEvent(motionEvent);
                return true;
            }
            f = touchSlop;
            if (fAbs2 <= f && fAbs <= f && this.t > 0.0f && !u(this.p, (int) this.A, (int) this.B) && this.E != null) {
                playSoundEffect(0);
                this.E.onClick(this);
                return true;
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.F.isDragging()) {
                    this.F.processTouchEvent(motionEvent);
                    return true;
                }
                f = touchSlop;
                if (fAbs2 <= f) {
                    playSoundEffect(0);
                    this.E.onClick(this);
                    return true;
                }
            }
        } else if (fAbs2 > touchSlop && fAbs > fAbs2) {
            this.F.cancel();
            this.w = true;
            return false;
        }
        return this.F.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.G) {
            int i5 = b.a[this.r.ordinal()];
            if (i5 == 1) {
                this.t = 1.0f;
            } else if (i5 == 2) {
                this.t = this.v;
            } else if (i5 != 3) {
                this.t = 0.0f;
            } else {
                this.t = q(p(0.0f) + (this.h ? this.e : -this.e));
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || (i6 != 0 && !this.G)) {
                int measuredHeight = childAt.getMeasuredHeight();
                int iP = childAt == this.p ? p(this.t) : paddingTop;
                if (!this.h && childAt == this.q && !this.i) {
                    iP = p(this.t) + this.p.getMeasuredHeight();
                }
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                childAt.layout(i7, iP, childAt.getMeasuredWidth() + i7, measuredHeight + iP);
            }
        }
        if (this.G) {
            y();
        }
        o();
        this.G = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int iMakeMeasureSpec;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        if (mode2 != 1073741824 && mode2 != Integer.MIN_VALUE) {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
        int childCount = getChildCount();
        if (childCount != 2) {
            throw new IllegalStateException("Sliding up panel layout must have exactly 2 children!");
        }
        this.q = getChildAt(0);
        View childAt = getChildAt(1);
        this.p = childAt;
        if (this.k == null) {
            setDragView(childAt);
        }
        if (this.p.getVisibility() != 0) {
            this.r = PanelState.HIDDEN;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (childAt2.getVisibility() != 8 || i5 != 0) {
                if (childAt2 == this.q) {
                    i3 = (this.i || this.r == PanelState.HIDDEN) ? paddingTop : paddingTop - this.e;
                    i4 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                } else {
                    i3 = childAt2 == this.p ? paddingTop - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : paddingTop;
                    i4 = paddingLeft;
                }
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                int iMakeMeasureSpec2 = i6 == -2 ? View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE) : i6 == -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                if (i7 == -2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                } else {
                    float f = layoutParams.weight;
                    if (f > 0.0f && f < 1.0f) {
                        i3 = (int) (i3 * f);
                    } else if (i7 != -1) {
                        i3 = i7;
                    }
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                }
                childAt2.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
                View view = this.p;
                if (childAt2 == view) {
                    this.u = view.getMeasuredHeight() - this.e;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            PanelState panelState = (PanelState) bundle.getSerializable(SLIDING_STATE);
            this.r = panelState;
            if (panelState == null) {
                panelState = L;
            }
            this.r = panelState;
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        PanelState panelState = this.r;
        if (panelState == PanelState.DRAGGING) {
            panelState = this.s;
        }
        bundle.putSerializable(SLIDING_STATE, panelState);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            this.G = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !isTouchEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.F.processTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void r(View view) {
        synchronized (this.D) {
            Iterator<PanelSlideListener> it2 = this.D.iterator();
            while (it2.hasNext()) {
                it2.next().onPanelSlide(view, this.t);
            }
        }
    }

    public void removePanelSlideListener(PanelSlideListener panelSlideListener) {
        synchronized (this.D) {
            this.D.remove(panelSlideListener);
        }
    }

    public void s(View view, PanelState panelState, PanelState panelState2) {
        synchronized (this.D) {
            Iterator<PanelSlideListener> it2 = this.D.iterator();
            while (it2.hasNext()) {
                it2.next().onPanelStateChanged(view, panelState, panelState2);
            }
        }
        sendAccessibilityEvent(32);
    }

    public void setAnchorPoint(float f) {
        if (f <= 0.0f || f > 1.0f) {
            return;
        }
        this.v = f;
        this.G = true;
        requestLayout();
    }

    public void setClipPanel(boolean z) {
        this.j = z;
    }

    public void setCoveredFadeColor(int i) {
        this.b = i;
        requestLayout();
    }

    public void setDragView(View view) {
        View view2 = this.k;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        this.k = view;
        if (view != null) {
            view.setClickable(true);
            this.k.setFocusable(false);
            this.k.setFocusableInTouchMode(false);
            this.k.setOnClickListener(new a());
        }
    }

    public void setFadeOnClickListener(View.OnClickListener onClickListener) {
        this.E = onClickListener;
    }

    public void setGravity(int i) {
        if (i != 48 && i != 80) {
            throw new IllegalArgumentException("gravity must be set to either top or bottom");
        }
        this.h = i == 80;
        if (this.G) {
            return;
        }
        requestLayout();
    }

    public void setMinFlingVelocity(int i) {
        this.a = i;
    }

    public void setOverlayed(boolean z) {
        this.i = z;
    }

    public void setPanelHeight(int i) {
        if (getPanelHeight() == i) {
            return;
        }
        this.e = i;
        if (!this.G) {
            requestLayout();
        }
        if (getPanelState() == PanelState.COLLAPSED) {
            smoothToBottom();
            invalidate();
        }
    }

    public void setPanelState(PanelState panelState) {
        PanelState panelState2;
        PanelState panelState3;
        if (this.F.getViewDragState() == 2) {
            Log.d(I, "View is settling. Aborting animation.");
            this.F.abort();
        }
        if (panelState == null || panelState == (panelState2 = PanelState.DRAGGING)) {
            throw new IllegalArgumentException("Panel state cannot be null or DRAGGING.");
        }
        if (isEnabled()) {
            boolean z = this.G;
            if ((!z && this.p == null) || panelState == (panelState3 = this.r) || panelState3 == panelState2) {
                return;
            }
            if (z) {
                setPanelStateInternal(panelState);
                return;
            }
            if (panelState3 == PanelState.HIDDEN) {
                this.p.setVisibility(0);
                requestLayout();
            }
            int i = b.a[panelState.ordinal()];
            if (i == 1) {
                x(1.0f, 0);
                return;
            }
            if (i == 2) {
                x(this.v, 0);
            } else if (i == 3) {
                x(q(p(0.0f) + (this.h ? this.e : -this.e)), 0);
            } else {
                if (i != 4) {
                    return;
                }
                x(0.0f, 0);
            }
        }
    }

    public void setParallaxOffset(int i) {
        this.g = i;
        if (this.G) {
            return;
        }
        requestLayout();
    }

    public void setScrollableView(View view) {
        this.m = view;
    }

    public void setScrollableViewHelper(ScrollableViewHelper scrollableViewHelper) {
        this.o = scrollableViewHelper;
    }

    public void setShadowHeight(int i) {
        this.f = i;
        if (this.G) {
            return;
        }
        invalidate();
    }

    public void setTouchEnabled(boolean z) {
        this.x = z;
    }

    public void smoothToBottom() {
        x(0.0f, 0);
    }

    public void w() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public boolean x(float f, int i) {
        if (isEnabled() && this.p != null) {
            int iP = p(f);
            ViewDragHelper viewDragHelper = this.F;
            View view = this.p;
            if (viewDragHelper.smoothSlideViewTo(view, view.getLeft(), iP)) {
                w();
                ViewCompat.postInvalidateOnAnimation(this);
                return true;
            }
        }
        return false;
    }

    public void y() {
        int left;
        int right;
        int top;
        int bottom;
        if (getChildCount() == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        View view = this.p;
        int i = 0;
        if (view == null || !t(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = this.p.getLeft();
            right = this.p.getRight();
            top = this.p.getTop();
            bottom = this.p.getBottom();
        }
        View childAt = getChildAt(0);
        int iMax = Math.max(paddingLeft, childAt.getLeft());
        int iMax2 = Math.max(paddingTop, childAt.getTop());
        int iMin = Math.min(width, childAt.getRight());
        int iMin2 = Math.min(height, childAt.getBottom());
        if (iMax >= left && iMax2 >= top && iMin <= right && iMin2 <= bottom) {
            i = 4;
        }
        childAt.setVisibility(i);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] a = {R.attr.layout_weight};
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.weight = 0.0f;
            this.weight = f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
            if (typedArrayObtainStyledAttributes != null) {
                this.weight = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00e2  */
    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet, int i) {
        Interpolator interpolatorLoadInterpolator;
        super(context, attributeSet, i);
        this.a = 400;
        this.b = -1728053248;
        this.c = new Paint();
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.i = false;
        this.j = true;
        this.l = -1;
        this.o = new ScrollableViewHelper();
        PanelState panelState = L;
        this.r = panelState;
        this.s = panelState;
        this.v = 1.0f;
        this.C = false;
        this.D = new CopyOnWriteArrayList();
        this.G = true;
        this.H = new Rect();
        a aVar = null;
        if (isInEditMode()) {
            this.d = null;
            this.F = null;
            return;
        }
        if (attributeSet == null) {
            interpolatorLoadInterpolator = null;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R);
            if (typedArrayObtainStyledAttributes != null) {
                setGravity(typedArrayObtainStyledAttributes.getInt(0, 0));
                typedArrayObtainStyledAttributes.recycle();
            }
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout);
            if (typedArrayObtainStyledAttributes2 != null) {
                this.e = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoPanelHeight, -1);
                this.f = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoShadowHeight, -1);
                this.g = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoParallaxOffset, -1);
                this.a = typedArrayObtainStyledAttributes2.getInt(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoFlingVelocity, 400);
                this.b = typedArrayObtainStyledAttributes2.getColor(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoFadeColor, -1728053248);
                this.l = typedArrayObtainStyledAttributes2.getResourceId(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoDragView, -1);
                this.n = typedArrayObtainStyledAttributes2.getResourceId(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoScrollableView, -1);
                this.i = typedArrayObtainStyledAttributes2.getBoolean(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoOverlay, false);
                this.j = typedArrayObtainStyledAttributes2.getBoolean(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoClipPanel, true);
                this.v = typedArrayObtainStyledAttributes2.getFloat(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoAnchorPoint, 1.0f);
                this.r = PanelState.values()[typedArrayObtainStyledAttributes2.getInt(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoInitialState, L.ordinal())];
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(com.sothree.slidinguppanel.library.R.styleable.SlidingUpPanelLayout_umanoScrollInterpolator, -1);
                interpolatorLoadInterpolator = resourceId != -1 ? AnimationUtils.loadInterpolator(context, resourceId) : null;
                typedArrayObtainStyledAttributes2.recycle();
            } else {
                interpolatorLoadInterpolator = null;
            }
        }
        float f = context.getResources().getDisplayMetrics().density;
        if (this.e == -1) {
            this.e = (int) ((68.0f * f) + 0.5f);
        }
        if (this.f == -1) {
            this.f = (int) ((4.0f * f) + 0.5f);
        }
        if (this.g == -1) {
            this.g = (int) (0.0f * f);
        }
        if (this.f > 0) {
            if (this.h) {
                this.d = getResources().getDrawable(com.sothree.slidinguppanel.library.R.drawable.above_shadow);
            } else {
                this.d = getResources().getDrawable(com.sothree.slidinguppanel.library.R.drawable.below_shadow);
            }
        } else {
            this.d = null;
        }
        setWillNotDraw(false);
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 0.5f, interpolatorLoadInterpolator, new c(this, aVar));
        this.F = viewDragHelperCreate;
        viewDragHelperCreate.setMinVelocity(this.a * f);
        this.x = true;
    }

    public void setDragView(int i) {
        this.l = i;
        setDragView(findViewById(i));
    }
}
