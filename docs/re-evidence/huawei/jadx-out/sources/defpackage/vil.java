package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.health.weight.WeightApi;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.ICommonReport;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class vil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile HealthOpenSDK f51157b;
    private static d i;
    private static CountDownLatch m;
    private static a n;
    private static final AtomicInteger g = new AtomicInteger();
    private static final AtomicInteger l = new AtomicInteger();
    private static final AtomicInteger f = new AtomicInteger();
    private static final AtomicInteger h = new AtomicInteger();
    private static final AtomicBoolean d = new AtomicBoolean();
    private static final AtomicLong j = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f51156a = new AtomicBoolean();
    private static final Observer e = new Observer() { // from class: vkj
        @Override // com.huawei.haf.design.pattern.Observer
        public final void notify(String str, Object[] objArr) {
            vil.c(str, objArr);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConnectivityManager.NetworkCallback f51158c = new ConnectivityManager.NetworkCallback() { // from class: vil.5
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vlj
                @Override // java.lang.Runnable
                public final void run() {
                    vil.m();
                }
            });
        }
    };

    static /* synthetic */ void c(String str, Object[] objArr) {
        boolean zB = ProcessUtil.b();
        ReleaseLogUtil.c("R_DietDiaryUtils", "OBSERVER label ", str, " objects ", objArr, " isMainProcess ", Boolean.valueOf(zB));
        if (zB && "EXIT_APP".equals(str)) {
            k();
            HandlerCenter.a().d(new Runnable() { // from class: vje
                @Override // java.lang.Runnable
                public final void run() {
                    vil.f();
                }
            }, 200L);
        }
    }

    static /* synthetic */ void f() {
        ObserverManagerUtil.a("EXIT_APP");
        f51156a.set(false);
        ReleaseLogUtil.c("R_DietDiaryUtils", "OBSERVER unregisterObserver EXIT_APP");
    }

    /* JADX INFO: loaded from: classes19.dex */
    static final class d implements ICommonReport {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f51166c;
        private int d;

        d(CountDownLatch countDownLatch) {
            this.f51166c = countDownLatch;
        }

        public void a(int i) {
            this.d = i;
        }

        @Override // com.huawei.hihealth.motion.ICommonReport
        public void report(Bundle bundle) {
            if (bundle == null) {
                ReleaseLogUtil.d("R_DietDiaryUtils", "SportDataCommonReport report bundle is null");
            } else {
                double d = bundle.getInt("carior", 0);
                int iD = (int) UnitUtil.d(d / 1000.0d, 0);
                int iA = DateFormatUtil.a(System.currentTimeMillis());
                vil.h.set(iA);
                vil.f.set(this.d);
                vil.l.set(iD);
                LogUtil.b("DietDiaryUtils", "SportDataCommonReport report calorie ", Double.valueOf(d), " todaySportConsumption ", Integer.valueOf(iD), " queryDate ", Integer.valueOf(this.d), " reportDate ", Integer.valueOf(iA));
            }
            CountDownLatch countDownLatch = this.f51166c;
            if (countDownLatch == null) {
                ReleaseLogUtil.d("R_DietDiaryUtils", "SportDataCommonReport report mCountDownLatch is null");
            } else {
                countDownLatch.countDown();
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements IExecuteResult {
        private a() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            ReleaseLogUtil.c("R_DietDiaryUtils", "SportDataExecuteResult onSuccess object ", obj);
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            int i = vil.g.get();
            if (i < 10) {
                vil.g.set(i + 1);
                HandlerExecutor.c(new Runnable() { // from class: vlu
                    @Override // java.lang.Runnable
                    public final void run() {
                        vil.j("onFailed");
                    }
                }, 200L);
            }
            ReleaseLogUtil.d("R_DietDiaryUtils", "SportDataExecuteResult onFailed atomicRetryCount ", Integer.valueOf(i), " object ", obj);
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            int i = vil.g.get();
            if (i < 5) {
                vil.g.set(i + 1);
                try {
                    BaseApplication.b().startService(new Intent(BaseApplication.b(), (Class<?>) DaemonService.class));
                } catch (IllegalStateException | SecurityException e) {
                    ReleaseLogUtil.b("R_DietDiaryUtils", "onServiceException exception ", ExceptionUtils.c(e));
                }
                vil.j("onServiceException");
            }
            ReleaseLogUtil.d("R_DietDiaryUtils", "SportDataExecuteResult onServiceException atomicRetryCount ", Integer.valueOf(i), " object ", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(final String str) {
        boolean zB = ProcessUtil.b();
        AtomicBoolean atomicBoolean = f51156a;
        ReleaseLogUtil.c("R_DietDiaryUtils", "subscribeSportData source ", str, " isMainProcess ", Boolean.valueOf(zB), " isRegisteredExitApp ", Boolean.valueOf(atomicBoolean.get()));
        if (zB && !atomicBoolean.get()) {
            atomicBoolean.set(true);
            ObserverManagerUtil.d(e, "EXIT_APP");
        }
        d.set(true);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vjn
            @Override // java.lang.Runnable
            public final void run() {
                vil.a(str);
            }
        });
    }

    static /* synthetic */ void a(String str) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "subscribeSportData source ", str, " sHealthOpenSDK ", f51157b);
        if (f51157b == null) {
            Context contextB = BaseApplication.b();
            f51157b = fga.d(contextB).e();
            n = new a();
            fga.d(contextB).d(n);
        }
        if (i == null) {
            m = new CountDownLatch(1);
            i = new d(m);
        }
        i.a(DateFormatUtil.a(System.currentTimeMillis()));
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e2) {
            ReleaseLogUtil.b("R_DietDiaryUtils", "subscribeSportData exception ", ExceptionUtils.c(e2));
        }
        f51157b.a(i, n);
    }

    private static void k() {
        AtomicBoolean atomicBoolean = d;
        boolean z = atomicBoolean.get();
        ReleaseLogUtil.c("R_DietDiaryUtils", "unSubscribeSportData isRegisteredSportData ", Boolean.valueOf(z));
        if (z) {
            atomicBoolean.set(false);
            fga.d(BaseApplication.b()).b(n);
            Future futureSubmit = null;
            try {
                try {
                    futureSubmit = ThreadPoolManager.c().submit(new Callable() { // from class: viv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return vil.g();
                        }
                    });
                    Boolean bool = (Boolean) futureSubmit.get(2000L, TimeUnit.MILLISECONDS);
                    bool.booleanValue();
                    ReleaseLogUtil.c("R_DietDiaryUtils", "unSubscribeSportData result ", bool);
                } finally {
                    if (futureSubmit != null) {
                        futureSubmit.cancel(true);
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                ReleaseLogUtil.b("R_DietDiaryUtils", "unSubscribeSportData exception ", ExceptionUtils.c(e2));
                if (futureSubmit != null) {
                    futureSubmit.cancel(true);
                }
            }
        }
    }

    static /* synthetic */ Boolean g() throws Exception {
        if (f51157b != null) {
            f51157b.e(i);
        }
        return true;
    }

    private static boolean c(vgo vgoVar) {
        if (vgoVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "isInvalidIntakeGoal dietRecord is null");
            return true;
        }
        vfy vfyVarD = vgoVar.d();
        if (vfyVarD == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "isInvalidIntakeGoal dietRecordOverview is null");
            return true;
        }
        float fE = vfyVarD.e();
        LogUtil.b("DietDiaryUtils", "isInvalidIntakeGoal goal ", Float.valueOf(fE));
        return fE <= 0.0f;
    }

    private static int e(vfw vfwVar) {
        if (vfwVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "computeIntakeGoal dietRecordBaseInfo is null");
            return 1200;
        }
        int iA = vfwVar.a();
        int iD = vfwVar.d();
        int iE = vfwVar.e();
        int i2 = (iA + iD) - iE;
        float f2 = iD / 1.2f;
        LogUtil.b("DietDiaryUtils", "computeIntakeGoal activityCalGoal ", Integer.valueOf(iA), " restingCaloriesBasic ", Integer.valueOf(iD), " caloricDeficitGoal ", Integer.valueOf(iE), " goal ", Integer.valueOf(i2), " basalMetabolism ", Float.valueOf(f2), " dietRecordBaseInfo ", vfwVar);
        return (int) UnitUtil.d(Math.max(i2, f2), 0);
    }

    private static void a(vgo vgoVar) {
        vfy vfyVarD = vgoVar.d();
        if (vfyVarD == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "setTodayConsumption dietCalorieOverview is null");
        } else {
            vfyVarD.a(b(vgoVar.c()));
        }
    }

    private static int b(int i2) {
        CountDownLatch countDownLatch;
        boolean z = d.get();
        if (!z || (countDownLatch = m) == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getTodaySportConsumption isRegisteredSportData ", Boolean.valueOf(z), " sSportDataCommonReportCountDownLatch ", m);
            return n();
        }
        try {
            if (!countDownLatch.await(3L, TimeUnit.SECONDS)) {
                ReleaseLogUtil.d("R_DietDiaryUtils", "getTodaySportConsumption isAwait false");
                return n();
            }
            int iN = l.get();
            int i3 = f.get();
            int i4 = h.get();
            if ((i3 != 0 && i3 != i2) || (i4 != 0 && i4 != i2)) {
                ReleaseLogUtil.d("R_DietDiaryUtils", "getToday queryDate is: ", Integer.valueOf(i3), "reportDate is: ", Integer.valueOf(i4), " dateOfDietRecord is: ", Integer.valueOf(i2));
                return n();
            }
            if (iN <= 0) {
                ReleaseLogUtil.d("R_DietDiaryUtils", "getTodaySportConsumption todaySportConsumption ", Integer.valueOf(iN));
                iN = n();
            }
            LogUtil.b("DietDiaryUtils", "getTodaySportConsumption todaySportConsumption ", Integer.valueOf(iN));
            return iN;
        } catch (InterruptedException e2) {
            ReleaseLogUtil.b("R_DietDiaryUtils", "getTodaySportConsumption exception ", ExceptionUtils.c(e2));
            return n();
        }
    }

    private static int n() {
        vgo vgoVarC = iuo.c();
        if (vgoVarC == null || !lsl.aa(DateFormatUtil.d(vgoVarC.c()))) {
            LogUtil.e("DietDiaryUtils", "getTodaySportConsumptionCache dietRecord ", vgoVarC);
            return 0;
        }
        vfy vfyVarD = vgoVarC.d();
        if (vfyVarD == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getTodaySportConsumptionCache dietCalorieOverview is null");
            return 0;
        }
        int iD = (int) UnitUtil.d(vfyVarD.a(), 0);
        LogUtil.b("DietDiaryUtils", "getTodaySportConsumptionCache todaySportConsumptionCache ", Integer.valueOf(iD));
        return iD;
    }

    private static vgo c(int i2, long j2, vfy vfyVar, List<vgw> list) {
        vgo vgoVar = new vgo(i2, j2, vfyVar, list, lsl.q(j2));
        vgoVar.d(j2);
        return vgoVar;
    }

    private static vfy d(long j2, long j3, float f2) {
        int iA;
        float fB;
        int iC;
        int iE;
        vfw vfwVarA = a(j2, j3);
        int iB = vfwVarA.b();
        if (lsl.aa(j2)) {
            fB = b(DateFormatUtil.a(j2));
            iA = vfwVarA.a();
            iE = vfwVarA.e();
            iC = vfwVarA.c();
        } else {
            iA = 0;
            fB = 0.0f;
            iC = iB;
            iE = 0;
        }
        vfy vfyVar = new vfy(f2, fB, e(vfwVarA), iB);
        vfyVar.e(vfwVarA.h());
        vfyVar.b(iA);
        vfyVar.d(iE);
        vfyVar.a(iC);
        LogUtil.b("DietDiaryUtils", "getDietCalorieOverview endTime ", Long.valueOf(j2), " timeout ", Long.valueOf(j3), " intake ", Float.valueOf(f2), " dietRecordBaseInfo ", vfwVarA, " dietCalorieOverview ", vfyVar);
        return vfyVar;
    }

    private static vfw a(final long j2, long j3) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "getDietRecordBaseInfo endTime ", Long.valueOf(j2), " timeout ", Long.valueOf(j3));
        final vfw vfwVar = new vfw();
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        WeightTargetDifferences weightTargetDifferencesK = iuo.k();
        if (weightTargetDifferencesK != null) {
            LogUtil.b("DietDiaryUtils", "getDietRecordBaseInfo weightTargetDifferencesCache ", weightTargetDifferencesK);
            d(j2, vfwVar, countDownLatch, weightTargetDifferencesK);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vkc
                @Override // java.lang.Runnable
                public final void run() {
                    vng.c((ResponseCallback<WeightTargetDifferences>) new ResponseCallback() { // from class: vkr
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            vil.a(countDownLatch, j, vfwVar, i2, (WeightTargetDifferences) obj);
                        }
                    });
                }
            });
        }
        ivd ivdVarN = iuo.n();
        if (ivdVarN != null) {
            LogUtil.b("DietDiaryUtils", "getDietRecordBaseInfo weightManagerCache ", ivdVarN);
            vfwVar.c(ivdVarN.e());
            vfwVar.e(ivdVarN.b());
            countDownLatch.countDown();
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vkb
                @Override // java.lang.Runnable
                public final void run() {
                    nkf.a().d(new ResponseCallback() { // from class: vlk
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            vil.c(vfwVar, countDownLatch, i2, (Pair) obj);
                        }
                    });
                }
            });
        }
        Map<Integer, List<HiHealthData>> mapD = iuo.d(j2);
        int iE = e(mapD, DicDataTypeUtil.DataType.RESTING_METABOLISM.value());
        AtomicLong atomicLong = j;
        final long j4 = atomicLong.get();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE > 0 && Math.abs(jCurrentTimeMillis - j4) <= 60000) {
            LogUtil.b("DietDiaryUtils", "getDietRecordBaseInfo timeMillis ", Long.valueOf(j4), " mapCache ", mapD);
            d(j2, vfwVar, countDownLatch, mapD);
        } else {
            atomicLong.set(jCurrentTimeMillis);
            ThreadPoolManager.c().execute(new Runnable() { // from class: vke
                @Override // java.lang.Runnable
                public final void run() {
                    long j5 = j2;
                    vil.d(true, j5, (ResponseCallback<Map<Integer, List<HiHealthData>>>) new ResponseCallback() { // from class: vku
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            vil.a(j, j5, vfwVar, countDownLatch, i2, (Map) obj);
                        }
                    });
                }
            });
        }
        try {
            ReleaseLogUtil.c("R_DietDiaryUtils", "getDietRecordBaseInfo isAwait ", Boolean.valueOf(countDownLatch.await(j3 <= 0 ? 5000L : j3, TimeUnit.MILLISECONDS)), " timeout ", Long.valueOf(j3));
        } catch (InterruptedException e2) {
            ReleaseLogUtil.b("R_DietDiaryUtils", "getDietRecordBaseInfo exception ", ExceptionUtils.c(e2));
        }
        LogUtil.b("DietDiaryUtils", "getDietRecordBaseInfo dietRecordBaseInfo ", vfwVar);
        return vfwVar;
    }

    static /* synthetic */ void a(CountDownLatch countDownLatch, long j2, vfw vfwVar, int i2, WeightTargetDifferences weightTargetDifferences) {
        LogUtil.b("DietDiaryUtils", "getDietRecordBaseInfo weightTargetDifferences ", weightTargetDifferences);
        if (weightTargetDifferences == null) {
            countDownLatch.countDown();
        } else {
            d(j2, vfwVar, countDownLatch, weightTargetDifferences);
        }
    }

    static /* synthetic */ void c(vfw vfwVar, CountDownLatch countDownLatch, int i2, Pair pair) {
        if (pair != null && pair.second != null) {
            ivd ivdVar = (ivd) pair.second;
            LogUtil.b("DietDiaryUtils", "getDietRecordBaseInfo weightManager ", ivdVar);
            vfwVar.c(ivdVar.e());
            vfwVar.e(ivdVar.b());
        }
        countDownLatch.countDown();
    }

    static /* synthetic */ void a(long j2, long j3, vfw vfwVar, CountDownLatch countDownLatch, int i2, Map map) {
        LogUtil.b("DietDiaryUtils", "getDietRecordBaseInfo timeMillis ", Long.valueOf(j2), " map ", map);
        d(j3, vfwVar, countDownLatch, (Map<Integer, List<HiHealthData>>) map);
    }

    private static void d(final long j2, final vfw vfwVar, final CountDownLatch countDownLatch, WeightTargetDifferences weightTargetDifferences) {
        long jA = weightTargetDifferences.a();
        int iA = lsl.a(jA);
        int iA2 = lsl.a(j2);
        ReleaseLogUtil.c("R_DietDiaryUtils", "setWeightTargetDifferences targetBeginDate ", Long.valueOf(jA), " targetBeginDateDay ", Integer.valueOf(iA), " endTimeDay ", Integer.valueOf(iA2), " endTime ", Long.valueOf(j2));
        if (iA <= iA2) {
            vfwVar.b(weightTargetDifferences.c() / 1000.0d);
            countDownLatch.countDown();
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vjt
                @Override // java.lang.Runnable
                public final void run() {
                    long j3 = j2;
                    vil.a(vil.b(0L, j3, lsl.q(j3), false), (ResponseCallback<Map<Integer, vgo>>) new ResponseCallback() { // from class: vjy
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            vil.b(vfwVar, countDownLatch, i2, (Map) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void b(vfw vfwVar, CountDownLatch countDownLatch, int i2, Map map) {
        vgo vgoVar;
        vfy vfyVarD;
        LogUtil.b("DietDiaryUtils", "setWeightTargetDifferences readDietRecord map ", map);
        if (map != null) {
            Set<Map.Entry> setEntrySet = map.entrySet();
            if (njy.b(setEntrySet)) {
                for (Map.Entry entry : setEntrySet) {
                    if (entry != null && (vgoVar = (vgo) entry.getValue()) != null && (vfyVarD = vgoVar.d()) != null) {
                        vfwVar.b(vfyVarD.j());
                        break;
                    }
                }
            }
        }
        countDownLatch.countDown();
    }

    private static void d(final long j2, final vfw vfwVar, final CountDownLatch countDownLatch, Map<Integer, List<HiHealthData>> map) {
        if (map == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "setRestingCalories map is null");
            return;
        }
        final List<HiHealthData> list = map.get(Integer.valueOf(DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM.value()));
        int iE = e(map, DicDataTypeUtil.DataType.RESTING_METABOLISM.value());
        if (iE <= 0) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "setRestingCalories restingCaloriesBasic ", Integer.valueOf(iE));
            ThreadPoolManager.c().execute(new Runnable() { // from class: vjk
                @Override // java.lang.Runnable
                public final void run() {
                    vil.c(j2, (List<HiHealthData>) list, vfwVar, countDownLatch);
                }
            });
            return;
        }
        vfwVar.d(iE);
        int iE2 = e(map, DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE.value());
        if (iE2 > 0) {
            iE = iE2;
        }
        vfwVar.b(iE);
        c(j2, list, vfwVar);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(long j2, List<HiHealthData> list, vfw vfwVar, CountDownLatch countDownLatch) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.BASAL_METABOLISM});
        hiAggregateOption.setType(new int[]{2024});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setStartTime(lsl.c(j2, -29));
        LogUtil.b("DietDiaryUtils", "queryBasalMetabolismList hiAggregateOption ", hiAggregateOption, " currentRestingCaloriesList ", list, " dietRecordBaseInfo ", vfwVar);
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new AnonymousClass1(j2, list, vfwVar, countDownLatch));
    }

    /* JADX INFO: renamed from: vil$1, reason: invalid class name */
    class AnonymousClass1 implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f51159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f51160c;
        final /* synthetic */ long d;
        final /* synthetic */ vfw e;

        AnonymousClass1(long j, List list, vfw vfwVar, CountDownLatch countDownLatch) {
            this.d = j;
            this.f51160c = list;
            this.e = vfwVar;
            this.f51159b = countDownLatch;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ReleaseLogUtil.c("R_DietDiaryUtils", "queryBasalMetabolismList errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
            double d = 0.0d;
            if (njy.b(list)) {
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData != null && hiHealthData.getDouble(BleConstants.BASAL_METABOLISM) > 0.0d && String.valueOf(0).equals(hiHealthData.getMetaData())) {
                        d = hiHealthData.getDouble(BleConstants.BASAL_METABOLISM);
                        break;
                    }
                }
            }
            final int iD = (int) UnitUtil.d(1.2000000476837158d * d, 0);
            LogUtil.b("DietDiaryUtils", "queryBasalMetabolismList restingCaloriesBasic ", Integer.valueOf(iD), " basalMetabolism ", Double.valueOf(d));
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final long j = this.d;
            final List list2 = this.f51160c;
            final vfw vfwVar = this.e;
            final CountDownLatch countDownLatch = this.f51159b;
            threadPoolManagerC.execute(new Runnable() { // from class: vlr
                @Override // java.lang.Runnable
                public final void run() {
                    vil.AnonymousClass1.e(iD, j, list2, vfwVar, countDownLatch);
                }
            });
        }

        static /* synthetic */ void e(final int i, final long j, final List list, final vfw vfwVar, final CountDownLatch countDownLatch) {
            if (i <= 0) {
                vil.d(j, (List<HiHealthData>) list, vfwVar, countDownLatch);
            } else {
                vil.c(i, j, (ResponseCallback<Integer>) new ResponseCallback() { // from class: vln
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i2, Object obj) {
                        vil.AnonymousClass1.d(vfwVar, i, j, list, countDownLatch, i2, (Integer) obj);
                    }
                });
            }
        }

        static /* synthetic */ void d(vfw vfwVar, int i, long j, List list, CountDownLatch countDownLatch, int i2, Integer num) {
            ReleaseLogUtil.c("R_DietDiaryUtils", "queryBasalMetabolismList insertErrorCode ", Integer.valueOf(i2));
            if (i2 == 0) {
                vfwVar.d(i);
                vil.c(j, (List<HiHealthData>) list, vfwVar);
            }
            countDownLatch.countDown();
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.b("DietDiaryUtils", "queryBasalMetabolismList onResultIntent intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3), " list ", list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final long j2, final List<HiHealthData> list, final vfw vfwVar, final CountDownLatch countDownLatch) {
        if (vfwVar.i() == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "queryWeightList userInfomation is null");
            countDownLatch.countDown();
        } else {
            long jA = lsl.a(j2, -1);
            b(lsl.c(jA, -29), jA, (ResponseCallback<Double>) new ResponseCallback() { // from class: vjh
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    vil.d(j2, list, vfwVar, countDownLatch, i2, (Double) obj);
                }
            });
        }
    }

    static /* synthetic */ void d(final long j2, final List list, final vfw vfwVar, final CountDownLatch countDownLatch, int i2, Double d2) {
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        if (dDoubleValue > 0.0d) {
            d(j2, (List<HiHealthData>) list, vfwVar, countDownLatch, dDoubleValue);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vin
                @Override // java.lang.Runnable
                public final void run() {
                    long j3 = j2;
                    vil.b(0L, j3, (ResponseCallback<Double>) new ResponseCallback() { // from class: vky
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i3, Object obj) {
                            Double d3 = (Double) obj;
                            vil.d(j3, (List<HiHealthData>) list, vfwVar, countDownLatch, d3 != null ? d3.doubleValue() : 0.0d);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(long j2, long j3, final ResponseCallback<Double> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "queryWeight callback is null startTime ", Long.valueOf(j2), " endTime ", Long.valueOf(j3));
            return;
        }
        HiAggregateOption hiAggregateOptionC = iun.c("");
        hiAggregateOptionC.setSortOrder(1);
        hiAggregateOptionC.setAggregateType(1);
        hiAggregateOptionC.setGroupUnitType(0);
        hiAggregateOptionC.setCount(1);
        hiAggregateOptionC.setTimeRange(j2, j3);
        LogUtil.b("DietDiaryUtils", "queryWeight hiAggregateOption ", hiAggregateOptionC);
        vng.b(hiAggregateOptionC, (ResponseCallback<List<dnb>>) new ResponseCallback() { // from class: vla
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                vil.e(responseCallback, i2, (List) obj);
            }
        });
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, int i2, List list) {
        dnb dnbVar;
        LogUtil.b("DietDiaryUtils", "queryWeight errorCode ", Integer.valueOf(i2), " list ", list);
        responseCallback.onResponse(i2, Double.valueOf((!njy.b(list) || (dnbVar = (dnb) list.get(0)) == null) ? 0.0d : dnbVar.av()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final long j2, final List<HiHealthData> list, final vfw vfwVar, final CountDownLatch countDownLatch, double d2) {
        UserInfomation userInfomationI = vfwVar.i();
        if (userInfomationI == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "setRestingCaloriesBasic userInfomation is null");
            countDownLatch.countDown();
            return;
        }
        double weight = d2 > 0.0d ? d2 : userInfomationI.getWeight();
        int height = userInfomationI.getHeight();
        int age = userInfomationI.getAge();
        if (weight <= 0.0d || height <= 0 || age <= 0) {
            LogUtil.e("DietDiaryUtils", "setRestingCaloriesBasic weight ", Double.valueOf(weight), " height ", Integer.valueOf(height), " age ", Integer.valueOf(age));
            countDownLatch.countDown();
            return;
        }
        int gender = userInfomationI.getGender();
        double d3 = ((10.0d * weight) + (((double) height) * 6.25d)) - ((double) (age * 5));
        double d4 = (gender == 0 ? d3 + 5.0d : d3 - 161.0d) * 1.2d;
        final int iD = (int) UnitUtil.d(d4, 0);
        if (iD <= 0) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "setRestingCaloriesBasic restingCaloriesBasic ", Integer.valueOf(iD));
            countDownLatch.countDown();
        } else {
            LogUtil.b("DietDiaryUtils", "setRestingCaloriesBasic lastWeight ", Double.valueOf(d2), " weight ", Double.valueOf(weight), " height ", Integer.valueOf(height), " age ", Integer.valueOf(age), " gender ", Integer.valueOf(gender), " tempRestingCaloriesBasic ", Double.valueOf(d4), " restingCaloriesBasic ", Integer.valueOf(iD));
            ThreadPoolManager.c().execute(new Runnable() { // from class: vjm
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = iD;
                    long j3 = j2;
                    vil.c(i2, j3, (ResponseCallback<Integer>) new ResponseCallback() { // from class: vkl
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i3, Object obj) {
                            vil.a(vfwVar, i2, j3, list, countDownLatch, i3, (Integer) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void a(vfw vfwVar, int i2, long j2, List list, CountDownLatch countDownLatch, int i3, Integer num) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "setRestingCaloriesBasic insertErrorCode ", Integer.valueOf(i3));
        if (i3 == 0) {
            vfwVar.d(i2);
            c(j2, (List<HiHealthData>) list, vfwVar);
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(long j2, long j3, ResponseCallback<Map<Integer, Integer>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "querySportCalories callback is null");
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{40003});
        hiAggregateOption.setConstantsKey(new String[]{"calorie_sum"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setStartTime(j2);
        hiAggregateOption.setEndTime(j3);
        LogUtil.b("DietDiaryUtils", "querySportCalories hiAggregateOption ", hiAggregateOption);
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new AnonymousClass2(responseCallback));
    }

    /* JADX INFO: renamed from: vil$2, reason: invalid class name */
    class AnonymousClass2 implements HiAggregateListener {
        final /* synthetic */ ResponseCallback d;

        AnonymousClass2(ResponseCallback responseCallback) {
            this.d = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, final int i, int i2) {
            ReleaseLogUtil.c("R_DietDiaryUtils", "querySportCalories errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
            final HashMap map = new HashMap();
            if (njy.b(list)) {
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData != null) {
                        map.put(Integer.valueOf(DateFormatUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault())), Integer.valueOf((int) UnitUtil.d(((double) hiHealthData.getInt("calorie_sum")) / 1000.0d, 0)));
                    }
                }
            }
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final ResponseCallback responseCallback = this.d;
            threadPoolManagerC.execute(new Runnable() { // from class: vlp
                @Override // java.lang.Runnable
                public final void run() {
                    responseCallback.onResponse(i, map);
                }
            });
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            ReleaseLogUtil.c("R_DietDiaryUtils", "querySportCalories onResultIntent intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(long j2, List<HiHealthData> list, vfw vfwVar) {
        int i2;
        double dR;
        double d2;
        if (vfwVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "setRestingCaloriesBurned dietRecordBaseInfo is null timeMillis ", Long.valueOf(j2), " currentRestingCaloriesList ", list);
            return;
        }
        int iA = lsl.a(j2);
        int iA2 = lsl.a(System.currentTimeMillis());
        double dB = vfwVar.b();
        ReleaseLogUtil.c("R_DietDiaryUtils", "setRestingCaloriesBurned timeMillis ", Long.valueOf(j2), " timeDays ", Integer.valueOf(iA), " currentDays ", Integer.valueOf(iA2));
        int i3 = 0;
        if (iA < iA2) {
            vfwVar.a((int) UnitUtil.d(dB, 0));
            LogUtil.b("DietDiaryUtils", "setRestingCaloriesBurned restingCalories ", Double.valueOf(dB), " dietRecordBaseInfo ", vfwVar);
            return;
        }
        double d3 = 1000.0d;
        long modifiedTime = 0;
        if (njy.b(list)) {
            i2 = 0;
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData != null) {
                    int iD = (int) UnitUtil.d(hiHealthData.getValue() / d3, i3);
                    LogUtil.b("DietDiaryUtils", "setRestingCaloriesBurned currentRestingCaloriesTemp ", Integer.valueOf(iD), " currentRestingCalories ", Integer.valueOf(i2));
                    if (iD > i2) {
                        modifiedTime = hiHealthData.getModifiedTime();
                        i2 = iD;
                    }
                    i3 = 0;
                    d3 = 1000.0d;
                }
            }
        } else {
            i2 = 0;
        }
        double dCurrentTimeMillis = System.currentTimeMillis();
        if (i2 <= 0) {
            dR = lsl.r(System.currentTimeMillis());
        } else {
            dR = modifiedTime;
            if (dCurrentTimeMillis <= dR) {
                d2 = 0.0d;
            }
            vfwVar.a((int) UnitUtil.d(((double) i2) + (((dB / 24.0d) / 60.0d) * d2), 0));
            LogUtil.b("DietDiaryUtils", "setRestingCaloriesBurned restingCalories ", Double.valueOf(dB), " currentRestingCalories ", Integer.valueOf(i2), " modifiedTime ", Long.valueOf(modifiedTime), " diffMinute ", Double.valueOf(d2), " dietRecordBaseInfo ", vfwVar, " currentRestingCaloriesList ", list);
        }
        d2 = ((dCurrentTimeMillis - dR) / 1000.0d) / 60.0d;
        vfwVar.a((int) UnitUtil.d(((double) i2) + (((dB / 24.0d) / 60.0d) * d2), 0));
        LogUtil.b("DietDiaryUtils", "setRestingCaloriesBurned restingCalories ", Double.valueOf(dB), " currentRestingCalories ", Integer.valueOf(i2), " modifiedTime ", Long.valueOf(modifiedTime), " diffMinute ", Double.valueOf(d2), " dietRecordBaseInfo ", vfwVar, " currentRestingCaloriesList ", list);
    }

    private static vgo e(vgo vgoVar) {
        if (vgoVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "dietRecord is null");
            return null;
        }
        return new vgo(vgoVar.c(), vgoVar.i(), vgoVar.d(), vgoVar.a(), vgoVar.g());
    }

    private static Object b(long j2, long j3, String str, boolean z) {
        int i2 = 1;
        if (i()) {
            vhx vhxVar = new vhx();
            int iA = DateFormatUtil.a(j2, lsl.a(str));
            int iA2 = DateFormatUtil.a(j3, lsl.a(str));
            vhxVar.d(iA);
            vhxVar.b(iA2);
            vhxVar.b((Integer) 0);
            vhxVar.d((Integer) 1);
            if (iA != iA2 && z) {
                i2 = 0;
            }
            vhxVar.a(Integer.valueOf(i2));
            return vhxVar;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(lsl.c(j2, -1));
        hiDataReadOption.setEndTime(lsl.a(j3, 1));
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.DIET_RECORD.value()});
        hiDataReadOption.setSortOrder(1);
        LogUtil.b("DietDiaryUtils", "getDietRecordOption hiDataReadOption ", hiDataReadOption);
        return hiDataReadOption;
    }

    private static void b(final long j2, final long j3) {
        boolean zB = ProcessUtil.b();
        ReleaseLogUtil.c("R_DietDiaryUtils", "syncDietRecordToDevice isMainProcess ", Boolean.valueOf(zB), " startTime ", Long.valueOf(j2), " endTime ", Long.valueOf(j3));
        if (zB) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vll
                @Override // java.lang.Runnable
                public final void run() {
                    vil.d(j2, j3);
                }
            });
        }
    }

    static /* synthetic */ void d(long j2, long j3) {
        lvb.e();
        ezn.b(j2, j3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final vgo vgoVar, final boolean z, final ResponseCallback<vgo> responseCallback) {
        boolean zE = lua.e();
        ReleaseLogUtil.c("R_DietDiaryUtils", "insertDietRecord isQueryDietRecord ", Boolean.valueOf(z), " isPullAllStatus ", Boolean.valueOf(zE));
        if (vgoVar == null) {
            if (responseCallback != null) {
                responseCallback.onResponse(AwarenessConstants.ERROR_UNKNOWN_CODE, null);
                return;
            }
            return;
        }
        if (i()) {
            e(new vhs(vgoVar.c(), vgoVar.a(), vgoVar.g()), z, new ResponseCallback<String>() { // from class: vil.3
                @Override // com.huawei.hwbasemgr.ResponseCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i2, String str) {
                    ReleaseLogUtil.c("R_DietDiaryUtils", "insertDietRecord isQueryDietRecord ", Boolean.valueOf(z), " errorCode ", Integer.valueOf(i2), " object ", str);
                    ResponseCallback responseCallback2 = responseCallback;
                    if (responseCallback2 == null) {
                        ReleaseLogUtil.d("R_DietDiaryUtils", "insertDietRecord callback is null");
                    } else {
                        responseCallback2.onResponse(0, vgoVar);
                    }
                }
            });
            return;
        }
        if (!zE) {
            if (responseCallback != null) {
                responseCallback.onResponse(600002, null);
                return;
            }
            return;
        }
        if (c(vgoVar)) {
            if (responseCallback != null) {
                responseCallback.onResponse(AwarenessConstants.ERROR_UNKNOWN_CODE, null);
                return;
            }
            return;
        }
        final String strG = vgoVar.g();
        final long jI = vgoVar.i();
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(DicDataTypeUtil.DataType.DIET_RECORD_SET.value());
        hiHealthData.setTimeZone(strG);
        hiHealthData.setStartTime(jI);
        hiHealthData.setEndTime(jI);
        hiHealthData.setDeviceUuid("-1");
        if (z) {
            hiHealthData.setModifiedTime(vgoVar.b());
        }
        HashMap map = new HashMap();
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.DIET_RECORD.value()), HiJsonUtil.d(vgoVar));
        hiHealthData.setFieldsMetaData(HiJsonUtil.d(map));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.b("DietDiaryUtils", "insertDietRecord hiDataInsertOption ", hiDataInsertOption);
        HiHealthNativeApi.a(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: vkf
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                vil.e(z, responseCallback, vgoVar, jI, strG, i2, obj);
            }
        });
    }

    static /* synthetic */ void e(final boolean z, final ResponseCallback responseCallback, final vgo vgoVar, final long j2, final String str, final int i2, Object obj) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "insertDietRecord isQueryDietRecord ", Boolean.valueOf(z), " errorCode ", Integer.valueOf(i2), " object ", obj);
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "insertDietRecord callback is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vjl
                @Override // java.lang.Runnable
                public final void run() {
                    vil.b(z, i2, responseCallback, vgoVar, j2, str);
                }
            });
        }
    }

    static /* synthetic */ void b(boolean z, int i2, ResponseCallback responseCallback, vgo vgoVar, long j2, String str) {
        if (z || i2 != 0) {
            responseCallback.onResponse(i2, vgoVar);
        } else {
            responseCallback.onResponse(i2, vgoVar);
            LogUtil.b("DietDiaryUtils", "insertDietRecord time ", Long.valueOf(j2), " timeZone ", str, " dietRecord ", vgoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj, ResponseCallback<Map<Integer, vgo>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "readDietRecord callback is null");
            return;
        }
        if (obj == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "readDietRecord getDietaryIntakeRequest is null");
            responseCallback.onResponse(-1, new HashMap());
        } else if (i()) {
            b(obj, responseCallback);
        } else {
            c(obj, responseCallback);
        }
    }

    private static void b(Object obj, ResponseCallback<Map<Integer, vgo>> responseCallback) {
        if (!(obj instanceof vhx)) {
            LogUtil.e("DietDiaryUtils", "readDietRecord request type error");
            return;
        }
        vhx vhxVar = (vhx) obj;
        LogUtil.b("DietDiaryUtils", "readDietRecord startDay ", Integer.valueOf(vhxVar.a()), " endDay ", Integer.valueOf(vhxVar.d()));
        c(responseCallback, vhxVar);
    }

    private static void c(Object obj, ResponseCallback<Map<Integer, vgo>> responseCallback) {
        if (!(obj instanceof HiDataReadOption)) {
            LogUtil.e("DietDiaryUtils", "readDietRecord request type error");
            return;
        }
        HiDataReadOption hiDataReadOption = (HiDataReadOption) obj;
        LogUtil.b("DietDiaryUtils", "readDietRecord hiDataReadOption ", hiDataReadOption);
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthData(hiDataReadOption, new AnonymousClass10(responseCallback));
    }

    /* JADX INFO: renamed from: vil$10, reason: invalid class name */
    class AnonymousClass10 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResponseCallback f51161b;

        AnonymousClass10(ResponseCallback responseCallback) {
            this.f51161b = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, final int i, int i2) {
            ReleaseLogUtil.c("R_DietDiaryUtils", "readDietRecord onResult errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
            try {
                final Map mapC = vil.c(obj, i);
                ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
                final ResponseCallback responseCallback = this.f51161b;
                threadPoolManagerC.execute(new Runnable() { // from class: vlq
                    @Override // java.lang.Runnable
                    public final void run() {
                        responseCallback.onResponse(i, mapC);
                    }
                });
            } catch (Exception e) {
                ReleaseLogUtil.b("R_DietDiaryUtils", "readDietRecord onResult exception: ", ExceptionUtils.c(e));
                ThreadPoolManager threadPoolManagerC2 = ThreadPoolManager.c();
                final ResponseCallback responseCallback2 = this.f51161b;
                threadPoolManagerC2.execute(new Runnable() { // from class: vlo
                    @Override // java.lang.Runnable
                    public final void run() {
                        responseCallback2.onResponse(i, new HashMap());
                    }
                });
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            ReleaseLogUtil.c("R_DietDiaryUtils", "readDietRecord onResultIntent intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3), " object ", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Integer, vgo> c(Object obj, int i2) {
        vgo vgoVar;
        HashMap map = new HashMap();
        if (obj instanceof SparseArray) {
            Object obj2 = ((SparseArray) obj).get(DicDataTypeUtil.DataType.DIET_RECORD.value());
            if (njy.b(obj2, HiHealthData.class)) {
                for (HiHealthData hiHealthData : (List) obj2) {
                    if (hiHealthData != null) {
                        String metaData = hiHealthData.getMetaData();
                        if (!TextUtils.isEmpty(metaData) && (vgoVar = (vgo) HiJsonUtil.d(metaData, vgo.class)) != null) {
                            long jI = vgoVar.i();
                            if (b(jI)) {
                                ReleaseLogUtil.d("R_DietDiaryUtils", "readDietRecord onResult time ", Long.valueOf(jI), " data ", hiHealthData);
                                jI *= 1000;
                                vgoVar.a(jI);
                            }
                            int iD = d(vgoVar, jI, vgoVar.g());
                            vgoVar.d(hiHealthData.getModifiedTime());
                            vgoVar.e();
                            map.put(Integer.valueOf(iD), vgoVar);
                        }
                    }
                }
            }
        }
        return map;
    }

    private static boolean b(long j2) {
        return String.valueOf(j2).matches("\\d{10}");
    }

    private static void c(ResponseCallback<Map<Integer, vgo>> responseCallback, vhx vhxVar) {
        int i2;
        CountDownLatch countDownLatch;
        int i3;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = DateFormatUtil.d(vhxVar.d());
        long jD2 = DateFormatUtil.d(vhxVar.a());
        AtomicInteger atomicInteger = new AtomicInteger(0);
        if (vhxVar.b().intValue() == 0) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            d(vhxVar, countDownLatch2, (ConcurrentHashMap<Integer, vgo>) concurrentHashMap, atomicInteger);
            i3 = 0;
            countDownLatch = countDownLatch2;
            i2 = 0;
        } else {
            i2 = 0;
            for (long jD3 = jD; jD3 >= jD2; jD3 = lsl.d(jD3, -7)) {
                i2++;
            }
            countDownLatch = new CountDownLatch(i2);
            i3 = 0;
        }
        while (i3 < i2) {
            long jD4 = lsl.d(jD, -6);
            if (jD4 < jD2) {
                jD4 = jD2;
            }
            vhx vhxVar2 = new vhx();
            vhxVar2.a(vhxVar);
            vhxVar2.d(DateFormatUtil.a(jD4));
            vhxVar2.b(DateFormatUtil.a(jD));
            d(vhxVar2, countDownLatch, (ConcurrentHashMap<Integer, vgo>) concurrentHashMap, atomicInteger);
            jD = lsl.d(jD, -7);
            i3++;
        }
        try {
            ReleaseLogUtil.c("R_DietDiaryUtils", "readDietRecordDiffOverview isAwait ", Boolean.valueOf(countDownLatch.await(10L, TimeUnit.SECONDS)), " time ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            responseCallback.onResponse(atomicInteger.get(), concurrentHashMap);
        } catch (InterruptedException e2) {
            ReleaseLogUtil.b("R_DietDiaryUtils", "read diet count down latch error", ExceptionUtils.c(e2));
            responseCallback.onResponse(-1, new HashMap<>());
        }
    }

    private static void d(vhx vhxVar, final CountDownLatch countDownLatch, final ConcurrentHashMap<Integer, vgo> concurrentHashMap, final AtomicInteger atomicInteger) {
        vht.c().b(vhxVar, new ResponseCallback() { // from class: vjz
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                vil.b(countDownLatch, concurrentHashMap, atomicInteger, i2, (via) obj);
            }
        });
    }

    static /* synthetic */ void b(CountDownLatch countDownLatch, ConcurrentHashMap concurrentHashMap, AtomicInteger atomicInteger, int i2, via viaVar) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "readDietRecord cloud API errorCode ", Integer.valueOf(i2));
        if (i2 == -1 || viaVar == null) {
            countDownLatch.countDown();
            return;
        }
        for (vgo vgoVar : viaVar.c()) {
            long jI = vgoVar.i();
            if (String.valueOf(jI).matches("\\d{10}")) {
                ReleaseLogUtil.d("R_DietDiaryUtils", "readDietRecord onResult time ", Long.valueOf(jI));
                jI *= 1000;
                vgoVar.a(jI);
            }
            int iD = d(vgoVar, jI, vgoVar.g());
            vgoVar.e();
            concurrentHashMap.put(Integer.valueOf(iD), vgoVar);
        }
        if (i2 == -2) {
            atomicInteger.set(i2);
        }
        countDownLatch.countDown();
    }

    private static int d(vgo vgoVar, long j2, String str) {
        if (String.valueOf(vgoVar.c()).matches("\\d{8}")) {
            return vgoVar.c();
        }
        if (lsl.r(j2, lsl.d()) == j2) {
            int iA = DateFormatUtil.a(j2, lsl.d());
            vgoVar.e(iA);
            return iA;
        }
        int iA2 = DateFormatUtil.a(j2, lsl.a(str));
        vgoVar.e(iA2);
        return iA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final int i2, long j2, final ResponseCallback<Integer> responseCallback) {
        if (i2 <= 0) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "insertBasicRestingCalories restingCaloriesBasic ", Integer.valueOf(i2));
            if (responseCallback != null) {
                responseCallback.onResponse(-1, Integer.valueOf(i2));
                return;
            }
            return;
        }
        boolean zE = lua.e();
        LogUtil.b("DietDiaryUtils", "insertBasicRestingCalories restingCaloriesBasic ", Integer.valueOf(i2), " timeMillis ", Long.valueOf(j2), " isPullAllStatus ", Boolean.valueOf(zE));
        if (!zE) {
            if (responseCallback != null) {
                responseCallback.onResponse(600002, Integer.valueOf(i2));
                return;
            }
            return;
        }
        HiHealthData hiHealthData = new HiHealthData();
        long jR = lsl.r(j2);
        hiHealthData.setEndTime(jR);
        hiHealthData.setStartTime(jR);
        hiHealthData.setModifiedTime(1L);
        hiHealthData.setType(DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value());
        hiHealthData.setDeviceUuid("-1");
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.RESTING_METABOLISM.value()), Integer.valueOf(i2 * 1000));
        hiHealthData.setFieldsValue(HiJsonUtil.d(map));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.b("DietDiaryUtils", "insertBasicRestingCalories hiDataInsertOption ", hiDataInsertOption);
        HiHealthNativeApi.a(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: vjq
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i3, Object obj) {
                vil.e(responseCallback, i2, i3, obj);
            }
        });
    }

    static /* synthetic */ void e(final ResponseCallback responseCallback, final int i2, final int i3, Object obj) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "insertBasicRestingCalories errorCode ", Integer.valueOf(i3), " object ", obj);
        if (i3 == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value()));
            b(arrayList);
        }
        if (responseCallback != null) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vki
                @Override // java.lang.Runnable
                public final void run() {
                    responseCallback.onResponse(i3, Integer.valueOf(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final boolean z, final long j2, final ResponseCallback<Map<Integer, List<HiHealthData>>> responseCallback) {
        int[] iArr;
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "readRestingCalorie callback is null");
            return;
        }
        if (lsl.aa(j2)) {
            iArr = new int[]{DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE.value(), DicDataTypeUtil.DataType.RESTING_METABOLISM.value(), DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM.value()};
        } else {
            iArr = new int[]{DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE.value(), DicDataTypeUtil.DataType.RESTING_METABOLISM.value()};
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        if (!z) {
            hiDataReadOption.setReadType(1);
        }
        hiDataReadOption.setEndTime(lsl.c(j2));
        hiDataReadOption.setStartTime(lsl.r(j2));
        LogUtil.b("DietDiaryUtils", "readRestingCalorie hiDataReadOption ", hiDataReadOption, " timeMillis ", Long.valueOf(j2), " isReadUser ", Boolean.valueOf(z));
        LogUtil.b("DietDiaryUtils", "readRestingCalorie hiDataReadOption ", hiDataReadOption, " timeMillis ", Long.valueOf(j2));
        HiHealthManager.d(BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: vil.6
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                ReleaseLogUtil.c("R_DietDiaryUtils", "readRestingCalorie onResult errorCode ", Integer.valueOf(i2), " isReadUser ", Boolean.valueOf(z), " timeMillis ", Long.valueOf(j2));
                vil.e(z, j2, i2, obj, (ResponseCallback<Map<Integer, List<HiHealthData>>>) responseCallback);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                ReleaseLogUtil.c("R_DietDiaryUtils", "readRestingCalorie onResultIntent intentType ", Integer.valueOf(i2), " errorCode ", Integer.valueOf(i3), " anchor ", Integer.valueOf(i4), " object ", obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(boolean z, final long j2, final int i2, Object obj, final ResponseCallback<Map<Integer, List<HiHealthData>>> responseCallback) {
        final HashMap map = new HashMap();
        if (obj instanceof SparseArray) {
            SparseArray sparseArray = (SparseArray) obj;
            Object obj2 = sparseArray.get(DicDataTypeUtil.DataType.RESTING_METABOLISM.value());
            if (njy.b(obj2, HiHealthData.class)) {
                List list = (List) obj2;
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.RESTING_METABOLISM.value()), list);
                if (z && f(list)) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: viz
                        @Override // java.lang.Runnable
                        public final void run() {
                            vil.d(false, j2, (ResponseCallback<Map<Integer, List<HiHealthData>>>) responseCallback);
                        }
                    });
                    return;
                }
            }
            Object obj3 = sparseArray.get(DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE.value());
            if (njy.b(obj3, HiHealthData.class)) {
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE.value()), (List) obj3);
            }
            Object obj4 = sparseArray.get(DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM.value());
            if (njy.b(obj4, HiHealthData.class)) {
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM.value()), (List) obj4);
            }
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: viy
            @Override // java.lang.Runnable
            public final void run() {
                responseCallback.onResponse(i2, map);
            }
        });
        iuo.d(j2, map);
    }

    private static boolean f(List<HiHealthData> list) {
        HiHealthData hiHealthData;
        return (njy.e(list) || (hiHealthData = list.get(0)) == null || ((int) UnitUtil.d(hiHealthData.getValue() / 1000.0d, 0)) > 0) ? false : true;
    }

    private static int e(Map<Integer, List<HiHealthData>> map, int i2) {
        if (map == null) {
            ReleaseLogUtil.d("DietDiaryUtils", "getRestingCalories map is null key ", Integer.valueOf(i2));
            return 0;
        }
        List<HiHealthData> list = map.get(Integer.valueOf(i2));
        if (njy.e(list)) {
            ReleaseLogUtil.d("DietDiaryUtils", "getRestingCalories list ", list, " key ", Integer.valueOf(i2));
            return 0;
        }
        int iMax = 0;
        int iMax2 = 0;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                int iD = (int) UnitUtil.d(hiHealthData.getValue() / 1000.0d, 0);
                if (hiHealthData.getModifiedTime() == 1) {
                    iMax = Math.max(iMax, iD);
                } else {
                    iMax2 = Math.max(iMax2, iD);
                }
            }
        }
        LogUtil.b("DietDiaryUtils", "getRestingCalories formulaRestingCalories ", Integer.valueOf(iMax), " restingCalories ", Integer.valueOf(iMax2), " key ", Integer.valueOf(i2), " map ", map);
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private static void e(vgw vgwVar) {
        if (vgwVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "setEatTime meal is null");
            return;
        }
        long jD = vgwVar.d();
        if (String.valueOf(jD).matches("\\d{10}")) {
            vgwVar.a(jD * 1000);
        }
    }

    private static long d(long j2) {
        long jR = lsl.r(j2);
        long jR2 = lsl.r(System.currentTimeMillis());
        int iA = lsl.a(jR, jR2);
        long j3 = iA > 1 ? jR : jR2;
        ReleaseLogUtil.c("R_DietDiaryUtils", "getStartTime eatTime ", Long.valueOf(j2), " eatStartTime ", Long.valueOf(jR), " currentStartTime ", Long.valueOf(jR2), " intervalDay ", Integer.valueOf(iA), " startTime ", Long.valueOf(j3));
        return j3;
    }

    public static void b(final List<Integer> list) {
        int iE = lsw.e(60000, 600000);
        ReleaseLogUtil.c("R_DietDiaryUtils", "syncCloud syncDataTypeList ", list, " delayTimeMillis ", Integer.valueOf(iE));
        HandlerCenter.a().d(new Runnable() { // from class: vlb
            @Override // java.lang.Runnable
            public final void run() {
                vil.c(list);
            }
        }, iE);
    }

    static /* synthetic */ void c(List list) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataTypes(list);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, new HiCommonListener() { // from class: vil.7
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i2, Object obj) {
                ReleaseLogUtil.c("R_DietDiaryUtils", "syncCloud onSuccess errorCode ", Integer.valueOf(i2), " object ", obj);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i2, Object obj) {
                ReleaseLogUtil.d("R_DietDiaryUtils", "syncCloud onFailure errorCode ", Integer.valueOf(i2), " errorMessage ", obj);
            }
        });
    }

    public static void c(final vgw vgwVar, final ResponseCallback<vgo> responseCallback) {
        if (vgwVar == null) {
            LogUtil.e("R_DietDiaryUtils", "addMeal meal is null");
            d(responseCallback, -1, (vgo) null);
            return;
        }
        LogUtil.b("DietDiaryUtils", "addMeal meal ", vgwVar);
        e(vgwVar);
        vgwVar.d(System.currentTimeMillis());
        final long jD = d(vgwVar.d());
        final long jC = lsl.c(jD);
        a(b(jD, jC, vgwVar.g(), false), (ResponseCallback<Map<Integer, vgo>>) new ResponseCallback() { // from class: vkp
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                vil.c(vgwVar, i2, (Map<Integer, vgo>) obj, (ResponseCallback<vgo>) responseCallback, jD, jC);
            }
        });
        vft.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final vgw vgwVar, int i2, final Map<Integer, vgo> map, final ResponseCallback<vgo> responseCallback, final long j2, final long j3) {
        LogUtil.b("DietDiaryUtils", "addMeal readDietRecord errorCode ", Integer.valueOf(i2), " map ", map);
        if (i2 == -2) {
            e(vgwVar, responseCallback, i2);
        } else if (map == null) {
            LogUtil.e("R_DietDiaryUtils", "addMeal readDietRecord map is null");
            d(responseCallback, i2, (vgo) null);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: viq
                @Override // java.lang.Runnable
                public final void run() {
                    vil.c(vgwVar, (Map<Integer, vgo>) map, (ResponseCallback<vgo>) responseCallback, j2, j3);
                }
            });
        }
    }

    private static void e(vgw vgwVar, ResponseCallback<vgo> responseCallback, int i2) {
        vhv.c(Collections.singletonList(vgwVar));
        NetworkUtil.d(f51158c);
        d(responseCallback, i2, (vgo) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(vgw vgwVar, Map<Integer, vgo> map, final ResponseCallback<vgo> responseCallback, final long j2, final long j3) {
        c(vgwVar);
        String strD = HiJsonUtil.d(a(vgwVar, map, DateFormatUtil.a(vgwVar.d(), lsl.a(vgwVar.g()))));
        LogUtil.b("DietDiaryUtils", "addMeal readDietRecord dietRecord ", strD);
        c((vgo) HiJsonUtil.d(strD, vgo.class), false, (ResponseCallback<vgo>) new ResponseCallback() { // from class: vjx
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                vil.d(responseCallback, j2, j3, i2, (vgo) obj);
            }
        });
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, long j2, long j3, int i2, vgo vgoVar) {
        LogUtil.b("DietDiaryUtils", "addMeal insertDietRecord resultCode ", Integer.valueOf(i2), " resultDietRecord ", vgoVar);
        d((ResponseCallback<vgo>) responseCallback, i2, vgoVar);
        if (i2 != 0) {
            LogUtil.e("R_DietDiaryUtils", "addMeal insertDietRecord resultCode ", Integer.valueOf(i2), " startTime ", Long.valueOf(j2), " endTime ", Long.valueOf(j3));
        } else {
            b(j2, j3);
        }
    }

    private static void c(vgw vgwVar) {
        String strG = vgwVar.g();
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        long jD = vgwVar.d();
        if (lsl.q(jD).equals(strG)) {
            return;
        }
        int offset = TimeZone.getDefault().getOffset(jD);
        int rawOffset = TimeZone.getTimeZone("GMT" + strG).getRawOffset();
        vgwVar.a((((long) offset) + jD) - ((long) rawOffset));
        LogUtil.b("DietDiaryUtils", "addMeal readDietRecord eatTime ", Long.valueOf(jD), " offset ", Integer.valueOf(offset), " rawOffset ", Integer.valueOf(rawOffset));
    }

    private static vgo a(vgw vgwVar, Map<Integer, vgo> map, int i2) {
        vgo vgoVar = map.get(Integer.valueOf(i2));
        if (vgoVar == null) {
            return c(i2, lsl.r(vgwVar.d()), (vfy) null, (List<vgw>) Collections.singletonList(vgwVar));
        }
        vgoVar.b(vgwVar);
        return vgoVar;
    }

    private static void d(ResponseCallback<vgo> responseCallback, int i2, vgo vgoVar) {
        if (responseCallback != null) {
            responseCallback.onResponse(i2, vgoVar);
        }
    }

    public static void b(final vgw vgwVar, final ResponseCallback<vgo> responseCallback) {
        if (vgwVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "updateMeal meal is null");
            if (responseCallback != null) {
                responseCallback.onResponse(-1, null);
                return;
            }
            return;
        }
        e(vgwVar);
        vgwVar.d(System.currentTimeMillis());
        final long jD = vgwVar.d();
        final long jD2 = d(jD);
        final long jC = lsl.c(jD2);
        a(b(jD2, jC, vgwVar.g(), false), (ResponseCallback<Map<Integer, vgo>>) new ResponseCallback() { // from class: vkm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                vil.b(vgwVar, responseCallback, jD, jD2, jC, i2, (Map) obj);
            }
        });
    }

    static /* synthetic */ void b(vgw vgwVar, ResponseCallback responseCallback, long j2, long j3, long j4, int i2, Map map) {
        LogUtil.b("DietDiaryUtils", "updateMeal readDietRecord errorCode ", Integer.valueOf(i2), " map ", map);
        if (i2 == -2) {
            e(vgwVar, (ResponseCallback<vgo>) responseCallback, i2);
            return;
        }
        if (map == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "updateMeal readDietRecord map is null");
            d((ResponseCallback<vgo>) responseCallback, i2, (vgo) null);
            return;
        }
        int iA = DateFormatUtil.a(j2, lsl.a(vgwVar.g()));
        vgo vgoVar = (vgo) map.get(Integer.valueOf(iA));
        if (vgoVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "updateMeal readDietRecord dietRecord is null dayFormat ", Integer.valueOf(iA));
            d((ResponseCallback<vgo>) responseCallback, i2, (vgo) null);
            return;
        }
        boolean zC = vgoVar.c(vgwVar);
        LogUtil.b("DietDiaryUtils", "updateMeal readDietRecord isSuccess ", Boolean.valueOf(zC), " eatTime ", Long.valueOf(j2), " dayFormat ", Integer.valueOf(iA), " dietRecord ", vgoVar);
        if (!zC) {
            d((ResponseCallback<vgo>) responseCallback, i2, vgoVar);
        } else {
            c((ResponseCallback<vgo>) responseCallback, vgoVar, j3, j4);
        }
    }

    private static void c(final ResponseCallback<vgo> responseCallback, vgo vgoVar, final long j2, final long j3) {
        final String strD = HiJsonUtil.d(vgoVar);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vkw
            @Override // java.lang.Runnable
            public final void run() {
                vil.c((vgo) HiJsonUtil.d(strD, vgo.class), false, (ResponseCallback<vgo>) new ResponseCallback() { // from class: vkk
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i2, Object obj) {
                        vil.e(responseCallback, j, j, i2, (vgo) obj);
                    }
                });
            }
        });
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, long j2, long j3, int i2, vgo vgoVar) {
        LogUtil.b("DietDiaryUtils", "updateMeal insertDietRecord resultCode ", Integer.valueOf(i2), " resultDietRecord ", vgoVar);
        if (responseCallback != null) {
            responseCallback.onResponse(i2, vgoVar);
        }
        if (i2 != 0) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "updateMeal insertDietRecord resultCode ", Integer.valueOf(i2), " startTime ", Long.valueOf(j2), " endTime ", Long.valueOf(j3));
        } else {
            b(j2, j3);
        }
    }

    public static void l() {
        nkf.a().d(new ResponseCallback() { // from class: vlm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                vil.e(i2, (Pair) obj);
            }
        });
    }

    static /* synthetic */ void e(int i2, Pair pair) {
        if (pair == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "updateOnePointFull pair is null");
            return;
        }
        ivd ivdVar = (ivd) pair.second;
        if (ivdVar == null) {
            LogUtil.e("DietDiaryUtils", "weightManager is null");
            return;
        }
        iuv onePointFull = ((WeightApi) Services.b("Main", WeightApi.class)).getOnePointFull(ivdVar.i());
        iuv iuvVarA = ivdVar.a();
        LogUtil.b("DietDiaryUtils", "onePointFull is : ", onePointFull, "onePointFull in weightManager is : ", iuvVarA);
        if (!a(onePointFull, iuvVarA)) {
            LogUtil.b("DietDiaryUtils", "is not need to updateOnePointFull");
        } else {
            long jLongValue = ((Long) pair.first).longValue();
            nlx.d(ivdVar, jLongValue > 0 ? jLongValue + 1000 : System.currentTimeMillis(), false, (ResponseCallback<ivd>) null, false, onePointFull);
        }
    }

    public static void b(final List<vgw> list, final ResponseCallback<List<vgo>> responseCallback) {
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "recordMeals meal is null or empty");
            c(responseCallback, -1, new ArrayList());
            return;
        }
        j(list);
        e eVarA = a(list);
        if (eVarA == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "recordMeals failed to calculate time range");
            c(responseCallback, -1, new ArrayList());
        } else {
            final long jD = eVarA.d();
            final long jC = eVarA.c();
            LogUtil.b("DietDiaryUtils", "recordMeals meals size: ", Integer.valueOf(list.size()), " startTime: ", Long.valueOf(jD), " endTime: ", Long.valueOf(jC));
            a(b(jD, jC, HiDateUtil.c((String) null), false), (ResponseCallback<Map<Integer, vgo>>) new ResponseCallback() { // from class: vjg
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    vil.c(responseCallback, list, jD, jC, i2, (Map) obj);
                }
            });
        }
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, List list, long j2, long j3, int i2, Map map) {
        if (map == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "recordMeals readDietRecord map is null");
            c((ResponseCallback<List<vgo>>) responseCallback, i2, new ArrayList());
            return;
        }
        List<vgo> listC = c((List<vgw>) list, (Map<Integer, vgo>) map, j2, j3);
        if (listC.isEmpty()) {
            ReleaseLogUtil.c("DietDiaryUtils", "recordMeals fusion success");
            c((ResponseCallback<List<vgo>>) responseCallback, 0, new ArrayList());
        } else {
            b(listC, (ResponseCallback<List<vgo>>) responseCallback, j2, j3);
        }
    }

    private static void j(List<vgw> list) {
        for (vgw vgwVar : list) {
            if (vgwVar != null) {
                e(vgwVar);
            }
        }
    }

    private static e a(List<vgw> list) {
        return new e(d(((vgw) Collections.min(list, Comparator.comparingLong(new vlg()))).d()), lsl.c(((vgw) Collections.max(list, Comparator.comparingLong(new vlg()))).d()));
    }

    private static List<vgo> c(List<vgw> list, Map<Integer, vgo> map, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (vgw vgwVar : list) {
            if (vgwVar != null) {
                int iA = DateFormatUtil.a(vgwVar.d(), lsl.a(vgwVar.g()));
                LogUtil.b("DietDiaryUtils", "recordMeals dayFormat is: ", Integer.valueOf(iA));
                vgo vgoVarC = map.get(Integer.valueOf(iA));
                if (vgoVarC == null) {
                    vgoVarC = c(vgwVar, iA);
                    LogUtil.e("R_DietDiaryUtils", "recordMeals created new dietRecord, dayFormat is: ", Integer.valueOf(iA));
                } else {
                    boolean zE = vgoVarC.e(vgwVar);
                    LogUtil.b("DietDiaryUtils", "recordMeals recordMeal isSuccess: ", Boolean.valueOf(zE), " dayFormat: ", Integer.valueOf(iA), " dietRecord: ", vgoVarC);
                    if (!zE) {
                    }
                }
                map2.put(Integer.valueOf(iA), vgoVarC);
                map.put(Integer.valueOf(iA), vgoVarC);
            }
        }
        arrayList.addAll(map2.values());
        return arrayList;
    }

    private static vgo c(vgw vgwVar, int i2) {
        return c(i2, lsl.r(vgwVar.d()), d(System.currentTimeMillis(), 0L, vgwVar.e()), (List<vgw>) Collections.singletonList(vgwVar));
    }

    private static void b(List<vgo> list, final ResponseCallback<List<vgo>> responseCallback, final long j2, final long j3) {
        LogUtil.b("DietDiaryUtils", "recordMeals dietRecord: ", list);
        final String strD = HiJsonUtil.d(list);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vjb
            @Override // java.lang.Runnable
            public final void run() {
                vil.d((List<vgo>) HiJsonUtil.d(strD, new TypeToken<List<vgo>>() { // from class: com.huawei.ui.main.stories.health.weight.util.DietDiaryUtils$8
                }.getType()), false, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: vlh
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i2, Object obj) {
                        vil.e(responseCallback, j, j, i2, (List) obj);
                    }
                });
            }
        });
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, long j2, long j3, int i2, List list) {
        LogUtil.b("DietDiaryUtils", "recordMeals insertDietRecord resultCode: ", Integer.valueOf(i2));
        c((ResponseCallback<List<vgo>>) responseCallback, i2, (List<vgo>) list);
        if (i2 == 0) {
            ezn.b(j2, j3, myk.a("DietDiaryUtils"));
        }
    }

    private static void c(ResponseCallback<List<vgo>> responseCallback, int i2, List<vgo> list) {
        if (responseCallback != null) {
            responseCallback.onResponse(i2, list);
        }
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f51167a;
        private final long d;

        public e(long j, long j2) {
            this.d = j;
            this.f51167a = j2;
        }

        public long d() {
            return this.d;
        }

        public long c() {
            return this.f51167a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final List<vgo> list, final boolean z, final ResponseCallback<List<vgo>> responseCallback) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "insertDietRecords isQueryDietRecord ", Boolean.valueOf(z));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        for (int i2 = 0; i2 < list.size(); i2++) {
            vgo vgoVar = list.get(i2);
            if (!lua.e()) {
                if (responseCallback != null) {
                    responseCallback.onResponse(600002, null);
                    return;
                }
                return;
            }
            if (c(vgoVar)) {
                if (responseCallback != null) {
                    responseCallback.onResponse(AwarenessConstants.ERROR_UNKNOWN_CODE, null);
                    return;
                }
                return;
            }
            String strG = vgoVar.g();
            long jI = vgoVar.i();
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setType(DicDataTypeUtil.DataType.DIET_RECORD_SET.value());
            hiHealthData.setTimeZone(strG);
            hiHealthData.setStartTime(jI);
            hiHealthData.setEndTime(jI);
            hiHealthData.setDeviceUuid("-1");
            if (z) {
                hiHealthData.setModifiedTime(vgoVar.b());
            }
            HashMap map = new HashMap();
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.DIET_RECORD.value()), HiJsonUtil.d(vgoVar));
            hiHealthData.setFieldsMetaData(HiJsonUtil.d(map));
            hiDataInsertOption.addData(hiHealthData);
        }
        LogUtil.b("DietDiaryUtils", "insertDietRecord hiDataInsertOption ", hiDataInsertOption);
        HiHealthNativeApi.a(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: vks
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i3, Object obj) {
                vil.d(z, responseCallback, list, i3, obj);
            }
        });
    }

    static /* synthetic */ void d(final boolean z, final ResponseCallback responseCallback, final List list, final int i2, Object obj) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "insertDietRecord isQueryDietRecord ", Boolean.valueOf(z), " errorCode ", Integer.valueOf(i2), " object ", obj);
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "insertDietRecord callback is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vit
                @Override // java.lang.Runnable
                public final void run() {
                    vil.c(z, i2, responseCallback, list);
                }
            });
        }
    }

    static /* synthetic */ void c(boolean z, int i2, ResponseCallback responseCallback, List list) {
        if (z || i2 != 0) {
            responseCallback.onResponse(i2, list);
        } else {
            responseCallback.onResponse(i2, list);
            LogUtil.b("DietDiaryUtils", "insertDietRecordList success");
        }
    }

    public static void e(final List<vgw> list, final ResponseCallback<List<vgo>> responseCallback) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "recordMeals meal is null");
            if (responseCallback != null) {
                responseCallback.onResponse(-1, new ArrayList());
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            e(list.get(i2));
        }
        long jD = ((vgw) Collections.min(list, Comparator.comparingLong(new vlg()))).d();
        long jD2 = ((vgw) Collections.max(list, Comparator.comparingLong(new vlg()))).d();
        final long jD3 = d(jD);
        final long jC = lsl.c(jD2);
        LogUtil.b("DietDiaryUtils", "recordMeals meals： ", list, " meals size is: ", Integer.valueOf(list.size()), "startTime is: ", Long.valueOf(jD3), "endTime is: ", Long.valueOf(jC));
        a(b(jD3, jC, list.get(0).g(), false), (ResponseCallback<Map<Integer, vgo>>) new ResponseCallback() { // from class: vkx
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i3, Object obj) {
                vil.d(list, responseCallback, jD3, jC, i3, (Map) obj);
            }
        });
    }

    static /* synthetic */ void d(List list, final ResponseCallback responseCallback, final long j2, final long j3, int i2, Map map) {
        LogUtil.b("DietDiaryUtils", "recordMeals readDietRecord errorCode ", Integer.valueOf(i2), " map ", map);
        if (i2 == -2) {
            vhv.c(list);
            NetworkUtil.d(f51158c);
            if (responseCallback != null) {
                responseCallback.onResponse(i2, new ArrayList());
                return;
            }
            return;
        }
        if (map == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "recordMeals readDietRecord map is null");
            if (responseCallback != null) {
                responseCallback.onResponse(i2, new ArrayList());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vgw vgwVar = (vgw) it.next();
            int iA = DateFormatUtil.a(vgwVar.d(), lsl.a(vgwVar.g()));
            LogUtil.b("DietDiaryUtils", "recordMeals dayFormat is: ", Integer.valueOf(iA));
            vgo vgoVar = (vgo) map.get(Integer.valueOf(iA));
            if (vgoVar != null) {
                boolean zE = vgoVar.e(vgwVar);
                LogUtil.b("DietDiaryUtils", "recordMeals readDietRecord isSuccess ", Boolean.valueOf(zE), " dayFormat: ", Integer.valueOf(iA), " dietRecord: ", vgoVar, " meal: ", vgwVar);
                if (!zE) {
                }
            }
            arrayList.add(vgwVar);
        }
        if (njy.e(arrayList)) {
            LogUtil.b("DietDiaryUtils", "meals has been recorded");
        } else {
            final vhs vhsVar = new vhs(((vgw) arrayList.get(0)).d(), arrayList, ((vgw) arrayList.get(0)).g());
            ThreadPoolManager.c().execute(new Runnable() { // from class: vkh
                @Override // java.lang.Runnable
                public final void run() {
                    vil.e(vhsVar, false, (ResponseCallback<String>) new ResponseCallback() { // from class: vkd
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i3, Object obj) {
                            vil.d(responseCallback, j, j, i3, (String) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, long j2, long j3, int i2, String str) {
        LogUtil.b("DietDiaryUtils", "recordMeals insertDietRecord resultCode： ", Integer.valueOf(i2), " resultDietRecord： ", str);
        if (responseCallback != null) {
            responseCallback.onResponse(i2, new ArrayList());
        }
        if (i2 != 0) {
            return;
        }
        ezn.b(j2, j3, myk.a("DietDiaryUtils"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final vhs vhsVar, boolean z, final ResponseCallback<String> responseCallback) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "insertDietRecords isQueryDietRecord ", Boolean.valueOf(z));
        if (vhsVar == null) {
            if (responseCallback != null) {
                responseCallback.onResponse(-1, "request is null");
            }
        } else {
            vhsVar.d().forEach(new Consumer() { // from class: vkz
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    vil.b((vgw) obj);
                }
            });
            LogUtil.b("DietDiaryUtils", "insertDietRecords call cloud API meals size ", Integer.valueOf(vhsVar.d().size()));
            vht.c().d(vhsVar, new ResponseCallback() { // from class: vlf
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    vil.c(vhsVar, responseCallback, i2, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void b(vgw vgwVar) {
        e(vgwVar);
        if (vgwVar.j() == 0) {
            vgwVar.d(vgwVar.d());
        }
        vgwVar.a(DateFormatUtil.a(vgwVar.d(), lsl.a(vgwVar.g())));
        if (vgwVar.f() == 0) {
            vgwVar.b(null);
        }
    }

    static /* synthetic */ void c(vhs vhsVar, ResponseCallback responseCallback, int i2, String str) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "insertDietRecords cloud API errorCode ", Integer.valueOf(i2), " result ", str);
        if (i2 == -2) {
            vhv.c(vhsVar.d());
            NetworkUtil.d(f51158c);
        }
        if (responseCallback != null) {
            responseCallback.onResponse(i2, str);
        }
    }

    public static void e(int i2, int i3, ResponseCallback<List<vgo>> responseCallback) {
        c(i2, i3, 0L, true, responseCallback);
    }

    public static void e(int i2, int i3, long j2, ResponseCallback<List<vgo>> responseCallback) {
        c(i2, i3, j2, true, responseCallback);
    }

    public static void d(int i2, int i3, ResponseCallback<List<vgo>> responseCallback) {
        c(i2, i3, 0L, false, responseCallback);
    }

    public static void d(int i2, int i3, long j2, ResponseCallback<List<vgo>> responseCallback) {
        c(i2, i3, j2, false, responseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final int i2, final int i3, final long j2, final boolean z, final ResponseCallback<List<vgo>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getDietRecord callback is null sourceStartTime ", Integer.valueOf(i2), " sourceEndTime ", Integer.valueOf(i3), " timeout ", Long.valueOf(j2), " isBasicDietRecord ", Boolean.valueOf(z));
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vis
                @Override // java.lang.Runnable
                public final void run() {
                    vil.c(i2, i3, j2, z, (ResponseCallback<List<vgo>>) responseCallback);
                }
            });
            return;
        }
        long jD = DateFormatUtil.d(i2);
        long jC = lsl.c(DateFormatUtil.d(i3));
        LogUtil.b("DietDiaryUtils", "getDietRecord sourceStartTime ", Long.valueOf(jD), " sourceEndTime ", Long.valueOf(jC), " timeout ", Long.valueOf(j2), " isBasicDietRecord ", Boolean.valueOf(z), " dumpStackTraceInfo ", DfxUtils.d(Thread.currentThread(), null));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jMin = Math.min(jD, lsl.r(jCurrentTimeMillis));
        final long jMin2 = Math.min(jC, lsl.c(jCurrentTimeMillis));
        if (i()) {
            a(b(jMin, jMin2, lsl.q(jD), z), (ResponseCallback<Map<Integer, vgo>>) new ResponseCallback() { // from class: vja
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i4, Object obj) {
                    vil.b(responseCallback, i2, i3, z, jCurrentTimeMillis, i4, (Map) obj);
                }
            });
            return;
        }
        if (lsl.aa(jMin2)) {
            boolean z2 = d.get();
            ReleaseLogUtil.c("R_DietDiaryUtils", "getDietRecord isRegisteredSportData ", Boolean.valueOf(z2), " endTime ", Long.valueOf(jMin2));
            if (!z2) {
                g.set(0);
                j("getDietRecord");
            }
        }
        Object objB = b(jMin, jMin2, lsl.q(jMin), z);
        if (!(objB instanceof HiDataReadOption)) {
            LogUtil.e("DietDiaryUtils", "readDietRecord request type error");
        } else {
            final HiDataReadOption hiDataReadOption = (HiDataReadOption) objB;
            a(objB, (ResponseCallback<Map<Integer, vgo>>) new ResponseCallback() { // from class: vjs
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i4, Object obj) {
                    vil.e(responseCallback, i2, i3, jMin, jMin2, j2, z, hiDataReadOption, i4, (Map) obj);
                }
            });
        }
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, final int i2, final int i3, boolean z, long j2, int i4, Map map) {
        LogUtil.b("DietDiaryUtils", "getDietRecord map ", map);
        if (map == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getDietRecord map is null errorCode ", Integer.valueOf(i4));
            responseCallback.onResponse(i4, Collections.EMPTY_LIST);
        } else {
            map.entrySet().removeIf(new Predicate() { // from class: vlc
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return vil.e(i2, i3, (Map.Entry) obj);
                }
            });
            if (!z) {
                e((Map<Integer, vgo>) map, j2);
            }
            responseCallback.onResponse(0, new ArrayList(map.values()));
        }
    }

    static /* synthetic */ boolean e(int i2, int i3, Map.Entry entry) {
        return ((Integer) entry.getKey()).intValue() < i2 || ((Integer) entry.getKey()).intValue() > i3;
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, final int i2, final int i3, long j2, long j3, long j4, boolean z, HiDataReadOption hiDataReadOption, int i4, Map map) {
        LogUtil.b("DietDiaryUtils", "getDietRecord map ", map);
        if (map == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getDietRecord map is null errorCode ", Integer.valueOf(i4));
            responseCallback.onResponse(i4, Collections.EMPTY_LIST);
            k();
            return;
        }
        map.entrySet().removeIf(new Predicate() { // from class: vji
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return vil.a(i2, i3, (Map.Entry) obj);
            }
        });
        LogUtil.b("DietDiaryUtils", "getDietRecordByDate startDate:", Integer.valueOf(i2), " endDate:", Integer.valueOf(i3), " map ", map);
        long jR = lsl.r(j2);
        long jC = lsl.c(j3);
        if (lsl.a(jR, jC) <= 8) {
            b(j4, z, jR, jC, (Map<Integer, vgo>) map);
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        vgo vgoVar = (vgo) map.get(Integer.valueOf(iA));
        if (i2 >= iA && vgoVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(vgoVar);
            responseCallback.onResponse(i4, arrayList);
            k();
            return;
        }
        e(hiDataReadOption, (Map<Integer, vgo>) map, (ResponseCallback<List<vgo>>) responseCallback);
        k();
    }

    static /* synthetic */ boolean a(int i2, int i3, Map.Entry entry) {
        return ((Integer) entry.getKey()).intValue() < i2 || ((Integer) entry.getKey()).intValue() > i3;
    }

    private static void e(Map<Integer, vgo> map, long j2) {
        vgo vgoVar = map.get(Integer.valueOf(DateFormatUtil.a(j2, TimeZone.getDefault())));
        if (vgoVar != null) {
            iuo.c(vgoVar);
        }
    }

    private static void b(long j2, boolean z, long j3, long j4, Map<Integer, vgo> map) {
        for (long jR = lsl.r(j3); jR <= j4; jR = lsl.w(jR)) {
            int iA = DateFormatUtil.a(jR, TimeZone.getDefault());
            vgo vgoVar = map.get(Integer.valueOf(iA));
            if (vgoVar == null) {
                long jC = lsl.c(jR);
                long jMin = Math.min(jC, j4);
                vfy vfyVarD = d(lsl.aa(jR) ? System.currentTimeMillis() : jMin, j2, 0.0f);
                vgo vgoVarC = c(iA, jR, vfyVarD, new ArrayList());
                LogUtil.b("DietDiaryUtils", "dayFormat ", Integer.valueOf(iA), "processDietRecord dayStartTime ", Long.valueOf(jR), " tempDayEndTime ", Long.valueOf(jC), " optionEndTime ", Long.valueOf(j4), " dayEndTime ", Long.valueOf(jMin), " dietCalorieOverview ", vfyVarD, " dayDietRecord ", vgoVarC);
                final String strD = HiJsonUtil.d(vgoVarC);
                ThreadPoolManager.c().execute(new Runnable() { // from class: vix
                    @Override // java.lang.Runnable
                    public final void run() {
                        vil.c((vgo) HiJsonUtil.d(strD, vgo.class), true, (ResponseCallback<vgo>) new ResponseCallback() { // from class: vkq
                            @Override // com.huawei.hwbasemgr.ResponseCallback
                            public final void onResponse(int i2, Object obj) {
                                LogUtil.b("DietDiaryUtils", "processDietRecord insertErrorCode ", Integer.valueOf(i2), " insertDietRecord ", (vgo) obj);
                            }
                        });
                    }
                });
                vgoVar = vgoVarC;
            } else if (!z) {
                if (lsl.aa(jR)) {
                    d(vgoVar, j2);
                } else {
                    a(vgoVar, j2);
                }
            }
            map.put(Integer.valueOf(iA), e(vgoVar));
        }
    }

    private static void d(vgo vgoVar, long j2) {
        LogUtil.b("DietDiaryUtils", "refreshTodayDietRecord timeout ", Long.valueOf(j2), " dietRecord ", vgoVar);
        String strD = HiJsonUtil.d(vgoVar);
        a(vgoVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        vfy vfyVarD = vgoVar.d();
        if (vfyVarD == null) {
            vfyVarD = d(jCurrentTimeMillis, j2, 0.0f);
        }
        vfw vfwVarA = a(jCurrentTimeMillis, j2);
        vfyVarD.e(vfwVarA.h());
        int iE = e(vfwVarA);
        if (iE > 0) {
            vfyVarD.c(iE);
        }
        int iB = vfwVarA.b();
        if (iB > 0) {
            vfyVarD.d(iB);
        }
        int iA = vfwVarA.a();
        if (iA > 0) {
            vfyVarD.b(iA);
        }
        int iE2 = vfwVarA.e();
        if (iE2 > 0) {
            vfyVarD.d(iE2);
        }
        int iC = vfwVarA.c();
        if (iC > 0) {
            vfyVarD.a(iC);
        }
        String strD2 = HiJsonUtil.d(vgoVar);
        LogUtil.b("DietDiaryUtils", "refreshTodayDietRecord originalDietRecordJson ", strD, " dietRecordJson ", strD2);
        if (Objects.equals(strD, strD2)) {
            return;
        }
        vfyVarD.b(jCurrentTimeMillis);
        if (c(vgoVar)) {
            vgoVar.d(lsl.r(jCurrentTimeMillis));
        } else {
            vgoVar.d(vgoVar.b() + 1);
        }
        LogUtil.b("DietDiaryUtils", "refreshTodayDietRecord dietRecordOverview ", vfyVarD, " dietRecord ", vgoVar);
        final String strD3 = HiJsonUtil.d(vgoVar);
        ThreadPoolManager.c().execute(new Runnable() { // from class: viw
            @Override // java.lang.Runnable
            public final void run() {
                vil.c((vgo) HiJsonUtil.d(strD3, vgo.class), true, (ResponseCallback<vgo>) new ResponseCallback() { // from class: vjr
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i2, Object obj) {
                        vil.d(i2, (vgo) obj);
                    }
                });
            }
        });
    }

    static /* synthetic */ void d(int i2, vgo vgoVar) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "refreshTodayDietRecord insertErrorCode ", Integer.valueOf(i2));
        iuo.c(vgoVar);
    }

    private static void a(vgo vgoVar, long j2) {
        LogUtil.b("DietDiaryUtils", "refreshHistoryDietRecord timeout ", Long.valueOf(j2), " dietRecord ", vgoVar);
        vfy vfyVarD = vgoVar.d();
        if (vfyVarD == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "refreshHistoryDietRecord dietRecordOverview is null");
            return;
        }
        final long jD = DateFormatUtil.d(vgoVar.c());
        int iD = (int) UnitUtil.d(vfyVarD.i(), 0);
        if (iD <= 0) {
            vfw vfwVarA = a(jD, j2);
            int iB = vfwVarA.b();
            LogUtil.b("DietDiaryUtils", "refreshHistoryDietRecord restingCalories ", Integer.valueOf(iB), " dietRecordBaseInfo ", vfwVarA);
            if (iB > 0) {
                vfyVarD.d(iB);
                a(vgoVar, true);
                return;
            }
            return;
        }
        final HashMap map = new HashMap();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vkv
            @Override // java.lang.Runnable
            public final void run() {
                vil.d(true, jD, (ResponseCallback<Map<Integer, List<HiHealthData>>>) new ResponseCallback() { // from class: vkn
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i2, Object obj) {
                        vil.a(map, countDownLatch, i2, (Map) obj);
                    }
                });
            }
        });
        try {
            ReleaseLogUtil.c("R_DietDiaryUtils", "refreshHistoryDietRecord isAwait ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (InterruptedException e2) {
            ReleaseLogUtil.b("R_DietDiaryUtils", "refreshHistoryDietRecord exception ", ExceptionUtils.c(e2));
        }
        int iE = e((Map<Integer, List<HiHealthData>>) map, DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE.value());
        if (iE <= 0) {
            iE = e((Map<Integer, List<HiHealthData>>) map, DicDataTypeUtil.DataType.RESTING_METABOLISM.value());
        }
        if (iE > 0) {
            vfyVarD.d(iE);
        }
        a(vgoVar, iD != iE);
    }

    static /* synthetic */ void a(Map map, CountDownLatch countDownLatch, int i2, Map map2) {
        map.putAll(map2);
        countDownLatch.countDown();
        LogUtil.b("DietDiaryUtils", "refreshHistoryDietRecord errorCode ", Integer.valueOf(i2), " map ", map2, " restingCalorieMap ", map);
    }

    private static void a(vgo vgoVar, boolean z) {
        vfy vfyVarD = vgoVar.d();
        if (vfyVarD == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "refreshHistoryRestingCaloriesBurned dietRecordOverview is null");
            return;
        }
        boolean z2 = false;
        int iD = (int) UnitUtil.d(vfyVarD.i(), 0);
        int iG = vfyVarD.g();
        if (iD != iG) {
            vfyVarD.a(iD);
            z2 = true;
        }
        LogUtil.b("DietDiaryUtils", "refreshHistoryRestingCaloriesBurned restingCalories ", Integer.valueOf(iD), " restingCaloriesBurned ", Integer.valueOf(iG), " isRestingCaloriesBurnedChange ", Boolean.valueOf(z2), " isRestingCaloriesChange ", Boolean.valueOf(z), " dietRecord ", vgoVar);
        if (z || z2) {
            vfyVarD.b(System.currentTimeMillis());
            vgoVar.d(vgoVar.b() + 1);
            final String strD = HiJsonUtil.d(vgoVar);
            ThreadPoolManager.c().execute(new Runnable() { // from class: vli
                @Override // java.lang.Runnable
                public final void run() {
                    vil.c((vgo) HiJsonUtil.d(strD, vgo.class), true, (ResponseCallback<vgo>) new ResponseCallback() { // from class: vka
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            LogUtil.b("DietDiaryUtils", "refreshHistoryRestingCaloriesBurned insertErrorCode ", Integer.valueOf(i2), " insertDietRecord ", (vgo) obj);
                        }
                    });
                }
            });
        }
    }

    private static void e(final HiDataReadOption hiDataReadOption, Map<Integer, vgo> map, ResponseCallback<List<vgo>> responseCallback) {
        vgo value;
        final HashMap map2 = new HashMap();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vle
            @Override // java.lang.Runnable
            public final void run() {
                HiDataReadOption hiDataReadOption2 = hiDataReadOption;
                vil.e(hiDataReadOption2.getStartTime(), hiDataReadOption2.getEndTime(), (ResponseCallback<Map<Integer, Integer>>) new ResponseCallback() { // from class: vjv
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i2, Object obj) {
                        vil.d(map, countDownLatch, i2, (Map) obj);
                    }
                });
            }
        });
        try {
            ReleaseLogUtil.c("R_DietDiaryUtils", "decorateDietRecord isAwait ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (InterruptedException e2) {
            ReleaseLogUtil.b("R_DietDiaryUtils", "decorateDietRecord exception ", ExceptionUtils.c(e2));
        }
        int iA = DateFormatUtil.a(lsl.r(System.currentTimeMillis()));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, vgo> entry : map.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null) {
                arrayList.add(value);
                Integer key = entry.getKey();
                int iIntValue = key.intValue();
                if (map2.containsKey(key)) {
                    if (iIntValue == iA) {
                        a(value);
                    } else {
                        vfy vfyVarD = value.d();
                        if (vfyVarD != null) {
                            Integer num = (Integer) map2.get(key);
                            if (num != null) {
                                vfyVarD.a(num.intValue());
                            }
                            vfyVarD.a((int) UnitUtil.d(vfyVarD.i(), 0));
                        }
                    }
                }
            }
        }
        responseCallback.onResponse(0, arrayList);
    }

    static /* synthetic */ void d(Map map, CountDownLatch countDownLatch, int i2, Map map2) {
        map.putAll(map2);
        countDownLatch.countDown();
        LogUtil.b("DietDiaryUtils", "decorateDietRecord errorCode ", Integer.valueOf(i2), " resultMap ", map2, " sportCaloriesMap ", map);
    }

    public static void b(final boolean z, final ResponseCallback<Boolean> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "isSupportDiet callback is null isFullDiet ", Boolean.valueOf(z));
            return;
        }
        if (!Utils.h()) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "isSupportDiet ifAllowLogin false isFullDiet ", Boolean.valueOf(z));
            responseCallback.onResponse(0, false);
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        if (loginInit == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "isSupportDiet loginInit is null isFullDiet ", Boolean.valueOf(z));
            responseCallback.onResponse(-1, false);
            return;
        }
        boolean isLogined = loginInit.getIsLogined();
        boolean zIsKidAccount = loginInit.isKidAccount();
        if (!isLogined || zIsKidAccount) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "isSupportDiet isLogined ", Boolean.valueOf(isLogined), " isKidAccount ", Boolean.valueOf(zIsKidAccount), " isFullDiet ", Boolean.valueOf(z));
            responseCallback.onResponse(0, false);
            return;
        }
        final String accountInfo = loginInit.getAccountInfo(1010);
        ReleaseLogUtil.c("R_DietDiaryUtils", "isSupportDiet countryCode ", accountInfo, " isFullDiet ", Boolean.valueOf(z));
        if (TextUtils.isEmpty(accountInfo)) {
            responseCallback.onResponse(-1, false);
        } else if (!Utils.o()) {
            responseCallback.onResponse(0, true);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vld
                @Override // java.lang.Runnable
                public final void run() {
                    nlq.b(new nlr(accountInfo), new ResponseCallback<Boolean>() { // from class: vil.9
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public void onResponse(int i2, Boolean bool) {
                            boolean z2 = false;
                            if (!bool.booleanValue()) {
                                responseCallback.onResponse(i2, false);
                                return;
                            }
                            boolean zD = iuo.d("THIRD_DIET_TIME_MILLIS");
                            boolean zD2 = iuo.d("SIMPLIFY_DIET_TIME_MILLIS");
                            ResponseCallback responseCallback2 = responseCallback;
                            if (z) {
                                z2 = zD;
                            } else if (zD2 || zD) {
                                z2 = true;
                            }
                            responseCallback2.onResponse(i2, Boolean.valueOf(z2));
                        }
                    });
                }
            });
        }
    }

    public static void d() {
        if (iuo.a()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: vjo
            @Override // java.lang.Runnable
            public final void run() {
                vil.b(false, (ResponseCallback<Boolean>) new ResponseCallback() { // from class: vjc
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i2, Object obj) {
                        vil.e(i2, (Boolean) obj);
                    }
                });
            }
        });
    }

    static /* synthetic */ void e(int i2, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vir
                @Override // java.lang.Runnable
                public final void run() {
                    nkf.a().a(new ResponseCallback() { // from class: vkg
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i3, Object obj) {
                            LogUtil.b("DietDiaryUtils", "checkFatReductionShapingState floatValue ", (Float) obj, " errorCode ", Integer.valueOf(i3));
                        }
                    });
                }
            });
        }
    }

    private static boolean d(List<vgw> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "hasFood list ", list);
            return false;
        }
        for (vgw vgwVar : list) {
            if (vgwVar != null) {
                List<vgu> listC = vgwVar.c();
                if (njy.e(listC)) {
                    continue;
                } else {
                    for (vgu vguVar : listC) {
                        if (vguVar != null) {
                            String strE = vguVar.e();
                            if (!TextUtils.isEmpty(strE)) {
                                return true;
                            }
                            ReleaseLogUtil.d("R_DietDiaryUtils", "hasFood foodId ", strE);
                        }
                    }
                }
            }
        }
        return false;
    }

    private static List<String> e(List<vgw> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getNeedQueryFoodIdList list ", list);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (vgw vgwVar : list) {
            if (vgwVar != null) {
                List<vgu> listC = vgwVar.c();
                if (!njy.e(listC)) {
                    for (vgu vguVar : listC) {
                        if (vguVar != null && vguVar.f() != 0 && !"-1".equals(vguVar.e())) {
                            String strE = vguVar.e();
                            if (TextUtils.isEmpty(strE)) {
                                ReleaseLogUtil.d("R_DietDiaryUtils", "getNeedQueryFoodIdList foodId ", strE);
                            } else if (!arrayList.contains(strE)) {
                                arrayList.add(strE);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static boolean a(iuv iuvVar, iuv iuvVar2) {
        if (iuvVar == null || iuvVar.e() == 0) {
            return false;
        }
        return iuvVar2 == null || iuvVar2.e() == 0 || Math.abs(iuvVar2.e() - iuvVar.e()) > 0 || Math.abs(iuvVar2.c() - iuvVar.c()) > 0 || Math.abs(iuvVar2.b() - iuvVar.b()) > 0;
    }

    private static float a(vgu vguVar, eex eexVar) {
        if (vguVar == null || eexVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getFoodCoefficient descriptor ", vguVar, " food ", eexVar);
            return 0.0f;
        }
        int iD = eexVar.d();
        if (iD <= 0) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getFoodCoefficient foodCount ", Integer.valueOf(iD), " food ", eexVar, " descriptor ", vguVar);
            return 0.0f;
        }
        String strJ = vguVar.j();
        float fD = vguVar.d();
        if (!TextUtils.equals(strJ, eexVar.h())) {
            List<efa> listB = eexVar.b();
            if (njy.e(listB)) {
                return 1.0f;
            }
            for (efa efaVar : listB) {
                if (efaVar != null && TextUtils.equals(strJ, efaVar.a())) {
                    fD *= efaVar.b();
                }
            }
            return 1.0f;
        }
        return fD / iD;
    }

    private static Map<String, Float> e(vgu vguVar, List<eex> list) {
        float fE;
        float f2;
        float fC;
        if (vguVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getFoodDescriptorDietAnalysis descriptor is null");
            return new HashMap();
        }
        String strE = vguVar.e();
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getFoodDescriptorDietAnalysis descriptorFoodId ", strE);
            return new HashMap();
        }
        HashMap map = new HashMap(3);
        for (eex eexVar : list) {
            if (eexVar != null && TextUtils.equals(strE, eexVar.a())) {
                float fA = a(vguVar, eexVar);
                fE = eexVar.e() * fA;
                f2 = eexVar.f() * fA;
                fC = eexVar.c() * fA;
                map.put("carbohydrate", Float.valueOf((float) UnitUtil.d(fE, 2)));
                map.put("protein", Float.valueOf((float) UnitUtil.d(f2, 2)));
                map.put("fat", Float.valueOf((float) UnitUtil.d(fC, 2)));
                return map;
            }
        }
        fE = 0.0f;
        f2 = 0.0f;
        fC = 0.0f;
        map.put("carbohydrate", Float.valueOf((float) UnitUtil.d(fE, 2)));
        map.put("protein", Float.valueOf((float) UnitUtil.d(f2, 2)));
        map.put("fat", Float.valueOf((float) UnitUtil.d(fC, 2)));
        return map;
    }

    private static float b(Map<String, Float> map, String str) {
        Float f2;
        if (map == null || (f2 = map.get(str)) == null) {
            return 0.0f;
        }
        return f2.floatValue();
    }

    private static Map<String, Float> c(List<vgw> list, List<eex> list2) {
        if (njy.e(list) || njy.e(list2)) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getDietAnalysis mealList ", list, " foodList ", list2);
            return new HashMap();
        }
        HashMap map = new HashMap(3);
        float fB = 0.0f;
        float fB2 = 0.0f;
        float fB3 = 0.0f;
        for (vgw vgwVar : list) {
            if (vgwVar != null) {
                List<vgu> listC = vgwVar.c();
                if (!njy.e(listC)) {
                    Iterator<vgu> it = listC.iterator();
                    while (it.hasNext()) {
                        Map<String, Float> mapE = e(it.next(), list2);
                        fB += b(mapE, "carbohydrate");
                        fB2 += b(mapE, "protein");
                        fB3 += b(mapE, "fat");
                    }
                }
            }
        }
        map.put("carbohydrate", Float.valueOf((float) UnitUtil.d(fB, 2)));
        map.put("protein", Float.valueOf((float) UnitUtil.d(fB2, 2)));
        map.put("fat", Float.valueOf((float) UnitUtil.d(fB3, 2)));
        return map;
    }

    private static Map<String, Float> d(List<vgw> list, boolean z) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getDietAnalysis mealList ", list, " isCustomizeFood ", Boolean.valueOf(z));
            return new HashMap();
        }
        HashMap map = new HashMap(3);
        float fC = 0.0f;
        float fI = 0.0f;
        float fB = 0.0f;
        for (vgw vgwVar : list) {
            if (vgwVar != null) {
                List<vgu> listC = vgwVar.c();
                if (!njy.e(listC)) {
                    for (vgu vguVar : listC) {
                        if (vguVar != null) {
                            if (z == (vguVar.f() == 0)) {
                                fC += vguVar.c();
                                fI += vguVar.i();
                                fB += vguVar.b();
                            }
                        }
                    }
                }
            }
        }
        map.put("carbohydrate", Float.valueOf((float) UnitUtil.d(fC, 2)));
        map.put("protein", Float.valueOf((float) UnitUtil.d(fI, 2)));
        map.put("fat", Float.valueOf((float) UnitUtil.d(fB, 2)));
        return map;
    }

    private static eez e(Map<String, Float> map, Map<String, Float> map2) {
        LogUtil.b("DietDiaryUtils", "getInitDeviceSyncDietAnalysis dietAnalysis ", map, " customizeDietAnalysis ", map2);
        return new eez((int) UnitUtil.d(b(map, "carbohydrate") + b(map2, "carbohydrate"), 0), (int) UnitUtil.d(b(map, "protein") + b(map2, "protein"), 0), (int) UnitUtil.d(b(map, "fat") + b(map2, "fat"), 0));
    }

    private static void e(vgo vgoVar, final ResponseCallback<eez> responseCallback) {
        final List<vgw> listA = vgoVar.a();
        if (!d(listA)) {
            LogUtil.e("DietDiaryUtils", "initDeviceSyncDietAnalysis mealList ", listA);
            responseCallback.onResponse(0, null);
            return;
        }
        final List<String> listE = e(listA);
        LogUtil.b("DietDiaryUtils", "initDeviceSyncDietAnalysis needQueryFoodIdList ", listE);
        if (njy.e(listE)) {
            responseCallback.onResponse(0, e(d(listA, false), d(listA, true)));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vjf
                @Override // java.lang.Runnable
                public final void run() {
                    nlq.d(new vhw(listE), new ResponseCallback() { // from class: viu
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            vil.d(list, responseCallback, i2, (List) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void d(List list, ResponseCallback responseCallback, int i2, List list2) {
        Map<String, Float> mapC;
        LogUtil.b("DietDiaryUtils", "initDeviceSyncDietAnalysis errorCode ", Integer.valueOf(i2), " foodList ", list2);
        if (njy.e(list2)) {
            List<eex> listF = iuo.f();
            LogUtil.b("DietDiaryUtils", "initDeviceSyncDietAnalysis foodListCache ", listF);
            if (njy.e(listF)) {
                mapC = d((List<vgw>) list, false);
            } else {
                mapC = c((List<vgw>) list, listF);
            }
        } else {
            Map<String, Float> mapC2 = c((List<vgw>) list, (List<eex>) list2);
            iuo.c((List<eex>) list2);
            mapC = mapC2;
        }
        responseCallback.onResponse(i2, e(mapC, d((List<vgw>) list, true)));
    }

    private static boolean a(vhu vhuVar) {
        efb efbVarE;
        efb efbVarE2;
        efb efbVarE3;
        Map<String, String> mapE = iuo.e();
        LogUtil.b("DietDiaryUtils", "isNeedQueryNutritionAnalysisItem dietAnalysisCache ", mapE);
        if (mapE == null || (efbVarE = e(mapE, "fatAnalysis")) == null || efbVarE.d() <= 0 || efbVarE.b() <= 0 || (efbVarE2 = e(mapE, "proteinAnalysis")) == null || efbVarE2.d() <= 0 || efbVarE2.b() <= 0 || (efbVarE3 = e(mapE, "carbohydrateAnalysis")) == null || efbVarE3.d() <= 0 || efbVarE3.b() <= 0 || CommonUtils.j(mapE.get("date")) != DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault())) {
            return true;
        }
        vhu vhuVar2 = (vhu) HiJsonUtil.d(mapE.get("dietAnalysisRequest"), vhu.class);
        if (vhuVar2 != null) {
            return (TextUtils.equals(vhuVar2.f(), vhuVar.f()) && TextUtils.equals(vhuVar2.a(), vhuVar.a()) && vhuVar2.c() == vhuVar.c() && vhuVar2.b() == vhuVar.b() && vhuVar2.d() == vhuVar.d() && vhuVar2.e() == vhuVar.e()) ? false : true;
        }
        ReleaseLogUtil.d("R_DietDiaryUtils", "isNeedQueryNutritionAnalysisItem cacheDietAnalysisRequest is null");
        return true;
    }

    private static efb e(Map<String, String> map, String str) {
        if (map == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getNutritionAnalysisItem map is null");
            return null;
        }
        return (efb) HiJsonUtil.d(map.get(str), efb.class);
    }

    private static void d(final vhu vhuVar, final eez eezVar, final vgo vgoVar, final ResponseCallback<eez> responseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: vkt
            @Override // java.lang.Runnable
            public final void run() {
                vil.a(vhuVar, responseCallback, eezVar, vgoVar);
            }
        });
    }

    static /* synthetic */ void a(final vhu vhuVar, final ResponseCallback responseCallback, final eez eezVar, final vgo vgoVar) {
        if (!a(vhuVar)) {
            Map<String, String> mapE = iuo.e();
            LogUtil.b("DietDiaryUtils", "getNutritionAnalysisItem dietAnalysisCache ", mapE);
            responseCallback.onResponse(0, b(eezVar, e(mapE, "carbohydrateAnalysis"), e(mapE, "proteinAnalysis"), e(mapE, "fatAnalysis")));
            return;
        }
        nlq.c(vhuVar, new ResponseCallback() { // from class: vjj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                vil.e(responseCallback, eezVar, vhuVar, vgoVar, i2, (Map) obj);
            }
        });
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, eez eezVar, vhu vhuVar, vgo vgoVar, int i2, Map map) {
        LogUtil.b("DietDiaryUtils", "getNutritionAnalysisItem resultErrorCode ", Integer.valueOf(i2), " resultMap ", map);
        if (map == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getSupportDeviceSyncDietAnalysis resultMap is null");
            responseCallback.onResponse(i2, eezVar);
            return;
        }
        efb efbVar = (efb) map.get("carbohydrateAnalysis");
        efb efbVar2 = (efb) map.get("proteinAnalysis");
        efb efbVar3 = (efb) map.get("fatAnalysis");
        HashMap map2 = new HashMap(5);
        map2.put("carbohydrateAnalysis", HiJsonUtil.d(efbVar));
        map2.put("proteinAnalysis", HiJsonUtil.d(efbVar2));
        map2.put("fatAnalysis", HiJsonUtil.d(efbVar3));
        map2.put("dietAnalysisRequest", HiJsonUtil.d(vhuVar));
        map2.put("date", String.valueOf(vgoVar.c()));
        boolean zE = lua.e();
        LogUtil.b("DietDiaryUtils", "getNutritionAnalysisItem isPullAllStatus ", Boolean.valueOf(zE));
        if (zE) {
            iuo.b(map2);
        }
        responseCallback.onResponse(i2, b(eezVar, efbVar, efbVar2, efbVar3));
    }

    private static void a(final vgo vgoVar, final ResponseCallback<eez> responseCallback) {
        e(vgoVar, (ResponseCallback<eez>) new ResponseCallback() { // from class: vko
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                vil.a(responseCallback, vgoVar, i2, (eez) obj);
            }
        });
    }

    static /* synthetic */ void a(final ResponseCallback responseCallback, final vgo vgoVar, int i2, final eez eezVar) {
        LogUtil.b("DietDiaryUtils", "getSupportDeviceSyncDietAnalysis initDeviceSyncDietAnalysis ", eezVar);
        if (eezVar == null) {
            responseCallback.onResponse(i2, null);
            return;
        }
        final vfy vfyVarD = vgoVar.d();
        if (vfyVarD == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getSupportDeviceSyncDietAnalysis dietCalorieOverview is null");
            responseCallback.onResponse(i2, eezVar);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vju
                @Override // java.lang.Runnable
                public final void run() {
                    vil.d((ResponseCallback<UserMemberInfo>) new ResponseCallback() { // from class: vjd
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i3, Object obj) {
                            vil.b(responseCallback, eezVar, vfyVar, vgoVar, i3, (UserMemberInfo) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, eez eezVar, vfy vfyVar, vgo vgoVar, int i2, UserMemberInfo userMemberInfo) {
        String str;
        if (userMemberInfo == null || userMemberInfo.getMemberFlag() != 1 || irz.d(userMemberInfo)) {
            responseCallback.onResponse(i2, eezVar);
            return;
        }
        LogUtil.b("DietDiaryUtils", "getSupportDeviceSyncDietAnalysis dietCalorieOverview ", vfyVar);
        double dJ = vfyVar.j();
        if (dJ > 0.0d) {
            str = "1";
        } else if (dJ < 0.0d) {
            str = "2";
        } else {
            str = "3";
        }
        d(new vhu(str, (int) UnitUtil.d(vfyVar.e(), 0)), eezVar, vgoVar, (ResponseCallback<eez>) responseCallback);
    }

    private static eez b(eez eezVar, efb efbVar, efb efbVar2, efb efbVar3) {
        if (efbVar != null) {
            eezVar.c(new int[]{efbVar.d(), efbVar.b()});
        }
        if (efbVar2 != null) {
            eezVar.b(new int[]{efbVar2.d(), efbVar2.b()});
        }
        if (efbVar3 != null) {
            eezVar.a(new int[]{efbVar3.d(), efbVar3.b()});
        }
        return eezVar;
    }

    public static void b(final vgo vgoVar, final ResponseCallback<eez> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getDeviceSyncDietAnalysis callback is null dietRecord ", vgoVar);
            return;
        }
        if (vgoVar == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getDeviceSyncDietAnalysis dietRecord is null");
            responseCallback.onResponse(-1, null);
        } else if (iuo.d("THIRD_DIET_TIME_MILLIS")) {
            a(vgoVar, responseCallback);
        } else if (!iuo.l()) {
            ReleaseLogUtil.c("R_DietDiaryUtils", "is not need to GetSupportDietSetting");
            responseCallback.onResponse(-1, null);
        } else {
            b(true, (ResponseCallback<Boolean>) new ResponseCallback() { // from class: vjw
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    vil.d(responseCallback, vgoVar, i2, (Boolean) obj);
                }
            });
        }
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, vgo vgoVar, int i2, Boolean bool) {
        ReleaseLogUtil.c("R_DietDiaryUtils", "getDeviceSyncDietAnalysis resultBoolean ", bool, " errorCode ", Integer.valueOf(i2));
        if (!bool.booleanValue()) {
            responseCallback.onResponse(i2, null);
        } else {
            a(vgoVar, (ResponseCallback<eez>) responseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final ResponseCallback<UserMemberInfo> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getVipInfo callback is null");
            return;
        }
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            ReleaseLogUtil.d("R_DietDiaryUtils", "getVipInfo vipApi is null");
            responseCallback.onResponse(-1, null);
        } else {
            vipApi.getVipInfo(new VipCallback() { // from class: vil.4
                @Override // com.huawei.health.vip.api.VipCallback
                public void onSuccess(Object obj) {
                    LogUtil.b("DietDiaryUtils", "getVipInfo onSuccess object ", obj);
                    responseCallback.onResponse(0, obj instanceof UserMemberInfo ? (UserMemberInfo) obj : null);
                }

                @Override // com.huawei.health.vip.api.VipCallback
                public void onFailure(int i2, String str) {
                    ReleaseLogUtil.d("R_DietDiaryUtils", "getVipInfo onFailure errorCode ", Integer.valueOf(i2), " errorMessage ", str);
                    responseCallback.onResponse(i2, null);
                }
            });
        }
    }

    public static void m() {
        vft.c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = lsl.d(jCurrentTimeMillis, -6);
        List<vgw> listC = vhv.c(DateFormatUtil.a(jD, TimeZone.getDefault()), DateFormatUtil.a(jCurrentTimeMillis, TimeZone.getDefault()));
        if (!listC.isEmpty()) {
            LogUtil.b("DietDiaryUtils", "syncData and cache not empty");
            vhv.a();
            e(listC, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: vjp
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    vil.d(i2, (List) obj);
                }
            });
        }
        ReleaseLogUtil.c("R_DietDiaryUtils", "syncData lastWeekTime ", Long.valueOf(jD), " currentTime ", Long.valueOf(jCurrentTimeMillis));
        ezn.b(jD, jCurrentTimeMillis, myk.a("DietDiaryUtils"));
    }

    static /* synthetic */ void d(int i2, List list) {
        LogUtil.b("DietDiaryUtils", "recordMeals status is : ", Integer.valueOf(i2), " Des: ", list);
        if (i2 == 0) {
            NetworkUtil.e(f51158c);
        }
    }

    public static boolean i() {
        return "true".equals(ioi.d().c(2)) && "true".equals(ioi.d().c(3)) && "true".equals(ioi.d().c(7));
    }
}
