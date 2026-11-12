package com.huawei.haf.bundle.guide;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleInstallManager;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.bundle.InstallStateListener;
import health.compact.a.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleInstallTaskManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile BundleInstallTaskManager f5844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, InstallHandlerWapper> f5845b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, BundleInstallerWapper> f5846c = new ConcurrentHashMap();
    private static final Object e = new Object();
    private final Context d = BaseApplication.b();
    private final AppBundleInstallManager g;

    private BundleInstallTaskManager() {
        AppBundleInstallManager installManager = AppBundle.d().getInstallManager();
        this.g = installManager;
        installManager.registerListener(new InnerInstallStateUpdatedListener());
    }

    public static BundleInstallTaskManager d() {
        if (f5844a == null) {
            synchronized (e) {
                if (f5844a == null) {
                    f5844a = new BundleInstallTaskManager();
                }
            }
        }
        return f5844a;
    }

    public BundleInstaller e(String str, BundleInstaller.InstallHandler installHandler) {
        InstallHandlerWapper installHandlerWapperB = f5845b.get(str);
        if (installHandlerWapperB == null) {
            installHandlerWapperB = b(str);
        }
        installHandlerWapperB.e(installHandler);
        return installHandlerWapperB.b();
    }

    private InstallHandlerWapper b(String str) {
        BundleInstallerWapper bundleInstallerWapperE = e(str);
        if (bundleInstallerWapperE == null) {
            bundleInstallerWapperE = new BundleInstallerWapper(str);
            bundleInstallerWapperE.a(new InstallHandlerWapper(bundleInstallerWapperE));
        } else {
            bundleInstallerWapperE.a(new InstallHandlerWapper(bundleInstallerWapperE));
            bundleInstallerWapperE.d();
        }
        return bundleInstallerWapperE.e();
    }

    private BundleInstallerWapper e(String str) {
        for (BundleInstallerWapper bundleInstallerWapper : f5846c.values()) {
            if (str.equals(bundleInstallerWapper.f5847a)) {
                return bundleInstallerWapper;
            }
        }
        return null;
    }

    public static void b(String str, String str2, BundleInstaller bundleInstaller) {
        if (!(bundleInstaller instanceof BundleInstallerWapper)) {
            LogUtil.e("Bundle_InstallTaskManager", "addTask please use getBundleInstaller method to get BundleInstaller");
            return;
        }
        InstallHandlerWapper installHandlerWapperE = ((BundleInstallerWapper) bundleInstaller).e();
        installHandlerWapperE.b().clean();
        installHandlerWapperE.a(str);
        f5845b.put(str2, installHandlerWapperE);
    }

    public static boolean d(String str, String str2) {
        InstallHandlerWapper installHandlerWapper;
        Map<String, InstallHandlerWapper> map = f5845b;
        return (map.isEmpty() || (installHandlerWapper = map.get(str2)) == null || (!TextUtils.isEmpty(str) && !str.equals(installHandlerWapper.e()))) ? false : true;
    }

    public static void a(String str) {
        String key;
        BundleInstallerWapper bundleInstallerWapperB;
        Map<String, InstallHandlerWapper> map = f5845b;
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, InstallHandlerWapper>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                key = null;
                bundleInstallerWapperB = null;
                break;
            }
            Map.Entry<String, InstallHandlerWapper> next = it.next();
            if (TextUtils.isEmpty(str) || str.equals(next.getValue().e())) {
                key = next.getKey();
                bundleInstallerWapperB = next.getValue().b();
                break;
            }
        }
        if (bundleInstallerWapperB != null) {
            f5845b.remove(key);
            bundleInstallerWapperB.startInstall(Arrays.asList(key));
        } else {
            a((String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InstallSessionState installSessionState) {
        if (installSessionState.moduleNames().isEmpty()) {
            return;
        }
        Integer numValueOf = Integer.valueOf(installSessionState.sessionId());
        Map<Integer, BundleInstallerWapper> map = f5846c;
        BundleInstallerWapper bundleInstallerWapper = map.get(numValueOf);
        int iStatus = installSessionState.status();
        if (iStatus == 1 || iStatus == 2 || iStatus == 3 || iStatus == 4) {
            if (bundleInstallerWapper == null) {
                bundleInstallerWapper = new BundleInstallerWapper(installSessionState.moduleNames().get(0));
                bundleInstallerWapper.d(installSessionState.sessionId());
                map.put(numValueOf, bundleInstallerWapper);
            }
            bundleInstallerWapper.b(installSessionState);
            return;
        }
        if (iStatus == 8 || iStatus == 9 || bundleInstallerWapper == null) {
            return;
        }
        bundleInstallerWapper.d(-1);
        bundleInstallerWapper.b(installSessionState);
        map.remove(numValueOf);
    }

    class BundleInstallerWapper implements BundleInstaller {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5848b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InstallHandlerWapper f5849c;
        private BaseBundleInstaller e;

        BundleInstallerWapper(String str) {
            this.f5847a = TextUtils.isEmpty(str) ? "" : str;
        }

        void d(int i) {
            this.f5848b = i;
        }

        void a(InstallHandlerWapper installHandlerWapper) {
            this.f5849c = installHandlerWapper;
        }

        InstallHandlerWapper e() {
            return this.f5849c;
        }

        void b(InstallSessionState installSessionState) {
            BaseBundleInstaller baseBundleInstaller = this.e;
            if (baseBundleInstaller == null || baseBundleInstaller.isRunning()) {
                return;
            }
            baseBundleInstaller.c(installSessionState);
        }

        BaseBundleInstaller d() {
            BaseBundleInstaller baseBundleInstaller = this.e;
            if (baseBundleInstaller != null || this.f5849c == null) {
                return baseBundleInstaller;
            }
            BaseBundleInstaller baseBundleInstaller2 = new BaseBundleInstaller(BundleInstallTaskManager.this.d, this.f5849c, BundleInstallGuideHolder.d(), BundleInstallTaskManager.this.g);
            this.e = baseBundleInstaller2;
            return baseBundleInstaller2;
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller
        public AppBundleInstallManager getInstallManager() {
            return BundleInstallTaskManager.this.g;
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller
        public void startInstall(List<String> list) {
            BaseBundleInstaller baseBundleInstallerD;
            if (this.f5848b != -1 || (baseBundleInstallerD = d()) == null) {
                return;
            }
            baseBundleInstallerD.startInstall(list);
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller
        public boolean startConfirmationDialogForResult(InstallSessionState installSessionState, Activity activity, int i, boolean z) throws IntentSender.SendIntentException {
            BaseBundleInstaller baseBundleInstaller = this.e;
            if (baseBundleInstaller == null) {
                return false;
            }
            return baseBundleInstaller.startConfirmationDialogForResult(installSessionState, activity, i, z);
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller
        public void cancelInstall() {
            BaseBundleInstaller baseBundleInstaller = this.e;
            if (baseBundleInstaller != null) {
                baseBundleInstaller.cancelInstall();
            }
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller
        public boolean isRunning() {
            if (this.f5848b != -1) {
                return true;
            }
            BaseBundleInstaller baseBundleInstaller = this.e;
            return baseBundleInstaller != null && baseBundleInstaller.isRunning();
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller
        public boolean onBackPressed() {
            BaseBundleInstaller baseBundleInstaller = this.e;
            return baseBundleInstaller != null && baseBundleInstaller.onBackPressed();
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller
        public void clean() {
            BaseBundleInstaller baseBundleInstaller = this.e;
            this.e = null;
            if (baseBundleInstaller != null) {
                baseBundleInstaller.clean();
            }
        }
    }

    static class InstallHandlerWapper implements BundleInstaller.InstallHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BundleInstaller.InstallHandler> f5851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BundleInstallerWapper f5853c;

        InstallHandlerWapper(BundleInstallerWapper bundleInstallerWapper) {
            this.f5853c = bundleInstallerWapper;
        }

        BundleInstallerWapper b() {
            return this.f5853c;
        }

        void e(BundleInstaller.InstallHandler installHandler) {
            this.f5851a = new WeakReference<>(installHandler);
        }

        void a(String str) {
            this.f5852b = str;
        }

        String e() {
            return this.f5852b;
        }

        private BundleInstaller.InstallHandler c() {
            WeakReference<BundleInstaller.InstallHandler> weakReference = this.f5851a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public boolean onForceDownloads() {
            BundleInstaller.InstallHandler installHandlerC = c();
            if (installHandlerC != null) {
                return installHandlerC.onForceDownloads();
            }
            return false;
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public boolean onInstallRequestError(int i, String str, boolean z) {
            BundleInstaller.InstallHandler installHandlerC = c();
            if (installHandlerC != null) {
                return installHandlerC.onInstallRequestError(i, str, z);
            }
            return true;
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public void onRequiresUserConfirmation(InstallSessionState installSessionState) {
            BundleInstaller.InstallHandler installHandlerC = c();
            if (installHandlerC != null) {
                installHandlerC.onRequiresUserConfirmation(installSessionState);
            }
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public void onPending(InstallSessionState installSessionState, String str) {
            BundleInstaller.InstallHandler installHandlerC = c();
            if (installHandlerC != null) {
                installHandlerC.onPending(installSessionState, str);
            }
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public void onProgressMessage(InstallSessionState installSessionState, int i, String str) {
            BundleInstaller.InstallHandler installHandlerC = c();
            if (installHandlerC != null) {
                installHandlerC.onProgressMessage(installSessionState, i, str);
            }
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public void onFinish(boolean z) {
            BundleInstaller.InstallHandler installHandlerC = c();
            if (installHandlerC != null) {
                installHandlerC.onFinish(z);
            }
        }
    }

    class InnerInstallStateUpdatedListener implements InstallStateListener {
        private InnerInstallStateUpdatedListener() {
        }

        @Override // com.huawei.haf.bundle.InstallStateListener
        public void onStateUpdate(InstallSessionState installSessionState) {
            BundleInstallTaskManager.this.a(installSessionState);
        }
    }
}
