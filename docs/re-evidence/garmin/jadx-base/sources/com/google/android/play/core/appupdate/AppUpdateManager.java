package com.google.android.play.core.appupdate;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import f.c;
import f.i;

/* JADX INFO: loaded from: classes14.dex */
public interface AppUpdateManager {
    Task<Void> completeUpdate();

    Task<AppUpdateInfo> getAppUpdateInfo();

    void registerListener(InstallStateUpdatedListener installStateUpdatedListener);

    Task<Integer> startUpdateFlow(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions);

    @Deprecated
    boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i14, Activity activity, int i15);

    @Deprecated
    boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i14, IntentSenderForResultStarter intentSenderForResultStarter, int i15);

    boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int i14);

    boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i14);

    boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, c<i> cVar, AppUpdateOptions appUpdateOptions);

    void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener);
}
