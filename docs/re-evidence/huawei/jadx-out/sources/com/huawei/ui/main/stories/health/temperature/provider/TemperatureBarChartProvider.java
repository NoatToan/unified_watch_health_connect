package com.huawei.ui.main.stories.health.temperature.provider;

import android.content.Context;
import android.icu.util.MeasureUnit;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.KnitHealthDataChangeListener;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.LineChartRangeShowCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.temperature.chart.KnitTemperatureBarChartHolder;
import defpackage.Cfor;
import defpackage.fop;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qre;
import defpackage.uwh;
import defpackage.uzw;
import defpackage.vbg;
import defpackage.vbk;
import defpackage.vbr;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class TemperatureBarChartProvider extends MajorProvider<vbg> implements LineChartRangeShowCallback, KnitHealthDataChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private KnitTemperatureBarChartHolder f28106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataInfos f28107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f28108c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final List<Integer> j;
    private long k;
    private long l;
    private boolean m;
    private long n;
    private boolean o;
    private Observer p;
    private String q;
    private SectionBean r;
    private String s;
    private long t;
    private List<Integer> u;
    private vbg y;

    public TemperatureBarChartProvider() {
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.u = new ArrayList();
        this.y = new vbg();
        this.n = 0L;
        this.l = -1L;
        this.g = false;
        this.f = false;
        this.i = true;
        this.h = true;
        this.m = false;
        this.f28107b = DataInfos.NoDataPlaceHolder;
        this.t = -1L;
        this.q = "TEMPERATURE_MIN_MAX";
        this.p = new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureBarChartProvider.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                TemperatureBarChartProvider.this.a();
            }
        };
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value()));
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(arrayList, new fop(this, "TemperatureBarChartProvider"));
        this.o = Utils.o();
        ObserverManagerUtil.d(this.p, "data_changed_day_resume");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, vbg vbgVar) {
        String string = getExtra().getString(KnitHealthDetailActivity.TEMPERATURE_TYPE);
        map.put("FIRST_TIME_BIND", Boolean.valueOf(this.h));
        if (!this.h) {
            map.put("START_TIME", Long.valueOf(vbgVar.d()));
        } else if (!TextUtils.isEmpty(string)) {
            this.q = string;
        }
        this.h = false;
        map.put("SHOW_DATA_TYPE", this.o ? "SKIN_TEMPERATURE_MIN_MAX" : this.q);
        b();
    }

    @Override // com.huawei.health.knit.section.listener.LineChartRangeShowCallback
    public void onRangeChange(Context context, long j) {
        long jC = ltb.c(j);
        long jB = b(jC);
        if (qnh.s(j)) {
            if (this.n != jC || this.i) {
                this.n = jC;
                this.l = jB;
                this.y.a(jC, jB, this.k);
                uzw uzwVar = new uzw();
                uzwVar.c(jC);
                uzwVar.e(jB);
                LogUtil.a("TemperatureBarChartProvider", "storage.requestData");
                uzwVar.b(this.f28107b, this.y, new b(this));
                if (this.f28107b.isDayData()) {
                    this.i = true;
                } else {
                    this.i = false;
                }
            }
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.r = sectionBean;
        HashMap<String, Object> mapA = a(BaseApplication.getContext());
        sectionBean.c(mapA);
        e();
        vbg vbgVar = new vbg();
        vbgVar.d(((Long) mapA.get("START_TIME")).longValue());
        this.y = vbgVar;
        sectionBean.c(vbgVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        WeakReference<Context> weakReference = this.f28108c;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.e("TemperatureBarChartProvider", "context is null");
        } else if (this.m) {
            this.m = false;
            a();
            ObserverManagerUtil.e("data_changed_week_month_resume", new Object[0]);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onStop() {
        super.onStop();
        this.m = true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("TemperatureBarChartProvider", "begin to loadData");
        if (this.f28108c == null) {
            this.f28108c = new WeakReference<>(context);
        }
        this.r = sectionBean;
        d(new c());
        this.i = true;
    }

    static class b implements ResponseCallback<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<TemperatureBarChartProvider> f28113b;

        b(TemperatureBarChartProvider temperatureBarChartProvider) {
            this.f28113b = new WeakReference<>(temperatureBarChartProvider);
        }

        @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
        public void onResult(int i, Object obj) {
            TemperatureBarChartProvider temperatureBarChartProvider = this.f28113b.get();
            LogUtil.a("TemperatureBarChartProvider", "InnerCallback onResult provider ", temperatureBarChartProvider, " errorCode ", Integer.valueOf(i));
            if (temperatureBarChartProvider == null) {
                return;
            }
            temperatureBarChartProvider.notifyMinorProviders(temperatureBarChartProvider.y);
        }
    }

    static class c implements CommonUiBaseResponse {
        private final WeakReference<TemperatureBarChartProvider> d;

        private c(TemperatureBarChartProvider temperatureBarChartProvider) {
            this.d = new WeakReference<>(temperatureBarChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            TemperatureBarChartProvider temperatureBarChartProvider = this.d.get();
            if (temperatureBarChartProvider == null) {
                return;
            }
            List list = obj instanceof List ? (List) obj : null;
            if (!temperatureBarChartProvider.g) {
                if (!temperatureBarChartProvider.f || (temperatureBarChartProvider.k >= temperatureBarChartProvider.n && temperatureBarChartProvider.k <= temperatureBarChartProvider.l)) {
                    if (temperatureBarChartProvider.f) {
                        LogUtil.a("TemperatureBarChartProvider", "on data deleted");
                        temperatureBarChartProvider.f = false;
                        temperatureBarChartProvider.y.d(temperatureBarChartProvider.t > 0 ? temperatureBarChartProvider.t : temperatureBarChartProvider.n);
                        temperatureBarChartProvider.r.c(temperatureBarChartProvider.y);
                        return;
                    }
                    LogUtil.a("TemperatureBarChartProvider", "on data normal");
                    return;
                }
                LogUtil.a("TemperatureBarChartProvider", "on data delet and date null");
                temperatureBarChartProvider.f = false;
                if (njy.e(list)) {
                    return;
                }
                if (temperatureBarChartProvider.k > temperatureBarChartProvider.y.d()) {
                    temperatureBarChartProvider.y.d(temperatureBarChartProvider.k);
                }
                temperatureBarChartProvider.r.c(temperatureBarChartProvider.y);
                return;
            }
            LogUtil.a("TemperatureBarChartProvider", "on data insert");
            temperatureBarChartProvider.y.d(temperatureBarChartProvider.k >= 0 ? temperatureBarChartProvider.k : System.currentTimeMillis());
            temperatureBarChartProvider.k = -1L;
            temperatureBarChartProvider.g = false;
            temperatureBarChartProvider.r.c(temperatureBarChartProvider.y);
        }
    }

    private void b() {
        LogUtil.a("TemperatureBarChartProvider", "onSelect is ", this.q);
        if (this.q.equals("TEMPERATURE_MIN_MAX")) {
            d(AnalyticsValue.TEMPERATURE_SWITCH_TYPE_2060076.value(), 0);
        } else if (this.q.equals("SKIN_TEMPERATURE_MIN_MAX")) {
            d(AnalyticsValue.TEMPERATURE_SWITCH_TYPE_2060076.value(), 1);
        } else {
            LogUtil.d("TemperatureBarChartProvider", "onSelect unKnow");
        }
        if (this.f28106a != null) {
            LogUtil.a("TemperatureBarChartProvider", "mBarChartHolder.setShowDataType is ", this.q);
            if (this.o) {
                this.q = "SKIN_TEMPERATURE_MIN_MAX";
            }
            this.f28106a.c(this.q);
        }
    }

    public void d(CommonUiBaseResponse commonUiBaseResponse) {
        vbk vbkVarC = vbk.c();
        int[] iArr = {vbkVarC.a(), 2104};
        if (Utils.o()) {
            iArr = new int[]{vbkVarC.l()};
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setCount(1);
        vbkVarC.c(iArr, hiDataReadOption, new d(this, commonUiBaseResponse));
    }

    static final class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<TemperatureBarChartProvider> f28114c;
        private final CommonUiBaseResponse d;

        d(TemperatureBarChartProvider temperatureBarChartProvider, CommonUiBaseResponse commonUiBaseResponse) {
            this.f28114c = new WeakReference<>(temperatureBarChartProvider);
            this.d = commonUiBaseResponse;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            TemperatureBarChartProvider temperatureBarChartProvider = this.f28114c.get();
            if (temperatureBarChartProvider != null) {
                temperatureBarChartProvider.d((List<HiHealthData>) (obj instanceof List ? (List) obj : null), this.d);
            } else {
                LogUtil.j("TemperatureBarChartProvider", "temperatureBarChartProvider is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("TemperatureBarChartProvider", "handleTemperatureData enter");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(31);
        if (list != null && list.size() > 0) {
            LogUtil.a("TemperatureBarChartProvider", "handleTemperatureData data.size = ", Integer.valueOf(list.size()));
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getEndTime() <= jCurrentTimeMillis) {
                    double value = hiHealthData.getValue();
                    long startTime = hiHealthData.getStartTime();
                    int i = hiHealthData.getInt("trackdata_deviceType");
                    uwh uwhVar = new uwh();
                    uwhVar.c(value);
                    uwhVar.e(startTime);
                    uwhVar.a(i);
                    if (Math.abs(uwhVar.m()) >= 0.0d) {
                        arrayList.add(uwhVar);
                    } else {
                        LogUtil.j("TemperatureBarChartProvider", "invalid temperature value");
                    }
                }
            }
        } else {
            LogUtil.a("TemperatureBarChartProvider", "handleTemperatureData data is null or empty");
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(0, arrayList);
        }
        LogUtil.a("TemperatureBarChartProvider", "handleTemperatureData cost of time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void e() {
        LogUtil.a("TemperatureBarChartProvider", "begin to init registerObserver");
        this.e = "KnitHealthData_CardSelected_" + this.f28107b;
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureBarChartProvider.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                LogUtil.a("TemperatureBarChartProvider", "begin to notify registerObserver");
                if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof String)) {
                    return;
                }
                TemperatureBarChartProvider.this.q = (String) obj;
                LogUtil.a("TemperatureBarChartProvider", "mShowDataType is " + TemperatureBarChartProvider.this.q);
                TemperatureBarChartProvider.this.a();
            }
        }, this.e);
        this.d = "KnitHealthData_Edit_" + this.f28107b;
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureBarChartProvider.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Long)) {
                    return;
                }
                TemperatureBarChartProvider.this.k = ((Long) obj).longValue();
                TemperatureBarChartProvider.this.y.d(TemperatureBarChartProvider.this.k);
            }
        }, this.d);
        this.s = "KnitHealthData_MarkView_" + this.f28107b;
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureBarChartProvider.1
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Long)) {
                    return;
                }
                TemperatureBarChartProvider.this.t = ((Long) obj).longValue();
            }
        }, this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        b();
        this.y.a(this.q);
        long j = this.t;
        if (j <= 0) {
            j = this.n;
        }
        this.y.d(j);
        LogUtil.a("TemperatureBarChartProvider", "sectionBean.setData");
        this.r.c(this.y);
    }

    private HashMap<String, Object> a(Context context) {
        DataInfos dataInfos;
        HashMap<String, Object> map = new HashMap<>();
        Bundle extra = getExtra();
        Serializable serializable = extra != null ? extra.getSerializable("key_bundle_health_line_chart_data_infos") : null;
        if (serializable instanceof DataInfos) {
            dataInfos = (DataInfos) serializable;
        } else {
            dataInfos = DataInfos.NoDataPlaceHolder;
        }
        this.f28107b = dataInfos;
        map.put("DATA_INFO", dataInfos);
        Bundle extra2 = getExtra();
        Object obj = DataInfos.NoDataPlaceHolder;
        long jCurrentTimeMillis = 0;
        if (extra2 != null) {
            long j = extra2.getLong("key_bundle_health_last_data_time", 0L);
            jCurrentTimeMillis = j == 0 ? System.currentTimeMillis() : j;
            Serializable serializable2 = extra2.getSerializable("key_bundle_health_line_chart_data_infos");
            if (serializable2 instanceof DataInfos) {
                obj = (DataInfos) serializable2;
            }
        }
        LogUtil.a("TemperatureBarChartProvider", "first into card latestDataTime " + jCurrentTimeMillis);
        this.n = jCurrentTimeMillis;
        this.k = jCurrentTimeMillis;
        map.put("START_TIME", Long.valueOf(jCurrentTimeMillis));
        map.put("DATA_INFO", obj);
        b(map);
        map.put("BOTTOM_LEFT_COLOR", Integer.valueOf(ContextCompat.getColor(context, R.color.temperature_new_level_low_color_green)));
        map.put("BOTTOM_MID_COLOR", Integer.valueOf(ContextCompat.getColor(context, R.color.temperature_new_level_high_color_orange)));
        map.put("BOTTOM_RIGHT_COLOR", Integer.valueOf(ContextCompat.getColor(context, R.color.temperature_new_level_high_color_red)));
        KnitTemperatureBarChartHolder knitTemperatureBarChartHolder = new KnitTemperatureBarChartHolder(context);
        this.f28106a = knitTemperatureBarChartHolder;
        map.put("HEALTH_CHART_HOLDER", knitTemperatureBarChartHolder);
        map.put("RANGE_SHOW_CALL_BACK", this);
        return map;
    }

    private void b(HashMap<String, Object> map) {
        String strE = UnitUtil.e(37.20000076293945d, 1, 1);
        String strE2 = UnitUtil.e(38.0d, 1, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(qre.a(R.string.IDS_temperature_less_than, strE));
        arrayList.add(qre.a(R.string.IDS_temperature_normal_range, strE, strE2));
        arrayList.add(qre.a(R.string.IDS_temperature_more_than, strE2));
        float fB = vbr.b(37.2f);
        float fB2 = vbr.b(38.0f);
        String strE3 = UnitUtil.e(fB, 1, 1);
        String strE4 = UnitUtil.e(fB2, 1, 1);
        arrayList.add(qre.a(R.string.IDS_temperature_fahrenheit_less, strE3));
        arrayList.add(qre.a(R.string.IDS_temperature_fahrenheit_normal, strE3, strE4));
        arrayList.add(qre.a(R.string.IDS_temperature_fahrenheit_more, strE4));
        ArrayList arrayList2 = new ArrayList(6);
        String strA = UnitUtil.a(Float.valueOf(37.2f), MeasureUnit.CELSIUS);
        String strA2 = UnitUtil.a(Float.valueOf(38.0f), MeasureUnit.CELSIUS);
        arrayList2.add(qre.a(R.string.IDS_hw_health_blood_oxygen_measure_interval_lower_than, strA));
        arrayList2.add(qre.a(R.string.accessibility_range, strA, strA2));
        arrayList2.add(qre.a(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than, strA2));
        String strA3 = UnitUtil.a(Float.valueOf(fB), MeasureUnit.FAHRENHEIT);
        String strA4 = UnitUtil.a(Float.valueOf(fB2), MeasureUnit.FAHRENHEIT);
        arrayList2.add(qre.a(R.string.IDS_hw_health_blood_oxygen_measure_interval_lower_than, strA3));
        arrayList2.add(qre.a(R.string.accessibility_range, strA3, strA4));
        arrayList2.add(qre.a(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than, strA4));
        map.put("BOTTOM_LEGEND_TEXT", arrayList);
        map.put("BOTTOM_LEGEND_TEXT_CONTENT_DESCRIPTION", arrayList2);
    }

    private long b(long j) {
        long jC = lsl.c(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jC);
        if (this.f28107b.isDayData()) {
            LogUtil.a("TemperatureBarChartProvider", "getQueryEndTime isDay");
        } else if (this.f28107b.isWeekData()) {
            calendar.add(5, 6);
        } else if (this.f28107b.isMonthData()) {
            calendar.add(2, 1);
            calendar.add(5, -1);
        } else {
            LogUtil.e("TemperatureBarChartProvider", "getQueryEndTime failed, cause unknown data type of dataInfos = ", this.f28107b);
        }
        return calendar.getTimeInMillis();
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void onDataDeleted() {
        this.f = true;
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void onDataInserted(long j) {
        this.g = true;
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void setSubscribeList(List<Integer> list) {
        this.u = list;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.u, new Cfor("TemperatureBarChartProvider_" + this.f28107b));
        ObserverManagerUtil.a(this.d);
        ObserverManagerUtil.a(this.s);
        ObserverManagerUtil.a(this.e);
        ObserverManagerUtil.a(this.p, "data_changed_day_resume");
    }

    private void d(String str, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext().getApplicationContext(), str, map, 0);
    }
}
