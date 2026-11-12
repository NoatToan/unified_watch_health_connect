package com.huawei.haf.router.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.router.facade.template.InterceptorGroup;
import com.huawei.haf.router.facade.template.RouteRoot;
import com.huawei.haf.router.facade.template.ServiceGroup;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterRouteInfoLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f6056a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f6057b = new ConcurrentHashMap();
    private static final Object d = new Object();
    private static volatile AppRouterEngine e;

    private AppRouterRouteInfoLoader() {
    }

    static AppRouterEngine c() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new AppRouterEngine();
                    LogUtil.b("HAF_AppRouter", "AppRouter init start");
                    e();
                    LogUtil.b("HAF_AppRouter", "AppRouter init success");
                }
            }
        }
        return e;
    }

    static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!f6056a.contains(str) && !b(str)) {
            Map<String, String> map = f6057b;
            String str2 = map.get(str);
            if (TextUtils.isEmpty(str2)) {
                c(BaseApplication.b());
                str2 = map.get(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return str;
    }

    static boolean e(String str) {
        return AppBundle.c().isBuiltInModule(BaseApplication.b(), str);
    }

    static boolean b(String str) {
        return AppBundle.c().isBundleModule(str);
    }

    static boolean a(String str) {
        return TextUtils.isEmpty(str) || f6056a.contains(str) || AppBundle.c().isExistLocalModule(str);
    }

    static boolean d(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str) || f6056a.contains(str)) {
            return true;
        }
        if (!b(str)) {
            String strD = d(str);
            if (a(context, str, strD)) {
                return true;
            }
            str = strD;
        }
        if (d(context, str)) {
            return true;
        }
        return z && c(context, str);
    }

    static void e(Context context, String str) {
        synchronized (d) {
            a(context, str);
        }
    }

    static void d(String str, String[] strArr) {
        if (b(str)) {
            synchronized (d) {
                b(str, strArr);
            }
        }
    }

    private static void e() {
        String strI = AppBundleBuildConfig.i();
        Set<String> set = f6056a;
        if (set.contains(strI)) {
            return;
        }
        b(BaseApplication.b(), strI, true);
        String[] strArr = {"router", "approuter"};
        b(strI, strArr);
        set.addAll(Arrays.asList(strArr));
        LogUtil.b("HAF_AppRouter", "initMainModuleRouteInfo success. mainModule=", strI);
    }

    private static void c(Context context) {
        Set<String> installedModules = AppBundle.d().getInstalledModules();
        if (installedModules.isEmpty()) {
            return;
        }
        synchronized (d) {
            Iterator<String> it = installedModules.iterator();
            while (it.hasNext()) {
                a(context, it.next());
            }
        }
    }

    private static boolean a(Context context, String str, String str2) {
        if (str.equals(str2) || !b(str2)) {
            if (f6056a.contains(str2)) {
                return true;
            }
            c(context);
            return true;
        }
        return f6056a.contains(str2);
    }

    private static boolean d(Context context, String str) {
        c(context);
        Set<String> set = f6056a;
        if (set.contains(str)) {
            return true;
        }
        if (!AppBundle.c().loadLocalModules(Collections.singletonList(str))) {
            return false;
        }
        if (AppBundle.d().getInstalledModules().contains(str)) {
            e(context, str);
        }
        return set.contains(str);
    }

    private static boolean c(Context context, String str) {
        if (!e(str)) {
            return false;
        }
        AppBundle.d().loadPlugins(context, Collections.singletonList(str), new InnerInstallCallback(str));
        return f6056a.contains(str);
    }

    private static void a(Context context, String str) {
        if (TextUtils.isEmpty(str) || !b(str)) {
            return;
        }
        b(context, str, false);
    }

    private static void b(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Set<String> set = f6056a;
        if (set.contains(str)) {
            return;
        }
        ClassLoader classLoader = context.getClassLoader();
        AppRouterRouteInfoReader appRouterRouteInfoReader = new AppRouterRouteInfoReader(str, classLoader);
        String[] strArrI = appRouterRouteInfoReader.i();
        if (strArrI.length > 0) {
            c(str, strArrI, classLoader);
        }
        String[] strArrA = appRouterRouteInfoReader.a();
        if (strArrA.length > 0) {
            e(str, strArrA, classLoader);
        }
        String[] strArrE = appRouterRouteInfoReader.e();
        if (strArrE.length > 0) {
            d(str, strArrE, classLoader);
        }
        String[] strArrB = appRouterRouteInfoReader.b();
        if (strArrB.length > 0) {
            b(str, strArrB);
        }
        String[] strArrD = appRouterRouteInfoReader.d();
        AppRouterHelper.a().d(strArrD);
        String[] strArrC = appRouterRouteInfoReader.c();
        AppRouterHelper.e().e(classLoader, str, strArrA);
        set.add(str);
        LogUtil.b("HAF_AppRouter", "registerRouteInfo(R, P, I, A, B)=", Arrays.asList(Integer.valueOf(strArrI.length), Integer.valueOf(strArrA.length), Integer.valueOf(strArrE.length), Integer.valueOf(strArrD.length), Integer.valueOf(strArrC.length)), ", apkModuleName=", str, ", moduleNames=", z ? Integer.valueOf(strArrB.length) : Arrays.toString(strArrB), " success.");
    }

    private static void c(String str, String[] strArr, ClassLoader classLoader) {
        try {
            for (String str2 : strArr) {
                Object objNewInstance = ReflectionUtils.e(str2, classLoader).newInstance();
                if (objNewInstance instanceof RouteRoot) {
                    ((RouteRoot) objNewInstance).loadInto(AppRouterStore.d);
                }
            }
        } catch (Exception e2) {
            c("registerRouteRoot pluginName=", str, e2);
        }
    }

    private static void e(String str, String[] strArr, ClassLoader classLoader) {
        try {
            for (String str2 : strArr) {
                Object objNewInstance = ReflectionUtils.e(str2, classLoader).newInstance();
                if (objNewInstance instanceof ServiceGroup) {
                    ((ServiceGroup) objNewInstance).loadInto(AppRouterStore.f6061a);
                }
            }
        } catch (Exception e2) {
            c("registerProvider pluginName=", str, e2);
        }
    }

    private static void d(String str, String[] strArr, ClassLoader classLoader) {
        try {
            for (String str2 : strArr) {
                Object objNewInstance = ReflectionUtils.e(str2, classLoader).newInstance();
                if (objNewInstance instanceof InterceptorGroup) {
                    ((InterceptorGroup) objNewInstance).loadInto(AppRouterStore.f6063c);
                }
            }
        } catch (Exception e2) {
            c("registerInterceptors pluginName=", str, e2);
        }
    }

    private static void c(String str, String str2, Exception exc) {
        LogUtil.d("HAF_AppRouter", str, str2, ", ex=", LogUtil.c(exc));
    }

    private static void b(String str, String[] strArr) {
        String strPut;
        String strIntern = str.intern();
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2) && (strPut = f6057b.put(str2.intern(), strIntern)) != null && !strIntern.equals(strPut)) {
                LogUtil.e("HAF_AppRouter", "registerModuleNames moduleName=", str2, " in multiple plugins[", strIntern, ", ", strPut, "]");
            }
        }
    }

    static class InnerInstallCallback implements AppBundleLauncher.InstallCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6058c;

        InnerInstallCallback(String str) {
            this.f6058c = str;
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public boolean call(Context context, Intent intent) {
            AppRouterRouteInfoLoader.e(context, this.f6058c);
            return false;
        }
    }
}
