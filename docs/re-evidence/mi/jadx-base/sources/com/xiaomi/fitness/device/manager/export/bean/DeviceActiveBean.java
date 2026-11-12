package com.xiaomi.fitness.device.manager.export.bean;

import android.os.Build;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003JO\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u001cHÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\u001a\u0010*\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u0017R\u001a\u0010-\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u0017R\u001a\u00100\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u0017¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActiveBean;", "", "device_name", "", DeviceContractKt.COLUMN_DEVICE_TYPE, "did", "sn", "sku", "model", "hardware_version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevice_name", "()Ljava/lang/String;", "getDevice_type", "getDid", "getSn", "getSku", "getModel", "getHardware_version", "os_version", "getOs_version", "setOs_version", "(Ljava/lang/String;)V", "user_id", "getUser_id", "setUser_id", "event_time", "", "getEvent_time", "()I", "setEvent_time", "(I)V", "bind_phone_model", "getBind_phone_model", "setBind_phone_model", "source", "getSource", "setSource", "user_id_type", "getUser_id_type", "setUser_id_type", "value", "getValue", "setValue", "extra", "getExtra", "setExtra", "oaid", "getOaid", "setOaid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceActiveBean {

    @NotNull
    private String bind_phone_model;

    @NotNull
    private final String device_name;

    @NotNull
    private final String device_type;

    @NotNull
    private final String did;
    private int event_time;

    @NotNull
    private String extra;

    @NotNull
    private final String hardware_version;

    @NotNull
    private final String model;

    @NotNull
    private String oaid;

    @NotNull
    private String os_version;

    @NotNull
    private final String sku;

    @NotNull
    private final String sn;

    @NotNull
    private String source;

    @NotNull
    private String user_id;
    private int user_id_type;

    @NotNull
    private String value;

    public DeviceActiveBean(@NotNull String device_name, @NotNull String device_type, @NotNull String did, @NotNull String sn, @NotNull String sku, @NotNull String model, @NotNull String hardware_version) {
        Intrinsics.checkNotNullParameter(device_name, "device_name");
        Intrinsics.checkNotNullParameter(device_type, "device_type");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hardware_version, "hardware_version");
        this.device_name = device_name;
        this.device_type = device_type;
        this.did = did;
        this.sn = sn;
        this.sku = sku;
        this.model = model;
        this.hardware_version = hardware_version;
        this.os_version = RomUtils.isXiaomi() ? OneTrack.Param.MIUI : PluginPackageConstant.RN_DIR_A;
        this.user_id = MD5Util.MD5(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        this.event_time = (int) (System.currentTimeMillis() / ((long) 1000));
        this.bind_phone_model = RomUtils.INSTANCE.getRomInfo().getName() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Build.MODEL;
        this.source = "mi_sport_hlth";
        this.user_id_type = 1;
        this.value = "";
        this.extra = "";
        String oaid = DeviceUtil.INSTANCE.getOAID(ApplicationExtKt.getApplication());
        this.oaid = oaid != null ? oaid : "";
    }

    public static /* synthetic */ DeviceActiveBean copy$default(DeviceActiveBean deviceActiveBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceActiveBean.device_name;
        }
        if ((i & 2) != 0) {
            str2 = deviceActiveBean.device_type;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = deviceActiveBean.did;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = deviceActiveBean.sn;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = deviceActiveBean.sku;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = deviceActiveBean.model;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = deviceActiveBean.hardware_version;
        }
        return deviceActiveBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDevice_name() {
        return this.device_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDevice_type() {
        return this.device_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHardware_version() {
        return this.hardware_version;
    }

    @NotNull
    public final DeviceActiveBean copy(@NotNull String device_name, @NotNull String device_type, @NotNull String did, @NotNull String sn, @NotNull String sku, @NotNull String model, @NotNull String hardware_version) {
        Intrinsics.checkNotNullParameter(device_name, "device_name");
        Intrinsics.checkNotNullParameter(device_type, "device_type");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hardware_version, "hardware_version");
        return new DeviceActiveBean(device_name, device_type, did, sn, sku, model, hardware_version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceActiveBean)) {
            return false;
        }
        DeviceActiveBean deviceActiveBean = (DeviceActiveBean) other;
        return Intrinsics.areEqual(this.device_name, deviceActiveBean.device_name) && Intrinsics.areEqual(this.device_type, deviceActiveBean.device_type) && Intrinsics.areEqual(this.did, deviceActiveBean.did) && Intrinsics.areEqual(this.sn, deviceActiveBean.sn) && Intrinsics.areEqual(this.sku, deviceActiveBean.sku) && Intrinsics.areEqual(this.model, deviceActiveBean.model) && Intrinsics.areEqual(this.hardware_version, deviceActiveBean.hardware_version);
    }

    @NotNull
    public final String getBind_phone_model() {
        return this.bind_phone_model;
    }

    @NotNull
    public final String getDevice_name() {
        return this.device_name;
    }

    @NotNull
    public final String getDevice_type() {
        return this.device_type;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getEvent_time() {
        return this.event_time;
    }

    @NotNull
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getHardware_version() {
        return this.hardware_version;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOaid() {
        return this.oaid;
    }

    @NotNull
    public final String getOs_version() {
        return this.os_version;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getUser_id() {
        return this.user_id;
    }

    public final int getUser_id_type() {
        return this.user_id_type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((this.device_name.hashCode() * 31) + this.device_type.hashCode()) * 31) + this.did.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.sku.hashCode()) * 31) + this.model.hashCode()) * 31) + this.hardware_version.hashCode();
    }

    public final void setBind_phone_model(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bind_phone_model = str;
    }

    public final void setEvent_time(int i) {
        this.event_time = i;
    }

    public final void setExtra(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extra = str;
    }

    public final void setOaid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oaid = str;
    }

    public final void setOs_version(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_version = str;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final void setUser_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.user_id = str;
    }

    public final void setUser_id_type(int i) {
        this.user_id_type = i;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "DeviceActiveBean(device_name=" + this.device_name + ", device_type=" + this.device_type + ", did=" + this.did + ", sn=" + this.sn + ", sku=" + this.sku + ", model=" + this.model + ", hardware_version=" + this.hardware_version + ")";
    }
}
