package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/ItemDragHelperCallback;", "Landroidx/recyclerview/widget/l$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "target", "", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "", "direction", "", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/DragItemClickCallback;", "dragCallback", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/DragItemClickCallback;", "getDragCallback", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/DragItemClickCallback;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/DragItemClickCallback;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ItemDragHelperCallback extends l.h {

    @NotNull
    private final DragItemClickCallback dragCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDragHelperCallback(@NotNull DragItemClickCallback dragCallback) {
        super(3, 0);
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
    public final DragItemClickCallback getDragCallback() {
        return this.dragCallback;
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, @NotNull RecyclerView.d0 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return this.dragCallback.onMove(viewHolder.getBindingAdapterPosition(), target.getBindingAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSwiped(@NotNull RecyclerView.d0 viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
