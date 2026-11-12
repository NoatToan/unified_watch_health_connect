package com.huami.core.device.wifi_settings.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "", "", "component1", "Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;", "component2", "", "component3", "()Ljava/lang/Integer;", "ssid", "status", "errorCode", "copy", "(Ljava/lang/String;Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;Ljava/lang/Integer;)Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSsid", "()Ljava/lang/String;", "b", "Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;", "getStatus", "()Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;", "setStatus", "(Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;)V", "c", "Ljava/lang/Integer;", "getErrorCode", "setErrorCode", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;Ljava/lang/Integer;)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WiFiConnectStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String ssid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private ConnectStatus status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer errorCode;

    public WiFiConnectStatus(@Nullable String str, @NotNull ConnectStatus connectStatus, @Nullable Integer num) {
        this.ssid = str;
        this.status = connectStatus;
        this.errorCode = num;
    }

    public static /* synthetic */ WiFiConnectStatus copy$default(WiFiConnectStatus wiFiConnectStatus, String str, ConnectStatus connectStatus, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wiFiConnectStatus.ssid;
        }
        if ((i & 2) != 0) {
            connectStatus = wiFiConnectStatus.status;
        }
        if ((i & 4) != 0) {
            num = wiFiConnectStatus.errorCode;
        }
        return wiFiConnectStatus.copy(str, connectStatus, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final WiFiConnectStatus copy(@Nullable String ssid, @NotNull ConnectStatus status, @Nullable Integer errorCode) {
        return new WiFiConnectStatus(ssid, status, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiFiConnectStatus)) {
            return false;
        }
        WiFiConnectStatus wiFiConnectStatus = (WiFiConnectStatus) other;
        return Intrinsics.areEqual(this.ssid, wiFiConnectStatus.ssid) && this.status == wiFiConnectStatus.status && Intrinsics.areEqual(this.errorCode, wiFiConnectStatus.errorCode);
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getSsid() {
        return this.ssid;
    }

    @NotNull
    public final ConnectStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.ssid;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.status.hashCode()) * 31;
        Integer num = this.errorCode;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setErrorCode(@Nullable Integer num) {
        this.errorCode = num;
    }

    public final void setStatus(@NotNull ConnectStatus connectStatus) {
        this.status = connectStatus;
    }

    @NotNull
    public String toString() {
        return "WiFiConnectStatus(ssid=" + ((Object) this.ssid) + ", status=" + this.status + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ WiFiConnectStatus(String str, ConnectStatus connectStatus, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, connectStatus, (i & 4) != 0 ? null : num);
    }
}
