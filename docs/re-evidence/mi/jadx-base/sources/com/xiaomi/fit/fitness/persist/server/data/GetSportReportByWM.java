package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetSportReportByWM;", "", "phoneId", "", "waterMark", "", "limit", "", "<init>", "(Ljava/lang/String;JLjava/lang/Integer;)V", "getPhoneId", "()Ljava/lang/String;", "getWaterMark", "()J", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;JLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/persist/server/data/GetSportReportByWM;", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetSportReportByWM {

    @SerializedName("limit")
    @Nullable
    private final Integer limit;

    @SerializedName("phone_id")
    @NotNull
    private final String phoneId;

    @SerializedName("watermark")
    private final long waterMark;

    public GetSportReportByWM(@NotNull String phoneId, long j, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        this.phoneId = phoneId;
        this.waterMark = j;
        this.limit = num;
    }

    public static /* synthetic */ GetSportReportByWM copy$default(GetSportReportByWM getSportReportByWM, String str, long j, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSportReportByWM.phoneId;
        }
        if ((i & 2) != 0) {
            j = getSportReportByWM.waterMark;
        }
        if ((i & 4) != 0) {
            num = getSportReportByWM.limit;
        }
        return getSportReportByWM.copy(str, j, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWaterMark() {
        return this.waterMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final GetSportReportByWM copy(@NotNull String phoneId, long waterMark, @Nullable Integer limit) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        return new GetSportReportByWM(phoneId, waterMark, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSportReportByWM)) {
            return false;
        }
        GetSportReportByWM getSportReportByWM = (GetSportReportByWM) other;
        return Intrinsics.areEqual(this.phoneId, getSportReportByWM.phoneId) && this.waterMark == getSportReportByWM.waterMark && Intrinsics.areEqual(this.limit, getSportReportByWM.limit);
    }

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getPhoneId() {
        return this.phoneId;
    }

    public final long getWaterMark() {
        return this.waterMark;
    }

    public int hashCode() {
        int iHashCode = ((this.phoneId.hashCode() * 31) + Long.hashCode(this.waterMark)) * 31;
        Integer num = this.limit;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "GetSportReportByWM(phoneId=" + this.phoneId + ", waterMark=" + this.waterMark + ", limit=" + this.limit + ")";
    }
}
