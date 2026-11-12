package defpackage;

import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepDailyProcessResultCallback;
import com.huawei.hwbasemgr.SleepMonthlyProcessResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginsleeplabel.SleepLabelApi;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBreatheBannerProvider;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class uzf {
    private static final int[] i = {44101, 44102, 44103, 44104, 44105, 44106, 44201, 44205, 44202, 44207, 44204, 44203, 44208, 44107, 44108, 46020, 46018, 46016, 44306, 44001, 44002, 44003, 44005, 44004, 44109, 44216, 44110, 44218, 44217, 44219, 44220, 44221, 44227, 44228, 44229, 44223, 44224, 44225, 44231, 44232, 44233, 44235, 44236, 44111, 44112, 44113};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f50763c = {"core_sleep_dream_key", "core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_key", "core_sleep_sum_key", "core_sleep_deep_count_key", "core_sleep_fall_time_key", "core_sleep_go_bed_time_key", "core_sleep_wake_up_time_key", "core_sleep_efficiency_key", "core_sleep_latency_key", "core_sleep_score_key", "core_sleep_snore_freq_key", "core_sleep_wake_count_key", "core_sleep_noon_sleep_count_key", "rest_heart_rate_old", "rest_heart_rate_new", "max_heart_rate", "stress_day_avg", "sleep_deep_key", "sleep_shallow_key", "sleep_wake_key", "sleep_wake_count_key", "common_sleep_duration_sleep_sum_key", "data_session_manual_sleep_bed_time_key", "core_sleep_off_bed_time_key", "sleep_device_category_key", "core_sleep_latency_new_key", "core_sleep_bed_duration_key", "avgHeartrate", "minHeartrateBaseline", "maxHeartrateBaseline", "avgBreathrate", "minBreathrateBaseline", "maxBreathrateBaseline", "avgOxygenSaturation", "minOxygenSaturationBaseline", "maxOxygenSaturationBaseline", "avgHrv", "minHrvBaseline", "maxHrvBaseline", "sleep_version", "core_sleep_stable_key_aasm", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"};
    private static final String[] e = {"bedTime", "risingTime", "latency"};
    private static final int[] d = {DicDataTypeUtil.DataType.BED_TIME.value(), DicDataTypeUtil.DataType.RISING_TIME.value(), DicDataTypeUtil.DataType.DAILY_SLEEP_LATENCY.value()};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f50761a = {DicDataTypeUtil.DataType.RHYTHM_TYPE.value(), DicDataTypeUtil.DataType.MONTHLY_SLEEP_PROBLEM.value(), DicDataTypeUtil.DataType.MONTHLY_SLEEP_DEGREE.value(), DicDataTypeUtil.DataType.MONTHLY_SLEEP_INTERPRET.value(), DicDataTypeUtil.DataType.MONTHLY_SLEEP_TASKS.value()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f50762b = {DicDataTypeUtil.DataType.DAILY_SLEEP_PROBLEM.value()};

    private static boolean a(int i2) {
        return i2 <= 0 || i2 > 200;
    }

    private static int c(int i2, int i3, int i4) {
        if (i2 < i3) {
            return 3;
        }
        return i2 > i4 ? 1 : 2;
    }

    private static boolean c(int i2) {
        return i2 <= 0 || i2 > 255;
    }

    private static boolean d(int i2) {
        return i2 <= 0 || i2 > 80;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3 || i2 == 4) {
            return 3;
        }
        return i2 != 5 ? 0 : 4;
    }

    private static boolean f(int i2) {
        return i2 <= 0 || i2 > 100;
    }

    public static void e(long j2, SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback) {
        d(j2, sleepDailyProcessResultCallback);
    }

    public static void e(final gxc gxcVar, final gwv gwvVar, final long j2, final long j3, final SleepMonthlyProcessResultCallback<gxh> sleepMonthlyProcessResultCallback) {
        lsy.a(new Runnable() { // from class: uzf.3
            @Override // java.lang.Runnable
            public void run() {
                uzf.d(gxcVar, gwvVar, j2, j3, (SleepMonthlyProcessResultCallback<gxh>) sleepMonthlyProcessResultCallback);
            }
        });
    }

    private static gxa a(gxc gxcVar, gwv gwvVar, long j2, long j3) {
        gxa gxaVarA;
        gxa gxaVar;
        gxe gxeVar;
        if (gwvVar != null) {
            gxeVar = new gxe();
            gxeVar.e(gwvVar.b());
            gxeVar.c(gwvVar.e());
            gxeVar.a(gwvVar.a());
            gxeVar.d(gwvVar.d());
            LogUtil.a("SleepProcessResultUtil", "SleepMonthlyProcessBean: ", gxeVar.toString());
        } else {
            gxaVarA = a(j2, j3);
        }
        if (gxcVar != null) {
            gxaVar = gxaVarA;
            gxaVar = gxeVar;
            gxaVar.d(gxcVar.d());
        }
        gxaVar = gxaVarA;
        gxaVar = gxeVar;
        return gxaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(gxc gxcVar, gwv gwvVar, long j2, long j3, SleepMonthlyProcessResultCallback<gxh> sleepMonthlyProcessResultCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("SleepProcessResultUtil", "start executeMonthlyProcess startTime is ", Long.valueOf(j2), " endtime is ", Long.valueOf(j3));
        gxa gxaVarA = a(gxcVar, gwvVar, j2, j3);
        Gson gsonCreate = new GsonBuilder().create();
        String json = gsonCreate.toJson(gxaVarA);
        LogUtil.a("SleepProcessResultUtil", "finish executeMonthlyProcess time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        LogUtil.a("SleepProcessResultUtil", "monnth countdown ok, json is ", json);
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String monthlySleepLabel = ((SleepLabelApi) Services.b("SleepLabelAlgorithm", SleepLabelApi.class)).getMonthlySleepLabel(json);
            LogUtil.a("SleepProcessResultUtil", "month result back execute time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
            LogUtil.a("SleepProcessResultUtil", "month result back ", monthlySleepLabel);
            gxh gxhVar = (gxh) gsonCreate.fromJson(monthlySleepLabel, gxh.class);
            if (gxhVar.k() == 0) {
                sleepMonthlyProcessResultCallback.onResponse(0, gxhVar);
            } else {
                sleepMonthlyProcessResultCallback.onResponse(0, null);
            }
        } catch (Exception e2) {
            LogUtil.c("SleepProcessResultUtil", "get result failed check in json, e: ", ExceptionUtils.c(e2));
            sleepMonthlyProcessResultCallback.onResponse(1, null);
        }
    }

    private static gxa a(long j2, long j3) {
        int i2 = (int) (((j3 + 1000) - j2) / 86400000);
        gxa gxaVar = new gxa();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new gwz());
        }
        gxg gxgVar = new gxg();
        CountDownLatch countDownLatch = new CountDownLatch((i2 * 3) + 3);
        d(j2, j3, gxgVar, countDownLatch, false);
        b(j2, j3, countDownLatch, arrayList, i2);
        a(j2, j3, countDownLatch, arrayList);
        try {
            LogUtil.a("SleepProcessResultUtil", "getSleepMonthlyProcessBean await: ", Boolean.valueOf(countDownLatch.await(10000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e2) {
            LogUtil.c("SleepProcessResultUtil", "getSleepMonthlyProcessBean exception: ", ExceptionUtils.c(e2));
        }
        CountDownLatch countDownLatch2 = new CountDownLatch(3);
        a(j2, j3, countDownLatch2, arrayList, i2);
        c(j2, j3, countDownLatch2, arrayList, i2);
        if (arrayList.get(0).d() == 0) {
            countDownLatch2.countDown();
        } else {
            b(countDownLatch2, arrayList.get(0), arrayList.get(0).d());
        }
        try {
            countDownLatch2.await(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            LogUtil.c("SleepProcessResultUtil", "getSleepMonthlyProcessBean exception: ", ExceptionUtils.c(e3));
        }
        LogUtil.a("SleepProcessResultUtil", "countdown ok");
        e(arrayList);
        gxaVar.a(arrayList);
        gxaVar.e(gxgVar);
        return gxaVar;
    }

    private static void c(long j2, long j3, CountDownLatch countDownLatch, List<gwz> list, int i2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long j4 = j2 - 86400000;
        hiDataReadOption.setTimeInterval(j4, j3 + 999);
        hiDataReadOption.setType(new int[]{7});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new a(j4, countDownLatch, list, i2));
    }

    private static void b(long j2, long j3, CountDownLatch countDownLatch, List<gwz> list, int i2) {
        nkb.d().c((j2 / 1000) - 14400, 3, 1, i2 * ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, new g(j2, j3, countDownLatch, list, i2));
    }

    private static void d(long j2, SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback) {
        LogUtil.a("SleepProcessResultUtil", "start getDailyProcessResult startTime is ", Long.valueOf(j2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        gxa gxaVar = new gxa();
        gwz gwzVar = new gwz();
        gxg gxgVar = new gxg();
        CountDownLatch countDownLatch = new CountDownLatch(7);
        d(j2, System.currentTimeMillis(), gxgVar, countDownLatch, true);
        a(j2, countDownLatch, gwzVar);
        c(j2, countDownLatch, gwzVar, gxaVar);
        c(j2, countDownLatch, gwzVar);
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            LogUtil.c("SleepProcessResultUtil", "countDownLatch1 executeDailyProcess exception: ", ExceptionUtils.c(e2));
        }
        long jD = gwzVar.d();
        if (jD == 0) {
            LogUtil.c("SleepProcessResultUtil", "No awake Time return!");
            sleepDailyProcessResultCallback.onResponse(1, null);
            return;
        }
        LogUtil.a("SleepProcessResultUtil", "lastAwakeTime is ", Long.valueOf(jD));
        CountDownLatch countDownLatch2 = new CountDownLatch(3);
        c(countDownLatch2, gwzVar, jD);
        e(countDownLatch2, gwzVar, jD);
        b(countDownLatch2, gwzVar, jD);
        try {
            countDownLatch2.await();
        } catch (InterruptedException e3) {
            LogUtil.c("SleepProcessResultUtil", "countDownLatch2 executeDailyProcess exception: ", ExceptionUtils.c(e3));
        }
        gwzVar.d(System.currentTimeMillis() / 1000);
        LogUtil.a("SleepProcessResultUtil", "countdown ok, sleep info is ", gwzVar.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(gwzVar);
        e(arrayList);
        gxaVar.a(arrayList);
        gxaVar.e(gxgVar);
        LogUtil.a("SleepProcessResultUtil", "execute daily ok cost time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        Gson gsonCreate = new GsonBuilder().create();
        String json = gsonCreate.toJson(gxaVar);
        LogUtil.a("SleepProcessResultUtil", "countdown ok, json is ", json);
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String dailySleepLabel = ((SleepLabelApi) Services.b("SleepLabelAlgorithm", SleepLabelApi.class)).getDailySleepLabel(json);
            LogUtil.a("SleepProcessResultUtil", "result back execute time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
            LogUtil.a("SleepProcessResultUtil", "result back ", dailySleepLabel);
            gxd gxdVar = (gxd) gsonCreate.fromJson(dailySleepLabel, gxd.class);
            if (gxdVar.m() == 0) {
                sleepDailyProcessResultCallback.onResponse(0, gxdVar);
            } else {
                sleepDailyProcessResultCallback.onResponse(0, null);
            }
        } catch (Exception e4) {
            LogUtil.c("SleepProcessResultUtil", "get result failed check in json, e: ", ExceptionUtils.c(e4));
            sleepDailyProcessResultCallback.onResponse(1, null);
        }
    }

    private static void e(List<gwz> list) {
        for (gwz gwzVar : list) {
            if (gwzVar.b() == 4 && gwzVar.e() != 0 && gwzVar.a() != 0) {
                float fG = gwzVar.g() / gwzVar.a();
                int iE = (int) ((gwzVar.e() - gwzVar.c()) / 60);
                int iE2 = (int) ((gwc.e(gwzVar.g() / 60) * 0.5f) + (gwc.b(fG) * 0.3f) + (gwc.a(iE) * 0.2f));
                LogUtil.a("SleepProcessResultUtil", "manual sleep need recalculate score sleepEfficiency is ", Float.valueOf(fG), " manualFallTime is ", Integer.valueOf(iE), " getTotalDuration is ", Integer.valueOf(gwzVar.g()), " manualscore is ", Integer.valueOf(iE2));
                gwzVar.n(iE2);
            }
            if (gwzVar.b() == 3) {
                gwzVar.v(0);
            }
        }
    }

    private static void b(CountDownLatch countDownLatch, gwz gwzVar, long j2) {
        nkb.d().c((((j2 * 1000) - 86400000) / 1000) + 60, 3, 1, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, new d(countDownLatch, gwzVar, j2));
    }

    private static void d(long j2, long j3, gxg gxgVar, CountDownLatch countDownLatch, boolean z) {
        int i2;
        String gender = SharedPreferenceUtil.getInstance(com.huawei.haf.application.BaseApplication.b()).getGender();
        if ("1".equals(gender)) {
            i2 = 0;
        } else {
            i2 = "0".equals(gender) ? 1 : -1;
        }
        int iE = e(SharedPreferenceUtil.getInstance(com.huawei.haf.application.BaseApplication.b()).getBirthDate());
        gxgVar.a(i2);
        gxgVar.b(iE);
        String strQ = lsl.q(System.currentTimeMillis());
        boolean zStartsWith = strQ.startsWith(Constants.LINK);
        int iJ = CommonUtil.j(strQ.substring(2, 3));
        if (zStartsWith) {
            gxgVar.c(-iJ);
        } else {
            gxgVar.c(iJ);
        }
        e(j2, j3, gxgVar, countDownLatch, z);
        e(j2, gxgVar, countDownLatch);
    }

    private static void e(long j2, final gxg gxgVar, final CountDownLatch countDownLatch) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(f50762b);
        final long j3 = j2 - 604800000;
        hiDataReadOption.setStartTime(j3);
        hiDataReadOption.setEndTime(j2 - 1);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: uzf.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.a("SleepProcessResultUtil", "getLatestProblems back", Integer.valueOf(i2));
                if (i2 != 0) {
                    LogUtil.a("SleepProcessResultUtil", "getLatestProblems errorCode: ", Integer.valueOf(i2));
                    countDownLatch.countDown();
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.a("SleepProcessResultUtil", "getLatestProblems no data");
                    countDownLatch.countDown();
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.d("SleepProcessResultUtil", "getLatestProblems map.size() <= 0");
                    countDownLatch.countDown();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                long j4 = j3;
                List list = (List) sparseArray.get(DicDataTypeUtil.DataType.DAILY_SLEEP_PROBLEM.value());
                if (list.size() > 7) {
                    LogUtil.d("SleepProcessResultUtil", "getLatestProblems a day has multi problems");
                    countDownLatch.countDown();
                    return;
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    HiHealthData hiHealthData = (HiHealthData) list.get(size);
                    if (hiHealthData.getStartTime() >= j4 && hiHealthData.getStartTime() < j4 + 86400000) {
                        arrayList.add(Integer.valueOf(hiHealthData.getIntValue()));
                    } else {
                        arrayList.add(0);
                    }
                    j4 += 86400000;
                }
                gxgVar.b(arrayList);
                countDownLatch.countDown();
            }
        });
    }

    private static void e(final long j2, long j3, final gxg gxgVar, final CountDownLatch countDownLatch, final boolean z) {
        long jP;
        long jB;
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(f50761a);
        if (z) {
            jP = lsl.x(j2);
            jB = lsl.i(j2);
        } else {
            jP = lsl.p(j2);
            jB = lsl.b(j2);
        }
        hiDataReadOption.setStartTime(jP);
        hiDataReadOption.setEndTime(jB);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: uzf.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                try {
                    uzf.e(obj, i2, countDownLatch, gxgVar, z, j2);
                } catch (Exception e2) {
                    LogUtil.c("SleepProcessResultUtil", "getProblems back failed json wrong ", ExceptionUtils.c(e2));
                    countDownLatch.countDown();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, int i2, CountDownLatch countDownLatch, gxg gxgVar, boolean z, long j2) {
        LogUtil.a("SleepProcessResultUtil", "getProblems back", Integer.valueOf(i2));
        if (i2 != 0) {
            LogUtil.a("SleepProcessResultUtil", "getProblems errorCode is not zero ", Integer.valueOf(i2));
            countDownLatch.countDown();
            return;
        }
        if (!(obj instanceof SparseArray)) {
            LogUtil.a("SleepProcessResultUtil", "getProblems no data");
            countDownLatch.countDown();
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            LogUtil.a("SleepProcessResultUtil", "getProblems map.size() <= 0");
            countDownLatch.countDown();
            return;
        }
        gxgVar.e(uag.d((SparseArray<Object>) sparseArray, DicDataTypeUtil.DataType.RHYTHM_TYPE.value()));
        gxgVar.d(uag.d((SparseArray<Object>) sparseArray, DicDataTypeUtil.DataType.MONTHLY_SLEEP_PROBLEM.value()));
        if (!z) {
            countDownLatch.countDown();
            return;
        }
        Gson gsonCreate = new GsonBuilder().create();
        String strA = uag.a((SparseArray<Object>) sparseArray, DicDataTypeUtil.DataType.MONTHLY_SLEEP_INTERPRET.value());
        String strA2 = uag.a((SparseArray<Object>) sparseArray, DicDataTypeUtil.DataType.MONTHLY_SLEEP_TASKS.value());
        gws gwsVar = (gws) gsonCreate.fromJson(strA, gws.class);
        gws gwsVar2 = (gws) gsonCreate.fromJson(strA2, gws.class);
        List<gwp> listB = gwsVar.b();
        List<List<gwx>> listA = gwsVar2.a();
        Date date = new Date();
        date.setTime(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i3 = calendar.get(5) - 1;
        if (njy.c(listB, i3)) {
            ArrayList arrayList = new ArrayList();
            gwp gwpVar = listB.get(i3);
            gwj gwjVar = new gwj();
            gwjVar.d(gwpVar.d());
            gwjVar.d(gwpVar.e());
            gwjVar.b(gwpVar.b());
            arrayList.add(gwjVar);
            gxgVar.c(arrayList);
        }
        if (njy.c(listA, i3)) {
            ArrayList arrayList2 = new ArrayList();
            for (gwx gwxVar : listA.get(i3)) {
                gxf gxfVar = new gxf();
                gwm gwmVar = new gwm();
                gwr gwrVarA = gwxVar.a();
                gwmVar.d(gwrVarA.a());
                gwmVar.c(gwrVarA.b());
                gxfVar.b(gwmVar);
                gxfVar.d(gwxVar.d());
                gxfVar.d(gwxVar.c());
                gxfVar.b(gwxVar.e());
                arrayList2.add(gxfVar);
            }
            gxgVar.d(arrayList2);
        }
        countDownLatch.countDown();
    }

    private static int e(String str) {
        try {
            LogUtil.a("SleepProcessResultUtil", "getAge birthdayString is ", str);
            Date date = new SimpleDateFormat("YYYYMMDD").parse(str);
            Calendar calendar = Calendar.getInstance();
            if (calendar.before(date)) {
                return 0;
            }
            int i2 = calendar.get(1);
            int i3 = calendar.get(2);
            int i4 = calendar.get(5);
            calendar.setTime(date);
            int i5 = calendar.get(1);
            int i6 = calendar.get(2);
            int i7 = calendar.get(5);
            int i8 = i2 - i5;
            if (i3 > i6) {
                return i8;
            }
            if (i3 == i6) {
                return i4 < i7 ? i8 - 1 : i8;
            }
            return i8 - 1;
        } catch (Exception e2) {
            LogUtil.c("SleepProcessResultUtil", "getAge failed, e: ", ExceptionUtils.c(e2));
            return 0;
        }
    }

    private static void e(CountDownLatch countDownLatch, gwz gwzVar, long j2) {
        long j3 = j2 * 1000;
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j3 - 86399999, j3);
        hiDataReadOption.setType(new int[]{7});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new b(countDownLatch, gwzVar));
    }

    private static void c(CountDownLatch countDownLatch, gwz gwzVar, long j2) {
        long j3 = j2 * 1000;
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j3 - 86399999, j3);
        hiDataReadOption.setType(new int[]{2002});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new c(countDownLatch, gwzVar));
    }

    private static void a(long j2, long j3, CountDownLatch countDownLatch, List<gwz> list, int i2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long j4 = j2 - 86400000;
        hiDataReadOption.setTimeInterval(j4, j3 + 999);
        hiDataReadOption.setType(new int[]{2002});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new h(j4, countDownLatch, list, i2));
    }

    private static void c(long j2, CountDownLatch countDownLatch, gwz gwzVar, gxa gxaVar) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j2 - 86400000);
        hiAggregateOption.setEndTime(86399999 + j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(f50763c);
        hiAggregateOption.setType(i);
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).aggregateHiHealthDataPro(HiDataAggregateProOption.builder().c(hiAggregateOption).e(true).e(), new l(j2, countDownLatch, gwzVar, gxaVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final long j2, final CountDownLatch countDownLatch, final gwz gwzVar) {
        if (!fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.sleep-apnea")) {
            ReleaseLogUtil.d("R_Sleep_SleepProcessResultUtil", "is not Support Osa");
            countDownLatch.countDown();
        } else {
            if (HandlerExecutor.c()) {
                lsy.a(new Runnable() { // from class: uzn
                    @Override // java.lang.Runnable
                    public final void run() {
                        uzf.c(j2, countDownLatch, gwzVar);
                    }
                });
                return;
            }
            com.huawei.hwlogsmodel.LogUtil.a("SleepProcessResultUtil", "start OsaData");
            HiAggregateOption hiAggregateOptionD = SleepBreatheBannerProvider.d();
            hiAggregateOptionD.setCount(5);
            hiAggregateOptionD.setTimeInterval(DateFormatUtil.e(lsl.a(lsl.d(j2, -1), 20, 0), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), DateFormatUtil.e(lsl.a(j2, 20, 0) - 1, DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), HiDataReadOption.TimeFormatType.DATE_FORMAT_MILLISECONDS);
            HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).aggregateHiHealthData(hiAggregateOptionD, new j(j2, countDownLatch, gwzVar));
        }
    }

    private static void a(long j2, long j3, CountDownLatch countDownLatch, List<gwz> list) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j2 - 86400000);
        hiAggregateOption.setEndTime(999 + j3);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(f50763c);
        hiAggregateOption.setType(i);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new i(j2, j3, countDownLatch, list));
    }

    private static void a(long j2, CountDownLatch countDownLatch, gwz gwzVar) {
        nkb.d().c((j2 / 1000) - 14400, 3, 1, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, new e(j2, countDownLatch, gwzVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(SleepTotalData sleepTotalData) {
        return sleepTotalData.getManualOnTime() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long e(List<SleepTotalData> list, long j2, long j3) {
        long jD;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                jD = j3;
                break;
            }
            if (d(list.get(i2))) {
                jD = d(i2, j2);
                break;
            }
            i2++;
        }
        return jD > j3 ? j3 : jD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long b(List<SleepTotalData> list, long j2, long j3) {
        long jD;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                jD = j3;
                break;
            }
            if (d(list.get(size))) {
                jD = d(size, j2) + 60000;
                break;
            }
            size--;
        }
        return jD < j3 ? j3 : jD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long d(int i2, long j2) {
        Date date = new Date((j2 - 14400000) + (((long) (i2 * 60)) * 1000));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(SleepTotalData sleepTotalData, List<Long> list, List<Integer> list2, long j2) {
        List<Map<String, Long>> noonMapList = sleepTotalData.getNoonMapList();
        if (noonMapList == null || noonMapList.size() == 0) {
            LogUtil.a("SleepProcessResultUtil", "noonMapList is null");
            return;
        }
        for (Map<String, Long> map : noonMapList) {
            Long l2 = map.get("core_sleep_start_time_key");
            if (l2 == null) {
                LogUtil.a("SleepProcessResultUtil", "setNoonSleepData start is null");
            } else {
                Long l3 = map.get("core_sleep_end_time_key");
                if (l3 == null) {
                    LogUtil.a("SleepProcessResultUtil", "setNoonSleepData end is null");
                } else {
                    long jLongValue = l2.longValue();
                    long jLongValue2 = l3.longValue();
                    if (jLongValue <= j2 && jLongValue2 >= j2 - 86400000) {
                        list.add(Long.valueOf(jLongValue / 1000));
                        list2.add(Integer.valueOf((int) ((jLongValue2 - jLongValue) / 1000)));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(SleepTotalData sleepTotalData) {
        return sleepTotalData.getManualOnTime() == 1 || sleepTotalData.getDeepSleepTime() == 1 || sleepTotalData.getShallowSleepTime() == 1 || sleepTotalData.getSlumberSleepTime() == 1;
    }

    private static boolean d(SleepTotalData sleepTotalData) {
        return sleepTotalData.getManualBedTime() == 1;
    }

    public static void a(final long j2, final long j3, final IBaseResponseCallback iBaseResponseCallback) {
        lsy.a(new Runnable() { // from class: uzf.4
            @Override // java.lang.Runnable
            public void run() {
                uzf.b(j2, j3, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(long j2, long j3, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SleepProcessResultUtil", "start executeQuestionnaireProcess startTime is ", Long.valueOf(j2), " endtime is ", Long.valueOf(j3));
        gxa gxaVarA = a(j2, j3);
        Gson gsonCreate = new GsonBuilder().create();
        String json = gsonCreate.toJson(gxaVarA);
        LogUtil.a("SleepProcessResultUtil", "countdown ok, json is ", json);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String questionnaireAnalysis = ((SleepLabelApi) Services.b("SleepLabelAlgorithm", SleepLabelApi.class)).getQuestionnaireAnalysis(json);
            LogUtil.a("SleepProcessResultUtil", "Questionnaire result back execute time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            LogUtil.a("SleepProcessResultUtil", "Questionnaire result back ", questionnaireAnalysis);
            gxb gxbVar = (gxb) gsonCreate.fromJson(questionnaireAnalysis, gxb.class);
            if (gxbVar.c() == 0) {
                iBaseResponseCallback.a(0, gxbVar);
            } else {
                iBaseResponseCallback.a(0, null);
            }
        } catch (Exception e2) {
            LogUtil.c("SleepProcessResultUtil", "get result failed check in json, e: ", ExceptionUtils.c(e2));
            iBaseResponseCallback.a(1, null);
        }
    }

    static class g implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CountDownLatch f50790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<gwz> f50792c;
        private long d;
        private long e;
        private long g;
        private String j;

        g(long j, long j2, CountDownLatch countDownLatch, List<gwz> list, int i) {
            this.g = j;
            this.d = j2;
            this.f50790a = countDownLatch;
            this.f50792c = list;
            this.f50791b = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            int i2;
            ArrayList arrayList;
            String str;
            long j;
            int i3;
            boolean zC;
            long jD;
            long j2;
            long jE;
            gwz gwzVar;
            final gwz gwzVar2;
            String str2;
            long j3;
            g gVar = this;
            String str3 = "SleepProcessResultUtil";
            LogUtil.a("SleepProcessResultUtil", "Month DetailSleepResponseCallback response!");
            int i4 = 3;
            int i5 = 0;
            if (i != 0 || !(obj instanceof List)) {
                for (int i6 = 0; i6 < gVar.f50791b * 3; i6++) {
                    gVar.f50790a.countDown();
                }
                LogUtil.a("SleepProcessResultUtil", "get day detail error or null, error code is ", Integer.valueOf(i));
                return;
            }
            List list = (List) obj;
            com.huawei.hwlogsmodel.LogUtil.a("SleepProcessResultUtil", " handleDayData retListData.size = ", Integer.valueOf(list.size()));
            if (list.isEmpty()) {
                while (i5 < gVar.f50791b * 3) {
                    gVar.f50790a.countDown();
                    i5++;
                }
                LogUtil.a("SleepProcessResultUtil", "get day detail retListData.isEmpty()");
                return;
            }
            SleepTotalData sleepTotalData = (SleepTotalData) list.get(0);
            int i7 = 0;
            while (i7 < gVar.f50791b) {
                ArrayList arrayList2 = new ArrayList();
                int i8 = i7 * ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
                while (true) {
                    i2 = i7 + 1;
                    if (i8 >= i2 * ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL) {
                        break;
                    }
                    arrayList2.add((SleepTotalData) list.get(i8));
                    i8++;
                }
                long j4 = (((long) i7) * 86400000) + gVar.g;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i9 = i5;
                while (true) {
                    if (i9 >= arrayList2.size()) {
                        arrayList = arrayList4;
                        str = "";
                        j = 0;
                        i3 = 0;
                        zC = false;
                        break;
                    }
                    SleepTotalData sleepTotalData2 = (SleepTotalData) arrayList2.get(i9);
                    if (uzf.b(sleepTotalData2)) {
                        gVar.j = sleepTotalData2.getTimeZone();
                        gVar.e = j4;
                        zC = uzf.c(sleepTotalData2);
                        long jD2 = uzf.d(i9, j4);
                        String deviceId = sleepTotalData2.getDeviceType() == i4 ? sleepTotalData2.getDeviceId() : "";
                        arrayList = arrayList4;
                        if (sleepTotalData2.getNoonSleepTime() != 1) {
                            int iE = uzf.e(sleepTotalData2.getDeviceType());
                            j = jD2;
                            str = deviceId;
                            i3 = iE;
                            break;
                        }
                        str = deviceId;
                        j = jD2;
                        i3 = 0;
                        break;
                    }
                    i9++;
                    i4 = 3;
                }
                int size = arrayList2.size() - 1;
                while (true) {
                    if (size < 0) {
                        jD = 0;
                        break;
                    } else {
                        if (uzf.b((SleepTotalData) arrayList2.get(size))) {
                            jD = uzf.d(size, j4) + 60000;
                            break;
                        }
                        size--;
                    }
                }
                gwz gwzVar3 = gVar.f50792c.get(i7);
                if (zC) {
                    jE = uzf.e(arrayList2, j4, j);
                    long jB = uzf.b(arrayList2, j4, jD);
                    gwzVar3.r(uzf.a(j, jE, gVar.j, gVar.e) * 60);
                    gwzVar3.b(jE / 1000);
                    gwzVar3.a(jB / 1000);
                    j2 = jB;
                } else {
                    j2 = 0;
                    jE = 0;
                }
                if (jD != 0) {
                    gwzVar = gwzVar3;
                    b(sleepTotalData, jD - 86400000, jD, arrayList3, arrayList);
                } else {
                    gwzVar = gwzVar3;
                }
                gwzVar.i(arrayList3);
                ArrayList arrayList5 = arrayList;
                gwzVar.c(arrayList5);
                gwzVar.e(j / 1000);
                gwzVar.c(jD / 1000);
                gwzVar.e(i3);
                gwzVar.d(System.currentTimeMillis() / 1000);
                String str4 = str;
                if (!str4.equals("")) {
                    gwzVar2 = gwzVar;
                    str2 = str3;
                    gVar = this;
                    j3 = j4;
                    uzf.e(str4, gwzVar2, gVar.f50790a, j3);
                    uzf.d(str4, gwzVar2, gVar.f50790a, j3);
                } else {
                    str2 = str3;
                    LogUtil.a(str2, "startSleepTime is ", Long.valueOf(j), ",endSleepTime is ", Long.valueOf(jD), ",startBedTime is ", Long.valueOf(jE), ",endBedTime is ", Long.valueOf(j2));
                    LogUtil.a(str2, "noonstartList is ", arrayList3, ", noontimelist is ", arrayList5);
                    gwzVar2 = gwzVar;
                    gVar = this;
                    gVar.f50790a.countDown();
                    gVar.f50790a.countDown();
                    j3 = j4;
                }
                if (3 == i3) {
                    final long j5 = j3;
                    final long j6 = j;
                    ThreadPoolManager.c().execute(new Runnable() { // from class: uzl
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f50809c.b(j5, gwzVar2, j6);
                        }
                    });
                } else {
                    gVar.f50790a.countDown();
                }
                sleepTotalData = sleepTotalData;
                i7 = i2;
                str3 = str2;
                list = list;
                i4 = 3;
                i5 = 0;
            }
        }

        /* synthetic */ void b(long j, gwz gwzVar, long j2) {
            uzf.b(j, this.f50790a, gwzVar, j2);
        }

        private void b(SleepTotalData sleepTotalData, long j, long j2, List<Long> list, List<Integer> list2) {
            List<Map<String, Long>> noonMapList = sleepTotalData.getNoonMapList();
            if (noonMapList == null || noonMapList.size() == 0) {
                LogUtil.a("SleepProcessResultUtil", "noonMapList is null");
                return;
            }
            for (Map<String, Long> map : noonMapList) {
                Long l = map.get("core_sleep_start_time_key");
                if (l == null) {
                    LogUtil.a("SleepProcessResultUtil", "setNoonSleepData start is null");
                } else {
                    Long l2 = map.get("core_sleep_end_time_key");
                    if (l2 == null) {
                        LogUtil.a("SleepProcessResultUtil", "setNoonSleepData end is null");
                    } else {
                        long jLongValue = l.longValue();
                        long jLongValue2 = l2.longValue();
                        if (jLongValue >= j && jLongValue2 < j2) {
                            list.add(Long.valueOf(jLongValue / 1000));
                            list2.add(Integer.valueOf((int) ((jLongValue2 - jLongValue) / 1000)));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(long j2, CountDownLatch countDownLatch, gwz gwzVar, long j3) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j2);
        hiAggregateOption.setEndTime(86399999 + j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(e);
        hiAggregateOption.setType(d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiDataAggregateProOption.Builder().c(hiAggregateOption).e((String) null).e());
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).aggregateHiHealthDataProEx(arrayList, new f(countDownLatch, gwzVar, j3, j2));
    }

    static class f implements HiAggregateListenerEx {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f50788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f50789c;
        private gwz d;
        private CountDownLatch e;

        f(CountDownLatch countDownLatch, gwz gwzVar, long j, long j2) {
            this.e = countDownLatch;
            this.d = gwzVar;
            this.f50789c = j;
            this.f50788b = j2;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            LogUtil.a("SleepProcessResultUtil", "PhoneSleepResponseCallback dataList: ", sparseArray);
            if (sparseArray == null) {
                LogUtil.d("SleepProcessResultUtil", "PhoneSleepResponseCallback dataList is null");
                this.e.countDown();
                return;
            }
            List<HiHealthData> list = sparseArray.get(0);
            if (coq.d(list)) {
                LogUtil.d("SleepProcessResultUtil", "PhoneSleepResponseCallback hiHealthData is null");
                this.e.countDown();
                return;
            }
            HiHealthData hiHealthData = list.get(0);
            long j = hiHealthData.getLong("bedTime");
            long j2 = hiHealthData.getLong("risingTime");
            LogUtil.a("SleepProcessResultUtil", "PhoneSleepResponseCallback bedTime: ", Long.valueOf(j), " risingTime: ", Long.valueOf(j2), " latency: ", Integer.valueOf(hiHealthData.getInt("latency")));
            this.d.b(j / 1000);
            this.d.a(j2 / 1000);
            this.d.r(uzf.a(this.f50789c, j, hiHealthData.getTimeZone(), this.f50788b) * 60);
            this.e.countDown();
        }
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CountDownLatch f50783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private gwz f50784c;
        private long e;

        d(CountDownLatch countDownLatch, gwz gwzVar, long j) {
            this.e = j;
            this.f50783b = countDownLatch;
            this.f50784c = gwzVar;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("SleepProcessResultUtil", "DetailNoonSleepResponseCallback response!");
            if (i != 0 || !(obj instanceof List)) {
                LogUtil.a("SleepProcessResultUtil", "get day detail error or null, error code is ", Integer.valueOf(i));
                this.f50783b.countDown();
                return;
            }
            List list = (List) obj;
            com.huawei.hwlogsmodel.LogUtil.a("SleepProcessResultUtil", " handleDayData retListData.size = ", Integer.valueOf(list.size()));
            if (list.isEmpty()) {
                LogUtil.a("SleepProcessResultUtil", "get day detail retListData.isEmpty()");
                this.f50783b.countDown();
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            uzf.a((SleepTotalData) list.get(0), arrayList, arrayList2, this.e * 1000);
            this.f50784c.i(arrayList);
            this.f50784c.c(arrayList2);
            LogUtil.a("SleepProcessResultUtil", "noonstartList is ", arrayList, ", noontimelist is ", arrayList2);
            this.f50783b.countDown();
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f50785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private gwz f50786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f50787c;
        private String d;
        private CountDownLatch e;

        e(long j, CountDownLatch countDownLatch, gwz gwzVar) {
            this.f50787c = j;
            this.e = countDownLatch;
            this.f50786b = gwzVar;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            String str;
            boolean z;
            int i2;
            long j;
            long jD;
            long jB;
            long jE;
            LogUtil.a("SleepProcessResultUtil", "Day DetailSleepResponseCallback response!");
            if (i != 0 || !(obj instanceof List)) {
                LogUtil.a("SleepProcessResultUtil", "get day detail error or null, error code is ", Integer.valueOf(i));
                this.e.countDown();
                this.e.countDown();
                this.e.countDown();
                return;
            }
            List list = (List) obj;
            com.huawei.hwlogsmodel.LogUtil.a("SleepProcessResultUtil", " handleDayData retListData.size = ", Integer.valueOf(list.size()));
            if (list.isEmpty()) {
                LogUtil.a("SleepProcessResultUtil", "get day detail retListData.isEmpty()");
                this.e.countDown();
                this.e.countDown();
                this.e.countDown();
                return;
            }
            long j2 = this.f50787c;
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    str = "";
                    z = false;
                    i2 = 0;
                    j = 0;
                    break;
                }
                SleepTotalData sleepTotalData = (SleepTotalData) list.get(i3);
                if (uzf.b(sleepTotalData)) {
                    boolean zC = uzf.c(sleepTotalData);
                    long jD2 = uzf.d(i3, j2);
                    this.d = sleepTotalData.getTimeZone();
                    this.f50785a = j2;
                    String deviceId = sleepTotalData.getDeviceType() == 3 ? sleepTotalData.getDeviceId() : "";
                    if (sleepTotalData.getNoonSleepTime() == 1) {
                        str = deviceId;
                        z = zC;
                        j = jD2;
                        i2 = 0;
                        break;
                    }
                    int iE = uzf.e(sleepTotalData.getDeviceType());
                    str = deviceId;
                    i2 = iE;
                    z = zC;
                    j = jD2;
                    break;
                }
                i3++;
            }
            int size = list.size() - 1;
            while (true) {
                if (size < 0) {
                    jD = 0;
                    break;
                } else {
                    if (uzf.b((SleepTotalData) list.get(size))) {
                        jD = uzf.d(size, j2) + 60000;
                        break;
                    }
                    size--;
                }
            }
            if (z) {
                jE = uzf.e((List<SleepTotalData>) list, j2, j);
                jB = uzf.b((List<SleepTotalData>) list, j2, jD);
                int iA = uzf.a(j, jE, this.d, this.f50785a);
                this.f50786b.b(jE / 1000);
                this.f50786b.a(jB / 1000);
                this.f50786b.r(iA * 60);
            } else {
                jB = 0;
                jE = 0;
            }
            final long j3 = j;
            this.f50786b.e(j3 / 1000);
            this.f50786b.c(jD / 1000);
            this.f50786b.e(i2);
            if (str.equals("")) {
                this.e.countDown();
                this.e.countDown();
                LogUtil.a("SleepProcessResultUtil", "startSleepTime is ", Long.valueOf(j3), ",endSleepTime is ", Long.valueOf(jD), ",startBedTime is ", Long.valueOf(jE), ",endBedTime is ", Long.valueOf(jB));
            } else {
                LogUtil.a("SleepProcessResultUtil", "get phone data phoneDeviceId is ", str);
                uzf.e(str, this.f50786b, this.e, this.f50787c);
                uzf.d(str, this.f50786b, this.e, this.f50787c);
            }
            if (3 == i2) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: uzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50807c.b(j3);
                    }
                });
            } else {
                this.e.countDown();
            }
        }

        /* synthetic */ void b(long j) {
            uzf.b(this.f50787c, this.e, this.f50786b, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(long j2, long j3, String str, long j4) {
        if (j2 <= 0 || j3 <= 0) {
            return -1;
        }
        return Math.max(0, a(j2, j4, str) - d(j3, j4, str));
    }

    private static int a(long j2, long j3, String str) {
        if (j2 <= 0 || j3 <= 0) {
            return -1;
        }
        return gwc.b(j2, gwc.a(j3, str, -1));
    }

    private static int d(long j2, long j3, String str) {
        if (j2 <= 0 || j3 <= 0) {
            return -1;
        }
        return gwc.b(j2, gwc.a(j3, str, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HiHealthData e(List<HiHealthData> list, long j2) {
        if (coq.d(list)) {
            LogUtil.c("SleepProcessResultUtil", "no env noise data!");
            return null;
        }
        long jA = lsl.a(lsl.d(j2, -1), 20, 0);
        for (int i2 = 0; i2 < list.size(); i2++) {
            HiHealthData hiHealthData = list.get(i2);
            LogUtil.a("SleepProcessResultUtil", "hiHealthData start time:", Long.valueOf(hiHealthData.getStartTime()));
            if (jA < hiHealthData.getEndTime() && hiHealthData.getEndTime() - hiHealthData.getStartTime() > 10800000) {
                LogUtil.a("SleepProcessResultUtil", "coresleep start time:", Long.valueOf(hiHealthData.getStartTime()));
                LogUtil.a("SleepProcessResultUtil", "coresleep end time:", Long.valueOf(hiHealthData.getEndTime()));
                LogUtil.a("SleepProcessResultUtil", "coresleep meta data:", hiHealthData.getMetaData());
                return hiHealthData;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, final gwz gwzVar, final CountDownLatch countDownLatch, final long j2) {
        LogUtil.a("SleepProcessResultUtil", "begin to request envnoise data!");
        long jE = ltb.e(new Date(j2)) * 1000;
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(jE - 28800000);
        hiDataReadOption.setEndTime(jE + 86400000);
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.ENVIRONMENT_NOISE_TYPE.value()});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(5);
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(1).b(), new HiDataReadResultListener() { // from class: uzf.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.a("SleepProcessResultUtil", "getPhoneNoiseData back");
                if (!(obj instanceof SparseArray)) {
                    LogUtil.c("SleepProcessResultUtil", "getPhoneNoiseData no data");
                    countDownLatch.countDown();
                    return;
                }
                Object obj2 = ((SparseArray) obj).get(DicDataTypeUtil.DataType.ENVIRONMENT_NOISE_TYPE.value());
                List list = obj2 instanceof List ? (List) obj2 : null;
                if (!coq.d(list)) {
                    HiHealthData hiHealthDataE = uzf.e((List<HiHealthData>) list, j2);
                    if (hiHealthDataE == null) {
                        LogUtil.a("SleepProcessResultUtil", "no env noise meta data!");
                    } else {
                        try {
                            gwzVar.f(new JSONObject(hiHealthDataE.getMetaData()).getInt("avgSnoreDb"));
                        } catch (JSONException unused) {
                            LogUtil.a("SleepProcessResultUtil", "sleep environmental noise MetaData get fail");
                        }
                    }
                    countDownLatch.countDown();
                    return;
                }
                LogUtil.a("SleepProcessResultUtil", "no env noise data!");
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, final gwz gwzVar, final CountDownLatch countDownLatch, final long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.add(5, 1);
        Date time = calendar.getTime();
        calendar.setTimeInMillis(j2);
        calendar.add(5, -1);
        long jM = ltb.m(calendar.getTime());
        long jO = ltb.o(time);
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (str != null && !str.equals("")) {
            hiDataReadOption.setDeviceUuid(str);
        }
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.SLEEP_SCORE.value(), DicDataTypeUtil.DataType.WAKE_COUNT.value()});
        hiDataReadOption.setSortOrder(0);
        hiDataReadOption.setTimeInterval(jM * 1000, jO * 1000);
        hiDataReadOption.setReadType(2);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: uzf.7
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.a("SleepProcessResultUtil", "getExtraPhoneData back");
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray == null || sparseArray.size() <= 0) {
                    LogUtil.a("SleepProcessResultUtil", "map is null");
                    countDownLatch.countDown();
                    return;
                }
                long jE = ltb.e(new Date(j2)) * 1000;
                int iB = uzo.b(sparseArray, DicDataTypeUtil.DataType.SLEEP_SCORE.value(), jE, ((jE / 1000) + k.b.m) * 1000);
                LogUtil.a("SleepProcessResultUtil", "extra coreScore is ", Integer.valueOf(iB), "wakeCount is ", 0);
                gwzVar.n(iB);
                gwzVar.v(0);
                countDownLatch.countDown();
            }
        });
    }

    static class j implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CountDownLatch f50797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f50798c;
        private gwz e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        public j(long j, CountDownLatch countDownLatch, gwz gwzVar) {
            this.f50798c = j;
            this.f50797b = countDownLatch;
            this.e = gwzVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            HiHealthData next;
            if (coq.d(list)) {
                ReleaseLogUtil.e("R_Sleep_SleepProcessResultUtil", "datas is empty");
                this.f50797b.countDown();
                return;
            }
            Iterator<HiHealthData> it = list.iterator();
            HiHealthData hiHealthData = null;
            while (it.hasNext() && (next = it.next()) != null) {
                if (hiHealthData == null || hiHealthData.getEndTime() < next.getEndTime()) {
                    hiHealthData = next;
                }
            }
            this.e.p(uzf.e(hiHealthData));
            this.f50797b.countDown();
        }
    }

    static class l implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f50799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private gwz f50800c;
        private CountDownLatch d;
        private gxa e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        public l(long j, CountDownLatch countDownLatch, gwz gwzVar, gxa gxaVar) {
            this.f50799b = j;
            this.d = countDownLatch;
            this.f50800c = gwzVar;
            this.e = gxaVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("SleepProcessResultUtil", "SumSleepResponseCallback response!");
            if (coq.d(list)) {
                LogUtil.a("SleepProcessResultUtil", "on success() sumList = null");
                this.d.countDown();
                return;
            }
            long j = this.f50799b;
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getStartTime() == j) {
                    int i3 = hiHealthData.getInt("sleep_version");
                    uzf.a(this.f50800c, hiHealthData);
                    this.e.b(i3 == 5 ? 1 : 0);
                }
                if (hiHealthData.getStartTime() == j - 86400000) {
                    uzf.b(this.f50800c, hiHealthData);
                }
            }
            LogUtil.a("SleepProcessResultUtil", "now day sum sleep info ok ", this.f50800c.toString());
            this.d.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(gwz gwzVar, HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return;
        }
        int i2 = hiHealthData.getInt("rest_heart_rate_new");
        if (i2 == 0) {
            i2 = hiHealthData.getInt("rest_heart_rate_old");
        }
        int i3 = hiHealthData.getInt("max_heart_rate");
        int i4 = hiHealthData.getInt("stress_day_avg");
        gwzVar.o(i2);
        gwzVar.j(i3);
        gwzVar.c(i4);
    }

    public static int e(String str, HiHealthData hiHealthData) {
        if (hiHealthData.containsKey(str)) {
            return hiHealthData.getInt(str);
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(gwz gwzVar, HiHealthData hiHealthData) {
        int i2;
        if (hiHealthData == null) {
            return;
        }
        int i3 = hiHealthData.getInt("core_sleep_deep_key");
        int i4 = hiHealthData.getInt("core_sleep_shallow_key");
        int i5 = hiHealthData.getInt("core_sleep_deep_key_aasm");
        int i6 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
        int i7 = hiHealthData.getInt("core_sleep_rem_key_aasm");
        int i8 = hiHealthData.getInt("core_sleep_wake_key");
        int i9 = hiHealthData.getInt("core_sleep_wake_count_key");
        int i10 = hiHealthData.getInt("core_sleep_dream_key");
        int i11 = hiHealthData.getInt("core_sleep_score_key");
        int i12 = hiHealthData.getInt("core_sleep_sum_key");
        int i13 = hiHealthData.getInt("data_session_manual_sleep_bed_time_key");
        int i14 = hiHealthData.getInt("core_sleep_snore_freq_key");
        int iE = e("core_sleep_deep_count_key", hiHealthData);
        if (iE == Integer.MIN_VALUE) {
            iE = 71;
        }
        boolean z = i4 > 0 || i3 > 0 || i10 > 0 || i6 > 0 || i5 > 0 || i7 > 0;
        int i15 = i3;
        int i16 = hiHealthData.getInt("common_sleep_duration_sleep_sum_key");
        int i17 = i4;
        int i18 = hiHealthData.getInt("sleep_device_category_key");
        int i19 = hiHealthData.getInt("sleep_version");
        int iA = a(hiHealthData);
        int i20 = i7;
        int iD = d(hiHealthData);
        int iC = c(hiHealthData);
        int i21 = iE;
        int i22 = i(hiHealthData);
        if (i19 == 5) {
            gwzVar.q(hiHealthData.getInt("core_sleep_stable_key_aasm"));
            i15 = i5;
            i17 = i6;
        } else {
            i20 = i10;
        }
        SleepViewConstants.SleepTypeEnum sleepTypeEnumH = h(i18);
        LogUtil.a("SleepProcessResultUtil", "setDaySleepInfo sleepType ", sleepTypeEnumH, " deepsum ", Integer.valueOf(i15), " shallowsum ", Integer.valueOf(i17), " coreWakeSum ", Integer.valueOf(i8), " dreamSum ", Integer.valueOf(i20), " score ", Integer.valueOf(i11), " commonSleepTotalTime ", Integer.valueOf(i16), " deviceCategory ", Integer.valueOf(i18));
        if (sleepTypeEnumH == SleepViewConstants.SleepTypeEnum.SCIENCE || sleepTypeEnumH == SleepViewConstants.SleepTypeEnum.PHONE || (z && i16 <= 0 && i18 == 0)) {
            gwzVar.b(i15 * 60);
            gwzVar.i(i17 * 60);
            gwzVar.h(i20 * 60);
            gwzVar.x(i12 * 60);
            gwzVar.v(i9);
            gwzVar.w(i8 * 60);
            if (sleepTypeEnumH == SleepViewConstants.SleepTypeEnum.SCIENCE || i11 > 0 || i20 > 0) {
                long j2 = hiHealthData.getLong("core_sleep_go_bed_time_key");
                long j3 = hiHealthData.getLong("core_sleep_off_bed_time_key");
                int i23 = hiHealthData.getInt("core_sleep_latency_new_key");
                int i24 = hiHealthData.getInt("core_sleep_bed_duration_key");
                gwzVar.b(j2 / 1000);
                gwzVar.a(j3 / 1000);
                gwzVar.r(i23 * 60);
                gwzVar.l(iA);
                gwzVar.m(iD);
                gwzVar.k(iC);
                gwzVar.s(i22);
                LogUtil.a("SleepProcessResultUtil", "setDaySleepInfo onBedTime: ", Long.valueOf(j2), " offBedTime; ", Long.valueOf(j3), " sleepLatency: ", Integer.valueOf(i23), "heartRateStatus", Integer.valueOf(iA), "breathRateStatus", Integer.valueOf(iD), "hrvStatus", Integer.valueOf(iC), "spO2status", Integer.valueOf(i22));
                i2 = i24;
            } else {
                i2 = i8 + i12;
            }
            LogUtil.a("SleepProcessResultUtil", "setDaySleepInfo bedDuration; ", Integer.valueOf(i2));
            if (i2 > 0) {
                int iD2 = (int) (UnitUtil.d((i12 * 1.0f) / i2, 2) * 100.0d);
                gwzVar.a(i2 * 60);
                gwzVar.t(iD2);
                LogUtil.a("SleepProcessResultUtil", "setDaySleepInfo sleepEfficiency: ", Integer.valueOf(iD2));
            }
        } else {
            if (!z && i16 > 0) {
                int i25 = hiHealthData.getInt("sleep_deep_key");
                int i26 = hiHealthData.getInt("sleep_shallow_key");
                int i27 = hiHealthData.getInt("sleep_wake_key");
                int i28 = hiHealthData.getInt("sleep_wake_count_key");
                gwzVar.b(i25);
                gwzVar.i(i26);
                gwzVar.x(i16);
                gwzVar.v(i28);
                gwzVar.w(i27);
            } else if (i13 <= 0) {
                LogUtil.a("SleepProcessResultUtil", "setDaySleepInfo sleep type is wrong");
            } else {
                gwzVar.b(i15 * 60);
                gwzVar.i(i17 * 60);
                gwzVar.h(i20 * 60);
                gwzVar.x(i12 * 60);
                gwzVar.v(i9);
                gwzVar.w(i8 * 60);
                gwzVar.a(i13 * 60);
                gwzVar.t((int) (UnitUtil.d((i12 * 1.0f) / i13, 2) * 100.0d));
            }
            i11 = i11;
        }
        gwzVar.g(i14);
        gwzVar.d(i21);
        gwzVar.n(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(HiHealthData hiHealthData) {
        int i2 = hiHealthData.getInt("osaLevel");
        if (i2 <= 0 || i2 > 4) {
            return 0;
        }
        return i2;
    }

    private static int a(HiHealthData hiHealthData) {
        int i2 = hiHealthData.getInt("avgHeartrate");
        int i3 = hiHealthData.getInt("minHeartrateBaseline");
        int i4 = hiHealthData.getInt("maxHeartrateBaseline");
        if (c(i3) || c(i4) || c(i2) || i4 < i3) {
            return 0;
        }
        return c(i2, i3, i4);
    }

    private static int d(HiHealthData hiHealthData) {
        int i2 = hiHealthData.getInt("avgBreathrate");
        int i3 = hiHealthData.getInt("minBreathrateBaseline");
        int i4 = hiHealthData.getInt("maxBreathrateBaseline");
        if (d(i2) || d(i3) || d(i4) || i4 < i3) {
            return 0;
        }
        return c(i2, i3, i4);
    }

    private static int c(HiHealthData hiHealthData) {
        int i2 = hiHealthData.getInt("avgHrv");
        int i3 = hiHealthData.getInt("minHrvBaseline");
        int i4 = hiHealthData.getInt("maxHrvBaseline");
        if (a(i3) || a(i4) || a(i2) || i4 < i3) {
            return 0;
        }
        return c(i2, i3, i4);
    }

    private static int i(HiHealthData hiHealthData) {
        int i2 = hiHealthData.getInt("avgOxygenSaturation");
        int i3 = hiHealthData.getInt("minOxygenSaturationBaseline");
        int i4 = hiHealthData.getInt("maxOxygenSaturationBaseline");
        if (f(i3) || f(i4) || f(i2) || i4 < i3) {
            return 0;
        }
        return c(i2, i3, i4);
    }

    private static SleepViewConstants.SleepTypeEnum h(int i2) {
        SleepViewConstants.SleepTypeEnum sleepTypeEnum = SleepViewConstants.SleepTypeEnum.COMMON;
        if (gwc.i(i2)) {
            sleepTypeEnum = SleepViewConstants.SleepTypeEnum.SCIENCE;
        } else if (gwc.g(i2)) {
            sleepTypeEnum = SleepViewConstants.SleepTypeEnum.PHONE;
        }
        LogUtil.a("SleepProcessResultUtil", "judgeScienceAndPhone:", sleepTypeEnum);
        return sleepTypeEnum;
    }

    static class i implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CountDownLatch f50795a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<gwz> f50796c;
        private long d;
        private long e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        public i(long j, long j2, CountDownLatch countDownLatch, List<gwz> list) {
            this.d = j;
            this.e = j2;
            this.f50795a = countDownLatch;
            this.f50796c = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("SleepProcessResultUtil", "SumSleepResponseCallback response!");
            if (list == null || list.isEmpty()) {
                LogUtil.a("SleepProcessResultUtil", "on success() sumList = null");
                this.f50795a.countDown();
                return;
            }
            for (int i3 = 0; i3 < this.f50796c.size(); i3++) {
                gwz gwzVar = this.f50796c.get(i3);
                long j = this.d;
                long j2 = i3;
                long j3 = i3 - 1;
                HiHealthData hiHealthData = null;
                HiHealthData hiHealthData2 = null;
                for (HiHealthData hiHealthData3 : list) {
                    if (hiHealthData3.getStartTime() == (j2 * 86400000) + j) {
                        hiHealthData = hiHealthData3;
                    }
                    if (hiHealthData3.getStartTime() == j + (86400000 * j3)) {
                        hiHealthData2 = hiHealthData3;
                    }
                }
                uzf.a(gwzVar, hiHealthData);
                uzf.b(gwzVar, hiHealthData2);
                LogUtil.a("SleepProcessResultUtil", "now sleep info ok ", gwzVar.toString());
            }
            LogUtil.a("SleepProcessResultUtil", "sleep info list ok ");
            this.f50795a.countDown();
        }
    }

    static class h implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f50793a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CountDownLatch f50794c;
        private int d;
        private List<gwz> e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public h(long j, CountDownLatch countDownLatch, List<gwz> list, int i) {
            this.f50793a = j;
            this.f50794c = countDownLatch;
            this.e = list;
            this.d = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (i != 0 || !(obj instanceof SparseArray)) {
                LogUtil.a("SleepProcessResultUtil", "get heart rate day detail error or null, error code is ", Integer.valueOf(i));
                this.f50794c.countDown();
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                LogUtil.a("SleepProcessResultUtil", "heartRateList is empty", Integer.valueOf(i));
                this.f50794c.countDown();
                return;
            }
            List<HiHealthData> list = (List) sparseArray.get(2002);
            ArrayList arrayList = new ArrayList();
            long j = this.f50793a;
            for (int i3 = 0; i3 < this.d; i3++) {
                ArrayList arrayList2 = new ArrayList();
                long jD = this.e.get(i3).d() * 1000;
                if (jD == 0) {
                    arrayList.add(arrayList2);
                } else {
                    boolean z = false;
                    for (HiHealthData hiHealthData : list) {
                        if (hiHealthData.getIntValue() == 0 || hiHealthData.getStartTime() < j || hiHealthData.getStartTime() >= jD) {
                            if (z) {
                                break;
                            }
                        } else {
                            arrayList2.add(hiHealthData);
                            z = true;
                        }
                    }
                    arrayList.add(arrayList2);
                }
                j += 86400000;
            }
            LogUtil.a("SleepProcessResultUtil", "dayHeartRateList ok ");
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (HiHealthData hiHealthData2 : (List) arrayList.get(i4)) {
                    arrayList3.add(Long.valueOf(hiHealthData2.getStartTime() / 1000));
                    arrayList4.add(Integer.valueOf(hiHealthData2.getIntValue()));
                }
                this.e.get(i4).b(arrayList3);
                this.e.get(i4).d(arrayList4);
            }
            this.f50794c.countDown();
        }
    }

    static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CountDownLatch f50781a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private gwz f50782c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public c(CountDownLatch countDownLatch, gwz gwzVar) {
            this.f50781a = countDownLatch;
            this.f50782c = gwzVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("SleepProcessResultUtil", "DetailHeartRateResponseCallback back ", Integer.valueOf(i));
            if (i != 0 || !(obj instanceof SparseArray)) {
                LogUtil.a("SleepProcessResultUtil", "get heart rate day detail error or null, error code is ", Integer.valueOf(i));
                this.f50781a.countDown();
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() > 0) {
                List<HiHealthData> list = (List) sparseArray.get(2002);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData.getIntValue() != 0) {
                        arrayList.add(Long.valueOf(hiHealthData.getStartTime() / 1000));
                        arrayList2.add(Integer.valueOf(hiHealthData.getIntValue()));
                    }
                }
                this.f50782c.b(arrayList);
                this.f50782c.d(arrayList2);
                this.f50781a.countDown();
                return;
            }
            LogUtil.a("SleepProcessResultUtil", "heartRateList is empty", Integer.valueOf(i));
            this.f50781a.countDown();
        }
    }

    static class a implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CountDownLatch f50776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<gwz> f50778c;
        private long d;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public a(long j, CountDownLatch countDownLatch, List<gwz> list, int i) {
            this.d = j;
            this.f50776a = countDownLatch;
            this.f50778c = list;
            this.f50777b = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (i != 0 || !(obj instanceof SparseArray)) {
                LogUtil.a("SleepProcessResultUtil", "get exercise day detail error or null, error code is ", Integer.valueOf(i));
                this.f50776a.countDown();
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                LogUtil.a("SleepProcessResultUtil", "heartRateList is empty", Integer.valueOf(i));
                this.f50776a.countDown();
                return;
            }
            List<HiHealthData> list = (List) sparseArray.get(7);
            ArrayList arrayList = new ArrayList();
            long j = this.d;
            for (int i3 = 0; i3 < this.f50777b; i3++) {
                ArrayList arrayList2 = new ArrayList();
                long jD = this.f50778c.get(i3).d() * 1000;
                if (jD == 0) {
                    arrayList.add(arrayList2);
                } else {
                    boolean z = false;
                    for (HiHealthData hiHealthData : list) {
                        if (hiHealthData.getIntValue() == 0 || hiHealthData.getStartTime() < j || hiHealthData.getStartTime() >= jD) {
                            if (z) {
                                break;
                            }
                        } else {
                            arrayList2.add(hiHealthData);
                            z = true;
                        }
                    }
                    arrayList.add(arrayList2);
                }
                j += 86400000;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                List list2 = (List) arrayList.get(i4);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i5 = 60;
                long startTime = 0;
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    HiHealthData hiHealthData2 = (HiHealthData) list2.get(i6);
                    if (hiHealthData2.getStartTime() - startTime > 60000) {
                        arrayList3.add(Long.valueOf(hiHealthData2.getStartTime() / 1000));
                        arrayList4.add(60);
                        i5 = 60;
                    } else {
                        i5 += 60;
                        arrayList4.set(arrayList4.size() - 1, Integer.valueOf(i5));
                    }
                    startTime = hiHealthData2.getStartTime();
                }
                this.f50778c.get(i4).e(arrayList3);
                this.f50778c.get(i4).a(arrayList4);
            }
            this.f50776a.countDown();
        }
    }

    static class b implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private gwz f50779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CountDownLatch f50780b;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public b(CountDownLatch countDownLatch, gwz gwzVar) {
            this.f50780b = countDownLatch;
            this.f50779a = gwzVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("SleepProcessResultUtil", "DetailExerciseIntensityResponseCallback back ", Integer.valueOf(i));
            if (i != 0 || !(obj instanceof SparseArray)) {
                LogUtil.a("SleepProcessResultUtil", "get exercise day detail error or null, error code is ", Integer.valueOf(i));
                this.f50780b.countDown();
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() > 0) {
                List list = (List) sparseArray.get(7);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long startTime = 0;
                int i3 = 60;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    HiHealthData hiHealthData = (HiHealthData) list.get(i4);
                    if (hiHealthData.getStartTime() - startTime > 60000) {
                        arrayList.add(Long.valueOf(hiHealthData.getStartTime() / 1000));
                        arrayList2.add(60);
                        i3 = 60;
                    } else {
                        i3 += 60;
                        arrayList2.set(arrayList2.size() - 1, Integer.valueOf(i3));
                    }
                    startTime = hiHealthData.getStartTime();
                }
                this.f50779a.e(arrayList);
                this.f50779a.a(arrayList2);
                this.f50780b.countDown();
                return;
            }
            LogUtil.a("SleepProcessResultUtil", "exerciseList is empty", Integer.valueOf(i));
            this.f50780b.countDown();
        }
    }
}
