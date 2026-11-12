package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzjn implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private volatile boolean a;
    private volatile zzeh b;
    public final /* synthetic */ zzjo c;

    public zzjn(zzjo zzjoVar) {
        this.c = zzjoVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.b);
                this.c.zzs.zzaz().zzp(new e3(this, this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzel zzelVarZzl = this.c.zzs.zzl();
        if (zzelVarZzl != null) {
            zzelVarZzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.zzs.zzaz().zzp(new g3(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.c.zzs.zzay().zzc().zza("Service connection suspended");
        this.c.zzs.zzaz().zzp(new f3(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.zzs.zzay().zzd().zza("Service connected with null binder");
                return;
            }
            zzeb zzdzVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzdzVar = iInterfaceQueryLocalInterface instanceof zzeb ? (zzeb) iInterfaceQueryLocalInterface : new zzdz(iBinder);
                    this.c.zzs.zzay().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.c.zzs.zzay().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.zzs.zzay().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if (zzdzVar == null) {
                this.a = false;
                try {
                    ConnectionTracker.getInstance().unbindService(this.c.zzs.zzau(), this.c.b);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.zzs.zzaz().zzp(new c3(this, zzdzVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.c.zzs.zzay().zzc().zza("Service disconnected");
        this.c.zzs.zzaz().zzp(new d3(this, componentName));
    }

    @WorkerThread
    public final void zzb(Intent intent) {
        this.c.zzg();
        Context contextZzau = this.c.zzs.zzau();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.a) {
                this.c.zzs.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.c.zzs.zzay().zzj().zza("Using local app measurement service");
            this.a = true;
            connectionTracker.bindService(contextZzau, intent, this.c.b, 129);
        }
    }

    @WorkerThread
    public final void zzc() {
        this.c.zzg();
        Context contextZzau = this.c.zzs.zzau();
        synchronized (this) {
            if (this.a) {
                this.c.zzs.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                this.c.zzs.zzay().zzj().zza("Already awaiting connection attempt");
                return;
            }
            this.b = new zzeh(contextZzau, Looper.getMainLooper(), this, this);
            this.c.zzs.zzay().zzj().zza("Connecting to remote service");
            this.a = true;
            Preconditions.checkNotNull(this.b);
            this.b.checkAvailabilityAndConnect();
        }
    }

    @WorkerThread
    public final void zzd() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }
}
