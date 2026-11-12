package com.xiaomi.hm.health.device.watchskinnew.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.ad.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/bean/MetasNew;", "", "", "a", "Ljava/lang/String;", "getMinimumFirmwareVersion", "()Ljava/lang/String;", "setMinimumFirmwareVersion", "(Ljava/lang/String;)V", "minimumFirmwareVersion", "b", "getBadge", "setBadge", "badge", "c", "getTransparentBg", "setTransparentBg", "transparentBg", GoogleApiAvailabilityLight.a, "getGif", "setGif", Constants.GIF_PATH, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MetasNew {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("minimum_firmware_version")
    @Nullable
    private String minimumFirmwareVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("badge")
    @Nullable
    private String badge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("transparent_background")
    @Nullable
    private String transparentBg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(Constants.GIF_PATH)
    @Nullable
    private String gif;

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    public final String getGif() {
        return this.gif;
    }

    @Nullable
    public final String getMinimumFirmwareVersion() {
        return this.minimumFirmwareVersion;
    }

    @Nullable
    public final String getTransparentBg() {
        return this.transparentBg;
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    public final void setGif(@Nullable String str) {
        this.gif = str;
    }

    public final void setMinimumFirmwareVersion(@Nullable String str) {
        this.minimumFirmwareVersion = str;
    }

    public final void setTransparentBg(@Nullable String str) {
        this.transparentBg = str;
    }
}
