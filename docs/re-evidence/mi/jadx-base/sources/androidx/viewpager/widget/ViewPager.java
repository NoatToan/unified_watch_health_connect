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
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import defpackage.eih;
import defpackage.m80;
import defpackage.ni4;
import defpackage.o7h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] f0 = {R.attr.layout_gravity};
    public static final Comparator<f> g0 = new a();
    public static final Interpolator h0 = new b();
    public static final l i0 = new l();
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public int H;
    public VelocityTracker I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public EdgeEffect O;
    public EdgeEffect P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public List<i> U;
    public i V;
    public i W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3120a;
    public List<h> a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<f> f3121b;
    public int b0;
    public final f c;
    public ArrayList<View> c0;
    public final Rect d;
    public final Runnable d0;
    public eih e;
    public int e0;
    public int f;
    public int g;
    public Parcelable h;
    public ClassLoader i;
    public Scroller j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3122k;
    public j l;
    public int m;
    public Drawable n;
    public int o;
    public int p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3123r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean y;
    public boolean z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3126b;
        public Parcelable c;
        public ClassLoader d;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f3126b + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3126b);
            parcel.writeParcelable(this.c, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f3126b = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
            this.d = classLoader;
        }
    }

    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f3131b - fVar2.f3131b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.E();
        }
    }

    public class d implements o7h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f3128a = new Rect();

        public d() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat windowInsetsCompatC0 = androidx.core.view.c.c0(view, windowInsetsCompat);
            if (windowInsetsCompatC0.q()) {
                return windowInsetsCompatC0;
            }
            Rect rect = this.f3128a;
            rect.left = windowInsetsCompatC0.k();
            rect.top = windowInsetsCompatC0.m();
            rect.right = windowInsetsCompatC0.l();
            rect.bottom = windowInsetsCompatC0.j();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat windowInsetsCompatG = androidx.core.view.c.g(ViewPager.this.getChildAt(i), windowInsetsCompatC0);
                rect.left = Math.min(windowInsetsCompatG.k(), rect.left);
                rect.top = Math.min(windowInsetsCompatG.m(), rect.top);
                rect.right = Math.min(windowInsetsCompatG.l(), rect.right);
                rect.bottom = Math.min(windowInsetsCompatG.j(), rect.bottom);
            }
            return windowInsetsCompatC0.r(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f3130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3131b;
        public boolean c;
        public float d;
        public float e;
    }

    public class g extends androidx.core.view.a {
        public g() {
        }

        private boolean a() {
            eih eihVar = ViewPager.this.e;
            return eihVar != null && eihVar.getCount() > 1;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            eih eihVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() != 4096 || (eihVar = ViewPager.this.e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(eihVar.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.f);
            accessibilityEvent.setToIndex(ViewPager.this.f);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.i0(ViewPager.class.getName());
            m80Var.F0(a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                m80Var.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                m80Var.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f - 1);
            return true;
        }
    }

    public interface h {
        void b(ViewPager viewPager, eih eihVar, eih eihVar2);
    }

    public interface i {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public class j extends DataSetObserver {
        public j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.i();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.i();
        }
    }

    public static class k implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i) {
        }
    }

    public static class l implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f3124a;
            if (z != layoutParams2.f3124a) {
                return z ? 1 : -1;
            }
            return layoutParams.e - layoutParams2.e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f3121b = new ArrayList<>();
        this.c = new f();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.f3123r = Float.MAX_VALUE;
        this.x = 1;
        this.H = -1;
        this.Q = true;
        this.R = false;
        this.d0 = new c();
        this.e0 = 0;
        v();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.v != z) {
            this.v = z;
        }
    }

    public static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public boolean A() {
        int i2 = this.f;
        if (i2 <= 0) {
            return false;
        }
        L(i2 - 1, true);
        return true;
    }

    public boolean B() {
        eih eihVar = this.e;
        if (eihVar == null || this.f >= eihVar.getCount() - 1) {
            return false;
        }
        L(this.f + 1, true);
        return true;
    }

    public final boolean C(int i2) {
        if (this.f3121b.size() == 0) {
            if (this.Q) {
                return false;
            }
            this.S = false;
            y(0, 0.0f, 0);
            if (this.S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarT = t();
        int clientWidth = getClientWidth();
        int i3 = this.m;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarT.f3131b;
        float f3 = ((i2 / f2) - fVarT.e) / (fVarT.d + (i3 / f2));
        this.S = false;
        y(i5, f3, (int) (i4 * f3));
        if (this.S) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean D(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.D - f2;
        this.D = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.q * clientWidth;
        float f5 = this.f3123r * clientWidth;
        boolean z3 = false;
        f fVar = this.f3121b.get(0);
        ArrayList<f> arrayList = this.f3121b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f3131b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f3131b != this.e.getCount() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.O.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.P.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.D += scrollX - i2;
        scrollTo(i2, getScrollY());
        C(i2);
        return z3;
    }

    public void E() {
        F(this.f);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cb A[PHI: r7 r10 r15
      0x00cb: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    public void F(int i2) {
        f fVarU;
        String hexString;
        f fVarD;
        f fVarS;
        f fVar;
        int i3 = this.f;
        if (i3 != i2) {
            fVarU = u(i3);
            this.f = i2;
        } else {
            fVarU = null;
        }
        if (this.e == null) {
            Q();
            return;
        }
        if (this.w) {
            Q();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.startUpdate((ViewGroup) this);
        int i4 = this.x;
        int iMax = Math.max(0, this.f - i4);
        int count = this.e.getCount();
        int iMin = Math.min(count - 1, this.f + i4);
        if (count != this.f3120a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f3120a + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.e.getClass());
        }
        int i5 = 0;
        while (true) {
            if (i5 < this.f3121b.size()) {
                fVarD = this.f3121b.get(i5);
                int i6 = fVarD.f3131b;
                int i7 = this.f;
                if (i6 >= i7) {
                    if (i6 != i7) {
                        break;
                    } else {
                        break;
                    }
                }
                i5++;
            }
            fVarD = null;
            break;
        }
        if (fVarD == null && count > 0) {
            fVarD = d(this.f, i5);
        }
        if (fVarD != null) {
            int i8 = i5 - 1;
            f fVar2 = i8 >= 0 ? this.f3121b.get(i8) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVarD.d) + (getPaddingLeft() / clientWidth);
            float f2 = 0.0f;
            for (int i9 = this.f - 1; i9 >= 0; i9--) {
                if (f2 < paddingLeft || i9 >= iMax) {
                    if (fVar2 == null || i9 != fVar2.f3131b) {
                        f2 += d(i9, i8 + 1).d;
                        i5++;
                        if (i8 >= 0) {
                            fVar = this.f3121b.get(i8);
                        } else {
                            fVar = null;
                        }
                    } else {
                        f2 += fVar2.d;
                        i8--;
                        if (i8 >= 0) {
                            fVar = this.f3121b.get(i8);
                        } else {
                            fVar = null;
                        }
                    }
                    fVar2 = fVar;
                } else {
                    if (fVar2 == null) {
                        break;
                    }
                    if (i9 == fVar2.f3131b && !fVar2.c) {
                        this.f3121b.remove(i8);
                        this.e.destroyItem((ViewGroup) this, i9, fVar2.f3130a);
                        i8--;
                        i5--;
                        if (i8 >= 0) {
                            fVar = this.f3121b.get(i8);
                        } else {
                            fVar = null;
                        }
                        fVar2 = fVar;
                    }
                }
            }
            float f3 = fVarD.d;
            int i10 = i5 + 1;
            if (f3 < 2.0f) {
                f fVar3 = i10 < this.f3121b.size() ? this.f3121b.get(i10) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i11 = this.f;
                while (true) {
                    i11++;
                    if (i11 >= count) {
                        break;
                    }
                    if (f3 >= paddingRight && i11 > iMin) {
                        if (fVar3 == null) {
                            break;
                        }
                        if (i11 == fVar3.f3131b && !fVar3.c) {
                            this.f3121b.remove(i10);
                            this.e.destroyItem((ViewGroup) this, i11, fVar3.f3130a);
                            if (i10 < this.f3121b.size()) {
                                fVar3 = this.f3121b.get(i10);
                            }
                        }
                    } else if (fVar3 == null || i11 != fVar3.f3131b) {
                        f fVarD2 = d(i11, i10);
                        i10++;
                        f3 += fVarD2.d;
                        fVar3 = i10 < this.f3121b.size() ? this.f3121b.get(i10) : null;
                    } else {
                        f3 += fVar3.d;
                        i10++;
                        if (i10 < this.f3121b.size()) {
                            fVar3 = this.f3121b.get(i10);
                        }
                    }
                }
            }
            f(fVarD, i5, fVarU);
            this.e.setPrimaryItem((ViewGroup) this, this.f, fVarD.f3130a);
        }
        this.e.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f = i12;
            if (!layoutParams.f3124a && layoutParams.c == 0.0f && (fVarS = s(childAt)) != null) {
                layoutParams.c = fVarS.d;
                layoutParams.e = fVarS.f3131b;
            }
        }
        Q();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            f fVarR = viewFindFocus != null ? r(viewFindFocus) : null;
            if (fVarR == null || fVarR.f3131b != this.f) {
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt2 = getChildAt(i13);
                    f fVarS2 = s(childAt2);
                    if (fVarS2 != null && fVarS2.f3131b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void G(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.f3121b.isEmpty()) {
            if (!this.j.isFinished()) {
                this.j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f fVarU = u(this.f);
        int iMin = (int) ((fVarU != null ? Math.min(fVarU.e, this.f3123r) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            h(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final void H() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f3124a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void I(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean J() {
        this.H = -1;
        o();
        this.O.onRelease();
        this.P.onRelease();
        return this.O.isFinished() || this.P.isFinished();
    }

    public final void K(int i2, boolean z, int i3, boolean z2) {
        f fVarU = u(i2);
        int clientWidth = fVarU != null ? (int) (getClientWidth() * Math.max(this.q, Math.min(fVarU.e, this.f3123r))) : 0;
        if (z) {
            P(clientWidth, 0, i3);
            if (z2) {
                l(i2);
                return;
            }
            return;
        }
        if (z2) {
            l(i2);
        }
        h(false);
        scrollTo(clientWidth, 0);
        C(clientWidth);
    }

    public void L(int i2, boolean z) {
        this.w = false;
        M(i2, z, false);
    }

    public void M(int i2, boolean z, boolean z2) {
        N(i2, z, z2, 0);
    }

    public void N(int i2, boolean z, boolean z2, int i3) {
        eih eihVar = this.e;
        if (eihVar == null || eihVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f == i2 && this.f3121b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.e.getCount()) {
            i2 = this.e.getCount() - 1;
        }
        int i4 = this.x;
        int i5 = this.f;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f3121b.size(); i6++) {
                this.f3121b.get(i6).c = true;
            }
        }
        boolean z3 = this.f != i2;
        if (!this.Q) {
            F(i2);
            K(i2, z, i3, z3);
        } else {
            this.f = i2;
            if (z3) {
                l(i2);
            }
            requestLayout();
        }
    }

    public i O(i iVar) {
        i iVar2 = this.W;
        this.W = iVar;
        return iVar2;
    }

    public void P(int i2, int i3, int i4) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f3122k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            h(false);
            E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fN = f3 + (n(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs2 = Math.abs(i4);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fN / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i6) / ((f2 * this.e.getPageWidth(this.f)) + this.m)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f3122k = false;
        this.j.startScroll(i5, scrollY, i6, i7, iMin);
        androidx.core.view.c.h0(this);
    }

    public final void Q() {
        if (this.b0 != 0) {
            ArrayList<View> arrayList = this.c0;
            if (arrayList == null) {
                this.c0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.c0.add(getChildAt(i2));
            }
            Collections.sort(this.c0, i0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarS;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f3131b == this.f) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public void addOnAdapterChangeListener(h hVar) {
        if (this.a0 == null) {
            this.a0 = new ArrayList();
        }
        this.a0.add(hVar);
    }

    public void addOnPageChangeListener(i iVar) {
        if (this.U == null) {
            this.U = new ArrayList();
        }
        this.U.add(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarS;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f3131b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zW = layoutParams2.f3124a | w(view);
        layoutParams2.f3124a = zW;
        if (!this.u) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zW) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.q));
        }
        return i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.f3123r));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f3122k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            h(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!C(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        androidx.core.view.c.h0(this);
    }

    public f d(int i2, int i3) {
        f fVar = new f();
        fVar.f3131b = i2;
        fVar.f3130a = this.e.instantiateItem((ViewGroup) this, i2);
        fVar.d = this.e.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.f3121b.size()) {
            this.f3121b.add(fVar);
        } else {
            this.f3121b.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarS;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f3131b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean zDraw;
        eih eihVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (eihVar = this.e) == null || eihVar.getCount() <= 1)) {
            this.O.finish();
            this.P.finish();
            return;
        }
        if (this.O.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.q * width);
            this.O.setSize(height, width);
            zDraw = this.O.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.P.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.f3123r + 1.0f)) * width2);
            this.P.setSize(height2, width2);
            zDraw |= this.P.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            androidx.core.view.c.h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    public boolean e(int i2) {
        boolean zA;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 == 17 || i2 == 1) {
                zA = A();
            } else if (i2 == 66 || i2 == 2) {
                zA = B();
            } else {
                zA = false;
            }
        } else if (i2 == 17) {
            zA = (viewFindFocus == null || q(this.d, viewFindNextFocus).left < q(this.d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : A();
        } else if (i2 == 66) {
            zA = (viewFindFocus == null || q(this.d, viewFindNextFocus).left > q(this.d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : B();
        } else {
            zA = false;
        }
        if (zA) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zA;
    }

    public final void f(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int count = this.e.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f3131b;
            int i6 = fVar.f3131b;
            if (i5 < i6) {
                float pageWidth = fVar2.e + fVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.f3131b && i8 < this.f3121b.size()) {
                    f fVar5 = this.f3121b.get(i8);
                    while (true) {
                        fVar4 = fVar5;
                        if (i7 <= fVar4.f3131b || i8 >= this.f3121b.size() - 1) {
                            break;
                        }
                        i8++;
                        fVar5 = this.f3121b.get(i8);
                    }
                    while (i7 < fVar4.f3131b) {
                        pageWidth += this.e.getPageWidth(i7) + f2;
                        i7++;
                    }
                    fVar4.e = pageWidth;
                    pageWidth += fVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f3121b.size() - 1;
                float pageWidth2 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.f3131b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f3121b.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i5 >= fVar3.f3131b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f3121b.get(size);
                    }
                    while (i5 > fVar3.f3131b) {
                        pageWidth2 -= this.e.getPageWidth(i5) + f2;
                        i5--;
                    }
                    pageWidth2 -= fVar3.d + f2;
                    fVar3.e = pageWidth2;
                }
            }
        }
        int size2 = this.f3121b.size();
        float pageWidth3 = fVar.e;
        int i9 = fVar.f3131b;
        int i10 = i9 - 1;
        this.q = i9 == 0 ? pageWidth3 : -3.4028235E38f;
        int i11 = count - 1;
        this.f3123r = i9 == i11 ? (fVar.d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar7 = this.f3121b.get(i12);
            while (true) {
                i4 = fVar7.f3131b;
                if (i10 <= i4) {
                    break;
                }
                pageWidth3 -= this.e.getPageWidth(i10) + f2;
                i10--;
            }
            pageWidth3 -= fVar7.d + f2;
            fVar7.e = pageWidth3;
            if (i4 == 0) {
                this.q = pageWidth3;
            }
            i12--;
            i10--;
        }
        float pageWidth4 = fVar.e + fVar.d + f2;
        int i13 = fVar.f3131b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar8 = this.f3121b.get(i14);
            while (true) {
                i3 = fVar8.f3131b;
                if (i13 >= i3) {
                    break;
                }
                pageWidth4 += this.e.getPageWidth(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.f3123r = (fVar8.d + pageWidth4) - 1.0f;
            }
            fVar8.e = pageWidth4;
            pageWidth4 += fVar8.d + f2;
            i14++;
            i13++;
        }
        this.R = false;
    }

    public boolean g(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && g(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public eih getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.b0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) this.c0.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getPageMargin() {
        return this.m;
    }

    public final void h(boolean z) {
        boolean z2 = this.e0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        C(currX);
                    }
                }
            }
        }
        this.w = false;
        for (int i2 = 0; i2 < this.f3121b.size(); i2++) {
            f fVar = this.f3121b.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                androidx.core.view.c.i0(this, this.d0);
            } else {
                this.d0.run();
            }
        }
    }

    public void i() {
        int count = this.e.getCount();
        this.f3120a = count;
        boolean z = this.f3121b.size() < (this.x * 2) + 1 && this.f3121b.size() < count;
        int iMax = this.f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f3121b.size()) {
            f fVar = this.f3121b.get(i2);
            int itemPosition = this.e.getItemPosition(fVar.f3130a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f3121b.remove(i2);
                    i2--;
                    if (!z2) {
                        this.e.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.e.destroyItem((ViewGroup) this, fVar.f3131b, fVar.f3130a);
                    int i3 = this.f;
                    if (i3 == fVar.f3131b) {
                        iMax = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = fVar.f3131b;
                    if (i4 != itemPosition) {
                        if (i4 == this.f) {
                            iMax = itemPosition;
                        }
                        fVar.f3131b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f3121b, g0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f3124a) {
                    layoutParams.c = 0.0f;
                }
            }
            M(iMax, false, true);
            requestLayout();
        }
    }

    public final int j(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.L || Math.abs(i3) <= this.J) {
            i2 += (int) (f2 + (i2 >= this.f ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f3121b.size() <= 0) {
            return i2;
        }
        f fVar = this.f3121b.get(0);
        ArrayList<f> arrayList = this.f3121b;
        return Math.max(fVar.f3131b, Math.min(i2, arrayList.get(arrayList.size() - 1).f3131b));
    }

    public final void k(int i2, float f2, int i3) {
        i iVar = this.V;
        if (iVar != null) {
            iVar.onPageScrolled(i2, f2, i3);
        }
        List<i> list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar2 = this.U.get(i4);
                if (iVar2 != null) {
                    iVar2.onPageScrolled(i2, f2, i3);
                }
            }
        }
        i iVar3 = this.W;
        if (iVar3 != null) {
            iVar3.onPageScrolled(i2, f2, i3);
        }
    }

    public final void l(int i2) {
        i iVar = this.V;
        if (iVar != null) {
            iVar.onPageSelected(i2);
        }
        List<i> list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.U.get(i3);
                if (iVar2 != null) {
                    iVar2.onPageSelected(i2);
                }
            }
        }
        i iVar3 = this.W;
        if (iVar3 != null) {
            iVar3.onPageSelected(i2);
        }
    }

    public final void m(int i2) {
        i iVar = this.V;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i2);
        }
        List<i> list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.U.get(i3);
                if (iVar2 != null) {
                    iVar2.onPageScrollStateChanged(i2);
                }
            }
        }
        i iVar3 = this.W;
        if (iVar3 != null) {
            iVar3.onPageScrollStateChanged(i2);
        }
    }

    public float n(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public final void o() {
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.d0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        super.onDraw(canvas);
        if (this.m <= 0 || this.n == null || this.f3121b.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f3 = width;
        float f4 = this.m / f3;
        int i3 = 0;
        f fVar = this.f3121b.get(0);
        float f5 = fVar.e;
        int size = this.f3121b.size();
        int i4 = fVar.f3131b;
        int i5 = this.f3121b.get(size - 1).f3131b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.f3131b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.f3121b.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * f3;
                f5 = f6 + f7 + f4;
            } else {
                float pageWidth = this.e.getPageWidth(i4);
                f2 = (f5 + pageWidth) * f3;
                f5 += pageWidth + f4;
            }
            if (this.m + f2 > scrollX) {
                this.n.setBounds(Math.round(f2), this.o, Math.round(this.m + f2), this.p);
                this.n.draw(canvas);
            }
            if (f2 > scrollX + width) {
                return;
            }
            i4++;
            f4 = f4;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            J();
            return false;
        }
        if (action != 0) {
            if (this.y) {
                return true;
            }
            if (this.z) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.F = x;
            this.D = x;
            float y = motionEvent.getY();
            this.G = y;
            this.E = y;
            this.H = motionEvent.getPointerId(0);
            this.z = false;
            this.f3122k = true;
            this.j.computeScrollOffset();
            if (this.e0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.M) {
                h(false);
                this.y = false;
            } else {
                this.j.abortAnimation();
                this.w = false;
                E();
                this.y = true;
                I(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.H;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.D;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.G);
                if (f2 != 0.0f && !x(this.D, f2) && g(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.D = x2;
                    this.E = y2;
                    this.z = true;
                    return false;
                }
                int i3 = this.C;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.y = true;
                    I(true);
                    setScrollState(1);
                    float f3 = this.F;
                    float f4 = this.C;
                    this.D = f2 > 0.0f ? f3 + f4 : f3 - f4;
                    this.E = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.z = true;
                }
                if (this.y && D(x2)) {
                    androidx.core.view.c.h0(this);
                }
            }
        } else if (action == 6) {
            z(motionEvent);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        return this.y;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        f fVarS;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f3124a) {
                    int i10 = layoutParams.f3125b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, paddingTop + childAt.getMeasuredHeight());
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, paddingTop + childAt.getMeasuredHeight());
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i16;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i17 = paddingLeft + scrollX;
                        childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, paddingTop + childAt.getMeasuredHeight());
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i18 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i18;
                    int i19 = paddingLeft + scrollX;
                    childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, paddingTop + childAt.getMeasuredHeight());
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i20 = (i6 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f3124a && (fVarS = s(childAt2)) != null) {
                    float f2 = i20;
                    int i22 = ((int) (fVarS.e * f2)) + paddingLeft;
                    if (layoutParams2.d) {
                        layoutParams2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.o = paddingTop;
        this.p = i7 - paddingBottom;
        this.T = i8;
        if (this.Q) {
            z2 = false;
            K(this.f, false, 0, false);
        } else {
            z2 = false;
        }
        this.Q = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.B = Math.min(measuredWidth / 10, this.A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f3124a) {
                int i7 = layoutParams2.f3125b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.s = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.u = true;
        E();
        this.u = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f3124a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.c), 1073741824), this.t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        f fVarS;
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
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f3131b == this.f && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        eih eihVar = this.e;
        if (eihVar != null) {
            eihVar.restoreState(savedState.c, savedState.d);
            M(savedState.f3126b, false, true);
        } else {
            this.g = savedState.f3126b;
            this.h = savedState.c;
            this.i = savedState.d;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3126b = this.f;
        eih eihVar = this.e;
        if (eihVar != null) {
            savedState.c = eihVar.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.m;
            G(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        eih eihVar;
        boolean zJ;
        if (this.N) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (eihVar = this.e) == null || eihVar.getCount() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.j.abortAnimation();
            this.w = false;
            E();
            float x = motionEvent.getX();
            this.F = x;
            this.D = x;
            float y = motionEvent.getY();
            this.G = y;
            this.E = y;
            this.H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.D = motionEvent.getX(actionIndex);
                        this.H = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        z(motionEvent);
                        this.D = motionEvent.getX(motionEvent.findPointerIndex(this.H));
                    }
                } else if (this.y) {
                    K(this.f, true, 0, false);
                    zJ = J();
                    if (zJ) {
                        androidx.core.view.c.h0(this);
                    }
                }
            } else if (!this.y) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.H);
                if (iFindPointerIndex == -1) {
                    zJ = J();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.D);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.E);
                    if (fAbs > this.C && fAbs > fAbs2) {
                        this.y = true;
                        I(true);
                        float f2 = this.F;
                        this.D = x2 - f2 > 0.0f ? f2 + this.C : f2 - this.C;
                        this.E = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.y) {
                        zJ = D(motionEvent.getX(motionEvent.findPointerIndex(this.H)));
                    }
                }
                if (zJ) {
                    androidx.core.view.c.h0(this);
                }
            } else if (this.y) {
                zJ = D(motionEvent.getX(motionEvent.findPointerIndex(this.H)));
                if (zJ) {
                    androidx.core.view.c.h0(this);
                }
            }
        } else if (this.y) {
            VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(1000, this.K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.H);
            this.w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarT = t();
            float f3 = clientWidth;
            N(j(fVarT.f3131b, ((scrollX / f3) - fVarT.e) / (fVarT.d + (this.m / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.H)) - this.F)), true, true, xVelocity);
            zJ = J();
            if (zJ) {
                androidx.core.view.c.h0(this);
            }
        }
        return true;
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? A() : e(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? B() : e(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return e(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return e(1);
                }
            }
        }
        return false;
    }

    public final Rect q(Rect rect, View view) {
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

    public f r(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public void removeOnAdapterChangeListener(h hVar) {
        List<h> list = this.a0;
        if (list != null) {
            list.remove(hVar);
        }
    }

    public void removeOnPageChangeListener(i iVar) {
        List<i> list = this.U;
        if (list != null) {
            list.remove(iVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public f s(View view) {
        for (int i2 = 0; i2 < this.f3121b.size(); i2++) {
            f fVar = this.f3121b.get(i2);
            if (this.e.isViewFromObject(view, fVar.f3130a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(eih eihVar) {
        eih eihVar2 = this.e;
        if (eihVar2 != null) {
            eihVar2.setViewPagerObserver(null);
            this.e.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.f3121b.size(); i2++) {
                f fVar = this.f3121b.get(i2);
                this.e.destroyItem((ViewGroup) this, fVar.f3131b, fVar.f3130a);
            }
            this.e.finishUpdate((ViewGroup) this);
            this.f3121b.clear();
            H();
            this.f = 0;
            scrollTo(0, 0);
        }
        eih eihVar3 = this.e;
        this.e = eihVar;
        this.f3120a = 0;
        if (eihVar != null) {
            if (this.l == null) {
                this.l = new j();
            }
            this.e.setViewPagerObserver(this.l);
            this.w = false;
            boolean z = this.Q;
            this.Q = true;
            this.f3120a = this.e.getCount();
            if (this.g >= 0) {
                this.e.restoreState(this.h, this.i);
                M(this.g, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (z) {
                requestLayout();
            } else {
                E();
            }
        }
        List<h> list = this.a0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.a0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.a0.get(i3).b(this, eihVar3, eihVar);
        }
    }

    public void setCurrentItem(int i2) {
        this.w = false;
        M(i2, !this.Q, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i2);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            i2 = 1;
        }
        if (i2 != this.x) {
            this.x = i2;
            E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.V = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.m;
        this.m = i2;
        int width = getWidth();
        G(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.e0 == i2) {
            return;
        }
        this.e0 = i2;
        m(i2);
    }

    public final f t() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        int i3 = 0;
        boolean z = true;
        f fVar = null;
        int i4 = -1;
        float f4 = 0.0f;
        while (i3 < this.f3121b.size()) {
            f fVar2 = this.f3121b.get(i3);
            if (!z && fVar2.f3131b != (i2 = i4 + 1)) {
                fVar2 = this.c;
                fVar2.e = f2 + f4 + f3;
                fVar2.f3131b = i2;
                fVar2.d = this.e.getPageWidth(i2);
                i3--;
            }
            f fVar3 = fVar2;
            f2 = fVar3.e;
            float f5 = fVar3.d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i3 == this.f3121b.size() - 1) {
                return fVar3;
            }
            int i5 = fVar3.f3131b;
            float f6 = fVar3.d;
            i3++;
            z = false;
            i4 = i5;
            f4 = f6;
            fVar = fVar3;
        }
        return fVar;
    }

    public f u(int i2) {
        for (int i3 = 0; i3 < this.f3121b.size(); i3++) {
            f fVar = this.f3121b.get(i3);
            if (fVar.f3131b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, h0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f2);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.L = (int) (25.0f * f2);
        this.M = (int) (2.0f * f2);
        this.A = (int) (f2 * 16.0f);
        androidx.core.view.c.r0(this, new g());
        if (androidx.core.view.c.y(this) == 0) {
            androidx.core.view.c.C0(this, 1);
        }
        androidx.core.view.c.H0(this, new d());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    public final boolean x(float f2, float f3) {
        return (f2 < ((float) this.B) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.B)) && f3 < 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    public void y(int i2, float f2, int i3) {
        int iMax;
        int width;
        int left;
        if (this.T > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f3124a) {
                    int i5 = layoutParams.f3125b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
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
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        k(i2, f2, i3);
        this.S = true;
    }

    public final void z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i2);
            this.H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3125b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public LayoutParams() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f0);
            this.f3125b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(ni4.e(getContext(), i2));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3121b = new ArrayList<>();
        this.c = new f();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.f3123r = Float.MAX_VALUE;
        this.x = 1;
        this.H = -1;
        this.Q = true;
        this.R = false;
        this.d0 = new c();
        this.e0 = 0;
        v();
    }
}
