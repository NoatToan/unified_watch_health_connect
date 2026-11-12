package com.xiaomi.hm.health.locweather.huami_weather_bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/locweather/huami_weather_bean/AqiModel;", "", "", "a", "Ljava/lang/String;", "getAqi", "()Ljava/lang/String;", "setAqi", "(Ljava/lang/String;)V", "aqi", "b", "getCo", "setCo", Constants.JSON_COUNTRY, "c", "getNo2", "setNo2", "no2", GoogleApiAvailabilityLight.a, "getO3", "setO3", "o3", "e", "getPm10", "setPm10", "pm10", "f", "getPm25", "setPm25", "pm25", "g", "getPubTime", "setPubTime", "pubTime", "h", "getSo2", "setSo2", "so2", "<init>", "()V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class AqiModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("aqi")
    @Nullable
    private String aqi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(Constants.JSON_COUNTRY)
    @Nullable
    private String co;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("no2")
    @Nullable
    private String no2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("o3")
    @Nullable
    private String o3;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("pm10")
    @Nullable
    private String pm10;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("pm25")
    @Nullable
    private String pm25;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("pubTime")
    @Nullable
    private String pubTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("so2")
    @Nullable
    private String so2;

    @Nullable
    public final String getAqi() {
        return this.aqi;
    }

    @Nullable
    public final String getCo() {
        return this.co;
    }

    @Nullable
    public final String getNo2() {
        return this.no2;
    }

    @Nullable
    public final String getO3() {
        return this.o3;
    }

    @Nullable
    public final String getPm10() {
        return this.pm10;
    }

    @Nullable
    public final String getPm25() {
        return this.pm25;
    }

    @Nullable
    public final String getPubTime() {
        return this.pubTime;
    }

    @Nullable
    public final String getSo2() {
        return this.so2;
    }

    public final void setAqi(@Nullable String str) {
        this.aqi = str;
    }

    public final void setCo(@Nullable String str) {
        this.co = str;
    }

    public final void setNo2(@Nullable String str) {
        this.no2 = str;
    }

    public final void setO3(@Nullable String str) {
        this.o3 = str;
    }

    public final void setPm10(@Nullable String str) {
        this.pm10 = str;
    }

    public final void setPm25(@Nullable String str) {
        this.pm25 = str;
    }

    public final void setPubTime(@Nullable String str) {
        this.pubTime = str;
    }

    public final void setSo2(@Nullable String str) {
        this.so2 = str;
    }
}
