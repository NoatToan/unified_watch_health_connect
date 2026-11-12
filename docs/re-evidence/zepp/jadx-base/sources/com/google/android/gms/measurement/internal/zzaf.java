package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf extends x0 {
    private Boolean a;
    private b b;
    private Boolean c;

    public zzaf(zzfv zzfvVar) {
        super(zzfvVar);
        this.b = new b() { // from class: com.google.android.gms.measurement.internal.zzad
            @Override // com.google.android.gms.measurement.internal.b
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    private final String a(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.zzs.zzay().zzd().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.zzs.zzay().zzd().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public static final long zzA() {
        return zzdy.zzC.zza(null).longValue();
    }

    public static final long zzz() {
        return zzdy.zzc.zza(null).longValue();
    }

    public final int b(@Size(min = 1) String str) {
        return zzf(str, zzdy.zzG, 500, 2000);
    }

    @VisibleForTesting
    public final Bundle c() {
        try {
            if (this.zzs.zzau().getPackageManager() == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzau()).getApplicationInfo(this.zzs.zzau().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzs.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.zzs.zzay().zzd().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean d(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleC = c();
        if (bundleC == null) {
            this.zzs.zzay().zzd().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleC.containsKey(str)) {
            return Boolean.valueOf(bundleC.getBoolean(str));
        }
        return null;
    }

    public final String e() {
        this.zzs.zzaw();
        return "FA";
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: NotFoundException -> 0x0048, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0048, blocks: (B:11:0x002e, B:14:0x0043), top: B:19:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    public final List<String> f(@Size(min = 1) String str) {
        Integer numValueOf;
        String[] stringArray;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleC = c();
        if (bundleC != null) {
            if (bundleC.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleC.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.zzs.zzau().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e) {
                    this.zzs.zzay().zzd().zzb("Failed to load string array from metadata: resource not found", e);
                }
            }
            return null;
        }
        this.zzs.zzay().zzd().zza("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.zzs.zzau().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final void g(b bVar) {
        this.b = bVar;
    }

    @WorkerThread
    public final boolean h() {
        if (this.a == null) {
            Boolean boolD = d("app_measurement_lite");
            this.a = boolD;
            if (boolD == null) {
                this.a = Boolean.FALSE;
            }
        }
        return this.a.booleanValue() || !this.zzs.zzN();
    }

    @WorkerThread
    public final double zza(String str, zzdx<Double> zzdxVar) {
        if (str == null) {
            return zzdxVar.zza(null).doubleValue();
        }
        String strZza = this.b.zza(str, zzdxVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return zzdxVar.zza(null).doubleValue();
        }
        try {
            return zzdxVar.zza(Double.valueOf(Double.parseDouble(strZza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzdxVar.zza(null).doubleValue();
        }
    }

    public final int zzc() {
        zzkz zzkzVarZzv = this.zzs.zzv();
        Boolean boolL = zzkzVarZzv.zzs.zzt().l();
        if (zzkzVarZzv.zzm() < 201500) {
            return (boolL == null || boolL.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzf(str, zzdy.zzH, 25, 100);
    }

    @WorkerThread
    public final int zze(String str, zzdx<Integer> zzdxVar) {
        if (str == null) {
            return zzdxVar.zza(null).intValue();
        }
        String strZza = this.b.zza(str, zzdxVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return zzdxVar.zza(null).intValue();
        }
        try {
            return zzdxVar.zza(Integer.valueOf(Integer.parseInt(strZza))).intValue();
        } catch (NumberFormatException unused) {
            return zzdxVar.zza(null).intValue();
        }
    }

    @WorkerThread
    public final int zzf(String str, zzdx<Integer> zzdxVar, int i, int i2) {
        return Math.max(Math.min(zze(str, zzdxVar), i2), i);
    }

    public final long zzh() {
        this.zzs.zzaw();
        return 46000L;
    }

    @WorkerThread
    public final long zzi(String str, zzdx<Long> zzdxVar) {
        if (str == null) {
            return zzdxVar.zza(null).longValue();
        }
        String strZza = this.b.zza(str, zzdxVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return zzdxVar.zza(null).longValue();
        }
        try {
            return zzdxVar.zza(Long.valueOf(Long.parseLong(strZza))).longValue();
        } catch (NumberFormatException unused) {
            return zzdxVar.zza(null).longValue();
        }
    }

    public final String zzl() {
        return a("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return a("debug.deferred.deeplink", "");
    }

    @WorkerThread
    public final String zzo(String str, zzdx<String> zzdxVar) {
        return str == null ? zzdxVar.zza(null) : zzdxVar.zza(this.b.zza(str, zzdxVar.zzb()));
    }

    public final boolean zzr() {
        Boolean boolD = d("google_analytics_adid_collection_enabled");
        return boolD == null || boolD.booleanValue();
    }

    @WorkerThread
    public final boolean zzs(String str, zzdx<Boolean> zzdxVar) {
        if (str == null) {
            return zzdxVar.zza(null).booleanValue();
        }
        String strZza = this.b.zza(str, zzdxVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return zzdxVar.zza(null).booleanValue();
        }
        return zzdxVar.zza(Boolean.valueOf(this.zzs.zzf().zzs(null, zzdy.zzaB) ? "1".equals(strZza) : Boolean.parseBoolean(strZza))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.b.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolD = d("google_analytics_automatic_screen_reporting_enabled");
        return boolD == null || boolD.booleanValue();
    }

    public final boolean zzv() {
        this.zzs.zzaw();
        Boolean boolD = d("firebase_analytics_collection_deactivated");
        return boolD != null && boolD.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.b.zza(str, "measurement.event_sampling_enabled"));
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    ApplicationInfo applicationInfo = this.zzs.zzau().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.c = Boolean.valueOf(z);
                    }
                    if (this.c == null) {
                        this.c = Boolean.TRUE;
                        this.zzs.zzay().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.c.booleanValue();
    }
}
