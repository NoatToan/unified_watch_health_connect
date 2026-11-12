package com.zhouyou.recyclerview;

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
import com.zhouyou.recyclerview.adapter.BH;
import com.zhouyou.recyclerview.listener.AppBarStateChangeListener;
import com.zhouyou.recyclerview.refresh.ArrowRefreshHeader;
import com.zhouyou.recyclerview.refresh.IMoreFooter;
import com.zhouyou.recyclerview.refresh.IRefreshHeader;
import com.zhouyou.recyclerview.refresh.LoadingMoreFooter;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class XRecyclerView extends RecyclerView {
    public static final int FOOTER_INIT_INDEX = 400002;
    public static final int HEADER_INIT_INDEX = 300002;
    public static final int TYPE_LOADMORE_FOOTER = 300001;
    public static final int TYPE_REFRESH_HEADER = 300000;
    private static final float v = 3.0f;
    private Sections a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private SparseArrayCompat<View> f;
    private SparseArrayCompat<View> g;
    private WrapAdapter h;
    private float i;
    private LoadingListener j;
    private IRefreshHeader k;
    private IMoreFooter l;
    private boolean m;
    private boolean n;
    private boolean o;
    private View p;
    private final RecyclerView.AdapterDataObserver q;
    private AppBarStateChangeListener.State r;
    private RecyclerView.Adapter s;
    public float t;
    public float u;

    public interface LoadingListener {
        void onLoadMore();

        void onRefresh();
    }

    public interface Sections {
        boolean isSections(int i, boolean z);
    }

    public class a extends GridLayoutManager.SpanSizeLookup {
        public final /* synthetic */ GridLayoutManager a;

        public a(GridLayoutManager gridLayoutManager) {
            this.a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            if (XRecyclerView.this.isHeaderFooter(i)) {
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
            XRecyclerView.this.r = state;
        }
    }

    public class c extends RecyclerView.AdapterDataObserver {
        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (XRecyclerView.this.h != null) {
                XRecyclerView.this.h.notifyDataSetChanged();
            }
            if (XRecyclerView.this.h == null || XRecyclerView.this.p == null) {
                return;
            }
            int headersCount = XRecyclerView.this.h.getHeadersCount() + 1;
            if (XRecyclerView.this.n) {
                headersCount++;
            }
            if (XRecyclerView.this.h.getA() == headersCount) {
                XRecyclerView.this.p.setVisibility(0);
                XRecyclerView.this.setVisibility(8);
            } else {
                XRecyclerView.this.p.setVisibility(8);
                XRecyclerView.this.setVisibility(0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            XRecyclerView.this.h.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            XRecyclerView.this.h.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            XRecyclerView.this.h.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            XRecyclerView.this.h.notifyItemRangeRemoved(i, i2);
        }

        public /* synthetic */ c(XRecyclerView xRecyclerView, a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            XRecyclerView.this.h.notifyItemRangeChanged(i, i2, obj);
        }
    }

    public XRecyclerView(Context context) {
        this(context, null);
    }

    private void init() {
        if (this.m) {
            ArrowRefreshHeader arrowRefreshHeader = new ArrowRefreshHeader(getContext());
            this.k = arrowRefreshHeader;
            arrowRefreshHeader.setProgressStyle(this.d);
        }
        LoadingMoreFooter loadingMoreFooter = new LoadingMoreFooter(getContext());
        loadingMoreFooter.setProgressStyle(this.e);
        this.l = loadingMoreFooter;
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
            return this.g.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View q(int i) {
        if (s(i)) {
            return this.f.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(int i) {
        return this.g.size() > 0 && this.g.get(i) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(int i) {
        return this.f.size() > 0 && this.f.get(i) != null;
    }

    private boolean t() {
        return this.k.getHeaderView().getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(int i) {
        return i == 300000 || i == 300001 || this.f.get(i) != null || this.g.get(i) != null;
    }

    public void addFooterView(View view) {
        if (view == null) {
            throw new RuntimeException("footer is null");
        }
        SparseArrayCompat<View> sparseArrayCompat = this.g;
        sparseArrayCompat.put(sparseArrayCompat.size() + 400002, view);
        WrapAdapter wrapAdapter = this.h;
        if (wrapAdapter != null) {
            wrapAdapter.notifyDataSetChanged();
        }
        requestLayout();
    }

    public void addHeaderView(View view) {
        if (view == null) {
            throw new RuntimeException("header is null");
        }
        SparseArrayCompat<View> sparseArrayCompat = this.f;
        sparseArrayCompat.put(sparseArrayCompat.size() + 300002, view);
        WrapAdapter wrapAdapter = this.h;
        if (wrapAdapter != null) {
            wrapAdapter.notifyDataSetChanged();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.Adapter getAdapter() {
        WrapAdapter wrapAdapter = this.h;
        if (wrapAdapter != null) {
            return wrapAdapter.getOriginalAdapter();
        }
        return null;
    }

    public View getEmptyView() {
        return this.p;
    }

    public int getFootersCount() {
        return this.g.size();
    }

    public int getHeadersCount() {
        return this.f.size();
    }

    public int getItemCount() {
        WrapAdapter wrapAdapter = this.h;
        if (wrapAdapter != null) {
            return wrapAdapter.getA();
        }
        return 0;
    }

    public IRefreshHeader getRefreshHeader() {
        return this.k;
    }

    public boolean isHeaderFooter(int i) {
        return this.h.isHeader(i) || this.h.isFooter(i) || this.h.isLoadMoreFooter(i) || this.h.isRefreshHeader(i);
    }

    public boolean isLoadingMore() {
        return this.b;
    }

    public boolean isLoadingMoreEnabled() {
        return this.n;
    }

    public boolean isPullRefreshEnabled() {
        return this.m;
    }

    public boolean isRefresh() {
        return isRefreshing() || isLoadingMore();
    }

    public boolean isRefreshing() {
        return this.k.isRefreshHreader();
    }

    public void loadMoreComplete() {
        this.b = false;
        this.l.setState(1);
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
        if (i != 0 || this.j == null || this.b || !this.n) {
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
        if (layoutManager.getChildCount() <= 0 || iFindLastVisibleItemPosition < layoutManager.getItemCount() - 1 || this.c || !this.o || this.k.getState() >= 2) {
            return;
        }
        this.b = true;
        IMoreFooter iMoreFooter = this.l;
        if (iMoreFooter instanceof IMoreFooter) {
            iMoreFooter.setState(0);
        } else {
            iMoreFooter.getFooterView().setVisibility(0);
        }
        this.j.onLoadMore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        LoadingListener loadingListener;
        if (this.i == -1.0f) {
            this.i = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i = motionEvent.getRawY();
            this.t = motionEvent.getY();
        } else if (action != 2) {
            this.i = -1.0f;
            this.u = motionEvent.getY();
            boolean zT = t();
            if (zT && this.u - this.t > 50.0f && !this.m) {
                return false;
            }
            if (zT && this.m && this.o && this.r == AppBarStateChangeListener.State.EXPANDED && this.k.releaseAction() && (loadingListener = this.j) != null) {
                loadingListener.onRefresh();
            }
        } else {
            float rawY = motionEvent.getRawY() - this.i;
            this.i = motionEvent.getRawY();
            if (t() && this.m && this.o && this.r == AppBarStateChangeListener.State.EXPANDED) {
                this.k.onMove(rawY / 3.0f);
                if (this.k.getVisibleHeight() > 0 && this.k.getState() < 2) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void refresh() {
        if (!this.m || this.j == null) {
            return;
        }
        this.k.setState(2);
        this.j.onRefresh();
    }

    public void refreshComplete() {
        this.k.refreshComplete();
        setNoMore(false);
    }

    public void removeFooterView(View view) {
        int iIndexOfValue = this.g.indexOfValue(view);
        if (iIndexOfValue == -1) {
            return;
        }
        this.g.removeAt(iIndexOfValue);
        WrapAdapter wrapAdapter = this.h;
        if (wrapAdapter != null) {
            wrapAdapter.notifyDataSetChanged();
        }
        requestLayout();
    }

    public void removeHeaderView(View view) {
        int iIndexOfValue;
        if (this.f.size() >= 1 && (iIndexOfValue = this.f.indexOfValue(view)) != -1) {
            this.f.removeAt(iIndexOfValue);
            WrapAdapter wrapAdapter = this.h;
            if (wrapAdapter != null) {
                wrapAdapter.notifyDataSetChanged();
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
        RecyclerView.Adapter adapter2 = this.s;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.q);
        }
        this.s = adapter;
        WrapAdapter wrapAdapter = new WrapAdapter(adapter);
        this.h = wrapAdapter;
        super.setAdapter(wrapAdapter);
        adapter.registerAdapterDataObserver(this.q);
        this.q.onChanged();
    }

    public void setArrowImageView(int i) {
        IRefreshHeader iRefreshHeader = this.k;
        if (iRefreshHeader != null) {
            iRefreshHeader.setArrowImageView(i);
        }
    }

    public void setEmptyView(View view) {
        this.p = view;
        this.q.onChanged();
    }

    public void setEnabledScroll(boolean z) {
        this.o = z;
    }

    public void setFootViewText(String str, String str2) {
        this.l.setLoadingHint(str);
        this.l.setNoMoreHint(str2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        if (this.h == null || !(layoutManager instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
    }

    public void setListener(Sections sections) {
        this.a = sections;
    }

    public void setLoadingListener(LoadingListener loadingListener) {
        this.j = loadingListener;
    }

    public void setLoadingMoreEnabled(boolean z) {
        this.n = z;
        if (z) {
            return;
        }
        this.l.setState(1);
    }

    public void setLoadingMoreFooter(IMoreFooter iMoreFooter) {
        this.l = iMoreFooter;
        iMoreFooter.getFooterView().setVisibility(8);
    }

    public void setLoadingMoreProgressStyle(int i) {
        this.e = i;
        this.l.setProgressStyle(i);
    }

    public void setNoMore(boolean z) {
        this.b = false;
        this.c = z;
        this.l.setState(z ? 2 : 1);
    }

    public void setPullRefreshEnabled(boolean z) {
        this.m = z;
    }

    public void setRefreshHeader(IRefreshHeader iRefreshHeader) {
        this.k = iRefreshHeader;
    }

    public void setRefreshProgressStyle(int i) {
        this.d = i;
        IRefreshHeader iRefreshHeader = this.k;
        if (iRefreshHeader != null) {
            iRefreshHeader.setProgressStyle(i);
        }
    }

    public void setRefreshing(boolean z) {
        if (z && this.m && this.j != null) {
            this.k.setState(2);
            IRefreshHeader iRefreshHeader = this.k;
            iRefreshHeader.onMove(iRefreshHeader.getHeaderView().getMeasuredHeight());
            this.j.onRefresh();
        }
    }

    public XRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public XRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.c = false;
        this.d = -1;
        this.e = -1;
        this.f = new SparseArrayCompat<>();
        this.g = new SparseArrayCompat<>();
        this.i = -1.0f;
        this.m = true;
        this.n = true;
        this.o = true;
        this.q = new c(this, null);
        this.r = AppBarStateChangeListener.State.EXPANDED;
        init();
    }

    public class WrapAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private RecyclerView.Adapter a;

        public class a extends GridLayoutManager.SpanSizeLookup {
            public final /* synthetic */ GridLayoutManager a;

            public a(GridLayoutManager gridLayoutManager) {
                this.a = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                boolean z = XRecyclerView.this.a != null && XRecyclerView.this.a.isSections(i, XRecyclerView.this.isHeaderFooter(i));
                if (XRecyclerView.this.isHeaderFooter(i) || z) {
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

        public WrapAdapter(RecyclerView.Adapter adapter) {
            this.a = adapter;
        }

        public int getContentsCount() {
            return this.a.getA();
        }

        public int getFootersCount() {
            return XRecyclerView.this.g.size();
        }

        public int getHeadersCount() {
            return XRecyclerView.this.f.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            int headersCount;
            int footersCount;
            int i = XRecyclerView.this.n ? 2 : 1;
            if (this.a != null) {
                headersCount = getHeadersCount() + this.a.getA() + i;
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
            if (this.a == null || i < getHeadersCount() + 1 || (headersCount = i - (getHeadersCount() + 1)) >= this.a.getA()) {
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
                return XRecyclerView.this.f.keyAt(i - 1);
            }
            if (isFooter(i)) {
                return XRecyclerView.this.g.keyAt(((i - getHeadersCount()) - getContentsCount()) - 1);
            }
            if (isLoadMoreFooter(i)) {
                return 300001;
            }
            RecyclerView.Adapter adapter = this.a;
            if (adapter == null || headersCount >= adapter.getA()) {
                return 0;
            }
            int itemViewType = this.a.getItemViewType(headersCount);
            if (XRecyclerView.this.u(itemViewType)) {
                throw new IllegalStateException("XRecyclerView require itemViewType in adapter should be less than 10000 ");
            }
            return itemViewType;
        }

        public RecyclerView.Adapter getOriginalAdapter() {
            return this.a;
        }

        public boolean isFooter(int i) {
            int i2 = XRecyclerView.this.n ? 2 : 1;
            return i <= getA() - i2 && i > (getA() - i2) - getFootersCount();
        }

        public boolean isHeader(int i) {
            return i >= 1 && i < XRecyclerView.this.f.size() + 1;
        }

        public boolean isLoadMoreFooter(int i) {
            return XRecyclerView.this.n && i == getA() - 1;
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
            if (adapter == null || headersCount >= adapter.getA()) {
                return;
            }
            this.a.onBindViewHolder(viewHolder, headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 300000) {
                return new b(XRecyclerView.this.k.getHeaderView());
            }
            if (XRecyclerView.this.s(i)) {
                return new b(XRecyclerView.this.q(i));
            }
            if (XRecyclerView.this.r(i)) {
                return new b(XRecyclerView.this.p(i));
            }
            return i == 300001 ? new b(XRecyclerView.this.l.getFooterView()) : this.a.onCreateViewHolder(viewGroup, i);
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
            if (adapter == null || headersCount >= adapter.getA()) {
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
