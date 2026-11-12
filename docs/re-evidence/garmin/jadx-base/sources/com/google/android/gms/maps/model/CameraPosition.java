package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "CameraPositionCreator")
@SafeParcelable.Reserved({1})
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zza();

    @SafeParcelable.Field(id = 5)
    public final float bearing;

    @SafeParcelable.Field(id = 2)
    public final LatLng target;

    @SafeParcelable.Field(id = 4)
    public final float tilt;

    @SafeParcelable.Field(id = 3)
    public final float zoom;

    @SafeParcelable.Constructor
    public CameraPosition(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) float f14, @SafeParcelable.Param(id = 4) float f15, @SafeParcelable.Param(id = 5) float f16) {
        Preconditions.checkNotNull(latLng, "camera target must not be null.");
        boolean z14 = false;
        if (f15 >= 0.0f && f15 <= 90.0f) {
            z14 = true;
        }
        Preconditions.checkArgument(z14, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f15));
        this.target = latLng;
        this.zoom = f14;
        this.tilt = f15 + 0.0f;
        this.bearing = (((double) f16) <= 0.0d ? (f16 % 360.0f) + 360.0f : f16) % 360.0f;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        return GoogleMapOptions.zza(context, attributeSet);
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f14) {
        return new CameraPosition(latLng, f14, 0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("target", this.target).add("zoom", Float.valueOf(this.zoom)).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        LatLng latLng = this.target;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i14, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zoom);
        SafeParcelWriter.writeFloat(parcel, 4, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 5, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public static final class Builder {
        private LatLng zza;
        private float zzb;
        private float zzc;
        private float zzd;

        public Builder(CameraPosition cameraPosition) {
            CameraPosition cameraPosition2 = (CameraPosition) Preconditions.checkNotNull(cameraPosition, "previous must not be null.");
            this.zza = cameraPosition2.target;
            this.zzb = cameraPosition2.zoom;
            this.zzc = cameraPosition2.tilt;
            this.zzd = cameraPosition2.bearing;
        }

        public Builder bearing(float f14) {
            this.zzd = f14;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder target(LatLng latLng) {
            this.zza = (LatLng) Preconditions.checkNotNull(latLng, "location must not be null.");
            return this;
        }

        public Builder tilt(float f14) {
            this.zzc = f14;
            return this;
        }

        public Builder zoom(float f14) {
            this.zzb = f14;
            return this;
        }

        public Builder() {
        }
    }
}
