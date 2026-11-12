package com.xiaomi.fit.device.bind;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.analytics.AnalyticManager;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u00020\u0005H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR \u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR \u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR \u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR.\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fit/device/bind/BindRequestData;", "", "<init>", "()V", "sn", "", "getSn", "()Ljava/lang/String;", "setSn", "(Ljava/lang/String;)V", "mac", "getMac", "setMac", "deviceId", "getDeviceId", "setDeviceId", "deviceType", "", "getDeviceType", "()I", "setDeviceType", "(I)V", "deviceSource", "getDeviceSource", "setDeviceSource", "authKey", "getAuthKey", "setAuthKey", "firmwareVersion", "getFirmwareVersion", "setFirmwareVersion", "softwareVersion", "getSoftwareVersion", "setSoftwareVersion", CommonConstants.KEY_SYSTEM_VERSION, "getSystemVersion", "setSystemVersion", "systemModel", "getSystemModel", "setSystemModel", "hardwareVersion", "getHardwareVersion", "setHardwareVersion", "extraValues", "", "getExtraValues", "()Ljava/util/Map;", "setExtraValues", "(Ljava/util/Map;)V", "toString", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindRequestData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("auth_key")
    @Nullable
    private String authKey;

    @SerializedName("device_id")
    @Nullable
    private String deviceId;

    @SerializedName("device_source")
    private int deviceSource;

    @SerializedName(DeviceContractKt.COLUMN_DEVICE_TYPE)
    private int deviceType;

    @SerializedName("extra_values")
    @Nullable
    private Map<String, String> extraValues;

    @SerializedName("firmware_version")
    @Nullable
    private String firmwareVersion;

    @SerializedName("hardware_version")
    @Nullable
    private String hardwareVersion;

    @SerializedName("mac_address")
    @Nullable
    private String mac;

    @SerializedName("did")
    @Nullable
    private String sn;

    @SerializedName("software_version")
    @Nullable
    private String softwareVersion;

    @SerializedName("system_model")
    @Nullable
    private String systemModel;

    @SerializedName(AnalyticManager.EVENT_PARAM_SYSTEM_VERSION)
    @Nullable
    private String systemVersion;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/device/bind/BindRequestData$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fit/device/bind/BindRequestData;", "sn", "", "mac", "deviceId", "deviceType", "", "deviceSource", "authKey", "firmwareVersion", "softwareVersion", CommonConstants.KEY_SYSTEM_VERSION, "systemModel", "hardwareVersion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BindRequestData create(@Nullable String sn, @Nullable String mac, @Nullable String deviceId, int deviceType, int deviceSource, @Nullable String authKey, @Nullable String firmwareVersion, @Nullable String softwareVersion, @Nullable String systemVersion, @Nullable String systemModel, @Nullable String hardwareVersion) {
            BindRequestData bindRequestData = new BindRequestData();
            bindRequestData.setSn(sn);
            bindRequestData.setMac(mac);
            bindRequestData.setDeviceId(deviceId);
            bindRequestData.setAuthKey(authKey);
            bindRequestData.setDeviceId(deviceId);
            bindRequestData.setDeviceSource(deviceSource);
            bindRequestData.setDeviceType(deviceType);
            bindRequestData.setFirmwareVersion(firmwareVersion);
            bindRequestData.setSoftwareVersion(softwareVersion);
            bindRequestData.setSystemVersion(systemVersion);
            bindRequestData.setSystemModel(systemModel);
            bindRequestData.setHardwareVersion(hardwareVersion);
            if (!TextUtils.isEmpty(sn)) {
                bindRequestData.setExtraValues(new HashMap(1));
                Map<String, String> extraValues = bindRequestData.getExtraValues();
                Intrinsics.checkNotNull(extraValues);
                extraValues.put("sn", sn);
            }
            return bindRequestData;
        }
    }

    @Nullable
    public final String getAuthKey() {
        return this.authKey;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final Map<String, String> getExtraValues() {
        return this.extraValues;
    }

    @Nullable
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @Nullable
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @Nullable
    public final String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @Nullable
    public final String getSystemModel() {
        return this.systemModel;
    }

    @Nullable
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    public final void setAuthKey(@Nullable String str) {
        this.authKey = str;
    }

    public final void setDeviceId(@Nullable String str) {
        this.deviceId = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setExtraValues(@Nullable Map<String, String> map) {
        this.extraValues = map;
    }

    public final void setFirmwareVersion(@Nullable String str) {
        this.firmwareVersion = str;
    }

    public final void setHardwareVersion(@Nullable String str) {
        this.hardwareVersion = str;
    }

    public final void setMac(@Nullable String str) {
        this.mac = str;
    }

    public final void setSn(@Nullable String str) {
        this.sn = str;
    }

    public final void setSoftwareVersion(@Nullable String str) {
        this.softwareVersion = str;
    }

    public final void setSystemModel(@Nullable String str) {
        this.systemModel = str;
    }

    public final void setSystemVersion(@Nullable String str) {
        this.systemVersion = str;
    }

    @NotNull
    public String toString() {
        return "BindRequest{sn='" + this.sn + "', mac='" + this.mac + "', deviceId='" + this.deviceId + "', deviceType=" + this.deviceType + ", deviceSource=" + this.deviceSource + ", authKey='" + this.authKey + "', firmwareVersion='" + this.firmwareVersion + "', softwareVersion='" + this.softwareVersion + "', systemVersion='" + this.systemVersion + "', systemModel='" + this.systemModel + "', hardwareVersion='" + this.hardwareVersion + "'}";
    }
}
