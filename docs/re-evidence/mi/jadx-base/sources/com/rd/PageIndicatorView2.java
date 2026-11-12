package com.rd;

import android.annotation.SuppressLint;
import android.content.Context;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.PositionSavedState;
import com.rd.draw.data.RtlMode;
import defpackage.ez5;
import defpackage.f2d;
import defpackage.g47;
import defpackage.nk4;
import defpackage.q8p;
import defpackage.s7d;

/* JADX INFO: loaded from: classes6.dex */
public class PageIndicatorView2 extends View implements com.rd.a.InterfaceC0332a, View.OnTouchListener {
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager2.i f10446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.rd.a f10447b;
    public RecyclerView.i c;
    public ViewPager2 d;
    public boolean e;
    public Runnable f;

    public class a extends ViewPager2.i {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 0) {
                PageIndicatorView2.this.f10447b.d().H(PageIndicatorView2.this.e);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            PageIndicatorView2.this.p(i, f);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i) {
            super.onPageSelected(i);
        }
    }

    public class b extends RecyclerView.i {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            PageIndicatorView2.this.x();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PageIndicatorView2.this.f10447b.d().F(true);
            PageIndicatorView2.this.k();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10451a;

        static {
            int[] iArr = new int[RtlMode.values().length];
            f10451a = iArr;
            try {
                iArr[RtlMode.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10451a[RtlMode.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10451a[RtlMode.Auto.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PageIndicatorView2(Context context) {
        super(context);
        this.f10446a = new a();
        this.f = new c();
        l(null);
    }

    @Override // com.rd.a.InterfaceC0332a
    public void a() {
        invalidate();
    }

    public final int g(int i) {
        int iC = this.f10447b.d().c() - 1;
        if (i < 0) {
            return 0;
        }
        return i > iC ? iC : i;
    }

    public long getAnimationDuration() {
        return this.f10447b.d().a();
    }

    public int getCount() {
        return this.f10447b.d().c();
    }

    public int getPadding() {
        return this.f10447b.d().g();
    }

    public int getRadius() {
        return this.f10447b.d().l();
    }

    public float getScaleFactor() {
        return this.f10447b.d().n();
    }

    public int getSelectedColor() {
        return this.f10447b.d().o();
    }

    public int getSelection() {
        return this.f10447b.d().p();
    }

    public int getStrokeWidth() {
        return this.f10447b.d().r();
    }

    public int getUnselectedColor() {
        return this.f10447b.d().s();
    }

    public final void h() {
        animate().cancel();
        animate().alpha(1.0f).setDuration(250L);
    }

    public final ViewPager2 i(ViewGroup viewGroup, int i) {
        View viewFindViewById;
        if (viewGroup.getChildCount() > 0 && (viewFindViewById = viewGroup.findViewById(i)) != null && (viewFindViewById instanceof ViewPager2)) {
            return (ViewPager2) viewFindViewById;
        }
        return null;
    }

    public final void j(ViewParent viewParent) {
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            return;
        }
        ViewPager2 viewPager2I = i((ViewGroup) viewParent, this.f10447b.d().t());
        if (viewPager2I != null) {
            setViewPager(viewPager2I);
        } else {
            j(viewParent.getParent());
        }
    }

    public final void k() {
        animate().cancel();
        animate().alpha(0.0f).setDuration(250L);
    }

    public final void l(AttributeSet attributeSet) {
        t();
        m(attributeSet);
        if (this.f10447b.d().w()) {
            u();
        }
    }

    public final void m(AttributeSet attributeSet) {
        com.rd.a aVar = new com.rd.a(this);
        this.f10447b = aVar;
        aVar.c().c(getContext(), attributeSet);
        s7d s7dVarD = this.f10447b.d();
        s7dVarD.M(getPaddingLeft());
        s7dVarD.O(getPaddingTop());
        s7dVarD.N(getPaddingRight());
        s7dVarD.L(getPaddingBottom());
        this.e = s7dVarD.x();
    }

    public final boolean n() {
        int i = d.f10451a[this.f10447b.d().m().ordinal()];
        if (i != 1) {
            return i == 3 && q8p.a(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    public final boolean o() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j(getParent());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        w();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f10447b.c().a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Pair<Integer, Integer> pairD = this.f10447b.c().d(i, i2);
        setMeasuredDimension(((Integer) pairD.first).intValue(), ((Integer) pairD.second).intValue());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PositionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        s7d s7dVarD = this.f10447b.d();
        PositionSavedState positionSavedState = (PositionSavedState) parcelable;
        s7dVarD.T(positionSavedState.c());
        s7dVarD.U(positionSavedState.d());
        s7dVarD.I(positionSavedState.a());
        super.onRestoreInstanceState(positionSavedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        s7d s7dVarD = this.f10447b.d();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.f(s7dVarD.p());
        positionSavedState.g(s7dVarD.q());
        positionSavedState.e(s7dVarD.e());
        return positionSavedState;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f10447b.d().w()) {
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
        this.f10447b.c().f(motionEvent);
        return true;
    }

    public final void p(int i, float f) {
        s7d s7dVarD = this.f10447b.d();
        AnimationType animationTypeB = s7dVarD.b();
        boolean zX = s7dVarD.x();
        if (o() && zX && animationTypeB != AnimationType.NONE) {
            Pair<Integer, Float> pairC = nk4.c(s7dVarD, i, f, n());
            s(((Integer) pairC.first).intValue(), ((Float) pairC.second).floatValue());
        }
    }

    public final void q() {
        ViewPager2 viewPager2;
        if (this.c != null || (viewPager2 = this.d) == null || viewPager2.getAdapter() == null) {
            return;
        }
        this.c = new b();
        try {
            this.d.getAdapter().registerAdapterDataObserver(this.c);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void r() {
        ViewPager2 viewPager2 = this.d;
        if (viewPager2 != null) {
            viewPager2.o(this.f10446a);
            this.d = null;
        }
    }

    public void s(int i, float f) {
        s7d s7dVarD = this.f10447b.d();
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
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f == 1.0f) {
                s7dVarD.I(s7dVarD.p());
                s7dVarD.T(i);
            }
            s7dVarD.U(i);
            this.f10447b.b().c(f);
        }
    }

    public void setAnimationDuration(long j) {
        this.f10447b.d().y(j);
    }

    public void setAnimationType(AnimationType animationType) {
        this.f10447b.a(null);
        if (animationType != null) {
            this.f10447b.d().z(animationType);
        } else {
            this.f10447b.d().z(AnimationType.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.f10447b.d().A(z);
        y();
    }

    public void setClickListener(g47.b bVar) {
        this.f10447b.c().e(bVar);
    }

    public void setCount(int i) {
        if (i < 0 || this.f10447b.d().c() == i) {
            return;
        }
        this.f10447b.d().B(i);
        y();
        requestLayout();
    }

    public void setDynamicCount(boolean z) {
        this.f10447b.d().C(z);
        if (z) {
            q();
        } else {
            w();
        }
    }

    public void setFadeOnIdle(boolean z) {
        this.f10447b.d().D(z);
        if (z) {
            u();
        } else {
            v();
        }
    }

    public void setIdleDuration(long j) {
        this.f10447b.d().G(j);
        if (this.f10447b.d().w()) {
            u();
        } else {
            v();
        }
    }

    public void setInteractiveAnimation(boolean z) {
        this.f10447b.d().H(z);
        this.e = z;
    }

    public void setOrientation(Orientation orientation) {
        if (orientation != null) {
            this.f10447b.d().J(orientation);
            requestLayout();
        }
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f10447b.d().K(ez5.a(i));
        invalidate();
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f10447b.d().P(ez5.a(i));
        invalidate();
    }

    public void setRtlMode(RtlMode rtlMode) {
        s7d s7dVarD = this.f10447b.d();
        if (rtlMode == null) {
            s7dVarD.Q(RtlMode.Off);
        } else {
            s7dVarD.Q(rtlMode);
        }
        if (this.d == null) {
            return;
        }
        int iP = s7dVarD.p();
        if (n()) {
            iP = (s7dVarD.c() - 1) - iP;
        } else {
            ViewPager2 viewPager2 = this.d;
            if (viewPager2 != null) {
                iP = viewPager2.getCurrentItem();
            }
        }
        s7dVarD.I(iP);
        s7dVarD.U(iP);
        s7dVarD.T(iP);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setScaleFactor(float f) {
        float f2 = 1.0f;
        if (f > 1.0f) {
            f = f2;
        } else {
            f2 = 0.3f;
            if (f < 0.3f) {
                f = f2;
            }
        }
        this.f10447b.d().R(f);
    }

    public void setSelected(int i) {
        s7d s7dVarD = this.f10447b.d();
        AnimationType animationTypeB = s7dVarD.b();
        s7dVarD.z(AnimationType.NONE);
        setSelection(i);
        s7dVarD.z(animationTypeB);
    }

    public void setSelectedColor(int i) {
        this.f10447b.d().S(i);
        invalidate();
    }

    public void setSelection(int i) {
        s7d s7dVarD = this.f10447b.d();
        int iG = g(i);
        if (iG == s7dVarD.p() || iG == s7dVarD.q()) {
            return;
        }
        s7dVarD.H(false);
        s7dVarD.I(s7dVarD.p());
        s7dVarD.U(iG);
        s7dVarD.T(iG);
        this.f10447b.b().a();
    }

    public void setStrokeWidth(float f) {
        int iL = this.f10447b.d().l();
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = iL;
            if (f > f2) {
                f = f2;
            }
        }
        this.f10447b.d().V((int) f);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f10447b.d().W(i);
        invalidate();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(ViewPager2 viewPager2) {
        r();
        if (viewPager2 == null) {
            return;
        }
        this.d = viewPager2;
        viewPager2.h(this.f10446a);
        this.d.setOnTouchListener(this);
        this.f10447b.d().X(this.d.getId());
        setDynamicCount(this.f10447b.d().v());
        x();
    }

    public final void t() {
        if (getId() == -1) {
            setId(f2d.a());
        }
    }

    public final void u() {
        Handler handler = g;
        handler.removeCallbacks(this.f);
        handler.postDelayed(this.f, this.f10447b.d().d());
    }

    public final void v() {
        g.removeCallbacks(this.f);
        h();
    }

    public final void w() {
        ViewPager2 viewPager2;
        if (this.c == null || (viewPager2 = this.d) == null || viewPager2.getAdapter() == null) {
            return;
        }
        try {
            this.d.getAdapter().unregisterAdapterDataObserver(this.c);
            this.c = null;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public final void x() {
        ViewPager2 viewPager2 = this.d;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return;
        }
        int itemCount = this.d.getAdapter().getItemCount();
        int currentItem = n() ? (itemCount - 1) - this.d.getCurrentItem() : this.d.getCurrentItem();
        this.f10447b.d().T(currentItem);
        this.f10447b.d().U(currentItem);
        this.f10447b.d().I(currentItem);
        this.f10447b.d().B(itemCount);
        this.f10447b.b().b();
        y();
        requestLayout();
    }

    public final void y() {
        if (this.f10447b.d().u()) {
            int iC = this.f10447b.d().c();
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

    public void setPadding(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f10447b.d().K((int) f);
        invalidate();
    }

    public void setRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f10447b.d().P((int) f);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int iA = ez5.a(i);
        int iL = this.f10447b.d().l();
        if (iA < 0) {
            iA = 0;
        } else if (iA > iL) {
            iA = iL;
        }
        this.f10447b.d().V(iA);
        invalidate();
    }

    public PageIndicatorView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10446a = new a();
        this.f = new c();
        l(attributeSet);
    }

    public PageIndicatorView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10446a = new a();
        this.f = new c();
        l(attributeSet);
    }
}
