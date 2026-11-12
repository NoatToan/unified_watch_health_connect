package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hihealthservice.sync.dataswitch.BloodOxygenStatSwitch;
import com.huawei.hihealthservice.sync.dataswitch.BradycardiaStatSwitch;
import com.huawei.hihealthservice.sync.dataswitch.HeartRateRiseStatSwitch;
import com.huawei.hihealthservice.sync.dataswitch.HeartRateStatSwitch;
import com.huawei.hihealthservice.sync.dataswitch.MenstrualStatSwitch;
import com.huawei.hihealthservice.sync.dataswitch.SleepStatSwitch;
import com.huawei.hihealthservice.sync.dataswitch.StressStatSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthStatReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthStatReq;
import com.huawei.hwcloudmodel.model.unite.BloodOxygenSaturationTotal;
import com.huawei.hwcloudmodel.model.unite.BradycardiaAlarmTotal;
import com.huawei.hwcloudmodel.model.unite.GetHealthStatRsp;
import com.huawei.hwcloudmodel.model.unite.HeartRateRiseAlarmTotal;
import com.huawei.hwcloudmodel.model.unite.HeartRateTotal;
import com.huawei.hwcloudmodel.model.unite.MenstrualTotal;
import com.huawei.hwcloudmodel.model.unite.SleepTotal;
import com.huawei.hwcloudmodel.model.unite.StressTotal;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lhd implements HiSyncBase {
    private kxk aa;
    private SleepStatSwitch ac;
    private MenstrualStatSwitch ad;
    private BloodOxygenStatSwitch o;
    private HeartRateStatSwitch p;
    private BradycardiaStatSwitch q;
    private kwt r;
    private int s;
    private HeartRateRiseStatSwitch t;
    private int u;
    private Context v;
    private HiSyncOption w;
    private lqo x;
    private StressStatSwitch z;
    private static final int[] j = {46016, 46017, 46018, 46019, 46020};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f40127a = {"maxHeartRate", "minHeartRate", "avgRestingHeartRate", "lastHeartRate", "lastRestHeartRate"};
    private static final int[] f = {47401, 47405, 47406, 47402, 47403, 47404};
    private static final String[] i = {"menstrual_status", "menstrual_sub_status", "menstrual_manual_operation", "menstrual_quantity", "menstrual_dysmenorrhea", "menstrual_physical"};
    private static final int[] m = {44308, 44305, 44304, 44306, 44307};
    private static final String[] l = {"stress_score_count", "stress_score_max", "stress_score_min", "stress_score_avg", "stress_score_last"};
    private static final int[] n = {44001, 44002, 44003, 44005, 44004, 44006, 44007, 44008, 44009};
    private static final String[] k = {"stat_sleep_deep_duration", "stat_sleep_shallow_duration", "stat_sleep_wake_duration", "stat_sleep_wake_count", "stat_sleep_duration_sum", "stat_sleep_start_time", "stat_sleep_end_time", "stat_sleep_regular_start_time", "stat_sleep_regular_end_time"};
    private static final int[] g = {47004, 47003, 47002, 47005};
    private static final String[] h = {"heart_rate_rise_duration", "heart_rate_rise_max", "heart_rate_rise_min", "heart_rate_rise_alarmtimes"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f40128b = {47054, 47053, 47052, 47055};
    private static final String[] e = {"heart_rate_bradycardia_duration", "heart_rate_bradycardia_max", "heart_rate_bradycardia_min", "heart_rate_bradycardia_alarmtimes"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f40129c = {47201, 47202, 47203, 47204};
    private static final String[] d = {"maxBloodOxygenSaturation", "minBloodOxygenSaturation", "avgBloodOxygenSaturation", "lastBloodOxygenSaturation"};
    private int ab = 0;
    private int ah = 0;
    private boolean y = false;

    public lhd(Context context, HiSyncOption hiSyncOption, int i2) {
        LogUtil.d("Debug_HiSyncHealthStat", "HiSyncHealthStat create");
        this.v = context.getApplicationContext();
        this.w = hiSyncOption;
        this.u = i2;
        a();
    }

    private void a() {
        this.y = liq.f();
        this.x = lqo.b(this.v);
        this.aa = kxk.c();
        this.s = HiDateUtil.d(System.currentTimeMillis());
        this.p = new HeartRateStatSwitch(this.v);
        this.r = kwt.b();
        this.z = new StressStatSwitch(this.v);
        this.ac = new SleepStatSwitch(this.v);
        this.t = new HeartRateRiseStatSwitch(this.v);
        this.q = new BradycardiaStatSwitch(this.v);
        this.o = new BloodOxygenStatSwitch(this.v);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        SparseArray<Integer> sparseArrayA;
        SparseArray<Integer> sparseArrayA2;
        ReleaseLogUtil.d("HiH_HiSyncHealthStat", "pullDataByVersion() begin !");
        long jA = HiDateUtil.a(this.s);
        long jC = HiDateUtil.c(jA, 1);
        if (liq.h()) {
            LogUtil.d("Debug_HiSyncHealthStat", "pullDataByVersion() first sync pull all stat!");
            sparseArrayA = liq.a(1388509200000L, jA, 90);
            sparseArrayA2 = liq.a(1388509200000L, jC, 90);
        } else {
            LogUtil.d("Debug_HiSyncHealthStat", "pullDataByVersion() only pullDataByVersion recent days stat");
            sparseArrayA = liq.a(jA - HwExerciseConstants.TEN_DAY_SECOND, jA, 90);
            sparseArrayA2 = liq.a(jA - ThirdLoginDataStorageUtil.REFRESH_TOKEN_INTERVAL, jC, 90);
        }
        c(sparseArrayA, sparseArrayA2, false);
        ReleaseLogUtil.d("HiH_HiSyncHealthStat", "pullDataByVersion() end!");
    }

    private void c(SparseArray<Integer> sparseArray, SparseArray<Integer> sparseArray2, boolean z) throws lif {
        if (z) {
            LogUtil.d("Debug_HiSyncHealthStat", "downloadAllStat too much need to download ,start a thread! downloadDaysMap is ", sparseArray);
            e(sparseArray, sparseArray2);
        } else {
            LogUtil.d("Debug_HiSyncHealthStat", "downloadAllStat do not need to start a thread! downloadDaysMap is ", sparseArray);
            d(sparseArray, sparseArray2);
        }
    }

    private void d(SparseArray<Integer> sparseArray, SparseArray<Integer> sparseArray2) throws lif {
        LogUtil.d("Debug_HiSyncHealthStat", "downloadAllStatByTimeSync downloadDaysMap is ", sparseArray);
        if (sparseArray == null || sparseArray.size() <= 0 || sparseArray2 == null || sparseArray2.size() == 0) {
            LogUtil.j("Debug_HiSyncHealthStat", "downloadAllStatByTimeSync() downloadDaysMap is null, stop pullStat");
        } else {
            c(sparseArray, sparseArray2);
        }
    }

    private void e(SparseArray<Integer> sparseArray, SparseArray<Integer> sparseArray2) {
        if (sparseArray == null || sparseArray.size() <= 0 || sparseArray2 == null || sparseArray2.size() <= 0) {
            LogUtil.j("Debug_HiSyncHealthStat", "downloadAllStatByTime() downloadDaysMap is null, stop pullDataByVersion");
        } else {
            new Thread(new b(sparseArray, sparseArray2)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SparseArray<Integer> sparseArray, SparseArray<Integer> sparseArray2) throws lif {
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            int iKeyAt = sparseArray.keyAt(size);
            c(iKeyAt, sparseArray.get(iKeyAt).intValue());
        }
        e(sparseArray2);
    }

    public void e(int i2, int i3) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncHealthStat", "enter downloadMenstrualData");
        long jA = HiDateUtil.a(this.s);
        e(liq.a(jA - (((long) i2) * 86400000), jA + (((long) i3) * 86400000), 90));
        HiBroadcastUtil.e(this.v, 9);
    }

    private void e(SparseArray<Integer> sparseArray) throws lif {
        if (b() == 1 || c()) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                int iKeyAt = sparseArray.keyAt(size);
                d(iKeyAt, sparseArray.get(iKeyAt).intValue());
            }
        }
    }

    private boolean c() {
        HiUserPreference hiUserPreferenceB = kxs.c(this.v).b(this.u, "CycleCalendarSetting");
        if (hiUserPreferenceB == null || HiCommonUtil.a(hiUserPreferenceB.getValue())) {
            ReleaseLogUtil.e("Debug_HiSyncHealthStat", "getMenstrualActiveState MENSTRUAL_CONFIG_KEY is null!");
            return false;
        }
        try {
            return new JSONObject(hiUserPreferenceB.getValue()).getBoolean("activeStatus");
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HiH_HiSyncHealthStat", "getMenstrualActiveState JSONException", LogAnonymous.b(e2));
            return false;
        }
    }

    private int b() {
        HiUserPreference hiUserPreferenceB = kxs.c(this.v).b(this.u, "com.huawei.health.mc");
        if (hiUserPreferenceB == null || HiCommonUtil.a(hiUserPreferenceB.getValue())) {
            ReleaseLogUtil.e("Debug_HiSyncHealthStat", "getOldMenstrualState MENSTRUAL_CONFIG_KEY is null!");
            return 0;
        }
        try {
            return new JSONObject(hiUserPreferenceB.getValue()).getInt("masterSwitch");
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HiH_HiSyncHealthStat", "getMenstrualActiveState JSONException", LogAnonymous.b(e2));
            return 0;
        }
    }

    private void c(int i2, int i3) throws lif {
        if (i2 > i3 || i2 <= 0) {
            LogUtil.j("Debug_HiSyncHealthStat", "downloadHealthStatByTime the time is not right");
            return;
        }
        ReleaseLogUtil.d("Debug_HiSyncHealthStat", "downloadHealthStatByTime startTime is ", Integer.valueOf(i2), " , endDay is ", Integer.valueOf(i3));
        GetHealthStatRsp getHealthStatRspA = a(i2, i3);
        if (lih.e(getHealthStatRspA, false)) {
            this.aa.b(this.u, this.w.getSyncDataType(), i3, 0L);
            k(getHealthStatRspA.getHeartRateTotal());
            o(getHealthStatRspA.getStressTotal());
            m(getHealthStatRspA.getSleepTotal());
            g(getHealthStatRspA.getHeartRateRiseTotal());
            j(getHealthStatRspA.getBradycardiaAlarmTotal());
            i(getHealthStatRspA.getBloodOxygenSaturationTotal());
        }
    }

    private void d(int i2, int i3) throws lif {
        if (i2 > i3 || i2 <= 0) {
            LogUtil.j("Debug_HiSyncHealthStat", "downloadFutureStat the time is not right");
            return;
        }
        ReleaseLogUtil.d("Debug_HiSyncHealthStat", "downloadFutureStat startTime is ", Integer.valueOf(i2), " , endDay is ", Integer.valueOf(i3));
        GetHealthStatRsp getHealthStatRspB = b(i2, i3);
        if (lih.e(getHealthStatRspB, false)) {
            l(getHealthStatRspB.getMenstrualTotal());
        }
    }

    private GetHealthStatRsp a(int i2, int i3) {
        GetHealthStatReq getHealthStatReq = new GetHealthStatReq();
        getHealthStatReq.setStartTime(i2);
        getHealthStatReq.setEndTime(i3);
        getHealthStatReq.setDataSource(2);
        HashSet hashSet = new HashSet(7);
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        hashSet.add(16);
        getHealthStatReq.setTypes(hashSet);
        LogUtil.a("HiH_HiSyncHealthStat", "getHealthStatRsp req is ", HiJsonUtil.d(getHealthStatReq));
        return this.x.a(getHealthStatReq);
    }

    private GetHealthStatRsp b(int i2, int i3) {
        GetHealthStatReq getHealthStatReq = new GetHealthStatReq();
        getHealthStatReq.setStartTime(i2);
        getHealthStatReq.setEndTime(i3);
        getHealthStatReq.setDataSource(2);
        HashSet hashSet = new HashSet(1);
        hashSet.add(1001);
        getHealthStatReq.setTypes(hashSet);
        LogUtil.a("HiH_HiSyncHealthStat", "getFutureStatRsp req is ", HiJsonUtil.d(getHealthStatReq));
        return this.x.a(getHealthStatReq);
    }

    private void k(List<HeartRateTotal> list) {
        if (list == null) {
            LogUtil.j("Debug_HiSyncHealthStat", "downloadHealthStatByTime heartRateStats is null");
            return;
        }
        if (lfz.d(this.v).transferHealthStatData(this.p.e(list, this.u)) == 0) {
            liz.a().a(5, "sync download", new kym(this.v.getPackageName()));
        }
    }

    private void l(List<MenstrualTotal> list) {
        if (list == null) {
            LogUtil.j("Debug_HiSyncHealthStat", "downloadHealthStatByTime menstrualStats is null");
            return;
        }
        for (MenstrualTotal menstrualTotal : list) {
            LogUtil.d("Debug_HiSyncHealthStat", "saveHeartStatToDB menstrualStat is ", CommonUtil.ao() ? HiJsonUtil.d(menstrualTotal) : null);
            if (this.ad == null) {
                this.ad = new MenstrualStatSwitch(this.v);
            }
            List<kuk> listC = this.ad.c(menstrualTotal, this.u);
            if (njy.e(listC)) {
                return;
            } else {
                lfz.d(this.v).transferHealthStatData(listC);
            }
        }
    }

    private void o(List<StressTotal> list) {
        if (list == null) {
            LogUtil.j("Debug_HiSyncHealthStat", "downloadHealthStatByTime stressTotals is null");
            return;
        }
        if (lfz.d(this.v).transferHealthStatData(this.z.c(list, this.u)) == 0) {
            liz.a().a(14, "sync download", new kym(this.v.getPackageName()));
        }
    }

    private void m(List<SleepTotal> list) {
        if (list == null) {
            LogUtil.j("Debug_HiSyncHealthStat", "saveSleepStat sleepTotals is null");
            return;
        }
        if (lfz.d(this.v).transferHealthStatData(this.ac.c(list, this.u)) == 0) {
            liz.a().a(2, "sync download", new kym(this.v.getPackageName()));
        }
    }

    private void g(List<HeartRateRiseAlarmTotal> list) {
        if (list == null) {
            LogUtil.j("Debug_HiSyncHealthStat", "saveHeartRateRiseStat heartRateRiseAlarmTotals is null");
        } else {
            lfz.d(this.v).transferHealthStatData(this.t.d(list, this.u));
        }
    }

    private void j(List<BradycardiaAlarmTotal> list) {
        if (list == null) {
            LogUtil.j("Debug_HiSyncHealthStat", "saveBradycardiaStat bradycardiaAlarmTotals is null");
        } else {
            lfz.d(this.v).transferHealthStatData(this.q.b(list, this.u));
        }
    }

    private void i(List<BloodOxygenSaturationTotal> list) {
        if (list == null) {
            LogUtil.j("Debug_HiSyncHealthStat", "downloadHealthStatByTime bloodOxygenStats is null");
            return;
        }
        if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
            LogUtil.e("Debug_HiSyncHealthStat", "Can not open db ", "hihealth_sensitive.db");
            return;
        }
        if (lfz.d(this.v).transferHealthStatData(this.o.d(list, this.u)) == 0) {
            liz.a().a(18, "sync download", new kym(this.v.getPackageName()));
        }
    }

    private boolean d(List<HiHealthData> list) throws lif {
        if (!this.y) {
            int i2 = this.ah + 1;
            this.ah = i2;
            liq.c(i2, this.w.getSyncManual());
        } else {
            int i3 = this.ah + 1;
            this.ah = i3;
            if (3 < i3) {
                this.ab += 2;
                return false;
            }
        }
        List<HeartRateTotal> listA = this.p.a(list);
        if (listA.isEmpty()) {
            this.ab++;
            return false;
        }
        AddHealthStatReq addHealthStatReq = new AddHealthStatReq();
        addHealthStatReq.setHeartRateTotal(listA);
        addHealthStatReq.setTimeZone(list.get(0).getTimeZone());
        while (true) {
            if (this.ab < 2) {
                if (!lih.e(this.x.c(addHealthStatReq), false)) {
                    this.ab++;
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addHeartRateStat success ! uploadCount ", Integer.valueOf(this.ah));
                    LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listA) : null);
                    return true;
                }
            } else {
                ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addHeartRateStat failed ! uploadCount is ", Integer.valueOf(this.ah));
                LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listA) : null);
                return false;
            }
        }
    }

    private boolean a(List<HiHealthData> list) throws lif {
        if (!this.y) {
            int i2 = this.ah + 1;
            this.ah = i2;
            liq.c(i2, this.w.getSyncManual());
        } else {
            int i3 = this.ah + 1;
            this.ah = i3;
            if (i3 > 3) {
                this.ab += 2;
                return false;
            }
        }
        if (this.ad == null) {
            this.ad = new MenstrualStatSwitch(this.v);
        }
        List<MenstrualTotal> listA = this.ad.a(list);
        if (listA.isEmpty()) {
            this.ab++;
            return false;
        }
        AddHealthStatReq addHealthStatReq = new AddHealthStatReq();
        addHealthStatReq.setMenstrualTotal(listA);
        addHealthStatReq.setTimeZone(list.get(0).getTimeZone());
        while (true) {
            if (this.ab < 2) {
                if (!lih.e(this.x.c(addHealthStatReq), false)) {
                    this.ab++;
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addMenstrualStat success ! uploadCount is ", Integer.valueOf(this.ah));
                    LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listA) : null);
                    return true;
                }
            } else {
                ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addMenstrualStat failed ! uploadCount is ", Integer.valueOf(this.ah));
                LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listA) : null);
                return false;
            }
        }
    }

    private boolean h(List<HiHealthData> list) throws lif {
        if (!this.y) {
            int i2 = this.ah + 1;
            this.ah = i2;
            liq.c(i2, this.w.getSyncManual());
        } else {
            int i3 = this.ah + 1;
            this.ah = i3;
            if (3 < i3) {
                this.ab += 2;
                return false;
            }
        }
        List<StressTotal> listD = this.z.d(list);
        if (listD.isEmpty()) {
            this.ab++;
            return false;
        }
        AddHealthStatReq addHealthStatReq = new AddHealthStatReq();
        addHealthStatReq.setStressTotal(listD);
        addHealthStatReq.setTimeZone(list.get(0).getTimeZone());
        while (true) {
            if (this.ab < 2) {
                if (!lih.e(this.x.c(addHealthStatReq), false)) {
                    this.ab++;
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addStressStats success ! uploadCount is ", Integer.valueOf(this.ah));
                    LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listD) : null);
                    return true;
                }
            } else {
                ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addStressStats failed ! uploadCount is ", Integer.valueOf(this.ah));
                LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listD) : null);
                return false;
            }
        }
    }

    private boolean f(List<HiHealthData> list) throws lif {
        if (!this.y) {
            int i2 = this.ah + 1;
            this.ah = i2;
            liq.c(i2, this.w.getSyncManual());
        } else {
            int i3 = this.ah + 1;
            this.ah = i3;
            if (3 < i3) {
                this.ab += 2;
                return false;
            }
        }
        List<SleepTotal> listB = this.ac.b(list);
        if (listB.isEmpty()) {
            this.ab++;
            return false;
        }
        AddHealthStatReq addHealthStatReq = new AddHealthStatReq();
        addHealthStatReq.setSleepTotal(listB);
        addHealthStatReq.setTimeZone(list.get(0).getTimeZone());
        while (true) {
            if (this.ab < 2) {
                if (!lih.e(this.x.c(addHealthStatReq), false)) {
                    this.ab++;
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addSleepStats success ! uploadCount is ", Integer.valueOf(this.ah));
                    LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listB) : null);
                    return true;
                }
            } else {
                ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addSleepStats failed ! uploadCount is ", Integer.valueOf(this.ah));
                LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listB) : null);
                return false;
            }
        }
    }

    private boolean c(List<HiHealthData> list) throws lif {
        if (!this.y) {
            int i2 = this.ah + 1;
            this.ah = i2;
            liq.c(i2, this.w.getSyncManual());
        } else {
            int i3 = this.ah + 1;
            this.ah = i3;
            if (3 < i3) {
                this.ab += 2;
                return false;
            }
        }
        List<HeartRateRiseAlarmTotal> listC = this.t.c(list);
        if (listC.isEmpty()) {
            this.ab++;
            return false;
        }
        AddHealthStatReq addHealthStatReq = new AddHealthStatReq();
        addHealthStatReq.setHeartRateRiseAlarmTotal(listC);
        addHealthStatReq.setTimeZone(list.get(0).getTimeZone());
        while (true) {
            if (this.ab < 2) {
                if (!lih.e(this.x.c(addHealthStatReq), false)) {
                    this.ab++;
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addHeartRateRiseStats success ! uploadCount is ", Integer.valueOf(this.ah));
                    LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listC) : null);
                    return true;
                }
            } else {
                ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addHeartRateRiseStats failed ! uploadCount is ", Integer.valueOf(this.ah));
                LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listC) : null);
                return false;
            }
        }
    }

    private void f(int i2) throws lif {
        int[] iArr;
        List<HiHealthData> listC;
        while (this.ab < 2 && (listC = c(i2, (iArr = n), k)) != null && !listC.isEmpty()) {
            if (f(listC)) {
                liq.e(this.v, listC, iArr, i2);
            }
        }
        this.ab = 0;
    }

    private void d(int i2) throws lif {
        int[] iArr;
        List<HiHealthData> listC;
        while (this.ab < 2 && (listC = c(i2, (iArr = j), f40127a)) != null && !listC.isEmpty()) {
            if (d(listC)) {
                liq.e(this.v, listC, iArr, i2);
            }
        }
        this.ab = 0;
    }

    private void c(int i2) throws lif {
        while (this.ab < 2) {
            int[] iArr = f;
            List<HiHealthData> listC = c(i2, iArr, i);
            if (njy.e(listC)) {
                break;
            } else if (a(listC)) {
                liq.e(this.v, listC, iArr, i2);
            }
        }
        this.ab = 0;
    }

    private void j(int i2) throws lif {
        int[] iArr;
        List<HiHealthData> listC;
        while (this.ab < 2 && (listC = c(i2, (iArr = m), l)) != null && !listC.isEmpty()) {
            if (h(listC)) {
                liq.e(this.v, listC, iArr, i2);
            }
        }
        this.ab = 0;
    }

    private void a(int i2) throws lif {
        int[] iArr;
        List<HiHealthData> listC;
        while (this.ab < 2 && (listC = c(i2, (iArr = g), h)) != null && !listC.isEmpty()) {
            if (c(listC)) {
                liq.e(this.v, listC, iArr, i2);
            }
        }
        this.ab = 0;
    }

    private boolean e(List<HiHealthData> list) throws lif {
        if (!this.y) {
            int i2 = this.ah + 1;
            this.ah = i2;
            liq.c(i2, this.w.getSyncManual());
        } else {
            int i3 = this.ah + 1;
            this.ah = i3;
            if (3 < i3) {
                this.ab += 2;
                return false;
            }
        }
        List<BradycardiaAlarmTotal> listE = this.q.e(list);
        if (listE.isEmpty()) {
            this.ab++;
            return false;
        }
        AddHealthStatReq addHealthStatReq = new AddHealthStatReq();
        addHealthStatReq.setBradycardiaAlarmTotal(listE);
        addHealthStatReq.setTimeZone(list.get(0).getTimeZone());
        while (true) {
            if (this.ab < 2) {
                if (!lih.e(this.x.c(addHealthStatReq), false)) {
                    this.ab++;
                } else {
                    ReleaseLogUtil.d("Debug_HiSyncHealthStat", "addHeartRateBradycardiaStats success ! uploadCount is ", Integer.valueOf(this.ah));
                    LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listE) : null);
                    return true;
                }
            } else {
                ReleaseLogUtil.d("Debug_HiSyncHealthStat", "addHeartRateBradycardiaStats failed ! uploadCount is ", Integer.valueOf(this.ah));
                LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listE) : null);
                return false;
            }
        }
    }

    private void b(int i2) throws lif {
        int[] iArr;
        List<HiHealthData> listC;
        while (this.ab < 2 && (listC = c(i2, (iArr = f40128b), e)) != null && !listC.isEmpty()) {
            if (e(listC)) {
                liq.e(this.v, listC, iArr, i2);
            }
        }
        this.ab = 0;
    }

    private List<HiHealthData> c(int i2, int[] iArr, String[] strArr) {
        return liq.a(this.v, i2, iArr, strArr, new int[]{50, this.y});
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncHealthStat", "pushData() begin!");
        if (!lgp.m()) {
            ReleaseLogUtil.e("HiH_HiSyncHealthStat", "pushData() dataPrivacy switch is closed, push end!");
            return;
        }
        int iG = this.r.g(this.u);
        if (iG <= 0) {
            LogUtil.j("Debug_HiSyncHealthStat", "pushData() no statClient get, maybe no data need to push ,push end !");
        } else {
            d(iG);
            c(iG);
            j(iG);
            a(iG);
            b(iG);
            f(iG);
            e(iG);
        }
        ReleaseLogUtil.d("HiH_HiSyncHealthStat", "pushData() end !");
    }

    private void e(int i2) throws lif {
        int[] iArr;
        List<HiHealthData> listC;
        if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
            LogUtil.e("Debug_HiSyncHealthStat", "Can not open db ", "hihealth_sensitive.db");
            return;
        }
        while (this.ab < 2 && (listC = c(i2, (iArr = f40129c), d)) != null && !listC.isEmpty()) {
            if (b(listC)) {
                liq.e(this.v, listC, iArr, i2);
            }
        }
        this.ab = 0;
    }

    private boolean b(List<HiHealthData> list) throws lif {
        if (!this.y) {
            int i2 = this.ah + 1;
            this.ah = i2;
            liq.c(i2, this.w.getSyncManual());
        } else {
            int i3 = this.ah + 1;
            this.ah = i3;
            if (i3 > 3) {
                this.ab += 2;
                return false;
            }
        }
        List<BloodOxygenSaturationTotal> listA = this.o.a(list);
        if (listA.isEmpty()) {
            this.ab++;
            return false;
        }
        AddHealthStatReq addHealthStatReq = new AddHealthStatReq();
        addHealthStatReq.setBloodOxygenSaturationTotal(listA);
        addHealthStatReq.setTimeZone(list.get(0).getTimeZone());
        while (true) {
            if (this.ab < 2) {
                if (!lih.e(this.x.c(addHealthStatReq), false)) {
                    this.ab++;
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addBloodOxygenStat success ! uploadCount is ", Integer.valueOf(this.ah));
                    LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listA) : null);
                    return true;
                }
            } else {
                ReleaseLogUtil.d("HiH_HiSyncHealthStat", "addBloodOxygenStat failed ! uploadCount is ", Integer.valueOf(this.ah));
                LogUtil.d("Debug_HiSyncHealthStat", "stat is ", CommonUtil.ao() ? HiJsonUtil.d(listA) : null);
                return false;
            }
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j2, long j3) throws lif {
        c(liq.a(j2, j3, 90), liq.a(j2, j3, 90), false);
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<lhd> f40130a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SparseArray<Integer> f40131c;
        SparseArray<Integer> d;

        private b(lhd lhdVar, SparseArray<Integer> sparseArray, SparseArray<Integer> sparseArray2) {
            this.f40131c = sparseArray;
            this.d = sparseArray2;
            this.f40130a = new WeakReference<>(lhdVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            lhd lhdVar = this.f40130a.get();
            if (lhdVar != null) {
                try {
                    lhdVar.c(this.f40131c, this.d);
                    return;
                } catch (lif e) {
                    ReleaseLogUtil.a("HiH_HiSyncHealthStat", "downloadHealthStatByTime error ! e is ", e.getMessage());
                    return;
                }
            }
            LogUtil.j("Debug_HiSyncHealthStat", "StatDownloadRunnable() mSyncStat = null");
        }
    }

    public String toString() {
        return "--HiSyncHealthStat{}";
    }
}
