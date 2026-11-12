package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes19.dex */
public class wcj extends BaseOperate {
    private final int[] d = {2018};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f51854a = {DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_ABNORMAL.value()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f51855c = {BleConstants.BLOODPRESSURE_SYSTOLIC, BleConstants.BLOODPRESSURE_DIASTOLIC, BleConstants.BLOODPRESSURE_SPHYGMUS, "measureAbnormal"};

    public wcj() {
        this.pageType = 107;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readGroupDataBySource */
    public void m1750xdec3f9b0(final vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        b(vzoVar, new DataSourceCallback() { // from class: wcn
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51867a.a(dataSourceCallback, vzoVar, i, (List) obj);
            }
        });
    }

    /* synthetic */ void a(final DataSourceCallback dataSourceCallback, vzo vzoVar, final int i, List list) {
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wcm
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        } else {
            final List<whz> listGroupByMonth = groupByMonth(convertToDataModels(list, vzoVar));
            this.mHandler.post(new Runnable() { // from class: wcl
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, listGroupByMonth);
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDoubleGroupDataNoSource */
    public void m1748x5b1923e2(final vzo vzoVar, final DataSourceCallback<List<whr>> dataSourceCallback) {
        b(vzoVar, new DataSourceCallback() { // from class: wcy
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51888c.d(dataSourceCallback, vzoVar, i, (List) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ void d(final DataSourceCallback dataSourceCallback, vzo vzoVar, final int i, List list) {
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wcr
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        if (vzoVar.b("Subpage") == 2) {
            list = e((List<HiHealthData>) list);
        }
        a(list);
        final List<whz> listGroupByDay = groupByDay(convertToDataModels(list, vzoVar));
        this.mHandler.post(new Runnable() { // from class: wcs
            @Override // java.lang.Runnable
            public final void run() {
                this.f51875b.c(dataSourceCallback, i, listGroupByDay);
            }
        });
    }

    /* synthetic */ void c(DataSourceCallback dataSourceCallback, int i, List list) {
        dataSourceCallback.onResponse(i, doubleGroupSort(list));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readCateDouGroupDataNoSource */
    public void m1743x17777686(final vzo vzoVar, final DataSourceCallback<Map<Integer, List<whr>>> dataSourceCallback) {
        b(vzoVar, new DataSourceCallback() { // from class: wct
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51877b.c(dataSourceCallback, vzoVar, i, (List) obj);
            }
        });
    }

    /* synthetic */ void c(final DataSourceCallback dataSourceCallback, final vzo vzoVar, final int i, final List list) {
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wcq
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new HashMap());
                }
            });
        } else {
            this.mHandler.post(new Runnable() { // from class: wcu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51879a.c(dataSourceCallback, list, vzoVar);
                }
            });
        }
    }

    /* synthetic */ void c(DataSourceCallback dataSourceCallback, List list, vzo vzoVar) {
        dataSourceCallback.onResponse(0, a((List<HiHealthData>) list, vzoVar));
    }

    private void b(vzo vzoVar, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        final ArrayList arrayList = new ArrayList(10);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ReleaseLogUtil.d("R_BloodPressureOperateImp", "readData readHeartRateData start");
        d(vzoVar, new DataSourceCallback() { // from class: wcp
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                wcj.e(arrayList, countDownLatch, i, (List) obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            ReleaseLogUtil.d("R_BloodPressureOperateImp", "readData latch await exception");
        }
        ReleaseLogUtil.d("R_BloodPressureOperateImp", "readData readBloodPressureData start");
        e(vzoVar, new DataSourceCallback() { // from class: wco
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.e.d(dataSourceCallback, arrayList, i, (List) obj);
            }
        });
    }

    static /* synthetic */ void e(List list, CountDownLatch countDownLatch, int i, List list2) {
        ReleaseLogUtil.d("R_BloodPressureOperateImp", "readData readHeartRateData end", ", resultCode = ", Integer.valueOf(i));
        if (i == 0 && njy.b(list2)) {
            list.addAll(list2);
        }
        countDownLatch.countDown();
    }

    /* synthetic */ void d(DataSourceCallback dataSourceCallback, List list, int i, List list2) {
        ReleaseLogUtil.d("R_BloodPressureOperateImp", "readData readBloodPressureData end", ", resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list2)) {
            dataSourceCallback.onResponse(i, new ArrayList());
        } else {
            dataSourceCallback.onResponse(i, e((List<HiHealthData>) list2, (List<HiHealthData>) list));
        }
    }

    private void e(vzo vzoVar, DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        ArrayList arrayList = new ArrayList(10);
        HiAggregateOption hiAggregateOptionC = wgu.c(vzoVar, this.f51854a, this.f51855c, 1, 0);
        hiAggregateOptionC.setCount(500);
        HiDataAggregateProOption hiDataAggregateProOptionC = wgu.c(hiAggregateOptionC, vzoVar.f());
        aggregateHiHealthDataPro(hiDataAggregateProOptionC, new AnonymousClass2(dataSourceCallback, arrayList, hiAggregateOptionC, hiDataAggregateProOptionC));
    }

    /* JADX INFO: renamed from: wcj$2, reason: invalid class name */
    class AnonymousClass2 implements DataSourceCallback<List<HiHealthData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HiAggregateOption f51856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DataSourceCallback f51857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f51858c;
        final /* synthetic */ HiDataAggregateProOption e;

        AnonymousClass2(DataSourceCallback dataSourceCallback, List list, HiAggregateOption hiAggregateOption, HiDataAggregateProOption hiDataAggregateProOption) {
            this.f51857b = dataSourceCallback;
            this.f51858c = list;
            this.f51856a = hiAggregateOption;
            this.e = hiDataAggregateProOption;
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<HiHealthData> list) {
            if (i != 0) {
                this.f51857b.onResponse(i, new ArrayList());
            } else {
                if (njy.e(list)) {
                    this.f51857b.onResponse(i, this.f51858c);
                    return;
                }
                this.f51858c.addAll(list);
                this.f51856a.setEndTime(list.get(list.size() - 1).getStartTime() - 1);
                wcj.this.aggregateHiHealthDataPro(this.e, new DataSourceCallback() { // from class: wcz
                    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                    public final void onResponse(int i2, Object obj) {
                        this.e.onResponse(i2, (List) obj);
                    }
                });
            }
        }
    }

    private void d(vzo vzoVar, DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        ArrayList arrayList = new ArrayList(10);
        HiDataReadOption hiDataReadOptionB = wgu.b(vzoVar, this.d);
        hiDataReadOptionB.setCount(500);
        HiDataReadProOption hiDataReadProOptionD = wgu.d(hiDataReadOptionB, vzoVar.f());
        readHiHealthDataPro(hiDataReadProOptionD, new AnonymousClass4(dataSourceCallback, arrayList, hiDataReadOptionB, hiDataReadProOptionD));
    }

    /* JADX INFO: renamed from: wcj$4, reason: invalid class name */
    class AnonymousClass4 implements DataSourceCallback<SparseArray<List<HiHealthData>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HiDataReadOption f51860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f51861c;
        final /* synthetic */ DataSourceCallback d;
        final /* synthetic */ HiDataReadProOption e;

        AnonymousClass4(DataSourceCallback dataSourceCallback, List list, HiDataReadOption hiDataReadOption, HiDataReadProOption hiDataReadProOption) {
            this.d = dataSourceCallback;
            this.f51861c = list;
            this.f51860b = hiDataReadOption;
            this.e = hiDataReadProOption;
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, SparseArray<List<HiHealthData>> sparseArray) {
            if (i != 0) {
                this.d.onResponse(i, new ArrayList());
                return;
            }
            if (sparseArray != null && sparseArray.size() != 0) {
                List<HiHealthData> list = sparseArray.get(wcj.this.d[0]);
                if (njy.e(list)) {
                    this.d.onResponse(i, this.f51861c);
                    return;
                }
                this.f51861c.addAll(list);
                this.f51860b.setEndTime(list.get(list.size() - 1).getStartTime() - 1);
                wcj.this.readHiHealthDataPro(this.e, new DataSourceCallback() { // from class: wcx
                    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                    public final void onResponse(int i2, Object obj) {
                        this.e.onResponse(i2, (SparseArray) obj);
                    }
                });
                return;
            }
            this.d.onResponse(i, this.f51861c);
        }
    }

    private List<HiHealthData> e(List<HiHealthData> list, List<HiHealthData> list2) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        if (!njy.e(list2)) {
            Map<Long, HiHealthData> mapListToMap = listToMap(list2);
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getInt(BleConstants.BLOODPRESSURE_SPHYGMUS) <= 0 && mapListToMap.containsKey(Long.valueOf(hiHealthData.getStartTime()))) {
                    hiHealthData.putInt(BleConstants.BLOODPRESSURE_SPHYGMUS, mapListToMap.get(Long.valueOf(hiHealthData.getStartTime())).getIntValue());
                }
            }
        }
        return list;
    }

    private List<HiHealthData> e(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            if (ftw.b(hiHealthData.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC), hiHealthData.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC)) == 1) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private Map<Integer, List<whr>> a(List<HiHealthData> list, vzo vzoVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = new HashMap(16);
        map.put(100, new ArrayList());
        for (int i : ftw.b()) {
            if (i != 1) {
                map.put(Integer.valueOf(i), new ArrayList());
            }
        }
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            int iB = ftw.b(hiHealthData.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC), hiHealthData.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC));
            if (map.get(Integer.valueOf(iB)) != null) {
                arrayList.add(Integer.valueOf(iB));
                arrayList2.add(hiHealthData);
            }
        }
        a(arrayList2);
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            PrivacyDataModel privacyDataModelConvertToDataModel = convertToDataModel(arrayList2.get(i2), vzoVar);
            ((List) map.get(arrayList.get(i2))).add(privacyDataModelConvertToDataModel);
            ((List) map.get(100)).add(privacyDataModelConvertToDataModel);
        }
        HashMap map2 = new HashMap(16);
        for (Map.Entry entry : map.entrySet()) {
            if (vzoVar.m() == 0) {
                map2.put((Integer) entry.getKey(), doubleGroupSort(groupByDay((List) entry.getValue())));
            } else {
                map2.put((Integer) entry.getKey(), doubleGroupForCache(groupByDay((List) entry.getValue()), vzoVar));
            }
        }
        LogUtil.a("BloodPressureOperateImp", "getAbnormalDataMap totalCost=", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), "ms");
        return map2;
    }

    private void a(List<HiHealthData> list) {
        LogUtil.a("BloodPressureOperateImp", "start setSourceType");
        if (list.size() == 0) {
            LogUtil.a("BloodPressureOperateImp", "mergeList size 0");
            return;
        }
        HashSet hashSet = new HashSet(16);
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(it.next().getClientId()));
        }
        HashMap<Integer, String> iconMap = getIconMap(wgr.e(hashSet));
        for (HiHealthData hiHealthData : list) {
            int clientId = hiHealthData.getClientId();
            if (iconMap.containsKey(Integer.valueOf(clientId))) {
                String str = iconMap.get(Integer.valueOf(clientId));
                hiHealthData.putString("iconResource", str);
                e(hiHealthData, str);
            }
        }
        LogUtil.a("BloodPressureOperateImp", "end setSourceType");
    }

    private void e(HiHealthData hiHealthData, String str) {
        if (String.valueOf(wgt.a()).equals(str)) {
            hiHealthData.putInt("source_type", 3);
        } else {
            hiHealthData.putInt("source_type", 2);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public int[] getDeleteDataTypes(vzo vzoVar) {
        return HiHealthDataType.e(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value());
    }
}
