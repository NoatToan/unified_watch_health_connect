package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzm();

    @SafeParcelable.Field(id = 3)
    public final LatLng northeast;

    @SafeParcelable.Field(id = 2)
    public final LatLng southwest;

    public static final class Builder {
        private double zza = Double.POSITIVE_INFINITY;
        private double zzb = Double.NEGATIVE_INFINITY;
        private double zzc = Double.NaN;
        private double zzd = Double.NaN;

        public LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.zzc), "no included points");
            return new LatLngBounds(new LatLng(this.zza, this.zzc), new LatLng(this.zzb, this.zzd));
        }

        public Builder include(LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.zza = Math.min(this.zza, latLng.latitude);
            this.zzb = Math.max(this.zzb, latLng.latitude);
            double d14 = latLng.longitude;
            if (Double.isNaN(this.zzc)) {
                this.zzc = d14;
                this.zzd = d14;
                return this;
            }
            double d15 = this.zzc;
            double d16 = this.zzd;
            if (d15 > d16 ? !(d15 <= d14 || d14 <= d16) : !(d15 <= d14 && d14 <= d16)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d15 - d14) + 360.0d) % 360.0d < ((d14 - d16) + 360.0d) % 360.0d) {
                    this.zzc = d14;
                    return this;
                }
                this.zzd = d14;
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) LatLng latLng2) {
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d14 = latLng2.latitude;
        double d15 = latLng.latitude;
        Preconditions.checkArgument(d14 >= d15, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d15), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    private final boolean zza(double d14) {
        LatLng latLng = this.northeast;
        double d15 = this.southwest.longitude;
        double d16 = latLng.longitude;
        if (d15 <= d16) {
            return d15 <= d14 && d14 <= d16;
        }
        return d15 <= d14 || d14 <= d16;
    }

    public boolean contains(LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d14 = latLng2.latitude;
        return this.southwest.latitude <= d14 && d14 <= this.northeast.latitude && zza(latLng2.longitude);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public LatLng getCenter() {
        LatLng latLng = this.northeast;
        LatLng latLng2 = this.southwest;
        double d14 = latLng2.latitude + latLng.latitude;
        double d15 = latLng.longitude;
        double d16 = latLng2.longitude;
        if (d16 > d15) {
            d15 += 360.0d;
        }
        return new LatLng(d14 / 2.0d, (d15 + d16) / 2.0d);
    }

    public int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    public LatLngBounds including(LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double dMin = Math.min(this.southwest.latitude, latLng2.latitude);
        double dMax = Math.max(this.northeast.latitude, latLng2.latitude);
        double d14 = this.northeast.longitude;
        double d15 = this.southwest.longitude;
        double d16 = latLng2.longitude;
        if (!zza(d16)) {
            if (((d15 - d16) + 360.0d) % 360.0d < ((d16 - d14) + 360.0d) % 360.0d) {
                d15 = d16;
            } else {
                d14 = d16;
            }
        }
        return new LatLngBounds(new LatLng(dMin, d15), new LatLng(dMax, d14));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        LatLng latLng = this.southwest;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i14, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
