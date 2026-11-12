package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzu();

    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List zza;

    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private float zzb;

    @SafeParcelable.Field(getter = "getColor", id = 4)
    private int zzc;

    @SafeParcelable.Field(getter = "getZIndex", id = 5)
    private float zzd;

    @SafeParcelable.Field(getter = "isVisible", id = 6)
    private boolean zze;

    @SafeParcelable.Field(getter = "isGeodesic", id = 7)
    private boolean zzf;

    @SafeParcelable.Field(getter = "isClickable", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "getStartCap", id = 9)
    private Cap zzh;

    @SafeParcelable.Field(getter = "getEndCap", id = 10)
    private Cap zzi;

    @SafeParcelable.Field(getter = "getJointType", id = 11)
    private int zzj;

    @SafeParcelable.Field(getter = "getPattern", id = 12)
    private List zzk;

    @SafeParcelable.Field(getter = "getSpans", id = 13)
    private List zzl;

    @SafeParcelable.Constructor
    public PolylineOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) float f14, @SafeParcelable.Param(id = 4) int i14, @SafeParcelable.Param(id = 5) float f15, @SafeParcelable.Param(id = 6) boolean z14, @SafeParcelable.Param(id = 7) boolean z15, @SafeParcelable.Param(id = 8) boolean z16, @SafeParcelable.Param(id = 9) Cap cap, @SafeParcelable.Param(id = 10) Cap cap2, @SafeParcelable.Param(id = 11) int i15, @SafeParcelable.Param(id = 12) List list2, @SafeParcelable.Param(id = 13) List list3) {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = list;
        this.zzb = f14;
        this.zzc = i14;
        this.zzd = f15;
        this.zze = z14;
        this.zzf = z15;
        this.zzg = z16;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i15;
        this.zzk = list2;
        if (list3 != null) {
            this.zzl = list3;
        }
    }

    public PolylineOptions add(LatLng latLng) {
        List list = this.zza;
        Preconditions.checkNotNull(list, "point must not be null.");
        list.add(latLng);
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    public PolylineOptions addAllSpans(Iterable<StyleSpan> iterable) {
        Iterator<StyleSpan> it = iterable.iterator();
        while (it.hasNext()) {
            addSpan(it.next());
        }
        return this;
    }

    public PolylineOptions addSpan(StyleSpan... styleSpanArr) {
        for (StyleSpan styleSpan : styleSpanArr) {
            addSpan(styleSpan);
        }
        return this;
    }

    public PolylineOptions clickable(boolean z14) {
        this.zzg = z14;
        return this;
    }

    public PolylineOptions color(int i14) {
        this.zzc = i14;
        return this;
    }

    public PolylineOptions endCap(Cap cap) {
        this.zzi = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    public PolylineOptions geodesic(boolean z14) {
        this.zzf = z14;
        return this;
    }

    public int getColor() {
        return this.zzc;
    }

    public Cap getEndCap() {
        return this.zzi.zza();
    }

    public int getJointType() {
        return this.zzj;
    }

    public List<PatternItem> getPattern() {
        return this.zzk;
    }

    public List<LatLng> getPoints() {
        return this.zza;
    }

    public Cap getStartCap() {
        return this.zzh.zza();
    }

    public float getWidth() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isClickable() {
        return this.zzg;
    }

    public boolean isGeodesic() {
        return this.zzf;
    }

    public boolean isVisible() {
        return this.zze;
    }

    public PolylineOptions jointType(int i14) {
        this.zzj = i14;
        return this;
    }

    public PolylineOptions pattern(List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    public PolylineOptions startCap(Cap cap) {
        this.zzh = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    public PolylineOptions visible(boolean z14) {
        this.zze = z14;
        return this;
    }

    public PolylineOptions width(float f14) {
        this.zzb = f14;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i14, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i14, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        ArrayList arrayList = new ArrayList(this.zzl.size());
        for (StyleSpan styleSpan : this.zzl) {
            StrokeStyle.Builder builder = new StrokeStyle.Builder(styleSpan.getStyle());
            builder.zzd(this.zzb);
            builder.zzc(this.zze);
            arrayList.add(new StyleSpan(builder.build(), styleSpan.getSegments()));
        }
        SafeParcelWriter.writeTypedList(parcel, 13, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public PolylineOptions zIndex(float f14) {
        this.zzd = f14;
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        Collections.addAll(this.zza, latLngArr);
        return this;
    }

    public PolylineOptions addSpan(StyleSpan styleSpan) {
        this.zzl.add(styleSpan);
        return this;
    }

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = new ArrayList();
    }
}
