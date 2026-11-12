package com.zhouyou.recyclerview.manager;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhouyou.recyclerview.adapter.HelperStateRecyclerViewAdapter;
import com.zhouyou.recyclerview.group.GroupedStateRecyclerViewAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class StateGridLayoutManager extends GridLayoutManager {
    private static final int b = 1;
    private int a;

    public StateGridLayoutManager(Context context, int i) {
        super(context, 1);
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        setSpanCount((getItemCount() != 1 || (adapter != null && (((adapter instanceof HelperStateRecyclerViewAdapter) || (adapter instanceof GroupedStateRecyclerViewAdapter)) && ((HelperStateRecyclerViewAdapter) adapter).getState() == 0))) ? this.a : 1);
        super.onItemsChanged(recyclerView);
    }

    public StateGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, 1, i2, z);
        this.a = i;
    }
}
