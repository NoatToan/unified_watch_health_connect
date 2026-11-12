package com.xiaomi.fit.fitness.device.cgm.thirdparty;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseResponse;", "", "cgmStatus", "Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmStatus;", "cgmData", "Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmData;", "<init>", "(Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmStatus;Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmData;)V", "getCgmStatus", "()Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmStatus;", "setCgmStatus", "(Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmStatus;)V", "getCgmData", "()Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmData;", "setCgmData", "(Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmData;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThirdPartyGlucoseResponse {

    @SerializedName("cgm_data")
    @Nullable
    private ThirdPartyCgmData cgmData;

    @SerializedName("cgm_status")
    @Nullable
    private ThirdPartyCgmStatus cgmStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyGlucoseResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ThirdPartyGlucoseResponse copy$default(ThirdPartyGlucoseResponse thirdPartyGlucoseResponse, ThirdPartyCgmStatus thirdPartyCgmStatus, ThirdPartyCgmData thirdPartyCgmData, int i, Object obj) {
        if ((i & 1) != 0) {
            thirdPartyCgmStatus = thirdPartyGlucoseResponse.cgmStatus;
        }
        if ((i & 2) != 0) {
            thirdPartyCgmData = thirdPartyGlucoseResponse.cgmData;
        }
        return thirdPartyGlucoseResponse.copy(thirdPartyCgmStatus, thirdPartyCgmData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ThirdPartyCgmStatus getCgmStatus() {
        return this.cgmStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ThirdPartyCgmData getCgmData() {
        return this.cgmData;
    }

    @NotNull
    public final ThirdPartyGlucoseResponse copy(@Nullable ThirdPartyCgmStatus cgmStatus, @Nullable ThirdPartyCgmData cgmData) {
        return new ThirdPartyGlucoseResponse(cgmStatus, cgmData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyGlucoseResponse)) {
            return false;
        }
        ThirdPartyGlucoseResponse thirdPartyGlucoseResponse = (ThirdPartyGlucoseResponse) other;
        return Intrinsics.areEqual(this.cgmStatus, thirdPartyGlucoseResponse.cgmStatus) && Intrinsics.areEqual(this.cgmData, thirdPartyGlucoseResponse.cgmData);
    }

    @Nullable
    public final ThirdPartyCgmData getCgmData() {
        return this.cgmData;
    }

    @Nullable
    public final ThirdPartyCgmStatus getCgmStatus() {
        return this.cgmStatus;
    }

    public int hashCode() {
        ThirdPartyCgmStatus thirdPartyCgmStatus = this.cgmStatus;
        int iHashCode = (thirdPartyCgmStatus == null ? 0 : thirdPartyCgmStatus.hashCode()) * 31;
        ThirdPartyCgmData thirdPartyCgmData = this.cgmData;
        return iHashCode + (thirdPartyCgmData != null ? thirdPartyCgmData.hashCode() : 0);
    }

    public final void setCgmData(@Nullable ThirdPartyCgmData thirdPartyCgmData) {
        this.cgmData = thirdPartyCgmData;
    }

    public final void setCgmStatus(@Nullable ThirdPartyCgmStatus thirdPartyCgmStatus) {
        this.cgmStatus = thirdPartyCgmStatus;
    }

    @NotNull
    public String toString() {
        return "ThirdPartyGlucoseResponse(cgmStatus=" + this.cgmStatus + ", cgmData=" + this.cgmData + ")";
    }

    public ThirdPartyGlucoseResponse(@Nullable ThirdPartyCgmStatus thirdPartyCgmStatus, @Nullable ThirdPartyCgmData thirdPartyCgmData) {
        this.cgmStatus = thirdPartyCgmStatus;
        this.cgmData = thirdPartyCgmData;
    }

    public /* synthetic */ ThirdPartyGlucoseResponse(ThirdPartyCgmStatus thirdPartyCgmStatus, ThirdPartyCgmData thirdPartyCgmData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : thirdPartyCgmStatus, (i & 2) != 0 ? null : thirdPartyCgmData);
    }
}
