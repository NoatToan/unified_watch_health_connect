package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes22.dex */
public final class aza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f824a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f825c;
    private static Method d;
    private static Class<?> e;

    public static boolean d(String str, boolean z) {
        try {
            Class<?> cls = e;
            if (cls == null) {
                cls = Class.forName("android.os.SystemProperties");
                e = cls;
            }
            Method declaredMethod = f825c;
            if (declaredMethod == null) {
                declaredMethod = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                f825c = declaredMethod;
            }
            return ((Boolean) declaredMethod.invoke(null, str, Boolean.valueOf(z))).booleanValue();
        } catch (ClassNotFoundException unused) {
            e("ReflectSystemProperties", "ClassNotFoundException");
            return z;
        } catch (IllegalAccessException unused2) {
            e("ReflectSystemProperties", "IllegalAccessException");
            return z;
        } catch (IllegalArgumentException unused3) {
            e("ReflectSystemProperties", "IllegalArgumentException");
            return z;
        } catch (NoSuchMethodException unused4) {
            e("ReflectSystemProperties", "NoSuchMethodException");
            return z;
        } catch (SecurityException unused5) {
            e("ReflectSystemProperties", "SecurityException");
            return z;
        } catch (InvocationTargetException unused6) {
            e("ReflectSystemProperties", "InvocationTargetException");
            return z;
        }
    }

    public static String c(String str, String str2) {
        try {
            Class<?> cls = e;
            if (cls == null) {
                cls = Class.forName("android.os.SystemProperties");
                e = cls;
            }
            Method declaredMethod = f824a;
            if (declaredMethod == null) {
                declaredMethod = cls.getDeclaredMethod("get", String.class, String.class);
                f824a = declaredMethod;
            }
            return String.valueOf(declaredMethod.invoke(null, str, str2));
        } catch (ClassNotFoundException unused) {
            e("ReflectSystemProperties", "ClassNotFoundException");
            return str2;
        } catch (IllegalAccessException unused2) {
            e("ReflectSystemProperties", "IllegalAccessException");
            return str2;
        } catch (IllegalArgumentException unused3) {
            e("ReflectSystemProperties", "IllegalArgumentException");
            return str2;
        } catch (NoSuchMethodException unused4) {
            e("ReflectSystemProperties", "NoSuchMethodException");
            return str2;
        } catch (SecurityException unused5) {
            e("ReflectSystemProperties", "SecurityException");
            return str2;
        } catch (InvocationTargetException unused6) {
            e("ReflectSystemProperties", "InvocationTargetException");
            return str2;
        }
    }

    public static int c(String str, int i) {
        try {
            Class<?> cls = e;
            if (cls == null) {
                cls = Class.forName("android.os.SystemProperties");
                e = cls;
            }
            Method declaredMethod = d;
            if (declaredMethod == null) {
                declaredMethod = cls.getDeclaredMethod("getInt", String.class, Integer.TYPE);
                d = declaredMethod;
            }
            return ((Integer) declaredMethod.invoke(null, str, Integer.valueOf(i))).intValue();
        } catch (ClassNotFoundException unused) {
            e("ReflectSystemProperties", "ClassNotFoundException");
            return i;
        } catch (IllegalAccessException unused2) {
            e("ReflectSystemProperties", "IllegalAccessException");
            return i;
        } catch (IllegalArgumentException unused3) {
            e("ReflectSystemProperties", "IllegalArgumentException");
            return i;
        } catch (NoSuchMethodException unused4) {
            e("ReflectSystemProperties", "NoSuchMethodException");
            return i;
        } catch (SecurityException unused5) {
            e("ReflectSystemProperties", "SecurityException");
            return i;
        } catch (InvocationTargetException unused6) {
            e("ReflectSystemProperties", "InvocationTargetException");
            return i;
        }
    }

    public static void e(String str, String str2) {
        Log.e(str, c(str2));
    }

    private static String c(String str) {
        if (str != null && str.length() > 1000) {
            str = str.substring(0, 1000);
            Log.w("ReflectSystemProperties", "msg length bigger than 1000");
        }
        StringBuilder sb = new StringBuilder(str != null ? 50 + str.length() : 50);
        sb.append(str);
        return sb.toString();
    }
}
