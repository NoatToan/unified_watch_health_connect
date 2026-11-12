package com.xiaomi.fitness.device.manager.export.bean;

import android.os.Build;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/AppInfoData;", "", DevInfoKeys.OS_VERSION, "", "phoneModel", "source", "oaid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOsVersion", "()Ljava/lang/String;", "setOsVersion", "(Ljava/lang/String;)V", "getPhoneModel", "setPhoneModel", "getSource", "setSource", "getOaid", "setOaid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppInfoData {

    @SerializedName("oaid")
    @NotNull
    private String oaid;

    @SerializedName("os_version")
    @NotNull
    private String osVersion;

    @SerializedName("phone_model")
    @NotNull
    private String phoneModel;

    @SerializedName("source")
    @NotNull
    private String source;

    public AppInfoData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AppInfoData copy$default(AppInfoData appInfoData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfoData.osVersion;
        }
        if ((i & 2) != 0) {
            str2 = appInfoData.phoneModel;
        }
        if ((i & 4) != 0) {
            str3 = appInfoData.source;
        }
        if ((i & 8) != 0) {
            str4 = appInfoData.oaid;
        }
        return appInfoData.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneModel() {
        return this.phoneModel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOaid() {
        return this.oaid;
    }

    @NotNull
    public final AppInfoData copy(@NotNull String osVersion, @NotNull String phoneModel, @NotNull String source, @NotNull String oaid) {
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(phoneModel, "phoneModel");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(oaid, "oaid");
        return new AppInfoData(osVersion, phoneModel, source, oaid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfoData)) {
            return false;
        }
        AppInfoData appInfoData = (AppInfoData) other;
        return Intrinsics.areEqual(this.osVersion, appInfoData.osVersion) && Intrinsics.areEqual(this.phoneModel, appInfoData.phoneModel) && Intrinsics.areEqual(this.source, appInfoData.source) && Intrinsics.areEqual(this.oaid, appInfoData.oaid);
    }

    @NotNull
    public final String getOaid() {
        return this.oaid;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getPhoneModel() {
        return this.phoneModel;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((((this.osVersion.hashCode() * 31) + this.phoneModel.hashCode()) * 31) + this.source.hashCode()) * 31) + this.oaid.hashCode();
    }

    public final void setOaid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oaid = str;
    }

    public final void setOsVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.osVersion = str;
    }

    public final void setPhoneModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneModel = str;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    @NotNull
    public String toString() {
        return "AppInfoData(osVersion=" + this.osVersion + ", phoneModel=" + this.phoneModel + ", source=" + this.source + ", oaid=" + this.oaid + ")";
    }

    public AppInfoData(@NotNull String osVersion, @NotNull String phoneModel, @NotNull String source, @NotNull String oaid) {
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(phoneModel, "phoneModel");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(oaid, "oaid");
        this.osVersion = osVersion;
        this.phoneModel = phoneModel;
        this.source = source;
        this.oaid = oaid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppInfoData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = RomUtils.isXiaomi() ? OneTrack.Param.MIUI : PluginPackageConstant.RN_DIR_A;
        }
        if ((i & 2) != 0) {
            str2 = RomUtils.INSTANCE.getRomInfo().getName() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Build.MODEL;
        }
        str3 = (i & 4) != 0 ? "mi_sport_hlth" : str3;
        if ((i & 8) != 0 && (str4 = DeviceUtil.INSTANCE.getOAID(ApplicationExtKt.getApplication())) == null) {
            str4 = "";
        }
        this(str, str2, str3, str4);
    }
}
