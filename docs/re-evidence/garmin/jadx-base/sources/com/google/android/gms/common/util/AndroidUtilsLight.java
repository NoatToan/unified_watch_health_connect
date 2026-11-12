package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@KeepForSdk
public class AndroidUtilsLight {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = -1;
    private static volatile zza zzc;
    private static final Object zzd = new Object();

    @KeepForSdk
    @Deprecated
    public static byte[] getPackageCertificateHashBytes(Context context, String str) {
        MessageDigest messageDigestZza;
        PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestZza = zza("SHA1")) == null) {
            return null;
        }
        return messageDigestZza.digest(packageInfo.signatures[0].toByteArray());
    }

    public static MessageDigest zza(String str) {
        for (int i14 = 0; i14 < 2; i14++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
