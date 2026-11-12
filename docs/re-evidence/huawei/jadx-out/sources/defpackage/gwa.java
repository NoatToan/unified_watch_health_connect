package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class gwa {
    private static gwa h = null;
    private static boolean j = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f36111c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f36109a = {DicDataTypeUtil.DataType.BED_TIME.value(), DicDataTypeUtil.DataType.RISING_TIME.value(), DicDataTypeUtil.DataType.DAILY_SLEEP_LATENCY.value(), DicDataTypeUtil.DataType.SLEEP_SCORE.value(), DicDataTypeUtil.DataType.WAKE_COUNT.value(), DicDataTypeUtil.DataType.SLEEP_END_REASON.value(), DicDataTypeUtil.DataType.WAKE_UP_FEELING.value()};
    private static final String[] d = {"bedTime", "risingTime", "latency", "sleepScore", "wakeCount", "sleepEndReason", "wakeUpFeeling"};
    public static int[] e = {44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206, 44004, 44008, 44009, 44109, 44110, 44209, 44210, 44211, 44212, 44213, 44214, 44205, 44216, 44217, 44218, 44219, 44220, 44221, 44222, 44227, 44228, 44229, 44230, 44223, 44224, 44225, 44226, 44231, 44232, 44233, 44234, 44235, 44236, 44111, 44112, 44113, 44006, 44007};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String[] f36110b = {"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_shallow_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key", "common_sleep_duration_sleep_sum_key", "stat_sleep_start_time", "stat_sleep_end_time", "data_session_manual_sleep_bed_time_key", "sleep_device_category_key", "minHeartrate", "maxHeartrate", "minOxygenSaturation", "maxOxygenSaturation", "minBreathrate", "maxBreathrate", "core_sleep_go_bed_key", "core_sleep_off_bed_key", "core_sleep_bed_time_key", "core_sleep_latency_key", "avgHeartrate", "minHeartrateBaseline", "maxHeartrateBaseline", "heartrateDayToBaseline", "avgBreathrate", "minBreathrateBaseline", "maxBreathrateBaseline", "breathrateDayToBaseline", "avgOxygenSaturation", "minOxygenSaturationBaseline", "maxOxygenSaturationBaseline", "oxygenSaturationDayToBaseline", "avgHrv", "minHrvBaseline", "maxHrvBaseline", "hrvDayToBaseline", "sleep_version", "core_sleep_stable_key_aasm", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm", "common_sleep_fall_key", "common_sleep_wake_up_key"};
    private int[] f = {DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_FALL_ASLEEP_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_WAKEUP_TIME.value()};
    private String[] i = {"data_session_manual_sleep_go_to_bed_time_key", "data_session_manual_sleep_get_up_time_key", "data_session_manual_sleep_sleep_time_key", "data_session_manual_sleep_wake_time_key"};
    private Context g = BaseApplication.getContext();

    private gwa() {
    }

    public static gwa c() {
        gwa gwaVar;
        synchronized (f36111c) {
            if (h == null) {
                h = new gwa();
            }
            gwaVar = h;
        }
        return gwaVar;
    }

    public static void b(boolean z) {
        j = z;
    }

    public void c(Date date, Date date2, final int[] iArr, final IBaseResponseCallback iBaseResponseCallback) {
        final String strValueOf = String.valueOf(DateFormatUtil.a(date.getTime()));
        final SparseArray<List<HiHealthData>> sparseArrayC = gwb.c(strValueOf);
        final long jA = lsl.a(date2.getTime(), 20, 0) - 1;
        final long jA2 = lsl.a(lsl.d(date.getTime(), -1), 20, 0);
        if (j && sparseArrayC != null && njy.b(sparseArrayC.get(22100))) {
            ReleaseLogUtil.d("R_Sleep_SleepDataQueryHelper", "detail data use cache");
            b(sparseArrayC, iArr, new long[]{jA2, jA}, iBaseResponseCallback);
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(DateFormatUtil.e(jA2, DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), DateFormatUtil.e(jA, DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), HiDataReadOption.TimeFormatType.DATE_FORMAT_MILLISECONDS);
        hiDataReadOption.setType(new int[]{22100});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: gwa.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj instanceof SparseArray) {
                    ReleaseLogUtil.d("R_Sleep_SleepDataQueryHelper", "Got detail data");
                    SparseArray sparseArray = (SparseArray) obj;
                    if (gwa.j) {
                        boolean unused = gwa.j = false;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        boolean zC = gwb.c((SparseArray<List<HiHealthData>>) sparseArrayC, (SparseArray<List<HiHealthData>>) sparseArray);
                        LogUtil.a("SleepDataQueryHelper", "queryDayDayData diff time: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
                        if (!zC && !gwa.this.c(sparseArray)) {
                            LogUtil.a("SleepDataQueryHelper", "queryDayDayData same cache");
                            return;
                        }
                        gwb.d(strValueOf, (SparseArray<List<HiHealthData>>) sparseArray);
                    }
                    gwa.this.b((SparseArray<List<HiHealthData>>) sparseArray, iArr, new long[]{jA2, jA}, iBaseResponseCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(SparseArray<List<HiHealthData>> sparseArray) {
        boolean zB;
        boolean z;
        List<HiHealthData> arrayList = new ArrayList<>();
        if (sparseArray != null && sparseArray.size() > 0) {
            arrayList = sparseArray.get(22100);
        }
        if (!gwc.a(arrayList)) {
            return true;
        }
        if (njy.b(arrayList)) {
            zB = b(arrayList);
            z = false;
        } else {
            zB = true;
            z = true;
        }
        ReleaseLogUtil.d("R_Sleep_SleepDataQueryHelper", "isOnlyNoonOrManual ", Boolean.valueOf(zB), "isCoreEmpty ", Boolean.valueOf(z));
        return zB || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SparseArray<List<HiHealthData>> sparseArray, int[] iArr, long[] jArr, IBaseResponseCallback iBaseResponseCallback) {
        List<HiHealthData> list;
        boolean z;
        boolean zB;
        int i = iArr[2];
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList();
        if (sparseArray == null || sparseArray.size() <= 0) {
            list = arrayList2;
            z = true;
        } else {
            list = sparseArray.get(22100);
            z = false;
        }
        LogUtil.a("SleepDataQueryHelper", "first core sleep detail point = ", list == null ? 0 : new gwg(list).toString());
        ReleaseLogUtil.d("R_Sleep_SleepDataQueryHelper", "detail data is null: ", Boolean.valueOf(njy.e(list)));
        if (gwc.a(list)) {
            if (njy.b(list)) {
                zB = b(list);
            } else {
                z = true;
                zB = true;
            }
            gxr gxrVar = new gxr();
            gxrVar.a(jArr[0]);
            if (!z) {
                gxrVar.e(22103);
                gxrVar.b(22101);
                gxrVar.d(22104);
                gwc.c(list, gxrVar, false);
            }
            if (!zB && !z) {
                LogUtil.a("SleepDataQueryHelper", "size = ", Integer.valueOf(list == null ? 0 : list.size()));
                for (int i2 = 0; i2 < i; i2++) {
                    d(arrayList, list, new int[]{i2, 1}, gxrVar);
                }
                LogUtil.a("SleepDataQueryHelper", "parseDatas, idxSleep = ", Integer.valueOf(gxrVar.h()));
                LogUtil.a("SleepDataQueryHelper", "sleepTypeCount:", Arrays.toString(gxrVar.f36203b));
                a(arrayList, gxrVar.f(), iBaseResponseCallback);
                return;
            }
            b(gxrVar, iArr, jArr, iBaseResponseCallback, list);
        }
    }

    private boolean b(List<HiHealthData> list) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getType() != 22105 && hiHealthData.getType() != 22104 && hiHealthData.getType() != 22106 && hiHealthData.getType() != 22107) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> e(List<HiHealthData> list, SparseArray<Object> sparseArray, List<HiHealthData> list2, gxr gxrVar) {
        if (njy.b(list)) {
            LogUtil.a("SleepDataQueryHelper", "choose normalSleepDataList");
            gxrVar.e(22001);
            gxrVar.b(22002);
            gxrVar.d(22003);
            gwc.c(list, gxrVar, true);
            List<HiHealthData> list3 = (List) sparseArray.get(22000);
            if (njy.e(list2)) {
                return list3;
            }
            Iterator<HiHealthData> it = list2.iterator();
            while (it.hasNext()) {
                if (it.next().getType() != 22105) {
                    return list3;
                }
            }
            list3.addAll(list2);
            return list3;
        }
        LogUtil.a("SleepDataQueryHelper", "choose coreSleepDataList");
        gxrVar.b(false);
        if (njy.b(list2)) {
            for (HiHealthData hiHealthData : list2) {
                if (hiHealthData.getType() == 22106 || hiHealthData.getType() == 22107) {
                    gxrVar.b(true);
                    break;
                }
            }
        }
        return list2;
    }

    private void b(gxr gxrVar, int[] iArr, long[] jArr, IBaseResponseCallback iBaseResponseCallback, List<HiHealthData> list) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jArr[0], jArr[1]);
        hiDataReadOption.setType(new int[]{22000});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(this.g).readHiHealthData(hiDataReadOption, new d(iArr, list, iBaseResponseCallback, gxrVar, this));
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<HiHealthData> f36122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f36123c;
        private gxr d;
        private IBaseResponseCallback e;
        private WeakReference<gwa> j;

        d(int[] iArr, List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback, gxr gxrVar, gwa gwaVar) {
            this.f36123c = iArr[1];
            this.f36121a = iArr[2];
            this.f36122b = list;
            this.d = gxrVar;
            this.j = new WeakReference<>(gwaVar);
            this.e = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            gwa gwaVar = this.j.get();
            if (gwaVar == null || this.e == null || this.d == null) {
                LogUtil.e("SleepDataQueryHelper", "sleepDataQueryHelper null or callback null or sleepQueryDetailData null");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            ArrayList arrayList = new ArrayList(16);
            List listE = null;
            if ((sparseArray == null || sparseArray.size() <= 0) && njy.e(this.f36122b)) {
                ReleaseLogUtil.d("R_Sleep_SleepDataQueryHelper", "all detail is null");
                IBaseResponseCallback iBaseResponseCallback = this.e;
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.a(0, arrayList);
                    return;
                }
            } else {
                if (sparseArray != null && sparseArray.size() > 0) {
                    listE = (List) sparseArray.get(22000);
                }
                listE = gwaVar.e((List<HiHealthData>) listE, (SparseArray<Object>) sparseArray, this.f36122b, this.d);
            }
            LogUtil.a("SleepDataQueryHelper", "size = ", Integer.valueOf(listE == null ? 0 : listE.size()));
            LogUtil.a("SleepDataQueryHelper", "final sleep detail point = ", listE == null ? 0 : new gwg(listE).toString());
            if (njy.e(listE)) {
                this.e.a(0, arrayList);
                return;
            }
            this.d.c(0);
            this.d.b(new HashMap(16));
            this.d.e(new ArrayList(16));
            for (int i3 = 0; i3 < this.f36121a; i3++) {
                gwaVar.d(arrayList, listE, new int[]{i3, this.f36123c}, this.d);
            }
            LogUtil.a("SleepDataQueryHelper", "getNormalSleepDailyDetail, idxSleep = ", Integer.valueOf(this.d.h()));
            gwaVar.a(arrayList, this.d.f(), this.e);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("SleepDataQueryHelper", "onResultIntent : read failed errorCode is", Integer.valueOf(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, List<HiHealthData> list2, int[] iArr, gxr gxrVar) {
        HiHealthData hiHealthData = new HiHealthData();
        long jL = gxrVar.l();
        long j2 = iArr[0];
        long j3 = iArr[1];
        if (list2 != null && list2.size() > gxrVar.h() && list2.get(gxrVar.h()).getStartTime() == jL + (j2 * j3 * 60000)) {
            b(list2, hiHealthData, gxrVar);
        }
        list.add(hiHealthData);
    }

    private void a(List<HiHealthData> list, HiHealthData hiHealthData, gxr gxrVar, HiHealthData hiHealthData2) {
        if (gxrVar.j().get("core_sleep_start_time_key") == null) {
            gxrVar.j().put("core_sleep_start_time_key", Long.valueOf(hiHealthData2.getStartTime()));
        }
        if (gxrVar.h() + 1 < list.size()) {
            HiHealthData hiHealthData3 = list.get(gxrVar.h() + 1);
            if (hiHealthData3.getType() != gxrVar.a()) {
                gxrVar.j().put("core_sleep_end_time_key", Long.valueOf(hiHealthData2.getEndTime()));
                gxrVar.f().add(new HashMap(gxrVar.j()));
                gxrVar.j().clear();
            } else if (hiHealthData3.getStartTime() != hiHealthData2.getEndTime()) {
                gxrVar.j().put("core_sleep_end_time_key", Long.valueOf(hiHealthData2.getEndTime()));
                gxrVar.f().add(new HashMap(gxrVar.j()));
                gxrVar.j().clear();
            } else {
                gxrVar.j().put("core_sleep_end_time_key", Long.valueOf(hiHealthData3.getEndTime()));
            }
        } else {
            LogUtil.a("SleepDataQueryHelper", "setFlagData this is a last minute");
            gxrVar.j().put("core_sleep_end_time_key", Long.valueOf(hiHealthData2.getEndTime()));
        }
        if (gxrVar.h() == list.size() - 1) {
            gxrVar.f().add(gxrVar.j());
        }
        hiHealthData.putInt("NOON_SLEEP_TIME", 1);
    }

    private void b(List<HiHealthData> list, HiHealthData hiHealthData, gxr gxrVar) {
        HiHealthData hiHealthData2 = list.get(gxrVar.h());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hiHealthData2.getStartTime());
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        hiHealthData.setStartTime(hiHealthData2.getStartTime());
        hiHealthData.setEndTime(hiHealthData2.getEndTime());
        if ((i == 20 && i2 == 0) || (i == 19 && i2 == 59)) {
            hiHealthData.putBoolean("IS_SUSPICIOUS", true);
        }
        if (gxrVar.i() != 0) {
            hiHealthData.putInt("DEVICE_TYPE", gxrVar.i());
        }
        if (hiHealthData2.getString("device_uniquecode") != null) {
            hiHealthData.putString("DEVICE_ID", hiHealthData2.getString("device_uniquecode"));
        }
        if (hiHealthData2.getType() == 22106) {
            hiHealthData.putInt("BED_TIME", 1);
            gxrVar.a(0);
        } else if (hiHealthData2.getType() == 22107) {
            hiHealthData.putInt("SLEEP_TIME", 1);
            gxrVar.a(1);
        } else if (gxrVar.d() == hiHealthData2.getType()) {
            hiHealthData.putInt("DEEP_SLEEP_TIME", 1);
            gxrVar.a(2);
        } else if (gxrVar.b() == hiHealthData2.getType()) {
            hiHealthData.putInt("SHALLOW_SLEEP_TIME", 1);
            gxrVar.a(3);
        } else if (gxrVar.c() == hiHealthData2.getType()) {
            hiHealthData.putInt("WAKE_UP_DURATION", 1);
            gxrVar.a(4);
        } else if (gxrVar.e() == hiHealthData2.getType()) {
            hiHealthData.putInt("SLUMBER_SLEEP_TIME", 1);
            gxrVar.a(5);
        } else if (gxrVar.a() == hiHealthData2.getType() && !gxrVar.k()) {
            a(list, hiHealthData, gxrVar, hiHealthData2);
            gxrVar.a(6);
        } else {
            LogUtil.a("SleepDataQueryHelper", "tepSleepData.getType()  = ", Integer.valueOf(hiHealthData2.getType()));
            gxrVar.a(7);
        }
        gxrVar.c(gxrVar.h() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, List<Map<String, Long>> list2, IBaseResponseCallback iBaseResponseCallback) {
        StringBuilder sb = new StringBuilder(list2.size());
        StringBuilder sb2 = new StringBuilder(list2.size());
        for (int i = 0; i < list2.size(); i++) {
            Map<String, Long> map = list2.get(i);
            Long l = map.get("core_sleep_start_time_key");
            if (l == null) {
                LogUtil.e("SleepDataQueryHelper", "setNoonSleepData start is null, noonMapList ", Integer.valueOf(list2.size()), " i ", Integer.valueOf(i));
            } else {
                Long l2 = map.get("core_sleep_end_time_key");
                if (l2 == null) {
                    LogUtil.e("SleepDataQueryHelper", "setNoonSleepData end is null, noonMapList ", Integer.valueOf(list2.size()), " i ", Integer.valueOf(i));
                } else {
                    long jLongValue = l.longValue();
                    long jLongValue2 = l2.longValue();
                    new Date(jLongValue).setTime(jLongValue2);
                    if (i == list2.size() - 1) {
                        sb.append(jLongValue);
                        sb2.append(jLongValue2);
                    } else {
                        sb.append(jLongValue);
                        sb.append(",");
                        sb2.append(jLongValue2);
                        sb2.append(",");
                    }
                }
            }
        }
        if (list2.size() != 0 && list.size() != 0) {
            HiHealthData hiHealthData = list.get(0);
            hiHealthData.putString("NOON_START_TIME", sb.toString());
            hiHealthData.putString("NOON_END_TIME", sb2.toString());
            hiHealthData.putString("NOON_MAP_LIST", new Gson().toJson(list2));
            list.remove(0);
            list.add(0, hiHealthData);
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, list);
        }
    }

    public void e(Date date, Date date2, int[] iArr, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.d("R_Sleep_SleepDataQueryHelper", "getCoreSleepDetail callback is null");
            return;
        }
        if (iArr == null || iArr.length != 3) {
            ReleaseLogUtil.d("R_Sleep_SleepDataQueryHelper", "unit is null");
            return;
        }
        int i = iArr[1];
        if (i == 1 && iArr[2] <= 1440) {
            c(date, date2, iArr, iBaseResponseCallback);
            return;
        }
        if (i >= 1440) {
            b(date, date2, iArr, iBaseResponseCallback);
        } else if (iArr[2] >= 1440) {
            c(date, date2, iArr, iBaseResponseCallback);
        } else {
            LogUtil.a("SleepDataQueryHelper", "getCoreSleepDetail callback ErrorConstants.ERR_NONE ");
            iBaseResponseCallback.a(100001, null);
        }
    }

    private void b(Date date, Date date2, int[] iArr, IBaseResponseCallback iBaseResponseCallback) {
        if (iArr[0] == 0) {
            iBaseResponseCallback.a(100001, null);
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(f36110b);
        hiAggregateOption.setType(e);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(iArr[0]);
        hiAggregateOption.setTimeInterval(DateFormatUtil.e(lsl.r(date.getTime()), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), DateFormatUtil.e(lsl.c(date2.getTime()), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), HiDataReadOption.TimeFormatType.DATE_FORMAT_MILLISECONDS);
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(true).e();
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(this.g).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new c(iBaseResponseCallback, iArr, date, date2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback, int[] iArr, long j2, SparseArray<List<HiHealthData>> sparseArray) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("SleepDataQueryHelper", "setSummary callback is null");
            return;
        }
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e("R_Sleep_SleepDataQueryHelper", "Core stat is empty");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        ReleaseLogUtil.d("R_Sleep_SleepDataQueryHelper", "Other stat is empty, ", Boolean.valueOf(sparseArray == null || sparseArray.size() == 0));
        int i = iArr[2];
        if (i == 14) {
            c(iArr, j2, list, iBaseResponseCallback, sparseArray);
        } else {
            c(sparseArray, list, iBaseResponseCallback, i, iArr[1], j2);
        }
    }

    private List<HiHealthData> d(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return arrayList;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getInt("trackdata_deviceType") == 32) {
                arrayList.add(hiHealthData);
            }
        }
        int size = arrayList.size();
        LogUtil.a("SleepDataQueryHelper", "filterPhoneData.size() = ", Integer.valueOf(size), ", filterPhoneData = ", arrayList.toString());
        return arrayList;
    }

    private void c(int[] iArr, long j2, List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback, SparseArray<List<HiHealthData>> sparseArray) {
        List<HiHealthData> list2;
        List<HiHealthData> listD;
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        if (sparseArray != null) {
            List<HiHealthData> listA = a(sparseArray.get(0));
            listD = d(sparseArray.get(1));
            list2 = listA;
        } else {
            list2 = arrayList;
            listD = arrayList2;
        }
        long jD = lsl.d(j2, 7);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        d(list, arrayList3, arrayList4, jD, (String) null);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        d(list2, arrayList5, arrayList6, jD, "data_session_manual_sleep_get_up_time_key");
        ArrayList arrayList7 = new ArrayList(7);
        ArrayList arrayList8 = new ArrayList(7);
        d(listD, arrayList7, arrayList8, jD, "risingTime");
        List<List<HiHealthData>> listB = gwc.b(arrayList3, arrayList5, arrayList7);
        List<List<HiHealthData>> listB2 = gwc.b(arrayList4, arrayList6, arrayList8);
        ArrayList arrayList9 = new ArrayList(16);
        arrayList9.addAll(gwc.d(iArr[0], j2, new int[]{iArr[2], iArr[1]}, listB));
        arrayList9.addAll(gwc.d(iArr[0], jD, new int[]{iArr[2], iArr[1]}, listB2));
        LogUtil.a("SleepDataQueryHelper", "sleepViewDataList.size() = ", Integer.valueOf(arrayList9.size()));
        iBaseResponseCallback.a(0, arrayList9);
    }

    private void d(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3, long j2, String str) {
        long startTime;
        if (njy.e(list)) {
            LogUtil.j("SleepDataQueryHelper", "sumDataList is empty in matchDataList.");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (str == null) {
                startTime = hiHealthData.getStartTime();
            } else {
                startTime = hiHealthData.getLong(str);
            }
            if (startTime < j2) {
                list2.add(hiHealthData);
            } else {
                list3.add(hiHealthData);
            }
        }
    }

    private void c(SparseArray<List<HiHealthData>> sparseArray, List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback, int i, int i2, long j2) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("SleepDataQueryHelper", "setMonthYearSummary callback is null");
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.a("SleepDataQueryHelper", "setMonthYearSummary data = null ");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        List<HiHealthData> arrayList = new ArrayList<>(16);
        List<HiHealthData> arrayList2 = new ArrayList<>(16);
        if (sparseArray != null) {
            arrayList = a(sparseArray.get(0));
            arrayList2 = d(sparseArray.get(1));
        }
        ArrayList arrayList3 = new ArrayList(16);
        arrayList3.addAll(gwc.d(3, j2, new int[]{i, i2}, gwc.b(list, arrayList, arrayList2)));
        LogUtil.a("SleepDataQueryHelper", "sleepViewDataList.size() = ", Integer.valueOf(arrayList3.size()));
        iBaseResponseCallback.a(0, arrayList3);
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class c implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f36118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Date f36119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<gwa> f36120c;
        private final IBaseResponseCallback d;
        private final Date e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        private c(gwa gwaVar, IBaseResponseCallback iBaseResponseCallback, int[] iArr, Date date, Date date2) {
            this.f36120c = new WeakReference<>(gwaVar);
            this.d = iBaseResponseCallback;
            this.f36118a = iArr;
            this.e = date;
            this.f36119b = date2;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            WeakReference<gwa> weakReference = this.f36120c;
            if (weakReference == null) {
                LogUtil.j("SleepDataQueryHelper", "SummaryHiAggregateListener mReference is null");
                return;
            }
            gwa gwaVar = weakReference.get();
            if (gwaVar != null) {
                gwaVar.b(gwaVar, list, this.d, this.f36118a, this.e, this.f36119b);
                if (lsl.aa(this.f36119b.getTime()) && njy.b(list)) {
                    gwb.e(String.valueOf(DateFormatUtil.a(this.f36119b.getTime())), list.get(list.size() - 1));
                    return;
                }
                return;
            }
            LogUtil.j("SleepDataQueryHelper", "SummaryHiAggregateListener interactor is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final gwa gwaVar, final List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback, final int[] iArr, final Date date, Date date2) {
        HiDataFilter.DataFilterExpression dataFilterExpression;
        HiDataFilter.DataFilterExpression dataFilterExpression2;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(DateFormatUtil.e(lsl.r(lsl.d(date.getTime(), -3)), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), DateFormatUtil.e(lsl.c(lsl.d(date2.getTime(), 3)), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), HiDataReadOption.TimeFormatType.DATE_FORMAT_MILLISECONDS);
        hiAggregateOption.setType(this.f);
        hiAggregateOption.setConstantsKey(this.i);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        if (iArr != null && iArr.length >= 3 && iArr[2] > 1) {
            dataFilterExpression = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.BIGGER_EQUAL, lsl.r(date.getTime()));
            dataFilterExpression2 = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.LESS_EQUAL, lsl.c(date2.getTime()));
        } else {
            dataFilterExpression = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.BIGGER_EQUAL, lsl.a(lsl.d(date.getTime(), -1), 20, 0));
            dataFilterExpression2 = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.LESS_EQUAL, lsl.a(date2.getTime(), 20, 0));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataFilterExpression);
        arrayList.add(dataFilterExpression2);
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).b(HiJsonUtil.d(new HiDataFilter(arrayList, Collections.singletonList(0)))).e((String) null).e();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(hiDataAggregateProOptionE);
        arrayList2.add(a(date, date2));
        HiHealthNativeApi.a(this.g).aggregateHiHealthDataProEx(arrayList2, new HiAggregateListenerEx() { // from class: gwa.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                gwaVar.d((List<HiHealthData>) list, iBaseResponseCallback, iArr, lsl.r(date.getTime()), sparseArray);
            }
        });
    }

    private HiDataAggregateProOption a(Date date, Date date2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(DateFormatUtil.e(lsl.r(date.getTime()), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), DateFormatUtil.e(lsl.c(date2.getTime()), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), HiDataReadOption.TimeFormatType.DATE_FORMAT_MILLISECONDS);
        hiAggregateOption.setType(f36109a);
        hiAggregateOption.setConstantsKey(d);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        return new HiDataAggregateProOption.Builder().c(hiAggregateOption).e((String) null).e();
    }

    private List<HiHealthData> a(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return arrayList;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getLong("data_session_manual_sleep_sleep_time_key") != 0 || hiHealthData.getLong("data_session_manual_sleep_wake_time_key") != 0) {
                arrayList.add(hiHealthData);
            }
        }
        int size = arrayList.size();
        LogUtil.a("SleepDataQueryHelper", "fliterSimpleManualDatas.size() = ", Integer.valueOf(size), ", fliterSimpleManualDatas = ", arrayList.toString());
        return arrayList;
    }
}
