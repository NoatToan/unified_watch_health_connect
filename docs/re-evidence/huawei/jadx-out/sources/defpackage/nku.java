package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
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
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nku {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nku f43208b = null;
    private static boolean e = false;
    private int ac;
    private int af;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int n;
    private String v;
    private boolean w;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f43207a = {DicDataTypeUtil.DataType.BED_TIME.value(), DicDataTypeUtil.DataType.RISING_TIME.value(), DicDataTypeUtil.DataType.DAILY_SLEEP_LATENCY.value()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f43209c = {"bedTime", "risingTime", "latency"};
    private int r = 22103;
    private int s = DicDataTypeUtil.DataType.DAILY_SLEEP_LATENCY.value();
    private String m = "latency";
    private int t = 22101;
    private int y = 22104;
    private int p = 22102;
    private int q = 22105;
    private int u = 0;
    private long k = 0;
    private Map<String, Long> aa = new HashMap(16);
    private int[] ad = {44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206, 44109, 44110, 44235, 44111, 44112, 44113};
    private int[] ae = {44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206, 44004, 44008, 44009, 44109, 44110, 44235, 44111, 44112, 44113};
    private String[] z = {"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_shallow_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key", "data_session_manual_sleep_bed_time_key", "sleep_device_category_key", "sleep_version", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"};
    private String[] l = {"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_shallow_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key", "common_sleep_duration_sleep_sum_key", "stat_sleep_start_time", "stat_sleep_end_time", "data_session_manual_sleep_bed_time_key", "sleep_device_category_key", "sleep_version", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"};
    private int[] ab = {DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_FALL_ASLEEP_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_WAKEUP_TIME.value()};
    private String[] x = {"data_session_manual_sleep_go_to_bed_time_key", "data_session_manual_sleep_get_up_time_key", "data_session_manual_sleep_sleep_time_key", "data_session_manual_sleep_wake_time_key"};
    private Context o = BaseApplication.getContext();

    private nku() {
    }

    public static nku e() {
        nku nkuVar;
        synchronized (d) {
            if (f43208b == null) {
                f43208b = new nku();
            }
            nkuVar = f43208b;
        }
        return nkuVar;
    }

    public void d(final long j, final int i, final int i2, final IBaseResponseCallback iBaseResponseCallback) {
        long j2 = j * 1000;
        final String strValueOf = String.valueOf(DateFormatUtil.a(j2));
        final SparseArray<List<HiHealthData>> sparseArrayC = gwb.c(strValueOf);
        if (e && sparseArrayC != null && njy.b(sparseArrayC.get(22100))) {
            LogUtil.a("HiH_SleepDataModelInteractor", "queryDayDayData use cache");
            d(sparseArrayC, i2, i, j, iBaseResponseCallback);
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j2, ((j + ((long) ((i * i2) * 60))) * 1000) - 1);
        hiDataReadOption.setType(new int[]{22100});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nku.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i3, Object obj, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i3, int i4) {
                if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (nku.e) {
                        boolean unused = nku.e = false;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        boolean zC = gwb.c((SparseArray<List<HiHealthData>>) sparseArrayC, (SparseArray<List<HiHealthData>>) sparseArray);
                        LogUtil.a("HiH_SleepDataModelInteractor", "queryDayDayData diff time: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
                        if (!zC) {
                            LogUtil.a("HiH_SleepDataModelInteractor", "queryDayDayData same cache");
                            return;
                        }
                        gwb.d(strValueOf, (SparseArray<List<HiHealthData>>) sparseArray);
                    }
                    nku.this.d((SparseArray<List<HiHealthData>>) sparseArray, i2, i, j, iBaseResponseCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SparseArray<List<HiHealthData>> sparseArray, int i, int i2, long j, IBaseResponseCallback iBaseResponseCallback) {
        List<HiHealthData> list;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList();
        if (sparseArray == null || sparseArray.size() <= 0) {
            list = arrayList2;
            z = true;
        } else {
            list = sparseArray.get(22100);
            z = false;
        }
        LogUtil.a("SleepDataModelInteractor", "first core sleep detail point = ", list == null ? 0 : new gwg(list).toString());
        if (njy.b(list)) {
            Iterator<HiHealthData> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                HiHealthData next = it.next();
                if (!(next instanceof HiHealthData)) {
                    return;
                }
                HiHealthData hiHealthData = next;
                if (hiHealthData.getType() != 22105 && hiHealthData.getType() != 22104 && hiHealthData.getType() != 22106 && hiHealthData.getType() != 22107) {
                    z2 = false;
                    break;
                }
            }
        } else {
            z = true;
            z2 = true;
        }
        if (!z) {
            this.r = 22103;
            this.t = 22101;
            this.y = 22104;
            b(list, false);
        }
        if (!z2 && !z) {
            LogUtil.a("HiH_SleepDataModelInteractor", "size = ", Integer.valueOf(list == null ? 0 : list.size()));
            if (njy.b(list)) {
                Collections.sort(list, new Comparator<HiHealthData>() { // from class: nku.2
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public int compare(HiHealthData hiHealthData2, HiHealthData hiHealthData3) {
                        return Long.compare(hiHealthData2.getStartTime(), hiHealthData3.getStartTime());
                    }
                });
            }
            this.u = 0;
            ArrayList arrayList3 = new ArrayList(16);
            this.aa.clear();
            for (int i3 = 0; i3 < i; i3++) {
                e(arrayList, list, j, new int[]{i3, 1}, arrayList3);
            }
            d(arrayList, arrayList3, iBaseResponseCallback);
            return;
        }
        d(j, i2, i, iBaseResponseCallback, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> a(List<HiHealthData> list, SparseArray<Object> sparseArray, List<HiHealthData> list2, IBaseResponseCallback iBaseResponseCallback, List<SleepTotalData> list3) {
        if (njy.b(list)) {
            this.r = 22001;
            this.t = 22002;
            this.y = 22003;
            b(list, true);
            List<HiHealthData> list4 = (List) sparseArray.get(22000);
            if (njy.e(list2)) {
                return list4;
            }
            Iterator<HiHealthData> it = list2.iterator();
            while (it.hasNext()) {
                if (it.next().getType() != 22105) {
                    return list4;
                }
            }
            list4.addAll(list2);
            return list4;
        }
        if (njy.b(list2)) {
            for (HiHealthData hiHealthData : list2) {
                if (hiHealthData.getType() == 22106 || hiHealthData.getType() == 22107) {
                    break;
                }
            }
        }
        return list2;
    }

    private void d(final long j, final int i, final int i2, final IBaseResponseCallback iBaseResponseCallback, final List<HiHealthData> list) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j * 1000, ((((long) ((i * i2) * 60)) + j) * 1000) - 1);
        hiDataReadOption.setType(new int[]{22000});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(this.o).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nku.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i3, Object obj, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i3, int i4) {
                SparseArray sparseArray = (SparseArray) obj;
                ArrayList arrayList = new ArrayList(16);
                List listA = null;
                if ((sparseArray == null || sparseArray.size() <= 0) && njy.e(list)) {
                    LogUtil.a("SleepDataModelInteractor", "all detail is null");
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(0, arrayList);
                        return;
                    }
                } else {
                    if (sparseArray != null && sparseArray.size() > 0) {
                        listA = (List) sparseArray.get(22000);
                    }
                    listA = nku.this.a((List<HiHealthData>) listA, (SparseArray<Object>) sparseArray, (List<HiHealthData>) list, iBaseResponseCallback, arrayList);
                }
                LogUtil.a("HiH_SleepDataModelInteractor", "size = ", Integer.valueOf(listA == null ? 0 : listA.size()));
                LogUtil.a("SleepDataModelInteractor", "final sleep detail point = ", listA == null ? 0 : new gwg(listA).toString());
                if (!njy.e(listA)) {
                    nku.this.u = 0;
                    ArrayList arrayList2 = new ArrayList(16);
                    nku.this.aa.clear();
                    for (int i5 = 0; i5 < i2; i5++) {
                        nku.this.e(arrayList, (List<HiHealthData>) listA, j, new int[]{i5, i}, arrayList2);
                    }
                    nku.this.d(arrayList, arrayList2, iBaseResponseCallback);
                    return;
                }
                iBaseResponseCallback.a(0, arrayList);
            }
        });
    }

    private void b(List<HiHealthData> list, boolean z) {
        if (njy.e(list)) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            HiHealthData hiHealthData = list.get(size);
            if (hiHealthData.getType() != 22105) {
                int i = hiHealthData.getInt("trackdata_deviceType");
                String string = hiHealthData.getString("device_uniquecode");
                if (hiHealthData.getType() != 22106 && hiHealthData.getType() != 22107) {
                    if (i != 0) {
                        this.v = string;
                        if (i == 32) {
                            this.af = 3;
                            break;
                        }
                        if (i != 506) {
                            if (z) {
                                this.af = 1;
                                break;
                            } else {
                                this.af = 2;
                                break;
                            }
                        }
                        this.af = 4;
                        break;
                    }
                    return;
                }
                this.af = 5;
                this.v = string;
                return;
            }
        }
        LogUtil.a("HiH_SleepDataModelInteractor", "getDeviceType mSleepDeviceType is ", Integer.valueOf(this.af));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<SleepTotalData> list, List<HiHealthData> list2, long j, int[] iArr, List<Map<String, Long>> list3) {
        SleepTotalData sleepTotalData = new SleepTotalData();
        this.k = (j + ((long) (iArr[0] * iArr[1] * 60))) * 1000;
        if (list2 != null) {
            int size = list2.size();
            int i = this.u;
            if (size > i && list2.get(i).getStartTime() == this.k) {
                b(list2, sleepTotalData, list3);
            }
        }
        list.add(sleepTotalData);
    }

    private void b(List<HiHealthData> list, SleepTotalData sleepTotalData, List<Map<String, Long>> list2, HiHealthData hiHealthData) {
        if (this.aa.get("core_sleep_start_time_key") == null) {
            this.aa.put("core_sleep_start_time_key", Long.valueOf(hiHealthData.getStartTime()));
        }
        if (this.u + 1 < list.size()) {
            HiHealthData hiHealthData2 = list.get(this.u + 1);
            if (hiHealthData2.getType() != this.q || hiHealthData2.getStartTime() != hiHealthData.getEndTime()) {
                this.aa.put("core_sleep_end_time_key", Long.valueOf(hiHealthData.getEndTime()));
                list2.add(this.aa);
                this.aa = new HashMap(16);
            } else {
                this.aa.put("core_sleep_end_time_key", Long.valueOf(hiHealthData2.getEndTime()));
            }
        } else {
            LogUtil.a("HiH_SleepDataModelInteractor", "setFlagData this is a last minute");
            this.aa.put("core_sleep_end_time_key", Long.valueOf(hiHealthData.getEndTime()));
        }
        if (this.u == list.size() - 1) {
            list2.add(this.aa);
        }
        sleepTotalData.setType(FitnessSleepType.HW_FITNESS_NOON);
        sleepTotalData.setNoonSleepTime(1);
    }

    private void b(List<HiHealthData> list, SleepTotalData sleepTotalData, List<Map<String, Long>> list2) {
        HiHealthData hiHealthData = list.get(this.u);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hiHealthData.getStartTime());
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        if ((i == 20 && i2 == 0) || (i == 19 && i2 == 59)) {
            HashMap map = new HashMap();
            map.put("IS_SUSPICIOUS", true);
            sleepTotalData.setUiDataMap(map);
        }
        int i3 = this.af;
        if (i3 != 0) {
            sleepTotalData.setDeviceType(i3);
        }
        String str = this.v;
        if (str != null) {
            sleepTotalData.setDeviceId(str);
        }
        if (hiHealthData.getType() == 22106) {
            sleepTotalData.setType(8);
            sleepTotalData.setManualBedTime(1);
        } else if (hiHealthData.getType() == 22107) {
            sleepTotalData.setType(9);
            sleepTotalData.setManualOnTime(1);
        } else if (this.r == hiHealthData.getType()) {
            sleepTotalData.setType(7);
            sleepTotalData.setDeepSleepTime(1);
        } else if (this.t == hiHealthData.getType()) {
            sleepTotalData.setType(6);
            sleepTotalData.setShallowSleepTime(1);
        } else if (this.y == hiHealthData.getType()) {
            sleepTotalData.setType(FitnessSleepType.HW_FITNESS_WAKE);
            sleepTotalData.setWakeupDuration(1);
        } else if (this.p == hiHealthData.getType()) {
            sleepTotalData.setType(FitnessSleepType.HW_FITNESS_DREAM);
            sleepTotalData.setSlumberSleepTime(1);
        } else if (this.q == hiHealthData.getType()) {
            b(list, sleepTotalData, list2, hiHealthData);
        } else {
            LogUtil.a("HiH_SleepDataModelInteractor", "tepSleepData.getType()  = ", Integer.valueOf(hiHealthData.getType()));
        }
        this.u++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<SleepTotalData> list, List<Map<String, Long>> list2, IBaseResponseCallback iBaseResponseCallback) {
        StringBuilder sb = new StringBuilder(list2.size());
        StringBuilder sb2 = new StringBuilder(list2.size());
        for (int i = 0; i < list2.size(); i++) {
            Map<String, Long> map = list2.get(i);
            Long l = map.get("core_sleep_start_time_key");
            if (l == null) {
                LogUtil.e("HiH_SleepDataModelInteractor", "setNoonSleepData start is null, noonMapList ", Integer.valueOf(list2.size()), " i ", Integer.valueOf(i));
            } else {
                Long l2 = map.get("core_sleep_end_time_key");
                if (l2 == null) {
                    LogUtil.e("HiH_SleepDataModelInteractor", "setNoonSleepData end is null, noonMapList ", Integer.valueOf(list2.size()), " i ", Integer.valueOf(i));
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
            sleepTotalData.setNoonMapList(list2);
            list.remove(0);
            list.add(0, sleepTotalData);
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, list);
        }
    }

    public void a(long j, int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.a("HiH_SleepDataModelInteractor", "getCoreSleepDetail callback is null");
            return;
        }
        if (i2 == 1 && i3 <= 1440) {
            d(j, i2, i3, iBaseResponseCallback);
            return;
        }
        if (i2 >= 1440) {
            b(j, i, i2, i3, iBaseResponseCallback);
        } else if (i3 < 1440) {
            LogUtil.a("HiH_SleepDataModelInteractor", "getCoreSleepDetail callback ErrorConstants.ERR_NONE ");
            iBaseResponseCallback.a(100001, null);
        } else {
            d(j, i2, i3, iBaseResponseCallback);
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.time.LocalDateTime] */
    private void b(long j, int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        if (i == 0) {
            iBaseResponseCallback.a(100001, null);
            return;
        }
        long j2 = j * 1000;
        long time = ((((((long) i2) * ((long) i3)) * 60) + j) * 1000) - 1;
        if (i3 == 365) {
            Date date = new Date();
            date.setTime(j2);
            time = Date.from(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().plusMonths(12L).atZone(ZoneId.systemDefault()).toInstant()).getTime() - 1;
        } else if (i == 5 && i3 == 12) {
            time = ((((long) (i2 * 60)) + j) * 1000) - 1;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j2);
        hiAggregateOption.setEndTime(time);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(this.l);
        hiAggregateOption.setType(this.ae);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(i);
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(this.o).aggregateHiHealthData(hiAggregateOption, new c(iBaseResponseCallback, new int[]{i, i2, i3}, j, time));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback, int[] iArr, long j, SparseArray<List<HiHealthData>> sparseArray) {
        List<HiHealthData> listH;
        if (iBaseResponseCallback == null) {
            LogUtil.j("HiH_SleepDataModelInteractor", "setSummary callback is null");
            return;
        }
        if (list == null || list.isEmpty()) {
            iBaseResponseCallback.a(100001, null);
            return;
        }
        int size = list.size();
        LogUtil.a("HiH_SleepDataModelInteractor", "sumdata.size() = ", Integer.valueOf(size), ", sumdata = ", list.toString());
        ArrayList arrayList = new ArrayList(16);
        List<HiHealthData> arrayList2 = new ArrayList<>(16);
        if (sparseArray != null) {
            arrayList2 = sparseArray.get(0);
            listH = h(sparseArray.get(1));
        } else {
            listH = arrayList;
        }
        ArrayList arrayList3 = new ArrayList(16);
        if (!njy.b(arrayList2)) {
            LogUtil.a("HiH_SleepDataModelInteractor", "manualData is null");
        } else {
            arrayList3.addAll(b(arrayList2));
            int size2 = arrayList3.size();
            LogUtil.a("HiH_SleepDataModelInteractor", "filterManualData.size() = ", Integer.valueOf(size2), ", filterManualData = ", arrayList3.toString());
        }
        ArrayList arrayList4 = new ArrayList(16);
        int i = iArr[2];
        int i2 = iArr[1];
        if (i == 1) {
            b(list, arrayList4, arrayList3);
        } else {
            int[] iArr2 = {i, i2};
            if (i == 14) {
                e(iArr[0], j, list, arrayList4, iArr2, arrayList3, listH);
            } else {
                c(iArr[0], j, list, arrayList4, iArr2, arrayList3);
            }
        }
        LogUtil.a("HiH_SleepDataModelInteractor", "sleepTotalData.size() = ", Integer.valueOf(arrayList4.size()));
        iBaseResponseCallback.a(0, arrayList4);
    }

    private List<HiHealthData> h(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.j("HiH_SleepDataModelInteractor", "getFilterData data is null");
            return arrayList;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getInt("trackdata_deviceType") == 32) {
                arrayList.add(hiHealthData);
            }
        }
        int size = arrayList.size();
        LogUtil.a("HiH_SleepDataModelInteractor", "filterPhoneData.size() = ", Integer.valueOf(size), ", filterPhoneData = ", arrayList.toString());
        return arrayList;
    }

    private List<HiHealthData> b(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getInt("device_uniquecode") == -1) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private void c(int i, long j, List<HiHealthData> list, List<SleepTotalData> list2, int[] iArr, List<HiHealthData> list3) {
        int iA;
        d(list3);
        HashMap map = new HashMap(3);
        map.put("data_session_manual_sleep_go_to_bed_time_key", b(list3, "data_session_manual_sleep_go_to_bed_time_key"));
        map.put("data_session_manual_sleep_get_up_time_key", b(list3, "data_session_manual_sleep_get_up_time_key"));
        map.put("data_session_manual_sleep_sleep_time_key", b(list3, "data_session_manual_sleep_sleep_time_key"));
        int i2 = iArr[0];
        int i3 = 1;
        boolean z = i2 == 2 || i2 == 8;
        int i4 = 0;
        for (char c2 = 0; i4 < iArr[c2]; c2 = 0) {
            SleepTotalData sleepTotalData = new SleepTotalData();
            for (HiHealthData hiHealthData : list) {
                long startTime = hiHealthData.getStartTime();
                if (z) {
                    iA = lsl.a(j * 1000, startTime) - i3;
                } else {
                    iA = (int) ((((startTime / 1000) - j) / 60) / ((long) iArr[i3]));
                }
                if (i == 5) {
                    int iR = ltb.r(ltb.a(j));
                    int iR2 = ltb.r(ltb.a(startTime / 1000));
                    if (iR2 < iR) {
                        iR2 += 12;
                    }
                    iA = iR2 - iR;
                }
                if (iA == i4) {
                    c(sleepTotalData, hiHealthData, iArr);
                }
                i3 = 1;
                if (this.w) {
                    e(j, iArr[1], map, i4, sleepTotalData);
                    sleepTotalData.setIsManual(true);
                }
                z = z;
            }
            sleepTotalData.setAvgManualBedTime(this.h);
            sleepTotalData.setAvgManualRisingTime(this.i);
            sleepTotalData.setAvgManualSleepTime(this.f);
            sleepTotalData.setAvgManualWakeTime(this.j);
            sleepTotalData.setDailyManualBedScore(this.n);
            sleepTotalData.setDailyManualRisingScore(this.ac);
            sleepTotalData.setAvgManualLatencyTime(this.g);
            list2.add(sleepTotalData);
            i4++;
        }
    }

    private void e(long j, int i, Map<String, List<HiHealthData>> map, int i2, SleepTotalData sleepTotalData) {
        for (Map.Entry<String, List<HiHealthData>> entry : map.entrySet()) {
            for (HiHealthData hiHealthData : entry.getValue()) {
                long j2 = i;
                boolean z = ((int) ((((hiHealthData.getStartTime() / 1000) - (j - 14400)) / 60) / j2)) == i2;
                boolean z2 = ((int) ((((hiHealthData.getStartTime() / 1000) - j) / 60) / j2)) == i2;
                if (entry.getKey() == "data_session_manual_sleep_go_to_bed_time_key" && z) {
                    sleepTotalData.setFallTime(qqk.b(hiHealthData.getStartTime(), hiHealthData.getTimeZone(), 1));
                } else if (entry.getKey() == "data_session_manual_sleep_sleep_time_key" && z) {
                    sleepTotalData.setManualFallTime(qqk.b(hiHealthData.getStartTime(), hiHealthData.getTimeZone(), 1));
                } else if (entry.getKey() == "data_session_manual_sleep_get_up_time_key" && z2) {
                    sleepTotalData.setWakeUpTime(qqk.b(hiHealthData.getStartTime(), hiHealthData.getTimeZone(), 1));
                } else {
                    LogUtil.a("HiH_SleepDataModelInteractor", "other keys");
                }
            }
        }
    }

    private SleepTotalData d(HiHealthData hiHealthData) {
        double d2 = hiHealthData.getDouble("core_sleep_fall_key");
        double d3 = hiHealthData.getDouble("core_sleep_wake_up_key");
        String timeZone = hiHealthData.getTimeZone();
        SleepTotalData sleepTotalData = new SleepTotalData();
        boolean zE = gwc.e(hiHealthData);
        sleepTotalData.setDeepSleepTime(hiHealthData.getInt(zE ? "core_sleep_deep_key_aasm" : "core_sleep_deep_key"));
        sleepTotalData.setShallowSleepTime(hiHealthData.getInt(zE ? "core_sleep_shallow_key_aasm" : "core_sleep_shallow_key"));
        sleepTotalData.setWakeupDuration(hiHealthData.getInt("core_sleep_wake_key"));
        sleepTotalData.setSlumberSleepTime(hiHealthData.getInt(zE ? "core_sleep_rem_key_aasm" : "core_sleep_wake_dream_key"));
        sleepTotalData.setNoonSleepTime(hiHealthData.getInt("core_sleep_day_sleep_time_key"));
        sleepTotalData.setWakeupTimes(hiHealthData.getInt("core_sleep_wake_count_key"));
        sleepTotalData.setManualBedTime(hiHealthData.getInt("data_session_manual_sleep_bed_time_key"));
        sleepTotalData.setManualOnTime(hiHealthData.getInt("core_sleep_total_sleep_time_key"));
        sleepTotalData.setScore(hiHealthData.getInt("core_sleep_score_key"));
        LogUtil.a("SleepDataModelInteractor", "sum set wakeuptimes ", Integer.valueOf(hiHealthData.getInt("core_sleep_wake_count_key")), " setScore ", Integer.valueOf(hiHealthData.getInt("core_sleep_score_key")));
        sleepTotalData.setFallTime(qqk.b(d2, timeZone, 1));
        sleepTotalData.setCoreSleepFallTime((long) d2);
        if (d2 == 0.0d) {
            sleepTotalData.setFallTime(0);
            sleepTotalData.setCoreSleepFallTime(0L);
        }
        sleepTotalData.setCoreSleepWakeupTime((long) d3);
        sleepTotalData.setWakeUpTime(qqk.b(d3, timeZone, 1));
        if (d3 == 0.0d) {
            sleepTotalData.setCoreSleepWakeupTime(0L);
            sleepTotalData.setWakeUpTime(0);
        }
        sleepTotalData.setSnoreFreq(hiHealthData.getInt("core_sleep_snore_freq_key"));
        sleepTotalData.setDeepSleepPart(hiHealthData.getInt("core_sleep_deep_sleep_part_key"));
        sleepTotalData.setTotalSleepTime(hiHealthData.getInt("core_sleep_total_sleep_time_key"));
        sleepTotalData.setType(31);
        sleepTotalData.setValidData(hiHealthData.getDouble("core_sleep_valid_data_key"));
        return sleepTotalData;
    }

    private void b(List<HiHealthData> list, List<SleepTotalData> list2, List<HiHealthData> list3) {
        SleepTotalData sleepTotalData = new SleepTotalData();
        HiHealthData hiHealthData = list.get(0);
        boolean zE = gwc.e(hiHealthData);
        int i = hiHealthData.getInt(zE ? "core_sleep_deep_key_aasm" : "core_sleep_deep_key");
        int i2 = hiHealthData.getInt(zE ? "core_sleep_shallow_key_aasm" : "core_sleep_shallow_key");
        int i3 = hiHealthData.getInt("core_sleep_wake_key");
        int i4 = hiHealthData.getInt("core_sleep_wake_count_key");
        int i5 = hiHealthData.getInt(zE ? "core_sleep_rem_key_aasm" : "core_sleep_wake_dream_key");
        int i6 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
        int i7 = hiHealthData.getInt("core_sleep_score_key");
        int i8 = hiHealthData.getInt("core_sleep_total_sleep_time_key");
        int i9 = hiHealthData.getInt("common_sleep_duration_sleep_sum_key");
        int i10 = hiHealthData.getInt("data_session_manual_sleep_bed_time_key");
        LogUtil.a("SleepDataModelInteractor", "deepSum is", Integer.valueOf(i), "shallowSum is", Integer.valueOf(i2), "coreWakeSum is", Integer.valueOf(i3), "wakeCount is", Integer.valueOf(i4), "dreamSum is", Integer.valueOf(i5), "noonSum is", Integer.valueOf(i6), "score is", Integer.valueOf(i7), "sleepTotalTime is", Integer.valueOf(i8), " manualBedTime is ", Integer.valueOf(i10));
        boolean z = i2 > 0 || i > 0 || i5 > 0;
        boolean z2 = i10 > 0;
        if (z || i6 > 0) {
            sleepTotalData = d(hiHealthData);
        } else if (i9 != 0) {
            b(sleepTotalData, hiHealthData);
        } else if (z2) {
            sleepTotalData = d(hiHealthData);
        }
        if (!z && i6 > 0 && i9 != 0) {
            sleepTotalData = new SleepTotalData();
            b(sleepTotalData, hiHealthData);
        }
        d(list3);
        int iE = e(list3);
        if (iE >= 0) {
            sleepTotalData.setManualFallTime(iE);
        } else {
            sleepTotalData.setManualFallTime(-1);
        }
        sleepTotalData.setAvgManualWakeTime(this.j);
        if (njy.e(list3)) {
            sleepTotalData.setTypeNum(-1);
        } else {
            sleepTotalData.setTypeNum(0);
        }
        list2.add(sleepTotalData);
    }

    private void b(SleepTotalData sleepTotalData, HiHealthData hiHealthData) {
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

    private void e(int i, long j, List<HiHealthData> list, List<SleepTotalData> list2, int[] iArr, List<HiHealthData> list3, List<HiHealthData> list4) {
        long j2 = j + k.b.l;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b(list, arrayList, arrayList2, j2, (String) null);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        b(list3, arrayList3, arrayList4, j2, "data_session_manual_sleep_get_up_time_key");
        ArrayList arrayList5 = new ArrayList(7);
        ArrayList arrayList6 = new ArrayList(7);
        b(list4, arrayList5, arrayList6, j2, "risingTime");
        List<List<HiHealthData>> listC = c(arrayList, arrayList3, arrayList5);
        List<List<HiHealthData>> listC2 = c(arrayList2, arrayList4, arrayList6);
        list2.addAll(a(i, j, iArr, listC));
        list2.addAll(a(i, j2, iArr, listC2));
    }

    private List<List<HiHealthData>> c(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(list);
        arrayList.add(list2);
        arrayList.add(list3);
        return arrayList;
    }

    private List<SleepTotalData> a(int i, long j, int[] iArr, List<List<HiHealthData>> list) {
        LogUtil.a("HiH_SleepDataModelInteractor", "sleepDatas:", list.toString());
        ArrayList arrayList = new ArrayList();
        int i2 = iArr[0];
        if (i2 == 14) {
            i2 /= 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            SleepTotalData sleepTotalData = new SleepTotalData();
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (njy.e(list.get(i4))) {
                    break;
                }
                Iterator<HiHealthData> it = list.get(i4).iterator();
                do {
                    if (!it.hasNext()) {
                        break;
                        break;
                    }
                } while (!d(sleepTotalData, it.next(), j, new int[]{iArr[0], iArr[1], i3, i}));
            }
            LogUtil.a("SleepDataModelInteractor", sleepTotalData);
            arrayList.add(sleepTotalData);
        }
        return arrayList;
    }

    private void b(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3, long j, String str) {
        long startTime;
        if (njy.e(list)) {
            LogUtil.j("HiH_SleepDataModelInteractor", "sumDataList is empty in matchDataList.");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (str == null) {
                startTime = hiHealthData.getStartTime() / 1000;
            } else {
                startTime = hiHealthData.getLong(str) / 1000;
            }
            if (startTime < j) {
                list2.add(hiHealthData);
            } else {
                list3.add(hiHealthData);
            }
        }
    }

    private void c(SleepTotalData sleepTotalData, HiHealthData hiHealthData, int[] iArr) {
        String timeZone = hiHealthData.getTimeZone();
        this.w = false;
        boolean zE = gwc.e(hiHealthData);
        int iRound = Math.round(hiHealthData.getFloat(zE ? "core_sleep_shallow_key_aasm" : "core_sleep_shallow_key"));
        int iRound2 = Math.round(hiHealthData.getFloat(zE ? "core_sleep_deep_key_aasm" : "core_sleep_deep_key"));
        int iRound3 = Math.round(hiHealthData.getFloat(zE ? "core_sleep_rem_key_aasm" : "core_sleep_wake_dream_key"));
        int iRound4 = Math.round(hiHealthData.getFloat("core_sleep_day_sleep_time_key"));
        int iRound5 = Math.round(hiHealthData.getFloat("core_sleep_wake_key"));
        int iRound6 = Math.round(hiHealthData.getFloat("data_session_manual_sleep_bed_time_key"));
        int i = hiHealthData.getInt("sleep_deep_key") / 60;
        int i2 = hiHealthData.getInt("sleep_shallow_key") / 60;
        int iRound7 = Math.round(hiHealthData.getFloat("sleep_device_category_key"));
        boolean z = iRound > 0 || iRound2 > 0 || iRound3 > 0;
        boolean z2 = iRound6 > 0;
        sleepTotalData.setDeivceCategory(iRound7);
        if (z || iRound4 > 0) {
            b(sleepTotalData, hiHealthData, timeZone, iRound, iRound2, iRound3, iRound4, iRound5, iRound7, iArr, true);
            return;
        }
        if (i + i2 > 0) {
            c(sleepTotalData, hiHealthData, timeZone);
        } else if (z2) {
            this.w = true;
            b(sleepTotalData, hiHealthData, timeZone, iRound, iRound2, iRound3, iRound4, iRound5, iRound7, iArr, false);
        } else {
            c(sleepTotalData, hiHealthData, timeZone);
        }
    }

    private void c(SleepTotalData sleepTotalData, HiHealthData hiHealthData, String str) {
        sleepTotalData.setIsCommon(true);
        sleepTotalData.setDeepSleepTime(hiHealthData.getInt("sleep_deep_key") / 60);
        sleepTotalData.setShallowSleepTime(hiHealthData.getInt("sleep_shallow_key") / 60);
        sleepTotalData.setTotalSleepTime(sleepTotalData.getDeepSleepTime() + sleepTotalData.getShallowSleepTime());
        sleepTotalData.setWakeupDuration(hiHealthData.getInt("sleep_wake_key") / 60);
        sleepTotalData.setWakeupTimes(hiHealthData.getInt("sleep_wake_count_key"));
        sleepTotalData.setType(30);
        sleepTotalData.setCommonFallTime(qqk.b(hiHealthData.getDouble("stat_sleep_start_time"), str, 1));
        sleepTotalData.setCommonWakeUpTime(qqk.b(hiHealthData.getDouble("stat_sleep_end_time"), str, 1));
        sleepTotalData.setSleepDayTime(hiHealthData.getStartTime());
    }

    private void b(SleepTotalData sleepTotalData, HiHealthData hiHealthData, String str, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, boolean z) {
        int i7 = iArr[0];
        if (i7 == 2 || i7 == 8) {
            d(sleepTotalData, hiHealthData, str, i, i2, i3, i4, i5, true);
            return;
        }
        if (qqk.a(i6)) {
            sleepTotalData.setIsPhone(true);
            sleepTotalData.setNoonSleepTime(i4);
            sleepTotalData.setType(31);
            sleepTotalData.setSleepDayTime(hiHealthData.getStartTime());
            sleepTotalData.setPhoneSuggestTotalSleepTime(Math.round(hiHealthData.getFloat("core_sleep_total_sleep_time_key")));
            long jC = qqk.c(hiHealthData.getStartTime(), str, -1);
            sleepTotalData.setPhoneSuggestFallTime(qqk.e(hiHealthData.getDouble("core_sleep_fall_key"), jC));
            sleepTotalData.setPhoneSuggestWakeTime(qqk.e(hiHealthData.getDouble("core_sleep_wake_up_key"), jC));
            sleepTotalData.setTotalSleepTime(Math.round(hiHealthData.getFloat("core_sleep_total_sleep_time_key")));
            sleepTotalData.setWakeupDuration(hiHealthData.getInt("core_sleep_wake_key"));
            sleepTotalData.setDeepSleepTime(hiHealthData.getInt("core_sleep_deep_key"));
            sleepTotalData.setShallowSleepTime(hiHealthData.getInt("core_sleep_shallow_key"));
            return;
        }
        if (!z || i6 == Integer.parseInt("001", 16)) {
            sleepTotalData.setIsManual(true);
            sleepTotalData.setManualBedTime(Math.round(hiHealthData.getFloat("data_session_manual_sleep_bed_time_key")));
            sleepTotalData.setManualOnTime(Math.round(hiHealthData.getFloat("core_sleep_total_sleep_time_key")));
            sleepTotalData.setTotalSleepTime(Math.round(hiHealthData.getFloat("core_sleep_total_sleep_time_key")));
            sleepTotalData.setType(31);
            sleepTotalData.setSleepDayTime(hiHealthData.getStartTime());
            return;
        }
        sleepTotalData.setIsCoreSleep(true);
        d(sleepTotalData, hiHealthData, str, i, i2, i3, i4, i5, false);
    }

    private void d(SleepTotalData sleepTotalData, HiHealthData hiHealthData, String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        sleepTotalData.setShallowSleepTime(i);
        sleepTotalData.setDeepSleepTime(i2);
        sleepTotalData.setSlumberSleepTime(i3);
        sleepTotalData.setWakeupDuration(i5);
        sleepTotalData.setWakeupTimes(hiHealthData.getInt("core_sleep_wake_count_key"));
        sleepTotalData.setScore(hiHealthData.getInt("core_sleep_score_key"));
        sleepTotalData.setSnoreFreq(hiHealthData.getInt("core_sleep_snore_freq_key"));
        sleepTotalData.setDeepSleepPart(hiHealthData.getInt("core_sleep_deep_sleep_part_key"));
        if (z) {
            sleepTotalData.setManualBedTime(Math.round(hiHealthData.getFloat("data_session_manual_sleep_bed_time_key")));
            sleepTotalData.setManualOnTime(Math.round(hiHealthData.getFloat("core_sleep_total_sleep_time_key")));
        }
        double d2 = hiHealthData.getDouble("core_sleep_fall_key");
        sleepTotalData.setFallTime(qqk.b(d2, str, 1));
        sleepTotalData.setCoreSleepFallTime((long) d2);
        if (d2 == 0.0d) {
            sleepTotalData.setFallTime(0);
            sleepTotalData.setCoreSleepFallTime(0L);
        }
        double d3 = hiHealthData.getDouble("core_sleep_wake_up_key");
        sleepTotalData.setCoreSleepWakeupTime((long) d3);
        sleepTotalData.setWakeUpTime(qqk.b(d3, str, 1));
        if (d3 == 0.0d) {
            sleepTotalData.setCoreSleepWakeupTime(0L);
            sleepTotalData.setWakeUpTime(0);
        }
        sleepTotalData.setTotalSleepTime(Math.round(hiHealthData.getFloat("core_sleep_total_sleep_time_key")));
        sleepTotalData.setNoonSleepTime(i4);
        sleepTotalData.setType(31);
        sleepTotalData.setSleepDayTime(hiHealthData.getStartTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SparseArray<List<HiHealthData>> sparseArray, List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback, int i, int i2, long j) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HiH_SleepDataModelInteractor", "setMonthYearSummary callback is null");
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.a("HiH_SleepDataModelInteractor", "setMonthYearSummary data = null ");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        List<HiHealthData> arrayList = new ArrayList<>(16);
        List<HiHealthData> arrayList2 = new ArrayList<>(16);
        if (sparseArray != null) {
            arrayList = a(sparseArray.get(0));
            arrayList2 = h(sparseArray.get(1));
        }
        LogUtil.a("HiH_SleepDataModelInteractor", "data.size() = ", Integer.valueOf(list.size()));
        ArrayList arrayList3 = new ArrayList(16);
        arrayList3.addAll(a(3, j, new int[]{i, i2}, c(list, arrayList, arrayList2)));
        LogUtil.a("HiH_SleepDataModelInteractor", "sleepTotalData.size() = ", Integer.valueOf(arrayList3.size()));
        iBaseResponseCallback.a(0, arrayList3);
    }

    private boolean d(SleepTotalData sleepTotalData, HiHealthData hiHealthData, long j, int[] iArr) {
        if (c(sleepTotalData, hiHealthData, j, iArr) != iArr[2]) {
            return false;
        }
        if (sleepTotalData.isDataValid()) {
            e(sleepTotalData, hiHealthData);
            return true;
        }
        c(sleepTotalData, hiHealthData, iArr);
        return true;
    }

    private int c(SleepTotalData sleepTotalData, HiHealthData hiHealthData, long j, int[] iArr) {
        long startTime;
        if (sleepTotalData.isManual()) {
            startTime = qqk.a(hiHealthData.getLong("data_session_manual_sleep_get_up_time_key"), hiHealthData.getTimeZone());
        } else if (sleepTotalData.isPhone()) {
            startTime = c(sleepTotalData, hiHealthData);
        } else {
            startTime = hiHealthData.getStartTime();
        }
        if (iArr[3] == 3) {
            return (int) ((((startTime / 1000) - j) / 60) / ((long) iArr[1]));
        }
        int iR = ltb.r(ltb.a(j));
        int iR2 = ltb.r(ltb.a(startTime / 1000));
        return iR2 < iR ? (iR2 + 12) - iR : iR2 - iR;
    }

    private long c(SleepTotalData sleepTotalData, HiHealthData hiHealthData) {
        if (sleepTotalData.getPhoneSuggestWakeTime() == 1440) {
            return qqk.a(hiHealthData.getLong("bedTime"), hiHealthData.getTimeZone());
        }
        return qqk.a(hiHealthData.getLong("risingTime"), hiHealthData.getTimeZone());
    }

    private void e(SleepTotalData sleepTotalData, HiHealthData hiHealthData) {
        if (sleepTotalData.isPhone() & hiHealthData.containsKey("bedTime")) {
            long jC = c(sleepTotalData, hiHealthData);
            sleepTotalData.setPhoneStartTime(qqk.e(sleepTotalData.getPhoneStartTime(), hiHealthData.getLong("bedTime"), 0));
            sleepTotalData.setPhoneGoBedTime(qqk.a(sleepTotalData.getPhoneGoBedTime(), qqk.b(hiHealthData.getLong("bedTime"), jC, hiHealthData.getTimeZone()), 0));
            sleepTotalData.setPhoneGetupTime(qqk.a(sleepTotalData.getPhoneGetupTime(), qqk.b(hiHealthData.getLong("risingTime"), jC, hiHealthData.getTimeZone()), 1));
            b(sleepTotalData);
            sleepTotalData.setPhoneSleepLatency(d(sleepTotalData, hiHealthData, false));
            return;
        }
        if (sleepTotalData.isManual() && hiHealthData.containsKey("data_session_manual_sleep_go_to_bed_time_key")) {
            sleepTotalData.setManualGoBedTime(qqk.e(sleepTotalData.getManualGoBedTime(), hiHealthData.getLong("data_session_manual_sleep_go_to_bed_time_key"), 0));
            sleepTotalData.setManualGetUpTime(qqk.e(sleepTotalData.getManualGetUpTime(), hiHealthData.getLong("data_session_manual_sleep_get_up_time_key"), 1));
            sleepTotalData.setManualFallTime(qqk.a(sleepTotalData.getManualFallTime(), qqk.b(hiHealthData.getLong("data_session_manual_sleep_sleep_time_key"), hiHealthData.getTimeZone(), 1), 0));
            sleepTotalData.setManualWakeUpTime(qqk.a(sleepTotalData.getManualWakeUpTime(), qqk.b(hiHealthData.getLong("data_session_manual_sleep_wake_time_key"), hiHealthData.getTimeZone(), 1), 1));
            sleepTotalData.setManualSleepLatency(d(sleepTotalData, hiHealthData, true));
        }
    }

    private void b(SleepTotalData sleepTotalData) {
        if (sleepTotalData.getPhoneSuggestFallTime() == 0) {
            sleepTotalData.setPhoneGoBedTime(0);
        }
        if (sleepTotalData.getPhoneSuggestWakeTime() == 1440) {
            sleepTotalData.setPhoneGetupTime(ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL);
        }
    }

    private int d(SleepTotalData sleepTotalData, HiHealthData hiHealthData, boolean z) {
        String timeZone = TextUtils.isEmpty(hiHealthData.getTimeZone()) ? "+8:00" : hiHealthData.getTimeZone();
        sleepTotalData.setTimeZone(timeZone);
        if (z) {
            return sleepTotalData.getManualFallTime() - qqk.b(sleepTotalData.getManualGoBedTime(), timeZone, 1);
        }
        return sleepTotalData.getPhoneSuggestFallTime() - sleepTotalData.getPhoneGoBedTime();
    }

    static class c implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBaseResponseCallback f43224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f43225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f43226c;
        private final long d;
        private final WeakReference<nku> e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        private c(nku nkuVar, IBaseResponseCallback iBaseResponseCallback, int[] iArr, long j, long j2) {
            this.e = new WeakReference<>(nkuVar);
            this.f43224a = iBaseResponseCallback;
            this.f43225b = iArr;
            this.d = j;
            this.f43226c = j2;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            WeakReference<nku> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.j("HiH_SleepDataModelInteractor", "SummaryHiAggregateListener mReference is null");
                return;
            }
            nku nkuVar = weakReference.get();
            if (nkuVar == null) {
                LogUtil.j("HiH_SleepDataModelInteractor", "SummaryHiAggregateListener interactor is null");
                return;
            }
            int[] iArr = this.f43225b;
            int i3 = iArr[2];
            if (i3 == 365) {
                nkuVar.d(nkuVar, list, this.f43224a, this.d, this.f43226c, i3, iArr[1]);
            } else {
                nkuVar.d(nkuVar, list, this.f43224a, iArr, this.d, this.f43226c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final nku nkuVar, final List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback, final int[] iArr, final long j, long j2) {
        HiDataFilter.DataFilterExpression dataFilterExpression;
        HiDataFilter.DataFilterExpression dataFilterExpression2;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        long j3 = j * 1000;
        hiAggregateOption.setStartTime(j3 - 259200000);
        hiAggregateOption.setEndTime(259200000 + j2);
        hiAggregateOption.setType(this.ab);
        hiAggregateOption.setConstantsKey(this.x);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        if (iArr != null && iArr.length >= 3 && iArr[2] > 1) {
            dataFilterExpression2 = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.BIGGER_EQUAL, j3);
            dataFilterExpression = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.LESS_EQUAL, j2);
        } else {
            long jE = ltb.e(new Date(j3));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(j3));
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 20, 0, 0);
            long jL = ltb.l(calendar.getTime());
            HiDataFilter.DataFilterExpression dataFilterExpression3 = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.BIGGER_EQUAL, jE * 1000);
            dataFilterExpression = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.LESS_EQUAL, jL * 1000);
            dataFilterExpression2 = dataFilterExpression3;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataFilterExpression2);
        arrayList.add(dataFilterExpression);
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).b(HiJsonUtil.d(new HiDataFilter(arrayList, Collections.singletonList(0)))).e((String) null).e();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(hiDataAggregateProOptionE);
        arrayList2.add(e(j, j2));
        HiHealthNativeApi.a(this.o).aggregateHiHealthDataProEx(arrayList2, new HiAggregateListenerEx() { // from class: nku.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                nkuVar.c(list, iBaseResponseCallback, iArr, j, sparseArray);
            }
        });
    }

    private HiDataAggregateProOption e(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j * 1000);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(f43207a);
        hiAggregateOption.setConstantsKey(f43209c);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        return new HiDataAggregateProOption.Builder().c(hiAggregateOption).e((String) null).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final nku nkuVar, final List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback, final long j, long j2, final int i, final int i2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setType(this.ab);
        hiAggregateOption.setConstantsKey(this.x);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        HiDataFilter.DataFilterExpression dataFilterExpression = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.BIGGER_EQUAL, 1000 * j);
        HiDataFilter.DataFilterExpression dataFilterExpression2 = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.LESS_EQUAL, j2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataFilterExpression);
        arrayList.add(dataFilterExpression2);
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).b(HiJsonUtil.d(new HiDataFilter(arrayList, Collections.singletonList(0)))).e((String) null).e();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(hiDataAggregateProOptionE);
        arrayList2.add(e(j, j2));
        HiHealthNativeApi.a(this.o).aggregateHiHealthDataProEx(arrayList2, new HiAggregateListenerEx() { // from class: nku.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i3, int i4) {
                nkuVar.c(sparseArray, (List<HiHealthData>) list, iBaseResponseCallback, i, i2, j);
            }
        });
    }

    private int e(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.a("HiH_SleepDataModelInteractor", "no manual sleep data");
            return -1;
        }
        Collections.sort(list, new Comparator<HiHealthData>() { // from class: nku.10
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                return (int) (hiHealthData.getLong("data_session_manual_sleep_go_to_bed_time_key") - hiHealthData2.getLong("data_session_manual_sleep_go_to_bed_time_key"));
            }
        });
        HiHealthData hiHealthData = list.get(0);
        String timeZone = TextUtils.isEmpty(hiHealthData.getTimeZone()) ? "+8:00" : hiHealthData.getTimeZone();
        int iB = qqk.b(hiHealthData.getLong("data_session_manual_sleep_go_to_bed_time_key"), timeZone, 1);
        int iB2 = qqk.b(hiHealthData.getLong("data_session_manual_sleep_sleep_time_key"), timeZone, 1);
        LogUtil.a("HiH_SleepDataModelInteractor", "first manual sleep part bedtime is ", Integer.valueOf(iB), " sleepTime is ", Integer.valueOf(iB2));
        return iB2 - iB;
    }

    private List<HiHealthData> a(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getLong("data_session_manual_sleep_sleep_time_key") != 0 || hiHealthData.getLong("data_session_manual_sleep_wake_time_key") != 0) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private SleepTotalData d(List<HiHealthData> list) {
        SleepTotalData sleepTotalData = new SleepTotalData();
        this.h = 0;
        this.i = 0;
        this.f = 0;
        this.j = 0;
        if (njy.e(list)) {
            LogUtil.a("HiH_SleepDataModelInteractor", "calculateManualAvg datas is empty!");
            return sleepTotalData;
        }
        List<HiHealthData> listA = a(list);
        List<HiHealthData> listB = b(listA, "data_session_manual_sleep_go_to_bed_time_key");
        List<HiHealthData> listB2 = b(listA, "data_session_manual_sleep_get_up_time_key");
        List<HiHealthData> listB3 = b(listA, "data_session_manual_sleep_sleep_time_key");
        List<HiHealthData> listB4 = b(listA, "data_session_manual_sleep_wake_time_key");
        if (!c(listB, listB2)) {
            a(0, 0, 0, 0, listB, listB2, true);
        } else {
            LogUtil.a("HiH_SleepDataModelInteractor", "all bed rising list empty!");
        }
        if (!c(listB3, listB4)) {
            a(0, 0, 0, 0, listB3, listB4, false);
        } else {
            LogUtil.a("HiH_SleepDataModelInteractor", "all sleep wake list empty!");
        }
        if (!njy.e(listB3) && !njy.e(listB)) {
            d(listB3, listB);
        } else {
            LogUtil.j("HiH_SleepDataModelInteractor", "all sleepTimeList&bedTimeList empty!");
        }
        sleepTotalData.setAvgManualBedTime(this.h);
        sleepTotalData.setAvgManualRisingTime(this.i);
        sleepTotalData.setAvgManualSleepTime(this.f);
        sleepTotalData.setAvgManualWakeTime(this.j);
        sleepTotalData.setDailyManualBedScore(this.n);
        sleepTotalData.setDailyManualRisingScore(this.ac);
        sleepTotalData.setAvgManualLatencyTime(this.g);
        return sleepTotalData;
    }

    private void d(List<HiHealthData> list, List<HiHealthData> list2) {
        if (list.size() == list2.size()) {
            int size = list.size();
            int iB = 0;
            int iB2 = 0;
            for (HiHealthData hiHealthData : list) {
                iB2 += qqk.b(hiHealthData.getStartTime(), hiHealthData.getTimeZone(), 1);
            }
            for (HiHealthData hiHealthData2 : list2) {
                iB += qqk.b(hiHealthData2.getStartTime(), hiHealthData2.getTimeZone(), 1);
            }
            int i = (iB2 - iB) / size;
            this.g = i;
            LogUtil.a("HiH_SleepDataModelInteractor", "getManualAvgLatency ", Integer.valueOf(i), " sumBedTime ", Integer.valueOf(iB), " sumSleepTime ", Integer.valueOf(iB2), " sleepTimeCnt ", Integer.valueOf(size));
            return;
        }
        ReleaseLogUtil.e("HiH_SleepDataModelInteractor", "size not equal, sleepTimeList size ", Integer.valueOf(list.size()), " bedTimeList size ", Integer.valueOf(list2.size()));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x0210  */
    /* JADX WARN: Code duplicated, block: B:64:0x0255  */
    /* JADX WARN: Code duplicated, block: B:68:0x026f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0272  */
    /* JADX WARN: Code duplicated, block: B:72:0x028e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0291  */
    private void a(int i, int i2, int i3, int i4, List<HiHealthData> list, List<HiHealthData> list2, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i17;
        int i18;
        int i19;
        int i20;
        d dVar;
        int i21;
        int i22;
        int i23;
        nku nkuVar = this;
        if (nkuVar.a(list, list2)) {
            d(i, i2, i3, i4, list, list2, z);
            return;
        }
        int i24 = 0;
        if (nkuVar.b(list, 0) >= nkuVar.b(list2, 0)) {
            int iB = qqk.b(list2.get(0).getStartTime(), list2.get(0).getTimeZone(), 1);
            list2.remove(0);
            i5 = i3 + iB;
            i6 = i4 + 1;
        } else {
            i5 = i3;
            i6 = i4;
        }
        if (njy.e(list) || njy.e(list2)) {
            d(i, i2, i5, i6, list, list2, z);
            return;
        }
        List<d> listC = nkuVar.c(list);
        List<d> listC2 = nkuVar.c(list2);
        if (listC2.size() > listC.size() || listC2.size() == 1 || listC.size() == 1) {
            d(i, i2, i5, i6, list, list2, z);
            return;
        }
        d dVar2 = nkuVar.new d();
        d dVar3 = nkuVar.new d();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i25 = i;
        int i26 = i2;
        d dVar4 = dVar2;
        int i27 = i5;
        int i28 = 0;
        int i29 = 0;
        d dVar5 = dVar3;
        int i30 = 0;
        while (i29 < listC2.size()) {
            ArrayList arrayList5 = arrayList3;
            ArrayList arrayList6 = arrayList4;
            long jD = nkuVar.d(listC, i29);
            int i31 = i24;
            long jD2 = nkuVar.d(listC2, i29);
            int i32 = i30;
            if (nkuVar.d(jD) >= 0) {
                i7 = i6;
                if (nkuVar.d(jD) < 6 && nkuVar.d(jD2) >= 0 && nkuVar.d(jD2) < 6) {
                    i9 = 1;
                }
                if (i29 == 0) {
                    arrayList2 = arrayList5;
                    dVar = listC.get(i29);
                    dVar5 = listC2.get(i29);
                    i10 = i9;
                    i11 = i29;
                    i15 = i26;
                    i23 = i31;
                    i30 = i32;
                    arrayList = arrayList6;
                    i6 = i7;
                } else {
                    if (i9 == 0 && i28 == i9) {
                        i12 = i25;
                        i13 = i32;
                        int i33 = i7;
                        i10 = i9;
                        int i34 = i29;
                        i15 = i26;
                        i16 = i27;
                        if (d(i9, dVar4, dVar5, jD, jD2)) {
                            int i35 = i31 + 1;
                            if (i34 == listC2.size() - 1) {
                                i11 = i34;
                                nkuVar = this;
                                int iB2 = qqk.b(nkuVar.d(listC, i13) * 1000, listC.get(i13).d.getTimeZone(), 1);
                                int i36 = i12 + iB2;
                                arrayList5.add(Integer.valueOf(iB2));
                                i18 = i33 + 1;
                                int iB3 = qqk.b(nkuVar.d(listC2, i35) * 1000, listC2.get(i35).d.getTimeZone(), 1);
                                arrayList6.add(Integer.valueOf(iB3));
                                i15++;
                                arrayList = arrayList6;
                                i27 = iB3 + i16;
                                arrayList2 = arrayList5;
                                i25 = i36;
                                i20 = i35;
                                i19 = i13;
                            } else {
                                i11 = i34;
                                i18 = i33;
                                nkuVar = this;
                                arrayList2 = arrayList5;
                                arrayList = arrayList6;
                                i20 = i35;
                                i27 = i16;
                                i19 = i13;
                                i25 = i12;
                            }
                        } else {
                            i11 = i34;
                            i14 = i33;
                            nkuVar = this;
                        }
                        dVar = listC.get(i11);
                        d dVar6 = listC2.get(i11);
                        if (i15 != 0) {
                            i21 = i25 / i15;
                        } else {
                            i21 = 0;
                        }
                        int i37 = i20;
                        int i38 = i19;
                        health.compact.a.util.LogUtil.a("debug1", " now i is, ", Integer.valueOf(i11), "avgBedTime is", Integer.valueOf(i21));
                        if (i18 != 0) {
                            i22 = i27 / i18;
                        } else {
                            i22 = 0;
                        }
                        health.compact.a.util.LogUtil.a("debug1", " now i is, ", Integer.valueOf(i11), "avgRisingTime is", Integer.valueOf(i22));
                        i23 = i37;
                        i30 = i38;
                        i6 = i18;
                        dVar5 = dVar6;
                    } else {
                        i10 = i9;
                        i11 = i29;
                        i12 = i25;
                        i13 = i32;
                        i14 = i7;
                        i15 = i26;
                        i16 = i27;
                    }
                    int iB4 = qqk.b(nkuVar.d(listC, i13) * 1000, listC.get(i13).d.getTimeZone(), 1);
                    i25 = i12 + iB4;
                    arrayList5.add(Integer.valueOf(iB4));
                    int iB5 = qqk.b(nkuVar.d(listC2, i31) * 1000, listC2.get(i31).d.getTimeZone(), 1);
                    arrayList = arrayList6;
                    arrayList.add(Integer.valueOf(iB5));
                    i27 = i16 + iB5;
                    if (i11 == listC2.size() - 1) {
                        int iB6 = qqk.b(jD * 1000, listC.get(i11).d.getTimeZone(), 1);
                        i25 += iB6;
                        arrayList2 = arrayList5;
                        arrayList2.add(Integer.valueOf(iB6));
                        i18 = i14 + 2;
                        int iB7 = qqk.b(jD2 * 1000, listC.get(i11).d.getTimeZone(), 1);
                        i27 += iB7;
                        arrayList.add(Integer.valueOf(iB7));
                        i17 = i15 + 2;
                    } else {
                        arrayList2 = arrayList5;
                        i17 = i15 + 1;
                        i18 = i14 + 1;
                    }
                    i19 = i11;
                    i15 = i17;
                    i20 = i19;
                    dVar = listC.get(i11);
                    d dVar7 = listC2.get(i11);
                    if (i15 != 0) {
                        i21 = i25 / i15;
                    } else {
                        i21 = 0;
                    }
                    int i39 = i20;
                    int i310 = i19;
                    health.compact.a.util.LogUtil.a("debug1", " now i is, ", Integer.valueOf(i11), "avgBedTime is", Integer.valueOf(i21));
                    if (i18 != 0) {
                        i22 = i27 / i18;
                    } else {
                        i22 = 0;
                    }
                    health.compact.a.util.LogUtil.a("debug1", " now i is, ", Integer.valueOf(i11), "avgRisingTime is", Integer.valueOf(i22));
                    i23 = i39;
                    i30 = i310;
                    i6 = i18;
                    dVar5 = dVar7;
                }
                arrayList4 = arrayList;
                i26 = i15;
                arrayList3 = arrayList2;
                dVar4 = dVar;
                i24 = i23;
                i29 = i11 + 1;
                i28 = i10;
            } else {
                i7 = i6;
            }
            if (nkuVar.d(jD) >= 22 || nkuVar.d(jD) < 8) {
                i8 = 2;
            } else {
                if (nkuVar.d(jD) < 8 || nkuVar.d(jD) >= 22) {
                    i9 = 0;
                } else {
                    i8 = 3;
                }
                if (i29 == 0) {
                    arrayList2 = arrayList5;
                    dVar = listC.get(i29);
                    dVar5 = listC2.get(i29);
                    i10 = i9;
                    i11 = i29;
                    i15 = i26;
                    i23 = i31;
                    i30 = i32;
                    arrayList = arrayList6;
                    i6 = i7;
                } else {
                    if (i9 == 0) {
                        i10 = i9;
                        i11 = i29;
                        i12 = i25;
                        i13 = i32;
                        i14 = i7;
                        i15 = i26;
                        i16 = i27;
                        int iB8 = qqk.b(nkuVar.d(listC, i13) * 1000, listC.get(i13).d.getTimeZone(), 1);
                        i25 = i12 + iB8;
                        arrayList5.add(Integer.valueOf(iB8));
                        int iB9 = qqk.b(nkuVar.d(listC2, i31) * 1000, listC2.get(i31).d.getTimeZone(), 1);
                        arrayList = arrayList6;
                        arrayList.add(Integer.valueOf(iB9));
                        i27 = i16 + iB9;
                        if (i11 == listC2.size() - 1) {
                            int iB10 = qqk.b(jD * 1000, listC.get(i11).d.getTimeZone(), 1);
                            i25 += iB10;
                            arrayList2 = arrayList5;
                            arrayList2.add(Integer.valueOf(iB10));
                            i18 = i14 + 2;
                            int iB11 = qqk.b(jD2 * 1000, listC.get(i11).d.getTimeZone(), 1);
                            i27 += iB11;
                            arrayList.add(Integer.valueOf(iB11));
                            i17 = i15 + 2;
                        } else {
                            arrayList2 = arrayList5;
                            i17 = i15 + 1;
                            i18 = i14 + 1;
                        }
                        i19 = i11;
                        i15 = i17;
                        i20 = i19;
                    } else {
                        i10 = i9;
                        i11 = i29;
                        i12 = i25;
                        i13 = i32;
                        i14 = i7;
                        i15 = i26;
                        i16 = i27;
                        int iB12 = qqk.b(nkuVar.d(listC, i13) * 1000, listC.get(i13).d.getTimeZone(), 1);
                        i25 = i12 + iB12;
                        arrayList5.add(Integer.valueOf(iB12));
                        int iB13 = qqk.b(nkuVar.d(listC2, i31) * 1000, listC2.get(i31).d.getTimeZone(), 1);
                        arrayList = arrayList6;
                        arrayList.add(Integer.valueOf(iB13));
                        i27 = i16 + iB13;
                        if (i11 == listC2.size() - 1) {
                            int iB14 = qqk.b(jD * 1000, listC.get(i11).d.getTimeZone(), 1);
                            i25 += iB14;
                            arrayList2 = arrayList5;
                            arrayList2.add(Integer.valueOf(iB14));
                            i18 = i14 + 2;
                            int iB15 = qqk.b(jD2 * 1000, listC.get(i11).d.getTimeZone(), 1);
                            i27 += iB15;
                            arrayList.add(Integer.valueOf(iB15));
                            i17 = i15 + 2;
                        } else {
                            arrayList2 = arrayList5;
                            i17 = i15 + 1;
                            i18 = i14 + 1;
                        }
                        i19 = i11;
                        i15 = i17;
                        i20 = i19;
                    }
                    dVar = listC.get(i11);
                    d dVar8 = listC2.get(i11);
                    if (i15 != 0) {
                        i21 = i25 / i15;
                    } else {
                        i21 = 0;
                    }
                    int i311 = i20;
                    int i312 = i19;
                    health.compact.a.util.LogUtil.a("debug1", " now i is, ", Integer.valueOf(i11), "avgBedTime is", Integer.valueOf(i21));
                    if (i18 != 0) {
                        i22 = i27 / i18;
                    } else {
                        i22 = 0;
                    }
                    health.compact.a.util.LogUtil.a("debug1", " now i is, ", Integer.valueOf(i11), "avgRisingTime is", Integer.valueOf(i22));
                    i23 = i311;
                    i30 = i312;
                    i6 = i18;
                    dVar5 = dVar8;
                }
                arrayList4 = arrayList;
                i26 = i15;
                arrayList3 = arrayList2;
                dVar4 = dVar;
                i24 = i23;
                i29 = i11 + 1;
                i28 = i10;
            }
            i9 = i8;
            if (i29 == 0) {
                arrayList2 = arrayList5;
                dVar = listC.get(i29);
                dVar5 = listC2.get(i29);
                i10 = i9;
                i11 = i29;
                i15 = i26;
                i23 = i31;
                i30 = i32;
                arrayList = arrayList6;
                i6 = i7;
            } else {
                if (i9 == 0) {
                    i10 = i9;
                    i11 = i29;
                    i12 = i25;
                    i13 = i32;
                    i14 = i7;
                    i15 = i26;
                    i16 = i27;
                    int iB16 = qqk.b(nkuVar.d(listC, i13) * 1000, listC.get(i13).d.getTimeZone(), 1);
                    i25 = i12 + iB16;
                    arrayList5.add(Integer.valueOf(iB16));
                    int iB17 = qqk.b(nkuVar.d(listC2, i31) * 1000, listC2.get(i31).d.getTimeZone(), 1);
                    arrayList = arrayList6;
                    arrayList.add(Integer.valueOf(iB17));
                    i27 = i16 + iB17;
                    if (i11 == listC2.size() - 1) {
                        int iB18 = qqk.b(jD * 1000, listC.get(i11).d.getTimeZone(), 1);
                        i25 += iB18;
                        arrayList2 = arrayList5;
                        arrayList2.add(Integer.valueOf(iB18));
                        i18 = i14 + 2;
                        int iB19 = qqk.b(jD2 * 1000, listC.get(i11).d.getTimeZone(), 1);
                        i27 += iB19;
                        arrayList.add(Integer.valueOf(iB19));
                        i17 = i15 + 2;
                    } else {
                        arrayList2 = arrayList5;
                        i17 = i15 + 1;
                        i18 = i14 + 1;
                    }
                    i19 = i11;
                    i15 = i17;
                    i20 = i19;
                } else {
                    i10 = i9;
                    i11 = i29;
                    i12 = i25;
                    i13 = i32;
                    i14 = i7;
                    i15 = i26;
                    i16 = i27;
                    int iB110 = qqk.b(nkuVar.d(listC, i13) * 1000, listC.get(i13).d.getTimeZone(), 1);
                    i25 = i12 + iB110;
                    arrayList5.add(Integer.valueOf(iB110));
                    int iB111 = qqk.b(nkuVar.d(listC2, i31) * 1000, listC2.get(i31).d.getTimeZone(), 1);
                    arrayList = arrayList6;
                    arrayList.add(Integer.valueOf(iB111));
                    i27 = i16 + iB111;
                    if (i11 == listC2.size() - 1) {
                        int iB112 = qqk.b(jD * 1000, listC.get(i11).d.getTimeZone(), 1);
                        i25 += iB112;
                        arrayList2 = arrayList5;
                        arrayList2.add(Integer.valueOf(iB112));
                        i18 = i14 + 2;
                        int iB113 = qqk.b(jD2 * 1000, listC.get(i11).d.getTimeZone(), 1);
                        i27 += iB113;
                        arrayList.add(Integer.valueOf(iB113));
                        i17 = i15 + 2;
                    } else {
                        arrayList2 = arrayList5;
                        i17 = i15 + 1;
                        i18 = i14 + 1;
                    }
                    i19 = i11;
                    i15 = i17;
                    i20 = i19;
                }
                dVar = listC.get(i11);
                d dVar9 = listC2.get(i11);
                if (i15 != 0) {
                    i21 = i25 / i15;
                } else {
                    i21 = 0;
                }
                int i313 = i20;
                int i314 = i19;
                health.compact.a.util.LogUtil.a("debug1", " now i is, ", Integer.valueOf(i11), "avgBedTime is", Integer.valueOf(i21));
                if (i18 != 0) {
                    i22 = i27 / i18;
                } else {
                    i22 = 0;
                }
                health.compact.a.util.LogUtil.a("debug1", " now i is, ", Integer.valueOf(i11), "avgRisingTime is", Integer.valueOf(i22));
                i23 = i313;
                i30 = i314;
                i6 = i18;
                dVar5 = dVar9;
            }
            arrayList4 = arrayList;
            i26 = i15;
            arrayList3 = arrayList2;
            dVar4 = dVar;
            i24 = i23;
            i29 = i11 + 1;
            i28 = i10;
        }
        ArrayList arrayList7 = arrayList3;
        int i40 = i25;
        int i41 = i26;
        ArrayList arrayList8 = arrayList4;
        int i42 = i27;
        if (z) {
            nkuVar.h = Math.round(i40 / i41);
            nkuVar.i = Math.round(i42 / i6);
            Iterator it = arrayList7.iterator();
            int i43 = 0;
            int i44 = 0;
            while (it.hasNext()) {
                i44++;
                int iIntValue = ((Integer) it.next()).intValue() - nkuVar.h;
                i43 += iIntValue * iIntValue;
            }
            nkuVar.n = Math.round(i43 / i44);
            Iterator it2 = arrayList8.iterator();
            int i45 = 0;
            int i46 = 0;
            while (it2.hasNext()) {
                i45++;
                int iIntValue2 = ((Integer) it2.next()).intValue() - nkuVar.i;
                i46 += iIntValue2 * iIntValue2;
            }
            nkuVar.ac = Math.round(i46 / i45);
            return;
        }
        nkuVar.f = Math.round(i40 / i41);
        nkuVar.j = Math.round(i42 / i6);
    }

    private void d(int i, int i2, int i3, int i4, List<HiHealthData> list, List<HiHealthData> list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getStartTime() != 0) {
                int iB = qqk.b(hiHealthData.getStartTime(), hiHealthData.getTimeZone(), 1);
                i += iB;
                i2++;
                arrayList.add(Integer.valueOf(iB));
            }
        }
        int i5 = 0;
        if (z) {
            this.h = Math.round(i / i2);
            Iterator it = arrayList.iterator();
            int i6 = 0;
            int i7 = 0;
            while (it.hasNext()) {
                i7++;
                int iIntValue = ((Integer) it.next()).intValue() - this.h;
                i6 += iIntValue * iIntValue;
            }
            this.n = Math.round(i6 / i7);
        } else {
            this.f = Math.round(i / i2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (HiHealthData hiHealthData2 : list2) {
            if (hiHealthData2.getStartTime() != 0) {
                int iB2 = qqk.b(hiHealthData2.getStartTime(), hiHealthData2.getTimeZone(), 1);
                i3 += iB2;
                i4++;
                arrayList2.add(Integer.valueOf(iB2));
            }
        }
        if (z) {
            this.i = Math.round(i3 / i4);
            Iterator it2 = arrayList2.iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                i8++;
                int iIntValue2 = ((Integer) it2.next()).intValue() - this.i;
                i5 += iIntValue2 * iIntValue2;
            }
            this.ac = Math.round(i5 / i8);
            return;
        }
        this.j = Math.round(i3 / i4);
    }

    private List<HiHealthData> b(List<HiHealthData> list, String str) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (HiHealthData hiHealthData : list) {
                long j = hiHealthData.getLong(str);
                if (j != 0) {
                    HiHealthData hiHealthData2 = new HiHealthData();
                    hiHealthData2.setStartTime(j);
                    hiHealthData2.setTimeZone(TextUtils.isEmpty(hiHealthData.getTimeZone()) ? "+8:00" : hiHealthData.getTimeZone());
                    arrayList.add(hiHealthData2);
                    Collections.sort(arrayList, new Comparator<HiHealthData>() { // from class: nku.9
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(HiHealthData hiHealthData3, HiHealthData hiHealthData4) {
                            return (int) (hiHealthData3.getStartTime() - hiHealthData4.getStartTime());
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    private boolean d(int i, d dVar, d dVar2, long j, long j2) {
        if (j2 - dVar.d.getStartTime() > 72000) {
            return false;
        }
        if (i == 2 && j - (dVar2.d.getStartTime() / 1000) < 7200) {
            return true;
        }
        if (i != 3 || j - (dVar2.d.getStartTime() / 1000) >= 1800) {
            return i == 1 && e(dVar2.d.getStartTime() / 1000) == e(j);
        }
        return true;
    }

    private int d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.get(11);
    }

    private int e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.get(5);
    }

    private List<d> c(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new d(it.next(), false));
        }
        return arrayList;
    }

    private long b(List<HiHealthData> list, int i) {
        return list.get(i).getStartTime() / 1000;
    }

    private long d(List<d> list, int i) {
        return list.get(i).d.getStartTime() / 1000;
    }

    private boolean a(List<HiHealthData> list, List<HiHealthData> list2) {
        return Math.abs(list.size() - list2.size()) >= 2;
    }

    private boolean c(List<HiHealthData> list, List<HiHealthData> list2) {
        return njy.e(list) && njy.e(list2);
    }

    class d {
        private HiHealthData d;
        private boolean e;

        public d(HiHealthData hiHealthData, boolean z) {
            this.d = hiHealthData;
            this.e = z;
        }

        public d() {
        }
    }
}
