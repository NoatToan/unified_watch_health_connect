package com.oubowu.stickyitemdecoration;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes18.dex */
public class StickyItemDecoration extends RecyclerView.ItemDecoration {
    private int a;
    private int b;
    private int c;
    private int[] d;
    private RecyclerView.Adapter e;
    private StickyHeadContainer f;
    private boolean g = true;

    public class a extends RecyclerView.AdapterDataObserver {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            StickyItemDecoration.this.i();
        }
    }

    public StickyItemDecoration(StickyHeadContainer stickyHeadContainer, int i) {
        this.f = stickyHeadContainer;
        this.a = i;
    }

    private void b(RecyclerView recyclerView) {
        int iE = e(recyclerView.getLayoutManager());
        this.b = iE;
        int iF = f(iE);
        if (iF < 0 || this.c == iF) {
            return;
        }
        this.c = iF;
    }

    private void c(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.e != adapter) {
            this.e = adapter;
            this.c = -1;
            adapter.registerAdapterDataObserver(new a());
        }
    }

    private int d(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        this.d = iArr;
        staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
        int iMin = Integer.MAX_VALUE;
        for (int i : this.d) {
            iMin = Math.min(i, iMin);
        }
        return iMin;
    }

    private int e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        this.d = iArr;
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        int iMin = Integer.MAX_VALUE;
        for (int i : this.d) {
            iMin = Math.min(i, iMin);
        }
        return iMin;
    }

    private int f(int i) {
        while (i >= 0) {
            if (h(this.e.getItemViewType(i))) {
                return i;
            }
            i--;
        }
        return -1;
    }

    private boolean g(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return false;
        }
        return h(this.e.getItemViewType(childAdapterPosition));
    }

    private boolean h(int i) {
        return this.a == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f.reset();
    }

    public void enableStickyHead(boolean z) {
        this.g = z;
        if (z) {
            return;
        }
        this.f.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        c(recyclerView);
        if (this.e == null) {
            return;
        }
        b(recyclerView);
        if (this.g) {
            int i = this.b;
            int i2 = this.c;
            if (i >= i2 && i2 != -1) {
                View viewFindChildViewUnder = recyclerView.findChildViewUnder(canvas.getWidth() / 2, this.f.getChildHeight() + 0.01f);
                this.f.onDataChange(this.c);
                this.f.scrollChild((!g(recyclerView, viewFindChildViewUnder) || viewFindChildViewUnder.getTop() <= 0) ? 0 : viewFindChildViewUnder.getTop() - this.f.getChildHeight());
                this.f.setVisibility(0);
                return;
            }
        }
        this.f.reset();
        this.f.setVisibility(4);
    }
}
