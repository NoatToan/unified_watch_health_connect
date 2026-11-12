package com.tencent.open.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import com.huawei.operation.utils.Constants;
import com.tencent.open.log.SLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, com.tencent.a.a.a> f31114a = new ConcurrentHashMap<>();

    public static void a() {
        f31114a.clear();
    }

    public static void a(String str) {
        if (str == null) {
            return;
        }
        f31114a.remove(str);
    }

    public static String a(Context context, String str) {
        String strA = h.a(context, c(), str);
        if (strA != null && !"UNKNOWN".equals(strA)) {
            return strA;
        }
        PackageInfo packageInfoE = e(context, str);
        if (packageInfoE == null) {
            SLog.e("openSDK_LOG.SystemUtils", "getAppVersionName return null. package= " + str);
            return null;
        }
        return packageInfoE.versionName;
    }

    private static PackageInfo e(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        synchronized (k.class) {
            if (f31114a.containsKey(str)) {
                com.tencent.a.a.a aVar = f31114a.get(str);
                if (aVar == null) {
                    SLog.e("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper is null");
                    return null;
                }
                PackageInfo packageInfo = aVar.f30840b;
                if (packageInfo == null) {
                    SLog.e("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper packageInfo is null");
                }
                return packageInfo;
            }
            PackageInfo packageInfoF = f(context, str);
            f31114a.put(str, new com.tencent.a.a.a(str, packageInfoF));
            return packageInfoF;
        }
    }

    private static PackageInfo f(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                SLog.e("openSDK_LOG.SystemUtils", "realGetPackageInfo null. packageName= " + str);
            }
            return packageInfo;
        } catch (Exception e) {
            SLog.e("openSDK_LOG.SystemUtils", "realGetPackageInfo exception", e);
            return null;
        }
    }

    public static int a(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (strArrSplit.length > i) {
            return 1;
        }
        return strArrSplit2.length > i ? -1 : 0;
    }

    public static boolean a(Context context, String str, String str2) {
        SLog.v("openSDK_LOG.SystemUtils", "OpenUi, validateAppSignatureForPackage");
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                if (m.g(signature.toCharsString()).equals(str2)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static String b(Context context, String str) {
        SLog.v("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString");
        String strA = "";
        try {
            String packageName = context.getPackageName();
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(signatureArr[0].toByteArray());
            String strA2 = m.a(messageDigest.digest());
            messageDigest.reset();
            SLog.v("openSDK_LOG.SystemUtils", "-->sign: " + strA2);
            messageDigest.update(m.j(packageName + "_" + strA2 + "_" + str + ""));
            strA = m.a(messageDigest.digest());
            messageDigest.reset();
            StringBuilder sb = new StringBuilder("-->signEncryped: ");
            sb.append(strA);
            SLog.v("openSDK_LOG.SystemUtils", sb.toString());
            return strA;
        } catch (Exception e) {
            SLog.e("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString error", e);
            return strA;
        }
    }

    public static String a(Activity activity, String str) {
        if (activity == null) {
            SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName activity==null !!!!!!");
            return "";
        }
        try {
            byte[] bArrA = e.a(str);
            if (bArrA == null) {
                SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName shaBytes==null !!!!!!");
                return "";
            }
            byte[] bArr = new byte[8];
            System.arraycopy(bArrA, 5, bArr, 0, 8);
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArrA, 8, bArr2, 0, 16);
            return e.a(activity.getPackageName(), e.a(bArr2), bArr);
        } catch (Exception e) {
            SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName", e);
            return "";
        }
    }

    public static boolean a(Context context, Intent intent) {
        boolean z = false;
        if (context == null || intent == null) {
            StringBuilder sb = new StringBuilder("isActivityExist params error! [");
            sb.append(context == null);
            sb.append(",");
            sb.append(intent == null);
            sb.append("]");
            SLog.e("openSDK_LOG.SystemUtils", sb.toString());
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
            z = true;
        }
        if (!z) {
            StringBuilder sb2 = new StringBuilder("isActivityExist false. result=");
            sb2.append(listQueryIntentActivities == null ? Constants.NULL : Integer.valueOf(listQueryIntentActivities.size()));
            sb2.append(" Intent= ");
            sb2.append(intent);
            SLog.e("openSDK_LOG.SystemUtils", sb2.toString());
        }
        return z;
    }

    public static boolean b(Context context, Intent intent) {
        boolean z = false;
        if (context != null && intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                SLog.i("openSDK_LOG.SystemUtils", "isAgentActivityExist? component null");
                return false;
            }
            String packageName = component.getPackageName();
            String strA = a(context, packageName);
            if (strA != null && !strA.isEmpty()) {
                z = true;
            }
            SLog.i("openSDK_LOG.SystemUtils", "isAgentActivityExist? packageName = " + packageName + ", appVersionName= " + strA);
        }
        return z;
    }

    public static String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            SLog.e("openSDK_LOG.SystemUtils", "getAppName exception", th);
            try {
                int i = applicationInfo.labelRes;
                return i <= 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
            } catch (Throwable th2) {
                SLog.e("openSDK_LOG.SystemUtils", "getAppName getLabel exception", th2);
                return "";
            }
        }
    }

    public static int c(Context context, String str) {
        return a(a(context, "com.tencent.mobileqq"), str);
    }

    public static int d(Context context, String str) {
        return a(a(context, com.tencent.connect.common.Constants.PACKAGE_TIM), str);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    public static boolean a(String str, String str2, int i) {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e;
        SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libName: " + str);
        Context contextA = g.a();
        if (contextA == null) {
            SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, global context is null. ");
            return false;
        }
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("secure_lib", 0);
        File file = new File(contextA.getFilesDir(), str2);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    file.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            int i2 = sharedPreferences.getInt("version", 0);
            SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libVersion: " + i + " | oldVersion: " + i2);
            if (i == i2) {
                return true;
            }
        }
        InputStream inputStream = null;
        fileOutputStreamOpenFileOutput = null;
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        inputStream = null;
        try {
            InputStream inputStreamOpen = contextA.getAssets().open(str);
            try {
                fileOutputStreamOpenFileOutput = contextA.openFileOutput(str2, 0);
                a(inputStreamOpen, fileOutputStreamOpenFileOutput);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("version", i);
                editorEdit.commit();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                return true;
            } catch (Exception e3) {
                e = e3;
                FileOutputStream fileOutputStream2 = fileOutputStreamOpenFileOutput;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream2;
                try {
                    SLog.e("openSDK_LOG.SystemUtils", "-->extractSecureLib, when copy lib execption.", e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused6) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                FileOutputStream fileOutputStream3 = fileOutputStreamOpenFileOutput;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream3;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                outputStream.write(bArr, 0, i);
                j += (long) i;
            } else {
                SLog.i("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j);
                return j;
            }
        }
    }

    public static int b(String str) {
        if ("shareToQQ".equals(str)) {
            return 10103;
        }
        if ("shareToQzone".equals(str)) {
            return 10104;
        }
        if ("addToQQFavorites".equals(str)) {
            return 10105;
        }
        if ("sendToMyComputer".equals(str)) {
            return 10106;
        }
        if ("shareToTroopBar".equals(str)) {
            return com.tencent.connect.common.Constants.REQUEST_SHARE_TO_TROOP_BAR;
        }
        if ("action_login".equals(str)) {
            return com.tencent.connect.common.Constants.REQUEST_LOGIN;
        }
        return "action_request".equals(str) ? 10100 : -1;
    }

    public static String a(int i) {
        if (i == 10103) {
            return "shareToQQ";
        }
        if (i == 10104) {
            return "shareToQzone";
        }
        if (i == 10105) {
            return "addToQQFavorites";
        }
        if (i == 10106) {
            return "sendToMyComputer";
        }
        if (i == 10107) {
            return "shareToTroopBar";
        }
        if (i == 11101) {
            return "action_login";
        }
        if (i == 10100) {
            return "action_request";
        }
        if (i != 10114) {
            return null;
        }
        return "action_common_channel";
    }

    public static boolean b(Context context) {
        boolean zG = g(context, "com.tencent.mobileqq");
        SLog.i("openSDK_LOG.SystemUtils", "isQQInstalled " + zG);
        return zG;
    }

    public static boolean c(Context context) {
        if (g(context, "com.tencent.mobileqq")) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: qq");
            return true;
        }
        if (g(context, com.tencent.connect.common.Constants.PACKAGE_TIM)) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: tim");
            return true;
        }
        if (g(context, com.tencent.connect.common.Constants.PACKAGE_QQ_PAD)) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: pad");
            return true;
        }
        SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: disable speed");
        return false;
    }

    private static boolean g(Context context, String str) {
        return (h.a(context, c(), str) == null && e(context, str) == null) ? false : true;
    }

    public static String a(Activity activity) {
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getApplicationContext().getPackageName(), 128);
            SLog.i("openSDK_LOG.SystemUtils", "apkPath=" + applicationInfo.sourceDir);
            return applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            SLog.e("openSDK_LOG.SystemUtils", "NameNotFoundException", e);
            return null;
        } catch (Exception e2) {
            SLog.e("openSDK_LOG.SystemUtils", "Exception", e2);
            return null;
        }
    }

    public static boolean d(Context context) {
        return context != null && context.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29 && !b();
    }

    private static boolean b() {
        try {
            return ((Boolean) Environment.class.getMethod("isExternalStorageLegacy", new Class[0]).invoke(Environment.class, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    private static String c() {
        String strB = com.tencent.open.b.b.b();
        if (strB != null && !strB.isEmpty()) {
            return strB;
        }
        SLog.e("openSDK_LOG.SystemUtils", "getAppId error: " + strB);
        return strB;
    }
}
