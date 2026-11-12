package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetFitnessDataByWM;", "", "phoneId", "", "waterMark", "", "<init>", "(Ljava/lang/String;J)V", "getPhoneId", "()Ljava/lang/String;", "getWaterMark", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetFitnessDataByWM {

    @SerializedName("phone_id")
    @NotNull
    private final String phoneId;

    @SerializedName("watermark")
    private final long waterMark;

    public GetFitnessDataByWM(@NotNull String phoneId, long j) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        this.phoneId = phoneId;
        this.waterMark = j;
    }

    public static /* synthetic */ GetFitnessDataByWM copy$default(GetFitnessDataByWM getFitnessDataByWM, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFitnessDataByWM.phoneId;
        }
        if ((i & 2) != 0) {
            j = getFitnessDataByWM.waterMark;
        }
        return getFitnessDataByWM.copy(str, j);
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

    @NotNull
    public final GetFitnessDataByWM copy(@NotNull String phoneId, long waterMark) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        return new GetFitnessDataByWM(phoneId, waterMark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetFitnessDataByWM)) {
            return false;
        }
        GetFitnessDataByWM getFitnessDataByWM = (GetFitnessDataByWM) other;
        return Intrinsics.areEqual(this.phoneId, getFitnessDataByWM.phoneId) && this.waterMark == getFitnessDataByWM.waterMark;
    }

    @NotNull
    public final String getPhoneId() {
        return this.phoneId;
    }

    public final long getWaterMark() {
        return this.waterMark;
    }

    public int hashCode() {
        return (this.phoneId.hashCode() * 31) + Long.hashCode(this.waterMark);
    }

    @NotNull
    public String toString() {
        return "GetFitnessDataByWM(phoneId=" + this.phoneId + ", waterMark=" + this.waterMark + ")";
    }
}
