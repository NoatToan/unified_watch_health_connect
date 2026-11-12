package com.huawei.health.arkuix.engine;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileFilterUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import defpackage.lsy;
import defpackage.pil;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StageDelegateProxy extends AppBundlePluginProxy<StageDelegateApi> implements StageDelegateApi {
    public static final String MODULE_NAME = "PluginArkUIXEngine";
    private static final String PLUGIN_CLASS_NAME = "com.huawei.hwarkuix.oHProEngine.OHProBridgeStageDelegateApiImpl";
    private static final String TAG = "R_PluginArkUiEngineProxy";
    private static final String TAG_RELEASE = "R_R_PluginArkUiEngineProxy";
    private static volatile StageDelegateProxy sStageDelegateProxy;
    private List<AppBundleLauncher.InstallCallback> installCallbackList;
    private boolean isAlreadyAvailable;
    private final Object mAdapterCallbackLock;
    private boolean mIsInitEngineLibFiles;
    private StageDelegateApi mStageDelegateApi;
    private boolean mWaitInitStageApplication;
    private boolean mustInit;

    protected StageDelegateProxy() {
        super(TAG, MODULE_NAME, PLUGIN_CLASS_NAME);
        this.mIsInitEngineLibFiles = false;
        this.mAdapterCallbackLock = new Object();
        this.installCallbackList = new ArrayList(10);
        this.mStageDelegateApi = createPluginApi();
    }

    public static StageDelegateProxy getInstance() {
        if (sStageDelegateProxy == null) {
            synchronized (StageDelegateProxy.class) {
                if (sStageDelegateProxy == null) {
                    sStageDelegateProxy = new StageDelegateProxy();
                }
            }
        }
        return sStageDelegateProxy;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.mStageDelegateApi != null;
    }

    public boolean isAlreadyAvailable() {
        return this.isAlreadyAvailable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public void initialize(StageDelegateApi stageDelegateApi) {
        this.mStageDelegateApi = stageDelegateApi;
        initStageApplication(BaseApplication.f());
    }

    @Override // com.huawei.health.arkuix.engine.StageDelegateApi
    public void initStageApplication(Application application) {
        ReleaseLogUtil.c(TAG_RELEASE, "initStageApplication pluginAvaiable:", Boolean.valueOf(isPluginAvaiable()));
        loadPlugins(application, false, new AppBundleLauncher.InstallCallback() { // from class: com.huawei.health.arkuix.engine.StageDelegateProxy.1
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context, Intent intent) {
                boolean zIsPluginAvaiable = StageDelegateProxy.this.isPluginAvaiable();
                ReleaseLogUtil.c(StageDelegateProxy.TAG_RELEASE, "initStageApplication loadPlugins pluginAvaiableLater:", Boolean.valueOf(zIsPluginAvaiable));
                return zIsPluginAvaiable;
            }
        });
    }

    public void loadAllBridgePlugin(final FragmentActivity fragmentActivity) {
        if (getInstance().isAlreadyAvailable()) {
            startBridgeManagerFragment(fragmentActivity);
        } else {
            getInstance().loadPlugins((Application) BaseApplication.b(), false, new AppBundleLauncher.InstallCallback() { // from class: com.huawei.health.arkuix.engine.StageDelegateProxy.2
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent) {
                    boolean zIsAlreadyAvailable = StageDelegateProxy.getInstance().isAlreadyAvailable();
                    ReleaseLogUtil.c(StageDelegateProxy.TAG_RELEASE, "loadAllBridgePlugin postDelayed isAlreadyAvailable:", Boolean.valueOf(zIsAlreadyAvailable));
                    if (zIsAlreadyAvailable) {
                        StageDelegateProxy.this.startBridgeManagerFragment(fragmentActivity);
                    }
                    return zIsAlreadyAvailable;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBridgeManagerFragment(FragmentActivity fragmentActivity) {
        Fragment fragmentCreateBridgeManagerFragment = createBridgeManagerFragment();
        if (fragmentCreateBridgeManagerFragment == null) {
            ReleaseLogUtil.b(TAG_RELEASE, "startBridgeManagerFragment fragment == null");
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(fragmentCreateBridgeManagerFragment, ArkUIXConstants.BRIDGE_MANAGER_PAGE);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }

    private Fragment createBridgeManagerFragment() {
        Fragment fragment;
        try {
            fragment = (Fragment) Class.forName("com.huawei.hwarkuix.EntryAbilityFragment").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            ReleaseLogUtil.b(TAG_RELEASE, "createArkDeviceFragment Exception:", ExceptionUtils.c(e));
            fragment = null;
        }
        if (fragment == null) {
            ReleaseLogUtil.b(TAG_RELEASE, "createArkDeviceFragment fragment == null");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(e.n, IntentParams.builder().addPageId(ArkUIXConstants.BRIDGE_MANAGER_PAGE).addPageType("1").addBuildConfigInfo(CommonUtil.a()).addOrderCode("").build().toString());
        bundle.putInt(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 4);
        fragment.setArguments(bundle);
        return fragment;
    }

    public void reInitStageApplication(final Application application, final Context context, final Intent intent) {
        lsy.a(new Runnable() { // from class: com.huawei.health.arkuix.engine.StageDelegateProxy$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m822x177b8170(application, context, intent);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$reInitStageApplication$0$com-huawei-health-arkuix-engine-StageDelegateProxy, reason: not valid java name */
    /* synthetic */ void m822x177b8170(Application application, Context context, Intent intent) {
        if (!isPluginAvaiable()) {
            ReleaseLogUtil.c(TAG_RELEASE, "reInitStageApplication createPluginApi");
            this.mStageDelegateApi = createPluginApi();
        }
        ReleaseLogUtil.c(TAG_RELEASE, "isPluginAvailable():", Boolean.valueOf(isPluginAvaiable()), ";isAlreadyAvailable:", Boolean.valueOf(isAlreadyAvailable()));
        if (isPluginAvaiable() && !this.isAlreadyAvailable) {
            ReleaseLogUtil.c(TAG_RELEASE, "reInitStageApplication loadPlugins success");
            initEngineLibFiles();
        }
        initStageApplicationAndThan(application, context, intent);
    }

    private void initStageApplicationAndThan(final Application application, final Context context, final Intent intent) {
        HandlerExecutor.a().post(new Runnable() { // from class: com.huawei.health.arkuix.engine.StageDelegateProxy$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m821x4a4abd68(application, context, intent);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initStageApplicationAndThan$1$com-huawei-health-arkuix-engine-StageDelegateProxy, reason: not valid java name */
    /* synthetic */ void m821x4a4abd68(Application application, Context context, Intent intent) {
        synchronized (this.mAdapterCallbackLock) {
            if (isPluginAvaiable() && !this.isAlreadyAvailable) {
                if (!this.mustInit && BaseApplication.d("com.huawei.health.MainActivity") != -1) {
                    this.mWaitInitStageApplication = true;
                    return;
                }
                if (application != null) {
                    this.mStageDelegateApi.initStageApplication(application);
                    this.isAlreadyAvailable = true;
                } else {
                    ReleaseLogUtil.c(TAG, "initStageApplicationAndThan application is null");
                }
            }
            ReleaseLogUtil.c(TAG_RELEASE, "HandlerExecutor onResponseAdapterCallback");
            onReponseAdapterCallback(context, intent);
            clearAdapterCallback();
        }
    }

    @Override // com.huawei.health.arkuix.engine.StageDelegateApi
    public void changeConfiguration(Configuration configuration) {
        if (isPluginAvaiable()) {
            this.mStageDelegateApi.changeConfiguration(configuration);
        }
    }

    private void addAdapaterCallback(AppBundleLauncher.InstallCallback installCallback) {
        synchronized (this.mAdapterCallbackLock) {
            this.installCallbackList.add(installCallback);
        }
    }

    private void clearAdapterCallback() {
        synchronized (this.mAdapterCallbackLock) {
            this.installCallbackList.clear();
        }
    }

    private void onReponseAdapterCallback(Context context, Intent intent) {
        synchronized (this.mAdapterCallbackLock) {
            if (!CollectionUtils.a(this.installCallbackList)) {
                Iterator<AppBundleLauncher.InstallCallback> it = this.installCallbackList.iterator();
                while (it.hasNext()) {
                    it.next().call(context, intent);
                }
            }
        }
    }

    public void loadPlugins(final Application application, boolean z, AppBundleLauncher.InstallCallback installCallback) {
        if (!Process.is64Bit()) {
            ReleaseLogUtil.d(TAG_RELEASE, "loadPlugins Process.is not 64Bit");
            return;
        }
        ReleaseLogUtil.c(TAG_RELEASE, "initStageApplication loadPlugins");
        synchronized (this.mAdapterCallbackLock) {
            addAdapaterCallback(installCallback);
            this.mustInit = z;
            ReleaseLogUtil.c(TAG_RELEASE, "initStageApplication loadPlugins installCallbackList sise ", Integer.valueOf(this.installCallbackList.size()));
            if (this.installCallbackList.size() > 1) {
                if (this.mWaitInitStageApplication) {
                    initStageApplicationAndThan(application, null, null);
                }
                return;
            }
            ReleaseLogUtil.c(TAG_RELEASE, "isPluginAvaiable():", Boolean.valueOf(isPluginAvaiable()), ";isAlreadyAvailable:", Boolean.valueOf(isAlreadyAvailable()));
            if (isPluginAvaiable()) {
                reInitStageApplication(application, null, null);
            } else {
                AppBundle.d().loadPlugins(BaseApplication.b(), Arrays.asList("PluginArkUIXHealth", MODULE_NAME), new AppBundleLauncher.InstallCallback() { // from class: com.huawei.health.arkuix.engine.StageDelegateProxy.3
                    @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                    public boolean call(Context context, Intent intent) {
                        boolean zIsPluginAvaiable = StageDelegateProxy.this.isPluginAvaiable();
                        ReleaseLogUtil.c(StageDelegateProxy.TAG_RELEASE, "loadPlugins call isPluginAvaiable:", Boolean.valueOf(zIsPluginAvaiable));
                        StageDelegateProxy.this.reInitStageApplication(application, context, intent);
                        return zIsPluginAvaiable;
                    }
                });
            }
        }
    }

    private void initEngineLibFiles() {
        if (this.mIsInitEngineLibFiles) {
            LogUtil.e(TAG, "initEngineLibFiles has done, return");
            return;
        }
        File fileC = FileUtils.c(AppInfoUtils.g("arkui-x/libs"));
        File file = new File(fileC, Process.is64Bit() ? "arm64-v8a" : "armeabi-v7a");
        File file2 = new File(file, SecurityUtils.c(String.valueOf(AppInfoUtils.b())));
        this.mIsInitEngineLibFiles = true;
        ReleaseLogUtil.c(TAG_RELEASE, "initEngineLibFiles markFile.exists:", Boolean.valueOf(file2.exists()), "  libDir.exists:", Boolean.valueOf(file.exists()));
        if (file2.exists()) {
            return;
        }
        initEngineLibFiles(fileC, file, file2);
    }

    private void initEngineLibFiles(File file, File file2, File file3) {
        File file4;
        synchronized (this) {
            if (file3.exists()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            InputStream inputStreamOpen = null;
            try {
                FileUtils.d(file2);
                String str = Process.is64Bit() ? "arkui-x-libs-64.zip" : "arkui-x-libs-32.zip";
                file4 = new File(file, str);
                try {
                    try {
                        inputStreamOpen = BaseApplication.b().getAssets().open(str);
                        long jD = FileUtils.d(inputStreamOpen, file4);
                        pil.e(file4.getAbsolutePath(), file.getAbsolutePath());
                        try {
                            setEngineLibFilesReadOnly(file2);
                            FileUtils.d(file3, true);
                            LogUtil.b(TAG, "decode from assets, times=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", size=", Long.valueOf(jD), ", fileSize=", Long.valueOf(file4.length()));
                        } catch (IOException e) {
                            e = e;
                            FileUtils.d(file2);
                            LogUtil.d(TAG, "initEngineLibFiles fail. ex=", LogUtil.c(e));
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                    FileUtils.a(inputStreamOpen);
                    FileUtils.b(file4);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                file4 = null;
            } catch (Throwable th2) {
                th = th2;
                file4 = null;
                FileUtils.a(inputStreamOpen);
                FileUtils.b(file4);
                throw th;
            }
            FileUtils.a(inputStreamOpen);
            FileUtils.b(file4);
        }
    }

    private void setEngineLibFilesReadOnly(File file) {
        File[] fileArrListFiles = file.listFiles(new FileFilterUtils.FileExtensionCollectFilter(".so"));
        if (CollectionUtils.d(fileArrListFiles)) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            FileUtils.f(new File(file, file2.getName()));
        }
    }

    public void tryAlreadyAvailable() {
        if (this.isAlreadyAvailable) {
            return;
        }
        initEngineLibFiles();
        this.mStageDelegateApi.initStageApplication((Application) BaseApplication.b());
        this.isAlreadyAvailable = true;
    }
}
