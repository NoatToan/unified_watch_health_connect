package com.huami.stress.domain.data.remote.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/stress/domain/data/remote/bean/GetSingleStressListResponse;", "", "", "Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "component1", "component2", "items", "next", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", "Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "getNext", "()Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "<init>", "(Ljava/util/List;Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GetSingleStressListResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("items")
    @NotNull
    private final List<SingleStressApiBean> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("next")
    @Nullable
    private final SingleStressApiBean next;

    /* JADX WARN: Multi-variable type inference failed */
    public GetSingleStressListResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public GetSingleStressListResponse(@NotNull List<SingleStressApiBean> list, @Nullable SingleStressApiBean singleStressApiBean) {
        this.items = list;
        this.next = singleStressApiBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSingleStressListResponse copy$default(GetSingleStressListResponse getSingleStressListResponse, List list, SingleStressApiBean singleStressApiBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getSingleStressListResponse.items;
        }
        if ((i & 2) != 0) {
            singleStressApiBean = getSingleStressListResponse.next;
        }
        return getSingleStressListResponse.copy(list, singleStressApiBean);
    }

    @NotNull
    public final List<SingleStressApiBean> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SingleStressApiBean getNext() {
        return this.next;
    }

    @NotNull
    public final GetSingleStressListResponse copy(@NotNull List<SingleStressApiBean> items, @Nullable SingleStressApiBean next) {
        return new GetSingleStressListResponse(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSingleStressListResponse)) {
            return false;
        }
        GetSingleStressListResponse getSingleStressListResponse = (GetSingleStressListResponse) other;
        return Intrinsics.areEqual(this.items, getSingleStressListResponse.items) && Intrinsics.areEqual(this.next, getSingleStressListResponse.next);
    }

    @NotNull
    public final List<SingleStressApiBean> getItems() {
        return this.items;
    }

    @Nullable
    public final SingleStressApiBean getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        SingleStressApiBean singleStressApiBean = this.next;
        return iHashCode + (singleStressApiBean == null ? 0 : singleStressApiBean.hashCode());
    }

    @NotNull
    public String toString() {
        return "GetSingleStressListResponse(items=" + this.items + ", next=" + this.next + ')';
    }

    public /* synthetic */ GetSingleStressListResponse(List list, SingleStressApiBean singleStressApiBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : singleStressApiBean);
    }
}
