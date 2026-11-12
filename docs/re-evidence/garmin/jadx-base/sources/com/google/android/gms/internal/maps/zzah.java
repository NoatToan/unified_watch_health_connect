package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.garmin.proto.generated.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes14.dex */
public final class zzah extends zza implements zzaj {
    public zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzA(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzB(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzC(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzD() {
        zzc(11, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzE(zzaj zzajVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzajVar);
        Parcel parcelZzJ = zzJ(16, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzF() {
        Parcel parcelZzJ = zzJ(10, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzG() {
        Parcel parcelZzJ = zzJ(21, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzH() {
        Parcel parcelZzJ = zzJ(13, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzI() {
        Parcel parcelZzJ = zzJ(15, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zzd() {
        Parcel parcelZzJ = zzJ(26, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zze() {
        Parcel parcelZzJ = zzJ(23, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zzf() {
        Parcel parcelZzJ = zzJ(28, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final int zzg() {
        Parcel parcelZzJ = zzJ(17, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final IObjectWrapper zzh() {
        return a.b(zzJ(34, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final IObjectWrapper zzi() {
        return a.b(zzJ(30, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final LatLng zzj() {
        Parcel parcelZzJ = zzJ(4, zza());
        LatLng latLng = (LatLng) zzc.zza(parcelZzJ, LatLng.CREATOR);
        parcelZzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final String zzk() {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final String zzl() {
        Parcel parcelZzJ = zzJ(8, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final String zzm() {
        Parcel parcelZzJ = zzJ(6, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzn() {
        zzc(12, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzo() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzp(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzq(float f14, float f15) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        parcelZza.writeFloat(f15);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzr(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzs(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzt(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzv(float f14, float f15) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        parcelZza.writeFloat(f15);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzw(LatLng latLng) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, latLng);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzx(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzy(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzz(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(29, parcelZza);
    }
}
