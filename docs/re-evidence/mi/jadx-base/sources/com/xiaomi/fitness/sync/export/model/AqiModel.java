package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/AqiModel;", "", "pubTime", "", "aqi", CommonConstants.KEY_COUNTRY, "no2", "o3", "pm10", "pm25", "so2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPubTime", "()Ljava/lang/String;", "getAqi", "getCo", "getNo2", "getO3", "getPm10", "getPm25", "getSo2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AqiModel {

    @SerializedName("aqi")
    @NotNull
    private final String aqi;

    @SerializedName(CommonConstants.KEY_COUNTRY)
    @NotNull
    private final String co;

    @SerializedName("no2")
    @NotNull
    private final String no2;

    @SerializedName("o3")
    @NotNull
    private final String o3;

    @SerializedName("pm10")
    @NotNull
    private final String pm10;

    @SerializedName("pm25")
    @NotNull
    private final String pm25;

    @SerializedName("pubTime")
    @NotNull
    private final String pubTime;

    @SerializedName("so2")
    @NotNull
    private final String so2;

    public AqiModel(@NotNull String pubTime, @NotNull String aqi, @NotNull String co, @NotNull String no2, @NotNull String o3, @NotNull String pm10, @NotNull String pm25, @NotNull String so2) {
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        Intrinsics.checkNotNullParameter(aqi, "aqi");
        Intrinsics.checkNotNullParameter(co, "co");
        Intrinsics.checkNotNullParameter(no2, "no2");
        Intrinsics.checkNotNullParameter(o3, "o3");
        Intrinsics.checkNotNullParameter(pm10, "pm10");
        Intrinsics.checkNotNullParameter(pm25, "pm25");
        Intrinsics.checkNotNullParameter(so2, "so2");
        this.pubTime = pubTime;
        this.aqi = aqi;
        this.co = co;
        this.no2 = no2;
        this.o3 = o3;
        this.pm10 = pm10;
        this.pm25 = pm25;
        this.so2 = so2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAqi() {
        return this.aqi;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCo() {
        return this.co;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNo2() {
        return this.no2;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getO3() {
        return this.o3;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPm10() {
        return this.pm10;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPm25() {
        return this.pm25;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSo2() {
        return this.so2;
    }

    @NotNull
    public final AqiModel copy(@NotNull String pubTime, @NotNull String aqi, @NotNull String co, @NotNull String no2, @NotNull String o3, @NotNull String pm10, @NotNull String pm25, @NotNull String so2) {
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        Intrinsics.checkNotNullParameter(aqi, "aqi");
        Intrinsics.checkNotNullParameter(co, "co");
        Intrinsics.checkNotNullParameter(no2, "no2");
        Intrinsics.checkNotNullParameter(o3, "o3");
        Intrinsics.checkNotNullParameter(pm10, "pm10");
        Intrinsics.checkNotNullParameter(pm25, "pm25");
        Intrinsics.checkNotNullParameter(so2, "so2");
        return new AqiModel(pubTime, aqi, co, no2, o3, pm10, pm25, so2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AqiModel)) {
            return false;
        }
        AqiModel aqiModel = (AqiModel) other;
        return Intrinsics.areEqual(this.pubTime, aqiModel.pubTime) && Intrinsics.areEqual(this.aqi, aqiModel.aqi) && Intrinsics.areEqual(this.co, aqiModel.co) && Intrinsics.areEqual(this.no2, aqiModel.no2) && Intrinsics.areEqual(this.o3, aqiModel.o3) && Intrinsics.areEqual(this.pm10, aqiModel.pm10) && Intrinsics.areEqual(this.pm25, aqiModel.pm25) && Intrinsics.areEqual(this.so2, aqiModel.so2);
    }

    @NotNull
    public final String getAqi() {
        return this.aqi;
    }

    @NotNull
    public final String getCo() {
        return this.co;
    }

    @NotNull
    public final String getNo2() {
        return this.no2;
    }

    @NotNull
    public final String getO3() {
        return this.o3;
    }

    @NotNull
    public final String getPm10() {
        return this.pm10;
    }

    @NotNull
    public final String getPm25() {
        return this.pm25;
    }

    @NotNull
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    public final String getSo2() {
        return this.so2;
    }

    public int hashCode() {
        return (((((((((((((this.pubTime.hashCode() * 31) + this.aqi.hashCode()) * 31) + this.co.hashCode()) * 31) + this.no2.hashCode()) * 31) + this.o3.hashCode()) * 31) + this.pm10.hashCode()) * 31) + this.pm25.hashCode()) * 31) + this.so2.hashCode();
    }

    @NotNull
    public String toString() {
        return "AqiModel(pubTime=" + this.pubTime + ", aqi=" + this.aqi + ", co=" + this.co + ", no2=" + this.no2 + ", o3=" + this.o3 + ", pm10=" + this.pm10 + ", pm25=" + this.pm25 + ", so2=" + this.so2 + ")";
    }
}
