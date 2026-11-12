package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f2763a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f2764b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f2765c = "";
    private static String d = "";
    private static String e = "";
    private static String f = "";

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c2 : str.toCharArray()) {
            if (('A' > c2 || c2 > 'z') && (('0' > c2 || c2 > ':') && c2 != '.')) {
                try {
                    jv.b(iy.a(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    static boolean a() {
        try {
            if (f2764b) {
                return true;
            }
            if (c(f2763a)) {
                f2764b = true;
                return true;
            }
            if (!TextUtils.isEmpty(f2763a)) {
                f2764b = false;
                f2763a = null;
                return false;
            }
            if (c(d)) {
                f2764b = true;
                return true;
            }
            if (!TextUtils.isEmpty(d)) {
                f2764b = false;
                d = null;
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    public static String a(Context context) {
        try {
            return h(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return f;
        }
    }

    public static String b(Context context) {
        try {
            if (!"".equals(f2765c)) {
                return f2765c;
            }
            PackageManager packageManager = context.getPackageManager();
            f2765c = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
            return f2765c;
        } catch (Throwable th) {
            js.a(th, "AI", "gAN");
        }
    }

    public static void a(String str) {
        d = str;
    }

    public static String c(Context context) {
        try {
            String str = d;
            if (str != null && !"".equals(str)) {
                return d;
            }
            String packageName = context.getPackageName();
            d = packageName;
            if (!c(packageName)) {
                d = context.getPackageName();
            }
            return d;
        } catch (Throwable th) {
            js.a(th, "AI", "gpck");
        }
    }

    public static String d(Context context) {
        try {
            if (!"".equals(e)) {
                return e;
            }
            e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            String str = e;
            return str == null ? "" : str;
        } catch (Throwable th) {
            js.a(th, "AI", "gAV");
        }
    }

    public static String e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] bArrDigest = MessageDigest.getInstance(iy.c("IU0hBMQ")).digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            String strC = packageInfo.packageName;
            if (c(strC)) {
                strC = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(d)) {
                strC = c(context);
            }
            stringBuffer.append(strC);
            String string = stringBuffer.toString();
            f2763a = string;
            return string;
        } catch (Throwable th) {
            js.a(th, "AI", "gsp");
            return f2763a;
        }
    }

    static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f = str;
    }

    static void a(final Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f = str;
        if (context != null) {
            ma.a().a(new mb() { // from class: com.amap.api.col.3sl.il.1
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    Throwable th;
                    FileOutputStream fileOutputStream;
                    try {
                        File file = new File(jt.c(context, "k.store"));
                        if (!file.getParentFile().exists()) {
                            file.getParentFile().mkdirs();
                        }
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(iy.a(str));
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                js.a(th, "AI", "stf");
                            } finally {
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th4) {
                                        th4.printStackTrace();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        fileOutputStream = null;
                    }
                }
            });
        }
    }

    public static String f(Context context) {
        try {
            im.a(context);
        } catch (Throwable unused) {
        }
        try {
            return h(context);
        } catch (Throwable th) {
            js.a(th, "AI", "gKy");
            return f;
        }
    }

    private static String g(Context context) {
        Throwable th;
        FileInputStream fileInputStream;
        File file = new File(jt.c(context, "k.store"));
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String strA = iy.a(bArr);
                String str = strA.length() == 32 ? strA : "";
                try {
                    fileInputStream.close();
                    return str;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return str;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    js.a(th, "AI", "gKe");
                    try {
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th6) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th7) {
                            th7.printStackTrace();
                        }
                    }
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            fileInputStream = null;
        }
    }

    private static String h(Context context) throws PackageManager.NameNotFoundException {
        String str = f;
        if (str == null || str.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return f;
            }
            String string = applicationInfo.metaData.getString("com.amap.api.v2.apikey");
            f = string;
            if (string == null) {
                f = g(context);
            }
        }
        return f;
    }
}
