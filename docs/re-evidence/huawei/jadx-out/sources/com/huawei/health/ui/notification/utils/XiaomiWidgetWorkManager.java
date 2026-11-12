package com.huawei.health.ui.notification.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ui.notification.utils.XiaomiWidgetWorkManager;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.operation.view.CustomWebView$$ExternalSyntheticBackport0;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class XiaomiWidgetWorkManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10343c;

    public static void d(boolean z) throws Throwable {
        ReleaseLogUtil.d("R_XiaomiWidgetWorkManager", "initNextWork");
        f10343c = i();
        if (z) {
            try {
                RemoteWorkManager.getInstance(BaseApplication.b()).cancelAllWorkByTag("XiaomiWidgetWorkManager");
                ReleaseLogUtil.d("R_XiaomiWidgetWorkManager", "work should cancel");
            } catch (RuntimeException e) {
                ReleaseLogUtil.a("R_XiaomiWidgetWorkManager", "initNextWork Exception:", ExceptionUtils.c(e));
                return;
            }
        }
        ComponentName componentName = new ComponentName(BaseApplication.b().getPackageName(), XiaomiWidgetRemoteWorkerService.class.getName());
        RemoteWorkManager.getInstance(BaseApplication.b()).enqueueUniquePeriodicWork("XiaomiWidgetWorkManager", ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder(XiaomiWidgetRefreshWorker.class, d()).addTag("XiaomiWidgetWorkManager").setInputData(new Data.Builder().putString(RemoteListenableWorker.ARGUMENT_PACKAGE_NAME, componentName.getPackageName()).putString(RemoteListenableWorker.ARGUMENT_CLASS_NAME, componentName.getClassName()).build()).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.NOT_REQUIRED).setRequiresDeviceIdle(false).build()).build());
    }

    private static Duration d() {
        if (Calendar.getInstance().get(11) < 6) {
            return Duration.of(1L, ChronoUnit.HOURS);
        }
        return Duration.of(30L, ChronoUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i() {
        return Calendar.getInstance().get(11) < 6;
    }

    public static void c() {
        try {
            RemoteWorkManager.getInstance(BaseApplication.b()).cancelAllWorkByTag("XiaomiWidgetWorkManager");
            ReleaseLogUtil.d("R_XiaomiWidgetWorkManager", "work canceled");
        } catch (RuntimeException e) {
            ReleaseLogUtil.a("R_XiaomiWidgetWorkManager", "cancel work Exception:", ExceptionUtils.c(e));
        }
    }

    public static boolean a() {
        try {
            return RemoteWorkManager.getInstance(BaseApplication.b()).getWorkInfos(WorkQuery.fromTags((List<String>) CustomWebView$$ExternalSyntheticBackport0.m(new Object[]{"XiaomiWidgetWorkManager"}))).get().stream().anyMatch(new Predicate() { // from class: imu
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return XiaomiWidgetWorkManager.e((WorkInfo) obj);
                }
            });
        } catch (InterruptedException | RuntimeException | ExecutionException e) {
            ReleaseLogUtil.a("R_XiaomiWidgetWorkManager", "get work state Exception:", ExceptionUtils.c(e));
            return false;
        }
    }

    public static /* synthetic */ boolean e(WorkInfo workInfo) {
        return workInfo.getState() == WorkInfo.State.RUNNING;
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static class XiaomiWidgetRefreshWorker extends RemoteListenableWorker {
        public XiaomiWidgetRefreshWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.multiprocess.RemoteListenableWorker
        public ListenableFuture<ListenableWorker.Result> startRemoteWork() throws Throwable {
            SettableFuture settableFutureCreate = SettableFuture.create();
            ReleaseLogUtil.d("R_XiaomiWidgetWorkManager", "WorkManager receiver system scheduler doWork method ", ProcessUtil.c());
            if (!ProcessUtil.a(XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS)) {
                XiaomiWidgetProvider.refreshWhenProcessKilled(BaseApplication.b(), "XiaomiWidgetWorkManager");
            } else {
                XiaomiWidgetProvider.sendForceUpdateBroadcast(BaseApplication.b());
            }
            settableFutureCreate.set(ListenableWorker.Result.success());
            boolean zI = XiaomiWidgetWorkManager.i();
            if (zI != XiaomiWidgetWorkManager.f10343c) {
                XiaomiWidgetWorkManager.d(true);
                boolean unused = XiaomiWidgetWorkManager.f10343c = zI;
            }
            return settableFutureCreate;
        }
    }
}
