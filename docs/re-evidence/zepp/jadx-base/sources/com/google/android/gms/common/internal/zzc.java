package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzc<TListener> {

    @Nullable
    private TListener a;
    private boolean b = false;
    public final /* synthetic */ BaseGmsClient c;

    public zzc(BaseGmsClient baseGmsClient, TListener tlistener) {
        this.c = baseGmsClient;
        this.a = tlistener;
    }

    public abstract void zza(TListener tlistener);

    public abstract void zzc();

    public final void zze() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.a;
            if (this.b) {
                String string = toString();
                StringBuilder sb = new StringBuilder(string.length() + 47);
                sb.append("Callback proxy ");
                sb.append(string);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                zza(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.b = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void zzg() {
        zzf();
        synchronized (this.c.q) {
            this.c.q.remove(this);
        }
    }
}
