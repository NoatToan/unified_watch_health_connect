package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.sleep.SleepApi;
import com.huawei.health.sport.utils.FitnessDataQueryDefine;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepDailyProcessResultCallback;
import com.huawei.hwbasemgr.SleepMonthlyProcessResultCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = SleepApi.class)
@Singleton
public class uzq implements SleepApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiHealthData f50821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiHealthData f50822b;
    private int d;
    private HiHealthData h;
    private final List<String> j = new ArrayList();
    private final List<String> e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f50823c = new ArrayList();

    static /* synthetic */ int e(uzq uzqVar) {
        int i = uzqVar.d;
        uzqVar.d = i + 1;
        return i;
    }

    @Override // com.huawei.health.sleep.SleepApi
    public void getSleepData(final long j, final IBaseResponseCallback iBaseResponseCallback) {
        uzo.d(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DAY_HISTOGRAM, new HiDataClientListener() { // from class: uzs
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public final void onResult(List list) {
                this.d.d(j, iBaseResponseCallback, list);
            }
        });
    }

    /* synthetic */ void d(long j, IBaseResponseCallback iBaseResponseCallback, List list) {
        HiDeviceInfo hiDeviceInfo;
        LogUtil.a("SleepServiceApi", "getSleepData startTime ", Long.valueOf(j), " clientList ", HiJsonUtil.d(list));
        this.j.clear();
        this.e.clear();
        this.f50823c.clear();
        if (njy.b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HiHealthClient hiHealthClient = (HiHealthClient) it.next();
                if (hiHealthClient != null && (hiDeviceInfo = hiHealthClient.getHiDeviceInfo()) != null) {
                    int deviceType = hiDeviceInfo.getDeviceType();
                    String deviceUniqueCode = hiDeviceInfo.getDeviceUniqueCode();
                    if (deviceType == 506 && !this.f50823c.contains(deviceUniqueCode)) {
                        this.f50823c.add(deviceUniqueCode);
                    } else if (deviceType == 32 && !this.e.contains(deviceUniqueCode)) {
                        this.e.add(deviceUniqueCode);
                    } else if (!this.j.contains(deviceUniqueCode)) {
                        this.j.add(deviceUniqueCode);
                    }
                }
            }
        }
        b(j, iBaseResponseCallback);
    }

    @Override // com.huawei.health.sleep.SleepApi
    public void requestDailyProcessResult(long j, SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback) {
        uzf.e(j, sleepDailyProcessResultCallback);
    }

    @Override // com.huawei.health.sleep.SleepApi
    public void requestAndUpdateDailyResult(final long j, final SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback) {
        HandlerCenter.e("SleepServiceApi").postTask(new Runnable() { // from class: uzr
            @Override // java.lang.Runnable
            public final void run() {
                uag.a(j, (SleepDailyProcessResultCallback<gxd>) sleepDailyProcessResultCallback);
            }
        }, 5000L);
    }

    @Override // com.huawei.health.sleep.SleepApi
    public void getPlanState(IBaseResponseCallback iBaseResponseCallback) {
        uag.e(iBaseResponseCallback);
    }

    @Override // com.huawei.health.sleep.SleepApi
    public Class<?> getSleepManagementJsApi() {
        return SleepManagementJsUtil.class;
    }

    @Override // com.huawei.health.sleep.SleepApi
    public Class<? extends JsBaseModule> getSleepManagementH5Bridge() {
        return tyw.class;
    }

    @Override // com.huawei.health.sleep.SleepApi
    public void requestMonthlyProcessResult(gxc gxcVar, gwv gwvVar, long j, long j2, SleepMonthlyProcessResultCallback<gxh> sleepMonthlyProcessResultCallback) {
        uzf.e(gxcVar, gwvVar, j, j2, sleepMonthlyProcessResultCallback);
    }

    @Override // com.huawei.health.sleep.SleepApi
    public void requestQuestionnaireProcessResult(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        uzf.a(j, j2, iBaseResponseCallback);
    }

    /* JADX INFO: renamed from: uzq$4, reason: invalid class name */
    class AnonymousClass4 implements HiDataClientListener {
        final /* synthetic */ long d;
        final /* synthetic */ CommonUiBaseResponse e;

        AnonymousClass4(long j, CommonUiBaseResponse commonUiBaseResponse) {
            this.d = j;
            this.e = commonUiBaseResponse;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(final List<HiHealthClient> list) {
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final long j = this.d;
            final CommonUiBaseResponse commonUiBaseResponse = this.e;
            threadPoolManagerC.execute(new Runnable() { // from class: uzu
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(j, list, commonUiBaseResponse);
                }
            });
        }

        /* synthetic */ void e(long j, List list, CommonUiBaseResponse commonUiBaseResponse) {
            uzq.this.a(j, list, commonUiBaseResponse);
        }
    }

    @Override // com.huawei.health.sleep.SleepApi
    public void requestSleepDevice(Date date, CommonUiBaseResponse commonUiBaseResponse) {
        long jA = lsl.a(lsl.u(date.getTime()), 20, 0) / 1000;
        uzo.d(jA, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DAY_HISTOGRAM, new AnonymousClass4(jA, commonUiBaseResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j, final List<HiHealthClient> list, final CommonUiBaseResponse commonUiBaseResponse) {
        long j2 = 1000 * j;
        HiHealthManager.d(BaseApplication.b()).fetchDataSourceByType(22000, new HiTimeInterval(j2, lsl.d(j2, 1) - 1), new HiDataClientListener() { // from class: uzq.1
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public void onResult(List<HiHealthClient> list2) {
                ArrayList<uif> arrayListC = uzo.c((List<HiHealthClient>) list, list2);
                if (arrayListC.size() == 1) {
                    arrayListC.clear();
                    LogUtil.a("SleepServiceApi", "only one device not show icon");
                }
                LogUtil.a("SleepServiceApi", "devices is ", arrayListC);
                gwb.b(new Time(j), arrayListC);
                commonUiBaseResponse.onResponse(0, arrayListC);
            }
        });
    }

    private void b(long j, IBaseResponseCallback iBaseResponseCallback) {
        this.d = 0;
        int iD = uzo.d(this.j, this.f50823c, this.e);
        LogUtil.a("SleepServiceApi", "judgePriority priority ", Integer.valueOf(iD));
        if (iD == 1) {
            a(j, this.j, 1, new int[]{1, 3, 2}, iBaseResponseCallback);
            return;
        }
        if (iD == 2) {
            a(j, this.j, 1, new int[]{1, 3}, iBaseResponseCallback);
            return;
        }
        if (iD == 3) {
            a(j, this.j, 1, iBaseResponseCallback);
        } else {
            if (iD == 4) {
                a(j, this.f50823c, 3, new int[]{3, 2}, iBaseResponseCallback);
                return;
            }
            nkb.d().c(j, 3, FitnessDataQueryDefine.e(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC), FitnessDataQueryDefine.c(FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC) * 2, iBaseResponseCallback);
        }
    }

    private void b(List<HiHealthData> list, int i) {
        if (njy.e(list)) {
            LogUtil.j("SleepServiceApi", "setHealthDataByType dataList ", list, " type ", Integer.valueOf(i));
            return;
        }
        if (i == 1) {
            this.h = list.get(0);
            return;
        }
        if (i == 2) {
            this.f50821a = list.get(0);
        } else if (i == 3) {
            this.f50822b = list.get(0);
        } else {
            LogUtil.j("SleepServiceApi", "setHealthDataByType type ", Integer.valueOf(i));
        }
    }

    private void a(final long j, List<String> list, int i, final int[] iArr, final IBaseResponseCallback iBaseResponseCallback) {
        uzo.d(i, list, j * 1000, ((j + ((((long) FitnessDataQueryDefine.e(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC)) * ((long) FitnessDataQueryDefine.c(FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC))) * 60)) * 1000) - 1, new HiAggregateListener() { // from class: uzq.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list2, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list2, int i2, int i3) {
                LogUtil.a("SleepServiceApi", "getDetailForDevice dataList ", HiJsonUtil.d(list2), " errorCode ", Integer.valueOf(i2));
                uzq.e(uzq.this);
                int[] iArr2 = iArr;
                int length = iArr2.length;
                if (length == 2) {
                    uzq.this.d(j, iArr2, list2, iBaseResponseCallback);
                } else if (length == 3) {
                    uzq.this.b(j, iArr2, list2, iBaseResponseCallback);
                } else {
                    LogUtil.j("SleepServiceApi", "getDetailForDevice length ", Integer.valueOf(length));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final long j, int[] iArr, List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = this.d;
        if (i3 == 1) {
            b(list, i);
            if (i2 == 2) {
                a(j, this.e, 2, iArr, iBaseResponseCallback);
                return;
            } else if (i2 == 3) {
                a(j, this.f50823c, 3, iArr, iBaseResponseCallback);
                return;
            } else {
                LogUtil.j("SleepServiceApi", "scenarioForTwoDevice typeSecond ", Integer.valueOf(i2));
                return;
            }
        }
        if (i3 == 2) {
            b(list, i2);
            Object[] objArrA = new Object[3];
            if (i == 1 && i2 == 3) {
                HiHealthData hiHealthData = this.h;
                objArrA = uzo.a(hiHealthData, this.f50822b, 1, 3, hiHealthData, this.j, this.f50823c, this.e);
            } else if (i == 1 && i2 == 2) {
                HiHealthData hiHealthData2 = this.h;
                objArrA = uzo.a(hiHealthData2, this.f50821a, 1, 2, hiHealthData2, this.j, this.f50823c, this.e);
            } else if (i == 3 && i2 == 2) {
                objArrA = uzo.a(this.f50822b, this.f50821a, 3, 2, this.h, this.j, this.f50823c, this.e);
            } else {
                LogUtil.j("SleepServiceApi", "scenarioForTwoDevice typeFirst ", Integer.valueOf(i), " typeSecond ", Integer.valueOf(i2));
            }
            int iE = FitnessDataQueryDefine.e(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC);
            int iC = FitnessDataQueryDefine.c(FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC);
            if (njy.e(objArrA, 1)) {
                return;
            }
            final Object obj = objArrA[1];
            if (obj instanceof Number) {
                nkb.d().c(j, 3, iE, iC * 2, new IBaseResponseCallback() { // from class: uzt
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i4, Object obj2) {
                        this.e.c(j, obj, iBaseResponseCallback, i4, obj2);
                    }
                });
                return;
            }
            return;
        }
        LogUtil.j("SleepServiceApi", "scenarioForTwoDevice mRequestCount ", Integer.valueOf(i3));
    }

    /* synthetic */ void c(long j, Object obj, IBaseResponseCallback iBaseResponseCallback, int i, Object obj2) {
        c(j, ((Integer) obj).intValue(), obj2, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final long j, int[] iArr, List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback) {
        int i = this.d;
        if (i == 1) {
            if (njy.b(list)) {
                this.h = list.get(0);
            }
            a(j, this.f50823c, iArr[1], iArr, iBaseResponseCallback);
            return;
        }
        if (i == 2) {
            if (njy.b(list)) {
                this.f50822b = list.get(0);
            }
            a(j, this.e, iArr[2], iArr, iBaseResponseCallback);
            return;
        }
        if (i == 3) {
            if (njy.b(list)) {
                this.f50821a = list.get(0);
            }
            int iE = FitnessDataQueryDefine.e(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC);
            int iC = FitnessDataQueryDefine.c(FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC);
            Object[] objArrB = uzo.b(this.h, this.f50822b, this.f50821a, this.j, this.f50823c, this.e);
            if (njy.e(objArrB, 1)) {
                return;
            }
            final Object obj = objArrB[1];
            if (obj instanceof Number) {
                nkb.d().c(j, 3, iE, iC * 2, new IBaseResponseCallback() { // from class: uzp
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj2) {
                        this.e.a(j, obj, iBaseResponseCallback, i2, obj2);
                    }
                });
                return;
            }
            return;
        }
        LogUtil.j("SleepServiceApi", "scenarioForThreeDevice mRequestCount ", Integer.valueOf(i));
    }

    /* synthetic */ void a(long j, Object obj, IBaseResponseCallback iBaseResponseCallback, int i, Object obj2) {
        c(j, ((Integer) obj).intValue(), obj2, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, List<String> list, int i, IBaseResponseCallback iBaseResponseCallback) {
        uzo.d(i, list, j * 1000, ((j + ((((long) FitnessDataQueryDefine.e(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC)) * ((long) FitnessDataQueryDefine.c(FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC))) * 60)) * 1000) - 1, new AnonymousClass3(j, iBaseResponseCallback));
    }

    /* JADX INFO: renamed from: uzq$3, reason: invalid class name */
    class AnonymousClass3 implements HiAggregateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f50827c;
        final /* synthetic */ IBaseResponseCallback d;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass3(long j, IBaseResponseCallback iBaseResponseCallback) {
            this.f50827c = j;
            this.d = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("SleepServiceApi", "getDetail dataList ", HiJsonUtil.d(list), " resultCode ", Integer.valueOf(i));
            uzq.e(uzq.this);
            int i3 = uzq.this.d;
            if (i3 == 1) {
                if (njy.b(list)) {
                    uzq.this.h = list.get(0);
                }
                uzq uzqVar = uzq.this;
                uzqVar.a(this.f50827c, (List<String>) uzqVar.e, 2, this.d);
                return;
            }
            if (i3 != 2) {
                LogUtil.j("SleepServiceApi", "getDetail mRequestCount ", Integer.valueOf(uzq.this.d));
                return;
            }
            if (njy.b(list)) {
                uzq.this.f50821a = list.get(0);
            }
            int iE = FitnessDataQueryDefine.e(this.f50827c, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC);
            int iC = FitnessDataQueryDefine.c(FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC);
            nkb nkbVarD = nkb.d();
            final long j = this.f50827c;
            final IBaseResponseCallback iBaseResponseCallback = this.d;
            nkbVarD.c(j, 3, iE, iC * 2, new IBaseResponseCallback() { // from class: uzx
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i4, Object obj) {
                    this.f50847c.e(j, iBaseResponseCallback, i4, obj);
                }
            });
        }

        /* synthetic */ void e(long j, IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
            Object[] objArrA = uzo.a(uzq.this.h, uzq.this.f50821a, (List<String>) uzq.this.j, (List<String>) uzq.this.e);
            if (njy.e(objArrA, 1)) {
                return;
            }
            Object obj2 = objArrA[1];
            if (obj2 instanceof Number) {
                uzq.this.c(j, ((Integer) obj2).intValue(), obj, iBaseResponseCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j, int i, Object obj, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("SleepServiceApi", "getData callback is null");
        }
    }
}
