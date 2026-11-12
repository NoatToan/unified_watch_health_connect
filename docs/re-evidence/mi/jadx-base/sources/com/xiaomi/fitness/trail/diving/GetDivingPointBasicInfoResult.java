package com.xiaomi.fitness.trail.diving;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/trail/diving/GetDivingPointBasicInfoResult;", "", "diveAreaId", "", "diveCountryId", "<init>", "(II)V", "getDiveAreaId", "()I", "getDiveCountryId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetDivingPointBasicInfoResult {

    @SerializedName("dive_point_id")
    private final int diveAreaId;

    @SerializedName("dive_country_id")
    private final int diveCountryId;

    public GetDivingPointBasicInfoResult(int i, int i2) {
        this.diveAreaId = i;
        this.diveCountryId = i2;
    }

    public static /* synthetic */ GetDivingPointBasicInfoResult copy$default(GetDivingPointBasicInfoResult getDivingPointBasicInfoResult, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = getDivingPointBasicInfoResult.diveAreaId;
        }
        if ((i3 & 2) != 0) {
            i2 = getDivingPointBasicInfoResult.diveCountryId;
        }
        return getDivingPointBasicInfoResult.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDiveAreaId() {
        return this.diveAreaId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDiveCountryId() {
        return this.diveCountryId;
    }

    @NotNull
    public final GetDivingPointBasicInfoResult copy(int diveAreaId, int diveCountryId) {
        return new GetDivingPointBasicInfoResult(diveAreaId, diveCountryId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDivingPointBasicInfoResult)) {
            return false;
        }
        GetDivingPointBasicInfoResult getDivingPointBasicInfoResult = (GetDivingPointBasicInfoResult) other;
        return this.diveAreaId == getDivingPointBasicInfoResult.diveAreaId && this.diveCountryId == getDivingPointBasicInfoResult.diveCountryId;
    }

    public final int getDiveAreaId() {
        return this.diveAreaId;
    }

    public final int getDiveCountryId() {
        return this.diveCountryId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.diveAreaId) * 31) + Integer.hashCode(this.diveCountryId);
    }

    @NotNull
    public String toString() {
        return "GetDivingPointBasicInfoResult(diveAreaId=" + this.diveAreaId + ", diveCountryId=" + this.diveCountryId + ")";
    }
}
