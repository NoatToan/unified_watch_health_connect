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
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import defpackage.eih;
import defpackage.m80;
import defpackage.ni4;
import defpackage.o7h;
import defpackage.y7o;
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
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class OriginalViewPager extends ViewGroup {
    public static final int[] g0 = {R.attr.layout_gravity};
    public static final Comparator<f> h0 = new a();
    public static final Interpolator i0 = new b();
    public static final k j0 = new k();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public VelocityTracker J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public List<i> V;
    public i W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3097a;
    public i a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<f> f3098b;
    public List<h> b0;
    public final f c;
    public int c0;
    public final Rect d;
    public ArrayList<View> d0;
    public eih e;
    public final Runnable e0;
    public int f;
    public int f0;
    public int g;
    public boolean h;
    public Parcelable i;
    public ClassLoader j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y7o f3099k;
    public boolean l;
    public j m;
    public int n;
    public Drawable o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3100r;
    public float s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3103b;
        public int c;
        public Parcelable d;
        public ClassLoader e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f3103b + " isRTL=" + this.c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3103b);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f3103b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }
    }

    public class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f3108b - fVar2.f3108b;
        }
    }

    public class b implements Interpolator {
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
            OriginalViewPager.this.setScrollState(0);
            OriginalViewPager.this.C();
        }
    }

    public class d implements o7h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f3105a = new Rect();

        public d() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat windowInsetsCompatC0 = androidx.core.view.c.c0(view, windowInsetsCompat);
            if (windowInsetsCompatC0.q()) {
                return windowInsetsCompatC0;
            }
            Rect rect = this.f3105a;
            rect.left = windowInsetsCompatC0.k();
            rect.top = windowInsetsCompatC0.m();
            rect.right = windowInsetsCompatC0.l();
            rect.bottom = windowInsetsCompatC0.j();
            int childCount = OriginalViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat windowInsetsCompatG = androidx.core.view.c.g(OriginalViewPager.this.getChildAt(i), windowInsetsCompatC0);
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
        public Object f3107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3108b;
        public boolean c;
        public float d;
        public float e;
    }

    public class g extends androidx.core.view.a {
        public g() {
        }

        public final boolean a() {
            eih eihVar = OriginalViewPager.this.e;
            return eihVar != null && eihVar.getCount() > 1;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            eih eihVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(OriginalViewPager.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() != 4096 || (eihVar = OriginalViewPager.this.e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(eihVar.getCount());
            accessibilityEvent.setFromIndex(OriginalViewPager.this.f);
            accessibilityEvent.setToIndex(OriginalViewPager.this.f);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.i0(OriginalViewPager.class.getName());
            m80Var.F0(a());
            if (OriginalViewPager.this.canScrollHorizontally(1)) {
                m80Var.a(4096);
            }
            if (OriginalViewPager.this.canScrollHorizontally(-1)) {
                m80Var.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!OriginalViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                OriginalViewPager originalViewPager = OriginalViewPager.this;
                originalViewPager.setCurrentItem(originalViewPager.f + 1);
                return true;
            }
            if (i != 8192 || !OriginalViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            OriginalViewPager originalViewPager2 = OriginalViewPager.this;
            originalViewPager2.setCurrentItem(originalViewPager2.f - 1);
            return true;
        }
    }

    public interface h {
        void a(miuix.viewpager.widget.ViewPager viewPager, eih eihVar, eih eihVar2);
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
            OriginalViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            OriginalViewPager.this.g();
        }
    }

    public static class k implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f3101a;
            if (z != layoutParams2.f3101a) {
                return z ? 1 : -1;
            }
            return layoutParams.e - layoutParams2.e;
        }
    }

    public OriginalViewPager(Context context) {
        super(context);
        this.f3098b = new ArrayList<>();
        this.c = new f();
        this.d = new Rect();
        this.g = -1;
        this.h = false;
        this.i = null;
        this.j = null;
        this.f3100r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.y = 2;
        this.I = -1;
        this.R = true;
        this.S = false;
        this.e0 = new c();
        this.f0 = 0;
        s();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.w != z) {
            this.w = z;
        }
    }

    public static boolean t(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public final boolean A(int i2) {
        if (this.f3098b.size() == 0) {
            if (this.R) {
                return false;
            }
            this.T = false;
            w(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarQ = q();
        int clientWidth = getClientWidth();
        int i3 = this.n;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarQ.f3108b;
        float f3 = ((i2 / f2) - fVarQ.e) / (fVarQ.d + (i3 / f2));
        this.T = false;
        w(i5, f3, (int) (i4 * f3));
        if (this.T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean B(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.E - f2;
        this.E = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.f3100r * clientWidth;
        float f5 = this.s * clientWidth;
        boolean z3 = false;
        f fVar = this.f3098b.get(0);
        ArrayList<f> arrayList = this.f3098b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f3108b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f3108b != this.e.getCount() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.P.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.Q.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.E += scrollX - i2;
        scrollTo(i2, getScrollY());
        A(i2);
        return z3;
    }

    public void C() {
        D(this.f);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cb A[PHI: r7 r10 r15
      0x00cb: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    public void D(int i2) {
        f fVarR;
        String hexString;
        f fVarA;
        f fVarP;
        f fVar;
        int i3 = this.f;
        if (i3 != i2) {
            fVarR = r(i3);
            this.f = i2;
        } else {
            fVarR = null;
        }
        if (this.e == null) {
            N();
            return;
        }
        if (this.x) {
            N();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.startUpdate((ViewGroup) this);
        int i4 = this.y;
        int iMax = Math.max(0, this.f - i4);
        int count = this.e.getCount();
        int iMin = Math.min(count - 1, this.f + i4);
        if (count != this.f3097a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f3097a + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.e.getClass());
        }
        int i5 = 0;
        while (true) {
            if (i5 < this.f3098b.size()) {
                fVarA = this.f3098b.get(i5);
                int i6 = fVarA.f3108b;
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
            fVarA = null;
            break;
        }
        if (fVarA == null && count > 0) {
            fVarA = a(this.f, i5);
        }
        if (fVarA != null) {
            int i8 = i5 - 1;
            f fVar2 = i8 >= 0 ? this.f3098b.get(i8) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVarA.d) + (getPaddingLeft() / clientWidth);
            float f2 = 0.0f;
            for (int i9 = this.f - 1; i9 >= 0; i9--) {
                if (f2 < paddingLeft || i9 >= iMax) {
                    if (fVar2 == null || i9 != fVar2.f3108b) {
                        f2 += a(i9, i8 + 1).d;
                        i5++;
                        if (i8 >= 0) {
                            fVar = this.f3098b.get(i8);
                        } else {
                            fVar = null;
                        }
                    } else {
                        f2 += fVar2.d;
                        i8--;
                        if (i8 >= 0) {
                            fVar = this.f3098b.get(i8);
                        } else {
                            fVar = null;
                        }
                    }
                    fVar2 = fVar;
                } else {
                    if (fVar2 == null) {
                        break;
                    }
                    if (i9 == fVar2.f3108b && !fVar2.c) {
                        this.f3098b.remove(i8);
                        this.e.destroyItem((ViewGroup) this, i9, fVar2.f3107a);
                        i8--;
                        i5--;
                        if (i8 >= 0) {
                            fVar = this.f3098b.get(i8);
                        } else {
                            fVar = null;
                        }
                        fVar2 = fVar;
                    }
                }
            }
            float f3 = fVarA.d;
            int i10 = i5 + 1;
            if (f3 < 2.0f) {
                f fVar3 = i10 < this.f3098b.size() ? this.f3098b.get(i10) : null;
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
                        if (i11 == fVar3.f3108b && !fVar3.c) {
                            this.f3098b.remove(i10);
                            this.e.destroyItem((ViewGroup) this, i11, fVar3.f3107a);
                            if (i10 < this.f3098b.size()) {
                                fVar3 = this.f3098b.get(i10);
                            }
                        }
                    } else if (fVar3 == null || i11 != fVar3.f3108b) {
                        f fVarA2 = a(i11, i10);
                        i10++;
                        f3 += fVarA2.d;
                        fVar3 = i10 < this.f3098b.size() ? this.f3098b.get(i10) : null;
                    } else {
                        f3 += fVar3.d;
                        i10++;
                        if (i10 < this.f3098b.size()) {
                            fVar3 = this.f3098b.get(i10);
                        }
                    }
                }
            }
            c(fVarA, i5, fVarR);
            this.e.setPrimaryItem((ViewGroup) this, this.f, fVarA.f3107a);
        }
        this.e.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f = i12;
            if (!layoutParams.f3101a && layoutParams.c == 0.0f && (fVarP = p(childAt)) != null) {
                layoutParams.c = fVarP.d;
                layoutParams.e = fVarP.f3108b;
            }
        }
        N();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            f fVarO = viewFindFocus != null ? o(viewFindFocus) : null;
            if (fVarO == null || fVarO.f3108b != this.f) {
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt2 = getChildAt(i13);
                    f fVarP2 = p(childAt2);
                    if (fVarP2 != null && fVarP2.f3108b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void E(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.f3098b.isEmpty()) {
            if (!this.f3099k.h()) {
                this.f3099k.i(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f fVarR = r(this.f);
        int iMin = (int) ((fVarR != null ? Math.min(fVarR.e, this.s) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final void F() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f3101a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void G(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean H() {
        this.I = -1;
        l();
        this.P.onRelease();
        this.Q.onRelease();
        return this.P.isFinished() || this.Q.isFinished();
    }

    public final void I(int i2, boolean z, int i3, boolean z2) {
        f fVarR = r(i2);
        int clientWidth = fVarR != null ? (int) (getClientWidth() * Math.max(this.f3100r, Math.min(fVarR.e, this.s))) : 0;
        if (z) {
            M(clientWidth, 0, i3);
            if (z2) {
                j(i2);
                return;
            }
            return;
        }
        if (z2) {
            j(i2);
        }
        e(false);
        scrollTo(clientWidth, 0);
        A(clientWidth);
    }

    public void J(int i2, boolean z) {
        this.x = false;
        K(i2, z, false);
    }

    public void K(int i2, boolean z, boolean z2) {
        L(i2, z, z2, 0);
    }

    public void L(int i2, boolean z, boolean z2, int i3) {
        eih eihVar = this.e;
        if (eihVar == null || eihVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f == i2 && this.f3098b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.e.getCount()) {
            i2 = this.e.getCount() - 1;
        }
        int i4 = this.y;
        int i5 = this.f;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f3098b.size(); i6++) {
                this.f3098b.get(i6).c = true;
            }
        }
        boolean z3 = this.f != i2;
        if (!this.R) {
            D(i2);
            I(i2, z, i3, z3);
        } else {
            this.f = i2;
            if (z3) {
                j(i2);
            }
            requestLayout();
        }
    }

    public void M(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        y7o y7oVar = this.f3099k;
        if (y7oVar == null || y7oVar.h()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.l ? this.f3099k.c() : this.f3099k.f();
            this.f3099k.a();
            setScrollingCacheEnabled(false);
        }
        int scrollY = getScrollY();
        int i5 = i3 - scrollY;
        if (i2 - scrollX == 0 && i5 == 0) {
            e(false);
            C();
            setScrollState(0);
        } else {
            setScrollingCacheEnabled(true);
            setScrollState(2);
            this.l = false;
            this.f3099k.j(scrollX, i2, scrollY, i3, -i4);
            androidx.core.view.c.h0(this);
        }
    }

    public final void N() {
        if (this.c0 != 0) {
            ArrayList<View> arrayList = this.d0;
            if (arrayList == null) {
                this.d0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.d0.add(getChildAt(i2));
            }
            Collections.sort(this.d0, j0);
        }
    }

    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.f3108b = i2;
        fVar.f3107a = this.e.instantiateItem((ViewGroup) this, i2);
        fVar.d = this.e.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.f3098b.size()) {
            this.f3098b.add(fVar);
        } else {
            this.f3098b.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarP;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarP = p(childAt)) != null && fVarP.f3108b == this.f) {
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
        if (this.b0 == null) {
            this.b0 = new ArrayList();
        }
        this.b0.add(hVar);
    }

    public void addOnPageChangeListener(i iVar) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.add(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarP;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarP = p(childAt)) != null && fVarP.f3108b == this.f) {
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
        boolean zT = layoutParams2.f3101a | t(view);
        layoutParams2.f3101a = zT;
        if (!this.v) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zT) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    public boolean b(int i2) {
        boolean zY;
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
                zY = y();
            } else if (i2 == 66 || i2 == 2) {
                zY = z();
            } else {
                zY = false;
            }
        } else if (i2 == 17) {
            zY = (viewFindFocus == null || n(this.d, viewFindNextFocus).left < n(this.d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : y();
        } else if (i2 == 66) {
            zY = (viewFindFocus == null || n(this.d, viewFindNextFocus).left > n(this.d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : z();
        } else {
            zY = false;
        }
        if (zY) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zY;
    }

    public final void c(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int count = this.e.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.n / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f3108b;
            int i6 = fVar.f3108b;
            if (i5 < i6) {
                float pageWidth = fVar2.e + fVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.f3108b && i8 < this.f3098b.size()) {
                    f fVar5 = this.f3098b.get(i8);
                    while (true) {
                        fVar4 = fVar5;
                        if (i7 <= fVar4.f3108b || i8 >= this.f3098b.size() - 1) {
                            break;
                        }
                        i8++;
                        fVar5 = this.f3098b.get(i8);
                    }
                    while (i7 < fVar4.f3108b) {
                        pageWidth += this.e.getPageWidth(i7) + f2;
                        i7++;
                    }
                    fVar4.e = pageWidth;
                    pageWidth += fVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f3098b.size() - 1;
                float pageWidth2 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.f3108b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f3098b.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i5 >= fVar3.f3108b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f3098b.get(size);
                    }
                    while (i5 > fVar3.f3108b) {
                        pageWidth2 -= this.e.getPageWidth(i5) + f2;
                        i5--;
                    }
                    pageWidth2 -= fVar3.d + f2;
                    fVar3.e = pageWidth2;
                }
            }
        }
        int size2 = this.f3098b.size();
        float pageWidth3 = fVar.e;
        int i9 = fVar.f3108b;
        int i10 = i9 - 1;
        this.f3100r = i9 == 0 ? pageWidth3 : -3.4028235E38f;
        int i11 = count - 1;
        this.s = i9 == i11 ? (fVar.d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar7 = this.f3098b.get(i12);
            while (true) {
                i4 = fVar7.f3108b;
                if (i10 <= i4) {
                    break;
                }
                pageWidth3 -= this.e.getPageWidth(i10) + f2;
                i10--;
            }
            pageWidth3 -= fVar7.d + f2;
            fVar7.e = pageWidth3;
            if (i4 == 0) {
                this.f3100r = pageWidth3;
            }
            i12--;
            i10--;
        }
        float pageWidth4 = fVar.e + fVar.d + f2;
        int i13 = fVar.f3108b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar8 = this.f3098b.get(i14);
            while (true) {
                i3 = fVar8.f3108b;
                if (i13 >= i3) {
                    break;
                }
                pageWidth4 += this.e.getPageWidth(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.s = (fVar8.d + pageWidth4) - 1.0f;
            }
            fVar8.e = pageWidth4;
            pageWidth4 += fVar8.d + f2;
            i14++;
            i13++;
        }
        this.S = false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f3100r));
        }
        return i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.s));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.l = true;
        if (this.f3099k.h() || !this.f3099k.b()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int iC = this.f3099k.c();
        int iD = this.f3099k.d();
        if (scrollX != iC || scrollY != iD) {
            scrollTo(iC, iD);
            if (!A(iC)) {
                this.f3099k.a();
                scrollTo(0, iD);
            }
        }
        androidx.core.view.c.h0(this);
    }

    public boolean d(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && d(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarP;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarP = p(childAt)) != null && fVarP.f3108b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
            this.P.finish();
            this.Q.finish();
            return;
        }
        if (this.P.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.f3100r * width);
            this.P.setSize(height, width);
            zDraw = this.P.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.Q.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.s + 1.0f)) * width2);
            this.Q.setSize(height2, width2);
            zDraw |= this.Q.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            androidx.core.view.c.h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z) {
        boolean z2 = this.f0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f3099k.h()) {
                this.f3099k.a();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int iC = this.f3099k.c();
                int iD = this.f3099k.d();
                if (scrollX != iC || scrollY != iD) {
                    scrollTo(iC, iD);
                    if (iC != scrollX) {
                        A(iC);
                    }
                }
            }
        }
        this.x = false;
        for (int i2 = 0; i2 < this.f3098b.size(); i2++) {
            f fVar = this.f3098b.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                androidx.core.view.c.i0(this, this.e0);
            } else {
                this.e0.run();
            }
        }
    }

    public int f(int i2, int i3, boolean z, boolean z2) {
        return z == z2 ? i3 : (i2 - i3) - 1;
    }

    public void g() {
        int count = this.e.getCount();
        this.f3097a = count;
        boolean z = this.f3098b.size() < (this.y * 2) + 1 && this.f3098b.size() < count;
        int iMax = this.f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f3098b.size()) {
            f fVar = this.f3098b.get(i2);
            int itemPosition = this.e.getItemPosition(fVar.f3107a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f3098b.remove(i2);
                    i2--;
                    if (!z2) {
                        this.e.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.e.destroyItem((ViewGroup) this, fVar.f3108b, fVar.f3107a);
                    int i3 = this.f;
                    if (i3 == fVar.f3108b) {
                        iMax = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = fVar.f3108b;
                    if (i4 != itemPosition) {
                        if (i4 == this.f) {
                            iMax = itemPosition;
                        }
                        fVar.f3108b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f3098b, h0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f3101a) {
                    layoutParams.c = 0.0f;
                }
            }
            K(iMax, false, true);
            requestLayout();
        }
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
        if (this.c0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) this.d0.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.y;
    }

    public int getPageMargin() {
        return this.n;
    }

    public final int h(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.M || Math.abs(i3) <= this.K) {
            i2 += (int) (f2 + (i2 >= this.f ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f3098b.size() <= 0) {
            return i2;
        }
        f fVar = this.f3098b.get(0);
        ArrayList<f> arrayList = this.f3098b;
        return Math.max(fVar.f3108b, Math.min(i2, arrayList.get(arrayList.size() - 1).f3108b));
    }

    public final void i(int i2, float f2, int i3) {
        i iVar = this.W;
        if (iVar != null) {
            iVar.onPageScrolled(i2, f2, i3);
        }
        List<i> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar2 = this.V.get(i4);
                if (iVar2 != null) {
                    iVar2.onPageScrolled(i2, f2, i3);
                }
            }
        }
        i iVar3 = this.a0;
        if (iVar3 != null) {
            iVar3.onPageScrolled(i2, f2, i3);
        }
    }

    public final void j(int i2) {
        i iVar = this.W;
        if (iVar != null) {
            iVar.onPageSelected(i2);
        }
        List<i> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.V.get(i3);
                if (iVar2 != null) {
                    iVar2.onPageSelected(i2);
                }
            }
        }
        i iVar3 = this.a0;
        if (iVar3 != null) {
            iVar3.onPageSelected(i2);
        }
    }

    public final void k(int i2) {
        i iVar = this.W;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i2);
        }
        List<i> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.V.get(i3);
                if (iVar2 != null) {
                    iVar2.onPageScrollStateChanged(i2);
                }
            }
        }
        i iVar3 = this.a0;
        if (iVar3 != null) {
            iVar3.onPageScrollStateChanged(i2);
        }
    }

    public final void l() {
        this.z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    public boolean m(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? y() : b(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? z() : b(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return b(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return b(1);
                }
            }
        }
        return false;
    }

    public final Rect n(Rect rect, View view) {
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

    public f o(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return p(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.e0);
        y7o y7oVar = this.f3099k;
        if (y7oVar != null && !y7oVar.h()) {
            this.f3099k.a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        super.onDraw(canvas);
        if (this.n <= 0 || this.o == null || this.f3098b.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f3 = width;
        float f4 = this.n / f3;
        int i3 = 0;
        f fVar = this.f3098b.get(0);
        float f5 = fVar.e;
        int size = this.f3098b.size();
        int i4 = fVar.f3108b;
        int i5 = this.f3098b.get(size - 1).f3108b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.f3108b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.f3098b.get(i3);
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
            if (this.n + f2 > scrollX) {
                this.o.setBounds(Math.round(f2), this.p, Math.round(this.n + f2), this.q);
                this.o.draw(canvas);
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
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            H();
            return false;
        }
        if (action != 0) {
            if (this.z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.G = x;
            this.E = x;
            float y = motionEvent.getY();
            this.H = y;
            this.F = y;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.l = true;
            this.f3099k.b();
            if (this.f0 != 2 || Math.abs(this.f3099k.e() - this.f3099k.c()) <= this.N) {
                e(false);
                this.z = false;
            } else {
                this.f3099k.a();
                this.x = false;
                C();
                this.z = true;
                G(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.I;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) >= 0 && iFindPointerIndex < motionEvent.getPointerCount()) {
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.E;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.H);
                if (f2 != 0.0f && !u(this.E, f2) && d(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.E = x2;
                    this.F = y2;
                    this.A = true;
                    return false;
                }
                int i3 = this.D;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.z = true;
                    G(true);
                    setScrollState(1);
                    this.E = f2 > 0.0f ? this.G + this.D : this.G - this.D;
                    this.F = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.A = true;
                }
                if (this.z && B(x2)) {
                    androidx.core.view.c.h0(this);
                }
            }
        } else if (action == 6) {
            x(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.z;
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
        f fVarP;
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
                if (layoutParams.f3101a) {
                    int i10 = layoutParams.f3102b;
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
                if (!layoutParams2.f3101a && (fVarP = p(childAt2)) != null) {
                    float f2 = i20;
                    int i22 = ((int) (fVarP.e * f2)) + paddingLeft;
                    if (layoutParams2.d) {
                        layoutParams2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.p = paddingTop;
        this.q = i7 - paddingBottom;
        this.U = i8;
        if (this.R) {
            z2 = false;
            I(this.f, false, 0, false);
        } else {
            z2 = false;
        }
        this.R = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
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
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f3101a) {
                int i7 = layoutParams2.f3102b;
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
        this.t = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.u = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.v = true;
        C();
        this.v = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f3101a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.c), 1073741824), this.u);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        f fVarP;
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
            if (childAt.getVisibility() == 0 && (fVarP = p(childAt)) != null && fVarP.f3108b == this.f && childAt.requestFocus(i2, rect)) {
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
            eihVar.restoreState(savedState.d, savedState.e);
            K(f(this.e.getCount(), savedState.f3103b, savedState.c > 0, v()), false, true);
        } else {
            this.g = savedState.f3103b;
            this.h = savedState.c > 0;
            this.i = savedState.d;
            this.j = savedState.e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3103b = this.f;
        savedState.c = v() ? 1 : 0;
        eih eihVar = this.e;
        if (eihVar != null) {
            savedState.d = eihVar.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.n;
            E(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        eih eihVar;
        boolean zH;
        if (this.O) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (eihVar = this.e) == null || eihVar.getCount() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f3099k.a();
            this.x = false;
            C();
            float x = motionEvent.getX();
            this.G = x;
            this.E = x;
            float y = motionEvent.getY();
            this.H = y;
            this.F = y;
            this.I = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.E = motionEvent.getX(actionIndex);
                        this.I = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        x(motionEvent);
                        this.E = motionEvent.getX(motionEvent.findPointerIndex(this.I));
                    }
                } else if (this.z) {
                    I(this.f, true, 0, false);
                    zH = H();
                    if (zH) {
                        androidx.core.view.c.h0(this);
                    }
                }
            } else if (!this.z) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.I);
                if (iFindPointerIndex == -1) {
                    zH = H();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.E);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.F);
                    if (fAbs > this.D && fAbs > fAbs2) {
                        this.z = true;
                        G(true);
                        float f2 = this.G;
                        this.E = x2 - f2 > 0.0f ? f2 + this.D : f2 - this.D;
                        this.F = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.z) {
                        zH = B(motionEvent.getX(motionEvent.findPointerIndex(this.I)));
                    }
                }
                if (zH) {
                    androidx.core.view.c.h0(this);
                }
            } else if (this.z) {
                zH = B(motionEvent.getX(motionEvent.findPointerIndex(this.I)));
                if (zH) {
                    androidx.core.view.c.h0(this);
                }
            }
        } else if (this.z) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.x = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarQ = q();
            float f3 = clientWidth;
            L(h(fVarQ.f3108b, ((scrollX / f3) - fVarQ.e) / (fVarQ.d + (this.n / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.I)) - this.G)), true, true, xVelocity);
            zH = H();
            if (zH) {
                androidx.core.view.c.h0(this);
            }
        }
        return true;
    }

    public f p(View view) {
        for (int i2 = 0; i2 < this.f3098b.size(); i2++) {
            f fVar = this.f3098b.get(i2);
            if (this.e.isViewFromObject(view, fVar.f3107a)) {
                return fVar;
            }
        }
        return null;
    }

    public final f q() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.n / clientWidth : 0.0f;
        int i3 = 0;
        boolean z = true;
        f fVar = null;
        int i4 = -1;
        float f4 = 0.0f;
        while (i3 < this.f3098b.size()) {
            f fVar2 = this.f3098b.get(i3);
            if (!z && fVar2.f3108b != (i2 = i4 + 1)) {
                fVar2 = this.c;
                fVar2.e = f2 + f4 + f3;
                fVar2.f3108b = i2;
                fVar2.d = this.e.getPageWidth(i2);
                i3--;
            }
            f fVar3 = fVar2;
            f2 = fVar3.e;
            float f5 = fVar3.d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i3 == this.f3098b.size() - 1) {
                return fVar3;
            }
            int i5 = fVar3.f3108b;
            float f6 = fVar3.d;
            i3++;
            z = false;
            i4 = i5;
            f4 = f6;
            fVar = fVar3;
        }
        return fVar;
    }

    public f r(int i2) {
        for (int i3 = 0; i3 < this.f3098b.size(); i3++) {
            f fVar = this.f3098b.get(i3);
            if (fVar.f3108b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void removeOnAdapterChangeListener(h hVar) {
        List<h> list = this.b0;
        if (list != null) {
            list.remove(hVar);
        }
    }

    public void removeOnPageChangeListener(i iVar) {
        List<i> list = this.V;
        if (list != null) {
            list.remove(iVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void s() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3099k = new y7o();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f2);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffect(context);
        this.Q = new EdgeEffect(context);
        this.M = (int) (25.0f * f2);
        this.N = (int) (2.0f * f2);
        this.B = (int) (f2 * 16.0f);
        androidx.core.view.c.r0(this, new g());
        if (androidx.core.view.c.y(this) == 0) {
            androidx.core.view.c.C0(this, 1);
        }
        androidx.core.view.c.H0(this, new d());
    }

    public void setAdapter(eih eihVar) {
        eih eihVar2 = this.e;
        if (eihVar2 != null) {
            eihVar2.setViewPagerObserver(null);
            this.e.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.f3098b.size(); i2++) {
                f fVar = this.f3098b.get(i2);
                this.e.destroyItem((ViewGroup) this, fVar.f3108b, fVar.f3107a);
            }
            this.e.finishUpdate((ViewGroup) this);
            this.f3098b.clear();
            F();
            this.f = 0;
            scrollTo(0, 0);
        }
        eih eihVar3 = this.e;
        this.e = eihVar;
        this.f3097a = 0;
        if (eihVar != null) {
            if (this.m == null) {
                this.m = new j();
            }
            this.e.setViewPagerObserver(this.m);
            this.x = false;
            boolean z = this.R;
            this.R = true;
            this.f3097a = this.e.getCount();
            if (this.g >= 0) {
                this.e.restoreState(this.i, this.j);
                K(f(this.e.getCount(), this.g, this.h, v()), false, true);
                this.g = -1;
                this.i = null;
                this.j = null;
            } else if (z) {
                requestLayout();
            } else {
                C();
            }
        }
        List<h> list = this.b0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.b0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.b0.get(i3).a((miuix.viewpager.widget.ViewPager) this, eihVar3, eihVar);
        }
    }

    public void setCurrentItem(int i2) {
        this.x = false;
        K(i2, !this.R, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i2);
            sb.append(" too small; defaulting to ");
            sb.append(2);
            i2 = 2;
        }
        if (i2 != this.y) {
            this.y = i2;
            C();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.W = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.n;
        this.n = i2;
        int width = getWidth();
        E(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.f0 == i2) {
            return;
        }
        this.f0 = i2;
        k(i2);
    }

    public final boolean u(float f2, float f3) {
        return (f2 < ((float) this.C) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.C)) && f3 < 0.0f);
    }

    public boolean v() {
        return getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    public void w(int i2, float f2, int i3) {
        int iMax;
        int width;
        int left;
        if (this.U > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f3101a) {
                    int i5 = layoutParams.f3102b & 7;
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
        i(i2, f2, i3);
        this.T = true;
    }

    public final void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i2);
            this.I = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean y() {
        int i2 = this.f;
        if (i2 <= 0) {
            return false;
        }
        J(i2 - 1, true);
        return true;
    }

    public boolean z() {
        eih eihVar = this.e;
        if (eihVar == null || this.f >= eihVar.getCount() - 1) {
            return false;
        }
        J(this.f + 1, true);
        return true;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3102b;
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
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OriginalViewPager.g0);
            this.f3102b = typedArrayObtainStyledAttributes.getInteger(0, 48);
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

    public OriginalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3098b = new ArrayList<>();
        this.c = new f();
        this.d = new Rect();
        this.g = -1;
        this.h = false;
        this.i = null;
        this.j = null;
        this.f3100r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.y = 2;
        this.I = -1;
        this.R = true;
        this.S = false;
        this.e0 = new c();
        this.f0 = 0;
        s();
    }
}
