package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.airbnb.lottie.animation.keyframe.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import i3.e5;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes14.dex */
final class zzo {
    static volatile com.google.android.gms.common.internal.zzad zzg;
    public static final /* synthetic */ int zzh = 0;
    private static Context zzj;
    static final zzm zza = new zzd(zzj.zzf("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final zzm zzb = new zze(zzj.zzf("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final zzm zzc = new zzf(zzj.zzf("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final zzm zzd = new zzg(zzj.zzf("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final zzm zze = new zzh(zzj.zzf("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final zzm zzf = new zzi(zzj.zzf("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object zzi = new Object();

    public static synchronized void zza(Context context) {
        if (zzj == null) {
            if (context != null) {
                zzj = context.getApplicationContext();
            }
        }
    }

    public static void zzb() {
        if (zzg != null) {
            return;
        }
        Preconditions.checkNotNull(zzj);
        synchronized (zzi) {
            try {
                if (zzg == null) {
                    zzg = com.google.android.gms.common.internal.zzac.zzb(DynamiteModule.load(zzj, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static zzy zzc(zzw zzwVar) {
        zzy zzyVarZzd;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzj);
            try {
                zzb();
                Preconditions.checkNotNull(zzj);
                zzp zzpVarZzb = zzwVar.zzb(zzj);
                try {
                    zzr zzrVarZzf = zzwVar.zza() ? zzg.zzf(zzpVarZzb) : zzg.zzh(zzpVarZzb);
                    if (zzrVarZzf.zza()) {
                        zzyVarZzd = zzy.zzf(zzrVarZzf.zze(), zzrVarZzf.zzc());
                    } else {
                        String strZzb = zzrVarZzf.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = zzrVarZzf.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZzb == null) {
                            strZzb = "error checking package certificate";
                        }
                        zzyVarZzd = zzy.zzg(zzrVarZzf.zze(), zzrVarZzf.zzd(), strZzb, nameNotFoundException);
                    }
                } catch (RemoteException e4) {
                    zzyVarZzd = zzy.zzd("module call", e4);
                }
            } catch (DynamiteModule.LoadingException e14) {
                zzyVarZzd = zzy.zzd("module init: ".concat(String.valueOf(e14.getMessage())), e14);
            }
            return zzyVarZzd;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static zzy zzd(String str, zzj zzjVar, boolean z14, boolean z15) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzf(str, zzjVar, z14, z15);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static /* synthetic */ String zze(boolean z14, String str, zzj zzjVar) {
        String str2 = (z14 || !zzf(str, zzjVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestZza = AndroidUtilsLight.zza(MessageDigestAlgorithms.SHA_256);
        Preconditions.checkNotNull(messageDigestZza);
        return a.i(e5.l(str2, ": pkg=", str, ", sha256=", Hex.bytesToStringLowercase(messageDigestZza.digest(zzjVar.zzc()))), ", atk=", z14, ", ver=12451000.false");
    }

    @Deprecated
    private static zzy zzf(final String str, final zzj zzjVar, final boolean z14, boolean z15) {
        try {
            zzb();
            Preconditions.checkNotNull(zzj);
            try {
                return zzg.zze(new zzt(str, zzjVar, z14, z15), ObjectWrapper.wrap(zzj.getPackageManager())) ? zzy.zzb() : new zzx(new Callable() { // from class: com.google.android.gms.common.zzl
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzo.zze(z14, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e4) {
                return zzy.zzd("module call", e4);
            }
        } catch (DynamiteModule.LoadingException e14) {
            return zzy.zzd("module init: ".concat(String.valueOf(e14.getMessage())), e14);
        }
    }
}
