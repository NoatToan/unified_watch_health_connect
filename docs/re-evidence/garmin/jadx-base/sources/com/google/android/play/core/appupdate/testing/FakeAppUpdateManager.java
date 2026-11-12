package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import f.c;
import f.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class FakeAppUpdateManager implements AppUpdateManager {
    private final zzc zza;
    private final Context zzb;
    private final List zzc = new ArrayList();

    @InstallStatus
    private int zzd = 0;

    @InstallErrorCode
    private int zze = 0;
    private boolean zzf = false;
    private int zzg = 0;
    private Integer zzh = null;
    private int zzi = 0;
    private long zzj = 0;
    private long zzk = 0;
    private boolean zzl = false;
    private boolean zzm = false;
    private boolean zzn = false;

    @AppUpdateType
    private Integer zzo;

    public FakeAppUpdateManager(Context context) {
        this.zza = new zzc(context);
        this.zzb = context;
    }

    private static int zza() {
        return 67108864;
    }

    @UpdateAvailability
    private final int zzb() {
        if (!this.zzf) {
            return 1;
        }
        int i14 = this.zzd;
        return (i14 == 0 || i14 == 4 || i14 == 5 || i14 == 6) ? 2 : 3;
    }

    private final void zzc() {
        this.zza.zzd(InstallState.zza(this.zzd, this.zzj, this.zzk, this.zze, this.zzb.getPackageName()));
    }

    private final boolean zzd(AppUpdateInfo appUpdateInfo, AppUpdateOptions appUpdateOptions) {
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions) && (!AppUpdateOptions.defaultOptions(appUpdateOptions.appUpdateType()).equals(appUpdateOptions) || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions.appUpdateType()))) {
            return false;
        }
        if (appUpdateOptions.appUpdateType() == 1) {
            this.zzm = true;
            this.zzo = 1;
        } else {
            this.zzl = true;
            this.zzo = 0;
        }
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public Task<Void> completeUpdate() {
        if (this.zze != 0) {
            return Tasks.forException(new InstallException(this.zze));
        }
        int i14 = this.zzd;
        if (i14 != 11) {
            return i14 == 3 ? Tasks.forException(new InstallException(-8)) : Tasks.forException(new InstallException(-7));
        }
        this.zzd = 3;
        this.zzn = true;
        Integer num = 0;
        if (num.equals(this.zzo)) {
            zzc();
        }
        return Tasks.forResult(null);
    }

    public void downloadCompletes() {
        int i14 = this.zzd;
        if (i14 == 2 || i14 == 1) {
            this.zzd = 11;
            this.zzj = 0L;
            this.zzk = 0L;
            Integer num = 0;
            if (num.equals(this.zzo)) {
                zzc();
                return;
            }
            Integer num2 = 1;
            if (num2.equals(this.zzo)) {
                completeUpdate();
            }
        }
    }

    public void downloadFails() {
        int i14 = this.zzd;
        if (i14 == 1 || i14 == 2) {
            this.zzd = 5;
            Integer num = 0;
            if (num.equals(this.zzo)) {
                zzc();
            }
            this.zzo = null;
            this.zzm = false;
            this.zzd = 0;
        }
    }

    public void downloadStarts() {
        if (this.zzd == 1) {
            this.zzd = 2;
            Integer num = 0;
            if (num.equals(this.zzo)) {
                zzc();
            }
        }
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public Task<AppUpdateInfo> getAppUpdateInfo() {
        PendingIntent pendingIntent;
        PendingIntent broadcast;
        PendingIntent broadcast2;
        PendingIntent pendingIntent2;
        PendingIntent broadcast3;
        if (this.zze != 0) {
            return Tasks.forException(new InstallException(this.zze));
        }
        if (zzb() == 2) {
            if (this.zzc.contains(0)) {
                broadcast = PendingIntent.getBroadcast(this.zzb, 0, new Intent(), zza());
                broadcast3 = PendingIntent.getBroadcast(this.zzb, 0, new Intent(), zza());
            } else {
                broadcast = null;
                broadcast3 = null;
            }
            if (this.zzc.contains(1)) {
                PendingIntent broadcast4 = PendingIntent.getBroadcast(this.zzb, 0, new Intent(), zza());
                broadcast2 = PendingIntent.getBroadcast(this.zzb, 0, new Intent(), zza());
                pendingIntent = broadcast4;
            } else {
                pendingIntent = null;
                broadcast2 = null;
            }
            pendingIntent2 = broadcast3;
        } else {
            pendingIntent = null;
            broadcast = null;
            broadcast2 = null;
            pendingIntent2 = null;
        }
        return Tasks.forResult(AppUpdateInfo.zzb(this.zzb.getPackageName(), this.zzg, zzb(), this.zzd, this.zzh, this.zzi, this.zzj, this.zzk, 0L, 0L, pendingIntent, broadcast, broadcast2, pendingIntent2, new HashMap()));
    }

    @AppUpdateType
    public Integer getTypeForUpdateInProgress() {
        return this.zzo;
    }

    public void installCompletes() {
        if (this.zzd == 3) {
            this.zzd = 4;
            this.zzf = false;
            this.zzg = 0;
            this.zzh = null;
            this.zzi = 0;
            this.zzj = 0L;
            this.zzk = 0L;
            this.zzm = false;
            this.zzn = false;
            Integer num = 0;
            if (num.equals(this.zzo)) {
                zzc();
            }
            this.zzo = null;
            this.zzd = 0;
        }
    }

    public void installFails() {
        if (this.zzd == 3) {
            this.zzd = 5;
            Integer num = 0;
            if (num.equals(this.zzo)) {
                zzc();
            }
            this.zzo = null;
            this.zzn = false;
            this.zzm = false;
            this.zzd = 0;
        }
    }

    public boolean isConfirmationDialogVisible() {
        return this.zzl;
    }

    public boolean isImmediateFlowVisible() {
        return this.zzm;
    }

    public boolean isInstallSplashScreenVisible() {
        return this.zzn;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.zza.zzb(installStateUpdatedListener);
    }

    public void setBytesDownloaded(long j8) {
        if (this.zzd != 2 || j8 > this.zzk) {
            return;
        }
        this.zzj = j8;
        Integer num = 0;
        if (num.equals(this.zzo)) {
            zzc();
        }
    }

    public void setClientVersionStalenessDays(Integer num) {
        if (this.zzf) {
            this.zzh = num;
        }
    }

    public void setInstallErrorCode(@InstallErrorCode int i14) {
        this.zze = i14;
    }

    public void setTotalBytesToDownload(long j8) {
        if (this.zzd == 2) {
            this.zzk = j8;
            Integer num = 0;
            if (num.equals(this.zzo)) {
                zzc();
            }
        }
    }

    public void setUpdateAvailable(int i14) {
        this.zzf = true;
        this.zzc.clear();
        this.zzc.add(0);
        this.zzc.add(1);
        this.zzg = i14;
    }

    public void setUpdateNotAvailable() {
        this.zzf = false;
        this.zzh = null;
    }

    public void setUpdatePriority(int i14) {
        if (this.zzf) {
            this.zzi = i14;
        }
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<Integer> startUpdateFlow(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        return zzd(appUpdateInfo, appUpdateOptions) ? Tasks.forResult(-1) : Tasks.forException(new InstallException(-6));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i14, Activity activity, int i15) {
        return zzd(appUpdateInfo, AppUpdateOptions.newBuilder(i14).build());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.zza.zzc(installStateUpdatedListener);
    }

    public void userAcceptsUpdate() {
        if (this.zzl || this.zzm) {
            this.zzl = false;
            this.zzd = 1;
            Integer num = 0;
            if (num.equals(this.zzo)) {
                zzc();
            }
        }
    }

    public void userCancelsDownload() {
        int i14 = this.zzd;
        if (i14 == 1 || i14 == 2) {
            this.zzd = 6;
            Integer num = 0;
            if (num.equals(this.zzo)) {
                zzc();
            }
            this.zzo = null;
            this.zzm = false;
            this.zzd = 0;
        }
    }

    public void userRejectsUpdate() {
        if (this.zzl || this.zzm) {
            this.zzl = false;
            this.zzm = false;
            this.zzo = null;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i14, IntentSenderForResultStarter intentSenderForResultStarter, int i15) {
        return zzd(appUpdateInfo, AppUpdateOptions.newBuilder(i14).build());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int i14) {
        return zzd(appUpdateInfo, appUpdateOptions);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, c<i> cVar, AppUpdateOptions appUpdateOptions) {
        return zzd(appUpdateInfo, appUpdateOptions);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i14) {
        return zzd(appUpdateInfo, appUpdateOptions);
    }

    public void setUpdateAvailable(int i14, @AppUpdateType int i15) {
        this.zzf = true;
        this.zzc.clear();
        this.zzc.add(Integer.valueOf(i15));
        this.zzg = i14;
    }
}
