package com.huami.heartrate.repository.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/heartrate/repository/entity/RemoteHeartRateData;", "", "", "Lcom/huami/heartrate/repository/entity/RemoteHeartRateItem;", "component1", "items", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RemoteHeartRateData {

    @Nullable
    private final List<RemoteHeartRateItem> items;

    public RemoteHeartRateData(@Nullable List<RemoteHeartRateItem> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteHeartRateData copy$default(RemoteHeartRateData remoteHeartRateData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = remoteHeartRateData.items;
        }
        return remoteHeartRateData.copy(list);
    }

    @Nullable
    public final List<RemoteHeartRateItem> component1() {
        return this.items;
    }

    @NotNull
    public final RemoteHeartRateData copy(@Nullable List<RemoteHeartRateItem> items) {
        return new RemoteHeartRateData(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RemoteHeartRateData) && Intrinsics.areEqual(this.items, ((RemoteHeartRateData) other).items);
    }

    @Nullable
    public final List<RemoteHeartRateItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<RemoteHeartRateItem> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "RemoteHeartRateData(items=" + this.items + ")";
    }
}
