package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzmc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zze;
    final /* synthetic */ zznl zzf;

    public zzmc(zznl zznlVar, String str, String str2, zzr zzrVar, boolean z14, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z14;
        this.zze = zzcuVar;
        Objects.requireNonNull(zznlVar);
        this.zzf = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e4;
        Bundle bundle2 = new Bundle();
        try {
            zznl zznlVar = this.zzf;
            zzgb zzgbVarZzZ = zznlVar.zzZ();
            if (zzgbVarZzZ == null) {
                zzic zzicVar = zznlVar.zzu;
                zzicVar.zzaV().zzb().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                zzicVar.zzk().zzaq(this.zze, bundle2);
                return;
            }
            zzr zzrVar = this.zzc;
            Preconditions.checkNotNull(zzrVar);
            List<zzpl> listZzp = zzgbVarZzZ.zzp(this.zza, this.zzb, this.zzd, zzrVar);
            bundle = new Bundle();
            if (listZzp != null) {
                for (zzpl zzplVar : listZzp) {
                    String str = zzplVar.zze;
                    if (str != null) {
                        bundle.putString(zzplVar.zzb, str);
                    } else {
                        Long l14 = zzplVar.zzd;
                        if (l14 != null) {
                            bundle.putLong(zzplVar.zzb, l14.longValue());
                        } else {
                            Double d14 = zzplVar.zzg;
                            if (d14 != null) {
                                bundle.putDouble(zzplVar.zzb, d14.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    zznlVar.zzV();
                    zzic zzicVar2 = zznlVar.zzu;
                    zzicVar2.zzk().zzaq(this.zze, bundle);
                } catch (RemoteException e14) {
                    e4 = e14;
                    this.zzf.zzu.zzaV().zzb().zzc("Failed to get user properties; remote exception", this.zza, e4);
                    zznl zznlVar2 = this.zzf;
                    zznlVar2.zzu.zzk().zzaq(this.zze, bundle);
                }
            } catch (Throwable th3) {
                th = th3;
                bundle2 = bundle;
                zznl zznlVar3 = this.zzf;
                zznlVar3.zzu.zzk().zzaq(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e15) {
            bundle = bundle2;
            e4 = e15;
        } catch (Throwable th4) {
            th = th4;
            zznl zznlVar4 = this.zzf;
            zznlVar4.zzu.zzk().zzaq(this.zze, bundle2);
            throw th;
        }
    }
}
