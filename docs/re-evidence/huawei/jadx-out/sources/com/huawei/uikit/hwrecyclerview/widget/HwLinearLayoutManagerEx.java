package com.huawei.uikit.hwrecyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import defpackage.xeh;
import defpackage.xfn;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes44.dex */
public class HwLinearLayoutManagerEx extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f29627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f29628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f29629c;
    int d;
    OrientationHelper e;
    final c f;
    private a g;
    private boolean h;
    private OnReferenceItemListener i;
    SavedState j;
    private final b k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private Method p;
    private Object q;
    private Object r;
    private int s;
    private int[] t;
    private int v;
    private int w;

    public interface OnReferenceItemListener {
        boolean isNeedRefreshReferenceLayout(View view);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f29632c;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState() {
        }

        boolean a() {
            return this.f29630a >= 0;
        }

        void b() {
            this.f29630a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f29630a);
            parcel.writeInt(this.f29631b);
            parcel.writeInt(this.f29632c ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f29630a = parcel.readInt();
            this.f29631b = parcel.readInt();
            this.f29632c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f29630a = savedState.f29630a;
            this.f29631b = savedState.f29631b;
            this.f29632c = savedState.f29632c;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29635c;
        int d;
        int h;
        int i;
        boolean m;
        int n;
        boolean e = true;
        int g = 0;
        int f = 0;
        boolean j = false;
        List<RecyclerView.ViewHolder> l = null;

        a() {
        }

        private View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).itemView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof RecyclerView.LayoutParams) {
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    if (!layoutParams2.isItemRemoved() && this.f29635c == layoutParams2.getViewLayoutPosition()) {
                        c(view);
                        return view;
                    }
                }
            }
            return null;
        }

        public View a(View view) {
            int viewLayoutPosition;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).itemView;
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                if (layoutParams instanceof RecyclerView.LayoutParams) {
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    if (view3 != view && !layoutParams2.isItemRemoved() && (viewLayoutPosition = (layoutParams2.getViewLayoutPosition() - this.f29635c) * this.f29634b) >= 0 && viewLayoutPosition < i) {
                        if (viewLayoutPosition == 0) {
                            return view3;
                        }
                        view2 = view3;
                        i = viewLayoutPosition;
                    }
                }
            }
            return view2;
        }

        boolean a(RecyclerView.State state) {
            int i = this.f29635c;
            return i >= 0 && i < state.getItemCount();
        }

        View c(RecyclerView.Recycler recycler) {
            if (this.l != null) {
                return e();
            }
            View viewForPosition = recycler.getViewForPosition(this.f29635c);
            this.f29635c += this.f29634b;
            return viewForPosition;
        }

        public void b() {
            c((View) null);
        }

        public void c(View view) {
            View viewA = a(view);
            if (viewA == null) {
                this.f29635c = -1;
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewA.getLayoutParams();
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                this.f29635c = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition();
            }
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29637c;
        public int d;
        public boolean e;

        protected b() {
        }

        void b() {
            this.d = 0;
            this.f29636b = false;
            this.f29637c = false;
            this.e = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f29638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f29639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29640c;
        int d;
        OrientationHelper e;

        c() {
            d();
        }

        private void d() {
            this.f29640c = -1;
            this.d = Integer.MIN_VALUE;
            this.f29638a = false;
            this.f29639b = false;
        }

        void a() {
            d();
        }

        void c() {
            this.d = this.f29638a ? this.e.getEndAfterPadding() : this.e.getStartAfterPadding();
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f29640c + ", mCoordinate=" + this.d + ", mLayoutFromEnd=" + this.f29638a + ", mValid=" + this.f29639b + '}';
        }

        public void c(View view, int i) {
            int totalSpaceChange = this.e.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                d(view, i);
                return;
            }
            this.f29640c = i;
            if (this.f29638a) {
                int endAfterPadding = (this.e.getEndAfterPadding() - totalSpaceChange) - this.e.getDecoratedEnd(view);
                this.d = this.e.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    int decoratedMeasurement = this.e.getDecoratedMeasurement(view);
                    int i2 = this.d;
                    int startAfterPadding = this.e.getStartAfterPadding();
                    int iMin = (i2 - decoratedMeasurement) - (startAfterPadding + Math.min(this.e.getDecoratedStart(view) - startAfterPadding, 0));
                    if (iMin < 0) {
                        this.d += Math.min(endAfterPadding, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int decoratedStart = this.e.getDecoratedStart(view);
            int startAfterPadding2 = decoratedStart - this.e.getStartAfterPadding();
            this.d = decoratedStart;
            if (startAfterPadding2 > 0) {
                int decoratedMeasurement2 = this.e.getDecoratedMeasurement(view);
                int endAfterPadding2 = (this.e.getEndAfterPadding() - Math.min(0, (this.e.getEndAfterPadding() - totalSpaceChange) - this.e.getDecoratedEnd(view))) - (decoratedStart + decoratedMeasurement2);
                if (endAfterPadding2 < 0) {
                    this.d -= Math.min(startAfterPadding2, -endAfterPadding2);
                }
            }
        }

        boolean e(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount();
        }

        public void d(View view, int i) {
            if (this.f29638a) {
                this.d = this.e.getDecoratedEnd(view) + this.e.getTotalSpaceChange();
            } else {
                this.d = this.e.getDecoratedStart(view);
            }
            this.f29640c = i;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29642b;
        public View e;

        e() {
        }
    }

    public HwLinearLayoutManagerEx(Context context) {
        this(context, 1, false);
    }

    private void a(int i, int i2) {
        this.g.f29633a = i2 - this.e.getStartAfterPadding();
        a aVar = this.g;
        aVar.f29635c = i;
        aVar.f29634b = this.f29629c ? 1 : -1;
        aVar.h = -1;
        aVar.d = i2;
        aVar.i = Integer.MIN_VALUE;
    }

    private View c(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return this.f29629c ? a(recycler, state) : b(recycler, state);
    }

    private void c(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.m) {
            return;
        }
        this.m = z;
        requestLayout();
    }

    private void d(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.o == z) {
            return;
        }
        this.o = z;
        requestLayout();
    }

    private View i() {
        return this.f29629c ? h() : j();
    }

    private View k() {
        return getChildAt(this.f29629c ? getChildCount() - 1 : 0);
    }

    private View l() {
        return getChildAt(this.f29629c ? 0 : getChildCount() - 1);
    }

    private void n() {
        if (this.f29627a == 1 || !f()) {
            this.f29629c = this.m;
        } else {
            this.f29629c = !this.m;
        }
    }

    private View o() {
        return this.f29629c ? j() : h();
    }

    @Deprecated
    protected int a(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.e.getTotalSpace();
        }
        return 0;
    }

    void a(RecyclerView.Recycler recycler, RecyclerView.State state, c cVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.j == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public int b() {
        View viewB = b(getChildCount() - 1, -1, false, true);
        if (viewB == null) {
            return -1;
        }
        return getPosition(viewB);
    }

    public void b(int i, int i2) {
        this.d = i;
        this.f29628b = i2;
        SavedState savedState = this.j;
        if (savedState != null) {
            savedState.b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f29627a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f29627a == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.f29627a != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        a();
        c(i > 0 ? 1 : -1, Math.abs(i), true, state);
        d(state, this.g, layoutPrefetchRegistry);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z;
        int i2;
        SavedState savedState = this.j;
        if (savedState == null || !savedState.a()) {
            n();
            z = this.f29629c;
            i2 = this.d;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.j;
            z = savedState2.f29632c;
            i2 = savedState2.f29630a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.s && i2 >= 0 && i2 < i; i4++) {
            layoutPrefetchRegistry.addPosition(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return c(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return b(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.f29629c ? -1 : 1;
        return this.f29627a == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return c(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return b(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return e(state);
    }

    public int d() {
        View viewB = b(0, getChildCount(), false, true);
        if (viewB == null) {
            return -1;
        }
        return getPosition(viewB);
    }

    public boolean d(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.itemView.getLayoutParams() instanceof RecyclerView.LayoutParams) {
            return ((RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams()).isItemRemoved();
        }
        return true;
    }

    protected void e(RecyclerView.State state, int[] iArr) {
        int i;
        int iA = a(state);
        if (this.g.h == -1) {
            i = 0;
        } else {
            i = iA;
            iA = 0;
        }
        iArr[0] = iA;
        iArr[1] = i;
    }

    protected boolean f() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    boolean g() {
        return this.e.getMode() == 0 && this.e.getEnd() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.n) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iA;
        n();
        if (getChildCount() == 0 || (iA = a(i)) == Integer.MIN_VALUE) {
            return null;
        }
        a();
        c(iA, (int) (this.e.getTotalSpace() * 0.33333334f), false, state);
        a aVar = this.g;
        aVar.i = Integer.MIN_VALUE;
        aVar.e = false;
        b(recycler, aVar, state, true);
        View viewO = iA == -1 ? o() : i();
        View viewK = iA == -1 ? k() : l();
        if (!viewK.hasFocusable()) {
            return viewO;
        }
        if (viewO == null) {
            return null;
        }
        return viewK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(d());
            accessibilityEvent.setToIndex(b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        int iA;
        int i5;
        View viewFindViewByPosition;
        int decoratedStart;
        int endAfterPadding;
        int i6 = -1;
        if (!(this.j == null && this.d == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.j;
        if (savedState != null && savedState.a()) {
            this.d = this.j.f29630a;
        }
        a();
        this.g.e = false;
        n();
        View focusedChild = getFocusedChild();
        c cVar = this.f;
        if (!cVar.f29639b || this.d != -1 || this.j != null) {
            cVar.a();
            c cVar2 = this.f;
            cVar2.f29638a = this.f29629c ^ this.o;
            a(recycler, state, cVar2);
            this.f.f29639b = true;
        } else if (focusedChild != null && (this.e.getDecoratedStart(focusedChild) >= this.e.getEndAfterPadding() || this.e.getDecoratedEnd(focusedChild) <= this.e.getStartAfterPadding())) {
            this.f.c(focusedChild, getPosition(focusedChild));
        }
        a aVar = this.g;
        aVar.h = aVar.n >= 0 ? 1 : -1;
        int[] iArr = this.t;
        iArr[0] = 0;
        iArr[1] = 0;
        e(state, iArr);
        int iMax = Math.max(0, this.t[0]) + this.e.getStartAfterPadding();
        int iMax2 = Math.max(0, this.t[1]) + this.e.getEndPadding();
        if (state.isPreLayout() && (i5 = this.d) != -1 && this.f29628b != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.f29629c) {
                endAfterPadding = this.e.getEndAfterPadding() - this.e.getDecoratedEnd(viewFindViewByPosition);
                decoratedStart = this.f29628b;
            } else {
                decoratedStart = this.e.getDecoratedStart(viewFindViewByPosition) - this.e.getStartAfterPadding();
                endAfterPadding = this.f29628b;
            }
            int i7 = endAfterPadding - decoratedStart;
            if (i7 > 0) {
                iMax += i7;
            } else {
                iMax2 -= i7;
            }
        }
        c cVar3 = this.f;
        if (!cVar3.f29638a ? !this.f29629c : this.f29629c) {
            i6 = 1;
        }
        a(recycler, state, cVar3, i6);
        detachAndScrapAttachedViews(recycler);
        this.g.m = g();
        this.g.j = state.isPreLayout();
        this.g.f = 0;
        c cVar4 = this.f;
        if (cVar4.f29638a) {
            a(cVar4);
            a aVar2 = this.g;
            aVar2.g = iMax;
            b(recycler, aVar2, state, false);
            a aVar3 = this.g;
            i2 = aVar3.d;
            int i8 = aVar3.f29635c;
            int i9 = aVar3.f29633a;
            if (i9 > 0) {
                iMax2 += i9;
            }
            c(this.f);
            a aVar4 = this.g;
            aVar4.g = iMax2;
            aVar4.f29635c += aVar4.f29634b;
            b(recycler, aVar4, state, false);
            a aVar5 = this.g;
            i = aVar5.d;
            int i10 = aVar5.f29633a;
            if (i10 > 0) {
                a(i8, i2);
                a aVar6 = this.g;
                aVar6.g = i10;
                b(recycler, aVar6, state, false);
                i2 = this.g.d;
            }
        } else {
            c(cVar4);
            a aVar7 = this.g;
            aVar7.g = iMax2;
            b(recycler, aVar7, state, false);
            a aVar8 = this.g;
            i = aVar8.d;
            int i11 = aVar8.f29635c;
            int i12 = aVar8.f29633a;
            if (i12 > 0) {
                iMax += i12;
            }
            a(this.f);
            a aVar9 = this.g;
            aVar9.g = iMax;
            aVar9.f29635c += aVar9.f29634b;
            b(recycler, aVar9, state, false);
            a aVar10 = this.g;
            i2 = aVar10.d;
            int i13 = aVar10.f29633a;
            if (i13 > 0) {
                e(i11, i);
                a aVar11 = this.g;
                aVar11.g = i13;
                b(recycler, aVar11, state, false);
                i = this.g.d;
            }
        }
        if (getChildCount() > 0) {
            if (this.f29629c ^ this.o) {
                int iA2 = a(i, recycler, state, true);
                i3 = i2 + iA2;
                i4 = i + iA2;
                iA = e(i3, recycler, state, false);
            } else {
                int iE = e(i2, recycler, state, true);
                i3 = i2 + iE;
                i4 = i + iE;
                iA = a(i4, recycler, state, false);
            }
            i2 = i3 + iA;
            i = i4 + iA;
        }
        d(recycler, state, i2, i);
        if (state.isPreLayout()) {
            this.f.a();
        } else {
            this.e.onLayoutComplete();
        }
        this.h = this.o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.j = null;
        this.d = -1;
        this.f29628b = Integer.MIN_VALUE;
        this.f.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.j = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.j != null) {
            return new SavedState(this.j);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.b();
            return savedState;
        }
        a();
        boolean z = this.h ^ this.f29629c;
        savedState.f29632c = z;
        if (z) {
            View viewL = l();
            savedState.f29631b = this.e.getEndAfterPadding() - this.e.getDecoratedEnd(viewL);
            savedState.f29630a = getPosition(viewL);
            return savedState;
        }
        View viewK = k();
        savedState.f29630a = getPosition(viewK);
        savedState.f29631b = this.e.getDecoratedStart(viewK) - this.e.getStartAfterPadding();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        a();
        n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b2 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.f29629c) {
            if (b2 == 1) {
                b(position2, this.e.getEndAfterPadding() - (this.e.getDecoratedStart(view2) + this.e.getDecoratedMeasurement(view)));
                return;
            } else {
                b(position2, this.e.getEndAfterPadding() - this.e.getDecoratedEnd(view2));
                return;
            }
        }
        if (b2 == -1) {
            b(position2, this.e.getDecoratedStart(view2) - this.e.getStartAfterPadding());
        } else {
            b(position2, (this.e.getDecoratedEnd(view2) - this.e.getDecoratedMeasurement(view)) - this.e.getStartAfterPadding());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f29627a == 1) {
            return 0;
        }
        return d(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.d = i;
        this.f29628b = Integer.MIN_VALUE;
        SavedState savedState = this.j;
        if (savedState != null) {
            savedState.b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f29627a == 0) {
            return 0;
        }
        return d(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.j == null && this.h == this.o;
    }

    public HwLinearLayoutManagerEx(Context context, int i, boolean z) {
        this.f29627a = 1;
        this.f29629c = false;
        this.d = -1;
        this.f29628b = Integer.MIN_VALUE;
        this.j = null;
        this.f = new c();
        this.m = false;
        this.o = false;
        this.l = true;
        this.k = new b();
        this.s = 2;
        this.t = new int[2];
        this.p = null;
        this.q = null;
        this.r = null;
        this.w = 0;
        this.v = 0;
        c(i);
        c(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    private View j() {
        return d(getChildCount() - 1, -1);
    }

    protected int[] c() {
        return new int[]{this.w, this.v};
    }

    private void c(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.f29627a || this.e == null) {
            OrientationHelper orientationHelperCreateOrientationHelper = OrientationHelper.createOrientationHelper(this, i);
            this.e = orientationHelperCreateOrientationHelper;
            this.f.e = orientationHelperCreateOrientationHelper;
            this.f29627a = i;
            requestLayout();
        }
    }

    private void d(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        if (!state.willRunPredictiveAnimations() || getChildCount() == 0 || state.isPreLayout() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
        int size = scrapList.size();
        int position = getPosition(getChildAt(0));
        int decoratedMeasurement = 0;
        int decoratedMeasurement2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.ViewHolder viewHolder = scrapList.get(i3);
            if (!d(viewHolder)) {
                if ((viewHolder.getLayoutPosition() < position) != this.f29629c) {
                    decoratedMeasurement += this.e.getDecoratedMeasurement(viewHolder.itemView);
                } else {
                    decoratedMeasurement2 += this.e.getDecoratedMeasurement(viewHolder.itemView);
                }
            }
        }
        this.g.l = scrapList;
        if (decoratedMeasurement > 0) {
            a(getPosition(k()), i);
            a aVar = this.g;
            aVar.g = decoratedMeasurement;
            aVar.f29633a = 0;
            aVar.b();
            b(recycler, this.g, state, false);
        }
        if (decoratedMeasurement2 > 0) {
            e(getPosition(l()), i2);
            a aVar2 = this.g;
            aVar2.g = decoratedMeasurement2;
            aVar2.f29633a = 0;
            aVar2.b();
            b(recycler, this.g, state, false);
        }
        this.g.l = null;
    }

    private int e(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        a();
        e eVar = new e();
        eVar.f29642b = b(!this.l, true);
        eVar.e = c(!this.l, true);
        eVar.f29641a = this.l;
        return xfn.a(state, this.e, eVar, this);
    }

    private void a(RecyclerView.Recycler recycler, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.f29629c) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.e.getDecoratedEnd(childAt) > i3 || this.e.getTransformedEndWithDecoration(childAt) > i3) {
                    c(recycler, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.e.getDecoratedEnd(childAt2) > i3 || this.e.getTransformedEndWithDecoration(childAt2) > i3) {
                c(recycler, i5, i6);
                return;
            }
        }
    }

    private void a(RecyclerView.Recycler recycler, RecyclerView.State state, c cVar) {
        if (b(state, cVar) || e(recycler, state, cVar)) {
            return;
        }
        cVar.c();
        cVar.f29640c = this.o ? state.getItemCount() - 1 : 0;
    }

    private View e(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return this.f29629c ? b(recycler, state) : a(recycler, state);
    }

    private int e(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int startAfterPadding;
        int startAfterPadding2 = i - this.e.getStartAfterPadding();
        if (startAfterPadding2 <= 0) {
            return 0;
        }
        int i2 = -d(startAfterPadding2, recycler, state);
        if (!z || (startAfterPadding = (i + i2) - this.e.getStartAfterPadding()) <= 0) {
            return i2;
        }
        this.e.offsetChildren(-startAfterPadding);
        return i2 - startAfterPadding;
    }

    private View h() {
        return d(0, getChildCount());
    }

    private void e(int i, int i2) {
        this.g.f29633a = this.e.getEndAfterPadding() - i2;
        a aVar = this.g;
        aVar.f29634b = this.f29629c ? -1 : 1;
        aVar.f29635c = i;
        aVar.h = 1;
        aVar.d = i2;
        aVar.i = Integer.MIN_VALUE;
    }

    private boolean e(RecyclerView.Recycler recycler, RecyclerView.State state, c cVar) {
        View viewC;
        int startAfterPadding;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (this.i == null && focusedChild != null && cVar.e(focusedChild, state)) {
            cVar.c(focusedChild, getPosition(focusedChild));
            return true;
        }
        if (this.h != this.o) {
            return false;
        }
        if (cVar.f29638a) {
            viewC = e(recycler, state);
        } else {
            viewC = c(recycler, state);
        }
        if (viewC == null) {
            return false;
        }
        cVar.d(viewC, getPosition(viewC));
        if (!state.isPreLayout() && supportsPredictiveItemAnimations() && (this.e.getDecoratedStart(viewC) >= this.e.getEndAfterPadding() || this.e.getDecoratedEnd(viewC) < this.e.getStartAfterPadding())) {
            if (cVar.f29638a) {
                startAfterPadding = this.e.getEndAfterPadding();
            } else {
                startAfterPadding = this.e.getStartAfterPadding();
            }
            cVar.d = startAfterPadding;
        }
        return true;
    }

    private void a(c cVar) {
        a(cVar.f29640c, cVar.d);
    }

    void a() {
        if (this.g == null) {
            this.g = e();
        }
    }

    private int b(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        a();
        e eVar = new e();
        eVar.f29642b = b(!this.l, true);
        eVar.e = c(!this.l, true);
        eVar.f29641a = this.l;
        return xfn.e(state, this.e, eVar, this, this.f29629c);
    }

    private void b(RecyclerView.Recycler recycler, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int end = (this.e.getEnd() - i) + i2;
        if (this.f29629c) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.e.getDecoratedStart(childAt) < end || this.e.getTransformedStartWithDecoration(childAt) < end) {
                    c(recycler, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.e.getDecoratedStart(childAt2) < end || this.e.getTransformedStartWithDecoration(childAt2) < end) {
                c(recycler, i4, i5);
                return;
            }
        }
    }

    private boolean b(RecyclerView.State state, c cVar) {
        int i;
        if (state.isPreLayout() || (i = this.d) == -1) {
            return false;
        }
        if (i >= 0 && i < state.getItemCount()) {
            cVar.f29640c = this.d;
            SavedState savedState = this.j;
            if (savedState != null && savedState.a()) {
                boolean z = this.j.f29632c;
                cVar.f29638a = z;
                if (z) {
                    cVar.d = this.e.getEndAfterPadding() - this.j.f29631b;
                } else {
                    cVar.d = this.e.getStartAfterPadding() + this.j.f29631b;
                }
                return true;
            }
            if (this.f29628b == Integer.MIN_VALUE) {
                return d(cVar, findViewByPosition(this.d));
            }
            boolean z2 = this.f29629c;
            cVar.f29638a = z2;
            if (z2) {
                cVar.d = this.e.getEndAfterPadding() - this.f29628b;
            } else {
                cVar.d = this.e.getStartAfterPadding() + this.f29628b;
            }
            return true;
        }
        this.d = -1;
        this.f29628b = Integer.MIN_VALUE;
        return false;
    }

    View b(boolean z, boolean z2) {
        if (this.f29629c) {
            return b(getChildCount() - 1, -1, z, z2);
        }
        return b(0, getChildCount(), z, z2);
    }

    private View a(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return e(recycler, state, getChildCount() - 1, -1, state.getItemCount());
    }

    private View e(int i, int i2, int i3, int i4) {
        try {
            if (this.r == null) {
                Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mVerticalBoundCheck");
                declaredField.setAccessible(true);
                this.r = declaredField.get(this);
            }
            if (this.p == null) {
                Class cls = Integer.TYPE;
                this.p = xeh.c("findOneViewWithinBoundFlags", new Class[]{cls, cls, cls, cls}, "androidx.recyclerview.widget.ViewBoundsCheck");
            }
            Object objC = xeh.c(this.r, this.p, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            if (objC instanceof View) {
                return (View) objC;
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            Log.e("LinearLayoutManager", "Reflect findVerticalOneViewWithinBoundFlags failed!");
            return null;
        }
    }

    public HwLinearLayoutManagerEx(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f29627a = 1;
        this.f29629c = false;
        this.d = -1;
        this.f29628b = Integer.MIN_VALUE;
        this.j = null;
        this.f = new c();
        this.m = false;
        this.o = false;
        this.l = true;
        this.k = new b();
        this.s = 2;
        this.t = new int[2];
        this.p = null;
        this.q = null;
        this.r = null;
        this.w = 0;
        this.v = 0;
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        c(properties.orientation);
        c(properties.reverseLayout);
        d(properties.stackFromEnd);
    }

    private boolean d(c cVar, View view) {
        int decoratedStart;
        if (cVar == null) {
            return false;
        }
        if (view != null) {
            if (this.e.getDecoratedMeasurement(view) > this.e.getTotalSpace()) {
                cVar.c();
                return true;
            }
            if (this.e.getDecoratedStart(view) - this.e.getStartAfterPadding() < 0) {
                cVar.d = this.e.getStartAfterPadding();
                cVar.f29638a = false;
                return true;
            }
            if (this.e.getEndAfterPadding() - this.e.getDecoratedEnd(view) < 0) {
                cVar.d = this.e.getEndAfterPadding();
                cVar.f29638a = true;
                return true;
            }
            if (cVar.f29638a) {
                decoratedStart = this.e.getDecoratedEnd(view) + this.e.getTotalSpaceChange();
            } else {
                decoratedStart = this.e.getDecoratedStart(view);
            }
            cVar.d = decoratedStart;
        } else {
            if (getChildCount() > 0) {
                cVar.f29638a = (this.d < getPosition(getChildAt(0))) == this.f29629c;
            }
            cVar.c();
        }
        return true;
    }

    private int a(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int endAfterPadding;
        int endAfterPadding2 = this.e.getEndAfterPadding() - i;
        if (endAfterPadding2 <= 0) {
            return 0;
        }
        int i2 = -d(-endAfterPadding2, recycler, state);
        if (!z || (endAfterPadding = this.e.getEndAfterPadding() - (i + i2)) <= 0) {
            return i2;
        }
        this.e.offsetChildren(endAfterPadding);
        return endAfterPadding + i2;
    }

    private void c(c cVar) {
        e(cVar.f29640c, cVar.d);
    }

    a e() {
        return new a();
    }

    private int c(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        a();
        e eVar = new e();
        eVar.f29642b = b(!this.l, true);
        eVar.e = c(!this.l, true);
        eVar.f29641a = this.l;
        return xfn.d(state, this.e, eVar, this);
    }

    private void c(int i, int i2, boolean z, RecyclerView.State state) {
        int startAfterPadding;
        this.g.m = g();
        this.g.h = i;
        int[] iArr = this.t;
        iArr[0] = 0;
        iArr[1] = 0;
        e(state, iArr);
        int iMax = Math.max(0, this.t[0]);
        int iMax2 = Math.max(0, this.t[1]);
        boolean z2 = i == 1;
        a aVar = this.g;
        int i3 = z2 ? iMax2 : iMax;
        aVar.g = i3;
        if (!z2) {
            iMax = iMax2;
        }
        aVar.f = iMax;
        if (z2) {
            aVar.g = i3 + this.e.getEndPadding();
            View viewL = l();
            a aVar2 = this.g;
            aVar2.f29634b = this.f29629c ? -1 : 1;
            int position = getPosition(viewL);
            a aVar3 = this.g;
            aVar2.f29635c = position + aVar3.f29634b;
            aVar3.d = this.e.getDecoratedEnd(viewL);
            startAfterPadding = this.e.getDecoratedEnd(viewL) - this.e.getEndAfterPadding();
        } else {
            View viewK = k();
            this.g.g += this.e.getStartAfterPadding();
            a aVar4 = this.g;
            aVar4.f29634b = this.f29629c ? 1 : -1;
            int position2 = getPosition(viewK);
            a aVar5 = this.g;
            aVar4.f29635c = position2 + aVar5.f29634b;
            aVar5.d = this.e.getDecoratedStart(viewK);
            startAfterPadding = (-this.e.getDecoratedStart(viewK)) + this.e.getStartAfterPadding();
        }
        a aVar6 = this.g;
        aVar6.f29633a = i2;
        if (z) {
            aVar6.f29633a = i2 - startAfterPadding;
        }
        aVar6.i = startAfterPadding;
    }

    void d(RecyclerView.State state, a aVar, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = aVar.f29635c;
        if (i < 0 || i >= state.getItemCount()) {
            return;
        }
        layoutPrefetchRegistry.addPosition(i, Math.max(0, aVar.i));
    }

    int d(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        a();
        this.g.e = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        c(i2, iAbs, true, state);
        a aVar = this.g;
        int iB = aVar.i + b(recycler, aVar, state, false);
        if (iB < 0) {
            return 0;
        }
        if (iAbs > iB) {
            i = i2 * iB;
        }
        this.e.offsetChildren(-i);
        this.g.n = i;
        return i;
    }

    private void c(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    removeAndRecycleViewAt(i2, recycler);
                }
            }
        }
    }

    private void c(RecyclerView.Recycler recycler, a aVar) {
        if (!aVar.e || aVar.m) {
            return;
        }
        int i = aVar.i;
        int i2 = aVar.f;
        if (aVar.h == -1) {
            b(recycler, i, i2);
        } else {
            a(recycler, i, i2);
        }
    }

    int b(RecyclerView.Recycler recycler, a aVar, RecyclerView.State state, boolean z) {
        int i = aVar.f29633a;
        int i2 = aVar.i;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                aVar.i = i2 + i;
            }
            c(recycler, aVar);
        }
        int i3 = aVar.f29633a + aVar.g;
        b bVar = this.k;
        while (true) {
            if ((!aVar.m && i3 <= 0) || !aVar.a(state)) {
                break;
            }
            bVar.b();
            c(recycler, state, aVar, bVar);
            if (!bVar.f29636b) {
                aVar.d += bVar.d * aVar.h;
                if (!bVar.f29637c || aVar.l != null || !state.isPreLayout()) {
                    int i4 = aVar.f29633a;
                    int i5 = bVar.d;
                    aVar.f29633a = i4 - i5;
                    i3 -= i5;
                }
                int i6 = aVar.i;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.d;
                    aVar.i = i7;
                    int i8 = aVar.f29633a;
                    if (i8 < 0) {
                        aVar.i = i7 + i8;
                    }
                    c(recycler, aVar);
                }
                if (z && bVar.e) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - aVar.f29633a;
    }

    void c(RecyclerView.Recycler recycler, RecyclerView.State state, a aVar, b bVar) {
        View viewC = aVar.c(recycler);
        if (viewC == null) {
            bVar.f29636b = true;
            return;
        }
        if (aVar.l == null) {
            if (this.f29629c == (aVar.h == -1)) {
                addView(viewC);
            } else {
                addView(viewC, 0);
            }
        } else {
            if (this.f29629c == (aVar.h == -1)) {
                addDisappearingView(viewC);
            } else {
                addDisappearingView(viewC, 0);
            }
        }
        measureChildWithMargins(viewC, 0, 0);
        bVar.d = this.e.getDecoratedMeasurement(viewC);
        d(aVar, bVar, viewC);
        bVar.e = viewC.hasFocusable();
    }

    private void d(a aVar, b bVar, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int paddingLeft;
        int decoratedMeasurementInOther;
        int i7;
        int i8;
        if (aVar == null || bVar == null || view == null) {
            return;
        }
        if (this.f29627a == 1) {
            if (f()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                paddingLeft = decoratedMeasurementInOther - this.e.getDecoratedMeasurementInOther(view);
            } else {
                paddingLeft = getPaddingLeft();
                decoratedMeasurementInOther = this.e.getDecoratedMeasurementInOther(view) + paddingLeft;
            }
            if (aVar.h == -1) {
                i8 = aVar.d;
                i7 = i8 - bVar.d;
            } else {
                i7 = aVar.d;
                i8 = bVar.d + i7;
            }
            i6 = i8;
            i3 = decoratedMeasurementInOther;
            i4 = i7;
            i5 = paddingLeft;
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.e.getDecoratedMeasurementInOther(view);
            if (aVar.h == -1) {
                i2 = aVar.d;
                i = i2 - bVar.d;
            } else {
                int i9 = aVar.d;
                i = i9;
                i2 = bVar.d + i9;
            }
            i3 = i2;
            i4 = paddingTop;
            i5 = i;
            i6 = decoratedMeasurementInOther2 + paddingTop;
        }
        layoutDecoratedWithMargins(view, i5, i4, i3, i6);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            if (layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                bVar.f29637c = true;
            }
        }
    }

    int a(int i) {
        if (i == 1) {
            return (this.f29627a != 1 && f()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f29627a != 1 && f()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f29627a == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f29627a == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f29627a == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f29627a == 0 ? 1 : Integer.MIN_VALUE;
    }

    View c(boolean z, boolean z2) {
        if (this.f29629c) {
            return b(0, getChildCount(), z, z2);
        }
        return b(getChildCount() - 1, -1, z, z2);
    }

    private View b(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return e(recycler, state, 0, getChildCount(), state.getItemCount());
    }

    View e(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3) {
        OnReferenceItemListener onReferenceItemListener;
        a();
        int startAfterPadding = this.e.getStartAfterPadding();
        int endAfterPadding = this.e.getEndAfterPadding();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof RecyclerView.LayoutParams) && position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) layoutParams).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.e.getDecoratedStart(childAt) < endAfterPadding && this.e.getDecoratedEnd(childAt) >= startAfterPadding) {
                    OnReferenceItemListener onReferenceItemListener2 = this.i;
                    if (onReferenceItemListener2 == null || onReferenceItemListener2.isNeedRefreshReferenceLayout(childAt)) {
                        return childAt;
                    }
                } else if (view == null && ((onReferenceItemListener = this.i) == null || onReferenceItemListener.isNeedRefreshReferenceLayout(childAt))) {
                    view = childAt;
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    View b(int i, int i2, boolean z, boolean z2) {
        a();
        int i3 = GlMapUtil.DEVICE_DISPLAY_DPI_HIGH;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f29627a == 0) {
            return a(i, i2, i4, i3);
        }
        return e(i, i2, i4, i3);
    }

    View d(int i, int i2) {
        int i3;
        int i4;
        a();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.e.getDecoratedStart(getChildAt(i)) < this.e.getStartAfterPadding()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f29627a == 0) {
            return a(i, i2, i3, i4);
        }
        return e(i, i2, i3, i4);
    }

    private View a(int i, int i2, int i3, int i4) {
        try {
            if (this.q == null) {
                Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mHorizontalBoundCheck");
                declaredField.setAccessible(true);
                this.q = declaredField.get(this);
            }
            if (this.p == null) {
                Class cls = Integer.TYPE;
                this.p = xeh.c("findOneViewWithinBoundFlags", new Class[]{cls, cls, cls, cls}, "androidx.recyclerview.widget.ViewBoundsCheck");
            }
            Object objC = xeh.c(this.q, this.p, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            if (objC instanceof View) {
                return (View) objC;
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            Log.e("LinearLayoutManager", "Reflect findHorizontalOneViewWithinBoundFlags failed!");
            return null;
        }
    }
}
