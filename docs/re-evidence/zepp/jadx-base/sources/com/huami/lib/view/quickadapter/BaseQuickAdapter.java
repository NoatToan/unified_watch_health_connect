package com.huami.lib.view.quickadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseQuickAdapter<T, K extends BaseViewHolder> extends RecyclerView.Adapter<K> {
    public static final int EMPTY_VIEW = 1365;
    public static final int FOOTER_VIEW = 819;
    public static final int HEADER_VIEW = 273;
    public static final int LOADING_VIEW = 546;
    public static final String TAG = "BaseQuickAdapter";
    private boolean a;
    private boolean b;
    private boolean c;
    private LoadMoreView d;
    private RequestLoadMoreListener e;
    private ExtendLoadMoreListener f;
    private OnItemClickListener g;
    private OnItemLongClickListener h;
    private OnItemChildClickListener i;
    private OnItemChildLongClickListener j;
    private LinearLayout k;
    private LinearLayout l;
    private FrameLayout m;
    public Context mContext;
    public List<T> mData;
    public LayoutInflater mLayoutInflater;
    public int mLayoutResId;
    private boolean n;
    private boolean o;
    private boolean p;
    private RecyclerView q;
    private boolean r;
    private boolean s;
    private UpFetchListener t;
    private int u;
    private boolean v;
    private boolean w;
    private SpanSizeLookup x;
    private MultiTypeDelegate<T> y;
    private int z;

    public interface ExtendLoadMoreListener {
        void onLoadMoreChanged(View view);

        void onLoadMoreClicked(View view);
    }

    public interface OnItemChildClickListener {
        void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface OnItemChildLongClickListener {
        boolean onItemChildLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface OnItemClickListener {
        void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface OnItemLongClickListener {
        boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface RequestLoadMoreListener {
        void onLoadMoreRequested();
    }

    public interface SpanSizeLookup {
        int getSpanSize(GridLayoutManager gridLayoutManager, int i);
    }

    public interface UpFetchListener {
        void onUpFetch();
    }

    public class a implements Runnable {
        public final /* synthetic */ LinearLayoutManager a;

        public a(LinearLayoutManager linearLayoutManager) {
            this.a = linearLayoutManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.findLastCompletelyVisibleItemPosition() + 1 != BaseQuickAdapter.this.getA()) {
                BaseQuickAdapter.this.setEnableLoadMore(true);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ StaggeredGridLayoutManager a;

        public b(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.a = staggeredGridLayoutManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.a.getSpanCount()];
            this.a.findLastCompletelyVisibleItemPositions(iArr);
            if (BaseQuickAdapter.this.getTheBiggestNumber(iArr) + 1 != BaseQuickAdapter.this.getA()) {
                BaseQuickAdapter.this.setEnableLoadMore(true);
            }
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ View a;

        public c(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BaseQuickAdapter.this.d.getLoadMoreStatus() == 3) {
                BaseQuickAdapter.this.d.setLoadMoreStatus(1);
                BaseQuickAdapter baseQuickAdapter = BaseQuickAdapter.this;
                baseQuickAdapter.notifyItemChanged(baseQuickAdapter.getHeaderLayoutCount() + BaseQuickAdapter.this.mData.size() + BaseQuickAdapter.this.getFooterLayoutCount());
            } else {
                if (BaseQuickAdapter.this.d.getLoadMoreStatus() != 4 || BaseQuickAdapter.this.f == null) {
                    return;
                }
                BaseQuickAdapter.this.f.onLoadMoreClicked(this.a);
            }
        }
    }

    public class d extends GridLayoutManager.SpanSizeLookup {
        public final /* synthetic */ GridLayoutManager a;

        public d(GridLayoutManager gridLayoutManager) {
            this.a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            int itemViewType = BaseQuickAdapter.this.getItemViewType(i);
            if (itemViewType == 273 && BaseQuickAdapter.this.isHeaderViewAsFlow()) {
                return 1;
            }
            if (itemViewType == 819 && BaseQuickAdapter.this.isFooterViewAsFlow()) {
                return 1;
            }
            if (BaseQuickAdapter.this.x != null) {
                return BaseQuickAdapter.this.isFixedViewType(itemViewType) ? this.a.getSpanCount() : BaseQuickAdapter.this.x.getSpanSize(this.a, i - BaseQuickAdapter.this.getHeaderLayoutCount());
            }
            if (BaseQuickAdapter.this.isFixedViewType(itemViewType)) {
                return this.a.getSpanCount();
            }
            return 1;
        }
    }

    public class e implements View.OnClickListener {
        public final /* synthetic */ BaseViewHolder a;

        public e(BaseViewHolder baseViewHolder) {
            this.a = baseViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseQuickAdapter.this.getOnItemClickListener().onItemClick(BaseQuickAdapter.this, view, this.a.getLayoutPosition() - BaseQuickAdapter.this.getHeaderLayoutCount());
        }
    }

    public class f implements View.OnLongClickListener {
        public final /* synthetic */ BaseViewHolder a;

        public f(BaseViewHolder baseViewHolder) {
            this.a = baseViewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return BaseQuickAdapter.this.getOnItemLongClickListener().onItemLongClick(BaseQuickAdapter.this, view, this.a.getLayoutPosition() - BaseQuickAdapter.this.getHeaderLayoutCount());
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseQuickAdapter.this.e.onLoadMoreRequested();
        }
    }

    public BaseQuickAdapter(@LayoutRes int i, @Nullable List<T> list) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = new SimpleLoadMoreView();
        this.n = true;
        this.u = 1;
        this.z = 1;
        this.mData = list == null ? new ArrayList<>() : list;
        if (i != 0) {
            this.mLayoutResId = i;
        }
    }

    private void autoLoadMore(int i) {
        if (getLoadMoreViewCount() != 0 && i >= getA() - this.z && this.d.getLoadMoreStatus() == 1) {
            this.d.setLoadMoreStatus(2);
            if (this.c) {
                return;
            }
            this.c = true;
            if (getRecyclerView() != null) {
                getRecyclerView().post(new g());
            } else {
                this.e.onLoadMoreRequested();
            }
        }
    }

    private void autoUpFetch(int i) {
        UpFetchListener upFetchListener;
        if (!isUpFetchEnable() || isUpFetching() || i > this.u || (upFetchListener = this.t) == null) {
            return;
        }
        upFetchListener.onUpFetch();
    }

    private void checkNotNull() {
        if (getRecyclerView() == null) {
            throw new RuntimeException("please bind recyclerView first!");
        }
    }

    private void compatibilityDataSizeChanged(int i) {
        List<T> list = this.mData;
        if ((list == null ? 0 : list.size()) == i) {
            notifyDataSetChanged();
        }
    }

    private void f(BaseViewHolder baseViewHolder) {
        View view;
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null) {
            return;
        }
        if (getOnItemClickListener() != null) {
            view.setOnClickListener(new e(baseViewHolder));
        }
        if (getOnItemLongClickListener() != null) {
            view.setOnLongClickListener(new f(baseViewHolder));
        }
    }

    private K g(Class cls, View view) {
        try {
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(View.class);
                declaredConstructor.setAccessible(true);
                return (K) declaredConstructor.newInstance(view);
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
            declaredConstructor2.setAccessible(true);
            return (K) declaredConstructor2.newInstance(this, view);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private int getFooterViewPosition() {
        int i = 1;
        if (getEmptyViewCount() != 1) {
            return getHeaderLayoutCount() + this.mData.size();
        }
        if (this.o && getHeaderLayoutCount() != 0) {
            i = 2;
        }
        if (this.p) {
            return i;
        }
        return -1;
    }

    private int getHeaderViewPosition() {
        return (getEmptyViewCount() != 1 || this.o) ? 0 : -1;
    }

    private Class getInstancedGenericKClass(Class cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        for (Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (BaseViewHolder.class.isAssignableFrom(cls2)) {
                    return cls2;
                }
            }
        }
        return null;
    }

    private int getItemPosition(T t) {
        List<T> list;
        if (t == null || (list = this.mData) == null || list.isEmpty()) {
            return -1;
        }
        return this.mData.indexOf(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTheBiggestNumber(int[] iArr) {
        int i = -1;
        if (iArr != null && iArr.length != 0) {
            for (int i2 : iArr) {
                if (i2 > i) {
                    i = i2;
                }
            }
        }
        return i;
    }

    private IExpandable h(int i) {
        T item = getItem(i);
        if (isExpandable(item)) {
            return (IExpandable) item;
        }
        return null;
    }

    private K i(ViewGroup viewGroup) {
        View itemView = getItemView(this.d.getLayoutId(), viewGroup);
        ExtendLoadMoreListener extendLoadMoreListener = this.f;
        if (extendLoadMoreListener != null) {
            extendLoadMoreListener.onLoadMoreChanged(itemView);
        }
        K k = (K) createBaseViewHolder(itemView);
        k.itemView.setOnClickListener(new c(itemView));
        return k;
    }

    private boolean j(IExpandable iExpandable) {
        List<T> subItems;
        return (iExpandable == null || (subItems = iExpandable.getSubItems()) == null || subItems.size() <= 0) ? false : true;
    }

    private void k(RequestLoadMoreListener requestLoadMoreListener) {
        this.e = requestLoadMoreListener;
        this.a = true;
        this.b = true;
        this.c = false;
    }

    private int recursiveCollapse(@IntRange(from = 0) int i) {
        T item = getItem(i);
        int iRecursiveCollapse = 0;
        if (!isExpandable(item)) {
            return 0;
        }
        IExpandable iExpandable = (IExpandable) item;
        if (iExpandable.isExpanded()) {
            List<T> subItems = iExpandable.getSubItems();
            for (int size = subItems.size() - 1; size >= 0; size--) {
                T t = subItems.get(size);
                int itemPosition = getItemPosition(t);
                if (itemPosition >= 0) {
                    if (t instanceof IExpandable) {
                        iRecursiveCollapse += recursiveCollapse(itemPosition);
                    }
                    this.mData.remove(itemPosition);
                    iRecursiveCollapse++;
                }
            }
        }
        return iRecursiveCollapse;
    }

    private int recursiveExpand(int i, @NonNull List list) {
        int size = (i + list.size()) - 1;
        int size2 = list.size() - 1;
        int iRecursiveExpand = 0;
        while (size2 >= 0) {
            if (list.get(size2) instanceof IExpandable) {
                IExpandable iExpandable = (IExpandable) list.get(size2);
                if (iExpandable.isExpanded() && j(iExpandable)) {
                    List<T> subItems = iExpandable.getSubItems();
                    int i2 = size + 1;
                    this.mData.addAll(i2, subItems);
                    iRecursiveExpand += recursiveExpand(i2, subItems);
                }
            }
            size2--;
            size--;
        }
        return iRecursiveExpand;
    }

    private void setRecyclerView(RecyclerView recyclerView) {
        this.q = recyclerView;
    }

    @Deprecated
    public void add(@IntRange(from = 0) int i, @NonNull T t) {
        addData(i, t);
    }

    public void addData(@IntRange(from = 0) int i, @NonNull T t) {
        this.mData.add(i, t);
        notifyItemInserted(i + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public int addFooterView(View view) {
        return addFooterView(view, -1, 1);
    }

    public int addHeaderView(View view) {
        return addHeaderView(view, -1);
    }

    public void bindToRecyclerView(RecyclerView recyclerView) {
        if (getRecyclerView() != null) {
            throw new RuntimeException("Don't bind twice");
        }
        setRecyclerView(recyclerView);
        getRecyclerView().setAdapter(this);
    }

    public int collapse(@IntRange(from = 0) int i, boolean z, boolean z2) {
        int headerLayoutCount = i - getHeaderLayoutCount();
        IExpandable iExpandableH = h(headerLayoutCount);
        if (iExpandableH == null) {
            return 0;
        }
        int iRecursiveCollapse = recursiveCollapse(headerLayoutCount);
        iExpandableH.setExpanded(false);
        int headerLayoutCount2 = headerLayoutCount + getHeaderLayoutCount();
        if (z2) {
            if (z) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeRemoved(headerLayoutCount2 + 1, iRecursiveCollapse);
            } else {
                notifyDataSetChanged();
            }
        }
        return iRecursiveCollapse;
    }

    public abstract void convert(K k, T t);

    public K createBaseViewHolder(ViewGroup viewGroup, int i) {
        return (K) createBaseViewHolder(getItemView(i, viewGroup));
    }

    public void disableLoadMoreIfNotFullPage() {
        checkNotNull();
        disableLoadMoreIfNotFullPage(getRecyclerView());
    }

    public int expand(@IntRange(from = 0) int i, boolean z, boolean z2) {
        int headerLayoutCount = i - getHeaderLayoutCount();
        IExpandable iExpandableH = h(headerLayoutCount);
        int size = 0;
        if (iExpandableH == null) {
            return 0;
        }
        if (!j(iExpandableH)) {
            iExpandableH.setExpanded(false);
            return 0;
        }
        if (!iExpandableH.isExpanded()) {
            List<T> subItems = iExpandableH.getSubItems();
            int i2 = headerLayoutCount + 1;
            this.mData.addAll(i2, subItems);
            int iRecursiveExpand = recursiveExpand(i2, subItems) + 0;
            iExpandableH.setExpanded(true);
            size = iRecursiveExpand + subItems.size();
        }
        int headerLayoutCount2 = headerLayoutCount + getHeaderLayoutCount();
        if (z2) {
            if (z) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeInserted(headerLayoutCount2 + 1, size);
            } else {
                notifyDataSetChanged();
            }
        }
        return size;
    }

    public int expandAll(int i, boolean z, boolean z2) {
        T item;
        int headerLayoutCount = i - getHeaderLayoutCount();
        int i2 = headerLayoutCount + 1;
        T item2 = i2 < this.mData.size() ? getItem(i2) : null;
        IExpandable iExpandableH = h(headerLayoutCount);
        if (iExpandableH == null || !j(iExpandableH)) {
            return 0;
        }
        int iExpand = expand(getHeaderLayoutCount() + headerLayoutCount, false, false);
        while (i2 < this.mData.size() && (item = getItem(i2)) != item2) {
            if (isExpandable(item)) {
                iExpand += expand(getHeaderLayoutCount() + i2, false, false);
            }
            i2++;
        }
        if (z2) {
            if (z) {
                notifyItemRangeInserted(headerLayoutCount + getHeaderLayoutCount() + 1, iExpand);
            } else {
                notifyDataSetChanged();
            }
        }
        return iExpand;
    }

    @NonNull
    public List<T> getData() {
        return this.mData;
    }

    public int getDefItemViewType(int i) {
        MultiTypeDelegate<T> multiTypeDelegate = this.y;
        return multiTypeDelegate != null ? multiTypeDelegate.getDefItemViewType(this.mData, i) : super.getItemViewType(i);
    }

    public View getEmptyView() {
        return this.m;
    }

    public int getEmptyViewCount() {
        FrameLayout frameLayout = this.m;
        return (frameLayout == null || frameLayout.getChildCount() == 0 || !this.n || this.mData.size() != 0) ? 0 : 1;
    }

    public LinearLayout getFooterLayout() {
        return this.l;
    }

    public int getFooterLayoutCount() {
        LinearLayout linearLayout = this.l;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Deprecated
    public int getFooterViewsCount() {
        return getFooterLayoutCount();
    }

    public LinearLayout getHeaderLayout() {
        return this.k;
    }

    public int getHeaderLayoutCount() {
        LinearLayout linearLayout = this.k;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Deprecated
    public int getHeaderViewsCount() {
        return getHeaderLayoutCount();
    }

    @Nullable
    public T getItem(@IntRange(from = 0) int i) {
        if (i < this.mData.size()) {
            return this.mData.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        int i = 1;
        if (getEmptyViewCount() != 1) {
            return getLoadMoreViewCount() + getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount();
        }
        if (this.o && getHeaderLayoutCount() != 0) {
            i = 2;
        }
        return (!this.p || getFooterLayoutCount() == 0) ? i : i + 1;
    }

    public int getItemDataPosition(K k) {
        return k.getLayoutPosition() - getHeaderLayoutCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public View getItemView(@LayoutRes int i, ViewGroup viewGroup) {
        return this.mLayoutInflater.inflate(i, viewGroup, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (getEmptyViewCount() == 1) {
            boolean z = this.o && getHeaderLayoutCount() != 0;
            if (i == 0) {
                return z ? 273 : 1365;
            }
            if (i != 1) {
                return i != 2 ? 1365 : 819;
            }
            return z ? 1365 : 819;
        }
        int headerLayoutCount = getHeaderLayoutCount();
        if (i < headerLayoutCount) {
            return 273;
        }
        int i2 = i - headerLayoutCount;
        int size = this.mData.size();
        if (i2 < size) {
            return getDefItemViewType(i2);
        }
        return i2 - size < getFooterLayoutCount() ? 819 : 546;
    }

    public int getLoadMoreViewCount() {
        if (this.e == null || !this.b) {
            return 0;
        }
        return ((this.a || !this.d.isLoadEndMoreGone()) && this.mData.size() != 0) ? 1 : 0;
    }

    public MultiTypeDelegate<T> getMultiTypeDelegate() {
        return this.y;
    }

    @Nullable
    public final OnItemChildClickListener getOnItemChildClickListener() {
        return this.i;
    }

    @Nullable
    public final OnItemChildLongClickListener getOnItemChildLongClickListener() {
        return this.j;
    }

    public final OnItemClickListener getOnItemClickListener() {
        return this.g;
    }

    public final OnItemLongClickListener getOnItemLongClickListener() {
        return this.h;
    }

    public int getParentPosition(@NonNull T t) {
        int itemPosition = getItemPosition(t);
        if (itemPosition == -1) {
            return -1;
        }
        int level = t instanceof IExpandable ? ((IExpandable) t).getLevel() : Integer.MAX_VALUE;
        if (level == 0) {
            return itemPosition;
        }
        if (level == -1) {
            return -1;
        }
        while (itemPosition >= 0) {
            T t2 = this.mData.get(itemPosition);
            if (t2 instanceof IExpandable) {
                IExpandable iExpandable = (IExpandable) t2;
                if (iExpandable.getLevel() >= 0 && iExpandable.getLevel() < level) {
                    return itemPosition;
                }
            }
            itemPosition--;
        }
        return -1;
    }

    public RecyclerView getRecyclerView() {
        return this.q;
    }

    @Nullable
    public View getViewByPosition(int i, @IdRes int i2) {
        checkNotNull();
        return getViewByPosition(getRecyclerView(), i, i2);
    }

    public boolean isExpandable(T t) {
        return t != null && (t instanceof IExpandable);
    }

    public boolean isFixedViewType(int i) {
        return i == 1365 || i == 273 || i == 819 || i == 546;
    }

    public boolean isFooterViewAsFlow() {
        return this.w;
    }

    public boolean isHeaderViewAsFlow() {
        return this.v;
    }

    public boolean isLoadMoreEnable() {
        return this.b;
    }

    public boolean isLoading() {
        return this.c;
    }

    public boolean isNextLoadEnable() {
        return this.a;
    }

    public boolean isUpFetchEnable() {
        return this.r;
    }

    public boolean isUpFetching() {
        return this.s;
    }

    public void isUseEmpty(boolean z) {
        this.n = z;
    }

    public void loadMoreComplete() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.c = false;
        this.d.setLoadMoreStatus(1);
        notifyItemChanged(getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount());
    }

    public void loadMoreEnd() {
        loadMoreEnd(false);
    }

    public void loadMoreFail() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.c = false;
        this.d.setLoadMoreStatus(3);
        notifyItemChanged(getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new d(gridLayoutManager));
        }
    }

    public K onCreateDefViewHolder(ViewGroup viewGroup, int i) {
        int layoutId = this.mLayoutResId;
        MultiTypeDelegate<T> multiTypeDelegate = this.y;
        if (multiTypeDelegate != null) {
            layoutId = multiTypeDelegate.getLayoutId(i);
        }
        return (K) createBaseViewHolder(viewGroup, layoutId);
    }

    public void remove(@IntRange(from = 0) int i) {
        this.mData.remove(i);
        int headerLayoutCount = i + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.mData.size() - headerLayoutCount);
    }

    public void removeAllFooterView() {
        if (getFooterLayoutCount() == 0) {
            return;
        }
        this.l.removeAllViews();
        int footerViewPosition = getFooterViewPosition();
        if (footerViewPosition != -1) {
            notifyItemRemoved(footerViewPosition);
        }
    }

    public void removeAllHeaderView() {
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        this.k.removeAllViews();
        int headerViewPosition = getHeaderViewPosition();
        if (headerViewPosition != -1) {
            notifyItemRemoved(headerViewPosition);
        }
    }

    public void removeFooterView(View view) {
        int footerViewPosition;
        if (getFooterLayoutCount() == 0) {
            return;
        }
        this.l.removeView(view);
        if (this.l.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(footerViewPosition);
    }

    public void removeHeaderView(View view) {
        int headerViewPosition;
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        this.k.removeView(view);
        if (this.k.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(headerViewPosition);
    }

    @Deprecated
    public void setAutoLoadMoreSize(int i) {
        setPreLoadNumber(i);
    }

    public void setData(@IntRange(from = 0) int i, @NonNull T t) {
        this.mData.set(i, t);
        notifyItemChanged(i + getHeaderLayoutCount());
    }

    public void setEmptyView(int i, ViewGroup viewGroup) {
        setEmptyView(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    public void setEnableLoadMore(boolean z) {
        int loadMoreViewCount = getLoadMoreViewCount();
        this.b = z;
        int loadMoreViewCount2 = getLoadMoreViewCount();
        if (loadMoreViewCount == 1) {
            if (loadMoreViewCount2 == 0) {
                notifyItemRemoved(getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount());
            }
        } else if (loadMoreViewCount2 == 1) {
            this.d.setLoadMoreStatus(1);
            notifyItemInserted(getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount());
        }
    }

    public void setExtendLoadMoreListener(ExtendLoadMoreListener extendLoadMoreListener) {
        this.f = extendLoadMoreListener;
    }

    public int setFooterView(View view) {
        return setFooterView(view, 0, 1);
    }

    public void setFooterViewAsFlow(boolean z) {
        this.w = z;
    }

    public void setFullSpan(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).setFullSpan(true);
        }
    }

    public void setHeaderAndEmpty(boolean z) {
        setHeaderFooterEmpty(z, false);
    }

    public void setHeaderFooterEmpty(boolean z, boolean z2) {
        this.o = z;
        this.p = z2;
    }

    public int setHeaderView(View view) {
        return setHeaderView(view, 0, 1);
    }

    public void setHeaderViewAsFlow(boolean z) {
        this.v = z;
    }

    public void setLoadMoreView(LoadMoreView loadMoreView) {
        this.d = loadMoreView;
    }

    public void setMultiTypeDelegate(MultiTypeDelegate<T> multiTypeDelegate) {
        this.y = multiTypeDelegate;
    }

    public void setNewData(@Nullable List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mData = list;
        if (this.e != null) {
            this.a = true;
            this.b = true;
            this.c = false;
            this.d.setLoadMoreStatus(1);
        }
        notifyDataSetChanged();
    }

    public void setOnItemChildClickListener(OnItemChildClickListener onItemChildClickListener) {
        this.i = onItemChildClickListener;
    }

    public void setOnItemChildLongClickListener(OnItemChildLongClickListener onItemChildLongClickListener) {
        this.j = onItemChildLongClickListener;
    }

    public void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        this.g = onItemClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.h = onItemLongClickListener;
    }

    @Deprecated
    public void setOnLoadMoreListener(RequestLoadMoreListener requestLoadMoreListener) {
        k(requestLoadMoreListener);
    }

    public void setPreLoadNumber(int i) {
        if (i > 1) {
            this.z = i;
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.x = spanSizeLookup;
    }

    public void setStartUpFetchPosition(int i) {
        this.u = i;
    }

    public void setUpFetchEnable(boolean z) {
        this.r = z;
    }

    public void setUpFetchListener(UpFetchListener upFetchListener) {
        this.t = upFetchListener;
    }

    public void setUpFetching(boolean z) {
        this.s = z;
    }

    public int addFooterView(View view, int i) {
        return addFooterView(view, i, 1);
    }

    public int addHeaderView(View view, int i) {
        return addHeaderView(view, i, 1);
    }

    public K createBaseViewHolder(View view) {
        Class instancedGenericKClass = null;
        for (Class<?> superclass = getClass(); instancedGenericKClass == null && superclass != null; superclass = superclass.getSuperclass()) {
            instancedGenericKClass = getInstancedGenericKClass(superclass);
        }
        K k = (K) g(instancedGenericKClass, view);
        return k != null ? k : (K) new BaseViewHolder(view);
    }

    public void loadMoreEnd(boolean z) {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.c = false;
        this.a = false;
        this.d.setLoadMoreEndGone(z);
        if (z) {
            notifyItemRemoved(getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount());
        } else {
            this.d.setLoadMoreStatus(4);
            notifyItemChanged(getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(K k, int i) {
        autoUpFetch(i);
        autoLoadMore(i);
        int itemViewType = k.getItemViewType();
        if (itemViewType == 0) {
            convert(k, this.mData.get(k.getLayoutPosition() - getHeaderLayoutCount()));
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.d.convert(k);
            } else {
                if (itemViewType == 819 || itemViewType == 1365) {
                    return;
                }
                convert(k, this.mData.get(k.getLayoutPosition() - getHeaderLayoutCount()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public K onCreateViewHolder(ViewGroup viewGroup, int i) {
        K k;
        Context context = viewGroup.getContext();
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        if (i == 273) {
            k = (K) createBaseViewHolder(this.k);
        } else if (i == 546) {
            k = (K) i(viewGroup);
        } else if (i == 819) {
            k = (K) createBaseViewHolder(this.l);
        } else if (i != 1365) {
            k = (K) onCreateDefViewHolder(viewGroup, i);
            f(k);
        } else {
            k = (K) createBaseViewHolder(this.m);
        }
        k.setAdapter(this);
        return k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(K k) {
        super.onViewAttachedToWindow(k);
        int itemViewType = k.getItemViewType();
        if (itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546) {
            setFullSpan(k);
        }
    }

    public int setFooterView(View view, int i) {
        return setFooterView(view, i, 1);
    }

    public int setHeaderView(View view, int i) {
        return setHeaderView(view, i, 1);
    }

    public void setOnLoadMoreListener(RequestLoadMoreListener requestLoadMoreListener, RecyclerView recyclerView) {
        k(requestLoadMoreListener);
        if (getRecyclerView() == null) {
            setRecyclerView(recyclerView);
        }
    }

    public int addFooterView(View view, int i, int i2) {
        int footerViewPosition;
        if (this.l == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.l = linearLayout;
            if (i2 == 1) {
                linearLayout.setOrientation(1);
                this.l.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.l.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        int childCount = this.l.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        this.l.addView(view, i);
        if (this.l.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i;
    }

    public int addHeaderView(View view, int i, int i2) {
        int headerViewPosition;
        if (this.k == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.k = linearLayout;
            if (i2 == 1) {
                linearLayout.setOrientation(1);
                this.k.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.k.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        int childCount = this.k.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        this.k.addView(view, i);
        if (this.k.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i;
    }

    public void disableLoadMoreIfNotFullPage(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        setEnableLoadMore(false);
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            recyclerView.postDelayed(new a((LinearLayoutManager) layoutManager), 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            recyclerView.postDelayed(new b((StaggeredGridLayoutManager) layoutManager), 50L);
        }
    }

    @Nullable
    public View getViewByPosition(RecyclerView recyclerView, int i, @IdRes int i2) {
        BaseViewHolder baseViewHolder;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i)) == null) {
            return null;
        }
        return baseViewHolder.getView(i2);
    }

    public void setEmptyView(int i) {
        checkNotNull();
        setEmptyView(i, getRecyclerView());
    }

    public int setFooterView(View view, int i, int i2) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null && linearLayout.getChildCount() > i) {
            this.l.removeViewAt(i);
            this.l.addView(view, i);
            return i;
        }
        return addFooterView(view, i, i2);
    }

    public int setHeaderView(View view, int i, int i2) {
        LinearLayout linearLayout = this.k;
        if (linearLayout != null && linearLayout.getChildCount() > i) {
            this.k.removeViewAt(i);
            this.k.addView(view, i);
            return i;
        }
        return addHeaderView(view, i, i2);
    }

    public void addData(@NonNull T t) {
        this.mData.add(t);
        notifyItemInserted(this.mData.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void setEmptyView(View view) {
        boolean z;
        int i = 0;
        if (this.m == null) {
            this.m = new FrameLayout(view.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = layoutParams2.width;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = layoutParams2.height;
            }
            this.m.setLayoutParams(layoutParams);
            z = true;
        } else {
            z = false;
        }
        this.m.removeAllViews();
        this.m.addView(view);
        this.n = true;
        if (z && getEmptyViewCount() == 1) {
            if (this.o && getHeaderLayoutCount() != 0) {
                i = 1;
            }
            notifyItemInserted(i);
        }
    }

    public void addData(@IntRange(from = 0) int i, @NonNull Collection<? extends T> collection) {
        this.mData.addAll(i, collection);
        notifyItemRangeInserted(i + getHeaderLayoutCount(), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public int collapse(@IntRange(from = 0) int i) {
        return collapse(i, true, true);
    }

    public void addData(@NonNull Collection<? extends T> collection) {
        this.mData.addAll(collection);
        notifyItemRangeInserted((this.mData.size() - collection.size()) + getHeaderLayoutCount(), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public int collapse(@IntRange(from = 0) int i, boolean z) {
        return collapse(i, z, true);
    }

    public BaseQuickAdapter(@Nullable List<T> list) {
        this(0, list);
    }

    public BaseQuickAdapter(@LayoutRes int i) {
        this(i, null);
    }

    public int expandAll(int i, boolean z) {
        return expandAll(i, true, !z);
    }

    public void expandAll() {
        int size = this.mData.size();
        while (true) {
            size--;
            if (size < getHeaderLayoutCount() + 0) {
                return;
            } else {
                expandAll(size, false, false);
            }
        }
    }

    public int expand(@IntRange(from = 0) int i, boolean z) {
        return expand(i, z, true);
    }

    public int expand(@IntRange(from = 0) int i) {
        return expand(i, true, true);
    }
}
