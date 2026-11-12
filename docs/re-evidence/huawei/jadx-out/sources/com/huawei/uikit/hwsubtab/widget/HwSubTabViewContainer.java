package com.huawei.uikit.hwsubtab.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.uikit.hwhorizontalscrollview.widget.HwHorizontalScrollView;
import com.huawei.uikit.hwsubtab.R;
import defpackage.xda;
import defpackage.xed;
import defpackage.xft;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class HwSubTabViewContainer extends HwHorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29741c;
    private ValueAnimator d;
    private SlidingTabStrip e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private c k;
    private int l;
    private boolean m;
    private int n;

    public static class SlidingTabStrip extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Drawable f29744c;
        float d;
        int e;
        private int f;
        private final Paint g;
        private int h;
        private int i;
        private ValueAnimator j;
        private boolean k;
        private a n;

        class c extends AnimatorListenerAdapter {
            final /* synthetic */ int d;

            c(int i) {
                this.d = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                slidingTabStrip.e = this.d;
                slidingTabStrip.d = 0.0f;
            }
        }

        SlidingTabStrip(Context context) {
            super(context);
            this.e = -1;
            this.i = -1;
            this.f = -1;
            this.h = -1;
            this.k = true;
            setWillNotDraw(false);
            this.g = new Paint();
            this.f29744c = ContextCompat.getDrawable(context, R.drawable.hwsubtab_underline);
        }

        private void a() {
            int left;
            int right;
            if (this.n == null) {
                Log.e("HwSubTabViewContainer", "updateIndicatorPosition mSlidingTabStripClient is empty");
                return;
            }
            View childAt = getChildAt(this.e);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft() + this.n.d(childAt);
                right = childAt.getRight() - this.n.e(childAt);
                if (this.d > 0.0f && this.e < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.e + 1);
                    int left2 = childAt2.getLeft();
                    int iD = this.n.d(childAt2);
                    int right2 = childAt2.getRight();
                    int iE = this.n.e(childAt2);
                    float f = this.d;
                    float f2 = left2 + iD;
                    float f3 = 1.0f - f;
                    left = (int) ((f2 * f) + (left * f3));
                    right = (int) ((f * (right2 - iE)) + (f3 * right));
                }
            }
            c(left, right);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null && childAt.getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
            View childAt = getChildAt(this.e);
            if (hasFocus() || childAt == null) {
                super.addFocusables(arrayList, i, i2);
            } else if (!childAt.isFocusable()) {
                super.addFocusables(arrayList, i, i2);
            } else if (arrayList != null) {
                arrayList.add(childAt);
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        @Override // android.view.View
        public void draw(Canvas canvas) {
            int totalPaddingBottom;
            int i;
            super.draw(canvas);
            if (canvas == null) {
                Log.w("HwSubTabViewContainer", "Parameter canvas of draw should not be null.");
                return;
            }
            int i2 = this.e;
            if (i2 != -1) {
                View childAt = getChildAt(i2);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (textView.getLayout() != null) {
                        totalPaddingBottom = textView.getTotalPaddingBottom() - this.f29743b;
                    } else {
                        totalPaddingBottom = 0;
                    }
                } else {
                    totalPaddingBottom = 0;
                }
            } else {
                totalPaddingBottom = 0;
            }
            int i3 = this.f;
            if (i3 < 0 || (i = this.h) <= i3) {
                return;
            }
            this.f29744c.setBounds(0, 0, i - i3, this.f29742a);
            canvas.save();
            canvas.translate(this.f, (getHeight() - this.f29742a) - totalPaddingBottom);
            this.f29744c.draw(canvas);
            canvas.restore();
        }

        public int getSelectedIndicatorHeight() {
            return this.f29742a;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
                return;
            }
            this.j.cancel();
            e(this.e, Math.round((1.0f - this.j.getAnimatedFraction()) * this.j.getDuration()));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }

        void setSelectedIndicatorHeight(int i) {
            if (this.f29742a != i) {
                this.f29742a = i;
                b();
            }
        }

        void setSelectedIndicatorMargin(int i) {
            if (this.f29743b != i) {
                this.f29743b = i;
                b();
            }
        }

        public void setSlidingTabStripClient(a aVar) {
            this.n = aVar;
        }

        private void b() {
            if (!this.k) {
                postInvalidate();
            } else {
                postInvalidateOnAnimation();
            }
        }

        void c(int i, int i2) {
            if (i == this.f && i2 == this.h) {
                return;
            }
            this.f = i;
            this.h = i2;
            b();
        }

        public void setSelectedIndicatorColor(int i) {
            this.f29744c.setTint(i);
            this.g.setColor(i);
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i, float f) {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.j.cancel();
            }
            this.e = i;
            this.d = f;
            a();
        }

        void e(int i, int i2) {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.j.cancel();
                this.e = i;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                a();
                return;
            }
            if (this.n == null) {
                Log.e("HwSubTabViewContainer", "animateIndicatorToPosition mSlidingTabStripClient is empty");
                return;
            }
            int left = childAt.getLeft();
            int iD = this.n.d(childAt);
            int right = childAt.getRight();
            int iE = this.n.e(childAt);
            int left2 = childAt.getLeft();
            int iD2 = this.n.d(childAt);
            int right2 = childAt.getRight();
            int iE2 = this.n.e(childAt);
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.j = valueAnimator2;
            valueAnimator2.setInterpolator(new xda());
            this.j.setDuration(i2);
            this.j.setFloatValues(0.0f, 1.0f);
            final int i3 = left2 + iD2;
            final int i4 = left + iD;
            final int i5 = right2 - iE2;
            final int i6 = right - iE;
            this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xgd
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f52869b.d(i3, i4, i5, i6, valueAnimator3);
                }
            });
            this.j.addListener(new c(i));
            this.j.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.w("HwSubTabViewContainer", "Object animator in animateIndicatorToPosition should not be null.");
            } else {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                c(e(i, i2, animatedFraction), e(i3, i4, animatedFraction));
            }
        }

        int e(int i, int i2, float f) {
            return i + Math.round(f * (i2 - i));
        }
    }

    public class a {
        public a() {
        }

        public int d(View view) {
            return view.getPaddingLeft();
        }

        public int e(View view) {
            return view.getPaddingRight();
        }
    }

    public class c {
        public c() {
        }

        public void b(View view, boolean z) {
            if (z && HwSubTabViewContainer.this.m) {
                int i = HwSubTabViewContainer.this.f29739a - HwSubTabViewContainer.this.f29741c;
                view.setPadding(i, 0, i, 0);
            } else {
                int i2 = -HwSubTabViewContainer.this.f29741c;
                view.setPadding(i2, 0, i2, 0);
            }
        }

        public void d(View view) {
            view.setPadding(HwSubTabViewContainer.this.f29740b - HwSubTabViewContainer.this.f29741c, 0, HwSubTabViewContainer.this.f29739a - HwSubTabViewContainer.this.f29741c, 0);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.w("HwSubTabViewContainer", "Object animator in method ensureScrollAnimator should not be null.");
            } else {
                HwSubTabViewContainer.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        }
    }

    public HwSubTabViewContainer(Context context) {
        this(context, null);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        if (FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i) == null) {
            return false;
        }
        return super.arrowScroll(i);
    }

    protected void c() {
        this.k = new c();
    }

    public void e(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || this.e.c()) {
            setScrollPosition(i, 0.0f);
            return;
        }
        int scrollX = getScrollX();
        int iE = e(i, 0.0f);
        if (!this.h) {
            scrollTo(iE, 0);
            setScrollPosition(i, 0.0f);
            return;
        }
        if (scrollX != iE) {
            h();
            this.d.setIntValues(scrollX, iE);
            this.d.start();
        }
        this.e.e(i, 200);
    }

    public boolean e() {
        View childAt = getChildAt(0);
        ViewParent parent = getParent();
        if (childAt == null || !(parent instanceof ViewGroup)) {
            return false;
        }
        return getMeasuredWidth() < (childAt.getMeasuredWidth() + getPaddingStart()) + getPaddingEnd() || getMeasuredWidth() > ((ViewGroup) parent).getMeasuredWidth();
    }

    public int getFadingMargin() {
        return this.f29739a;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        int i = this.f;
        return (i == 0 || i == 1) ? 1.0f : 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        int i = this.f;
        return (i == 0 || i == 1) ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.j;
    }

    public int getStartOriginPadding() {
        return this.f29740b;
    }

    public int getStartScrollPadding() {
        return this.g;
    }

    public int getSubTabItemMargin() {
        return this.f29741c;
    }

    public SlidingTabStrip getTabStrip() {
        return this.e;
    }

    protected void i() {
        this.e.setSlidingTabStripClient(new a());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i) {
            xed.d(getParent());
        }
    }

    @Override // com.huawei.uikit.hwhorizontalscrollview.widget.HwHorizontalScrollView, android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getOverScroller() == null || (getOverScroller().isFinished() && !b())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (!isLaidOut() && f()) {
            int iMax = Math.max(0, childAt.getMeasuredWidth() - (((i3 - i) - getPaddingLeft()) - getPaddingRight()));
            if (getScrollX() != iMax || this.n == 0) {
                int i5 = this.n;
                if (i5 != -1) {
                    scrollTo(i5, getScrollY());
                } else {
                    scrollTo(iMax, getScrollY());
                }
            }
        }
        if (this.f == 1) {
            this.k.d(childAt);
            if (!e()) {
                setHorizontalFadingEdgeEnabled(false);
                return;
            } else {
                setHorizontalFadingEdgeEnabled(true);
                setFadingEdgeLength(this.f29739a);
                return;
            }
        }
        if (!e()) {
            setHorizontalFadingEdgeEnabled(false);
            this.k.b(childAt, false);
        } else {
            this.k.b(childAt, true);
            setHorizontalFadingEdgeEnabled(true);
            setFadingEdgeLength(this.f29739a);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        this.n = i;
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (f()) {
            scrollTo(getScrollX() - (i - i3), getScrollY());
        }
    }

    @Override // com.huawei.uikit.hwhorizontalscrollview.widget.HwHorizontalScrollView, android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (e()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAnimationEnabled(boolean z) {
        this.h = z;
        SlidingTabStrip slidingTabStrip = this.e;
        if (slidingTabStrip != null) {
            slidingTabStrip.k = z;
        }
    }

    protected void setAppearance(int i) {
        this.f = i;
    }

    public void setChildPaddingClient(c cVar) {
        this.k = cVar;
    }

    public void setFadingMargin(int i) {
        this.f29739a = i;
    }

    public void setItemPadding(int i, int i2) {
        this.f29740b = i;
        this.l = i2;
    }

    public void setMirrorScrollX(int i) {
        this.n = i;
    }

    public void setOverScreen(boolean z) {
        this.m = z;
    }

    public void setScrollPosition(int i, float f) {
        setScrollPosition(i, f, true);
    }

    public void setStartOriginPadding(int i) {
        this.f29740b = i;
    }

    public void setStartScrollPadding(int i) {
        this.g = i;
    }

    public void setSubTabFaddingEdgeColor(int i) {
        this.j = i;
    }

    void setSubTabItemMargin(int i) {
        this.f29741c = i;
        View childAt = getChildAt(0);
        if (this.f == 1) {
            int i2 = this.f29740b;
            int i3 = this.f29741c;
            childAt.setPadding(i2 - i3, 0, this.f29739a - i3, 0);
        } else if (e()) {
            int i4 = this.f29739a - this.f29741c;
            childAt.setPadding(i4, 0, i4, 0);
        }
    }

    public HwSubTabViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        this.h = true;
        this.g = 20;
        this.f = 0;
        this.n = -1;
        this.l = 0;
        this.m = false;
        c(context);
    }

    private void c(Context context) {
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(0);
        c();
        this.e = new SlidingTabStrip(context);
        i();
        super.addView(this.e, 0, new FrameLayout.LayoutParams(-2, -1));
        this.f29739a = getResources().getDimensionPixelSize(R.dimen.hwsubtab_fading_margin);
        this.f29740b = getResources().getDimensionPixelSize(R.dimen.hwsubtab_padding_start);
        if (xft.d(context) == 2) {
            this.i = true;
        }
    }

    private boolean f() {
        return getLayoutDirection() == 1;
    }

    public void setScrollPosition(int i, float f, boolean z) {
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.e.getChildCount()) {
            return;
        }
        if (z) {
            this.e.b(i, f);
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.d.cancel();
        }
        scrollTo(e(i, f), 0);
    }

    private void h() {
        if (this.d == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.d = valueAnimator;
            valueAnimator.setInterpolator(new xda());
            this.d.setDuration(200L);
            this.d.addUpdateListener(new d());
        }
    }

    private int e(int i, float f) {
        int i2;
        float f2;
        int left;
        int width;
        View childAt = this.e.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.e.getChildCount() ? this.e.getChildAt(i3) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        TextView textView2 = childAt2 instanceof TextView ? (TextView) childAt2 : null;
        int left2 = 0;
        int width2 = textView != null ? textView.getWidth() : 0;
        int width3 = textView2 != null ? textView2.getWidth() : 0;
        if (textView != null) {
            if (this.f == 1) {
                if (f()) {
                    int right = textView.getRight();
                    int iB = b(this.g);
                    int i4 = this.f29741c;
                    left = right + iB + i4 + i4;
                    width = getWidth();
                } else {
                    left = textView.getLeft() - b(this.g);
                    int i5 = this.f29741c;
                    width = i5 + i5;
                }
                left2 = left - width;
                int i6 = this.f29741c;
                f2 = width2 + i6 + i6;
            } else {
                left2 = (textView.getLeft() + (width2 / 2)) - (getWidth() / 2);
                int i7 = this.f29741c;
                f2 = ((width2 + width3) * 0.5f) + i7 + i7;
            }
            i2 = (int) (f2 * f);
        } else {
            i2 = 0;
        }
        return getLayoutDirection() == 0 ? left2 + i2 : left2 - i2;
    }

    public HwSubTabViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
        this.h = true;
        this.g = 20;
        this.f = 0;
        this.n = -1;
        this.l = 0;
        this.m = false;
        c(context);
    }

    int b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }
}
