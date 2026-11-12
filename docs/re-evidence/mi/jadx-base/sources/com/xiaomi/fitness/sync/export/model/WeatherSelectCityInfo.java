package com.xiaomi.fitness.sync.export.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/WeatherSelectCityInfo;", "", "status", "", "affiliation", "", "locationKey", "latitude", "", "longitude", "name", "timeZoneShift", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;DDLjava/lang/String;J)V", "getStatus", "()I", "getAffiliation", "()Ljava/lang/String;", "getLocationKey", "getLatitude", "()D", "getLongitude", "getName", "getTimeZoneShift", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeatherSelectCityInfo {

    @NotNull
    private final String affiliation;
    private final double latitude;

    @NotNull
    private final String locationKey;
    private final double longitude;

    @NotNull
    private final String name;
    private final int status;
    private final long timeZoneShift;

    public WeatherSelectCityInfo(int i, @NotNull String affiliation, @NotNull String locationKey, double d, double d2, @NotNull String name, long j) {
        Intrinsics.checkNotNullParameter(affiliation, "affiliation");
        Intrinsics.checkNotNullParameter(locationKey, "locationKey");
        Intrinsics.checkNotNullParameter(name, "name");
        this.status = i;
        this.affiliation = affiliation;
        this.locationKey = locationKey;
        this.latitude = d;
        this.longitude = d2;
        this.name = name;
        this.timeZoneShift = j;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAffiliation() {
        return this.affiliation;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLocationKey() {
        return this.locationKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimeZoneShift() {
        return this.timeZoneShift;
    }

    @NotNull
    public final WeatherSelectCityInfo copy(int status, @NotNull String affiliation, @NotNull String locationKey, double latitude, double longitude, @NotNull String name, long timeZoneShift) {
        Intrinsics.checkNotNullParameter(affiliation, "affiliation");
        Intrinsics.checkNotNullParameter(locationKey, "locationKey");
        Intrinsics.checkNotNullParameter(name, "name");
        return new WeatherSelectCityInfo(status, affiliation, locationKey, latitude, longitude, name, timeZoneShift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherSelectCityInfo)) {
            return false;
        }
        WeatherSelectCityInfo weatherSelectCityInfo = (WeatherSelectCityInfo) other;
        return this.status == weatherSelectCityInfo.status && Intrinsics.areEqual(this.affiliation, weatherSelectCityInfo.affiliation) && Intrinsics.areEqual(this.locationKey, weatherSelectCityInfo.locationKey) && Double.compare(this.latitude, weatherSelectCityInfo.latitude) == 0 && Double.compare(this.longitude, weatherSelectCityInfo.longitude) == 0 && Intrinsics.areEqual(this.name, weatherSelectCityInfo.name) && this.timeZoneShift == weatherSelectCityInfo.timeZoneShift;
    }

    @NotNull
    public final String getAffiliation() {
        return this.affiliation;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final String getLocationKey() {
        return this.locationKey;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTimeZoneShift() {
        return this.timeZoneShift;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.status) * 31) + this.affiliation.hashCode()) * 31) + this.locationKey.hashCode()) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.timeZoneShift);
    }

    @NotNull
    public String toString() {
        return "WeatherSelectCityInfo(status=" + this.status + ", affiliation=" + this.affiliation + ", locationKey=" + this.locationKey + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", name=" + this.name + ", timeZoneShift=" + this.timeZoneShift + ")";
    }
}
