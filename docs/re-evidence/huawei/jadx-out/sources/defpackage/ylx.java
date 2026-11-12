package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ylx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f53625b;

    public static void d(Context context) {
        if (context != null) {
            f53625b = context.getApplicationContext();
        }
    }

    public static Context e() {
        return f53625b;
    }

    public static String b(Context context, String str) throws Throwable {
        if (context == null || TextUtils.isEmpty(str)) {
            yis.d("PackageUtil", "getPackageFingerprint params is empty");
            return null;
        }
        Certificate certificateA = a(context, str);
        if (certificateA != null) {
            try {
                return ylq.b(d(certificateA.getEncoded()), true);
            } catch (CertificateEncodingException unused) {
                yis.c("PackageUtil", "getPackageFingerprint CertificateEncodingException");
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private static Certificate a(Context context, String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        PackageManager packageManager = context.getPackageManager();
        ?? r2 = 0;
        if (packageManager == null) {
            yis.c("PackageUtil", "getPackageManager is null");
            return null;
        }
        try {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
                if (packageInfo != null && packageInfo.signatures.length > 0) {
                    byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
                    try {
                        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
                        try {
                            byteArrayInputStream.close();
                            return certificateGenerateCertificate;
                        } catch (IOException unused) {
                            yis.c("PackageUtil", "getPackageCertificate IOException");
                            return certificateGenerateCertificate;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        yis.c("PackageUtil", "getPackageCertificate NameNotFoundException");
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException unused3) {
                                yis.c("PackageUtil", "getPackageCertificate IOException");
                            }
                        }
                        yis.c("PackageUtil", "getPackageCertificate failed to get certificate");
                        return null;
                    } catch (CertificateException unused4) {
                        yis.c("PackageUtil", "getPackageCertificate CertificateException");
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        yis.c("PackageUtil", "getPackageCertificate failed to get certificate");
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                r2 = str;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException unused5) {
                        yis.c("PackageUtil", "getPackageCertificate IOException");
                    }
                }
                throw th;
            }
        } catch (PackageManager.NameNotFoundException unused6) {
            byteArrayInputStream = null;
        } catch (CertificateException unused7) {
            byteArrayInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        yis.c("PackageUtil", "getPackageCertificate failed to get certificate");
        return null;
    }

    private static byte[] d(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            yis.c("PackageUtil", "digest NoSuchAlgorithmException");
            return new byte[0];
        }
    }

    public static Intent e(Intent intent) {
        if (e() == null) {
            yis.c("PackageUtil", "createExplicitFromImplicitIntent context is null");
            throw null;
        }
        PackageManager packageManager = e().getPackageManager();
        if (packageManager == null) {
            yis.c("PackageUtil", "getPackageManager is null");
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.size() != 1) {
            yis.d("PackageUtil", "createExplicitFromImplicitIntent implicitIntent List are null");
            return null;
        }
        ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
        String str = resolveInfo.activityInfo.packageName;
        String str2 = resolveInfo.activityInfo.name;
        if (!a(str)) {
            yis.c("PackageUtil", "createExplicitActivityIntent verifyAppIdentity failed");
            return null;
        }
        ComponentName componentName = new ComponentName(str, str2);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        return intent2;
    }

    public static boolean a(String str) throws Throwable {
        yis.a("PackageUtil", "verifyAppIdentity package name is : " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equals("com.huawei.health")) {
            yis.c("PackageUtil", "verifyAppIdentity app's queryPkgName is not equal");
            return false;
        }
        String strB = b(e(), str);
        if (TextUtils.isEmpty(strB)) {
            yis.c("PackageUtil", "verifyAppIdentity app's fp is empty");
            return false;
        }
        if (strB.equals("B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05") || strB.equals("B2881B2EE3D4EFA03342AE07DAFC0466B63EDE959EC2E2F58C05A54266F45748")) {
            return true;
        }
        yis.c("PackageUtil", "verifyAppIdentity app's fp is not equal");
        return false;
    }
}
