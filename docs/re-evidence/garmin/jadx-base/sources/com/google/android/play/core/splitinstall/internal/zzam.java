package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzam {
    private final com.google.android.play.core.splitcompat.zze zza;
    private final zzah zzb;
    private final Context zzc;
    private final zzal zzd;
    private PackageInfo zze;

    public zzam(Context context, com.google.android.play.core.splitcompat.zze zzeVar, zzah zzahVar) {
        zzal zzalVar = new zzal(new com.google.android.play.core.splitcompat.zza(zzeVar));
        this.zza = zzeVar;
        this.zzb = zzahVar;
        this.zzc = context;
        this.zzd = zzalVar;
    }

    private final PackageInfo zzd() {
        if (this.zze == null) {
            try {
                this.zze = this.zzc.getPackageManager().getPackageInfo(this.zzc.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.zze;
    }

    private static X509Certificate zze(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    public final boolean zza(File[] fileArr) {
        long longVersionCode = zzd().getLongVersionCode();
        AssetManager assetManager = (AssetManager) zzbk.zzc(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.zzd.zzb(assetManager, fileArr[length]);
        } while (longVersionCode == this.zzd.zza());
        return false;
    }

    public final boolean zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.zza.zzg(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzc(File[] fileArr) {
        PackageInfo packageInfoZzd = zzd();
        ArrayList<X509Certificate> arrayList = null;
        if (packageInfoZzd != null && packageInfoZzd.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : packageInfoZzd.signatures) {
                X509Certificate x509CertificateZze = zze(signature);
                if (x509CertificateZze != null) {
                    arrayList.add(x509CertificateZze);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                X509Certificate[][] x509CertificateArrZza = zzi.zza(fileArr[length].getAbsolutePath());
                if (x509CertificateArrZza == null || x509CertificateArrZza.length == 0 || x509CertificateArrZza[0].length == 0 || arrayList.isEmpty()) {
                    break;
                    break;
                    break;
                    break;
                }
                for (X509Certificate x509Certificate : arrayList) {
                    for (X509Certificate[] x509CertificateArr : x509CertificateArrZza) {
                        if (!x509CertificateArr[0].equals(x509Certificate)) {
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
