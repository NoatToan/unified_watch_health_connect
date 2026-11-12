package com.huami.ecg.sync.health.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/ecg/sync/health/model/SimplifyDeviceInfo;", "", "", "component1", "component2", "component3", "firmwareVersionStr", "deviceID", "serialNumber", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getFirmwareVersionStr", "()Ljava/lang/String;", "setFirmwareVersionStr", "(Ljava/lang/String;)V", "b", "getDeviceID", "setDeviceID", "c", "getSerialNumber", "setSerialNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SimplifyDeviceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String firmwareVersionStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String deviceID;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String serialNumber;

    public SimplifyDeviceInfo(@Nullable String str, @NotNull String str2, @NotNull String str3) {
        this.firmwareVersionStr = str;
        this.deviceID = str2;
        this.serialNumber = str3;
    }

    public static /* synthetic */ SimplifyDeviceInfo copy$default(SimplifyDeviceInfo simplifyDeviceInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simplifyDeviceInfo.firmwareVersionStr;
        }
        if ((i & 2) != 0) {
            str2 = simplifyDeviceInfo.deviceID;
        }
        if ((i & 4) != 0) {
            str3 = simplifyDeviceInfo.serialNumber;
        }
        return simplifyDeviceInfo.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirmwareVersionStr() {
        return this.firmwareVersionStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceID() {
        return this.deviceID;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final SimplifyDeviceInfo copy(@Nullable String firmwareVersionStr, @NotNull String deviceID, @NotNull String serialNumber) {
        return new SimplifyDeviceInfo(firmwareVersionStr, deviceID, serialNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplifyDeviceInfo)) {
            return false;
        }
        SimplifyDeviceInfo simplifyDeviceInfo = (SimplifyDeviceInfo) other;
        return Intrinsics.areEqual(this.firmwareVersionStr, simplifyDeviceInfo.firmwareVersionStr) && Intrinsics.areEqual(this.deviceID, simplifyDeviceInfo.deviceID) && Intrinsics.areEqual(this.serialNumber, simplifyDeviceInfo.serialNumber);
    }

    @NotNull
    public final String getDeviceID() {
        return this.deviceID;
    }

    @Nullable
    public final String getFirmwareVersionStr() {
        return this.firmwareVersionStr;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        String str = this.firmwareVersionStr;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.deviceID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.serialNumber;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDeviceID(@NotNull String str) {
        this.deviceID = str;
    }

    public final void setFirmwareVersionStr(@Nullable String str) {
        this.firmwareVersionStr = str;
    }

    public final void setSerialNumber(@NotNull String str) {
        this.serialNumber = str;
    }

    @NotNull
    public String toString() {
        return "SimplifyDeviceInfo(firmwareVersionStr=" + this.firmwareVersionStr + ", deviceID=" + this.deviceID + ", serialNumber=" + this.serialNumber + ")";
    }

    public /* synthetic */ SimplifyDeviceInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
