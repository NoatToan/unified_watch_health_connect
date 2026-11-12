package com.google.android.gms.tasks;

import androidx.core.view.j;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes14.dex */
final class zzae<T> implements zzab<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzae(int i14, zzw zzwVar) {
        this.zzb = i14;
        this.zzc = zzwVar;
    }

    private final void zza() {
        int i14 = this.zzd;
        int i15 = this.zze;
        int i16 = i14 + i15 + this.zzf;
        int i17 = this.zzb;
        if (i16 == i17) {
            if (this.zzg != null) {
                zzw zzwVar = this.zzc;
                int length = String.valueOf(i15).length();
                zzwVar.zzc(new ExecutionException(j.e(i15, i17, " out of ", " underlying tasks failed", new StringBuilder(String.valueOf(i17).length() + length + 8 + 24)), this.zzg));
                return;
            }
            boolean z14 = this.zzh;
            zzw zzwVar2 = this.zzc;
            if (z14) {
                zzwVar2.zze();
            } else {
                zzwVar2.zza(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t7) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
