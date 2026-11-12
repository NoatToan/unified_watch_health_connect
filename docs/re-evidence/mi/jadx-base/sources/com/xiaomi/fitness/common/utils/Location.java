package com.xiaomi.fitness.common.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/common/utils/Location;", "Landroid/os/Parcelable;", "lon", "", "lat", "altitude", "<init>", "(DDD)V", "getLon", "()D", "getLat", "getAltitude", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Location implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Location> CREATOR = new Creator();
    private final double altitude;
    private final double lat;
    private final double lon;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Location> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Location createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Location(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Location[] newArray(int i) {
            return new Location[i];
        }
    }

    public Location(double d, double d2, double d3) {
        this.lon = d;
        this.lat = d2;
        this.altitude = d3;
    }

    public static /* synthetic */ Location copy$default(Location location, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = location.lon;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = location.lat;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = location.altitude;
        }
        return location.copy(d4, d5, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    @NotNull
    public final Location copy(double lon, double lat, double altitude) {
        return new Location(lon, lat, altitude);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Location)) {
            return false;
        }
        Location location = (Location) other;
        return Double.compare(this.lon, location.lon) == 0 && Double.compare(this.lat, location.lat) == 0 && Double.compare(this.altitude, location.altitude) == 0;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public int hashCode() {
        return (((Double.hashCode(this.lon) * 31) + Double.hashCode(this.lat)) * 31) + Double.hashCode(this.altitude);
    }

    @NotNull
    public String toString() {
        return "Location(lon=" + this.lon + ", lat=" + this.lat + ", altitude=" + this.altitude + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.lon);
        dest.writeDouble(this.lat);
        dest.writeDouble(this.altitude);
    }

    public /* synthetic */ Location(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? 0.0d : d3);
    }
}
