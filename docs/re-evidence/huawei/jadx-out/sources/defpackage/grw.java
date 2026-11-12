package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class grw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f35964c = CommonUtil.af();
    private static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String b(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e("DE_AppAuthorityUtil", "context or packageName is null");
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo.signatures[0] == null) {
                LogUtil.j("DE_AppAuthorityUtil", "getAppSecretString ", "signature is null");
                return "";
            }
            return c(packageInfo.signatures[0].toByteArray());
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.e("DE_AppAuthorityUtil", "getAppSecretString type =", e2.getMessage());
            return "";
        }
    }

    private static String c(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            int i = 0;
            if (bArrDigest == null) {
                LogUtil.a("DE_AppAuthorityUtil", "mdTemp is null or md.length < 0 ");
                return null;
            }
            int length = bArrDigest.length;
            char[] cArr = new char[length * 2];
            int i2 = 0;
            while (i2 < length) {
                byte b2 = bArrDigest[i2];
                char[] cArr2 = e;
                cArr[i] = cArr2[(b2 >>> 4) & 15];
                cArr[i + 1] = cArr2[b2 & 15];
                i2++;
                i += 2;
            }
            return new String(cArr);
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.e("DE_AppAuthorityUtil", "NoSuchAlgorithmException type =", e2.getMessage());
            return null;
        }
    }
}
