package com.huawei.ui.commonui.scrollview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.TranslateAnimation;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.utils.StatusBarClickedListener;
import com.huawei.uikit.hwscrollview.widget.HwScrollView;
import defpackage.njy;
import defpackage.qoy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthScrollView extends HwScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23871a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private float af;
    private int ag;
    private Rect ah;
    private int ai;
    private ScrollViewListener aj;
    private List<ScrollChangeToBoundaryListener> ak;
    private ScrollChangeOtherListener al;
    private float am;
    private float an;
    private c ao;
    private StatusBarClickedListener ap;
    private boolean aq;
    private int ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f23873c;
    private int d;
    private Context e;
    private float f;
    private int g;
    private qoy h;
    private float i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public interface ScrollChangeOtherListener {
        void scrollChangeOtherListener();
    }

    public interface ScrollChangeToBoundaryListener {
        public static final int STATUS_DOWN = 0;
        public static final int STATUS_UP = 1;
        public static final int STATUS_UP_AT_TOP = 2;

        void onScrollStateChange(int i);

        void onScrollToChangeAlpha(float f);

        void onScrolledToBottom();

        void onScrolledTop();
    }

    public HealthScrollView(Context context) {
        super(context);
        this.i = 0.0f;
        this.f = 0.0f;
        this.u = false;
        this.aq = false;
        this.w = true;
        this.ac = false;
        this.l = false;
        this.ak = new ArrayList();
        this.ao = new c(this);
        this.f23872b = false;
        this.y = false;
        this.ab = false;
        this.q = true;
        this.o = true;
        this.p = false;
        this.h = null;
        this.n = false;
        this.v = false;
        this.z = true;
        this.ae = false;
        this.ah = new Rect();
        this.m = false;
        this.k = false;
        this.x = false;
        this.r = false;
        this.ad = false;
        this.s = false;
        a(context, null);
    }

    public HealthScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0.0f;
        this.f = 0.0f;
        this.u = false;
        this.aq = false;
        this.w = true;
        this.ac = false;
        this.l = false;
        this.ak = new ArrayList();
        this.ao = new c(this);
        this.f23872b = false;
        this.y = false;
        this.ab = false;
        this.q = true;
        this.o = true;
        this.p = false;
        this.h = null;
        this.n = false;
        this.v = false;
        this.z = true;
        this.ae = false;
        this.ah = new Rect();
        this.m = false;
        this.k = false;
        this.x = false;
        this.r = false;
        this.ad = false;
        this.s = false;
        a(context, attributeSet);
    }

    public HealthScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0.0f;
        this.f = 0.0f;
        this.u = false;
        this.aq = false;
        this.w = true;
        this.ac = false;
        this.l = false;
        this.ak = new ArrayList();
        this.ao = new c(this);
        this.f23872b = false;
        this.y = false;
        this.ab = false;
        this.q = true;
        this.o = true;
        this.p = false;
        this.h = null;
        this.n = false;
        this.v = false;
        this.z = true;
        this.ae = false;
        this.ah = new Rect();
        this.m = false;
        this.k = false;
        this.x = false;
        this.r = false;
        this.ad = false;
        this.s = false;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.e = context;
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthScrollView);
        this.ac = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_sportScrollView, false);
        this.y = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_pullDownRebound, false);
        this.ab = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_statusBarRebound, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_interceptEvent, true);
        this.aa = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_scrollEnable, false);
        this.o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_autoScroll, true);
        this.p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_longPress, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_ratioHeight, false);
        this.ae = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthScrollView_supportRebound, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.p) {
            this.h = new qoy(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.huawei.ui.commonui.scrollview.HealthScrollView.4
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                    HealthScrollView.this.n = true;
                }
            });
        }
        if (this.ae) {
            this.j = getPaddingTop();
            this.f23871a = getPaddingBottom();
            this.g = getPaddingRight();
            this.d = getPaddingLeft();
        }
        i();
        this.ar = ViewConfiguration.get(this.e).getScaledTouchSlop();
    }

    public void setOverScrollable(boolean z) {
        this.w = z;
    }

    private int getMaxScrollY() {
        return getChildAt(0).getMeasuredHeight() - getHeight();
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.w) {
            int i5 = i2 - i4;
            if (i5 < 0 && getScrollY() <= 0) {
                setScrollY(0);
                return;
            } else if (i5 > 0 && getScrollY() >= getMaxScrollY()) {
                setScrollY(getMaxScrollY());
            }
        }
        if (this.ae) {
            if (getScrollY() > 0) {
                setPadding(this.d, this.j, this.g, this.f23871a);
            } else {
                setPadding(this.d, 0, this.g, this.f23871a);
            }
        }
        if (this.y && i2 - i4 < 0 && getScrollY() <= 0) {
            setScrollY(0);
        }
        ScrollViewListener scrollViewListener = this.aj;
        if (scrollViewListener != null && (this.y || this.s)) {
            scrollViewListener.onScrollChanged(this, i, i2, i3, i4);
        }
        if (njy.b(this.ak)) {
            for (ScrollChangeToBoundaryListener scrollChangeToBoundaryListener : this.ak) {
                if (getScrollY() >= 100) {
                    scrollChangeToBoundaryListener.onScrolledToBottom();
                } else {
                    scrollChangeToBoundaryListener.onScrolledTop();
                }
                int iD = qrs.d(BaseApplication.getContext(), 110.0f);
                if (iD != 0) {
                    float f = iD;
                    scrollChangeToBoundaryListener.onScrollToChangeAlpha(((float) getScrollY()) / f <= 1.0f ? getScrollY() / f : 1.0f);
                }
            }
        }
        ScrollChangeOtherListener scrollChangeOtherListener = this.al;
        if (scrollChangeOtherListener != null) {
            scrollChangeOtherListener.scrollChangeOtherListener();
        }
    }

    public void setScrollChangeOtherListener(ScrollChangeOtherListener scrollChangeOtherListener) {
        this.al = scrollChangeOtherListener;
    }

    @Override // android.widget.ScrollView
    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.o) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.v) {
            Context context = this.e;
            if (context instanceof Activity) {
                Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels / 3, Integer.MIN_VALUE));
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCanRebound(boolean z) {
        this.r = z;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (!this.ae || getChildCount() <= 0) {
            return;
        }
        this.f23873c = getChildAt(0);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HealthScrollView", "super onLayout exception");
        }
        View view = this.f23873c;
        if (view == null) {
            return;
        }
        this.ah.set(view.getLeft(), this.f23873c.getTop(), this.f23873c.getRight(), this.f23873c.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = this.ae;
        if (z && this.f23873c == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.r) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (z) {
            a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = a();
            this.k = d();
            this.an = motionEvent.getY();
        } else if (action != 1) {
            if (action != 2) {
                return;
            }
            e(motionEvent);
        } else if (this.x) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f23873c.getTop(), this.ah.top);
            translateAnimation.setDuration(300L);
            this.f23873c.startAnimation(translateAnimation);
            this.f23873c.layout(this.ah.left, this.ah.top, this.ah.right, this.ah.bottom);
            this.m = false;
            this.k = false;
            this.x = false;
        }
    }

    private boolean e(MotionEvent motionEvent) {
        if (!this.m && !this.k) {
            this.an = motionEvent.getY();
            this.m = a();
            this.k = d();
            return true;
        }
        int y = (int) (motionEvent.getY() - this.an);
        boolean z = this.m;
        boolean z2 = z && y > 0;
        boolean z3 = this.k;
        boolean z4 = z3 && y < 0;
        boolean z5 = z && z3;
        if (z2 || z4 || z5) {
            int i = (int) (y * 0.5f);
            this.f23873c.layout(this.ah.left, this.ah.top + i, this.ah.right, this.ah.bottom + i);
            this.x = true;
        }
        return false;
    }

    public boolean a() {
        return getScrollY() == 0 || this.f23873c.getHeight() < getHeight() + getScrollY();
    }

    public boolean d() {
        return this.f23873c.getHeight() <= getHeight() + getScrollY();
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        if (scrollViewListener == null) {
            return;
        }
        this.aj = scrollViewListener;
    }

    @Override // com.huawei.uikit.hwscrollview.widget.HwScrollView, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        qoy qoyVar;
        if (motionEvent == null) {
            return false;
        }
        if (this.p && (qoyVar = this.h) != null) {
            qoyVar.e(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                if (this.p && this.n) {
                    return false;
                }
            } else {
                this.n = false;
            }
        } else if (!this.q) {
            this.ad = super.onInterceptTouchEvent(motionEvent);
        }
        if (!this.q) {
            return this.ad;
        }
        if (this.t || this.ae) {
            return false;
        }
        if (this.u || this.aq) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                this.i = x;
                this.f = y;
            } else {
                if (action2 == 2) {
                    return c(Math.abs(x - this.i), Math.abs(y - this.f));
                }
                LogUtil.j("HealthScrollView", "onInterceptTouchEvent default break");
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setScrollViewVerticalDirectionEvent(boolean z) {
        this.aq = z;
    }

    public void setScrollOnlyVertical(boolean z) {
        this.u = z;
    }

    @Override // com.huawei.uikit.hwscrollview.widget.HwScrollView, android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (this.ac) {
            return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, this.ai, z);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public void c(ScrollChangeToBoundaryListener scrollChangeToBoundaryListener) {
        this.ak.add(scrollChangeToBoundaryListener);
    }

    public void c() {
        this.ak.clear();
    }

    public void setIsScrollEnable(boolean z) {
        this.aa = z;
    }

    @Override // com.huawei.uikit.hwscrollview.widget.HwScrollView, android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (this.ae || this.aa) {
            return true;
        }
        if (this.f23872b) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.af = motionEvent.getRawX();
                this.am = motionEvent.getRawY();
                this.l = true;
            } else if (action != 1) {
                if (action == 2 && njy.b(this.ak)) {
                    for (ScrollChangeToBoundaryListener scrollChangeToBoundaryListener : this.ak) {
                        if (scrollChangeToBoundaryListener != null && (Math.abs(motionEvent.getRawX() - this.af) > 10.0f || Math.abs(motionEvent.getRawY() - this.am) > 10.0f)) {
                            scrollChangeToBoundaryListener.onScrollStateChange(0);
                        }
                    }
                }
            } else {
                this.l = false;
                this.ag = getScrollY();
                this.ao.sendEmptyMessageDelayed(1, 150L);
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HealthScrollView", "super onTouchEvent error");
            return false;
        }
    }

    static class c extends BaseHandler<HealthScrollView> {
        c(HealthScrollView healthScrollView) {
            super(healthScrollView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HealthScrollView healthScrollView, Message message) {
            if (message == null) {
                LogUtil.e("HealthScrollView", "TouchHandler message is null");
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i == 2 && njy.b(healthScrollView.ak)) {
                    for (ScrollChangeToBoundaryListener scrollChangeToBoundaryListener : healthScrollView.ak) {
                        if (healthScrollView.getScrollY() == 0) {
                            scrollChangeToBoundaryListener.onScrollStateChange(2);
                        } else {
                            scrollChangeToBoundaryListener.onScrollStateChange(1);
                        }
                    }
                    return;
                }
                return;
            }
            int scrollY = healthScrollView.getScrollY();
            if (healthScrollView.l) {
                return;
            }
            if (scrollY != healthScrollView.ag) {
                healthScrollView.ag = scrollY;
                sendEmptyMessageDelayed(1, 150L);
            } else {
                sendEmptyMessage(2);
            }
        }
    }

    public void a(boolean z) {
        this.f23872b = z;
    }

    private void i() {
        this.ai = (int) (this.e.getResources().getDisplayMetrics().density * 200.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowFocusChanged(boolean z) {
        if (this.ab) {
            super.dispatchWindowFocusChanged(z);
            setScrollTopEnable(z);
        }
    }

    public void setScrollTopEnable(boolean z) {
        this.z = z;
    }

    public void e() {
        LogUtil.a("HealthScrollView", "enter::scrollToTop, mIsScrollTopEnable", Boolean.valueOf(this.z));
        if (!this.z || getScrollY() == 0) {
            return;
        }
        smoothScrollTo(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        LogUtil.a("HealthScrollView", "onAttachedToWindow");
        if (this.ab && this.ap == null && this.e != null) {
            this.ap = new StatusBarClickedListener() { // from class: com.huawei.ui.commonui.scrollview.HealthScrollView.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    HealthScrollView.this.e();
                }
            };
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        StatusBarClickedListener statusBarClickedListener;
        super.onDetachedFromWindow();
        LogUtil.a("HealthScrollView", "onDetachedFromWindow");
        if (!this.ab || (statusBarClickedListener = this.ap) == null) {
            return;
        }
        statusBarClickedListener.unregister();
        this.ap = null;
    }

    public void setScrollViewIntercepts(boolean z) {
        this.t = z;
    }

    public void setIsForceScrollListener(boolean z) {
        this.s = z;
    }

    private boolean c(float f, float f2) {
        return f <= f2 && f2 > f && f2 > ((float) this.ar);
    }
}
