package com.huawei.health.suggestion.data;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.btt;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class DataDownloadService extends Service {
    private final IBinder d = new d(null);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("Suggestion_DataDownloadService", "onCreate");
        b();
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.data.DataDownloadService$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.j("Suggestion_DataDownloadService", "downloadFitnessData : planApi is null.");
                return;
            }
            RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
            if (recordApi == null) {
                LogUtil.j("Suggestion_DataDownloadService", "downloadFitnessData recordApi is null.");
            } else {
                recordApi.downloadFitnessRecordFromCloud(new ResultCallback() { // from class: com.huawei.health.suggestion.data.DataDownloadService.3.3
                    @Override // com.huawei.health.suggestion.ResultCallback
                    public void onResult(int i, Object obj) {
                        LogUtil.a("Suggestion_DataDownloadService", "downloadFitnessData resultCode = ", Integer.valueOf(i), " object ", "", obj);
                        planApi.setPlanType(3);
                        planApi.getPlanRecords(0, 0, new UiCallback<List<PlanRecord>>() { // from class: com.huawei.health.suggestion.data.DataDownloadService.3.3.1
                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            public void onFailure(int i2, String str) {
                                LogUtil.a("Suggestion_DataDownloadService", "downloadFitnessData, getPlanRecords errcode = ", Integer.valueOf(i2), " errorInfo ", str);
                                DataDownloadService.this.stopSelf();
                            }

                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(List<PlanRecord> list) {
                                LogUtil.a("Suggestion_DataDownloadService", "downloadFitnessData getPlanRecords success.");
                                DataDownloadService.this.stopSelf();
                            }
                        });
                    }
                });
            }
        }
    }

    private void b() {
        btt.d().c(new AnonymousClass3());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("Suggestion_DataDownloadService", "onStartCommand");
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.d;
    }

    static class d extends Binder {
        private d() {
        }

        /* synthetic */ d(AnonymousClass3 anonymousClass3) {
            this();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Suggestion_DataDownloadService", "onDestroy");
    }
}
