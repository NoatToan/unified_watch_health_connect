package androidx.viewpager.widget;

import android.R;
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
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.core.view.z;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import ds.e0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int[] f11268c1 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final a f11269d1 = new a();

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final b f11270e1 = new b();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final n f11271f1 = new n();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public int H0;
    public float I;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public long M0;
    public EdgeEffect N0;
    public EdgeEffect O0;
    public float P;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public ArrayList S0;
    public int T;
    public j T0;
    public j U0;
    public ArrayList V0;
    public MaterialCalendarView.c W0;
    public int X0;
    public int Y0;
    public ArrayList<View> Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11272a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final c f11273a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<f> f11274b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f11275b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f11276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f11277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fe.a f11278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Parcelable f11281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ClassLoader f11282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Scroller f11283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11284k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public VelocityTracker f11285k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f11286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f11288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f11291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f11292r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11293t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11294v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11298z;

    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        public final int compare(f fVar, f fVar2) {
            return fVar.f11303b - fVar2.f11303b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f14) {
            float f15 = f14 - 1.0f;
            return (f15 * f15 * f15 * f15 * f15) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.w();
        }
    }

    public class d implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f11300a = new Rect();

        public d() {
        }

        @Override // androidx.core.view.z
        public final m1 onApplyWindowInsets(View view2, m1 m1Var) {
            m1 m1VarK = s0.k(view2, m1Var);
            if (m1VarK.f6508a.s()) {
                return m1VarK;
            }
            int iB = m1VarK.b();
            Rect rect = this.f11300a;
            rect.left = iB;
            rect.top = m1VarK.d();
            rect.right = m1VarK.c();
            rect.bottom = m1VarK.a();
            ViewPager viewPager = ViewPager.this;
            int childCount = viewPager.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                m1 m1VarD = s0.d(viewPager.getChildAt(i14), m1VarK);
                rect.left = Math.min(m1VarD.b(), rect.left);
                rect.top = Math.min(m1VarD.d(), rect.top);
                rect.right = Math.min(m1VarD.c(), rect.right);
                rect.bottom = Math.min(m1VarD.a(), rect.bottom);
            }
            int i15 = rect.left;
            int i16 = rect.top;
            int i17 = rect.right;
            int i18 = rect.bottom;
            m1.a aVar = new m1.a(m1VarK);
            c7.e eVarC = c7.e.c(i15, i16, i17, i18);
            m1.i iVar = aVar.f6509a;
            iVar.h(eVarC);
            return iVar.b();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f11302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f11305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f11306e;
    }

    public class h extends androidx.core.view.a {
        public h() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            boolean z14;
            fe.a aVar;
            super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            fe.a aVar2 = viewPager.f11278e;
            if (aVar2 != null) {
                z14 = aVar2.getCount() > 1;
            }
            accessibilityEvent.setScrollable(z14);
            if (accessibilityEvent.getEventType() != 4096 || (aVar = viewPager.f11278e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(viewPager.f11279f);
            accessibilityEvent.setToIndex(viewPager.f11279f);
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.n(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            fe.a aVar = viewPager.f11278e;
            fVar.s(aVar != null && aVar.getCount() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                fVar.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                fVar.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public final boolean performAccessibilityAction(View view2, int i14, Bundle bundle) {
            if (super.performAccessibilityAction(view2, i14, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i14 == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f11279f + 1);
                return true;
            }
            if (i14 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f11279f - 1);
            return true;
        }
    }

    public interface i {
        void onAdapterChanged(ViewPager viewPager, fe.a aVar, fe.a aVar2);
    }

    public interface j {
        void onPageScrollStateChanged(int i14);

        void onPageScrolled(int i14, float f14, int i15);

        void onPageSelected(int i14);
    }

    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.h();
        }
    }

    public static class m implements j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i14) {
        }
    }

    public static class n implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view2, View view3) {
            g gVar = (g) view2.getLayoutParams();
            g gVar2 = (g) view3.getLayoutParams();
            boolean z14 = gVar.f11307a;
            if (z14 != gVar2.f11307a) {
                return z14 ? 1 : -1;
            }
            return gVar.f11311e - gVar2.f11311e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f11274b = new ArrayList<>();
        this.f11276c = new f();
        this.f11277d = new Rect();
        this.f11280g = -1;
        this.f11281h = null;
        this.f11282i = null;
        this.f11291q = -3.4028235E38f;
        this.f11292r = Float.MAX_VALUE;
        this.f11297y = 1;
        this.T = -1;
        this.P0 = true;
        this.f11273a1 = new c();
        this.f11275b1 = 0;
        q();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z14) {
        if (this.f11295w != z14) {
            this.f11295w = z14;
        }
    }

    public final boolean A() {
        this.T = -1;
        this.f11298z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.f11285k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11285k0 = null;
        }
        this.N0.onRelease();
        this.O0.onRelease();
        return this.N0.isFinished() || this.O0.isFinished();
    }

    public final void B(int i14, int i15, boolean z14, boolean z15) {
        int iMax;
        int scrollX;
        int iAbs;
        f fVarP = p(i14);
        if (fVarP != null) {
            iMax = (int) (Math.max(this.f11291q, Math.min(fVarP.f11306e, this.f11292r)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z14) {
            if (z15) {
                j(i14);
            }
            g(false);
            scrollTo(iMax, 0);
            u(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f11283j;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z16 = this.f11284k;
                Scroller scroller2 = this.f11283j;
                scrollX = z16 ? scroller2.getCurrX() : scroller2.getStartX();
                this.f11283j.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i16 = scrollX;
            int scrollY = getScrollY();
            int i17 = iMax - i16;
            int i18 = 0 - scrollY;
            if (i17 == 0 && i18 == 0) {
                g(false);
                w();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i19 = clientWidth / 2;
                float f14 = clientWidth;
                float f15 = i19;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i17) * 1.0f) / f14) - 0.5f) * 0.47123894f)) * f15) + f15;
                int iAbs2 = Math.abs(i15);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    iAbs = (int) (((Math.abs(i17) / ((this.f11278e.getPageWidth(this.f11279f) * f14) + this.f11287m)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f11284k = false;
                this.f11283j.startScroll(i16, scrollY, i17, i18, iMin);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                postInvalidateOnAnimation();
            }
        }
        if (z15) {
            j(i14);
        }
    }

    public void C(int i14, boolean z14) {
        this.f11296x = false;
        D(i14, 0, z14, false);
    }

    public final void D(int i14, int i15, boolean z14, boolean z15) {
        fe.a aVar = this.f11278e;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<f> arrayList = this.f11274b;
        if (!z15 && this.f11279f == i14 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i14 < 0) {
            i14 = 0;
        } else if (i14 >= this.f11278e.getCount()) {
            i14 = this.f11278e.getCount() - 1;
        }
        int i16 = this.f11297y;
        int i17 = this.f11279f;
        if (i14 > i17 + i16 || i14 < i17 - i16) {
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                arrayList.get(i18).f11304c = true;
            }
        }
        boolean z16 = this.f11279f != i14;
        if (!this.P0) {
            x(i14);
            B(i14, i15, z14, z16);
        } else {
            this.f11279f = i14;
            if (z16) {
                j(i14);
            }
            requestLayout();
        }
    }

    public final void E(MaterialCalendarView.c cVar) {
        boolean z14 = this.W0 == null;
        this.W0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.Y0 = 1;
        this.X0 = 2;
        if (z14) {
            w();
        }
    }

    public final void F() {
        if (this.Y0 != 0) {
            ArrayList<View> arrayList = this.Z0;
            if (arrayList == null) {
                this.Z0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.Z0.add(getChildAt(i14));
            }
            Collections.sort(this.Z0, f11271f1);
        }
    }

    public final f a(int i14, int i15) {
        f fVar = new f();
        fVar.f11303b = i14;
        fVar.f11302a = this.f11278e.instantiateItem((ViewGroup) this, i14);
        fVar.f11305d = this.f11278e.getPageWidth(i14);
        ArrayList<f> arrayList = this.f11274b;
        if (i15 < 0 || i15 >= arrayList.size()) {
            arrayList.add(fVar);
            return fVar;
        }
        arrayList.add(i15, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i14, int i15) {
        f fVarN;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f11303b == this.f11279f) {
                    childAt.addFocusables(arrayList, i14, i15);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i15 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        f fVarN;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f11303b == this.f11279f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new g();
        }
        g gVar = (g) layoutParams;
        boolean z14 = gVar.f11307a | (view2.getClass().getAnnotation(e.class) != null);
        gVar.f11307a = z14;
        if (!this.f11294v) {
            super.addView(view2, i14, layoutParams);
        } else if (z14) {
            vb.h.z("Cannot add pager decor view during layout");
        } else {
            gVar.f11310d = true;
            addViewInLayout(view2, i14, layoutParams);
        }
    }

    public final void b(i iVar) {
        if (this.V0 == null) {
            this.V0 = new ArrayList();
        }
        this.V0.add(iVar);
    }

    public void c(j jVar) {
        if (this.S0 == null) {
            this.S0 = new ArrayList();
        }
        this.S0.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i14) {
        if (this.f11278e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i14 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f11291q));
        }
        return i14 > 0 && scrollX < ((int) (((float) clientWidth) * this.f11292r));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f11284k = true;
        if (this.f11283j.isFinished() || !this.f11283j.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f11283j.getCurrX();
        int currY = this.f11283j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!u(currX)) {
                this.f11283j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    public final boolean d(int i14) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i14);
        boolean z14 = true;
        boolean zT = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f11277d;
            if (i14 == 17) {
                int i15 = m(rect, viewFindNextFocus).left;
                int i16 = m(rect, viewFindFocus).left;
                if (viewFindFocus == null || i15 < i16) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i17 = this.f11279f;
                    if (i17 > 0) {
                        C(i17 - 1, true);
                    } else {
                        z14 = false;
                    }
                    zT = z14;
                }
            } else if (i14 == 66) {
                zRequestFocus = (viewFindFocus == null || m(rect, viewFindNextFocus).left > m(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : t();
            }
            zT = zRequestFocus;
        } else if (i14 == 17 || i14 == 1) {
            int i18 = this.f11279f;
            if (i18 > 0) {
                C(i18 - 1, true);
            } else {
                z14 = false;
            }
            zT = z14;
        } else if (i14 == 66 || i14 == 2) {
            zT = t();
        }
        if (zT) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i14));
        }
        return zT;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zD;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zD = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zD = keyEvent.hasModifiers(2) ? t() : d(66);
                    } else if (keyCode != 61) {
                        zD = false;
                    } else if (keyEvent.hasNoModifiers()) {
                        zD = d(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        zD = d(1);
                    } else {
                        zD = false;
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    int i14 = this.f11279f;
                    if (i14 > 0) {
                        C(i14 - 1, true);
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else {
                    zD = d(17);
                }
            }
            if (!zD) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarN;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f11303b == this.f11279f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        fe.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f11278e) != null && aVar.getCount() > 1)) {
            if (!this.N0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f11291q * width);
                this.N0.setSize(height, width);
                zDraw = this.N0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.O0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f11292r + 1.0f)) * width2);
                this.O0.setSize(height2, width2);
                zDraw |= this.O0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.N0.finish();
            this.O0.finish();
        }
        if (zDraw) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11288n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final boolean e() {
        if (this.f11298z) {
            return false;
        }
        this.L0 = true;
        setScrollState(1);
        this.E = 0.0f;
        this.I = 0.0f;
        VelocityTracker velocityTracker = this.f11285k0;
        if (velocityTracker == null) {
            this.f11285k0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f11285k0.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.M0 = jUptimeMillis;
        return true;
    }

    public boolean f(int i14, int i15, int i16, View view2, boolean z14) {
        int i17;
        if (!(view2 instanceof ViewGroup)) {
            return z14 ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        int scrollX = view2.getScrollX();
        int scrollY = view2.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i18 = i15 + scrollX;
            if (i18 < childAt.getLeft() || i18 >= childAt.getRight() || (i17 = i16 + scrollY) < childAt.getTop() || i17 >= childAt.getBottom() || !f(i14, i18 - childAt.getLeft(), i17 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z14 || !view2.canScrollHorizontally(-i14)) {
        }
        return true;
    }

    public final void g(boolean z14) {
        boolean z15 = this.f11275b1 == 2;
        if (z15) {
            setScrollingCacheEnabled(false);
            if (!this.f11283j.isFinished()) {
                this.f11283j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f11283j.getCurrX();
                int currY = this.f11283j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        u(currX);
                    }
                }
            }
        }
        this.f11296x = false;
        int i14 = 0;
        while (true) {
            ArrayList<f> arrayList = this.f11274b;
            if (i14 >= arrayList.size()) {
                break;
            }
            f fVar = arrayList.get(i14);
            if (fVar.f11304c) {
                fVar.f11304c = false;
                z15 = true;
            }
            i14++;
        }
        if (z15) {
            c cVar = this.f11273a1;
            if (!z14) {
                cVar.run();
            } else {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                postOnAnimation(cVar);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public fe.a getAdapter() {
        return this.f11278e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i14, int i15) {
        if (this.Y0 == 2) {
            i15 = (i14 - 1) - i15;
        }
        return ((g) this.Z0.get(i15).getLayoutParams()).f11312f;
    }

    public int getCurrentItem() {
        return this.f11279f;
    }

    public int getOffscreenPageLimit() {
        return this.f11297y;
    }

    public int getPageMargin() {
        return this.f11287m;
    }

    public final void h() {
        int count = this.f11278e.getCount();
        this.f11272a = count;
        ArrayList<f> arrayList = this.f11274b;
        boolean z14 = arrayList.size() < (this.f11297y * 2) + 1 && arrayList.size() < count;
        int iMax = this.f11279f;
        int i14 = 0;
        boolean z15 = false;
        while (i14 < arrayList.size()) {
            f fVar = arrayList.get(i14);
            int itemPosition = this.f11278e.getItemPosition(fVar.f11302a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    arrayList.remove(i14);
                    i14--;
                    if (!z15) {
                        this.f11278e.startUpdate((ViewGroup) this);
                        z15 = true;
                    }
                    this.f11278e.destroyItem((ViewGroup) this, fVar.f11303b, fVar.f11302a);
                    int i15 = this.f11279f;
                    if (i15 == fVar.f11303b) {
                        iMax = Math.max(0, Math.min(i15, count - 1));
                    }
                } else {
                    int i16 = fVar.f11303b;
                    if (i16 != itemPosition) {
                        if (i16 == this.f11279f) {
                            iMax = itemPosition;
                        }
                        fVar.f11303b = itemPosition;
                    }
                }
                z14 = true;
            }
            i14++;
        }
        if (z15) {
            this.f11278e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(arrayList, f11269d1);
        if (z14) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                g gVar = (g) getChildAt(i17).getLayoutParams();
                if (!gVar.f11307a) {
                    gVar.f11309c = 0.0f;
                }
            }
            D(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final int i(int i14, float f14, int i15, int i16) {
        if (Math.abs(i16) <= this.J0 || Math.abs(i15) <= this.H0) {
            i14 += (int) (f14 + (i14 >= this.f11279f ? 0.4f : 0.6f));
        } else if (i15 <= 0) {
            i14++;
        }
        ArrayList<f> arrayList = this.f11274b;
        if (arrayList.size() > 0) {
            return Math.max(arrayList.get(0).f11303b, Math.min(i14, ((f) am.j.f(1, arrayList)).f11303b));
        }
        return i14;
    }

    public final void j(int i14) {
        j jVar = this.T0;
        if (jVar != null) {
            jVar.onPageSelected(i14);
        }
        ArrayList arrayList = this.S0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                j jVar2 = (j) this.S0.get(i15);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i14);
                }
            }
        }
        j jVar3 = this.U0;
        if (jVar3 != null) {
            jVar3.onPageSelected(i14);
        }
    }

    public final void k() {
        if (!this.L0) {
            vb.h.z("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.f11278e != null) {
            VelocityTracker velocityTracker = this.f11285k0;
            velocityTracker.computeCurrentVelocity(1000, this.I0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.T);
            this.f11296x = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarO = o();
            D(i(fVarO.f11303b, ((scrollX / clientWidth) - fVarO.f11306e) / fVarO.f11305d, xVelocity, (int) (this.E - this.I)), xVelocity, true, true);
        }
        this.f11298z = false;
        this.A = false;
        VelocityTracker velocityTracker2 = this.f11285k0;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f11285k0 = null;
        }
        this.L0 = false;
    }

    public final void l(float f14) {
        if (!this.L0) {
            vb.h.z("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.f11278e == null) {
            return;
        }
        this.E += f14;
        float scrollX = getScrollX() - f14;
        float clientWidth = getClientWidth();
        float f15 = this.f11291q * clientWidth;
        float f16 = this.f11292r * clientWidth;
        ArrayList<f> arrayList = this.f11274b;
        f fVar = arrayList.get(0);
        f fVar2 = (f) am.j.f(1, arrayList);
        if (fVar.f11303b != 0) {
            f15 = fVar.f11306e * clientWidth;
        }
        if (fVar2.f11303b != this.f11278e.getCount() - 1) {
            f16 = fVar2.f11306e * clientWidth;
        }
        if (scrollX < f15) {
            scrollX = f15;
        } else if (scrollX > f16) {
            scrollX = f16;
        }
        int i14 = (int) scrollX;
        this.E = (scrollX - i14) + this.E;
        scrollTo(i14, getScrollY());
        u(i14);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.M0, SystemClock.uptimeMillis(), 2, this.E, 0.0f, 0);
        this.f11285k0.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final Rect m(Rect rect, View view2) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view2 == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view2.getLeft();
        rect.right = view2.getRight();
        rect.top = view2.getTop();
        rect.bottom = view2.getBottom();
        ViewParent parent = view2.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final f n(View view2) {
        int i14 = 0;
        while (true) {
            ArrayList<f> arrayList = this.f11274b;
            if (i14 >= arrayList.size()) {
                return null;
            }
            f fVar = arrayList.get(i14);
            if (this.f11278e.isViewFromObject(view2, fVar.f11302a)) {
                return fVar;
            }
            i14++;
        }
    }

    public final f o() {
        f fVar;
        int i14;
        int clientWidth = getClientWidth();
        float f14 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f15 = clientWidth > 0 ? this.f11287m / clientWidth : 0.0f;
        int i15 = 0;
        boolean z14 = true;
        f fVar2 = null;
        int i16 = -1;
        float f16 = 0.0f;
        while (true) {
            ArrayList<f> arrayList = this.f11274b;
            if (i15 >= arrayList.size()) {
                break;
            }
            f fVar3 = arrayList.get(i15);
            if (z14 || fVar3.f11303b == (i14 = i16 + 1)) {
                fVar = fVar3;
            } else {
                float f17 = f14 + f16 + f15;
                f fVar4 = this.f11276c;
                fVar4.f11306e = f17;
                fVar4.f11303b = i14;
                fVar4.f11305d = this.f11278e.getPageWidth(i14);
                i15--;
                fVar = fVar4;
            }
            f14 = fVar.f11306e;
            float f18 = fVar.f11305d + f14 + f15;
            if (!z14 && scrollX < f14) {
                break;
            }
            if (scrollX < f18 || i15 == arrayList.size() - 1) {
                return fVar;
            }
            int i17 = fVar.f11303b;
            float f19 = fVar.f11305d;
            i15++;
            f fVar5 = fVar;
            i16 = i17;
            f16 = f19;
            fVar2 = fVar5;
            z14 = false;
        }
        return fVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f11273a1);
        Scroller scroller = this.f11283j;
        if (scroller != null && !scroller.isFinished()) {
            this.f11283j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i14;
        float f14;
        super.onDraw(canvas);
        if (this.f11287m <= 0 || this.f11288n == null) {
            return;
        }
        ArrayList<f> arrayList = this.f11274b;
        if (arrayList.size() <= 0 || this.f11278e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f15 = width;
        float f16 = this.f11287m / f15;
        int i15 = 0;
        f fVar = arrayList.get(0);
        float f17 = fVar.f11306e;
        int size = arrayList.size();
        int i16 = fVar.f11303b;
        int i17 = arrayList.get(size - 1).f11303b;
        while (i16 < i17) {
            while (true) {
                i14 = fVar.f11303b;
                if (i16 <= i14 || i15 >= size) {
                    break;
                }
                i15++;
                fVar = arrayList.get(i15);
            }
            if (i16 == i14) {
                float f18 = fVar.f11306e;
                float f19 = fVar.f11305d;
                f14 = (f18 + f19) * f15;
                f17 = f18 + f19 + f16;
            } else {
                float pageWidth = this.f11278e.getPageWidth(i16);
                f14 = (f17 + pageWidth) * f15;
                f17 = pageWidth + f16 + f17;
            }
            if (this.f11287m + f14 > scrollX) {
                this.f11288n.setBounds(Math.round(f14), this.f11289o, Math.round(this.f11287m + f14), this.f11290p);
                this.f11288n.draw(canvas);
            }
            if (f14 > scrollX + width) {
                return;
            }
            i16++;
            arrayList = arrayList;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A();
            return false;
        }
        if (action != 0) {
            if (this.f11298z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x14 = motionEvent.getX();
            this.I = x14;
            this.E = x14;
            float y14 = motionEvent.getY();
            this.P = y14;
            this.F = y14;
            this.T = motionEvent.getPointerId(0);
            this.A = false;
            this.f11284k = true;
            this.f11283j.computeScrollOffset();
            if (this.f11275b1 != 2 || Math.abs(this.f11283j.getFinalX() - this.f11283j.getCurrX()) <= this.K0) {
                g(false);
                this.f11298z = false;
            } else {
                this.f11283j.abortAnimation();
                this.f11296x = false;
                w();
                this.f11298z = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i14 = this.T;
            if (i14 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i14);
                float x15 = motionEvent.getX(iFindPointerIndex);
                float f14 = x15 - this.E;
                float fAbs = Math.abs(f14);
                float y15 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y15 - this.P);
                if (f14 != 0.0f) {
                    float f15 = this.E;
                    if ((f15 >= this.C || f14 <= 0.0f) && ((f15 <= getWidth() - this.C || f14 >= 0.0f) && f((int) f14, (int) x15, (int) y15, this, false))) {
                        this.E = x15;
                        this.F = y15;
                        this.A = true;
                        return false;
                    }
                }
                float f16 = this.D;
                if (fAbs > f16 && fAbs * 0.5f > fAbs2) {
                    this.f11298z = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f17 = this.I;
                    float f18 = this.D;
                    this.E = f14 > 0.0f ? f17 + f18 : f17 - f18;
                    this.F = y15;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f16) {
                    this.A = true;
                }
                if (this.f11298z && v(x15)) {
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            s(motionEvent);
        }
        if (this.f11285k0 == null) {
            this.f11285k0 = VelocityTracker.obtain();
        }
        this.f11285k0.addMovement(motionEvent);
        return this.f11298z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        boolean z15;
        f fVarN;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i24 = 0;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt = getChildAt(i25);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f11307a) {
                    int i26 = gVar.f11308b;
                    int i27 = i26 & 7;
                    int i28 = i26 & 112;
                    if (i27 != 1) {
                        if (i27 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i27 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i18 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i28 != 16) {
                            if (i28 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i28 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i19 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i29 = paddingLeft + scrollX;
                            childAt.layout(i29, paddingTop, childAt.getMeasuredWidth() + i29, childAt.getMeasuredHeight() + paddingTop);
                            i24++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i19 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i30 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i30;
                        int i210 = paddingLeft + scrollX;
                        childAt.layout(i210, paddingTop, childAt.getMeasuredWidth() + i210, childAt.getMeasuredHeight() + paddingTop);
                        i24++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i18 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i34 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i34;
                    if (i28 != 16) {
                        if (i28 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i28 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i19 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i211 = paddingLeft + scrollX;
                        childAt.layout(i211, paddingTop, childAt.getMeasuredWidth() + i211, childAt.getMeasuredHeight() + paddingTop);
                        i24++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i19 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i35 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i35;
                    int i212 = paddingLeft + scrollX;
                    childAt.layout(i212, paddingTop, childAt.getMeasuredWidth() + i212, childAt.getMeasuredHeight() + paddingTop);
                    i24++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i36 = (i18 - paddingLeft) - paddingRight;
        for (int i37 = 0; i37 < childCount; i37++) {
            View childAt2 = getChildAt(i37);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f11307a && (fVarN = n(childAt2)) != null) {
                    float f14 = i36;
                    int i38 = ((int) (fVarN.f11306e * f14)) + paddingLeft;
                    if (gVar2.f11310d) {
                        gVar2.f11310d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f14 * gVar2.f11309c), 1073741824), View.MeasureSpec.makeMeasureSpec((i19 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i38, paddingTop, childAt2.getMeasuredWidth() + i38, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f11289o = paddingTop;
        this.f11290p = i19 - paddingBottom;
        this.R0 = i24;
        if (this.P0) {
            z15 = false;
            B(this.f11279f, 0, false, false);
        } else {
            z15 = false;
        }
        this.P0 = z15;
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        g gVar;
        g gVar2;
        int i16;
        setMeasuredDimension(View.getDefaultSize(0, i14), View.getDefaultSize(0, i15));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i17 = 0;
        while (true) {
            boolean z14 = true;
            int i18 = 1073741824;
            if (i17 >= childCount) {
                break;
            }
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f11307a) {
                int i19 = gVar2.f11308b;
                int i24 = i19 & 7;
                int i25 = i19 & 112;
                boolean z15 = i25 == 48 || i25 == 80;
                if (i24 != 3 && i24 != 5) {
                    z14 = false;
                }
                int i26 = Integer.MIN_VALUE;
                if (z15) {
                    i16 = Integer.MIN_VALUE;
                    i26 = 1073741824;
                } else {
                    i16 = z14 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i27 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i27 != -2) {
                    if (i27 == -1) {
                        i27 = paddingLeft;
                    }
                    i26 = 1073741824;
                } else {
                    i27 = paddingLeft;
                }
                int i28 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i28 == -2) {
                    i28 = measuredHeight;
                    i18 = i16;
                } else if (i28 == -1) {
                    i28 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, i26), View.MeasureSpec.makeMeasureSpec(i28, i18));
                if (z15) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z14) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i17++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f11293t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f11294v = true;
        w();
        this.f11294v = false;
        int childCount2 = getChildCount();
        for (int i29 = 0; i29 < childCount2; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f11307a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f11309c), 1073741824), this.f11293t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i14, Rect rect) {
        int i15;
        int i16;
        int i17;
        f fVarN;
        int childCount = getChildCount();
        if ((i14 & 2) != 0) {
            i16 = childCount;
            i15 = 0;
            i17 = 1;
        } else {
            i15 = childCount - 1;
            i16 = -1;
            i17 = -1;
        }
        while (i15 != i16) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f11303b == this.f11279f && childAt.requestFocus(i14, rect)) {
                return true;
            }
            i15 += i17;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        ClassLoader classLoader = lVar.f11317c;
        super.onRestoreInstanceState(lVar.getSuperState());
        fe.a aVar = this.f11278e;
        if (aVar != null) {
            aVar.restoreState(lVar.f11316b, classLoader);
            D(lVar.f11315a, 0, false, true);
        } else {
            this.f11280g = lVar.f11315a;
            this.f11281h = lVar.f11316b;
            this.f11282i = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f11315a = this.f11279f;
        fe.a aVar = this.f11278e;
        if (aVar != null) {
            lVar.f11316b = aVar.saveState();
        }
        return lVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i15, i16, i17);
        if (i14 != i16) {
            int i18 = this.f11287m;
            y(i14, i16, i18, i18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        fe.a aVar;
        if (!this.L0) {
            boolean zA = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f11278e) == null || aVar.getCount() == 0) {
                return false;
            }
            if (this.f11285k0 == null) {
                this.f11285k0 = VelocityTracker.obtain();
            }
            this.f11285k0.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f11283j.abortAnimation();
                this.f11296x = false;
                w();
                float x14 = motionEvent.getX();
                this.I = x14;
                this.E = x14;
                float y14 = motionEvent.getY();
                this.P = y14;
                this.F = y14;
                this.T = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.E = motionEvent.getX(actionIndex);
                            this.T = motionEvent.getPointerId(actionIndex);
                        } else if (action == 6) {
                            s(motionEvent);
                            this.E = motionEvent.getX(motionEvent.findPointerIndex(this.T));
                        }
                    } else if (this.f11298z) {
                        B(this.f11279f, 0, true, false);
                        zA = A();
                    }
                } else if (!this.f11298z) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.T);
                    if (iFindPointerIndex == -1) {
                        zA = A();
                    } else {
                        float x15 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x15 - this.E);
                        float y15 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y15 - this.F);
                        if (fAbs > this.D && fAbs > fAbs2) {
                            this.f11298z = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f14 = this.I;
                            float f15 = x15 - f14;
                            int i14 = this.D;
                            this.E = f15 > 0.0f ? f14 + i14 : f14 - i14;
                            this.F = y15;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f11298z) {
                            zA = v(motionEvent.getX(motionEvent.findPointerIndex(this.T)));
                        }
                    }
                } else if (this.f11298z) {
                    zA = v(motionEvent.getX(motionEvent.findPointerIndex(this.T)));
                }
            } else if (this.f11298z) {
                VelocityTracker velocityTracker = this.f11285k0;
                velocityTracker.computeCurrentVelocity(1000, this.I0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.T);
                this.f11296x = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f fVarO = o();
                float f16 = clientWidth;
                D(i(fVarO.f11303b, ((scrollX / f16) - fVarO.f11306e) / (fVarO.f11305d + (this.f11287m / f16)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.T)) - this.I)), xVelocity, true, true);
                zA = A();
            }
            if (zA) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final f p(int i14) {
        int i15 = 0;
        while (true) {
            ArrayList<f> arrayList = this.f11274b;
            if (i15 >= arrayList.size()) {
                return null;
            }
            f fVar = arrayList.get(i15);
            if (fVar.f11303b == i14) {
                return fVar;
            }
            i15++;
        }
    }

    public final void q() {
        setWillNotDraw(false);
        setDescendantFocusability(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        setFocusable(true);
        Context context = getContext();
        this.f11283j = new Scroller(context, f11270e1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f14 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.H0 = (int) (400.0f * f14);
        this.I0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.N0 = new EdgeEffect(context);
        this.O0 = new EdgeEffect(context);
        this.J0 = (int) (25.0f * f14);
        this.K0 = (int) (2.0f * f14);
        this.B = (int) (f14 * 16.0f);
        s0.r(this, new h());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        s0.d.c(this, new d());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void r(int i14, float f14, int i15) {
        int iMax;
        int width;
        int left;
        if (this.R0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f11307a) {
                    int i17 = gVar.f11308b & 7;
                    if (i17 != 1) {
                        if (i17 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i17 != 5) {
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
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i18 = iMax;
                    width = paddingLeft;
                    paddingLeft = i18;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        j jVar = this.T0;
        if (jVar != null) {
            jVar.onPageScrolled(i14, f14, i15);
        }
        ArrayList arrayList = this.S0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                j jVar2 = (j) this.S0.get(i19);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i14, f14, i15);
                }
            }
        }
        j jVar3 = this.U0;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i14, f14, i15);
        }
        if (this.W0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i24 = 0; i24 < childCount2; i24++) {
                View childAt2 = getChildAt(i24);
                if (!((g) childAt2.getLayoutParams()).f11307a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    this.W0.getClass();
                    childAt2.setAlpha((float) Math.sqrt(1.0f - Math.abs(left2)));
                }
            }
        }
        this.Q0 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view2) {
        if (this.f11294v) {
            removeViewInLayout(view2);
        } else {
            super.removeView(view2);
        }
    }

    public final void s(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.T) {
            int i14 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i14);
            this.T = motionEvent.getPointerId(i14);
            VelocityTracker velocityTracker = this.f11285k0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void setAdapter(fe.a aVar) {
        ArrayList<f> arrayList;
        fe.a aVar2 = this.f11278e;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.f11278e.startUpdate((ViewGroup) this);
            int i14 = 0;
            while (true) {
                arrayList = this.f11274b;
                if (i14 >= arrayList.size()) {
                    break;
                }
                f fVar = arrayList.get(i14);
                this.f11278e.destroyItem((ViewGroup) this, fVar.f11303b, fVar.f11302a);
                i14++;
            }
            this.f11278e.finishUpdate((ViewGroup) this);
            arrayList.clear();
            int i15 = 0;
            while (i15 < getChildCount()) {
                if (!((g) getChildAt(i15).getLayoutParams()).f11307a) {
                    removeViewAt(i15);
                    i15--;
                }
                i15++;
            }
            this.f11279f = 0;
            scrollTo(0, 0);
        }
        fe.a aVar3 = this.f11278e;
        this.f11278e = aVar;
        this.f11272a = 0;
        if (aVar != null) {
            if (this.f11286l == null) {
                this.f11286l = new k();
            }
            this.f11278e.setViewPagerObserver(this.f11286l);
            this.f11296x = false;
            boolean z14 = this.P0;
            this.P0 = true;
            this.f11272a = this.f11278e.getCount();
            if (this.f11280g >= 0) {
                this.f11278e.restoreState(this.f11281h, this.f11282i);
                D(this.f11280g, 0, false, true);
                this.f11280g = -1;
                this.f11281h = null;
                this.f11282i = null;
            } else if (z14) {
                requestLayout();
            } else {
                w();
            }
        }
        ArrayList arrayList2 = this.V0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.V0.size();
        for (int i16 = 0; i16 < size; i16++) {
            ((i) this.V0.get(i16)).onAdapterChanged(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i14) {
        this.f11296x = false;
        D(i14, 0, !this.P0, false);
    }

    public void setOffscreenPageLimit(int i14) {
        if (i14 < 1) {
            i14 = 1;
        }
        if (i14 != this.f11297y) {
            this.f11297y = i14;
            w();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.T0 = jVar;
    }

    public void setPageMargin(int i14) {
        int i15 = this.f11287m;
        this.f11287m = i14;
        int width = getWidth();
        y(width, width, i14, i15);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f11288n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i14) {
        if (this.f11275b1 == i14) {
            return;
        }
        this.f11275b1 = i14;
        if (this.W0 != null) {
            boolean z14 = i14 != 0;
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                getChildAt(i15).setLayerType(z14 ? this.X0 : 0, null);
            }
        }
        j jVar = this.T0;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i14);
        }
        ArrayList arrayList = this.S0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                j jVar2 = (j) this.S0.get(i16);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i14);
                }
            }
        }
        j jVar3 = this.U0;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i14);
        }
    }

    public final boolean t() {
        fe.a aVar = this.f11278e;
        if (aVar == null || this.f11279f >= aVar.getCount() - 1) {
            return false;
        }
        C(this.f11279f + 1, true);
        return true;
    }

    public final boolean u(int i14) {
        if (this.f11274b.size() == 0) {
            if (!this.P0) {
                this.Q0 = false;
                r(0, 0.0f, 0);
                if (!this.Q0) {
                    vb.h.z("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        f fVarO = o();
        int clientWidth = getClientWidth();
        int i15 = this.f11287m;
        int i16 = clientWidth + i15;
        float f14 = clientWidth;
        int i17 = fVarO.f11303b;
        float f15 = ((i14 / f14) - fVarO.f11306e) / (fVarO.f11305d + (i15 / f14));
        this.Q0 = false;
        r(i17, f15, (int) (i16 * f15));
        if (this.Q0) {
            return true;
        }
        vb.h.z("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final boolean v(float f14) {
        boolean z14;
        boolean z15;
        float f15 = this.E - f14;
        this.E = f14;
        float scrollX = getScrollX() + f15;
        float clientWidth = getClientWidth();
        float f16 = this.f11291q * clientWidth;
        float f17 = this.f11292r * clientWidth;
        ArrayList<f> arrayList = this.f11274b;
        boolean z16 = false;
        f fVar = arrayList.get(0);
        f fVar2 = (f) am.j.f(1, arrayList);
        if (fVar.f11303b != 0) {
            f16 = fVar.f11306e * clientWidth;
            z14 = false;
        } else {
            z14 = true;
        }
        if (fVar2.f11303b != this.f11278e.getCount() - 1) {
            f17 = fVar2.f11306e * clientWidth;
            z15 = false;
        } else {
            z15 = true;
        }
        if (scrollX < f16) {
            if (z14) {
                this.N0.onPull(Math.abs(f16 - scrollX) / clientWidth);
                z16 = true;
            }
            scrollX = f16;
        } else if (scrollX > f17) {
            if (z15) {
                this.O0.onPull(Math.abs(scrollX - f17) / clientWidth);
                z16 = true;
            }
            scrollX = f17;
        }
        int i14 = (int) scrollX;
        this.E = (scrollX - i14) + this.E;
        scrollTo(i14, getScrollY());
        u(i14);
        return z16;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11288n;
    }

    public final void w() {
        x(this.f11279f);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c7 A[PHI: r7 r11 r15
      0x00c7: PHI (r7v13 int) = (r7v12 int), (r7v4 int), (r7v16 int) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v26 int) = (r11v1 int), (r11v25 int), (r11v29 int) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0149 A[PHI: r3 r12
      0x0149: PHI (r3v43 float) = (r3v41 float), (r3v42 float), (r3v40 float) binds: [B:98:0x0170, B:95:0x015a, B:88:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r12v10 int) = (r12v8 int), (r12v9 int), (r12v7 int) binds: [B:98:0x0170, B:95:0x015a, B:88:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    public final void x(int i14) {
        f fVarP;
        String hexString;
        ArrayList<f> arrayList;
        f fVarA;
        float f14;
        f fVarN;
        f fVarN2;
        int i15;
        int i16;
        f fVar;
        f fVar2;
        f fVar3;
        int i17 = this.f11279f;
        if (i17 != i14) {
            fVarP = p(i17);
            this.f11279f = i14;
        } else {
            fVarP = null;
        }
        if (this.f11278e == null) {
            F();
            return;
        }
        if (this.f11296x) {
            F();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f11278e.startUpdate((ViewGroup) this);
        int i18 = this.f11297y;
        int iMax = Math.max(0, this.f11279f - i18);
        int count = this.f11278e.getCount();
        int iMin = Math.min(count - 1, this.f11279f + i18);
        if (count != this.f11272a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb3 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            e0.m(this.f11272a, count, ", found: ", " Pager id: ", sb3);
            sb3.append(hexString);
            sb3.append(" Pager class: ");
            sb3.append(getClass());
            sb3.append(" Problematic adapter: ");
            fb1.c.y(sb3, this.f11278e.getClass());
            return;
        }
        int i19 = 0;
        while (true) {
            arrayList = this.f11274b;
            if (i19 < arrayList.size()) {
                fVarA = arrayList.get(i19);
                int i24 = fVarA.f11303b;
                int i25 = this.f11279f;
                if (i24 >= i25) {
                    if (i24 != i25) {
                        break;
                    } else {
                        break;
                    }
                }
                i19++;
            }
            fVarA = null;
            break;
        }
        if (fVarA == null && count > 0) {
            fVarA = a(this.f11279f, i19);
        }
        if (fVarA != null) {
            int i26 = i19 - 1;
            f fVar4 = i26 >= 0 ? arrayList.get(i26) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - fVarA.f11305d);
            float f15 = 0.0f;
            for (int i27 = this.f11279f - 1; i27 >= 0; i27--) {
                if (f15 < paddingLeft || i27 >= iMax) {
                    if (fVar4 == null || i27 != fVar4.f11303b) {
                        f15 += a(i27, i26 + 1).f11305d;
                        i19++;
                        if (i26 >= 0) {
                            fVar3 = arrayList.get(i26);
                        } else {
                            fVar3 = null;
                        }
                    } else {
                        f15 += fVar4.f11305d;
                        i26--;
                        if (i26 >= 0) {
                            fVar3 = arrayList.get(i26);
                        } else {
                            fVar3 = null;
                        }
                    }
                    fVar4 = fVar3;
                } else {
                    if (fVar4 == null) {
                        break;
                    }
                    if (i27 == fVar4.f11303b && !fVar4.f11304c) {
                        arrayList.remove(i26);
                        this.f11278e.destroyItem((ViewGroup) this, i27, fVar4.f11302a);
                        i26--;
                        i19--;
                        if (i26 >= 0) {
                            fVar3 = arrayList.get(i26);
                        } else {
                            fVar3 = null;
                        }
                        fVar4 = fVar3;
                    }
                }
            }
            f14 = 0.0f;
            float f16 = fVarA.f11305d;
            int i28 = i19 + 1;
            if (f16 < 2.0f) {
                f fVar5 = i28 < arrayList.size() ? arrayList.get(i28) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i29 = i28;
                for (int i30 = this.f11279f + 1; i30 < count; i30++) {
                    if (f16 >= paddingRight && i30 > iMin) {
                        if (fVar5 == null) {
                            break;
                        }
                        if (i30 == fVar5.f11303b && !fVar5.f11304c) {
                            arrayList.remove(i29);
                            this.f11278e.destroyItem((ViewGroup) this, i30, fVar5.f11302a);
                            if (i29 < arrayList.size()) {
                                fVar5 = arrayList.get(i29);
                            } else {
                                fVar5 = null;
                            }
                        }
                    } else if (fVar5 == null || i30 != fVar5.f11303b) {
                        f fVarA2 = a(i30, i29);
                        i29++;
                        f16 += fVarA2.f11305d;
                        if (i29 < arrayList.size()) {
                            fVar5 = arrayList.get(i29);
                        } else {
                            fVar5 = null;
                        }
                    } else {
                        f16 += fVar5.f11305d;
                        i29++;
                        if (i29 < arrayList.size()) {
                            fVar5 = arrayList.get(i29);
                        } else {
                            fVar5 = null;
                        }
                    }
                }
            }
            int count2 = this.f11278e.getCount();
            int clientWidth2 = getClientWidth();
            float f17 = clientWidth2 > 0 ? this.f11287m / clientWidth2 : 0.0f;
            if (fVarP != null) {
                int i34 = fVarP.f11303b;
                int i35 = fVarA.f11303b;
                if (i34 < i35) {
                    float pageWidth = fVarP.f11306e + fVarP.f11305d + f17;
                    int i36 = i34 + 1;
                    int i37 = 0;
                    while (i36 <= fVarA.f11303b && i37 < arrayList.size()) {
                        f fVar6 = arrayList.get(i37);
                        while (true) {
                            fVar2 = fVar6;
                            if (i36 <= fVar2.f11303b || i37 >= arrayList.size() - 1) {
                                break;
                            }
                            i37++;
                            fVar6 = arrayList.get(i37);
                        }
                        while (i36 < fVar2.f11303b) {
                            pageWidth += this.f11278e.getPageWidth(i36) + f17;
                            i36++;
                        }
                        fVar2.f11306e = pageWidth;
                        pageWidth += fVar2.f11305d + f17;
                        i36++;
                    }
                } else if (i34 > i35) {
                    int size = arrayList.size() - 1;
                    float pageWidth2 = fVarP.f11306e;
                    while (true) {
                        i34--;
                        if (i34 < fVarA.f11303b || size < 0) {
                            break;
                        }
                        f fVar7 = arrayList.get(size);
                        while (true) {
                            fVar = fVar7;
                            if (i34 >= fVar.f11303b || size <= 0) {
                                break;
                            }
                            size--;
                            fVar7 = arrayList.get(size);
                        }
                        while (i34 > fVar.f11303b) {
                            pageWidth2 -= this.f11278e.getPageWidth(i34) + f17;
                            i34--;
                        }
                        pageWidth2 -= fVar.f11305d + f17;
                        fVar.f11306e = pageWidth2;
                    }
                }
            }
            int size2 = arrayList.size();
            float pageWidth3 = fVarA.f11306e;
            int i38 = fVarA.f11303b;
            int i39 = i38 - 1;
            this.f11291q = i38 == 0 ? pageWidth3 : -3.4028235E38f;
            int i44 = count2 - 1;
            this.f11292r = i38 == i44 ? (fVarA.f11305d + pageWidth3) - 1.0f : Float.MAX_VALUE;
            int i45 = i19 - 1;
            while (i45 >= 0) {
                f fVar8 = arrayList.get(i45);
                while (true) {
                    i16 = fVar8.f11303b;
                    if (i39 <= i16) {
                        break;
                    }
                    pageWidth3 -= this.f11278e.getPageWidth(i39) + f17;
                    i39--;
                }
                pageWidth3 -= fVar8.f11305d + f17;
                fVar8.f11306e = pageWidth3;
                if (i16 == 0) {
                    this.f11291q = pageWidth3;
                }
                i45--;
                i39--;
            }
            float pageWidth4 = fVarA.f11306e + fVarA.f11305d + f17;
            int i46 = fVarA.f11303b;
            while (true) {
                i46++;
                if (i28 >= size2) {
                    break;
                }
                f fVar9 = arrayList.get(i28);
                while (true) {
                    i15 = fVar9.f11303b;
                    if (i46 >= i15) {
                        break;
                    }
                    pageWidth4 += this.f11278e.getPageWidth(i46) + f17;
                    i46++;
                }
                if (i15 == i44) {
                    this.f11292r = (fVar9.f11305d + pageWidth4) - 1.0f;
                }
                fVar9.f11306e = pageWidth4;
                pageWidth4 += fVar9.f11305d + f17;
                i28++;
            }
            this.f11278e.setPrimaryItem((ViewGroup) this, this.f11279f, fVarA.f11302a);
        } else {
            f14 = 0.0f;
        }
        this.f11278e.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i47 = 0; i47 < childCount; i47++) {
            View childAt = getChildAt(i47);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f11312f = i47;
            if (!gVar.f11307a && gVar.f11309c == f14 && (fVarN2 = n(childAt)) != null) {
                gVar.f11309c = fVarN2.f11305d;
                gVar.f11311e = fVarN2.f11303b;
            }
        }
        F();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                fVarN = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    fVarN = n(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        fVarN = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (fVarN == null || fVarN.f11303b != this.f11279f) {
                for (int i48 = 0; i48 < getChildCount(); i48++) {
                    View childAt2 = getChildAt(i48);
                    f fVarN3 = n(childAt2);
                    if (fVarN3 != null && fVarN3.f11303b == this.f11279f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void y(int i14, int i15, int i16, int i17) {
        if (i15 > 0 && !this.f11274b.isEmpty()) {
            if (!this.f11283j.isFinished()) {
                this.f11283j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i15 - getPaddingLeft()) - getPaddingRight()) + i17)) * (((i14 - getPaddingLeft()) - getPaddingRight()) + i16)), getScrollY());
                return;
            }
        }
        f fVarP = p(this.f11279f);
        int iMin = (int) ((fVarP != null ? Math.min(fVarP.f11306e, this.f11292r) : 0.0f) * ((i14 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            g(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final void z(j jVar) {
        ArrayList arrayList = this.S0;
        if (arrayList != null) {
            arrayList.remove(jVar);
        }
    }

    public static class l extends s7.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Parcelable f11316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ClassLoader f11317c;

        public l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f11315a = parcel.readInt();
            this.f11316b = parcel.readParcelable(classLoader);
            this.f11317c = classLoader;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FragmentPager.SavedState{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" position=");
            return am.j.q(sb3, this.f11315a, StringSubstitutor.DEFAULT_VAR_END);
        }

        @Override // s7.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f11315a);
            parcel.writeParcelable(this.f11316b, i14);
        }

        public static class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i14) {
                return new l[i14];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g();
    }

    public void setPageMarginDrawable(int i14) {
        setPageMarginDrawable(a7.b.getDrawable(getContext(), i14));
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f11309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11312f;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11309c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f11268c1);
            this.f11308b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }

        public g() {
            super(-1, -1);
            this.f11309c = 0.0f;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11274b = new ArrayList<>();
        this.f11276c = new f();
        this.f11277d = new Rect();
        this.f11280g = -1;
        this.f11281h = null;
        this.f11282i = null;
        this.f11291q = -3.4028235E38f;
        this.f11292r = Float.MAX_VALUE;
        this.f11297y = 1;
        this.T = -1;
        this.P0 = true;
        this.f11273a1 = new c();
        this.f11275b1 = 0;
        q();
    }
}
