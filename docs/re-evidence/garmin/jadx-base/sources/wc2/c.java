package wc2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.garmin.android.connectiq.BuildConfig;
import d53.u;
import d53.w;
import i3.e5;
import o13.p;
import org.apache.commons.io.IOUtils;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f184318a = u0.e(new p("com.garmin.android.apps.connectmobile", "GCM"), new p(BuildConfig.ARTIFACT_GROUP_ID, "CIQ"), new p("com.garmin.android.apps.golf", "GOLF"), new p("com.garmin.android.apps.dive", "DIVE"), new p("com.garmin.android.apps.vivokid", "JR"), new p("com.garmin.android.apps.explore", "EXPL"), new p("com.garmin.apps.xero", "XERO"), new p("com.garmin.android.apps.variamobile", "VARIA"), new p("com.garmin.racingcoach", "RacingCoach"), new p("com.garmin.android.apps.messenger", "MESSENGER"));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final String a(Context context) throws PackageManager.NameNotFoundException {
        String str;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        String str2 = (String) f184318a.get(packageName);
        if (str2 == null) {
            str2 = packageName;
        }
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            str = "";
        }
        return e5.g(str2, "-Android-", str);
    }

    public static final String b(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        String str3;
        context.getClass();
        StringBuilder sb3 = new StringBuilder();
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        if (packageInfo == null || (str3 = packageInfo.versionName) == null) {
            str3 = "";
        }
        sb3.append(packageName);
        sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb3.append(str3);
        sb3.append("; ");
        if (str != null && !w.J(str) && str2 != null && !w.J(str2)) {
            sb3.append(str);
            sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb3.append(str2);
        }
        sb3.append("; ");
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        sb3.append(c(str4));
        sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
        String str5 = Build.MODEL;
        str5.getClass();
        sb3.append(c(str5));
        sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
        String str6 = Build.BRAND;
        str6.getClass();
        sb3.append(c(str6));
        sb3.append("; Android/");
        sb3.append(Build.VERSION.SDK_INT);
        sb3.append("; ");
        String property = System.getProperty("http.agent");
        sb3.append(property != null ? u.v(property, "[^\\p{ASCII}]", "", false) : "");
        return sb3.toString();
    }

    public static final String c(String str) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (w.G(cCharAt, 0, 6, "/;") <= -1) {
                sb3.append(cCharAt);
            }
        }
        return sb3.toString();
    }
}
