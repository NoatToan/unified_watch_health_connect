package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.garmin.proto.generated.a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes14.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i14) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i14);
        return a.b(zzB(2, parcelZza));
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z14) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z14 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i14 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i14;
    }

    public final IObjectWrapper zzg(IObjectWrapper iObjectWrapper, String str, int i14) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i14);
        return a.b(zzB(4, parcelZza));
    }

    public final int zzh(IObjectWrapper iObjectWrapper, String str, boolean z14) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z14 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i14 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i14;
    }

    public final int zzi() {
        Parcel parcelZzB = zzB(6, zza());
        int i14 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i14;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, boolean z14, long j8) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z14 ? 1 : 0);
        parcelZza.writeLong(j8);
        return a.b(zzB(7, parcelZza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, int i14, IObjectWrapper iObjectWrapper2) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i14);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return a.b(zzB(8, parcelZza));
    }
}
