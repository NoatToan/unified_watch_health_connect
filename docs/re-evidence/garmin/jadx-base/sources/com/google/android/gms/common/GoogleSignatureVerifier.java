package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzal;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzd;
    private static volatile Set zze;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(Context context) {
        this.zzb = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzo.zza(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final boolean zza(PackageInfo packageInfo, boolean z14) {
        zzah zzahVarZzj;
        if (packageInfo == null) {
            return false;
        }
        if (z14 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z14 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            zzah zzahVar = z14 ? zzn.zzc : zzn.zzb;
            com.google.android.gms.internal.common.zzr.zza(true);
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                zzahVarZzj = zzah.zzj();
            } else {
                int i14 = zzah.zzd;
                com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad();
                for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                    zzadVar.zzb(signature.toByteArray());
                }
                zzahVarZzj = zzadVar.zzd();
            }
            if (zzahVarZzj.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            zzah zzahVarZzh = zzahVarZzj.zzh();
            int size = zzahVarZzh.size();
            int i15 = 0;
            while (i15 < size) {
                byte[] bArr = (byte[]) zzahVarZzh.get(i15);
                zzal zzalVarListIterator = zzahVar.listIterator(0);
                do {
                    int i16 = i15 + 1;
                    if (!zzalVarListIterator.hasNext()) {
                        i15 = i16;
                    }
                } while (!Arrays.equals(bArr, (byte[]) zzalVarListIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return (z14 ? zzc(packageInfo, zzn.zza) : zzc(packageInfo, zzn.zza[0])) != null;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzy zzb(String str, boolean z14, boolean z15) {
        zzy zzyVarZzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzy.zzc("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzy.zzb();
        }
        int i14 = zzo.zzh;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzo.zzb();
            boolean zZzg = zzo.zzg.zzg();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            if (zZzg) {
                zzv zzvVar = new zzv(null);
                zzvVar.zza(str);
                zzvVar.zzb(GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb));
                zzvVar.zzc(true);
                zzyVarZzc = zzo.zzc(zzvVar.zzd());
            } else {
                try {
                    PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, 134217792);
                    boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                    if (packageInfo == null) {
                        zzyVarZzc = zzy.zzc("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr == null || signatureArr.length != 1) {
                            zzyVarZzc = zzy.zzc("single cert required");
                        } else {
                            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            zzy zzyVarZzd = zzo.zzd(str2, zzkVar, zHonorsDebugCertificates, false);
                            zzyVarZzc = (!zzyVarZzd.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzo.zzd(str2, zzkVar, false, true).zza) ? zzyVarZzd : zzy.zzc("debuggable release cert app rejected");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    return zzy.zzd("no pkg ".concat(str), e4);
                }
            }
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
        if (zzyVarZzc.zza) {
            this.zzc = str;
        }
        return zzyVarZzc;
    }

    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i14 = 0; i14 < zzjVarArr.length; i14++) {
            if (zzjVarArr[i14].equals(zzkVar)) {
                return zzjVarArr[i14];
            }
        }
        return null;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        return zza(packageInfo, true) && GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        zzy zzyVarZzb = zzb(str, false, false);
        zzyVarZzb.zze();
        return zzyVarZzb.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i14) {
        zzy zzyVarZzc;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i14);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            zzyVarZzc = zzy.zzc("no pkgs");
        } else {
            zzyVarZzc = null;
            for (String str : packagesForUid) {
                zzyVarZzc = zzb(str, false, false);
                if (!zzyVarZzc.zza) {
                }
            }
            Preconditions.checkNotNull(zzyVarZzc);
        }
        zzyVarZzc.zze();
        return zzyVarZzc.zza;
    }
}
