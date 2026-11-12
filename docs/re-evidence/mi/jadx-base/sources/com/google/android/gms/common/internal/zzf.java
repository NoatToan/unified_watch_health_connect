package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends zza {
    public final IBinder zze;
    final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.zzf.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.zzf.getServiceDescriptor();
                StringBuilder sb = new StringBuilder();
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.zzf.createServiceInterface(this.zze);
            if (iInterfaceCreateServiceInterface == null) {
                return false;
            }
            if (!BaseGmsClient.zzn(this.zzf, 2, 4, iInterfaceCreateServiceInterface) && !BaseGmsClient.zzn(this.zzf, 3, 4, iInterfaceCreateServiceInterface)) {
                return false;
            }
            this.zzf.zzB = null;
            BaseGmsClient baseGmsClient = this.zzf;
            Bundle connectionHint = baseGmsClient.getConnectionHint();
            if (baseGmsClient.zzw != null) {
                this.zzf.zzw.onConnected(connectionHint);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
