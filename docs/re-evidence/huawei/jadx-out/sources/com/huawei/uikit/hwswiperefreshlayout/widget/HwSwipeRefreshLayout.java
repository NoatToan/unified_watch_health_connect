package com.huawei.uikit.hwswiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwswiperefreshlayout.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector;
import defpackage.crd;
import defpackage.crg;
import defpackage.xeh;
import defpackage.xei;
import defpackage.xfs;
import defpackage.xfu;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class HwSwipeRefreshLayout extends FrameLayout implements NestedScrollingParent2, NestedScrollingChild2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29759a;
    private boolean aa;
    private int ab;
    private int ac;
    private boolean ad;
    private float ae;
    private float af;
    private float ag;
    private float ah;
    private float ai;
    private View aj;
    private String ak;
    private String al;
    private String am;
    private boolean an;
    private boolean ao;
    private Callback ap;
    private int aq;
    private int ar;
    private Context as;
    private NestedScrollingParentHelper au;
    private NestedScrollingChildHelper av;
    private int ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AnimatorSet f29760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29761c;
    private int d;
    private AnimatorSet e;
    private int f;
    private boolean g;
    private HwLinkageViewInfoCallBack h;
    private int i;
    private HwOverSwipeRefreshListener j;
    private boolean k;
    private HwGenericEventDetector l;
    private boolean m;
    private boolean n;
    private boolean o;
    private Runnable p;
    private c q;
    private ViewTreeObserver r;
    private int s;
    private int t;
    private View u;
    private final int[] v;
    private HwRefreshHeadView w;
    private HwBottomRefreshCallBack x;
    private ViewTreeObserver.OnScrollChangedListener y;
    private int z;

    public interface Callback {
        boolean isEnabled();

        boolean needToWait();

        void onRefreshStart();

        void onScrollUp();
    }

    class a implements HwGenericEventDetector.OnScrollListener {
        private long e = 0;

        a() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector.OnScrollListener
        public boolean onScrollBy(float f, float f2, MotionEvent motionEvent) {
            if (HwSwipeRefreshLayout.this.i()) {
                return true;
            }
            if (HwSwipeRefreshLayout.this.a(-1)) {
                this.e = SystemClock.uptimeMillis();
                HwSwipeRefreshLayout.this.t = 0;
                return false;
            }
            if (!HwSwipeRefreshLayout.this.a(-1) && Float.compare(f2, 0.0f) > 0) {
                this.e = SystemClock.uptimeMillis();
                HwSwipeRefreshLayout.this.t = 0;
                return false;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.e < 150) {
                this.e = jUptimeMillis;
                return true;
            }
            if (HwSwipeRefreshLayout.this.t == 0) {
                HwSwipeRefreshLayout.this.t++;
                HwSwipeRefreshLayout hwSwipeRefreshLayout = HwSwipeRefreshLayout.this;
                hwSwipeRefreshLayout.postDelayed(hwSwipeRefreshLayout.p, 150L);
                return false;
            }
            HwSwipeRefreshLayout hwSwipeRefreshLayout2 = HwSwipeRefreshLayout.this;
            hwSwipeRefreshLayout2.removeCallbacks(hwSwipeRefreshLayout2.p);
            if (HwSwipeRefreshLayout.this.q == null) {
                return false;
            }
            HwSwipeRefreshLayout.this.q.a();
            return true;
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            HwSwipeRefreshLayout.this.d(valueAnimator);
        }
    }

    /* JADX INFO: loaded from: classes44.dex */
    class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29764c;
        private OverScroller d;
        private Interpolator e;

        c() {
            this.e = AnimationUtils.loadInterpolator(HwSwipeRefreshLayout.this.getContext(), R.interpolator.cubic_bezier_interpolator_type_20_80);
            this.d = new OverScroller(HwSwipeRefreshLayout.this.getContext(), this.e);
        }

        private void b() {
            HwSwipeRefreshLayout.this.t = 0;
            this.f29764c = false;
            OverScroller overScroller = this.d;
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            this.d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller = this.d;
            if (overScroller == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                b();
                return;
            }
            float fB = HwSwipeRefreshLayout.this.b(this.d.getCurrY());
            int iB = HwSwipeRefreshLayout.this.b(fB);
            if (((int) HwSwipeRefreshLayout.this.af) <= iB) {
                HwSwipeRefreshLayout.this.c(fB, iB);
                b();
                HwSwipeRefreshLayout.this.s();
            } else if (((int) HwSwipeRefreshLayout.this.ah) >= iB) {
                HwSwipeRefreshLayout.this.b(fB, iB);
                HwSwipeRefreshLayout.this.postOnAnimation(this);
            } else if (HwSwipeRefreshLayout.this.aa) {
                Log.w("HwSwipeRefreshLayout", "GenericRefreshScroller: the state with Refreshing");
            } else {
                HwSwipeRefreshLayout.this.d(fB, iB);
                HwSwipeRefreshLayout.this.postOnAnimation(this);
            }
            HwSwipeRefreshLayout.this.requestLayout();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            OverScroller overScroller = this.d;
            if (overScroller == null) {
                return;
            }
            if (!overScroller.isFinished()) {
                this.d.abortAnimation();
            }
            this.f29764c = true;
            this.d.startScroll(0, 0, 0, (int) HwSwipeRefreshLayout.this.af, 250);
            HwSwipeRefreshLayout.this.postOnAnimation(this);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HwSwipeRefreshLayout.this.e = null;
            HwSwipeRefreshLayout hwSwipeRefreshLayout = HwSwipeRefreshLayout.this;
            hwSwipeRefreshLayout.setScrollY(-((int) hwSwipeRefreshLayout.af));
            if (!HwSwipeRefreshLayout.this.an && HwSwipeRefreshLayout.this.ap != null) {
                HwSwipeRefreshLayout.this.setPullState(4444);
                HwSwipeRefreshLayout.this.ap.onRefreshStart();
            }
            HwSwipeRefreshLayout.this.k = true;
            HwSwipeRefreshLayout.this.ad = false;
        }
    }

    class e implements ViewTreeObserver.OnScrollChangedListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (HwSwipeRefreshLayout.this.i() || HwSwipeRefreshLayout.this.x == null || HwSwipeRefreshLayout.this.a(1)) {
                return;
            }
            HwSwipeRefreshLayout.this.x.onRefresh();
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HwSwipeRefreshLayout.this.w.setProgressBarVisibility(4);
            HwSwipeRefreshLayout.this.aa = false;
            HwSwipeRefreshLayout.this.an = false;
            HwSwipeRefreshLayout.this.ar = 0;
            HwSwipeRefreshLayout.this.ab = -1;
            HwSwipeRefreshLayout.this.q();
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            HwSwipeRefreshLayout.this.d(valueAnimator);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.w("HwSwipeRefreshLayout", "onAnimationUpdate: the input animation is null!");
            } else {
                HwSwipeRefreshLayout.this.e(valueAnimator);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HwSwipeRefreshLayout.this.f29760b = null;
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwSwipeRefreshLayout.this.t = 0;
        }
    }

    public HwSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private int getLinkedState() {
        HwLinkageViewInfoCallBack hwLinkageViewInfoCallBack = this.h;
        if (hwLinkageViewInfoCallBack == null || !hwLinkageViewInfoCallBack.hasLinkageView()) {
            return -1;
        }
        return this.h.getLinkageViewState();
    }

    private int getPullState() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        requestLayout();
    }

    private void setCallBackInObserver(View view) {
        if (this.r != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.r = viewTreeObserver;
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(this.y);
        }
    }

    private void setNoRefreshBackLine(float f2) {
        int i2 = (int) f2;
        if (((int) this.ah) < i2) {
            setRefreshingBarAppearLine(i2);
        } else {
            this.w.setProgressBarVisibility(4);
        }
        if (((int) this.ag) <= i2) {
            setTextViewAppearLine(i2);
        } else {
            this.w.setTextViewVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPullState(int i2) {
        this.d = i2;
    }

    private void setRefreshingBarAppearLine(float f2) {
        int i2 = (int) f2;
        float f3 = this.af;
        if (i2 > ((int) f3)) {
            f2 = f3;
        }
        float f4 = this.ah;
        float f5 = (f2 - f4) / (f3 - f4);
        float f6 = (f5 * 0.5f) + 0.5f;
        this.w.setProgressBarVisibility(0);
        this.w.setProgressBarAlpha(f5);
        this.w.setProgressBarDragFraction(f5);
        this.w.setProgressBarScaleX(f6);
        this.w.setProgressBarScaleY(f6);
        this.w.setProgressBarScaleSize((int) (this.ax * f6));
    }

    private void setTextViewAppearLine(float f2) {
        int i2 = (int) f2;
        float f3 = this.ae;
        if (i2 > ((int) f3)) {
            f2 = f3;
        }
        float f4 = this.ag;
        float f5 = (f2 - f4) / (f3 - f4);
        if (this.an) {
            this.w.setTextViewText(this.am);
        } else {
            this.w.setTextViewText(this.al);
        }
        if (this.g) {
            this.w.setTextViewVisibility(0);
        }
        this.w.setTextViewAlpha(f5);
    }

    private void setValueFromPlume(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            return;
        }
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, this, "scrollToRefreshEnabled", Boolean.TRUE});
        if (objC instanceof Boolean) {
            setExtendScrollEnabled(((Boolean) objC).booleanValue());
        }
    }

    private void t() {
        this.ad = true;
        crd crdVar = new crd(250.0f, 30.0f, Math.abs(getScrollY()));
        this.w.setProgressBarAlpha(1.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "ScrollY", -((int) this.af));
        objectAnimatorOfInt.setInterpolator(crdVar);
        objectAnimatorOfInt.setDuration((long) crdVar.getDuration());
        objectAnimatorOfInt.addUpdateListener(new h());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new d());
        b(objectAnimatorOfInt, animatorSet);
    }

    public void a() {
        b();
    }

    public void b() {
        if (!this.aa || this.an) {
            Log.w("HwSwipeRefreshLayout", "not refreshing = " + this.aa + " mIsStartBackAnimating = " + this.an);
            return;
        }
        if (this.w == null || this.u == null) {
            return;
        }
        setPullState(5555);
        this.an = true;
        int scrollY = getScrollY();
        if (this.e != null) {
            Log.w("HwSwipeRefreshLayout", "startFinishRefreshingAnim: mStartUpAnimatorSet != null");
            this.e.cancel();
        }
        if (scrollY > 0 && this.aa) {
            n();
        } else {
            this.f29759a = (int) getTranslationY();
            n();
        }
    }

    protected HwGenericEventDetector c() {
        return new HwGenericEventDetector(getContext());
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.n) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        HwGenericEventDetector hwGenericEventDetector = this.l;
        if (hwGenericEventDetector == null || !hwGenericEventDetector.c(motionEvent)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.av.dispatchNestedPreScroll(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return this.av.dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Boolean boolE;
        if (this.m) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent == null) {
            Log.w("HwSwipeRefreshLayout", "dispatchTouchEvent: the input event is null");
            return false;
        }
        if (motionEvent.getActionMasked() == 0 && this.an) {
            return true;
        }
        HwLinkageViewInfoCallBack hwLinkageViewInfoCallBack = this.h;
        boolean z = hwLinkageViewInfoCallBack != null && hwLinkageViewInfoCallBack.hasLinkageView();
        int linkageViewState = z ? this.h.getLinkageViewState() : -1;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.o = false;
        } else if (actionMasked == 2 && (boolE = e(motionEvent, z, linkageViewState)) != null) {
            return boolE.booleanValue();
        }
        this.s = linkageViewState;
        return super.dispatchTouchEvent(motionEvent);
    }

    protected HwGenericEventDetector.OnScrollListener e() {
        return new a();
    }

    public HwBottomRefreshCallBack getBottomRefreshCallBack() {
        return this.x;
    }

    public HwLinkageViewInfoCallBack getLinkageViewInfoCallBack() {
        return this.h;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.au.getNestedScrollAxes();
    }

    public HwOverSwipeRefreshListener getOverSwipeRefreshListener() {
        return this.j;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i2) {
        return this.av.hasNestedScrollingParent(i2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.av.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (configuration == null) {
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent == null) {
            Log.w("HwSwipeRefreshLayout", "onInterceptTouchEvent: the input event is null");
            return false;
        }
        if (this.an) {
            this.z = (int) motionEvent.getRawY();
            return false;
        }
        if (a(motionEvent)) {
            return false;
        }
        if ((motionEvent.getActionMasked() == 2 && this.ao) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        Callback callback = this.ap;
        if (callback != null && !callback.isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (c(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredWidth = getMeasuredWidth();
        g();
        if (this.u != null && this.w != null && this.ap != null) {
            int paddingLeft = getPaddingLeft();
            this.w.layout(paddingLeft, (0 - getPaddingTop()) - this.ar, measuredWidth + paddingLeft, 0);
        } else {
            Log.w("HwSwipeRefreshLayout", "onLayout view is null mChildView = " + this.u + ", mHeaderView = " + this.w);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        g();
        if (this.u == null || this.w == null || this.ap == null) {
            Log.w("HwSwipeRefreshLayout", "onMeasure view is null!");
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = (this.ar - getPaddingTop()) - getPaddingBottom();
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        this.w.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        d(view, i2, i3, iArr, i4);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        e(view, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        this.au.onNestedScrollAccepted(view, view2, i2, i3);
        startNestedScroll(i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i2) {
        stopNestedScroll(0);
        this.au.onStopNestedScroll(view, i2);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x006a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.m) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent == null) {
            Log.w("HwSwipeRefreshLayout", "onTouchEvent(): MotionEvent can not be null!");
            return false;
        }
        if (this.w == null || this.u == null) {
            Log.w("HwSwipeRefreshLayout", "onTouchEvent view is null mChildView = " + this.u + ", mHeaderView = " + this.w);
            return super.onTouchEvent(motionEvent);
        }
        if (this.an || this.ad) {
            return false;
        }
        Callback callback = this.ap;
        if (callback != null && !callback.isEnabled()) {
            Log.w("HwSwipeRefreshLayout", "onTouchEvent: don't isEnabled");
            return super.onTouchEvent(motionEvent);
        }
        int actionIndex = motionEvent.getActionIndex();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            startNestedScroll(2, 0);
            b(actionIndex, motionEvent);
            setPullState(1111);
        } else if (actionMasked == 1) {
            this.f29759a = (int) getTranslationY();
            j(actionIndex);
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f29759a = (int) getTranslationY();
                j(actionIndex);
            } else if (actionMasked == 5) {
                b(actionIndex, motionEvent);
                setPullState(1111);
            } else if (actionMasked == 6) {
                o();
            }
        } else if (a(actionIndex, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        int i4 = this.ar;
        if (this.u.canScrollVertically(1) && i3 > i4) {
            i3 = i4 - this.f29761c;
        }
        if (this.u.canScrollVertically(-1)) {
            Log.w("HwSwipeRefreshLayout", "scrollTo: y = " + i3);
        }
        if (i3 <= i4) {
            i4 = i3;
        }
        super.scrollTo(i2, i4);
    }

    public void setBottomRefreshCallBack(HwBottomRefreshCallBack hwBottomRefreshCallBack) {
        l();
        this.x = hwBottomRefreshCallBack;
        if (hwBottomRefreshCallBack != null) {
            d();
        }
    }

    public void setCallback(Callback callback) {
        this.ap = callback;
    }

    public void setCanRefreshText(String str) {
        this.ak = str;
    }

    public void setContentView(View view) {
        if (view != null) {
            this.u = view;
        } else {
            Log.w("HwSwipeRefreshLayout", "setContentView: you add a null view");
        }
    }

    public void setExtendScrollEnabled(boolean z) {
        this.n = z;
    }

    public void setIsShowText(boolean z) {
        int dimensionPixelSize;
        this.g = z;
        if (z) {
            this.ai = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_max_position);
            this.af = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_end_position);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_text_margin_bottom);
        } else {
            this.ai = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_max_position_no_text);
            this.af = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_end_position_no_text);
            dimensionPixelSize = 0;
        }
        HwRefreshHeadView hwRefreshHeadView = this.w;
        if (hwRefreshHeadView != null) {
            hwRefreshHeadView.b(dimensionPixelSize);
        }
    }

    public void setLinkageViewInfoCallBack(HwLinkageViewInfoCallBack hwLinkageViewInfoCallBack) {
        this.h = hwLinkageViewInfoCallBack;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.av.setNestedScrollingEnabled(z);
    }

    public void setOverSwipeRefreshListener(HwOverSwipeRefreshListener hwOverSwipeRefreshListener) {
        this.j = hwOverSwipeRefreshListener;
    }

    public void setProgressBarColor(int i2) {
        HwRefreshHeadView hwRefreshHeadView = this.w;
        if (hwRefreshHeadView == null) {
            return;
        }
        hwRefreshHeadView.setProgressBarColor(i2);
    }

    public void setPullDownText(String str) {
        this.al = str;
    }

    public void setRefreshPushText(String str) {
        this.am = str;
        h();
    }

    public void setScrollView(View view) {
        this.aj = view;
    }

    public void setSwipeRefreshLayoutDisabled(boolean z) {
        this.m = z;
    }

    public void setTextColor(int i2) {
        HwRefreshHeadView hwRefreshHeadView = this.w;
        if (hwRefreshHeadView == null) {
            return;
        }
        hwRefreshHeadView.setTextViewColor(i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i2, int i3) {
        return this.av.startNestedScroll(i2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i2) {
        this.av.stopNestedScroll(i2);
    }

    public HwSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwSwipeRefreshLayoutStyle);
    }

    private void j(int i2) {
        Callback callback;
        if (i2 < 0) {
            Log.w("HwSwipeRefreshLayout", "upOrCancelTouch: index Error");
            return;
        }
        this.ao = false;
        int pullState = getPullState();
        if (pullState == 6666 && (callback = this.ap) != null && callback.needToWait()) {
            if (this.e != null) {
                Log.w("HwSwipeRefreshLayout", "upOrCancelTouch: mStartUpAnimatorSet != null");
                this.e.cancel();
            }
            this.aa = true;
            setPullState(3333);
            t();
            this.w.c();
        } else if (pullState != 4444 && pullState != 3333) {
            AnimatorSet animatorSet = this.f29760b;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            r();
            this.w.a();
        }
        Callback callback2 = this.ap;
        if (callback2 != null) {
            callback2.onScrollUp();
        }
    }

    private void k() {
        if (this.g) {
            this.w.setTextViewVisibility(0);
        }
        this.w.setTextViewAlpha(1.0f);
    }

    private void m() {
        this.w.setProgressBarVisibility(0);
        this.w.setProgressBarAlpha(1.0f);
        this.w.setProgressBarScaleX(1.0f);
        this.w.setProgressBarScaleY(1.0f);
        this.w.setProgressBarDragFraction(1.0f);
        this.w.setProgressBarScaleSize((int) (this.ax * 1.0f));
    }

    private void n() {
        int scrollY = getScrollY();
        if (scrollY == 0) {
            Log.w("HwSwipeRefreshLayout", "startBackAnim: the endPosition is in the initial position");
        }
        crd crdVar = new crd(999.0f, 59.99f, Math.abs(scrollY));
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "ScrollY", 0);
        objectAnimatorOfInt.setTarget(this);
        objectAnimatorOfInt.setInterpolator(crdVar);
        objectAnimatorOfInt.setDuration((long) crdVar.getDuration());
        AnimatorSet animatorSet = new AnimatorSet();
        objectAnimatorOfInt.addUpdateListener(new b());
        animatorSet.addListener(new f());
        animatorSet.play(objectAnimatorOfInt);
        animatorSet.start();
    }

    private void o() {
        this.ab = -1;
        this.ac = 0;
        this.z = 0;
    }

    private void r() {
        crd crdVar = new crd(250.0f, 30.0f, Math.abs(getScrollY()));
        setPullState(2222);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "ScrollY", 0);
        objectAnimatorOfInt.setInterpolator(crdVar);
        objectAnimatorOfInt.setDuration((long) crdVar.getDuration());
        objectAnimatorOfInt.addUpdateListener(new g());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfInt);
        animatorSet.addListener(new i());
        this.f29760b = animatorSet;
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        Callback callback;
        int pullState = getPullState();
        if (pullState == 6666 && (callback = this.ap) != null && callback.needToWait()) {
            if (this.e != null) {
                Log.w("HwSwipeRefreshLayout", "upOrCancelTouch: mStartUpAnimatorSet != null");
                this.e.cancel();
            }
            this.aa = true;
            setPullState(3333);
            t();
        } else if (pullState != 4444 && pullState != 3333) {
            AnimatorSet animatorSet = this.f29760b;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            r();
        }
        Callback callback2 = this.ap;
        if (callback2 != null) {
            callback2.onScrollUp();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5);
    }

    public HwSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i2) {
        super(a(context, i2), attributeSet, i2);
        this.v = new int[2];
        this.d = 1111;
        this.k = true;
        this.n = true;
        this.m = false;
        this.o = false;
        this.s = -1;
        this.p = new j();
        this.q = new c();
        this.r = null;
        this.y = new e();
        e(getContext(), attributeSet, i2);
    }

    private void g() {
        if (this.u != null) {
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && !childAt.equals(this.w) && ((childAt instanceof AbsListView) || (childAt instanceof ScrollView) || (childAt instanceof RecyclerView))) {
                this.u = childAt;
                if (this.x != null) {
                    setCallBackInObserver(childAt);
                    return;
                }
                return;
            }
        }
    }

    private void j() {
        this.ai = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_max_position);
        this.af = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_end_position);
        this.ah = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_appear_position);
        this.ag = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_text_appear_position);
        this.ae = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_text_end_position);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.au.onNestedScrollAccepted(view, view2, i2);
        startNestedScroll(i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        stopNestedScroll(0);
        this.au.onStopNestedScroll(view);
    }

    private float d(int i2) {
        float fI = i(i2);
        float f2 = this.ai;
        if (f2 <= fI) {
            fI = f2;
        }
        return 0.0f - fI;
    }

    private void f(int i2) {
        HwOverSwipeRefreshListener hwOverSwipeRefreshListener;
        HwLinkageViewInfoCallBack hwLinkageViewInfoCallBack = this.h;
        if (hwLinkageViewInfoCallBack == null || !hwLinkageViewInfoCallBack.hasLinkageView() || (hwOverSwipeRefreshListener = this.j) == null) {
            return;
        }
        hwOverSwipeRefreshListener.onTopOverSwipeRefresh(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return this.aa || this.an || this.ad || this.q.f29764c;
    }

    private int f() {
        return (int) TypedValue.applyDimension(1, 8.0f, this.as.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i2) {
        Boolean boolD;
        View view = this.u;
        if (view == null && this.aj == null) {
            return false;
        }
        View view2 = this.aj;
        if (view2 == null) {
            return view.canScrollVertically(i2);
        }
        if (view2 instanceof AbsListView) {
            if (i2 == -1) {
                boolD = d("canScrollUp");
            } else {
                boolD = i2 == 1 ? d("canScrollDown") : null;
            }
            if (boolD != null) {
                return boolD.booleanValue();
            }
        }
        return this.aj.canScrollVertically(i2);
    }

    private boolean a(MotionEvent motionEvent) {
        HwLinkageViewInfoCallBack hwLinkageViewInfoCallBack = this.h;
        return (hwLinkageViewInfoCallBack == null || !hwLinkageViewInfoCallBack.hasLinkageView() || motionEvent.getAction() == 0 || motionEvent.getAction() == 5 || this.h.getLinkageViewState() == 0) ? false : true;
    }

    private static Context a(Context context, int i2) {
        return xfs.c(context, i2, R.style.Theme_Emui_HwSwipeRefreshLayout);
    }

    private Boolean d(String str) {
        try {
            Object objB = xeh.b(this.aj, str, null, null, Class.forName("android.widget.AbsListView"));
            if (objB instanceof Boolean) {
                return (Boolean) objB;
            }
            return null;
        } catch (ClassNotFoundException unused) {
            Log.e("HwSwipeRefreshLayout", "canChildScrollVertically() ClassNotFoundException");
            return null;
        } catch (IllegalArgumentException unused2) {
            Log.e("HwSwipeRefreshLayout", "canChildScrollVertically() IllegalArgumentException");
            return null;
        } catch (SecurityException unused3) {
            Log.e("HwSwipeRefreshLayout", "canChildScrollVertically() SecurityException");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f2, int i2) {
        scrollBy(0, (int) f2);
        this.ar = i2;
        float f3 = i2;
        setRefreshingBarAppearLine(f3);
        setPullState(1111);
        this.w.setTextViewVisibility(4);
        if (((int) this.ag) <= i2) {
            setTextViewAppearLine(f3);
        }
    }

    private float i(int i2) {
        int iB = b(i2, this.z);
        int[] iArr = this.v;
        iArr[0] = 0;
        iArr[1] = 0;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        float fB = b(0 - (0 - iB), Math.abs(getScrollY()), (int) (getHeight() * 0.5f));
        this.z = i2;
        return fB;
    }

    private float c(int i2) {
        return b(i2, Math.abs(getScrollY()), (int) (getHeight() * 0.5f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float b(int i2) {
        float fC = c(i2);
        float f2 = this.ai;
        if (f2 <= fC) {
            fC = f2;
        }
        if (this.af > (-getScrollY())) {
            return -fC;
        }
        return 0.0f;
    }

    private Boolean e(MotionEvent motionEvent, boolean z, int i2) {
        if (!z || i2 != 0 || this.aa || !onInterceptTouchEvent(motionEvent)) {
            return null;
        }
        if (!this.o) {
            motionEvent.setAction(3);
            this.o = true;
            return Boolean.valueOf(super.dispatchTouchEvent(motionEvent));
        }
        if (this.s != 0) {
            this.z = (int) motionEvent.getRawY();
            this.s = i2;
        }
        return Boolean.valueOf(onTouchEvent(motionEvent));
    }

    private void l() {
        ViewTreeObserver viewTreeObserver = this.r;
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnScrollChangedListener(this.y);
            this.r = null;
        }
    }

    private boolean e(MotionEvent motionEvent) {
        int rawY = (int) motionEvent.getRawY();
        if (this.z == 0) {
            this.z = rawY;
        }
        int i2 = rawY - this.z;
        int iAbs = Math.abs(i2);
        int i3 = this.aq;
        if (iAbs > i3 && i2 > i3 && !a(-1) && !this.an) {
            this.z = rawY;
            if (!this.aa) {
                this.ao = true;
                return true;
            }
            if (getScrollY() != (-((int) this.af))) {
                return false;
            }
            this.ao = true;
            return true;
        }
        this.ao = false;
        return false;
    }

    private boolean c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            startNestedScroll(2, 0);
            b(actionIndex, motionEvent);
        } else if (actionMasked == 1) {
            this.ab = -1;
            if (this.ao) {
                return true;
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.ab = -1;
            } else if (actionMasked == 5) {
                b(actionIndex, motionEvent);
            } else if (actionMasked == 6) {
                o();
            }
        } else if (e(motionEvent)) {
            return true;
        }
        return false;
    }

    private boolean a(int i2, MotionEvent motionEvent) {
        if (i2 < 0) {
            return false;
        }
        int rawY = (int) motionEvent.getRawY();
        int x = (int) motionEvent.getX();
        if (this.z == 0 && this.ac == 0) {
            this.z = rawY;
            this.ac = x;
        }
        if (((int) this.af) > Math.abs(getScrollY())) {
            this.k = true;
        }
        int iB = b(rawY, this.z);
        float fD = d(rawY);
        int iC = c(fD);
        f(iC);
        if (e(0 - iB, getLinkedState())) {
            return true;
        }
        this.w.a();
        if (((int) this.af) <= iC) {
            if (isHapticFeedbackEnabled() && this.k) {
                xei.c(this, 1, 0);
                this.k = false;
            }
            c(fD, iC);
        } else if (((int) this.ah) < iC) {
            if (!this.aa) {
                d(fD, iC);
            } else {
                this.k = false;
                Log.w("HwSwipeRefreshLayout", "onActionMoveTouch: the state with Refreshing");
            }
        } else {
            b(fD, iC);
        }
        requestLayout();
        return true;
    }

    private void b(int i2, MotionEvent motionEvent) {
        this.ab = motionEvent.getPointerId(i2);
        this.ac = (int) motionEvent.getX();
        this.z = (int) motionEvent.getRawY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f2, int i2) {
        int i3 = (int) f2;
        if (getScrollY() + i3 >= 0) {
            scrollBy(0, -getScrollY());
            this.ar = 0;
        } else {
            scrollBy(0, i3);
            this.ar = i2;
        }
        this.w.setProgressBarVisibility(4);
        this.w.setTextViewVisibility(4);
        setPullState(1111);
    }

    private int c(float f2) {
        return 0 - ((int) (getScrollY() + f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f2, int i2) {
        scrollBy(0, (int) f2);
        this.ar = i2;
        m();
        this.w.setTextViewText(this.ak);
        k();
        setPullState(6666);
    }

    private void e(Context context, AttributeSet attributeSet, int i2) {
        this.as = context;
        this.aq = ViewConfiguration.get(context).getScaledTouchSlop();
        this.ax = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_size);
        this.e = null;
        this.f29760b = null;
        this.f29761c = 0;
        this.f29759a = 0;
        this.aa = false;
        this.an = false;
        this.ad = false;
        this.ao = false;
        this.ab = -1;
        this.h = null;
        this.j = null;
        this.au = new NestedScrollingParentHelper(this);
        this.av = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        o();
        j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwSwipeRefreshLayout, i2, R.style.Widget_Emui_HwSwipeRefreshLayout);
        this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.HwSwipeRefreshLayout_hwSwipeRefreshProgressBarColor, ContextCompat.getColor(getContext(), R.color.emui_color_progress));
        this.i = typedArrayObtainStyledAttributes.getColor(R.styleable.HwSwipeRefreshLayout_hwSwipeRefreshTextColor, ContextCompat.getColor(getContext(), R.color.emui_color_text_secondary));
        this.al = typedArrayObtainStyledAttributes.getString(R.styleable.HwSwipeRefreshLayout_hwSwipeRefreshPullDownText);
        this.am = typedArrayObtainStyledAttributes.getString(R.styleable.HwSwipeRefreshLayout_hwSwipeRefreshRefreshingText);
        this.ak = typedArrayObtainStyledAttributes.getString(R.styleable.HwSwipeRefreshLayout_hwSwipeRefreshCanRefreshText);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwSwipeRefreshLayout_hwIsShowText, true);
        typedArrayObtainStyledAttributes.recycle();
        setIsShowText(z);
        h();
        HwGenericEventDetector hwGenericEventDetectorC = c();
        this.l = hwGenericEventDetectorC;
        if (hwGenericEventDetectorC != null) {
            hwGenericEventDetectorC.c(this, e());
        }
        e(R.layout.hwswiperefreshlayout_headview_layout);
        setValueFromPlume(context);
    }

    private boolean e(int i2, int i3) {
        if (i2 > 0 && getScrollY() == 0 && i3 != -1) {
            HwOverSwipeRefreshListener hwOverSwipeRefreshListener = this.j;
            if (hwOverSwipeRefreshListener != null) {
                hwOverSwipeRefreshListener.onTopOverSwipeRefresh(0);
            }
            startNestedScroll(2, 0);
            if (dispatchNestedPreScroll(0, i2, new int[2], new int[2], 0)) {
                return true;
            }
        }
        if (i2 < 0 && i3 != 0 && i3 != -1) {
            HwOverSwipeRefreshListener hwOverSwipeRefreshListener2 = this.j;
            if (hwOverSwipeRefreshListener2 != null) {
                hwOverSwipeRefreshListener2.onTopOverSwipeRefresh(0);
            }
            startNestedScroll(2, 0);
            if (dispatchNestedScroll(0, 0, 0, i2, new int[2], 0)) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        Context context = this.as;
        if (context == null) {
            Log.w("HwSwipeRefreshLayout", "Context is null.");
            return;
        }
        if (this.am == null) {
            Log.w("HwSwipeRefreshLayout", "Refreshing text is null.");
            return;
        }
        boolean zC = xfu.c(context);
        if (this.g && zC && Float.compare(xfu.d(this.as), 1.75f) >= 0) {
            HwTextView textView = this.w.getTextView();
            if (textView == null) {
                Log.w("HwSwipeRefreshLayout", "HwTextView is null.");
                return;
            }
            textView.setMaxLines(2);
            textView.setText(this.am);
            e(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(HwTextView hwTextView) {
        int lineHeight = hwTextView.getLineHeight();
        int lineCount = hwTextView.getLineCount();
        Log.i("HwSwipeRefreshLayout", " textLineHeight: " + lineHeight + " textLineCount: " + lineCount);
        int iF = ((lineHeight * (lineCount + (-1))) + f()) * 2;
        this.ai = (float) (getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_max_position) + iF);
        this.af = (float) (getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_end_position) + iF);
        this.ah = (float) (getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_progressbar_appear_position) + iF);
        this.ag = getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_text_appear_position) + iF;
        this.ae = iF + getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_text_end_position);
    }

    private void e(final HwTextView hwTextView) {
        hwTextView.post(new Runnable() { // from class: xge
            @Override // java.lang.Runnable
            public final void run() {
                this.f52871a.a(hwTextView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ValueAnimator valueAnimator) {
        int iIntValue = 0 - ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float f2 = iIntValue;
        if (((int) Math.abs(f2 - this.af)) == 0) {
            f2 = this.af;
            if (this.e != null) {
                setScrollY(-((int) f2));
            }
        }
        f(iIntValue);
        this.ar = (int) f2;
        m();
        this.w.setTextViewText(this.am);
        k();
        q();
    }

    private void e(int i2) {
        this.ar = 0;
        HwRefreshHeadView hwRefreshHeadView = (HwRefreshHeadView) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i2, (ViewGroup) this, true).findViewById(R.id.hwswiperefreshlayout_headview);
        this.w = hwRefreshHeadView;
        hwRefreshHeadView.d(this.as);
        setProgressBarColor(this.f);
        setTextColor(this.i);
        if (!this.g) {
            this.w.b(0);
        } else {
            this.w.b(getResources().getDimensionPixelSize(R.dimen.hwswiperefreshlayout_text_margin_bottom));
        }
    }

    private float b(int i2, int i3, int i4) {
        return i2 * new crg(i4).getRate(i3);
    }

    private int b(int i2, int i3) {
        int i4 = i2 - i3;
        if (this.ao) {
            return i4;
        }
        int iAbs = Math.abs(i4);
        int i5 = this.aq;
        if (iAbs <= i5) {
            return i4;
        }
        this.ao = true;
        return i4 > 0 ? i4 - i5 : i4 + i5;
    }

    private void d(View view, int i2, int i3, int[] iArr, int i4) {
        startNestedScroll(2, 0);
        int i5 = this.ar;
        HwLinkageViewInfoCallBack hwLinkageViewInfoCallBack = this.h;
        if (hwLinkageViewInfoCallBack != null && hwLinkageViewInfoCallBack.hasLinkageView() && this.h.getLinkageViewState() == 2 && i3 > 0) {
            e(view);
        }
        if (this.ad) {
            iArr[0] = 0;
            iArr[1] = i3;
            return;
        }
        if (i3 > 0) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            if (i5 > 0 && getScrollY() < 0) {
                int i6 = -getScrollY();
                if (getScrollY() + i3 >= 0) {
                    scrollBy(0, -getScrollY());
                    f(0);
                } else {
                    scrollBy(0, i3);
                    f(i6);
                }
                iArr[0] = 0;
                iArr[1] = i3;
                return;
            }
            if (dispatchNestedPreScroll(0, i3, iArr2, iArr3, 0)) {
                if (!this.an) {
                    this.z -= i3;
                }
                iArr[0] = 0;
                iArr[1] = i3;
            }
        }
    }

    private void e(View view, int i2, int i3, int i4, int i5) {
        int linkageViewState;
        startNestedScroll(2, 0);
        int i6 = this.ar;
        HwLinkageViewInfoCallBack hwLinkageViewInfoCallBack = this.h;
        boolean z = hwLinkageViewInfoCallBack != null && hwLinkageViewInfoCallBack.hasLinkageView();
        if (z) {
            linkageViewState = this.h.getLinkageViewState();
            if (linkageViewState == 0 && i6 == 0) {
                e(view);
            }
        } else {
            linkageViewState = -1;
        }
        if (!z && Math.abs(getScrollY()) == i6) {
            e(view);
        }
        boolean z2 = i5 < 0;
        if (z2 && linkageViewState != 0 && !this.an && linkageViewState != -1) {
            if (!dispatchNestedScroll(0, 0, 0, i5, new int[2], 0) || this.an) {
                return;
            }
            this.z -= i5;
            return;
        }
        if (z2) {
            if (linkageViewState == 0 || linkageViewState == -1) {
                int scrollY = getScrollY();
                int i7 = -scrollY;
                f(i7);
                if (i7 == i6) {
                    e(view);
                }
                if (i7 < i6) {
                    if (Math.abs(scrollY + i5) >= i6) {
                        scrollBy(0, -(i6 + scrollY));
                    } else {
                        scrollBy(0, i5);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(View view) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).stopNestedScroll(1);
        }
    }

    private void b(ObjectAnimator objectAnimator, AnimatorSet animatorSet) {
        animatorSet.play(objectAnimator);
        this.e = animatorSet;
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            Log.w("HwSwipeRefreshLayout", "onAnimationUpdate: the input animation is null");
            return;
        }
        int iIntValue = 0 - ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float f2 = iIntValue;
        this.ar = (int) f2;
        setNoRefreshBackLine(f2);
        f(iIntValue);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(float f2) {
        return (int) ((-getScrollY()) - f2);
    }

    private void d() {
        View view = this.u;
        if (view == null && this.aj == null) {
            Log.w("HwSwipeRefreshLayout", "addChildViewObserver: childView and scrollChildView is null");
            return;
        }
        if (this.r != null || this.x == null) {
            return;
        }
        View view2 = this.aj;
        if (view2 == null) {
            setCallBackInObserver(view);
        } else {
            setCallBackInObserver(view2);
        }
    }
}
