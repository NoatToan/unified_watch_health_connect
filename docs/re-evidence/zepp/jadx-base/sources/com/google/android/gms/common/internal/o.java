package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class o implements Handler.Callback {
    public final /* synthetic */ p a;

    public /* synthetic */ o(p pVar, zzp zzpVar) {
        this.a = pVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.f) {
                zzn zznVar = (zzn) message.obj;
                n nVar = (n) this.a.f.get(zznVar);
                if (nVar != null && nVar.i()) {
                    if (nVar.j()) {
                        nVar.g("GmsClientSupervisor");
                    }
                    this.a.f.remove(zznVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.a.f) {
            zzn zznVar2 = (zzn) message.obj;
            n nVar2 = (n) this.a.f.get(zznVar2);
            if (nVar2 != null && nVar2.a() == 3) {
                String strValueOf = String.valueOf(zznVar2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentNameB = nVar2.b();
                if (componentNameB == null) {
                    componentNameB = zznVar2.zzb();
                }
                if (componentNameB == null) {
                    String strZzd = zznVar2.zzd();
                    Preconditions.checkNotNull(strZzd);
                    componentNameB = new ComponentName(strZzd, "unknown");
                }
                nVar2.onServiceDisconnected(componentNameB);
            }
        }
        return true;
    }
}
