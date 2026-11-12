package com.huawei.haf.dynamic;

import android.text.TextUtils;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class DynamicDexClassLoader extends BaseDexClassLoader {
    private final String d;
    private final List<String> e;

    DynamicDexClassLoader(String str, List<String> list, File file, String str2, List<String> list2) {
        super(list == null ? "" : TextUtils.join(File.pathSeparator, list), file, str2, DynamicDexClassLoader.class.getClassLoader());
        this.d = str;
        this.e = list2 == null ? Collections.EMPTY_LIST : list2;
    }

    String c() {
        return this.d;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> clsA;
        try {
            return super.findClass(str);
        } catch (ClassNotFoundException e) {
            if (this.e.isEmpty() || (clsA = DynamicApplicationLoaders.a(str, this.e)) == null) {
                throw e;
            }
            return clsA;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        String strFindLibrary = super.findLibrary(str);
        if (strFindLibrary == null && !this.e.isEmpty()) {
            strFindLibrary = DynamicApplicationLoaders.b(str, this.e);
        }
        if (strFindLibrary == null) {
            ClassLoader parent = getParent();
            if (parent instanceof BaseDexClassLoader) {
                return ((BaseDexClassLoader) parent).findLibrary(str);
            }
        }
        return strFindLibrary;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Enumeration<URL> findResources(String str) {
        Enumeration<URL> enumerationFindResources = super.findResources(str);
        return (enumerationFindResources != null || this.e.isEmpty()) ? enumerationFindResources : DynamicApplicationLoaders.c(str, this.e);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected URL findResource(String str) {
        URL urlFindResource = super.findResource(str);
        return (urlFindResource != null || this.e.isEmpty()) ? urlFindResource : DynamicApplicationLoaders.d(str, this.e);
    }

    URL b(String str) {
        return super.findResource(str);
    }

    Enumeration<URL> d(String str) {
        return super.findResources(str);
    }

    String a(String str) {
        return super.findLibrary(str);
    }

    Class<?> e(String str) throws ClassNotFoundException {
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        return clsFindLoadedClass != null ? clsFindLoadedClass : super.findClass(str);
    }
}
