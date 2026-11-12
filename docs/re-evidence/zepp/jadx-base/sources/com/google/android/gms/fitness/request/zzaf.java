package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.fitness.zzb;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf extends zzb implements zzad {
    public zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.request.IBleScanCallback");
    }

    @Override // com.google.android.gms.fitness.request.zzad
    public final void onDeviceFound(BleDevice bleDevice) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, bleDevice);
        zzb(1, parcelZza);
    }

    @Override // com.google.android.gms.fitness.request.zzad
    public final void onScanStopped() throws RemoteException {
        zzb(2, zza());
    }
}
