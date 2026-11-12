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
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class vaj implements IChartStorageHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50862c;
    private long e;
    private long i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50860a = "TEMPERATURE_MIN_MAX";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50861b = UnitUtil.a();
    private final vbk d = vbk.c();

    public void e(String str) {
        LogUtil.d("KnitTemperatureChartStorageHelper", "setShowDataType is ", str);
        this.f50860a = str;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (responseCallback == null) {
            return;
        }
        this.i = j;
        this.e = j2 - 1;
        e(dataInfos, responseCallback);
    }

    private void e(DataInfos dataInfos, ResponseCallback responseCallback) {
        if (dataInfos.isDayData()) {
            e(responseCallback);
            this.f50862c = true;
        }
        d(responseCallback);
    }

    private void d(ResponseCallback responseCallback) {
        int[] iArr = {2104};
        this.d.c(iArr, d(iArr), new a(responseCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ResponseCallback responseCallback, List<HiHealthData> list) {
        HiAggregateOption hiAggregateOptionE = e();
        hiAggregateOptionE.setType(new int[]{this.d.j(), this.d.i(), this.d.n(), this.d.k(), this.d.r(), this.d.s()});
        hiAggregateOptionE.setConstantsKey(new String[]{"body_min_key", "body_max_key", "skin_min_key", "skin_max_key", "suspected_temperature_high_min_key", "suspected_temperature_high_max_key"});
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionE, new c(responseCallback, list));
    }

    private HiAggregateOption e() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(this.i);
        hiAggregateOption.setEndTime(this.e);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    private HiDataReadOption d(int[] iArr) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(this.i);
        hiDataReadOption.setEndTime(this.e);
        return hiDataReadOption;
    }

    private void e(ResponseCallback responseCallback) {
        int[] iArr;
        if ("TEMPERATURE_MIN_MAX".equals(this.f50860a)) {
            iArr = new int[]{this.d.a(), 2104, this.d.q()};
        } else {
            iArr = new int[]{this.d.l()};
        }
        this.d.d(iArr, d(iArr), new e(responseCallback), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> e(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList(16);
        if (njy.e(list2)) {
            LogUtil.j("KnitTemperatureChartStorageHelper", "addOldData oldList is null!");
            return list;
        }
        HashMap map = new HashMap(16);
        for (HiHealthData hiHealthData : list2) {
            if (hiHealthData != null) {
                long jC = ltb.c(hiHealthData.getStartTime());
                float floatValue = hiHealthData.getFloatValue();
                HiHealthData hiHealthData2 = map.get(Long.valueOf(jC));
                if (hiHealthData2 == null) {
                    hiHealthData2 = new HiHealthData();
                    hiHealthData2.setTimeInterval(jC, jC);
                    hiHealthData2.putFloat("body_min_key", floatValue);
                    hiHealthData2.putFloat("body_max_key", floatValue);
                } else {
                    float f = hiHealthData2.getFloat("body_max_key");
                    float f2 = hiHealthData2.getFloat("body_min_key");
                    float fMax = Math.max(floatValue, f);
                    hiHealthData2.putFloat("body_min_key", Math.min(floatValue, f2));
                    hiHealthData2.putFloat("body_max_key", fMax);
                }
                map.put(Long.valueOf(jC), hiHealthData2);
            }
        }
        if (njy.e(list)) {
            LogUtil.j("KnitTemperatureChartStorageHelper", "addOldData list is null");
            a(arrayList, map);
            return arrayList;
        }
        c(list, map, arrayList);
        return arrayList;
    }

    private void c(List<HiHealthData> list, Map<Long, HiHealthData> map, List<HiHealthData> list2) {
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
    }

    private void a(List<HiHealthData> list, Map<Long, HiHealthData> map) {
        Iterator<Map.Entry<Long, HiHealthData>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            list.add(it.next().getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (responseCallback == null) {
            return;
        }
        HashMap map = new HashMap();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                float floatValue = hiHealthData.getFloatValue();
                if (vbr.c(floatValue, this.f50860a)) {
                    LogUtil.j("KnitTemperatureChartStorageHelper", "responseDayAvgData value ", Float.valueOf(floatValue));
                } else {
                    if (!this.f50861b) {
                        floatValue = vbr.b(floatValue);
                    }
                    d(map, hiHealthData, new BigDecimal(String.valueOf(floatValue)).setScale(1, 4).floatValue());
                }
            }
        }
        LogUtil.a("KnitTemperatureChartStorageHelper", "responseDayAvgData resultMap size ", Integer.valueOf(map.size()));
        a(map, responseCallback);
    }

    private void d(Map<Long, IStorageModel> map, HiHealthData hiHealthData, float f) {
        frt frtVar;
        long jC = vbr.c(hiHealthData.getStartTime());
        IStorageModel iStorageModel = map.get(Long.valueOf(jC));
        if (iStorageModel instanceof frt) {
            frtVar = (frt) iStorageModel;
            if (hiHealthData.getType() == this.d.q()) {
                if (frtVar.d() == 0.0f || frtVar.a() == 0.0f) {
                    frtVar.e(f);
                    frtVar.c(f);
                } else {
                    float fMin = Math.min(frtVar.d(), f);
                    float fMax = Math.max(frtVar.a(), f);
                    frtVar.e(fMin);
                    frtVar.c(fMax);
                }
            } else if (frtVar.h() == 0.0f || frtVar.e() == 0.0f) {
                frtVar.a(f);
                frtVar.d(f);
            } else {
                float fMin2 = Math.min(frtVar.h(), f);
                float fMax2 = Math.max(frtVar.e(), f);
                frtVar.d(fMin2);
                frtVar.a(fMax2);
            }
        } else {
            frtVar = new frt(42.0f, new frs());
            if (hiHealthData.getType() == this.d.q()) {
                frtVar.e(f);
                frtVar.c(f);
            } else {
                frtVar.a(f);
                frtVar.d(f);
            }
        }
        map.put(Long.valueOf(jC), frtVar);
    }

    private void a(Map<Long, IStorageModel> map, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        Map<Long, IStorageModel> map2 = new HashMap<>(16);
        for (Map.Entry<Long, IStorageModel> entry : map.entrySet()) {
            IStorageModel value = entry.getValue();
            if (value instanceof frt) {
                frt frtVar = (frt) value;
                frs frsVar = new frs();
                float fA = vbr.a(frtVar.e(), frtVar.h(), frtVar.a(), frtVar.d());
                float fB = vbr.b(frtVar.e(), frtVar.h(), frtVar.a(), frtVar.d());
                frsVar.b(fA);
                frsVar.c(fB);
                frtVar.c(frsVar);
                map2.put(entry.getKey(), frtVar);
            }
        }
        LogUtil.a("KnitTemperatureChartStorageHelper", "dealHourAvgCallback resultMap size ", Integer.valueOf(map2.size()));
        responseCallback.onResult(0, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        a(list, responseCallback);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    private void a(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        String str;
        String str2;
        if (this.f50862c || responseCallback == null) {
            return;
        }
        if (!"SKIN_TEMPERATURE_MIN_MAX".equals(this.f50860a)) {
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
                float f3 = hiHealthData.getFloat("suspected_temperature_high_max_key");
                float f4 = hiHealthData.getFloat("suspected_temperature_high_min_key");
                float fFloatValue = new BigDecimal(f).setScale(1, 4).floatValue();
                String str3 = str;
                float fFloatValue2 = new BigDecimal(f2).setScale(1, 4).floatValue();
                float fFloatValue3 = new BigDecimal(f3).setScale(1, 4).floatValue();
                float fFloatValue4 = new BigDecimal(f4).setScale(1, 4).floatValue();
                if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.f50860a)) {
                    if (vbr.c(fFloatValue, this.f50860a) || vbr.c(fFloatValue2, this.f50860a)) {
                        LogUtil.j("KnitTemperatureChartStorageHelper", "responseWeekMonthData max ", Float.valueOf(fFloatValue), " min ", Float.valueOf(fFloatValue2));
                    } else {
                        fFloatValue3 = 0.0f;
                        fFloatValue4 = 0.0f;
                        if (!this.f50861b) {
                            if (fFloatValue != 0.0f && fFloatValue2 != 0.0f) {
                                fFloatValue = vbr.b(fFloatValue);
                                fFloatValue2 = vbr.b(fFloatValue2);
                            }
                            if (fFloatValue3 != 0.0f && fFloatValue4 != 0.0f) {
                                fFloatValue3 = vbr.b(fFloatValue3);
                                fFloatValue4 = vbr.b(fFloatValue4);
                            }
                        }
                        e(map, hiHealthData.getStartTime(), new float[]{fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4});
                    }
                } else if ((vbr.i(fFloatValue) || vbr.i(fFloatValue2)) && (vbr.i(fFloatValue3) || vbr.i(fFloatValue4))) {
                    LogUtil.j("KnitTemperatureChartStorageHelper", "responseWeekMonthData max ", Float.valueOf(fFloatValue), " min ", Float.valueOf(fFloatValue2), " activeAlarmBodyMax ", Float.valueOf(fFloatValue3), " activeAlarmBodyMin ", Float.valueOf(fFloatValue4));
                } else {
                    if (!this.f50861b) {
                        if (fFloatValue != 0.0f) {
                            fFloatValue = vbr.b(fFloatValue);
                            fFloatValue2 = vbr.b(fFloatValue2);
                        }
                        if (fFloatValue3 != 0.0f) {
                            fFloatValue3 = vbr.b(fFloatValue3);
                            fFloatValue4 = vbr.b(fFloatValue4);
                        }
                    }
                    e(map, hiHealthData.getStartTime(), new float[]{fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4});
                }
                str = str3;
            }
        }
        LogUtil.a("KnitTemperatureChartStorageHelper", "responseWeekMonthChart map size ", Integer.valueOf(map.size()));
        responseCallback.onResult(0, map);
    }

    private void e(Map<Long, IStorageModel> map, long j, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float fA = vbr.a(f, f2, f3, f4);
        float fB = vbr.b(f, f2, f3, f4);
        frs frsVar = new frs();
        frsVar.c(fB);
        frsVar.b(fA);
        frt frtVar = new frt(42.0f, frsVar);
        frtVar.a(f);
        frtVar.d(f2);
        frtVar.c(f3);
        frtVar.e(f4);
        map.put(Long.valueOf(j), frtVar);
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ResponseCallback<Map<Long, IStorageModel>> f50866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vaj f50867c;

        private e(vaj vajVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.f50867c = vajVar;
            this.f50866b = responseCallback;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            vaj vajVar = this.f50867c;
            if (vajVar == null || this.f50866b == null) {
                LogUtil.e("KnitTemperatureChartStorageHelper", "mHelper: ", vajVar, " mCallback: ", this.f50866b);
                return;
            }
            HashMap map = new HashMap(16);
            if (i != 0) {
                LogUtil.j("KnitTemperatureChartStorageHelper", "DayPointDataResponse errorCode ", Integer.valueOf(i));
                this.f50866b.onResult(0, map);
                return;
            }
            List list = obj instanceof List ? (List) obj : null;
            if (!njy.e(list)) {
                this.f50867c.b(list, this.f50866b);
            } else {
                LogUtil.j("KnitTemperatureChartStorageHelper", "DayPointDataResponse list is empty");
                this.f50866b.onResult(0, map);
            }
        }
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vaj f50863a;
        private final ResponseCallback<Map<Long, IStorageModel>> d;

        private a(vaj vajVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.f50863a = vajVar;
            this.d = responseCallback;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            vaj vajVar = this.f50863a;
            if (vajVar == null) {
                LogUtil.j("KnitTemperatureChartStorageHelper", "OldTypeMaxMinResponse helper is null");
                return;
            }
            ResponseCallback<Map<Long, IStorageModel>> responseCallback = this.d;
            if (responseCallback != null) {
                vajVar.a(responseCallback, (List<HiHealthData>) (obj instanceof List ? (List) obj : null));
            } else {
                LogUtil.j("KnitTemperatureChartStorageHelper", "OldTypeMaxMinResponse callback is null");
            }
        }
    }

    static class c implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vaj f50864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<HiHealthData> f50865c;
        private ResponseCallback<Map<Long, IStorageModel>> d;

        private c(vaj vajVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback, List<HiHealthData> list) {
            this.f50864b = vajVar;
            this.d = responseCallback;
            this.f50865c = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            if (this.d == null) {
                LogUtil.j("KnitTemperatureChartStorageHelper", "MaxMinDataReadListener callback is null");
                return;
            }
            vaj vajVar = this.f50864b;
            if (vajVar != null) {
                List listE = vajVar.e(list, this.f50865c);
                if (njy.e(listE)) {
                    LogUtil.j("KnitTemperatureChartStorageHelper", "MaxMinDataReadListener data is null!");
                    if (this.f50864b.f50862c) {
                        return;
                    }
                    this.d.onResult(0, new HashMap());
                    return;
                }
                LogUtil.a("KnitTemperatureChartStorageHelper", "MaxMinDataReadListener data size ", Integer.valueOf(listE.size()));
                this.f50864b.c(listE, this.d);
                this.d = null;
                return;
            }
            LogUtil.j("KnitTemperatureChartStorageHelper", "MaxMinDataReadListener helper is null");
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.d("KnitTemperatureChartStorageHelper", "DataReadListener onResultIntent errorCode = ", Integer.valueOf(i2));
        }
    }
}
