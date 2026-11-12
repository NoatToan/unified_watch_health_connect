package com.xiaomi.fitness.common.recycer.adapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/adapter/ItemDragLongClickHelperCallback;", "Landroidx/recyclerview/widget/l$e;", "", "isLongPressDragEnabled", "()Z", "isItemViewSwipeEnabled", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)I", "target", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "direction", "", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "Lcom/xiaomi/fitness/common/recycer/adapter/DragItemLongClickCallback;", "dragCallback", "Lcom/xiaomi/fitness/common/recycer/adapter/DragItemLongClickCallback;", "getDragCallback", "()Lcom/xiaomi/fitness/common/recycer/adapter/DragItemLongClickCallback;", "<init>", "(Lcom/xiaomi/fitness/common/recycer/adapter/DragItemLongClickCallback;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ItemDragLongClickHelperCallback extends l.e {

    @NotNull
    private final DragItemLongClickCallback dragCallback;

    public ItemDragLongClickHelperCallback(@NotNull DragItemLongClickCallback dragCallback) {
        Intrinsics.checkNotNullParameter(dragCallback, "dragCallback");
        this.dragCallback = dragCallback;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        this.dragCallback.clearView();
    }

    @NotNull
    public final DragItemLongClickCallback getDragCallback() {
        return this.dragCallback;
    }

    @Override // androidx.recyclerview.widget.l.e
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return (viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 2) ? l.e.makeMovementFlags(0, 0) : l.e.makeFlag(2, 15);
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, @NotNull RecyclerView.d0 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return this.dragCallback.onMove(viewHolder.getAdapterPosition(), target.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSwiped(@NotNull RecyclerView.d0 viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
