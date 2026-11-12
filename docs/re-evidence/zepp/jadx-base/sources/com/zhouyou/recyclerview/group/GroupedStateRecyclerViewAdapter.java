package com.zhouyou.recyclerview.group;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhouyou.recyclerview.XRecyclerView;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class GroupedStateRecyclerViewAdapter<T> extends GroupedRecyclerViewAdapter<T> {
    public static final int STATE_EMPTY = 2;
    public static final int STATE_ERROR = 3;
    public static final int STATE_LOADING = 1;
    public static final int STATE_NORMAL = 0;
    public static final int TYPE_EMPTY = 1001;
    public static final int TYPE_ERROR = 1002;
    public static final int TYPE_LOADING = 1000;
    public int state;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public GroupedStateRecyclerViewAdapter(Context context, List list) {
        super(context, list);
        this.state = 0;
    }

    private int e() {
        return countGroupRangeItem(0, this.mStructures.size());
    }

    private void h() {
        if (super.getA() > 0) {
            setState(0);
        } else {
            setState(2);
        }
    }

    public abstract View getEmptyView(ViewGroup viewGroup);

    public abstract View getErrorView(ViewGroup viewGroup);

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        int i = this.state;
        if (i == 1 || i == 2 || i == 3) {
            return 1;
        }
        return super.getA();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.state;
        if (i2 == 1) {
            return 1000;
        }
        if (i2 == 2) {
            return 1001;
        }
        if (i2 != 3) {
            return itemViewType(i);
        }
        return 1002;
    }

    public abstract View getLoadingView(ViewGroup viewGroup);

    public int getState() {
        return this.state;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void insertFooter(int i) {
        super.insertFooter(i);
        h();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void insertGroup(int i) {
        super.insertGroup(i);
        h();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void insertHeader(int i) {
        super.insertHeader(i);
        h();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void insertRangeChild(int i, int i2, int i3) {
        super.insertRangeChild(i, i2, i3);
        h();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void insertRangeGroup(int i, int i2) {
        super.insertRangeGroup(i, i2);
        h();
    }

    public int itemViewType(int i) {
        return super.getItemViewType(i);
    }

    public void onBindEmptyViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder) {
    }

    public void onBindErrorViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder) {
    }

    public void onBindLoadingViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder) {
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void removeAll() {
        super.removeAll();
        h();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void removeGroup(int i) {
        super.removeGroup(i);
        h();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void removeRangeGroup(int i, int i2) {
        super.removeRangeGroup(i, i2);
        h();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public boolean setGroups(List<T> list) {
        boolean groups = super.setGroups(list);
        h();
        return groups;
    }

    public void setState(int i) {
        this.state = i;
        XRecyclerView xRecyclerView = this.xRecyclerView;
        if (xRecyclerView != null) {
            if (i == 0) {
                xRecyclerView.setEnabledScroll(true);
            } else if (i == 1 || i == 2 || i == 3) {
                xRecyclerView.setEnabledScroll(false);
            }
        }
        notifyDataSetChanged();
    }

    public void viewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder, int i) {
        super.onBindViewHolder(helperRecyclerViewHolder, i);
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder, int i) {
        int i2 = this.state;
        if (i2 == 1) {
            onBindLoadingViewHolder(helperRecyclerViewHolder);
            return;
        }
        if (i2 == 2) {
            onBindEmptyViewHolder(helperRecyclerViewHolder);
        } else if (i2 != 3) {
            viewHolder(helperRecyclerViewHolder, i);
        } else {
            onBindErrorViewHolder(helperRecyclerViewHolder);
        }
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public HelperRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
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

    public GroupedStateRecyclerViewAdapter(Context context) {
        super(context);
        this.state = 0;
    }
}
