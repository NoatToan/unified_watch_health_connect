package com.weibo.ssosdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes18.dex */
public class AppUtils {
    public static String AppName(PackageManager packageManager, String str) {
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String[] AppPremission(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 4096).requestedPermissions;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String AppSignature(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 64).signatures[0].toCharsString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String PackgeName(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static int VersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String VersionName(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            if (Integer.toHexString(bArr[i] & 255).length() == 1) {
                sb.append("0");
                sb.append(Integer.toHexString(bArr[i] & 255));
            } else {
                sb.append(Integer.toHexString(bArr[i] & 255));
            }
        }
        return sb.toString().toUpperCase();
    }

    private static String b(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        StringBuilder sb = new StringBuilder();
        try {
            CertificateFactory.getInstance("X509").generateCertificate(byteArrayInputStream);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.update(bArr);
            sb.append(a(messageDigest.digest()));
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String getInstallPath(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.publicSourceDir;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static long getInstallTime(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER.toUpperCase();
    }

    public static int getProcessPid() {
        return Process.myPid();
    }

    public static int getProcessUid() {
        return Process.myUid();
    }

    public static String getSignature(Context context) {
        try {
            String strB = b(context.getPackageManager().getPackageInfo(PackgeName(context), 64).signatures[0].toByteArray());
            return strB == null ? "" : strB;
        } catch (Exception unused) {
            return "";
        }
    }

    public static long getUpdateTime(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void saveOadi(Context context, String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "";
        }
        try {
            PreferenceManagerUtil.init(context);
            PreferenceManagerUtil.getInstance().saveData(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2, str3);
        } catch (Exception unused) {
        }
    }
}
