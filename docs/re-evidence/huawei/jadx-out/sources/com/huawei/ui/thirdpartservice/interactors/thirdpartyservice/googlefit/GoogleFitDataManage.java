package com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.googlefit;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.huawei.health.main.api.FitnessDataInteractorApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import defpackage.lmf;
import defpackage.lsy;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class GoogleFitDataManage {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GoogleApiClient f29147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessDataInteractorApi f29148c;
    private List<List<HiHealthData>> j = new ArrayList(16);
    private List<List<HiHealthData>> f = new ArrayList(16);
    private Handler d = new AnonymousClass3();

    /* JADX INFO: renamed from: com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.googlefit.GoogleFitDataManage$3, reason: invalid class name */
    public class AnonymousClass3 extends Handler {
        AnonymousClass3() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                GoogleFitDataManage.this.h();
            } else {
                if (i != 2) {
                    return;
                }
                LogUtil.a("GoogleFitDataManage", "MSG_AFTER_CONNECT_DELAY_TIME", GoogleFitDataManage.this.f29147b);
                if (GoogleFitDataManage.this.f29147b != null) {
                    lsy.a(new Runnable() { // from class: wzs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.e.c();
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            GoogleFitDataManage.this.j();
            GoogleFitDataManage.this.g();
            GoogleFitDataManage.this.b();
        }
    }

    public GoogleFitDataManage(Context context) {
        if (context == null) {
            LogUtil.a("GoogleFitDataManage", "context == null");
            this.f29146a = BaseApplication.getContext();
        } else {
            this.f29146a = context;
        }
        this.f29148c = (FitnessDataInteractorApi) Services.b("Main", FitnessDataInteractorApi.class);
        this.f29147b = new GoogleApiClient.Builder(this.f29146a).addApi(Fitness.HISTORY_API).addScope(new Scope(Scopes.FITNESS_ACTIVITY_READ_WRITE)).addScope(new Scope(Scopes.FITNESS_BODY_READ_WRITE)).addScope(new Scope(Scopes.FITNESS_LOCATION_READ_WRITE)).addScope(new Scope(Scopes.CLOUD_SAVE)).addConnectionCallbacks(new GoogleApiClient.ConnectionCallbacks(this) { // from class: com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.googlefit.GoogleFitDataManage.5
            @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
            public void onConnected(Bundle bundle) {
                LogUtil.a("GoogleFitDataManage", "Connected!!!");
            }

            @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
            public void onConnectionSuspended(int i) {
                if (i == 2) {
                    LogUtil.a("GoogleFitDataManage", "Connection lost. Cause: Network Lost.");
                } else if (i == 1) {
                    LogUtil.a("GoogleFitDataManage", "Connection lost. Reason: Service Disconnected");
                } else {
                    LogUtil.a("GoogleFitDataManage", "Connection lost. resultCode: ", Integer.valueOf(i));
                }
            }
        }).build();
    }

    public void d() {
        f();
        n();
    }

    private void f() {
        LogUtil.a("GoogleFitDataManage", "enter requestGoogleFitPointDataList");
        this.f29148c.requestGoogleFitPonitDatas(new CommonUiBaseResponse() { // from class: wzq
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public final void onResponse(int i, Object obj) {
                this.f52627b.c(i, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("GoogleFitDataManage", "requestGoogleFitPointDataList errCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof List)) {
            this.j = (List) obj;
        }
        this.d.sendEmptyMessage(1);
    }

    private void n() {
        this.f29148c.requestGoogleFitSegentDatas(new CommonUiBaseResponse() { // from class: wzt
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public final void onResponse(int i, Object obj) {
                this.f52630c.d(i, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, Object obj) {
        synchronized (e) {
            if (i == 0) {
                if (obj instanceof List) {
                    LogUtil.a("GoogleFitDataManage", "requestGoogleSegmentDataList objData.");
                    this.f = (List) obj;
                }
                this.d.sendEmptyMessage(1);
            } else {
                this.d.sendEmptyMessage(1);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("GoogleFitDataManage", "mGoogleApiClient.isConnecting = ", Boolean.valueOf(this.f29147b.isConnecting()), ",isConnected() = ", Boolean.valueOf(this.f29147b.isConnected()));
        if (!this.f29147b.isConnecting() && !this.f29147b.isConnected()) {
            this.f29147b.connect();
        }
        this.d.sendEmptyMessageDelayed(2, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jP = HiDateUtil.p(System.currentTimeMillis());
        LogUtil.a("GoogleFitDataManage", "deleteTodayAllDataToGoogleFit startTime = ", Long.valueOf(jP), " status= ", (Status) Fitness.HistoryApi.deleteData(this.f29147b, new DataDeleteRequest.Builder().setTimeInterval(jP, jCurrentTimeMillis, TimeUnit.MILLISECONDS).deleteAllData().build()).await(1L, TimeUnit.MINUTES));
    }

    private void c(DataSet dataSet, String str, long j, long j2) {
        DataPoint timeInterval = dataSet.createDataPoint().setTimeInterval(j, j2, TimeUnit.MILLISECONDS);
        timeInterval.getValue(Field.FIELD_ACTIVITY).setActivity(str);
        dataSet.add(timeInterval);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    private void b(int i, DataSet dataSet, long j, long j2) {
        switch (i) {
            case 20002:
                c(dataSet, "walking", j, j2);
                break;
            case 20003:
                c(dataSet, "running", j, j2);
                break;
            case 20004:
                c(dataSet, "stair_climbing", j, j2);
                break;
            case 20005:
                c(dataSet, FitnessActivities.BIKING, j, j2);
                break;
            default:
                switch (i) {
                    case 22001:
                        c(dataSet, "sleep.deep", j, j2);
                        break;
                    case 22002:
                        c(dataSet, "sleep.light", j, j2);
                        break;
                    case 22003:
                        c(dataSet, "sleep.awake", j, j2);
                        break;
                    default:
                        switch (i) {
                            case 22101:
                            case 22102:
                            case 22105:
                                c(dataSet, "sleep.light", j, j2);
                                break;
                            case 22103:
                                c(dataSet, "sleep.deep", j, j2);
                                break;
                            case 22104:
                                c(dataSet, "sleep.awake", j, j2);
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        synchronized (e) {
            List<List<HiHealthData>> list = this.f;
            if (list != null && !list.isEmpty()) {
                GoogleApiClient googleApiClient = this.f29147b;
                if (googleApiClient != null) {
                    DataSet dataSetCreate = DataSet.create(new DataSource.Builder().setAppPackageName("com.huawei.health").setDataType(DataType.TYPE_ACTIVITY_SEGMENT).setName("Huawei + steps dataset").setType(0).build());
                    for (List<HiHealthData> list2 : this.f) {
                        if (list2 != null && !list2.isEmpty()) {
                            for (HiHealthData hiHealthData : list2) {
                                b(hiHealthData.getType(), dataSetCreate, hiHealthData.getStartTime(), hiHealthData.getEndTime());
                            }
                        }
                    }
                    if (dataSetCreate.isEmpty()) {
                        return;
                    }
                    Status status = (Status) Fitness.HistoryApi.insertData(this.f29147b, dataSetCreate).await(1L, TimeUnit.MINUTES);
                    if (status.equals(Status.RESULT_SUCCESS)) {
                        b("activity", SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_GOOGLTFIT);
                    }
                    LogUtil.a("GoogleFitDataManage", "activitySegmentDataSetStatus = ", status);
                } else {
                    LogUtil.a("GoogleFitDataManage", "mGoogleApiClient=null = ", googleApiClient);
                }
                return;
            }
            LogUtil.a("GoogleFitDataManage", "mHealthSegmentDataList = null or mHealthSegmentDataList.isEmpty()");
        }
    }

    protected void b(String str, String str2) {
        HashMap map = new HashMap();
        map.put(SyncDataConstant.BI_KEY_ACTIVITY_TYPE, str);
        map.put(SyncDataConstant.BI_KEY_ACCOUNT_TYPE, str2);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.THIRD_ACTIVITY_UPLOAD_2041094.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (e) {
            List<List<HiHealthData>> list = this.j;
            if (list != null && !list.isEmpty()) {
                if (this.f29147b != null) {
                    a();
                    return;
                } else {
                    LogUtil.a("GoogleFitDataManage", "mGoogleApiClient = null.");
                    return;
                }
            }
            LogUtil.a("GoogleFitDataManage", "mHealthDetailPointDataList = null or isEmpty()");
        }
    }

    private void a() {
        i();
        e();
        c();
    }

    private void c() {
        DataSet dataSetCreate = DataSet.create(e(DataType.TYPE_CALORIES_CONSUMED, "Huawei + calories dataset"));
        for (List<HiHealthData> list : this.j) {
            if (list != null && !list.isEmpty()) {
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData.getType() == 4 && hiHealthData.getValue() > 0.0d) {
                        dataSetCreate.add(c(dataSetCreate, Field.FIELD_CALORIES, hiHealthData));
                    }
                }
            }
        }
        if (dataSetCreate.isEmpty()) {
            return;
        }
        LogUtil.a("GoogleFitDataManage", "statusCaloriesDataStatus = ", (Status) Fitness.HistoryApi.insertData(this.f29147b, dataSetCreate).await(1L, TimeUnit.MINUTES));
    }

    private void e() {
        DataSet dataSetCreate = DataSet.create(e(DataType.TYPE_DISTANCE_DELTA, "Huawei + ditance dataset"));
        for (List<HiHealthData> list : this.j) {
            if (list != null && !list.isEmpty()) {
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData.getType() == 3) {
                        dataSetCreate.add(c(dataSetCreate, Field.FIELD_DISTANCE, hiHealthData));
                    }
                }
            }
        }
        if (dataSetCreate.isEmpty()) {
            return;
        }
        LogUtil.a("GoogleFitDataManage", "statusDitanceDataStatus = ", (Status) Fitness.HistoryApi.insertData(this.f29147b, dataSetCreate).await(1L, TimeUnit.MINUTES));
    }

    private void i() {
        DataSet dataSetCreate = DataSet.create(e(DataType.TYPE_STEP_COUNT_DELTA, "Huawei + steps dataset"));
        for (List<HiHealthData> list : this.j) {
            if (list != null && !list.isEmpty()) {
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData.getType() == 2) {
                        dataSetCreate.add(d(dataSetCreate, Field.FIELD_STEPS, hiHealthData));
                    }
                }
            }
        }
        if (dataSetCreate.isEmpty()) {
            return;
        }
        LogUtil.a("GoogleFitDataManage", "statusStepsDataStatus = ", (Status) Fitness.HistoryApi.insertData(this.f29147b, dataSetCreate).await(1L, TimeUnit.MINUTES));
    }

    private DataPoint c(DataSet dataSet, Field field, HiHealthData hiHealthData) {
        DataPoint timeInterval = dataSet.createDataPoint().setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime(), TimeUnit.MILLISECONDS);
        timeInterval.getValue(field).setFloat((float) hiHealthData.getValue());
        return timeInterval;
    }

    private DataPoint d(DataSet dataSet, Field field, HiHealthData hiHealthData) {
        DataPoint timeInterval = dataSet.createDataPoint().setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime(), TimeUnit.MILLISECONDS);
        timeInterval.getValue(field).setInt((int) hiHealthData.getValue());
        return timeInterval;
    }

    private DataSource e(DataType dataType, String str) {
        return new DataSource.Builder().setAppPackageName("com.huawei.health").setDataType(dataType).setName(str).setType(0).build();
    }
}
