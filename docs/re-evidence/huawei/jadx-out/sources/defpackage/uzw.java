package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.util.Pair;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class uzw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f50840c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50842b;
    private long d;
    private long g;
    private vbg j;
    private String f = "TEMPERATURE_MIN_MAX";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f50841a = UnitUtil.a();
    private final vbk e = vbk.c();

    public void c(long j) {
        this.g = j;
    }

    public void e(long j) {
        this.d = j;
    }

    public void b(DataInfos dataInfos, vbg vbgVar, ResponseCallback responseCallback) {
        LogUtil.a("TemperatureStorage", "requestData");
        this.j = vbgVar;
        if (dataInfos.isDayData()) {
            d();
            this.f50842b = true;
        }
        b(responseCallback);
    }

    private void d() {
        if (!lsl.c(this.g, this.d)) {
            LogUtil.j("TemperatureStorage", "getDayBodyAlarmData requested data is not the same day");
            return;
        }
        if (lsl.c(this.g, f50840c) && qrs.c(500)) {
            return;
        }
        f50840c = this.g;
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.f)) {
            return;
        }
        int[] iArr = {this.e.g(), this.e.f(), this.e.o()};
        this.e.c(iArr, a(iArr, this.g), new a(this.j));
    }

    private HiDataReadOption a(int[] iArr, long j) {
        long jR = lsl.r(j);
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(2);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(jR);
        hiDataReadOption.setEndTime(lsl.c(jR));
        return hiDataReadOption;
    }

    static class a implements IBaseResponseCallback {
        private vbg d;

        private a(vbg vbgVar) {
            this.d = vbgVar;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i != 0) {
                LogUtil.j("TemperatureStorage", "DayBodyAlarmDataResponse errorCode ", Integer.valueOf(i));
                this.d.c((List<HiHealthData>) null);
                return;
            }
            List<HiHealthData> list = obj instanceof List ? (List) obj : null;
            if (njy.e(list)) {
                LogUtil.j("TemperatureStorage", "DayBodyAlarmDataResponse list is empty");
                this.d.c((List<HiHealthData>) null);
            } else {
                LogUtil.a("TemperatureStorage", "DayBodyAlarmDataResponse list size ", Integer.valueOf(list.size()));
                this.d.c(list);
            }
        }
    }

    private void b(ResponseCallback responseCallback) {
        int[] iArr = {2104};
        this.e.c(iArr, d(iArr), new e(responseCallback));
    }

    private HiDataReadOption d(int[] iArr) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(this.g);
        hiDataReadOption.setEndTime(this.d);
        return hiDataReadOption;
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ResponseCallback<Map<Long, IStorageModel>> f50845b;
        private final uzw e;

        private e(uzw uzwVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.e = uzwVar;
            this.f50845b = responseCallback;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            uzw uzwVar = this.e;
            if (uzwVar == null) {
                LogUtil.j("TemperatureStorage", "OldTypeMaxMinResponse helper is null");
                return;
            }
            ResponseCallback<Map<Long, IStorageModel>> responseCallback = this.f50845b;
            if (responseCallback != null) {
                uzwVar.d(responseCallback, obj instanceof List ? (List) obj : null);
            } else {
                LogUtil.j("TemperatureStorage", "OldTypeMaxMinResponse callback is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ResponseCallback responseCallback, List<HiHealthData> list) {
        HiAggregateOption hiAggregateOptionB = b();
        hiAggregateOptionB.setType(new int[]{this.e.j(), this.e.i(), this.e.n(), this.e.k(), this.e.r(), this.e.s()});
        hiAggregateOptionB.setConstantsKey(new String[]{"body_min_key", "body_max_key", "skin_min_key", "skin_max_key", "suspected_temperature_high_min_key", "suspected_temperature_high_max_key"});
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionB, new d(this.j, responseCallback, list));
    }

    private HiAggregateOption b() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(this.g);
        hiAggregateOption.setEndTime(this.d);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    static class d implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uzw f50843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<HiHealthData> f50844b;
        private final vbg d;
        private ResponseCallback<Map<Long, IStorageModel>> e;

        private d(uzw uzwVar, vbg vbgVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback, List<HiHealthData> list) {
            this.f50843a = uzwVar;
            this.e = responseCallback;
            this.f50844b = list;
            this.d = vbgVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            if (this.e == null) {
                LogUtil.j("TemperatureStorage", "MaxMinDataReadListener callback is null");
                return;
            }
            uzw uzwVar = this.f50843a;
            if (uzwVar != null) {
                List listB = uzwVar.b(list, this.f50844b);
                if (njy.e(listB)) {
                    LogUtil.j("TemperatureStorage", "MaxMinDataReadListener data is null!");
                    if (!this.f50843a.f50842b) {
                        this.e.onResult(0, new HashMap());
                    }
                    this.d.b(false);
                    this.f50843a.e(listB, this.e);
                    return;
                }
                LogUtil.a("TemperatureStorage", "MaxMinDataReadListener data size ", Integer.valueOf(listB.size()));
                this.d.b(true);
                this.f50843a.e(listB, this.e);
                this.e = null;
                return;
            }
            LogUtil.j("TemperatureStorage", "MaxMinDataReadListener helper is null");
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.d("TemperatureStorage", "DataReadListener onResultIntent errorCode = ", Integer.valueOf(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> b(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList(16);
        if (yls.c(list2)) {
            LogUtil.j("TemperatureStorage", "addOldData oldList is null!");
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
        if (yls.c(list)) {
            LogUtil.j("TemperatureStorage", "addOldData list is null");
            a(arrayList, map);
            return arrayList;
        }
        a(list, map, arrayList);
        return arrayList;
    }

    private void a(List<HiHealthData> list, Map<Long, HiHealthData> map, List<HiHealthData> list2) {
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
    public void e(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        Map<String, SpannableStringBuilder> mapB;
        new HashMap();
        if (!this.f50842b) {
            LogUtil.a("TemperatureStorage", "is not day fragment");
            ArrayList arrayList = new ArrayList(16);
            vbr.b(e(list), arrayList);
            mapB = b(arrayList);
        } else {
            mapB = b(list);
        }
        this.j.d(mapB);
        responseCallback.onResult(0, null);
    }

    private List<HiHealthData> e(List<HiHealthData> list) {
        if (!njy.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData.getStartTime() >= this.g && hiHealthData.getEndTime() < this.d) {
                arrayList.add(hiHealthData);
            }
        }
        LogUtil.d("TemperatureStorage", "results list ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private Map<String, SpannableStringBuilder> b(List<HiHealthData> list) {
        HashMap map = new HashMap();
        if (njy.e(list)) {
            LogUtil.j("TemperatureStorage", "dealMaxAndMin data list is isEmpty");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("--");
            map.put("TEMPERATURE_MIN_MAX", spannableStringBuilder);
            map.put("SKIN_TEMPERATURE_MIN_MAX", spannableStringBuilder);
            return map;
        }
        HiHealthData hiHealthData = list.get(0);
        float fA = a(hiHealthData.getFloat("body_min_key"));
        float fA2 = a(hiHealthData.getFloat("body_max_key"));
        float fA3 = a(hiHealthData.getFloat("skin_min_key"));
        float fA4 = a(hiHealthData.getFloat("skin_max_key"));
        Pair<String, String> pairD = vbr.d(fA2, fA, a(hiHealthData.getFloat("suspected_temperature_high_max_key")), a(hiHealthData.getFloat("suspected_temperature_high_min_key")));
        Pair<String, String> pairD2 = vbr.d(fA4, fA3, 0.0f, 0.0f);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder((CharSequence) pairD2.first);
        d(spannableStringBuilder2, (String) pairD2.first, (String) pairD2.second);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder((CharSequence) pairD.first);
        d(spannableStringBuilder3, (String) pairD.first, (String) pairD.second);
        LogUtil.d("TemperatureStorage", "bodyMinMax ", pairD.first, "skinMinMax ", pairD2.first);
        map.put("TEMPERATURE_MIN_MAX", spannableStringBuilder3);
        map.put("SKIN_TEMPERATURE_MIN_MAX", spannableStringBuilder2);
        return map;
    }

    private void d(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        int i;
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        if (iIndexOf < 0 || (i = length + iIndexOf) > spannableStringBuilder.length()) {
            LogUtil.e("TemperatureStorage", "TemperatureStorage spannableString overflow");
            return;
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp)), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_20dp)), iIndexOf, i, 17);
        spannableStringBuilder.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, i, 17);
    }

    private float a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return vbr.h(f);
    }

    private Map<String, SpannableStringBuilder> a() {
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("--");
            if (i == 0) {
                map.put("TEMPERATURE_MIN_MAX", spannableStringBuilder);
            } else {
                map.put("SKIN_TEMPERATURE_MIN_MAX", spannableStringBuilder);
            }
        }
        return map;
    }

    public Map<String, ftf> e(Map<String, SpannableStringBuilder> map, String str, String str2) {
        if (map == null || map.isEmpty()) {
            LogUtil.j("TemperatureStorage", "getTemperatureCardContent temperatureList is null");
            map = a();
        }
        HashMap map2 = new HashMap(16);
        synchronized (map) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                ftf ftfVar = new ftf();
                ftfVar.e(entry.getValue());
                if ("TEMPERATURE_MIN_MAX".equals(entry.getKey())) {
                    ftfVar.c(str);
                } else if ("SKIN_TEMPERATURE_MIN_MAX".equals(entry.getKey())) {
                    ftfVar.c(str2);
                } else {
                    LogUtil.a("TemperatureStorage", "other card");
                }
                ftfVar.d(vbr.e());
                map2.put(entry.getKey(), ftfVar);
            }
        }
        return map2;
    }
}
