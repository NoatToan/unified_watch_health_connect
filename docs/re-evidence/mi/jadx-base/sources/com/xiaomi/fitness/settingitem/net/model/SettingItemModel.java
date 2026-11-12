package com.xiaomi.fitness.settingitem.net.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.analytics.AnalyticManager;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel;", "", "<init>", "()V", "SignRequest", "SignResult", "BindRequest", "BindResult", "CheckBindRequest", "CheckBindResult", "OtaUpgradeRequest", "OtaUpgradeResult", "GetBigSettingRequest", "SettingItemResult", "GetSettingRequest", "SendSettingRequest", "SetBigConfigRequest", "SetConfigResult", "GetConfigByModuleResult", "DeleteSettingRequest", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingItemModel {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u00020\u0005H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR \u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR \u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR \u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR*\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$BindRequest;", "", "<init>", "()V", "sn", "", "getSn", "()Ljava/lang/String;", "setSn", "(Ljava/lang/String;)V", "mac", "getMac", "setMac", "deviceId", "getDeviceId", "setDeviceId", "deviceType", "", "getDeviceType", "()I", "setDeviceType", "(I)V", "deviceSource", "getDeviceSource", "setDeviceSource", "authKey", "getAuthKey", "setAuthKey", "firmwareVersion", "getFirmwareVersion", "setFirmwareVersion", "softwareVersion", "getSoftwareVersion", "setSoftwareVersion", CommonConstants.KEY_SYSTEM_VERSION, "getSystemVersion", "setSystemVersion", "systemModel", "getSystemModel", "setSystemModel", "hardwareVersion", "getHardwareVersion", "setHardwareVersion", "extra_values", "Ljava/util/HashMap;", "getExtra_values", "()Ljava/util/HashMap;", "setExtra_values", "(Ljava/util/HashMap;)V", "toString", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BindRequest {

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

        @Nullable
        private HashMap<String, String> extra_values;

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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0082\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$BindRequest$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$BindRequest;", "sn", "", "model", "mac", "deviceId", "productId", "", "deviceType", "deviceSource", "authKey", "firmwareVersion", "softwareVersion", CommonConstants.KEY_SYSTEM_VERSION, "systemModel", "hardwareVersion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final BindRequest create(@Nullable String sn, @Nullable String model, @Nullable String mac, @Nullable String deviceId, int productId, int deviceType, int deviceSource, @Nullable String authKey, @Nullable String firmwareVersion, @Nullable String softwareVersion, @Nullable String systemVersion, @Nullable String systemModel, @Nullable String hardwareVersion) {
                BindRequest bindRequest = new BindRequest();
                bindRequest.setSn(sn);
                bindRequest.setMac(mac);
                bindRequest.setDeviceId(deviceId);
                bindRequest.setAuthKey(authKey);
                bindRequest.setDeviceId(deviceId);
                bindRequest.setDeviceSource(deviceSource);
                bindRequest.setDeviceType(deviceType);
                bindRequest.setFirmwareVersion(firmwareVersion);
                bindRequest.setSoftwareVersion(softwareVersion);
                bindRequest.setSystemVersion(systemVersion);
                bindRequest.setSystemModel(systemModel);
                bindRequest.setHardwareVersion(hardwareVersion);
                if (!TextUtils.isEmpty(sn)) {
                    bindRequest.setExtra_values(new HashMap<>(1));
                    HashMap<String, String> extra_values = bindRequest.getExtra_values();
                    if (extra_values != null) {
                        extra_values.put("sn", sn);
                    }
                }
                return bindRequest;
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
        public final HashMap<String, String> getExtra_values() {
            return this.extra_values;
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

        public final void setExtra_values(@Nullable HashMap<String, String> map) {
            this.extra_values = map;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$BindResult;", "", "<init>", "()V", "bind_code", "", "getBind_code", "()I", "setBind_code", "(I)V", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BindResult {
        private int bind_code;

        public final int getBind_code() {
            return this.bind_code;
        }

        public final void setBind_code(int i) {
            this.bind_code = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$CheckBindRequest;", "", "<init>", "()V", "mac", "", "model", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckBindRequest {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @SerializedName("mac_address")
        @Nullable
        private String mac;

        @Nullable
        private String model;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$CheckBindRequest$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$CheckBindRequest;", "mac", "", "model", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final CheckBindRequest create(@Nullable String mac, @Nullable String model) {
                CheckBindRequest checkBindRequest = new CheckBindRequest();
                checkBindRequest.mac = mac;
                checkBindRequest.model = model;
                return checkBindRequest;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$CheckBindResult;", "", "<init>", "()V", "isBind", "", "()Z", "setBind", "(Z)V", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckBindResult {

        @SerializedName("is_bind")
        private boolean isBind;

        /* JADX INFO: renamed from: isBind, reason: from getter */
        public final boolean getIsBind() {
            return this.isBind;
        }

        public final void setBind(boolean z) {
            this.isBind = z;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$DeleteSettingRequest;", "", "did", "", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getModule", "setModule", "keys", "", "getKeys", "()Ljava/util/List;", "setKeys", "(Ljava/util/List;)V", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteSettingRequest {

        @NotNull
        private String did;

        @Nullable
        private List<String> keys;

        @NotNull
        private String module;

        public DeleteSettingRequest(@NotNull String did, @NotNull String module) {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(module, "module");
            this.did = did;
            this.module = module;
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @Nullable
        public final List<String> getKeys() {
            return this.keys;
        }

        @NotNull
        public final String getModule() {
            return this.module;
        }

        public final void setDid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.did = str;
        }

        public final void setKeys(@Nullable List<String> list) {
            this.keys = list;
        }

        public final void setModule(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.module = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$GetBigSettingRequest;", "", "did", "", RnReportConst.ApiReport.PARAM_MODULE, "key", "updateTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getModule", "setModule", "getKey", "setKey", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "toString", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GetBigSettingRequest {

        @NotNull
        private String did;

        @NotNull
        private String key;

        @NotNull
        private String module;

        /* JADX INFO: renamed from: updateTime, reason: from kotlin metadata and from toString */
        @SerializedName("update_time")
        private long update_time;

        public GetBigSettingRequest(@NotNull String did, @NotNull String module, @NotNull String key, long j) {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(key, "key");
            this.did = did;
            this.module = module;
            this.key = key;
            this.update_time = j;
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getModule() {
            return this.module;
        }

        /* JADX INFO: renamed from: getUpdateTime, reason: from getter */
        public final long getUpdate_time() {
            return this.update_time;
        }

        public final void setDid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.did = str;
        }

        public final void setKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.key = str;
        }

        public final void setModule(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.module = str;
        }

        public final void setUpdateTime(long j) {
            this.update_time = j;
        }

        @NotNull
        public String toString() {
            return "GetBigSettingRequest{did='" + this.did + "', module='" + this.module + "', key='" + this.key + "', update_time=" + this.update_time + "}";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$GetConfigByModuleResult;", "", "<init>", "()V", "datas", "", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SettingItemResult;", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "lastId", "", "getLastId", "()I", "setLastId", "(I)V", "toString", "", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GetConfigByModuleResult {

        @Nullable
        private List<SettingItemResult> datas;

        @SerializedName("last_id")
        private int lastId;

        @Nullable
        public final List<SettingItemResult> getDatas() {
            return this.datas;
        }

        public final int getLastId() {
            return this.lastId;
        }

        public final void setDatas(@Nullable List<SettingItemResult> list) {
            this.datas = list;
        }

        public final void setLastId(int i) {
            this.lastId = i;
        }

        @NotNull
        public String toString() {
            return "GetConfigByModuleResult(datas=" + this.datas + ", lastId=" + this.lastId + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$GetSettingRequest;", "", "did", "", RnReportConst.ApiReport.PARAM_MODULE, "updateTime", "", "lastId", "", "limitCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;JII)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getModule", "setModule", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "getLastId", "()I", "setLastId", "(I)V", "getLimitCount", "setLimitCount", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GetSettingRequest {

        @NotNull
        private String did;

        @SerializedName("last_id")
        private int lastId;

        @SerializedName("limit")
        private int limitCount;

        @NotNull
        private String module;

        @SerializedName("update_time")
        private long updateTime;

        public GetSettingRequest(@NotNull String did, @NotNull String module, long j, int i, int i2) {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(module, "module");
            this.did = did;
            this.module = module;
            this.updateTime = j;
            this.lastId = i;
            this.limitCount = i2;
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        public final int getLastId() {
            return this.lastId;
        }

        public final int getLimitCount() {
            return this.limitCount;
        }

        @NotNull
        public final String getModule() {
            return this.module;
        }

        public final long getUpdateTime() {
            return this.updateTime;
        }

        public final void setDid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.did = str;
        }

        public final void setLastId(int i) {
            this.lastId = i;
        }

        public final void setLimitCount(int i) {
            this.limitCount = i;
        }

        public final void setModule(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.module = str;
        }

        public final void setUpdateTime(long j) {
            this.updateTime = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b-\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR \u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR \u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\t¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$OtaUpgradeRequest;", "", "<init>", "()V", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "deviceSource", "getDeviceSource", "setDeviceSource", "firmwareFlag", "getFirmwareFlag", "setFirmwareFlag", "firmwareVersion", "getFirmwareVersion", "setFirmwareVersion", "fontFlag", "getFontFlag", "setFontFlag", "fontVersion", "getFontVersion", "setFontVersion", "gpsVersion", "getGpsVersion", "setGpsVersion", "hardwareVersion", "getHardwareVersion", "setHardwareVersion", "productionSource", "getProductionSource", "setProductionSource", "resourceFlag", "getResourceFlag", "setResourceFlag", "resourceVersion", "getResourceVersion", "setResourceVersion", "appName", "getAppName", "setAppName", TSMAuthContants.PARAM_LANGUAGE, "getLang", "setLang", "appPlatform", "getAppPlatform", "setAppPlatform", "toString", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OtaUpgradeRequest {

        @SerializedName("appname")
        @Nullable
        private String appName;

        @SerializedName("appplatform")
        @Nullable
        private String appPlatform;

        @Nullable
        private String appVersion;

        @Nullable
        private String deviceSource;

        @Nullable
        private String firmwareFlag;

        @Nullable
        private String firmwareVersion;

        @Nullable
        private String fontFlag;

        @Nullable
        private String fontVersion;

        @Nullable
        private String gpsVersion;

        @Nullable
        private String hardwareVersion;

        @Nullable
        private String lang;

        @Nullable
        private String productionSource;

        @Nullable
        private String resourceFlag;

        @Nullable
        private String resourceVersion;

        @Nullable
        public final String getAppName() {
            return this.appName;
        }

        @Nullable
        public final String getAppPlatform() {
            return this.appPlatform;
        }

        @Nullable
        public final String getAppVersion() {
            return this.appVersion;
        }

        @Nullable
        public final String getDeviceSource() {
            return this.deviceSource;
        }

        @Nullable
        public final String getFirmwareFlag() {
            return this.firmwareFlag;
        }

        @Nullable
        public final String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        @Nullable
        public final String getFontFlag() {
            return this.fontFlag;
        }

        @Nullable
        public final String getFontVersion() {
            return this.fontVersion;
        }

        @Nullable
        public final String getGpsVersion() {
            return this.gpsVersion;
        }

        @Nullable
        public final String getHardwareVersion() {
            return this.hardwareVersion;
        }

        @Nullable
        public final String getLang() {
            return this.lang;
        }

        @Nullable
        public final String getProductionSource() {
            return this.productionSource;
        }

        @Nullable
        public final String getResourceFlag() {
            return this.resourceFlag;
        }

        @Nullable
        public final String getResourceVersion() {
            return this.resourceVersion;
        }

        public final void setAppName(@Nullable String str) {
            this.appName = str;
        }

        public final void setAppPlatform(@Nullable String str) {
            this.appPlatform = str;
        }

        public final void setAppVersion(@Nullable String str) {
            this.appVersion = str;
        }

        public final void setDeviceSource(@Nullable String str) {
            this.deviceSource = str;
        }

        public final void setFirmwareFlag(@Nullable String str) {
            this.firmwareFlag = str;
        }

        public final void setFirmwareVersion(@Nullable String str) {
            this.firmwareVersion = str;
        }

        public final void setFontFlag(@Nullable String str) {
            this.fontFlag = str;
        }

        public final void setFontVersion(@Nullable String str) {
            this.fontVersion = str;
        }

        public final void setGpsVersion(@Nullable String str) {
            this.gpsVersion = str;
        }

        public final void setHardwareVersion(@Nullable String str) {
            this.hardwareVersion = str;
        }

        public final void setLang(@Nullable String str) {
            this.lang = str;
        }

        public final void setProductionSource(@Nullable String str) {
            this.productionSource = str;
        }

        public final void setResourceFlag(@Nullable String str) {
            this.resourceFlag = str;
        }

        public final void setResourceVersion(@Nullable String str) {
            this.resourceVersion = str;
        }

        @NotNull
        public String toString() {
            return "OtaUpgradeRequest{appVersion='" + this.appVersion + "', deviceSource='" + this.deviceSource + "', firmwareFlag='" + this.firmwareFlag + "', firmwareVersion='" + this.firmwareVersion + "', fontFlag='" + this.fontFlag + "', fontVersion='" + this.fontVersion + "', gpsVersion='" + this.gpsVersion + "', hardwareVersion='" + this.hardwareVersion + "', productionSource='" + this.productionSource + "', resourceFlag='" + this.resourceFlag + "', resourceVersion='" + this.resourceVersion + "', appName='" + this.appName + "', lang='" + this.lang + "', appPlatform='" + this.appPlatform + "'}";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 h2\u00020\u0001:\u0001hB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001a\u0010+\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001c\u0010.\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001a\u00101\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R\u001c\u00104\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001a\u00107\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R\u001c\u0010:\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\u001c\u0010=\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\tR\u001a\u0010@\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010\u0015R\u001c\u0010C\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\tR\u001c\u0010F\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR\u001a\u0010I\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R\u001c\u0010L\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR\u001a\u0010O\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0013\"\u0004\bQ\u0010\u0015R\u001c\u0010R\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010\tR\u001c\u0010U\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010\tR\u001a\u0010X\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\"\"\u0004\bZ\u0010$R\u001c\u0010[\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0007\"\u0004\b]\u0010\tR\u001a\u0010^\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0013\"\u0004\b`\u0010\u0015R\u001a\u0010a\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0013\"\u0004\bc\u0010\u0015R\u0011\u0010d\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bd\u0010fR\u0011\u0010g\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bg\u0010f¨\u0006i"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$OtaUpgradeResult;", "Ljava/io/Serializable;", "<init>", "()V", "firmwareVersion", "", "getFirmwareVersion", "()Ljava/lang/String;", "setFirmwareVersion", "(Ljava/lang/String;)V", "firmwareUrl", "getFirmwareUrl", "setFirmwareUrl", "deviceType", "getDeviceType", "setDeviceType", "deviceSource", "", "getDeviceSource", "()I", "setDeviceSource", "(I)V", "gpsVersion", "getGpsVersion", "setGpsVersion", "gpsUrl", "getGpsUrl", "setGpsUrl", "firmwareMd5", "getFirmwareMd5", "setFirmwareMd5", "firmwareLength", "", "getFirmwareLength", "()J", "setFirmwareLength", "(J)V", "firmwareFlag", "getFirmwareFlag", "setFirmwareFlag", "fontMd5", "getFontMd5", "setFontMd5", "fontLength", "getFontLength", "setFontLength", "gpsMd5", "getGpsMd5", "setGpsMd5", "gpsLength", "getGpsLength", "setGpsLength", "fontVersion", "getFontVersion", "setFontVersion", "fontFlag", "getFontFlag", "setFontFlag", "fontUrl", "getFontUrl", "setFontUrl", "resourceVersion", "getResourceVersion", "setResourceVersion", "resourceFlag", "getResourceFlag", "setResourceFlag", "resourceUrl", "getResourceUrl", "setResourceUrl", "resourceMd5", "getResourceMd5", "setResourceMd5", "resourceLength", "getResourceLength", "setResourceLength", "baseResourceVersion", "getBaseResourceVersion", "setBaseResourceVersion", "baseResourceFlag", "getBaseResourceFlag", "setBaseResourceFlag", "baseResourceUrl", "getBaseResourceUrl", "setBaseResourceUrl", "baseResourceMd5", "getBaseResourceMd5", "setBaseResourceMd5", "baseResourceLength", "getBaseResourceLength", "setBaseResourceLength", TSMAuthContants.PARAM_LANGUAGE, "getLang", "setLang", "productionSource", "getProductionSource", "setProductionSource", "upgradeType", "getUpgradeType", "setUpgradeType", "isNeedUpdate", "", "()Z", "isForce", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OtaUpgradeResult implements Serializable {
        private static final long serialVersionUID = -4306715594922975795L;
        private int baseResourceFlag;
        private long baseResourceLength;

        @Nullable
        private String baseResourceMd5;

        @Nullable
        private String baseResourceUrl;

        @Nullable
        private String baseResourceVersion;
        private int deviceSource;

        @Nullable
        private String deviceType;
        private int firmwareFlag;
        private long firmwareLength;

        @Nullable
        private String firmwareMd5;

        @Nullable
        private String firmwareUrl;

        @Nullable
        private String firmwareVersion;
        private int fontFlag;
        private long fontLength;

        @Nullable
        private String fontMd5;

        @Nullable
        private String fontUrl;

        @Nullable
        private String fontVersion;
        private long gpsLength;

        @Nullable
        private String gpsMd5;

        @Nullable
        private String gpsUrl;

        @Nullable
        private String gpsVersion;

        @Nullable
        private String lang;
        private int productionSource;
        private int resourceFlag;
        private long resourceLength;

        @Nullable
        private String resourceMd5;

        @Nullable
        private String resourceUrl;

        @Nullable
        private String resourceVersion;
        private int upgradeType;

        public final int getBaseResourceFlag() {
            return this.baseResourceFlag;
        }

        public final long getBaseResourceLength() {
            return this.baseResourceLength;
        }

        @Nullable
        public final String getBaseResourceMd5() {
            return this.baseResourceMd5;
        }

        @Nullable
        public final String getBaseResourceUrl() {
            return this.baseResourceUrl;
        }

        @Nullable
        public final String getBaseResourceVersion() {
            return this.baseResourceVersion;
        }

        public final int getDeviceSource() {
            return this.deviceSource;
        }

        @Nullable
        public final String getDeviceType() {
            return this.deviceType;
        }

        public final int getFirmwareFlag() {
            return this.firmwareFlag;
        }

        public final long getFirmwareLength() {
            return this.firmwareLength;
        }

        @Nullable
        public final String getFirmwareMd5() {
            return this.firmwareMd5;
        }

        @Nullable
        public final String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        @Nullable
        public final String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public final int getFontFlag() {
            return this.fontFlag;
        }

        public final long getFontLength() {
            return this.fontLength;
        }

        @Nullable
        public final String getFontMd5() {
            return this.fontMd5;
        }

        @Nullable
        public final String getFontUrl() {
            return this.fontUrl;
        }

        @Nullable
        public final String getFontVersion() {
            return this.fontVersion;
        }

        public final long getGpsLength() {
            return this.gpsLength;
        }

        @Nullable
        public final String getGpsMd5() {
            return this.gpsMd5;
        }

        @Nullable
        public final String getGpsUrl() {
            return this.gpsUrl;
        }

        @Nullable
        public final String getGpsVersion() {
            return this.gpsVersion;
        }

        @Nullable
        public final String getLang() {
            return this.lang;
        }

        public final int getProductionSource() {
            return this.productionSource;
        }

        public final int getResourceFlag() {
            return this.resourceFlag;
        }

        public final long getResourceLength() {
            return this.resourceLength;
        }

        @Nullable
        public final String getResourceMd5() {
            return this.resourceMd5;
        }

        @Nullable
        public final String getResourceUrl() {
            return this.resourceUrl;
        }

        @Nullable
        public final String getResourceVersion() {
            return this.resourceVersion;
        }

        public final int getUpgradeType() {
            return this.upgradeType;
        }

        public final boolean isForce() {
            return this.upgradeType == 2;
        }

        public final boolean isNeedUpdate() {
            return (this.firmwareVersion == null && this.gpsVersion == null && this.fontVersion == null && this.resourceVersion == null && this.baseResourceVersion == null) ? false : true;
        }

        public final void setBaseResourceFlag(int i) {
            this.baseResourceFlag = i;
        }

        public final void setBaseResourceLength(long j) {
            this.baseResourceLength = j;
        }

        public final void setBaseResourceMd5(@Nullable String str) {
            this.baseResourceMd5 = str;
        }

        public final void setBaseResourceUrl(@Nullable String str) {
            this.baseResourceUrl = str;
        }

        public final void setBaseResourceVersion(@Nullable String str) {
            this.baseResourceVersion = str;
        }

        public final void setDeviceSource(int i) {
            this.deviceSource = i;
        }

        public final void setDeviceType(@Nullable String str) {
            this.deviceType = str;
        }

        public final void setFirmwareFlag(int i) {
            this.firmwareFlag = i;
        }

        public final void setFirmwareLength(long j) {
            this.firmwareLength = j;
        }

        public final void setFirmwareMd5(@Nullable String str) {
            this.firmwareMd5 = str;
        }

        public final void setFirmwareUrl(@Nullable String str) {
            this.firmwareUrl = str;
        }

        public final void setFirmwareVersion(@Nullable String str) {
            this.firmwareVersion = str;
        }

        public final void setFontFlag(int i) {
            this.fontFlag = i;
        }

        public final void setFontLength(long j) {
            this.fontLength = j;
        }

        public final void setFontMd5(@Nullable String str) {
            this.fontMd5 = str;
        }

        public final void setFontUrl(@Nullable String str) {
            this.fontUrl = str;
        }

        public final void setFontVersion(@Nullable String str) {
            this.fontVersion = str;
        }

        public final void setGpsLength(long j) {
            this.gpsLength = j;
        }

        public final void setGpsMd5(@Nullable String str) {
            this.gpsMd5 = str;
        }

        public final void setGpsUrl(@Nullable String str) {
            this.gpsUrl = str;
        }

        public final void setGpsVersion(@Nullable String str) {
            this.gpsVersion = str;
        }

        public final void setLang(@Nullable String str) {
            this.lang = str;
        }

        public final void setProductionSource(int i) {
            this.productionSource = i;
        }

        public final void setResourceFlag(int i) {
            this.resourceFlag = i;
        }

        public final void setResourceLength(long j) {
            this.resourceLength = j;
        }

        public final void setResourceMd5(@Nullable String str) {
            this.resourceMd5 = str;
        }

        public final void setResourceUrl(@Nullable String str) {
            this.resourceUrl = str;
        }

        public final void setResourceVersion(@Nullable String str) {
            this.resourceVersion = str;
        }

        public final void setUpgradeType(int i) {
            this.upgradeType = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SetBigConfigRequest;", "", "did", "", RnReportConst.ApiReport.PARAM_MODULE, "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getModule", "setModule", "getKey", "setKey", "getValue", "setValue", "toString", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SetBigConfigRequest {

        @NotNull
        private String did;

        @NotNull
        private String key;

        @NotNull
        private String module;

        @Nullable
        private String value;

        public SetBigConfigRequest(@NotNull String did, @NotNull String module, @NotNull String key, @Nullable String str) {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(key, "key");
            this.did = did;
            this.module = module;
            this.key = key;
            this.value = str;
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getModule() {
            return this.module;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public final void setDid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.did = str;
        }

        public final void setKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.key = str;
        }

        public final void setModule(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.module = str;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }

        @NotNull
        public String toString() {
            return "SetBigConfigRequest{did='" + this.did + "', module='" + this.module + "', key='" + this.key + "', value='" + this.value + "'}";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SetConfigResult;", "", "<init>", "()V", Constants.KEY_PAY_RESULT_RET, "", "getRet", "()Z", "setRet", "(Z)V", "updateTime", "", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SetConfigResult {
        private boolean ret;

        @SerializedName("update_time")
        private long updateTime;

        public final boolean getRet() {
            return this.ret;
        }

        public final long getUpdateTime() {
            return this.updateTime;
        }

        public final void setRet(boolean z) {
            this.ret = z;
        }

        public final void setUpdateTime(long j) {
            this.updateTime = j;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SettingItemResult;", "", "<init>", "()V", RnReportConst.ApiReport.PARAM_MODULE, "", "getModule", "()Ljava/lang/String;", "setModule", "(Ljava/lang/String;)V", "key", "getKey", "setKey", "value", "getValue", "setValue", "updateTime", "", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "toString", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SettingItemResult {

        @Nullable
        private String key;

        @Nullable
        private String module;

        @SerializedName("update_time")
        private long updateTime;

        @Nullable
        private String value;

        @Nullable
        public final String getKey() {
            return this.key;
        }

        @Nullable
        public final String getModule() {
            return this.module;
        }

        public final long getUpdateTime() {
            return this.updateTime;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public final void setKey(@Nullable String str) {
            this.key = str;
        }

        public final void setModule(@Nullable String str) {
            this.module = str;
        }

        public final void setUpdateTime(long j) {
            this.updateTime = j;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }

        @NotNull
        public String toString() {
            return "SettingItemResult{module='" + this.module + "', key='" + this.key + "', updateTime=" + this.updateTime + "}";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SignRequest;", "", "<init>", "()V", "mac", "", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "random", "getRandom", "setRandom", "publicKeyHashString", "getPublicKeyHashString", "setPublicKeyHashString", "hash_algo", "", "getHash_algo", "()I", "setHash_algo", "(I)V", "toString", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SignRequest {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private int hash_algo;

        @Nullable
        private String mac;

        @Nullable
        private String publicKeyHashString;

        @Nullable
        private String random;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SignRequest$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SignRequest;", "mac", "", "random", "publicKeyHashString", "hash_algo", "", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final SignRequest create(@Nullable String mac, @Nullable String random, @Nullable String publicKeyHashString, int hash_algo) {
                SignRequest signRequest = new SignRequest();
                signRequest.setMac(mac);
                signRequest.setRandom(random);
                signRequest.setPublicKeyHashString(publicKeyHashString);
                signRequest.setHash_algo(hash_algo);
                StringBuilder sb = new StringBuilder();
                sb.append("|HUAMI|");
                sb.append(signRequest);
                return signRequest;
            }
        }

        public final int getHash_algo() {
            return this.hash_algo;
        }

        @Nullable
        public final String getMac() {
            return this.mac;
        }

        @Nullable
        public final String getPublicKeyHashString() {
            return this.publicKeyHashString;
        }

        @Nullable
        public final String getRandom() {
            return this.random;
        }

        public final void setHash_algo(int i) {
            this.hash_algo = i;
        }

        public final void setMac(@Nullable String str) {
            this.mac = str;
        }

        public final void setPublicKeyHashString(@Nullable String str) {
            this.publicKeyHashString = str;
        }

        public final void setRandom(@Nullable String str) {
            this.random = str;
        }

        @NotNull
        public String toString() {
            return "SignRequest{mac='" + this.mac + "', random='" + this.random + "', publicKeyHashString='" + this.publicKeyHashString + "', hash_algo=" + this.hash_algo + "}";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SignResult;", "", "<init>", "()V", "server_sign", "", "getServer_sign", "()Ljava/lang/String;", "setServer_sign", "(Ljava/lang/String;)V", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SignResult {

        @Nullable
        private String server_sign;

        @Nullable
        public final String getServer_sign() {
            return this.server_sign;
        }

        public final void setServer_sign(@Nullable String str) {
            this.server_sign = str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR&\u0010\u0010\u001a\u000e\u0012\b\u0012\u00060\u0012R\u00020\u0000\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SendSettingRequest;", "", "did", "", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "key", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getModule", "setModule", "datas", "", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SendSettingRequest$RequestData;", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "addItem", "", "RequestData", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendSettingRequest {

        @Nullable
        private List<RequestData> datas;

        @NotNull
        private String did;

        @NotNull
        private String module;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SendSettingRequest$RequestData;", "", "key", "", "value", "<init>", "(Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SendSettingRequest;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getValue", "setValue", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class RequestData {

            @Nullable
            private String key;

            @Nullable
            private String value;

            public RequestData(@Nullable String str, String str2) {
                this.key = str;
                this.value = str2;
            }

            @Nullable
            public final String getKey() {
                return this.key;
            }

            @Nullable
            public final String getValue() {
                return this.value;
            }

            public final void setKey(@Nullable String str) {
                this.key = str;
            }

            public final void setValue(@Nullable String str) {
                this.value = str;
            }
        }

        public SendSettingRequest(@NotNull String did, @NotNull String module) {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(module, "module");
            this.did = did;
            this.module = module;
        }

        public final void addItem(@Nullable String key, @Nullable String value) {
            if (this.datas == null) {
                this.datas = new ArrayList();
            }
            RequestData requestData = new RequestData(key, value);
            List<RequestData> list = this.datas;
            Intrinsics.checkNotNull(list);
            list.add(requestData);
        }

        @Nullable
        public final List<RequestData> getDatas() {
            return this.datas;
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @NotNull
        public final String getModule() {
            return this.module;
        }

        public final void setDatas(@Nullable List<RequestData> list) {
            this.datas = list;
        }

        public final void setDid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.did = str;
        }

        public final void setModule(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.module = str;
        }

        public SendSettingRequest(@NotNull String did, @NotNull String module, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(module, "module");
            this.did = did;
            this.module = module;
            addItem(str, str2);
        }
    }
}
