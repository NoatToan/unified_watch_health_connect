package com.huawei.haf.bundle.guide;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleInstallManager;
import com.huawei.haf.bundle.InstallException;
import com.huawei.haf.bundle.InstallGuide;
import com.huawei.haf.bundle.InstallRequest;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.bundle.InstallStateListener;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import health.compact.a.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseBundleInstaller extends ContextWrapper implements BundleInstaller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InstallStateListener f5827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppBundleInstallManager f5828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InstallRequest f5829c;
    private final InstallGuide d;
    private final BundleInstaller.InstallHandler e;
    private int f;
    private int h;
    private boolean j;

    public BaseBundleInstaller(Context context, BundleInstaller.InstallHandler installHandler, InstallGuide installGuide, AppBundleInstallManager appBundleInstallManager) {
        super(context);
        this.h = -1;
        this.f = 0;
        this.e = installHandler;
        this.d = installGuide == null ? BundleInstallGuideHolder.d() : installGuide;
        this.f5828b = appBundleInstallManager == null ? AppBundle.a(getApplicationContext()) : appBundleInstallManager;
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller
    public AppBundleInstallManager getInstallManager() {
        return this.f5828b;
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller
    public void startInstall(List<String> list) {
        if (this.f5827a == null) {
            InnerInstallStateUpdatedListener innerInstallStateUpdatedListener = new InnerInstallStateUpdatedListener();
            this.f5827a = innerInstallStateUpdatedListener;
            this.f5828b.registerListener(innerInstallStateUpdatedListener);
            this.f5829c = c(list);
            e();
        }
    }

    private InstallRequest c(List<String> list) {
        InstallRequest.Builder builderB = InstallRequest.b();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            builderB.d(it.next());
        }
        return builderB.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        InstallRequest installRequest = this.f5829c;
        if (installRequest == null) {
            return;
        }
        if (this.f5828b.getInstalledModules().containsAll(installRequest.d())) {
            c();
        } else {
            if (this.f5827a == null) {
                return;
            }
            InnerStartInstallListener innerStartInstallListener = new InnerStartInstallListener();
            this.f5828b.startInstall(installRequest).addOnSuccessListener(innerStartInstallListener).addOnFailureListener(innerStartInstallListener);
        }
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller
    public boolean startConfirmationDialogForResult(InstallSessionState installSessionState, Activity activity, int i, boolean z) throws IntentSender.SendIntentException {
        if (b(installSessionState, activity, i, z)) {
            return true;
        }
        return this.f5828b.startConfirmationDialogForResult(installSessionState, activity, i);
    }

    private boolean b(InstallSessionState installSessionState, Activity activity, int i, boolean z) throws IntentSender.SendIntentException {
        PendingIntent pendingIntentResolutionIntent;
        if (installSessionState == null || activity == null) {
            throw new IntentSender.SendIntentException("state == null || activity == null");
        }
        if (installSessionState.status() != 8 || (pendingIntentResolutionIntent = installSessionState.resolutionIntent()) == null) {
            return false;
        }
        if (z) {
            return e(installSessionState, pendingIntentResolutionIntent, activity, i, false);
        }
        return c(installSessionState, pendingIntentResolutionIntent, activity, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(InstallSessionState installSessionState, PendingIntent pendingIntent, Activity activity, int i, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("sessionId", installSessionState.sessionId());
        intent.putExtra(z ? "isSkipCancel" : "isSkipConfirm", true);
        try {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, intent, 0, 0, 0);
            return true;
        } catch (IntentSender.SendIntentException e) {
            LogUtil.d("Bundle_BaseInstaller", "skipUserConfirmation ex=", LogUtil.c(e));
            return false;
        }
    }

    private boolean c(final InstallSessionState installSessionState, final PendingIntent pendingIntent, final Activity activity, final int i) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.b("Bundle_BaseInstaller", "showUserConfirmationDialog activity isFinishing=", String.valueOf(activity.isFinishing()));
            return false;
        }
        this.d.showDownloadAskDialog(activity, installSessionState.downloadModuleNames(), installSessionState.totalBytesToDownload(), new View.OnClickListener() { // from class: com.huawei.haf.bundle.guide.BaseBundleInstaller.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseBundleInstaller.this.e(installSessionState, pendingIntent, activity, i, true);
            }
        }, new View.OnClickListener() { // from class: com.huawei.haf.bundle.guide.BaseBundleInstaller.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseBundleInstaller.this.e(installSessionState, pendingIntent, activity, i, false);
            }
        });
        return true;
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller
    public void cancelInstall() {
        int i = this.h;
        if (i == -1) {
            return;
        }
        this.h = -1;
        InnerCancelInstallListener innerCancelInstallListener = new InnerCancelInstallListener(i);
        this.f5828b.cancelInstall(i).addOnSuccessListener(innerCancelInstallListener).addOnFailureListener(innerCancelInstallListener);
        LogUtil.b("Bundle_BaseInstaller", "cancelInstall taskId=", Integer.valueOf(i));
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller
    public boolean isRunning() {
        return this.f5827a != null;
    }

    private void b(int i, String str) {
        e(i, str, true);
    }

    private void e(int i, String str, boolean z) {
        if (this.e.onInstallRequestError(i, str, z)) {
            d();
        }
    }

    private void i(InstallSessionState installSessionState) {
        this.e.onRequiresUserConfirmation(installSessionState);
    }

    private void j(InstallSessionState installSessionState) {
        this.e.onPending(installSessionState, a(this, installSessionState));
    }

    private void a(InstallSessionState installSessionState) {
        long jBytesDownloaded = installSessionState.bytesDownloaded();
        long j = installSessionState.totalBytesToDownload();
        if (j <= 0 || jBytesDownloaded < 0) {
            return;
        }
        int i = (int) ((jBytesDownloaded * 98) / j);
        if (i > 97) {
            i = 97;
        }
        this.e.onProgressMessage(installSessionState, i, a(this, installSessionState));
    }

    private void d(InstallSessionState installSessionState) {
        this.e.onProgressMessage(installSessionState, 98, a(this, installSessionState));
    }

    private void b(InstallSessionState installSessionState) {
        this.e.onProgressMessage(installSessionState, 99, a(this, installSessionState));
    }

    private void e(InstallSessionState installSessionState) {
        this.e.onProgressMessage(installSessionState, 100, a(this, installSessionState));
        c();
    }

    private void c() {
        clean();
        this.e.onFinish(true);
    }

    private void d() {
        clean();
        this.e.onFinish(false);
    }

    private void b() {
        if (this.e.onForceDownloads()) {
            this.j = false;
            this.f5828b.getSessionStates().addOnCompleteListener(new InnerSessionListCompleteListener(this));
        }
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller
    public boolean onBackPressed() {
        int i = this.f;
        if (i == 0) {
            LogUtil.b("Bundle_BaseInstaller", "Module download is not started!");
            return true;
        }
        if (i == 9 || i == 3 || i == 4 || !this.j) {
            return false;
        }
        if (this.h == -1) {
            return true;
        }
        cancelInstall();
        return false;
    }

    @Override // com.huawei.haf.bundle.guide.BundleInstaller
    public void clean() {
        InstallStateListener installStateListener = this.f5827a;
        if (installStateListener != null) {
            this.f5828b.unregisterListener(installStateListener);
            this.f5827a = null;
            this.f5829c = null;
            this.h = -1;
            this.f = 0;
            this.j = false;
        }
    }

    void c(InstallSessionState installSessionState) {
        switch (installSessionState.status()) {
            case 1:
                j(installSessionState);
                break;
            case 2:
                a(installSessionState);
                break;
            case 3:
                d(installSessionState);
                break;
            case 4:
                b(installSessionState);
                break;
            case 5:
                e(installSessionState);
                break;
            case 6:
                c(installSessionState.errorCode());
                break;
            case 7:
                d();
                break;
            case 8:
                i(installSessionState);
                break;
            default:
                LogUtil.e("Bundle_BaseInstaller", "updateState:", installSessionState.toString());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(InstallSessionState installSessionState) {
        InstallRequest installRequest;
        if (this.h == installSessionState.sessionId() || ((installRequest = this.f5829c) != null && installRequest.d().containsAll(installSessionState.moduleNames()) && installSessionState.moduleNames().containsAll(this.f5829c.d()))) {
            if (this.f == 8 && installSessionState.status() == this.f) {
                LogUtil.b("Bundle_BaseInstaller", "updateState same requires user confirmation states=", Integer.valueOf(installSessionState.status()));
            } else {
                this.f = installSessionState.status();
                c(installSessionState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (i == -8) {
            e(i, a(this, i), false);
            return;
        }
        if (i == -1) {
            b();
        } else if (i != 0) {
            LogUtil.e("Bundle_BaseInstaller", "handleInstallFailure errorCode=", Integer.valueOf(i));
            b(i, a(this, i));
        }
    }

    private String a(Context context, InstallSessionState installSessionState) {
        String installStateDesc = this.d.getInstallStateDesc(this, installSessionState);
        if (!TextUtils.isEmpty(installStateDesc)) {
            return installStateDesc;
        }
        if (BundleInstallGuideHolder.d() != this.d) {
            installStateDesc = BundleInstallGuideHolder.d().getInstallStateDesc(context, installSessionState);
        }
        return TextUtils.isEmpty(installStateDesc) ? "" : installStateDesc;
    }

    private String a(Context context, int i) {
        String installErrorDesc = this.d.getInstallErrorDesc(context, i);
        if (!TextUtils.isEmpty(installErrorDesc)) {
            return installErrorDesc;
        }
        if (BundleInstallGuideHolder.d() != this.d) {
            installErrorDesc = BundleInstallGuideHolder.d().getInstallErrorDesc(context, i);
        }
        return TextUtils.isEmpty(installErrorDesc) ? "" : installErrorDesc;
    }

    class InnerStartInstallListener implements OnSuccessListener<Integer>, OnFailureListener {
        private InnerStartInstallListener() {
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Integer num) {
            BaseBundleInstaller.this.h = num.intValue();
            BaseBundleInstaller.this.j = true;
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            BaseBundleInstaller.this.h = -1;
            BaseBundleInstaller.this.j = true;
            if (exc instanceof InstallException) {
                BaseBundleInstaller.this.c(((InstallException) exc).c());
            } else {
                LogUtil.e("Bundle_BaseInstaller", "onFailure ex=", LogUtil.c(exc));
            }
        }
    }

    class InnerInstallStateUpdatedListener implements InstallStateListener {
        private InnerInstallStateUpdatedListener() {
        }

        @Override // com.huawei.haf.bundle.InstallStateListener
        public void onStateUpdate(InstallSessionState installSessionState) {
            BaseBundleInstaller.this.g(installSessionState);
        }
    }

    static class InnerCancelInstallListener implements OnSuccessListener<Void>, OnFailureListener {
        private final int d;

        InnerCancelInstallListener(int i) {
            this.d = i;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            LogUtil.b("Bundle_BaseInstaller", "Cancel task successfully, taskId=", Integer.valueOf(this.d));
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            int i = this.d;
            LogUtil.b("Bundle_BaseInstaller", "Cancel task failed, taskId=", Integer.valueOf(i), ", ex=", LogUtil.c(exc));
        }
    }

    static class InnerSessionListCompleteListener implements OnCompleteListener<List<InstallSessionState>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BaseBundleInstaller> f5837c;

        InnerSessionListCompleteListener(BaseBundleInstaller baseBundleInstaller) {
            this.f5837c = new WeakReference<>(baseBundleInstaller);
        }

        @Override // com.huawei.hmf.tasks.OnCompleteListener
        public void onComplete(Task<List<InstallSessionState>> task) {
            BaseBundleInstaller baseBundleInstaller;
            if (task.isSuccessful() && (baseBundleInstaller = this.f5837c.get()) != null) {
                for (InstallSessionState installSessionState : task.getResult()) {
                    if (installSessionState.status() == 2) {
                        baseBundleInstaller.f5828b.cancelInstall(installSessionState.sessionId()).addOnCompleteListener(new InnerCancelCompleteListener(baseBundleInstaller));
                        LogUtil.b("Bundle_BaseInstaller", "InnerSessionListCompleteListener cancelInstall, taskId=", Integer.valueOf(installSessionState.sessionId()));
                    }
                }
            }
        }
    }

    static class InnerCancelCompleteListener implements OnCompleteListener<Void> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BaseBundleInstaller> f5836c;

        InnerCancelCompleteListener(BaseBundleInstaller baseBundleInstaller) {
            this.f5836c = new WeakReference<>(baseBundleInstaller);
        }

        @Override // com.huawei.hmf.tasks.OnCompleteListener
        public void onComplete(Task<Void> task) {
            BaseBundleInstaller baseBundleInstaller = this.f5836c.get();
            if (baseBundleInstaller == null) {
                return;
            }
            baseBundleInstaller.e();
        }
    }
}
