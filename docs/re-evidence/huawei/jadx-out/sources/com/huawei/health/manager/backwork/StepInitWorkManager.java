package com.huawei.health.manager.backwork;

import android.content.ComponentName;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import androidx.media3.common.C;
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
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.connectivity.standstepcounter.StandStepDataManager;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import defpackage.lsl;
import health.compact.a.CommonUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.ProcessUtil;
import health.compact.a.StepCounterSupportUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class StepInitWorkManager {
    private StepInitWorkManager() {
    }

    public static void e() {
        if (CommonUtil.bg()) {
            ReleaseLogUtil.d("R_StepInitWorkManager", "initStepNextWork isHuaweiSystem");
            return;
        }
        ReleaseLogUtil.d("R_StepInitWorkManager", "initStepNextWork");
        try {
            RemoteWorkManager.getInstance(BaseApplication.b()).cancelUniqueWork("StepInitWork");
            ComponentName componentName = new ComponentName(BaseApplication.b().getPackageName(), StepRemoteWorkerService.class.getName());
            Data dataBuild = new Data.Builder().putString(RemoteListenableWorker.ARGUMENT_PACKAGE_NAME, componentName.getPackageName()).putString(RemoteListenableWorker.ARGUMENT_CLASS_NAME, componentName.getClassName()).build();
            RemoteWorkManager.getInstance(BaseApplication.b()).enqueueUniquePeriodicWork("stepInitWork_period", ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) StepInitChargeWorker.class, 1L, TimeUnit.HOURS).setInitialDelay(10L, TimeUnit.MINUTES).addTag("StepInitWorkManager").setInputData(dataBuild).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.NOT_REQUIRED).setRequiresDeviceIdle(false).build()).build());
        } catch (Exception e) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("brand", String.valueOf(Build.BRAND));
            linkedHashMap.put("androidOS", String.valueOf(Build.VERSION.SDK_INT));
            linkedHashMap.put("devModel", Build.MODEL);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_BACKWORK_EXCEPTION_2129045.value(), linkedHashMap);
            ReleaseLogUtil.e("StepInitWorkManager", "initStepNextWork Exception:", ExceptionUtils.c(e));
        }
    }

    public static class StepInitChargeWorker extends RemoteListenableWorker {
        public StepInitChargeWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.multiprocess.RemoteListenableWorker
        public ListenableFuture<ListenableWorker.Result> startRemoteWork() {
            SettableFuture settableFutureCreate = SettableFuture.create();
            ReleaseLogUtil.d("R_StepInitWorkManager", "WorkManager receiver system scheduler doWork method", ProcessUtil.c());
            if (!StepCounterSupportUtils.b(BaseApplication.b())) {
                ReleaseLogUtil.d("R_StepInitWorkManager", "WorkManager receiver allowStepCounter false");
                settableFutureCreate.set(ListenableWorker.Result.success());
                return settableFutureCreate;
            }
            boolean zA = a();
            LogicalStepCounter.d(BaseApplication.b()).k();
            if (!zA) {
                ReleaseLogUtil.d("R_StepInitWorkManager", "WorkManager receiver report success");
                HandlerCenter.a().d(new Runnable() { // from class: com.huawei.health.manager.backwork.StepInitWorkManager$StepInitChargeWorker$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.c();
                    }
                }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            }
            settableFutureCreate.set(ListenableWorker.Result.success());
            return settableFutureCreate;
        }

        /* synthetic */ void c() {
            BatteryManager batteryManager = (BatteryManager) BaseApplication.b().getSystemService("batterymanager");
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("brand", String.valueOf(Build.BRAND));
            linkedHashMap.put("androidOS", String.valueOf(Build.VERSION.SDK_INT));
            linkedHashMap.put("devModel", Build.MODEL);
            if (batteryManager != null) {
                linkedHashMap.put("isCharging", String.valueOf(batteryManager.isCharging()));
            } else {
                linkedHashMap.put("isCharging", "unKnown");
            }
            linkedHashMap.put("isReportSuccess", String.valueOf(a()));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_SPORT_BACKWORK_2129044.value(), linkedHashMap);
        }

        public boolean a() {
            ReleaseLogUtil.d("R_StepInitWorkManager", "isAlreadyInitBaseStepToday");
            StandStepDataManager.d dVarJ = LogicalStepCounter.d(BaseApplication.b()).j();
            if (dVarJ.d() != -1) {
                return lsl.c(dVarJ.e(), System.currentTimeMillis());
            }
            ReleaseLogUtil.d("R_StepInitWorkManager", "isAlreadyInitToday is false");
            return false;
        }
    }
}
