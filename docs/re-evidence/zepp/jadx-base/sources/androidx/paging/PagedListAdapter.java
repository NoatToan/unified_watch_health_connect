package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: loaded from: classes.dex */
public abstract class PagedListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public final AsyncPagedListDiffer<T> mDiffer;
    private final AsyncPagedListDiffer.PagedListListener<T> mListener;

    public PagedListAdapter(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
        AsyncPagedListDiffer.PagedListListener<T> pagedListListener = new AsyncPagedListDiffer.PagedListListener<T>() { // from class: androidx.paging.PagedListAdapter.1
            @Override // androidx.paging.AsyncPagedListDiffer.PagedListListener
            public void onCurrentListChanged(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2) {
                PagedListAdapter.this.onCurrentListChanged(pagedList2);
                PagedListAdapter.this.onCurrentListChanged(pagedList, pagedList2);
            }
        };
        this.mListener = pagedListListener;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(this, itemCallback);
        this.mDiffer = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(pagedListListener);
    }

    @Nullable
    public PagedList<T> getCurrentList() {
        return this.mDiffer.getCurrentList();
    }

    @Nullable
    public T getItem(int i) {
        return this.mDiffer.getItem(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.mDiffer.getItemCount();
    }

    @Deprecated
    public void onCurrentListChanged(@Nullable PagedList<T> pagedList) {
    }

    public void onCurrentListChanged(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2) {
    }

    public void submitList(@Nullable PagedList<T> pagedList) {
        this.mDiffer.submitList(pagedList);
    }

    public void submitList(@Nullable PagedList<T> pagedList, @Nullable Runnable runnable) {
        this.mDiffer.submitList(pagedList, runnable);
    }

    public PagedListAdapter(@NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        AsyncPagedListDiffer.PagedListListener<T> pagedListListener = new AsyncPagedListDiffer.PagedListListener<T>() { // from class: androidx.paging.PagedListAdapter.1
            @Override // androidx.paging.AsyncPagedListDiffer.PagedListListener
            public void onCurrentListChanged(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2) {
                PagedListAdapter.this.onCurrentListChanged(pagedList2);
                PagedListAdapter.this.onCurrentListChanged(pagedList, pagedList2);
            }
        };
        this.mListener = pagedListListener;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.mDiffer = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(pagedListListener);
    }
}
