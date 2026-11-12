package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.garmin.proto.generated.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbu extends com.google.android.gms.internal.maps.zza implements IProjectionDelegate {
    public zzbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        Parcel parcelZzJ = zzJ(1, parcelZza);
        LatLng latLng = (LatLng) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, LatLng.CREATOR);
        parcelZzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final VisibleRegion getVisibleRegion() {
        Parcel parcelZzJ = zzJ(3, zza());
        VisibleRegion visibleRegion = (VisibleRegion) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, VisibleRegion.CREATOR);
        parcelZzJ.recycle();
        return visibleRegion;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final IObjectWrapper toScreenLocation(LatLng latLng) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLng);
        return a.b(zzJ(2, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final IObjectWrapper toScreenLocationWithAltitude(LatLng latLng, float f14) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLng);
        parcelZza.writeFloat(f14);
        return a.b(zzJ(4, parcelZza));
    }
}
