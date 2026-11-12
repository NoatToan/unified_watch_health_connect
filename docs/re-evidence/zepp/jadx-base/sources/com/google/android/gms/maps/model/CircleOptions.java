package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getCenter", id = 2)
    private LatLng a;

    @SafeParcelable.Field(getter = "getRadius", id = 3)
    private double b;

    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float c;

    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int d;

    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int e;

    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float f;

    @SafeParcelable.Field(getter = "isVisible", id = 8)
    private boolean g;

    @SafeParcelable.Field(getter = "isClickable", id = 9)
    private boolean h;

    @Nullable
    @SafeParcelable.Field(getter = "getStrokePattern", id = 10)
    private List<PatternItem> i;

    public CircleOptions() {
        this.a = null;
        this.b = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = null;
    }

    @SafeParcelable.Constructor
    public CircleOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) double d, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) boolean z2, @Nullable @SafeParcelable.Param(id = 10) List<PatternItem> list) {
        this.a = null;
        this.b = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = null;
        this.a = latLng;
        this.b = d;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = list;
    }

    public final CircleOptions center(LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public final CircleOptions clickable(boolean z) {
        this.h = z;
        return this;
    }

    public final CircleOptions fillColor(int i) {
        this.e = i;
        return this;
    }

    public final LatLng getCenter() {
        return this.a;
    }

    public final int getFillColor() {
        return this.e;
    }

    public final double getRadius() {
        return this.b;
    }

    public final int getStrokeColor() {
        return this.d;
    }

    @Nullable
    public final List<PatternItem> getStrokePattern() {
        return this.i;
    }

    public final float getStrokeWidth() {
        return this.c;
    }

    public final float getZIndex() {
        return this.f;
    }

    public final boolean isClickable() {
        return this.h;
    }

    public final boolean isVisible() {
        return this.g;
    }

    public final CircleOptions radius(double d) {
        this.b = d;
        return this;
    }

    public final CircleOptions strokeColor(int i) {
        this.d = i;
        return this;
    }

    public final CircleOptions strokePattern(@Nullable List<PatternItem> list) {
        this.i = list;
        return this;
    }

    public final CircleOptions strokeWidth(float f) {
        this.c = f;
        return this;
    }

    public final CircleOptions visible(boolean z) {
        this.g = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final CircleOptions zIndex(float f) {
        this.f = f;
        return this;
    }
}
