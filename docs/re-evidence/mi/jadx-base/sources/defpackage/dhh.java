package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class dhh {

    @RequiresApi(28)
    public static class a {
        public static Signature[] a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        public static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        public static Signature[] c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        public static boolean d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        public static boolean e(PackageManager packageManager, String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.b(packageInfo) : packageInfo.versionCode;
    }
}
