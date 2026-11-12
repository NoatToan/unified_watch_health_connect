package com.xiaomi.mi_connect_service.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.mi_connect_service.constant.CommonConstant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class PropertyUtils {
    private static final String TAG = "PropertyUtils";

    public static String getDeviceId(Context context) {
        if (context == null) {
            return null;
        }
        return Settings.System.getString(context.getContentResolver(), "android_id");
    }

    public static String getMiuiRomVersion() {
        String systemProperty = getSystemProperty("ro.build.fingerprint");
        return systemProperty == null ? "" : systemProperty;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getProductType() {
        return Build.PRODUCT;
    }

    public static int getSdkAPILevel() {
        return Build.VERSION.SDK_INT;
    }

    public static String getSdkVersion() {
        return Build.VERSION.RELEASE;
    }

    public static synchronized String getSystemProperty(String str) {
        Class<?> cls;
        String string = null;
        if (str == null) {
            LogUtil.e(TAG, "getSystemProperty: parameter error!", new Object[0]);
            return null;
        }
        try {
            cls = Class.forName("android.os.SystemProperties");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls != null) {
            try {
                try {
                    try {
                        string = ReflectUtil.callStaticObjectMethod(cls, "get", new Class[]{String.class}, str).toString();
                    } catch (NoSuchMethodException e2) {
                        e2.printStackTrace();
                    }
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            }
        }
        return string;
    }

    public static boolean hasProperty(String str) {
        return !TextUtils.isEmpty(getSystemProperty(str));
    }

    public static boolean isProvisioned(Context context) {
        if (context == null) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(CommonConstant.SP_MICONNECT_CONFIG, 0);
        String string = sharedPreferences != null ? sharedPreferences.getString(CommonConstant.PROVISION_CLAUSE_AGREED, "false") : "false";
        LogUtil.d(TAG, "is agreed: " + string, new Object[0]);
        return TextUtils.equals(string, "true") || Settings.Secure.getInt(context.getContentResolver(), "device_provisioned", 0) != 0;
    }

    public static synchronized void setSystemProperty(String str, String str2) {
        Class<?> cls;
        if (str == null || str2 == null) {
            LogUtil.e(TAG, "setSystemProperty: parameter error!", new Object[0]);
            return;
        }
        try {
            cls = Class.forName("android.os.SystemProperties");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls != null) {
            try {
                try {
                    try {
                        ReflectUtil.callStaticObjectMethod(cls, CourseConfigModel.DevCmd.CMD_ACTION_SET, new Class[]{String.class, String.class}, str, str2);
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                }
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            }
        }
    }

    public static int settingsGetInt(Context context, String str, int i) {
        try {
            return Settings.System.getInt(context.getContentResolver(), str, i);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static String toPrintString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Integer.toHexString(bArr[i] & 255));
            if (i < bArr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized String SystemProperties_get(String str) {
        Class<?> cls;
        Method method;
        try {
            cls = Class.forName("android.os.SystemProperties");
        } catch (Exception e) {
            LogUtil.e(TAG, "SystemProperties exception: " + e, new Object[0]);
            cls = null;
        }
        if (cls == null) {
            method = null;
            if (method != null) {
                return (String) method.invoke(this, str);
            }
            return null;
        }
        try {
            method = cls.getMethod("get", String.class);
        } catch (Exception e2) {
            LogUtil.e(TAG, "getMethod exception: " + e2, new Object[0]);
            method = null;
        }
        if (method != null) {
            try {
                return (String) method.invoke(this, str);
            } catch (Exception e3) {
                LogUtil.e(TAG, "invoke exception: " + e3, new Object[0]);
                return null;
            }
        }
        return null;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized boolean SystemProperties_getBoolean(String str, boolean z) {
        Class<?> cls;
        Method method = null;
        try {
            cls = Class.forName("android.os.SystemProperties");
        } catch (Exception e) {
            LogUtil.e(TAG, "SystemProperties exception: " + e, new Object[0]);
            cls = null;
        }
        if (cls == null) {
            if (method != null) {
                return ((Boolean) method.invoke(this, str, Boolean.valueOf(z))).booleanValue();
            }
            return z;
        }
        try {
            method = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
        } catch (Exception e2) {
            LogUtil.e(TAG, "getMethod exception: " + e2, new Object[0]);
        }
        if (method != null) {
            try {
                return ((Boolean) method.invoke(this, str, Boolean.valueOf(z))).booleanValue();
            } catch (Exception e3) {
                LogUtil.e(TAG, "invoke exception: " + e3, new Object[0]);
                return z;
            }
        }
        return z;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized int SystemProperties_getInt(String str, int i) {
        Class<?> cls;
        Method method = null;
        try {
            cls = Class.forName("android.os.SystemProperties");
        } catch (Exception e) {
            LogUtil.e(TAG, "SystemProperties exception: " + e, new Object[0]);
            cls = null;
        }
        if (cls == null) {
            if (method != null) {
                return ((Integer) method.invoke(this, str, Integer.valueOf(i))).intValue();
            }
            return 0;
        }
        try {
            method = cls.getMethod("getInt", String.class, Integer.TYPE);
        } catch (Exception e2) {
            LogUtil.e(TAG, "getMethod exception: " + e2, new Object[0]);
        }
        if (method != null) {
            try {
                return ((Integer) method.invoke(this, str, Integer.valueOf(i))).intValue();
            } catch (Exception e3) {
                LogUtil.e(TAG, "invoke exception: " + e3, new Object[0]);
                return 0;
            }
        }
        return 0;
        throw th;
    }

    public static synchronized String getSystemProperty(String str, String str2) {
        String systemProperty = getSystemProperty(str);
        if (!TextUtils.isEmpty(systemProperty)) {
            str2 = systemProperty;
        }
        return str2;
    }
}
