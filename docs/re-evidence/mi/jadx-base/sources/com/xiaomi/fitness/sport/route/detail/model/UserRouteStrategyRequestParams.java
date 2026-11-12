package com.xiaomi.fitness.sport.route.detail.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0081\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010:\u001a\u00020\u0003J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR \u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001e\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R \u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR \u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001b¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStrategyRequestParams;", "Landroid/os/Parcelable;", "sceneType", "", "styleType", "planInfo", "", "patternId", "longitude", "", "latitude", "cityName", TSMAuthContants.PARAM_CITYCODE, "distance", "addressName", "startName", "<init>", "(IILjava/lang/String;IDDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getSceneType", "()I", "setSceneType", "(I)V", "getStyleType", "setStyleType", "getPlanInfo", "()Ljava/lang/String;", "setPlanInfo", "(Ljava/lang/String;)V", "getPatternId", "setPatternId", "getLongitude", "()D", "setLongitude", "(D)V", "getLatitude", "setLatitude", "getCityName", "setCityName", "getCityCode", "setCityCode", "getDistance", "setDistance", "getAddressName", "setAddressName", "getStartName", "setStartName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserRouteStrategyRequestParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserRouteStrategyRequestParams> CREATOR = new Creator();

    @SerializedName("address_name")
    @Nullable
    private String addressName;

    @SerializedName("city_code")
    @Nullable
    private String cityCode;

    @SerializedName("city_name")
    @Nullable
    private String cityName;

    @SerializedName("distance")
    private double distance;

    @SerializedName("latitude")
    private double latitude;

    @SerializedName("longitude")
    private double longitude;

    @SerializedName("pattern_id")
    private int patternId;

    @SerializedName("plan_info")
    @Nullable
    private String planInfo;

    @SerializedName("scene_type")
    private int sceneType;

    @SerializedName("start_name")
    @Nullable
    private String startName;

    @SerializedName("style_type")
    private int styleType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserRouteStrategyRequestParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserRouteStrategyRequestParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserRouteStrategyRequestParams(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserRouteStrategyRequestParams[] newArray(int i) {
            return new UserRouteStrategyRequestParams[i];
        }
    }

    public UserRouteStrategyRequestParams() {
        this(0, 0, null, 0, 0.0d, 0.0d, null, null, 0.0d, null, null, 2047, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSceneType() {
        return this.sceneType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAddressName() {
        return this.addressName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStartName() {
        return this.startName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStyleType() {
        return this.styleType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlanInfo() {
        return this.planInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPatternId() {
        return this.patternId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCityName() {
        return this.cityName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final UserRouteStrategyRequestParams copy(int sceneType, int styleType, @Nullable String planInfo, int patternId, double longitude, double latitude, @Nullable String cityName, @Nullable String cityCode, double distance, @Nullable String addressName, @Nullable String startName) {
        return new UserRouteStrategyRequestParams(sceneType, styleType, planInfo, patternId, longitude, latitude, cityName, cityCode, distance, addressName, startName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRouteStrategyRequestParams)) {
            return false;
        }
        UserRouteStrategyRequestParams userRouteStrategyRequestParams = (UserRouteStrategyRequestParams) other;
        return this.sceneType == userRouteStrategyRequestParams.sceneType && this.styleType == userRouteStrategyRequestParams.styleType && Intrinsics.areEqual(this.planInfo, userRouteStrategyRequestParams.planInfo) && this.patternId == userRouteStrategyRequestParams.patternId && Double.compare(this.longitude, userRouteStrategyRequestParams.longitude) == 0 && Double.compare(this.latitude, userRouteStrategyRequestParams.latitude) == 0 && Intrinsics.areEqual(this.cityName, userRouteStrategyRequestParams.cityName) && Intrinsics.areEqual(this.cityCode, userRouteStrategyRequestParams.cityCode) && Double.compare(this.distance, userRouteStrategyRequestParams.distance) == 0 && Intrinsics.areEqual(this.addressName, userRouteStrategyRequestParams.addressName) && Intrinsics.areEqual(this.startName, userRouteStrategyRequestParams.startName);
    }

    @Nullable
    public final String getAddressName() {
        return this.addressName;
    }

    @Nullable
    public final String getCityCode() {
        return this.cityCode;
    }

    @Nullable
    public final String getCityName() {
        return this.cityName;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getPatternId() {
        return this.patternId;
    }

    @Nullable
    public final String getPlanInfo() {
        return this.planInfo;
    }

    public final int getSceneType() {
        return this.sceneType;
    }

    @Nullable
    public final String getStartName() {
        return this.startName;
    }

    public final int getStyleType() {
        return this.styleType;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.sceneType) * 31) + Integer.hashCode(this.styleType)) * 31;
        String str = this.planInfo;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.patternId)) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.latitude)) * 31;
        String str2 = this.cityName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cityCode;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.hashCode(this.distance)) * 31;
        String str4 = this.addressName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.startName;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAddressName(@Nullable String str) {
        this.addressName = str;
    }

    public final void setCityCode(@Nullable String str) {
        this.cityCode = str;
    }

    public final void setCityName(@Nullable String str) {
        this.cityName = str;
    }

    public final void setDistance(double d) {
        this.distance = d;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setPatternId(int i) {
        this.patternId = i;
    }

    public final void setPlanInfo(@Nullable String str) {
        this.planInfo = str;
    }

    public final void setSceneType(int i) {
        this.sceneType = i;
    }

    public final void setStartName(@Nullable String str) {
        this.startName = str;
    }

    public final void setStyleType(int i) {
        this.styleType = i;
    }

    @NotNull
    public String toString() {
        return "UserRouteStrategyRequestParams(sceneType=" + this.sceneType + ", styleType=" + this.styleType + ", planInfo=" + this.planInfo + ", patternId=" + this.patternId + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", cityName=" + this.cityName + ", cityCode=" + this.cityCode + ", distance=" + this.distance + ", addressName=" + this.addressName + ", startName=" + this.startName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.sceneType);
        dest.writeInt(this.styleType);
        dest.writeString(this.planInfo);
        dest.writeInt(this.patternId);
        dest.writeDouble(this.longitude);
        dest.writeDouble(this.latitude);
        dest.writeString(this.cityName);
        dest.writeString(this.cityCode);
        dest.writeDouble(this.distance);
        dest.writeString(this.addressName);
        dest.writeString(this.startName);
    }

    public UserRouteStrategyRequestParams(int i, int i2, @Nullable String str, int i3, double d, double d2, @Nullable String str2, @Nullable String str3, double d3, @Nullable String str4, @Nullable String str5) {
        this.sceneType = i;
        this.styleType = i2;
        this.planInfo = str;
        this.patternId = i3;
        this.longitude = d;
        this.latitude = d2;
        this.cityName = str2;
        this.cityCode = str3;
        this.distance = d3;
        this.addressName = str4;
        this.startName = str5;
    }

    public /* synthetic */ UserRouteStrategyRequestParams(int i, int i2, String str, int i3, double d, double d2, String str2, String str3, double d3, String str4, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? null : str, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? 0.0d : d, (i4 & 32) != 0 ? 0.0d : d2, (i4 & 64) != 0 ? null : str2, (i4 & 128) != 0 ? null : str3, (i4 & 256) == 0 ? d3 : 0.0d, (i4 & 512) != 0 ? null : str4, (i4 & 1024) == 0 ? str5 : null);
    }
}
