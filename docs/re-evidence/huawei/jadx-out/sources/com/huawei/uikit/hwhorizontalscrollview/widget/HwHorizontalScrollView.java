package com.huawei.uikit.hwhorizontalscrollview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.huawei.uikit.hwhorizontalscrollview.R;
import com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector;
import defpackage.xea;
import defpackage.xeh;
import defpackage.xfs;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class HwHorizontalScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OverScroller f29504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwGenericEventDetector f29505c;
    private xea d;

    class c implements HwGenericEventDetector.OnScrollListener {
        c() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector.OnScrollListener
        public boolean onScrollBy(float f, float f2, MotionEvent motionEvent) {
            return HwHorizontalScrollView.this.a(f, f2);
        }
    }

    public HwHorizontalScrollView(Context context) {
        this(context, null);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            Log.w("HwHorizontalScrollView", "Attribute set is null");
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwHorizontalScrollView, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.HwHorizontalScrollView_hwSensitivityMode, 1);
        typedArrayObtainStyledAttributes.recycle();
        HwGenericEventDetector hwGenericEventDetectorD = d();
        this.f29505c = hwGenericEventDetectorD;
        if (hwGenericEventDetectorD != null) {
            hwGenericEventDetectorD.d(i2);
            this.f29505c.c(this, a());
        }
    }

    private boolean g() {
        return getScrollRange() <= getScrollX();
    }

    private int getScrollRange() {
        int width;
        if (getChildCount() <= 0 || (width = getChildAt(0).getWidth() - ((getWidth() - getPaddingEnd()) - getPaddingStart())) < 0) {
            return 0;
        }
        return width;
    }

    private boolean h() {
        return getScrollX() < 0;
    }

    private void i() {
        xea xeaVar = this.d;
        if (xeaVar != null && !xeaVar.i()) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.d.c();
        }
        if (this.f29504b.isFinished()) {
            return;
        }
        this.f29504b.abortAnimation();
    }

    private void setValueFromPlume(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            return;
        }
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, this, "listScrollEnabled", Boolean.TRUE});
        if (objC instanceof Boolean) {
            setExtendScrollEnabled(((Boolean) objC).booleanValue());
        }
    }

    protected HwGenericEventDetector.OnScrollListener a() {
        return new c();
    }

    public boolean b() {
        return this.d.b(getScrollX(), 0, getScrollRange());
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void computeScroll() {
        xea xeaVar = this.d;
        if (xeaVar != null && xeaVar.b()) {
            e();
        } else if (this.f29504b.computeScrollOffset()) {
            c();
        } else {
            super.computeScroll();
        }
    }

    protected HwGenericEventDetector d() {
        return new HwGenericEventDetector(getContext());
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.f29503a) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        HwGenericEventDetector hwGenericEventDetector = this.f29505c;
        if (hwGenericEventDetector == null || !hwGenericEventDetector.a(motionEvent)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        if (getChildCount() <= 0 || !this.d.i()) {
            return;
        }
        int width = (getWidth() - getPaddingEnd()) - getPaddingStart();
        this.f29504b.fling(getScrollX(), 0, i, 0, -width, getScrollRange() + width, 0, 0, 0, 0);
        postInvalidateOnAnimation();
    }

    public OverScroller getOverScroller() {
        return this.f29504b;
    }

    public float getSensitivity() {
        HwGenericEventDetector hwGenericEventDetector = this.f29505c;
        if (hwGenericEventDetector != null) {
            return hwGenericEventDetector.e();
        }
        return 1.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.f29503a) {
            return super.onGenericMotionEvent(motionEvent);
        }
        HwGenericEventDetector hwGenericEventDetector = this.f29505c;
        if (hwGenericEventDetector == null || !hwGenericEventDetector.c(motionEvent)) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        b(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int iE = ((h() || g()) && z) ? e(i, i3) : i;
        int width = getWidth();
        invalidate();
        return super.overScrollBy(iE, i2, i3, i4, i5, i6, width, i8, z);
    }

    public void setExtendScrollEnabled(boolean z) {
        this.f29503a = z;
    }

    public void setSensitivity(float f) {
        HwGenericEventDetector hwGenericEventDetector = this.f29505c;
        if (hwGenericEventDetector != null) {
            hwGenericEventDetector.d(f);
        }
    }

    public HwHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwHorizontalScrollViewStyle);
    }

    private void c(Context context, AttributeSet attributeSet, int i) {
        b(context, attributeSet, i);
        this.d = new xea();
        this.f29504b = new OverScroller(context);
        setValueFromPlume(context);
    }

    public HwHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(b(context, i), attributeSet, i);
        this.f29503a = true;
        c(super.getContext(), attributeSet, i);
    }

    private static Context b(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwHorizontalScrollView);
    }

    private void b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && b()) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        i();
    }

    private void e() {
        if (this.d == null) {
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int iA = this.d.a();
        if (scrollX != iA) {
            overScrollBy(iA - scrollX, 0, scrollX, scrollY, getScrollRange(), 0, getWidth(), 0, false);
            onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
        }
        if (awakenScrollBars()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void c() {
        xea xeaVar;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f29504b.getCurrX();
        int currY = this.f29504b.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            int scrollRange = getScrollRange();
            int overScrollMode = getOverScrollMode();
            boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
            overScrollBy(currX - scrollX, currY - scrollY, scrollX, scrollY, scrollRange, 0, getWidth(), 0, false);
            onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
            if (z && (xeaVar = this.d) != null) {
                if (currX < 0 && scrollX >= 0) {
                    xeaVar.c(-this.f29504b.getCurrVelocity(), -1, 0);
                    this.f29504b.abortAnimation();
                } else if (currX > scrollRange && scrollX <= scrollRange) {
                    xeaVar.c(this.f29504b.getCurrVelocity(), scrollRange + 1, scrollRange);
                    this.f29504b.abortAnimation();
                }
            }
        }
        if (awakenScrollBars()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private int e(int i, int i2) {
        if (g()) {
            i2 -= getScrollRange();
        }
        return this.d.c(getWidth(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(float f, float f2) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (Float.compare(f, 0.0f) != 0) {
            scrollTo(scrollX + ((int) f), scrollY);
            return true;
        }
        scrollTo(scrollX + ((int) f2), scrollY);
        return true;
    }
}
