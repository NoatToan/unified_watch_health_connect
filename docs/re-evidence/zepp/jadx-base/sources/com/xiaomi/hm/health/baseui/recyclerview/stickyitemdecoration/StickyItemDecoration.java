package com.xiaomi.hm.health.baseui.recyclerview.stickyitemdecoration;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes19.dex */
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
        public void onItemRangeChanged(int positionStart, int itemCount) {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int positionStart, int itemCount) {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            StickyItemDecoration.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            StickyItemDecoration.this.i();
        }
    }

    public StickyItemDecoration(StickyHeadContainer stickyHeadContainer, int stickyHeadType) {
        this.f = stickyHeadContainer;
        this.a = stickyHeadType;
    }

    private void b(RecyclerView parent) {
        int iE = e(parent.getLayoutManager());
        this.b = iE;
        int iF = f(iE);
        if (iF < 0 || this.c == iF) {
            return;
        }
        this.c = iF;
    }

    private void c(final RecyclerView parent) {
        RecyclerView.Adapter adapter = parent.getAdapter();
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

    private int f(int formPosition) {
        while (formPosition >= 0) {
            if (h(this.e.getItemViewType(formPosition))) {
                return formPosition;
            }
            formPosition--;
        }
        return -1;
    }

    private boolean g(RecyclerView parent, View view) {
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return false;
        }
        return h(this.e.getItemViewType(childAdapterPosition));
    }

    private boolean h(int type) {
        return this.a == type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f.reset();
    }

    public void enableStickyHead(boolean enableStickyHead) {
        this.g = enableStickyHead;
        if (enableStickyHead) {
            return;
        }
        this.f.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
        c(parent);
        if (this.e == null) {
            return;
        }
        b(parent);
        if (this.g) {
            int i = this.b;
            int i2 = this.c;
            if (i >= i2 && i2 != -1) {
                View viewFindChildViewUnder = parent.findChildViewUnder(c.getWidth() / 2, this.f.getChildHeight() + 0.01f);
                this.f.onDataChange(this.c);
                this.f.scrollChild((!g(parent, viewFindChildViewUnder) || viewFindChildViewUnder.getTop() <= 0) ? 0 : viewFindChildViewUnder.getTop() - this.f.getChildHeight());
                this.f.setVisibility(0);
                return;
            }
        }
        this.f.reset();
        this.f.setVisibility(4);
    }
}
