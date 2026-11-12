package com.xiaomi.fit.fitness.request;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/request/GetLastSyncItem;", "", "itemList", "", "Lcom/xiaomi/fit/fitness/request/LastSyncItem;", "<init>", "(Ljava/util/List;)V", "getItemList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetLastSyncItem {

    @SerializedName("last_sync_times")
    @Nullable
    private final List<LastSyncItem> itemList;

    public GetLastSyncItem(@Nullable List<LastSyncItem> list) {
        this.itemList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetLastSyncItem copy$default(GetLastSyncItem getLastSyncItem, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getLastSyncItem.itemList;
        }
        return getLastSyncItem.copy(list);
    }

    @Nullable
    public final List<LastSyncItem> component1() {
        return this.itemList;
    }

    @NotNull
    public final GetLastSyncItem copy(@Nullable List<LastSyncItem> itemList) {
        return new GetLastSyncItem(itemList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetLastSyncItem) && Intrinsics.areEqual(this.itemList, ((GetLastSyncItem) other).itemList);
    }

    @Nullable
    public final List<LastSyncItem> getItemList() {
        return this.itemList;
    }

    public int hashCode() {
        List<LastSyncItem> list = this.itemList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetLastSyncItem(itemList=" + this.itemList + ")";
    }
}
