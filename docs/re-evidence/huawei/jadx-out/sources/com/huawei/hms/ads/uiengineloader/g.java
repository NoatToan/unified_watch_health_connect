package com.huawei.hms.ads.uiengineloader;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes33.dex */
public final class g extends PathClassLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12912a = "g";

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                af.c(f12912a, "Cannot find The class:".concat(String.valueOf(str)));
            }
        }
        return super.loadClass(str, z);
    }

    public g(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }
}
