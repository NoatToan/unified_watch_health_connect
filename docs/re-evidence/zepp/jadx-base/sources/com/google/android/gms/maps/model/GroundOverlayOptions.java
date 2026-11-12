package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzd();
    public static final float NO_DIMENSION = -1.0f;

    @NonNull
    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", id = 2, type = "android.os.IBinder")
    private BitmapDescriptor a;

    @SafeParcelable.Field(getter = "getLocation", id = 3)
    private LatLng b;

    @SafeParcelable.Field(getter = "getWidth", id = 4)
    private float c;

    @SafeParcelable.Field(getter = "getHeight", id = 5)
    private float d;

    @SafeParcelable.Field(getter = "getBounds", id = 6)
    private LatLngBounds e;

    @SafeParcelable.Field(getter = "getBearing", id = 7)
    private float f;

    @SafeParcelable.Field(getter = "getZIndex", id = 8)
    private float g;

    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean h;

    @SafeParcelable.Field(getter = "getTransparency", id = 10)
    private float i;

    @SafeParcelable.Field(getter = "getAnchorU", id = 11)
    private float j;

    @SafeParcelable.Field(getter = "getAnchorV", id = 12)
    private float k;

    @SafeParcelable.Field(getter = "isClickable", id = 13)
    private boolean l;

    public GroundOverlayOptions() {
        this.h = true;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.5f;
        this.l = false;
    }

    @SafeParcelable.Constructor
    public GroundOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) LatLng latLng, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) float f2, @SafeParcelable.Param(id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 7) float f3, @SafeParcelable.Param(id = 8) float f4, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 10) float f5, @SafeParcelable.Param(id = 11) float f6, @SafeParcelable.Param(id = 12) float f7, @SafeParcelable.Param(id = 13) boolean z2) {
        this.h = true;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.5f;
        this.l = false;
        this.a = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.b = latLng;
        this.c = f;
        this.d = f2;
        this.e = latLngBounds;
        this.f = f3;
        this.g = f4;
        this.h = z;
        this.i = f5;
        this.j = f6;
        this.k = f7;
        this.l = z2;
    }

    private final GroundOverlayOptions a(LatLng latLng, float f, float f2) {
        this.b = latLng;
        this.c = f;
        this.d = f2;
        return this;
    }

    public final GroundOverlayOptions anchor(float f, float f2) {
        this.j = f;
        this.k = f2;
        return this;
    }

    public final GroundOverlayOptions bearing(float f) {
        this.f = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public final GroundOverlayOptions clickable(boolean z) {
        this.l = z;
        return this;
    }

    public final float getAnchorU() {
        return this.j;
    }

    public final float getAnchorV() {
        return this.k;
    }

    public final float getBearing() {
        return this.f;
    }

    public final LatLngBounds getBounds() {
        return this.e;
    }

    public final float getHeight() {
        return this.d;
    }

    public final BitmapDescriptor getImage() {
        return this.a;
    }

    public final LatLng getLocation() {
        return this.b;
    }

    public final float getTransparency() {
        return this.i;
    }

    public final float getWidth() {
        return this.c;
    }

    public final float getZIndex() {
        return this.g;
    }

    public final GroundOverlayOptions image(@NonNull BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.a = bitmapDescriptor;
        return this;
    }

    public final boolean isClickable() {
        return this.l;
    }

    public final boolean isVisible() {
        return this.h;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f) {
        Preconditions.checkState(this.e == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        return a(latLng, f, -1.0f);
    }

    public final GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        Preconditions.checkState(this.e == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        Preconditions.checkArgument(f2 >= 0.0f, "Height must be non-negative");
        return a(latLng, f, f2);
    }

    public final GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        LatLng latLng = this.b;
        boolean z = latLng == null;
        String strValueOf = String.valueOf(latLng);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 46);
        sb.append("Position has already been set using position: ");
        sb.append(strValueOf);
        Preconditions.checkState(z, sb.toString());
        this.e = latLngBounds;
        return this;
    }

    public final GroundOverlayOptions transparency(float f) {
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Transparency must be in the range [0..1]");
        this.i = f;
        return this;
    }

    public final GroundOverlayOptions visible(boolean z) {
        this.h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.a.zza().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final GroundOverlayOptions zIndex(float f) {
        this.g = f;
        return this;
    }
}
