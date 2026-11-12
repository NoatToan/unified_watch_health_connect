package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.internal.measurement.zzpt;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzec extends v {
    private String b;
    private String c;
    private int d;
    private String e;
    private String f;
    private long g;
    private final long h;
    private List<String> i;
    private int j;
    private String k;
    private String l;
    private String m;

    public zzec(zzfv zzfvVar, long j) {
        super(zzfvVar);
        this.h = j;
    }

    @WorkerThread
    public final int b() {
        zza();
        return this.j;
    }

    @WorkerThread
    public final int c() {
        zza();
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v34, types: [com.google.android.gms.measurement.internal.x0, com.google.android.gms.measurement.internal.zzkz] */
    /* JADX WARN: Type inference failed for: r9v35, types: [com.google.android.gms.measurement.internal.x0] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    @WorkerThread
    public final zzp d(String str) {
        String str2;
        long j;
        zzg();
        String strZzl = zzl();
        String strF = f();
        zza();
        String str3 = this.c;
        zza();
        long j2 = this.d;
        zza();
        Preconditions.checkNotNull(this.e);
        String str4 = this.e;
        this.zzs.zzf().zzh();
        zza();
        zzg();
        long j3 = this.g;
        long j4 = j3;
        if (j3 == 0) {
            ?? Zzv = this.zzs.zzv();
            Context contextZzau = this.zzs.zzau();
            String packageName = this.zzs.zzau().getPackageName();
            Zzv.zzg();
            Preconditions.checkNotNull(contextZzau);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzau.getPackageManager();
            MessageDigest messageDigestD = zzkz.d();
            long j5 = -1;
            j5 = -1;
            if (messageDigestD == null) {
                Zzv.zzs.zzay().zzd().zza("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (Zzv.w(contextZzau, packageName)) {
                            j5 = 0;
                            Zzv = Zzv;
                        } else {
                            Signature[] signatureArr = Wrappers.packageManager(contextZzau).getPackageInfo(Zzv.zzs.zzau().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                Zzv.zzs.zzay().zzk().zza("Could not get signatures");
                                Zzv = Zzv;
                            } else {
                                long jO = zzkz.O(messageDigestD.digest(signatureArr[0].toByteArray()));
                                j5 = jO;
                                Zzv = jO;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Zzv.zzs.zzay().zzd().zzb("Package name not found", e);
                        j = 0;
                    }
                }
                j = 0;
                this.g = j;
                j4 = j;
            }
            j = j5;
            this.g = j;
            j4 = j;
        }
        long j6 = j4;
        boolean zZzJ = this.zzs.zzJ();
        boolean z = !this.zzs.zzm().o;
        zzg();
        if (this.zzs.zzJ()) {
            zzpt.zzc();
            if (this.zzs.zzf().zzs(null, zzdy.zzae)) {
                this.zzs.zzay().zzj().zza("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = this.zzs.zzau().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzs.zzau());
                            if (objInvoke == null) {
                                str2 = null;
                            } else {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    this.zzs.zzay().zzl().zza("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.zzs.zzay().zzm().zza("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzfv zzfvVar = this.zzs;
        long jZza = zzfvVar.zzm().d.zza();
        long jMin = jZza == 0 ? zzfvVar.E : Math.min(zzfvVar.E, jZza);
        zza();
        int i = this.j;
        boolean zZzr = this.zzs.zzf().zzr();
        w wVarZzm = this.zzs.zzm();
        wVarZzm.zzg();
        boolean z2 = wVarZzm.b().getBoolean("deferred_analytics_collection", false);
        zza();
        String str5 = this.l;
        Boolean boolD = this.zzs.zzf().d("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolD == null ? null : Boolean.valueOf(!boolD.booleanValue());
        long j7 = this.h;
        List<String> list = this.i;
        zzom.zzc();
        return new zzp(strZzl, strF, str3, j2, str4, 46000L, j6, str, zZzJ, z, str2, 0L, jMin, i, zZzr, z2, str5, boolValueOf, j7, list, this.zzs.zzf().zzs(null, zzdy.zzac) ? zzm() : null, this.zzs.zzm().d().zzi());
    }

    @WorkerThread
    public final String e() {
        zza();
        return this.l;
    }

    @WorkerThread
    public final String f() {
        zznx.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzas)) {
            zzg();
        }
        zza();
        Preconditions.checkNotNull(this.k);
        return this.k;
    }

    @WorkerThread
    public final List<String> g() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:38:0x0111  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    /* JADX WARN: Code duplicated, block: B:42:0x0151  */
    /* JADX WARN: Code duplicated, block: B:45:0x016d  */
    /* JADX WARN: Code duplicated, block: B:49:0x018e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0190  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6 A[Catch: IllegalStateException -> 0x0231, TRY_ENTER, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c0 A[Catch: IllegalStateException -> 0x0231, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01df A[Catch: IllegalStateException -> 0x0231, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01e6 A[Catch: IllegalStateException -> 0x0231, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec A[Catch: IllegalStateException -> 0x0231, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0205  */
    /* JADX WARN: Code duplicated, block: B:71:0x0206 A[Catch: IllegalStateException -> 0x0231, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0212 A[Catch: IllegalStateException -> 0x0231, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0228 A[Catch: IllegalStateException -> 0x0231, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x022b A[Catch: IllegalStateException -> 0x0231, TryCatch #0 {IllegalStateException -> 0x0231, blocks: (B:47:0x0176, B:51:0x0191, B:54:0x01a6, B:58:0x01c4, B:61:0x01d1, B:63:0x01d9, B:74:0x0212, B:76:0x0228, B:78:0x022d, B:77:0x022b, B:65:0x01df, B:57:0x01c0, B:66:0x01e6, B:68:0x01ec, B:72:0x020a, B:71:0x0206), top: B:100:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x025b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0261  */
    /* JADX WARN: Code duplicated, block: B:88:0x0271  */
    /* JADX WARN: Code duplicated, block: B:91:0x027b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0290  */
    /* JADX WARN: Code duplicated, block: B:96:0x0294  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a1  */
    @Override // com.google.android.gms.measurement.internal.v
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    public final void zzd() {
        String str;
        String string;
        boolean z;
        int iZza;
        List<String> listF;
        Iterator<String> it2;
        String strZzc;
        String str2;
        Context contextZzau;
        String strZzz;
        String str3;
        Context contextZzau2;
        String strZzz2;
        Resources resources;
        String packageName = this.zzs.zzau().getPackageName();
        PackageManager packageManager = this.zzs.zzau().getPackageManager();
        String str4 = "Unknown";
        int i = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzs.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzel.zzn(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzs.zzau().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str4 = packageInfo.versionName;
                            i = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str4;
                            str4 = string;
                            this.zzs.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzel.zzn(packageName), str4);
                            string = str4;
                            str4 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.b = packageName;
                this.e = installerPackageName;
                this.c = str4;
                this.d = i;
                this.f = string;
                this.g = 0L;
                if (TextUtils.isEmpty(this.zzs.zzw()) && "am".equals(this.zzs.zzx())) {
                    z = true;
                } else {
                    z = false;
                }
                iZza = this.zzs.zza();
                switch (iZza) {
                    case 0:
                        this.zzs.zzay().zzj().zza("App measurement collection enabled");
                        break;
                    case 1:
                        this.zzs.zzay().zzi().zza("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        this.zzs.zzay().zzj().zza("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.zzs.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.zzs.zzay().zzi().zza("App measurement disabled via the manifest");
                        break;
                    case 5:
                        this.zzs.zzay().zzj().zza("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.zzs.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.zzs.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.zzs.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                        break;
                }
                this.k = "";
                this.l = "";
                this.m = "";
                this.zzs.zzaw();
                if (z) {
                    this.l = this.zzs.zzw();
                }
                strZzc = zzig.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
                if (true != TextUtils.isEmpty(strZzc)) {
                    str2 = strZzc;
                } else {
                    str2 = "";
                }
                this.k = str2;
                zzom.zzc();
                if (this.zzs.zzf().zzs(null, zzdy.zzac)) {
                    contextZzau2 = this.zzs.zzau();
                    strZzz2 = this.zzs.zzz();
                    Preconditions.checkNotNull(contextZzau2);
                    resources = contextZzau2.getResources();
                    if (!TextUtils.isEmpty(strZzz2)) {
                        strZzz2 = zzfn.zza(contextZzau2);
                    }
                    String strZzb = zzfn.zzb("ga_app_id", resources, strZzz2);
                    this.m = true != TextUtils.isEmpty(strZzb) ? strZzb : "";
                    if (TextUtils.isEmpty(strZzc) || !TextUtils.isEmpty(strZzb)) {
                        this.l = zzfn.zzb("admob_app_id", resources, strZzz2);
                    }
                } else if (!TextUtils.isEmpty(strZzc)) {
                    contextZzau = this.zzs.zzau();
                    strZzz = this.zzs.zzz();
                    Preconditions.checkNotNull(contextZzau);
                    Resources resources2 = contextZzau.getResources();
                    if (!TextUtils.isEmpty(strZzz)) {
                        strZzz = zzfn.zza(contextZzau);
                    }
                    this.l = zzfn.zzb("admob_app_id", resources2, strZzz);
                }
                if (iZza == 0) {
                    zzej zzejVarZzj = this.zzs.zzay().zzj();
                    String str5 = this.b;
                    if (TextUtils.isEmpty(this.k)) {
                        str3 = this.l;
                    } else {
                        str3 = this.k;
                    }
                    zzejVarZzj.zzc("App measurement enabled for app package, google app id", str5, str3);
                }
                this.i = null;
                this.zzs.zzaw();
                listF = this.zzs.zzf().f("analytics.safelisted_events");
                if (listF != null) {
                    this.i = listF;
                } else if (listF.size() == 0) {
                    this.zzs.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
                } else {
                    it2 = listF.iterator();
                    do {
                        if (it2.hasNext()) {
                            this.i = listF;
                        }
                    } while (this.zzs.zzv().r("safelisted event", it2.next()));
                }
                if (packageManager != null) {
                    this.j = InstantApps.isInstantApp(this.zzs.zzau()) ? 1 : 0;
                } else {
                    this.j = 0;
                }
            }
            this.zzs.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzel.zzn(packageName));
            strZzc = zzig.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
            if (true != TextUtils.isEmpty(strZzc)) {
                str2 = strZzc;
            } else {
                str2 = "";
            }
            this.k = str2;
            zzom.zzc();
            if (this.zzs.zzf().zzs(null, zzdy.zzac)) {
                contextZzau2 = this.zzs.zzau();
                strZzz2 = this.zzs.zzz();
                Preconditions.checkNotNull(contextZzau2);
                resources = contextZzau2.getResources();
                if (!TextUtils.isEmpty(strZzz2)) {
                    strZzz2 = zzfn.zza(contextZzau2);
                }
                String strZzb2 = zzfn.zzb("ga_app_id", resources, strZzz2);
                this.m = true != TextUtils.isEmpty(strZzb2) ? strZzb2 : "";
                if (TextUtils.isEmpty(strZzc)) {
                    this.l = zzfn.zzb("admob_app_id", resources, strZzz2);
                } else {
                    this.l = zzfn.zzb("admob_app_id", resources, strZzz2);
                }
            } else if (!TextUtils.isEmpty(strZzc)) {
                contextZzau = this.zzs.zzau();
                strZzz = this.zzs.zzz();
                Preconditions.checkNotNull(contextZzau);
                Resources resources3 = contextZzau.getResources();
                if (!TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfn.zza(contextZzau);
                }
                this.l = zzfn.zzb("admob_app_id", resources3, strZzz);
            }
            if (iZza == 0) {
                zzej zzejVarZzj2 = this.zzs.zzay().zzj();
                String str6 = this.b;
                if (TextUtils.isEmpty(this.k)) {
                    str3 = this.l;
                } else {
                    str3 = this.k;
                }
                zzejVarZzj2.zzc("App measurement enabled for app package, google app id", str6, str3);
            }
        } catch (IllegalStateException e) {
            this.zzs.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", zzel.zzn(packageName), e);
        }
        string = "Unknown";
        this.b = packageName;
        this.e = installerPackageName;
        this.c = str4;
        this.d = i;
        this.f = string;
        this.g = 0L;
        if (TextUtils.isEmpty(this.zzs.zzw())) {
            z = false;
        } else {
            z = false;
        }
        iZza = this.zzs.zza();
        switch (iZza) {
            case 0:
                this.zzs.zzay().zzj().zza("App measurement collection enabled");
                break;
            case 1:
                this.zzs.zzay().zzi().zza("App measurement deactivated via the manifest");
                break;
            case 2:
                this.zzs.zzay().zzj().zza("App measurement deactivated via the init parameters");
                break;
            case 3:
                this.zzs.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                this.zzs.zzay().zzi().zza("App measurement disabled via the manifest");
                break;
            case 5:
                this.zzs.zzay().zzj().zza("App measurement disabled via the init parameters");
                break;
            case 6:
                this.zzs.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                this.zzs.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                break;
            default:
                this.zzs.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                break;
        }
        this.k = "";
        this.l = "";
        this.m = "";
        this.zzs.zzaw();
        if (z) {
            this.l = this.zzs.zzw();
        }
        this.i = null;
        this.zzs.zzaw();
        listF = this.zzs.zzf().f("analytics.safelisted_events");
        if (listF != null) {
            this.i = listF;
        } else if (listF.size() == 0) {
            this.zzs.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
        } else {
            it2 = listF.iterator();
            do {
                if (it2.hasNext()) {
                    this.i = listF;
                }
            } while (this.zzs.zzv().r("safelisted event", it2.next()));
        }
        if (packageManager != null) {
            this.j = InstantApps.isInstantApp(this.zzs.zzau()) ? 1 : 0;
        } else {
            this.j = 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v
    public final boolean zzf() {
        return true;
    }

    @WorkerThread
    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.b);
        return this.b;
    }

    @WorkerThread
    public final String zzm() {
        zza();
        Preconditions.checkNotNull(this.m);
        return this.m;
    }
}
