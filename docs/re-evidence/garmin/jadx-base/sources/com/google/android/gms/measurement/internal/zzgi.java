package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrn;
import com.google.maps.android.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzgi(zzic zzicVar, long j8, long j14) {
        super(zzicVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j8;
        this.zzh = j14;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:46:0x0145  */
    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
    /* JADX WARN: Code duplicated, block: B:51:0x017f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0180  */
    /* JADX WARN: Code duplicated, block: B:55:0x0185 A[Catch: IllegalStateException -> 0x0197, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0197, blocks: (B:49:0x016b, B:53:0x0181, B:55:0x0185), top: B:81:0x016b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01de  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f1 A[EDGE_INSN: B:71:0x01f1->B:72:0x01f3 BREAK  A[LOOP:0: B:66:0x01d8->B:87:?]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0200  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1 A[SYNTHETIC] */
    @Override // com.google.android.gms.measurement.internal.zzg
    public final void zzf() {
        String str;
        String string;
        int iZzC;
        zzic zzicVar;
        zzic zzicVar2;
        List listZzs;
        Iterator it;
        String strZza;
        zzic zzicVar3;
        zzic zzicVar4 = this.zzu;
        zzicVar4.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzicVar4.zzaY().getPackageName();
        PackageManager packageManager = zzicVar4.zzaY().getPackageManager();
        String str2 = "";
        int i14 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String installerPackageName = PrivacyUpdateRequestError.UNKNOWN;
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", zzgu.zzl(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzu.zzaY().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i14 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str3;
                this.zzc = i14;
                this.zze = string;
                this.zzf = 0L;
                zzic zzicVar5 = this.zzu;
                iZzC = zzicVar5.zzC();
                if (iZzC != 0) {
                    this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                } else if (iZzC != 1) {
                    this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                } else if (iZzC != 3) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iZzC != 4) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                } else if (iZzC != 6) {
                    this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iZzC != 7) {
                    zzicVar3 = this.zzu;
                    if (iZzC != 8) {
                        zzicVar3.zzaV().zzi().zza("App measurement disabled");
                        zzicVar3.zzaV().zzc().zza("Invalid scion state in identity");
                    } else {
                        zzicVar3.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                    }
                } else {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                }
                this.zzl = "";
                zzicVar = this.zzu;
                zzicVar.zzaU();
                strZza = zzlt.zza(zzicVar.zzaY(), "google_app_id", zzicVar5.zzq());
                if (TextUtils.isEmpty(strZza)) {
                    str2 = strZza;
                }
                this.zzl = str2;
                if (iZzC == 0) {
                    zzicVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                }
                this.zzi = null;
                zzicVar2 = this.zzu;
                zzicVar2.zzaU();
                listZzs = zzicVar2.zzc().zzs("analytics.safelisted_events");
                if (listZzs != null) {
                    this.zzi = listZzs;
                    break;
                } else if (listZzs.isEmpty()) {
                    it = listZzs.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzi = listZzs;
                            break;
                        }
                    } while (zzicVar2.zzk().zzk("safelisted event", (String) it.next()));
                } else {
                    zzicVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.zzk = InstantApps.isInstantApp(zzicVar2.zzaY()) ? 1 : 0;
                } else {
                    this.zzk = 0;
                }
            }
            zzicVar4.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgu.zzl(packageName));
            strZza = zzlt.zza(zzicVar.zzaY(), "google_app_id", zzicVar5.zzq());
            if (TextUtils.isEmpty(strZza)) {
                str2 = strZza;
            }
            this.zzl = str2;
            if (iZzC == 0) {
                zzicVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
            }
        } catch (IllegalStateException e4) {
            this.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", zzgu.zzl(packageName), e4);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i14;
        this.zze = string;
        this.zzf = 0L;
        zzic zzicVar6 = this.zzu;
        iZzC = zzicVar6.zzC();
        if (iZzC != 0) {
            this.zzu.zzaV().zzk().zza("App measurement collection enabled");
        } else if (iZzC != 1) {
            this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
        } else if (iZzC != 3) {
            this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iZzC != 4) {
            this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
        } else if (iZzC != 6) {
            this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iZzC != 7) {
            zzicVar3 = this.zzu;
            if (iZzC != 8) {
                zzicVar3.zzaV().zzi().zza("App measurement disabled");
                zzicVar3.zzaV().zzc().zza("Invalid scion state in identity");
            } else {
                zzicVar3.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
            }
        } else {
            this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
        }
        this.zzl = "";
        zzicVar = this.zzu;
        zzicVar.zzaU();
        this.zzi = null;
        zzicVar2 = this.zzu;
        zzicVar2.zzaU();
        listZzs = zzicVar2.zzc().zzs("analytics.safelisted_events");
        if (listZzs != null) {
            this.zzi = listZzs;
            break;
        } else if (listZzs.isEmpty()) {
            it = listZzs.iterator();
            do {
                if (it.hasNext()) {
                    this.zzi = listZzs;
                    break;
                }
            } while (zzicVar2.zzk().zzk("safelisted event", (String) it.next()));
        } else {
            zzicVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.zzk = InstantApps.isInstantApp(zzicVar2.zzaY()) ? 1 : 0;
        } else {
            this.zzk = 0;
        }
    }

    public final zzr zzh(String str) {
        long jZzV;
        String str2;
        String str3;
        boolean z14;
        int i14;
        int i15;
        long j8;
        zzg();
        String strZzj = zzj();
        String strZzk = zzk();
        zzb();
        String str4 = this.zzb;
        zzb();
        long j14 = this.zzc;
        zzb();
        Preconditions.checkNotNull(this.zzd);
        String str5 = this.zzd;
        zzic zzicVar = this.zzu;
        zzicVar.zzc().zzi();
        zzb();
        zzg();
        long j15 = this.zzf;
        if (j15 == 0) {
            zzpp zzppVarZzk = this.zzu.zzk();
            Context contextZzaY = zzicVar.zzaY();
            String packageName = zzicVar.zzaY().getPackageName();
            zzppVarZzk.zzg();
            Preconditions.checkNotNull(contextZzaY);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzaY.getPackageManager();
            MessageDigest messageDigestZzO = zzpp.zzO();
            long jZzP = -1;
            if (messageDigestZzO == null) {
                a.j(zzppVarZzk.zzu, "Could not get MD5 instance");
                jZzV = 0;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzppVarZzk.zzad(contextZzaY, packageName)) {
                            jZzV = 0;
                            jZzP = 0;
                        } else {
                            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(contextZzaY);
                            zzic zzicVar2 = zzppVarZzk.zzu;
                            jZzV = 0;
                            try {
                                Signature[] signatureArr = packageManagerWrapperPackageManager.getPackageInfo(zzicVar2.zzaY().getPackageName(), 64).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    zzicVar2.zzaV().zze().zza("Could not get signatures");
                                } else {
                                    jZzP = zzpp.zzP(messageDigestZzO.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e4) {
                                e = e4;
                                zzppVarZzk.zzu.zzaV().zzb().zzb("Package name not found", e);
                                j15 = jZzV;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e14) {
                        e = e14;
                        jZzV = 0;
                    }
                } else {
                    jZzV = 0;
                }
                j15 = jZzV;
                this.zzf = j15;
            }
            j15 = jZzP;
            this.zzf = j15;
        } else {
            jZzV = 0;
        }
        long j16 = j15;
        zzic zzicVar3 = this.zzu;
        boolean zZzB = zzicVar3.zzB();
        boolean z15 = !zzicVar3.zzd().zzm;
        zzg();
        if (zzicVar3.zzB()) {
            zzrn.zza();
            if (zzicVar3.zzc().zzp(null, zzfy.zzaH)) {
                this.zzu.zzaV().zzk().zza("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = zzicVar3.zzaY().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzu.zzaY());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.zzu.zzaV().zzh().zza("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.zzu.zzaV().zzf().zza("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzic zzicVar4 = this.zzu;
        long jZza = zzicVar4.zzd().zzc.zza();
        long jMin = zzicVar4.zza;
        if (jZza != jZzV) {
            jMin = Math.min(jMin, jZza);
        }
        zzb();
        int i16 = this.zzk;
        zzic zzicVar5 = this.zzu;
        boolean zZzu = zzicVar5.zzc().zzu();
        zzhh zzhhVarZzd = zzicVar5.zzd();
        zzhhVarZzd.zzg();
        String str6 = str2;
        long j17 = jMin;
        boolean z16 = zzhhVarZzd.zzd().getBoolean("deferred_analytics_collection", false);
        boolean z17 = zzicVar5.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED;
        long j18 = this.zzg;
        Boolean boolValueOf = Boolean.valueOf(z17);
        List list = this.zzi;
        String strZzl = zzicVar5.zzd().zzl().zzl();
        if (this.zzj == null) {
            this.zzj = zzicVar5.zzk().zzaw();
        }
        String str7 = this.zzj;
        if (zzicVar5.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            zzg();
            if (this.zzn != jZzV) {
                long jCurrentTimeMillis = zzicVar5.zzaZ().currentTimeMillis() - this.zzn;
                if (this.zzm != null && jCurrentTimeMillis > 86400000 && this.zzo == null) {
                    zzi();
                }
            }
            if (this.zzm == null) {
                zzi();
            }
            str3 = this.zzm;
        } else {
            str3 = null;
        }
        boolean zZzx = zzicVar5.zzc().zzx();
        zzpp zzppVarZzk2 = zzicVar5.zzk();
        String strZzj2 = zzj();
        String str8 = str3;
        zzic zzicVar6 = zzppVarZzk2.zzu;
        if (zzicVar6.zzaY().getPackageManager() == null) {
            z14 = zZzx;
            j8 = jZzV;
        } else {
            try {
                z14 = zZzx;
                i14 = 0;
                try {
                    ApplicationInfo applicationInfo = Wrappers.packageManager(zzicVar6.zzaY()).getApplicationInfo(strZzj2, 0);
                    i15 = applicationInfo != null ? applicationInfo.targetSdkVersion : i14;
                } catch (PackageManager.NameNotFoundException unused4) {
                    zzic zzicVar7 = zzppVarZzk2.zzu;
                    zzicVar7.zzaU();
                    zzicVar7.zzaV().zzi().zzb("PackageManager failed to find running app: app_id", strZzj2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                z14 = zZzx;
                i14 = 0;
            }
            j8 = i15;
        }
        zzic zzicVar8 = this.zzu;
        int iZzb = zzicVar8.zzd().zzl().zzb();
        String strZze = zzicVar8.zzd().zzj().zze();
        zzqp.zza();
        zzal zzalVarZzc = zzicVar8.zzc();
        long j19 = j8;
        zzfx zzfxVar = zzfy.zzaQ;
        int iZzU = zzalVarZzc.zzp(null, zzfxVar) ? zzicVar8.zzk().zzU() : 0;
        zzqp.zza();
        int i17 = iZzU;
        if (zzicVar8.zzc().zzp(null, zzfxVar)) {
            jZzV = zzicVar8.zzk().zzV();
        }
        String strZzz = zzicVar8.zzc().zzz();
        String strZzb = new zze(zzicVar8.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb();
        zzic zzicVar9 = this.zzu;
        return new zzr(strZzj, strZzk, str4, j14, str5, 133005L, j16, str, zZzB, z15, str6, j17, i16, zZzu, z16, boolValueOf, j18, list, strZzl, str7, str8, z14, j19, iZzb, strZze, i17, jZzV, strZzz, strZzb, zzicVar9.zza, zzicVar9.zzx().zzj().zza());
    }

    public final void zzi() {
        String str;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzicVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzicVar.zzaV().zzj().zza("Resetting session stitching token to ".concat(str == null ? BuildConfig.TRAVIS : "not null"));
        this.zzm = str;
        this.zzn = zzicVar.zzaZ().currentTimeMillis();
    }

    public final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    public final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    public final int zzm() {
        zzb();
        return this.zzc;
    }

    public final long zzn() {
        return this.zzh;
    }

    public final int zzo() {
        zzb();
        return this.zzk;
    }

    public final List zzp() {
        return this.zzi;
    }

    public final boolean zzq(String str) {
        String str2 = this.zzo;
        boolean z14 = false;
        if (str2 != null && !str2.equals(str)) {
            z14 = true;
        }
        this.zzo = str;
        return z14;
    }
}
