package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.core.view.t;
import androidx.core.view.u;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.y;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements x, w, t, u {
    public static final int[] K0 = {R.attr.enabled};
    public int A;
    public final be.d B;
    public be.e C;
    public be.f D;
    public be.g E;
    public be.g F;
    public final a H0;
    public boolean I;
    public final c I0;
    public final d J0;
    public int P;
    public e T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f11019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f11020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f11025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f11026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f11027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f11028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f11029k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f11030k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f11034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f11035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11037r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DecelerateInterpolator f11038t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final be.a f11039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f11042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f11043z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f11021c) {
                swipeRefreshLayout.f();
                return;
            }
            swipeRefreshLayout.B.setAlpha(255);
            swipeRefreshLayout.B.start();
            if (swipeRefreshLayout.I && (fVar = swipeRefreshLayout.f11020b) != null) {
                fVar.M7();
            }
            swipeRefreshLayout.f11033n = swipeRefreshLayout.f11039v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            be.f fVar = new be.f(swipeRefreshLayout);
            swipeRefreshLayout.D = fVar;
            fVar.setDuration(150L);
            be.a aVar = swipeRefreshLayout.f11039v;
            aVar.f17672a = null;
            aVar.clearAnimation();
            swipeRefreshLayout.f11039v.startAnimation(swipeRefreshLayout.D);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f14, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            int iAbs = swipeRefreshLayout.f11043z - Math.abs(swipeRefreshLayout.f11042y);
            int i14 = swipeRefreshLayout.f11041x;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((i14 + ((int) ((iAbs - i14) * f14))) - swipeRefreshLayout.f11039v.getTop());
            be.d dVar = swipeRefreshLayout.B;
            float f15 = 1.0f - f14;
            be.d.a aVar = dVar.f17681a;
            if (f15 != aVar.f17702p) {
                aVar.f17702p = f15;
            }
            dVar.invalidateSelf();
        }
    }

    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f14, Transformation transformation) {
            SwipeRefreshLayout.this.e(f14);
        }
    }

    public interface e {
        boolean a(SwipeRefreshLayout swipeRefreshLayout);
    }

    public interface f {
        void M7();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11021c = false;
        this.f11023e = -1.0f;
        this.f11027i = new int[2];
        this.f11028j = new int[2];
        this.f11029k = new int[2];
        this.f11037r = -1;
        this.f11040w = -1;
        this.H0 = new a();
        this.I0 = new c();
        this.J0 = new d();
        this.f11022d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f11032m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f11038t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.P = (int) (displayMetrics.density * 40.0f);
        this.f11039v = new be.a(getContext());
        be.d dVar = new be.d(getContext());
        this.B = dVar;
        dVar.c(1);
        this.f11039v.setImageDrawable(this.B);
        this.f11039v.setVisibility(8);
        addView(this.f11039v);
        setChildrenDrawingOrderEnabled(true);
        int i14 = (int) (displayMetrics.density * 64.0f);
        this.f11043z = i14;
        this.f11023e = i14;
        this.f11025g = new y(this);
        this.f11026h = new v(this);
        setNestedScrollingEnabled(true);
        int i15 = -this.P;
        this.f11033n = i15;
        this.f11042y = i15;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i14) {
        this.f11039v.getBackground().setAlpha(i14);
        this.B.setAlpha(i14);
    }

    public final boolean a() {
        e eVar = this.T;
        View view2 = this.f11019a;
        if (eVar != null) {
            return eVar.a(this);
        }
        return view2 instanceof ListView ? ((ListView) view2).canScrollList(-1) : view2.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f11019a == null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (!childAt.equals(this.f11039v)) {
                    this.f11019a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f14) {
        if (f14 > this.f11023e) {
            g(true, true);
            return;
        }
        this.f11021c = false;
        be.d dVar = this.B;
        be.d.a aVar = dVar.f17681a;
        aVar.f17691e = 0.0f;
        aVar.f17692f = 0.0f;
        dVar.invalidateSelf();
        b bVar = new b();
        this.f11041x = this.f11033n;
        d dVar2 = this.J0;
        dVar2.reset();
        dVar2.setDuration(200L);
        dVar2.setInterpolator(this.f11038t);
        be.a aVar2 = this.f11039v;
        aVar2.f17672a = bVar;
        aVar2.clearAnimation();
        this.f11039v.startAnimation(dVar2);
        be.d dVar3 = this.B;
        be.d.a aVar3 = dVar3.f17681a;
        if (aVar3.f17700n) {
            aVar3.f17700n = false;
        }
        dVar3.invalidateSelf();
    }

    public final void d(float f14) {
        be.g gVar;
        be.g gVar2;
        be.d dVar = this.B;
        be.d.a aVar = dVar.f17681a;
        if (!aVar.f17700n) {
            aVar.f17700n = true;
        }
        dVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f14 / this.f11023e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f14) - this.f11023e;
        int i14 = this.A;
        if (i14 <= 0) {
            i14 = this.f11043z;
        }
        float f15 = i14;
        double dMax = Math.max(0.0f, Math.min(fAbs, f15 * 2.0f) / f15) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i15 = this.f11042y + ((int) ((f15 * fMin) + (f15 * fPow * 2.0f)));
        if (this.f11039v.getVisibility() != 0) {
            this.f11039v.setVisibility(0);
        }
        this.f11039v.setScaleX(1.0f);
        this.f11039v.setScaleY(1.0f);
        float f16 = this.f11023e;
        be.d dVar2 = this.B;
        if (f14 < f16) {
            if (dVar2.f17681a.f17706t > 76 && ((gVar2 = this.E) == null || !gVar2.hasStarted() || gVar2.hasEnded())) {
                be.g gVar3 = new be.g(this, this.B.f17681a.f17706t, 76);
                gVar3.setDuration(300L);
                be.a aVar2 = this.f11039v;
                aVar2.f17672a = null;
                aVar2.clearAnimation();
                this.f11039v.startAnimation(gVar3);
                this.E = gVar3;
            }
        } else if (dVar2.f17681a.f17706t < 255 && ((gVar = this.F) == null || !gVar.hasStarted() || gVar.hasEnded())) {
            be.g gVar4 = new be.g(this, this.B.f17681a.f17706t, 255);
            gVar4.setDuration(300L);
            be.a aVar3 = this.f11039v;
            aVar3.f17672a = null;
            aVar3.clearAnimation();
            this.f11039v.startAnimation(gVar4);
            this.F = gVar4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        be.d dVar3 = this.B;
        be.d.a aVar4 = dVar3.f17681a;
        aVar4.f17691e = 0.0f;
        aVar4.f17692f = fMin2;
        dVar3.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        be.d dVar4 = this.B;
        be.d.a aVar5 = dVar4.f17681a;
        if (fMin3 != aVar5.f17702p) {
            aVar5.f17702p = fMin3;
        }
        dVar4.invalidateSelf();
        be.d dVar5 = this.B;
        dVar5.f17681a.f17693g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        dVar5.invalidateSelf();
        setTargetOffsetTopAndBottom(i15 - this.f11033n);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f14, float f15, boolean z14) {
        return this.f11026h.a(f14, f15, z14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f14, float f15) {
        return this.f11026h.b(f14, f15);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i14, int i15, int[] iArr, int[] iArr2) {
        return this.f11026h.c(i14, i15, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i14, int i15, int i16, int i17, int[] iArr) {
        return this.f11026h.d(i14, i15, i16, i17, iArr, 0, null);
    }

    public final void e(float f14) {
        int i14 = this.f11041x;
        setTargetOffsetTopAndBottom((i14 + ((int) ((this.f11042y - i14) * f14))) - this.f11039v.getTop());
    }

    public final void f() {
        this.f11039v.clearAnimation();
        this.B.stop();
        this.f11039v.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f11042y - this.f11033n);
        this.f11033n = this.f11039v.getTop();
    }

    public final void g(boolean z14, boolean z15) {
        if (this.f11021c != z14) {
            this.I = z15;
            b();
            this.f11021c = z14;
            a aVar = this.H0;
            if (!z14) {
                be.f fVar = new be.f(this);
                this.D = fVar;
                fVar.setDuration(150L);
                be.a aVar2 = this.f11039v;
                aVar2.f17672a = aVar;
                aVar2.clearAnimation();
                this.f11039v.startAnimation(this.D);
                return;
            }
            this.f11041x = this.f11033n;
            c cVar = this.I0;
            cVar.reset();
            cVar.setDuration(200L);
            cVar.setInterpolator(this.f11038t);
            if (aVar != null) {
                this.f11039v.f17672a = aVar;
            }
            this.f11039v.clearAnimation();
            this.f11039v.startAnimation(cVar);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i14, int i15) {
        int i16 = this.f11040w;
        if (i16 < 0) {
            return i15;
        }
        if (i15 == i14 - 1) {
            return i16;
        }
        return i15 >= i16 ? i15 + 1 : i15;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        y yVar = this.f11025g;
        return yVar.f6588b | yVar.f6587a;
    }

    public int getProgressCircleDiameter() {
        return this.P;
    }

    public int getProgressViewEndOffset() {
        return this.f11043z;
    }

    public int getProgressViewStartOffset() {
        return this.f11042y;
    }

    public final void h(float f14) {
        float f15 = this.f11035p;
        float f16 = f14 - f15;
        float f17 = this.f11022d;
        if (f16 <= f17 || this.f11036q) {
            return;
        }
        this.f11034o = f15 + f17;
        this.f11036q = true;
        this.B.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f11026h.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f11026h.f6582d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f11021c && !this.f11031l) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f11036q = false;
                    this.f11037r = -1;
                } else if (actionMasked == 2) {
                    int i14 = this.f11037r;
                    if (i14 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i14)) >= 0) {
                        h(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f11036q = false;
                    this.f11037r = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f11037r) {
                        this.f11037r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f11036q;
            }
            setTargetOffsetTopAndBottom(this.f11042y - this.f11039v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f11037r = pointerId;
            this.f11036q = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.f11035p = motionEvent.getY(iFindPointerIndex2);
                return this.f11036q;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f11019a == null) {
            b();
        }
        View view2 = this.f11019a;
        if (view2 == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view2.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f11039v.getMeasuredWidth();
        int measuredHeight2 = this.f11039v.getMeasuredHeight();
        int i18 = measuredWidth / 2;
        int i19 = measuredWidth2 / 2;
        int i24 = this.f11033n;
        this.f11039v.layout(i18 - i19, i24, i18 + i19, measuredHeight2 + i24);
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        if (this.f11019a == null) {
            b();
        }
        View view2 = this.f11019a;
        if (view2 == null) {
            return;
        }
        view2.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f11039v.measure(View.MeasureSpec.makeMeasureSpec(this.P, 1073741824), View.MeasureSpec.makeMeasureSpec(this.P, 1073741824));
        this.f11040w = -1;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            if (getChildAt(i16) == this.f11039v) {
                this.f11040w = i16;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view2, float f14, float f15, boolean z14) {
        return this.f11026h.a(f14, f15, z14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view2, float f14, float f15) {
        return this.f11026h.b(f14, f15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view2, int i14, int i15, int[] iArr) {
        if (i15 > 0) {
            float f14 = this.f11024f;
            if (f14 > 0.0f) {
                float f15 = i15;
                if (f15 > f14) {
                    iArr[1] = (int) f14;
                    this.f11024f = 0.0f;
                } else {
                    this.f11024f = f14 - f15;
                    iArr[1] = i15;
                }
                d(this.f11024f);
            }
        }
        int i16 = i14 - iArr[0];
        int i17 = i15 - iArr[1];
        int[] iArr2 = this.f11027i;
        if (dispatchNestedPreScroll(i16, i17, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // androidx.core.view.x
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
        if (i18 != 0) {
            return;
        }
        int i19 = iArr[1];
        if (i18 == 0) {
            this.f11026h.d(i14, i15, i16, i17, this.f11028j, i18, iArr);
        }
        int i24 = i17 - (iArr[1] - i19);
        int i25 = i24 == 0 ? i17 + this.f11028j[1] : i24;
        if (i25 >= 0 || a()) {
            return;
        }
        float fAbs = this.f11024f + Math.abs(i25);
        this.f11024f = fAbs;
        d(fAbs);
        iArr[1] = iArr[1] + i24;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view2, View view3, int i14) {
        this.f11025g.f6587a = i14;
        startNestedScroll(i14 & 2);
        this.f11024f = 0.0f;
        this.f11031l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        setRefreshing(gVar.f11048a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new g(super.onSaveInstanceState(), this.f11021c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view2, View view3, int i14) {
        return (!isEnabled() || this.f11021c || (i14 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view2) {
        this.f11025g.f6587a = 0;
        this.f11031l = false;
        float f14 = this.f11024f;
        if (f14 > 0.0f) {
            c(f14);
            this.f11024f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f11021c && !this.f11031l) {
            if (actionMasked == 0) {
                this.f11037r = motionEvent.getPointerId(0);
                this.f11036q = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f11037r);
                if (iFindPointerIndex >= 0) {
                    if (this.f11036q) {
                        float y14 = (motionEvent.getY(iFindPointerIndex) - this.f11034o) * 0.5f;
                        this.f11036q = false;
                        c(y14);
                    }
                    this.f11037r = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f11037r);
                if (iFindPointerIndex2 >= 0) {
                    float y15 = motionEvent.getY(iFindPointerIndex2);
                    h(y15);
                    if (this.f11036q) {
                        float f14 = (y15 - this.f11034o) * 0.5f;
                        if (f14 > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            d(f14);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f11037r) {
                            this.f11037r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.f11037r = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z14) {
        ViewParent parent;
        View view2 = this.f11019a;
        if (view2 != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (!view2.isNestedScrollingEnabled()) {
                if (this.f11030k0 || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z14);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z14);
    }

    public void setAnimationProgress(float f14) {
        this.f11039v.setScaleX(f14);
        this.f11039v.setScaleY(f14);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        be.d dVar = this.B;
        be.d.a aVar = dVar.f17681a;
        aVar.f17695i = iArr;
        aVar.a(0);
        aVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            iArr2[i14] = a7.b.getColor(context, iArr[i14]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i14) {
        this.f11023e = i14;
    }

    @Override // android.view.View
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        if (z14) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z14) {
        this.f11030k0 = z14;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z14) {
        this.f11026h.g(z14);
    }

    public void setOnChildScrollUpCallback(e eVar) {
        this.T = eVar;
    }

    public void setOnRefreshListener(f fVar) {
        this.f11020b = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i14) {
        setProgressBackgroundColorSchemeResource(i14);
    }

    public void setProgressBackgroundColorSchemeColor(int i14) {
        this.f11039v.setBackgroundColor(i14);
    }

    public void setProgressBackgroundColorSchemeResource(int i14) {
        setProgressBackgroundColorSchemeColor(a7.b.getColor(getContext(), i14));
    }

    public void setRefreshing(boolean z14) {
        if (!z14 || this.f11021c == z14) {
            g(z14, false);
            return;
        }
        this.f11021c = z14;
        setTargetOffsetTopAndBottom((this.f11043z + this.f11042y) - this.f11033n);
        this.I = false;
        this.f11039v.setVisibility(0);
        this.B.setAlpha(255);
        be.e eVar = new be.e(this);
        this.C = eVar;
        eVar.setDuration(this.f11032m);
        a aVar = this.H0;
        if (aVar != null) {
            this.f11039v.f17672a = aVar;
        }
        this.f11039v.clearAnimation();
        this.f11039v.startAnimation(this.C);
    }

    public void setSize(int i14) {
        if (i14 == 0 || i14 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i14 == 0) {
                this.P = (int) (displayMetrics.density * 56.0f);
            } else {
                this.P = (int) (displayMetrics.density * 40.0f);
            }
            this.f11039v.setImageDrawable(null);
            this.B.c(i14);
            this.f11039v.setImageDrawable(this.B);
        }
    }

    public void setSlingshotDistance(int i14) {
        this.A = i14;
    }

    public void setTargetOffsetTopAndBottom(int i14) {
        be.a aVar = this.f11039v;
        aVar.bringToFront();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        aVar.offsetTopAndBottom(i14);
        this.f11033n = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i14) {
        return this.f11026h.h(i14, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f11026h.i(0);
    }

    @Override // androidx.core.view.t
    public final void stopNestedScroll(int i14) {
    }

    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f11048a;

        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f11048a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeByte(this.f11048a ? (byte) 1 : (byte) 0);
        }

        public g(Parcelable parcelable, boolean z14) {
            super(parcelable);
            this.f11048a = z14;
        }
    }

    @Override // androidx.core.view.w
    public final void onNestedScrollAccepted(View view2, View view3, int i14, int i15) {
        if (i15 == 0) {
            onNestedScrollAccepted(view2, view3, i14);
        }
    }

    @Override // androidx.core.view.w
    public final boolean onStartNestedScroll(View view2, View view3, int i14, int i15) {
        if (i15 == 0) {
            return onStartNestedScroll(view2, view3, i14);
        }
        return false;
    }

    @Override // androidx.core.view.w
    public final void onStopNestedScroll(View view2, int i14) {
        if (i14 == 0) {
            onStopNestedScroll(view2);
        }
    }

    @Override // androidx.core.view.w
    public final void onNestedPreScroll(View view2, int i14, int i15, int[] iArr, int i16) {
        if (i16 == 0) {
            onNestedPreScroll(view2, i14, i15, iArr);
        }
    }

    @Override // androidx.core.view.w
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18) {
        onNestedScroll(view2, i14, i15, i16, i17, i18, this.f11029k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17) {
        onNestedScroll(view2, i14, i15, i16, i17, 0, this.f11029k);
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
