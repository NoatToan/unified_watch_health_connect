package defpackage;

import android.util.Log;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.acl.NotOwnerException;
import java.sql.SQLException;
import java.util.ConcurrentModificationException;
import java.util.MissingResourceException;

/* JADX INFO: loaded from: classes.dex */
public class ork {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f44607b = false;
    private static boolean d = false;

    static {
        try {
            Field field = Log.class.getField("HWLog");
            Field field2 = Log.class.getField("HWModuleLog");
            f44607b = field.getBoolean(null);
            boolean z = field2.getBoolean(null);
            d = z;
            f44607b = f44607b || (z && Log.isLoggable("LogUtils", 3));
            Log.i("LogUtils", "HwDebug:" + f44607b + " HwModuleDebug:" + d);
        } catch (IllegalAccessException e) {
            Log.e("LogUtils", "error:getLogField--IllegalAccessException" + c(e));
        } catch (IllegalArgumentException e2) {
            Log.e("LogUtils", "error:getLogField--IllegalArgumentException" + c(e2));
        } catch (NoSuchFieldException e3) {
            Log.e("LogUtils", "error:getLogField--NoSuchFieldException" + c(e3));
        }
    }

    public static void a(String str, String str2) {
        Log.i("PictureSecuritySDK", str + " info:" + str2);
    }

    public static void e(String str, String str2) {
        Log.w("PictureSecuritySDK", str + " warn: " + str2);
    }

    public static void b(String str, String str2) {
        Log.e("PictureSecuritySDK", str + " error:" + str2);
    }

    public static void a(String str, String str2, Throwable th) {
        Log.e("PictureSecuritySDK", str + " error:" + str2 + Constants.LINK + c(th));
    }

    public static String c(Throwable th) {
        if (th == null) {
            return "null Throwable";
        }
        if (th instanceof Exception) {
            if ((th instanceof IOException) || th.toString().contains("IOException") || th.toString().contains("FileNotFoundException") || (th instanceof MissingResourceException) || (th instanceof NotOwnerException) || (th instanceof ConcurrentModificationException) || (th instanceof SQLException) || th.toString().contains("InsufficientResourcesException")) {
                return th.getClass().getSimpleName();
            }
        } else if (th instanceof Error) {
            if ((th instanceof IOError) || th.toString().contains("IOException") || th.toString().contains("IOError") || th.toString().contains("FileNotFoundException") || (th instanceof OutOfMemoryError) || (th instanceof StackOverflowError)) {
                return th.getClass().getSimpleName();
            }
        } else if (th.toString().contains("IOException") || th.toString().contains("IOError") || th.toString().contains("FileNotFoundException")) {
            return th.getClass().getSimpleName();
        }
        return th.toString();
    }
}
