package com.huawei.hwauthutil;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lln;
import defpackage.llr;
import defpackage.llt;
import defpackage.llu;
import health.compact.a.IoUtils;
import health.compact.a.Sha256;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes.dex */
public final class HsfSignValidator {
    private HsfSignValidator() {
    }

    public static boolean b(String str) {
        llr.e(str, "packageName must not be empty.");
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("HsfSignValidator", "kitVerify", "kitSign is null");
            return false;
        }
        String strA2 = a(BaseApplication.b(), str);
        if (TextUtils.isEmpty(strA2)) {
            LogUtil.j("HsfSignValidator", "kitVerify", "fingerprint is null");
            return false;
        }
        PublicKey publicKeyB = b();
        if (publicKeyB == null) {
            LogUtil.j("HsfSignValidator", "kitVerify", "hsfPublicKey is null");
            return false;
        }
        try {
            Signature signature = Signature.getInstance("NONEwithRSA");
            signature.initVerify(publicKeyB);
            signature.update(str.getBytes(Charset.defaultCharset()));
            signature.update(strA2.getBytes(Charset.defaultCharset()));
            return signature.verify(Base64.decode(strA, 0));
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            LogUtil.e("HsfSignValidator", "kitVerify", "Failed to verify application Kit-signature. ", e.getMessage());
            LogUtil.j("HsfSignValidator", "kitVerify", "Failed to verify application Kit-signature.");
            return false;
        }
    }

    private static String a(String str) {
        try {
            ApplicationInfo applicationInfo = BaseApplication.b().getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return null;
            }
            LogUtil.a("HsfSignValidator", "getKitPackageSignature", "appInfo className ", applicationInfo.className, " processName ", applicationInfo.processName, " appInfo.metaData ", applicationInfo.metaData, " packageHsfSignature ", applicationInfo.metaData.getString("com.huawei.hihealthkit.signature"));
            return applicationInfo.metaData.getString("com.huawei.hihealthkit.signature");
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e("HsfSignValidator", "getKitPackageSignature", "Failed to get the application HSF signature. ", e.getMessage());
            return null;
        }
    }

    public static boolean c(String str) {
        PublicKey publicKeyB;
        llr.e(str, "packageName must not be empty.");
        String strE = e(str);
        if (TextUtils.isEmpty(strE) || lln.e(strE)) {
            return false;
        }
        String strA = a(BaseApplication.b(), str);
        if (TextUtils.isEmpty(strA) || (publicKeyB = b()) == null) {
            return false;
        }
        try {
            Signature signature = Signature.getInstance("NONEwithRSA");
            signature.initVerify(publicKeyB);
            signature.update(str.getBytes(Charset.defaultCharset()));
            signature.update(strA.getBytes(Charset.defaultCharset()));
            return signature.verify(Base64.decode(strE, 0));
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            LogUtil.e("HsfSignValidator", "verify", "Failed to verify application HSF-signature. ", e.getMessage());
            LogUtil.j("HsfSignValidator", "verify", "Failed to verify application HSF-signature.");
            return false;
        }
    }

    private static PublicKey b() {
        return new llt().b("publickey.txt");
    }

    private static String e(String str) {
        try {
            ApplicationInfo applicationInfo = BaseApplication.b().getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return null;
            }
            LogUtil.a("HsfSignValidator", "getPackageHsfSignature", "appInfo className ", applicationInfo.className, " processName ", applicationInfo.processName, " appInfo.metaData ", applicationInfo.metaData, " packageHsfSignature ", applicationInfo.metaData.getString("health-signature"));
            return applicationInfo.metaData.getString("health-signature");
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e("HsfSignValidator", "getPackageHsfSignature", "Failed to get the application HSF signature. ", e.getMessage());
            return null;
        }
    }

    public static String a(Context context, String str) {
        Certificate certificateD = d(str);
        if (certificateD == null) {
            return null;
        }
        try {
            LogUtil.d("HsfSignValidator", "getPackageFingerprint", "cert.getEncoded() ", llu.a(Sha256.c(certificateD.getEncoded()), true));
            return llu.a(Sha256.c(certificateD.getEncoded()), true);
        } catch (CertificateEncodingException unused) {
            LogUtil.e("HsfSignValidator", "getPackageFingerprint", "Failed to get application signature certificate fingerprint.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    private static Certificate d(String str) throws Throwable {
        Exception e;
        InputStream inputStreamE;
        Certificate certificateGenerateCertificate;
        ?? r5 = 0;
        InputStream inputStream = null;
        Certificate certificate = null;
        try {
            try {
                PackageInfo packageInfo = BaseApplication.b().getPackageManager().getPackageInfo(str, 64);
                if (packageInfo == null || packageInfo.signatures.length <= 0) {
                    certificateGenerateCertificate = null;
                } else {
                    inputStreamE = IoUtils.e(packageInfo.signatures[0].toByteArray());
                    try {
                        certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(inputStreamE);
                        inputStream = inputStreamE;
                    } catch (PackageManager.NameNotFoundException e2) {
                        e = e2;
                        LogUtil.e("HsfSignValidator", "getPackageCertificate", "Failed to get application signature certificate. ", e.getMessage());
                        IoUtils.c(inputStreamE);
                    } catch (CertificateException e3) {
                        e = e3;
                        LogUtil.e("HsfSignValidator", "getPackageCertificate", "Failed to get application signature certificate. ", e.getMessage());
                        IoUtils.c(inputStreamE);
                    }
                }
                IoUtils.c(inputStream);
                certificate = certificateGenerateCertificate;
            } catch (Throwable th) {
                r5 = str;
                th = th;
                IoUtils.c(r5);
                throw th;
            }
        } catch (PackageManager.NameNotFoundException e4) {
            e = e4;
            e = e;
            inputStreamE = null;
            LogUtil.e("HsfSignValidator", "getPackageCertificate", "Failed to get application signature certificate. ", e.getMessage());
            IoUtils.c(inputStreamE);
            LogUtil.j("HsfSignValidator", "getPackageCertificate", "Failed to get application signature certificate.");
            return certificate;
        } catch (CertificateException e5) {
            e = e5;
            e = e;
            inputStreamE = null;
            LogUtil.e("HsfSignValidator", "getPackageCertificate", "Failed to get application signature certificate. ", e.getMessage());
            IoUtils.c(inputStreamE);
            LogUtil.j("HsfSignValidator", "getPackageCertificate", "Failed to get application signature certificate.");
            return certificate;
        } catch (Throwable th2) {
            th = th2;
            IoUtils.c(r5);
            throw th;
        }
        LogUtil.j("HsfSignValidator", "getPackageCertificate", "Failed to get application signature certificate.");
        return certificate;
    }
}
