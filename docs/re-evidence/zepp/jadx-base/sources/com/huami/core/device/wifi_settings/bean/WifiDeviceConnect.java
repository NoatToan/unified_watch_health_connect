package com.huami.core.device.wifi_settings.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/huami/core/device/wifi_settings/bean/WifiDeviceConnect;", "", "", "isConnecting", "isConnectingTimeout", "isConnected", "isDisconnected", "", "component1", "component2", "mConnectionType", "deviceSource", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getMConnectionType", "()I", "b", "getDeviceSource", "<init>", "(II)V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WifiDeviceConnect {
    public static final int CONNECTED = 1;
    public static final int CONNECTING = 0;
    public static final int CONNECTING_TIMEOUT = 3;
    public static final int DISCONNECTED = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int mConnectionType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    public WifiDeviceConnect(int i, int i2) {
        this.mConnectionType = i;
        this.deviceSource = i2;
    }

    public static /* synthetic */ WifiDeviceConnect copy$default(WifiDeviceConnect wifiDeviceConnect, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wifiDeviceConnect.mConnectionType;
        }
        if ((i3 & 2) != 0) {
            i2 = wifiDeviceConnect.deviceSource;
        }
        return wifiDeviceConnect.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMConnectionType() {
        return this.mConnectionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final WifiDeviceConnect copy(int mConnectionType, int deviceSource) {
        return new WifiDeviceConnect(mConnectionType, deviceSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WifiDeviceConnect)) {
            return false;
        }
        WifiDeviceConnect wifiDeviceConnect = (WifiDeviceConnect) other;
        return this.mConnectionType == wifiDeviceConnect.mConnectionType && this.deviceSource == wifiDeviceConnect.deviceSource;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getMConnectionType() {
        return this.mConnectionType;
    }

    public int hashCode() {
        return (this.mConnectionType * 31) + this.deviceSource;
    }

    public final boolean isConnected() {
        return this.mConnectionType == 1;
    }

    public final boolean isConnecting() {
        return this.mConnectionType == 0;
    }

    public final boolean isConnectingTimeout() {
        return this.mConnectionType == 3;
    }

    public final boolean isDisconnected() {
        return this.mConnectionType == 2;
    }

    @NotNull
    public String toString() {
        return "WifiDeviceConnect(mConnectionType=" + this.mConnectionType + ", deviceSource=" + this.deviceSource + ')';
    }

    public /* synthetic */ WifiDeviceConnect(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, i2);
    }
}
