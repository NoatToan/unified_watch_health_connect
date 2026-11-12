package com.huawei.haf.bundle.guide;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleExtension;
import com.huawei.haf.bundle.AppBundleFramework;
import com.huawei.haf.bundle.AppBundleInstallManager;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundleSetting;
import com.huawei.haf.bundle.InstallException;
import com.huawei.haf.bundle.InstallGuide;
import com.huawei.haf.bundle.InstallRequest;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.bundle.InstallStateListener;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseBundleLauncher implements AppBundleLauncher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile AppBundleInstallManager f5838b;
    private final AppBundleFramework d;
    private final Object e = new Object();

    public BaseBundleLauncher(AppBundleFramework appBundleFramework) {
        this.d = appBundleFramework;
    }

    @Override // com.huawei.haf.bundle.AppBundleLauncher
    public void launchActivity(Context context, Intent intent, AppBundleLauncher.InstallCallback installCallback) {
        launchActivity(context, intent, installCallback, null);
    }

    @Override // com.huawei.haf.bundle.AppBundleLauncher
    public void launchActivity(Context context, Intent intent, AppBundleLauncher.InstallCallback installCallback, InstallGuide installGuide) {
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        if (intent == null) {
            throw new IllegalArgumentException("intent == null");
        }
        if (!HandlerExecutor.d()) {
            throw new IllegalThreadStateException("launchActivity need in ui thread run!");
        }
        List<String> listB = b(context, intent);
        if (!CollectionUtils.a(listB)) {
            e(context, listB, intent, installCallback, installGuide);
        } else {
            LogUtil.b("Bundle_Launcher", "launchActivity directly, className=", intent.getComponent());
            BaseBundleInstallGuide.a(context, intent, installCallback, "launchActivity");
        }
    }

    private void e(Context context, List<String> list, Intent intent, AppBundleLauncher.InstallCallback installCallback, InstallGuide installGuide) {
        if (!list.isEmpty()) {
            a().loadLocalModules(list);
        }
        BaseBundleInstallGuide.e(BaseBundleInstallGuide.b(context, list, intent, installCallback).c(e(installGuide)).b(getInstallManager()));
    }

    private InstallGuide e(InstallGuide installGuide) {
        return installGuide == null ? BundleInstallGuideHolder.d() : installGuide;
    }

    @Override // com.huawei.haf.bundle.AppBundleLauncher
    public void preDownloadPlugins(Context context, List<String> list, boolean z, boolean z2) {
        boolean z3;
        if (CollectionUtils.a(list)) {
            return;
        }
        Context contextB = context == null ? BaseApplication.b() : context.getApplicationContext();
        LogUtil.b("Bundle_Launcher", "preDownloadPlugins, isForceDownload=", Boolean.valueOf(z), ", isForce=", Boolean.valueOf(z2), ", modules=", list);
        AppBundleSetting appBundleSettingC = c();
        List<String> listD = d(list).d();
        Iterator<String> it = listD.iterator();
        while (true) {
            z3 = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (z) {
                appBundleSettingC.setAllowDownloadModule(contextB, next, true);
            } else {
                appBundleSettingC.updateModuleState(contextB, next, true);
            }
        }
        if (!z && !z2) {
            z3 = false;
        }
        e(contextB, listD, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<String> list) {
        if (a().getUpdateModules(BaseApplication.b(), true).containsAll(list)) {
            return e(BaseApplication.b(), list, false);
        }
        return false;
    }

    @Override // com.huawei.haf.bundle.AppBundleLauncher
    public void loadPlugins(Context context, List<String> list, AppBundleLauncher.InstallCallback installCallback) {
        if (CollectionUtils.a(list)) {
            throw new IllegalArgumentException("pluginNames is empty");
        }
        InstallRequest installRequestD = d(list);
        if (!installRequestD.d().isEmpty()) {
            a().loadLocalModules(installRequestD.d());
        }
        AppBundleInstallManager installManager = getInstallManager();
        if (!installManager.getInstalledModules().containsAll(installRequestD.d())) {
            InstallResultStateListener installResultStateListener = new InstallResultStateListener(context, installRequestD.d(), installCallback);
            installManager.startInstall(installRequestD).addOnSuccessListener(installResultStateListener).addOnFailureListener(installResultStateListener);
        } else if (installCallback != null) {
            installCallback.call(context, null);
        }
    }

    @Override // com.huawei.haf.bundle.AppBundleLauncher
    public boolean isInstalledModule(String str) {
        if (!TextUtils.isEmpty(str) && a().isBundleModule(str)) {
            return getInstalledModules().contains(str);
        }
        return true;
    }

    @Override // com.huawei.haf.bundle.AppBundleLauncher
    public Set<String> getInstalledModules() {
        return getInstallManager().getInstalledModules();
    }

    @Override // com.huawei.haf.bundle.AppBundleLauncher
    public void updateModules(Context context, boolean z) {
        LogUtil.b("Bundle_Launcher", "updateModules, isForce=", String.valueOf(z));
        Context contextB = context == null ? BaseApplication.b() : context.getApplicationContext();
        Set<String> updateModules = a().getUpdateModules(contextB, false);
        if (updateModules.isEmpty()) {
            return;
        }
        e(contextB, updateModules, z);
    }

    @Override // com.huawei.haf.bundle.AppBundleLauncher
    public AppBundleInstallManager getInstallManager() {
        if (this.f5838b == null) {
            synchronized (this.e) {
                if (this.f5838b == null) {
                    this.f5838b = this.d.create(BaseApplication.b());
                }
            }
        }
        return this.f5838b;
    }

    private boolean e(Context context, Collection<String> collection, boolean z) {
        List<String> listC = c(context, collection);
        if (!listC.isEmpty()) {
            e(context, listC);
            if (listC.size() == collection.size()) {
                return true;
            }
            ArrayList arrayList = new ArrayList(collection);
            arrayList.removeAll(listC);
            collection = arrayList;
        }
        boolean z2 = NetworkUtil.i() && (c().isAllowUsingMobileUpdateModule() || !NetworkUtil.f());
        if (!z2) {
            LogUtil.b("Bundle_Launcher", "backgroundDownloadPlugins isNetworkAllowDownload=", Boolean.valueOf(z2));
            return false;
        }
        boolean zIsAllowAutoUpdateModule = c().isAllowAutoUpdateModule();
        if (!z && !zIsAllowAutoUpdateModule) {
            LogUtil.b("Bundle_Launcher", "backgroundDownloadPlugins isAllowAutoUpdateModule=", Boolean.valueOf(zIsAllowAutoUpdateModule));
            return false;
        }
        e(context, collection);
        return true;
    }

    private void e(Context context, Collection<String> collection) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(a().getModuleDependencies(context, it.next()));
        }
        AppBundleInstallManager installManager = getInstallManager();
        for (String str : collection) {
            if (!hashSet.contains(str)) {
                List<String> listSingletonList = Collections.singletonList(str);
                DeferredInstallResultListener deferredInstallResultListener = new DeferredInstallResultListener(listSingletonList);
                installManager.deferredInstall(listSingletonList).addOnSuccessListener(deferredInstallResultListener).addOnFailureListener(deferredInstallResultListener);
            }
        }
    }

    private List<String> c(Context context, Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            if (c().isAllowDownloadModule(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private AppBundleExtension a() {
        return this.d.getExtension();
    }

    private AppBundleSetting c() {
        return this.d.getExtension().getSetting();
    }

    private List<String> b(Context context, Intent intent) {
        InstallRequest.Builder builderB = InstallRequest.b();
        String strC = c(context, intent);
        if (!TextUtils.isEmpty(strC) && a().isBundleModule(strC)) {
            builderB.d(strC);
        }
        String stringExtra = intent.getStringExtra("moduleName");
        if (!TextUtils.isEmpty(stringExtra) && a().isBundleModule(stringExtra)) {
            builderB.d(stringExtra);
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(AppBundleLauncher.KEY_MODULE_NAME_LIST);
        a(builderB, stringArrayListExtra);
        LogUtil.b("Bundle_Launcher", "getRealModuleNameList incoming moduleName=", stringExtra, ", list=", stringArrayListExtra);
        return builderB.d().d();
    }

    private InstallRequest d(List<String> list) {
        InstallRequest.Builder builderB = InstallRequest.b();
        a(builderB, list);
        return builderB.d();
    }

    private void a(InstallRequest.Builder builder, List<String> list) {
        if (CollectionUtils.a(list)) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && a().isBundleModule(str)) {
                builder.d(str);
            }
        }
    }

    private String c(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null || !component.getPackageName().equals(context.getPackageName())) {
            return null;
        }
        return a().getModuleForComponent(component.getClassName());
    }

    class InstallResultStateListener implements OnSuccessListener<Integer>, OnFailureListener, InstallStateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f5840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AppBundleLauncher.InstallCallback f5841c;
        private final AppBundleInstallManager d;
        private final List<String> e;
        private int h;

        InstallResultStateListener(Context context, List<String> list, AppBundleLauncher.InstallCallback installCallback) {
            this.f5840b = context;
            this.e = new ArrayList(list);
            this.f5841c = installCallback;
            AppBundleInstallManager installManager = BaseBundleLauncher.this.getInstallManager();
            this.d = installManager;
            installManager.registerListener(this);
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Integer num) {
            this.h = num.intValue();
            if (this.d.getInstalledModules().containsAll(this.e)) {
                b(true);
            }
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            LogUtil.b("Bundle_Launcher", "loadPlugins fail, modules=", this.e, ", ", exc instanceof InstallException ? exc.toString() : LogUtil.c(exc));
            b(false);
        }

        @Override // com.huawei.haf.bundle.InstallStateListener
        public void onStateUpdate(InstallSessionState installSessionState) {
            int iStatus = installSessionState.status();
            if (this.h == installSessionState.sessionId() && iStatus == 8) {
                b(false);
                boolean zB = BaseBundleLauncher.this.b(this.e);
                LogUtil.b("Bundle_Launcher", "loadPlugins fail, need pre-download plugins, isDownloading=", Boolean.valueOf(zB), ", modules=", this.e);
                return;
            }
            if (iStatus == 5) {
                this.e.removeAll(this.d.getInstalledModules());
            }
            if (this.e.isEmpty() || installSessionState.moduleNames().containsAll(this.e)) {
                if (iStatus == 5) {
                    b(true);
                } else if (iStatus == 6 || iStatus == 7) {
                    b(false);
                }
            }
        }

        private void b(boolean z) {
            this.d.unregisterListener(this);
            AppBundleLauncher.InstallCallback installCallback = this.f5841c;
            if (installCallback != null) {
                if (z) {
                    installCallback.call(this.f5840b, null);
                } else {
                    installCallback.onFailed(this.f5840b, null);
                }
            }
        }
    }

    static class DeferredInstallResultListener implements OnSuccessListener<Void>, OnFailureListener {
        private final List<String> d;

        DeferredInstallResultListener(List<String> list) {
            this.d = list;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            LogUtil.b("Bundle_Launcher", "deferredInstallPlugins success, modules=", this.d);
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            LogUtil.d("Bundle_Launcher", "deferredInstallPlugins fail, ", exc instanceof InstallException ? exc.toString() : LogUtil.c(exc));
        }
    }
}
