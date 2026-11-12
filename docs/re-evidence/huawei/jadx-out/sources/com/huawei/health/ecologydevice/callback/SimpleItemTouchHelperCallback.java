package com.huawei.health.ecologydevice.callback;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleItemTouchHelperCallback extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ItemTouchHelperAdapter f6473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6474b = false;

    public interface ItemTouchHelperAdapter {
        void onItemMove(int i, int i2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter itemTouchHelperAdapter) {
        this.f6473a = itemTouchHelperAdapter;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (this.f6474b) {
            return makeMovementFlags(3, 4);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        this.f6473a.onItemMove(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        this.f6474b = false;
    }

    public void d(boolean z) {
        this.f6474b = z;
    }
}
