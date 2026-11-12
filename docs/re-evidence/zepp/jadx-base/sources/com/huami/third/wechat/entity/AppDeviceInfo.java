package com.huami.third.wechat.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u000e\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/third/wechat/entity/AppDeviceInfo;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "sn", "deviceSource", "deviceDisplayName", "bleAddress", "isActive", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getSn", "()Ljava/lang/String;", "b", LogUtil.I, "getDeviceSource", "()I", "c", "getDeviceDisplayName", GoogleApiAvailabilityLight.a, "getBleAddress", "e", "Z", "()Z", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "wechat_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppDeviceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("sn")
    @Expose
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("deviceSource")
    @Expose
    private final int deviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceDisplayName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String bleAddress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean isActive;

    public AppDeviceInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, boolean z) {
        this.sn = str;
        this.deviceSource = i;
        this.deviceDisplayName = str2;
        this.bleAddress = str3;
        this.isActive = z;
    }

    public static /* synthetic */ AppDeviceInfo copy$default(AppDeviceInfo appDeviceInfo, String str, int i, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appDeviceInfo.sn;
        }
        if ((i2 & 2) != 0) {
            i = appDeviceInfo.deviceSource;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = appDeviceInfo.deviceDisplayName;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = appDeviceInfo.bleAddress;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            z = appDeviceInfo.isActive;
        }
        return appDeviceInfo.copy(str, i3, str4, str5, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBleAddress() {
        return this.bleAddress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final AppDeviceInfo copy(@NotNull String sn, int deviceSource, @NotNull String deviceDisplayName, @NotNull String bleAddress, boolean isActive) {
        return new AppDeviceInfo(sn, deviceSource, deviceDisplayName, bleAddress, isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppDeviceInfo)) {
            return false;
        }
        AppDeviceInfo appDeviceInfo = (AppDeviceInfo) other;
        return Intrinsics.areEqual(this.sn, appDeviceInfo.sn) && this.deviceSource == appDeviceInfo.deviceSource && Intrinsics.areEqual(this.deviceDisplayName, appDeviceInfo.deviceDisplayName) && Intrinsics.areEqual(this.bleAddress, appDeviceInfo.bleAddress) && this.isActive == appDeviceInfo.isActive;
    }

    @NotNull
    public final String getBleAddress() {
        return this.bleAddress;
    }

    @NotNull
    public final String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = ((((((this.sn.hashCode() * 31) + this.deviceSource) * 31) + this.deviceDisplayName.hashCode()) * 31) + this.bleAddress.hashCode()) * 31;
        boolean z = this.isActive;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "AppDeviceInfo(sn=" + this.sn + ", deviceSource=" + this.deviceSource + ", deviceDisplayName=" + this.deviceDisplayName + ", bleAddress=" + this.bleAddress + ", isActive=" + this.isActive + ")";
    }
}
