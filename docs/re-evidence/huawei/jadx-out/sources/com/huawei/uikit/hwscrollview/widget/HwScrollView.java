package com.huawei.uikit.hwscrollview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.huawei.uikit.hwscrollview.R;
import com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector;
import defpackage.xea;
import defpackage.xfs;

/* JADX INFO: loaded from: classes20.dex */
public class HwScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwGenericEventDetector f29690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xea f29692c;
    private OverScroller d;
    private boolean e;
    private int f;
    private int g;
    private boolean j;

    class c implements HwGenericEventDetector.OnScrollListener {
        c() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector.OnScrollListener
        public boolean onScrollBy(float f, float f2, MotionEvent motionEvent) {
            if (Float.compare(f2, 0.0f) == 0) {
                return false;
            }
            HwScrollView.this.d(-f2);
            return true;
        }
    }

    public HwScrollView(Context context) {
        this(context, null);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            Log.w("HwScrollView", "Attribute set is null");
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwScrollView, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.HwScrollView_hwSensitivityMode, 1);
        typedArrayObtainStyledAttributes.recycle();
        HwGenericEventDetector hwGenericEventDetectorB = b();
        this.f29690a = hwGenericEventDetectorB;
        if (hwGenericEventDetectorB != null) {
            hwGenericEventDetectorB.d(i2);
            this.f29690a.c(this, h());
        }
    }

    private boolean c() {
        return getScrollY() >= getScrollRange();
    }

    private boolean d() {
        return getScrollY() < 0;
    }

    private void g() {
        xea xeaVar = this.f29692c;
        if (xeaVar != null && !xeaVar.i()) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.f29692c.c();
        }
        if (this.d.isFinished()) {
            return;
        }
        this.d.abortAnimation();
    }

    protected HwGenericEventDetector b() {
        return new HwGenericEventDetector(getContext());
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
        xea xeaVar = this.f29692c;
        if (xeaVar != null && xeaVar.b()) {
            a();
        } else if (this.d.computeScrollOffset()) {
            e();
        } else {
            super.computeScroll();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        HwGenericEventDetector hwGenericEventDetector;
        if (motionEvent == null) {
            return false;
        }
        if (this.e && (hwGenericEventDetector = this.f29690a) != null && hwGenericEventDetector.a(motionEvent)) {
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        if (getChildCount() <= 0 || !this.f29692c.i()) {
            return;
        }
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        this.d.fling(0, getScrollY(), 0, i, 0, 0, -height, getScrollRange() + height, 0, 0);
        postInvalidateOnAnimation();
    }

    protected int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        int height = childAt != null ? childAt.getHeight() - ((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
        if (height < 0) {
            return 0;
        }
        return height;
    }

    public float getSensitivity() {
        HwGenericEventDetector hwGenericEventDetector = this.f29690a;
        if (hwGenericEventDetector != null) {
            return hwGenericEventDetector.e();
        }
        return 1.0f;
    }

    protected HwGenericEventDetector.OnScrollListener h() {
        return new c();
    }

    protected boolean j() {
        return this.f29692c.b(getScrollY(), 0, getScrollRange());
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        HwGenericEventDetector hwGenericEventDetector = this.f29690a;
        if (hwGenericEventDetector != null && this.e && hwGenericEventDetector.c(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            this.j = false;
            this.g = y;
            g();
        } else if (action == 1) {
            this.j = false;
            if (j()) {
                postInvalidateOnAnimation();
            }
        } else if (action == 2) {
            int iAbs = Math.abs(y - this.g);
            if (!this.j && iAbs > (i = this.f)) {
                this.j = true;
                int i2 = this.g;
                if (y < i2) {
                    this.g = i2 - i;
                } else {
                    this.g = i2 + i;
                }
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        } else if (action == 3) {
            this.j = false;
            if (j()) {
                postInvalidateOnAnimation();
            }
        }
        if (this.j && this.f29691b) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            g();
        } else if (action == 1) {
            if (j()) {
                postInvalidateOnAnimation();
            }
        } else if (action == 2) {
            int y = (int) motionEvent.getY();
            int i = this.g;
            if (this.j) {
                overScrollBy(0, i - y, 0, getScrollY(), 0, getScrollRange(), 0, getHeight(), true);
                this.g = y;
            }
        } else if (action == 3) {
            if (j()) {
                postInvalidateOnAnimation();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int iD = (d() || c()) ? d(i2, i4) : i2;
        invalidate();
        return super.overScrollBy(i, iD, i3, i4, i5, i6, i7, i8, z);
    }

    public void setEnforceableOverScrollEnabled(boolean z) {
        this.f29691b = z;
    }

    public void setExtendScrollEnabled(boolean z) {
        this.e = z;
    }

    public void setSensitivity(float f) {
        HwGenericEventDetector hwGenericEventDetector = this.f29690a;
        if (hwGenericEventDetector != null) {
            hwGenericEventDetector.d(f);
        }
    }

    public HwScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwScrollViewStyle);
    }

    private static Context b(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwScrollView);
    }

    public HwScrollView(Context context, AttributeSet attributeSet, int i) {
        super(b(context, i), attributeSet, i);
        this.e = true;
        this.f29691b = true;
        this.j = false;
        c(super.getContext(), attributeSet, i);
    }

    private void c(Context context, AttributeSet attributeSet, int i) {
        b(context, attributeSet, i);
        this.f29692c = new xea();
        this.d = new OverScroller(context);
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f) {
        scrollTo(getScrollX(), getScrollY() + ((int) f));
    }

    private void e() {
        xea xeaVar;
        int scrollY = getScrollY();
        int currY = this.d.getCurrY();
        if (scrollY != currY) {
            int scrollRange = getScrollRange();
            int overScrollMode = getOverScrollMode();
            boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
            overScrollBy(0, currY - scrollY, 0, scrollY, 0, scrollRange, getHeight(), 0, false);
            onScrollChanged(0, getScrollY(), 0, scrollY);
            if (z && (xeaVar = this.f29692c) != null) {
                if (currY < 0 && scrollY >= 0) {
                    xeaVar.c(-this.d.getCurrVelocity(), -1, 0);
                    this.d.abortAnimation();
                } else if (currY > scrollRange && scrollY <= scrollRange) {
                    xeaVar.c(this.d.getCurrVelocity(), scrollRange + 1, scrollRange);
                    this.d.abortAnimation();
                }
            }
        }
        if (awakenScrollBars()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void a() {
        if (this.f29692c == null) {
            return;
        }
        int scrollY = getScrollY();
        int iA = this.f29692c.a();
        if (scrollY != iA) {
            overScrollBy(0, iA - scrollY, 0, scrollY, 0, getScrollRange(), 0, getHeight() / 2, false);
            onScrollChanged(getScrollX(), getScrollY(), 0, scrollY);
        }
        if (awakenScrollBars()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private int d(int i, int i2) {
        if (c()) {
            i2 -= getScrollRange();
        }
        return this.f29692c.c(getHeight(), i, i2);
    }
}
