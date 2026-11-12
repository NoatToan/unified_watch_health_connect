package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/GetHistoryPkRecordsResult;", "", "pkList", "", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "nextKey", "", "<init>", "(Ljava/util/List;I)V", "getPkList", "()Ljava/util/List;", "getNextKey", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetHistoryPkRecordsResult {

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    private final int nextKey;

    @SerializedName("pk_list")
    @Nullable
    private final List<PkRecordDetail> pkList;

    public GetHistoryPkRecordsResult(@Nullable List<PkRecordDetail> list, int i) {
        this.pkList = list;
        this.nextKey = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetHistoryPkRecordsResult copy$default(GetHistoryPkRecordsResult getHistoryPkRecordsResult, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = getHistoryPkRecordsResult.pkList;
        }
        if ((i2 & 2) != 0) {
            i = getHistoryPkRecordsResult.nextKey;
        }
        return getHistoryPkRecordsResult.copy(list, i);
    }

    @Nullable
    public final List<PkRecordDetail> component1() {
        return this.pkList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final GetHistoryPkRecordsResult copy(@Nullable List<PkRecordDetail> pkList, int nextKey) {
        return new GetHistoryPkRecordsResult(pkList, nextKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetHistoryPkRecordsResult)) {
            return false;
        }
        GetHistoryPkRecordsResult getHistoryPkRecordsResult = (GetHistoryPkRecordsResult) other;
        return Intrinsics.areEqual(this.pkList, getHistoryPkRecordsResult.pkList) && this.nextKey == getHistoryPkRecordsResult.nextKey;
    }

    public final int getNextKey() {
        return this.nextKey;
    }

    @Nullable
    public final List<PkRecordDetail> getPkList() {
        return this.pkList;
    }

    public int hashCode() {
        List<PkRecordDetail> list = this.pkList;
        return ((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.nextKey);
    }

    @NotNull
    public String toString() {
        return "GetHistoryPkRecordsResult(pkList=" + this.pkList + ", nextKey=" + this.nextKey + ")";
    }
}
