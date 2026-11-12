package com.huawei.haf.router.core;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouterResultReceiver;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.haf.router.NaviConsumer;
import com.huawei.haf.router.NaviPluginCallback;
import com.huawei.haf.router.facade.service.ExtendRouteService;
import com.huawei.haf.router.facade.service.PretreatmentService;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterPretreatmentService {
    private final AppRouterRouteConfigService e = AppRouterHelper.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExtendRouteService f6047b = (ExtendRouteService) AppRouterHelper.a(ExtendRouteService.class);

    private boolean a(int i) {
        return (i & 1048576) == 1048576;
    }

    private boolean b(int i) {
        return (i & 2097152) == 2097152;
    }

    private boolean c(int i) {
        return (i & 4194304) == 4194304;
    }

    private boolean e(int i) {
        return (i & 131072) == 131072;
    }

    AppRouterPretreatmentService() {
    }

    boolean a(Guidepost guidepost) {
        int pathExtras;
        Object objC = AppRouterHelper.c(guidepost);
        String strG = guidepost.g();
        if ("approuter".equals(strG)) {
            return true;
        }
        String strL = guidepost.l();
        if (TextUtils.isEmpty(strG)) {
            LogUtil.e("HAF_Pretreatment", "without group information, it is illegal, path=", strL);
            b(guidepost, objC);
            return false;
        }
        String strE = ProcessUtil.e(this.e.e(strL));
        ExtendRouteService extendRouteService = this.f6047b;
        ExtendRouteService.RouteInfo routeInfoTryExtractRouteInfo = extendRouteService != null ? extendRouteService.tryExtractRouteInfo(guidepost) : null;
        if (routeInfoTryExtractRouteInfo != null) {
            String moduleOrGroup = routeInfoTryExtractRouteInfo.getModuleOrGroup();
            if (!TextUtils.isEmpty(moduleOrGroup)) {
                strG = moduleOrGroup;
            }
            pathExtras = routeInfoTryExtractRouteInfo.getPathExtras();
            String runningProcess = routeInfoTryExtractRouteInfo.getRunningProcess();
            if (!TextUtils.isEmpty(runningProcess)) {
                strE = runningProcess;
            }
        } else {
            pathExtras = 0;
        }
        String strD = d(strL, AppRouterRouteInfoLoader.d(strG));
        int iE = e(strL, pathExtras);
        int iH = guidepost.h();
        try {
            guidepost.c(iE);
            if (!d(guidepost, strD, strE, objC)) {
                guidepost.c(iH);
                return false;
            }
            guidepost.c(iH);
            Context contextE = guidepost.e();
            boolean zD = d(iE);
            if (AppRouterRouteInfoLoader.d(contextE, strD, false)) {
                return e(contextE, guidepost, strD, objC, zD);
            }
            return AppRouterHelper.c(contextE, guidepost, strD, objC, zD);
        } catch (Throwable th) {
            guidepost.c(iH);
            throw th;
        }
    }

    private boolean d(Guidepost guidepost, String str, String str2, Object obj) {
        NaviCallback naviCallbackD = AppRouterHelper.d(obj);
        if (naviCallbackD == null) {
            naviCallbackD = new AppRouterResultReceiver();
        }
        if (TextUtils.isEmpty(str) || !AppRouterRouteInfoLoader.b(str)) {
            d(guidepost, naviCallbackD);
            return c(guidepost, str, str2, naviCallbackD);
        }
        if (AppRouterRouteInfoLoader.a(str) || AppRouterRouteInfoLoader.e(str)) {
            a(guidepost, naviCallbackD, str);
            return c(guidepost, str, str2, naviCallbackD);
        }
        c(guidepost, naviCallbackD, str);
        return c(guidepost, str, str2, naviCallbackD);
    }

    private boolean c(Guidepost guidepost, String str, String str2, NaviCallback naviCallback) {
        if (this.f6047b == null) {
            return true;
        }
        if (b(guidepost, naviCallback, str2) && this.f6047b.handleStartComponent(guidepost, naviCallback, str)) {
            return this.f6047b.handleRoute(guidepost, naviCallback, str);
        }
        return false;
    }

    private boolean b(Guidepost guidepost, NaviCallback naviCallback, String str) {
        if (e(guidepost.h()) || ProcessUtil.c().equals(str)) {
            return true;
        }
        if (e(guidepost, naviCallback, str)) {
            return false;
        }
        return this.f6047b.handleRunningProcess(guidepost, naviCallback, str);
    }

    private boolean e(Guidepost guidepost, NaviCallback naviCallback, String str) {
        Uri uriD = this.e.d(str);
        if (uriD == null) {
            return false;
        }
        guidepost.e().getContentResolver().call(uriD, "navigate", (String) null, AppRouterResultReceiver.e(guidepost, naviCallback));
        LogUtil.b("HAF_Pretreatment", "remote navigate, path=", guidepost.l(), ", target=", str);
        return true;
    }

    private boolean e(Context context, Guidepost guidepost, String str, Object obj, boolean z) {
        String strA = this.e.a(guidepost.l());
        if (TextUtils.isEmpty(strA)) {
            return e(context, guidepost, obj, null);
        }
        PretreatmentService pretreatmentService = (PretreatmentService) AppRouterHelper.c(context, PretreatmentService.class, strA, (NaviConsumer) null, false);
        if (pretreatmentService != null) {
            return e(context, guidepost, obj, pretreatmentService);
        }
        if (!AppRouterRouteInfoLoader.a(str)) {
            AppRouterHelper.c(context, PretreatmentService.class, strA, new RenavigateConsumer(context, guidepost, obj), z);
        }
        return false;
    }

    private boolean e(Context context, Guidepost guidepost, Object obj, PretreatmentService pretreatmentService) {
        if (pretreatmentService != null && !pretreatmentService.onPretreatment(context, guidepost)) {
            d(guidepost, obj);
            return false;
        }
        if (this.e.d("HAF_Pretreatment", guidepost.l(), (AppRouterRouteConfigService.RouteConfigInfo) null)) {
            return true;
        }
        b(guidepost, obj);
        return false;
    }

    private String d(String str, String str2) {
        boolean zB = AppRouterRouteInfoLoader.b(str2);
        String str3 = zB ? str2 : null;
        String strA = this.e.a(str);
        String strE = AppRouterUtils.e(strA);
        if (!TextUtils.isEmpty(strE)) {
            String strD = AppRouterRouteInfoLoader.d(strE);
            if (!str2.equals(strD) && AppRouterRouteInfoLoader.b(strD)) {
                if (zB && AppRouterRouteInfoLoader.a(strD)) {
                    if (zB && !AppRouterRouteInfoLoader.a(str2)) {
                        return str2;
                    }
                    LogUtil.e("HAF_Pretreatment", "getRealPluginName path=", str, " and pretreatmentPath=", strA, " is not in same plugin.");
                }
                return strD;
            }
        }
        return str3;
    }

    private void d(Guidepost guidepost, NaviCallback naviCallback) {
        ExtendRouteService extendRouteService = this.f6047b;
        if (extendRouteService != null) {
            extendRouteService.onPluginNone(guidepost);
        }
        if (naviCallback instanceof NaviPluginCallback) {
            ((NaviPluginCallback) naviCallback).onPluginNone(guidepost);
        }
    }

    private void a(Guidepost guidepost, NaviCallback naviCallback, String str) {
        ExtendRouteService extendRouteService = this.f6047b;
        if (extendRouteService != null) {
            extendRouteService.onPluginFound(guidepost, str);
        }
        if (naviCallback instanceof NaviPluginCallback) {
            ((NaviPluginCallback) naviCallback).onPluginFound(guidepost, str);
        }
    }

    private void c(Guidepost guidepost, NaviCallback naviCallback, String str) {
        ExtendRouteService extendRouteService = this.f6047b;
        if (extendRouteService != null) {
            extendRouteService.onPluginLost(guidepost, str);
        }
        if (naviCallback instanceof NaviPluginCallback) {
            ((NaviPluginCallback) naviCallback).onPluginLost(guidepost, str);
        }
    }

    private void b(Guidepost guidepost, Object obj) {
        NaviCallback naviCallbackD = AppRouterHelper.d(obj);
        if (naviCallbackD != null) {
            naviCallbackD.onLost(guidepost);
        }
    }

    private void d(Guidepost guidepost, Object obj) {
        NaviCallback naviCallbackD = AppRouterHelper.d(obj);
        if (naviCallbackD != null) {
            naviCallbackD.onFound(guidepost);
        }
    }

    private int e(String str, int i) {
        int iC = i | this.e.c(str);
        if (!this.e.j(str)) {
            iC |= 131072;
        } else if (!TextUtils.isEmpty(this.e.e(str))) {
            iC &= -131073;
        }
        if (!c(iC)) {
            return iC;
        }
        int i2 = (-6291457) & iC;
        return (BaseApplication.h() || a(i2)) ? i2 : i2 | 2097152;
    }

    private boolean d(int i) {
        return (b(i) || a(i)) ? false : true;
    }

    static class RenavigateConsumer<T> implements NaviConsumer<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f6048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Guidepost f6049b;
        private final Object d;

        RenavigateConsumer(Context context, Guidepost guidepost, Object obj) {
            this.f6048a = context;
            this.f6049b = guidepost;
            this.d = obj;
        }

        @Override // com.huawei.haf.router.NaviConsumer
        public void accept(T t) {
            AppRouterHelper.a(this.f6048a, this.f6049b, this.d);
        }
    }
}
