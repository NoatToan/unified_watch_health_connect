package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ujn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ujn f50259a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f50260c = new Object();
    private int j = 22103;
    private int f = 22101;
    private int i = 22104;
    private int g = 22102;
    private int h = 22105;
    private int k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f50261b = 0;
    private int m = 0;
    private Map<String, Long> o = new HashMap(16);
    private int[] l = {44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206};
    private int[] s = {44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206, 44004, 44008, 44009};
    private String[] n = {"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_shallow_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key"};
    private String[] d = {"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_shallow_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key", "common_sleep_duration_sleep_sum_key", "stat_sleep_start_time", "stat_sleep_end_time"};
    private Context e = BaseApplication.getContext();

    private ujn() {
    }

    public static ujn d() {
        ujn ujnVar;
        synchronized (f50260c) {
            if (f50259a == null) {
                f50259a = new ujn();
            }
            ujnVar = f50259a;
        }
        return ujnVar;
    }

    public void b(final long j, final int i, final int i2, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j * 1000, ((((long) ((i * i2) * 60)) + j) * 1000) - 1);
        hiDataReadOption.setType(new int[]{22100, 22000});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(this.e).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: ujn.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i3, Object obj, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i3, int i4) {
                List list;
                ArrayList arrayList = new ArrayList(16);
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray == null || sparseArray.size() <= 0) {
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(0, arrayList);
                    }
                    list = null;
                } else {
                    list = (List) sparseArray.get(22100);
                    ujn.this.j = 22103;
                    ujn.this.f = 22101;
                    ujn.this.i = 22104;
                }
                if (list == null || list.size() <= 0) {
                    if (sparseArray != null && sparseArray.size() > 0) {
                        list = (List) sparseArray.get(22000);
                    }
                    ujn.this.j = 22001;
                    ujn.this.f = 22002;
                    ujn.this.i = 22003;
                }
                List list2 = list;
                LogUtil.a("HiH_SleepOldDataModelInteractor", "size = ", Integer.valueOf(list2 == null ? 0 : list2.size()));
                LogUtil.d("SleepOldDataModelInteractor", "sleep detail point = ", list2 == null ? 0 : list2.toString());
                ujn.this.k = 0;
                ArrayList arrayList2 = new ArrayList(16);
                ujn.this.o.clear();
                for (int i5 = 0; i5 < i2; i5++) {
                    ujn.this.e(arrayList, (List<HiHealthData>) list2, j, new int[]{i5, i}, arrayList2);
                }
                ujn.this.a(arrayList, arrayList2, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<SleepTotalData> list, List<HiHealthData> list2, long j, int[] iArr, List<Map<String, Long>> list3) {
        SleepTotalData sleepTotalData = new SleepTotalData();
        this.f50261b = (j + ((long) (iArr[0] * iArr[1] * 60))) * 1000;
        if (list2 != null) {
            int size = list2.size();
            int i = this.k;
            if (size > i && list2.get(i).getStartTime() == this.f50261b) {
                c(list2, sleepTotalData, list3);
            }
        }
        list.add(sleepTotalData);
    }

    private void c(List<HiHealthData> list, SleepTotalData sleepTotalData, List<Map<String, Long>> list2) {
        HiHealthData hiHealthData = list.get(this.k);
        this.m = hiHealthData.getInt("trackdata_deviceType");
        if (this.j == hiHealthData.getType()) {
            sleepTotalData.setType(7);
            sleepTotalData.setDeepSleepTime(1);
        } else if (this.f == hiHealthData.getType()) {
            sleepTotalData.setType(6);
            sleepTotalData.setShallowSleepTime(1);
        } else if (this.i == hiHealthData.getType()) {
            sleepTotalData.setType(FitnessSleepType.HW_FITNESS_WAKE);
            sleepTotalData.setWakeupDuration(1);
        } else if (this.g == hiHealthData.getType()) {
            sleepTotalData.setType(FitnessSleepType.HW_FITNESS_DREAM);
            sleepTotalData.setSlumberSleepTime(1);
        } else if (this.h == hiHealthData.getType()) {
            if (this.o.get("core_sleep_start_time_key") == null) {
                this.o.put("core_sleep_start_time_key", Long.valueOf(hiHealthData.getStartTime()));
            }
            if (this.k + 1 < list.size()) {
                HiHealthData hiHealthData2 = list.get(this.k + 1);
                if (hiHealthData2.getType() != this.h || hiHealthData2.getStartTime() != hiHealthData.getEndTime()) {
                    this.o.put("core_sleep_end_time_key", Long.valueOf(hiHealthData.getEndTime()));
                    list2.add(this.o);
                    this.o = new HashMap(16);
                } else {
                    this.o.put("core_sleep_end_time_key", Long.valueOf(hiHealthData2.getEndTime()));
                }
            } else {
                LogUtil.a("HiH_SleepOldDataModelInteractor", "setFlagData this is a last minute");
                this.o.put("core_sleep_end_time_key", Long.valueOf(hiHealthData.getEndTime()));
            }
            if (this.k == list.size() - 1) {
                list2.add(this.o);
            }
            sleepTotalData.setType(FitnessSleepType.HW_FITNESS_NOON);
            sleepTotalData.setNoonSleepTime(1);
        } else {
            LogUtil.a("HiH_SleepOldDataModelInteractor", "tepSleepData.getType()  = ", Integer.valueOf(hiHealthData.getType()));
        }
        sleepTotalData.setDeviceType(this.m);
        this.k++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<SleepTotalData> list, List<Map<String, Long>> list2, IBaseResponseCallback iBaseResponseCallback) {
        StringBuilder sb = new StringBuilder(list2.size());
        StringBuilder sb2 = new StringBuilder(list2.size());
        for (int i = 0; i < list2.size(); i++) {
            Map<String, Long> map = list2.get(i);
            Long l = map.get("core_sleep_start_time_key");
            if (l == null) {
                LogUtil.e("HiH_SleepOldDataModelInteractor", "setNoonSleepData start is null, noonMapList ", Integer.valueOf(list2.size()), " i ", Integer.valueOf(i));
            } else {
                Long l2 = map.get("core_sleep_end_time_key");
                if (l2 == null) {
                    LogUtil.e("HiH_SleepOldDataModelInteractor", "setNoonSleepData end is null, noonMapList ", Integer.valueOf(list2.size()), " i ", Integer.valueOf(i));
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
            SleepTotalData sleepTotalData = list.get(0);
            sleepTotalData.setNoonStartTime(sb.toString());
            sleepTotalData.setNoonEndTime(sb2.toString());
            list.remove(0);
            list.add(0, sleepTotalData);
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, list);
        }
    }

    public void e(long j, int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.a("HiH_SleepOldDataModelInteractor", "getCoreSleepDetail callback is null");
            return;
        }
        if (i2 == 1 && i3 <= 1440) {
            b(j, i2, i3, iBaseResponseCallback);
        } else if (i2 < 1440) {
            LogUtil.a("HiH_SleepOldDataModelInteractor", "getCoreSleepDetail callback ErrorConstants.ERR_NONE ");
            iBaseResponseCallback.a(100001, null);
        } else {
            c(j, i, i2, i3, iBaseResponseCallback);
        }
    }

    private void c(long j, int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        int i4;
        if (i == 0) {
            iBaseResponseCallback.a(100001, null);
            return;
        }
        long j2 = ((((((long) i2) * ((long) i3)) * 60) + j) * 1000) - 1;
        if (i == 5 && i3 == 12) {
            j2 = ((((long) (i2 * 60)) + j) * 1000) - 1;
            i4 = 3;
        } else {
            i4 = 1;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(1000 * j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setAggregateType(i4);
        hiAggregateOption.setConstantsKey(this.d);
        hiAggregateOption.setType(this.s);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(i);
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(this.e).aggregateHiHealthData(hiAggregateOption, new e(iBaseResponseCallback, new int[]{i, i2, i3}, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback, int[] iArr, long j) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HiH_SleepOldDataModelInteractor", "setSummary callback is null");
            return;
        }
        if (list != null && !list.isEmpty()) {
            LogUtil.a("HiH_SleepOldDataModelInteractor", "data.size() = ", Integer.valueOf(list.size()));
            LogUtil.d("HiH_SleepOldDataModelInteractor", "setSummary data = ", list.toString());
            ArrayList arrayList = new ArrayList(16);
            int i = iArr[2];
            int i2 = iArr[1];
            if (i == 1) {
                c(list, arrayList);
            } else {
                c(iArr[0], j, list, arrayList, new int[]{i, i2});
            }
            LogUtil.a("HiH_SleepOldDataModelInteractor", "sleepTotalData.size() = ", Integer.valueOf(arrayList.size()));
            iBaseResponseCallback.a(0, arrayList);
            return;
        }
        iBaseResponseCallback.a(100001, null);
    }

    private void c(List<HiHealthData> list, List<SleepTotalData> list2) {
        int i;
        SleepTotalData sleepTotalData = new SleepTotalData();
        HiHealthData hiHealthData = list.get(0);
        int i2 = hiHealthData.getInt("core_sleep_deep_key");
        int i3 = hiHealthData.getInt("core_sleep_shallow_key");
        int i4 = hiHealthData.getInt("core_sleep_wake_key");
        int i5 = hiHealthData.getInt("core_sleep_wake_count_key");
        int i6 = hiHealthData.getInt("core_sleep_wake_dream_key");
        int i7 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
        int i8 = hiHealthData.getInt("core_sleep_score_key");
        double d = hiHealthData.getDouble("core_sleep_fall_key");
        double d2 = hiHealthData.getDouble("core_sleep_wake_up_key");
        int i9 = hiHealthData.getInt("core_sleep_snore_freq_key");
        int i10 = hiHealthData.getInt("core_sleep_deep_sleep_part_key");
        int i11 = hiHealthData.getInt("core_sleep_total_sleep_time_key");
        double d3 = hiHealthData.getDouble("core_sleep_valid_data_key");
        String timeZone = hiHealthData.getTimeZone();
        if (i3 > 0 || i2 > 0 || i6 > 0 || i7 > 0) {
            sleepTotalData.setDeepSleepTime(i2);
            sleepTotalData.setShallowSleepTime(i3);
            sleepTotalData.setWakeupDuration(i4);
            sleepTotalData.setSlumberSleepTime(i6);
            sleepTotalData.setNoonSleepTime(i7);
            sleepTotalData.setWakeupTimes(i5);
            sleepTotalData.setScore(i8);
            sleepTotalData.setFallTime(qqk.b(d, timeZone, 1));
            sleepTotalData.setCoreSleepFallTime((long) d);
            if (d == 0.0d) {
                i = 0;
                sleepTotalData.setFallTime(0);
                sleepTotalData.setCoreSleepFallTime(0L);
            } else {
                i = 0;
            }
            sleepTotalData.setCoreSleepWakeupTime((long) d2);
            sleepTotalData.setWakeUpTime(qqk.b(d2, timeZone, 1));
            if (d2 == 0.0d) {
                sleepTotalData.setCoreSleepWakeupTime(0L);
                sleepTotalData.setWakeUpTime(i);
            }
            sleepTotalData.setSnoreFreq(i9);
            sleepTotalData.setDeepSleepPart(i10);
            sleepTotalData.setTotalSleepTime(i11);
            sleepTotalData.setType(31);
            sleepTotalData.setValidData(d3);
        } else {
            e(sleepTotalData, hiHealthData);
        }
        list2.add(sleepTotalData);
    }

    private void e(SleepTotalData sleepTotalData, HiHealthData hiHealthData) {
        int i = hiHealthData.getInt("sleep_deep_key");
        int i2 = hiHealthData.getInt("sleep_shallow_key");
        int i3 = hiHealthData.getInt("sleep_wake_key");
        int i4 = hiHealthData.getInt("sleep_wake_count_key");
        int i5 = hiHealthData.getInt("common_sleep_duration_sleep_sum_key");
        sleepTotalData.setDeepSleepTime(i / 60);
        sleepTotalData.setShallowSleepTime(i2 / 60);
        sleepTotalData.setWakeupDuration(i3 / 60);
        sleepTotalData.setWakeupTimes(i4);
        sleepTotalData.setTotalSleepTime(i5 / 60);
        sleepTotalData.setType(30);
        String timeZone = hiHealthData.getTimeZone();
        sleepTotalData.setCommonFallTime(qqk.b(hiHealthData.getDouble("stat_sleep_start_time"), timeZone, 1));
        sleepTotalData.setCommonWakeUpTime(qqk.b(hiHealthData.getDouble("stat_sleep_end_time"), timeZone, 1));
        sleepTotalData.setSleepDayTime(hiHealthData.getStartTime());
    }

    private void c(int i, long j, List<HiHealthData> list, List<SleepTotalData> list2, int[] iArr) {
        for (int i2 = 0; i2 < iArr[0]; i2++) {
            SleepTotalData sleepTotalData = new SleepTotalData();
            for (HiHealthData hiHealthData : list) {
                long startTime = hiHealthData.getStartTime() / 1000;
                int i3 = (int) (((startTime - j) / 60) / ((long) iArr[1]));
                if (i == 5) {
                    int iR = ltb.r(ltb.a(j));
                    int iR2 = ltb.r(ltb.a(startTime));
                    if (iR2 < iR) {
                        iR2 += 12;
                    }
                    i3 = iR2 - iR;
                }
                if (i3 == i2) {
                    a(sleepTotalData, hiHealthData);
                }
            }
            LogUtil.a("SleepOldDataModelInteractor", "getCoreSleepSummary sleepTotal = ", sleepTotalData);
            list2.add(sleepTotalData);
        }
    }

    private void a(SleepTotalData sleepTotalData, HiHealthData hiHealthData) {
        String timeZone = hiHealthData.getTimeZone();
        int iRound = Math.round(hiHealthData.getFloat("core_sleep_shallow_key"));
        int iRound2 = Math.round(hiHealthData.getFloat("core_sleep_deep_key"));
        int iRound3 = Math.round(hiHealthData.getFloat("core_sleep_wake_dream_key"));
        int iRound4 = Math.round(hiHealthData.getFloat("core_sleep_day_sleep_time_key"));
        int iRound5 = Math.round(hiHealthData.getFloat("core_sleep_wake_key"));
        if (iRound > 0 || iRound2 > 0 || iRound3 > 0 || iRound4 > 0) {
            sleepTotalData.setShallowSleepTime(iRound);
            sleepTotalData.setDeepSleepTime(iRound2);
            sleepTotalData.setSlumberSleepTime(iRound3);
            sleepTotalData.setWakeupDuration(iRound5);
            sleepTotalData.setNoonSleepTime(iRound4);
            sleepTotalData.setWakeupTimes(hiHealthData.getInt("core_sleep_wake_count_key"));
            sleepTotalData.setScore(hiHealthData.getInt("core_sleep_score_key"));
            sleepTotalData.setSnoreFreq(hiHealthData.getInt("core_sleep_snore_freq_key"));
            sleepTotalData.setDeepSleepPart(hiHealthData.getInt("core_sleep_deep_sleep_part_key"));
            sleepTotalData.setTotalSleepTime(Math.round(hiHealthData.getFloat("core_sleep_total_sleep_time_key")));
            double d = hiHealthData.getDouble("core_sleep_fall_key");
            sleepTotalData.setFallTime(qqk.b(d, timeZone, 1));
            sleepTotalData.setCoreSleepFallTime((long) d);
            if (d == 0.0d) {
                sleepTotalData.setFallTime(0);
                sleepTotalData.setCoreSleepFallTime(0L);
            }
            double d2 = hiHealthData.getDouble("core_sleep_wake_up_key");
            sleepTotalData.setCoreSleepWakeupTime((long) d2);
            sleepTotalData.setWakeUpTime(qqk.b(d2, timeZone, 1));
            if (d2 == 0.0d) {
                sleepTotalData.setCoreSleepWakeupTime(0L);
                sleepTotalData.setWakeUpTime(0);
            }
            sleepTotalData.setType(31);
            sleepTotalData.setSleepDayTime(hiHealthData.getStartTime());
            return;
        }
        sleepTotalData.setDeepSleepTime(hiHealthData.getInt("sleep_deep_key") / 60);
        sleepTotalData.setShallowSleepTime(hiHealthData.getInt("sleep_shallow_key") / 60);
        sleepTotalData.setWakeupDuration(hiHealthData.getInt("sleep_wake_key") / 60);
        sleepTotalData.setWakeupTimes(hiHealthData.getInt("sleep_wake_count_key"));
        sleepTotalData.setType(30);
        sleepTotalData.setCommonFallTime(qqk.b(hiHealthData.getDouble("stat_sleep_start_time"), timeZone, 1));
        sleepTotalData.setCommonWakeUpTime(qqk.b(hiHealthData.getDouble("stat_sleep_end_time"), timeZone, 1));
        sleepTotalData.setSleepDayTime(hiHealthData.getStartTime());
    }

    static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f50265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IBaseResponseCallback f50266b;
        private final WeakReference<ujn> d;
        private final int[] e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        private e(ujn ujnVar, IBaseResponseCallback iBaseResponseCallback, int[] iArr, long j) {
            this.d = new WeakReference<>(ujnVar);
            this.f50266b = iBaseResponseCallback;
            this.e = iArr;
            this.f50265a = j;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            WeakReference<ujn> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.j("HiH_SleepOldDataModelInteractor", "SummaryHiAggregateListener mReference is null");
                return;
            }
            ujn ujnVar = weakReference.get();
            if (ujnVar != null) {
                ujnVar.b(list, this.f50266b, this.e, this.f50265a);
                this.f50266b = null;
            } else {
                LogUtil.j("HiH_SleepOldDataModelInteractor", "SummaryHiAggregateListener interactor is null");
            }
        }
    }
}
