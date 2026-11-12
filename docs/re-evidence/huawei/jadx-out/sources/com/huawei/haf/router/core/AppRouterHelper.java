package com.huawei.haf.router.core;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.haf.router.NaviConsumer;
import health.compact.a.LogUtil;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouterHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile AppRouterServiceProviderService f6029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile AppRouterAutowiredService f6030b;
    private static volatile AppRouterRouteConfigService d;

    private AppRouterHelper() {
    }

    public static Guidepost a(String str) {
        return AppRouterRouteInfoLoader.c().d(str);
    }

    public static Guidepost d(String str, String str2) {
        return AppRouterRouteInfoLoader.c().a(str, str2);
    }

    public static Guidepost b(Uri uri) {
        return AppRouterRouteInfoLoader.c().d(uri);
    }

    public static boolean a(Context context, String str, boolean z) {
        AppRouterRouteInfoLoader.c();
        return AppRouterRouteInfoLoader.d(context, AppRouterRouteInfoLoader.d(str), z);
    }

    public static Object b(Context context, Guidepost guidepost, int i, NaviCallback naviCallback) {
        if (i >= 0 || naviCallback != null) {
            guidepost.d(new Holder(i, naviCallback));
        }
        return AppRouterRouteInfoLoader.c().e(context, guidepost, i, naviCallback);
    }

    public static <T> T c(Context context, Class<? extends T> cls, String str, NaviConsumer naviConsumer, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (context == null) {
                context = BaseApplication.b();
            }
            if (str.charAt(0) != '/') {
                return (T) d(context, cls, str, naviConsumer, z);
            }
            return (T) c(context, cls, AppRouterRouteInfoLoader.c().d(str), naviConsumer, z);
        }
        return (T) AppRouterRouteInfoLoader.c().a(cls);
    }

    public static <T> T a(Class<? extends T> cls) {
        return (T) AppRouterRouteInfoLoader.c().a(cls);
    }

    static AppRouterRouteConfigService d() {
        if (d == null) {
            d = new AppRouterRouteConfigService();
        }
        return d;
    }

    static AppRouterAutowiredService a() {
        if (f6030b == null) {
            f6030b = new AppRouterAutowiredService();
        }
        return f6030b;
    }

    static AppRouterServiceProviderService e() {
        if (f6029a == null) {
            f6029a = new AppRouterServiceProviderService();
        }
        return f6029a;
    }

    static Object c(Guidepost guidepost) {
        Object objK = guidepost.k();
        if (!(objK instanceof Holder)) {
            return null;
        }
        Holder holder = (Holder) objK;
        guidepost.d((Object) null);
        return holder;
    }

    static boolean c(Context context, Guidepost guidepost, String str, Object obj, boolean z) {
        RenavigateCallback renavigateCallback = new RenavigateCallback(context, guidepost, obj);
        Holder holder = obj instanceof Holder ? (Holder) obj : null;
        if (z || (holder != null && holder.d)) {
            c(context, str, new InnerInstallCallback(str, renavigateCallback, true));
        } else {
            e(context, str, new InnerInstallCallback(str, renavigateCallback, false));
        }
        return false;
    }

    static void a(Context context, Guidepost guidepost, Object obj) {
        int i;
        NaviCallback naviCallback = null;
        Holder holder = obj instanceof Holder ? (Holder) obj : null;
        if (holder != null) {
            guidepost.d(holder);
            i = holder.f6031a;
            naviCallback = holder.e;
        } else {
            i = -1;
        }
        AppRouterRouteInfoLoader.c().e(context, guidepost, i, naviCallback);
    }

    static NaviCallback d(Object obj) {
        Holder holder = obj instanceof Holder ? (Holder) obj : null;
        if (holder != null) {
            return holder.e;
        }
        return null;
    }

    private static <T> T d(Context context, Class<? extends T> cls, String str, NaviConsumer naviConsumer, boolean z) {
        String str2;
        String strSubstring;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = iIndexOf != str.length() + (-1) ? str.substring(iIndexOf + 1) : null;
            str2 = strSubstring2;
        } else {
            str2 = str;
            strSubstring = null;
        }
        String strD = AppRouterRouteInfoLoader.d(str2);
        if (AppRouterRouteInfoLoader.d(context, strD, false)) {
            return (T) b(cls, str2, strSubstring, naviConsumer);
        }
        Holder holder = new Holder(cls, naviConsumer, z);
        if (z) {
            c(context, strD, new InnerInstallCallback(strD, str2, strSubstring, holder, true));
            return null;
        }
        e(context, strD, new InnerInstallCallback(strD, str2, strSubstring, holder, false));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T b(Class<? extends T> cls, String str, String str2, NaviConsumer naviConsumer) {
        T t = (T) e().a(str, cls, str2);
        if (naviConsumer != null && t != null) {
            naviConsumer.accept(t);
        }
        return t;
    }

    private static <T> T c(Context context, Class<? extends T> cls, Guidepost guidepost, NaviConsumer naviConsumer, boolean z) {
        String strG = guidepost.g();
        String strD = AppRouterRouteInfoLoader.d(strG);
        if (AppRouterRouteInfoLoader.d(context, strD, false)) {
            return (T) AppRouterRouteInfoLoader.c().e(cls, guidepost, naviConsumer);
        }
        Holder holder = new Holder(cls, naviConsumer, z);
        if (z) {
            c(context, strD, new InnerInstallCallback(strD, strG, guidepost, holder, true));
            return null;
        }
        e(context, strD, new InnerInstallCallback(strD, strG, guidepost, holder, false));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, AppBundleLauncher.InstallCallback installCallback) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new RenavigateCallback(context, str, installCallback));
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.putExtra("moduleName", str);
        AppBundle.d().launchActivity(context, intent, installCallback);
    }

    private static void e(Context context, String str, AppBundleLauncher.InstallCallback installCallback) {
        AppBundle.d().loadPlugins(context, Collections.singletonList(str), installCallback);
    }

    static class RenavigateCallback implements AppBundleLauncher.InstallCallback, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f6037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f6038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6039c;
        private final Guidepost d;
        private final AppBundleLauncher.InstallCallback e;

        RenavigateCallback(Context context, Guidepost guidepost, Object obj) {
            this.f6037a = context;
            this.d = guidepost;
            this.f6038b = obj;
            this.f6039c = null;
            this.e = null;
        }

        RenavigateCallback(Context context, String str, AppBundleLauncher.InstallCallback installCallback) {
            this.f6037a = context;
            this.d = null;
            this.f6038b = null;
            this.f6039c = str;
            this.e = installCallback;
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public boolean call(Context context, Intent intent) {
            AppRouterHelper.a(this.f6037a, this.d, this.f6038b);
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppRouterHelper.c(this.f6037a, this.f6039c, this.e);
        }
    }

    static class InnerInstallCallback<T> implements AppBundleLauncher.InstallCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Guidepost f6035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f6036c;
        private final Holder<T> d;
        private final AppBundleLauncher.InstallCallback e;
        private final String i;
        private final String j;

        InnerInstallCallback(String str, String str2, Guidepost guidepost, Holder<T> holder, boolean z) {
            this.i = str;
            this.e = null;
            this.f6036c = z;
            this.d = holder;
            this.f6035b = guidepost;
            this.j = str2;
            this.f6034a = null;
        }

        InnerInstallCallback(String str, String str2, String str3, Holder<T> holder, boolean z) {
            this.i = str;
            this.e = null;
            this.f6036c = z;
            this.d = holder;
            this.f6035b = null;
            this.j = str2;
            this.f6034a = str3;
        }

        InnerInstallCallback(String str, AppBundleLauncher.InstallCallback installCallback, boolean z) {
            this.i = str;
            this.e = installCallback;
            this.f6036c = z;
            this.d = null;
            this.f6035b = null;
            this.j = null;
            this.f6034a = null;
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public boolean call(Context context, Intent intent) {
            AppRouterRouteInfoLoader.e(context, this.i);
            LogUtil.b("HAF_AppRouter", this.f6036c ? "gotoInstallActivity" : "gotoInstallPlugin", " InstallCallback success.");
            AppBundleLauncher.InstallCallback installCallback = this.e;
            if (installCallback != null) {
                installCallback.call(context, intent);
                return false;
            }
            Holder<T> holder = this.d;
            if (holder == null) {
                return false;
            }
            if (holder.f6031a >= 0 || this.d.e != null) {
                AppRouterRouteInfoLoader.c().e(context, this.f6035b, this.d.f6031a, this.d.e);
                return false;
            }
            if (this.d.f6032b == null) {
                return false;
            }
            if (this.f6035b == null) {
                AppRouterHelper.b(this.d.f6032b, this.j, this.f6034a, this.d.f6033c);
            } else {
                AppRouterRouteInfoLoader.c().e(this.d.f6032b, this.f6035b, this.d.f6033c);
            }
            return false;
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public void onFailed(Context context, Intent intent) {
            LogUtil.b("HAF_AppRouter", this.f6036c ? "gotoInstallActivity" : "gotoInstallPlugin", " InstallCallback failed.");
            AppBundleLauncher.InstallCallback installCallback = this.e;
            if (installCallback != null) {
                installCallback.onFailed(context, intent);
            }
        }
    }

    static class Holder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f6031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<? extends T> f6032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final NaviConsumer<T> f6033c;
        final boolean d;
        final NaviCallback e;

        Holder(int i, NaviCallback naviCallback) {
            this.f6031a = i;
            this.e = naviCallback;
            this.f6032b = null;
            this.f6033c = null;
            this.d = false;
        }

        Holder(Class<? extends T> cls, NaviConsumer<T> naviConsumer, boolean z) {
            this.f6031a = -1;
            this.e = null;
            this.f6032b = cls;
            this.f6033c = naviConsumer;
            this.d = z;
        }
    }
}
