package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import com.huawei.wearengine.auth.HiAppInfo;
import com.huawei.wearengine.repository.AppInfoRepositoryImpl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes20.dex */
public class yln {
    private static ExecutorService e = Executors.newSingleThreadExecutor();

    public static HiAppInfo a(Context context, String str) {
        if (context == null) {
            yit.b("AppUtil", "getAppInfo context isEmpty!");
            return null;
        }
        String strD = d(context, str);
        if (TextUtils.isEmpty(strD)) {
            yit.b("AppUtil", "getAppInfo appAuthKey isEmpty!");
            return null;
        }
        AppInfoRepositoryImpl appInfoRepositoryImpl = new AppInfoRepositoryImpl(context);
        HiAppInfo hiAppInfo = appInfoRepositoryImpl.getHiAppInfo(strD);
        if (hiAppInfo != null) {
            yit.a("AppUtil", "getAppInfo appInfoRepository hiAppInfo != null, HiAppInfo:" + hiAppInfo.toString());
            return hiAppInfo;
        }
        HiAppInfo hiAppInfoF = f(context, str);
        if (hiAppInfoF == null) {
            yit.b("AppUtil", "getAppInfo appInfo == null");
            return null;
        }
        yit.a("AppUtil", "getAppInfo HiAppInfo:" + hiAppInfoF.toString());
        if (appInfoRepositoryImpl.insertAppInfo(hiAppInfoF)) {
            return hiAppInfoF;
        }
        yit.b("AppUtil", "getAppInfo insertAppInfo fail!");
        return null;
    }

    private static HiAppInfo f(Context context, String str) {
        int iJ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strC = c(context);
        yit.a("AppUtil", "getAppInfo userId:" + strC);
        if (TextUtils.isEmpty(strC) || (iJ = j(context, str)) == 0) {
            return null;
        }
        HiAppInfo hiAppInfo = new HiAppInfo();
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            int i = applicationInfo.uid;
            hiAppInfo.setKey(c(i, strC, iJ));
            hiAppInfo.setUserId(strC);
            hiAppInfo.setAppId(iJ);
            hiAppInfo.setAppUid(i);
            hiAppInfo.setPackageName(str);
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            hiAppInfo.setAppName(applicationLabel instanceof String ? (String) applicationLabel : "");
            hiAppInfo.setVersion(packageManager.getPackageInfo(str, 64).versionName);
            hiAppInfo.setSignature(c(c(str), i));
            hiAppInfo.setByteDraw(ylr.d(d(str)));
            return hiAppInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            yit.b("AppUtil", "getKitAppInfo() NameNotFoundException");
            return hiAppInfo;
        }
    }

    public static String c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            yit.b("AppUtil", "getAppName context or packageName is null:");
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128));
            return applicationLabel instanceof String ? (String) applicationLabel : "";
        } catch (PackageManager.NameNotFoundException unused) {
            yit.b("AppUtil", "getAppName() NameNotFoundException");
            return "";
        }
    }

    public static int j(Context context, String str) {
        Object obj;
        if (context == null || TextUtils.isEmpty(str)) {
            yit.b("AppUtil", "getMetaDataAppId context or packageName is null:");
            return 0;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            yit.b("AppUtil", "getMetaDataAppId packageManager is null");
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("com.huawei.hms.client.appid")) == null) {
                yit.b("AppUtil", "getMetaDataAppId metaData is null");
                return 0;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.startsWith("appid=")) {
                strValueOf = strValueOf.substring(6);
            }
            return Integer.parseInt(strValueOf);
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            yit.b("AppUtil", "getMetaDataAppId has exception");
        }
    }

    public static Bitmap d(String str) {
        PackageManager packageManager = yiv.a().getApplicationContext().getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            yit.e("AppUtil", "getBitmap");
            Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
            if (applicationIcon == null) {
                return null;
            }
            if (applicationIcon instanceof AdaptiveIconDrawable) {
                yit.a("AppUtil", "AdaptiveIconDrawable getBitmap");
                return c(applicationIcon);
            }
            yit.a("AppUtil", "BitmapDrawable getBitmap");
            if (applicationIcon instanceof BitmapDrawable) {
                return ((BitmapDrawable) applicationIcon).getBitmap();
            }
            return c(applicationIcon);
        } catch (PackageManager.NameNotFoundException unused) {
            yit.b("AppUtil", "PackageManager.NameNotFoundException:");
            return null;
        }
    }

    private static Bitmap c(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static String c(String str, int i) {
        return str + "##" + String.valueOf(i);
    }

    public static String c(String str) throws Throwable {
        Certificate certificateA = a(str);
        if (certificateA == null) {
            return null;
        }
        try {
            return ylq.b(ymi.b(certificateA.getEncoded()), true);
        } catch (CertificateEncodingException unused) {
            yit.b("AppUtil", "Failed to get application signature certificate fingerprint.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private static Certificate a(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        yit.e("AppUtil", "getPackageCertificate packageName:" + str);
        PackageManager packageManager = yiv.a().getPackageManager();
        ?? r4 = 0;
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
                            yit.b("AppUtil", "An exception occurred while closing the 'Closeable' object.");
                            return certificateGenerateCertificate;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        yit.b("AppUtil", "getPackageCertificate PackageManager.NameNotFoundException");
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException unused3) {
                                yit.b("AppUtil", "An exception occurred while closing the 'Closeable' object.");
                            }
                        }
                        yit.b("AppUtil", "Failed to get application signature certificate.");
                        return null;
                    } catch (CertificateException unused4) {
                        yit.b("AppUtil", "getPackageCertificate CertificateException");
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        yit.b("AppUtil", "Failed to get application signature certificate.");
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                r4 = packageManager;
                if (r4 != 0) {
                    try {
                        r4.close();
                    } catch (IOException unused5) {
                        yit.b("AppUtil", "An exception occurred while closing the 'Closeable' object.");
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
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
        yit.b("AppUtil", "Failed to get application signature certificate.");
        return null;
    }

    public static String e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            yit.b("AppUtil", "getCallingAppVersion context or packageName is null:");
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            yit.b("AppUtil", "getAppVersion NameNotFoundException");
            return "";
        }
    }

    public static String d(int i, Context context) {
        if (context == null) {
            yit.c("AppUtil", "getCallingPackageName:context is null");
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            yit.c("AppUtil", "getCallingPackageName:packageManager is null");
            return "";
        }
        return packageManager.getNameForUid(i);
    }

    public static String b(int i, Context context, String str) {
        if (context == null) {
            yit.c("AppUtil", "getCallingPackageName:context is null");
            return null;
        }
        yit.e("AppUtil", "getCallingPackageNameUid ：" + i + " getCallingPackageNameApplicationId ：" + str);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            yit.c("AppUtil", "getCallingPackageName:packageManager is null");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            yit.c("AppUtil", "getCallingPackageName:applicationId is null");
            return null;
        }
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            yit.c("AppUtil", "getCallingPackageName:packageNames is null");
            return null;
        }
        if (!Arrays.asList(packagesForUid).contains(str)) {
            yit.c("AppUtil", "getCallingPackageName:packageNames not contains applicationId");
            return null;
        }
        yit.a("AppUtil", "getCallingPackageName:packageNames contains applicationId:" + str);
        return str;
    }

    public static String e() {
        return Locale.getDefault().getCountry();
    }

    public static String d(Context context, String str) {
        int iJ;
        if (TextUtils.isEmpty(str)) {
            yit.c("AppUtil", "getAppKey packageName is null");
            return null;
        }
        String strC = c(context);
        if (TextUtils.isEmpty(strC) || (iJ = j(context, str)) == 0) {
            return null;
        }
        return c(b(context, str), strC, iJ);
    }

    public static String c(int i, String str, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i);
        stringBuffer.append("_");
        stringBuffer.append(str);
        stringBuffer.append("_");
        stringBuffer.append(i2);
        return stringBuffer.toString();
    }

    public static String c(final Context context) {
        try {
            return (String) e.submit(new Callable<String>() { // from class: yln.5
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public String call() throws Exception {
                    return ylm.a(context);
                }
            }).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            yit.b("AppUtil", "getUserId has exception");
            return null;
        }
    }

    public static boolean d(final Context context) {
        try {
            return ((Boolean) e.submit(new Callable<Boolean>() { // from class: yln.3
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Boolean call() throws Exception {
                    return ylm.e(context);
                }
            }).get(30000L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            yit.b("AppUtil", "isAuthorizedInHealth has exception");
            return false;
        }
    }

    public static int b(Context context, String str) {
        if (context == null) {
            yit.b("AppUtil", "getAppUid context is null");
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            yit.b("AppUtil", "getAppUid packageName is null or empty");
            return 0;
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            yit.b("AppUtil", "getAppUid NameNotFoundException");
            return 0;
        }
    }

    public static String b(final Context context) {
        try {
            String str = (String) e.submit(new Callable<String>() { // from class: yln.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public String call() throws Exception {
                    return ylm.b(context);
                }
            }).get(30000L, TimeUnit.MILLISECONDS);
            yit.a("AppUtil", "getGrsUrl url = " + str);
            return str;
        } catch (InterruptedException unused) {
            yit.b("AppUtil", "getGrsUrl InterruptedException");
            return "";
        } catch (ExecutionException unused2) {
            yit.b("AppUtil", "getGrsUrl ExecutionException");
            return "";
        } catch (TimeoutException unused3) {
            yit.b("AppUtil", "getGrsUrl TimeoutException");
            return "";
        }
    }

    public static int a(Context context) {
        if (context == null) {
            yit.c("AppUtil", "getMetaDataApiLevel context is null");
            return 0;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            yit.c("AppUtil", "getMetaDataApiLevel PackageManager is null");
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                int i = applicationInfo.metaData.getInt("com.huawei.wearengine.service.api_level");
                yit.e("AppUtil", "getMetaDataApiLevel apiLevel:" + i);
                return i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            yit.b("AppUtil", "getMetaDataApiLevel PackageManager.NameNotFoundException");
        }
        return 0;
    }

    public static boolean d() {
        try {
            return ((Boolean) e.submit(new Callable<Boolean>() { // from class: yln.4
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Boolean call() throws Exception {
                    return Boolean.valueOf(yjd.c());
                }
            }).get(30000L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException unused) {
            yit.b("AppUtil", "hasDeviceConnectedInfoInThread InterruptedException");
            return false;
        } catch (ExecutionException unused2) {
            yit.b("AppUtil", "hasDeviceConnectedInfoInThread ExecutionException");
            return false;
        } catch (TimeoutException unused3) {
            yit.b("AppUtil", "hasDeviceConnectedInfoInThread TimeoutException");
            return false;
        }
    }

    public static int e(String str) {
        Context contextA = yiv.a();
        if (contextA == null) {
            yit.c("AppUtil", "getSdkMetaDataApiLevel context is null");
            return 0;
        }
        PackageManager packageManager = contextA.getPackageManager();
        if (packageManager == null) {
            yit.c("AppUtil", "getSdkMetaDataApiLevel PackageManager is null");
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                int i = applicationInfo.metaData.getInt("com.huawei.wearengine.sdk.api_level");
                yit.e("AppUtil", "getSdkMetaDataApiLevel apiLevel:" + i);
                return i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            yit.b("AppUtil", "getSdkMetaDataApiLevel PackageManager.NameNotFoundException");
        }
        return 0;
    }

    public static String b(String str) {
        if (str == null) {
            yit.e("AppUtil", "str is null");
            return Constants.NULL;
        }
        if (TextUtils.isEmpty(str) || str.length() <= 8) {
            yit.e("AppUtil", "str is empty or length less than eight");
            return str;
        }
        return str.substring(0, 4) + "***" + str.substring(str.length() - 4);
    }
}
