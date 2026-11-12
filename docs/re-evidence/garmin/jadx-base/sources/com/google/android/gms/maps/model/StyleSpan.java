package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "StyleSpanCreator")
@SafeParcelable.Reserved({1})
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new zzae();

    @SafeParcelable.Field(getter = "getStyle", id = 2)
    private final StrokeStyle zza;

    @SafeParcelable.Field(getter = "getSegments", id = 3)
    private final double zzb;

    public StyleSpan(int i14, double d14) {
        if (d14 <= 0.0d) {
            h.s("A style must be applied to some segments on a polyline.");
            throw null;
        }
        this.zza = StrokeStyle.colorBuilder(i14).build();
        this.zzb = d14;
    }

    public double getSegments() {
        return this.zzb;
    }

    public StrokeStyle getStyle() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStyle(), i14, false);
        SafeParcelWriter.writeDouble(parcel, 3, getSegments());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public StyleSpan(int i14) {
        this.zza = StrokeStyle.colorBuilder(i14).build();
        this.zzb = 1.0d;
    }

    public StyleSpan(StrokeStyle strokeStyle) {
        this.zza = strokeStyle;
        this.zzb = 1.0d;
    }

    @SafeParcelable.Constructor
    public StyleSpan(@SafeParcelable.Param(id = 2) StrokeStyle strokeStyle, @SafeParcelable.Param(id = 3) double d14) {
        if (d14 > 0.0d) {
            this.zza = strokeStyle;
            this.zzb = d14;
        } else {
            h.s("A style must be applied to some segments on a polyline.");
            throw null;
        }
    }
}
