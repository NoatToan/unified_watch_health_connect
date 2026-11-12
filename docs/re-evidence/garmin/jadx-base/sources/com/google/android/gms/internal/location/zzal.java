package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;

/* JADX INFO: loaded from: classes14.dex */
public final class zzal extends zza implements zzam {
    public zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final Location zzd() {
        Parcel parcelZzA = zzA(7, zza());
        Location location = (Location) zzc.zza(parcelZzA, Location.CREATOR);
        parcelZzA.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final ICancelToken zze(CurrentLocationRequest currentLocationRequest, zzao zzaoVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, currentLocationRequest);
        zzc.zzd(parcelZza, zzaoVar);
        Parcel parcelZzA = zzA(87, parcelZza);
        ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelZzA.readStrongBinder());
        parcelZzA.recycle();
        return iCancelTokenAsInterface;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final LocationAvailability zzf(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzA = zzA(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(parcelZzA, LocationAvailability.CREATOR);
        parcelZzA.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzg(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzak zzakVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, geofencingRequest);
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, zzakVar);
        zzB(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzh(LocationSettingsRequest locationSettingsRequest, zzaq zzaqVar, String str) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, locationSettingsRequest);
        zzc.zzd(parcelZza, zzaqVar);
        parcelZza.writeString(null);
        zzB(63, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzi(zzai zzaiVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzaiVar);
        zzB(67, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzj(LastLocationRequest lastLocationRequest, zzao zzaoVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, lastLocationRequest);
        zzc.zzd(parcelZza, zzaoVar);
        zzB(82, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzk(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, iStatusCallback);
        zzB(73, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzl(PendingIntent pendingIntent) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzB(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzm(com.google.android.gms.location.zzbx zzbxVar, zzak zzakVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzbxVar);
        zzc.zzd(parcelZza, zzakVar);
        zzB(74, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzn(PendingIntent pendingIntent, zzak zzakVar, String str) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, zzakVar);
        parcelZza.writeString(str);
        zzB(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzo(String[] strArr, zzak zzakVar, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        zzc.zzd(parcelZza, zzakVar);
        parcelZza.writeString(str);
        zzB(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzp(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, iStatusCallback);
        zzB(69, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzq(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, activityTransitionRequest);
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, iStatusCallback);
        zzB(72, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzr(long j8, boolean z14, PendingIntent pendingIntent) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j8);
        zzc.zzb(parcelZza, true);
        zzc.zzc(parcelZza, pendingIntent);
        zzB(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzs(com.google.android.gms.location.zzl zzlVar, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzlVar);
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, iStatusCallback);
        zzB(70, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzt(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, sleepSegmentRequest);
        zzc.zzd(parcelZza, iStatusCallback);
        zzB(79, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzu(Location location) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, location);
        zzB(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzv(Location location, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, location);
        zzc.zzd(parcelZza, iStatusCallback);
        zzB(85, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzw(boolean z14) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, z14);
        zzB(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzx(boolean z14, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, z14);
        zzc.zzd(parcelZza, iStatusCallback);
        zzB(84, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzy(zzj zzjVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzjVar);
        zzB(75, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzz(zzbh zzbhVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzbhVar);
        zzB(59, parcelZza);
    }
}
