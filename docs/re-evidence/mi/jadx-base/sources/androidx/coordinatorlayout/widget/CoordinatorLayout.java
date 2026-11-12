package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import defpackage.e3j;
import defpackage.f5j;
import defpackage.fjg;
import defpackage.gjg;
import defpackage.hjg;
import defpackage.iii;
import defpackage.k47;
import defpackage.l4h;
import defpackage.ni4;
import defpackage.o7h;
import defpackage.p3b;
import defpackage.vtq;
import defpackage.yx6;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements fjg, gjg {
    public static final String u;
    public static final Class<?>[] v;
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> w;
    public static final Comparator<View> x;
    public static final Pools.Pool<Rect> y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<View> f2037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yx6<View> f2038b;
    public final List<View> c;
    public final List<View> d;
    public Paint e;
    public final int[] f;
    public final int[] g;
    public boolean h;
    public boolean i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f2039k;
    public View l;
    public f m;
    public boolean n;
    public WindowInsetsCompat o;
    public boolean p;
    public Drawable q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2040r;
    public o7h s;
    public final hjg t;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public static Object getTag(View view) {
            return ((e) view.getLayoutParams()).f2047r;
        }

        public static void setTag(View view, Object obj) {
            ((e) view.getLayoutParams()).f2047r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(e eVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    public class a implements o7h {
        public a() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.U(windowInsetsCompat);
        }
    }

    public interface b {
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface c {
        Class<? extends Behavior> value();
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2040r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2040r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    public static class g implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fN = androidx.core.view.c.N(view);
            float fN2 = androidx.core.view.c.N(view2);
            if (fN > fN2) {
                return -1;
            }
            return fN < fN2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        u = r0 != null ? r0.getName() : null;
        x = new g();
        v = new Class[]{Context.class, AttributeSet.class};
        w = new ThreadLocal<>();
        y = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Behavior I(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = w;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    public static void M(Rect rect) {
        rect.setEmpty();
        y.release(rect);
    }

    public static int P(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public static int Q(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    public static int R(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    public static Rect e() {
        Rect rectAcquire = y.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    private static int g(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public final void A(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        Rect rectE = e();
        rectE.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        if (this.o != null && androidx.core.view.c.x(this) && !androidx.core.view.c.x(view)) {
            rectE.left += this.o.k();
            rectE.top += this.o.m();
            rectE.right -= this.o.l();
            rectE.bottom -= this.o.j();
        }
        Rect rectE2 = e();
        p3b.a(Q(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectE, rectE2, i);
        view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        M(rectE);
        M(rectE2);
    }

    public final void B(View view, View view2, int i) {
        Rect rectE = e();
        Rect rectE2 = e();
        try {
            r(view2, rectE);
            s(view, i, rectE, rectE2);
            view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        } finally {
            M(rectE);
            M(rectE2);
        }
    }

    public final void C(View view, int i, int i2) {
        int i3;
        e eVar = (e) view.getLayoutParams();
        int iB = p3b.b(R(eVar.c), i2);
        int i4 = iB & 7;
        int i5 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iU = u(i) - measuredWidth;
        if (i4 == 1) {
            iU += measuredWidth / 2;
        } else if (i4 == 5) {
            iU += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(iU, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public final void D(View view, Rect rect, int i) {
        boolean z;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (androidx.core.view.c.U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            Behavior behaviorF = eVar.f();
            Rect rectE = e();
            Rect rectE2 = e();
            rectE2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behaviorF == null || !behaviorF.getInsetDodgeRect(this, view, rectE)) {
                rectE.set(rectE2);
            } else if (!rectE2.contains(rectE)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectE.toShortString() + " | Bounds:" + rectE2.toShortString());
            }
            M(rectE2);
            if (rectE.isEmpty()) {
                M(rectE);
                return;
            }
            int iB = p3b.b(eVar.h, i);
            boolean z2 = true;
            if ((iB & 48) != 48 || (i6 = (rectE.top - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - eVar.j) >= (i7 = rect.top)) {
                z = false;
            } else {
                T(view, i7 - i6);
                z = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectE.bottom) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) + eVar.j) < (i5 = rect.bottom)) {
                T(view, height - i5);
            } else if (!z) {
                T(view, 0);
            }
            if ((iB & 3) != 3 || (i3 = (rectE.left - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - eVar.i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                S(view, i4 - i3);
            }
            if ((iB & 5) == 5 && (width = ((getWidth() - rectE.right) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + eVar.i) < (i2 = rect.right)) {
                S(view, width - i2);
            } else if (!z2) {
                S(view, 0);
            }
            M(rectE);
        }
    }

    public void E(View view, int i) {
        Behavior behaviorF;
        e eVar = (e) view.getLayoutParams();
        if (eVar.f2046k != null) {
            Rect rectE = e();
            Rect rectE2 = e();
            Rect rectE3 = e();
            r(eVar.f2046k, rectE);
            o(view, false, rectE2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            t(view, i, rectE, rectE3, eVar, measuredWidth, measuredHeight);
            boolean z = (rectE3.left == rectE2.left && rectE3.top == rectE2.top) ? false : true;
            h(eVar, rectE3, measuredWidth, measuredHeight);
            int i2 = rectE3.left - rectE2.left;
            int i3 = rectE3.top - rectE2.top;
            if (i2 != 0) {
                androidx.core.view.c.a0(view, i2);
            }
            if (i3 != 0) {
                androidx.core.view.c.b0(view, i3);
            }
            if (z && (behaviorF = eVar.f()) != null) {
                behaviorF.onDependentViewChanged(this, view, eVar.f2046k);
            }
            M(rectE);
            M(rectE2);
            M(rectE3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    public final void F(int i) {
        int i2;
        Behavior behaviorF;
        boolean zOnDependentViewChanged;
        int iA = androidx.core.view.c.A(this);
        int size = this.f2037a.size();
        Rect rectE = e();
        Rect rectE2 = e();
        Rect rectE3 = e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f2037a.get(i3);
            e eVar = (e) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (eVar.l == this.f2037a.get(i4)) {
                        E(view, iA);
                    }
                }
                o(view, true, rectE2);
                if (eVar.g != 0 && !rectE2.isEmpty()) {
                    int iB = p3b.b(eVar.g, iA);
                    int i5 = iB & 112;
                    if (i5 == 48) {
                        rectE.top = Math.max(rectE.top, rectE2.bottom);
                    } else if (i5 == 80) {
                        rectE.bottom = Math.max(rectE.bottom, getHeight() - rectE2.top);
                    }
                    int i6 = iB & 7;
                    if (i6 == 3) {
                        rectE.left = Math.max(rectE.left, rectE2.right);
                    } else if (i6 == 5) {
                        rectE.right = Math.max(rectE.right, getWidth() - rectE2.left);
                    }
                }
                if (eVar.h != 0 && view.getVisibility() == 0) {
                    D(view, rectE, iA);
                }
                if (i != 2) {
                    v(view, rectE3);
                    if (!rectE3.equals(rectE2)) {
                        L(view, rectE2);
                        for (i2 = i3 + 1; i2 < size; i2++) {
                            View view2 = this.f2037a.get(i2);
                            e eVar2 = (e) view2.getLayoutParams();
                            behaviorF = eVar2.f();
                            if (behaviorF == null && behaviorF.layoutDependsOn(this, view2, view)) {
                                if (i == 0 && eVar2.g()) {
                                    eVar2.k();
                                } else {
                                    if (i != 2) {
                                        zOnDependentViewChanged = behaviorF.onDependentViewChanged(this, view2, view);
                                    } else {
                                        behaviorF.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    }
                                    if (i == 1) {
                                        eVar2.p(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                        View view3 = this.f2037a.get(i2);
                        e eVar3 = (e) view3.getLayoutParams();
                        behaviorF = eVar3.f();
                        if (behaviorF == null) {
                        }
                    }
                }
            }
        }
        M(rectE);
        M(rectE2);
        M(rectE3);
    }

    public void G(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = eVar.f2046k;
        if (view2 != null) {
            B(view, view2, i);
            return;
        }
        int i2 = eVar.e;
        if (i2 >= 0) {
            C(view, i2, i);
        } else {
            A(view, i);
        }
    }

    public void H(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final boolean J(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.c;
        x(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            e eVar = (e) view.getLayoutParams();
            Behavior behaviorF = eVar.f();
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behaviorF != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = behaviorF.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = behaviorF.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.f2039k = view;
                    }
                }
                boolean zC = eVar.c();
                boolean zI = eVar.i(this, view);
                z = zI && !zC;
                if (zI && !z) {
                    break;
                }
            } else if (behaviorF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    behaviorF.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    behaviorF.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    public final void K() {
        this.f2037a.clear();
        this.f2038b.c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVarW = w(childAt);
            eVarW.d(this, childAt);
            this.f2038b.b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (eVarW.b(this, childAt, childAt2)) {
                        if (!this.f2038b.d(childAt2)) {
                            this.f2038b.b(childAt2);
                        }
                        this.f2038b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2037a.addAll(this.f2038b.i());
        Collections.reverse(this.f2037a);
    }

    public void L(View view, Rect rect) {
        ((e) view.getLayoutParams()).q(rect);
    }

    public void N() {
        if (this.i && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        this.n = false;
    }

    public final void O(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behaviorF = ((e) childAt.getLayoutParams()).f();
            if (behaviorF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behaviorF.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behaviorF.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((e) getChildAt(i2).getLayoutParams()).m();
        }
        this.f2039k = null;
        this.h = false;
    }

    public final void S(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.i;
        if (i2 != i) {
            androidx.core.view.c.a0(view, i - i2);
            eVar.i = i;
        }
    }

    public final void T(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.j;
        if (i2 != i) {
            androidx.core.view.c.b0(view, i - i2);
            eVar.j = i;
        }
    }

    public final WindowInsetsCompat U(WindowInsetsCompat windowInsetsCompat) {
        if (l4h.a(this.o, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.o = windowInsetsCompat;
        boolean z = false;
        boolean z2 = windowInsetsCompat != null && windowInsetsCompat.m() > 0;
        this.p = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        WindowInsetsCompat windowInsetsCompatI = i(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatI;
    }

    public final void V() {
        if (!androidx.core.view.c.x(this)) {
            androidx.core.view.c.H0(this, null);
            return;
        }
        if (this.s == null) {
            this.s = new a();
        }
        androidx.core.view.c.H0(this, this.s);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        e eVar = (e) view.getLayoutParams();
        Behavior behavior = eVar.f2044a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.e == null) {
                    this.e = new Paint();
                }
                this.e.setColor(eVar.f2044a.getScrimColor(this, view));
                this.e.setAlpha(g(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f() {
        if (this.i) {
            if (this.m == null) {
                this.m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        this.n = true;
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        K();
        return Collections.unmodifiableList(this.f2037a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void h(e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final WindowInsetsCompat i(WindowInsetsCompat windowInsetsCompat) {
        Behavior behaviorF;
        if (windowInsetsCompat.q()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (androidx.core.view.c.x(childAt) && (behaviorF = ((e) childAt.getLayoutParams()).f()) != null) {
                windowInsetsCompat = behaviorF.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.q()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void j(View view) {
        List listG = this.f2038b.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i = 0; i < listG.size(); i++) {
            View view2 = (View) listG.get(i);
            Behavior behaviorF = ((e) view2.getLayoutParams()).f();
            if (behaviorF != null) {
                behaviorF.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public void k() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (y(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z != this.n) {
            if (z) {
                f();
            } else {
                N();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public void o(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        O(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null && androidx.core.view.c.x(this)) {
            androidx.core.view.c.n0(this);
        }
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.p || this.q == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.o;
        int iM = windowInsetsCompat != null ? windowInsetsCompat.m() : 0;
        if (iM > 0) {
            this.q.setBounds(0, 0, getWidth(), iM);
            this.q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            O(true);
        }
        boolean zJ = J(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            O(true);
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behaviorF;
        int iA = androidx.core.view.c.A(this);
        int size = this.f2037a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2037a.get(i5);
            if (view.getVisibility() != 8 && ((behaviorF = ((e) view.getLayoutParams()).f()) == null || !behaviorF.onLayoutChild(this, view, iA))) {
                G(view, iA);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behaviorF;
        e eVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        K();
        k();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int iA = androidx.core.view.c.A(this);
        boolean z = iA == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i10 = paddingLeft + paddingRight;
        int i11 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.o != null && androidx.core.view.c.x(this);
        int size3 = this.f2037a.size();
        int i12 = suggestedMinimumWidth;
        int i13 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i14 = 0;
        while (i14 < size3) {
            View view = this.f2037a.get(i14);
            if (view.getVisibility() == 8) {
                i8 = i14;
                i5 = size3;
                i6 = paddingLeft;
            } else {
                e eVar2 = (e) view.getLayoutParams();
                int i15 = eVar2.e;
                if (i15 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                } else {
                    int iU = u(i15);
                    int iB = p3b.b(R(eVar2.c), iA) & 7;
                    i3 = iCombineMeasuredStates;
                    if ((iB == 3 && !z) || (iB == 5 && z)) {
                        iMax = Math.max(0, (size - paddingRight) - iU);
                    } else if ((iB == 5 && !z) || (iB == 3 && z)) {
                        iMax = Math.max(0, iU - paddingLeft);
                    }
                    if (z2 || androidx.core.view.c.x(view)) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iK = this.o.k() + this.o.l();
                        int iM = this.o.m() + this.o.j();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iK, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM, mode2);
                    }
                    behaviorF = eVar2.f();
                    if (behaviorF != null) {
                        eVar = eVar2;
                        i7 = i3;
                        i8 = i14;
                        i4 = i13;
                        i6 = paddingLeft;
                        i9 = i12;
                        i5 = size3;
                        if (!behaviorF.onMeasureChild(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        e eVar3 = eVar;
                        int iMax2 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin + ((ViewGroup.MarginLayoutParams) eVar3).rightMargin);
                        int iMax3 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin + ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                        i12 = iMax2;
                        i13 = iMax3;
                    } else {
                        eVar = eVar2;
                        i4 = i13;
                        i5 = size3;
                        i6 = paddingLeft;
                        i7 = i3;
                        i8 = i14;
                        i9 = i12;
                    }
                    H(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    e eVar4 = eVar;
                    int iMax4 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin + ((ViewGroup.MarginLayoutParams) eVar4).rightMargin);
                    int iMax5 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin + ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                    i12 = iMax4;
                    i13 = iMax5;
                }
                iMax = 0;
                if (z2) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                behaviorF = eVar2.f();
                if (behaviorF != null) {
                    eVar = eVar2;
                    i7 = i3;
                    i8 = i14;
                    i4 = i13;
                    i6 = paddingLeft;
                    i9 = i12;
                    i5 = size3;
                    if (!behaviorF.onMeasureChild(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                    }
                    e eVar5 = eVar;
                    int iMax6 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar5).leftMargin + ((ViewGroup.MarginLayoutParams) eVar5).rightMargin);
                    int iMax7 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar5).topMargin + ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                    i12 = iMax6;
                    i13 = iMax7;
                } else {
                    eVar = eVar2;
                    i4 = i13;
                    i5 = size3;
                    i6 = paddingLeft;
                    i7 = i3;
                    i8 = i14;
                    i9 = i12;
                }
                H(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                e eVar6 = eVar;
                int iMax8 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar6).leftMargin + ((ViewGroup.MarginLayoutParams) eVar6).rightMargin);
                int iMax9 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar6).topMargin + ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                i12 = iMax8;
                i13 = iMax9;
            }
            i14 = i8 + 1;
            paddingLeft = i6;
            size3 = i5;
        }
        int i16 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i12, i, (-16777216) & i16), View.resolveSizeAndState(i13, i2, i16 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        Behavior behaviorF;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.j(0) && (behaviorF = eVar.f()) != null) {
                    zOnNestedFling |= behaviorF.onNestedFling(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (zOnNestedFling) {
            F(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        Behavior behaviorF;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.j(0) && (behaviorF = eVar.f()) != null) {
                    zOnNestedPreFling |= behaviorF.onNestedPreFling(this, childAt, view, f2, f3);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f2041b;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behaviorF = w(childAt).f();
            if (id != -1 && behaviorF != null && (parcelable2 = sparseArray.get(id)) != null) {
                behaviorF.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behaviorF = ((e) childAt.getLayoutParams()).f();
            if (id != -1 && behaviorF != null && (parcelableOnSaveInstanceState = behaviorF.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.f2041b = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zJ;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2039k == null) {
            zJ = J(motionEvent, 1);
            if (!zJ) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.f2039k == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zJ) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                O(false);
            }
            return zOnTouchEvent;
        }
        zJ = false;
        Behavior behaviorF = ((e) this.f2039k.getLayoutParams()).f();
        if (behaviorF != null) {
            zOnTouchEvent = behaviorF.onTouchEvent(this, this.f2039k, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.f2039k == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zJ) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            O(false);
        } else {
            O(false);
        }
        return zOnTouchEvent;
    }

    public List<View> p(View view) {
        List<View> listH = this.f2038b.h(view);
        this.d.clear();
        if (listH != null) {
            this.d.addAll(listH);
        }
        return this.d;
    }

    public List<View> q(View view) {
        List listG = this.f2038b.g(view);
        this.d.clear();
        if (listG != null) {
            this.d.addAll(listG);
        }
        return this.d;
    }

    public void r(View view, Rect rect) {
        vtq.a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behaviorF = ((e) view.getLayoutParams()).f();
        if (behaviorF == null || !behaviorF.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.h) {
            return;
        }
        O(false);
        this.h = true;
    }

    public void s(View view, int i, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        t(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        h(eVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        V();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2040r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                k47.m(this.q, androidx.core.view.c.A(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            androidx.core.view.c.h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? ni4.e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.q;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.q.setVisible(z, false);
    }

    public final void t(View view, int i, Rect rect, Rect rect2, e eVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int iB = p3b.b(P(eVar.c), i);
        int iB2 = p3b.b(Q(eVar.d), i);
        int i4 = iB & 7;
        int i5 = iB & 112;
        int i6 = iB2 & 7;
        int i7 = iB2 & 112;
        if (i6 != 1) {
            iWidth = i6 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i7 != 16) {
            iHeight = i7 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public final int u(int i) {
        int[] iArr = this.j;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Keyline index ");
        sb2.append(i);
        sb2.append(" out of range for ");
        sb2.append(this);
        return 0;
    }

    public void v(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).h());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e w(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f2045b) {
            if (view instanceof b) {
                eVar.o(((b) view).getBehavior());
                eVar.f2045b = true;
            } else {
                c cVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    cVar = (c) superclass.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.o(cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(cVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                    }
                }
                eVar.f2045b = true;
            }
        }
        return eVar;
    }

    public final void x(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean y(View view) {
        return this.f2038b.j(view);
    }

    public boolean z(View view, int i, int i2) {
        Rect rectE = e();
        r(view, rectE);
        try {
            return rectE.contains(i, i2);
        } finally {
            M(rectE);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iii.f21175a);
    }

    @Override // defpackage.fjg
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behaviorF;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.j(i3) && (behaviorF = eVar.f()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorF.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            F(1);
        }
    }

    @Override // defpackage.fjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.g);
    }

    @Override // defpackage.fjg
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior behaviorF;
        this.t.c(view, view2, i, i2);
        this.l = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.j(i2) && (behaviorF = eVar.f()) != null) {
                behaviorF.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // defpackage.fjg
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                Behavior behaviorF = eVar.f();
                if (behaviorF != null) {
                    boolean zOnStartNestedScroll = behaviorF.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= zOnStartNestedScroll;
                    eVar.r(i2, zOnStartNestedScroll);
                } else {
                    eVar.r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // defpackage.fjg
    public void onStopNestedScroll(View view, int i) {
        this.t.e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.j(i)) {
                Behavior behaviorF = eVar.f();
                if (behaviorF != null) {
                    behaviorF.onStopNestedScroll(this, childAt, view, i);
                }
                eVar.l(i);
                eVar.k();
            }
        }
        this.l = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.f2037a = new ArrayList();
        this.f2038b = new yx6<>();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new int[2];
        this.g = new int[2];
        this.t = new hjg(this);
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5j.f17434b, 0, e3j.f16224a);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5j.f17434b, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, f5j.f17434b, attributeSet, typedArrayObtainStyledAttributes, 0, e3j.f16224a);
            } else {
                saveAttributeDataForStyleable(context, f5j.f17434b, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(f5j.c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.j.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.j;
                iArr[i2] = (int) (iArr[i2] * f2);
            }
        }
        this.q = typedArrayObtainStyledAttributes.getDrawable(f5j.d);
        typedArrayObtainStyledAttributes.recycle();
        V();
        super.setOnHierarchyChangeListener(new d());
        if (androidx.core.view.c.y(this) == 0) {
            androidx.core.view.c.C0(this, 1);
        }
    }

    @Override // defpackage.gjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behaviorF;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.j(i5) && (behaviorF = eVar.f()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorF.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = Math.max(i6, this.f[1]);
                    } else {
                        z = true;
                        iMin = Math.min(i6, this.f[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            F(1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<Parcelable> f2041b;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f2041b = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f2041b.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2041b;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2041b.keyAt(i2);
                parcelableArr[i2] = this.f2041b.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Behavior f2044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2045b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f2046k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f2047r;

        public e(int i, int i2) {
            super(i, i2);
            this.f2045b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public boolean a() {
            return this.f2046k == null && this.f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            return view2 == this.l || s(view2, androidx.core.view.c.A(coordinatorLayout)) || ((behavior = this.f2044a) != null && behavior.layoutDependsOn(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.f2044a == null) {
                this.m = false;
            }
            return this.m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.f2046k = null;
                return null;
            }
            if (this.f2046k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f2046k;
        }

        public int e() {
            return this.f;
        }

        public Behavior f() {
            return this.f2044a;
        }

        public boolean g() {
            return this.p;
        }

        public Rect h() {
            return this.q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            Behavior behavior = this.f2044a;
            boolean zBlocksInteractionBelow = (behavior != null ? behavior.blocksInteractionBelow(coordinatorLayout, view) : false) | z;
            this.m = zBlocksInteractionBelow;
            return zBlocksInteractionBelow;
        }

        public boolean j(int i) {
            if (i == 0) {
                return this.n;
            }
            if (i != 1) {
                return false;
            }
            return this.o;
        }

        public void k() {
            this.p = false;
        }

        public void l(int i) {
            r(i, false);
        }

        public void m() {
            this.m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f);
            this.f2046k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.f2046k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.l = null;
                this.f2046k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.l = null;
                    this.f2046k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.l = viewFindViewById;
        }

        public void o(Behavior behavior) {
            Behavior behavior2 = this.f2044a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f2044a = behavior;
                this.f2047r = null;
                this.f2045b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public void p(boolean z) {
            this.p = z;
        }

        public void q(Rect rect) {
            this.q.set(rect);
        }

        public void r(int i, boolean z) {
            if (i == 0) {
                this.n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.o = z;
            }
        }

        public final boolean s(View view, int i) {
            int iB = p3b.b(((e) view.getLayoutParams()).g, i);
            return iB != 0 && (p3b.b(this.h, i) & iB) == iB;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2046k.getId() != this.f) {
                return false;
            }
            View view2 = this.f2046k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.f2046k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.l = view2;
            return true;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2045b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5j.e);
            this.c = typedArrayObtainStyledAttributes.getInteger(f5j.f, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(f5j.g, -1);
            this.d = typedArrayObtainStyledAttributes.getInteger(f5j.h, 0);
            this.e = typedArrayObtainStyledAttributes.getInteger(f5j.l, -1);
            this.g = typedArrayObtainStyledAttributes.getInt(f5j.f17435k, 0);
            this.h = typedArrayObtainStyledAttributes.getInt(f5j.j, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(f5j.i);
            this.f2045b = zHasValue;
            if (zHasValue) {
                this.f2044a = CoordinatorLayout.I(context, attributeSet, typedArrayObtainStyledAttributes.getString(f5j.i));
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f2044a;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f2045b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2045b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2045b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }
}
