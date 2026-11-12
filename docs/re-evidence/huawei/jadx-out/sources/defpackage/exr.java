package defpackage;

import android.text.TextUtils;
import com.huawei.health.h5pro.utils.LogUtil;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class exr {
    private static Class<?> e;

    public static int a(String str, int i) {
        b();
        if (e != null && !TextUtils.isEmpty(str)) {
            try {
                Object objInvoke = e.getMethod("getInt", String.class, Integer.TYPE).invoke(e, str, Integer.valueOf(i));
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                LogUtil.e("H5PRO_SystemProperties", "getInt -> " + e2.getMessage());
            }
        }
        return i;
    }

    public static String a(String str, String str2) {
        b();
        if (e != null && !TextUtils.isEmpty(str)) {
            try {
                return (String) e.getMethod("get", String.class, String.class).invoke(e, str, str2);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                LogUtil.e("H5PRO_SystemProperties", "getString -> " + e2.getMessage());
            }
        }
        return str2;
    }

    private static void b() {
        if (e != null) {
            return;
        }
        try {
            e = Class.forName("android.os.SystemProperties");
        } catch (ClassNotFoundException e2) {
            LogUtil.e("H5PRO_SystemProperties", "SystemProperties -> " + e2.getMessage());
        }
    }
}
