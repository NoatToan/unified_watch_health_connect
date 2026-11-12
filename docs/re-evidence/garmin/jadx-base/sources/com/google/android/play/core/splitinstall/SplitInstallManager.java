package com.google.android.play.core.splitinstall;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import f.c;
import f.i;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public interface SplitInstallManager {
    Task<Void> cancelInstall(int i14);

    Task<Void> deferredInstall(List<String> list);

    Task<Void> deferredLanguageInstall(List<Locale> list);

    Task<Void> deferredLanguageUninstall(List<Locale> list);

    Task<Void> deferredUninstall(List<String> list);

    Set<String> getInstalledLanguages();

    Set<String> getInstalledModules();

    Task<SplitInstallSessionState> getSessionState(int i14);

    Task<List<SplitInstallSessionState>> getSessionStates();

    void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i14);

    boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i14);

    boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, c<i> cVar);

    Task<Integer> startInstall(SplitInstallRequest splitInstallRequest);

    void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);
}
