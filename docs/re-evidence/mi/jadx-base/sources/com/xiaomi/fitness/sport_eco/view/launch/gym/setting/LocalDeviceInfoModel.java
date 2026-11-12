package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.nfc.NfcConstants;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\u000e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoModel;", "", "name", "", "model", TSMAuthContants.PARAM_FIRMWARE_VERSION, "mac", "sn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getModel", "setModel", "(Ljava/lang/String;)V", NfcConstants.METHOD_GET_FW_VERSION, "setFwVersion", "getMac", "getSn", "setSn", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocalDeviceInfoModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String fwVersion;

    @Nullable
    private final String mac;

    @Nullable
    private String model;

    @Nullable
    private final String name;

    @Nullable
    private String sn;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoModel$Companion;", "", "<init>", "()V", "valueOf", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoModel;", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final LocalDeviceInfoModel valueOf(@NotNull EcoDeviceInfo deviceInfo) {
            Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            return new LocalDeviceInfoModel(deviceInfo.getName(), deviceInfo.getModel(), deviceInfo.getFirmwareVersion(), deviceInfo.getMac(), deviceInfo.getSn());
        }
    }

    public LocalDeviceInfoModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.name = str;
        this.model = str2;
        this.fwVersion = str3;
        this.mac = str4;
        this.sn = str5;
    }

    public static /* synthetic */ LocalDeviceInfoModel copy$default(LocalDeviceInfoModel localDeviceInfoModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localDeviceInfoModel.name;
        }
        if ((i & 2) != 0) {
            str2 = localDeviceInfoModel.model;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = localDeviceInfoModel.fwVersion;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = localDeviceInfoModel.mac;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = localDeviceInfoModel.sn;
        }
        return localDeviceInfoModel.copy(str, str6, str7, str8, str5);
    }

    @JvmStatic
    @NotNull
    public static final LocalDeviceInfoModel valueOf(@NotNull EcoDeviceInfo ecoDeviceInfo) {
        return INSTANCE.valueOf(ecoDeviceInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFwVersion() {
        return this.fwVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final LocalDeviceInfoModel copy(@Nullable String name, @Nullable String model, @Nullable String fwVersion, @Nullable String mac, @Nullable String sn) {
        return new LocalDeviceInfoModel(name, model, fwVersion, mac, sn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalDeviceInfoModel)) {
            return false;
        }
        LocalDeviceInfoModel localDeviceInfoModel = (LocalDeviceInfoModel) other;
        return Intrinsics.areEqual(this.name, localDeviceInfoModel.name) && Intrinsics.areEqual(this.model, localDeviceInfoModel.model) && Intrinsics.areEqual(this.fwVersion, localDeviceInfoModel.fwVersion) && Intrinsics.areEqual(this.mac, localDeviceInfoModel.mac) && Intrinsics.areEqual(this.sn, localDeviceInfoModel.sn);
    }

    @Nullable
    public final String getFwVersion() {
        return this.fwVersion;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fwVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mac;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sn;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setFwVersion(@Nullable String str) {
        this.fwVersion = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setSn(@Nullable String str) {
        this.sn = str;
    }

    @NotNull
    public String toString() {
        return "LocalDeviceInfoModel(name=" + this.name + ", model=" + this.model + ", fwVersion=" + this.fwVersion + ", mac=" + this.mac + ", sn=" + this.sn + ")";
    }
}
