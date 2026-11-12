package com.xiaomi.fitness.electronic.scale.export.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/WeightAccountList;", "Ljava/io/Serializable;", "itemList", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/WeightAccount;", "<init>", "(Ljava/util/List;)V", "getItemList", "()Ljava/util/List;", "setItemList", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeightAccountList implements Serializable {

    @NotNull
    private List<WeightAccount> itemList;

    /* JADX WARN: Multi-variable type inference failed */
    public WeightAccountList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightAccountList copy$default(WeightAccountList weightAccountList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = weightAccountList.itemList;
        }
        return weightAccountList.copy(list);
    }

    @NotNull
    public final List<WeightAccount> component1() {
        return this.itemList;
    }

    @NotNull
    public final WeightAccountList copy(@NotNull List<WeightAccount> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        return new WeightAccountList(itemList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WeightAccountList) && Intrinsics.areEqual(this.itemList, ((WeightAccountList) other).itemList);
    }

    @NotNull
    public final List<WeightAccount> getItemList() {
        return this.itemList;
    }

    public int hashCode() {
        return this.itemList.hashCode();
    }

    public final void setItemList(@NotNull List<WeightAccount> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.itemList = list;
    }

    @NotNull
    public String toString() {
        return "WeightAccountList(itemList=" + this.itemList + ")";
    }

    public WeightAccountList(@NotNull List<WeightAccount> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        this.itemList = itemList;
    }

    public /* synthetic */ WeightAccountList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
