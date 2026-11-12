package com.zhouyou.recyclerview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhouyou.recyclerview.XRecyclerView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class HelperStateRecyclerViewAdapter<T> extends HelperRecyclerViewAdapter<T> {
    public static final int STATE_EMPTY = 2;
    public static final int STATE_ERROR = 3;
    public static final int STATE_LOADING = 1;
    public static final int STATE_NORMAL = 0;
    public static final int TYPE_EMPTY = 1001;
    public static final int TYPE_ERROR = 1002;
    public static final int TYPE_LOADING = 1000;
    private int d;
    private XRecyclerView e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public HelperStateRecyclerViewAdapter(List list, Context context, int... iArr) {
        super(list, context, iArr);
        this.d = 0;
    }

    private void c() {
        if (super.getA() > 0) {
            setState(0);
        } else {
            setState(2);
        }
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter, com.zhouyou.recyclerview.adapter.DataHelper
    public void add(int i, T t) {
        super.add(i, t);
        c();
        notifyDataSetChanged();
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter, com.zhouyou.recyclerview.adapter.DataHelper
    public boolean addAll(int i, List<T> list) {
        boolean zAddAll = super.addAll(i, list);
        c();
        return zAddAll;
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter, com.zhouyou.recyclerview.adapter.DataHelper
    public boolean addItemsToLast(List<T> list) {
        boolean zAddItemsToLast = super.addItemsToLast(list);
        c();
        return zAddItemsToLast;
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter, com.zhouyou.recyclerview.adapter.DataHelper
    public void alterObj(int i, T t) {
        super.alterObj(i, t);
        c();
        notifyDataSetChanged();
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter, com.zhouyou.recyclerview.adapter.DataHelper
    public void clear() {
        super.clear();
        c();
        notifyDataSetChanged();
    }

    public abstract View getEmptyView(ViewGroup viewGroup);

    public abstract View getErrorView(ViewGroup viewGroup);

    @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        int i = this.d;
        if (i == 1 || i == 2 || i == 3) {
            return 1;
        }
        return super.getA();
    }

    @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.d;
        if (i2 == 1) {
            return 1000;
        }
        if (i2 == 2) {
            return 1001;
        }
        if (i2 != 3) {
            return super.getItemViewType(i);
        }
        return 1002;
    }

    public abstract View getLoadingView(ViewGroup viewGroup);

    public int getState() {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView instanceof XRecyclerView) {
            this.e = (XRecyclerView) recyclerView;
        }
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindEmptyViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder) {
    }

    public void onBindErrorViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder) {
    }

    public void onBindLoadingViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder) {
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter, com.zhouyou.recyclerview.adapter.DataHelper
    public boolean remove(T t) {
        boolean zRemove = super.remove(t);
        c();
        notifyDataSetChanged();
        return zRemove;
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter, com.zhouyou.recyclerview.adapter.DataHelper
    public void removeToIndex(int i) {
        super.removeToIndex(i);
        c();
        notifyDataSetChanged();
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter, com.zhouyou.recyclerview.adapter.DataHelper
    public boolean setListAll(List<T> list) {
        boolean listAll = super.setListAll(list);
        c();
        notifyDataSetChanged();
        return listAll;
    }

    public void setState(int i) {
        this.d = i;
        XRecyclerView xRecyclerView = this.e;
        if (xRecyclerView != null) {
            if (i == 0) {
                xRecyclerView.setEnabledScroll(true);
            } else if (i == 1 || i == 2 || i == 3) {
                xRecyclerView.setEnabledScroll(false);
            }
        }
        notifyDataSetChanged();
    }

    @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BH bh, int i) {
        int i2 = this.d;
        if (i2 == 1) {
            onBindLoadingViewHolder((HelperRecyclerViewHolder) bh);
            return;
        }
        if (i2 == 2) {
            onBindEmptyViewHolder((HelperRecyclerViewHolder) bh);
        } else if (i2 != 3) {
            super.onBindViewHolder(bh, i);
        } else {
            onBindErrorViewHolder((HelperRecyclerViewHolder) bh);
        }
    }

    @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public BH onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1000:
                return new HelperRecyclerViewHolder(getLoadingView(viewGroup), 0);
            case 1001:
                return new HelperRecyclerViewHolder(getEmptyView(viewGroup), 0);
            case 1002:
                return new HelperRecyclerViewHolder(getErrorView(viewGroup), 0);
            default:
                return super.onCreateViewHolder(viewGroup, i);
        }
    }

    public HelperStateRecyclerViewAdapter(Context context, int... iArr) {
        super(context, iArr);
        this.d = 0;
    }

    public HelperStateRecyclerViewAdapter(List list, Context context) {
        super(list, context);
        this.d = 0;
    }
}
