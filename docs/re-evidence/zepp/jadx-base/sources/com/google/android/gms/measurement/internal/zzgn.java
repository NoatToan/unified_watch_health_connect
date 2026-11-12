package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzpe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgn extends zzea {
    private final zzks a;
    private Boolean b;
    private String c;

    public zzgn(zzks zzksVar, String str) {
        Preconditions.checkNotNull(zzksVar);
        this.a = zzksVar;
        this.c = null;
    }

    @BinderThread
    private final void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.a.zzay().zzd().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    this.b = Boolean.valueOf("com.google.android.gms".equals(this.c) || UidVerifier.isGooglePlayServicesUid(this.a.zzau(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.a.zzau()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzel.zzn(str));
                throw e;
            }
        }
        if (this.c == null && GooglePlayServicesUtilLight.uidHasPackageName(this.a.zzau(), Binder.getCallingUid(), str)) {
            this.c = str;
        }
        if (str.equals(this.c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(zzat zzatVar, zzp zzpVar) {
        this.a.a();
        this.a.d(zzatVar, zzpVar);
    }

    @BinderThread
    private final void i(zzp zzpVar, boolean z) {
        Preconditions.checkNotNull(zzpVar);
        Preconditions.checkNotEmpty(zzpVar.zza);
        a(zzpVar.zza, false);
        this.a.zzv().m(zzpVar.zzb, zzpVar.zzq, zzpVar.zzu);
    }

    @VisibleForTesting
    public final zzat c(zzat zzatVar, zzp zzpVar) {
        zzar zzarVar;
        if ("_cmp".equals(zzatVar.zza) && (zzarVar = zzatVar.zzb) != null && zzarVar.zza() != 0) {
            String strE = zzatVar.zzb.e("_cis");
            if ("referrer broadcast".equals(strE) || "referrer API".equals(strE)) {
                this.a.zzay().zzi().zzb("Event has been filtered ", zzatVar.toString());
                return new zzat("_cmpx", zzatVar.zzb, zzatVar.zzc, zzatVar.zzd);
            }
        }
        return zzatVar;
    }

    public final void f(zzat zzatVar, zzp zzpVar) {
        if (!this.a.zzo().zzl(zzpVar.zza)) {
            b(zzatVar, zzpVar);
            return;
        }
        this.a.zzay().zzj().zzb("EES config found for", zzpVar.zza);
        zzfm zzfmVarZzo = this.a.zzo();
        String str = zzpVar.zza;
        zzpe.zzc();
        zzc zzcVar = null;
        if (zzfmVarZzo.zzs.zzf().zzs(null, zzdy.zzat) && !TextUtils.isEmpty(str)) {
            zzcVar = zzfmVarZzo.g.get(str);
        }
        if (zzcVar == null) {
            this.a.zzay().zzj().zzb("EES not loaded for", zzpVar.zza);
            b(zzatVar, zzpVar);
            return;
        }
        try {
            Map<String, Object> mapZ = this.a.zzu().z(zzatVar.zzb.zzc(), true);
            String strZza = zzgs.zza(zzatVar.zza);
            if (strZza == null) {
                strZza = zzatVar.zza;
            }
            if (zzcVar.zze(new com.google.android.gms.internal.measurement.zzaa(strZza, zzatVar.zzd, mapZ))) {
                if (zzcVar.zzg()) {
                    this.a.zzay().zzj().zzb("EES edited event", zzatVar.zza);
                    b(this.a.zzu().q(zzcVar.zza().zzb()), zzpVar);
                } else {
                    b(zzatVar, zzpVar);
                }
                if (zzcVar.zzf()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zza().zzc()) {
                        this.a.zzay().zzj().zzb("EES logging created event", zzaaVar.zzd());
                        b(this.a.zzu().q(zzaaVar), zzpVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.a.zzay().zzd().zzc("EES error. appId, eventName", zzpVar.zzb, zzatVar.zza);
        }
        this.a.zzay().zzj().zzb("EES was not applied to event", zzatVar.zza);
        b(zzatVar, zzpVar);
    }

    public final /* synthetic */ void g(String str, Bundle bundle) {
        d dVarZzi = this.a.zzi();
        dVarZzi.zzg();
        dVarZzi.zzY();
        byte[] bArrZzbs = dVarZzi.zzf.zzu().r(new zzao(dVarZzi.zzs, "", str, "dep", 0L, 0L, bundle)).zzbs();
        dVarZzi.zzs.zzay().zzj().zzc("Saving default event parameters, appId, data size", dVarZzi.zzs.zzj().zzd(str), Integer.valueOf(bArrZzbs.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzbs);
        try {
            if (dVarZzi.F().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                dVarZzi.zzs.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzel.zzn(str));
            }
        } catch (SQLiteException e) {
            dVarZzi.zzs.zzay().zzd().zzc("Error storing default event parameters. appId", zzel.zzn(str), e);
        }
    }

    @VisibleForTesting
    public final void h(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.a.zzaz().zzs()) {
            runnable.run();
        } else {
            this.a.zzaz().zzp(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final String zzd(zzp zzpVar) {
        i(zzpVar, false);
        return this.a.Q(zzpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final List<zzkv> zze(zzp zzpVar, boolean z) {
        i(zzpVar, false);
        String str = zzpVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<b4> list = (List) this.a.zzaz().zzh(new u0(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b4 b4Var : list) {
                if (z || !zzkz.x(b4Var.c)) {
                    arrayList.add(new zzkv(b4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.zzay().zzd().zzc("Failed to get user properties. appId", zzel.zzn(zzpVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final List<zzab> zzf(String str, String str2, zzp zzpVar) {
        i(zzpVar, false);
        String str3 = zzpVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.a.zzaz().zzh(new l0(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.zzay().zzd().zzb("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final List<zzab> zzg(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.a.zzaz().zzh(new m0(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.zzay().zzd().zzb("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final List<zzkv> zzh(String str, String str2, boolean z, zzp zzpVar) {
        i(zzpVar, false);
        String str3 = zzpVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<b4> list = (List) this.a.zzaz().zzh(new i0(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b4 b4Var : list) {
                if (z || !zzkz.x(b4Var.c)) {
                    arrayList.add(new zzkv(b4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.zzay().zzd().zzc("Failed to query user properties. appId", zzel.zzn(zzpVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final List<zzkv> zzi(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<b4> list = (List) this.a.zzaz().zzh(new k0(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b4 b4Var : list) {
                if (z || !zzkz.x(b4Var.c)) {
                    arrayList.add(new zzkv(b4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.zzay().zzd().zzc("Failed to get user properties as. appId", zzel.zzn(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzj(zzp zzpVar) {
        i(zzpVar, false);
        h(new v0(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzk(zzat zzatVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzatVar);
        i(zzpVar, false);
        h(new q0(this, zzatVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzl(zzat zzatVar, String str, String str2) {
        Preconditions.checkNotNull(zzatVar);
        Preconditions.checkNotEmpty(str);
        a(str, true);
        h(new r0(this, zzatVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzm(zzp zzpVar) {
        Preconditions.checkNotEmpty(zzpVar.zza);
        a(zzpVar.zza, false);
        h(new n0(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzn(zzab zzabVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzabVar);
        Preconditions.checkNotNull(zzabVar.zzc);
        i(zzpVar, false);
        zzab zzabVar2 = new zzab(zzabVar);
        zzabVar2.zza = zzpVar.zza;
        h(new g0(this, zzabVar2, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzo(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        Preconditions.checkNotNull(zzabVar.zzc);
        Preconditions.checkNotEmpty(zzabVar.zza);
        a(zzabVar.zza, true);
        h(new h0(this, new zzab(zzabVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzp(zzp zzpVar) {
        Preconditions.checkNotEmpty(zzpVar.zza);
        Preconditions.checkNotNull(zzpVar.zzv);
        p0 p0Var = new p0(this, zzpVar);
        Preconditions.checkNotNull(p0Var);
        if (this.a.zzaz().zzs()) {
            p0Var.run();
        } else {
            this.a.zzaz().zzq(p0Var);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzq(long j, String str, String str2, String str3) {
        h(new w0(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzr(final Bundle bundle, zzp zzpVar) {
        i(zzpVar, false);
        final String str = zzpVar.zza;
        Preconditions.checkNotNull(str);
        h(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzfw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.g(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzs(zzp zzpVar) {
        i(zzpVar, false);
        h(new o0(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final void zzt(zzkv zzkvVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzkvVar);
        i(zzpVar, false);
        h(new t0(this, zzkvVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    @BinderThread
    public final byte[] zzu(zzat zzatVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzatVar);
        a(str, true);
        this.a.zzay().zzc().zzb("Log and bundle. event", this.a.zzj().zzd(zzatVar.zza));
        long jNanoTime = this.a.zzav().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.zzaz().zzi(new s0(this, zzatVar, str)).get();
            if (bArr == null) {
                this.a.zzay().zzd().zzb("Log and bundle returned null. appId", zzel.zzn(str));
                bArr = new byte[0];
            }
            this.a.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", this.a.zzj().zzd(zzatVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.a.zzav().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzel.zzn(str), this.a.zzj().zzd(zzatVar.zza), e);
            return null;
        }
    }
}
