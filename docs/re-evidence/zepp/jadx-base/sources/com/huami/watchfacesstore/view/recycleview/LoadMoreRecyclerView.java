package com.huami.watchfacesstore.view.recycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes17.dex */
public class LoadMoreRecyclerView extends RecyclerView {
    private static final int p = 1073741823;
    private static final int q = 536870911;
    private static final int r = Integer.MAX_VALUE;
    private boolean a;
    private boolean b;
    private boolean c;
    private SparseArray<View> d;
    private SparseArray<View> e;
    private LoadingListener f;
    private View g;
    private View h;
    private d i;
    private final RecyclerView.AdapterDataObserver j;
    private int k;
    private boolean l;
    private OnItemClickListener m;
    private OnItemLongClickListener n;
    private c o;

    public interface LoadingListener {
        void onLoadMore();

        void onScroll(int dx, int dy);

        void onScrollDown();

        void onScrollUp();
    }

    public interface OnItemClickListener {
        void onItemClick(RecyclerView parent, View view, int position);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(RecyclerView parent, View view, int position);
    }

    public class a extends GridLayoutManager.SpanSizeLookup {
        public final /* synthetic */ GridLayoutManager a;

        public a(final GridLayoutManager val$gridManager) {
            this.a = val$gridManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            if (LoadMoreRecyclerView.this.i.isHeader(position) || LoadMoreRecyclerView.this.i.isFooter(position) || LoadMoreRecyclerView.this.i.g(position)) {
                return this.a.getSpanCount();
            }
            return 1;
        }
    }

    public class b extends RecyclerView.AdapterDataObserver {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        @SuppressLint({"NotifyDataSetChanged"})
        public void onChanged() {
            RecyclerView.Adapter adapter = LoadMoreRecyclerView.this.getAdapter();
            if (adapter != null && LoadMoreRecyclerView.this.g != null) {
                if (adapter.getItemCount() == LoadMoreRecyclerView.this.a) {
                    LoadMoreRecyclerView.this.g.setVisibility(0);
                    LoadMoreRecyclerView.this.setVisibility(8);
                } else {
                    LoadMoreRecyclerView.this.g.setVisibility(8);
                    LoadMoreRecyclerView.this.setVisibility(0);
                }
            }
            if (LoadMoreRecyclerView.this.i != null) {
                LoadMoreRecyclerView.this.i.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount) {
            LoadMoreRecyclerView.this.i.notifyItemRangeChanged(positionStart + LoadMoreRecyclerView.this.getHeaderViewsCount(), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int positionStart, int itemCount) {
            LoadMoreRecyclerView.this.i.notifyItemRangeInserted(positionStart + LoadMoreRecyclerView.this.getHeaderViewsCount(), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            LoadMoreRecyclerView.this.i.notifyItemMoved(fromPosition + LoadMoreRecyclerView.this.getHeaderViewsCount() + LoadMoreRecyclerView.this.getFooterViewsCount(), toPosition);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            LoadMoreRecyclerView.this.i.notifyItemRangeRemoved(positionStart + LoadMoreRecyclerView.this.getHeaderViewsCount() + LoadMoreRecyclerView.this.getFooterViewsCount(), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            LoadMoreRecyclerView.this.i.notifyItemRangeChanged(positionStart + LoadMoreRecyclerView.this.getHeaderViewsCount(), itemCount, payload);
        }
    }

    public class c extends RecyclerView.SimpleOnItemTouchListener {
        private GestureDetector a;

        public class a extends GestureDetector.SimpleOnGestureListener {
            public a() {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent e) {
                View viewFindChildViewUnder = LoadMoreRecyclerView.this.findChildViewUnder(e.getX(), e.getY());
                if (viewFindChildViewUnder == null || LoadMoreRecyclerView.this.n == null || LoadMoreRecyclerView.this.d.indexOfValue(viewFindChildViewUnder) == -1) {
                    return;
                }
                OnItemLongClickListener onItemLongClickListener = LoadMoreRecyclerView.this.n;
                LoadMoreRecyclerView loadMoreRecyclerView = LoadMoreRecyclerView.this;
                onItemLongClickListener.onItemLongClick(loadMoreRecyclerView, viewFindChildViewUnder, loadMoreRecyclerView.getChildLayoutPosition(viewFindChildViewUnder) - LoadMoreRecyclerView.this.d.size());
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                View viewFindChildViewUnder = LoadMoreRecyclerView.this.findChildViewUnder(e.getX(), e.getY());
                if (viewFindChildViewUnder == null || LoadMoreRecyclerView.this.m == null || LoadMoreRecyclerView.this.d.indexOfValue(viewFindChildViewUnder) == -1) {
                    return false;
                }
                OnItemClickListener onItemClickListener = LoadMoreRecyclerView.this.m;
                LoadMoreRecyclerView loadMoreRecyclerView = LoadMoreRecyclerView.this;
                onItemClickListener.onItemClick(loadMoreRecyclerView, viewFindChildViewUnder, loadMoreRecyclerView.getChildLayoutPosition(viewFindChildViewUnder) - LoadMoreRecyclerView.this.d.size());
                return true;
            }
        }

        private c() {
            this.a = new GestureDetector(LoadMoreRecyclerView.this.getContext(), new a());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            return this.a.onTouchEvent(e);
        }
    }

    public class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private RecyclerView.Adapter a;

        public class a extends RecyclerView.ViewHolder {
            public a(View itemView) {
                super(itemView);
            }
        }

        private d(RecyclerView.Adapter adapter) {
            this.a = adapter;
        }

        private int e() {
            return LoadMoreRecyclerView.this.h != null ? 1 : 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int f() {
            RecyclerView.Adapter adapter = this.a;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g(int position) {
            return LoadMoreRecyclerView.this.h != null && position == getItemCount() - 1;
        }

        private int getFootersCount() {
            return LoadMoreRecyclerView.this.e.size();
        }

        private int getHeadersCount() {
            return LoadMoreRecyclerView.this.d.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isFooter(int position) {
            return position < getItemCount() - e() && position >= f() + getHeadersCount();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isHeader(int position) {
            return position >= 0 && position < getHeadersCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return getHeadersCount() + getFootersCount() + f() + e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int position) {
            int headersCount;
            if (this.a == null || position < getHeadersCount() || (headersCount = position - getHeadersCount()) >= f()) {
                return -1L;
            }
            return this.a.getItemId(headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            if (isHeader(position)) {
                return LoadMoreRecyclerView.this.d.keyAt(position);
            }
            int headersCount = position - getHeadersCount();
            if (this.a != null && headersCount < f()) {
                return this.a.getItemViewType(headersCount);
            }
            if (isFooter(position)) {
                return LoadMoreRecyclerView.this.e.keyAt((position - getHeadersCount()) - f());
            }
            return g(position) ? Integer.MAX_VALUE : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
            this.a.onAttachedToRecyclerView(recyclerView);
            LoadMoreRecyclerView.this.setSpanSizeLookup(recyclerView.getLayoutManager());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            if (isHeader(position) || isFooter(position) || g(position)) {
                return;
            }
            int headersCount = position - getHeadersCount();
            if (this.a == null || headersCount >= f()) {
                return;
            }
            this.a.onBindViewHolder(holder, headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = (View) LoadMoreRecyclerView.this.d.get(viewType);
            View view2 = (View) LoadMoreRecyclerView.this.e.get(viewType);
            if (view != null) {
                return new a(view);
            }
            if (view2 != null) {
                return new a(view2);
            }
            if (viewType != Integer.MAX_VALUE) {
                return this.a.onCreateViewHolder(parent, viewType);
            }
            LoadMoreRecyclerView loadMoreRecyclerView = LoadMoreRecyclerView.this;
            loadMoreRecyclerView.setLayoutParams(loadMoreRecyclerView.h);
            return new a(LoadMoreRecyclerView.this.h);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
            this.a.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder holder) {
            return this.a.onFailedToRecycleView(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder) {
            ViewGroup.LayoutParams layoutParams;
            if (holder instanceof ViewHolder) {
                this.a.onViewAttachedToWindow(holder);
            }
            int layoutPosition = holder.getLayoutPosition();
            if ((isHeader(layoutPosition) || isFooter(layoutPosition) || g(layoutPosition)) && (layoutParams = holder.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder holder) {
            this.a.onViewDetachedFromWindow(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(@NonNull RecyclerView.ViewHolder holder) {
            this.a.onViewRecycled(holder);
        }
    }

    public LoadMoreRecyclerView(Context context) {
        this(context, null);
    }

    private int k(int[] lastPositions) {
        int i = lastPositions[0];
        for (int i2 : lastPositions) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    private int l(int[] firstPositions) {
        int i = firstPositions[0];
        for (int i2 : firstPositions) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    private boolean m() {
        int iFindLastVisibleItemPosition;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int itemCount = layoutManager.getItemCount();
        if (layoutManager instanceof GridLayoutManager) {
            iFindLastVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            iFindLastVisibleItemPosition = k(iArr);
        } else {
            iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        return childCount > 0 && iFindLastVisibleItemPosition >= itemCount + (-1) && itemCount >= childCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutParams(View view) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null) {
            if (layoutManager.canScrollVertically()) {
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                view.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpanSizeLookup(RecyclerView.LayoutManager manager) {
        if (manager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) manager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        }
    }

    public void addFooterView(@LayoutRes int layoutResId) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(layoutResId, (ViewGroup) this, false);
        viewInflate.setTag(Integer.valueOf(layoutResId));
        addFooterView(viewInflate);
    }

    public void addHeaderView(@LayoutRes int layoutResId) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(layoutResId, (ViewGroup) this, false);
        viewInflate.setTag(Integer.valueOf(layoutResId));
        addHeaderView(viewInflate);
    }

    public void addLoaderView(@Nullable View view) {
        if (this.h == null) {
            if (view == null) {
                view = new com.huami.watchfacesstore.view.recycleview.d(getContext());
            }
            this.h = view;
            d dVar = this.i;
            if (dVar != null) {
                dVar.notifyItemInserted(dVar.getItemCount() - 1);
            }
        }
    }

    public View getEmptyView() {
        return this.g;
    }

    public int getFooterViewsCount() {
        return this.e.size();
    }

    public int getHeaderViewsCount() {
        return this.d.size();
    }

    public int getLoaderViewCount() {
        return this.h != null ? 1 : 0;
    }

    public boolean hasFooterView(@Nullable View view) {
        return this.e.indexOfValue(view) != -1;
    }

    public boolean hasHeaderView(@Nullable View view) {
        return this.d.indexOfValue(view) != -1;
    }

    public boolean isNoMore() {
        return this.c;
    }

    public void loadMoreComplete() {
        this.b = false;
        View view = this.h;
        if (view == null) {
            return;
        }
        if (view instanceof com.huami.watchfacesstore.view.recycleview.d) {
            ((com.huami.watchfacesstore.view.recycleview.d) view).b(1);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnItemTouchListener(this.o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnItemTouchListener(this.o);
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int state) {
        if (state != 0 || this.f == null || this.b || !this.a || !m() || this.c) {
            return;
        }
        View view = this.h;
        this.b = true;
        if (view instanceof com.huami.watchfacesstore.view.recycleview.d) {
            ((com.huami.watchfacesstore.view.recycleview.d) view).b(0);
        }
        this.f.onLoadMore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int dx, int dy) {
        if (getChildCount() > 0) {
            this.k += dy;
            LoadingListener loadingListener = this.f;
            if (loadingListener != null) {
                loadingListener.onScroll(dx, dy);
                if (dy < (-ViewConfiguration.get(getContext()).getScaledTouchSlop())) {
                    if (!this.l) {
                        this.f.onScrollUp();
                        this.l = true;
                    }
                } else if (dy > ViewConfiguration.get(getContext()).getScaledTouchSlop() && this.l) {
                    this.f.onScrollDown();
                    this.l = false;
                }
                RecyclerView.LayoutManager layoutManager = getLayoutManager();
                layoutManager.getChildCount();
                layoutManager.getItemCount();
                if (layoutManager instanceof GridLayoutManager) {
                    ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
                    return;
                }
                if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                    ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                    return;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
                k(iArr);
            }
        }
    }

    public boolean removeFooterView(@LayoutRes int layoutResId) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = this.e.valueAt(i);
            if (((Integer) viewValueAt.getTag()).intValue() == layoutResId) {
                return removeFooterView(viewValueAt);
            }
        }
        return false;
    }

    public boolean removeFooterViews() {
        int size = this.e.size();
        if (size <= 0 || this.i == null) {
            return false;
        }
        this.e.clear();
        this.i.notifyItemRangeRemoved(getHeaderViewsCount() + this.i.f(), size);
        return true;
    }

    public boolean removeHeaderView(@LayoutRes int layoutResId) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = this.d.valueAt(i);
            if (((Integer) viewValueAt.getTag()).intValue() == layoutResId) {
                return removeHeaderView(viewValueAt);
            }
        }
        return false;
    }

    public boolean removeHeaderViews() {
        int size = this.d.size();
        if (size <= 0 || this.i == null) {
            return false;
        }
        this.d.clear();
        this.i.notifyItemRangeRemoved(0, size);
        return true;
    }

    public boolean removeLoaderView() {
        d dVar = this.i;
        if (dVar == null || this.h == null) {
            return false;
        }
        this.h = null;
        dVar.notifyItemRemoved(dVar.getItemCount());
        getItemAnimator().setRemoveDuration(0L);
        return true;
    }

    public void reset() {
        setNoMore(false);
        loadMoreComplete();
    }

    public int scrollY() {
        return this.k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        d dVar = new d(adapter);
        this.i = dVar;
        super.setAdapter(dVar);
        if (!adapter.hasObservers()) {
            adapter.registerAdapterDataObserver(this.j);
        }
        this.j.onChanged();
    }

    public void setEmptyView(View emptyView) {
        this.g = emptyView;
        this.j.onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layout) {
        setSpanSizeLookup(layout);
        super.setLayoutManager(layout);
    }

    public void setLoadEnabled(boolean enabled) {
        this.a = enabled;
        if (enabled) {
            addLoaderView(this.h);
        } else {
            removeLoaderView();
        }
    }

    public void setLoadingListener(LoadingListener listener) {
        this.f = listener;
        setLoadEnabled(true);
    }

    public void setNoMore(boolean noMore) {
        this.b = false;
        this.c = noMore;
        View view = this.h;
        if (view instanceof com.huami.watchfacesstore.view.recycleview.d) {
            ((com.huami.watchfacesstore.view.recycleview.d) view).b(noMore ? 2 : 1);
        } else if (view != null) {
            view.setVisibility(8);
        }
    }

    public void setOnItemClickListener(@Nullable OnItemClickListener listener) {
        this.m = listener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.n = listener;
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoadMoreRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = new SparseArray<>();
        this.e = new SparseArray<>();
        this.j = new b();
        this.l = false;
        this.o = new c();
        if (isInEditMode()) {
            addLoaderView(null);
        }
    }

    public void addFooterView(@NonNull final View view) {
        if (view.getLayoutParams() == null) {
            setLayoutParams(view);
        }
        SparseArray<View> sparseArray = this.e;
        sparseArray.put(sparseArray.size() + q, view);
    }

    public void addHeaderView(@NonNull View view) {
        if (view.getLayoutParams() == null) {
            setLayoutParams(view);
        }
        SparseArray<View> sparseArray = this.d;
        sparseArray.put(sparseArray.size() + 1073741823, view);
    }

    public boolean removeFooterView(@Nullable View view) {
        int iIndexOfValue;
        if (this.e.size() <= 0 || this.i == null || (iIndexOfValue = this.e.indexOfValue(view)) < 0) {
            return false;
        }
        this.e.removeAt(iIndexOfValue);
        this.i.notifyItemRemoved(getHeaderViewsCount() + this.i.f() + iIndexOfValue);
        return true;
    }

    public boolean removeHeaderView(@NonNull final View view) {
        int iIndexOfValue;
        if (this.d.size() <= 0 || this.i == null || (iIndexOfValue = this.d.indexOfValue(view)) < 0) {
            return false;
        }
        this.d.removeAt(iIndexOfValue);
        this.i.notifyItemRemoved(iIndexOfValue);
        return true;
    }
}
