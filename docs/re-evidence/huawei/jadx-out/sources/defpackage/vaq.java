package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vaq implements IChartStorageHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f50869b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50870a;
    private long d;
    private long f;
    private final LineChartViewPresenter j;
    private String i = "TEMPERATURE_MIN_MAX";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50871c = UnitUtil.a();
    private final vbk e = vbk.c();

    public vaq(LineChartViewPresenter lineChartViewPresenter) {
        this.j = lineChartViewPresenter;
    }

    public void d(String str) {
        LogUtil.d("TemperatureChartStorageHelper", "setShowDataType is ", str);
        this.i = str;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (responseCallback == null) {
            return;
        }
        this.f = j;
        this.d = j2 - 1;
        c(dataInfos, responseCallback);
    }

    private void c(DataInfos dataInfos, ResponseCallback responseCallback) {
        if (dataInfos.isDayData()) {
            d(responseCallback);
            a();
            this.f50870a = true;
        }
        a(responseCallback);
    }

    private void a(ResponseCallback responseCallback) {
        int[] iArr = {2104};
        this.e.c(iArr, b(iArr), new e(responseCallback));
    }

    private void a() {
        if (!lsl.c(this.f, this.d)) {
            LogUtil.j("TemperatureChartStorageHelper", "getDayBodyAlarmData requested data is not the same day");
            return;
        }
        if (lsl.c(this.f, f50869b) && qrs.c(500)) {
            return;
        }
        f50869b = this.f;
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.i)) {
            return;
        }
        int[] iArr = {this.e.g(), this.e.f()};
        this.e.c(iArr, c(iArr, this.f), new b());
    }

    private HiDataReadOption c(int[] iArr, long j) {
        long jR = lsl.r(j);
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(2);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(jR);
        hiDataReadOption.setEndTime(lsl.c(jR));
        return hiDataReadOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ResponseCallback responseCallback, List<HiHealthData> list) {
        HiAggregateOption hiAggregateOptionE = e();
        hiAggregateOptionE.setType(new int[]{this.e.j(), this.e.i(), this.e.n(), this.e.k()});
        hiAggregateOptionE.setConstantsKey(new String[]{"body_min_key", "body_max_key", "skin_min_key", "skin_max_key"});
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionE, new c(responseCallback, list));
    }

    private HiAggregateOption e() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(this.f);
        hiAggregateOption.setEndTime(this.d);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    private HiDataReadOption b(int[] iArr) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(this.f);
        hiDataReadOption.setEndTime(this.d);
        return hiDataReadOption;
    }

    private void d(ResponseCallback responseCallback) {
        int[] iArr;
        if ("TEMPERATURE_MIN_MAX".equals(this.i)) {
            iArr = new int[]{this.e.a(), 2104};
        } else {
            iArr = new int[]{this.e.l()};
        }
        this.e.c(iArr, b(iArr), new a(responseCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> e(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList(16);
        if (njy.e(list2)) {
            LogUtil.j("TemperatureChartStorageHelper", "addOldData oldList is null!");
            return list;
        }
        HashMap map = new HashMap(16);
        for (HiHealthData hiHealthData : list2) {
            if (hiHealthData != null) {
                long jR = lsl.r(hiHealthData.getStartTime());
                float floatValue = hiHealthData.getFloatValue();
                HiHealthData hiHealthData2 = map.get(Long.valueOf(jR));
                if (hiHealthData2 == null) {
                    hiHealthData2 = new HiHealthData();
                    hiHealthData2.setTimeInterval(jR, jR);
                    hiHealthData2.putFloat("body_min_key", floatValue);
                    hiHealthData2.putFloat("body_max_key", floatValue);
                } else {
                    float f = hiHealthData2.getFloat("body_max_key");
                    float f2 = hiHealthData2.getFloat("body_min_key");
                    float fMax = Math.max(floatValue, f);
                    hiHealthData2.putFloat("body_min_key", Math.min(floatValue, f2));
                    hiHealthData2.putFloat("body_max_key", fMax);
                }
                map.put(Long.valueOf(jR), hiHealthData2);
            }
        }
        if (njy.e(list)) {
            LogUtil.j("TemperatureChartStorageHelper", "addOldData list is null");
            b(arrayList, map);
            return arrayList;
        }
        return e(list, map, arrayList);
    }

    private List<HiHealthData> e(List<HiHealthData> list, Map<Long, HiHealthData> map, List<HiHealthData> list2) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                HiHealthData hiHealthData2 = map.get(Long.valueOf(hiHealthData.getStartTime()));
                if (hiHealthData2 == null) {
                    list2.add(hiHealthData);
                } else {
                    float f = hiHealthData2.getFloat("body_min_key");
                    float f2 = hiHealthData2.getFloat("body_max_key");
                    float fMin = Math.min(hiHealthData.getFloat("body_min_key"), f);
                    float fMax = Math.max(hiHealthData.getFloat("body_max_key"), f2);
                    hiHealthData2.putFloat("body_min_key", fMin);
                    hiHealthData2.putFloat("body_max_key", fMax);
                    hiHealthData2.putFloat("skin_min_key", hiHealthData.getFloat("skin_min_key"));
                    hiHealthData2.putFloat("skin_max_key", hiHealthData.getFloat("skin_max_key"));
                    list2.add(hiHealthData2);
                }
            }
        }
        return list2;
    }

    private void b(List<HiHealthData> list, Map<Long, HiHealthData> map) {
        Iterator<Map.Entry<Long, HiHealthData>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            list.add(it.next().getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        twg twgVar;
        if (responseCallback == null) {
            return;
        }
        Map<Long, IStorageModel> map = new HashMap<>();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                float floatValue = hiHealthData.getFloatValue();
                if (vbr.c(floatValue, this.i)) {
                    LogUtil.j("TemperatureChartStorageHelper", "responseDayAvgData value ", Float.valueOf(floatValue));
                } else {
                    long jC = vbr.c(hiHealthData.getStartTime());
                    IStorageModel iStorageModel = map.get(Long.valueOf(jC));
                    if (iStorageModel instanceof twg) {
                        twgVar = (twg) iStorageModel;
                        int iC = twgVar.c();
                        int i = iC + 1;
                        twgVar.d(((iC * twgVar.e()) + floatValue) / i);
                        twgVar.d(i);
                    } else {
                        twgVar = new twg(floatValue);
                        twgVar.d(1);
                    }
                    map.put(Long.valueOf(jC), twgVar);
                }
            }
        }
        LogUtil.a("TemperatureChartStorageHelper", "responseDayAvgData resultMap size ", Integer.valueOf(map.size()));
        a(map, responseCallback);
    }

    private void a(Map<Long, IStorageModel> map, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        Map<Long, IStorageModel> map2 = new HashMap<>(16);
        for (Map.Entry<Long, IStorageModel> entry : map.entrySet()) {
            IStorageModel value = entry.getValue();
            if (value instanceof twg) {
                twg twgVar = (twg) value;
                float fFloatValue = new BigDecimal(String.valueOf(twgVar.e())).setScale(1, 4).floatValue();
                if (!this.f50871c) {
                    fFloatValue = vbr.b(fFloatValue);
                }
                twgVar.d(fFloatValue);
                map2.put(entry.getKey(), twgVar);
            }
        }
        LogUtil.a("TemperatureChartStorageHelper", "dealHourAvgCallback resultMap size ", Integer.valueOf(map2.size()));
        responseCallback.onResult(0, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        e(list, responseCallback);
        d(list);
    }

    private void e(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        String str;
        String str2;
        if (this.f50870a || responseCallback == null) {
            return;
        }
        if (!"SKIN_TEMPERATURE_MIN_MAX".equals(this.i)) {
            str = "body_min_key";
            str2 = "body_max_key";
        } else {
            str = "skin_min_key";
            str2 = "skin_max_key";
        }
        HashMap map = new HashMap();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                float f = hiHealthData.getFloat(str2);
                float f2 = hiHealthData.getFloat(str);
                float fFloatValue = new BigDecimal(f).setScale(1, 4).floatValue();
                float fFloatValue2 = new BigDecimal(f2).setScale(1, 4).floatValue();
                if (vbr.c(fFloatValue, this.i) || vbr.c(fFloatValue2, this.i)) {
                    LogUtil.j("TemperatureChartStorageHelper", "responseWeekMonthData max ", Float.valueOf(fFloatValue), " min ", Float.valueOf(fFloatValue2));
                } else {
                    if (!this.f50871c) {
                        fFloatValue = vbr.b(fFloatValue);
                        fFloatValue2 = vbr.b(fFloatValue2);
                    }
                    ukp ukpVar = new ukp();
                    ukpVar.b(fFloatValue2);
                    ukpVar.a(fFloatValue);
                    map.put(Long.valueOf(hiHealthData.getStartTime()), new ukm(40.0f, ukpVar));
                }
            }
        }
        LogUtil.a("TemperatureChartStorageHelper", "responseWeekMonthChart map size ", Integer.valueOf(map.size()));
        responseCallback.onResult(0, map);
    }

    private void d(List<HiHealthData> list) {
        this.j.notifyMaxAndMin(0, list);
    }

    static class a implements IBaseResponseCallback {
        private final WeakReference<vaq> d;
        private final ResponseCallback<Map<Long, IStorageModel>> e;

        private a(vaq vaqVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.d = new WeakReference<>(vaqVar);
            this.e = responseCallback;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            vaq vaqVar = this.d.get();
            if (vaqVar == null || this.e == null) {
                return;
            }
            HashMap map = new HashMap(16);
            if (vaqVar.j == null) {
                LogUtil.j("TemperatureChartStorageHelper", "DayPointDataResponse mPresenter is null");
                this.e.onResult(0, map);
                return;
            }
            if (i != 0) {
                LogUtil.j("TemperatureChartStorageHelper", "DayPointDataResponse errorCode ", Integer.valueOf(i));
                this.e.onResult(0, map);
                return;
            }
            List list = obj instanceof List ? (List) obj : null;
            if (njy.e(list)) {
                LogUtil.j("TemperatureChartStorageHelper", "DayPointDataResponse list is empty");
                this.e.onResult(0, map);
            } else {
                LogUtil.a("TemperatureChartStorageHelper", "DayPointDataResponse list size ", Integer.valueOf(list.size()));
                vaqVar.c((List<HiHealthData>) list, this.e);
            }
        }
    }

    static class b implements IBaseResponseCallback {
        private final WeakReference<vaq> e;

        private b(vaq vaqVar) {
            this.e = new WeakReference<>(vaqVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            vaq vaqVar = this.e.get();
            if (vaqVar == null) {
                return;
            }
            if (vaqVar.j == null) {
                LogUtil.j("TemperatureChartStorageHelper", "DayBodyAlarmDataResponse mPresenter is null");
                return;
            }
            if (i != 0) {
                LogUtil.j("TemperatureChartStorageHelper", "DayBodyAlarmDataResponse errorCode ", Integer.valueOf(i));
                vaqVar.j.notifyRemindData(-1, null);
                return;
            }
            List<HiHealthData> list = obj instanceof List ? (List) obj : null;
            if (njy.e(list)) {
                LogUtil.j("TemperatureChartStorageHelper", "DayBodyAlarmDataResponse list is empty");
                vaqVar.j.notifyRemindData(-1, null);
            } else {
                LogUtil.a("TemperatureChartStorageHelper", "DayBodyAlarmDataResponse list size ", Integer.valueOf(list.size()));
                vaqVar.j.notifyRemindData(0, list);
            }
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<vaq> f50873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ResponseCallback<Map<Long, IStorageModel>> f50874b;

        private e(vaq vaqVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.f50873a = new WeakReference<>(vaqVar);
            this.f50874b = responseCallback;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            vaq vaqVar = this.f50873a.get();
            if (vaqVar == null) {
                LogUtil.j("TemperatureChartStorageHelper", "OldTypeMaxMinResponse helper is null");
                return;
            }
            ResponseCallback<Map<Long, IStorageModel>> responseCallback = this.f50874b;
            if (responseCallback != null) {
                vaqVar.a(responseCallback, (List<HiHealthData>) (obj instanceof List ? (List) obj : null));
            } else {
                LogUtil.j("TemperatureChartStorageHelper", "OldTypeMaxMinResponse callback is null");
            }
        }
    }

    static class c implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ResponseCallback<Map<Long, IStorageModel>> f50872a;
        private final List<HiHealthData> d;
        private final WeakReference<vaq> e;

        private c(vaq vaqVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback, List<HiHealthData> list) {
            this.e = new WeakReference<>(vaqVar);
            this.f50872a = responseCallback;
            this.d = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            if (this.f50872a == null) {
                LogUtil.j("TemperatureChartStorageHelper", "MaxMinDataReadListener callback is null");
                return;
            }
            vaq vaqVar = this.e.get();
            if (vaqVar != null) {
                List listE = vaqVar.e(list, this.d);
                if (njy.e(listE)) {
                    LogUtil.j("TemperatureChartStorageHelper", "MaxMinDataReadListener data is null!");
                    if (!vaqVar.f50870a) {
                        this.f50872a.onResult(0, new HashMap());
                    }
                    vaqVar.j.notifyMaxAndMin(-1, null);
                    return;
                }
                LogUtil.a("TemperatureChartStorageHelper", "MaxMinDataReadListener data size ", Integer.valueOf(listE.size()));
                vaqVar.b((List<HiHealthData>) listE, this.f50872a);
                this.f50872a = null;
                return;
            }
            LogUtil.j("TemperatureChartStorageHelper", "MaxMinDataReadListener helper is null");
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.d("TemperatureChartStorageHelper", "DataReadListener onResultIntent errorCode = ", Integer.valueOf(i2));
        }
    }
}
