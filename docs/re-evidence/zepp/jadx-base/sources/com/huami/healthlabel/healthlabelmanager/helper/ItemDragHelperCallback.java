package com.huami.healthlabel.healthlabelmanager.helper;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huami.healthlabel.healthlabelmanager.adapter.HealthLabelEditAdapter;

/* JADX INFO: loaded from: classes9.dex */
public class ItemDragHelperCallback extends ItemTouchHelper.Callback {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof OnDragVHListener) {
            ((OnDragVHListener) viewHolder).onItemFinish();
        }
        super.clearView(recyclerView, viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        return ItemTouchHelper.Callback.makeMovementFlags(((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof StaggeredGridLayoutManager)) ? 15 : 3, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isItemViewSwipeEnabled */
    public boolean getIsEnableSwipe() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isLongPressDragEnabled */
    public boolean getIsEnableDrag() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        if (recyclerView.getAdapter() instanceof HealthLabelEditAdapter) {
            HealthLabelEditAdapter healthLabelEditAdapter = (HealthLabelEditAdapter) recyclerView.getAdapter();
            int notInHomePosition = healthLabelEditAdapter.getNotInHomePosition();
            int size = healthLabelEditAdapter.getData().subList(1, notInHomePosition).size();
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            if (size <= 20 && adapterPosition < notInHomePosition && adapterPosition2 >= notInHomePosition) {
                return false;
            }
        }
        if (recyclerView.getAdapter() instanceof OnItemMoveListener) {
            ((OnItemMoveListener) recyclerView.getAdapter()).onItemMove(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        if (actionState != 0 && (viewHolder instanceof OnDragVHListener)) {
            ((OnDragVHListener) viewHolder).onItemSelected();
        }
        super.onSelectedChanged(viewHolder, actionState);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
    }
}
