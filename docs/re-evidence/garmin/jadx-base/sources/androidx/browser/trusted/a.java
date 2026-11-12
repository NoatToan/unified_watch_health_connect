package androidx.browser.trusted;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import j20.x;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public final ArrayList a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        byte[] bArrDigest;
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        ArrayList arrayList = new ArrayList();
        SigningInfo signingInfo = packageInfo.signingInfo;
        byte[] bArrDigest2 = null;
        if (!signingInfo.hasMultipleSigners()) {
            try {
                bArrDigest2 = MessageDigest.getInstance("SHA256").digest(signingInfo.getSigningCertificateHistory()[0].toByteArray());
            } catch (NoSuchAlgorithmException unused) {
            }
            arrayList.add(bArrDigest2);
            return arrayList;
        }
        for (Signature signature : signingInfo.getApkContentsSigners()) {
            try {
                bArrDigest = MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
            } catch (NoSuchAlgorithmException unused2) {
                bArrDigest = null;
            }
            arrayList.add(bArrDigest);
        }
        return arrayList;
    }

    public final boolean b(String str, PackageManager packageManager, d dVar) throws PackageManager.NameNotFoundException {
        dVar.c();
        String str2 = dVar.f5319b;
        if (str2 == null) {
            x.h();
            return false;
        }
        if (!str2.equals(str)) {
            return false;
        }
        ArrayList arrayListA = a(packageManager, str);
        if (arrayListA.size() != 1) {
            return dVar.equals(d.a(str, arrayListA));
        }
        dVar.c();
        ArrayList arrayList = dVar.f5320c;
        if (arrayList != null) {
            return packageManager.hasSigningCertificate(str, Arrays.copyOf((byte[]) arrayList.get(0), ((byte[]) dVar.f5320c.get(0)).length), 1);
        }
        x.h();
        return false;
    }
}
