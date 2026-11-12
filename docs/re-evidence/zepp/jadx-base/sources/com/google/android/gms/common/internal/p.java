package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
final class p extends GmsClientSupervisor {

    @GuardedBy("connectionStatus")
    private final HashMap<zzn, n> f = new HashMap<>();
    private final Context g;
    private volatile Handler h;
    private final o i;
    private final ConnectionTracker j;
    private final long k;
    private final long l;

    public p(Context context, Looper looper) {
        o oVar = new o(this, null);
        this.i = oVar;
        this.g = context.getApplicationContext();
        this.h = new com.google.android.gms.internal.common.zzi(looper, oVar);
        this.j = ConnectionTracker.getInstance();
        this.k = 5000L;
        this.l = 300000L;
    }

    public final void f(Looper looper) {
        synchronized (this.f) {
            this.h = new com.google.android.gms.internal.common.zzi(looper, this.i);
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zza(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            n nVar = this.f.get(zznVar);
            if (nVar == null) {
                String string = zznVar.toString();
                StringBuilder sb = new StringBuilder(string.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            if (!nVar.h(serviceConnection)) {
                String string2 = zznVar.toString();
                StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(string2);
                throw new IllegalStateException(sb2.toString());
            }
            nVar.f(serviceConnection, str);
            if (nVar.i()) {
                this.h.sendMessageDelayed(this.h.obtainMessage(0, zznVar), this.k);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean zJ;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            n nVar = this.f.get(zznVar);
            if (nVar == null) {
                nVar = new n(this, zznVar);
                nVar.d(serviceConnection, serviceConnection, str);
                nVar.e(str, executor);
                this.f.put(zznVar, nVar);
            } else {
                this.h.removeMessages(0, zznVar);
                if (nVar.h(serviceConnection)) {
                    String string = zznVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                nVar.d(serviceConnection, serviceConnection, str);
                int iA = nVar.a();
                if (iA == 1) {
                    serviceConnection.onServiceConnected(nVar.b(), nVar.c());
                } else if (iA == 2) {
                    nVar.e(str, executor);
                }
            }
            zJ = nVar.j();
        }
        return zJ;
    }
}
