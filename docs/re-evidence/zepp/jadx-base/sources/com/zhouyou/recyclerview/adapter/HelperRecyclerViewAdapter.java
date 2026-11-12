package com.zhouyou.recyclerview.adapter;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class HelperRecyclerViewAdapter<T> extends BaseRecyclerViewAdapter<T> implements DataHelper<T> {
    public HelperRecyclerViewAdapter(List<T> list, Context context, int... iArr) {
        super(list, context, iArr);
    }

    public abstract void HelperBindData(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, T t);

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public void add(int i, T t) {
        List<T> list = this.mList;
        if (list == null || t == null) {
            return;
        }
        list.add(i, t);
        notifyDataSetChanged();
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public boolean addAll(int i, List<T> list) {
        List<T> list2 = this.mList;
        if (list2 == null || list == null) {
            return false;
        }
        boolean zAddAll = list2.addAll(i, list);
        notifyDataSetChanged();
        return zAddAll;
    }

    public boolean addAndNotifyItems(List<T> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        int size = this.mList.size();
        boolean zAddAll = this.mList.addAll(list);
        notifyItemRangeInserted(size, list.size());
        return zAddAll;
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public void addItemToHead(T t) {
        add(0, t);
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public boolean addItemToLast(T t) {
        List<T> list = this.mList;
        if (list == null) {
            return false;
        }
        boolean zAdd = list.add(t);
        notifyDataSetChanged();
        return zAdd;
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public boolean addItemsToHead(List<T> list) {
        return addAll(0, list);
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public boolean addItemsToLast(List<T> list) {
        List<T> list2 = this.mList;
        if (list2 == null) {
            return false;
        }
        boolean zAddAll = list2.addAll(list);
        notifyDataSetChanged();
        return zAddAll;
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public void alterObj(T t, T t2) {
        alterObj(this.mList.indexOf(t), t2);
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public void clear() {
        List<T> list = this.mList;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public boolean contains(T t) {
        List<T> list = this.mList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return this.mList.contains(t);
    }

    @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter
    public BaseRecyclerViewHolder createViewHolder(View view, int i) {
        return new HelperRecyclerViewHolder(view, i);
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public T getData(int i) {
        if (getA() == 0) {
            return null;
        }
        return this.mList.get(i);
    }

    public List<T> getList() {
        return this.mList;
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public boolean isEnabled(int i) {
        return i >= 0 && i < this.mList.size();
    }

    @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter
    public void onBindData(BH bh, int i, T t) {
        HelperRecyclerViewHolder helperRecyclerViewHolder = (HelperRecyclerViewHolder) bh;
        HelperBindData(helperRecyclerViewHolder, i, t);
        setListener(helperRecyclerViewHolder, i, t);
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public boolean remove(T t) {
        if (t == null) {
            return false;
        }
        boolean zRemove = this.mList.remove(t);
        notifyDataSetChanged();
        return zRemove;
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public void removeToIndex(int i) {
        List<T> list = this.mList;
        if (list == null) {
            return;
        }
        list.remove(i);
        notifyDataSetChanged();
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public void replaceAll(List<T> list) {
        List<T> list2 = this.mList;
        if (list2 != null) {
            list2.clear();
        }
        addAll(0, list);
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public boolean setListAll(List<T> list) {
        if (this.mList == null) {
            this.mList = new ArrayList();
        }
        this.mList.clear();
        boolean zAddAll = false;
        if (list != null && !list.isEmpty()) {
            zAddAll = this.mList.addAll(list);
        }
        notifyDataSetChanged();
        return zAddAll;
    }

    public void setListener(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, T t) {
    }

    public HelperRecyclerViewAdapter(Context context, int... iArr) {
        super(context, iArr);
    }

    @Override // com.zhouyou.recyclerview.adapter.DataHelper
    public void alterObj(int i, T t) {
        List<T> list = this.mList;
        if (list == null || t == null) {
            return;
        }
        list.set(i, t);
        notifyDataSetChanged();
    }

    @Deprecated
    public HelperRecyclerViewAdapter(List<T> list, Context context) {
        super(list, context);
    }
}
