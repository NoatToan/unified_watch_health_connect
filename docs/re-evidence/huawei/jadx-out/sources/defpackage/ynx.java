package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.wear.oversea.util.SystemPropertyValues;
import com.huawei.wisesecurity.kfs.log.ILogKfs;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
class ynx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f53689c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53690b = true;
    private final ILogKfs e;

    ynx(ILogKfs iLogKfs) {
        this.e = iLogKfs;
    }

    private static void e(int i) {
        f53689c = i;
    }

    public void d() {
        this.f53690b = false;
    }

    boolean c(Context context) {
        if (!this.f53690b) {
            this.e.i("BIChecker", "oobe check is off, report is on");
            return false;
        }
        if (!g()) {
            this.e.i("BIChecker", "not huawei device, report is on");
            return false;
        }
        if (context == null) {
            return true;
        }
        if (e()) {
            return f53689c == 0;
        }
        this.e.i("BIChecker", "not ChinaROM");
        try {
            e(Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state"));
            this.e.i("BIChecker", "hw_app_analytics_state value is " + f53689c);
            return f53689c != 1;
        } catch (Settings.SettingNotFoundException unused) {
            this.e.i("BIChecker", "Get OOBE failed");
            return true;
        }
    }

    private boolean e() {
        String strB = b();
        if (!TextUtils.isEmpty(strB)) {
            return "cn".equalsIgnoreCase(strB);
        }
        String strA = a();
        if (!TextUtils.isEmpty(strA)) {
            return strA.toLowerCase(Locale.US).contains("cn");
        }
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            return false;
        }
        return "cn".equalsIgnoreCase(strC);
    }

    private boolean g() {
        return "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER);
    }

    private String b() {
        return yod.c("ro.product.locale.region", "");
    }

    private String a() {
        return yod.c(SystemPropertyValues.PROP_LOCALE_KEY, "");
    }

    private String c() {
        return Locale.getDefault().getCountry();
    }
}
