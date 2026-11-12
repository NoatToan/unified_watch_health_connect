package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.maps.android.BuildConfig;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_UNKNOWN", getter = "getOperation", id = 1)
    private final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = BuildConfig.TRAVIS, getter = "getLocationRequest", id = 2)
    private final zzbf zzb;

    @SafeParcelable.Field(defaultValueUnchecked = BuildConfig.TRAVIS, getter = "getLocationListenerAsBinder", id = 3, type = "android.os.IBinder")
    private final com.google.android.gms.location.zzbl zzc;

    @SafeParcelable.Field(defaultValueUnchecked = BuildConfig.TRAVIS, getter = "getLocationCallbackAsBinder", id = 5, type = "android.os.IBinder")
    private final com.google.android.gms.location.zzbi zzd;

    @SafeParcelable.Field(defaultValueUnchecked = BuildConfig.TRAVIS, getter = "getPendingIntent", id = 4)
    private final PendingIntent zze;

    @SafeParcelable.Field(defaultValueUnchecked = BuildConfig.TRAVIS, getter = "getFusedLocationProviderCallbackAsBinder", id = 6, type = "android.os.IBinder")
    private final zzai zzf;

    @SafeParcelable.Field(defaultValueUnchecked = BuildConfig.TRAVIS, getter = "getListenerId", id = 8)
    private final String zzg;

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) zzbf zzbfVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 5) IBinder iBinder2, @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(id = 6) IBinder iBinder3, @SafeParcelable.Param(id = 8) String str) {
        this.zza = i14;
        this.zzb = zzbfVar;
        zzai zzagVar = null;
        this.zzc = iBinder != null ? com.google.android.gms.location.zzbk.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? com.google.android.gms.location.zzbh.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder3);
        }
        this.zzf = zzagVar;
        this.zzg = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.zzbi] */
    public static zzbh zza(com.google.android.gms.location.zzbi zzbiVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbh(2, null, null, zzbiVar, null, zzaiVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.zzbl] */
    public static zzbh zzb(com.google.android.gms.location.zzbl zzblVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbh(2, null, zzblVar, null, null, zzaiVar, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i14, false);
        com.google.android.gms.location.zzbl zzblVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzblVar == null ? null : zzblVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zze, i14, false);
        com.google.android.gms.location.zzbi zzbiVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, zzbiVar == null ? null : zzbiVar.asBinder(), false);
        zzai zzaiVar = this.zzf;
        SafeParcelWriter.writeIBinder(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
