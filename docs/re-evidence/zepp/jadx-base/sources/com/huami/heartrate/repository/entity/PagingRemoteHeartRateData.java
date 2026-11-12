package com.huami.heartrate.repository.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J.\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R!\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/heartrate/repository/entity/PagingRemoteHeartRateData;", "", "", "component1", "()Ljava/lang/Long;", "", "Lcom/huami/heartrate/repository/entity/RemoteHeartRateItem;", "component2", "next", "items", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lcom/huami/heartrate/repository/entity/PagingRemoteHeartRateData;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Long;", "getNext", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PagingRemoteHeartRateData {

    @Nullable
    private final List<RemoteHeartRateItem> items;

    @Nullable
    private final Long next;

    public PagingRemoteHeartRateData(@Nullable Long l, @Nullable List<RemoteHeartRateItem> list) {
        this.next = l;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PagingRemoteHeartRateData copy$default(PagingRemoteHeartRateData pagingRemoteHeartRateData, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = pagingRemoteHeartRateData.next;
        }
        if ((i & 2) != 0) {
            list = pagingRemoteHeartRateData.items;
        }
        return pagingRemoteHeartRateData.copy(l, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getNext() {
        return this.next;
    }

    @Nullable
    public final List<RemoteHeartRateItem> component2() {
        return this.items;
    }

    @NotNull
    public final PagingRemoteHeartRateData copy(@Nullable Long next, @Nullable List<RemoteHeartRateItem> items) {
        return new PagingRemoteHeartRateData(next, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagingRemoteHeartRateData)) {
            return false;
        }
        PagingRemoteHeartRateData pagingRemoteHeartRateData = (PagingRemoteHeartRateData) other;
        return Intrinsics.areEqual(this.next, pagingRemoteHeartRateData.next) && Intrinsics.areEqual(this.items, pagingRemoteHeartRateData.items);
    }

    @Nullable
    public final List<RemoteHeartRateItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Long getNext() {
        return this.next;
    }

    public int hashCode() {
        Long l = this.next;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<RemoteHeartRateItem> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PagingRemoteHeartRateData(next=" + this.next + ", items=" + this.items + ")";
    }
}
