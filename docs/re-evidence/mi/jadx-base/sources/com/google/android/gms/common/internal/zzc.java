package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzc {
    private Object zza;
    private boolean zzb = false;
    final /* synthetic */ BaseGmsClient zzd;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.zzd = baseGmsClient;
        this.zza = obj;
    }

    public abstract void zza(Object obj);

    public abstract void zzc();

    public final void zze() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.zza;
                if (this.zzb) {
                    String string = toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            zza(obj);
        }
        synchronized (this) {
            this.zzb = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }

    public final void zzg() {
        zzf();
        synchronized (this.zzd.zzt) {
            this.zzd.zzt.remove(this);
        }
    }
}
