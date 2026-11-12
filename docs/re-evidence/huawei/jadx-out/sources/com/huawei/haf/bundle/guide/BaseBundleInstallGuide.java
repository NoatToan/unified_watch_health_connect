package com.huawei.haf.bundle.guide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleInstallManager;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.InstallGuide;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.handler.HandlerExecutor;
import health.compact.a.LogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class BaseBundleInstallGuide implements BundleInstaller.InstallHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InstallGuide f5819b;
    private final Activity d;
    private InstallGuide.InstallProgress e;
    private final int g;
    private final boolean h;
    private BaseBundleInstaller j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f5818c = new AtomicInteger(-536870912);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, LaunchInfo> f5817a = new ConcurrentHashMap();

    @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
    public boolean onForceDownloads() {
        return true;
    }

    BaseBundleInstallGuide(Activity activity, int i) {
        this(activity, i, true);
    }

    private BaseBundleInstallGuide(Activity activity, int i, boolean z) {
        this.d = activity;
        this.g = i;
        this.h = z;
    }

    void e() {
        LaunchInfo launchInfo = f5817a.get(Integer.valueOf(this.g));
        if (launchInfo == null) {
            LogUtil.e("Bundle_InstallGuide", "launchInfo is null, launcherIndex=", Integer.valueOf(this.g));
            onFinish(false);
        } else {
            this.f5819b = launchInfo.f5826c;
            if (this.j == null) {
                this.j = new BaseBundleInstaller(this.d, this, launchInfo.f5826c, launchInfo.f5824a);
            }
            this.j.startInstall(launchInfo.g);
        }
    }

    void d() {
        b(false, false);
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
    public boolean onInstallRequestError(int i, String str, boolean z) {
        if (this.d.isFinishing()) {
            return true;
        }
        if (!z) {
            if (!TextUtils.isEmpty(str)) {
                Toast.makeText(this.d, str, 0).show();
            }
            return false;
        }
        a();
        b(i, str);
        return false;
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
    public void onRequiresUserConfirmation(InstallSessionState installSessionState) {
        BaseBundleInstaller baseBundleInstaller = this.j;
        if (baseBundleInstaller != null) {
            try {
                baseBundleInstaller.startConfirmationDialogForResult(installSessionState, this.d, 1100, false);
            } catch (IntentSender.SendIntentException e) {
                LogUtil.d("Bundle_InstallGuide", "onRequiresUserConfirmation ex=", LogUtil.c(e));
            }
        }
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
    public void onPending(InstallSessionState installSessionState, String str) {
        if (this.e != null) {
            return;
        }
        this.e = this.f5819b.createInstallProgress(this.d, str, new View.OnClickListener() { // from class: com.huawei.haf.bundle.guide.BaseBundleInstallGuide.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseBundleInstallGuide.this.b();
                BaseBundleInstallGuide.this.onFinish(false);
            }
        });
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
    public void onProgressMessage(InstallSessionState installSessionState, int i, String str) {
        InstallGuide.InstallProgress installProgress = this.e;
        if (installProgress != null) {
            installProgress.update(i, str);
        }
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
    public void onFinish(boolean z) {
        b(z, true);
    }

    private void b(boolean z, boolean z2) {
        if (this.j != null) {
            a();
            this.j.clean();
            this.j = null;
        }
        if (!this.h) {
            a(this.g, z);
            return;
        }
        if (this.d.getIntent() != null) {
            a(this.g, z);
            this.d.setIntent(null);
        }
        if (!z2 || this.d.isFinishing()) {
            return;
        }
        this.d.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BaseBundleInstaller baseBundleInstaller = this.j;
        if (baseBundleInstaller != null) {
            baseBundleInstaller.cancelInstall();
        }
    }

    private void b(int i, String str) {
        this.f5819b.showDownloadErrorDialog(this.d, i, str, new View.OnClickListener() { // from class: com.huawei.haf.bundle.guide.BaseBundleInstallGuide.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseBundleInstallGuide.this.onFinish(false);
            }
        });
    }

    private void a() {
        InstallGuide.InstallProgress installProgress = this.e;
        if (installProgress != null) {
            installProgress.close();
            this.e = null;
        }
    }

    static LaunchInfo b(Context context, List<String> list, Intent intent, AppBundleLauncher.InstallCallback installCallback) {
        return new LaunchInfo(context, list, intent, installCallback);
    }

    static void a(Context context, Intent intent, AppBundleLauncher.InstallCallback installCallback, String str) {
        if (installCallback != null && !installCallback.call(context, intent)) {
            LogUtil.b("Bundle_InstallGuide", str, " install callback process");
            return;
        }
        try {
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            LogUtil.e("Bundle_InstallGuide", str, " startActivity fail. ex=", LogUtil.c(e));
        }
    }

    static void e(LaunchInfo launchInfo) {
        Activity activityJ;
        if (!(launchInfo.e instanceof Activity)) {
            LogUtil.b("Bundle_InstallGuide", "launchActivity context is not Activity");
            activityJ = BaseApplication.j();
            if (activityJ == null) {
                e(null, launchInfo, false);
                return;
            }
        } else {
            activityJ = (Activity) launchInfo.e;
        }
        if (activityJ.isFinishing() || activityJ.isDestroyed()) {
            LogUtil.b("Bundle_InstallGuide", "launchActivity activity isFinishing=", String.valueOf(activityJ.isFinishing()));
            e(null, launchInfo, false);
        } else {
            e(activityJ, launchInfo, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final Activity activity, final LaunchInfo launchInfo, boolean z) {
        if (launchInfo.f5824a.getInstalledModules().containsAll(launchInfo.g)) {
            a(launchInfo, true);
            return;
        }
        if (z) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.haf.bundle.guide.BaseBundleInstallGuide.3
                @Override // java.lang.Runnable
                public void run() {
                    BaseBundleInstallGuide.e(activity, launchInfo, false);
                }
            });
            return;
        }
        if (d(launchInfo)) {
            return;
        }
        int iC = c(launchInfo);
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            new BaseBundleInstallGuide(activity, iC, false).e();
        } else {
            if (b(launchInfo, iC)) {
                return;
            }
            a(iC, false);
        }
    }

    private static boolean d(LaunchInfo launchInfo) {
        Map<Integer, LaunchInfo> map = f5817a;
        if (map.isEmpty()) {
            return false;
        }
        for (LaunchInfo launchInfo2 : map.values()) {
            if (launchInfo.g.size() == launchInfo2.g.size() && launchInfo.g.containsAll(launchInfo2.g)) {
                LogUtil.e("Bundle_InstallGuide", "checkRepeatRequest, ignore, modules=", launchInfo.g);
                if (launchInfo.e == launchInfo2.e) {
                    return true;
                }
                a(launchInfo, false);
                return true;
            }
        }
        return false;
    }

    private static boolean b(LaunchInfo launchInfo, int i) {
        Class clsB = b(launchInfo);
        if (clsB == null) {
            LogUtil.e("Bundle_InstallGuide", "startGuideActivity, guideActivity == null");
            return false;
        }
        try {
            Intent intent = new Intent(launchInfo.e, (Class<?>) clsB);
            intent.putExtra("launcherIndex", i);
            intent.setFlags(268435456);
            intent.addFlags(8388608);
            launchInfo.e.startActivity(intent);
            return true;
        } catch (Exception e) {
            LogUtil.e("Bundle_InstallGuide", "startGuideActivity fail. ex=", LogUtil.c(e));
            return false;
        }
    }

    private static Class b(LaunchInfo launchInfo) {
        Class<? extends Activity> transparentGuideActivity = launchInfo.f5826c.getTransparentGuideActivity();
        return (transparentGuideActivity == null && BundleInstallGuideHolder.d() != launchInfo.f5826c) ? BundleInstallGuideHolder.d().getTransparentGuideActivity() : transparentGuideActivity;
    }

    private static int c(LaunchInfo launchInfo) {
        int andIncrement = f5818c.getAndIncrement();
        Map<Integer, LaunchInfo> map = f5817a;
        map.put(Integer.valueOf(andIncrement), launchInfo);
        int size = map.size();
        LogUtil.b("Bundle_InstallGuide", "launchRequest index=", Integer.valueOf(andIncrement), ", size=", Integer.valueOf(size), ", moduleNames=", launchInfo.g);
        return andIncrement;
    }

    private static void a(int i, boolean z) {
        Map<Integer, LaunchInfo> map = f5817a;
        LaunchInfo launchInfoRemove = map.remove(Integer.valueOf(i));
        if (launchInfoRemove == null) {
            return;
        }
        int size = map.size();
        LogUtil.b("Bundle_InstallGuide", "launchResult index=", Integer.valueOf(i), ", size=", Integer.valueOf(size), ", result=", String.valueOf(z), ", className=", launchInfoRemove.f5825b.getComponent());
        a(launchInfoRemove, z);
    }

    private static void a(LaunchInfo launchInfo, boolean z) {
        if (z) {
            a(launchInfo.e, launchInfo.f5825b, launchInfo.d, "launchResponse");
        } else if (launchInfo.d != null) {
            launchInfo.d.onFailed(launchInfo.e, launchInfo.f5825b);
        }
    }

    static class LaunchInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AppBundleInstallManager f5824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f5825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InstallGuide f5826c;
        private final AppBundleLauncher.InstallCallback d;
        private final Context e;
        private final List<String> g;

        LaunchInfo(Context context, List<String> list, Intent intent, AppBundleLauncher.InstallCallback installCallback) {
            this.e = context;
            this.g = list;
            this.f5825b = intent;
            this.d = installCallback;
        }

        LaunchInfo c(InstallGuide installGuide) {
            this.f5826c = installGuide;
            return this;
        }

        LaunchInfo b(AppBundleInstallManager appBundleInstallManager) {
            this.f5824a = appBundleInstallManager;
            return this;
        }
    }
}
