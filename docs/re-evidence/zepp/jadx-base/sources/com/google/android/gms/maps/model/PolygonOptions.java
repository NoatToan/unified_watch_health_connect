package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "PolygonOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzk();

    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List<LatLng> a;

    @SafeParcelable.Field(getter = "getHolesForParcel", id = 3, type = "java.util.List")
    private final List<List<LatLng>> b;

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

    @SafeParcelable.Field(getter = "isGeodesic", id = 9)
    private boolean h;

    @SafeParcelable.Field(getter = "isClickable", id = 10)
    private boolean i;

    @SafeParcelable.Field(getter = "getStrokeJointType", id = 11)
    private int j;

    @Nullable
    @SafeParcelable.Field(getter = "getStrokePattern", id = 12)
    private List<PatternItem> k;

    public PolygonOptions() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    @SafeParcelable.Constructor
    public PolygonOptions(@SafeParcelable.Param(id = 2) List<LatLng> list, @SafeParcelable.Param(id = 3) List list2, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) int i3, @Nullable @SafeParcelable.Param(id = 12) List<PatternItem> list3) {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = list;
        this.b = list2;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = i3;
        this.k = list3;
    }

    public final PolygonOptions add(LatLng latLng) {
        this.a.add(latLng);
        return this;
    }

    public final PolygonOptions add(LatLng... latLngArr) {
        this.a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolygonOptions addAll(Iterable<LatLng> iterable) {
        Iterator<LatLng> it2 = iterable.iterator();
        while (it2.hasNext()) {
            this.a.add(it2.next());
        }
        return this;
    }

    public final PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        this.b.add(arrayList);
        return this;
    }

    public final PolygonOptions clickable(boolean z) {
        this.i = z;
        return this;
    }

    public final PolygonOptions fillColor(int i) {
        this.e = i;
        return this;
    }

    public final PolygonOptions geodesic(boolean z) {
        this.h = z;
        return this;
    }

    public final int getFillColor() {
        return this.e;
    }

    public final List<List<LatLng>> getHoles() {
        return this.b;
    }

    public final List<LatLng> getPoints() {
        return this.a;
    }

    public final int getStrokeColor() {
        return this.d;
    }

    public final int getStrokeJointType() {
        return this.j;
    }

    @Nullable
    public final List<PatternItem> getStrokePattern() {
        return this.k;
    }

    public final float getStrokeWidth() {
        return this.c;
    }

    public final float getZIndex() {
        return this.f;
    }

    public final boolean isClickable() {
        return this.i;
    }

    public final boolean isGeodesic() {
        return this.h;
    }

    public final boolean isVisible() {
        return this.g;
    }

    public final PolygonOptions strokeColor(int i) {
        this.d = i;
        return this;
    }

    public final PolygonOptions strokeJointType(int i) {
        this.j = i;
        return this;
    }

    public final PolygonOptions strokePattern(@Nullable List<PatternItem> list) {
        this.k = list;
        return this;
    }

    public final PolygonOptions strokeWidth(float f) {
        this.c = f;
        return this;
    }

    public final PolygonOptions visible(boolean z) {
        this.g = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeList(parcel, 3, this.b, false);
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
        SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final PolygonOptions zIndex(float f) {
        this.f = f;
        return this;
    }
}
