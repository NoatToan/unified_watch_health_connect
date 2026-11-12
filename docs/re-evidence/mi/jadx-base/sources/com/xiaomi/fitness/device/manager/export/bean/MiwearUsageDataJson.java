package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/MiwearUsageDataJson;", "", "deviceAppId", "", "durationSec", "", "from", "<init>", "(Ljava/lang/String;II)V", "getDeviceAppId", "()Ljava/lang/String;", "setDeviceAppId", "(Ljava/lang/String;)V", "getDurationSec", "()I", "setDurationSec", "(I)V", "getFrom", "setFrom", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MiwearUsageDataJson {

    @SerializedName("device_app_id")
    @NotNull
    private String deviceAppId;

    @SerializedName("duration_sec")
    private int durationSec;

    @SerializedName("from")
    private int from;

    public MiwearUsageDataJson(@NotNull String deviceAppId, int i, int i2) {
        Intrinsics.checkNotNullParameter(deviceAppId, "deviceAppId");
        this.deviceAppId = deviceAppId;
        this.durationSec = i;
        this.from = i2;
    }

    public static /* synthetic */ MiwearUsageDataJson copy$default(MiwearUsageDataJson miwearUsageDataJson, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = miwearUsageDataJson.deviceAppId;
        }
        if ((i3 & 2) != 0) {
            i = miwearUsageDataJson.durationSec;
        }
        if ((i3 & 4) != 0) {
            i2 = miwearUsageDataJson.from;
        }
        return miwearUsageDataJson.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceAppId() {
        return this.deviceAppId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDurationSec() {
        return this.durationSec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrom() {
        return this.from;
    }

    @NotNull
    public final MiwearUsageDataJson copy(@NotNull String deviceAppId, int durationSec, int from) {
        Intrinsics.checkNotNullParameter(deviceAppId, "deviceAppId");
        return new MiwearUsageDataJson(deviceAppId, durationSec, from);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiwearUsageDataJson)) {
            return false;
        }
        MiwearUsageDataJson miwearUsageDataJson = (MiwearUsageDataJson) other;
        return Intrinsics.areEqual(this.deviceAppId, miwearUsageDataJson.deviceAppId) && this.durationSec == miwearUsageDataJson.durationSec && this.from == miwearUsageDataJson.from;
    }

    @NotNull
    public final String getDeviceAppId() {
        return this.deviceAppId;
    }

    public final int getDurationSec() {
        return this.durationSec;
    }

    public final int getFrom() {
        return this.from;
    }

    public int hashCode() {
        return (((this.deviceAppId.hashCode() * 31) + Integer.hashCode(this.durationSec)) * 31) + Integer.hashCode(this.from);
    }

    public final void setDeviceAppId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceAppId = str;
    }

    public final void setDurationSec(int i) {
        this.durationSec = i;
    }

    public final void setFrom(int i) {
        this.from = i;
    }

    @NotNull
    public String toString() {
        return "MiwearUsageDataJson(deviceAppId=" + this.deviceAppId + ", durationSec=" + this.durationSec + ", from=" + this.from + ")";
    }
}
