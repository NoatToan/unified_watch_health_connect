package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.j1;
import com.amap.api.col.p0003sl.x0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class e0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f16137a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f16138b = "";
    public static String c = "";
    public static String d = "";
    public static String e = null;
    public static boolean f = false;

    public class a extends f7t {
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;

        public a(Context context, String str) {
            this.d = context;
            this.e = str;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            FileOutputStream fileOutputStream = null;
            try {
                File file = new File(k2t.i(this.d, "k.store"));
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(p0t.n(this.e));
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        j2t.e(th, "AI", "stf");
                    } finally {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static String a(Context context) {
        try {
            return m(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return d;
        }
    }

    public static void b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d = str;
        if (context != null) {
            j1.h().b(new a(context, str));
        }
    }

    public static void c(String str) {
        f16138b = str;
    }

    public static boolean d() {
        try {
            if (f) {
                return true;
            }
            if (h(e)) {
                f = true;
                return true;
            }
            if (!TextUtils.isEmpty(e)) {
                f = false;
                e = null;
                return false;
            }
            if (h(f16138b)) {
                f = true;
                return true;
            }
            if (!TextUtils.isEmpty(f16138b)) {
                f = false;
                f16138b = null;
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        try {
            if (!"".equals(f16137a)) {
                return f16137a;
            }
            PackageManager packageManager = context.getPackageManager();
            f16137a = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
            return f16137a;
        } catch (Throwable th) {
            j2t.e(th, "AI", "gAN");
        }
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d = str;
    }

    public static String g(Context context) {
        try {
            String str = f16138b;
            if (str != null && !"".equals(str)) {
                return f16138b;
            }
            String packageName = context.getPackageName();
            f16138b = packageName;
            if (!h(packageName)) {
                f16138b = context.getPackageName();
            }
            return f16138b;
        } catch (Throwable th) {
            j2t.e(th, "AI", "gpck");
        }
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c2 : str.toCharArray()) {
            if (('A' > c2 || c2 > 'z') && (('0' > c2 || c2 > ':') && c2 != '.')) {
                try {
                    m2t.o(p0t.a(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    public static String i(Context context) {
        try {
            if (!"".equals(c)) {
                return c;
            }
            c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            String str = c;
            return str == null ? "" : str;
        } catch (Throwable th) {
            j2t.e(th, "AI", "gAV");
        }
    }

    public static String j(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] bArrDigest = MessageDigest.getInstance(p0t.t("IU0hBMQ")).digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            String strG = packageInfo.packageName;
            if (h(strG)) {
                strG = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(f16138b)) {
                strG = g(context);
            }
            stringBuffer.append(strG);
            String string = stringBuffer.toString();
            e = string;
            return string;
        } catch (Throwable th) {
            j2t.e(th, "AI", "gsp");
            return e;
        }
    }

    public static String k(Context context) {
        try {
            x0.g(context);
        } catch (Throwable unused) {
        }
        try {
            return m(context);
        } catch (Throwable th) {
            j2t.e(th, "AI", "gKy");
            return d;
        }
    }

    public static String l(Context context) {
        FileInputStream fileInputStream;
        Throwable th;
        File file = new File(k2t.i(context, "k.store"));
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String strG = p0t.g(bArr);
                String str = strG.length() == 32 ? strG : "";
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return str;
            } catch (Throwable th3) {
                th = th3;
                try {
                    j2t.e(th, "AI", "gKe");
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
            fileInputStream = null;
            th = th8;
        }
    }

    public static String m(Context context) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        String str = d;
        if (str == null || str.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return d;
            }
            String string = bundle.getString("com.amap.api.v2.apikey");
            d = string;
            if (string == null) {
                d = l(context);
            }
        }
        return d;
    }
}
