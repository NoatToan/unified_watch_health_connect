package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import c22.t;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "LatLngCreator")
@SafeParcelable.Reserved({1})
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<LatLng> CREATOR = new zzn();

    @SafeParcelable.Field(id = 2)
    public final double latitude;

    @SafeParcelable.Field(id = 3)
    public final double longitude;

    @SafeParcelable.Constructor
    public LatLng(@SafeParcelable.Param(id = 2) double d14, @SafeParcelable.Param(id = 3) double d15) {
        if (d15 < -180.0d || d15 >= 180.0d) {
            this.longitude = ((((d15 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.longitude = d15;
        }
        this.latitude = Math.max(-90.0d, Math.min(90.0d, d14));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(latLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(latLng.longitude);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        long j8 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return ((((int) j8) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("lat/lng: (");
        sb3.append(this.latitude);
        sb3.append(",");
        return t.d(this.longitude, ")", sb3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        double d14 = this.latitude;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, d14);
        SafeParcelWriter.writeDouble(parcel, 3, this.longitude);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
