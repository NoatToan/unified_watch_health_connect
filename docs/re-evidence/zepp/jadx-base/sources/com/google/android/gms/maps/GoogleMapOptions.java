package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.moving.ui.utils.SportAnalytics;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzaa();

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean a;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean b;

    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int c;

    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition d;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean e;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean f;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean g;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean h;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean i;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean j;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean k;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean l;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean m;

    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float n;

    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float o;

    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds p;

    public GoogleMapOptions() {
        this.c = -1;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b, @SafeParcelable.Param(id = 3) byte b2, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b3, @SafeParcelable.Param(id = 7) byte b4, @SafeParcelable.Param(id = 8) byte b5, @SafeParcelable.Param(id = 9) byte b6, @SafeParcelable.Param(id = 10) byte b7, @SafeParcelable.Param(id = 11) byte b8, @SafeParcelable.Param(id = 12) byte b9, @SafeParcelable.Param(id = 14) byte b10, @SafeParcelable.Param(id = 15) byte b11, @SafeParcelable.Param(id = 16) Float f, @SafeParcelable.Param(id = 17) Float f2, @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds) {
        this.c = -1;
        this.n = null;
        this.o = null;
        this.p = null;
        this.a = zza.zza(b);
        this.b = zza.zza(b2);
        this.c = i;
        this.d = cameraPosition;
        this.e = zza.zza(b3);
        this.f = zza.zza(b4);
        this.g = zza.zza(b5);
        this.h = zza.zza(b6);
        this.i = zza.zza(b7);
        this.j = zza.zza(b8);
        this.k = zza.zza(b9);
        this.l = zza.zza(b10);
        this.m = zza.zza(b11);
        this.n = f;
        this.o = f2;
        this.p = latLngBounds;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = R.styleable.MapAttrs_mapType;
        if (typedArrayObtainAttributes.hasValue(i)) {
            googleMapOptions.mapType(typedArrayObtainAttributes.getInt(i, -1));
        }
        int i2 = R.styleable.MapAttrs_zOrderOnTop;
        if (typedArrayObtainAttributes.hasValue(i2)) {
            googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(i2, false));
        }
        int i3 = R.styleable.MapAttrs_useViewLifecycle;
        if (typedArrayObtainAttributes.hasValue(i3)) {
            googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(i3, false));
        }
        int i4 = R.styleable.MapAttrs_uiCompass;
        if (typedArrayObtainAttributes.hasValue(i4)) {
            googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(i4, true));
        }
        int i5 = R.styleable.MapAttrs_uiRotateGestures;
        if (typedArrayObtainAttributes.hasValue(i5)) {
            googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(i5, true));
        }
        int i6 = R.styleable.MapAttrs_uiScrollGestures;
        if (typedArrayObtainAttributes.hasValue(i6)) {
            googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(i6, true));
        }
        int i7 = R.styleable.MapAttrs_uiTiltGestures;
        if (typedArrayObtainAttributes.hasValue(i7)) {
            googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(i7, true));
        }
        int i8 = R.styleable.MapAttrs_uiZoomGestures;
        if (typedArrayObtainAttributes.hasValue(i8)) {
            googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(i8, true));
        }
        int i9 = R.styleable.MapAttrs_uiZoomControls;
        if (typedArrayObtainAttributes.hasValue(i9)) {
            googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(i9, true));
        }
        int i10 = R.styleable.MapAttrs_liteMode;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(i10, false));
        }
        int i11 = R.styleable.MapAttrs_uiMapToolbar;
        if (typedArrayObtainAttributes.hasValue(i11)) {
            googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(i11, true));
        }
        int i12 = R.styleable.MapAttrs_ambientEnabled;
        if (typedArrayObtainAttributes.hasValue(i12)) {
            googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(i12, false));
        }
        int i13 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(i13, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(i13)) {
            googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.latLngBoundsForCameraTarget(zza(context, attributeSet));
        googleMapOptions.camera(zzb(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public static LatLngBounds zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float fValueOf = typedArrayObtainAttributes.hasValue(i) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i, 0.0f)) : null;
        int i2 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(i2) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i2, 0.0f)) : null;
        int i3 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(i3) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i3, 0.0f)) : null;
        int i4 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(i4) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i4, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public static CameraPosition zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_cameraTargetLat;
        float f = typedArrayObtainAttributes.hasValue(i) ? typedArrayObtainAttributes.getFloat(i, 0.0f) : 0.0f;
        int i2 = R.styleable.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng(f, typedArrayObtainAttributes.hasValue(i2) ? typedArrayObtainAttributes.getFloat(i2, 0.0f) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i3 = R.styleable.MapAttrs_cameraZoom;
        if (typedArrayObtainAttributes.hasValue(i3)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(i3, 0.0f));
        }
        int i4 = R.styleable.MapAttrs_cameraBearing;
        if (typedArrayObtainAttributes.hasValue(i4)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(i4, 0.0f));
        }
        int i5 = R.styleable.MapAttrs_cameraTilt;
        if (typedArrayObtainAttributes.hasValue(i5)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(i5, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }

    public final GoogleMapOptions ambientEnabled(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.d = cameraPosition;
        return this;
    }

    public final GoogleMapOptions compassEnabled(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public final Boolean getAmbientEnabled() {
        return this.m;
    }

    public final CameraPosition getCamera() {
        return this.d;
    }

    public final Boolean getCompassEnabled() {
        return this.f;
    }

    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.p;
    }

    public final Boolean getLiteMode() {
        return this.k;
    }

    public final Boolean getMapToolbarEnabled() {
        return this.l;
    }

    public final int getMapType() {
        return this.c;
    }

    public final Float getMaxZoomPreference() {
        return this.o;
    }

    public final Float getMinZoomPreference() {
        return this.n;
    }

    public final Boolean getRotateGesturesEnabled() {
        return this.j;
    }

    public final Boolean getScrollGesturesEnabled() {
        return this.g;
    }

    public final Boolean getTiltGesturesEnabled() {
        return this.i;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return this.b;
    }

    public final Boolean getZOrderOnTop() {
        return this.a;
    }

    public final Boolean getZoomControlsEnabled() {
        return this.e;
    }

    public final Boolean getZoomGesturesEnabled() {
        return this.h;
    }

    public final GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.p = latLngBounds;
        return this;
    }

    public final GoogleMapOptions liteMode(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions mapType(int i) {
        this.c = i;
        return this;
    }

    public final GoogleMapOptions maxZoomPreference(float f) {
        this.o = Float.valueOf(f);
        return this;
    }

    public final GoogleMapOptions minZoomPreference(float f) {
        this.n = Float.valueOf(f);
        return this;
    }

    public final GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.c)).add("LiteMode", this.k).add(SportAnalytics.Params.VALUE_CAMERA, this.d).add("CompassEnabled", this.f).add("ZoomControlsEnabled", this.e).add("ScrollGesturesEnabled", this.g).add("ZoomGesturesEnabled", this.h).add("TiltGesturesEnabled", this.i).add("RotateGesturesEnabled", this.j).add("MapToolbarEnabled", this.l).add("AmbientEnabled", this.m).add("MinZoomPreference", this.n).add("MaxZoomPreference", this.o).add("LatLngBoundsForCameraTarget", this.p).add("ZOrderOnTop", this.a).add("UseViewLifecycleInFragment", this.b).toString();
    }

    public final GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, zza.zza(this.a));
        SafeParcelWriter.writeByte(parcel, 3, zza.zza(this.b));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, zza.zza(this.e));
        SafeParcelWriter.writeByte(parcel, 7, zza.zza(this.f));
        SafeParcelWriter.writeByte(parcel, 8, zza.zza(this.g));
        SafeParcelWriter.writeByte(parcel, 9, zza.zza(this.h));
        SafeParcelWriter.writeByte(parcel, 10, zza.zza(this.i));
        SafeParcelWriter.writeByte(parcel, 11, zza.zza(this.j));
        SafeParcelWriter.writeByte(parcel, 12, zza.zza(this.k));
        SafeParcelWriter.writeByte(parcel, 14, zza.zza(this.l));
        SafeParcelWriter.writeByte(parcel, 15, zza.zza(this.m));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final GoogleMapOptions zOrderOnTop(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }
}
