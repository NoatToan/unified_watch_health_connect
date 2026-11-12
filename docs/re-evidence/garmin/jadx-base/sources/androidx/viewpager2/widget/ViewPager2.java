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
import androidx.core.view.s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import j20.x;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f11337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f11338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.viewpager2.widget.a f11339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f11342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f11343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f11345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f11346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f11347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.viewpager2.widget.c f11348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.viewpager2.widget.a f11349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ie.c f11350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.b f11351o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView.m f11352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11354r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11355t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f11356v;

    public class a extends f {
        public a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.f, androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f11341e = true;
            viewPager2.f11348l.f11386l = true;
        }
    }

    public class b extends h {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void onPageScrollStateChanged(int i14) {
            if (i14 == 0) {
                ViewPager2.this.e();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void onPageSelected(int i14) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f11340d != i14) {
                viewPager2.f11340d = i14;
                viewPager2.f11356v.a();
            }
        }
    }

    public class c extends h {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void onPageSelected(int i14) {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.clearFocus();
            if (viewPager2.hasFocus()) {
                viewPager2.f11346j.requestFocus(2);
            }
        }
    }

    public class e extends d {
        public e(ViewPager2 viewPager2) {
            super(viewPager2, null);
        }
    }

    public class g extends LinearLayoutManager {
        public g(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.b0 b0Var, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(b0Var, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.b0 b0Var, l7.f fVar) {
            super.onInitializeAccessibilityNodeInfo(wVar, b0Var, fVar);
            ViewPager2.this.f11356v.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view2, l7.f fVar) {
            ViewPager2 viewPager2 = ViewPager2.this;
            fVar.q(l7.f.h.a(viewPager2.getOrientation() == 1 ? viewPager2.f11343g.getPosition(view2) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.f11343g.getPosition(view2) : 0, 1, false, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final boolean performAccessibilityAction(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i14, Bundle bundle) {
            ViewPager2.this.f11356v.getClass();
            return super.performAccessibilityAction(wVar, b0Var, i14, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view2, Rect rect, boolean z14, boolean z15) {
            return false;
        }
    }

    public static abstract class h {
        public void onPageScrollStateChanged(int i14) {
        }

        public void onPageScrolled(int i14, float f14, int i15) {
        }

        public void onPageSelected(int i14) {
        }
    }

    public class i extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f11361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f11362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.viewpager2.widget.d f11363c;

        public class a implements l7.h {
            public a() {
            }

            @Override // l7.h
            public final boolean perform(View view2, l7.h.a aVar) {
                int currentItem = ((ViewPager2) view2).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f11354r) {
                    viewPager2.d(currentItem, true);
                }
                return true;
            }
        }

        public class b implements l7.h {
            public b() {
            }

            @Override // l7.h
            public final boolean perform(View view2, l7.h.a aVar) {
                int currentItem = ((ViewPager2) view2).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f11354r) {
                    viewPager2.d(currentItem, true);
                }
                return true;
            }
        }

        public i() {
            super(ViewPager2.this, null);
            this.f11361a = new a();
            this.f11362b = new b();
        }

        public final void a() {
            int itemCount;
            int i14 = R.id.accessibilityActionPageLeft;
            ViewPager2 viewPager2 = ViewPager2.this;
            s0.n(R.id.accessibilityActionPageLeft, viewPager2);
            s0.o(R.id.accessibilityActionPageRight, viewPager2);
            s0.j(0, viewPager2);
            s0.o(R.id.accessibilityActionPageUp, viewPager2);
            s0.j(0, viewPager2);
            s0.o(R.id.accessibilityActionPageDown, viewPager2);
            s0.j(0, viewPager2);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f11354r) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.f11362b;
            a aVar = this.f11361a;
            if (orientation != 0) {
                if (viewPager2.f11340d < itemCount - 1) {
                    s0.p(viewPager2, new l7.f.a(R.id.accessibilityActionPageDown, null), null, aVar);
                }
                if (viewPager2.f11340d > 0) {
                    s0.p(viewPager2, new l7.f.a(R.id.accessibilityActionPageUp, null), null, bVar);
                    return;
                }
                return;
            }
            boolean z14 = viewPager2.f11343g.getLayoutDirection() == 1;
            int i15 = z14 ? 16908360 : 16908361;
            if (z14) {
                i14 = 16908361;
            }
            if (viewPager2.f11340d < itemCount - 1) {
                s0.p(viewPager2, new l7.f.a(i15, null), null, aVar);
            }
            if (viewPager2.f11340d > 0) {
                s0.p(viewPager2, new l7.f.a(i14, null), null, bVar);
            }
        }
    }

    public interface j {
    }

    public class k extends e0 {
        public k() {
        }

        @Override // androidx.recyclerview.widget.e0, androidx.recyclerview.widget.i0
        public final View findSnapView(RecyclerView.p pVar) {
            ViewPager2.this.f11350n.f93069a.getClass();
            return super.findSnapView(pVar);
        }
    }

    public class l extends RecyclerView {
        public l(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f11356v.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f11340d);
            accessibilityEvent.setToIndex(viewPager2.f11340d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f11354r && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f11354r && super.onTouchEvent(motionEvent);
        }
    }

    public static class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f11373b;

        public n(int i14, RecyclerView recyclerView) {
            this.f11372a = i14;
            this.f11373b = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f11373b.smoothScrollToPosition(this.f11372a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f11337a = new Rect();
        this.f11338b = new Rect();
        this.f11339c = new androidx.viewpager2.widget.a(3);
        this.f11341e = false;
        this.f11342f = new a();
        this.f11344h = -1;
        this.f11352p = null;
        this.f11353q = false;
        this.f11354r = true;
        this.f11355t = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.f11356v = new i();
        l lVar = new l(context);
        this.f11346j = lVar;
        lVar.setId(View.generateViewId());
        this.f11346j.setDescendantFocusability(131072);
        g gVar = new g(context);
        this.f11343g = gVar;
        this.f11346j.setLayoutManager(gVar);
        this.f11346j.setScrollingTouchSlop(1);
        int[] iArr = ge.a.f76986a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        s0.q(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f11346j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f11346j.addOnChildAttachStateChangeListener(new ie.d(this));
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.f11348l = cVar;
            this.f11350n = new ie.c(this, cVar, this.f11346j);
            k kVar = new k();
            this.f11347k = kVar;
            kVar.attachToRecyclerView(this.f11346j);
            this.f11346j.addOnScrollListener(this.f11348l);
            androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a(3);
            this.f11349m = aVar;
            this.f11348l.f11375a = aVar;
            b bVar = new b();
            c cVar2 = new c();
            this.f11349m.f11374a.add(bVar);
            this.f11349m.f11374a.add(cVar2);
            i iVar = this.f11356v;
            l lVar2 = this.f11346j;
            iVar.getClass();
            lVar2.setImportantForAccessibility(2);
            iVar.f11363c = new androidx.viewpager2.widget.d(iVar);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            androidx.viewpager2.widget.a aVar2 = this.f11349m;
            aVar2.f11374a.add(this.f11339c);
            androidx.viewpager2.widget.b bVar2 = new androidx.viewpager2.widget.b(this.f11343g);
            this.f11351o = bVar2;
            this.f11349m.f11374a.add(bVar2);
            l lVar3 = this.f11346j;
            attachViewToParent(lVar3, 0, lVar3.getLayoutParams());
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        RecyclerView.h adapter;
        if (this.f11344h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f11345i;
        if (parcelable != null) {
            if (adapter instanceof he.i) {
                ((he.i) adapter).k(parcelable);
            }
            this.f11345i = null;
        }
        int iMax = Math.max(0, Math.min(this.f11344h, adapter.getItemCount() - 1));
        this.f11340d = iMax;
        this.f11344h = -1;
        this.f11346j.scrollToPosition(iMax);
        this.f11356v.a();
    }

    public final void c(int i14, boolean z14) {
        this.f11350n.f93069a.getClass();
        d(i14, z14);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i14) {
        return this.f11346j.canScrollHorizontally(i14);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i14) {
        return this.f11346j.canScrollVertically(i14);
    }

    public final void d(int i14, boolean z14) {
        androidx.viewpager2.widget.a aVar;
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f11344h != -1) {
                this.f11344h = Math.max(i14, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i14, 0), adapter.getItemCount() - 1);
        int i15 = this.f11340d;
        if (iMin == i15 && this.f11348l.f11380f == 0) {
            return;
        }
        if (iMin == i15 && z14) {
            return;
        }
        double d14 = i15;
        this.f11340d = iMin;
        this.f11356v.a();
        androidx.viewpager2.widget.c cVar = this.f11348l;
        if (cVar.f11380f != 0) {
            cVar.c();
            androidx.viewpager2.widget.c.a aVar2 = cVar.f11381g;
            d14 = ((double) aVar2.f11387a) + ((double) aVar2.f11388b);
        }
        androidx.viewpager2.widget.c cVar2 = this.f11348l;
        cVar2.getClass();
        cVar2.f11379e = z14 ? 2 : 3;
        boolean z15 = cVar2.f11383i != iMin;
        cVar2.f11383i = iMin;
        cVar2.a(2);
        if (z15 && (aVar = cVar2.f11375a) != null) {
            aVar.onPageSelected(iMin);
        }
        if (!z14) {
            this.f11346j.scrollToPosition(iMin);
            return;
        }
        double d15 = iMin;
        double dAbs = Math.abs(d15 - d14);
        l lVar = this.f11346j;
        if (dAbs <= 3.0d) {
            lVar.smoothScrollToPosition(iMin);
            return;
        }
        lVar.scrollToPosition(d15 > d14 ? iMin - 3 : iMin + 3);
        l lVar2 = this.f11346j;
        lVar2.post(new n(iMin, lVar2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof m) {
            int i14 = ((m) parcelable).f11369a;
            sparseArray.put(this.f11346j.getId(), sparseArray.get(i14));
            sparseArray.remove(i14);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public final void e() {
        k kVar = this.f11347k;
        if (kVar == null) {
            vb.h.z("Design assumption violated.");
            return;
        }
        View viewFindSnapView = kVar.findSnapView(this.f11343g);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f11343g.getPosition(viewFindSnapView);
        if (position != this.f11340d && getScrollState() == 0) {
            this.f11349m.onPageSelected(position);
        }
        this.f11341e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f11356v.getClass();
        this.f11356v.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.h getAdapter() {
        return this.f11346j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f11340d;
    }

    public int getItemDecorationCount() {
        return this.f11346j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f11355t;
    }

    public int getOrientation() {
        return this.f11343g.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        l lVar = this.f11346j;
        if (getOrientation() == 0) {
            height = lVar.getWidth() - lVar.getPaddingLeft();
            paddingBottom = lVar.getPaddingRight();
        } else {
            height = lVar.getHeight() - lVar.getPaddingTop();
            paddingBottom = lVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f11348l.f11380f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        i iVar = this.f11356v;
        iVar.getClass();
        l7.f fVarV = l7.f.v(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 1;
        }
        fVarV.p(l7.f.g.a(itemCount, itemCount2, 0, false));
        RecyclerView.h adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.f11354r) {
            return;
        }
        if (viewPager2.f11340d > 0) {
            fVarV.a(8192);
        }
        if (viewPager2.f11340d < itemCount3 - 1) {
            fVarV.a(4096);
        }
        fVarV.s(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int measuredWidth = this.f11346j.getMeasuredWidth();
        int measuredHeight = this.f11346j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f11337a;
        rect.left = paddingLeft;
        rect.right = (i16 - i14) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i17 - i15) - getPaddingBottom();
        Rect rect2 = this.f11338b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f11346j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f11341e) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        measureChild(this.f11346j, i14, i15);
        int measuredWidth = this.f11346j.getMeasuredWidth();
        int measuredHeight = this.f11346j.getMeasuredHeight();
        int measuredState = this.f11346j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i14, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i15, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f11344h = mVar.f11370b;
        this.f11345i = mVar.f11371c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f11369a = this.f11346j.getId();
        int i14 = this.f11344h;
        if (i14 == -1) {
            i14 = this.f11340d;
        }
        mVar.f11370b = i14;
        Parcelable parcelable = this.f11345i;
        if (parcelable != null) {
            mVar.f11371c = parcelable;
            return mVar;
        }
        Object adapter = this.f11346j.getAdapter();
        if (adapter instanceof he.i) {
            mVar.f11371c = ((he.i) adapter).a();
        }
        return mVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view2) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i14, Bundle bundle) {
        this.f11356v.getClass();
        if (i14 != 8192 && i14 != 4096) {
            return super.performAccessibilityAction(i14, bundle);
        }
        i iVar = this.f11356v;
        iVar.getClass();
        ViewPager2 viewPager2 = ViewPager2.this;
        if (i14 != 8192 && i14 != 4096) {
            x.h();
            return false;
        }
        int currentItem = i14 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f11354r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f11346j.getAdapter();
        i iVar = this.f11356v;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(iVar.f11363c);
        } else {
            iVar.getClass();
        }
        a aVar = this.f11342f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(aVar);
        }
        this.f11346j.setAdapter(hVar);
        this.f11340d = 0;
        b();
        i iVar2 = this.f11356v;
        iVar2.a();
        if (hVar != null) {
            hVar.registerAdapterDataObserver(iVar2.f11363c);
        }
        if (hVar != null) {
            hVar.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i14) {
        c(i14, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i14) {
        super.setLayoutDirection(i14);
        this.f11356v.a();
    }

    public void setOffscreenPageLimit(int i14) {
        if (i14 < 1 && i14 != -1) {
            vb.h.s("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.f11355t = i14;
            this.f11346j.requestLayout();
        }
    }

    public void setOrientation(int i14) {
        this.f11343g.setOrientation(i14);
        this.f11356v.a();
    }

    public void setPageTransformer(j jVar) {
        boolean z14 = this.f11353q;
        if (jVar != null) {
            if (!z14) {
                this.f11352p = this.f11346j.getItemAnimator();
                this.f11353q = true;
            }
            this.f11346j.setItemAnimator(null);
        } else if (z14) {
            this.f11346j.setItemAnimator(this.f11352p);
            this.f11352p = null;
            this.f11353q = false;
        }
        this.f11351o.getClass();
        if (jVar == null) {
            return;
        }
        this.f11351o.getClass();
        this.f11351o.getClass();
    }

    public void setUserInputEnabled(boolean z14) {
        this.f11354r = z14;
        this.f11356v.a();
    }

    public abstract class d {
        private d(ViewPager2 viewPager2) {
        }

        public /* synthetic */ d(ViewPager2 viewPager2, a aVar) {
            this(viewPager2);
        }
    }

    public static abstract class f extends RecyclerView.j {
        private f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i14, int i15) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i14, int i15) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i14, int i15, int i16) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i14, int i15) {
            onChanged();
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i14, int i15, Object obj) {
            onChanged();
        }
    }

    public static class m extends View.BaseSavedState {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f11371c;

        public m(Parcel parcel) {
            super(parcel);
            this.f11369a = parcel.readInt();
            this.f11370b = parcel.readInt();
            this.f11371c = parcel.readParcelable(null);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f11369a);
            parcel.writeInt(this.f11370b);
            parcel.writeParcelable(this.f11371c, i14);
        }

        public class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i14) {
                return new m[i14];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11369a = parcel.readInt();
            this.f11370b = parcel.readInt();
            this.f11371c = parcel.readParcelable(classLoader);
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11337a = new Rect();
        this.f11338b = new Rect();
        this.f11339c = new androidx.viewpager2.widget.a(3);
        this.f11341e = false;
        this.f11342f = new a();
        this.f11344h = -1;
        this.f11352p = null;
        this.f11353q = false;
        this.f11354r = true;
        this.f11355t = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f11337a = new Rect();
        this.f11338b = new Rect();
        this.f11339c = new androidx.viewpager2.widget.a(3);
        this.f11341e = false;
        this.f11342f = new a();
        this.f11344h = -1;
        this.f11352p = null;
        this.f11353q = false;
        this.f11354r = true;
        this.f11355t = -1;
        a(context, attributeSet);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.f11337a = new Rect();
        this.f11338b = new Rect();
        this.f11339c = new androidx.viewpager2.widget.a(3);
        this.f11341e = false;
        this.f11342f = new a();
        this.f11344h = -1;
        this.f11352p = null;
        this.f11353q = false;
        this.f11354r = true;
        this.f11355t = -1;
        a(context, attributeSet);
    }
}
