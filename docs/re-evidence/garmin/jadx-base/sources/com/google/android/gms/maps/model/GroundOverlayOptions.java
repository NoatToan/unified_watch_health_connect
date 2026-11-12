package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzk();
    public static final float NO_DIMENSION = -1.0f;

    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", id = 2, type = "android.os.IBinder")
    private BitmapDescriptor zza;

    @SafeParcelable.Field(getter = "getLocation", id = 3)
    private LatLng zzb;

    @SafeParcelable.Field(getter = "getWidth", id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getHeight", id = 5)
    private float zzd;

    @SafeParcelable.Field(getter = "getBounds", id = 6)
    private LatLngBounds zze;

    @SafeParcelable.Field(getter = "getBearing", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "getZIndex", id = 8)
    private float zzg;

    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "getTransparency", id = 10)
    private float zzi;

    @SafeParcelable.Field(getter = "getAnchorU", id = 11)
    private float zzj;

    @SafeParcelable.Field(getter = "getAnchorV", id = 12)
    private float zzk;

    @SafeParcelable.Field(getter = "isClickable", id = 13)
    private boolean zzl;

    @SafeParcelable.Constructor
    public GroundOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) LatLng latLng, @SafeParcelable.Param(id = 4) float f14, @SafeParcelable.Param(id = 5) float f15, @SafeParcelable.Param(id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 7) float f16, @SafeParcelable.Param(id = 8) float f17, @SafeParcelable.Param(id = 9) boolean z14, @SafeParcelable.Param(id = 10) float f18, @SafeParcelable.Param(id = 11) float f19, @SafeParcelable.Param(id = 12) float f22, @SafeParcelable.Param(id = 13) boolean z15) {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = latLng;
        this.zzc = f14;
        this.zzd = f15;
        this.zze = latLngBounds;
        this.zzf = f16;
        this.zzg = f17;
        this.zzh = z14;
        this.zzi = f18;
        this.zzj = f19;
        this.zzk = f22;
        this.zzl = z15;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f14, float f15) {
        this.zzb = latLng;
        this.zzc = f14;
        this.zzd = f15;
        return this;
    }

    public GroundOverlayOptions anchor(float f14, float f15) {
        this.zzj = f14;
        this.zzk = f15;
        return this;
    }

    public GroundOverlayOptions bearing(float f14) {
        this.zzf = ((f14 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public GroundOverlayOptions clickable(boolean z14) {
        this.zzl = z14;
        return this;
    }

    public float getAnchorU() {
        return this.zzj;
    }

    public float getAnchorV() {
        return this.zzk;
    }

    public float getBearing() {
        return this.zzf;
    }

    public LatLngBounds getBounds() {
        return this.zze;
    }

    public float getHeight() {
        return this.zzd;
    }

    public BitmapDescriptor getImage() {
        return this.zza;
    }

    public LatLng getLocation() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzi;
    }

    public float getWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzg;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.zza = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.zzl;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public GroundOverlayOptions position(LatLng latLng, float f14, float f15) {
        Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f14 >= 0.0f, "Width must be non-negative");
        Preconditions.checkArgument(f15 >= 0.0f, "Height must be non-negative");
        zza(latLng, f14, f15);
        return this;
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        LatLng latLng = this.zzb;
        Preconditions.checkState(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.zze = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f14) {
        boolean z14 = false;
        if (f14 >= 0.0f && f14 <= 1.0f) {
            z14 = true;
        }
        Preconditions.checkArgument(z14, "Transparency must be in the range [0..1]");
        this.zzi = f14;
        return this;
    }

    public GroundOverlayOptions visible(boolean z14) {
        this.zzh = z14;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zza.zza().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i14, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i14, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public GroundOverlayOptions zIndex(float f14) {
        this.zzg = f14;
        return this;
    }

    public GroundOverlayOptions position(LatLng latLng, float f14) {
        Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f14 >= 0.0f, "Width must be non-negative");
        zza(latLng, f14, -1.0f);
        return this;
    }

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
    }
}
