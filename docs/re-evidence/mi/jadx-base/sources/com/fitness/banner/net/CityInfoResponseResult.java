package com.fitness.banner.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/fitness/banner/net/CityInfoResponseResult;", "", "cityId", "", "latitude", "longitude", "affiliation", "", "name", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;)V", "getCityId", "()J", "getLatitude", "getLongitude", "getAffiliation", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CityInfoResponseResult {

    @SerializedName("affiliation")
    @Nullable
    private final String affiliation;

    @SerializedName(Home.JSON_KEY_LOCATIONID)
    private final long cityId;

    @SerializedName("latitude")
    private final long latitude;

    @SerializedName("longitude")
    private final long longitude;

    @SerializedName("name")
    @Nullable
    private final String name;

    public CityInfoResponseResult(long j, long j2, long j3, @Nullable String str, @Nullable String str2) {
        this.cityId = j;
        this.latitude = j2;
        this.longitude = j3;
        this.affiliation = str;
        this.name = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCityId() {
        return this.cityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAffiliation() {
        return this.affiliation;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final CityInfoResponseResult copy(long cityId, long latitude, long longitude, @Nullable String affiliation, @Nullable String name) {
        return new CityInfoResponseResult(cityId, latitude, longitude, affiliation, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CityInfoResponseResult)) {
            return false;
        }
        CityInfoResponseResult cityInfoResponseResult = (CityInfoResponseResult) other;
        return this.cityId == cityInfoResponseResult.cityId && this.latitude == cityInfoResponseResult.latitude && this.longitude == cityInfoResponseResult.longitude && Intrinsics.areEqual(this.affiliation, cityInfoResponseResult.affiliation) && Intrinsics.areEqual(this.name, cityInfoResponseResult.name);
    }

    @Nullable
    public final String getAffiliation() {
        return this.affiliation;
    }

    public final long getCityId() {
        return this.cityId;
    }

    public final long getLatitude() {
        return this.latitude;
    }

    public final long getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.cityId) * 31) + Long.hashCode(this.latitude)) * 31) + Long.hashCode(this.longitude)) * 31;
        String str = this.affiliation;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CityInfoResponseResult(cityId=" + this.cityId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", affiliation=" + this.affiliation + ", name=" + this.name + ")";
    }
}
