package com.xiaomi.fitness.electronic.scale.widget.gallery;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.s;

/* JADX INFO: loaded from: classes8.dex */
public class GalleryLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public View e;
    public e f;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s f12148k;
    public s l;
    public d m;
    public RecyclerView n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12146a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12147b = 0;
    public int c = 0;
    public int d = -1;
    public o g = new o();
    public c h = new c();
    public boolean i = false;

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class a extends RecyclerView.q {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean a(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFling: onTouchEvent 1 mState=");
            sb.append(GalleryLayoutManager.this.f);
            return false;
        }
    }

    public class b extends n {
        public b(Context context) {
            super(context);
        }

        public int a(View view) {
            RecyclerView.o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
                return 0;
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int decoratedLeft = layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return ((int) (((layoutManager.getWidth() - layoutManager.getPaddingRight()) - layoutManager.getPaddingLeft()) / 2.0f)) - (decoratedLeft + ((int) (((layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) - decoratedLeft) / 2.0f)));
        }

        public int b(View view) {
            RecyclerView.o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollVertically()) {
                return 0;
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int decoratedTop = layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            return ((int) (((layoutManager.getHeight() - layoutManager.getPaddingBottom()) - layoutManager.getPaddingTop()) / 2.0f)) - (decoratedTop + ((int) (((layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - decoratedTop) / 2.0f)));
        }

        @Override // androidx.recyclerview.widget.n, androidx.recyclerview.widget.RecyclerView.y
        public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            int iA = a(view);
            int iB = b(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iA * iA) + (iB * iB)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(-iA, -iB, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    public class c extends RecyclerView.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12152b;

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewH;
            super.onScrollStateChanged(recyclerView, i);
            this.f12151a = i;
            if (i != 0 || (viewH = GalleryLayoutManager.this.g.h(recyclerView.getLayoutManager())) == null) {
                return;
            }
            int position = recyclerView.getLayoutManager().getPosition(viewH);
            GalleryLayoutManager galleryLayoutManager = GalleryLayoutManager.this;
            if (position == galleryLayoutManager.d) {
                if (galleryLayoutManager.i || GalleryLayoutManager.this.m == null || !this.f12152b) {
                    return;
                }
                this.f12152b = false;
                GalleryLayoutManager.this.m.a(recyclerView, viewH, GalleryLayoutManager.this.d);
                return;
            }
            View view = galleryLayoutManager.e;
            if (view != null) {
                view.setSelected(false);
            }
            GalleryLayoutManager.this.e = viewH;
            viewH.setSelected(true);
            GalleryLayoutManager galleryLayoutManager2 = GalleryLayoutManager.this;
            galleryLayoutManager2.d = position;
            if (galleryLayoutManager2.m != null) {
                GalleryLayoutManager.this.m.a(recyclerView, viewH, GalleryLayoutManager.this.d);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View viewH = GalleryLayoutManager.this.g.h(recyclerView.getLayoutManager());
            if (viewH != null) {
                int position = recyclerView.getLayoutManager().getPosition(viewH);
                GalleryLayoutManager galleryLayoutManager = GalleryLayoutManager.this;
                if (position != galleryLayoutManager.d) {
                    View view = galleryLayoutManager.e;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    GalleryLayoutManager.this.e = viewH;
                    viewH.setSelected(true);
                    GalleryLayoutManager galleryLayoutManager2 = GalleryLayoutManager.this;
                    galleryLayoutManager2.d = position;
                    if (!galleryLayoutManager2.i && this.f12151a != 0) {
                        this.f12152b = true;
                    } else if (GalleryLayoutManager.this.m != null) {
                        GalleryLayoutManager.this.m.a(recyclerView, viewH, GalleryLayoutManager.this.d);
                    }
                }
            }
        }

        public c() {
        }
    }

    public interface d {
        void a(RecyclerView recyclerView, View view, int i);
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<Rect> f12153a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12154b = 0;

        public e() {
        }
    }

    public GalleryLayoutManager(int i) {
        this.j = i;
    }

    private int p(int i) {
        return (getChildCount() != 0 && i >= this.f12146a) ? 1 : -1;
    }

    public final int A() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public s B() {
        if (this.j == 0) {
            if (this.f12148k == null) {
                this.f12148k = s.a(this);
            }
            return this.f12148k;
        }
        if (this.l == null) {
            this.l = s.c(this);
        }
        return this.l;
    }

    public e C() {
        if (this.f == null) {
            this.f = new e();
        }
        return this.f;
    }

    public final int D() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    public final void E() {
        e eVar = this.f;
        if (eVar != null) {
            eVar.f12153a.clear();
        }
        int i = this.d;
        if (i != -1) {
            this.c = i;
        }
        int iMin = Math.min(Math.max(0, this.c), getItemCount() - 1);
        this.c = iMin;
        this.f12146a = iMin;
        this.f12147b = iMin;
        this.d = -1;
        View view = this.e;
        if (view != null) {
            view.setSelected(false);
            this.e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.j == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.j == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF computeScrollVectorForPosition(int i) {
        int iP = p(i);
        PointF pointF = new PointF();
        if (iP == 0) {
            return null;
        }
        if (this.j == 0) {
            pointF.x = iP;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iP;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.j == 1 ? new LayoutParams(-1, -2) : new LayoutParams(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public void o(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            throw new IllegalArgumentException("The attach RecycleView must not null!!");
        }
        this.n = recyclerView;
        this.c = Math.max(0, i);
        recyclerView.setLayoutManager(this);
        this.g.b(recyclerView);
        recyclerView.addOnScrollListener(this.h);
        recyclerView.setOnFlingListener(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (getItemCount() == 0) {
            E();
            detachAndScrapAttachedViews(uVar);
            return;
        }
        if (zVar.f()) {
            return;
        }
        if (zVar.c() == 0 || zVar.b()) {
            if (getChildCount() == 0 || zVar.b()) {
                E();
            }
            this.c = Math.min(Math.max(0, this.c), getItemCount() - 1);
            detachAndScrapAttachedViews(uVar);
            x(uVar, zVar, 0);
        }
    }

    public final void q(RecyclerView.u uVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iA = A();
        while (i < getItemCount() && i2 < i3) {
            View viewO = uVar.o(i);
            addView(viewO);
            measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
            int paddingLeft = (int) (getPaddingLeft() + ((iA - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + i2);
            layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            this.f12147b = i;
            if (C().f12153a.get(i) == null) {
                C().f12153a.put(i, rect);
            } else {
                C().f12153a.get(i).set(rect);
            }
            i++;
        }
    }

    public final void r(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        if (getItemCount() == 0) {
            return;
        }
        if (this.j == 0) {
            v(uVar, zVar, i);
        } else {
            w(uVar, zVar, i);
        }
    }

    public final void s(RecyclerView.u uVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iD = D();
        while (i >= 0 && i2 > i3) {
            View viewO = uVar.o(i);
            addView(viewO, 0);
            measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
            int paddingTop = (int) (getPaddingTop() + ((iD - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2 - decoratedMeasuredWidth, paddingTop, i2, decoratedMeasuredHeight + paddingTop);
            layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            this.f12146a = i;
            if (C().f12153a.get(i) == null) {
                C().f12153a.put(i, rect);
            } else {
                C().f12153a.get(i).set(rect);
            }
            i--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int i3 = ((B().i() - B().m()) / 2) + B().m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - i3));
                i2 = -iMin;
            }
        } else if (this.f12146a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - i3));
            i2 = -iMin;
        }
        int i4 = -i2;
        C().f12154b = i4;
        r(uVar, zVar, i4);
        offsetChildrenHorizontal(i2);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int i3 = ((B().i() - B().m()) / 2) + B().m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - i3));
                i2 = -iMin;
            }
        } else if (this.f12146a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - i3));
            i2 = -iMin;
        }
        int i4 = -i2;
        C().f12154b = i4;
        r(uVar, zVar, i4);
        offsetChildrenVertical(i2);
        return i4;
    }

    public void setOnItemSelectedListener(d dVar) {
        this.m = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        b bVar = new b(recyclerView.getContext());
        bVar.setTargetPosition(i);
        startSmoothScroll(bVar);
    }

    public final void t(RecyclerView.u uVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iD = D();
        while (i < getItemCount() && i2 < i3) {
            View viewO = uVar.o(i);
            addView(viewO);
            measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
            int paddingTop = (int) (getPaddingTop() + ((iD - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2, paddingTop, decoratedMeasuredWidth + i2, decoratedMeasuredHeight + paddingTop);
            layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            this.f12147b = i;
            if (C().f12153a.get(i) == null) {
                C().f12153a.put(i, rect);
            } else {
                C().f12153a.get(i).set(rect);
            }
            i++;
        }
    }

    public final void u(RecyclerView.u uVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iA = A();
        while (i >= 0 && i2 > i3) {
            View viewO = uVar.o(i);
            addView(viewO, 0);
            measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
            int paddingLeft = (int) (getPaddingLeft() + ((iA - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2 - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, i2);
            layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            this.f12146a = i;
            if (C().f12153a.get(i) == null) {
                C().f12153a.put(i, rect);
            } else {
                C().f12153a.get(i).set(rect);
            }
            i--;
        }
    }

    public final void v(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        int i2;
        int decoratedRight;
        int iM = B().m();
        int i3 = B().i();
        if (getChildCount() > 0) {
            if (i >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5 + i4);
                    if (getDecoratedRight(childAt) - i >= iM) {
                        break;
                    }
                    removeAndRecycleView(childAt, uVar);
                    this.f12146a++;
                    i4--;
                }
            } else {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    if (getDecoratedLeft(childAt2) - i > i3) {
                        removeAndRecycleView(childAt2, uVar);
                        this.f12147b--;
                    }
                }
            }
        }
        int i6 = this.f12146a;
        int iD = D();
        int decoratedLeft = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedLeft = getDecoratedLeft(childAt3);
                i6 = position;
            }
            for (int i7 = i6; i7 >= 0 && decoratedLeft > iM + i; i7--) {
                Rect rect = C().f12153a.get(i7);
                View viewO = uVar.o(i7);
                addView(viewO, 0);
                if (rect == null) {
                    rect = new Rect();
                    C().f12153a.put(i7, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewO, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
                int paddingTop = (int) (getPaddingTop() + ((iD - decoratedMeasuredHeight) / 2.0f));
                rect2.set(decoratedLeft - decoratedMeasuredWidth, paddingTop, decoratedLeft, decoratedMeasuredHeight + paddingTop);
                layoutDecorated(viewO, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                this.f12146a = i7;
            }
            return;
        }
        if (getChildCount() != 0) {
            View childAt4 = getChildAt(getChildCount() - 1);
            int position2 = getPosition(childAt4) + 1;
            decoratedRight = getDecoratedRight(childAt4);
            i2 = position2;
        } else {
            i2 = i6;
            decoratedRight = -1;
        }
        for (int i8 = i2; i8 < getItemCount() && decoratedRight < i3 + i; i8++) {
            Rect rect3 = C().f12153a.get(i8);
            View viewO2 = uVar.o(i8);
            addView(viewO2);
            if (rect3 == null) {
                rect3 = new Rect();
                C().f12153a.put(i8, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewO2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewO2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewO2);
            int paddingTop2 = (int) (getPaddingTop() + ((iD - decoratedMeasuredHeight2) / 2.0f));
            if (decoratedRight == -1 && i2 == 0) {
                int paddingLeft = (int) (getPaddingLeft() + ((A() - decoratedMeasuredWidth2) / 2.0f));
                rect4.set(paddingLeft, paddingTop2, decoratedMeasuredWidth2 + paddingLeft, decoratedMeasuredHeight2 + paddingTop2);
            } else {
                rect4.set(decoratedRight, paddingTop2, decoratedMeasuredWidth2 + decoratedRight, decoratedMeasuredHeight2 + paddingTop2);
            }
            layoutDecorated(viewO2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedRight = rect4.right;
            this.f12147b = i8;
        }
    }

    public final void w(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        int i2;
        int decoratedBottom;
        int iM = B().m();
        int i3 = B().i();
        if (getChildCount() > 0) {
            if (i < 0) {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = getChildAt(childCount);
                    if (getDecoratedTop(childAt) - i <= i3) {
                        break;
                    }
                    removeAndRecycleView(childAt, uVar);
                    this.f12147b--;
                }
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt2 = getChildAt(i5 + i4);
                    if (getDecoratedBottom(childAt2) - i >= iM) {
                        break;
                    }
                    removeAndRecycleView(childAt2, uVar);
                    this.f12146a++;
                    i4--;
                }
            }
        }
        int i6 = this.f12146a;
        int iA = A();
        int decoratedTop = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedTop = getDecoratedTop(childAt3);
                i6 = position;
            }
            for (int i7 = i6; i7 >= 0 && decoratedTop > iM + i; i7--) {
                Rect rect = C().f12153a.get(i7);
                View viewO = uVar.o(i7);
                addView(viewO, 0);
                if (rect == null) {
                    rect = new Rect();
                    C().f12153a.put(i7, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewO, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
                int paddingLeft = (int) (getPaddingLeft() + ((iA - decoratedMeasuredWidth) / 2.0f));
                rect2.set(paddingLeft, decoratedTop - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, decoratedTop);
                layoutDecorated(viewO, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedTop = rect2.top;
                this.f12146a = i7;
            }
            return;
        }
        if (getChildCount() != 0) {
            View childAt4 = getChildAt(getChildCount() - 1);
            int position2 = getPosition(childAt4) + 1;
            decoratedBottom = getDecoratedBottom(childAt4);
            i2 = position2;
        } else {
            i2 = i6;
            decoratedBottom = -1;
        }
        for (int i8 = i2; i8 < getItemCount() && decoratedBottom < i3 + i; i8++) {
            Rect rect3 = C().f12153a.get(i8);
            View viewO2 = uVar.o(i8);
            addView(viewO2);
            if (rect3 == null) {
                rect3 = new Rect();
                C().f12153a.put(i8, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewO2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewO2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewO2);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iA - decoratedMeasuredWidth2) / 2.0f));
            if (decoratedBottom == -1 && i2 == 0) {
                int paddingTop = (int) (getPaddingTop() + ((D() - decoratedMeasuredHeight2) / 2.0f));
                rect4.set(paddingLeft2, paddingTop, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + paddingTop);
            } else {
                rect4.set(paddingLeft2, decoratedBottom, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + decoratedBottom);
            }
            layoutDecorated(viewO2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedBottom = rect4.bottom;
            this.f12147b = i8;
        }
    }

    public final void x(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        if (this.j == 0) {
            y(uVar, zVar);
        } else {
            z(uVar, zVar);
        }
        this.h.onScrolled(this.n, 0, 0);
    }

    public final void y(RecyclerView.u uVar, RecyclerView.z zVar) {
        detachAndScrapAttachedViews(uVar);
        int iM = B().m();
        int i = B().i();
        int i2 = this.c;
        Rect rect = new Rect();
        int iD = D();
        View viewO = uVar.o(this.c);
        addView(viewO, 0);
        measureChildWithMargins(viewO, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
        int paddingTop = (int) (getPaddingTop() + ((iD - decoratedMeasuredHeight) / 2.0f));
        int paddingLeft = (int) (getPaddingLeft() + ((A() - decoratedMeasuredWidth) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
        if (C().f12153a.get(i2) == null) {
            C().f12153a.put(i2, rect);
        } else {
            C().f12153a.get(i2).set(rect);
        }
        this.f12147b = i2;
        this.f12146a = i2;
        int decoratedLeft = getDecoratedLeft(viewO);
        int decoratedRight = getDecoratedRight(viewO);
        s(uVar, this.c - 1, decoratedLeft, iM);
        t(uVar, this.c + 1, decoratedRight, i);
    }

    public final void z(RecyclerView.u uVar, RecyclerView.z zVar) {
        detachAndScrapAttachedViews(uVar);
        int iM = B().m();
        int i = B().i();
        int i2 = this.c;
        Rect rect = new Rect();
        int iA = A();
        View viewO = uVar.o(this.c);
        addView(viewO, 0);
        measureChildWithMargins(viewO, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
        int paddingLeft = (int) (getPaddingLeft() + ((iA - decoratedMeasuredWidth) / 2.0f));
        int paddingTop = (int) (getPaddingTop() + ((D() - decoratedMeasuredHeight) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
        if (C().f12153a.get(i2) == null) {
            C().f12153a.put(i2, rect);
        } else {
            C().f12153a.get(i2).set(rect);
        }
        this.f12147b = i2;
        this.f12146a = i2;
        int decoratedTop = getDecoratedTop(viewO);
        int decoratedBottom = getDecoratedBottom(viewO);
        u(uVar, this.c - 1, decoratedTop, iM);
        q(uVar, this.c + 1, decoratedBottom, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }
}
