package com.huawei.hihealthservice.manager;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealthservice.manager.SyncCloudInitWorkManager;
import defpackage.lgp;
import health.compact.a.EnvironmentInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class SyncCloudInitWorkManager {
    public static void b() throws Throwable {
        if (EnvironmentInfo.l()) {
            return;
        }
        try {
            ReleaseLogUtil.d("R_SyncCloudInitWorkManager", "initSyncCloudNextWork");
            RemoteWorkManager.getInstance(BaseApplication.b()).cancelUniqueWork("oneHourSyncWorkPeriod");
            ComponentName componentName = new ComponentName(BaseApplication.b().getPackageName(), SyncCloudRemoteWorkerService.class.getName());
            RemoteWorkManager.getInstance(BaseApplication.b()).enqueueUniquePeriodicWork("oneHourSyncWorkPeriod", ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) OneHourSyncWorker.class, 1L, TimeUnit.HOURS).setInitialDelay(10L, TimeUnit.MINUTES).addTag("SyncCloudInitWorkManager").setInputData(new Data.Builder().putString(RemoteListenableWorker.ARGUMENT_PACKAGE_NAME, componentName.getPackageName()).putString(RemoteListenableWorker.ARGUMENT_CLASS_NAME, componentName.getClassName()).build()).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.NOT_REQUIRED).setRequiresDeviceIdle(false).build()).build());
            ReleaseLogUtil.d("R_SyncCloudInitWorkManager", "End initSyncCloudNextWork");
        } catch (Exception e) {
            ReleaseLogUtil.e("SyncCloudInitWorkManager", "initSyncCloudNextWork Exception:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static class OneHourSyncWorker extends RemoteListenableWorker {
        public OneHourSyncWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.multiprocess.RemoteListenableWorker
        public ListenableFuture<ListenableWorker.Result> startRemoteWork() {
            SettableFuture settableFutureCreate = SettableFuture.create();
            try {
                ReleaseLogUtil.d("R_SyncCloudInitWorkManager", "Start doWork autoSync");
                ThreadPoolManager.c().a("HiSyncControl_BroadcastSync", new Runnable() { // from class: lfk
                    @Override // java.lang.Runnable
                    public final void run() {
                        SyncCloudInitWorkManager.OneHourSyncWorker.e();
                    }
                });
                ReleaseLogUtil.d("R_SyncCloudInitWorkManager", "End doWork autoSync");
            } catch (Exception unused) {
                ReleaseLogUtil.a("R_SyncCloudInitWorkManager", "doWork exception:");
            }
            settableFutureCreate.set(ListenableWorker.Result.success());
            return settableFutureCreate;
        }

        public static /* synthetic */ void e() {
            lgp.f().a(BaseApplication.b().getPackageName(), 20000, 5);
            lgp.f().p();
        }
    }
}
