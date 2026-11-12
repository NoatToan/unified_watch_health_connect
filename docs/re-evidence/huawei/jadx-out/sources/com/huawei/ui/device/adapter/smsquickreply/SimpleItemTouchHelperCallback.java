package com.huawei.ui.device.adapter.smsquickreply;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.R;

/* JADX INFO: loaded from: classes16.dex */
public class SimpleItemTouchHelperCallback extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ItemTouchHelperAdapter f24891a;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return true;
    }

    public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter itemTouchHelperAdapter) {
        this.f24891a = itemTouchHelperAdapter;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        this.f24891a.onItemMove(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder == null) {
            LogUtil.j("SimpleItemTouchHelperCallback", "onSelectedChanged viewHolder is null");
            return;
        }
        if (i != 0 && (viewHolder instanceof SmsItemMoveAdapter.SlideViewHolder)) {
            ((SmsItemMoveAdapter.SlideViewHolder) viewHolder).itemView.setBackgroundColor(BaseApplication.b().getColor(R.color.transparent));
        }
        super.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            LogUtil.j("SimpleItemTouchHelperCallback", "clearView viewHolder is null");
            return;
        }
        super.clearView(recyclerView, viewHolder);
        if (viewHolder instanceof SmsItemMoveAdapter.SlideViewHolder) {
            ((SmsItemMoveAdapter.SlideViewHolder) viewHolder).itemView.setBackgroundColor(BaseApplication.b().getColor(R.color.transparent));
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.d("SimpleItemTouchHelperCallback", "onSwiped");
    }
}
