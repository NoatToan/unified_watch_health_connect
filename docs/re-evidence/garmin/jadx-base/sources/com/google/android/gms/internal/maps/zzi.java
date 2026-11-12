package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.garmin.proto.generated.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.PinConfig;

/* JADX INFO: loaded from: classes14.dex */
public final class zzi extends zza implements zzk {
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzd() {
        return a.b(zzJ(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zze(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        return a.b(zzJ(5, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzf(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return a.b(zzJ(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzg(Bitmap bitmap) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bitmap);
        return a.b(zzJ(6, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzh(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return a.b(zzJ(3, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzi(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return a.b(zzJ(7, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzj(PinConfig pinConfig) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, pinConfig);
        return a.b(zzJ(8, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzk(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        return a.b(zzJ(1, parcelZza));
    }
}
