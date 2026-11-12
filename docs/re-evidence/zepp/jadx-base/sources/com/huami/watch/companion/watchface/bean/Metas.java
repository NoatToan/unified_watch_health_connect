package com.huami.watch.companion.watchface.bean;

import com.google.gson.annotations.SerializedName;
import com.huami.ad.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/huami/watch/companion/watchface/bean/Metas;", "Ljava/io/Serializable;", "", "minimumFirmwareVersion", "Ljava/lang/String;", "getMinimumFirmwareVersion", "()Ljava/lang/String;", "setMinimumFirmwareVersion", "(Ljava/lang/String;)V", Constants.GIF_PATH, "getGif", "setGif", "transparentBg", "getTransparentBg", "setTransparentBg", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class Metas implements Serializable {

    @SerializedName(Constants.GIF_PATH)
    @Nullable
    private String gif;

    @SerializedName("minimum_firmware_version")
    @Nullable
    private String minimumFirmwareVersion;

    @SerializedName("transparent_background")
    @Nullable
    private String transparentBg;

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
