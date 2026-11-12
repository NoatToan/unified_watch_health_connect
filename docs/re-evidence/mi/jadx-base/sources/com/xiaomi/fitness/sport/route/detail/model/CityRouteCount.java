package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/CityRouteCount;", "", TSMAuthContants.PARAM_CITYCODE, "", "routeNums", "latitude", "", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;DD)V", "getCityCode", "()Ljava/lang/String;", "getRouteNums", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CityRouteCount {

    @SerializedName("city_code")
    @NotNull
    private final String cityCode;
    private double latitude;
    private double longitude;

    @SerializedName("route_nums")
    @NotNull
    private final String routeNums;

    public CityRouteCount(@NotNull String cityCode, @NotNull String routeNums, double d, double d2) {
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(routeNums, "routeNums");
        this.cityCode = cityCode;
        this.routeNums = routeNums;
        this.latitude = d;
        this.longitude = d2;
    }

    public static /* synthetic */ CityRouteCount copy$default(CityRouteCount cityRouteCount, String str, String str2, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cityRouteCount.cityCode;
        }
        if ((i & 2) != 0) {
            str2 = cityRouteCount.routeNums;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            d = cityRouteCount.latitude;
        }
        double d3 = d;
        if ((i & 8) != 0) {
            d2 = cityRouteCount.longitude;
        }
        return cityRouteCount.copy(str, str3, d3, d2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRouteNums() {
        return this.routeNums;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final CityRouteCount copy(@NotNull String cityCode, @NotNull String routeNums, double latitude, double longitude) {
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(routeNums, "routeNums");
        return new CityRouteCount(cityCode, routeNums, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CityRouteCount)) {
            return false;
        }
        CityRouteCount cityRouteCount = (CityRouteCount) other;
        return Intrinsics.areEqual(this.cityCode, cityRouteCount.cityCode) && Intrinsics.areEqual(this.routeNums, cityRouteCount.routeNums) && Double.compare(this.latitude, cityRouteCount.latitude) == 0 && Double.compare(this.longitude, cityRouteCount.longitude) == 0;
    }

    @NotNull
    public final String getCityCode() {
        return this.cityCode;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getRouteNums() {
        return this.routeNums;
    }

    public int hashCode() {
        return (((((this.cityCode.hashCode() * 31) + this.routeNums.hashCode()) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude);
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    @NotNull
    public String toString() {
        return "CityRouteCount(cityCode=" + this.cityCode + ", routeNums=" + this.routeNums + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
