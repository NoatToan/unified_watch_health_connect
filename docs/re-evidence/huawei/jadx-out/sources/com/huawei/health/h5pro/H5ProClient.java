package com.huawei.health.h5pro;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.core.H5ProCommand;
import com.huawei.health.h5pro.core.H5ProEngineFactory;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProReverseControlExecutor;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.h5pro.core.H5ProWebViewActivity;
import com.huawei.health.h5pro.ext.H5ProResidentExtManager;
import com.huawei.health.h5pro.ext.hostapp.H5ProHostAppRuntimeApi;
import com.huawei.health.h5pro.ext.interceptor.H5ProInterceptor;
import com.huawei.health.h5pro.ext.version.H5ProVersionUpgradeExtApi;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.preload.IH5PreloadStrategy;
import com.huawei.health.h5pro.scalable.H5ProScalableServiceManager;
import com.huawei.health.h5pro.scalable.storage.IH5ProAppLoadStorageService;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.h5pro.vengine.H5ProExecJsValueCbk;
import com.huawei.health.h5pro.webkit.H5ProLoadingRecordManager;
import com.huawei.health.h5pro.webkit.QuickPackageManager;
import com.huawei.health.h5pro.webkit.WebKitUtil;

/* JADX INFO: loaded from: classes.dex */
public class H5ProClient {
    private H5ProClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final Context context, final H5ProCommand h5ProCommand) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.health.h5pro.H5ProClient.4
                @Override // java.lang.Runnable
                public void run() {
                    H5ProClient.d(context, h5ProCommand);
                }
            });
            return;
        }
        LogUtil.i("H5PRO_H5ProClient", "startActivity");
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "startActivity: context is null");
            return;
        }
        CommonUtil.preProcessOption(h5ProCommand.getLaunchOption());
        Intent intent = new Intent(context, (Class<?>) H5ProWebViewActivity.class);
        intent.setExtrasClassLoader(H5ProCommand.class.getClassLoader());
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.huawei.health.h5pro.MESSAGE", h5ProCommand);
        intent.putExtra("com.huawei.health.h5pro.MESSAGE", bundle);
        String packageName = h5ProCommand.getPackageName();
        String url = TextUtils.isEmpty(packageName) ? h5ProCommand.getUrl() : packageName;
        intent.putExtra("h5Flag", url);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        } else {
            if (h5ProCommand.getLaunchOption() != null && h5ProCommand.getLaunchOption().isForResult()) {
                int requestCode = h5ProCommand.getLaunchOption().getRequestCode();
                LogUtil.i("H5PRO_H5ProClient", "startActivityForResult: " + requestCode);
                ((Activity) context).startActivityForResult(intent, requestCode);
                return;
            }
            int activityStartFlag = CommonUtil.getActivityStartFlag(h5ProCommand.getLaunchOption(), url);
            if (activityStartFlag != 0) {
                intent.setFlags(activityStartFlag);
            }
        }
        LogUtil.i("H5PRO_H5ProClient", "startActivity flags: " + intent.getFlags() + ",h5Flag: " + url);
        context.startActivity(intent);
        if (TextUtils.isEmpty(packageName)) {
            return;
        }
        H5ProLoadingRecordManager.d.recordStartTime(packageName);
    }

    public static void execJs(Context context, String str, H5ProExecJsValueCbk h5ProExecJsValueCbk) {
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "execJs: context is null");
        } else {
            new H5ProWebView(context).execJs(str, h5ProExecJsValueCbk);
        }
    }

    public static H5ProServiceManager getServiceManager() {
        return H5ProServiceManager.getInstance();
    }

    public static boolean preInstallH5MiniProgram(Context context, String str, IH5PreloadStrategy iH5PreloadStrategy) {
        IH5ProAppLoadStorageService h5ProAppLoadStorageService;
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "preInstallH5MiniProgram: context is null");
            return false;
        }
        LogUtil.init(context);
        if (!iH5PreloadStrategy.isPreLoadNow(context, str)) {
            LogUtil.i("H5PRO_H5ProClient", "preInstallH5MiniProgram, not match preload condition ", str);
            return false;
        }
        boolean zPreInstallHpk = new QuickPackageManager(context).preInstallHpk(str);
        if (zPreInstallHpk && (h5ProAppLoadStorageService = H5ProScalableServiceManager.getInstance().getH5ProAppLoadStorageService()) != null) {
            h5ProAppLoadStorageService.updatePreLoadTime(context, str);
        }
        return zPreInstallHpk;
    }

    public static void preLoadH5MiniProgram(Context context, String str, H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk) {
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "preLoadH5MiniProgram: context is null");
        } else {
            LogUtil.init(context);
            H5ProEngineFactory.getH5ProEngine().createInstance(context, (H5ProAppLoadListener) null).getAppLoader().preloadMiniProgram(str, h5ProPreloadCbk);
        }
    }

    public static void preloadH5LightApp(Context context, String str, H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk) {
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "preloadH5LightApp: context is null");
        } else {
            LogUtil.init(context);
            H5ProEngineFactory.getH5ProEngine().createInstance(context, (H5ProAppLoadListener) null).getAppLoader().preloadLightApp(str, h5ProPreloadCbk);
        }
    }

    public static void registerBridgeClass(String str, Class<? extends JsModuleBase> cls) {
        H5ProBridgeManager.getInstance().registerBridgeClass(str, cls);
    }

    public static void registerHostRuntimeApi(H5ProHostAppRuntimeApi h5ProHostAppRuntimeApi) {
        H5ProResidentExtManager.setHostAppApi(h5ProHostAppRuntimeApi);
    }

    public static void registerScalableService(Object obj) {
        H5ProScalableServiceManager.getInstance().registerService(obj);
    }

    public static void registerVersionInterceptor(H5ProInterceptor h5ProInterceptor) {
        H5ProResidentExtManager.setVersionInterceptor(h5ProInterceptor);
    }

    public static void registerVersionUpgradeApi(H5ProVersionUpgradeExtApi h5ProVersionUpgradeExtApi) {
        H5ProResidentExtManager.setVersionUpgradeExtApi(h5ProVersionUpgradeExtApi);
    }

    public static void sendCommandToJs(String str, String str2, H5ProReverseControlExecutor.OnReverseControlCallback onReverseControlCallback) {
        H5ProReverseControlExecutor.f6746b.execute(str, str2, onReverseControlCallback);
    }

    public static void setAccountGrsAppName(String str) {
        EnvironmentHelper.getInstance().setAccountGrsAppName(str);
    }

    public static void setAccountJsLoginUrl(String str) {
        EnvironmentHelper.getInstance().setAccountJsLoginUrl(str);
    }

    public static void setBaseUrl(String str) {
        EnvironmentHelper.getInstance().setBaseUrl(str);
    }

    public static void setBuildType(EnvironmentHelper.BuildType buildType) {
        EnvironmentHelper.getInstance().setBuildType(buildType);
        CommonUtil.setTestVersion(buildType == EnvironmentHelper.BuildType.TEST);
        LogUtil.setPrintAble((buildType == EnvironmentHelper.BuildType.RELEASE || buildType == EnvironmentHelper.BuildType.GREEN) ? false : true);
        LogUtil.setDisableLogLevel(buildType == EnvironmentHelper.BuildType.BETA ? LogUtil.LogLevel.DEBUG : null);
    }

    public static void setMobileAppEngine(boolean z) {
        EnvironmentHelper.getInstance().setMobileAppEngine(z);
    }

    public static void setUserFlag(String str) {
        EnvironmentHelper.getInstance().setUserFlag(str);
    }

    public static void start(String str) {
    }

    public static void startH5LightApp(Context context, String str, H5ProLaunchOption h5ProLaunchOption) {
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "startH5LightApp: context is null");
        } else {
            if (WebKitUtil.jumpToBrowser(context, str)) {
                return;
            }
            LogUtil.init(context);
            d(context, new H5ProCommand.Builder().setupLoad().setUrl(str).setLaunchOption(CommonUtil.parseQueryOption(str, h5ProLaunchOption)).build());
        }
    }

    public static void startH5MiniProgram(Context context, String str, H5ProLaunchOption h5ProLaunchOption) {
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "startH5MiniProgram: context is null");
            return;
        }
        LogUtil.init(context);
        IH5ProAppLoadStorageService h5ProAppLoadStorageService = H5ProScalableServiceManager.getInstance().getH5ProAppLoadStorageService();
        if (h5ProAppLoadStorageService != null) {
            h5ProAppLoadStorageService.incrLoadCount(context, str);
        }
        d(context, new H5ProCommand.Builder().setupLoad().setPackageName(str).setLaunchOption(h5ProLaunchOption).build());
    }

    public static void useHmsLite(boolean z, String str) {
        EnvironmentHelper.getInstance().useHmsLite(z, str);
    }

    public static void setBaseUrl(String str, String str2) {
        EnvironmentHelper.getInstance().setBaseUrl(str, str2);
    }

    public static void startH5MiniProgram(String str, H5ProWebView h5ProWebView, H5ProLaunchOption h5ProLaunchOption) {
        if (h5ProWebView == null) {
            LogUtil.w("H5PRO_H5ProClient", "startH5MiniProgram: webView is null");
            return;
        }
        Context context = h5ProWebView.getContext();
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "startH5MiniProgram: context is null");
            return;
        }
        LogUtil.init(context);
        IH5ProAppLoadStorageService h5ProAppLoadStorageService = H5ProScalableServiceManager.getInstance().getH5ProAppLoadStorageService();
        if (h5ProAppLoadStorageService != null) {
            h5ProAppLoadStorageService.incrLoadCount(context, str);
        }
        h5ProWebView.execute(new H5ProCommand.Builder().setupLoad().setPackageName(str).setLaunchOption(CommonUtil.parseQueryOption(str, h5ProLaunchOption)).setEmbedded().build());
    }

    public static void startH5LightApp(String str, H5ProWebView h5ProWebView, H5ProLaunchOption h5ProLaunchOption) {
        if (h5ProWebView == null) {
            LogUtil.w("H5PRO_H5ProClient", "startH5LightApp: h5ProWebView is null");
            return;
        }
        Context context = h5ProWebView.getContext();
        if (context == null) {
            LogUtil.w("H5PRO_H5ProClient", "startH5LightApp: context is null");
        } else {
            LogUtil.init(context);
            h5ProWebView.execute(new H5ProCommand.Builder().setupLoad().setUrl(str).setLaunchOption(h5ProLaunchOption).setEmbedded().build());
        }
    }
}
