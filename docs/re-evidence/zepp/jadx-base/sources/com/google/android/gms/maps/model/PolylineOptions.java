package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List<LatLng> a;

    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private float b;

    @SafeParcelable.Field(getter = "getColor", id = 4)
    private int c;

    @SafeParcelable.Field(getter = "getZIndex", id = 5)
    private float d;

    @SafeParcelable.Field(getter = "isVisible", id = 6)
    private boolean e;

    @SafeParcelable.Field(getter = "isGeodesic", id = 7)
    private boolean f;

    @SafeParcelable.Field(getter = "isClickable", id = 8)
    private boolean g;

    @NonNull
    @SafeParcelable.Field(getter = "getStartCap", id = 9)
    private Cap h;

    @NonNull
    @SafeParcelable.Field(getter = "getEndCap", id = 10)
    private Cap i;

    @SafeParcelable.Field(getter = "getJointType", id = 11)
    private int j;

    @Nullable
    @SafeParcelable.Field(getter = "getPattern", id = 12)
    private List<PatternItem> k;

    public PolylineOptions() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
    }

    @SafeParcelable.Constructor
    public PolylineOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) float f, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) float f2, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 8) boolean z3, @Nullable @SafeParcelable.Param(id = 9) Cap cap, @Nullable @SafeParcelable.Param(id = 10) Cap cap2, @SafeParcelable.Param(id = 11) int i2, @Nullable @SafeParcelable.Param(id = 12) List<PatternItem> list2) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.a = list;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        if (cap != null) {
            this.h = cap;
        }
        if (cap2 != null) {
            this.i = cap2;
        }
        this.j = i2;
        this.k = list2;
    }

    public final PolylineOptions add(LatLng latLng) {
        this.a.add(latLng);
        return this;
    }

    public final PolylineOptions add(LatLng... latLngArr) {
        this.a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolylineOptions addAll(Iterable<LatLng> iterable) {
        Iterator<LatLng> it2 = iterable.iterator();
        while (it2.hasNext()) {
            this.a.add(it2.next());
        }
        return this;
    }

    public final PolylineOptions clickable(boolean z) {
        this.g = z;
        return this;
    }

    public final PolylineOptions color(int i) {
        this.c = i;
        return this;
    }

    public final PolylineOptions endCap(@NonNull Cap cap) {
        this.i = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    public final PolylineOptions geodesic(boolean z) {
        this.f = z;
        return this;
    }

    public final int getColor() {
        return this.c;
    }

    @NonNull
    public final Cap getEndCap() {
        return this.i;
    }

    public final int getJointType() {
        return this.j;
    }

    @Nullable
    public final List<PatternItem> getPattern() {
        return this.k;
    }

    public final List<LatLng> getPoints() {
        return this.a;
    }

    @NonNull
    public final Cap getStartCap() {
        return this.h;
    }

    public final float getWidth() {
        return this.b;
    }

    public final float getZIndex() {
        return this.d;
    }

    public final boolean isClickable() {
        return this.g;
    }

    public final boolean isGeodesic() {
        return this.f;
    }

    public final boolean isVisible() {
        return this.e;
    }

    public final PolylineOptions jointType(int i) {
        this.j = i;
        return this;
    }

    public final PolylineOptions pattern(@Nullable List<PatternItem> list) {
        this.k = list;
        return this;
    }

    public final PolylineOptions startCap(@NonNull Cap cap) {
        this.h = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    public final PolylineOptions visible(boolean z) {
        this.e = z;
        return this;
    }

    public final PolylineOptions width(float f) {
        this.b = f;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final PolylineOptions zIndex(float f) {
        this.d = f;
        return this;
    }
}
