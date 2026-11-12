package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import defpackage.c89;
import defpackage.cdo;
import defpackage.m80;
import defpackage.q80;
import defpackage.s3j;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public static boolean u = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f3148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f3149b;
    public androidx.viewpager2.widget.a c;
    public int d;
    public boolean e;
    public RecyclerView.i f;
    public LinearLayoutManager g;
    public int h;
    public Parcelable i;
    public RecyclerView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f3150k;
    public androidx.viewpager2.widget.d l;
    public androidx.viewpager2.widget.a m;
    public c89 n;
    public androidx.viewpager2.widget.c o;
    public RecyclerView.l p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3151r;
    public int s;
    public e t;

    public class a extends g {
        public a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.e = true;
            viewPager2.l.j();
        }
    }

    public class b extends i {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ViewPager2.this.p();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.d != i) {
                viewPager2.d = i;
                viewPager2.t.r();
            }
        }
    }

    public class c extends i {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.j.requestFocus(2);
            }
        }
    }

    public class d implements RecyclerView.p {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void b(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    public abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i) {
            return false;
        }

        public boolean c(int i, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(RecyclerView.Adapter<?> adapter) {
        }

        public void f(RecyclerView.Adapter<?> adapter) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(androidx.viewpager2.widget.a aVar, RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(m80 m80Var) {
        }

        public void k(View view, m80 m80Var) {
        }

        public boolean l(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean m(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void n() {
        }

        public CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        public void p(AccessibilityEvent accessibilityEvent) {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public void t() {
        }

        public /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    public class f extends e {
        public f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.f();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(m80 m80Var) {
            if (ViewPager2.this.f()) {
                return;
            }
            m80Var.a0(m80.a.f25864r);
            m80Var.a0(m80.a.q);
            m80Var.F0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i) {
            if (b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class g extends RecyclerView.i {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    public class h extends LinearLayoutManager {
        public h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.z zVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(zVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onInitializeAccessibilityNodeInfo(RecyclerView.u uVar, RecyclerView.z zVar, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(uVar, zVar, m80Var);
            ViewPager2.this.t.j(m80Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.u uVar, RecyclerView.z zVar, View view, m80 m80Var) {
            ViewPager2.this.t.k(view, m80Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean performAccessibilityAction(RecyclerView.u uVar, RecyclerView.z zVar, int i, Bundle bundle) {
            return ViewPager2.this.t.b(i) ? ViewPager2.this.t.l(i) : super.performAccessibilityAction(uVar, zVar, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    public static abstract class i {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public class j extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q80 f3161b;
        public final q80 c;
        public RecyclerView.i d;

        public class a implements q80 {
            public a() {
            }

            @Override // defpackage.q80
            public boolean a(View view, q80.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        public class b implements q80 {
            public b() {
            }

            @Override // defpackage.q80
            public boolean a(View view, q80.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        public class c extends g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                j.this.y();
            }
        }

        public j() {
            super(ViewPager2.this, null);
            this.f3161b = new a();
            this.c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.Adapter<?> adapter) {
            y();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.a aVar, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.d = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m80 m80VarP0 = m80.P0(accessibilityNodeInfo);
            u(m80VarP0);
            w(m80VarP0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void k(View view, m80 m80Var) {
            v(view, m80Var);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i, Bundle bundle) {
            if (!c(i, bundle)) {
                throw new IllegalStateException();
            }
            x(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        public final void u(m80 m80Var) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            m80Var.k0(m80.e.b(itemCount2, itemCount, false, 0));
        }

        public final void v(View view, m80 m80Var) {
            m80Var.l0(m80.f.b(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.g.getPosition(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.g.getPosition(view) : 0, 1, false, false));
        }

        public final void w(m80 m80Var) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.f()) {
                return;
            }
            if (ViewPager2.this.d > 0) {
                m80Var.a(8192);
            }
            if (ViewPager2.this.d < itemCount - 1) {
                m80Var.a(4096);
            }
            m80Var.F0(true);
        }

        public void x(int i) {
            if (ViewPager2.this.f()) {
                ViewPager2.this.l(i, true);
            }
        }

        public void y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            androidx.core.view.c.k0(viewPager2, R.id.accessibilityActionPageLeft);
            androidx.core.view.c.k0(viewPager2, R.id.accessibilityActionPageRight);
            androidx.core.view.c.k0(viewPager2, R.id.accessibilityActionPageUp);
            androidx.core.view.c.k0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.f()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.d < itemCount - 1) {
                    androidx.core.view.c.m0(viewPager2, new m80.a(R.id.accessibilityActionPageDown, null), null, this.f3161b);
                }
                if (ViewPager2.this.d > 0) {
                    androidx.core.view.c.m0(viewPager2, new m80.a(R.id.accessibilityActionPageUp, null), null, this.c);
                    return;
                }
                return;
            }
            boolean zE = ViewPager2.this.e();
            int i2 = zE ? 16908360 : 16908361;
            if (zE) {
                i = 16908361;
            }
            if (ViewPager2.this.d < itemCount - 1) {
                androidx.core.view.c.m0(viewPager2, new m80.a(i2, null), null, this.f3161b);
            }
            if (ViewPager2.this.d > 0) {
                androidx.core.view.c.m0(viewPager2, new m80.a(i, null), null, this.c);
            }
        }
    }

    public interface k {
        void transformPage(View view, float f);
    }

    public class l extends t {
        public l() {
        }

        @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.x
        public View h(RecyclerView.o oVar) {
            if (ViewPager2.this.d()) {
                return null;
            }
            return super.h(oVar);
        }
    }

    public class m extends RecyclerView {
        public m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @RequiresApi(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.t.d() ? ViewPager2.this.t.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.d);
            accessibilityEvent.setToIndex(ViewPager2.this.d);
            ViewPager2.this.t.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f() && super.onTouchEvent(motionEvent);
        }
    }

    public static class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f3167b;

        public n(int i, RecyclerView recyclerView) {
            this.f3166a = i;
            this.f3167b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3167b.smoothScrollToPosition(this.f3166a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f3148a = new Rect();
        this.f3149b = new Rect();
        this.c = new androidx.viewpager2.widget.a(3);
        this.e = false;
        this.f = new a();
        this.h = -1;
        this.p = null;
        this.q = false;
        this.f3151r = true;
        this.s = -1;
        c(context, null);
    }

    public void a(RecyclerView.n nVar) {
        this.j.addItemDecoration(nVar);
    }

    public final RecyclerView.p b() {
        return new d();
    }

    public final void c(Context context, AttributeSet attributeSet) {
        this.t = u ? new j() : new f();
        m mVar = new m(context);
        this.j = mVar;
        mVar.setId(View.generateViewId());
        this.j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.g = hVar;
        this.j.setLayoutManager(hVar);
        this.j.setScrollingTouchSlop(1);
        m(context, attributeSet);
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j.addOnChildAttachStateChangeListener(b());
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this);
        this.l = dVar;
        this.n = new c89(this, dVar, this.j);
        l lVar = new l();
        this.f3150k = lVar;
        lVar.b(this.j);
        this.j.addOnScrollListener(this.l);
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a(3);
        this.m = aVar;
        this.l.m(aVar);
        b bVar = new b();
        c cVar = new c();
        this.m.a(bVar);
        this.m.a(cVar);
        this.t.h(this.m, this.j);
        this.m.a(this.c);
        androidx.viewpager2.widget.c cVar2 = new androidx.viewpager2.widget.c(this.g);
        this.o = cVar2;
        this.m.a(cVar2);
        RecyclerView recyclerView = this.j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.j.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.j.canScrollVertically(i2);
    }

    public boolean d() {
        return this.n.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).f3152a;
            sparseArray.put(this.j.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        j();
    }

    public boolean e() {
        return this.g.getLayoutDirection() == 1;
    }

    public boolean f() {
        return this.f3151r;
    }

    public final void g(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        return this.t.a() ? this.t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.l.f();
    }

    public void h(i iVar) {
        this.c.a(iVar);
    }

    public void i() {
        if (this.o.a() == null) {
            return;
        }
        double dE = this.l.e();
        int i2 = (int) dE;
        float f2 = (float) (dE - ((double) i2));
        this.o.onPageScrolled(i2, f2, Math.round(getPageSize() * f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        RecyclerView.Adapter adapter;
        if (this.h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            if (adapter instanceof cdo) {
                ((cdo) adapter).restoreState(parcelable);
            }
            this.i = null;
        }
        int iMax = Math.max(0, Math.min(this.h, adapter.getItemCount() - 1));
        this.d = iMax;
        this.h = -1;
        this.j.scrollToPosition(iMax);
        this.t.n();
    }

    public void k(int i2, boolean z) {
        if (d()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        l(i2, z);
    }

    public void l(int i2, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
        if (iMin == this.d && this.l.h()) {
            return;
        }
        int i3 = this.d;
        if (iMin == i3 && z) {
            return;
        }
        double dE = i3;
        this.d = iMin;
        this.t.r();
        if (!this.l.h()) {
            dE = this.l.e();
        }
        this.l.k(iMin, z);
        if (!z) {
            this.j.scrollToPosition(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - dE) <= 3.0d) {
            this.j.smoothScrollToPosition(iMin);
            return;
        }
        this.j.scrollToPosition(d2 > dE ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.j;
        recyclerView.post(new n(iMin, recyclerView));
    }

    public final void m(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s3j.f33243a);
        androidx.core.view.c.p0(this, context, s3j.f33243a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(s3j.f33244b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void n(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f);
        }
    }

    public void o(i iVar) {
        this.c.b(iVar);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        this.f3148a.left = getPaddingLeft();
        this.f3148a.right = (i4 - i2) - getPaddingRight();
        this.f3148a.top = getPaddingTop();
        this.f3148a.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f3148a, this.f3149b);
        RecyclerView recyclerView = this.j;
        Rect rect = this.f3149b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.e) {
            p();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        measureChild(this.j, i2, i3);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.h = savedState.f3153b;
        this.i = savedState.c;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3152a = this.j.getId();
        int i2 = this.h;
        if (i2 == -1) {
            i2 = this.d;
        }
        savedState.f3153b = i2;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            savedState.c = parcelable;
        } else {
            Object adapter = this.j.getAdapter();
            if (adapter instanceof cdo) {
                savedState.c = ((cdo) adapter).saveState();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public void p() {
        t tVar = this.f3150k;
        if (tVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewH = tVar.h(this.g);
        if (viewH == null) {
            return;
        }
        int position = this.g.getPosition(viewH);
        if (position != this.d && getScrollState() == 0) {
            this.m.onPageSelected(position);
        }
        this.e = false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        return this.t.c(i2, bundle) ? this.t.m(i2, bundle) : super.performAccessibilityAction(i2, bundle);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.j.getAdapter();
        this.t.f(adapter2);
        n(adapter2);
        this.j.setAdapter(adapter);
        this.d = 0;
        j();
        this.t.e(adapter);
        g(adapter);
    }

    public void setCurrentItem(int i2) {
        k(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.t.q();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.s = i2;
        this.j.requestLayout();
    }

    public void setOrientation(int i2) {
        this.g.setOrientation(i2);
        this.t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.q) {
                this.p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator(null);
        } else if (this.q) {
            this.j.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        if (kVar == this.o.a()) {
            return;
        }
        this.o.b(kVar);
        i();
    }

    public void setUserInputEnabled(boolean z) {
        this.f3151r = z;
        this.t.t();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3153b;
        public Parcelable c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
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

        @RequiresApi(24)
        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
            this.f3152a = parcel.readInt();
            this.f3153b = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3152a);
            parcel.writeInt(this.f3153b);
            parcel.writeParcelable(this.c, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3148a = new Rect();
        this.f3149b = new Rect();
        this.c = new androidx.viewpager2.widget.a(3);
        this.e = false;
        this.f = new a();
        this.h = -1;
        this.p = null;
        this.q = false;
        this.f3151r = true;
        this.s = -1;
        c(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3148a = new Rect();
        this.f3149b = new Rect();
        this.c = new androidx.viewpager2.widget.a(3);
        this.e = false;
        this.f = new a();
        this.h = -1;
        this.p = null;
        this.q = false;
        this.f3151r = true;
        this.s = -1;
        c(context, attributeSet);
    }
}
