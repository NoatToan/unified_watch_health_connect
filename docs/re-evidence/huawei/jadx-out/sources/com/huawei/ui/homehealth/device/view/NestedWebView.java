package com.huawei.ui.homehealth.device.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.util.NestScrollHelper;

/* JADX INFO: loaded from: classes17.dex */
public class NestedWebView extends WebView implements NestedScrollingChild3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NestedScrollingChildHelper f25350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25352c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Runnable k;
    private Scroller l;
    private final int[] m;
    private NestedDeviceScrollView n;
    private final int[] o;
    private int p;
    private VelocityTracker t;

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 2;
    }

    public NestedWebView(Context context) {
        this(context, null);
    }

    public NestedWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new int[2];
        this.o = new int[2];
        this.f25351b = false;
        this.f25352c = -1;
        this.h = 0;
        this.f25350a = new NestedScrollingChildHelper(this);
        setOverScrollMode(2);
        a();
        setNestedScrollingEnabled(true);
    }

    private void a() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.p = viewConfiguration.getScaledTouchSlop();
        this.l = new Scroller(getContext());
        setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: rvh
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                this.f47760a.e(view, i, i2, i3, i4);
            }
        });
    }

    public /* synthetic */ void e(View view, int i, int i2, int i3, int i4) {
        NestedDeviceScrollView nestedDeviceScrollView = this.n;
        int scrollY = nestedDeviceScrollView != null ? nestedDeviceScrollView.getScrollY() : 0;
        if (this.h < scrollY) {
            this.h = scrollY;
        }
        if (scrollY >= this.h || i2 <= 0) {
            return;
        }
        setScrollY(0);
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.n = d(getParent());
    }

    public void d() {
        this.h = 0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        LogUtil.j("NestedWebView", "onTouchEvent  MotionEvent:");
        int action = motionEvent.getAction();
        if (action == 2 && this.f25351b) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            this.d = (int) motionEvent.getY();
            this.f25352c = motionEvent.getPointerId(0);
            e();
            this.t.clear();
            this.t.addMovement(motionEvent);
            this.l.computeScrollOffset();
            this.f25351b = !this.l.isFinished();
            startNestedScroll(2);
        } else if (i == 1) {
            this.f25351b = false;
            this.f25352c = -1;
            h();
            stopNestedScroll();
        } else if (i == 2) {
            int i2 = this.f25352c;
            if (i2 == -1) {
                return this.f25351b;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i2);
            if (iFindPointerIndex == -1) {
                LogUtil.j("NestedWebView", "Invalid pointerId=", Integer.valueOf(i2), " in onInterceptTouchEvent");
                return this.f25351b;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.d) > this.p && (getNestedScrollAxes() & 2) == 0) {
                this.f25351b = true;
                this.d = y;
                e();
                this.t.addMovement(motionEvent);
                this.g = 0;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        } else if (i == 3) {
            this.f25351b = false;
            this.f25352c = -1;
            h();
            stopNestedScroll();
        } else if (i == 6) {
            d(motionEvent);
        }
        return this.f25351b;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.g);
        e();
        if (actionMasked == 0) {
            removeCallbacks(this.k);
            if (this.f25351b == (!this.l.isFinished()) && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.l.isFinished()) {
                c();
            }
            this.f25352c = motionEvent.getPointerId(0);
            this.d = (int) motionEvent.getY();
            startNestedScroll(2, 0);
        } else if (actionMasked == 1) {
            this.t.computeCurrentVelocity(1000, this.j);
            int yVelocity = (int) this.t.getYVelocity(this.f25352c);
            if (Math.abs(yVelocity) > this.i) {
                if (this.f <= 0) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        if (yVelocity < 0) {
                            a(i);
                        }
                    }
                } else {
                    a(-yVelocity);
                }
            }
            this.f25352c = -1;
            b();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f25352c);
            if (iFindPointerIndex == -1) {
                LogUtil.j("NestedWebView", "Invalid pointerId=", Integer.valueOf(this.f25352c), " in onTouchEvent");
            } else {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i2 = this.d - y;
                if (dispatchNestedPreScroll(0, i2, this.m, this.o, 0)) {
                    i2 -= this.m[1];
                    this.g += this.o[1];
                }
                if (!this.f25351b && Math.abs(i2) > this.p) {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    this.f25351b = true;
                    if (i2 > 0) {
                        i2 -= this.p;
                    } else {
                        i2 += this.p;
                    }
                }
                if (this.f25351b) {
                    this.d = y - this.o[1];
                    int scrollY = getScrollY();
                    if (c(i2, scrollY, computeVerticalScrollRange(), 0) && !hasNestedScrollingParent(0)) {
                        this.t.clear();
                    }
                    int scrollY2 = getScrollY() - scrollY;
                    int[] iArr = this.m;
                    iArr[1] = 0;
                    dispatchNestedScroll(0, scrollY2, 0, i2 - scrollY2, this.o, 0, iArr);
                    int i3 = this.g;
                    int i4 = this.o[1];
                    this.g = i3 + i4;
                    this.d -= i4;
                }
            }
        } else if (actionMasked == 3) {
            this.f25352c = -1;
            b();
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.f25352c = motionEvent.getPointerId(actionIndex);
            this.d = (int) motionEvent.getY(actionIndex);
        } else if (actionMasked == 6) {
            d(motionEvent);
            this.d = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f25352c));
        }
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return super.onTouchEvent(motionEvent);
    }

    public void c() {
        this.l.abortAnimation();
        stopNestedScroll(1);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        this.f = i2;
        super.onOverScrolled(i, i2, z, z2);
    }

    private void b() {
        this.f25351b = false;
        h();
        stopNestedScroll();
    }

    private void d(MotionEvent motionEvent) {
        int action = (65280 & motionEvent.getAction()) >> 8;
        if (motionEvent.getPointerId(action) == this.f25352c) {
            int i = action == 0 ? 1 : 0;
            this.f25352c = motionEvent.getPointerId(i);
            this.d = (int) motionEvent.getY(i);
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void a(int i) {
        d(i);
        this.l.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        startNestedScroll(2, 1);
        this.e = getScrollY();
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private void d(int i) {
        if (this.n == null) {
            return;
        }
        NestScrollHelper nestScrollHelper = new NestScrollHelper(getContext());
        double dC = nestScrollHelper.c(i);
        double scrollY = getScrollY();
        if (dC <= scrollY || i >= 0) {
            return;
        }
        double dA = nestScrollHelper.a(i);
        double dC2 = nestScrollHelper.c(dC - scrollY);
        double dA2 = nestScrollHelper.a(dC2);
        Runnable runnableC = c(this.n, (int) dC2);
        this.k = runnableC;
        postDelayed(runnableC, ((int) (dA - dA2)) - 100);
    }

    private static Runnable c(final NestedDeviceScrollView nestedDeviceScrollView, final int i) {
        return new Runnable() { // from class: rvi
            @Override // java.lang.Runnable
            public final void run() {
                nestedDeviceScrollView.fling(-i);
            }
        };
    }

    private NestedDeviceScrollView d(ViewParent viewParent) {
        if (viewParent instanceof NestedDeviceScrollView) {
            return (NestedDeviceScrollView) viewParent;
        }
        if (viewParent == null || viewParent.getParent() == null) {
            return null;
        }
        if (viewParent.getParent() instanceof NestedDeviceScrollView) {
            return (NestedDeviceScrollView) viewParent.getParent();
        }
        return d(viewParent.getParent());
    }

    private void h() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private void e() {
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            h();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (this.f25351b) {
            return true;
        }
        c(i2, i4, i6, i8);
        return true;
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.l.isFinished()) {
            return;
        }
        this.l.computeScrollOffset();
        int currY = this.l.getCurrY();
        int i = currY - this.e;
        this.e = currY;
        int[] iArr = this.m;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i, iArr, null, 1);
        int i2 = i - this.m[1];
        if (i2 != 0) {
            int scrollY = getScrollY();
            c(i2, scrollY, computeVerticalScrollRange(), 0);
            int scrollY2 = i2 - (getScrollY() - scrollY);
            int[] iArr2 = this.m;
            iArr2[1] = 0;
            dispatchNestedScroll(0, 0, 0, scrollY2, this.o, 1, iArr2);
            i2 = scrollY2 - this.m[1];
        }
        if (i2 != 0) {
            c();
        }
        if (this.l.isFinished()) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private boolean c(int i, int i2, int i3, int i4) {
        int overScrollMode = getOverScrollMode();
        boolean z = true;
        boolean z2 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        if (overScrollMode != 0 && (overScrollMode != 1 || !z2)) {
            i4 = 0;
        }
        int i5 = -i4;
        int i6 = i4 + i3;
        int i7 = i2 + i;
        if (i7 >= i5) {
            if (i7 > i6) {
                i5 = i6;
            } else {
                i5 = i7;
                z = false;
            }
        }
        onOverScrolled(0, i5, false, z);
        return z;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.f25350a.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f25350a.isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.f25350a.startNestedScroll(i, i2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.f25350a.stopNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.f25350a.hasNestedScrollingParent(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return dispatchNestedScroll(i, i2, i3, i4, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f25350a.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f25350a.dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f25350a.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f25350a.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f25350a.dispatchNestedFling(f, f2, false);
    }
}
