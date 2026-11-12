package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import com.huawei.hiar.e;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes33.dex */
public class krk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f39370c = "d";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    public static String b(Context context, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        ?? r0 = 0;
        try {
            if (context == null) {
                return null;
            }
            try {
                inputStreamOpen = context.getAssets().open(str);
                try {
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    if (inputStreamOpen.read(bArr) < 0) {
                        e.a(inputStreamOpen);
                        return null;
                    }
                    String str2 = new String(bArr, "UTF-8");
                    e.a(inputStreamOpen);
                    return str2;
                } catch (IOException unused) {
                    Log.e(f39370c, "getSignatureFromCertificate IOException!");
                    e.a(inputStreamOpen);
                    return null;
                }
            } catch (IOException unused2) {
                inputStreamOpen = null;
            } catch (Throwable th2) {
                th = th2;
                e.a(r0);
                throw th;
            }
        } catch (Throwable th3) {
            r0 = context;
            th = th3;
        }
    }

    static Signature[] a(Context context, String str) {
        if (context != null && str != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.e(f39370c, "getPackageManager fail!");
                return null;
            }
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                    SigningInfo signingInfo = packageInfo != null ? packageInfo.signingInfo : null;
                    if (signingInfo != null) {
                        return signingInfo.getApkContentsSigners();
                    }
                } else {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
                    if (packageInfo2 != null) {
                        return packageInfo2.signatures;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e(f39370c, "getSignature Name not found");
            }
        }
        return null;
    }

    public static boolean e(Signature signature, String str) {
        String str2;
        String str3;
        if (signature == null && str == null) {
            Log.e(f39370c, "checkSignature serverSignature and localSignature null!");
            return true;
        }
        if (signature == null) {
            str2 = f39370c;
            str3 = "checkSignature serverSignature null!";
        } else {
            if (str != null) {
                return str.equals(signature.toCharsString());
            }
            str2 = f39370c;
            str3 = "checkSignature localSignature null!";
        }
        Log.e(str2, str3);
        return false;
    }

    public static Signature e(Context context, String str) {
        Signature[] signatureArrA = a(context, str);
        if (signatureArrA == null || signatureArrA.length <= 0) {
            return null;
        }
        return signatureArrA[0];
    }
}
