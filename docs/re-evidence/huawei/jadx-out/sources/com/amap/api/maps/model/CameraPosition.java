package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.amap.api.col.p0003sl.du;
import com.amap.api.col.p0003sl.eb;
import com.amap.api.col.p0003sl.jv;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraPosition implements Parcelable {
    private static final String CLASSNAME = "CameraPosition";
    public static final CameraPositionCreator CREATOR = new CameraPositionCreator();
    public final float bearing;
    public final boolean isAbroad;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        if (latLng == null) {
            Log.w(CLASSNAME, "构建CameraPosition时,位置(target)不能为null");
        }
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        if (latLng != null) {
            this.isAbroad = !du.a(latLng.latitude, latLng.longitude);
        } else {
            this.isAbroad = false;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.bearing);
        parcel.writeFloat((float) this.target.latitude);
        parcel.writeFloat((float) this.target.longitude);
        parcel.writeFloat(this.tilt);
        parcel.writeFloat(this.zoom);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public final String toString() {
        return eb.a(eb.a("target", this.target), eb.a("zoom", Float.valueOf(this.zoom)), eb.a("tilt", Float.valueOf(this.tilt)), eb.a("bearing", Float.valueOf(this.bearing)));
    }

    public static final class Builder {
        private float bearing;
        private LatLng target;
        private float tilt;
        private float zoom;

        public Builder() {
        }

        public Builder(CameraPosition cameraPosition) {
            target(cameraPosition.target).bearing(cameraPosition.bearing).tilt(cameraPosition.tilt).zoom(cameraPosition.zoom);
        }

        public final Builder target(LatLng latLng) {
            this.target = latLng;
            return this;
        }

        public final Builder zoom(float f) {
            this.zoom = f;
            return this;
        }

        public final Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public final Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public final CameraPosition build() {
            try {
                if (this.target == null) {
                    Log.w(CameraPosition.CLASSNAME, "target is null");
                    return null;
                }
                return new CameraPosition(this.target, this.zoom, this.tilt, this.bearing);
            } catch (Throwable th) {
                jv.c(th, CameraPosition.CLASSNAME, JsonPOJOBuilder.DEFAULT_BUILD_METHOD);
                return null;
            }
        }
    }
}
