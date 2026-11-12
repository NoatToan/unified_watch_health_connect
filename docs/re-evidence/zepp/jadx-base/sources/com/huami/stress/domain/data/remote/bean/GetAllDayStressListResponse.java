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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/stress/domain/data/remote/bean/GetAllDayStressListResponse;", "", "", "Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "component1", "component2", "items", "next", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", "Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "getNext", "()Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "<init>", "(Ljava/util/List;Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GetAllDayStressListResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("items")
    @NotNull
    private final List<AllDayStressApiBean> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("next")
    @Nullable
    private final AllDayStressApiBean next;

    /* JADX WARN: Multi-variable type inference failed */
    public GetAllDayStressListResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public GetAllDayStressListResponse(@NotNull List<AllDayStressApiBean> list, @Nullable AllDayStressApiBean allDayStressApiBean) {
        this.items = list;
        this.next = allDayStressApiBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAllDayStressListResponse copy$default(GetAllDayStressListResponse getAllDayStressListResponse, List list, AllDayStressApiBean allDayStressApiBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getAllDayStressListResponse.items;
        }
        if ((i & 2) != 0) {
            allDayStressApiBean = getAllDayStressListResponse.next;
        }
        return getAllDayStressListResponse.copy(list, allDayStressApiBean);
    }

    @NotNull
    public final List<AllDayStressApiBean> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AllDayStressApiBean getNext() {
        return this.next;
    }

    @NotNull
    public final GetAllDayStressListResponse copy(@NotNull List<AllDayStressApiBean> items, @Nullable AllDayStressApiBean next) {
        return new GetAllDayStressListResponse(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAllDayStressListResponse)) {
            return false;
        }
        GetAllDayStressListResponse getAllDayStressListResponse = (GetAllDayStressListResponse) other;
        return Intrinsics.areEqual(this.items, getAllDayStressListResponse.items) && Intrinsics.areEqual(this.next, getAllDayStressListResponse.next);
    }

    @NotNull
    public final List<AllDayStressApiBean> getItems() {
        return this.items;
    }

    @Nullable
    public final AllDayStressApiBean getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        AllDayStressApiBean allDayStressApiBean = this.next;
        return iHashCode + (allDayStressApiBean == null ? 0 : allDayStressApiBean.hashCode());
    }

    @NotNull
    public String toString() {
        return "GetAllDayStressListResponse(items=" + this.items + ", next=" + this.next + ')';
    }

    public /* synthetic */ GetAllDayStressListResponse(List list, AllDayStressApiBean allDayStressApiBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : allDayStressApiBean);
    }
}
