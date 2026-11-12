package com.xiaomi.fitness.mine.v4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/ItemDiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;)Z", "areContentsTheSame", "<init>", "()V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ItemDiffCallback extends androidx.recyclerview.widget.h.f<MineItemListModel.MineItem> {
    @Override // androidx.recyclerview.widget.h.f
    public boolean areContentsTheSame(@NotNull MineItemListModel.MineItem oldItem, @NotNull MineItemListModel.MineItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getType() == newItem.getType();
    }

    @Override // androidx.recyclerview.widget.h.f
    public boolean areItemsTheSame(@NotNull MineItemListModel.MineItem oldItem, @NotNull MineItemListModel.MineItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getType() == newItem.getType();
    }
}
