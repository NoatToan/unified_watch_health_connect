package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private LatLng a;

    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String b;

    @SafeParcelable.Field(getter = "getSnippet", id = 4)
    private String c;

    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", id = 5, type = "android.os.IBinder")
    private BitmapDescriptor d;

    @SafeParcelable.Field(getter = "getAnchorU", id = 6)
    private float e;

    @SafeParcelable.Field(getter = "getAnchorV", id = 7)
    private float f;

    @SafeParcelable.Field(getter = "isDraggable", id = 8)
    private boolean g;

    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean h;

    @SafeParcelable.Field(getter = "isFlat", id = 10)
    private boolean i;

    @SafeParcelable.Field(getter = "getRotation", id = 11)
    private float j;

    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", id = 12)
    private float k;

    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", id = 13)
    private float l;

    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", id = 14)
    private float m;

    @SafeParcelable.Field(getter = "getZIndex", id = 15)
    private float n;

    public MarkerOptions() {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
    }

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) float f3, @SafeParcelable.Param(id = 12) float f4, @SafeParcelable.Param(id = 13) float f5, @SafeParcelable.Param(id = 14) float f6, @SafeParcelable.Param(id = 15) float f7) {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        this.d = iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.e = f;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final MarkerOptions alpha(float f) {
        this.m = f;
        return this;
    }

    public final MarkerOptions anchor(float f, float f2) {
        this.e = f;
        this.f = f2;
        return this;
    }

    public final MarkerOptions draggable(boolean z) {
        this.g = z;
        return this;
    }

    public final MarkerOptions flat(boolean z) {
        this.i = z;
        return this;
    }

    public final float getAlpha() {
        return this.m;
    }

    public final float getAnchorU() {
        return this.e;
    }

    public final float getAnchorV() {
        return this.f;
    }

    public final BitmapDescriptor getIcon() {
        return this.d;
    }

    public final float getInfoWindowAnchorU() {
        return this.k;
    }

    public final float getInfoWindowAnchorV() {
        return this.l;
    }

    public final LatLng getPosition() {
        return this.a;
    }

    public final float getRotation() {
        return this.j;
    }

    public final String getSnippet() {
        return this.c;
    }

    public final String getTitle() {
        return this.b;
    }

    public final float getZIndex() {
        return this.n;
    }

    public final MarkerOptions icon(@Nullable BitmapDescriptor bitmapDescriptor) {
        this.d = bitmapDescriptor;
        return this;
    }

    public final MarkerOptions infoWindowAnchor(float f, float f2) {
        this.k = f;
        this.l = f2;
        return this;
    }

    public final boolean isDraggable() {
        return this.g;
    }

    public final boolean isFlat() {
        return this.i;
    }

    public final boolean isVisible() {
        return this.h;
    }

    public final MarkerOptions position(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.a = latLng;
        return this;
    }

    public final MarkerOptions rotation(float f) {
        this.j = f;
        return this;
    }

    public final MarkerOptions snippet(@Nullable String str) {
        this.c = str;
        return this;
    }

    public final MarkerOptions title(@Nullable String str) {
        this.b = str;
        return this;
    }

    public final MarkerOptions visible(boolean z) {
        this.h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.d;
        SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final MarkerOptions zIndex(float f) {
        this.n = f;
        return this;
    }
}
