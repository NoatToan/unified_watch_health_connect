package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Bundle;
import com.huawei.android.appbundle.splitinstall.LoadedSplitFetcher;
import com.huawei.haf.bundle.AppBundleInstallManager;
import com.huawei.haf.bundle.InstallException;
import com.huawei.haf.bundle.InstallRequest;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.bundle.InstallStateListener;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
final class bac implements AppBundleInstallManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final baa f874c;
    private final Context d;

    bac(baa baaVar, Context context) {
        this.d = context;
        this.f874c = baaVar;
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public void registerListener(InstallStateListener installStateListener) {
        e().c(installStateListener);
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public void unregisterListener(InstallStateListener installStateListener) {
        e().d(installStateListener);
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public Task<Integer> startInstall(InstallRequest installRequest) {
        if (installRequest == null || installRequest.d().isEmpty()) {
            return e(new InstallException(-3));
        }
        LoadedSplitFetcher loadedSplitFetcherC = azx.c();
        if (loadedSplitFetcherC != null) {
            loadedSplitFetcherC.loadLocalSplits(installRequest.d());
        }
        if (getInstalledModules().containsAll(installRequest.d())) {
            e().d(new e(this, installRequest));
            return b(0);
        }
        return this.f874c.d(installRequest.d());
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public boolean startConfirmationDialogForResult(InstallSessionState installSessionState, Activity activity, int i) throws IntentSender.SendIntentException {
        PendingIntent pendingIntentResolutionIntent;
        if (installSessionState == null || activity == null) {
            throw new IntentSender.SendIntentException("sessionState == null || activity == null");
        }
        if (installSessionState.status() != 8 || (pendingIntentResolutionIntent = installSessionState.resolutionIntent()) == null) {
            return false;
        }
        activity.startIntentSenderForResult(pendingIntentResolutionIntent.getIntentSender(), i, null, 0, 0, 0);
        return true;
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public Task<Void> cancelInstall(int i) {
        return this.f874c.d(i);
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public Task<InstallSessionState> getSessionState(int i) {
        return this.f874c.b(i);
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public Task<List<InstallSessionState>> getSessionStates() {
        return this.f874c.d();
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public Task<Void> deferredInstall(List<String> list) {
        if (CollectionUtils.a(list)) {
            return e(new InstallException(-3));
        }
        LoadedSplitFetcher loadedSplitFetcherC = azx.c();
        if (loadedSplitFetcherC != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!loadedSplitFetcherC.checkModuleExisted(it.next())) {
                }
            }
            return b((Object) null);
        }
        return this.f874c.b(list);
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public Task<Void> deferredUninstall(List<String> list) {
        if (CollectionUtils.a(list)) {
            return e(new InstallException(-3));
        }
        LoadedSplitFetcher loadedSplitFetcherC = azx.c();
        if (loadedSplitFetcherC != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (loadedSplitFetcherC.checkModuleUninstalled(it.next())) {
                    return b((Object) null);
                }
            }
        }
        return this.f874c.c(list);
    }

    @Override // com.huawei.haf.bundle.AppBundleInstallManager
    public Set<String> getInstalledModules() {
        Set<String> setC = bam.c(this.d);
        if (!CollectionUtils.a(setC)) {
            return setC;
        }
        LoadedSplitFetcher loadedSplitFetcherC = azx.c();
        if (loadedSplitFetcherC == null) {
            return Collections.EMPTY_SET;
        }
        return loadedSplitFetcherC.loadedSplits();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public azz e() {
        return azz.c(this.d);
    }

    private static <TResult> Task<TResult> b(TResult tresult) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(tresult);
        return taskCompletionSource.getTask();
    }

    private static <TResult> Task<TResult> e(Exception exc) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(exc);
        return taskCompletionSource.getTask();
    }

    static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InstallRequest f875a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final bac f876c;

        e(bac bacVar, InstallRequest installRequest) {
            this.f876c = bacVar;
            this.f875a = installRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f876c.e().b(baf.a(a((String[]) this.f875a.d().toArray(new String[0]))));
        }

        private Bundle a(String[] strArr) {
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", 0);
            bundle.putInt("status", 5);
            bundle.putInt("error_code", 0);
            bundle.putStringArrayList("module_names", arrayList);
            bundle.putStringArrayList("download_module_names", arrayList);
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putLong("bytes_downloaded", 0L);
            return bundle;
        }
    }
}
