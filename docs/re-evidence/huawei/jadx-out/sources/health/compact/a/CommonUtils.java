package health.compact.a;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class CommonUtils {
    protected CommonUtils() {
    }

    public static int j(String str) {
        return e(str, 0);
    }

    public static int e(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        String strTrim = str.trim();
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException e) {
            LogUtil.d("HAF_CommonUtil", "getInteger ex=", e.getMessage());
            return (int) a(strTrim, i, true);
        }
    }

    public static float f(String str) {
        return c(str, 0.0f);
    }

    public static float c(String str, float f) {
        return TextUtils.isEmpty(str) ? f : a(str.trim(), f, false);
    }

    private static float a(String str, float f, boolean z) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            if (!z) {
                LogUtil.d("HAF_CommonUtil", "getFloat ex=", e.getMessage());
            }
            return f;
        }
    }

    public static double a(String str) {
        return d(str, 0.0d);
    }

    public static double d(String str, double d) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Double.valueOf(str.trim()).doubleValue();
            } catch (NumberFormatException e) {
                LogUtil.d("HAF_CommonUtil", "getDouble ex=", e.getMessage());
            }
        }
        return d;
    }

    public static long i(String str) {
        return a(str, 0L);
    }

    public static long a(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str.trim());
            } catch (NumberFormatException e) {
                LogUtil.d("HAF_CommonUtil", "getLong ex=", e.getMessage());
            }
        }
        return j;
    }

    public static long d(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str.trim(), i);
        } catch (NumberFormatException e) {
            LogUtil.d("HAF_CommonUtil", "getLongByRadix ex=", e.getMessage());
            return 0L;
        }
    }

    public static int c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str.trim(), i);
        } catch (NumberFormatException e) {
            LogUtil.d("HAF_CommonUtil", "getIntegerByRadix ex=", e.getMessage());
            return 0;
        }
    }

    public static ActivityManager j() {
        Object systemService = BaseApplication.b().getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            return (ActivityManager) systemService;
        }
        return null;
    }

    public static WindowManager t() {
        Object systemService = BaseApplication.b().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (systemService instanceof WindowManager) {
            return (WindowManager) systemService;
        }
        return null;
    }

    public static ConnectivityManager n() {
        Object systemService = BaseApplication.b().getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    public static TelephonyManager s() {
        Object systemService = BaseApplication.b().getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    public static PowerManager k() {
        Object systemService = BaseApplication.b().getSystemService("power");
        if (systemService instanceof PowerManager) {
            return (PowerManager) systemService;
        }
        return null;
    }

    public static AlarmManager m() {
        Object systemService = BaseApplication.b().getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService instanceof AlarmManager) {
            return (AlarmManager) systemService;
        }
        return null;
    }

    public static LocationManager o() {
        Object systemService = BaseApplication.b().getSystemService("location");
        if (systemService instanceof LocationManager) {
            return (LocationManager) systemService;
        }
        return null;
    }

    public static SensorManager r() {
        Object systemService = BaseApplication.b().getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            return (SensorManager) systemService;
        }
        return null;
    }

    public static NotificationManager l() {
        Object systemService = BaseApplication.b().getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService instanceof NotificationManager) {
            return (NotificationManager) systemService;
        }
        return null;
    }

    public static String g(String str) {
        File filesDir = BaseApplication.b().getFilesDir();
        if (!TextUtils.isEmpty(str)) {
            filesDir = new File(filesDir, str);
        }
        String path = filesDir.getPath();
        if (path.endsWith(File.separator)) {
            return path;
        }
        return path + File.separator;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return BaseApplication.d();
        }
        return (BaseApplication.d() + str).intern();
    }
}
