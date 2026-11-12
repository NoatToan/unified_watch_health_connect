package com.huawei.haf.dynamic;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.HexUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicApkValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f5930a = Arrays.asList(AppBundleBuildConfig.g());
    private static boolean d = true;
    private static Signature[] e;

    private DynamicApkValidator() {
    }

    public static boolean d(Context context, File file, String str) {
        if (!FileUtils.a(file)) {
            LogUtil.d("HAF_ApkValidator", "module ", file.getPath(), " is illegal.");
            return false;
        }
        Signature[] signatureArrC = c(context, file);
        if (CollectionUtils.d(signatureArrC)) {
            LogUtil.d("HAF_ApkValidator", "module ", file.getPath(), " is not signed.");
            return false;
        }
        if (e(context, signatureArrC) || b(str, signatureArrC)) {
            return true;
        }
        LogUtil.e("HAF_ApkValidator", "module ", file.getPath(), " signature illegal, ", d(signatureArrC));
        return false;
    }

    private static boolean e(Context context, Signature[] signatureArr) {
        Signature[] signatureArrC = c(context);
        if (CollectionUtils.d(signatureArrC)) {
            LogUtil.d("HAF_ApkValidator", "No certificates found for app.");
            return false;
        }
        for (Signature signature : signatureArr) {
            for (Signature signature2 : signatureArrC) {
                if (signature.equals(signature2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(String str, Signature[] signatureArr) {
        if (!TextUtils.isEmpty(str) && !f5930a.isEmpty()) {
            for (Signature signature : signatureArr) {
                if (f5930a.contains(str + ":" + e(signature.toByteArray()))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Signature[] c(Context context) {
        if (e == null) {
            e = e(context, (File) null);
        }
        return e;
    }

    private static Signature[] c(Context context, File file) {
        return e(context, file);
    }

    private static Signature[] e(Context context, File file) {
        PackageInfo packageInfoA = a(context, file);
        if (packageInfoA == null) {
            return d(file);
        }
        return c(packageInfoA);
    }

    private static Signature[] c(PackageInfo packageInfo) {
        SigningInfo signingInfo;
        Signature[] signatureArr = packageInfo.signatures;
        if (Build.VERSION.SDK_INT < 28 || (signingInfo = packageInfo.signingInfo) == null) {
            return signatureArr;
        }
        if (signingInfo.hasMultipleSigners()) {
            return signingInfo.getApkContentsSigners();
        }
        return signingInfo.getSigningCertificateHistory();
    }

    private static Signature[] d(File file) {
        if (file == null) {
            return null;
        }
        Object objA = ReflectionUtils.a("android.content.pm.PackageParser");
        if (objA == null) {
            LogUtil.e("HAF_ApkValidator", "packageParser == null");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return AndroidPlatformV28.c(objA, file);
        }
        return AndroidPlatformV21.a(objA, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object d(Object obj, File file, int i) {
        if (!d) {
            return null;
        }
        try {
            return ReflectionUtils.d(obj, "parseApkLite", File.class, Integer.TYPE).invoke(obj, file, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            LogUtil.e("HAF_ApkValidator", "getApkLite ex=", LogUtil.c(e2));
            d = false;
            return null;
        }
    }

    private static PackageInfo a(Context context, File file) {
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT >= 28 ? 134217728 : 64;
        if (file != null) {
            return packageManager.getPackageArchiveInfo(file.getAbsolutePath(), i);
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), i);
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.d("HAF_ApkValidator", "Cannot get app signature. ex=", LogUtil.c(e2));
            return null;
        }
    }

    private static String d(Signature[] signatureArr) {
        if (signatureArr.length == 1) {
            return e(signatureArr[0].toByteArray());
        }
        StringBuffer stringBuffer = new StringBuffer(128);
        for (Signature signature : signatureArr) {
            if (stringBuffer.length() != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(e(signature.toByteArray()));
        }
        return stringBuffer.toString();
    }

    private static String e(byte[] bArr) {
        return b(bArr, "SHA-256");
    }

    private static String b(byte[] bArr, String str) {
        try {
            return HexUtils.c(SecurityUtils.a(bArr, str));
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.d("HAF_ApkValidator", "toShaForHex ex=", LogUtil.c(e2));
            return "";
        }
    }

    static final class AndroidPlatformV28 {
        private AndroidPlatformV28() {
        }

        static Signature[] c(Object obj, File file) {
            Object objD = DynamicApkValidator.d(obj, file, 32);
            if (objD == null) {
                objD = a(obj, file);
            }
            if (objD != null) {
                Object objC = ReflectionUtils.c(ReflectionUtils.c(objD, "signingDetails"), "signatures");
                if (objC instanceof Signature[]) {
                    return (Signature[]) objC;
                }
            }
            return new Signature[0];
        }

        private static Object a(Object obj, File file) {
            Object objInvoke = null;
            try {
                objInvoke = ReflectionUtils.d(obj, "parsePackage", File.class, Integer.TYPE).invoke(obj, file, 134217728);
                ReflectionUtils.d(obj, "collectCertificates", objInvoke.getClass(), Boolean.TYPE).invoke(obj, objInvoke, false);
                return objInvoke;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                LogUtil.e("HAF_ApkValidator", "getPackage ex=", LogUtil.c(e));
                return objInvoke;
            }
        }
    }

    static final class AndroidPlatformV21 {
        private AndroidPlatformV21() {
        }

        static Signature[] a(Object obj, File file) {
            Object objD = DynamicApkValidator.d(obj, file, 256);
            if (objD == null) {
                objD = b(obj, file);
            }
            if (objD != null) {
                Object objC = ReflectionUtils.c(objD, "signatures");
                if (objC instanceof Signature[]) {
                    return (Signature[]) objC;
                }
            }
            return new Signature[0];
        }

        private static Object b(Object obj, File file) {
            Object objInvoke = null;
            try {
                objInvoke = ReflectionUtils.d(obj, "parsePackage", File.class, Integer.TYPE).invoke(obj, file, 64);
                ReflectionUtils.d(obj, "collectCertificates", objInvoke.getClass(), Integer.TYPE).invoke(obj, objInvoke, 64);
                return objInvoke;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                LogUtil.e("HAF_ApkValidator", "getPackage ex=", LogUtil.c(e));
                return objInvoke;
            }
        }
    }
}
