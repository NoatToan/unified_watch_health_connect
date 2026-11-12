package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapColorScheme;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac();
    private static final Integer zza = Integer.valueOf(Color.argb(255, 236, 233, 225));

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zzb;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzc;

    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzd;

    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zze;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zzf;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzg;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzh;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzi;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzj;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzk;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzl;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzm;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzn;

    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzo;

    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzp;

    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzq;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzr;

    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzs;

    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzt;

    @MapColorScheme
    @SafeParcelable.Field(defaultValue = "0", getter = "getMapColorScheme", id = 23, type = "int")
    private int zzu;

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b14, @SafeParcelable.Param(id = 3) byte b15, @SafeParcelable.Param(id = 4) int i14, @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b16, @SafeParcelable.Param(id = 7) byte b17, @SafeParcelable.Param(id = 8) byte b18, @SafeParcelable.Param(id = 9) byte b19, @SafeParcelable.Param(id = 10) byte b24, @SafeParcelable.Param(id = 11) byte b25, @SafeParcelable.Param(id = 12) byte b26, @SafeParcelable.Param(id = 14) byte b27, @SafeParcelable.Param(id = 15) byte b28, @SafeParcelable.Param(id = 16) Float f14, @SafeParcelable.Param(id = 17) Float f15, @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b29, @SafeParcelable.Param(id = 20) Integer num, @SafeParcelable.Param(id = 21) String str, @SafeParcelable.Param(id = 23) @MapColorScheme int i15) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b14);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b15);
        this.zzd = i14;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b16);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b17);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b18);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b19);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b24);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b25);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b26);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b27);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b28);
        this.zzo = f14;
        this.zzp = f15;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b29);
        this.zzs = num;
        this.zzt = str;
        this.zzu = i15;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i14 = R.styleable.MapAttrs_mapType;
        if (typedArrayObtainAttributes.hasValue(i14)) {
            googleMapOptions.mapType(typedArrayObtainAttributes.getInt(i14, -1));
        }
        int i15 = R.styleable.MapAttrs_zOrderOnTop;
        if (typedArrayObtainAttributes.hasValue(i15)) {
            googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(i15, false));
        }
        int i16 = R.styleable.MapAttrs_useViewLifecycle;
        if (typedArrayObtainAttributes.hasValue(i16)) {
            googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(i16, false));
        }
        int i17 = R.styleable.MapAttrs_uiCompass;
        if (typedArrayObtainAttributes.hasValue(i17)) {
            googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(i17, true));
        }
        int i18 = R.styleable.MapAttrs_uiRotateGestures;
        if (typedArrayObtainAttributes.hasValue(i18)) {
            googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(i18, true));
        }
        int i19 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (typedArrayObtainAttributes.hasValue(i19)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(typedArrayObtainAttributes.getBoolean(i19, true));
        }
        int i24 = R.styleable.MapAttrs_uiScrollGestures;
        if (typedArrayObtainAttributes.hasValue(i24)) {
            googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(i24, true));
        }
        int i25 = R.styleable.MapAttrs_uiTiltGestures;
        if (typedArrayObtainAttributes.hasValue(i25)) {
            googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(i25, true));
        }
        int i26 = R.styleable.MapAttrs_uiZoomGestures;
        if (typedArrayObtainAttributes.hasValue(i26)) {
            googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(i26, true));
        }
        int i27 = R.styleable.MapAttrs_uiZoomControls;
        if (typedArrayObtainAttributes.hasValue(i27)) {
            googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(i27, true));
        }
        int i28 = R.styleable.MapAttrs_liteMode;
        if (typedArrayObtainAttributes.hasValue(i28)) {
            googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(i28, false));
        }
        int i29 = R.styleable.MapAttrs_uiMapToolbar;
        if (typedArrayObtainAttributes.hasValue(i29)) {
            googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(i29, true));
        }
        int i30 = R.styleable.MapAttrs_ambientEnabled;
        if (typedArrayObtainAttributes.hasValue(i30)) {
            googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(i30, false));
        }
        int i34 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (typedArrayObtainAttributes.hasValue(i34)) {
            googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(i34, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(i34)) {
            googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        int i35 = R.styleable.MapAttrs_backgroundColor;
        if (typedArrayObtainAttributes.hasValue(i35)) {
            googleMapOptions.backgroundColor(Integer.valueOf(typedArrayObtainAttributes.getColor(i35, zza.intValue())));
        }
        int i36 = R.styleable.MapAttrs_mapId;
        if (typedArrayObtainAttributes.hasValue(i36) && (string = typedArrayObtainAttributes.getString(i36)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        int i37 = R.styleable.MapAttrs_mapColorScheme;
        if (typedArrayObtainAttributes.hasValue(i37)) {
            googleMapOptions.mapColorScheme(typedArrayObtainAttributes.getInt(i37, 0));
        }
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i14 = R.styleable.MapAttrs_cameraTargetLat;
        float f14 = typedArrayObtainAttributes.hasValue(i14) ? typedArrayObtainAttributes.getFloat(i14, 0.0f) : 0.0f;
        int i15 = R.styleable.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng(f14, typedArrayObtainAttributes.hasValue(i15) ? typedArrayObtainAttributes.getFloat(i15, 0.0f) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i16 = R.styleable.MapAttrs_cameraZoom;
        if (typedArrayObtainAttributes.hasValue(i16)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(i16, 0.0f));
        }
        int i17 = R.styleable.MapAttrs_cameraBearing;
        if (typedArrayObtainAttributes.hasValue(i17)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(i17, 0.0f));
        }
        int i18 = R.styleable.MapAttrs_cameraTilt;
        if (typedArrayObtainAttributes.hasValue(i18)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(i18, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }

    public static LatLngBounds zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i14 = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float fValueOf = typedArrayObtainAttributes.hasValue(i14) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i14, 0.0f)) : null;
        int i15 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(i15) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i15, 0.0f)) : null;
        int i16 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(i16) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i16, 0.0f)) : null;
        int i17 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(i17) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i17, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public GoogleMapOptions ambientEnabled(boolean z14) {
        this.zzn = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.zzs = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z14) {
        this.zzg = Boolean.valueOf(z14);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzn;
    }

    public Integer getBackgroundColor() {
        return this.zzs;
    }

    public CameraPosition getCamera() {
        return this.zze;
    }

    public Boolean getCompassEnabled() {
        return this.zzg;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    public Boolean getLiteMode() {
        return this.zzl;
    }

    @MapColorScheme
    public int getMapColorScheme() {
        return this.zzu;
    }

    public String getMapId() {
        return this.zzt;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    public Float getMaxZoomPreference() {
        return this.zzp;
    }

    public Float getMinZoomPreference() {
        return this.zzo;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    public Boolean getZOrderOnTop() {
        return this.zzb;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z14) {
        this.zzl = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions mapColorScheme(@MapColorScheme int i14) {
        this.zzu = i14;
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.zzt = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z14) {
        this.zzm = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions mapType(int i14) {
        this.zzd = i14;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f14) {
        this.zzp = Float.valueOf(f14);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f14) {
        this.zzo = Float.valueOf(f14);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z14) {
        this.zzk = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z14) {
        this.zzh = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z14) {
        this.zzr = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z14) {
        this.zzj = Boolean.valueOf(z14);
        return this;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzd)).add("LiteMode", this.zzl).add("Camera", this.zze).add("CompassEnabled", this.zzg).add("ZoomControlsEnabled", this.zzf).add("ScrollGesturesEnabled", this.zzh).add("ZoomGesturesEnabled", this.zzi).add("TiltGesturesEnabled", this.zzj).add("RotateGesturesEnabled", this.zzk).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzr).add("MapToolbarEnabled", this.zzm).add("AmbientEnabled", this.zzn).add("MinZoomPreference", this.zzo).add("MaxZoomPreference", this.zzp).add("BackgroundColor", this.zzs).add("LatLngBoundsForCameraTarget", this.zzq).add("ZOrderOnTop", this.zzb).add("UseViewLifecycleInFragment", this.zzc).add("mapColorScheme", Integer.valueOf(this.zzu)).toString();
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z14) {
        this.zzc = Boolean.valueOf(z14);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i14, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i14, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.writeInt(parcel, 23, getMapColorScheme());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public GoogleMapOptions zOrderOnTop(boolean z14) {
        this.zzb = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z14) {
        this.zzf = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z14) {
        this.zzi = Boolean.valueOf(z14);
        return this;
    }

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }
}
