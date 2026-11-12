package com.huawei.ui.commonui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class LoadMoreRecyclerViewAdapter<T> extends RecyclerView.Adapter<RecyclerHolder> implements View.OnClickListener {
    private static final int CAN_LOAD_MORE = 1;
    public static final int LOAD_MORE = 0;
    protected static final int NORMAL = 1;
    private static final String TAG = "Suggestion_LoadMoreRecyclerViewAdapter";
    private OnItemClickListener mClickListener;
    protected Context mContext;
    private List<T> mData;
    private boolean mIsLoadMoreWhenLoadingViewShow;
    private int mItemLayoutId;
    private OnMoreListener mListener;
    private RecyclerHolder mLoadingHolder;
    private int mLoadingViewHeight;
    private int defaultPageSize = 10;
    private int mLoadMoreItem = 1;
    private boolean mIsLoadingError = false;

    public interface OnItemClickListener<T> {
        void onItemClicked(RecyclerHolder recyclerHolder, int i, T t);
    }

    public interface OnMoreListener {
        void onLoadingMore();
    }

    public abstract void convert(RecyclerHolder recyclerHolder, int i, T t);

    public LoadMoreRecyclerViewAdapter(List<T> list, RecyclerView recyclerView, int i) {
        this.mItemLayoutId = i;
        this.mData = list;
        this.mContext = recyclerView.getContext();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.5
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i2, int i3) {
                super.onScrolled(recyclerView2, i2, i3);
                if (recyclerView2.computeVerticalScrollOffset() + LoadMoreRecyclerViewAdapter.this.mLoadingViewHeight < (recyclerView2.computeVerticalScrollRange() - recyclerView2.computeVerticalScrollExtent()) - 1 || LoadMoreRecyclerViewAdapter.this.mLoadMoreItem != 1 || LoadMoreRecyclerViewAdapter.this.mListener == null) {
                    return;
                }
                LoadMoreRecyclerViewAdapter.this.mListener.onLoadingMore();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.e(TAG, "onClick view == null");
            return;
        }
        if (view.getId() == R.id.sug_tv_his_load_more && this.mIsLoadingError) {
            this.mIsLoadingError = false;
            this.mLoadingHolder.a(R.id.sug_tv_his_load_more, this.mContext.getString(R.string.sug_his_loading_more));
            OnMoreListener onMoreListener = this.mListener;
            if (onMoreListener != null) {
                onMoreListener.onLoadingMore();
            }
        }
    }

    public void loadError() {
        RecyclerHolder recyclerHolder = this.mLoadingHolder;
        if (recyclerHolder == null || this.mContext == null || this.mLoadMoreItem != 1) {
            return;
        }
        this.mIsLoadingError = true;
        recyclerHolder.a(R.id.sug_tv_his_load_more, this.mContext.getString(R.string.sug_his_load_retry));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.mContext);
        if (i == 1) {
            return new RecyclerHolder(layoutInflaterFrom.inflate(this.mItemLayoutId, viewGroup, false));
        }
        final View viewInflate = layoutInflaterFrom.inflate(R.layout.sug_his_loading_more, viewGroup, false);
        this.mLoadingHolder = new RecyclerHolder(viewInflate);
        if (this.mLoadingViewHeight == 0 && this.mIsLoadMoreWhenLoadingViewShow) {
            viewInflate.post(new Runnable() { // from class: com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    LoadMoreRecyclerViewAdapter.this.mLoadingViewHeight = viewInflate.getHeight();
                }
            });
        }
        this.mLoadingHolder.e(R.id.sug_tv_his_load_more, this);
        return this.mLoadingHolder;
    }

    public void setLoadMoreWhenLoadingViewShow(boolean z) {
        this.mIsLoadMoreWhenLoadingViewShow = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerHolder recyclerHolder, final int i) {
        ViewGroup.LayoutParams layoutParams = recyclerHolder.itemView.getLayoutParams();
        if (i < this.mData.size()) {
            convert(recyclerHolder, i, this.mData.get(i));
            recyclerHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: qiw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.m1663x76e35b31(i, recyclerHolder, view);
                }
            });
            setItemVisibility(recyclerHolder, layoutParams, 0);
        } else if (this.mLoadMoreItem == 1) {
            setItemVisibility(recyclerHolder, layoutParams, 0);
        } else {
            setItemVisibility(recyclerHolder, layoutParams, 8);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: lambda$onBindViewHolder$0$com-huawei-ui-commonui-adapter-LoadMoreRecyclerViewAdapter, reason: not valid java name */
    public /* synthetic */ void m1663x76e35b31(int i, RecyclerHolder recyclerHolder, View view) {
        if (this.mClickListener == null || njy.e(this.mData, i)) {
            return;
        }
        this.mClickListener.onItemClicked(recyclerHolder, i, this.mData.get(i));
    }

    private void setItemVisibility(RecyclerHolder recyclerHolder, ViewGroup.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            recyclerHolder.itemView.setVisibility(0);
        } else {
            layoutParams.height = 0;
            layoutParams.width = 0;
            recyclerHolder.itemView.setVisibility(8);
        }
        recyclerHolder.itemView.setLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mData.size() >= this.defaultPageSize ? this.mData.size() + 1 : this.mData.size();
    }

    public void setDefaultPageSize(int i) {
        this.defaultPageSize = i;
    }

    public int size() {
        if (njy.b(this.mData)) {
            return this.mData.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == this.mData.size() ? 0 : 1;
    }

    public boolean isCanLoadMore() {
        return this.mLoadMoreItem == 1;
    }

    public void remove(int i) {
        if (njy.e(this.mData, i)) {
            return;
        }
        this.mData.remove(i);
    }

    public void clear() {
        this.mData.clear();
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mClickListener = onItemClickListener;
    }

    public LoadMoreRecyclerViewAdapter noMoreLoad() {
        this.mLoadMoreItem = 0;
        notifyDataSetChanged();
        return this;
    }

    public LoadMoreRecyclerViewAdapter noMoreLoad(List<T> list) {
        int size = this.mData.size();
        if (njy.b(list)) {
            this.mData.addAll(list);
        }
        this.mLoadMoreItem = 0;
        int itemCount = getItemCount() - size;
        if (itemCount > 0) {
            notifyItemRangeChanged(size, itemCount);
        }
        return this;
    }

    public LoadMoreRecyclerViewAdapter enableMoreLoad() {
        this.mLoadMoreItem = 1;
        if (this.mIsLoadingError) {
            this.mIsLoadingError = false;
            this.mLoadingHolder.a(R.id.sug_tv_his_load_more, this.mContext.getString(R.string.sug_his_loading_more));
        }
        notifyDataSetChanged();
        return this;
    }

    public LoadMoreRecyclerViewAdapter enableMoreLoad(List<T> list) {
        this.mLoadMoreItem = 1;
        if (this.mIsLoadingError) {
            this.mIsLoadingError = false;
            this.mLoadingHolder.a(R.id.sug_tv_his_load_more, this.mContext.getString(R.string.sug_his_loading_more));
        }
        if (njy.e(list)) {
            return this;
        }
        int size = this.mData.size();
        this.mData.addAll(list);
        notifyItemRangeChanged(size, getItemCount() - size);
        return this;
    }

    public LoadMoreRecyclerViewAdapter setOnMoreListener(OnMoreListener onMoreListener) {
        this.mListener = onMoreListener;
        return this;
    }

    public void notifyDataChange(List<T> list, boolean z) {
        if (z) {
            this.mData.clear();
        }
        this.mData.addAll(list);
        notifyDataSetChanged();
    }

    public T get(int i) {
        if (njy.e(this.mData, i)) {
            return null;
        }
        return this.mData.get(i);
    }

    public List<T> getData() {
        return this.mData;
    }
}
