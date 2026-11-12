package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.garmin.proto.generated.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzl extends zza implements zzn {
    public zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzA() {
        Parcel parcelZzJ = zzJ(16, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final double zzd() {
        Parcel parcelZzJ = zzJ(6, zza());
        double d14 = parcelZzJ.readDouble();
        parcelZzJ.recycle();
        return d14;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final float zze() {
        Parcel parcelZzJ = zzJ(8, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final float zzf() {
        Parcel parcelZzJ = zzJ(14, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzg() {
        Parcel parcelZzJ = zzJ(12, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzh() {
        Parcel parcelZzJ = zzJ(10, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzi() {
        Parcel parcelZzJ = zzJ(18, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final IObjectWrapper zzj() {
        return a.b(zzJ(24, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final LatLng zzk() {
        Parcel parcelZzJ = zzJ(4, zza());
        LatLng latLng = (LatLng) zzc.zza(parcelZzJ, LatLng.CREATOR);
        parcelZzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final String zzl() {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final List zzm() {
        Parcel parcelZzJ = zzJ(22, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(PatternItem.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzn() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzo(LatLng latLng) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, latLng);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzp(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzq(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzr(double d14) {
        Parcel parcelZza = zza();
        parcelZza.writeDouble(d14);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzs(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzt(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzu(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzv(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzw(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzx(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzy(zzn zznVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zznVar);
        Parcel parcelZzJ = zzJ(17, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzz() {
        Parcel parcelZzJ = zzJ(20, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
