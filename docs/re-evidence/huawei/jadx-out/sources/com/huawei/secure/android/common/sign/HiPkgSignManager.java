package com.huawei.secure.android.common.sign;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.secure.android.common.util.LogsUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class HiPkgSignManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22851a = "HiPkgSignManager";

    private static byte[] a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        SigningInfo signingInfo;
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        if (packageInfo == null || (signingInfo = packageInfo.signingInfo) == null) {
            return new byte[0];
        }
        return a(signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory());
    }

    private static byte[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
        return (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) ? new byte[0] : signatureArr[0].toByteArray();
    }

    private static byte[] c(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        return Build.VERSION.SDK_INT >= 28 ? a(packageManager, str) : b(packageManager, str);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    public static boolean doCheckArchiveApk(Context context, String str, String str2, String str3) {
        PackageInfo packageInfoA;
        String strB;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && context != null && !TextUtils.isEmpty(str3) && (packageInfoA = a(context, str2)) != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = packageInfoA.signingInfo;
                if (signingInfo == null) {
                    strB = "";
                } else {
                    Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? packageInfoA.signingInfo.getApkContentsSigners() : packageInfoA.signingInfo.getSigningCertificateHistory();
                    if (apkContentsSigners == null || apkContentsSigners.length <= 0) {
                        strB = "";
                    } else {
                        strB = b(apkContentsSigners[0].toByteArray());
                    }
                }
            } else {
                Signature[] signatureArr = packageInfoA.signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    strB = "";
                } else {
                    strB = b(signatureArr[0].toByteArray());
                }
            }
            String str4 = packageInfoA.packageName;
            if (str.equalsIgnoreCase(strB) && str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean doCheckInstalled(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        return str.equalsIgnoreCase(getInstalledAppHash(context, str2));
    }

    public static boolean doCheckInstalledV2V3(Context context, List<String> list, String str) {
        List<String> installedAppHashV2V3;
        if (TextUtils.isEmpty(str) || list == null || context == null || (installedAppHashV2V3 = getInstalledAppHashV2V3(context, str)) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
        }
        Iterator<String> it2 = installedAppHashV2V3.iterator();
        while (it2.hasNext()) {
            if (!arrayList.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static byte[] getInstalledAPPSignature(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogsUtil.e(f22851a, "packageName is null or context is null");
            return new byte[0];
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return new byte[0];
        }
        try {
            return c(packageManager, str);
        } catch (PackageManager.NameNotFoundException e) {
            LogsUtil.e(f22851a, "PackageManager.NameNotFoundException : " + e.getMessage(), true);
            return new byte[0];
        } catch (Exception e2) {
            LogsUtil.e(f22851a, "Exception : " + e2.getMessage(), true);
            return new byte[0];
        } catch (Throwable th) {
            LogsUtil.e(f22851a, "Throwable : " + th.getMessage(), true);
            return new byte[0];
        }
    }

    public static List<String> getInstalledAppHashV2V3(Context context, String str) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                if (packageInfo != null && (signingInfo = packageInfo.signingInfo) != null) {
                    return signingInfo.hasMultipleSigners() ? b(packageInfo.signingInfo.getApkContentsSigners()) : b(packageInfo.signingInfo.getSigningCertificateHistory());
                }
                return null;
            }
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            if (packageInfo2 != null && (signatureArr = packageInfo2.signatures) != null && signatureArr.length != 0 && signatureArr[0] != null) {
                return b(signatureArr);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public static String getUnInstalledAPPPackageName(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogsUtil.e(f22851a, "archiveFilePath is null or context is null");
            return "";
        }
        PackageInfo packageInfoA = a(context, str);
        return packageInfoA != null ? packageInfoA.packageName : "";
    }

    public static byte[] getUnInstalledAPPSignature(Context context, String str) {
        Signature signature;
        if (context == null || TextUtils.isEmpty(str)) {
            LogsUtil.e(f22851a, "archiveFilePath is null or context is null");
            return new byte[0];
        }
        PackageInfo packageInfoA = a(context, str);
        if (packageInfoA == null) {
            LogsUtil.e(f22851a, "PackageInfo is null ");
        } else if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageInfoA.signingInfo;
            if (signingInfo != null) {
                Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? packageInfoA.signingInfo.getApkContentsSigners() : packageInfoA.signingInfo.getSigningCertificateHistory();
                if (apkContentsSigners != null && apkContentsSigners.length > 0) {
                    return apkContentsSigners[0].toByteArray();
                }
            }
        } else {
            Signature[] signatureArr = packageInfoA.signatures;
            if (signatureArr != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                return signature.toByteArray();
            }
        }
        return new byte[0];
    }

    public static String getInstalledAppHash(Context context, String str) {
        byte[] installedAPPSignature = getInstalledAPPSignature(context, str);
        return (installedAPPSignature == null || installedAPPSignature.length <= 0) ? "" : b(installedAPPSignature);
    }

    public static String getUnInstalledAppHash(Context context, String str) {
        byte[] unInstalledAPPSignature = getUnInstalledAPPSignature(context, str);
        return (unInstalledAPPSignature == null || unInstalledAPPSignature.length <= 0) ? "" : b(unInstalledAPPSignature);
    }

    private static String b(byte[] bArr) {
        try {
            return a(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            LogsUtil.e(f22851a, "NoSuchAlgorithmException" + e.getMessage());
            return "";
        }
    }

    private static byte[] a(Signature[] signatureArr) {
        if (signatureArr != null && signatureArr.length > 0) {
            return signatureArr[0].toByteArray();
        }
        return new byte[0];
    }

    private static List<String> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        if (signatureArr != null && signatureArr.length != 0) {
            for (Signature signature : signatureArr) {
                arrayList.add(b(signature.toByteArray()));
            }
        }
        return arrayList;
    }

    private static PackageInfo a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return packageManager.getPackageArchiveInfo(str, 134217728);
            }
            return packageManager.getPackageArchiveInfo(str, 64);
        } catch (Exception e) {
            LogsUtil.e(f22851a, "Exception : " + e.getMessage(), true);
            return null;
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & 255;
            if (i2 < 16) {
                stringBuffer.append("0" + Integer.toHexString(bArr[i] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(i2));
            }
        }
        return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
    }
}
