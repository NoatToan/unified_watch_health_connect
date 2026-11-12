package health.compact.a;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class SystemPropertiesReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f36662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f36663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f36664c;
    private final Method e;

    SystemPropertiesReader(String str) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsE = ReflectionUtils.e(str);
        this.f36664c = ReflectionUtils.e(clsE, "get", (Class<?>[]) new Class[]{String.class, String.class});
        this.f36663b = ReflectionUtils.e(clsE, "getBoolean", (Class<?>[]) new Class[]{String.class, Boolean.TYPE});
        this.e = ReflectionUtils.e(clsE, "getInt", (Class<?>[]) new Class[]{String.class, Integer.TYPE});
        this.f36662a = ReflectionUtils.e(clsE, "getLong", (Class<?>[]) new Class[]{String.class, Long.TYPE});
    }

    public String e(String str, String str2) {
        Method method;
        if (!TextUtils.isEmpty(str) && (method = this.f36664c) != null) {
            Object objE = ReflectionUtils.e(method, (Object) null, str, str2);
            if (objE instanceof String) {
                return (String) objE;
            }
        }
        return str2;
    }

    public boolean e(String str, boolean z) {
        Method method;
        if (!TextUtils.isEmpty(str) && (method = this.f36663b) != null) {
            Object objE = ReflectionUtils.e(method, (Object) null, str, Boolean.valueOf(z));
            if (objE instanceof Boolean) {
                return ((Boolean) objE).booleanValue();
            }
        }
        return z;
    }

    public int e(String str, int i) {
        Method method;
        if (!TextUtils.isEmpty(str) && (method = this.e) != null) {
            Object objE = ReflectionUtils.e(method, (Object) null, str, Integer.valueOf(i));
            if (objE instanceof Integer) {
                return ((Integer) objE).intValue();
            }
        }
        return i;
    }
}
