package com.mi.fitness.checkupdate.model;

import androidx.annotation.Keep;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 l2\u00020\u0001:\u0001lB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010k\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001a\u0010.\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R\u001c\u00101\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u001a\u00104\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R\u001c\u00107\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001a\u0010:\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u0010\u0018R\u001c\u0010=\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\tR\u001c\u0010@\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\u001a\u0010C\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0016\"\u0004\bE\u0010\u0018R\u001c\u0010F\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR\u001c\u0010I\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\tR\u001a\u0010L\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010%\"\u0004\bN\u0010'R\u001c\u0010O\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0007\"\u0004\bQ\u0010\tR\u001a\u0010R\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0016\"\u0004\bT\u0010\u0018R\u001c\u0010U\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010\tR\u001c\u0010X\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0007\"\u0004\bZ\u0010\tR\u001a\u0010[\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010%\"\u0004\b]\u0010'R\u001c\u0010^\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0007\"\u0004\b`\u0010\tR\u001a\u0010a\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0016\"\u0004\bc\u0010\u0018R\u001a\u0010d\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u0018R\u0011\u0010g\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bg\u0010iR\u0011\u0010j\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bj\u0010i¨\u0006m"}, d2 = {"Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;", "Ljava/io/Serializable;", "<init>", "()V", "changeLog", "", "getChangeLog", "()Ljava/lang/String;", "setChangeLog", "(Ljava/lang/String;)V", "firmwareVersion", "getFirmwareVersion", "setFirmwareVersion", "firmwareUrl", "getFirmwareUrl", "setFirmwareUrl", "deviceType", "getDeviceType", "setDeviceType", "deviceSource", "", "getDeviceSource", "()I", "setDeviceSource", "(I)V", "gpsVersion", "getGpsVersion", "setGpsVersion", "gpsUrl", "getGpsUrl", "setGpsUrl", "firmwareMd5", "getFirmwareMd5", "setFirmwareMd5", "firmwareLength", "", "getFirmwareLength", "()J", "setFirmwareLength", "(J)V", "firmwareFlag", "getFirmwareFlag", "setFirmwareFlag", "fontMd5", "getFontMd5", "setFontMd5", "fontLength", "getFontLength", "setFontLength", "gpsMd5", "getGpsMd5", "setGpsMd5", "gpsLength", "getGpsLength", "setGpsLength", "fontVersion", "getFontVersion", "setFontVersion", "fontFlag", "getFontFlag", "setFontFlag", "fontUrl", "getFontUrl", "setFontUrl", "resourceVersion", "getResourceVersion", "setResourceVersion", "resourceFlag", "getResourceFlag", "setResourceFlag", "resourceUrl", "getResourceUrl", "setResourceUrl", "resourceMd5", "getResourceMd5", "setResourceMd5", "resourceLength", "getResourceLength", "setResourceLength", "baseResourceVersion", "getBaseResourceVersion", "setBaseResourceVersion", "baseResourceFlag", "getBaseResourceFlag", "setBaseResourceFlag", "baseResourceUrl", "getBaseResourceUrl", "setBaseResourceUrl", "baseResourceMd5", "getBaseResourceMd5", "setBaseResourceMd5", "baseResourceLength", "getBaseResourceLength", "setBaseResourceLength", TSMAuthContants.PARAM_LANGUAGE, "getLang", "setLang", "productionSource", "getProductionSource", "setProductionSource", "upgradeType", "getUpgradeType", "setUpgradeType", "isNeedUpdate", "", "()Z", "isForce", "toString", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtaUpgradeResult implements Serializable {
    private static final long serialVersionUID = -4306715594922975795L;
    private int baseResourceFlag;
    private long baseResourceLength;

    @Nullable
    private String baseResourceMd5;

    @Nullable
    private String baseResourceUrl;

    @Nullable
    private String baseResourceVersion;

    @Nullable
    private String changeLog;
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

    @Nullable
    public final String getChangeLog() {
        return this.changeLog;
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
        return isNeedUpdate() && this.upgradeType == 2;
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

    public final void setChangeLog(@Nullable String str) {
        this.changeLog = str;
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

    @NotNull
    public String toString() {
        return "OtaUpgradeResult(firmwareVersion=" + this.firmwareVersion + ", firmwareUrl=" + this.firmwareUrl + ", deviceType=" + this.deviceType + ", deviceSource=" + this.deviceSource + ", gpsVersion=" + this.gpsVersion + ", gpsUrl=" + this.gpsUrl + ", firmwareMd5=" + this.firmwareMd5 + ", firmwareLength=" + this.firmwareLength + ", firmwareFlag=" + this.firmwareFlag + ", fontMd5=" + this.fontMd5 + ", fontLength=" + this.fontLength + ", gpsMd5=" + this.gpsMd5 + ", gpsLength=" + this.gpsLength + ", fontVersion=" + this.fontVersion + ", fontFlag=" + this.fontFlag + ", fontUrl=" + this.fontUrl + ", resourceVersion=" + this.resourceVersion + ", resourceFlag=" + this.resourceFlag + ", resourceUrl=" + this.resourceUrl + ", resourceMd5=" + this.resourceMd5 + ", resourceLength=" + this.resourceLength + ", baseResourceVersion=" + this.baseResourceVersion + ", baseResourceFlag=" + this.baseResourceFlag + ", baseResourceUrl=" + this.baseResourceUrl + ", baseResourceMd5=" + this.baseResourceMd5 + ", baseResourceLength=" + this.baseResourceLength + ", lang=" + this.lang + ", productionSource=" + this.productionSource + ", upgradeType=" + this.upgradeType + ", isNeedUpdate=" + isNeedUpdate() + ", isForce=" + isForce() + ", changeLog=" + this.changeLog + ")";
    }
}
