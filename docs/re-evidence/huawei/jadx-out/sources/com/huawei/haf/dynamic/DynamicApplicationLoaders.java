package com.huawei.haf.dynamic;

import android.content.Context;
import health.compact.a.ReflectionUtils;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicApplicationLoaders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<DynamicDexClassLoader> f5931a = Collections.newSetFromMap(new ConcurrentHashMap());

    private DynamicApplicationLoaders() {
    }

    public static ClassLoader a(ClassLoader classLoader) {
        return new DynamicDelegateClassloader(classLoader);
    }

    public static void b(ClassLoader classLoader, Context context) throws DynamicLoaderException {
        ClassLoader classLoaderA = a(classLoader);
        try {
            Object obj = ReflectionUtils.e(context, "mPackageInfo").get(context);
            if (obj != null) {
                ReflectionUtils.e(obj, "mClassLoader").set(obj, classLoaderA);
                Thread.currentThread().setContextClassLoader(classLoaderA);
            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new DynamicLoaderException("reflect PackageInfo Classloader fail.", e);
        }
    }

    public static boolean b(ClassLoader classLoader) {
        return classLoader instanceof DynamicDelegateClassloader;
    }

    public static void c(ClassLoader classLoader, ClassNotFoundInterceptor classNotFoundInterceptor) {
        if (b(classLoader)) {
            ((DynamicDelegateClassloader) classLoader).c(classNotFoundInterceptor);
        }
    }

    public static ClassLoader b(String str, List<String> list, File file, File file2, List<String> list2) {
        return new DynamicDexClassLoader(str, list, file, file2 == null ? null : file2.getAbsolutePath(), list2);
    }

    public static void d(ClassLoader classLoader) {
        if (classLoader instanceof DynamicDexClassLoader) {
            f5931a.add((DynamicDexClassLoader) classLoader);
        }
    }

    public static void c(ClassLoader classLoader) {
        if (classLoader instanceof DynamicDexClassLoader) {
            f5931a.remove(classLoader);
        }
    }

    public static ClassLoader e(String str) {
        for (DynamicDexClassLoader dynamicDexClassLoader : f5931a) {
            if (str.equals(dynamicDexClassLoader.c())) {
                return dynamicDexClassLoader;
            }
        }
        return null;
    }

    static Class<?> a(String str, List<String> list) {
        for (DynamicDexClassLoader dynamicDexClassLoader : f5931a) {
            if (list == null || list.contains(dynamicDexClassLoader.c())) {
                try {
                    return dynamicDexClassLoader.e(str);
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    static URL d(String str, List<String> list) {
        URL urlB = null;
        for (DynamicDexClassLoader dynamicDexClassLoader : f5931a) {
            if (list == null || list.contains(dynamicDexClassLoader.c())) {
                urlB = dynamicDexClassLoader.b(str);
                if (urlB != null) {
                    break;
                }
            }
        }
        return urlB;
    }

    static Enumeration<URL> c(String str, List<String> list) {
        Enumeration<URL> enumerationD = null;
        for (DynamicDexClassLoader dynamicDexClassLoader : f5931a) {
            if (list == null || list.contains(dynamicDexClassLoader.c())) {
                enumerationD = dynamicDexClassLoader.d(str);
                if (enumerationD != null) {
                    break;
                }
            }
        }
        return enumerationD;
    }

    static String b(String str, List<String> list) {
        String strA = null;
        for (DynamicDexClassLoader dynamicDexClassLoader : f5931a) {
            if (list == null || list.contains(dynamicDexClassLoader.c())) {
                strA = dynamicDexClassLoader.a(str);
                if (strA != null) {
                    break;
                }
            }
        }
        return strA;
    }
}
