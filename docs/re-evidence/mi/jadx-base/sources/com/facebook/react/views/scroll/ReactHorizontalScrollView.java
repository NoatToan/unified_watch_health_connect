package com.facebook.react.views.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.core.view.c;
import defpackage.d2a;
import defpackage.joq;
import defpackage.nej;
import defpackage.phg;
import defpackage.q8p;
import defpackage.q9h;
import defpackage.qcj;
import defpackage.rbf;
import defpackage.rcj;
import defpackage.sk1;
import defpackage.xfj;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class ReactHorizontalScrollView extends HorizontalScrollView implements qcj {
    public static boolean A = false;
    public static Field z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9h f7537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OverScroller f7538b;
    public final joq c;
    public final Rect d;
    public boolean e;
    public Rect f;
    public String g;
    public boolean h;
    public boolean i;
    public Runnable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7539k;
    public boolean l;
    public boolean m;
    public String n;
    public Drawable o;
    public int p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7540r;
    public float s;
    public List<Integer> t;
    public boolean u;
    public boolean v;
    public xfj w;
    public boolean x;
    public final Rect y;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7541a = false;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ReactHorizontalScrollView.this.e) {
                ReactHorizontalScrollView.this.e = false;
                c.j0(ReactHorizontalScrollView.this, this, 20L);
            } else if (ReactHorizontalScrollView.this.i && !this.f7541a) {
                this.f7541a = true;
                ReactHorizontalScrollView.this.k(0);
                c.j0(ReactHorizontalScrollView.this, this, 20L);
            } else {
                if (ReactHorizontalScrollView.this.m) {
                    nej.g(ReactHorizontalScrollView.this);
                }
                ReactHorizontalScrollView.this.j = null;
                ReactHorizontalScrollView.this.h();
            }
        }
    }

    public ReactHorizontalScrollView(Context context) {
        this(context, null);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!A) {
            A = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                z = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = z;
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
            throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.f7540r;
        return i != 0 ? i : getWidth();
    }

    private void s(View view) {
        int iL = l(view);
        if (iL != 0) {
            scrollBy(iL, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (!this.i || this.x) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i, i2);
        for (View view : arrayList2) {
            if (q(view) || o(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i) {
        if (!this.i) {
            return super.arrowScroll(i);
        }
        boolean z2 = true;
        this.x = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
            View childAt = getChildAt(0);
            if (childAt == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != childAt) {
                x(i);
            } else {
                if (!q(viewFindNextFocus) && !n(viewFindNextFocus)) {
                    x(i);
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z2 = false;
        }
        this.x = false;
        return z2;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.p != 0) {
            View childAt = getChildAt(0);
            if (this.o != null && childAt != null && childAt.getRight() < getWidth()) {
                this.o.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.o.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.l || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        int iAbs = (int) (Math.abs(i) * Math.signum(this.f7537a.a()));
        if (this.i) {
            k(iAbs);
        } else if (this.f7538b != null) {
            this.f7538b.fling(getScrollX(), getScrollY(), iAbs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - c.F(this)) - c.E(this)) / 2, 0);
            c.h0(this);
        } else {
            super.fling(iAbs);
        }
        m(iAbs, 0);
    }

    @Override // defpackage.qcj
    public void getClippingRect(Rect rect) {
        rect.set((Rect) sk1.c(this.f));
    }

    @Override // defpackage.qcj
    public boolean getRemoveClippedSubviews() {
        return this.f7539k;
    }

    public final void h() {
        if (p()) {
            sk1.c(null);
            sk1.c(this.n);
            throw null;
        }
    }

    public final void i() {
        if (p()) {
            sk1.c(null);
            sk1.c(this.n);
            throw null;
        }
    }

    public void j() {
        awakenScrollBars();
    }

    public final void k(int i) {
        int i2;
        int iIntValue;
        int iFloor;
        int iMin;
        int iIntValue2;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f7540r == 0 && this.t == null) {
            w(i);
            return;
        }
        int iMax = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iR = r(i);
        if (this.q) {
            iR = getScrollX();
        }
        int width = (getWidth() - c.F(this)) - c.E(this);
        boolean z2 = q8p.a(Locale.getDefault()) == 1;
        if (z2) {
            iR = iMax - iR;
            i2 = -i;
        } else {
            i2 = i;
        }
        List<Integer> list = this.t;
        if (list != null) {
            iIntValue2 = list.get(0).intValue();
            List<Integer> list2 = this.t;
            iIntValue = list2.get(list2.size() - 1).intValue();
            iMin = iMax;
            iFloor = 0;
            for (int i3 = 0; i3 < this.t.size(); i3++) {
                int iIntValue3 = this.t.get(i3).intValue();
                if (iIntValue3 <= iR && iR - iIntValue3 < iR - iFloor) {
                    iFloor = iIntValue3;
                }
                if (iIntValue3 >= iR && iIntValue3 - iR < iMin - iR) {
                    iMin = iIntValue3;
                }
            }
        } else {
            double snapInterval = getSnapInterval();
            double d = ((double) iR) / snapInterval;
            iIntValue = iMax;
            iFloor = (int) (Math.floor(d) * snapInterval);
            iMin = Math.min((int) (Math.ceil(d) * snapInterval), iMax);
            iIntValue2 = 0;
        }
        int i4 = iR - iFloor;
        int i5 = iMin - iR;
        int i6 = i4 < i5 ? iFloor : iMin;
        int scrollX = getScrollX();
        if (z2) {
            scrollX = iMax - scrollX;
        }
        if (this.v || iR < iIntValue) {
            if (this.u || iR > iIntValue2) {
                if (i2 > 0) {
                    i2 += (int) (((double) i5) * 10.0d);
                    iR = iMin;
                } else if (i2 < 0) {
                    i2 -= (int) (((double) i4) * 10.0d);
                    iR = iFloor;
                } else {
                    iR = i6;
                }
            } else if (scrollX > iIntValue2) {
                iR = iIntValue2;
            }
        } else if (scrollX < iIntValue) {
            iR = iIntValue;
        }
        int iMin2 = Math.min(Math.max(0, iR), iMax);
        if (z2) {
            iMin2 = iMax - iMin2;
            i2 = -i2;
        }
        OverScroller overScroller = this.f7538b;
        if (overScroller == null) {
            smoothScrollTo(iMin2, getScrollY());
            return;
        }
        this.e = true;
        overScroller.fling(getScrollX(), getScrollY(), i2 != 0 ? i2 : iMin2 - getScrollX(), 0, iMin2, iMin2, 0, 0, (iMin2 == 0 || iMin2 == iMax) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    public final int l(View view) {
        view.getDrawingRect(this.y);
        offsetDescendantRectToMyCoords(view, this.y);
        return computeScrollDeltaToGetChildRectOnScreen(this.y);
    }

    public final void m(int i, int i2) {
        if ((this.m || this.i || p()) && this.j == null) {
            if (this.m) {
                nej.f(this, i, i2);
            }
            this.e = false;
            a aVar = new a();
            this.j = aVar;
            c.j0(this, aVar, 20L);
        }
    }

    public final boolean n(View view) {
        int iL = l(view);
        view.getDrawingRect(this.y);
        return iL != 0 && Math.abs(iL) < this.y.width() / 2;
    }

    public final boolean o(View view) {
        int iL = l(view);
        view.getDrawingRect(this.y);
        return iL != 0 && Math.abs(iL) < this.y.width();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7539k) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        getDrawingRect(this.d);
        String str = this.g;
        str.hashCode();
        if (!str.equals("visible")) {
            canvas.clipRect(this.d);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        rbf.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        int iComputeHorizontalScrollRange;
        OverScroller overScroller = this.f7538b;
        if (overScroller != null && !overScroller.isFinished() && this.f7538b.getCurrX() != this.f7538b.getFinalX() && i >= (iComputeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.f7538b.abortAnimation();
            i = iComputeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z2, z3);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.e = true;
        if (this.f7537a.c(i, i2)) {
            if (this.f7539k) {
                updateClippingRect();
            }
            nej.c(this, this.f7537a.a(), this.f7537a.b());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f7539k) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
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
            m(Math.round(fB), Math.round(fC));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i) {
        boolean zPageScroll = super.pageScroll(i);
        if (this.i && zPageScroll) {
            m(0, 0);
        }
        return zPageScroll;
    }

    public final boolean q(View view) {
        return l(view) == 0;
    }

    public final int r(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.s);
        overScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, ((getWidth() - c.F(this)) - c.E(this)) / 2, 0);
        return overScroller.getFinalX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.i) {
            s(view2);
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
        this.s = f;
        OverScroller overScroller = this.f7538b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z2) {
        this.q = z2;
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

    public void setPagingEnabled(boolean z2) {
        this.i = z2;
    }

    public void setRemoveClippedSubviews(boolean z2) {
        if (z2 && this.f == null) {
            this.f = new Rect();
        }
        this.f7539k = z2;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z2) {
        this.l = z2;
    }

    public void setScrollPerfTag(String str) {
        this.n = str;
    }

    public void setSendMomentumEvents(boolean z2) {
        this.m = z2;
    }

    public void setSnapInterval(int i) {
        this.f7540r = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.t = list;
    }

    public void setSnapToEnd(boolean z2) {
        this.v = z2;
    }

    public void setSnapToStart(boolean z2) {
        this.u = z2;
    }

    public void t(int i, float f, float f2) {
        this.w.c(i, f, f2);
    }

    public void u(float f, int i) {
        this.w.e(f, i);
    }

    @Override // defpackage.qcj
    public void updateClippingRect() {
        if (this.f7539k) {
            sk1.c(this.f);
            rcj.a(this, this.f);
            KeyEvent.Callback childAt = getChildAt(0);
            if (childAt instanceof qcj) {
                ((qcj) childAt).updateClippingRect();
            }
        }
    }

    public void v(int i, float f) {
        this.w.g(i, f);
    }

    public final void w(int i) {
        double snapInterval = getSnapInterval();
        double scrollX = getScrollX();
        double dR = r(i);
        double d = scrollX / snapInterval;
        int iFloor = (int) Math.floor(d);
        int iCeil = (int) Math.ceil(d);
        int iRound = (int) Math.round(d);
        int iRound2 = (int) Math.round(dR / snapInterval);
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
        if (d2 != scrollX) {
            this.e = true;
            smoothScrollTo((int) d2, getScrollY());
        }
    }

    public final void x(int i) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX / width;
        if (scrollX % width != 0) {
            i2++;
        }
        int i3 = i == 17 ? i2 - 1 : i2 + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        smoothScrollTo(i3 * width, getScrollY());
        m(0, 0);
    }

    public ReactHorizontalScrollView(Context context, d2a d2aVar) {
        super(context);
        this.f7537a = new q9h();
        this.c = new joq();
        this.d = new Rect();
        this.g = "hidden";
        this.i = false;
        this.l = true;
        this.p = 0;
        this.q = false;
        this.f7540r = 0;
        this.s = 0.985f;
        this.u = true;
        this.v = true;
        this.x = false;
        this.y = new Rect();
        this.w = new xfj(this);
        this.f7538b = getOverScrollerFromParent();
    }
}
