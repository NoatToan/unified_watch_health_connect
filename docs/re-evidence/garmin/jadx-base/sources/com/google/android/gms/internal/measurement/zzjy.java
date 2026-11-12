package com.google.android.gms.internal.measurement;

import a7.g;
import android.content.Context;
import android.database.ContentObserver;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
final class zzjy implements zzjv {
    private static zzjy zza;
    private final Context zzb;
    private final ContentObserver zzc;
    private boolean zzd;

    private zzjy(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjw(this, null);
    }

    public static zzjy zza(Context context) {
        zzjy zzjyVar;
        synchronized (zzjy.class) {
            try {
                if (zza == null) {
                    zza = g.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzjy(context) : new zzjy();
                }
                zzjy zzjyVar2 = zza;
                if (zzjyVar2 != null && zzjyVar2.zzc != null && !zzjyVar2.zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
                        ((zzjy) Preconditions.checkNotNull(zza)).zzd = true;
                    } catch (SecurityException unused) {
                    }
                }
                zzjyVar = (zzjy) Preconditions.checkNotNull(zza);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zzjyVar;
    }

    public static synchronized void zzc() {
        Context context;
        try {
            zzjy zzjyVar = zza;
            if (zzjyVar != null && (context = zzjyVar.zzb) != null && zzjyVar.zzc != null && zzjyVar.zzd) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final String zze(final String str) {
        Context context = this.zzb;
        if (context != null && !zzjm.zzb(context)) {
            try {
                return (String) zzjv.zzh(new zzju() { // from class: com.google.android.gms.internal.measurement.zzjx
                    @Override // com.google.android.gms.internal.measurement.zzju
                    public final /* synthetic */ Object zza() {
                        return this.zza.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(str);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzjf.zza(((Context) Preconditions.checkNotNull(this.zzb)).getContentResolver(), str, null);
    }

    private zzjy() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }
}
