package com.xiaomi.hm.health.nps.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/nps/model/Extensions;", "", "", "jsbridgeAuth", "Ljava/lang/Boolean;", "getJsbridgeAuth", "()Ljava/lang/Boolean;", "setJsbridgeAuth", "(Ljava/lang/Boolean;)V", "", "starttime", "Ljava/lang/Integer;", "getStarttime", "()Ljava/lang/Integer;", "setStarttime", "(Ljava/lang/Integer;)V", "endtime", "getEndtime", "setEndtime", "Lcom/xiaomi/hm/health/nps/model/Assets;", "assets", "Lcom/xiaomi/hm/health/nps/model/Assets;", "getAssets", "()Lcom/xiaomi/hm/health/nps/model/Assets;", "setAssets", "(Lcom/xiaomi/hm/health/nps/model/Assets;)V", "useNetworkType", "getUseNetworkType", "setUseNetworkType", "", "npsDeviceSource", "Ljava/lang/String;", "getNpsDeviceSource", "()Ljava/lang/String;", "setNpsDeviceSource", "(Ljava/lang/String;)V", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class Extensions {

    @Nullable
    private Assets assets;

    @Nullable
    private Integer endtime;

    @Nullable
    private Boolean jsbridgeAuth;

    @SerializedName("nps_device_id")
    @Nullable
    private String npsDeviceSource;

    @Nullable
    private Integer starttime;

    @Nullable
    private Integer useNetworkType;

    @Nullable
    public final Assets getAssets() {
        return this.assets;
    }

    @Nullable
    public final Integer getEndtime() {
        return this.endtime;
    }

    @Nullable
    public final Boolean getJsbridgeAuth() {
        return this.jsbridgeAuth;
    }

    @Nullable
    public final String getNpsDeviceSource() {
        return this.npsDeviceSource;
    }

    @Nullable
    public final Integer getStarttime() {
        return this.starttime;
    }

    @Nullable
    public final Integer getUseNetworkType() {
        return this.useNetworkType;
    }

    public final void setAssets(@Nullable Assets assets) {
        this.assets = assets;
    }

    public final void setEndtime(@Nullable Integer num) {
        this.endtime = num;
    }

    public final void setJsbridgeAuth(@Nullable Boolean bool) {
        this.jsbridgeAuth = bool;
    }

    public final void setNpsDeviceSource(@Nullable String str) {
        this.npsDeviceSource = str;
    }

    public final void setStarttime(@Nullable Integer num) {
        this.starttime = num;
    }

    public final void setUseNetworkType(@Nullable Integer num) {
        this.useNetworkType = num;
    }
}
