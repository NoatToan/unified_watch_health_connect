package com.huami.core.device.wifi_settings.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.hid.takepic.TakePicSettingActivity;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b:\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HBm\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\bF\u0010GJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003Jo\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001c\u001a\u00020\u0006HÆ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R$\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010 \u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R$\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010 \u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00102\u001a\u0004\bD\u00104\"\u0004\bE\u00106¨\u0006I"}, d2 = {"Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;", "component3", "component4", "component5", "Lcom/huami/core/device/wifi_settings/bean/WifiCipherType;", "component6", "component7", "component8", "component9", WifiSetActivity.KEY_CONNECT_SSID, "wifiBSSID", "wifiState", "wifiPwd", "wifiType", "capabilities", "ipAddress", TakePicSettingActivity.KEY_ADDRESS, "frequency", "copy", "toString", "a", "Ljava/lang/String;", "getWifiSSID", "()Ljava/lang/String;", "setWifiSSID", "(Ljava/lang/String;)V", "b", "getWifiBSSID", "setWifiBSSID", "c", "Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;", "getWifiState", "()Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;", "setWifiState", "(Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;)V", GoogleApiAvailabilityLight.a, "getWifiPwd", "setWifiPwd", "e", LogUtil.I, "getWifiType", "()I", "setWifiType", "(I)V", "f", "Lcom/huami/core/device/wifi_settings/bean/WifiCipherType;", "getCapabilities", "()Lcom/huami/core/device/wifi_settings/bean/WifiCipherType;", "setCapabilities", "(Lcom/huami/core/device/wifi_settings/bean/WifiCipherType;)V", "g", "getIpAddress", "setIpAddress", "h", "getMacAddress", "setMacAddress", "i", "getFrequency", "setFrequency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;Ljava/lang/String;ILcom/huami/core/device/wifi_settings/bean/WifiCipherType;Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WifiBean implements Serializable {
    public static final int TYPE_CONFIG = 1;
    public static final int TYPE_NOT_CONFIG = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String wifiSSID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String wifiBSSID;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private ConnectStatus wifiState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private String wifiPwd;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int wifiType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private WifiCipherType capabilities;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private String ipAddress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private String macAddress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private int frequency;

    public WifiBean() {
        this(null, null, null, null, 0, null, null, null, 0, 511, null);
    }

    public WifiBean(@Nullable String str, @Nullable String str2, @NotNull ConnectStatus connectStatus, @Nullable String str3, int i, @Nullable WifiCipherType wifiCipherType, @Nullable String str4, @Nullable String str5, int i2) {
        this.wifiSSID = str;
        this.wifiBSSID = str2;
        this.wifiState = connectStatus;
        this.wifiPwd = str3;
        this.wifiType = i;
        this.capabilities = wifiCipherType;
        this.ipAddress = str4;
        this.macAddress = str5;
        this.frequency = i2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWifiSSID() {
        return this.wifiSSID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWifiBSSID() {
        return this.wifiBSSID;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ConnectStatus getWifiState() {
        return this.wifiState;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWifiPwd() {
        return this.wifiPwd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWifiType() {
        return this.wifiType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final WifiCipherType getCapabilities() {
        return this.capabilities;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final WifiBean copy(@Nullable String wifiSSID, @Nullable String wifiBSSID, @NotNull ConnectStatus wifiState, @Nullable String wifiPwd, int wifiType, @Nullable WifiCipherType capabilities, @Nullable String ipAddress, @Nullable String macAddress, int frequency) {
        return new WifiBean(wifiSSID, wifiBSSID, wifiState, wifiPwd, wifiType, capabilities, ipAddress, macAddress, frequency);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(WifiBean.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.core.device.wifi_settings.bean.WifiBean");
        return Intrinsics.areEqual(this.wifiSSID, ((WifiBean) other).wifiSSID);
    }

    @Nullable
    public final WifiCipherType getCapabilities() {
        return this.capabilities;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    @Nullable
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @Nullable
    public final String getMacAddress() {
        return this.macAddress;
    }

    @Nullable
    public final String getWifiBSSID() {
        return this.wifiBSSID;
    }

    @Nullable
    public final String getWifiPwd() {
        return this.wifiPwd;
    }

    @Nullable
    public final String getWifiSSID() {
        return this.wifiSSID;
    }

    @NotNull
    public final ConnectStatus getWifiState() {
        return this.wifiState;
    }

    public final int getWifiType() {
        return this.wifiType;
    }

    public int hashCode() {
        String str = this.wifiSSID;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setCapabilities(@Nullable WifiCipherType wifiCipherType) {
        this.capabilities = wifiCipherType;
    }

    public final void setFrequency(int i) {
        this.frequency = i;
    }

    public final void setIpAddress(@Nullable String str) {
        this.ipAddress = str;
    }

    public final void setMacAddress(@Nullable String str) {
        this.macAddress = str;
    }

    public final void setWifiBSSID(@Nullable String str) {
        this.wifiBSSID = str;
    }

    public final void setWifiPwd(@Nullable String str) {
        this.wifiPwd = str;
    }

    public final void setWifiSSID(@Nullable String str) {
        this.wifiSSID = str;
    }

    public final void setWifiState(@NotNull ConnectStatus connectStatus) {
        this.wifiState = connectStatus;
    }

    public final void setWifiType(int i) {
        this.wifiType = i;
    }

    @NotNull
    public String toString() {
        return "WifiBean(wifiSSID=" + ((Object) this.wifiSSID) + ", wifiBSSID=" + ((Object) this.wifiBSSID) + ", wifiState=" + this.wifiState + ", wifiPwd=" + ((Object) this.wifiPwd) + ", wifiType=" + this.wifiType + ", capabilities=" + this.capabilities + ", ipAddress=" + ((Object) this.ipAddress) + ", macAddress=" + ((Object) this.macAddress) + ", frequency=" + this.frequency + ')';
    }

    public /* synthetic */ WifiBean(String str, String str2, ConnectStatus connectStatus, String str3, int i, WifiCipherType wifiCipherType, String str4, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? ConnectStatus.DISCONNECT : connectStatus, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? WifiCipherType.WIFICIPHER_NOPASS : wifiCipherType, (i3 & 64) != 0 ? null : str4, (i3 & 128) == 0 ? str5 : null, (i3 & 256) == 0 ? i2 : 0);
    }
}
