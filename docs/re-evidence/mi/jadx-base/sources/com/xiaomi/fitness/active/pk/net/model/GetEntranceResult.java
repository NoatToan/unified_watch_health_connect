package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/GetEntranceResult;", "", "pkRecordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "pkCount", "", "<init>", "(Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;I)V", "getPkRecordDetail", "()Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "getPkCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetEntranceResult {

    @SerializedName("pk_count")
    private final int pkCount;

    @SerializedName("pk_record_detail")
    @Nullable
    private final PkRecordDetail pkRecordDetail;

    public GetEntranceResult(@Nullable PkRecordDetail pkRecordDetail, int i) {
        this.pkRecordDetail = pkRecordDetail;
        this.pkCount = i;
    }

    public static /* synthetic */ GetEntranceResult copy$default(GetEntranceResult getEntranceResult, PkRecordDetail pkRecordDetail, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pkRecordDetail = getEntranceResult.pkRecordDetail;
        }
        if ((i2 & 2) != 0) {
            i = getEntranceResult.pkCount;
        }
        return getEntranceResult.copy(pkRecordDetail, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PkRecordDetail getPkRecordDetail() {
        return this.pkRecordDetail;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPkCount() {
        return this.pkCount;
    }

    @NotNull
    public final GetEntranceResult copy(@Nullable PkRecordDetail pkRecordDetail, int pkCount) {
        return new GetEntranceResult(pkRecordDetail, pkCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetEntranceResult)) {
            return false;
        }
        GetEntranceResult getEntranceResult = (GetEntranceResult) other;
        return Intrinsics.areEqual(this.pkRecordDetail, getEntranceResult.pkRecordDetail) && this.pkCount == getEntranceResult.pkCount;
    }

    public final int getPkCount() {
        return this.pkCount;
    }

    @Nullable
    public final PkRecordDetail getPkRecordDetail() {
        return this.pkRecordDetail;
    }

    public int hashCode() {
        PkRecordDetail pkRecordDetail = this.pkRecordDetail;
        return ((pkRecordDetail == null ? 0 : pkRecordDetail.hashCode()) * 31) + Integer.hashCode(this.pkCount);
    }

    @NotNull
    public String toString() {
        return "GetEntranceResult(pkRecordDetail=" + this.pkRecordDetail + ", pkCount=" + this.pkCount + ")";
    }
}
