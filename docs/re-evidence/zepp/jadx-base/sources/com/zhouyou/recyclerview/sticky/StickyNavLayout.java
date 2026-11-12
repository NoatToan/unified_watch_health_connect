package com.zhouyou.recyclerview.sticky;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.zhouyou.recyclerviewsdk.R;

/* JADX INFO: loaded from: classes22.dex */
public class StickyNavLayout extends LinearLayout implements NestedScrollingParent {
    private static final String i = "StickyNavLayout";
    private int a;
    private View b;
    private View c;
    private ViewPager d;
    private int e;
    private OverScroller f;
    private VelocityTracker g;
    private ValueAnimator h;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator.getAnimatedValue() instanceof Integer) {
                StickyNavLayout.this.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    public StickyNavLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 3;
        setOrientation(1);
        this.f = new OverScroller(context);
    }

    private void a(float f, int i2, boolean z) {
        int scrollY = getScrollY();
        int height = this.b.getHeight();
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.h = valueAnimator2;
            valueAnimator2.addUpdateListener(new a());
        } else {
            valueAnimator.cancel();
        }
        this.h.setDuration(Math.min(i2, 600));
        if (f >= 0.0f) {
            this.h.setIntValues(scrollY, height);
            this.h.start();
        } else {
            if (z) {
                return;
            }
            this.h.setIntValues(scrollY, 0);
            this.h.start();
        }
    }

    private int b(float f) {
        int iAbs = f > 0.0f ? Math.abs(this.b.getHeight() - getScrollY()) : Math.abs(this.b.getHeight() - (this.b.getHeight() - getScrollY()));
        float fAbs = Math.abs(f);
        return fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / getHeight()) + 1.0f) * 150.0f);
    }

    private void c() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }

    private void d() {
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.g = null;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f.computeScrollOffset()) {
            scrollTo(0, this.f.getCurrY());
            invalidate();
        }
    }

    public void fling(int i2) {
        this.f.fling(0, getScrollY(), 0, i2, 0, 0, 0, this.e);
        invalidate();
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return 0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.id_stickynavlayout_topview);
        this.c = findViewById(R.id.id_stickynavlayout_indicator);
        View viewFindViewById = findViewById(R.id.id_stickynavlayout_viewpager);
        if (!(viewFindViewById instanceof ViewPager)) {
            throw new RuntimeException("id_stickynavlayout_viewpager show used by ViewPager !");
        }
        this.d = (ViewPager) viewFindViewById;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        getChildAt(0).measure(i2, View.MeasureSpec.makeMeasureSpec(0, 0));
        this.d.getLayoutParams().height = getMeasuredHeight() - this.c.getMeasuredHeight();
        setMeasuredDimension(getMeasuredWidth(), this.b.getMeasuredHeight() + this.c.getMeasuredHeight() + this.d.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if ((view instanceof RecyclerView) && f2 < 0.0f) {
            RecyclerView recyclerView = (RecyclerView) view;
            z = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0)) > this.a;
        }
        if (z) {
            a(f2, b(f2), z);
        } else {
            a(f2, b(0.0f), z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        boolean z = i3 > 0 && getScrollY() < this.e;
        boolean z2 = i3 < 0 && getScrollY() >= 0 && !ViewCompat.canScrollVertically(view, -1);
        if (z || z2) {
            scrollBy(0, i3);
            iArr[1] = i3;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.e = this.b.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        Log.e(i, "onStopNestedScroll");
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.e;
        if (i3 > i4) {
            i3 = i4;
        }
        if (i3 != getScrollY()) {
            super.scrollTo(i2, i3);
        }
    }
}
