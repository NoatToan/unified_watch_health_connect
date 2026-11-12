package com.huami.phone_call.sms.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.SparseArrayCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.zhouyou.recyclerview.XRecyclerView;
import com.zhouyou.recyclerview.adapter.BH;
import com.zhouyou.recyclerview.listener.AppBarStateChangeListener;
import com.zhouyou.recyclerview.refresh.ArrowRefreshHeader;
import com.zhouyou.recyclerview.refresh.IMoreFooter;
import com.zhouyou.recyclerview.refresh.IRefreshHeader;
import com.zhouyou.recyclerview.refresh.LoadingMoreFooter;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class FixedXRecyclerView extends RecyclerView {
    public static final int FOOTER_INIT_INDEX = 400002;
    public static final int HEADER_INIT_INDEX = 300002;
    public static final int TYPE_LOADMORE_FOOTER = 300001;
    public static final int TYPE_REFRESH_HEADER = 300000;
    private static final float v = 3.0f;
    private final RecyclerView.AdapterDataObserver a;
    public float b;
    public float c;
    private XRecyclerView.Sections d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private SparseArrayCompat<View> i;
    private SparseArrayCompat<View> j;
    private d k;
    private float l;
    private XRecyclerView.LoadingListener m;
    private IRefreshHeader n;
    private IMoreFooter o;
    private boolean p;
    private boolean q;
    private boolean r;
    private View s;
    private AppBarStateChangeListener.State t;
    private RecyclerView.Adapter u;

    public class a extends GridLayoutManager.SpanSizeLookup {
        public final /* synthetic */ GridLayoutManager a;

        public a(GridLayoutManager gridLayoutManager) {
            this.a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            if (FixedXRecyclerView.this.isHeaderFooter(i)) {
                return this.a.getSpanCount();
            }
            return 1;
        }
    }

    public class b extends AppBarStateChangeListener {
        public b() {
        }

        @Override // com.zhouyou.recyclerview.listener.AppBarStateChangeListener
        public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            FixedXRecyclerView.this.t = state;
        }
    }

    public class c extends RecyclerView.AdapterDataObserver {
        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (FixedXRecyclerView.this.k != null) {
                FixedXRecyclerView.this.k.notifyDataSetChanged();
            }
            if (FixedXRecyclerView.this.k == null || FixedXRecyclerView.this.s == null) {
                return;
            }
            int headersCount = FixedXRecyclerView.this.k.getHeadersCount() + 1;
            if (FixedXRecyclerView.this.q) {
                headersCount++;
            }
            if (FixedXRecyclerView.this.k.getPagerCount() == headersCount) {
                FixedXRecyclerView.this.s.setVisibility(0);
                FixedXRecyclerView.this.setVisibility(8);
            } else {
                FixedXRecyclerView.this.s.setVisibility(8);
                FixedXRecyclerView.this.setVisibility(0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            FixedXRecyclerView.this.k.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            FixedXRecyclerView.this.k.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            FixedXRecyclerView.this.k.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            FixedXRecyclerView.this.k.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            FixedXRecyclerView.this.k.notifyItemRangeChanged(i, i2, obj);
        }
    }

    public FixedXRecyclerView(Context context) {
        this(context, null);
    }

    private void init() {
        if (this.p) {
            ArrowRefreshHeader arrowRefreshHeader = new ArrowRefreshHeader(getContext());
            this.n = arrowRefreshHeader;
            arrowRefreshHeader.setProgressStyle(this.g);
        }
        LoadingMoreFooter loadingMoreFooter = new LoadingMoreFooter(getContext());
        loadingMoreFooter.setProgressStyle(this.h);
        this.o = loadingMoreFooter;
        loadingMoreFooter.getFooterView().setVisibility(8);
    }

    private int o(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View p(int i) {
        if (r(i)) {
            return this.j.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View q(int i) {
        if (s(i)) {
            return this.i.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(int i) {
        return this.j.size() > 0 && this.j.get(i) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(int i) {
        return this.i.size() > 0 && this.i.get(i) != null;
    }

    private boolean t() {
        return this.n.getHeaderView().getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(int i) {
        return i == 300000 || i == 300001 || this.i.get(i) != null || this.j.get(i) != null;
    }

    public void addFooterView(View view) {
        if (view == null) {
            throw new RuntimeException("footer is null");
        }
        SparseArrayCompat<View> sparseArrayCompat = this.j;
        sparseArrayCompat.put(sparseArrayCompat.size() + 400002, view);
        d dVar = this.k;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
        requestLayout();
    }

    public void addHeaderView(View view) {
        if (view == null) {
            throw new RuntimeException("header is null");
        }
        SparseArrayCompat<View> sparseArrayCompat = this.i;
        sparseArrayCompat.put(sparseArrayCompat.size() + 300002, view);
        d dVar = this.k;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.Adapter getAdapter() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getOriginalAdapter();
        }
        return null;
    }

    public View getEmptyView() {
        return this.s;
    }

    public int getFootersCount() {
        return this.j.size();
    }

    public int getHeadersCount() {
        return this.i.size();
    }

    public int getItemCount() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getPagerCount();
        }
        return 0;
    }

    public IRefreshHeader getRefreshHeader() {
        return this.n;
    }

    public boolean isHeaderFooter(int i) {
        return this.k.isHeader(i) || this.k.isFooter(i) || this.k.isLoadMoreFooter(i) || this.k.isRefreshHeader(i);
    }

    public boolean isLoadingMore() {
        return this.e;
    }

    public boolean isLoadingMoreEnabled() {
        return this.q;
    }

    public boolean isPullRefreshEnabled() {
        return this.p;
    }

    public boolean isRefresh() {
        return isRefreshing() || isLoadingMore();
    }

    public boolean isRefreshing() {
        return this.n.isRefreshHreader();
    }

    public void loadMoreComplete() {
        this.e = false;
        this.o.setState(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AppBarLayout appBarLayout;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof CoordinatorLayout)) {
            parent = parent.getParent();
        }
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    appBarLayout = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(childCount);
                if (childAt instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) childAt;
                    break;
                }
                childCount--;
            }
            if (appBarLayout != null) {
                appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new b());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        int iFindLastVisibleItemPosition;
        super.onScrollStateChanged(i);
        if (i != 0 || this.m == null || this.e || !this.q) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            iFindLastVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            iFindLastVisibleItemPosition = o(iArr);
        } else {
            iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager.getChildCount() <= 0 || iFindLastVisibleItemPosition < layoutManager.getItemCount() - 1 || this.f || !this.r || this.n.getState() >= 2) {
            return;
        }
        this.e = true;
        IMoreFooter iMoreFooter = this.o;
        if (iMoreFooter instanceof IMoreFooter) {
            iMoreFooter.setState(0);
        } else {
            iMoreFooter.getFooterView().setVisibility(0);
        }
        this.m.onLoadMore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        XRecyclerView.LoadingListener loadingListener;
        if (this.l == -1.0f) {
            this.l = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.l = motionEvent.getRawY();
            this.b = motionEvent.getY();
        } else if (action != 2) {
            this.l = -1.0f;
            this.c = motionEvent.getY();
            boolean zT = t();
            if (zT && this.c - this.b > 50.0f && !this.p) {
                return super.onTouchEvent(motionEvent);
            }
            if (zT && this.p && this.r && this.t == AppBarStateChangeListener.State.EXPANDED && this.n.releaseAction() && (loadingListener = this.m) != null) {
                loadingListener.onRefresh();
            }
        } else {
            float rawY = motionEvent.getRawY() - this.l;
            this.l = motionEvent.getRawY();
            if (t() && this.p && this.r && this.t == AppBarStateChangeListener.State.EXPANDED) {
                this.n.onMove(rawY / 3.0f);
                if (this.n.getVisibleHeight() > 0 && this.n.getState() < 2) {
                    return super.onTouchEvent(motionEvent);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void refresh() {
        if (!this.p || this.m == null) {
            return;
        }
        this.n.setState(2);
        this.m.onRefresh();
    }

    public void refreshComplete() {
        this.n.refreshComplete();
        setNoMore(false);
    }

    public void removeFooterView(View view) {
        int iIndexOfValue = this.j.indexOfValue(view);
        if (iIndexOfValue == -1) {
            return;
        }
        this.j.removeAt(iIndexOfValue);
        d dVar = this.k;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
        requestLayout();
    }

    public void removeHeaderView(View view) {
        int iIndexOfValue;
        if (this.i.size() >= 1 && (iIndexOfValue = this.i.indexOfValue(view)) != -1) {
            this.i.removeAt(iIndexOfValue);
            d dVar = this.k;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
            requestLayout();
        }
    }

    public void reset() {
        setNoMore(false);
        loadMoreComplete();
        refreshComplete();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.u;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.a);
        }
        this.u = adapter;
        d dVar = new d(adapter);
        this.k = dVar;
        super.setAdapter(dVar);
        adapter.registerAdapterDataObserver(this.a);
        this.a.onChanged();
    }

    public void setArrowImageView(int i) {
        IRefreshHeader iRefreshHeader = this.n;
        if (iRefreshHeader != null) {
            iRefreshHeader.setArrowImageView(i);
        }
    }

    public void setEmptyView(View view) {
        this.s = view;
        this.a.onChanged();
    }

    public void setEnabledScroll(boolean z) {
        this.r = z;
    }

    public void setFootViewText(String str, String str2) {
        this.o.setLoadingHint(str);
        this.o.setNoMoreHint(str2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        if (this.k == null || !(layoutManager instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
    }

    public void setListener(XRecyclerView.Sections sections) {
        this.d = sections;
    }

    public void setLoadingListener(XRecyclerView.LoadingListener loadingListener) {
        this.m = loadingListener;
    }

    public void setLoadingMoreEnabled(boolean z) {
        this.q = z;
        if (z) {
            return;
        }
        this.o.setState(1);
    }

    public void setLoadingMoreFooter(IMoreFooter iMoreFooter) {
        this.o = iMoreFooter;
        iMoreFooter.getFooterView().setVisibility(8);
    }

    public void setLoadingMoreProgressStyle(int i) {
        this.h = i;
        this.o.setProgressStyle(i);
    }

    public void setNoMore(boolean z) {
        this.e = false;
        this.f = z;
        this.o.setState(z ? 2 : 1);
    }

    public void setPullRefreshEnabled(boolean z) {
        this.p = z;
    }

    public void setRefreshHeader(IRefreshHeader iRefreshHeader) {
        this.n = iRefreshHeader;
    }

    public void setRefreshProgressStyle(int i) {
        this.g = i;
        IRefreshHeader iRefreshHeader = this.n;
        if (iRefreshHeader != null) {
            iRefreshHeader.setProgressStyle(i);
        }
    }

    public void setRefreshing(boolean z) {
        if (z && this.p && this.m != null) {
            this.n.setState(2);
            IRefreshHeader iRefreshHeader = this.n;
            iRefreshHeader.onMove(iRefreshHeader.getHeaderView().getMeasuredHeight());
            this.m.onRefresh();
        }
    }

    public FixedXRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedXRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new c();
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = -1;
        this.i = new SparseArrayCompat<>();
        this.j = new SparseArrayCompat<>();
        this.l = -1.0f;
        this.p = true;
        this.q = true;
        this.r = true;
        this.t = AppBarStateChangeListener.State.EXPANDED;
        init();
    }

    public class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private RecyclerView.Adapter a;

        public class a extends GridLayoutManager.SpanSizeLookup {
            public final /* synthetic */ GridLayoutManager a;

            public a(GridLayoutManager gridLayoutManager) {
                this.a = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                boolean z = FixedXRecyclerView.this.d != null && FixedXRecyclerView.this.d.isSections(i, FixedXRecyclerView.this.isHeaderFooter(i));
                if (FixedXRecyclerView.this.isHeaderFooter(i) || z) {
                    return this.a.getSpanCount();
                }
                return 1;
            }
        }

        public class b extends BH {
            public b(View view) {
                super(view);
            }
        }

        public d(RecyclerView.Adapter adapter) {
            this.a = adapter;
        }

        public int getContentsCount() {
            return this.a.getPagerCount();
        }

        public int getFootersCount() {
            return FixedXRecyclerView.this.j.size();
        }

        public int getHeadersCount() {
            return FixedXRecyclerView.this.i.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getPagerCount() {
            int headersCount;
            int footersCount;
            int i = FixedXRecyclerView.this.q ? 2 : 1;
            if (this.a != null) {
                headersCount = getHeadersCount() + this.a.getPagerCount() + i;
                footersCount = getFootersCount();
            } else {
                headersCount = getHeadersCount() + i;
                footersCount = getFootersCount();
            }
            return headersCount + footersCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            int headersCount;
            if (this.a == null || i < getHeadersCount() + 1 || (headersCount = i - (getHeadersCount() + 1)) >= this.a.getPagerCount()) {
                return -1L;
            }
            return this.a.getItemId(headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int headersCount = i - (getHeadersCount() + 1);
            if (isRefreshHeader(i)) {
                return 300000;
            }
            if (isHeader(i)) {
                return FixedXRecyclerView.this.i.keyAt(i - 1);
            }
            if (isFooter(i)) {
                return FixedXRecyclerView.this.j.keyAt(((i - getHeadersCount()) - getContentsCount()) - 1);
            }
            if (isLoadMoreFooter(i)) {
                return 300001;
            }
            RecyclerView.Adapter adapter = this.a;
            if (adapter == null || headersCount >= adapter.getPagerCount()) {
                return 0;
            }
            int itemViewType = this.a.getItemViewType(headersCount);
            if (FixedXRecyclerView.this.u(itemViewType)) {
                throw new IllegalStateException("XRecyclerView require itemViewType in adapter should be less than 10000 ");
            }
            return itemViewType;
        }

        public RecyclerView.Adapter getOriginalAdapter() {
            return this.a;
        }

        public boolean isFooter(int i) {
            int i2 = FixedXRecyclerView.this.q ? 2 : 1;
            return i <= getPagerCount() - i2 && i > (getPagerCount() - i2) - getFootersCount();
        }

        public boolean isHeader(int i) {
            return i >= 1 && i < FixedXRecyclerView.this.i.size() + 1;
        }

        public boolean isLoadMoreFooter(int i) {
            return FixedXRecyclerView.this.q && i == getPagerCount() - 1;
        }

        public boolean isRefreshHeader(int i) {
            return i == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
            }
            this.a.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (isHeader(i) || isRefreshHeader(i)) {
                return;
            }
            int headersCount = i - (getHeadersCount() + 1);
            RecyclerView.Adapter adapter = this.a;
            if (adapter == null || headersCount >= adapter.getPagerCount()) {
                return;
            }
            this.a.onBindViewHolder(viewHolder, headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 300000) {
                return new b(FixedXRecyclerView.this.n.getHeaderView());
            }
            if (FixedXRecyclerView.this.s(i)) {
                return new b(FixedXRecyclerView.this.q(i));
            }
            if (FixedXRecyclerView.this.r(i)) {
                return new b(FixedXRecyclerView.this.p(i));
            }
            return i == 300001 ? new b(FixedXRecyclerView.this.o.getFooterView()) : this.a.onCreateViewHolder(viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            this.a.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
            return this.a.onFailedToRecycleView(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && (isHeader(viewHolder.getLayoutPosition()) || isRefreshHeader(viewHolder.getLayoutPosition()) || isLoadMoreFooter(viewHolder.getLayoutPosition()))) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            this.a.onViewAttachedToWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            this.a.onViewDetachedFromWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            this.a.onViewRecycled(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.a.registerAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.a.unregisterAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
            if (isHeader(i) || isRefreshHeader(i)) {
                return;
            }
            int headersCount = i - (getHeadersCount() + 1);
            RecyclerView.Adapter adapter = this.a;
            if (adapter == null || headersCount >= adapter.getPagerCount()) {
                return;
            }
            if (list.isEmpty()) {
                this.a.onBindViewHolder(viewHolder, headersCount);
            } else {
                this.a.onBindViewHolder(viewHolder, headersCount, list);
            }
        }
    }
}
