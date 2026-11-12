package com.xiaomi.wearable.yrn.components.amap;

import com.amap.api.services.district.DistrictSearchQuery;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\fHÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\fHÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003JÑ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\tHÆ\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\tHÖ\u0001J\t\u0010M\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0011\u0010\u0014\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\u0016\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#¨\u0006N"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/Location;", "", "longitude", "", "latitude", "altitude", "accuracy", "", "bearing", "", "speed", "coordType", "", "country", "province", "city", DistrictSearchQuery.KEYWORDS_DISTRICT, "street", "streetNum", Home.JSON_KEY_ADDRESS, TSMAuthContants.PARAM_CITYCODE, "adCode", "poiName", "satellites", Constants.EXTRA_ERROR_MESSAGE, "errorCode", "<init>", "(DDDFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getLongitude", "()D", "getLatitude", "getAltitude", "getAccuracy", "()F", "getBearing", "()I", "getSpeed", "getCoordType", "()Ljava/lang/String;", "getCountry", "getProvince", "getCity", "getDistrict", "getStreet", "getStreetNum", "getAddress", "getCityCode", "getAdCode", "getPoiName", "getSatellites", "getErrorMsg", "getErrorCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "toString", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Location {
    private final float accuracy;

    @NotNull
    private final String adCode;

    @NotNull
    private final String address;
    private final double altitude;
    private final int bearing;

    @NotNull
    private final String city;

    @NotNull
    private final String cityCode;

    @NotNull
    private final String coordType;

    @NotNull
    private final String country;

    @NotNull
    private final String district;
    private final int errorCode;

    @NotNull
    private final String errorMsg;
    private final double latitude;
    private final double longitude;

    @NotNull
    private final String poiName;

    @NotNull
    private final String province;
    private final int satellites;
    private final int speed;

    @NotNull
    private final String street;

    @NotNull
    private final String streetNum;

    public Location(double d, double d2, double d3, float f, int i, int i2, @NotNull String coordType, @NotNull String country, @NotNull String province, @NotNull String city, @NotNull String district, @NotNull String street, @NotNull String streetNum, @NotNull String address, @NotNull String cityCode, @NotNull String adCode, @NotNull String poiName, int i3, @NotNull String errorMsg, int i4) {
        Intrinsics.checkNotNullParameter(coordType, "coordType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(streetNum, "streetNum");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        Intrinsics.checkNotNullParameter(poiName, "poiName");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.longitude = d;
        this.latitude = d2;
        this.altitude = d3;
        this.accuracy = f;
        this.bearing = i;
        this.speed = i2;
        this.coordType = coordType;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.streetNum = streetNum;
        this.address = address;
        this.cityCode = cityCode;
        this.adCode = adCode;
        this.poiName = poiName;
        this.satellites = i3;
        this.errorMsg = errorMsg;
        this.errorCode = i4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStreetNum() {
        return this.streetNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAdCode() {
        return this.adCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPoiName() {
        return this.poiName;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getSatellites() {
        return this.satellites;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getAccuracy() {
        return this.accuracy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBearing() {
        return this.bearing;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSpeed() {
        return this.speed;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCoordType() {
        return this.coordType;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProvince() {
        return this.province;
    }

    @NotNull
    public final Location copy(double longitude, double latitude, double altitude, float accuracy, int bearing, int speed, @NotNull String coordType, @NotNull String country, @NotNull String province, @NotNull String city, @NotNull String district, @NotNull String street, @NotNull String streetNum, @NotNull String address, @NotNull String cityCode, @NotNull String adCode, @NotNull String poiName, int satellites, @NotNull String errorMsg, int errorCode) {
        Intrinsics.checkNotNullParameter(coordType, "coordType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(streetNum, "streetNum");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        Intrinsics.checkNotNullParameter(poiName, "poiName");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        return new Location(longitude, latitude, altitude, accuracy, bearing, speed, coordType, country, province, city, district, street, streetNum, address, cityCode, adCode, poiName, satellites, errorMsg, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Location)) {
            return false;
        }
        Location location = (Location) other;
        return Double.compare(this.longitude, location.longitude) == 0 && Double.compare(this.latitude, location.latitude) == 0 && Double.compare(this.altitude, location.altitude) == 0 && Float.compare(this.accuracy, location.accuracy) == 0 && this.bearing == location.bearing && this.speed == location.speed && Intrinsics.areEqual(this.coordType, location.coordType) && Intrinsics.areEqual(this.country, location.country) && Intrinsics.areEqual(this.province, location.province) && Intrinsics.areEqual(this.city, location.city) && Intrinsics.areEqual(this.district, location.district) && Intrinsics.areEqual(this.street, location.street) && Intrinsics.areEqual(this.streetNum, location.streetNum) && Intrinsics.areEqual(this.address, location.address) && Intrinsics.areEqual(this.cityCode, location.cityCode) && Intrinsics.areEqual(this.adCode, location.adCode) && Intrinsics.areEqual(this.poiName, location.poiName) && this.satellites == location.satellites && Intrinsics.areEqual(this.errorMsg, location.errorMsg) && this.errorCode == location.errorCode;
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    @NotNull
    public final String getAdCode() {
        return this.adCode;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final int getBearing() {
        return this.bearing;
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    public final String getCoordType() {
        return this.coordType;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDistrict() {
        return this.district;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getPoiName() {
        return this.poiName;
    }

    @NotNull
    public final String getProvince() {
        return this.province;
    }

    public final int getSatellites() {
        return this.satellites;
    }

    public final int getSpeed() {
        return this.speed;
    }

    @NotNull
    public final String getStreet() {
        return this.street;
    }

    @NotNull
    public final String getStreetNum() {
        return this.streetNum;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((Double.hashCode(this.longitude) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.altitude)) * 31) + Float.hashCode(this.accuracy)) * 31) + Integer.hashCode(this.bearing)) * 31) + Integer.hashCode(this.speed)) * 31) + this.coordType.hashCode()) * 31) + this.country.hashCode()) * 31) + this.province.hashCode()) * 31) + this.city.hashCode()) * 31) + this.district.hashCode()) * 31) + this.street.hashCode()) * 31) + this.streetNum.hashCode()) * 31) + this.address.hashCode()) * 31) + this.cityCode.hashCode()) * 31) + this.adCode.hashCode()) * 31) + this.poiName.hashCode()) * 31) + Integer.hashCode(this.satellites)) * 31) + this.errorMsg.hashCode()) * 31) + Integer.hashCode(this.errorCode);
    }

    @NotNull
    public String toString() {
        return "Location(longitude=" + this.longitude + ", latitude=" + this.latitude + ", altitude=" + this.altitude + ", accuracy=" + this.accuracy + ", bearing=" + this.bearing + ", speed=" + this.speed + ", coordType=" + this.coordType + ", country=" + this.country + ", province=" + this.province + ", city=" + this.city + ", district=" + this.district + ", street=" + this.street + ", streetNum=" + this.streetNum + ", address=" + this.address + ", cityCode=" + this.cityCode + ", adCode=" + this.adCode + ", poiName=" + this.poiName + ", satellites=" + this.satellites + ", errorMsg=" + this.errorMsg + ", errorCode=" + this.errorCode + ")";
    }
}
