package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes23.dex */
public class bix {
    private static final Object d = new Object();
    private static String e = "";

    public static String a(Context context) {
        String str;
        String str2;
        String str3;
        synchronized (d) {
            if (TextUtils.isEmpty(e)) {
                String str4 = ("InstallSDK##11.5.1.300##" + a()) + "##" + bij.e();
                try {
                    String packageName = context.getPackageName();
                    str4 = str4 + "##" + packageName;
                    str3 = str4 + "##" + context.getPackageManager().getPackageInfo(packageName, 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    e = e2;
                    str2 = "get package error";
                    bir.d("UserAgentUtils", str2, e);
                    str3 = str4;
                } catch (Exception e3) {
                    e = e3;
                    str2 = "get package Exception";
                    bir.d("UserAgentUtils", str2, e);
                    str3 = str4;
                }
                e = str3;
            }
            str = e;
        }
        return str;
    }

    private static String a() {
        String strC = bij.c();
        return TextUtils.isEmpty(strC) ? "other" : strC;
    }
}
