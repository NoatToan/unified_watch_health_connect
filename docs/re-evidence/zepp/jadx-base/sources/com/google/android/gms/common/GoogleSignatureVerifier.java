package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleSignatureVerifier {

    @Nullable
    private static GoogleSignatureVerifier c;
    private final Context a;
    private volatile String b;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    @Nullable
    public static final h a(PackageInfo packageInfo, h... hVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        i iVar = new i(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < hVarArr.length; i++) {
            if (hVarArr[i].equals(iVar)) {
                return hVarArr[i];
            }
        }
        return null;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final o b(String str, boolean z, boolean z2) {
        o oVarC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return o.c("null pkg");
        }
        if (str.equals(this.b)) {
            return o.b();
        }
        if (l.e()) {
            oVarC = l.b(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.a);
                if (packageInfo == null) {
                    oVarC = o.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        oVarC = o.c("single cert required");
                    } else {
                        i iVar = new i(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        o oVarA = l.a(str2, iVar, zHonorsDebugCertificates, false);
                        oVarC = (!oVarA.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !l.a(str2, iVar, false, true).a) ? oVarA : o.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                return o.d(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e);
            }
        }
        if (oVarC.a) {
            this.b = str;
        }
        return oVarC;
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (c == null) {
                l.d(context);
                c = new GoogleSignatureVerifier(context);
            }
        }
        return c;
    }

    public static final boolean zzb(@NonNull PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? a(packageInfo, k.a) : a(packageInfo, k.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@NonNull String str) {
        o oVarB = b(str, false, false);
        oVarB.e();
        return oVarB.a;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        o oVarC;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            oVarC = o.c("no pkgs");
        } else {
            oVarC = null;
            for (String str : packagesForUid) {
                oVarC = b(str, false, false);
                if (!oVarC.a) {
                }
            }
            Preconditions.checkNotNull(oVarC);
        }
        oVarC.e();
        return oVarC.a;
    }
}
