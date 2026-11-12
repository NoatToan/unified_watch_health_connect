package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes23.dex */
public class bik {
    public static String b(Context context) {
        String str;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (PackageManager.NameNotFoundException unused) {
            str = "can not get client version NameNotFoundException.";
            bir.d("PkgUtil", str);
            return "";
        } catch (Exception unused2) {
            str = "can not get client version Exception.";
            bir.d("PkgUtil", str);
            return "";
        }
    }
}
