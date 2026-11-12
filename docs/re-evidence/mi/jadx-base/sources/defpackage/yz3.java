package defpackage;

import cn.hutool.core.convert.BasicType;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.SimpleCache;
import java.lang.reflect.Array;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public class yz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Class<?>> f40707a = new ConcurrentHashMap(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleCache<String, Class<?>> f40708b = new SimpleCache<>();

    static {
        ArrayList<Class<?>> arrayList = new ArrayList(32);
        arrayList.addAll(BasicType.PRIMITIVE_WRAPPER_MAP.keySet());
        arrayList.add(boolean[].class);
        arrayList.add(byte[].class);
        arrayList.add(char[].class);
        arrayList.add(double[].class);
        arrayList.add(float[].class);
        arrayList.add(int[].class);
        arrayList.add(long[].class);
        arrayList.add(short[].class);
        arrayList.add(Void.TYPE);
        for (Class<?> cls : arrayList) {
            f40707a.put(cls.getName(), cls);
        }
    }

    public static ClassLoader b() {
        ClassLoader classLoaderC = c();
        if (classLoaderC != null) {
            return classLoaderC;
        }
        ClassLoader classLoader = yz3.class.getClassLoader();
        return classLoader == null ? d() : classLoader;
    }

    public static ClassLoader c() {
        return System.getSecurityManager() == null ? Thread.currentThread().getContextClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: xz3
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return yz3.e();
            }
        });
    }

    public static ClassLoader d() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: wz3
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ClassLoader.getSystemClassLoader();
            }
        });
    }

    public static /* synthetic */ ClassLoader e() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class<?> f(String str, ClassLoader classLoader, boolean z) throws UtilException {
        Class<?> clsI;
        qk1.u(str, "Name must not be null", new Object[0]);
        Class<?> clsH = h(str);
        if (clsH == null) {
            clsH = f40708b.get(str);
        }
        if (clsH != null) {
            return clsH;
        }
        if (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            clsI = Array.newInstance(f(str.substring(0, str.length() - 2), classLoader, z), 0).getClass();
        } else if (str.startsWith("[L") && str.endsWith(";")) {
            clsI = Array.newInstance(f(str.substring(2, str.length() - 1), classLoader, z), 0).getClass();
        } else if (str.startsWith("[")) {
            clsI = Array.newInstance(f(str.substring(1), classLoader, z), 0).getClass();
        } else {
            if (classLoader == null) {
                classLoader = b();
            }
            try {
                clsI = Class.forName(str, z, classLoader);
            } catch (ClassNotFoundException e) {
                clsI = i(str, classLoader, z);
                if (clsI == null) {
                    throw new UtilException(e);
                }
            }
        }
        return f40708b.put(str, clsI);
    }

    public static Class<?> g(String str, boolean z) throws UtilException {
        return f(str, null, z);
    }

    public static Class<?> h(String str) {
        if (tt3.H(str)) {
            String strTrim = str.trim();
            if (strTrim.length() <= 8) {
                return f40707a.get(strTrim);
            }
        }
        return null;
    }

    public static Class<?> i(String str, ClassLoader classLoader, boolean z) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf <= 0) {
            return null;
        }
        try {
            return Class.forName(str.substring(0, iLastIndexOf) + Typography.dollar + str.substring(iLastIndexOf + 1), z, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
