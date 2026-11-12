package com.facebook.react.views.scroll;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.c;
import com.facebook.react.bridge.ReactContext;
import defpackage.d2a;
import defpackage.joq;
import defpackage.nej;
import defpackage.phg;
import defpackage.q9h;
import defpackage.qcj;
import defpackage.rbf;
import defpackage.rcj;
import defpackage.sk1;
import defpackage.xfj;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ReactScrollView extends ScrollView implements qcj, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener {
    public static Field x = null;
    public static boolean y = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9h f7543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OverScroller f7544b;
    public final joq c;
    public final Rect d;
    public boolean e;
    public Rect f;
    public String g;
    public boolean h;
    public boolean i;
    public Runnable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7545k;
    public boolean l;
    public boolean m;
    public String n;
    public Drawable o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7546r;
    public List<Integer> s;
    public boolean t;
    public boolean u;
    public View v;
    public xfj w;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7547a = false;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ReactScrollView.this.e) {
                ReactScrollView.this.e = false;
                c.j0(ReactScrollView.this, this, 20L);
            } else if (ReactScrollView.this.i && !this.f7547a) {
                this.f7547a = true;
                ReactScrollView.this.k(0);
                c.j0(ReactScrollView.this, this, 20L);
            } else {
                if (ReactScrollView.this.m) {
                    nej.g(ReactScrollView.this);
                }
                ReactScrollView.this.j = null;
                ReactScrollView.this.h();
            }
        }
    }

    public ReactScrollView(ReactContext reactContext, d2a d2aVar) {
        super(reactContext);
        this.f7543a = new q9h();
        this.c = new joq();
        this.d = new Rect();
        this.g = "hidden";
        this.i = false;
        this.l = true;
        this.p = 0;
        this.q = 0;
        this.f7546r = 0.985f;
        this.t = true;
        this.u = true;
        this.w = new xfj(this);
        this.f7544b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    private int getMaxScrollY() {
        return Math.max(0, this.v.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!y) {
            y = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                x = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = x;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.q;
        return i != 0 ? i : getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (m()) {
            sk1.c(null);
            sk1.c(this.n);
            throw null;
        }
    }

    private void i() {
        if (m()) {
            sk1.c(null);
            sk1.c(this.n);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    public void k(int i) {
        int iMin;
        int iIntValue;
        int i2;
        int iIntValue2;
        int scrollY;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.q == 0 && this.s == null) {
            s(i);
            return;
        }
        int maxScrollY = getMaxScrollY();
        int iN = n(i);
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.s;
        if (list != null) {
            iIntValue2 = list.get(0).intValue();
            List<Integer> list2 = this.s;
            iIntValue = list2.get(list2.size() - 1).intValue();
            iMin = maxScrollY;
            i2 = 0;
            for (int i3 = 0; i3 < this.s.size(); i3++) {
                int iIntValue3 = this.s.get(i3).intValue();
                if (iIntValue3 <= iN && iN - iIntValue3 < iN - i2) {
                    i2 = iIntValue3;
                }
                if (iIntValue3 >= iN && iIntValue3 - iN < iMin - iN) {
                    iMin = iIntValue3;
                }
            }
        } else {
            double snapInterval = getSnapInterval();
            double d = ((double) iN) / snapInterval;
            int iFloor = (int) (Math.floor(d) * snapInterval);
            iMin = Math.min((int) (Math.ceil(d) * snapInterval), maxScrollY);
            iIntValue = maxScrollY;
            i2 = iFloor;
            iIntValue2 = 0;
        }
        int i4 = iN - i2;
        int i5 = iMin - iN;
        int i6 = i4 < i5 ? i2 : iMin;
        if (this.u || iN < iIntValue) {
            if (!this.t && iN <= iIntValue2) {
                if (getScrollY() <= iIntValue2) {
                    iIntValue2 = iN;
                }
                scrollY = i;
            } else if (i > 0) {
                scrollY = i + ((int) (((double) i5) * 10.0d));
                iIntValue2 = iMin;
            } else if (i < 0) {
                scrollY = i - ((int) (((double) i4) * 10.0d));
                iIntValue2 = i2;
            } else {
                scrollY = i;
                iIntValue2 = i6;
            }
        } else if (getScrollY() >= iIntValue) {
            iIntValue2 = iN;
            scrollY = i;
        } else {
            scrollY = i;
            iIntValue2 = iIntValue;
        }
        int iMin2 = Math.min(Math.max(0, iIntValue2), maxScrollY);
        OverScroller overScroller = this.f7544b;
        if (overScroller == null) {
            smoothScrollTo(getScrollX(), iMin2);
            return;
        }
        this.e = true;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        if (scrollY == 0) {
            scrollY = iMin2 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY2, 0, scrollY, 0, 0, iMin2, iMin2, 0, (iMin2 == 0 || iMin2 == maxScrollY) ? height / 2 : 0);
        postInvalidateOnAnimation();
    }

    private void l(int i, int i2) {
        if ((this.m || this.i || m()) && this.j == null) {
            if (this.m) {
                i();
                nej.f(this, i, i2);
            }
            this.e = false;
            a aVar = new a();
            this.j = aVar;
            c.j0(this, aVar, 20L);
        }
    }

    private boolean m() {
        return false;
    }

    private int n(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.f7546r);
        overScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        return overScroller.getFinalY();
    }

    private void o(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void s(int i) {
        double snapInterval = getSnapInterval();
        double scrollY = getScrollY();
        double dN = n(i);
        double d = scrollY / snapInterval;
        int iFloor = (int) Math.floor(d);
        int iCeil = (int) Math.ceil(d);
        int iRound = (int) Math.round(d);
        int iRound2 = (int) Math.round(dN / snapInterval);
        if (i > 0 && iCeil == iFloor) {
            iCeil++;
        } else if (i < 0 && iFloor == iCeil) {
            iFloor--;
        }
        if (i > 0 && iRound < iCeil && iRound2 > iFloor) {
            iRound = iCeil;
        } else if (i < 0 && iRound > iFloor && iRound2 < iCeil) {
            iRound = iFloor;
        }
        double d2 = ((double) iRound) * snapInterval;
        if (d2 != scrollY) {
            this.e = true;
            smoothScrollTo(getScrollX(), (int) d2);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.p != 0) {
            View childAt = getChildAt(0);
            if (this.o != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.o.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.o.draw(canvas);
            }
        }
        getDrawingRect(this.d);
        String str = this.g;
        str.hashCode();
        if (!str.equals("visible")) {
            canvas.clipRect(this.d);
        }
        try {
            super.draw(canvas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.l || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        float fSignum = Math.signum(this.f7543a.b());
        if (fSignum == 0.0f) {
            fSignum = Math.signum(i);
        }
        int iAbs = (int) (Math.abs(i) * fSignum);
        if (this.i) {
            k(iAbs);
        } else if (this.f7544b != null) {
            this.f7544b.fling(getScrollX(), getScrollY(), 0, iAbs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            c.h0(this);
        } else {
            super.fling(iAbs);
        }
        l(0, iAbs);
    }

    @Override // defpackage.qcj
    public void getClippingRect(Rect rect) {
        rect.set((Rect) sk1.c(this.f));
    }

    @Override // defpackage.qcj
    public boolean getRemoveClippedSubviews() {
        return this.f7545k;
    }

    public void j() {
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7545k) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.v = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        this.v.removeOnLayoutChangeListener(this);
        this.v = null;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.l) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                phg.a(this, motionEvent);
                nej.a(this);
                this.h = true;
                i();
                return true;
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.v == null) {
            return;
        }
        int scrollY = getScrollY();
        int maxScrollY = getMaxScrollY();
        if (scrollY > maxScrollY) {
            scrollTo(getScrollX(), maxScrollY);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        rbf.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.f7544b;
        if (overScroller != null && this.v != null && !overScroller.isFinished() && this.f7544b.getCurrY() != this.f7544b.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.f7544b.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.e = true;
        if (this.f7543a.c(i, i2)) {
            if (this.f7545k) {
                updateClippingRect();
            }
            nej.c(this, this.f7543a.a(), this.f7543a.b());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f7545k) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l) {
            return false;
        }
        this.c.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.h) {
            float fB = this.c.b();
            float fC = this.c.c();
            nej.b(this, fB, fC);
            this.h = false;
            l(Math.round(fB), Math.round(fC));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p(int i, float f, float f2) {
        this.w.c(i, f, f2);
    }

    public void q(float f, int i) {
        this.w.e(f, i);
    }

    public void r(int i, float f) {
        this.w.g(i, f);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            o(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.w.b(i);
    }

    public void setBorderRadius(float f) {
        this.w.d(f);
    }

    public void setBorderStyle(String str) {
        this.w.f(str);
    }

    public void setDecelerationRate(float f) {
        this.f7546r = f;
        OverScroller overScroller = this.f7544b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.p) {
            this.p = i;
            this.o = new ColorDrawable(this.p);
        }
    }

    public void setOverflow(String str) {
        this.g = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.i = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f == null) {
            this.f = new Rect();
        }
        this.f7545k = z;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z) {
        this.l = z;
    }

    public void setScrollPerfTag(String str) {
        this.n = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.m = z;
    }

    public void setSnapInterval(int i) {
        this.q = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.s = list;
    }

    public void setSnapToEnd(boolean z) {
        this.u = z;
    }

    public void setSnapToStart(boolean z) {
        this.t = z;
    }

    @Override // defpackage.qcj
    public void updateClippingRect() {
        if (this.f7545k) {
            sk1.c(this.f);
            rcj.a(this, this.f);
            KeyEvent.Callback childAt = getChildAt(0);
            if (childAt instanceof qcj) {
                ((qcj) childAt).updateClippingRect();
            }
        }
    }
}
