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
public final class zzam extends zza implements zzao {
    public zzam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzA(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzB(zzao zzaoVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzaoVar);
        Parcel parcelZzJ = zzJ(19, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzC() {
        Parcel parcelZzJ = zzJ(22, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzD() {
        Parcel parcelZzJ = zzJ(18, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzE() {
        Parcel parcelZzJ = zzJ(16, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final float zzd() {
        Parcel parcelZzJ = zzJ(8, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final float zze() {
        Parcel parcelZzJ = zzJ(14, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzf() {
        Parcel parcelZzJ = zzJ(12, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzg() {
        Parcel parcelZzJ = zzJ(10, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzh() {
        Parcel parcelZzJ = zzJ(24, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzi() {
        Parcel parcelZzJ = zzJ(20, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final IObjectWrapper zzj() {
        return a.b(zzJ(28, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final String zzk() {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final List zzl() {
        Parcel parcelZzJ = zzJ(6, zza());
        ArrayList arrayListZzb = zzc.zzb(parcelZzJ);
        parcelZzJ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final List zzm() {
        Parcel parcelZzJ = zzJ(4, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(LatLng.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final List zzn() {
        Parcel parcelZzJ = zzJ(26, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(PatternItem.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzo() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzp(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzq(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzr(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzs(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeList(list);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzt(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzu(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzv(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzw(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzx(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzy(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzz(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(15, parcelZza);
    }
}
