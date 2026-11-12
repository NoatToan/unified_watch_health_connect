package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes13.dex */
public class ovn extends BaseCalculator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f44869c = {0, 730000, 2190000, 3650000, 5840000};
    private PluginAchieveAdapter d = getPluginAchieveAdapter();
    private Context e = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        c(i);
        b(i);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        e(i, countDownLatch, arrayList);
        e(i - 1, countDownLatch, arrayList2);
        try {
            LogUtil.a("PLGACHIEVE_InitialDataCalculator", "compute.await(): " + countDownLatch.await(8000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_InitialDataCalculator", "compute.await(): catch a InterruptedException");
        }
        c(i, arrayList);
        e(i, arrayList, arrayList2);
    }

    public void e(int i, final CountDownLatch countDownLatch, final TreeMap<String, Long> treeMap) {
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        nkb.d().a(jA, jA2, 5, new IBaseResponseCallback() { // from class: ovk
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.e.a(treeMap, countDownLatch, i2, obj);
            }
        });
        d(jA, jA2, treeMap, countDownLatch);
    }

    /* synthetic */ void a(TreeMap treeMap, CountDownLatch countDownLatch, int i, Object obj) {
        e(false, obj, (TreeMap<String, Long>) treeMap);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, Object obj, TreeMap<String, Long> treeMap) {
        synchronized (this) {
            if (obj instanceof List) {
                List<HiHealthData> list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.a("PLGACHIEVE_InitialDataCalculator", "generateSportDurationData: data is empty");
                    return;
                }
                for (HiHealthData hiHealthData : list) {
                    String strJ = HiDateUtil.j(hiHealthData.getStartTime());
                    long j = hiHealthData.getLong("Track_Duration_Sum");
                    if (!z) {
                        j -= hiHealthData.getLong("Track_Diving_Time_Sum");
                    }
                    if (treeMap.containsKey(strJ)) {
                        treeMap.put(strJ, Long.valueOf(treeMap.get(strJ).longValue() + j));
                    } else {
                        treeMap.put(strJ, Long.valueOf(j));
                    }
                }
            }
        }
    }

    private void d(long j, long j2, final TreeMap<String, Long> treeMap, final CountDownLatch countDownLatch) {
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setTimeRange(j, j2);
        hiSportStatDataAggregateOption.setType(new int[]{42254});
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Track_Duration_Sum"});
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setGroupUnitType(5);
        HiHealthNativeApi.a(this.e).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener() { // from class: ovn.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                ovn.this.e(true, (Object) list, (TreeMap<String, Long>) treeMap);
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                countDownLatch.countDown();
            }
        });
    }

    public void e(int i, final TreeMap<String, Long> treeMap, List<AnnualReportFitnessRaw> list) {
        if (i >= 2025) {
            if (treeMap.isEmpty() && njy.e(list)) {
                return;
            }
            if (!njy.e(list)) {
                list.forEach(new Consumer() { // from class: ovm
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ovn.a(treeMap, (AnnualReportFitnessRaw) obj);
                    }
                });
            }
            e(i, treeMap);
        }
    }

    static /* synthetic */ void a(TreeMap treeMap, AnnualReportFitnessRaw annualReportFitnessRaw) {
        String strJ = HiDateUtil.j(annualReportFitnessRaw.acquireExerciseTime());
        if (treeMap.containsKey(strJ)) {
            treeMap.put(strJ, Long.valueOf(((Long) treeMap.get(strJ)).longValue() + ((long) annualReportFitnessRaw.acquireDuring())));
        } else {
            treeMap.put(strJ, Long.valueOf(annualReportFitnessRaw.acquireDuring()));
        }
    }

    private void e(int i, TreeMap<String, Long> treeMap) {
        if (treeMap == null || treeMap.isEmpty()) {
            return;
        }
        insertData(i, EnumAnnualType.REPORT_INITAL.value(), 9011, HiJsonUtil.d(treeMap));
        ArrayList arrayList = new ArrayList();
        long jLongValue = 0;
        for (Map.Entry<String, Long> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && value.longValue() > 0) {
                if (value.longValue() == jLongValue) {
                    arrayList.add(key);
                } else if (value.longValue() > jLongValue) {
                    jLongValue = value.longValue();
                    arrayList.clear();
                    arrayList.add(key);
                }
            }
        }
        insertData(i, EnumAnnualType.REPORT_INITAL.value(), 9012, HiJsonUtil.d(arrayList));
    }

    public void a(int i) {
        c(i);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList(16);
        e(i, countDownLatch, arrayList);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_InitialDataCalculator", "compute2019.await(): catch a InterruptedException");
        }
        c(i, arrayList);
    }

    private void e(int i, List<HiHealthData> list, List<HiHealthData> list2) {
        long jC = oxi.c(e(list), e(list2), 100000);
        int iE = oxi.e(d(list), d(list2), 5000);
        int iE2 = oxi.e(c(list), c(list2), 10000);
        insertData(i, EnumAnnualType.REPORT_INITAL.value(), 9010, String.valueOf(jC));
        insertData(i, EnumAnnualType.REPORT_INITAL.value(), 9009, String.valueOf(iE));
        insertData(i, EnumAnnualType.REPORT_STEP.value(), IEventListener.EVENT_ID_DEVICE_SCAN_FINISH, String.valueOf(iE2));
    }

    private int c(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_InitialDataCalculator", "getTotalStep is empty, return");
            return 0;
        }
        return list.get(0).getInt("totalStep");
    }

    private int d(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_InitialDataCalculator", "getTotalDistance is empty, return");
            return 0;
        }
        return list.get(0).getInt(BleConstants.TOTAL_DISTANCE);
    }

    private long e(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_InitialDataCalculator", "getTotalCalorie is empty, return");
            return 0L;
        }
        return list.get(0).getLong("totalCalorie");
    }

    private void c(int i) {
        osf osfVarB = otl.b(BaseApplication.getContext()).b(1, new HashMap(2));
        if (!(osfVarB instanceof TotalRecord)) {
            LogUtil.j("PLGACHIEVE_InitialDataCalculator", "computeInitialDataByYear totalRecord invalid");
            return;
        }
        TotalRecord totalRecord = (TotalRecord) osfVarB;
        int days = totalRecord.getDays();
        long startDate = totalRecord.getStartDate();
        insertData(i, EnumAnnualType.REPORT_INITAL.value(), 9002, String.valueOf(days));
        insertData(i, EnumAnnualType.REPORT_INITAL.value(), 9001, String.valueOf(startDate));
    }

    private void b(int i) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList(16);
        owx.e(BaseApplication.getContext(), i, countDownLatch, arrayList);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_InitialDataCalculator", "compute.await(): catch a InterruptedException");
        }
        a(i, oru.a(BaseApplication.getContext()).getAdapter(), arrayList);
    }

    private void a(final int i, PluginAchieveAdapter pluginAchieveAdapter, final List<HiHealthData> list) {
        pluginAchieveAdapter.getSumYearData(BaseApplication.getContext(), oxi.a(i, true), oxi.a(i, false), 23, new AchieveCallback() { // from class: ovn.3
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                int iD = owx.d(obj, (List<HiHealthData>) list);
                LogUtil.a("PLGACHIEVE_InitialDataCalculator", "computeCurrentYearDays currentUseDays = ", Integer.valueOf(iD));
                ovn.this.insertData(i, EnumAnnualType.REPORT_INITAL.value(), 10015, String.valueOf(iD));
            }
        });
    }

    private void e(int i, final CountDownLatch countDownLatch, final List<HiHealthData> list) {
        this.d.getSumYearData(this.e, oxi.a(i, true), oxi.a(i, false), 16, new AchieveCallback() { // from class: ovn.1
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    list.addAll((List) obj);
                } else {
                    LogUtil.j("PLGACHIEVE_InitialDataCalculator", "getSumYearData data is not correct");
                }
                LogUtil.a("PLGACHIEVE_InitialDataCalculator", "getSumYearData success");
                countDownLatch.countDown();
            }
        });
    }

    private <T> void c(int i, T t) {
        if (t == null) {
            LogUtil.j("PLGACHIEVE_InitialDataCalculator", "saveAnnualSumData obj is null,return");
            return;
        }
        try {
            List list = (List) t;
            if (njy.e(list)) {
                LogUtil.j("PLGACHIEVE_InitialDataCalculator", "saveAnnualSumData dataInfoList is empty, return");
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            int i2 = hiHealthData.getInt("totalStep");
            long j = hiHealthData.getLong("totalCalorie");
            int i3 = hiHealthData.getInt(BleConstants.TOTAL_DISTANCE);
            insertData(i, EnumAnnualType.REPORT_SUMARY.value(), 6005, String.valueOf(j));
            if (i <= 2019) {
                insertData(i, EnumAnnualType.REPORT_SUMARY.value(), 6003, String.valueOf(i3));
            } else {
                insertData(i, EnumAnnualType.REPORT_SUMARY.value(), 9003, String.valueOf(i3));
            }
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 3001, String.valueOf(i2));
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 3002, String.valueOf(owx.b(i2)));
            insertData(i, EnumAnnualType.REPORT_INITAL.value(), 9003, String.valueOf(i3));
            insertData(i, EnumAnnualType.REPORT_INITAL.value(), 6005, String.valueOf(j));
            e(i2);
        } catch (ClassCastException unused) {
            LogUtil.e("PLGACHIEVE_InitialDataCalculator", "getWeightData data ClassCastException");
        }
    }

    private void e(int i) {
        addStarData("stepStar", oxi.b(i, f44869c));
    }
}
