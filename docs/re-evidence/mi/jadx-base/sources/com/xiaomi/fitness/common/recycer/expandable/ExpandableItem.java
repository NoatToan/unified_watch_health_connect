package com.xiaomi.fitness.common.recycer.expandable;

import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;", "T", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "", "<init>", "()V", "headItem", "Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;", "getHeadItem", "()Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;", "setHeadItem", "(Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;)V", "itemDetail", "getItemDetail", "()Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "setItemDetail", "(Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;)V", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "setHeader", "item", "setItemData", "(Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;)Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpandableItem<T extends ExpandableBaseDataItem> {

    @Nullable
    private HeaderItem headItem;

    @Nullable
    private T itemDetail;

    @Nullable
    public final HeaderItem getHeadItem() {
        return this.headItem;
    }

    @Nullable
    public final T getItemDetail() {
        return this.itemDetail;
    }

    public final void setHeadItem(@Nullable HeaderItem headerItem) {
        this.headItem = headerItem;
    }

    @NotNull
    public final ExpandableItem<T> setHeader(@NotNull HeaderItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.headItem = item;
        return this;
    }

    @NotNull
    public final ExpandableItem<T> setItemData(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.itemDetail = item;
        return this;
    }

    public final void setItemDetail(@Nullable T t) {
        this.itemDetail = t;
    }
}
