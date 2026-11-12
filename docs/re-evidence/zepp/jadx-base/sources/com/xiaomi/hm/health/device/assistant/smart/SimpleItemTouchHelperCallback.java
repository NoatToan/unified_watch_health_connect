package com.xiaomi.hm.health.device.assistant.smart;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/SimpleItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "", "isLongPressDragEnabled", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "direction", "", "onSwiped", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "getMovementFlags", "target", "onMove", "current", "canDropOver", "actionState", "onSelectedChanged", "clearView", "isItemViewSwipeEnabled", "Lcom/xiaomi/hm/health/device/assistant/smart/ItemTouchHelperAdapter;", "a", "Lcom/xiaomi/hm/health/device/assistant/smart/ItemTouchHelperAdapter;", "adapter", "b", "Z", "getLongPressEnable", "()Z", "setLongPressEnable", "(Z)V", "longPressEnable", "<init>", "(Lcom/xiaomi/hm/health/device/assistant/smart/ItemTouchHelperAdapter;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SimpleItemTouchHelperCallback extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ItemTouchHelperAdapter adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean longPressEnable = true;

    public SimpleItemTouchHelperCallback(@NotNull ItemTouchHelperAdapter itemTouchHelperAdapter) {
        this.adapter = itemTouchHelperAdapter;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean canDropOver(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder current, @NotNull RecyclerView.ViewHolder target) {
        return this.adapter.canDropOver(recyclerView, current, target);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        this.adapter.onSelectedChanged(viewHolder, false);
    }

    public final boolean getLongPressEnable() {
        return this.longPressEnable;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        return ItemTouchHelper.Callback.makeMovementFlags(this.adapter.canMove(viewHolder) ? 3 : 0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isItemViewSwipeEnabled */
    public boolean getIsEnableSwipe() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isLongPressDragEnabled */
    public boolean getIsEnableDrag() {
        return this.longPressEnable;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder target) {
        if (!this.adapter.canMove(viewHolder)) {
            return false;
        }
        this.adapter.onItemMove(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        if (viewHolder == null) {
            return;
        }
        this.adapter.onSelectedChanged(viewHolder, actionState == 2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int direction) {
        this.adapter.onItemDismiss(viewHolder.getAdapterPosition());
    }

    public final void setLongPressEnable(boolean z) {
        this.longPressEnable = z;
    }
}
