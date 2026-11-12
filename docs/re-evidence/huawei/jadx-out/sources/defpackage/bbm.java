package defpackage;

import android.app.Application;
import android.content.Context;
import com.huawei.haf.bundle.extension.BundleLoadMode;
import com.huawei.haf.dynamic.DynamicApplicationLoaders;
import health.compact.a.ReflectionUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes22.dex */
public class bbm {
    public static boolean d(Context context, String str) {
        BundleLoadMode bundleLoadModeA = bbo.d().a();
        if (bundleLoadModeA == BundleLoadMode.SINGLE_CLASSLOADER) {
            return false;
        }
        for (baj bajVar : baq.a().c(context)) {
            if (bajVar.o() && (bundleLoadModeA == BundleLoadMode.MULTIPLE_CLASSLOADER || bajVar.p())) {
                if (b(context, str, bajVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(Context context, String str, baj bajVar) {
        for (baj.a.C0012a c0012a : bajVar.b().c()) {
            if (c0012a.c().equals(System.mapLibraryName(str))) {
                if (context instanceof Application) {
                    try {
                        System.load(new File(bbf.a().c(bajVar), c0012a.c()).getPath());
                        return true;
                    } catch (UnsatisfiedLinkError unused) {
                        return false;
                    }
                }
                ClassLoader classLoaderE = DynamicApplicationLoaders.e(bajVar.f());
                if (classLoaderE == null) {
                    break;
                }
                return c(classLoaderE, bajVar.f(), str);
            }
        }
        return false;
    }

    private static boolean c(ClassLoader classLoader, String str, String str2) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.huawei.android.bundlecore.modulelib." + str + "ModuleLibraryLoader");
            ReflectionUtils.e(clsLoadClass, "loadModuleLibrary", (Class<?>[]) new Class[]{String.class}).invoke(clsLoadClass.newInstance(), str2);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
