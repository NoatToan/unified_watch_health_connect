package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzjo extends v {
    private final zzjn b;
    private zzeb c;
    private volatile Boolean d;
    private final f e;
    private final q3 f;
    private final List<Runnable> g;
    private final f h;

    public zzjo(zzfv zzfvVar) {
        super(zzfvVar);
        this.g = new ArrayList();
        this.f = new q3(zzfvVar.zzav());
        this.b = new zzjn(this);
        this.e = new r2(this, zzfvVar);
        this.h = new u2(this, zzfvVar);
    }

    @WorkerThread
    private final zzp e(boolean z) {
        Pair<String, Long> pairZza;
        this.zzs.zzaw();
        zzec zzecVarZzh = this.zzs.zzh();
        String string = null;
        if (z) {
            zzel zzelVarZzay = this.zzs.zzay();
            if (zzelVarZzay.zzs.zzm().c != null && (pairZza = zzelVarZzay.zzs.zzm().c.zza()) != null && pairZza != w.w) {
                String strValueOf = String.valueOf(pairZza.second);
                String str = (String) pairZza.first;
                StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb.append(strValueOf);
                sb.append(":");
                sb.append(str);
                string = sb.toString();
            }
        }
        return zzecVarZzh.d(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void f() {
        zzg();
        this.zzs.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.g.size()));
        Iterator<Runnable> it2 = this.g.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().run();
            } catch (RuntimeException e) {
                this.zzs.zzay().zzd().zzb("Task exception while flushing queue", e);
            }
        }
        this.g.clear();
        this.h.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void g() {
        zzg();
        this.f.b();
        f fVar = this.e;
        this.zzs.zzf();
        fVar.d(zzdy.zzI.zza(null).longValue());
    }

    @WorkerThread
    private final void h(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.g.size();
        this.zzs.zzf();
        if (size >= 1000) {
            this.zzs.zzay().zzd().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.g.add(runnable);
        this.h.d(60000L);
        q();
    }

    private final boolean i() {
        this.zzs.zzaw();
        return true;
    }

    public static /* bridge */ /* synthetic */ void o(zzjo zzjoVar, ComponentName componentName) {
        zzjoVar.zzg();
        if (zzjoVar.c != null) {
            zzjoVar.c = null;
            zzjoVar.zzs.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjoVar.zzg();
            zzjoVar.q();
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void b(zzeb zzebVar, AbstractSafeParcelable abstractSafeParcelable, zzp zzpVar) {
        int size;
        zzg();
        zza();
        i();
        this.zzs.zzf();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> listZzi = this.zzs.zzi().zzi(100);
            if (listZzi != null) {
                arrayList.addAll(listZzi);
                size = listZzi.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i3);
                if (abstractSafeParcelable2 instanceof zzat) {
                    try {
                        zzebVar.zzk((zzat) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e) {
                        this.zzs.zzay().zzd().zzb("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkv) {
                    try {
                        zzebVar.zzt((zzkv) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e2) {
                        this.zzs.zzay().zzd().zzb("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzab) {
                    try {
                        zzebVar.zzn((zzab) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e3) {
                        this.zzs.zzay().zzd().zzb("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.zzs.zzay().zzd().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i++;
            i2 = size;
        }
    }

    @WorkerThread
    public final boolean c() {
        zzg();
        zza();
        return !d() || this.zzs.zzv().zzm() >= zzdy.zzan.zza(null).intValue();
    }

    @WorkerThread
    public final boolean d() {
        zzg();
        zza();
        if (this.d == null) {
            zzg();
            zza();
            w wVarZzm = this.zzs.zzm();
            wVarZzm.zzg();
            boolean z = false;
            Boolean boolValueOf = !wVarZzm.b().contains("use_service") ? null : Boolean.valueOf(wVarZzm.b().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                this.zzs.zzaw();
                if (this.zzs.zzh().b() == 1) {
                    z = true;
                } else {
                    this.zzs.zzay().zzj().zza("Checking service availability");
                    int iZzo = this.zzs.zzv().zzo(12451000);
                    if (iZzo == 0) {
                        this.zzs.zzay().zzj().zza("Service available");
                    } else if (iZzo != 1) {
                        if (iZzo == 2) {
                            this.zzs.zzay().zzc().zza("Service container out of date");
                            if (this.zzs.zzv().zzm() >= 17443) {
                                z = boolValueOf == null;
                            }
                        } else if (iZzo == 3) {
                            this.zzs.zzay().zzk().zza("Service disabled");
                        } else if (iZzo == 9) {
                            this.zzs.zzay().zzk().zza("Service invalid");
                        } else if (iZzo != 18) {
                            this.zzs.zzay().zzk().zzb("Unexpected service status", Integer.valueOf(iZzo));
                        } else {
                            this.zzs.zzay().zzk().zza("Service updating");
                        }
                        z2 = false;
                    } else {
                        this.zzs.zzay().zzj().zza("Service missing");
                    }
                    z = true;
                }
                if (!z && this.zzs.zzf().h()) {
                    this.zzs.zzay().zzd().zza("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    w wVarZzm2 = this.zzs.zzm();
                    wVarZzm2.zzg();
                    SharedPreferences.Editor editorEdit = wVarZzm2.b().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.d = Boolean.valueOf(z2);
        }
        return this.d.booleanValue();
    }

    public final Boolean l() {
        return this.d;
    }

    @WorkerThread
    public final void q() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (d()) {
            this.b.zzc();
            return;
        }
        if (this.zzs.zzf().h()) {
            return;
        }
        this.zzs.zzaw();
        List<ResolveInfo> listQueryIntentServices = this.zzs.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            this.zzs.zzay().zzd().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzaw();
        intent.setComponent(new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
        this.b.zzb(intent);
    }

    @WorkerThread
    public final void zzA(zzat zzatVar, String str) {
        Preconditions.checkNotNull(zzatVar);
        zzg();
        zza();
        i();
        h(new x2(this, true, e(true), this.zzs.zzi().zzo(zzatVar), zzatVar, str));
    }

    @WorkerThread
    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzat zzatVar, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(12451000) == 0) {
            h(new s2(this, zzatVar, str, zzcfVar));
        } else {
            this.zzs.zzay().zzk().zza("Not bundling data. Service unavailable or out of date");
            this.zzs.zzv().zzR(zzcfVar, new byte[0]);
        }
    }

    @WorkerThread
    public final void zzC() {
        zzg();
        zza();
        zzp zzpVarE = e(false);
        i();
        this.zzs.zzi().zzj();
        h(new l2(this, zzpVarE));
    }

    @WorkerThread
    public final void zzE(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        zzg();
        zza();
        this.zzs.zzaw();
        h(new y2(this, true, e(true), this.zzs.zzi().zzn(zzabVar), new zzab(zzabVar), zzabVar));
    }

    @WorkerThread
    public final void zzF(boolean z) {
        zzg();
        zza();
        if (z) {
            i();
            this.zzs.zzi().zzj();
        }
        if (c()) {
            h(new w2(this, e(false)));
        }
    }

    @WorkerThread
    public final void zzG(zzih zzihVar) {
        zzg();
        zza();
        h(new p2(this, zzihVar));
    }

    @WorkerThread
    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        h(new q2(this, e(false), bundle));
    }

    @WorkerThread
    public final void zzI() {
        zzg();
        zza();
        h(new v2(this, e(true)));
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzJ(zzeb zzebVar) {
        zzg();
        Preconditions.checkNotNull(zzebVar);
        this.c = zzebVar;
        g();
        f();
    }

    @WorkerThread
    public final void zzK(zzkv zzkvVar) {
        zzg();
        zza();
        i();
        h(new j2(this, e(true), this.zzs.zzi().zzp(zzkvVar), zzkvVar));
    }

    @WorkerThread
    public final boolean zzL() {
        zzg();
        zza();
        return this.c != null;
    }

    @Override // com.google.android.gms.measurement.internal.v
    public final boolean zzf() {
        return false;
    }

    @WorkerThread
    public final void zzq() {
        zzg();
        zza();
        zzp zzpVarE = e(true);
        this.zzs.zzi().zzk();
        h(new o2(this, zzpVarE));
    }

    @WorkerThread
    public final void zzs() {
        zzg();
        zza();
        this.b.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzs.zzau(), this.b);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.c = null;
    }

    @WorkerThread
    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        h(new n2(this, e(false), zzcfVar));
    }

    @WorkerThread
    public final void zzu(AtomicReference<String> atomicReference) {
        zzg();
        zza();
        h(new m2(this, atomicReference, e(false)));
    }

    @WorkerThread
    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        h(new a3(this, str, str2, e(false), zzcfVar));
    }

    @WorkerThread
    public final void zzw(AtomicReference<List<zzab>> atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        h(new z2(this, atomicReference, null, str2, str3, e(false)));
    }

    @WorkerThread
    public final void zzx(AtomicReference<List<zzkv>> atomicReference, boolean z) {
        zzg();
        zza();
        h(new k2(this, atomicReference, e(false), z));
    }

    @WorkerThread
    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z) {
        zzg();
        zza();
        h(new i2(this, str, str2, e(false), z, zzcfVar));
    }

    @WorkerThread
    public final void zzz(AtomicReference<List<zzkv>> atomicReference, String str, String str2, String str3, boolean z) {
        zzg();
        zza();
        h(new b3(this, atomicReference, null, str2, str3, e(false), z));
    }
}
