package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.garmin.proto.generated.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.StyleSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzap extends zza implements zzar {
    public zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzA(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzB(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzC(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final boolean zzD(zzar zzarVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzarVar);
        Parcel parcelZzJ = zzJ(15, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final boolean zzE() {
        Parcel parcelZzJ = zzJ(18, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final boolean zzF() {
        Parcel parcelZzJ = zzJ(14, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final boolean zzG() {
        Parcel parcelZzJ = zzJ(12, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final float zzd() {
        Parcel parcelZzJ = zzJ(6, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final float zze() {
        Parcel parcelZzJ = zzJ(10, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final int zzf() {
        Parcel parcelZzJ = zzJ(8, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final int zzg() {
        Parcel parcelZzJ = zzJ(24, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final int zzh() {
        Parcel parcelZzJ = zzJ(16, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final IObjectWrapper zzi() {
        return a.b(zzJ(28, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final Cap zzj() {
        Parcel parcelZzJ = zzJ(22, zza());
        Cap cap = (Cap) zzc.zza(parcelZzJ, Cap.CREATOR);
        parcelZzJ.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final Cap zzk() {
        Parcel parcelZzJ = zzJ(20, zza());
        Cap cap = (Cap) zzc.zza(parcelZzJ, Cap.CREATOR);
        parcelZzJ.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final String zzl() {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final List zzm() {
        Parcel parcelZzJ = zzJ(26, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(PatternItem.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final List zzn() {
        Parcel parcelZzJ = zzJ(4, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(LatLng.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final List zzo() {
        Parcel parcelZzJ = zzJ(30, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(StyleSpan.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzp() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzq(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzr(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzs(Cap cap) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, cap);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzt(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzu(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzv(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzw(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzx(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzy(Cap cap) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, cap);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzz(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(27, parcelZza);
    }
}
