package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.garmin.proto.generated.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes14.dex */
public final class zzv extends zza implements zzx {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzA() {
        Parcel parcelZzJ = zzJ(23, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzB() {
        Parcel parcelZzJ = zzJ(16, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzd() {
        Parcel parcelZzJ = zzJ(12, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zze() {
        Parcel parcelZzJ = zzJ(8, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzf() {
        Parcel parcelZzJ = zzJ(18, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzg() {
        Parcel parcelZzJ = zzJ(7, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzh() {
        Parcel parcelZzJ = zzJ(14, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final int zzi() {
        Parcel parcelZzJ = zzJ(20, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final IObjectWrapper zzj() {
        return a.b(zzJ(25, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final LatLng zzk() {
        Parcel parcelZzJ = zzJ(4, zza());
        LatLng latLng = (LatLng) zzc.zza(parcelZzJ, LatLng.CREATOR);
        parcelZzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final LatLngBounds zzl() {
        Parcel parcelZzJ = zzJ(10, zza());
        LatLngBounds latLngBounds = (LatLngBounds) zzc.zza(parcelZzJ, LatLngBounds.CREATOR);
        parcelZzJ.recycle();
        return latLngBounds;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzm() {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzn() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzo(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzp(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzq(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzr(float f14, float f15) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        parcelZza.writeFloat(f15);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzt(LatLng latLng) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, latLng);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzu(LatLngBounds latLngBounds) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, latLngBounds);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzv(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzw(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzx(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzy(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzz(zzx zzxVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzxVar);
        Parcel parcelZzJ = zzJ(19, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
