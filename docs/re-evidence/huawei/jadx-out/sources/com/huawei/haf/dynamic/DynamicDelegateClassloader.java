package com.huawei.haf.dynamic;

import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class DynamicDelegateClassloader extends PathClassLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f5932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ClassNotFoundInterceptor f5933b;

    DynamicDelegateClassloader(ClassLoader classLoader) {
        super("", classLoader);
        this.f5932a = classLoader;
    }

    void c(ClassNotFoundInterceptor classNotFoundInterceptor) {
        this.f5933b = classNotFoundInterceptor;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> clsFindClass;
        try {
            return this.f5932a.loadClass(str);
        } catch (ClassNotFoundException e) {
            ClassNotFoundInterceptor classNotFoundInterceptor = this.f5933b;
            if (classNotFoundInterceptor == null || (clsFindClass = classNotFoundInterceptor.findClass(str)) == null) {
                throw e;
            }
            return clsFindClass;
        }
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        return this.f5932a.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        return this.f5932a.getResources(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected URL findResource(String str) {
        URL urlFindResource = super.findResource(str);
        return urlFindResource == null ? DynamicApplicationLoaders.d(str, null) : urlFindResource;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Enumeration<URL> findResources(String str) {
        Enumeration<URL> enumerationFindResources = super.findResources(str);
        return enumerationFindResources == null ? DynamicApplicationLoaders.c(str, (List<String>) null) : enumerationFindResources;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        return findClass(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        ClassLoader classLoader = this.f5932a;
        String strFindLibrary = classLoader instanceof BaseDexClassLoader ? ((BaseDexClassLoader) classLoader).findLibrary(str) : null;
        return strFindLibrary == null ? DynamicApplicationLoaders.b(str, (List<String>) null) : strFindLibrary;
    }
}
