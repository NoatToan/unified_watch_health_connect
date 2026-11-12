package com.huawei.health.plan.model.data;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.courseplanservice.api.OnStateListener;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.model.DataSync;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.utils.RiskBiAnalytics;
import defpackage.ghw;
import defpackage.gls;
import defpackage.glv;
import defpackage.gmc;
import defpackage.gmv;
import defpackage.ifp;
import defpackage.pec;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class DataSyncService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f8561b = new DataSyncBinder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8562c = 0;

    public static boolean d(int i, int i2) {
        return i != 4 || i2 == 1 || i2 == 3;
    }

    public boolean d(int i) {
        return (i == 99 || i == 1001) || (i == 200019 || i == 20006 || i == 200030);
    }

    public class DataSyncBinder extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        OnStateListener f8580a;

        public DataSyncBinder() {
        }

        public OnStateListener getListener() {
            return this.f8580a;
        }

        public void setListener(OnStateListener onStateListener) {
            this.f8580a = onStateListener;
        }

        public DataSyncService getDataSyncService() {
            return DataSyncService.this;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        LogUtil.a("Suggestion_DataSyncService", "onCreate enter");
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("Suggestion_DataSyncService", "onStartCommand enter");
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f8561b;
    }

    public void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: glx
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        });
    }

    public /* synthetic */ void a() {
        LogUtil.a("Suggestion_DataSyncService", "Start to syncDataToCloud");
        this.f8562c = 0L;
        e();
    }

    private void e() {
        DataSync syncRecord = gls.b().getSyncRecord(this.f8562c);
        if (syncRecord != null && CommonUtil.ab(this)) {
            this.f8562c = syncRecord.getRecordId();
            switch (syncRecord.getType()) {
                case 1:
                    o(syncRecord);
                    break;
                case 2:
                    m(syncRecord);
                    break;
                case 3:
                    g(syncRecord);
                    break;
                case 4:
                    i(syncRecord);
                    break;
                case 5:
                    d(syncRecord);
                    break;
                case 6:
                    f(syncRecord);
                    break;
                case 7:
                    c(syncRecord);
                    break;
                case 8:
                    a(syncRecord);
                    break;
                case 9:
                    j(syncRecord);
                    break;
                case 10:
                    n(syncRecord);
                    break;
                case 11:
                    h(syncRecord);
                    break;
                default:
                    e(syncRecord);
                    break;
            }
            return;
        }
        b();
    }

    private void j(DataSync dataSync) {
        ReleaseLogUtil.d("Suggestion_DataSyncService", "postDeleteRecordDelete enter ");
        try {
            b(dataSync);
        } catch (NumberFormatException e) {
            LogUtil.e("Suggestion_DataSyncService", "postDeleteRecordDelete, ", LogAnonymous.b(e));
        }
    }

    private void b(final DataSync dataSync) {
        ghw.b().deleteUserWorkoutRecords(Integer.parseInt(dataSync.getValue()), 1, new DataCallback() { // from class: com.huawei.health.plan.model.data.DataSyncService.3
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("Suggestion_DataSyncService", "postDeleteRecordDelete onFailure errorCode = ", Integer.valueOf(i));
                if (i == 15030200) {
                    onSuccess(null);
                } else {
                    DataSyncService.this.c(dataSync, i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("Suggestion_DataSyncService", "postDeleteRecordDelete onSuccess data = ", jSONObject);
                DataSyncService.this.e(dataSync);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DataSync dataSync) {
        gls.b().delSyncRecord(dataSync);
        e();
    }

    private void o(final DataSync dataSync) {
        LogUtil.a("Suggestion_DataSyncService", "data sync and update plan name:", dataSync.getValue());
        String[] strArrA = ifp.a(dataSync.getValue());
        if (strArrA.length != 2) {
            e(dataSync);
        } else {
            gls.b().postPlanName(strArrA[0], ifp.e(strArrA[1]), new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_DataSyncService", "data sync and update plan name fail:", dataSync.toString(), str);
                    if (i == 200019 || i == 1001 || i == 20005 || i == 99) {
                        onSuccess(null);
                    } else if (i == 9999 || i == 1) {
                        DataSyncService.this.d(dataSync, i, str);
                    } else {
                        DataSyncService.this.c(dataSync, i, str);
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_DataSyncService", "data sync plan name:", dataSync.toString(), "update plan name successful");
                    DataSyncService.this.e(dataSync);
                }
            });
        }
    }

    private void m(final DataSync dataSync) {
        LogUtil.a("Suggestion_DataSyncService", "sync data update plan progress:", dataSync);
        gls.b().postPlanProgress(dataSync.getValue(), new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("Suggestion_DataSyncService", "sync data update plan progress fail:", dataSync, str);
                RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_COURSE_CHECK_IN.value(), "updatePlanProgress errorCode: ", Integer.valueOf(i), "errorInfo: ", str);
                if (DataSyncService.this.d(i)) {
                    onSuccess(null);
                } else if (i == 1 || i == 9999) {
                    DataSyncService.this.d(dataSync, i, str);
                } else {
                    DataSyncService.this.c(dataSync, i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_DataSyncService", "sync data update plan progress:", dataSync, "update plan progress success");
                DataSyncService.this.e(dataSync);
            }
        });
    }

    private void n(final DataSync dataSync) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_DataSyncService", "postFeedback : planApi is null.");
            return;
        }
        pec pecVar = (pec) new Gson().fromJson(dataSync.getValue(), pec.class);
        if (pecVar == null) {
            LogUtil.e("Suggestion_DataSyncService", "updatePlanFeedBack userFeedbackBean is null");
        } else {
            LogUtil.a("Suggestion_DataSyncService", "updatePlanFeedBack userFeedbackBean:", new Gson().toJson(pecVar));
            planApi.postFeedback(pecVar, new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.8
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_DataSyncService", "updatePlanFeedBack onFailure: errorCode ", Integer.valueOf(i), "errorInfo:", str);
                    DataSyncService.this.e(dataSync);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_DataSyncService", "updatePlanFeedBack onSuccess:", str);
                    DataSyncService.this.e(dataSync);
                }
            });
        }
    }

    private void c() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("Suggestion_DataSyncService", "clearInvalidExerciseBehavior getAccountInfo == null");
            return;
        }
        glv glvVarN = gmc.g().n();
        List<DataSync> listC = glvVarN.c(accountInfo, 3);
        if (CollectionUtils.a(listC)) {
            return;
        }
        LogUtil.a("Suggestion_DataSyncService", "clearInvalidExerciseBehavior size=", Integer.valueOf(listC.size()));
        for (DataSync dataSync : listC) {
            String[] strArrA = ifp.a(dataSync.getValue());
            if (strArrA.length != 5) {
                LogUtil.j("Suggestion_DataSyncService", "clearInvalidExerciseBehavior delete ", listC);
                glvVarN.b(dataSync);
            } else {
                if (!d(ifp.e((Object) strArrA[4]), ifp.e((Object) strArrA[3]))) {
                    LogUtil.a("Suggestion_DataSyncService", "clearInvalidExerciseBehavior delete ", listC);
                    glvVarN.b(dataSync);
                }
            }
        }
    }

    private void g(final DataSync dataSync) {
        LogUtil.a("Suggestion_DataSyncService", "sync data postExerciseBehavior:", dataSync);
        String[] strArrA = ifp.a(dataSync.getValue());
        if (strArrA.length != 5) {
            e(dataSync);
            return;
        }
        int iE = ifp.e((Object) strArrA[3]);
        int iE2 = ifp.e((Object) strArrA[4]);
        if (!d(iE2, iE)) {
            ReleaseLogUtil.d("Suggestion_DataSyncService", "postExerciseBehavior isSupportPostExerciseBehavior false operType:", Integer.valueOf(iE2), "courseBelongType:", Integer.valueOf(iE));
            c();
            e(dataSync);
        } else {
            WorkoutRecord workoutRecord = new WorkoutRecord();
            workoutRecord.saveWorkoutId(strArrA[0]);
            workoutRecord.saveVersion(strArrA[1]);
            workoutRecord.saveWorkoutPackageId(strArrA[2]);
            workoutRecord.saveCourseBelongType(iE);
            gls.b().postExerciseBehavior(workoutRecord, iE2, new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.7
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_DataSyncService", "postExerciseBehavior fail:", dataSync.toString(), str);
                    if (i == 99 || i == 1001) {
                        onSuccess(null);
                    } else if (i == 9999 || i == 1) {
                        DataSyncService.this.d(dataSync, i, str);
                    } else {
                        DataSyncService.this.c(dataSync, i, str);
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_DataSyncService", "postExerciseBehavior:", dataSync, "postExerciseBehavior successful");
                    DataSyncService.this.e(dataSync);
                }
            });
        }
    }

    private void i(final DataSync dataSync) {
        LogUtil.a("Suggestion_DataSyncService", "upload plan remain:", dataSync);
        String[] strArrA = ifp.a(dataSync.getValue());
        if (strArrA.length != 2) {
            e(dataSync);
        } else {
            gls.b().postPlanRemind(strArrA[0], ifp.e((Object) strArrA[1]), new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.10
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_DataSyncService", "upload plan remain fail:", dataSync.toString(), str);
                    if (i == 99 || i == 1001 || i == 200019 || i == 20008) {
                        onSuccess(null);
                    } else if (i == 9999 || i == 1) {
                        DataSyncService.this.d(dataSync, i, str);
                    } else {
                        DataSyncService.this.c(dataSync, i, str);
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_DataSyncService", "postPlanRemind:", dataSync, "postPlanRemind successful");
                    DataSyncService.this.e(dataSync);
                }
            });
        }
    }

    private void d(final DataSync dataSync) {
        LogUtil.a("Suggestion_DataSyncService", "postBestRecord:", dataSync);
        gls.b().postBestRecord(dataSync.getValue(), new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.6
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_DataSyncService", "postBestRecord fail:", dataSync, str);
                if (i == 99 || i == 1001 || i == 200019) {
                    onSuccess(null);
                } else if (i == 9999 || i == 1) {
                    DataSyncService.this.d(dataSync, i, str);
                } else {
                    DataSyncService.this.c(dataSync, i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_DataSyncService", "postBestRecord:", dataSync, "postBestRecord successful");
                DataSyncService.this.e(dataSync);
            }
        });
    }

    private void f(final DataSync dataSync) {
        LogUtil.a("Suggestion_DataSyncService", "postBestRecordFit:", dataSync);
        gls.b().postBestRecordFit(dataSync.getValue(), new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.9
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_DataSyncService", "postBestRecordFit fail:", dataSync, str);
                if (i == 99 || i == 1001 || i == 200019) {
                    onSuccess(null);
                } else if (i == 9999 || i == 1) {
                    DataSyncService.this.d(dataSync, i, str);
                } else {
                    DataSyncService.this.c(dataSync, i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_DataSyncService", "upload behaviour best record :", dataSync, "upload successful");
                DataSyncService.this.e(dataSync);
            }
        });
    }

    private void c(final DataSync dataSync) {
        LogUtil.a("Suggestion_DataSyncService", "postBestRecordCollect:", dataSync);
        gls.b().collectBehavior(dataSync.getValue(), new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.14
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_DataSyncService", "postBestRecordCollect fail:", dataSync, str);
                if (i == 99 || i == 1001 || i == 200019 || i == 200027) {
                    onSuccess(null);
                } else if (i == 9999 || i == 1) {
                    DataSyncService.this.d(dataSync, i, str);
                } else {
                    DataSyncService.this.c(dataSync, i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_DataSyncService", "postBestRecordCollect:", dataSync, "postBestRecordCollect successful");
                DataSyncService.this.e(dataSync);
            }
        });
    }

    private void a(final DataSync dataSync) {
        LogUtil.a("Suggestion_DataSyncService", "postBestRecordDelete:", dataSync);
        String[] strArrA = ifp.a(dataSync.getValue());
        gls.b().deleteBehavior(strArrA[0], strArrA.length == 2 ? CommonUtil.j(strArrA[1]) : 0, new UiCallback<String>() { // from class: com.huawei.health.plan.model.data.DataSyncService.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_DataSyncService", "postBestRecordDelete fail:", dataSync, str);
                if (i == 99 || i == 1001 || i == 200019) {
                    onSuccess(null);
                } else if (i == 9999 || i == 1) {
                    DataSyncService.this.d(dataSync, i, str);
                } else {
                    DataSyncService.this.c(dataSync, i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_DataSyncService", "postBestRecordDelete:", dataSync, "postBestRecordDelete successful");
                DataSyncService.this.e(dataSync);
            }
        });
    }

    private void h(final DataSync dataSync) {
        ReleaseLogUtil.d("Suggestion_DataSyncService", "updatePlanClock:", dataSync.getValue());
        final WorkoutRecord workoutRecordE = gmv.e(dataSync.getUserId(), dataSync.getValue());
        if (workoutRecordE == null) {
            ReleaseLogUtil.a("Suggestion_DataSyncService", "workoutRecord is null.");
            e(dataSync);
            c(dataSync, 0, null);
            return;
        }
        final d dVar = new d(this, dataSync);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.a("Suggestion_DataSyncService", "intPlanApi is null.");
            c(dataSync, 0, null);
        } else {
            planApi.e(new UiCallback<IntPlan>() { // from class: com.huawei.health.plan.model.data.DataSyncService.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_DataSyncService", "intPlanApi getCurrentIntPlan failed.", Integer.valueOf(i));
                    DataSyncService.this.c(dataSync, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IntPlan intPlan) {
                    if (intPlan == null) {
                        ReleaseLogUtil.a("Suggestion_DataSyncService", "updatePlanProgress() currentPlan == null");
                        DataSyncService.this.e(dataSync);
                    } else {
                        gls.b().updateDayRecord(intPlan, workoutRecordE, dVar);
                    }
                }
            });
        }
    }

    static class d extends DataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DataSync f8581a;
        private WeakReference<DataSyncService> d;

        d(DataSyncService dataSyncService, DataSync dataSync) {
            this.d = new WeakReference<>(dataSyncService);
            this.f8581a = dataSync;
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.d("Suggestion_DataSyncService", "updatePlanClock failed.", Integer.valueOf(i));
            DataSyncService dataSyncService = this.d.get();
            if (dataSyncService == null) {
                LogUtil.e("Suggestion_DataSyncService", "service has destroy.");
            } else if (i == 200019 || i == 200052) {
                ReleaseLogUtil.d("Suggestion_DataSyncService", "updatePlanClock error but finishDataSync");
                dataSyncService.e(this.f8581a);
            } else {
                dataSyncService.c(this.f8581a, i, str);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onSuccess(JSONObject jSONObject) {
            DataSyncService dataSyncService = this.d.get();
            if (dataSyncService == null) {
                LogUtil.e("Suggestion_DataSyncService", "service has destroy.");
            } else {
                ReleaseLogUtil.d("Suggestion_DataSyncService", "updatePlanClock success.", this.f8581a);
                dataSyncService.e(this.f8581a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DataSync dataSync, int i, String str) {
        if (gls.b().isBeyondSyncTimes(dataSync)) {
            LogUtil.a("Suggestion_DataSyncService", "data sync name:", dataSync.toString(), " successful");
            e(dataSync);
        } else {
            c(dataSync, i, str);
        }
    }

    public void c(DataSync dataSync, int i, String str) {
        IBinder iBinder = this.f8561b;
        OnStateListener listener = iBinder instanceof DataSyncBinder ? ((DataSyncBinder) iBinder).getListener() : null;
        if (i == 1001) {
            LogUtil.e("Suggestion_DataSyncService", "param valid.", str);
            gls.b().delSyncRecord(dataSync);
        }
        LogUtil.e("Suggestion_DataSyncService", "fail errorInfo:", str, " dataSync type:", Integer.valueOf(dataSync.getType()));
        if (listener != null) {
            listener.onFailure(i, str);
            stopSelf();
        } else {
            e();
        }
    }

    public void b() {
        LogUtil.a("Suggestion_DataSyncService", "finish sync service");
        OnStateListener listener = ((DataSyncBinder) this.f8561b).getListener();
        if (listener != null) {
            listener.onFinish();
        }
        stopSelf();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Suggestion_DataSyncService", "onDestroy");
    }
}
