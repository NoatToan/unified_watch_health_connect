package defpackage;

import android.util.SparseArray;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class utk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50540b = true;
    private long d;
    private long e;

    public void d(boolean z, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("BloodPressureStorage", "readData");
        this.f50540b = z;
        b(j, j2, iBaseResponseCallback);
    }

    public void b(final long j, final long j2, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("BloodPressureStorage", "readData callback is null");
            return;
        }
        LogUtil.a("BloodPressureStorage", "startTime: " + j + ", endTime: " + j2);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(e(j, j2), new HiAggregateListener() { // from class: utk.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (njy.e(list)) {
                    LogUtil.j("BloodPressureStorage", "datas is empty, errorCode: ", Integer.valueOf(i));
                    iBaseResponseCallback.a(100001, new ArrayList());
                } else {
                    LogUtil.a("BloodPressureStorage", "readData data size = ", Integer.valueOf(list.size()));
                    utk.this.e(j, j2, list, iBaseResponseCallback);
                }
            }
        });
    }

    public static void d(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("BloodPressureStorage", "readData callback is null");
            return;
        }
        HiAggregateOption hiAggregateOptionE = e();
        hiAggregateOptionE.setCount(1);
        hiAggregateOptionE.setTimeRange(0L, System.currentTimeMillis());
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionE, new HiAggregateListener() { // from class: utk.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (njy.e(list)) {
                    LogUtil.j("BloodPressureStorage", "datas is empty");
                    iBaseResponseCallback.a(100001, new ArrayList());
                } else {
                    LogUtil.a("BloodPressureStorage", "readData data size = ", Integer.valueOf(list.size()));
                    iBaseResponseCallback.a(0, list);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final long j, final long j2, final List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            if (!arrayList.contains(Integer.valueOf(list.get(i).getClientId()))) {
                arrayList.add(Integer.valueOf(list.get(i).getClientId()));
            }
        }
        final int[] iArrC = CommonUtil.c((List<Integer>) arrayList);
        HiDataSourceFetchOption hiDataSourceFetchOptionA = HiDataSourceFetchOption.builder().c(1).b(iArrC).a();
        LogUtil.a("BloodPressureStorage", "setSourceType start");
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchDataSource(hiDataSourceFetchOptionA, new HiDataClientListener() { // from class: uti
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public final void onResult(List list2) {
                this.e.c(iArrC, list, iBaseResponseCallback, j, j2, list2);
            }
        });
    }

    /* synthetic */ void c(int[] iArr, List list, IBaseResponseCallback iBaseResponseCallback, long j, long j2, List list2) {
        if (njy.e(list2)) {
            LogUtil.j("BloodPressureStorage", "getDataSourceType clientList is empty");
        } else {
            HashMap map = new HashMap(iArr.length);
            for (int i = 0; i < iArr.length; i++) {
                map.put(Integer.valueOf(iArr[i]), (HiHealthClient) list2.get(i));
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (wgr.a((HiHealthClient) map.get(Integer.valueOf(((HiHealthData) list.get(i2)).getClientId())))) {
                    ((HiHealthData) list.get(i2)).setDeviceUuid("-1");
                }
            }
        }
        LogUtil.a("BloodPressureStorage", "setSourceType end");
        List<uwh> listE = e(list);
        if (njy.e(listE)) {
            LogUtil.j("BloodPressureStorage", "resultList is empty");
            iBaseResponseCallback.a(100001, new ArrayList());
        } else {
            LogUtil.j("BloodPressureStorage", "resultList size: ", Integer.valueOf(listE.size()));
            a(j, j2, listE, iBaseResponseCallback);
        }
    }

    private void a(long j, long j2, List<uwh> list, IBaseResponseCallback iBaseResponseCallback) {
        String strC = qrk.c(j);
        this.f50539a = strC;
        this.d = j;
        this.e = j2;
        SparseArray<List<HiHealthData>> sparseArrayB = usx.b(strC);
        if (this.f50540b && sparseArrayB.size() > 0) {
            LogUtil.a("BloodPressureStorage", "queryDayDayData use cache, resultList size： " + list.size());
            b(j, j2, list, iBaseResponseCallback);
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{46018});
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new b(this, iBaseResponseCallback, list, sparseArrayB));
    }

    static class b implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<utk> f50545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<uwh> f50546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final IBaseResponseCallback f50547c;
        private SparseArray<List<HiHealthData>> e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public b(utk utkVar, IBaseResponseCallback iBaseResponseCallback, List<uwh> list, SparseArray<List<HiHealthData>> sparseArray) {
            this.f50545a = new WeakReference<>(utkVar);
            this.f50547c = iBaseResponseCallback;
            this.f50546b = list;
            this.e = sparseArray;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("BloodPressureStorage", "readHiHealthData onResult");
            if (obj == null) {
                LogUtil.a("BloodPressureStorage", "data is null");
                return;
            }
            utk utkVar = this.f50545a.get();
            if (utkVar == null) {
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() > 0) {
                if (utkVar.f50540b) {
                    utkVar.f50540b = false;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean zC = usx.c(this.e, sparseArray);
                    LogUtil.a("BloodPressureStorage", "queryDayDayData diff time: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
                    if (zC) {
                        usx.e(utkVar.f50539a, sparseArray);
                    } else {
                        LogUtil.a("BloodPressureStorage", "queryDayDayData same cache");
                        return;
                    }
                }
                utk.b(utkVar.d, utkVar.e, this.f50546b, this.f50547c);
                return;
            }
            LogUtil.a("BloodPressureStorage", "map is null");
            this.f50547c.a(0, this.f50546b);
        }
    }

    private static List<uwh> e(List<HiHealthData> list) {
        LogUtil.a("BloodPressureStorage", "handleBloodPressData enter");
        ArrayList arrayList = new ArrayList(31);
        for (HiHealthData hiHealthData : list) {
            uwh uwhVar = new uwh();
            uwhVar.e(hiHealthData.getStartTime());
            uwhVar.c(hiHealthData.getDouble("BLOOD_PRESSURE_SYSTOLIC"));
            uwhVar.e(hiHealthData.getDouble("BLOOD_PRESSURE_DIASTOLIC"));
            uwhVar.b(hiHealthData.getDouble(BleConstants.BLOODPRESSURE_SPHYGMUS));
            uwhVar.a(hiHealthData.getFloat("beforeMeasureActivity"));
            uwhVar.d(hiHealthData.getFloat("measurementAnomalyFlag"));
            uwhVar.c(hiHealthData.getMetaData());
            uwhVar.b(hiHealthData.getModifiedTime());
            uwhVar.d(hiHealthData.getClientId());
            uwhVar.b(hiHealthData.getDeviceUuid());
            if (Math.abs(uwhVar.m()) >= 0.5d) {
                arrayList.add(uwhVar);
            } else {
                LogUtil.j("BloodPressureStorage", "invalid bloodPressure value");
            }
        }
        LogUtil.a("BloodPressureStorage", "handleBloodPressData end");
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(long j, long j2, final List<uwh> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("BloodPressureStorage", "readHeart start");
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(j, j2);
        hiAggregateOption.setType(new int[]{2018});
        hiAggregateOption.setConstantsKey(new String[]{"rest_heart_rate_max"});
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setGroupUnitType(0);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: utk.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list2, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list2, int i, int i2) {
                LogUtil.a("BloodPressureStorage", "readHeart end");
                if (njy.e(list2)) {
                    LogUtil.j("BloodPressureStorage", "heart is empty");
                    iBaseResponseCallback.a(0, list);
                    return;
                }
                for (uwh uwhVar : list) {
                    long jG = uwhVar.g();
                    if (uwhVar.l() <= 0.0d) {
                        for (HiHealthData hiHealthData : list2) {
                            long startTime = hiHealthData.getStartTime();
                            double d = hiHealthData.getDouble("rest_heart_rate_max");
                            if (jG == startTime && d > 0.0d) {
                                uwhVar.b(d);
                                break;
                            }
                        }
                    }
                }
                LogUtil.a("BloodPressureStorage", "read heart callback, list size: " + list.size());
                iBaseResponseCallback.a(0, list);
            }
        });
    }

    private static HiAggregateOption e() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{2006, 2007});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    private static HiAggregateOption e(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_ABNORMAL.value(), DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC", BleConstants.BLOODPRESSURE_SPHYGMUS, "measurementAnomalyFlag", "beforeMeasureActivity"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }
}
