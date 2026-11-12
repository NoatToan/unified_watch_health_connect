package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class cia {
    public static int c(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class, Integer.class).invoke(cls, str, Integer.valueOf(i));
            if (objInvoke instanceof Integer) {
                i = ((Integer) objInvoke).intValue();
            }
            cib.b("HwLowerSdkAdapter", "value: " + i);
            return i;
        } catch (ClassNotFoundException unused) {
            cib.d("HwLowerSdkAdapter", "getSysProperty ClassNotFoundException");
            return i;
        } catch (IllegalAccessException unused2) {
            cib.d("HwLowerSdkAdapter", "getSysProperty IllegalAccessException");
            return i;
        } catch (IllegalArgumentException unused3) {
            cib.d("HwLowerSdkAdapter", "getSysProperty IllegalArgumentException");
            return i;
        } catch (NoSuchMethodException unused4) {
            cib.d("HwLowerSdkAdapter", "getSysProperty NoSuchMethodException");
            return i;
        } catch (SecurityException unused5) {
            cib.d("HwLowerSdkAdapter", "getSysProperty SecurityException");
            return i;
        } catch (InvocationTargetException unused6) {
            cib.d("HwLowerSdkAdapter", "getSysProperty InvocationTargetException");
            return i;
        }
    }

    public static String c(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
            if (objInvoke instanceof String) {
                str2 = (String) objInvoke;
            }
            cib.b("HwLowerSdkAdapter", "value: " + str2);
            return str2;
        } catch (ClassNotFoundException unused) {
            cib.d("HwLowerSdkAdapter", "getSysProperty ClassNotFoundException");
            return str2;
        } catch (IllegalAccessException unused2) {
            cib.d("HwLowerSdkAdapter", "getSysProperty IllegalAccessException");
            return str2;
        } catch (IllegalArgumentException unused3) {
            cib.d("HwLowerSdkAdapter", "getSysProperty IllegalArgumentException");
            return str2;
        } catch (NoSuchMethodException unused4) {
            cib.d("HwLowerSdkAdapter", "getSysProperty NoSuchMethodException");
            return str2;
        } catch (SecurityException unused5) {
            cib.d("HwLowerSdkAdapter", "getSysProperty SecurityException");
            return str2;
        } catch (InvocationTargetException unused6) {
            cib.d("HwLowerSdkAdapter", "getSysProperty InvocationTargetException");
            return str2;
        }
    }
}
