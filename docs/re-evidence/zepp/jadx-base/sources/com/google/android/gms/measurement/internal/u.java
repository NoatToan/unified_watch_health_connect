package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes3.dex */
final class u extends BroadcastReceiver {

    @VisibleForTesting
    public static final String d = u.class.getName();
    private final zzks a;
    private boolean b;
    private boolean c;

    public u(zzks zzksVar) {
        Preconditions.checkNotNull(zzksVar);
        this.a = zzksVar;
    }

    @WorkerThread
    public final void b() {
        this.a.b();
        this.a.zzaz().zzg();
        if (this.b) {
            return;
        }
        this.a.zzau().registerReceiver(this, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
        this.c = this.a.zzl().zza();
        this.a.zzay().zzj().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    @WorkerThread
    public final void c() {
        this.a.b();
        this.a.zzaz().zzg();
        this.a.zzaz().zzg();
        if (this.b) {
            this.a.zzay().zzj().zza("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.zzau().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.zzay().zzd().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        this.a.b();
        String action = intent.getAction();
        this.a.zzay().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if (!ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(action)) {
            this.a.zzay().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZza = this.a.zzl().zza();
        if (this.c != zZza) {
            this.c = zZza;
            this.a.zzaz().zzp(new t(this, zZza));
        }
    }
}
