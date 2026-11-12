package com.zhouyou.recyclerview.group;

import android.content.Context;
import com.zhouyou.recyclerview.XRecyclerView;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class GroupedAppendStateRecyclerViewAdapter<T> extends GroupedStateRecyclerViewAdapter<T> {
    public int g;

    public GroupedAppendStateRecyclerViewAdapter(Context context, List list) {
        super(context, list);
        this.g = 0;
    }

    public boolean addAppendGroup(T t) {
        boolean zAddGroup = super.addGroup(t);
        setState(0);
        return zAddGroup;
    }

    public boolean addAppendGroups(List<T> list) {
        boolean zAddGroups = super.addGroups(list);
        setState(0);
        return zAddGroups;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedStateRecyclerViewAdapter, com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return super.itemCount() + this.g;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedStateRecyclerViewAdapter, com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.g;
        if (i2 == 1 && i2 + i == getA()) {
            int i3 = this.state;
            if (i3 == 1) {
                return 1000;
            }
            if (i3 == 2) {
                return 1001;
            }
            if (i3 == 3) {
                return 1002;
            }
        }
        return itemViewType(i);
    }

    @Override // com.zhouyou.recyclerview.group.GroupedStateRecyclerViewAdapter
    public int getState() {
        return this.state;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedStateRecyclerViewAdapter
    public void setState(int i) {
        this.state = i;
        if (i == 0) {
            XRecyclerView xRecyclerView = this.xRecyclerView;
            if (xRecyclerView != null) {
                xRecyclerView.setEnabledScroll(true);
            }
            this.g = 0;
        } else if (i == 1 || i == 2 || i == 3) {
            XRecyclerView xRecyclerView2 = this.xRecyclerView;
            if (xRecyclerView2 != null) {
                xRecyclerView2.setEnabledScroll(false);
            }
            this.g = 1;
        }
        notifyDataSetChanged();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedStateRecyclerViewAdapter, com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder, int i) {
        int i2 = this.g;
        if (i2 != 1 || i2 + i != getA()) {
            viewHolder(helperRecyclerViewHolder, i);
            return;
        }
        int i3 = this.state;
        if (i3 == 1) {
            onBindLoadingViewHolder(helperRecyclerViewHolder);
        } else if (i3 == 2) {
            onBindEmptyViewHolder(helperRecyclerViewHolder);
        } else {
            if (i3 != 3) {
                return;
            }
            onBindErrorViewHolder(helperRecyclerViewHolder);
        }
    }

    public GroupedAppendStateRecyclerViewAdapter(Context context) {
        super(context);
        this.g = 0;
    }
}
