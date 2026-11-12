package com.huami.watchfacesstore.view.recycleview;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class DefaultDiffCallback<T> extends DiffUtil.Callback {
    private List<T> a;
    private List<T> b;

    public DefaultDiffCallback(List<T> oldList, List<T> newList) {
        this.a = oldList;
        this.b = newList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public abstract boolean areContentsTheSame(int oldItemPosition, int newItemPosition);

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public abstract boolean areItemsTheSame(int oldItemPosition, int newItemPosition);

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    @Nullable
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }

    public List<T> getNewList() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        List<T> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<T> getOldList() {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        List<T> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setNewList(List<T> newList) {
        this.b = newList;
    }

    public void setOldList(List<T> oldList) {
        this.a = oldList;
    }
}
