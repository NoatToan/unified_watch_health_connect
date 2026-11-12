package com.rd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.PositionSavedState;
import com.rd.draw.data.RtlMode;
import defpackage.eih;
import defpackage.ez5;
import defpackage.f2d;
import defpackage.g47;
import defpackage.nk4;
import defpackage.q8p;
import defpackage.s7d;

/* JADX INFO: loaded from: classes6.dex */
public class PageIndicatorView extends View implements ViewPager.i, com.rd.a.InterfaceC0332a, ViewPager.h, View.OnTouchListener {
    public static final Handler f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.rd.a f10441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSetObserver f10442b;
    public ViewPager c;
    public boolean d;
    public Runnable e;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PageIndicatorView.this.x();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PageIndicatorView.this.f10441a.d().F(true);
            PageIndicatorView.this.j();
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10445a;

        static {
            int[] iArr = new int[RtlMode.values().length];
            f10445a = iArr;
            try {
                iArr[RtlMode.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10445a[RtlMode.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10445a[RtlMode.Auto.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PageIndicatorView(Context context) {
        super(context);
        this.e = new b();
        k(null);
    }

    private int f(int i) {
        int iC = this.f10441a.d().c() - 1;
        if (i < 0) {
            return 0;
        }
        return i > iC ? iC : i;
    }

    private void g() {
        animate().cancel();
        animate().alpha(1.0f).setDuration(250L);
    }

    private void i(ViewParent viewParent) {
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            return;
        }
        ViewPager viewPagerH = h((ViewGroup) viewParent, this.f10441a.d().t());
        if (viewPagerH != null) {
            setViewPager(viewPagerH);
        } else {
            i(viewParent.getParent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        animate().cancel();
        animate().alpha(0.0f).setDuration(250L);
    }

    private void k(AttributeSet attributeSet) {
        t();
        l(attributeSet);
        if (this.f10441a.d().w()) {
            u();
        }
    }

    private void l(AttributeSet attributeSet) {
        com.rd.a aVar = new com.rd.a(this);
        this.f10441a = aVar;
        aVar.c().c(getContext(), attributeSet);
        s7d s7dVarD = this.f10441a.d();
        s7dVarD.M(getPaddingLeft());
        s7dVarD.O(getPaddingTop());
        s7dVarD.N(getPaddingRight());
        s7dVarD.L(getPaddingBottom());
        this.d = s7dVarD.x();
    }

    private boolean m() {
        int i = c.f10445a[this.f10441a.d().m().ordinal()];
        if (i != 1) {
            return i == 3 && q8p.a(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    private boolean n() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    private void o(int i, float f2) {
        s7d s7dVarD = this.f10441a.d();
        AnimationType animationTypeB = s7dVarD.b();
        boolean zX = s7dVarD.x();
        if (n() && zX && animationTypeB != AnimationType.NONE) {
            Pair<Integer, Float> pairC = nk4.c(s7dVarD, i, f2, m());
            s(((Integer) pairC.first).intValue(), ((Float) pairC.second).floatValue());
        }
    }

    private void q() {
        ViewPager viewPager;
        if (this.f10442b != null || (viewPager = this.c) == null || viewPager.getAdapter() == null) {
            return;
        }
        this.f10442b = new a();
        try {
            this.c.getAdapter().registerDataSetObserver(this.f10442b);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void t() {
        if (getId() == -1) {
            setId(f2d.a());
        }
    }

    private void u() {
        Handler handler = f;
        handler.removeCallbacks(this.e);
        handler.postDelayed(this.e, this.f10441a.d().d());
    }

    private void v() {
        f.removeCallbacks(this.e);
        g();
    }

    private void w() {
        ViewPager viewPager;
        if (this.f10442b == null || (viewPager = this.c) == null || viewPager.getAdapter() == null) {
            return;
        }
        try {
            this.c.getAdapter().unregisterDataSetObserver(this.f10442b);
            this.f10442b = null;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        ViewPager viewPager = this.c;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        int count = this.c.getAdapter().getCount();
        int currentItem = m() ? (count - 1) - this.c.getCurrentItem() : this.c.getCurrentItem();
        this.f10441a.d().T(currentItem);
        this.f10441a.d().U(currentItem);
        this.f10441a.d().I(currentItem);
        this.f10441a.d().B(count);
        this.f10441a.b().b();
        y();
        requestLayout();
    }

    private void y() {
        if (this.f10441a.d().u()) {
            int iC = this.f10441a.d().c();
            int visibility = getVisibility();
            if (visibility != 0 && iC > 1) {
                setVisibility(0);
            } else {
                if (visibility == 4 || iC > 1) {
                    return;
                }
                setVisibility(4);
            }
        }
    }

    @Override // com.rd.a.InterfaceC0332a
    public void a() {
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void b(ViewPager viewPager, eih eihVar, eih eihVar2) {
        DataSetObserver dataSetObserver;
        if (this.f10441a.d().v()) {
            if (eihVar != null && (dataSetObserver = this.f10442b) != null) {
                eihVar.unregisterDataSetObserver(dataSetObserver);
                this.f10442b = null;
            }
            q();
        }
        x();
    }

    public long getAnimationDuration() {
        return this.f10441a.d().a();
    }

    public int getCount() {
        return this.f10441a.d().c();
    }

    public int getPadding() {
        return this.f10441a.d().g();
    }

    public int getRadius() {
        return this.f10441a.d().l();
    }

    public float getScaleFactor() {
        return this.f10441a.d().n();
    }

    public int getSelectedColor() {
        return this.f10441a.d().o();
    }

    public int getSelection() {
        return this.f10441a.d().p();
    }

    public int getStrokeWidth() {
        return this.f10441a.d().r();
    }

    public int getUnselectedColor() {
        return this.f10441a.d().s();
    }

    public final ViewPager h(ViewGroup viewGroup, int i) {
        View viewFindViewById;
        if (viewGroup.getChildCount() > 0 && (viewFindViewById = viewGroup.findViewById(i)) != null && (viewFindViewById instanceof ViewPager)) {
            return (ViewPager) viewFindViewById;
        }
        return null;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i(getParent());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        w();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f10441a.c().a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Pair<Integer, Integer> pairD = this.f10441a.c().d(i, i2);
        setMeasuredDimension(((Integer) pairD.first).intValue(), ((Integer) pairD.second).intValue());
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f10441a.d().H(this.d);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrolled(int i, float f2, int i2) {
        o(i, f2);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageSelected(int i) {
        p(i);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PositionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        s7d s7dVarD = this.f10441a.d();
        PositionSavedState positionSavedState = (PositionSavedState) parcelable;
        s7dVarD.T(positionSavedState.c());
        s7dVarD.U(positionSavedState.d());
        s7dVarD.I(positionSavedState.a());
        super.onRestoreInstanceState(positionSavedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        s7d s7dVarD = this.f10441a.d();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.f(s7dVarD.p());
        positionSavedState.g(s7dVarD.q());
        positionSavedState.e(s7dVarD.e());
        return positionSavedState;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f10441a.d().w()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            v();
        } else if (action == 1) {
            u();
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f10441a.c().f(motionEvent);
        return true;
    }

    public final void p(int i) {
        s7d s7dVarD = this.f10441a.d();
        boolean zN = n();
        int iC = s7dVarD.c();
        if (zN) {
            if (m()) {
                i = (iC - 1) - i;
            }
            setSelection(i);
        }
    }

    public void r() {
        ViewPager viewPager = this.c;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this);
            this.c.removeOnAdapterChangeListener(this);
            this.c = null;
        }
    }

    public void s(int i, float f2) {
        s7d s7dVarD = this.f10441a.d();
        if (s7dVarD.x()) {
            int iC = s7dVarD.c();
            if (iC <= 0 || i < 0) {
                i = 0;
            } else {
                int i2 = iC - 1;
                if (i > i2) {
                    i = i2;
                }
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 == 1.0f) {
                s7dVarD.I(s7dVarD.p());
                s7dVarD.T(i);
            }
            s7dVarD.U(i);
            this.f10441a.b().c(f2);
        }
    }

    public void setAnimationDuration(long j) {
        this.f10441a.d().y(j);
    }

    public void setAnimationType(AnimationType animationType) {
        this.f10441a.a(null);
        if (animationType != null) {
            this.f10441a.d().z(animationType);
        } else {
            this.f10441a.d().z(AnimationType.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.f10441a.d().A(z);
        y();
    }

    public void setClickListener(g47.b bVar) {
        this.f10441a.c().e(bVar);
    }

    public void setCount(int i) {
        if (i < 0 || this.f10441a.d().c() == i) {
            return;
        }
        this.f10441a.d().B(i);
        y();
        requestLayout();
    }

    public void setDynamicCount(boolean z) {
        this.f10441a.d().C(z);
        if (z) {
            q();
        } else {
            w();
        }
    }

    public void setFadeOnIdle(boolean z) {
        this.f10441a.d().D(z);
        if (z) {
            u();
        } else {
            v();
        }
    }

    public void setIdleDuration(long j) {
        this.f10441a.d().G(j);
        if (this.f10441a.d().w()) {
            u();
        } else {
            v();
        }
    }

    public void setInteractiveAnimation(boolean z) {
        this.f10441a.d().H(z);
        this.d = z;
    }

    public void setOrientation(Orientation orientation) {
        if (orientation != null) {
            this.f10441a.d().J(orientation);
            requestLayout();
        }
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f10441a.d().K(ez5.a(i));
        invalidate();
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f10441a.d().P(ez5.a(i));
        invalidate();
    }

    public void setRtlMode(RtlMode rtlMode) {
        s7d s7dVarD = this.f10441a.d();
        if (rtlMode == null) {
            s7dVarD.Q(RtlMode.Off);
        } else {
            s7dVarD.Q(rtlMode);
        }
        if (this.c == null) {
            return;
        }
        int iP = s7dVarD.p();
        if (m()) {
            iP = (s7dVarD.c() - 1) - iP;
        } else {
            ViewPager viewPager = this.c;
            if (viewPager != null) {
                iP = viewPager.getCurrentItem();
            }
        }
        s7dVarD.I(iP);
        s7dVarD.U(iP);
        s7dVarD.T(iP);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setScaleFactor(float f2) {
        float f3 = 1.0f;
        if (f2 > 1.0f) {
            f2 = f3;
        } else {
            f3 = 0.3f;
            if (f2 < 0.3f) {
                f2 = f3;
            }
        }
        this.f10441a.d().R(f2);
    }

    public void setSelected(int i) {
        s7d s7dVarD = this.f10441a.d();
        AnimationType animationTypeB = s7dVarD.b();
        s7dVarD.z(AnimationType.NONE);
        setSelection(i);
        s7dVarD.z(animationTypeB);
    }

    public void setSelectedColor(int i) {
        this.f10441a.d().S(i);
        invalidate();
    }

    public void setSelection(int i) {
        s7d s7dVarD = this.f10441a.d();
        int iF = f(i);
        if (iF == s7dVarD.p() || iF == s7dVarD.q()) {
            return;
        }
        s7dVarD.H(false);
        s7dVarD.I(s7dVarD.p());
        s7dVarD.U(iF);
        s7dVarD.T(iF);
        this.f10441a.b().a();
    }

    public void setStrokeWidth(float f2) {
        int iL = this.f10441a.d().l();
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else {
            float f3 = iL;
            if (f2 > f3) {
                f2 = f3;
            }
        }
        this.f10441a.d().V((int) f2);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f10441a.d().W(i);
        invalidate();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(ViewPager viewPager) {
        r();
        if (viewPager == null) {
            return;
        }
        this.c = viewPager;
        viewPager.addOnPageChangeListener(this);
        this.c.addOnAdapterChangeListener(this);
        this.c.setOnTouchListener(this);
        this.f10441a.d().X(this.c.getId());
        setDynamicCount(this.f10441a.d().v());
        x();
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new b();
        k(attributeSet);
    }

    public void setPadding(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f10441a.d().K((int) f2);
        invalidate();
    }

    public void setRadius(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f10441a.d().P((int) f2);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int iA = ez5.a(i);
        int iL = this.f10441a.d().l();
        if (iA < 0) {
            iA = 0;
        } else if (iA > iL) {
            iA = iL;
        }
        this.f10441a.d().V(iA);
        invalidate();
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new b();
        k(attributeSet);
    }
}
