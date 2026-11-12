package com.huawei.uikit.hwviewpager.widget;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import com.huawei.dynamicanimation.DynamicAnimation;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector;
import defpackage.cqx;
import defpackage.cqz;
import defpackage.crd;
import defpackage.crg;
import defpackage.xeh;
import defpackage.xfs;
import defpackage.xft;
import defpackage.xgh;
import defpackage.xgn;
import defpackage.xgp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class HwViewPager extends ViewGroup {
    private static final int A1 = 25;
    private static final int B1 = 16;
    private static final int C1 = 400;
    private static final float D1 = 1.0E-6f;
    private static final int E1 = -1;
    private static final int F1 = 1;
    private static final int G1 = 2;
    private static final int H1 = 0;
    private static final int I1 = 1;
    private static final int J1 = 2;
    private static final int K1 = 1000;
    private static final long L1 = 1000;
    private static final int M1 = 4;
    private static final boolean N1 = false;
    private static final int O1 = 2;
    private static final int P1 = -1;
    public static final int PAGE_SCROLL_HORIZONTAL = 0;
    public static final int PAGE_SCROLL_VERTICAL = 1;
    private static final float Q1 = 1.4f;
    private static final float R1 = 1.4f;
    private static final float S1 = 1.0f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final float T1 = 0.3f;
    private static final int U1 = 2;
    private static final int V1 = 300;
    private static final int W1 = 255;
    private static final int Y1 = 1;
    private static final int Z1 = 2;
    private static final long a2 = 700;
    private static final long b2 = 300;
    private static final String h1 = "HwViewPager";
    private static final int i1 = 15;
    private static final int j1 = 2;
    private static final int k1 = 1;
    private static final int l1 = 10;
    private static final int m1 = 1200;
    private static final float n1 = 228.0f;
    private static final float o1 = 30.0f;
    private static final float p1 = 0.5f;
    private static final float q1 = 0.6f;
    private static final int r1 = 100;
    private static final float s1 = 0.3f;
    private static final float t1 = 2.0f;
    private static final boolean u1 = false;
    private static final boolean v1 = false;
    private static final float w1 = 0.5f;
    private static final float x1 = 0.9f;
    private static final int y1 = 2;
    private static final int z1 = 600;
    private float A;
    private boolean A0;
    private int B;
    private boolean B0;
    private int C;
    private int C0;
    private boolean D;
    private ValueAnimator D0;
    private boolean E;
    private HwPagerAdapter E0;
    private boolean F;
    private xgh F0;
    private boolean G;
    private boolean G0;
    private int H;
    private float H0;
    private boolean I;
    private float I0;
    private boolean J;
    private cqx J0;
    private int K;
    private DynamicAnimation.OnAnimationEndListener K0;
    private int L;
    private DynamicAnimation.OnAnimationUpdateListener L0;
    private int M;
    private HwGenericEventDetector M0;
    private float N;
    private boolean N0;
    private float O;
    private boolean O0;
    private float P;
    private int P0;
    private float Q;
    private ViewGroupOverlay Q0;
    private float R;
    private Drawable R0;
    private int S;
    private int S0;
    private VelocityTracker T;
    private Interpolator T0;
    private int U;
    private int U0;
    private int V;
    private int V0;
    private int W;
    private int W0;
    private int X0;
    private int Y0;
    private int Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HwPagerAdapter f29815a;
    private int a0;
    private boolean a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f29816b;
    private boolean b0;
    private int b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29817c;
    private long c0;
    private e c1;
    private int d;
    private EdgeEffect d0;
    private float d1;
    private int e;
    private EdgeEffect e0;
    private int e1;
    private final ArrayList<e> f;
    private boolean f0;
    private float f1;
    private final e g;
    private boolean g0;
    private final Rect h;
    private boolean h0;
    private final Map<OnPageChangeListener, g> i;
    private int i0;
    private final Runnable j;
    private List<OnPageChangeListener> j0;
    private int k;
    private OnPageChangeListener k0;
    private Parcelable l;
    private OnPageChangeListener l0;
    private ClassLoader m;
    private List<OnAdapterChangeListener> m0;
    private Scroller n;
    private PageTransformer n0;
    private boolean o;
    private int o0;
    private o p;
    private int p0;
    private int q;
    private ArrayList<View> q0;
    private Drawable r;
    private int r0;
    private int s;
    private boolean s0;
    private int t;
    private boolean t0;
    private int u;
    private boolean u0;
    private int v;
    private boolean v0;
    private float w;
    private float w0;
    private float x;
    private float x0;
    private float y;
    private boolean y0;
    private float z;
    private boolean z0;
    static final int[] g1 = {R.attr.layout_gravity};
    private static final int X1 = com.huawei.uikit.hwviewpager.R.color.hwviewpager_shadow_color;
    private static final d c2 = new d();
    private static final Comparator<e> d2 = new m();
    private static final Interpolator e2 = new c();

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(HwViewPager hwViewPager, HwPagerAdapter hwPagerAdapter, HwPagerAdapter hwPagerAdapter2);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public interface PageTransformer {
        void transformPage(View view, float f);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Parcelable f29825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ClassLoader f29826c;

        class d implements Parcelable.ClassLoaderCreator<SavedState> {
            d() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f29824a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f29824a);
            parcel.writeParcelable(this.f29825b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f29824a = parcel.readInt();
            this.f29825b = parcel.readParcelable(classLoader);
            this.f29826c = classLoader;
        }
    }

    class a implements OnApplyWindowInsetsListener {
        private final Rect e = new Rect();

        a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
            if (windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
                return windowInsetsCompatOnApplyWindowInsets;
            }
            Rect rect = this.e;
            rect.left = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetLeft();
            rect.top = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetTop();
            rect.right = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetRight();
            rect.bottom = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetBottom();
            int childCount = HwViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(HwViewPager.this.getChildAt(i), windowInsetsCompatOnApplyWindowInsets);
                rect.left = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                rect.top = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                rect.right = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                rect.bottom = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
            }
            return windowInsetsCompatOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static class b implements OnPageChangeListener {
        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    static class d implements Comparator<View> {
        d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            if (!(view.getLayoutParams() instanceof LayoutParams) || !(view2.getLayoutParams() instanceof LayoutParams)) {
                Log.w(HwViewPager.h1, "compare: view compare is not instance of layout params");
                return 0;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.i;
            if (z != layoutParams2.i) {
                return z ? 1 : -1;
            }
            return layoutParams.f29819b - layoutParams2.f29819b;
        }
    }

    protected static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f29829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f29830c;
        float d;
        Object e;

        protected e() {
        }
    }

    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            HwViewPager.this.R0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
            HwViewPager.this.R0.invalidateSelf();
        }
    }

    class g implements OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f29831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f29832b;
        private int d;
        private final OnPageChangeListener e;
        private boolean i;

        /* synthetic */ g(HwViewPager hwViewPager, OnPageChangeListener onPageChangeListener, m mVar) {
            this(onPageChangeListener);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (HwViewPager.this.s0) {
                return;
            }
            HwPagerAdapter currentAdapter = HwViewPager.this.getCurrentAdapter();
            if (currentAdapter != null) {
                HwViewPager hwViewPager = HwViewPager.this;
                int i2 = hwViewPager.f29816b;
                int iA = ((currentAdapter instanceof xgn) && hwViewPager.t0) ? ((xgn) currentAdapter).a(i2) : i2;
                if (HwViewPager.this.t0 && i != 2 && (i2 <= HwViewPager.this.e || i2 >= currentAdapter.getCount() - HwViewPager.this.d)) {
                    HwViewPager.this.b(iA, false);
                }
            }
            this.e.onPageScrollStateChanged(i);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            int iA;
            if (HwViewPager.this.s0) {
                return;
            }
            HwPagerAdapter currentAdapter = HwViewPager.this.getCurrentAdapter();
            if (currentAdapter != null) {
                if ((currentAdapter instanceof xgn) && HwViewPager.this.t0) {
                    xgn xgnVar = (xgn) currentAdapter;
                    iA = xgnVar.a(i);
                    xgnVar.e();
                } else {
                    currentAdapter.getCount();
                    iA = i;
                }
                if (this.i) {
                    return;
                }
                boolean z = Float.compare(f, 0.0f) == 0 && Float.compare(this.f29832b, 0.0f) == 0;
                boolean z2 = i <= HwViewPager.this.e || i >= currentAdapter.getCount() - HwViewPager.this.d;
                if (HwViewPager.this.t0 && z && z2) {
                    this.i = true;
                    HwViewPager.this.b(iA, false);
                    this.i = false;
                }
                i = iA;
            }
            this.f29832b = f;
            this.d = i;
            this.e.onPageScrolled(i, f, i2);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (HwViewPager.this.s0) {
                return;
            }
            HwPagerAdapter currentAdapter = HwViewPager.this.getCurrentAdapter();
            if ((currentAdapter instanceof xgn) && HwViewPager.this.t0) {
                i = ((xgn) currentAdapter).a(i);
            }
            float f = i;
            if (this.f29831a != f) {
                this.f29831a = f;
                this.e.onPageSelected(i);
            }
        }

        private g(OnPageChangeListener onPageChangeListener) {
            this.f29832b = -1.0f;
            this.f29831a = -1.0f;
            this.i = false;
            this.e = onPageChangeListener;
            this.d = -1;
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            HwViewPager.this.R0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
            HwViewPager.this.R0.invalidateSelf();
        }
    }

    class i extends AccessibilityDelegateCompat {
        i() {
        }

        private boolean a() {
            HwPagerAdapter hwPagerAdapter = HwViewPager.this.f29815a;
            return hwPagerAdapter != null && hwPagerAdapter.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(HwViewPager.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096) {
                HwViewPager hwViewPager = HwViewPager.this;
                if (hwViewPager.f29815a != null) {
                    accessibilityEvent.setItemCount(hwViewPager.getRealCount());
                    accessibilityEvent.setFromIndex(HwViewPager.this.getCurrentItem());
                    accessibilityEvent.setToIndex(HwViewPager.this.getCurrentItem());
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(HwViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(a());
            if ((HwViewPager.this.isPageScrollHorizontal() && HwViewPager.this.canScrollHorizontally(1)) || (!HwViewPager.this.isPageScrollHorizontal() && HwViewPager.this.canScrollVertically(1))) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (!(HwViewPager.this.isPageScrollHorizontal() && HwViewPager.this.canScrollHorizontally(-1)) && (HwViewPager.this.isPageScrollHorizontal() || !HwViewPager.this.canScrollVertically(-1))) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(8192);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!(HwViewPager.this.isPageScrollHorizontal() && HwViewPager.this.canScrollHorizontally(1)) && (HwViewPager.this.isPageScrollHorizontal() || !HwViewPager.this.canScrollVertically(1))) {
                    return false;
                }
                HwViewPager.this.O0 = false;
                HwViewPager hwViewPager = HwViewPager.this;
                hwViewPager.setCurrentItem(hwViewPager.getCurrentItem() + 1);
                HwViewPager.this.O0 = true;
                return true;
            }
            if (i != 8192) {
                return false;
            }
            if (!(HwViewPager.this.isPageScrollHorizontal() && HwViewPager.this.canScrollHorizontally(-1)) && (HwViewPager.this.isPageScrollHorizontal() || !HwViewPager.this.canScrollVertically(-1))) {
                return false;
            }
            HwViewPager.this.O0 = false;
            HwViewPager hwViewPager2 = HwViewPager.this;
            hwViewPager2.setCurrentItem(hwViewPager2.getCurrentItem() - 1);
            HwViewPager.this.O0 = true;
            return true;
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwViewPager.this.setScrollState(0);
            HwViewPager.this.o();
        }
    }

    class m implements Comparator<e> {
        m() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            return eVar.f29828a - eVar2.f29828a;
        }
    }

    class o extends DataSetObserver {
        o() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            HwViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            HwViewPager.this.g();
        }
    }

    public HwViewPager(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HwPagerAdapter getCurrentAdapter() {
        return this.f29815a;
    }

    private float getCurrentAnimationPosition() {
        cqx cqxVar = this.J0;
        if (cqxVar == null || !cqxVar.isRunning()) {
            return 0.0f;
        }
        return this.J0.e().getPosition();
    }

    private float getEndAnimationPosition() {
        cqx cqxVar = this.J0;
        if (cqxVar == null || !cqxVar.isRunning()) {
            return 0.0f;
        }
        return this.J0.e().getEndPosition();
    }

    private int getNewAnimationScrollX() {
        if (!isPageScrollHorizontal()) {
            return getScrollX();
        }
        if (this.v0) {
            cqx cqxVar = this.J0;
            if (cqxVar == null || !cqxVar.isRunning()) {
                return getScrollX();
            }
            int currentAnimationPosition = (int) getCurrentAnimationPosition();
            cancelAnimation();
            setScrollingCacheEnabled(false);
            return currentAnimationPosition;
        }
        Scroller scroller = this.n;
        if (scroller == null || scroller.isFinished()) {
            return getScrollX();
        }
        int currX = this.o ? this.n.getCurrX() : this.n.getStartX();
        this.n.abortAnimation();
        setScrollingCacheEnabled(false);
        return currX;
    }

    private int getNewAnimationScrollY() {
        if (isPageScrollHorizontal()) {
            return getScrollY();
        }
        if (this.v0) {
            cqx cqxVar = this.J0;
            if (cqxVar == null || !cqxVar.isRunning()) {
                return getScrollY();
            }
            int currentAnimationPosition = (int) getCurrentAnimationPosition();
            cancelAnimation();
            setScrollingCacheEnabled(false);
            return currentAnimationPosition;
        }
        Scroller scroller = this.n;
        if (scroller == null || scroller.isFinished()) {
            return getScrollY();
        }
        int currY = this.o ? this.n.getCurrY() : this.n.getStartY();
        this.n.abortAnimation();
        setScrollingCacheEnabled(false);
        return currY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRealCount() {
        HwPagerAdapter hwPagerAdapter = this.f29815a;
        return ((hwPagerAdapter instanceof xgn) && this.t0) ? ((xgn) hwPagerAdapter).e() : hwPagerAdapter.getCount();
    }

    private int h(int i2) {
        e eVarE = e(i2);
        if (eVarE != null) {
            return (int) ((isPageScrollHorizontal() ? getClientWidth() : getClientHeight()) * Math.max(this.y, Math.min(eVarE.f29829b, this.z)));
        }
        return 0;
    }

    private void i() {
        cqx cqxVar = this.J0;
        if (cqxVar == null || !cqxVar.isRunning()) {
            return;
        }
        s();
        this.J0.removeEndListener(this.K0);
        this.J0.removeUpdateListener(this.L0);
        this.J0.cancel();
    }

    public static HwViewPager instantiate(Context context) {
        Object objC = xft.c(context, xft.b(context, HwViewPager.class, xft.d(context, 15, 1)), HwViewPager.class);
        if (objC instanceof HwViewPager) {
            return (HwViewPager) objC;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.A0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.A0 = true;
    }

    private void p() {
        int currentItem = getCurrentItem();
        if (!isPageScrollHorizontal()) {
            this.n.setFinalY(currentItem * getClientHeight());
            return;
        }
        if (isRtlLayout()) {
            currentItem = -currentItem;
        }
        this.n.setFinalX(currentItem * getClientWidth());
    }

    private void q() {
        int velocity = (int) this.J0.e().getVelocity();
        int currentItem = getCurrentItem();
        if (!isPageScrollHorizontal()) {
            this.J0.a().d(this, DynamicAnimation.SCROLL_Y, this.x0, this.w0, currentItem * getClientHeight(), velocity);
            return;
        }
        if (isRtlLayout()) {
            currentItem = -currentItem;
        }
        this.J0.a().d(this, DynamicAnimation.SCROLL_X, this.x0, this.w0, currentItem * getClientWidth(), velocity);
    }

    private void r() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).i) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void s() {
        int iCeil;
        int iCeil2;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        float endAnimationPosition = getEndAnimationPosition() - getCurrentAnimationPosition();
        if (isPageScrollHorizontal()) {
            iCeil2 = ((int) Math.ceil(endAnimationPosition)) + scrollX;
            iCeil = scrollY;
        } else {
            iCeil = ((int) Math.ceil(endAnimationPosition)) + scrollY;
            iCeil2 = scrollX;
        }
        if (scrollX != iCeil2) {
            scrollTo(iCeil2, iCeil);
            pageScrolled(iCeil2);
        } else if (scrollY != iCeil) {
            scrollTo(iCeil2, iCeil);
            pageScrolled(iCeil);
        }
    }

    private void setAdapterInner(HwPagerAdapter hwPagerAdapter) {
        HwPagerAdapter hwPagerAdapter2 = this.f29815a;
        if (hwPagerAdapter2 != null) {
            hwPagerAdapter2.a(null);
            this.f29815a.startUpdate(this);
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                e eVar = this.f.get(i2);
                this.f29815a.destroyItem(this, eVar.f29828a, eVar.e);
            }
            this.f29815a.finishUpdate(this);
            this.f.clear();
            r();
            this.f29816b = 0;
            scrollTo(0, 0);
        }
        HwPagerAdapter hwPagerAdapter3 = this.f29815a;
        this.f29815a = hwPagerAdapter;
        this.f29817c = 0;
        if (hwPagerAdapter != null) {
            if (this.p == null) {
                this.p = new o();
            }
            this.f29815a.a(this.p);
            this.G = false;
            boolean z = this.f0;
            this.f0 = true;
            this.f29817c = this.f29815a.getCount();
            if (this.k >= 0) {
                this.f29815a.restoreState(this.l, this.m);
                setCurrentItemInternal(this.k, false, true);
                this.k = -1;
                this.l = null;
                this.m = null;
            } else if (z) {
                requestLayout();
            } else {
                o();
            }
        }
        List<OnAdapterChangeListener> list = this.m0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.m0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.m0.get(i3).onAdapterChanged(this, hwPagerAdapter3, hwPagerAdapter);
        }
    }

    private void setChildCount(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i3).getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                if (!layoutParams2.i) {
                    layoutParams2.f29818a = 0.0f;
                }
            }
        }
    }

    private void setCurrentItemWithoutNotification(int i2) {
        this.s0 = true;
        a(i2, false);
        this.s0 = false;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.F != z) {
            this.F = z;
        }
    }

    private void setSensitivityMode(int i2) {
        if (i2 == 0) {
            this.R = 1.4f;
        } else if (i2 == 2) {
            this.R = 1.0f;
        } else {
            this.R = 1.4f;
        }
    }

    private void setValueFromPlume(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            return;
        }
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, this, "changePageEnabled", Boolean.TRUE});
        if (objC instanceof Boolean) {
            setExtendedChangePageEnabled(((Boolean) objC).booleanValue());
        }
    }

    private void t() {
        this.J0.addEndListener(this.K0);
        this.J0.addUpdateListener(this.L0);
    }

    private boolean u() {
        this.S = -1;
        h();
        this.d0.onRelease();
        this.e0.onRelease();
        return this.d0.isFinished() || this.e0.isFinished();
    }

    private void v() {
        if (this.v0) {
            float fAbs = Math.abs(getCurrentAnimationPosition());
            float fAbs2 = Math.abs(getEndAnimationPosition());
            if (this.r0 != 2 || Float.compare(Math.abs(fAbs - fAbs2), this.a0) <= 0) {
                a(false);
                this.I = false;
                return;
            }
            this.n.abortAnimation();
            cancelAnimation();
            this.G = false;
            o();
            this.I = true;
            c(true);
            setScrollState(1);
            return;
        }
        boolean z = !isPageScrollHorizontal() ? Math.abs(this.n.getFinalY() - this.n.getCurrY()) <= this.a0 : Math.abs(this.n.getFinalX() - this.n.getCurrX()) <= this.a0;
        boolean z2 = !isPageScrollHorizontal() ? Math.abs(this.n.getFinalY() - getScrollY()) <= this.a0 : Math.abs(this.n.getFinalX() - getScrollX()) <= this.a0;
        if (this.r0 != 2 || (!z && !z2)) {
            a(false);
            this.I = false;
            return;
        }
        this.n.abortAnimation();
        this.G = false;
        o();
        this.I = true;
        c(true);
        setScrollState(1);
    }

    private void w() {
        if (this.p0 != 0) {
            ArrayList<View> arrayList = this.q0;
            if (arrayList == null) {
                this.q0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.q0.add(getChildAt(i2));
            }
            Collections.sort(this.q0, c2);
        }
    }

    private void x() {
        this.D0.setDuration(300L);
        this.D0.addUpdateListener(new f());
        this.D0.setInterpolator(this.T0);
        this.D0.start();
    }

    private void y() {
        if (this.B0 || this.R0 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.D0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.D0.cancel();
        }
        this.D0 = ValueAnimator.ofFloat(this.w, this.x);
        x();
    }

    private void z() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.x, this.w);
        this.D0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.D0.addUpdateListener(new h());
        this.D0.setInterpolator(this.T0);
        this.D0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            a(arrayList, i2, i3);
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public void addOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        if (this.m0 == null) {
            this.m0 = new ArrayList();
        }
        this.m0.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.t0) {
            g gVar = new g(this, onPageChangeListener, null);
            this.i.put(onPageChangeListener, gVar);
            onPageChangeListener = gVar;
        }
        if (this.j0 == null) {
            this.j0 = new ArrayList();
        }
        this.j0.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        e eVarC;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (eVarC = c(childAt)) != null && eVarC.f29828a == this.f29816b) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        if (!(layoutParams instanceof LayoutParams)) {
            Log.e(h1, "addView: LayoutParams lp is null or not layout params!");
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zD = layoutParams2.i | d(view);
        layoutParams2.i = zD;
        if (!this.D) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zD) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f29820c = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public boolean arrowScroll(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent != this) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e(h1, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            viewFindFocus = null;
        }
        return b(i2, viewFindFocus);
    }

    public boolean beginFakeDrag() {
        if (this.I) {
            return false;
        }
        this.b0 = true;
        setScrollState(1);
        if (isPageScrollHorizontal()) {
            this.P = 0.0f;
            this.N = 0.0f;
        } else {
            this.Q = 0.0f;
            this.O = 0.0f;
        }
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker == null) {
            this.T = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.T.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.c0 = jUptimeMillis;
        return true;
    }

    protected boolean canScroll(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (isPageScrollHorizontal()) {
            if (!z || !view.canScrollHorizontally(-i2)) {
                return false;
            }
        } else if (!z || !view.canScrollVertically(-i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f29815a == null) {
            return false;
        }
        int currentItem = getCurrentItem();
        int count = this.f29815a.getCount();
        return i2 >= 0 ? !(i2 <= 0 || (!isRtlLayout() ? currentItem != count - 1 : currentItem != 0)) : !(!isRtlLayout() ? currentItem != 0 : currentItem != count - 1);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        if (this.f29815a == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i2 < 0) {
            return scrollY > ((int) (((float) clientHeight) * this.y));
        }
        return i2 > 0 && scrollY < ((int) (((float) clientHeight) * this.z));
    }

    protected void cancelAnimation() {
        cqx cqxVar = this.J0;
        if (cqxVar == null || !cqxVar.isRunning()) {
            return;
        }
        this.J0.removeEndListener(this.K0);
        this.J0.removeUpdateListener(this.L0);
        this.J0.cancel();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        if (isRtlLayout()) {
            this.i.clear();
        }
        List<OnPageChangeListener> list = this.j0;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.o = true;
        if (this.n.isFinished() || !this.n.computeScrollOffset()) {
            if (this.v0) {
                return;
            }
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.n.getCurrX();
        int currY = this.n.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    protected HwGenericEventDetector createGenericEventDetector() {
        return new HwGenericEventDetector(getContext());
    }

    protected HwGenericEventDetector.OnChangePageListener createOnChangePageListener() {
        return new HwGenericEventDetector.OnChangePageListener() { // from class: xgg
            @Override // com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector.OnChangePageListener
            public final boolean onChangePage(float f2, MotionEvent motionEvent) {
                return this.f52875c.a(f2, motionEvent);
            }
        };
    }

    protected HwGenericEventDetector.OnScrollListener createOnScrollListener() {
        return null;
    }

    protected int determineTargetPage(int i2, float f2, int i3, int i4) {
        int iA = isPageScrollHorizontal() ? a(i2, f2, i3, i4) : b(i2, f2, i3, i4);
        if (this.f.size() <= 0) {
            return iA;
        }
        e eVar = this.f.get(0);
        ArrayList<e> arrayList = this.f;
        return Math.max(eVar.f29828a, Math.min(iA, arrayList.get(arrayList.size() - 1).f29828a));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e eVarC;
        if (accessibilityEvent == null) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (eVarC = c(childAt)) != null && eVarC.f29828a == this.f29816b && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean zDraw;
        HwPagerAdapter hwPagerAdapter;
        if (canvas == null) {
            return;
        }
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (hwPagerAdapter = this.f29815a) == null || hwPagerAdapter.getCount() <= 1)) {
            this.d0.finish();
            this.e0.finish();
            return;
        }
        if (this.d0.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.y * width);
            this.d0.setSize(height, width);
            zDraw = this.d0.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.e0.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.z + 1.0f)) * width2);
            this.e0.setSize((height2 - paddingTop) - paddingBottom, width2);
            zDraw |= this.e0.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.r;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void endFakeDrag() {
        if (!this.b0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f29815a != null && this.S != -1) {
            VelocityTracker velocityTracker = this.T;
            velocityTracker.computeCurrentVelocity(1000, this.V);
            int xVelocity = (int) (isPageScrollHorizontal() ? velocityTracker.getXVelocity(this.S) : velocityTracker.getYVelocity(this.S));
            this.G = true;
            if (isPageScrollHorizontal()) {
                c(xVelocity);
            } else {
                d(xVelocity);
            }
        }
        h();
        this.b0 = false;
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? m() : arrowScroll(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? n() : arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    public void fakeDragBy(float f2) {
        if (!this.b0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f29815a == null || this.f.size() <= 0) {
            return;
        }
        if (isPageScrollHorizontal()) {
            this.N += f2;
        } else {
            this.O += f2;
        }
        float fA = a((isPageScrollHorizontal() ? getScrollX() : getScrollY()) - f2, isPageScrollHorizontal() ? getClientWidth() : getClientHeight());
        if (isPageScrollHorizontal()) {
            int i2 = (int) fA;
            this.N += fA - i2;
            scrollTo(i2, getScrollY());
        } else {
            int i3 = (int) fA;
            this.O += fA - i3;
            scrollTo(getScrollX(), i3);
        }
        pageScrolled((int) fA);
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = isPageScrollHorizontal() ? MotionEvent.obtain(this.c0, jUptimeMillis, 2, this.N, 0.0f, 0) : MotionEvent.obtain(this.c0, jUptimeMillis, 2, 0.0f, this.O, 0);
        this.T.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public HwPagerAdapter getAdapter() {
        HwPagerAdapter hwPagerAdapter = this.f29815a;
        return hwPagerAdapter instanceof xgn ? ((xgn) hwPagerAdapter).d() : hwPagerAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.p0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        if (this.q0.size() == 0) {
            return 0;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= this.q0.size()) {
            i3 = this.q0.size() - 1;
        }
        ViewGroup.LayoutParams layoutParams = this.q0.get(i3).getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).d;
        }
        return 0;
    }

    protected int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    protected int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        int i2 = this.f29816b;
        HwPagerAdapter hwPagerAdapter = this.f29815a;
        return ((hwPagerAdapter instanceof xgn) && this.t0) ? ((xgn) hwPagerAdapter).a(i2) : i2;
    }

    public float getEndShadowAlpha() {
        return this.x;
    }

    public float getHwSpringDamping() {
        return this.w0;
    }

    public float getHwSpringStiffness() {
        return this.x0;
    }

    public int getOffscreenPageLimit() {
        return this.H;
    }

    public int getPageMargin() {
        return this.q;
    }

    public int getPageScrollDirection() {
        return this.P0;
    }

    protected float getPageSwitchThreshold() {
        if (this.v0) {
            return 0.5f;
        }
        return q1;
    }

    public boolean getReverseDrawingOrder() {
        return this.E;
    }

    protected float getRotaryVelocity() {
        HwGenericEventDetector hwGenericEventDetector = this.M0;
        if (hwGenericEventDetector != null) {
            return hwGenericEventDetector.d();
        }
        return 0.0f;
    }

    public Scroller getScroller() {
        return this.n;
    }

    public float getSensitivity() {
        HwGenericEventDetector hwGenericEventDetector = this.M0;
        if (hwGenericEventDetector != null) {
            return hwGenericEventDetector.e();
        }
        return 1.4f;
    }

    public int getShadowColor() {
        return this.S0;
    }

    public boolean getShadowEnable() {
        return this.G0;
    }

    public float getSpringInterpolatorEndPos() {
        return this.I0;
    }

    public float getStartShadowAlpha() {
        return this.w;
    }

    public float getVelocityRatio() {
        return this.H0;
    }

    protected e infoForCurrentScrollPosition() {
        float scrollX;
        int i2;
        boolean z = isPageScrollHorizontal() && isRtlLayout();
        float clientWidth = isPageScrollHorizontal() ? getClientWidth() : getClientHeight();
        float f2 = 0.0f;
        if (clientWidth > 0.0f) {
            scrollX = (isPageScrollHorizontal() ? getScrollX() : getScrollY()) / clientWidth;
        } else {
            scrollX = 0.0f;
        }
        if (z) {
            scrollX = -scrollX;
        }
        float f3 = clientWidth > 0.0f ? this.q / clientWidth : 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        e eVar = null;
        float f4 = 0.0f;
        while (i4 < this.f.size()) {
            e eVar2 = this.f.get(i4);
            if (!z2 && eVar2.f29828a != (i2 = i3 + 1)) {
                eVar2 = this.g;
                eVar2.f29829b = f2 + f4 + f3;
                eVar2.f29828a = i2;
                eVar2.d = isPageScrollHorizontal() ? this.f29815a.getPageWidth(eVar2.f29828a) : this.f29815a.getPageHeight(eVar2.f29828a);
                i4--;
            }
            e eVar3 = eVar2;
            f2 = eVar3.f29829b;
            float f5 = eVar3.d;
            if (!z2 && scrollX < f2) {
                break;
            }
            if (scrollX < f5 + f2 + f3 || i4 == this.f.size() - 1) {
                return eVar3;
            }
            i3 = eVar3.f29828a;
            i4++;
            z2 = false;
            eVar = eVar3;
            f4 = eVar3.d;
        }
        return eVar;
    }

    public boolean isAutoRtlLayoutEnabled() {
        return this.z0;
    }

    public boolean isDynamicSpringAnimaitionEnabled() {
        return this.v0;
    }

    public boolean isExtendedChangePageEnabled() {
        return this.N0;
    }

    public boolean isFakeDragging() {
        return this.b0;
    }

    public boolean isPageScrollHorizontal() {
        return this.P0 == 0;
    }

    public boolean isRtlLayout() {
        if (!this.z0) {
            return false;
        }
        String language = Locale.getDefault().getLanguage();
        return (language.contains("ar") || language.contains("fa") || language.contains("iw")) || (language.contains("ug") || language.contains(Constants.URDU_LANG));
    }

    public boolean isSpringInterpolatorEnable() {
        return this.y0;
    }

    public boolean isSupportLoop() {
        return this.t0;
    }

    public boolean isSupportRltLayout() {
        return isRtlLayout();
    }

    void j() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.n = new Scroller(context, e2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.M = viewConfiguration.getScaledPagingTouchSlop();
        if (this.v0) {
            this.U = 1200;
        } else {
            this.U = (int) (400.0f * f2);
        }
        this.V = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d0 = new EdgeEffect(context);
        this.e0 = new EdgeEffect(context);
        this.W = (int) (25.0f * f2);
        this.a0 = (int) (2.0f * f2);
        this.K = (int) (f2 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new i());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new a());
    }

    boolean m() {
        if (this.A0 && this.f29815a != null) {
            int i2 = this.f29816b;
            if (i2 > 0) {
                this.O0 = false;
                if (isPageScrollHorizontal() && isRtlLayout()) {
                    HwPagerAdapter hwPagerAdapter = this.f29815a;
                    if (hwPagerAdapter != null && this.f29816b == hwPagerAdapter.getCount() - 1) {
                        return false;
                    }
                    b();
                    setCurrentItem(this.f29816b + 1, true);
                } else {
                    a();
                    setCurrentItem(this.f29816b - 1, true);
                }
                this.O0 = true;
                return true;
            }
            if (i2 == 0 && isPageScrollHorizontal() && isRtlLayout()) {
                HwPagerAdapter hwPagerAdapter2 = this.f29815a;
                if (hwPagerAdapter2 != null && hwPagerAdapter2.getCount() == 1) {
                    return false;
                }
                setCurrentItem(this.f29816b + 1, true);
                return true;
            }
        }
        return false;
    }

    boolean n() {
        HwPagerAdapter hwPagerAdapter;
        if (this.A0 && (hwPagerAdapter = this.f29815a) != null) {
            if (this.f29816b < hwPagerAdapter.getCount() - 1) {
                this.O0 = false;
                if (!isPageScrollHorizontal() || !isRtlLayout()) {
                    b();
                    setCurrentItem(this.f29816b + 1, true);
                } else {
                    if (this.f29816b == 0) {
                        return false;
                    }
                    a();
                    setCurrentItem(this.f29816b - 1, true);
                }
                this.O0 = true;
                return true;
            }
            if (this.f29816b == this.f29815a.getCount() - 1 && isPageScrollHorizontal() && isRtlLayout()) {
                setCurrentItem(this.f29816b - 1, true);
                return true;
            }
        }
        return false;
    }

    public void nextPage() {
        nextPage(true);
    }

    void o() {
        populate(this.f29816b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.j);
        Scroller scroller = this.n;
        if (scroller != null && !scroller.isFinished()) {
            this.n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.q <= 0 || this.r == null || this.f.size() <= 0 || this.f29815a == null) {
            return;
        }
        int scrollX = isPageScrollHorizontal() ? getScrollX() : getScrollY();
        int width = isPageScrollHorizontal() ? getWidth() : getHeight();
        float f4 = width <= 0 ? 0.0f : this.q / width;
        e eVar = this.f.get(0);
        float f5 = eVar.f29829b;
        int size = this.f.size();
        int i2 = eVar.f29828a;
        int i3 = this.f.get(size - 1).f29828a;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            e eVar2 = eVar;
            int i6 = i5;
            while (i4 > eVar2.f29828a && i6 < size) {
                i6++;
                eVar2 = this.f.get(i6);
            }
            boolean z = isPageScrollHorizontal() && isRtlLayout();
            if (i4 == eVar2.f29828a) {
                float f6 = z ? -(eVar2.f29829b + eVar2.d) : eVar2.f29829b + eVar2.d;
                f3 = width * f6;
                f2 = z ? f6 - f4 : f6 + f4;
            } else {
                float pageWidth = isPageScrollHorizontal() ? this.f29815a.getPageWidth(i4) : this.f29815a.getPageHeight(i4);
                float f7 = (z ? f5 - pageWidth : f5 + pageWidth) * width;
                float f8 = pageWidth + f4;
                f2 = z ? f5 - f8 : f5 + f8;
                f3 = f7;
            }
            if (a(canvas, scrollX, width, f3, z)) {
                return;
            }
            i4++;
            eVar = eVar2;
            i5 = i6;
            f5 = f2;
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        HwGenericEventDetector hwGenericEventDetector;
        if (!this.N0 || (hwGenericEventDetector = this.M0) == null) {
            return super.onGenericMotionEvent(motionEvent);
        }
        if (hwGenericEventDetector.c(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            u();
            return false;
        }
        if (action != 0) {
            if (this.I) {
                return true;
            }
            if (this.J) {
                return false;
            }
        }
        if (c(motionEvent, action)) {
            return false;
        }
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        this.W0 = getPaddingLeft();
        this.X0 = getPaddingTop();
        this.Y0 = getPaddingRight();
        this.Z0 = getPaddingBottom();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                a(i6, i7, scrollX, scrollY, childAt);
                i8++;
            }
        }
        int i10 = this.W0;
        int i11 = this.Y0;
        int i12 = this.X0;
        int i13 = this.Z0;
        Rect rect = new Rect(this.W0, this.X0, this.Y0, this.Z0);
        for (int i14 = 0; i14 < childCount; i14++) {
            if (isPageScrollHorizontal()) {
                a(i14, (i6 - i10) - i11, i7, rect);
            } else {
                b(i14, (i7 - i12) - i13, i6, rect);
            }
        }
        if (isPageScrollHorizontal()) {
            this.s = this.X0;
            this.t = i7 - this.Z0;
        } else {
            this.u = this.W0;
            this.v = i6 - this.Y0;
        }
        this.i0 = i8;
        if (this.f0) {
            a(this.f29816b, false, 0, false);
        }
        this.f0 = false;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.L = Math.min(measuredWidth / 10, this.K);
        this.U0 = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        this.V0 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a(childAt, (LayoutParams) childAt.getLayoutParams());
            }
        }
        this.B = View.MeasureSpec.makeMeasureSpec(this.U0, 1073741824);
        this.C = View.MeasureSpec.makeMeasureSpec(this.V0, 1073741824);
        this.D = true;
        o();
        this.D = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            a(this.U0, this.V0, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onPageScrolled(int i2, float f2, int i3) {
        if (this.i0 > 0) {
            if (isPageScrollHorizontal()) {
                e();
            } else {
                f();
            }
        }
        a(i2, f2, i3);
        if (this.n0 != null) {
            int scrollX = isPageScrollHorizontal() ? getScrollX() : getScrollY();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!((LayoutParams) childAt.getLayoutParams()).i) {
                    boolean z = isPageScrollHorizontal() ? false : false;
                    a(scrollX, childAt, z);
                }
            }
        }
        this.h0 = true;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            if (a(i2, rect, i3)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof RtlSavedState) {
            RtlSavedState rtlSavedState = (RtlSavedState) parcelable;
            Parcelable parcelable2 = rtlSavedState.f29821a;
            if (!(parcelable2 instanceof SavedState)) {
                super.onRestoreInstanceState(parcelable2);
                return;
            }
            SavedState savedState = (SavedState) parcelable2;
            super.onRestoreInstanceState(savedState.getSuperState());
            HwPagerAdapter hwPagerAdapter = this.f29815a;
            if (hwPagerAdapter != null) {
                hwPagerAdapter.restoreState(savedState.f29825b, savedState.f29826c);
                setCurrentItemInternal(savedState.f29824a, false, true);
            } else {
                this.k = savedState.f29824a;
                this.l = savedState.f29825b;
                this.m = savedState.f29826c;
            }
            if (rtlSavedState.f29823c != isRtlLayout()) {
                this.O0 = false;
                setCurrentItem(rtlSavedState.f29822b, false);
                this.O0 = true;
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29824a = this.f29816b;
        HwPagerAdapter hwPagerAdapter = this.f29815a;
        if (hwPagerAdapter != null) {
            savedState.f29825b = hwPagerAdapter.saveState();
        }
        return new RtlSavedState(savedState, this.f29816b, isRtlLayout());
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.R0;
        if (drawable != null && i3 != i5) {
            drawable.setBounds(0, 0, i2, i3);
        }
        if (i2 != i4 || i3 != i5) {
            this.f0 = true;
        }
        if (isPageScrollHorizontal()) {
            if (i2 != i4) {
                c(i2, i4);
            }
        } else if (i3 != i5) {
            c(i3, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        HwPagerAdapter hwPagerAdapter;
        if (motionEvent == null) {
            return false;
        }
        if (this.b0) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (hwPagerAdapter = this.f29815a) == null || hwPagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        int action = motionEvent.getAction();
        this.a1 = false;
        int i2 = action & 255;
        if (i2 == 0) {
            f(motionEvent);
        } else if (i2 == 1) {
            e(motionEvent);
        } else if (i2 != 2) {
            if (i2 == 3) {
                a(motionEvent);
            } else if (i2 == 5) {
                c(motionEvent);
            } else if (i2 == 6) {
                d(motionEvent);
            }
        } else {
            if (this.B0) {
                setScrollState(1);
                return true;
            }
            b(motionEvent);
        }
        if (this.a1) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    protected boolean pageScrolled(int i2) {
        if (this.f.size() == 0) {
            if (this.f0) {
                return false;
            }
            this.h0 = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.h0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e eVarInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        if (eVarInfoForCurrentScrollPosition == null) {
            Log.e(h1, "pageScrolled: ItemInfo is null!");
            return false;
        }
        int clientWidth = isPageScrollHorizontal() ? getClientWidth() : getClientHeight();
        int i3 = this.q;
        float f2 = clientWidth <= 0 ? 0.0f : i3 / clientWidth;
        int i4 = eVarInfoForCurrentScrollPosition.f29828a;
        boolean z = clientWidth > 0 && eVarInfoForCurrentScrollPosition.d + f2 > 0.0f;
        if (isPageScrollHorizontal() && isRtlLayout()) {
            i2 = -i2;
        }
        float f3 = z ? ((i2 / clientWidth) - eVarInfoForCurrentScrollPosition.f29829b) / (eVarInfoForCurrentScrollPosition.d + f2) : 0.0f;
        this.h0 = false;
        onPageScrolled(i4, f3, (int) ((clientWidth + i3) * f3));
        if (this.h0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    protected boolean performDrag(float f2) {
        return isPageScrollHorizontal() ? d(f2) : e(f2);
    }

    protected void populate(int i2) {
        e eVarE;
        int i3 = this.f29816b;
        if (i3 != i2) {
            eVarE = e(i3);
            this.f29816b = i2;
        } else {
            eVarE = null;
        }
        if (this.f29815a == null) {
            w();
            return;
        }
        if (this.G) {
            w();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f29815a.startUpdate(this);
        a(eVarE);
        this.f29815a.finishUpdate(this);
        c();
        w();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            e eVarB = viewFindFocus != null ? b(viewFindFocus) : null;
            if (eVarB == null || eVarB.f29828a != this.f29816b) {
                d();
            }
        }
    }

    public void prePage() {
        prePage(true);
    }

    public void removeOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.m0;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (isRtlLayout()) {
            onPageChangeListener = this.i.remove(onPageChangeListener);
        }
        List<OnPageChangeListener> list = this.j0;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.D) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(HwPagerAdapter hwPagerAdapter) {
        this.E0 = hwPagerAdapter;
        if (hwPagerAdapter != null) {
            boolean z = this.t0;
            if (z) {
                hwPagerAdapter = new xgn(hwPagerAdapter, z);
            }
            if (hwPagerAdapter instanceof xgn) {
                ((xgn) hwPagerAdapter).b(this.u0);
            }
        }
        setAdapterInner(hwPagerAdapter);
        if (this.t0) {
            a(0, false);
        }
    }

    public void setAutoRtlLayoutEnabled(boolean z) {
        this.z0 = z;
    }

    public void setCurrentItem(int i2) {
        if (getCurrentItem() != i2) {
            setCurrentItem(i2, true);
        }
    }

    void setCurrentItemInternal(int i2, boolean z, boolean z2) {
        setCurrentItemInternal(i2, z, z2, 0);
    }

    public void setCustomPageThreshold(float f2) {
        if (Float.compare(f2, 0.0f) < 0 || Float.compare(f2, 1.0f) > 0) {
            Log.w(h1, "The minimum threshold must be between 0 and 1.");
        } else {
            this.A = f2;
        }
    }

    public void setDynamicSpringAnimaitionEnabled(boolean z) {
        this.v0 = z;
    }

    public void setEndShadowAlpha(float f2) {
        this.x = f2;
    }

    public void setExtendedChangePageEnabled(boolean z) {
        this.N0 = z;
    }

    public void setFlingDistance(int i2) {
        if (i2 < 0) {
            Log.w(h1, "The minimum distance cannot be set to a negative value.");
        } else {
            this.W = i2;
        }
    }

    public void setHwSpringDamping(float f2) {
        this.w0 = f2;
    }

    public void setHwSpringStiffness(float f2) {
        this.x0 = f2;
    }

    public void setLoopEndCache(int i2) {
        HwPagerAdapter hwPagerAdapter;
        if (!this.t0 || (hwPagerAdapter = this.f29815a) == null || i2 <= 2) {
            return;
        }
        this.d = i2;
        if (hwPagerAdapter instanceof xgn) {
            xgn xgnVar = (xgn) hwPagerAdapter;
            xgnVar.d(i2);
            xgnVar.notifyDataSetChanged();
        }
    }

    public void setMinimumVelocity(int i2) {
        if (i2 < 0) {
            Log.w(h1, "The minimum speed cannot be set to a negative value.");
        } else {
            this.U = i2;
        }
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < this.e) {
            Log.w(h1, "Requested offscreen page limit " + i2 + " too small; defaulting to " + this.e);
            i2 = this.e;
        }
        if (i2 != this.H) {
            this.H = i2;
            o();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.t0) {
            onPageChangeListener = new g(this, onPageChangeListener, null);
        }
        this.k0 = onPageChangeListener;
    }

    public void setPageMargin(int i2) {
        this.q = i2;
        int width = isPageScrollHorizontal() ? getWidth() : getHeight();
        c(width, width);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageScrollDirection(int i2) {
        if ((i2 == 1 || i2 == 0) && this.P0 != i2) {
            this.P0 = i2;
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer) {
        setPageTransformer(z, pageTransformer, 2);
    }

    public void setPageTurningEnabled(boolean z) {
        this.B0 = z;
        if (z && this.F0 == null) {
            this.F0 = new xgh(this);
        }
    }

    public void setPageTurningThresholdRatioHorizontal(float f2) {
        if (Float.compare(f2, 0.0f) < 0 || Float.compare(f2, 1.0f) > 0) {
            Log.e(h1, "Please ensure that the value of ratio is greater than 0.0f and less than 1.0f.");
            return;
        }
        xgh xghVar = this.F0;
        if (xghVar != null) {
            xghVar.d(f2);
        }
    }

    public void setPageTurningThresholdRatioVertical(float f2) {
        if (Float.compare(f2, 0.0f) < 0 || Float.compare(f2, 1.0f) > 0) {
            Log.e(h1, "Please ensure that the value of ratio is greater than 0.0f and less than 1.0f.");
            return;
        }
        xgh xghVar = this.F0;
        if (xghVar != null) {
            xghVar.a(f2);
        }
    }

    public void setReverseDrawingOrder(boolean z) {
        if (this.r0 != 0) {
            return;
        }
        this.E = z;
        if (z) {
            this.p0 = 1;
        } else {
            this.p0 = 2;
        }
    }

    void setScrollState(int i2) {
        if (this.r0 == i2) {
            return;
        }
        this.r0 = i2;
        if (this.n0 != null) {
            b(i2 != 0);
        }
        b(i2);
    }

    public void setScroller(Scroller scroller) {
        if (scroller != null) {
            this.n = scroller;
        }
    }

    public void setSensitivity(float f2) {
        HwGenericEventDetector hwGenericEventDetector = this.M0;
        if (hwGenericEventDetector != null) {
            hwGenericEventDetector.d(f2);
        }
    }

    public void setShadowColor(int i2) {
        this.S0 = i2;
    }

    public void setShadowEnable(boolean z) {
        this.G0 = z;
    }

    public void setSpringInterpolatorEnable(boolean z) {
        this.y0 = z;
        if (z && isDynamicSpringAnimaitionEnabled()) {
            Log.w(h1, "Please call setDynamicSpringAnimaitionEnabled and set false.");
        }
        if (z) {
            return;
        }
        this.n = new Scroller(getContext(), e2);
    }

    public void setSpringInterpolatorEndPos(float f2) {
        this.I0 = f2;
    }

    public void setStartShadowAlpha(float f2) {
        this.w = f2;
    }

    public void setSupportLoop(boolean z) {
        if (this.t0 == z) {
            return;
        }
        this.t0 = z;
        HwPagerAdapter hwPagerAdapter = this.E0;
        if (hwPagerAdapter != null) {
            setAdapter(hwPagerAdapter);
        }
    }

    public void setVelocityRatio(float f2) {
        this.H0 = f2;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f29818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f29820c;
        int d;
        public int e;
        public boolean i;

        public LayoutParams() {
            super(-1, -1);
            this.f29818a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29818a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, HwViewPager.g1);
            this.e = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public HwViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.huawei.uikit.hwviewpager.R.attr.hwViewPagerStyle);
    }

    private void b(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.huawei.uikit.hwviewpager.R.styleable.HwViewPager, i2, 0);
        this.t0 = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.hwviewpager.R.styleable.HwViewPager_hwViewPagerSupportLoop, false);
        this.C0 = typedArrayObtainStyledAttributes.getInt(com.huawei.uikit.hwviewpager.R.styleable.HwViewPager_hwSensitivityMode, 1);
        this.S0 = typedArrayObtainStyledAttributes.getColor(com.huawei.uikit.hwviewpager.R.styleable.HwViewPager_hwShadowColor, getResources().getColor(X1));
        this.P0 = typedArrayObtainStyledAttributes.getInt(com.huawei.uikit.hwviewpager.R.styleable.HwViewPager_android_orientation, 0);
        this.B0 = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.hwviewpager.R.styleable.HwViewPager_hwViewPagerPageTurningEnabled, false);
        float f2 = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwviewpager.R.styleable.HwViewPager_hwViewPagerPageTurningThresholdRatioVertical, 0.125f);
        float f3 = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwviewpager.R.styleable.HwViewPager_hwViewPagerPageTurningThresholdRatioHorizontal, 0.125f);
        typedArrayObtainStyledAttributes.recycle();
        if (this.B0) {
            xgh xghVar = new xgh(this);
            this.F0 = xghVar;
            xghVar.a(f2);
            this.F0.d(f3);
        }
    }

    private boolean c(int i2, float f2, int i3) {
        float f3 = this.f1;
        if (f3 >= f2 && i3 < i2) {
            e eVar = this.c1;
            if (eVar == null) {
                return true;
            }
            if (i3 != eVar.f29828a || eVar.f29830c) {
                return false;
            }
            this.f.remove(this.b1);
            this.f29815a.destroyItem(this, i3, this.c1.e);
            int i4 = this.b1 - 1;
            this.b1 = i4;
            this.e1--;
            this.c1 = i4 >= 0 ? this.f.get(i4) : null;
            return false;
        }
        e eVar2 = this.c1;
        if (eVar2 != null && i3 == eVar2.f29828a) {
            this.f1 = f3 + eVar2.d;
            int i5 = this.b1 - 1;
            this.b1 = i5;
            this.c1 = i5 >= 0 ? this.f.get(i5) : null;
            return false;
        }
        e eVarA = a(i3, this.b1 + 1);
        this.c1 = eVarA;
        this.f1 += eVarA.d;
        this.e1++;
        int i6 = this.b1;
        this.c1 = i6 >= 0 ? this.f.get(i6) : null;
        return false;
    }

    private void d() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            e eVarC = c(childAt);
            if (eVarC != null && eVarC.f29828a == this.f29816b && childAt.requestFocus(2)) {
                return;
            }
        }
    }

    private void f(int i2) {
        if (this.I) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.view.SceneUtil");
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod("notifyAnimationState", String.class, cls2, cls2, cls2).invoke(null, "HWVIEWPAGER_SLIDE", Integer.valueOf(i2), -1, Integer.valueOf(hashCode()));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            Log.w(h1, "notifyPageScrollToUifwk class or method not found");
        } catch (IllegalAccessException unused2) {
            Log.w(h1, "notifyPageScrollToUifwk illegal access");
        } catch (IllegalArgumentException unused3) {
            Log.w(h1, "notifyPageScrollToUifwk illegal argument");
        } catch (SecurityException unused4) {
            Log.w(h1, "notifyPageScrollToUifwk not secure");
        } catch (InvocationTargetException unused5) {
            Log.w(h1, "notifyPageScrollToUifwk target error");
        }
        Log.d(h1, "notifyPageScrollToUifwk " + i2 + " done");
    }

    void e(int i2, int i3) {
        b(i2, i3, 0);
    }

    void g() {
        int count = this.f29815a.getCount();
        this.f29817c = count;
        boolean z = this.f.size() < (this.H * 2) + 1 && this.f.size() < count;
        int iMax = this.f29816b;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f.size()) {
            e eVar = this.f.get(i2);
            int itemPosition = this.f29815a.getItemPosition(eVar.e);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f29815a.startUpdate(this);
                        z2 = true;
                    }
                    this.f29815a.destroyItem(this, eVar.f29828a, eVar.e);
                    int i3 = this.f29816b;
                    if (i3 == eVar.f29828a) {
                        iMax = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = eVar.f29828a;
                    if (i4 != itemPosition) {
                        if (i4 == this.f29816b) {
                            iMax = itemPosition;
                        }
                        eVar.f29828a = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f29815a.finishUpdate(this);
        }
        Collections.sort(this.f, d2);
        a(z, iMax);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void nextPage(boolean z) {
        nextPage(z, true);
    }

    public void prePage(boolean z) {
        prePage(z, false);
    }

    protected void setCurrentItemInternal(int i2, boolean z, boolean z2, int i3) {
        HwPagerAdapter hwPagerAdapter = this.f29815a;
        if (hwPagerAdapter == null || hwPagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f29816b == i2 && this.f.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f29815a.getCount()) {
            i2 = this.f29815a.getCount() - 1;
        }
        int i4 = this.H;
        int i5 = this.f29816b;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f.size(); i6++) {
                this.f.get(i6).f29830c = true;
            }
        }
        boolean z3 = this.f29816b != i2;
        if (!this.f0) {
            populate(i2);
            a(i2, z, i3, z3);
        } else {
            this.f29816b = i2;
            if (z3) {
                a(i2);
            }
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer, int i2) {
        boolean z2 = pageTransformer != null;
        boolean z3 = z2 != (this.n0 != null);
        this.n0 = pageTransformer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.p0 = z ? 2 : 1;
            this.E = !z;
            this.o0 = i2;
        } else {
            this.p0 = 0;
        }
        if (z3) {
            o();
        }
    }

    public HwViewPager(Context context, AttributeSet attributeSet, int i2) {
        super(a(context, i2), attributeSet, i2);
        this.d = 2;
        this.e = 1;
        this.f = new ArrayList<>();
        this.g = new e();
        this.h = new Rect();
        this.i = new ArrayMap();
        this.j = new j();
        this.k = -1;
        this.l = null;
        this.m = null;
        this.w = 0.0f;
        this.x = 0.3f;
        this.y = -3.4028235E38f;
        this.z = Float.MAX_VALUE;
        this.A = Float.MIN_VALUE;
        this.H = 2;
        this.R = 1.4f;
        this.S = -1;
        this.f0 = true;
        this.g0 = false;
        this.r0 = 0;
        this.t0 = false;
        this.u0 = false;
        this.v0 = true;
        this.w0 = 30.0f;
        this.x0 = n1;
        this.y0 = false;
        this.z0 = true;
        this.A0 = true;
        this.B0 = false;
        this.G0 = false;
        this.H0 = 1.0f;
        this.I0 = -1.0f;
        this.J0 = new cqx(this, DynamicAnimation.SCROLL_X, new cqz(this.x0, this.w0));
        this.K0 = new DynamicAnimation.OnAnimationEndListener() { // from class: xgi
            @Override // com.huawei.dynamicanimation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
                this.d.a(dynamicAnimation, z, f2, f3);
            }
        };
        this.L0 = new DynamicAnimation.OnAnimationUpdateListener() { // from class: xgk
            @Override // com.huawei.dynamicanimation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                this.e.a(dynamicAnimation, f2, f3);
            }
        };
        this.N0 = true;
        this.O0 = true;
        this.P0 = 0;
        this.T0 = PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f);
        a(getContext(), attributeSet, i2);
    }

    e e(int i2) {
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            e eVar = this.f.get(i3);
            if (eVar.f29828a == i2) {
                return eVar;
            }
        }
        return null;
    }

    public void nextPage(boolean z, boolean z2) {
        int count;
        if (getAdapter() != null && (count = getAdapter().getCount()) >= 2) {
            int currentItem = getCurrentItem();
            if (currentItem != count - 1) {
                setCurrentItem(currentItem + 1, z);
            } else if (z2) {
                setCurrentItem(0, false);
            }
        }
    }

    public void prePage(boolean z, boolean z2) {
        int count;
        if (getAdapter() != null && (count = getAdapter().getCount()) >= 2) {
            int currentItem = getCurrentItem();
            if (currentItem > 0) {
                setCurrentItem(currentItem - 1, z);
            } else if (z2) {
                setCurrentItem(count - 1, false);
            }
        }
    }

    public void setCurrentItem(int i2, boolean z) {
        if (this.O0) {
            i2 = a(i2, this.f29815a);
        }
        this.G = false;
        setCurrentItemInternal(i2, z, false);
    }

    public static class RtlSavedState implements Parcelable {
        public static final Parcelable.ClassLoaderCreator<RtlSavedState> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Parcelable f29821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f29823c;

        class e implements Parcelable.ClassLoaderCreator<RtlSavedState> {
            e() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public RtlSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new RtlSavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public RtlSavedState createFromParcel(Parcel parcel) {
                return new RtlSavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RtlSavedState[] newArray(int i) {
                return new RtlSavedState[i];
            }
        }

        public RtlSavedState(Parcelable parcelable, int i, boolean z) {
            this.f29821a = parcelable;
            this.f29822b = i;
            this.f29823c = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel == null) {
                return;
            }
            parcel.writeParcelable(this.f29821a, i);
            parcel.writeInt(this.f29822b);
            parcel.writeByte(this.f29823c ? (byte) 1 : (byte) 0);
        }

        RtlSavedState(Parcel parcel, ClassLoader classLoader) {
            this.f29821a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f29822b = parcel.readInt();
            this.f29823c = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
        if (!z) {
            boolean zIsPageScrollHorizontal = isPageScrollHorizontal();
            if (Float.compare(zIsPageScrollHorizontal ? getScrollX() : getScrollY(), f2) != 0) {
                scrollTo(zIsPageScrollHorizontal ? (int) f2 : 0, zIsPageScrollHorizontal ? 0 : (int) f2);
            }
        }
        if (this.r0 != 0) {
            a(false);
        }
        f(0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    private void e() {
        int iMax;
        int width;
        int left;
        int scrollX = getScrollX();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width2 = getWidth();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt.getLayoutParams() instanceof LayoutParams)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.i) {
                    int i3 = layoutParams.e & 7;
                    if (i3 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i3 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i3 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i4 = iMax;
                    width = paddingLeft;
                    paddingLeft = i4;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
    }

    private boolean h(MotionEvent motionEvent) {
        if (this.S == -1) {
            Log.w(h1, "onTouchEvent: something wrong! we get invalid pointer!");
            return false;
        }
        VelocityTracker velocityTracker = this.T;
        velocityTracker.computeCurrentVelocity(1000, this.V);
        int yVelocity = (int) velocityTracker.getYVelocity(this.S);
        this.G = true;
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        e eVarInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        if (eVarInfoForCurrentScrollPosition != null) {
            float f2 = 0.0f;
            float f3 = clientHeight <= 0 ? 0.0f : this.q / clientHeight;
            if (clientHeight > 0 && eVarInfoForCurrentScrollPosition.d + f3 > 0.0f) {
                f2 = ((scrollY / clientHeight) - eVarInfoForCurrentScrollPosition.f29829b) / (eVarInfoForCurrentScrollPosition.d + f3);
            }
            try {
                setCurrentItemInternal(determineTargetPage(eVarInfoForCurrentScrollPosition.f29828a, f2, yVelocity, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.S)) - this.Q)), true, true, yVelocity);
                return true;
            } catch (IllegalArgumentException unused) {
                Log.e(h1, "isActionUpVertical: pointer index out of range");
            }
        }
        return false;
    }

    private static boolean d(View view) {
        return view.getClass().getAnnotation(DecorView.class) != null;
    }

    private void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i2 = actionIndex == 0 ? 1 : 0;
            f(motionEvent, i2);
            this.S = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.T;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i2));
    }

    private void d(int i2, int i3) {
        if (isPageScrollHorizontal()) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingLeft2 = (i3 - getPaddingLeft()) - getPaddingRight();
            scrollTo((int) ((paddingLeft2 > 0 ? getScrollX() / paddingLeft2 : 0.0f) * ((i2 - paddingLeft) - paddingRight)), getScrollY());
            return;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingTop2 = (i3 - getPaddingTop()) - getPaddingBottom();
        scrollTo(getScrollX(), (int) ((paddingTop2 > 0 ? getScrollY() / paddingTop2 : 0.0f) * ((i2 - paddingTop) - paddingBottom)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DynamicAnimation dynamicAnimation, float f2, float f3) {
        if (this.r0 == 2) {
            invalidate();
            pageScrolled((int) f2);
        }
    }

    private static Context a(Context context, int i2) {
        return xfs.c(context, i2, com.huawei.uikit.hwviewpager.R.style.Theme_Emui_HwViewPager);
    }

    private void a(Context context, AttributeSet attributeSet, int i2) {
        b(context, attributeSet, i2);
        j();
        HwGenericEventDetector hwGenericEventDetectorCreateGenericEventDetector = createGenericEventDetector();
        this.M0 = hwGenericEventDetectorCreateGenericEventDetector;
        if (hwGenericEventDetectorCreateGenericEventDetector != null) {
            setSensitivityMode(this.C0);
            this.M0.d(this.R);
            this.M0.c(this, createOnScrollListener());
            this.M0.d(createOnChangePageListener());
        }
        setValueFromPlume(context);
    }

    private boolean d(MotionEvent motionEvent, int i2) {
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        try {
            float x = motionEvent.getX(iFindPointerIndex);
            float f2 = x - this.N;
            float fAbs = Math.abs(f2);
            float y = motionEvent.getY(iFindPointerIndex);
            float fAbs2 = Math.abs(y - this.Q);
            if (Float.compare(f2, 0.0f) != 0 && !b(this.N, f2) && canScroll(this, false, (int) f2, (int) x, (int) y)) {
                this.N = x;
                this.O = y;
                this.J = true;
                return false;
            }
            a(f2, fAbs, y, fAbs2);
            if (this.I && !this.B0 && performDrag(this.N - x)) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            return true;
        } catch (IllegalArgumentException unused) {
            Log.e(h1, "needInterceptMoveHorizontally: pointer index out of range");
            return true;
        }
    }

    private void c() {
        e eVarC;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? (LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.d = i2;
                if (!layoutParams2.i && layoutParams2.f29818a == 0.0f && (eVarC = c(childAt)) != null) {
                    layoutParams2.f29818a = eVarC.d;
                    layoutParams2.f29819b = eVarC.f29828a;
                }
            }
        }
    }

    void b(int i2, int i3, int i4) {
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int newAnimationScrollX = getNewAnimationScrollX();
        int newAnimationScrollY = getNewAnimationScrollY();
        int i5 = i2 - newAnimationScrollX;
        int i6 = i3 - newAnimationScrollY;
        if (i5 == 0 && i6 == 0) {
            a(false);
            o();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = isPageScrollHorizontal() ? getClientWidth() : getClientHeight();
        float f2 = clientWidth / 2;
        float fA = a(clientWidth <= 0 ? 0.0f : Math.min(1.0f, (Math.abs(i5) * 1.0f) / clientWidth));
        if (this.v0) {
            if (!isPageScrollHorizontal()) {
                i2 = i3;
            }
            f(i2, -i4);
            f(1);
            return;
        }
        if (this.y0) {
            a(-i4, new Pair<>(Integer.valueOf(newAnimationScrollX), Integer.valueOf(newAnimationScrollY)), new Pair<>(Integer.valueOf(i5), Integer.valueOf(i6)));
            return;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs((f2 + (fA * f2)) / iAbs2) * 1000.0f) * 4;
        } else {
            float pageWidth = clientWidth * (isPageScrollHorizontal() ? this.f29815a.getPageWidth(this.f29816b) : this.f29815a.getPageHeight(this.f29816b));
            iAbs = (int) (((Float.compare(((float) this.q) + pageWidth, 0.0f) != 0 ? Math.abs(i5) / (pageWidth + this.q) : 0.0f) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.o = false;
        this.n.startScroll(newAnimationScrollX, newAnimationScrollY, i5, i6, iMin);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(float f2, MotionEvent motionEvent) {
        if (a(f2, 0.0f) || this.r0 != 0) {
            return false;
        }
        if (f2 > 0.0f) {
            n();
            return true;
        }
        m();
        return true;
    }

    private void f(int i2, int i3) {
        this.J0.a().d(this, isPageScrollHorizontal() ? DynamicAnimation.SCROLL_X : DynamicAnimation.SCROLL_Y, this.x0, this.w0, i2, i3 * this.H0);
        t();
        this.o = false;
        this.J0.startImmediately(a((ViewGroup) this));
    }

    private void h() {
        this.I = false;
        this.J = false;
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.T = null;
        }
    }

    private boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < D1;
    }

    private void a(int i2, boolean z, int i3, boolean z2) {
        int iH = h(i2);
        if (!this.B0 && z) {
            if (isPageScrollHorizontal()) {
                if (isRtlLayout()) {
                    iH = -iH;
                }
                b(iH, 0, i3);
            } else {
                b(0, iH, i3);
            }
            if (z2) {
                a(i2);
                return;
            }
            return;
        }
        if (z2) {
            a(i2);
        }
        a(false);
        if (isPageScrollHorizontal()) {
            if (isRtlLayout()) {
                iH = -iH;
            }
            scrollTo(iH, 0);
        } else {
            scrollTo(0, iH);
        }
        pageScrolled(iH);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    private void f() {
        int iMax;
        int height;
        int top;
        int scrollY = getScrollY();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height2 = getHeight();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt.getLayoutParams() instanceof LayoutParams)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.i) {
                    int i3 = layoutParams.e & 112;
                    if (i3 == 16) {
                        iMax = Math.max((height2 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else {
                        if (i3 == 48) {
                            height = childAt.getHeight() + paddingTop;
                        } else if (i3 != 80) {
                            height = paddingTop;
                        } else {
                            iMax = (height2 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        top = (paddingTop + scrollY) - childAt.getTop();
                        if (top != 0) {
                            childAt.offsetTopAndBottom(top);
                        }
                        paddingTop = height;
                    }
                    int i4 = iMax;
                    height = paddingTop;
                    paddingTop = i4;
                    top = (paddingTop + scrollY) - childAt.getTop();
                    if (top != 0) {
                        childAt.offsetTopAndBottom(top);
                    }
                    paddingTop = height;
                }
            }
        }
    }

    e c(View view) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            e eVar = this.f.get(i2);
            if (this.f29815a.isViewFromObject(view, eVar.e)) {
                return eVar;
            }
        }
        return null;
    }

    private void c(int i2, int i3) {
        cqx cqxVar;
        if (i3 > 0 && !this.f.isEmpty()) {
            if (this.v0 && (cqxVar = this.J0) != null && cqxVar.isRunning()) {
                q();
                return;
            } else if (!this.n.isFinished()) {
                p();
                return;
            } else {
                d(i2, i3);
                return;
            }
        }
        g(i2);
    }

    private void g(int i2) {
        int paddingTop;
        int paddingBottom;
        e eVarE = e(this.f29816b);
        float fMin = eVarE != null ? Math.min(eVarE.f29829b, this.z) : 0.0f;
        if (isPageScrollHorizontal() && isRtlLayout()) {
            fMin = -fMin;
        }
        if (isPageScrollHorizontal()) {
            paddingTop = i2 - getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = i2 - getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i3 = (int) (fMin * (paddingTop - paddingBottom));
        if (isPageScrollHorizontal()) {
            if (i3 == getScrollX()) {
                return;
            }
        } else if (i3 == getScrollY()) {
            return;
        }
        a(false);
        if (isPageScrollHorizontal()) {
            scrollTo(i3, getScrollY());
        } else {
            scrollTo(getScrollX(), i3);
        }
    }

    private boolean e(MotionEvent motionEvent, int i2) {
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        try {
            float y = motionEvent.getY(iFindPointerIndex);
            float f2 = y - this.O;
            float fAbs = Math.abs(f2);
            float x = motionEvent.getX(iFindPointerIndex);
            float fAbs2 = Math.abs(x - this.P);
            if (Float.compare(f2, 0.0f) != 0 && !b(this.O, f2) && canScroll(this, false, (int) f2, (int) x, (int) y)) {
                this.N = x;
                this.O = y;
                this.J = true;
                return false;
            }
            b(f2, fAbs, x, fAbs2);
            if (this.I && !this.B0 && performDrag(this.O - y)) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            return true;
        } catch (IllegalArgumentException unused) {
            Log.e(h1, "needInterceptMoveVertically: pointer index out of range");
            return true;
        }
    }

    private boolean c(MotionEvent motionEvent, int i2) {
        if (i2 == 0) {
            if (this.B0) {
                this.F0.d(motionEvent);
            }
            if (this.G0) {
                y();
            }
            try {
                float x = motionEvent.getX();
                this.P = x;
                this.N = x;
                float y = motionEvent.getY();
                this.Q = y;
                this.O = y;
                this.S = motionEvent.getPointerId(0);
                this.J = false;
                this.o = true;
                this.n.computeScrollOffset();
                v();
            } catch (IllegalArgumentException unused) {
                Log.e(h1, "eventActions: pointer index out of range");
                return false;
            }
        } else if (i2 == 2) {
            int i3 = this.S;
            if (i3 != -1) {
                if (isPageScrollHorizontal()) {
                    if (!d(motionEvent, i3)) {
                        return true;
                    }
                } else if (!e(motionEvent, i3)) {
                    return true;
                }
            }
        } else if (i2 == 6) {
            i(motionEvent);
        }
        return false;
    }

    private void d(MotionEvent motionEvent) {
        i(motionEvent);
        if (this.S == -1) {
            Log.w(h1, "onTouchEvent: something wrong! we get invalid pointer!");
            return;
        }
        try {
            if (isPageScrollHorizontal()) {
                this.N = motionEvent.getX(motionEvent.findPointerIndex(this.S));
            } else {
                this.O = motionEvent.getY(motionEvent.findPointerIndex(this.S));
            }
        } catch (IllegalArgumentException unused) {
            Log.e(h1, "actionPointerUp: pointer index out of range");
        }
    }

    OnPageChangeListener a(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.l0;
        this.l0 = onPageChangeListener;
        return onPageChangeListener2;
    }

    private boolean g(MotionEvent motionEvent) {
        if (this.S == -1) {
            Log.w(h1, "onTouchEvent: something wrong! we get invalid pointer!");
            return false;
        }
        VelocityTracker velocityTracker = this.T;
        velocityTracker.computeCurrentVelocity(1000, this.V);
        int xVelocity = (int) velocityTracker.getXVelocity(this.S);
        this.G = true;
        int clientWidth = getClientWidth();
        int scrollX = isRtlLayout() ? -getScrollX() : getScrollX();
        e eVarInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        if (eVarInfoForCurrentScrollPosition != null) {
            float f2 = 0.0f;
            float f3 = clientWidth <= 0 ? 0.0f : this.q / clientWidth;
            if (clientWidth > 0 && eVarInfoForCurrentScrollPosition.d + f3 > 0.0f) {
                f2 = ((scrollX / clientWidth) - eVarInfoForCurrentScrollPosition.f29829b) / (eVarInfoForCurrentScrollPosition.d + f3);
            }
            try {
                setCurrentItemInternal(determineTargetPage(eVarInfoForCurrentScrollPosition.f29828a, f2, xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.S)) - this.P)), true, true, xVelocity);
                return true;
            } catch (IllegalArgumentException unused) {
                Log.e(h1, "onTouchEvent: pointer index out of range");
            }
        }
        return false;
    }

    float a(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private long a(ViewGroup viewGroup) {
        Display display = viewGroup == null ? null : viewGroup.getDisplay();
        float refreshRate = display == null ? 0.0f : display.getRefreshRate();
        if (Float.compare(refreshRate, 0.0f) == 0) {
            return 0L;
        }
        return 1000 / ((long) refreshRate);
    }

    private void a(int i2, Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2) {
        float fIntValue = ((Integer) (isPageScrollHorizontal() ? pair2.first : pair2.second)).intValue();
        if (Float.compare(this.I0, 0.0f) > 0) {
            Log.d(h1, "startDynamicAnimationWithSpringInterpolator: use fix endPos " + this.I0);
            if (Math.abs(fIntValue) < this.I0) {
                fIntValue = Math.signum(fIntValue) * this.I0;
            }
        }
        crd crdVar = new crd(this.x0, this.w0, fIntValue, i2 * this.H0);
        int duration = (int) crdVar.getDuration();
        Scroller scroller = new Scroller(getContext(), crdVar);
        this.n = scroller;
        this.o = false;
        scroller.startScroll(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), ((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue(), duration);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private boolean d(float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        boolean z2;
        float f7;
        float f8;
        boolean z3;
        boolean z4;
        boolean zB;
        float fA;
        this.N -= f2;
        float scrollX = getScrollX();
        float f9 = scrollX + f2;
        int clientWidth = getClientWidth();
        if (isRtlLayout()) {
            f3 = -clientWidth;
            f4 = this.z;
        } else {
            f3 = clientWidth;
            f4 = this.y;
        }
        float f10 = f3 * f4;
        if (isRtlLayout()) {
            f5 = -clientWidth;
            f6 = this.y;
        } else {
            f5 = clientWidth;
            f6 = this.z;
        }
        float f11 = f5 * f6;
        boolean z5 = false;
        if (this.f.size() <= 0) {
            return false;
        }
        e eVar = this.f.get(0);
        ArrayList<e> arrayList = this.f;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f29828a == 0) {
            z = true;
            z2 = true;
        } else if (isRtlLayout()) {
            f11 = (-eVar.f29829b) * clientWidth;
            z = false;
            z2 = true;
        } else {
            f10 = eVar.f29829b * clientWidth;
            z2 = false;
            z = true;
        }
        if (eVar2.f29828a == this.f29815a.getCount() - 1) {
            f7 = f10;
            f8 = f11;
            z3 = z;
            z4 = z2;
        } else if (isRtlLayout()) {
            f7 = (-eVar2.f29829b) * clientWidth;
            f8 = f11;
            z3 = z;
            z4 = false;
        } else {
            f11 = eVar2.f29829b * clientWidth;
            z = false;
            f7 = f10;
            f8 = f11;
            z3 = z;
            z4 = z2;
        }
        if (f9 < f7) {
            zB = a(false, f9, clientWidth, f7, z4);
            if ((this.v0 || this.y0) && z4) {
                fA = a(clientWidth, f2, f9 - f7);
                z5 = zB;
                f9 = scrollX + fA;
            } else {
                z5 = zB;
                f9 = f7;
            }
        } else if (f9 > f8) {
            zB = b(false, f9, clientWidth, f8, z3);
            if ((this.v0 || this.y0) && z3) {
                fA = a(clientWidth, f2, f9 - f8);
                z5 = zB;
                f9 = scrollX + fA;
            } else {
                z5 = zB;
                f9 = f8;
            }
        }
        b(f9);
        return z5;
    }

    private boolean b(int i2, float f2, int i3) {
        float f3 = this.d1;
        if (f3 >= f2 && i3 > i2) {
            e eVar = this.c1;
            if (eVar == null) {
                return true;
            }
            if (i3 != eVar.f29828a || eVar.f29830c) {
                return false;
            }
            this.f.remove(this.b1);
            this.f29815a.destroyItem(this, i3, this.c1.e);
            this.c1 = this.b1 < this.f.size() ? this.f.get(this.b1) : null;
            return false;
        }
        e eVar2 = this.c1;
        if (eVar2 != null && i3 == eVar2.f29828a) {
            this.d1 = f3 + eVar2.d;
            int i4 = this.b1 + 1;
            this.b1 = i4;
            this.c1 = i4 < this.f.size() ? this.f.get(this.b1) : null;
            return false;
        }
        e eVarA = a(i3, this.b1);
        this.c1 = eVarA;
        int i5 = this.b1 + 1;
        this.b1 = i5;
        this.d1 += eVarA.d;
        this.c1 = i5 < this.f.size() ? this.f.get(this.b1) : null;
        return false;
    }

    e a(int i2, int i3) {
        e eVar = new e();
        eVar.f29828a = i2;
        eVar.e = this.f29815a.instantiateItem(this, i2);
        eVar.d = isPageScrollHorizontal() ? this.f29815a.getPageWidth(i2) : this.f29815a.getPageHeight(i2);
        if (i3 >= 0 && i3 < this.f.size()) {
            this.f.add(i3, eVar);
            return eVar;
        }
        this.f.add(eVar);
        return eVar;
    }

    private boolean f(MotionEvent motionEvent) {
        this.n.abortAnimation();
        cancelAnimation();
        this.G = false;
        o();
        try {
            float x = motionEvent.getX();
            this.P = x;
            this.N = x;
            float y = motionEvent.getY();
            this.Q = y;
            this.O = y;
            this.S = motionEvent.getPointerId(0);
            return false;
        } catch (IllegalArgumentException unused) {
            Log.e(h1, "actonDown: pointer index out of range");
            return true;
        }
    }

    private boolean e(MotionEvent motionEvent) {
        if (this.B0) {
            this.F0.c(motionEvent);
            setScrollState(0);
            return true;
        }
        if (this.G0 && this.D0 != null) {
            z();
        }
        this.a1 = a(motionEvent, this.a1);
        return false;
    }

    private void a(boolean z, int i2) {
        if (z) {
            setChildCount(getChildCount());
            setCurrentItemInternal(i2, false, true);
            requestLayout();
        }
    }

    private boolean e(float f2) {
        boolean z;
        boolean z2;
        float fA;
        this.O -= f2;
        float scrollY = getScrollY();
        float f3 = scrollY + f2;
        int clientHeight = getClientHeight();
        float f4 = clientHeight;
        float f5 = this.y * f4;
        float f6 = this.z * f4;
        boolean z3 = false;
        if (this.f.size() <= 0) {
            return false;
        }
        e eVar = this.f.get(0);
        ArrayList<e> arrayList = this.f;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f29828a != 0) {
            f5 = eVar.f29829b * f4;
            z = false;
        } else {
            z = true;
        }
        if (eVar2.f29828a != this.f29815a.getCount() - 1) {
            f6 = eVar2.f29829b * f4;
            z2 = false;
        } else {
            z2 = true;
        }
        if (f3 < f5) {
            if (z) {
                this.d0.onPull(clientHeight > 0 ? Math.abs(f5 - f3) / f4 : 0.0f);
                z3 = true;
            }
            if ((this.v0 || this.y0) && z) {
                fA = a(clientHeight, f2, f3 - f5);
                f3 = scrollY + fA;
            } else {
                f3 = f5;
            }
        } else if (f3 > f6) {
            if (z2) {
                this.e0.onPull(clientHeight > 0 ? Math.abs(f3 - f6) / f4 : 0.0f);
                z3 = true;
            }
            if ((this.v0 || this.y0) && z2) {
                fA = a(clientHeight, f2, f3 - f6);
                f3 = scrollY + fA;
            } else {
                f3 = f6;
            }
        }
        c(f3);
        return z3;
    }

    private void a(e eVar) {
        String hexString;
        e eVarA;
        int count = this.f29815a.getCount();
        if (count == this.f29817c) {
            this.e1 = 0;
            while (true) {
                if (this.e1 < this.f.size()) {
                    eVarA = this.f.get(this.e1);
                    int i2 = eVarA.f29828a;
                    int i3 = this.f29816b;
                    if (i2 >= i3) {
                        if (i2 == i3) {
                            break;
                        } else {
                            break;
                        }
                    }
                    this.e1++;
                }
                eVarA = null;
                break;
            }
            if (eVarA == null && count > 0) {
                eVarA = a(this.f29816b, this.e1);
            }
            e eVar2 = eVarA;
            int i4 = this.H;
            int iMax = Math.max(0, this.f29816b - i4);
            int iMin = Math.min(count - 1, this.f29816b + i4);
            if (eVar2 != null) {
                a(eVar, iMax, count, iMin, eVar2);
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's HwPagerAdapter changed the adapter's contents without calling HwPagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f29817c + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f29815a.getClass());
    }

    private boolean c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        try {
            if (isPageScrollHorizontal()) {
                this.N = motionEvent.getX(actionIndex);
            } else {
                this.O = motionEvent.getY(actionIndex);
            }
            this.S = motionEvent.getPointerId(actionIndex);
            return false;
        } catch (IllegalArgumentException unused) {
            Log.e(h1, "actionPointerDown: pointer index out of range");
            return true;
        }
    }

    private void f(MotionEvent motionEvent, int i2) {
        try {
            if (isPageScrollHorizontal()) {
                this.N = motionEvent.getX(i2);
            } else {
                this.O = motionEvent.getY(i2);
            }
        } catch (IllegalArgumentException unused) {
            Log.e(h1, "updateLastMotion: pointer index out of range");
        }
    }

    private void b(e eVar, e eVar2, float f2, int i2) {
        e eVar3;
        float pageWidth = eVar2.f29829b + eVar2.d + f2;
        int i3 = i2 + 1;
        int i4 = 0;
        while (i3 <= eVar.f29828a && i4 < this.f.size()) {
            e eVar4 = this.f.get(i4);
            while (true) {
                eVar3 = eVar4;
                if (i3 <= eVar3.f29828a || i4 >= this.f.size() - 1) {
                    break;
                }
                i4++;
                eVar4 = this.f.get(i4);
            }
            while (i3 < eVar3.f29828a) {
                pageWidth += (isPageScrollHorizontal() ? this.f29815a.getPageWidth(i3) : this.f29815a.getPageHeight(i3)) + f2;
                i3++;
            }
            eVar3.f29829b = pageWidth;
            pageWidth += eVar3.d + f2;
            i3++;
        }
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void c(float f2) {
        int i2 = (int) f2;
        this.O += f2 - i2;
        scrollTo(getScrollX(), i2);
        pageScrolled(i2);
    }

    e b(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return c(view);
            }
        }
    }

    private void c(int i2) {
        int clientWidth = getClientWidth();
        int scrollX = isRtlLayout() ? -getScrollX() : getScrollX();
        e eVarInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        if (eVarInfoForCurrentScrollPosition != null) {
            int i3 = eVarInfoForCurrentScrollPosition.f29828a;
            float f2 = 0.0f;
            if (clientWidth > 0 && eVarInfoForCurrentScrollPosition.d > 0.0f) {
                f2 = ((scrollX / clientWidth) - eVarInfoForCurrentScrollPosition.f29829b) / eVarInfoForCurrentScrollPosition.d;
            }
            setCurrentItemInternal(determineTargetPage(i3, f2, i2, (int) (this.N - this.P)), true, true, i2);
        }
    }

    private void d(int i2) {
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        e eVarInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        if (eVarInfoForCurrentScrollPosition != null) {
            int i3 = eVarInfoForCurrentScrollPosition.f29828a;
            float f2 = 0.0f;
            if (clientHeight > 0 && eVarInfoForCurrentScrollPosition.d > 0.0f) {
                f2 = ((scrollY / clientHeight) - eVarInfoForCurrentScrollPosition.f29829b) / eVarInfoForCurrentScrollPosition.d;
            }
            setCurrentItemInternal(determineTargetPage(i3, f2, i2, (int) (this.O - this.Q)), true, true, i2);
        }
    }

    private void b(int i2, int i3, int i4, Rect rect) {
        View childAt = getChildAt(i2);
        if (childAt == null) {
            return;
        }
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        if (childAt.getVisibility() == 8 || !(childAt.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        e eVarC = c(childAt);
        if (layoutParams.i || eVarC == null) {
            return;
        }
        float f2 = i3;
        int i8 = i7 + ((int) (eVarC.f29829b * f2));
        if (layoutParams.f29820c) {
            layoutParams.f29820c = false;
            childAt.measure(View.MeasureSpec.makeMeasureSpec((i4 - i5) - i6, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams.f29818a), 1073741824));
        }
        childAt.layout(i5, i8, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + i8);
    }

    private void a(e eVar, int i2, int i3, int i4, e eVar2) {
        float f2;
        int paddingTop;
        float f3;
        int paddingBottom;
        float f4 = 0.0f;
        this.f1 = 0.0f;
        int i5 = this.e1 - 1;
        this.b1 = i5;
        this.c1 = i5 >= 0 ? this.f.get(i5) : null;
        int clientWidth = isPageScrollHorizontal() ? getClientWidth() : getClientHeight();
        if (clientWidth <= 0) {
            f3 = 0.0f;
        } else {
            if (isPageScrollHorizontal()) {
                f2 = 2.0f - eVar2.d;
                paddingTop = getPaddingLeft();
            } else {
                f2 = 2.0f - eVar2.d;
                paddingTop = getPaddingTop();
            }
            f3 = (f2 + paddingTop) / clientWidth;
        }
        for (int i6 = this.f29816b - 1; i6 >= 0 && !c(i2, f3, i6); i6--) {
        }
        float f5 = eVar2.d;
        this.d1 = f5;
        int i7 = this.e1 + 1;
        this.b1 = i7;
        if (f5 < 2.0f) {
            this.c1 = i7 < this.f.size() ? this.f.get(this.b1) : null;
            if (clientWidth > 0) {
                if (isPageScrollHorizontal()) {
                    paddingBottom = getPaddingRight();
                } else {
                    paddingBottom = getPaddingBottom();
                }
                f4 = (paddingBottom / clientWidth) + 2.0f;
            }
            int i8 = this.f29816b;
            do {
                i8++;
                if (i8 >= i3) {
                    break;
                }
            } while (!b(i4, f4, i8));
        }
        a(eVar2, this.e1, eVar);
        this.f29815a.setPrimaryItem(this, this.f29816b, eVar2.e);
    }

    private void b(int i2, int i3) {
        if (this.R0 == null) {
            ViewGroupOverlay viewGroupOverlayA = a((View) this);
            this.Q0 = viewGroupOverlayA;
            if (viewGroupOverlayA == null) {
                return;
            }
            this.R0 = new xgp(this.S0, this);
            setLayerType(1, null);
            this.Q0.add(this.R0);
        }
        Drawable drawable = this.R0;
        if (drawable instanceof xgp) {
            ((xgp) drawable).b(i2, i3);
        }
    }

    private void b(int i2) {
        OnPageChangeListener onPageChangeListener = this.k0;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i2);
        }
        List<OnPageChangeListener> list = this.j0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = this.j0.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.l0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i2);
        }
    }

    private void a(e eVar, int i2, e eVar2) {
        int i3;
        int i4;
        float pageHeight;
        int i5;
        int i6;
        float pageHeight2;
        int count = this.f29815a.getCount();
        int clientWidth = isPageScrollHorizontal() ? getClientWidth() : getClientHeight();
        float f2 = clientWidth > 0 ? this.q / clientWidth : 0.0f;
        if (eVar2 != null) {
            int i7 = eVar2.f29828a;
            int i8 = eVar.f29828a;
            if (i7 < i8) {
                b(eVar, eVar2, f2, i7);
            } else if (i7 > i8) {
                a(eVar, eVar2, f2, i7);
            }
        }
        int size = this.f.size();
        float f3 = eVar.f29829b;
        int i9 = eVar.f29828a;
        int i10 = i9 - 1;
        this.y = i9 == 0 ? f3 : -3.4028235E38f;
        int i11 = count - 1;
        this.z = i9 == i11 ? (eVar.d + f3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            e eVar3 = this.f.get(i12);
            while (true) {
                i5 = eVar3.f29828a;
                if (i10 <= i5) {
                    break;
                }
                if (isPageScrollHorizontal()) {
                    i6 = i10 - 1;
                    pageHeight2 = this.f29815a.getPageWidth(i10);
                } else {
                    i6 = i10 - 1;
                    pageHeight2 = this.f29815a.getPageHeight(i10);
                }
                f3 -= pageHeight2 + f2;
                i10 = i6;
            }
            f3 -= eVar3.d + f2;
            eVar3.f29829b = f3;
            if (i5 == 0) {
                this.y = f3;
            }
            i12--;
            i10--;
        }
        float f4 = eVar.f29829b + eVar.d + f2;
        int i13 = eVar.f29828a + 1;
        int i14 = i2 + 1;
        while (i14 < size) {
            e eVar4 = this.f.get(i14);
            while (true) {
                i3 = eVar4.f29828a;
                if (i13 >= i3) {
                    break;
                }
                if (isPageScrollHorizontal()) {
                    i4 = i13 + 1;
                    pageHeight = this.f29815a.getPageWidth(i13);
                } else {
                    i4 = i13 + 1;
                    pageHeight = this.f29815a.getPageHeight(i13);
                }
                f4 += pageHeight + f2;
                i13 = i4;
            }
            if (i3 == i11) {
                this.z = (eVar4.d + f4) - 1.0f;
            }
            eVar4.f29829b = f4;
            f4 += eVar4.d + f2;
            i14++;
            i13++;
        }
        this.g0 = false;
    }

    private boolean b(float f2, float f3) {
        if (isPageScrollHorizontal()) {
            return (f2 < ((float) this.L) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.L)) && f3 < 0.0f);
        }
        return (f2 < ((float) this.L) && f3 > 0.0f) || (f2 > ((float) (getHeight() - this.L)) && f3 < 0.0f);
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.o0 : 0, null);
        }
    }

    private void b(float f2, float f3, float f4, float f5) {
        if (Float.compare(f3, this.M) <= 0 || Float.compare(f3 * 0.9f, f5) <= 0) {
            if (f5 > this.M) {
                this.J = true;
            }
        } else {
            this.I = true;
            c(true);
            setScrollState(1);
            this.N = f4;
            this.O = Float.compare(f2, 0.0f) > 0 ? this.Q + this.M : this.Q - this.M;
            setScrollingCacheEnabled(true);
        }
    }

    private void b(MotionEvent motionEvent) {
        if (!this.I) {
            int i2 = this.S;
            if (i2 == -1) {
                Log.w(h1, "onTouchEvent: something wrong! we get invalid pointer!");
                this.a1 = u();
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i2);
            if (iFindPointerIndex == -1) {
                this.a1 = u();
                return;
            } else if (isPageScrollHorizontal()) {
                a(motionEvent, iFindPointerIndex);
            } else {
                b(motionEvent, iFindPointerIndex);
            }
        }
        if (this.I) {
            int i3 = this.S;
            if (i3 == -1) {
                Log.w(h1, "onTouchEvent: something wrong! we get invalid pointer!");
                return;
            }
            try {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(i3);
                float x = isPageScrollHorizontal() ? motionEvent.getX(iFindPointerIndex2) : motionEvent.getY(iFindPointerIndex2);
                this.a1 = performDrag((isPageScrollHorizontal() ? this.N : this.O) - x) | this.a1;
            } catch (IllegalArgumentException unused) {
                Log.e(h1, "actionMove: pointer index out of range");
            }
        }
    }

    private void a(e eVar, e eVar2, float f2, int i2) {
        e eVar3;
        int size = this.f.size() - 1;
        float pageWidth = eVar2.f29829b;
        while (true) {
            i2--;
            if (i2 < eVar.f29828a || size < 0) {
                return;
            }
            e eVar4 = this.f.get(size);
            while (true) {
                eVar3 = eVar4;
                if (i2 >= eVar3.f29828a || size <= 0) {
                    break;
                }
                size--;
                eVar4 = this.f.get(size);
            }
            while (i2 > eVar3.f29828a) {
                pageWidth -= (isPageScrollHorizontal() ? this.f29815a.getPageWidth(i2) : this.f29815a.getPageHeight(i2)) + f2;
                i2--;
            }
            pageWidth -= eVar3.d + f2;
            eVar3.f29829b = pageWidth;
        }
    }

    private void b(MotionEvent motionEvent, int i2) {
        try {
            float x = motionEvent.getX(i2);
            float fAbs = Math.abs(x - this.N);
            float y = motionEvent.getY(i2);
            float fAbs2 = Math.abs(y - this.O);
            if (fAbs2 <= this.M || fAbs2 <= fAbs) {
                return;
            }
            this.I = true;
            c(true);
            this.N = x;
            float f2 = this.Q;
            this.O = y - f2 > 0.0f ? f2 + this.M : f2 - this.M;
            setScrollState(1);
            setScrollingCacheEnabled(true);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } catch (IllegalArgumentException unused) {
            Log.e(h1, "actionMoveVertical: pointer index out of range");
        }
    }

    private void a(View view, LayoutParams layoutParams) {
        int i2;
        if (layoutParams == null || !layoutParams.i) {
            return;
        }
        int i3 = layoutParams.e;
        int i4 = i3 & 7;
        int i5 = i3 & 112;
        boolean z = true;
        boolean z2 = i5 == 48 || i5 == 80;
        if (i4 != 3 && i4 != 5) {
            z = false;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = 1073741824;
        if (z2) {
            i2 = 1073741824;
        } else if (z) {
            i2 = Integer.MIN_VALUE;
            i6 = 1073741824;
        } else {
            Log.d(h1, "do nothing.");
            i2 = Integer.MIN_VALUE;
        }
        int i8 = this.U0;
        int i9 = this.V0;
        int i10 = ((ViewGroup.LayoutParams) layoutParams).width;
        if (i10 != -2) {
            i2 = 1073741824;
            if (i10 != -1) {
                i8 = i10;
            }
        }
        int i11 = ((ViewGroup.LayoutParams) layoutParams).height;
        if (i11 == -2) {
            i7 = i6;
        } else if (i11 != -1) {
            i9 = i11;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i8, i2), View.MeasureSpec.makeMeasureSpec(i9, i7));
        if (z2) {
            this.V0 -= view.getMeasuredHeight();
        } else if (z) {
            this.U0 -= view.getMeasuredWidth();
        }
    }

    private boolean b(boolean z, float f2, int i2, float f3, boolean z2) {
        if (!z2) {
            return z;
        }
        this.e0.onPull(i2 <= 0 ? 0.0f : Math.abs(f2 - f3) / i2);
        return true;
    }

    private void b(float f2) {
        int i2 = (int) f2;
        this.N += f2 - i2;
        scrollTo(i2, getScrollY());
        pageScrolled(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        r4 = 0.39999998f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int b(int i2, float f2, int i3, int i4) {
        float f3;
        if (Math.abs(i4) > this.W && Math.abs(i3) > this.U) {
            return i3 > 0 ? i2 : i2 + 1;
        }
        if (Float.compare(this.A, Float.MIN_VALUE) != 0) {
            f3 = i2 >= this.f29816b ? this.A : 1.0f - this.A;
        } else {
            f3 = this.v0 ? q1 : q1;
        }
        return i2 + ((int) (f2 + f3));
    }

    private void a(int i2, int i3, int i4) {
        View childAt = getChildAt(i4);
        if (childAt.getVisibility() != 8) {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? (LayoutParams) layoutParams : null;
            if (layoutParams2 == null || layoutParams2.i) {
                return;
            }
            if (isPageScrollHorizontal()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (i2 * layoutParams2.f29818a), 1073741824), this.C);
            } else {
                childAt.measure(this.B, View.MeasureSpec.makeMeasureSpec((int) (i3 * layoutParams2.f29818a), 1073741824));
            }
        }
    }

    private boolean b(int i2, View view) {
        boolean zM;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (viewFindNextFocus == null || viewFindNextFocus == view) {
            if (i2 != 17 && i2 != 1) {
                zM = (i2 == 66 || i2 == 2) ? n() : false;
            } else {
                zM = m();
            }
        } else if (i2 == 17) {
            int i3 = a(this.h, viewFindNextFocus).left;
            int i4 = a(this.h, view).left;
            if (view != null && i3 >= i4) {
                zM = m();
            } else {
                zM = viewFindNextFocus.requestFocus();
            }
        } else if (i2 == 66) {
            int i5 = a(this.h, viewFindNextFocus).left;
            int i6 = a(this.h, view).left;
            if (view != null && i5 <= i6) {
                zM = n();
            } else {
                zM = viewFindNextFocus.requestFocus();
            }
        } else {
            Log.d(h1, "do nothing.");
        }
        if (zM) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zM;
    }

    private void a(int i2, int i3, int i4, int i5, View view) {
        int iMax;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? (LayoutParams) layoutParams : null;
        if (layoutParams2 == null || !layoutParams2.i) {
            return;
        }
        int i6 = layoutParams2.e & 7;
        if (i6 == 1) {
            iMax = Math.max((i2 - view.getMeasuredWidth()) / 2, this.W0);
        } else if (i6 == 3) {
            iMax = isRtlLayout() ? (i2 - this.Y0) - view.getMeasuredWidth() : this.W0;
            this.Y0 = isRtlLayout() ? this.Y0 + view.getMeasuredWidth() : this.Y0;
            this.W0 = isRtlLayout() ? this.W0 : this.W0 + view.getMeasuredWidth();
        } else if (i6 != 5) {
            iMax = this.W0;
        } else {
            iMax = isRtlLayout() ? this.W0 : (i2 - this.Y0) - view.getMeasuredWidth();
            this.Y0 = isRtlLayout() ? this.Y0 : this.Y0 + view.getMeasuredWidth();
            this.W0 = isRtlLayout() ? this.W0 + view.getMeasuredWidth() : this.W0;
        }
        int iA = a(i3, view, layoutParams2);
        if (isPageScrollHorizontal()) {
            iMax += i4;
        } else {
            iA += i5;
        }
        view.layout(iMax, iA, view.getMeasuredWidth() + iMax, view.getMeasuredHeight() + iA);
    }

    private void b() {
        HwPagerAdapter hwPagerAdapter;
        if (this.t0 && (hwPagerAdapter = this.f29815a) != null) {
            if (hwPagerAdapter instanceof xgn) {
                int count = hwPagerAdapter.getCount() - ((xgn) hwPagerAdapter).a();
                int i2 = this.f29816b;
                if (i2 > count + 1 || i2 < count) {
                    return;
                }
                postDelayed(new Runnable() { // from class: xgj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52879a.l();
                    }
                }, isDynamicSpringAnimaitionEnabled() ? 700L : 300L);
                this.A0 = false;
                return;
            }
            return;
        }
        this.A0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, boolean z) {
        int iA = a(i2, this.f29815a);
        this.O0 = false;
        setCurrentItem(iA, z);
        this.O0 = true;
    }

    private int a(int i2, View view, LayoutParams layoutParams) {
        int i3 = layoutParams.e & 112;
        if (i3 == 16) {
            return Math.max((i2 - view.getMeasuredHeight()) / 2, this.X0);
        }
        if (i3 == 48) {
            int i4 = this.X0;
            this.X0 = view.getMeasuredHeight() + i4;
            return i4;
        }
        if (i3 != 80) {
            return this.X0;
        }
        int i5 = this.Z0;
        int measuredHeight = view.getMeasuredHeight();
        this.Z0 += view.getMeasuredHeight();
        return (i2 - i5) - measuredHeight;
    }

    private void a(int i2, int i3, int i4, Rect rect) {
        View childAt = getChildAt(i2);
        if (childAt == null) {
            return;
        }
        int i5 = rect.top;
        int i6 = rect.bottom;
        int i7 = rect.left;
        if (childAt.getVisibility() == 8 || !(childAt.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        e eVarC = c(childAt);
        if (layoutParams.i || eVarC == null) {
            return;
        }
        float f2 = i3;
        int i8 = (int) (eVarC.f29829b * f2);
        int i9 = isRtlLayout() ? i7 - i8 : i7 + i8;
        if (layoutParams.f29820c) {
            layoutParams.f29820c = false;
            childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams.f29818a), 1073741824), View.MeasureSpec.makeMeasureSpec((i4 - i5) - i6, 1073741824));
        }
        childAt.layout(i9, i5, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + i5);
    }

    private void a(int i2, View view, boolean z) {
        HwPagerAdapter adapter;
        if (!z || (adapter = getAdapter()) == null) {
            return;
        }
        int count = adapter.getCount() - 1;
        if (isSupportLoop() && (!isSupportLoop() || i2 == getClientWidth() * count || i2 == (-(count * getClientWidth())))) {
            return;
        }
        a(i2, view);
    }

    private void a(int i2, View view) {
        this.n0.transformPage(view, isPageScrollHorizontal() ? (isRtlLayout() ? i2 - view.getLeft() : view.getLeft() - i2) / getClientWidth() : (view.getTop() - i2) / getClientHeight());
    }

    private void a(int i2, float f2, int i3) {
        if (this.G0) {
            b(i2, i3);
        }
        OnPageChangeListener onPageChangeListener = this.k0;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i2, f2, i3);
        }
        List<OnPageChangeListener> list = this.j0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                OnPageChangeListener onPageChangeListener2 = this.j0.get(i4);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i2, f2, i3);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.l0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i2, f2, i3);
        }
    }

    private void a(int i2) {
        OnPageChangeListener onPageChangeListener = this.k0;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i2);
        }
        List<OnPageChangeListener> list = this.j0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = this.j0.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.l0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i2);
        }
    }

    private void a(boolean z) {
        boolean z2 = this.r0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (this.v0) {
                i();
            } else if (!this.n.isFinished()) {
                this.n.abortAnimation();
                a(getScrollX(), getScrollY(), this.n.getCurrX(), this.n.getCurrY());
            }
        }
        this.G = false;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            e eVar = this.f.get(i2);
            if (eVar.f29830c) {
                eVar.f29830c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                ViewCompat.postOnAnimation(this, this.j);
            } else {
                this.j.run();
            }
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i2 == i4 && i3 == i5) {
            return;
        }
        scrollTo(i4, i5);
        if (i4 != i2) {
            pageScrolled(i4);
        }
    }

    private void a(float f2, float f3, float f4, float f5) {
        if (Float.compare(f3, this.M) <= 0 || Float.compare(f3 * 0.9f, f5) <= 0) {
            if (f5 > this.M) {
                this.J = true;
            }
        } else {
            this.I = true;
            c(true);
            setScrollState(1);
            this.N = Float.compare(f2, 0.0f) > 0 ? this.P + this.M : this.P - this.M;
            this.O = f4;
            setScrollingCacheEnabled(true);
        }
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.B0) {
            this.F0.c(motionEvent);
            setScrollState(0);
            return true;
        }
        if (this.I) {
            a(this.f29816b, true, 0, false);
            this.a1 = u();
        }
        return false;
    }

    private boolean a(MotionEvent motionEvent, boolean z) {
        if (this.I) {
            if (isPageScrollHorizontal()) {
                if (g(motionEvent)) {
                    return u();
                }
            } else if (h(motionEvent)) {
                return u();
            }
        }
        return z;
    }

    private void a(MotionEvent motionEvent, int i2) {
        try {
            float x = motionEvent.getX(i2);
            float fAbs = Math.abs(x - this.N);
            float y = motionEvent.getY(i2);
            float fAbs2 = Math.abs(y - this.O);
            if (fAbs <= this.M || fAbs <= fAbs2) {
                return;
            }
            this.I = true;
            c(true);
            float f2 = this.P;
            this.N = x - f2 > 0.0f ? f2 + this.M : f2 - this.M;
            this.O = y;
            setScrollState(1);
            setScrollingCacheEnabled(true);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } catch (IllegalArgumentException unused) {
            Log.e(h1, "actionMoveHorizontal: pointer index out of range");
        }
    }

    private boolean a(boolean z, float f2, int i2, float f3, boolean z2) {
        if (!z2) {
            return z;
        }
        this.d0.onPull(i2 <= 0 ? 0.0f : Math.abs(f3 - f2) / i2);
        return true;
    }

    private float a(int i2, float f2, float f3) {
        return f2 * new crg(i2 * 0.5f).getRate(Math.abs(f3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int a(int i2, float f2, int i3, int i4) {
        float f3;
        if (Math.abs(i4) > this.W && Math.abs(i3) > this.U) {
            return isRtlLayout() ? i2 + 1 : i2 + 1;
        }
        if (Float.compare(this.A, Float.MIN_VALUE) != 0) {
            f3 = i2 >= this.f29816b ? 1.0f - this.A : this.A;
        } else if (this.v0) {
            f3 = 0.5f;
        } else {
            f3 = i2 >= this.f29816b ? 0.39999998f : q1;
        }
        return i2 + ((int) (f2 + f3));
    }

    private boolean a(Canvas canvas, int i2, int i3, float f2, boolean z) {
        if (z) {
            float f3 = f2 - this.q;
            if (f3 < i2) {
                float f4 = i3;
                this.r.setBounds(Math.round(f3 + f4), this.s, Math.round(f4 + f2), this.t);
                this.r.draw(canvas);
            }
            return f2 < ((float) (i2 - i3));
        }
        if (this.q + f2 > i2) {
            if (isPageScrollHorizontal()) {
                this.r.setBounds(Math.round(f2), this.s, Math.round(this.q + f2), this.t);
            } else {
                this.r.setBounds(this.u, Math.round(f2), this.v, Math.round(this.q + f2));
            }
            this.r.draw(canvas);
        }
        return f2 > ((float) (i2 + i3));
    }

    private float a(float f2, int i2) {
        float f3;
        float f4;
        float f5;
        float f6;
        if (isRtlLayout()) {
            f3 = -i2;
            f4 = this.z;
        } else {
            f3 = i2;
            f4 = this.y;
        }
        float f7 = f3 * f4;
        if (isRtlLayout()) {
            f5 = -i2;
            f6 = this.y;
        } else {
            f5 = i2;
            f6 = this.z;
        }
        float f8 = f5 * f6;
        e eVar = this.f.get(0);
        ArrayList<e> arrayList = this.f;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f29828a != 0) {
            if (isRtlLayout()) {
                f8 = (-eVar.f29829b) * i2;
            } else {
                f7 = eVar.f29829b * i2;
            }
        }
        if (eVar2.f29828a != this.f29815a.getCount() - 1) {
            if (isRtlLayout()) {
                f7 = (-eVar2.f29829b) * i2;
            } else {
                f8 = eVar2.f29829b * i2;
            }
        }
        if (f2 < f7) {
            return f7;
        }
        return f2 > f8 ? f8 : f2;
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void a() {
        if (!this.t0) {
            this.A0 = true;
            return;
        }
        HwPagerAdapter hwPagerAdapter = this.f29815a;
        if ((hwPagerAdapter instanceof xgn) && this.f29816b < ((xgn) hwPagerAdapter).a()) {
            postDelayed(new Runnable() { // from class: xgm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52883c.k();
                }
            }, isDynamicSpringAnimaitionEnabled() ? 700L : 300L);
            this.A0 = false;
        }
    }

    private ViewGroupOverlay a(View view) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            Log.e(h1, "getParentViewOverlay: viewParent is null");
            return null;
        }
        if (parent instanceof ViewGroup) {
            return ((ViewGroup) parent).getOverlay();
        }
        Log.e(h1, "getParentViewOverlay: viewParent is not instance of ViewGroup");
        return null;
    }

    private void a(ArrayList<View> arrayList, int i2, int i3) {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                e eVarC = c(childAt);
                if (arrayList != null && eVarC != null && eVarC.f29828a == this.f29816b) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
    }

    private boolean a(int i2, Rect rect, int i3) {
        e eVarC;
        View childAt = getChildAt(i3);
        return childAt.getVisibility() == 0 && (eVarC = c(childAt)) != null && eVarC.f29828a == this.f29816b && childAt.requestFocus(i2, rect);
    }

    private void a(int i2, boolean z) {
        int iA = a(i2, this.f29815a);
        this.O0 = false;
        setCurrentItem(iA, z);
        this.O0 = true;
    }

    private int a(int i2, HwPagerAdapter hwPagerAdapter) {
        return ((hwPagerAdapter instanceof xgn) && this.t0) ? ((xgn) hwPagerAdapter).c(i2) : i2;
    }
}
