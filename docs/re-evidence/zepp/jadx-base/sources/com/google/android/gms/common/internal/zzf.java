package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf extends j {
    public final /* synthetic */ BaseGmsClient e;

    @Nullable
    public final IBinder zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzf(BaseGmsClient baseGmsClient, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.e = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.j
    public final void zzb(ConnectionResult connectionResult) {
        if (this.e.u != null) {
            this.e.u.onConnectionFailed(connectionResult);
        }
        this.e.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.j
    public final boolean zzd() {
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.e.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.e.getServiceDescriptor();
                StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.e.createServiceInterface(this.zze);
            if (iInterfaceCreateServiceInterface == null || !(BaseGmsClient.l(this.e, 2, 4, iInterfaceCreateServiceInterface) || BaseGmsClient.l(this.e, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            this.e.y = null;
            Bundle connectionHint = this.e.getConnectionHint();
            BaseGmsClient baseGmsClient = this.e;
            if (baseGmsClient.t == null) {
                return true;
            }
            baseGmsClient.t.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
