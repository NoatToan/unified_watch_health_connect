package com.huawei.health;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.common.dfx.DfxMonitorMgr;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.dynamic.DynamicResourcesLoader;
import com.huawei.haf.language.LanguageManager;
import com.huawei.haf.language.LanguagePackage;
import com.huawei.haf.store.SharedStoreManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.HealthApplication;
import com.huawei.health.arkuix.engine.StageDelegateProxy;
import com.huawei.health.h5pro.core.H5ProConfigGuardian;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hwcommonmodel.application.RunningForegroundListener;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.h5pro.H5proUtil;
import defpackage.dbc;
import defpackage.dbl;
import defpackage.dcr;
import defpackage.djt;
import defpackage.fml;
import defpackage.gta;
import defpackage.piu;
import defpackage.qje;
import defpackage.qqv;
import defpackage.qsk;
import health.compact.a.ApplicationLazyLoad;
import health.compact.a.BuildConfigProperties;
import health.compact.a.CommonUtil;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.DataBaseHelper;
import health.compact.a.DeviceConfigInit;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.EnvironmentUtils;
import health.compact.a.GrsDownloadPluginUrl;
import health.compact.a.HealthApplicationLazyLoadMgr;
import health.compact.a.HealthDfxMonitorMgr;
import health.compact.a.KeyManager;
import health.compact.a.LanguageDownloader;
import health.compact.a.LogUtil;
import health.compact.a.MessageCenterConfig;
import health.compact.a.ProcessUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class HealthApplication extends BaseApplication implements Configuration.Provider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.content.res.Configuration f6111c;
    private long d = 0;
    private dbc e;

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (EnvironmentUtils.d()) {
            return qqv.a(super.getResources(), 1.45f);
        }
        return super.getResources();
    }

    @Override // com.huawei.haf.application.BaseApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        BuildConfigProperties.a(getClass().getPackage().getName());
        SharedStoreManager.d(new dcr());
        if (r()) {
            AppBundle.e(context);
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onCreate();
        k();
        c(System.currentTimeMillis());
        DfxMonitorCenter.c((Class<? extends DfxMonitorMgr>) HealthDfxMonitorMgr.class);
        ApplicationLazyLoad.c(HealthApplicationLazyLoadMgr.class);
        if (EnvironmentUtils.d() || EnvironmentUtils.e()) {
            ApplicationLazyLoad.a();
            DfxMonitorCenter.b();
        } else if (DaemonServiceSpUtils.b(this)) {
            ApplicationLazyLoad.a();
        }
        if (r()) {
            ReleaseLogUtil.c("TimeEat_HealthApplication", "HealthBundleConfiguration enter!");
            AppBundle.a(this, new djt());
        }
        p();
        LogUtil.b("TimeEat_HealthApplication", "BUILD_TYPE is ", "release");
        if (ProcessUtil.b() && Process.is64Bit()) {
            StageDelegateProxy.getInstance().initStageApplication(this);
        }
        Resources resources = getResources();
        if (resources != null) {
            this.f6111c = new android.content.res.Configuration(resources.getConfiguration());
        }
        ReleaseLogUtil.c("TimeEat_HealthApplication", "onCreate finished, time cost: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.b("TimeEat_HealthApplication", "onConfigurationChanged");
        if (ProcessUtil.b() && Process.is64Bit()) {
            StageDelegateProxy.getInstance().changeConfiguration(configuration);
        }
        android.content.res.Configuration configuration2 = this.f6111c;
        if (configuration2 != null) {
            int iDiff = configuration.diff(configuration2);
            e(configuration, iDiff, 4, ObserveLabels.CONFIG_LOCALE);
            e(configuration, iDiff, 128, ObserveLabels.CONFIG_ORIENTATION);
            e(configuration, iDiff, 256, ObserveLabels.CONFIG_SCREEN_LAYOUT);
            e(configuration, iDiff, 512, ObserveLabels.CONFIG_UI_MODE);
            e(configuration, iDiff, 1024, ObserveLabels.CONFIG_SCREEN_SIZE);
            e(configuration, iDiff, 2048, ObserveLabels.CONFIG_SMALLEST_SCREEN_SIZE);
            e(configuration, iDiff, 4096, ObserveLabels.CONFIG_DENSITY);
            e(configuration, iDiff, 8192, ObserveLabels.CONFIG_LAYOUT_DIRECTION);
            e(configuration, iDiff, 1073741824, ObserveLabels.CONFIG_FONT_SCALE);
        }
        this.f6111c = new android.content.res.Configuration(configuration);
    }

    private void e(android.content.res.Configuration configuration, int i, int i2, String str) {
        if ((i & i2) != 0) {
            ObserverManagerUtil.e(str, configuration);
            LogUtil.b("TimeEat_HealthApplication", "onConfigurationChanged observeLabels ", str);
        }
    }

    private void k() {
        if (EnvironmentUtils.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dbf
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.l();
                }
            });
            H5ProConfigGuardian.d.addOnConfigGuardianListener(new H5ProConfigGuardian.OnConfigGuardianListener() { // from class: dbe
                @Override // com.huawei.health.h5pro.core.H5ProConfigGuardian.OnConfigGuardianListener
                public final void onConfigGuardian(Context context) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: dbg
                        @Override // java.lang.Runnable
                        public final void run() {
                            HealthApplication.m();
                        }
                    });
                }
            });
        }
    }

    public /* synthetic */ void l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiHealthDictManager.a(getApplicationContext()).c(false);
        MessageCenterConfig.d();
        qsk.b(new WeakReference(this), R.layout.home_item_layout_three_circle, 2);
        ReleaseLogUtil.c("TimeEat_HealthApplication", "asyncInit finished, time cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static /* synthetic */ void m() {
        LogUtil.b("TimeEat_HealthApplication", "onConfigGuardian");
        H5proUtil.initH5pro();
    }

    private void p() {
        BaseApplication.e(this, EnvironmentUtils.d());
        w();
        if (EnvironmentUtils.d()) {
            this.e = new dbc();
            DynamicResourcesLoader.b(new dbl());
            BroadcastManager.d(this.e);
            gta.b();
            piu.c().c(new GrsDownloadPluginUrl());
            LanguageManager.d(new LanguagePackage(new LanguageDownloader(new GrsDownloadPluginUrl(true), null)));
        } else if (Build.VERSION.SDK_INT >= 28) {
            WebView.disableWebView();
        }
        if (EnvironmentUtils.d()) {
            s();
            x();
            t();
            qje.a(this);
            q();
        }
        if (EnvironmentUtils.e()) {
            fml.c();
        }
    }

    private void w() {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        String strC = ProcessUtil.c();
        try {
            if (TextUtils.isEmpty(strC)) {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
                OpAnalyticsUtil.getInstance().setRiskWarningEvent("WebViewConfig", "WebView DataDirectorySuffix is empty");
            } else {
                WebView.setDataDirectorySuffix(strC);
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            LogUtil.d("TimeEat_HealthApplication", "setDataDirectorySuffix exception");
            OpAnalyticsUtil.getInstance().setRiskWarningEvent("WebViewConfig", "Exception:" + e.getMessage());
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        if (EnvironmentUtils.d()) {
            n();
            DeviceConfigInit.destroy();
        }
        dbc dbcVar = this.e;
        if (dbcVar != null) {
            BroadcastManager.n(dbcVar);
            this.e = null;
        }
        DfxMonitorCenter.a();
        super.onTerminate();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i == 20) {
            ReleaseLogUtil.c("TimeEat_HealthApplication", "onTrimMemory level = TRIM_MEMORY_UI_HIDDEN");
            return;
        }
        if (EnvironmentUtils.d()) {
            ReleaseLogUtil.c("TimeEat_HealthApplication", "onTrimMemory level = ", Integer.valueOf(i));
            if (i >= 40) {
                DfxMonitorCenter.d();
            }
            if (i >= 80 && !b(60000L)) {
                ReleaseLogUtil.c("TimeEat_HealthApplication", "exit by app kill self");
                Process.killProcess(Process.myPid());
            } else {
                if (((i < 80 || !d(300000L)) && (i < 60 || !d(600000L))) || CommonUtil.f(this, "com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity")) {
                    return;
                }
                BaseApplication.a();
            }
        }
    }

    private boolean r() {
        return EnvironmentUtils.d() || EnvironmentUtils.e();
    }

    private void n() {
        if (CommonUtil.ay()) {
            ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).destroyOdmf();
        }
    }

    private void s() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.HealthApplication.5
            @Override // java.lang.Runnable
            public void run() {
                KeyManager.a(2);
                KeyManager.a(1);
            }
        });
    }

    private void t() {
        int[] iArr = {1020, 20005, 101010};
        for (int i = 0; i < 3; i++) {
            ThreadPoolManager.c().execute(new DataBaseHelper.c(String.valueOf(iArr[i])));
        }
    }

    private void x() {
        com.huawei.hihealth.HiAppInfo hiAppInfo = new com.huawei.hihealth.HiAppInfo();
        hiAppInfo.setPackageName("com.huawei.health");
        HiHealthNativeApi.a(this).initHiHealth(hiAppInfo);
    }

    private void q() {
        Object systemService = getApplicationContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (systemService instanceof WindowManager) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            CommonUtil.d(displayMetrics.widthPixels, "BaseApplication");
        }
    }

    public void c(RunningForegroundListener runningForegroundListener) {
        dbc dbcVar = this.e;
        if (dbcVar != null) {
            dbcVar.e(runningForegroundListener);
        }
    }

    public long o() {
        return this.d;
    }

    public void c(long j) {
        this.d = j;
    }

    @Override // androidx.work.Configuration.Provider
    public Configuration getWorkManagerConfiguration() {
        return new Configuration.Builder().setDefaultProcessName(XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS).setMinimumLoggingLevel(4).setInitializationExceptionHandler(new Consumer() { // from class: com.huawei.health.HealthApplication$$ExternalSyntheticLambda4
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                LogUtil.d("TimeEat_HealthApplication", "WorkManager init failed in process: " + ProcessUtil.c(), (Throwable) obj);
            }
        }).build();
    }
}
