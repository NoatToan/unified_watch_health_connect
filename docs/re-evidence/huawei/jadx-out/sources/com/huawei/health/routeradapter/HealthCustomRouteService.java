package com.huawei.health.routeradapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.haf.router.facade.service.ExtendRouteService;
import com.huawei.health.R;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.maps.offlinedata.DeviceTypeConsts;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.WebViewHelp;
import defpackage.gvd;
import defpackage.iov;
import defpackage.ive;
import defpackage.mgg;
import defpackage.nty;
import defpackage.ohf;
import defpackage.qre;
import defpackage.tfn;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.Utils;
import java.net.URISyntaxException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class HealthCustomRouteService implements ExtendRouteService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f8701c = false;

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.huawei.haf.router.facade.service.ExtendRouteService
    public ExtendRouteService.RouteInfo tryExtractRouteInfo(Guidepost guidepost) {
        byte b2;
        if (guidepost.o() == null) {
            return null;
        }
        String strL = guidepost.l();
        strL.hashCode();
        int iHashCode = strL.hashCode();
        if (iHashCode != -1405805462) {
            if (iHashCode != -354535048) {
                if (iHashCode == 931197178 && strL.equals("/router/startPage")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strL.equals("/HuaweiHealth/startComponent")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strL.equals("/router/startService")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return e(guidepost);
        }
        if (b2 == 1) {
            return a(guidepost);
        }
        if (b2 != 2) {
            return null;
        }
        return b(guidepost);
    }

    @Override // com.huawei.haf.router.facade.service.ExtendRouteService
    public boolean handleRunningProcess(Guidepost guidepost, NaviCallback naviCallback, String str) {
        if (BaseApplication.d().equals(str)) {
            d(guidepost, naviCallback);
            LogUtil.b("Login_CustomRoute", "startMainProcessRunDeepLink, path=", guidepost.l());
            return false;
        }
        LogUtil.e("Login_CustomRoute", "handleRunningProcess, process=", str, ", path=", guidepost.l());
        naviCallback.onLost(guidepost);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.huawei.haf.router.facade.service.ExtendRouteService
    public boolean handleStartComponent(Guidepost guidepost, NaviCallback naviCallback, String str) {
        byte b2;
        if (guidepost.o() == null) {
            return true;
        }
        String strL = guidepost.l();
        strL.hashCode();
        int iHashCode = strL.hashCode();
        if (iHashCode != -1405805462) {
            if (iHashCode != -354535048) {
                if (iHashCode == 931197178 && strL.equals("/router/startPage")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strL.equals("/HuaweiHealth/startComponent")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strL.equals("/router/startService")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return a(guidepost, naviCallback, str);
        }
        if (b2 == 1) {
            return c(guidepost, naviCallback, str);
        }
        if (b2 != 2) {
            return true;
        }
        return d(guidepost, naviCallback, str);
    }

    @Override // com.huawei.haf.router.facade.service.ExtendRouteService
    public boolean handleRoute(Guidepost guidepost, NaviCallback naviCallback, String str) {
        if (!ProcessUtil.b() || (b(guidepost.e(), guidepost, naviCallback) && c(guidepost.e(), guidepost, naviCallback, str))) {
            return b(guidepost.e(), guidepost);
        }
        return false;
    }

    private String b(Guidepost guidepost, String str) {
        String string = guidepost.d().getString(str);
        return (!TextUtils.isEmpty(string) || guidepost.o() == null) ? string : guidepost.o().getQueryParameter(str);
    }

    private void d(Guidepost guidepost, NaviCallback naviCallback) {
        Context contextB = BaseApplication.b();
        Intent intent = new Intent("com.huawei.health.track.broadcast");
        intent.setPackage(contextB.getPackageName());
        intent.putExtra("command_type", "PULL_RUN_DEEPLINK");
        AppRouterUtils.e(intent, guidepost, naviCallback);
        contextB.sendBroadcast(intent, SecurityConstant.f5920a);
    }

    private boolean d(Guidepost guidepost, NaviCallback naviCallback, String str) {
        Intent intentD = d(guidepost, true);
        if (intentD == null) {
            naviCallback.onLost(guidepost);
            return false;
        }
        Context contextE = guidepost.e();
        ResolveInfo resolveInfoResolveActivity = contextE.getPackageManager().resolveActivity(intentD, 131072);
        if (!e(guidepost, resolveInfoResolveActivity)) {
            naviCallback.onLost(guidepost);
            return false;
        }
        naviCallback.onFound(guidepost);
        intentD.setClassName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
        if (!TextUtils.isEmpty(str)) {
            intentD.putExtra("moduleName", str);
        }
        new d(this, contextE, intentD).c();
        LogUtil.b("Login_CustomRoute", "startActivity success, info=", resolveInfoResolveActivity.activityInfo);
        naviCallback.onArrival(guidepost);
        return false;
    }

    private boolean e(Guidepost guidepost, ResolveInfo resolveInfo) {
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            LogUtil.e("Login_CustomRoute", "startActivity fail, uri=", guidepost.o());
            return false;
        }
        if (!resolveInfo.activityInfo.exported) {
            LogUtil.e("Login_CustomRoute", "startActivity fail, not exported, info=", resolveInfo.activityInfo);
            return false;
        }
        if (!resolveInfo.activityInfo.enabled) {
            LogUtil.e("Login_CustomRoute", "startActivity fail, not enabled, info=", resolveInfo.activityInfo);
            return false;
        }
        if (TextUtils.isEmpty(resolveInfo.activityInfo.permission)) {
            return true;
        }
        LogUtil.e("Login_CustomRoute", "startActivity fail, has permission, info=", resolveInfo.activityInfo);
        return false;
    }

    private boolean a(Guidepost guidepost, NaviCallback naviCallback, String str) {
        Intent intentD = d(guidepost, false);
        if (intentD == null) {
            naviCallback.onLost(guidepost);
            return false;
        }
        Context contextE = guidepost.e();
        ResolveInfo resolveInfoResolveService = contextE.getPackageManager().resolveService(intentD, 131072);
        if (!c(guidepost, resolveInfoResolveService)) {
            naviCallback.onLost(guidepost);
            return false;
        }
        naviCallback.onFound(guidepost);
        intentD.setClassName(resolveInfoResolveService.serviceInfo.packageName, resolveInfoResolveService.serviceInfo.name);
        c(contextE, intentD, str, "startService", resolveInfoResolveService.serviceInfo.toString());
        return false;
    }

    private boolean c(Guidepost guidepost, ResolveInfo resolveInfo) {
        if (resolveInfo == null || resolveInfo.serviceInfo == null) {
            LogUtil.e("Login_CustomRoute", "startService fail, uri=", guidepost.o());
            return false;
        }
        if (!resolveInfo.serviceInfo.exported) {
            LogUtil.e("Login_CustomRoute", "startService fail, not exported, info=", resolveInfo.serviceInfo);
            return false;
        }
        if (!resolveInfo.serviceInfo.enabled) {
            LogUtil.e("Login_CustomRoute", "startService fail, not enabled, info=", resolveInfo.serviceInfo);
            return false;
        }
        if (TextUtils.isEmpty(resolveInfo.serviceInfo.permission)) {
            return true;
        }
        LogUtil.e("Login_CustomRoute", "startService fail, has permission, info=", resolveInfo.serviceInfo);
        return false;
    }

    private boolean c(Guidepost guidepost, NaviCallback naviCallback, String str) {
        Map<String, String> mapA = AppRouterUtils.a(guidepost.o());
        String str2 = mapA.get("type");
        if (!"activity".equals(str2) && !"service".equals(str2)) {
            LogUtil.e("Login_CustomRoute", "startComponent type error, uri=", guidepost.o());
            naviCallback.onLost(guidepost);
            return false;
        }
        boolean z = Boolean.parseBoolean(mapA.get("onlyPlugin"));
        if (!z) {
            LogUtil.e("Login_CustomRoute", "startComponent need plugin, uri=", guidepost.o());
            naviCallback.onLost(guidepost);
            return false;
        }
        String str3 = mapA.get("className");
        if (TextUtils.isEmpty(str3)) {
            LogUtil.e("Login_CustomRoute", "startComponent class name error, uri=", guidepost.o());
            naviCallback.onLost(guidepost);
            return false;
        }
        if (TextUtils.isEmpty(AppBundle.c().getModuleForComponent(str3)) && z) {
            LogUtil.e("Login_CustomRoute", "startComponent not plugin, uri=", guidepost.o());
            naviCallback.onLost(guidepost);
            return false;
        }
        Intent intent = new Intent();
        String packageName = mapA.get("package");
        Context contextE = guidepost.e();
        if (TextUtils.isEmpty(packageName)) {
            packageName = contextE.getPackageName();
        }
        intent.setClassName(packageName, str3);
        if (!b(guidepost, intent, packageName, str2)) {
            LogUtil.b("Login_CustomRoute", "startComponent check fail, info=", guidepost.o());
            naviCallback.onLost(guidepost);
            return false;
        }
        naviCallback.onFound(guidepost);
        if ("activity".equals(str2)) {
            new d(this, contextE, intent).c();
            LogUtil.b("Login_CustomRoute", "startComponent success, info=", guidepost.o());
            naviCallback.onArrival(guidepost);
        } else {
            c(contextE, intent, str, "startComponent", guidepost.o().toString());
        }
        return false;
    }

    private boolean b(Guidepost guidepost, Intent intent, String str, String str2) {
        Context contextE = guidepost.e();
        if (contextE.getPackageName().equals(str)) {
            return true;
        }
        if ("activity".equals(str2)) {
            return e(guidepost, contextE.getPackageManager().resolveActivity(intent, 131072));
        }
        return c(guidepost, contextE.getPackageManager().resolveService(intent, 131072));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, Intent intent, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            try {
                context.startService(intent);
                LogUtil.b("Login_CustomRoute", str2, " success, info=", str3);
                return;
            } catch (IllegalStateException | SecurityException e) {
                LogUtil.b("Login_CustomRoute", str2, " error. ex=", LogUtil.c(e));
                return;
            }
        }
        intent.putExtra("moduleName", str);
        new d(context, intent, str2, str3).c();
    }

    private ExtendRouteService.RouteInfo b(Guidepost guidepost) {
        guidepost.d().remove("GpIt7wO5vki3");
        Intent intentD = d(guidepost, true);
        if (intentD != null) {
            guidepost.d().putParcelable("GpIt7wO5vki3", intentD);
            ResolveInfo resolveInfoResolveActivity = guidepost.e().getPackageManager().resolveActivity(intentD, 131072);
            if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
                a aVar = new a();
                aVar.f8703b = AppBundle.c().getModuleForComponent(resolveInfoResolveActivity.activityInfo.name);
                if (TextUtils.isEmpty(aVar.f8703b)) {
                    aVar.f8703b = b(guidepost, "moduleOrGroup");
                }
                aVar.d = AppRouterUtils.b(b(guidepost, "pathExtras"));
                aVar.d |= 131072;
                aVar.f8702a = resolveInfoResolveActivity.activityInfo.processName;
                return aVar;
            }
        }
        return null;
    }

    private ExtendRouteService.RouteInfo e(Guidepost guidepost) {
        guidepost.d().remove("GpIt7wO5vki3");
        Intent intentD = d(guidepost, false);
        if (intentD != null) {
            guidepost.d().putParcelable("GpIt7wO5vki3", intentD);
            ResolveInfo resolveInfoResolveService = guidepost.e().getPackageManager().resolveService(intentD, 131072);
            if (resolveInfoResolveService != null && resolveInfoResolveService.serviceInfo != null) {
                a aVar = new a();
                aVar.f8703b = AppBundle.c().getModuleForComponent(resolveInfoResolveService.serviceInfo.name);
                if (TextUtils.isEmpty(aVar.f8703b)) {
                    aVar.f8703b = b(guidepost, "moduleOrGroup");
                }
                aVar.d = AppRouterUtils.b(b(guidepost, "pathExtras"));
                aVar.d |= 131072;
                aVar.f8702a = resolveInfoResolveService.serviceInfo.processName;
                return aVar;
            }
        }
        return null;
    }

    private ExtendRouteService.RouteInfo a(Guidepost guidepost) {
        String strB = b(guidepost, "className");
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        a aVar = new a();
        aVar.f8703b = AppBundle.c().getModuleForComponent(strB);
        aVar.d |= 131072;
        return aVar;
    }

    private Intent d(Guidepost guidepost, boolean z) {
        Intent uri = (Intent) guidepost.d().getParcelable("GpIt7wO5vki3");
        if (uri != null) {
            return uri;
        }
        Uri uriO = guidepost.o();
        String queryParameter = uriO.getQueryParameter(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                uri = Intent.parseUri(queryParameter, 1);
                uri.removeFlags(1);
                uri.removeFlags(2);
                if (z) {
                    uri.addCategory("android.intent.category.BROWSABLE");
                }
                uri.setComponent(null);
                uri.setSelector(null);
                return uri;
            } catch (URISyntaxException e) {
                LogUtil.e("Login_CustomRoute", "Intent parseUri error. ex=", LogUtil.c(e), ", uri=", uriO.toString());
                return uri;
            }
        }
        String queryParameter2 = uriO.getQueryParameter("action");
        if (TextUtils.isEmpty(queryParameter2)) {
            LogUtil.e("Login_CustomRoute", "Intent action error. uri=", uriO.toString());
            return uri;
        }
        String queryParameter3 = uriO.getQueryParameter("package");
        Intent intent = new Intent(queryParameter2);
        if (TextUtils.isEmpty(queryParameter3)) {
            queryParameter3 = BaseApplication.d();
        }
        intent.setPackage(queryParameter3);
        intent.putExtras(guidepost.d());
        intent.putExtra("originalUri", uriO.toString());
        return intent;
    }

    private boolean b(Context context, Guidepost guidepost, NaviCallback naviCallback) {
        int iH = guidepost.h();
        if (iH == 1) {
            if (ive.c().getAdapter() == null) {
                ive.c().setAdapter(PluginHealthTrackAdapterImpl.getInstance(BaseApplication.b()));
            }
            return true;
        }
        if (iH != 2) {
            if (iH != 3) {
                if (iH != 4 || mgg.d("Login_CustomRoute") != null) {
                    return true;
                }
                iov.d(BaseApplication.b(), Constants.HOME_TAB_DEVICE, qre.f(R.string.IDS_error_bluetooth_disabled));
                return false;
            }
            Uri uriO = guidepost.o();
            if (uriO == null) {
                return false;
            }
            LogUtil.b("Login_CustomRoute", "uri is ", uriO.toString());
            String queryParameter = uriO.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
            String queryParameter2 = uriO.getQueryParameter("address");
            LogUtil.b("Login_CustomRoute", "uri is ", uriO.toString(), " from is ", queryParameter, " address is ", queryParameter2);
            if (DeviceTypeConsts.WATCH.equals(queryParameter) && !f8701c && HealthRouterExtras.d().contains(gvd.a(queryParameter2)) && !MainInteractors.e()) {
                LogUtil.b("Login_CustomRoute", "coldStart and sync");
                f8701c = true;
                tfn.a().b(2);
            }
        }
        return true;
    }

    private boolean c(Context context, Guidepost guidepost, NaviCallback naviCallback, String str) {
        boolean zC = gvd.c(context);
        boolean zC2 = gvd.c(guidepost);
        if (!zC && !TextUtils.isEmpty(str) && !b(context, str)) {
            gvd.d(guidepost, naviCallback, zC2);
            return false;
        }
        if (zC && gvd.b(context)) {
            if (Utils.o() && gvd.e(guidepost)) {
                naviCallback.onFound(guidepost);
                gvd.a(context);
                naviCallback.onInterrupt(guidepost);
                LogUtil.b("Login_CustomRoute", "oversea user not used, path=", guidepost.l());
                return false;
            }
        } else if (zC2) {
            gvd.d(guidepost, naviCallback, zC2);
            return false;
        }
        if (!gvd.b(guidepost)) {
            return true;
        }
        gvd.d(guidepost, naviCallback, zC2);
        return false;
    }

    private boolean b(Context context, Guidepost guidepost) {
        String strL = guidepost.l();
        strL.hashCode();
        if (!strL.equals("/home/main")) {
            return true;
        }
        if (nty.d()) {
            return false;
        }
        d(context, guidepost);
        return true;
    }

    private void d(Context context, Guidepost guidepost) {
        String queryParameter;
        guidepost.d(536870912);
        if (!(context instanceof Activity)) {
            guidepost.e(268435456);
        } else {
            guidepost.e(67108864);
        }
        Uri uriO = guidepost.o();
        if (uriO != null) {
            queryParameter = uriO.getQueryParameter(Constants.HOME_TAB_NAME);
            if (!TextUtils.isEmpty(queryParameter)) {
                guidepost.c(Constants.HOME_TAB_NAME, queryParameter);
            }
        } else {
            queryParameter = null;
        }
        LogUtil.b("Login_CustomRoute", "start path=", guidepost.l(), ", tabName=", queryParameter, ", flags=0x", Integer.toHexString(guidepost.f()));
    }

    private static boolean b(Context context, String str) {
        return AppBundle.c().isExistLocalModule(str) || AppBundle.c().isBuiltInModule(context, str);
    }

    @Override // com.huawei.haf.router.NaviPluginCallback
    public void onPluginNone(Guidepost guidepost) {
        LogUtil.c("Login_CustomRoute", "onPluginNone");
    }

    @Override // com.huawei.haf.router.NaviPluginCallback
    public void onPluginFound(Guidepost guidepost, String str) {
        ohf.e().b(str);
        LogUtil.b("Login_CustomRoute", "onPluginFound, pluginName=", str);
    }

    @Override // com.huawei.haf.router.NaviPluginCallback
    public void onPluginLost(Guidepost guidepost, String str) {
        if (AppRouterUtils.b(guidepost)) {
            ohf.e().c(str);
        }
        LogUtil.b("Login_CustomRoute", "onPluginLost, pluginName=", str);
    }

    /* JADX INFO: loaded from: classes8.dex */
    class d implements Runnable, AppBundleLauncher.InstallCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f8706c;
        private final Intent e;

        d(HealthCustomRouteService healthCustomRouteService, Context context, Intent intent) {
            this(context, intent, null, null);
        }

        d(Context context, Intent intent, String str, String str2) {
            this.f8706c = context;
            this.e = intent;
            this.f8704a = str;
            this.f8705b = str2;
        }

        void c() {
            HandlerExecutor.b(this);
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public boolean call(Context context, Intent intent) {
            if (TextUtils.isEmpty(this.f8704a)) {
                return true;
            }
            HealthCustomRouteService.this.c(context, intent, null, this.f8704a, this.f8705b);
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppBundle.d().launchActivity(this.f8706c, this.e, this);
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class a implements ExtendRouteService.RouteInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f8702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f8703b;
        int d;

        private a() {
        }

        @Override // com.huawei.haf.router.facade.service.ExtendRouteService.RouteInfo
        public String getModuleOrGroup() {
            return this.f8703b;
        }

        @Override // com.huawei.haf.router.facade.service.ExtendRouteService.RouteInfo
        public int getPathExtras() {
            return this.d;
        }

        @Override // com.huawei.haf.router.facade.service.ExtendRouteService.RouteInfo
        public String getRunningProcess() {
            return this.f8702a;
        }
    }
}
