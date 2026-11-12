package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.watch.companion.mediac.Command;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzio extends v {
    private volatile zzih b;
    private volatile zzih c;
    private final Map<Activity, zzih> d;

    @GuardedBy("activityLock")
    private Activity e;

    @GuardedBy("activityLock")
    private volatile boolean f;
    private volatile zzih g;
    private zzih h;

    @GuardedBy("activityLock")
    private boolean i;
    private final Object j;

    @GuardedBy("this")
    private zzih k;

    @GuardedBy("this")
    private String l;

    @VisibleForTesting
    public zzih zza;

    public zzio(zzfv zzfvVar) {
        super(zzfvVar);
        this.j = new Object();
        this.d = new ConcurrentHashMap();
    }

    @MainThread
    private final void b(Activity activity, zzih zzihVar, boolean z) {
        zzih zzihVar2;
        zzih zzihVar3 = this.b == null ? this.c : this.b;
        if (zzihVar.zzb == null) {
            zzihVar2 = new zzih(zzihVar.zza, activity != null ? f(activity.getClass(), "Activity") : null, zzihVar.zzc, zzihVar.zze, zzihVar.zzf);
        } else {
            zzihVar2 = zzihVar;
        }
        this.c = this.b;
        this.b = zzihVar2;
        this.zzs.zzaz().zzp(new d2(this, zzihVar2, zzihVar3, this.zzs.zzav().elapsedRealtime(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void c(zzih zzihVar, zzih zzihVar2, long j, boolean z, Bundle bundle) {
        long j2;
        zzg();
        boolean z2 = false;
        boolean z3 = (zzihVar2 != null && zzihVar2.zzc == zzihVar.zzc && zzkz.B(zzihVar2.zzb, zzihVar.zzb) && zzkz.B(zzihVar2.zza, zzihVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzkz.zzJ(zzihVar, bundle2, true);
            if (zzihVar2 != null) {
                String str = zzihVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzihVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong(Command.PLAYER_IN, zzihVar2.zzc);
            }
            if (z2) {
                o3 o3Var = this.zzs.zzu().zzb;
                long j3 = j - o3Var.b;
                o3Var.b = j;
                if (j3 > 0) {
                    this.zzs.zzv().f(bundle2, j3);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzihVar.zze ? "auto" : "app";
            long jCurrentTimeMillis = this.zzs.zzav().currentTimeMillis();
            if (zzihVar.zze) {
                long j4 = zzihVar.zzf;
                if (j4 != 0) {
                    j2 = j4;
                }
                this.zzs.zzq().e(str3, "_vs", j2, bundle2);
            }
            j2 = jCurrentTimeMillis;
            this.zzs.zzq().e(str3, "_vs", j2, bundle2);
        }
        if (z2) {
            d(this.zza, true, j);
        }
        this.zza = zzihVar;
        if (zzihVar.zze) {
            this.h = zzihVar;
        }
        this.zzs.zzt().zzG(zzihVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void d(zzih zzihVar, boolean z, long j) {
        this.zzs.zzd().zzf(this.zzs.zzav().elapsedRealtime());
        if (!this.zzs.zzu().zzb.d(zzihVar != null && zzihVar.a, z, j) || zzihVar == null) {
            return;
        }
        zzihVar.a = false;
    }

    public static /* bridge */ /* synthetic */ void i(zzio zzioVar, Bundle bundle, zzih zzihVar, zzih zzihVar2, long j) {
        bundle.remove("screen_name");
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzioVar.c(zzihVar, zzihVar2, j, true, zzioVar.zzs.zzv().R(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    @MainThread
    private final zzih k(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzih zzihVar = this.d.get(activity);
        if (zzihVar == null) {
            zzih zzihVar2 = new zzih(null, f(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.d.put(activity, zzihVar2);
            zzihVar = zzihVar2;
        }
        return this.g != null ? this.g : zzihVar;
    }

    @VisibleForTesting
    public final String f(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzs.zzf();
        return str2.substring(0, 100);
    }

    @Override // com.google.android.gms.measurement.internal.v
    public final boolean zzf() {
        return false;
    }

    public final zzih zzi() {
        return this.b;
    }

    @WorkerThread
    public final zzih zzj(boolean z) {
        zza();
        zzg();
        if (!z) {
            return this.zza;
        }
        zzih zzihVar = this.zza;
        return zzihVar != null ? zzihVar : this.h;
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.d.put(activity, new zzih(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.j) {
            if (activity == this.e) {
                this.e = null;
            }
        }
        if (this.zzs.zzf().zzu()) {
            this.d.remove(activity);
        }
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.j) {
            this.i = false;
            this.f = true;
        }
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.b = null;
            this.zzs.zzaz().zzp(new f2(this, jElapsedRealtime));
        } else {
            zzih zzihVarK = k(activity);
            this.c = this.b;
            this.b = null;
            this.zzs.zzaz().zzp(new g2(this, zzihVarK, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.j) {
            this.i = true;
            if (activity != this.e) {
                synchronized (this.j) {
                    this.e = activity;
                    this.f = false;
                }
                if (this.zzs.zzf().zzu()) {
                    this.g = null;
                    this.zzs.zzaz().zzp(new h2(this));
                }
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.b = this.g;
            this.zzs.zzaz().zzp(new e2(this));
        } else {
            b(activity, k(activity), false);
            zzd zzdVarZzd = this.zzs.zzd();
            zzdVarZzd.zzs.zzaz().zzp(new j(zzdVarZzd, zzdVarZzd.zzs.zzav().elapsedRealtime()));
        }
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zzih zzihVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zzihVar = this.d.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzihVar.zzc);
        bundle2.putString("name", zzihVar.zza);
        bundle2.putString("referrer_name", zzihVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzw(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        if (!this.zzs.zzf().zzu()) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzih zzihVar = this.b;
        if (zzihVar == null) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.d.get(activity) == null) {
            this.zzs.zzay().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = f(activity.getClass(), "Activity");
        }
        boolean zB = zzkz.B(zzihVar.zzb, str2);
        boolean zB2 = zzkz.B(zzihVar.zza, str);
        if (zB && zB2) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                this.zzs.zzf();
            }
            this.zzs.zzay().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                this.zzs.zzf();
            }
            this.zzs.zzay().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        this.zzs.zzay().zzj().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzih zzihVar2 = new zzih(str, str2, this.zzs.zzv().zzq());
        this.d.put(activity, zzihVar2);
        b(activity, zzihVar2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r2 > 100) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r4 > 100) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx(Bundle bundle, long j) {
        String strF;
        synchronized (this.j) {
            if (!this.i) {
                this.zzs.zzay().zzl().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle.getString("screen_name");
            if (string != null) {
                if (string.length() > 0) {
                    int length = string.length();
                    this.zzs.zzf();
                }
                this.zzs.zzay().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
            if (string2 != null) {
                if (string2.length() > 0) {
                    int length2 = string2.length();
                    this.zzs.zzf();
                }
                this.zzs.zzay().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                Activity activity = this.e;
                strF = activity != null ? f(activity.getClass(), "Activity") : "Activity";
            } else {
                strF = string2;
            }
            zzih zzihVar = this.b;
            if (this.f && zzihVar != null) {
                this.f = false;
                boolean zB = zzkz.B(zzihVar.zzb, strF);
                boolean zB2 = zzkz.B(zzihVar.zza, string);
                if (zB && zB2) {
                    this.zzs.zzay().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            this.zzs.zzay().zzj().zzc("Logging screen view with name, class", string == null ? "null" : string, strF == null ? "null" : strF);
            zzih zzihVar2 = this.b == null ? this.c : this.b;
            zzih zzihVar3 = new zzih(string, strF, this.zzs.zzv().zzq(), true, j);
            this.b = zzihVar3;
            this.c = zzihVar2;
            this.g = zzihVar3;
            this.zzs.zzaz().zzp(new c2(this, bundle, zzihVar3, zzihVar2, this.zzs.zzav().elapsedRealtime()));
        }
    }

    @WorkerThread
    public final void zzy(String str, zzih zzihVar) {
        zzg();
        synchronized (this) {
            String str2 = this.l;
            if (str2 == null || str2.equals(str) || zzihVar != null) {
                this.l = str;
                this.k = zzihVar;
            }
        }
    }
}
