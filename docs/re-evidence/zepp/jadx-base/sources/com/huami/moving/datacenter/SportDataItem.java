package com.huami.moving.datacenter;

import com.huami.moving.config.DataItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/huami/moving/datacenter/SportDataItem;", "", "Lcom/huami/moving/config/DataItem;", "component1", "", "component2", "()Ljava/lang/Double;", "item", "value", "copy", "(Lcom/huami/moving/config/DataItem;Ljava/lang/Double;)Lcom/huami/moving/datacenter/SportDataItem;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/moving/config/DataItem;", "getItem", "()Lcom/huami/moving/config/DataItem;", "b", "Ljava/lang/Double;", "getValue", "<init>", "(Lcom/huami/moving/config/DataItem;Ljava/lang/Double;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportDataItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DataItem item;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Double value;

    public SportDataItem(@NotNull DataItem dataItem, @Nullable Double d) {
        this.item = dataItem;
        this.value = d;
    }

    public static /* synthetic */ SportDataItem copy$default(SportDataItem sportDataItem, DataItem dataItem, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            dataItem = sportDataItem.item;
        }
        if ((i & 2) != 0) {
            d = sportDataItem.value;
        }
        return sportDataItem.copy(dataItem, d);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataItem getItem() {
        return this.item;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    @NotNull
    public final SportDataItem copy(@NotNull DataItem item, @Nullable Double value) {
        return new SportDataItem(item, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportDataItem)) {
            return false;
        }
        SportDataItem sportDataItem = (SportDataItem) other;
        return Intrinsics.areEqual(this.item, sportDataItem.item) && Intrinsics.areEqual((Object) this.value, (Object) sportDataItem.value);
    }

    @NotNull
    public final DataItem getItem() {
        return this.item;
    }

    @Nullable
    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.item.hashCode() * 31;
        Double d = this.value;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    @NotNull
    public String toString() {
        return "SportDataItem(item=" + this.item + ", value=" + this.value + ")";
    }
}
