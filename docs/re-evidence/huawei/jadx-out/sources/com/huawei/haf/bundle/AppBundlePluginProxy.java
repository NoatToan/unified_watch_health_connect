package com.huawei.haf.bundle;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppBundlePluginProxy<T> {
    private InstallStateListener mInstallStateListener;
    private final String mModuleApiClassName;
    private final String mModuleName;
    private final String mModuleTag;

    protected T getPluginService() {
        return null;
    }

    protected abstract void initialize(T t);

    public abstract boolean isPluginAvaiable();

    public AppBundlePluginProxy(String str, String str2, String str3) {
        this.mModuleTag = str;
        this.mModuleName = str2;
        this.mModuleApiClassName = str3;
    }

    public final void launchActivity(Context context, Intent intent) {
        launchActivity(context, intent, null);
    }

    public final void launchActivity(Context context, Intent intent, AppBundleLauncher.InstallCallback installCallback) {
        intent.putExtra("moduleName", getPluginName());
        AppBundleLauncher appBundleLauncherD = AppBundle.d();
        if (!isPluginAvaiable()) {
            installCallback = new InnerInstallResultListener(installCallback);
        }
        appBundleLauncherD.launchActivity(context, intent, installCallback);
    }

    public final void loadPlugin(AppBundleLauncher.InstallCallback installCallback) {
        if (!isPluginAvaiable()) {
            AppBundle.d().loadPlugins(BaseApplication.b(), Collections.singletonList(getPluginName()), new InnerInstallResultListener(installCallback));
        } else if (installCallback != null) {
            installCallback.call(BaseApplication.b(), null);
        }
    }

    protected final void loadPlugin() {
        loadPlugin(null);
    }

    protected final void deferredInstallPlugin() {
        if (isPluginAvaiable()) {
            return;
        }
        getInstallManager().deferredInstall(Collections.singletonList(getPluginName()));
    }

    public final String getPluginName() {
        return this.mModuleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initializePlugin() {
        unregisterPluginListener();
        if (isPluginAvaiable()) {
            return true;
        }
        T tNewPluginApi = newPluginApi();
        if (tNewPluginApi != null) {
            initialize(tNewPluginApi);
        }
        return isPluginAvaiable();
    }

    public final T createPluginApi() {
        T tNewPluginApi = newPluginApi();
        if (tNewPluginApi == null && AppBundle.c().isBundleModule(getPluginName())) {
            registerPluginListener();
        }
        return tNewPluginApi;
    }

    private T newPluginApi() {
        T pluginService;
        if (!TextUtils.isEmpty(this.mModuleApiClassName)) {
            try {
                pluginService = (T) ReflectionUtils.d(this.mModuleApiClassName, BaseApplication.b().getClassLoader());
            } catch (Exception e) {
                LogUtil.d(this.mModuleTag, "create plugin api fail, ex=", LogUtil.c(e));
                pluginService = null;
            }
        } else {
            pluginService = getPluginService();
        }
        if (pluginService != null) {
            LogUtil.b(this.mModuleTag, "create plugin api success.");
        }
        return pluginService;
    }

    private AppBundleInstallManager getInstallManager() {
        return AppBundle.d().getInstallManager();
    }

    private void registerPluginListener() {
        synchronized (this) {
            if (this.mInstallStateListener == null) {
                this.mInstallStateListener = new InnerInstallResultListener(null);
                getInstallManager().registerListener(this.mInstallStateListener);
            }
        }
    }

    private void unregisterPluginListener() {
        synchronized (this) {
            if (this.mInstallStateListener != null) {
                getInstallManager().unregisterListener(this.mInstallStateListener);
                this.mInstallStateListener = null;
            }
        }
    }

    class InnerInstallResultListener implements AppBundleLauncher.InstallCallback, InstallStateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AppBundleLauncher.InstallCallback f5797c;

        InnerInstallResultListener(AppBundleLauncher.InstallCallback installCallback) {
            this.f5797c = installCallback;
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public boolean call(Context context, Intent intent) {
            if (this.f5797c != null) {
                AppBundlePluginProxy.this.initializePlugin();
                return this.f5797c.call(context, intent);
            }
            return AppBundlePluginProxy.this.initializePlugin();
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public void onFailed(Context context, Intent intent) {
            AppBundleLauncher.InstallCallback installCallback = this.f5797c;
            if (installCallback != null) {
                installCallback.onFailed(context, intent);
            }
        }

        @Override // com.huawei.haf.bundle.InstallStateListener
        public void onStateUpdate(InstallSessionState installSessionState) {
            if (installSessionState.status() == 5 && installSessionState.moduleNames().contains(AppBundlePluginProxy.this.getPluginName())) {
                AppBundlePluginProxy.this.initializePlugin();
            }
        }
    }
}
