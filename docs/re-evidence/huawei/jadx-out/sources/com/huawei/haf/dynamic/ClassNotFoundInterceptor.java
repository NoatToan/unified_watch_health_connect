package com.huawei.haf.dynamic;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassNotFoundInterceptor {
    public abstract Class<?> findClass(String str);

    protected final Class<?> findClassInPlugins(String str) {
        return DynamicApplicationLoaders.a(str, null);
    }
}
