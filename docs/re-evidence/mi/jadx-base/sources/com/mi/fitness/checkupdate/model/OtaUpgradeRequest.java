package com.mi.fitness.checkupdate.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b-\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR \u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR \u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\t¨\u00062"}, d2 = {"Lcom/mi/fitness/checkupdate/model/OtaUpgradeRequest;", "", "<init>", "()V", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "deviceSource", "getDeviceSource", "setDeviceSource", "firmwareFlag", "getFirmwareFlag", "setFirmwareFlag", "firmwareVersion", "getFirmwareVersion", "setFirmwareVersion", "fontFlag", "getFontFlag", "setFontFlag", "fontVersion", "getFontVersion", "setFontVersion", "gpsVersion", "getGpsVersion", "setGpsVersion", "hardwareVersion", "getHardwareVersion", "setHardwareVersion", "productionSource", "getProductionSource", "setProductionSource", "resourceFlag", "getResourceFlag", "setResourceFlag", "resourceVersion", "getResourceVersion", "setResourceVersion", "appName", "getAppName", "setAppName", TSMAuthContants.PARAM_LANGUAGE, "getLang", "setLang", "appPlatform", "getAppPlatform", "setAppPlatform", "toString", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtaUpgradeRequest {

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
