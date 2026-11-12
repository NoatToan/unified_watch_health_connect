package com.huawei.haf.bundle.extension;

import android.text.TextUtils;
import com.huawei.haf.dynamic.ClassNotFoundInterceptor;
import health.compact.a.LogUtil;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleClassNotFoundInterceptor extends ClassNotFoundInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f5808a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BundleLoadManager f5809c;
    private final BundleLoadMode e;

    public BundleClassNotFoundInterceptor(ClassLoader classLoader, BundleLoadManager bundleLoadManager, BundleLoadMode bundleLoadMode) {
        this.f5808a = classLoader;
        this.f5809c = bundleLoadManager;
        this.e = bundleLoadMode;
        LogUtil.b("Bundle_Classloader", "load mode is : ", bundleLoadMode);
    }

    /* JADX INFO: renamed from: com.huawei.haf.bundle.extension.BundleClassNotFoundInterceptor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[BundleLoadMode.values().length];
            e = iArr;
            try {
                iArr[BundleLoadMode.MULTIPLE_CLASSLOADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[BundleLoadMode.SINGLE_CLASSLOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.huawei.haf.dynamic.ClassNotFoundInterceptor
    public Class<?> findClass(String str) {
        if (this.f5809c == null) {
            return null;
        }
        int i = AnonymousClass1.e[this.e.ordinal()];
        if (i == 1) {
            return c(str, true, false);
        }
        if (i == 2) {
            return c(str, false, true);
        }
        return c(str, true, true);
    }

    private Class<?> c(String str, boolean z, boolean z2) {
        Class<?> clsD;
        Class<?> clsC;
        if (z) {
            clsD = findClassInPlugins(str);
            if (clsD != null) {
                LogUtil.c("Bundle_Classloader", "Class ", str, " is found in Modules");
                return clsD;
            }
        } else {
            clsD = null;
        }
        String strB = ComponentInfoProvider.c().b(str);
        if (TextUtils.isEmpty(strB)) {
            return clsD;
        }
        if (this.f5809c.loadInstalledModules(Collections.singletonList(strB))) {
            clsD = d(str, z, z2);
        }
        if (clsD != null || (clsC = ComponentInfoProvider.c().c(str)) == null) {
            return clsD;
        }
        LogUtil.e("Bundle_Classloader", "Module component ", str, " is still not found, return ", clsC.getSimpleName(), " to avoid crash");
        return clsC;
    }

    private Class<?> d(String str, boolean z, boolean z2) {
        Class<?> clsLoadClass;
        if (z2) {
            try {
                clsLoadClass = this.f5808a.loadClass(str);
            } catch (ClassNotFoundException unused) {
                clsLoadClass = null;
            }
        } else {
            clsLoadClass = null;
        }
        if (clsLoadClass == null && z && (clsLoadClass = findClassInPlugins(str)) != null) {
            LogUtil.b("Bundle_Classloader", "Class ", str, " is found in Modules after loading all installed modules");
        }
        return clsLoadClass;
    }
}
