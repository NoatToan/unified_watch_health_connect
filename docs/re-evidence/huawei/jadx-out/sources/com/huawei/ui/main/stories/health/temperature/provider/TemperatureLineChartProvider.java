package com.huawei.ui.main.stories.health.temperature.provider;

import android.content.Context;
import android.icu.util.MeasureUnit;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.KnitHealthDataChangeListener;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.LineChartRangeShowCallback;
import com.huawei.health.knit.section.model.SectionBean;
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
import com.huawei.ui.main.stories.health.temperature.chart.KnitTemperatureLineChartHolder;
import defpackage.Cfor;
import defpackage.fop;
import defpackage.lmf;
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
public class TemperatureLineChartProvider extends MajorProvider<vbg> implements LineChartRangeShowCallback, KnitHealthDataChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Integer> f28120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DataInfos f28122c;
    private WeakReference<Context> d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private long n;
    private long o;
    private Observer p;
    private KnitTemperatureLineChartHolder q;
    private SectionBean r;
    private String s;
    private long t;
    private vbg v;
    private String w;
    private List<Integer> y;

    static /* synthetic */ long f(TemperatureLineChartProvider temperatureLineChartProvider) {
        long j = temperatureLineChartProvider.t - 1;
        temperatureLineChartProvider.t = j;
        return j;
    }

    public TemperatureLineChartProvider() {
        ArrayList arrayList = new ArrayList();
        this.f28120a = arrayList;
        this.y = new ArrayList();
        this.v = new vbg();
        this.o = 0L;
        this.n = -1L;
        this.g = true;
        this.h = false;
        this.j = false;
        this.l = false;
        this.i = true;
        this.f = true;
        this.f28122c = DataInfos.NoDataPlaceHolder;
        this.t = -1L;
        this.w = "TEMPERATURE_MIN_MAX";
        this.p = new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureLineChartProvider.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                TemperatureLineChartProvider.this.b();
            }
        };
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value()));
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(arrayList, new fop(this, "KnitTemperatureLineChartProvider"));
        this.m = Utils.o();
        LogUtil.a("KnitTemperatureLineChartProvider", "is oversea ?" + this.m);
        ObserverManagerUtil.d(this.p, "data_changed_week_month_resume");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, vbg vbgVar) {
        map.put("FIRST_TIME_BIND", Boolean.valueOf(this.f));
        if (!this.f) {
            map.put("START_TIME", Long.valueOf(vbgVar.d()));
        }
        this.f = false;
        map.put("SHOW_DATA_TYPE", this.m ? "SKIN_TEMPERATURE_MIN_MAX" : vbgVar.a());
        LogUtil.a("KnitTemperatureLineChartProvider", "SHOW_DATA_TYPE is " + vbgVar.a());
        a();
    }

    @Override // com.huawei.health.knit.section.listener.LineChartRangeShowCallback
    public void onRangeChange(Context context, long j) {
        long jC = ltb.c(j);
        long jB = b(jC);
        if (qnh.s(j)) {
            if (this.o != jC || this.i) {
                this.o = jC;
                this.n = jB;
                this.v.a(jC, jB, this.k);
                uzw uzwVar = new uzw();
                uzwVar.c(jC);
                uzwVar.e(jB);
                LogUtil.a("KnitTemperatureLineChartProvider", "storage.requestData");
                uzwVar.b(this.f28122c, this.v, new c(this));
            }
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.r = sectionBean;
        HashMap<String, Object> mapD = d(BaseApplication.getContext());
        sectionBean.c(mapD);
        e();
        vbg vbgVar = new vbg();
        vbgVar.d(((Long) mapD.get("START_TIME")).longValue());
        sectionBean.c(vbgVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("KnitTemperatureLineChartProvider", "begin to loadData");
        this.r = sectionBean;
        if (this.d == null) {
            this.d = new WeakReference<>(context);
        }
        a(new e(this, this.r));
        onRangeChange(context, this.o);
        this.i = true;
    }

    private void a() {
        LogUtil.d("KnitTemperatureLineChartProvider", "onSelect is ", this.w);
        if (this.w.equals("TEMPERATURE_MIN_MAX")) {
            c(AnalyticsValue.TEMPERATURE_SWITCH_TYPE_2060076.value(), 0);
        } else if (this.w.equals("SKIN_TEMPERATURE_MIN_MAX")) {
            c(AnalyticsValue.TEMPERATURE_SWITCH_TYPE_2060076.value(), 1);
        } else {
            LogUtil.d("KnitTemperatureLineChartProvider", "onSelect unKnow");
        }
        KnitTemperatureLineChartHolder knitTemperatureLineChartHolder = this.q;
        if (knitTemperatureLineChartHolder != null) {
            if (this.m) {
                this.w = "SKIN_TEMPERATURE_MIN_MAX";
            }
            knitTemperatureLineChartHolder.b(this.w);
            this.q.c(this.w);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        if (this.g) {
            this.g = false;
            return;
        }
        WeakReference<Context> weakReference = this.d;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.e("KnitTemperatureLineChartProvider", "context is null");
        } else if (this.l) {
            this.l = false;
            b();
            ObserverManagerUtil.e("data_changed_day_resume", new Object[0]);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onStop() {
        super.onStop();
        this.l = true;
    }

    public void a(CommonUiBaseResponse commonUiBaseResponse) {
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
        vbkVarC.c(iArr, hiDataReadOption, new b(this, commonUiBaseResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("KnitTemperatureLineChartProvider", "handleTemperatureData enter");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(31);
        if (list != null && list.size() > 0) {
            LogUtil.a("KnitTemperatureLineChartProvider", "handleTemperatureData data.size = ", Integer.valueOf(list.size()));
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
                        LogUtil.j("KnitTemperatureLineChartProvider", "invalid temperature value");
                    }
                }
            }
        } else {
            LogUtil.a("KnitTemperatureLineChartProvider", "handleTemperatureData data is null or empty");
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(0, arrayList);
        }
        LogUtil.a("KnitTemperatureLineChartProvider", "handleTemperatureData cost of time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a();
        this.v.a(this.w);
        long j = this.t;
        if (j <= 0) {
            j = this.o;
        }
        this.v.d(j);
        LogUtil.a("KnitTemperatureLineChartProvider", "sectionBean.setData");
        this.r.c(this.v);
    }

    private void e() {
        LogUtil.a("KnitTemperatureLineChartProvider", "begin to init registerObserver");
        this.e = "KnitHealthData_CardSelected_" + this.f28122c;
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureLineChartProvider.2
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                LogUtil.a("KnitTemperatureLineChartProvider", "begin to notify registerObserver");
                if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof String)) {
                    return;
                }
                TemperatureLineChartProvider.this.w = (String) obj;
                LogUtil.a("KnitTemperatureLineChartProvider", "mShowDataType is " + TemperatureLineChartProvider.this.w);
                TemperatureLineChartProvider.this.b();
            }
        }, this.e);
        this.f28121b = "KnitHealthData_Edit_" + this.f28122c;
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureLineChartProvider.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                LogUtil.a("KnitTemperatureLineChartProvider", "update mLastTimestamp");
                if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Long)) {
                    return;
                }
                TemperatureLineChartProvider.this.k = ((Long) obj).longValue();
                TemperatureLineChartProvider.this.v.c(TemperatureLineChartProvider.this.k);
                LogUtil.a("KnitTemperatureLineChartProvider", "mLastTimestamp is " + TemperatureLineChartProvider.this.k);
            }
        }, this.f28121b);
        this.s = "KnitHealthData_MarkView_" + this.f28122c;
        LogUtil.a("KnitTemperatureLineChartProvider", "begin to update mMarkViewTime");
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureLineChartProvider.1
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (objArr == null || objArr.length <= 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Long) {
                    TemperatureLineChartProvider.this.t = ((Long) obj).longValue();
                    if (TemperatureLineChartProvider.this.n <= 0 || TemperatureLineChartProvider.this.t <= TemperatureLineChartProvider.this.n) {
                        return;
                    }
                    TemperatureLineChartProvider.f(TemperatureLineChartProvider.this);
                }
            }
        }, this.s);
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureLineChartProvider.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                LogUtil.a("KnitTemperatureLineChartProvider", "notify updateChart");
                TemperatureLineChartProvider.this.b();
            }
        }, "REFRESH_TEMPERATURE_CHART");
    }

    private HashMap<String, Object> d(Context context) {
        DataInfos dataInfos;
        HashMap<String, Object> map = new HashMap<>();
        Bundle extra = getExtra();
        Serializable serializable = extra != null ? extra.getSerializable("key_bundle_health_line_chart_data_infos") : null;
        if (serializable instanceof DataInfos) {
            dataInfos = (DataInfos) serializable;
        } else {
            dataInfos = DataInfos.NoDataPlaceHolder;
        }
        this.f28122c = dataInfos;
        map.put("DATA_INFO", dataInfos);
        Bundle extra2 = getExtra();
        Object obj = DataInfos.NoDataPlaceHolder;
        long jCurrentTimeMillis = 0;
        if (extra2 != null) {
            long j = extra2.getLong("key_bundle_health_last_data_time", 0L);
            if (j == 0) {
                LogUtil.a("KnitTemperatureLineChartProvider", "first into card latestDataTime is zero");
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = j;
            }
            Serializable serializable2 = extra2.getSerializable("key_bundle_health_line_chart_data_infos");
            if (serializable2 instanceof DataInfos) {
                obj = (DataInfos) serializable2;
            }
        }
        LogUtil.a("KnitTemperatureLineChartProvider", "first into card latestDataTime " + jCurrentTimeMillis);
        this.o = jCurrentTimeMillis;
        this.k = jCurrentTimeMillis;
        map.put("START_TIME", Long.valueOf(jCurrentTimeMillis));
        map.put("DATA_INFO", obj);
        map.put("CURSOR_UP_AVERAGE_TEXT", context.getString(R.string.IDS_temperature_average));
        b(map);
        map.put("BOTTOM_LEFT_COLOR", Integer.valueOf(ContextCompat.getColor(context, R.color.temperature_level_low_color_blue)));
        map.put("BOTTOM_MID_COLOR", Integer.valueOf(ContextCompat.getColor(context, R.color.temperature_level_normal_color_green)));
        map.put("BOTTOM_RIGHT_COLOR", Integer.valueOf(ContextCompat.getColor(context, R.color.temperature_level_high_color_red)));
        KnitTemperatureLineChartHolder knitTemperatureLineChartHolder = new KnitTemperatureLineChartHolder(context);
        this.q = knitTemperatureLineChartHolder;
        map.put("HEALTH_CHART_HOLDER", knitTemperatureLineChartHolder);
        map.put("RANGE_SHOW_CALL_BACK", this);
        return map;
    }

    private void b(HashMap<String, Object> map) {
        String strE = UnitUtil.e(35.0d, 1, 1);
        String strE2 = UnitUtil.e(37.20000076293945d, 1, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(qre.a(R.string.IDS_temperature_less_than, strE));
        arrayList.add(qre.a(R.string.IDS_temperature_normal_range, strE, strE2));
        arrayList.add(qre.a(R.string.IDS_temperature_more_than, strE2));
        float fB = vbr.b(35.0f);
        float fB2 = vbr.b(37.2f);
        String strE3 = UnitUtil.e(fB, 1, 1);
        String strE4 = UnitUtil.e(fB2, 1, 1);
        arrayList.add(qre.a(R.string.IDS_temperature_fahrenheit_less, strE3));
        arrayList.add(qre.a(R.string.IDS_temperature_fahrenheit_normal, strE3, strE4));
        arrayList.add(qre.a(R.string.IDS_temperature_fahrenheit_more, strE4));
        ArrayList arrayList2 = new ArrayList(6);
        String strA = UnitUtil.a(Float.valueOf(35.0f), MeasureUnit.CELSIUS);
        String strA2 = UnitUtil.a(Float.valueOf(37.2f), MeasureUnit.CELSIUS);
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
        long jB = ltb.b(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jB);
        if (this.f28122c.isDayData()) {
            LogUtil.a("KnitTemperatureLineChartProvider", "getQueryEndTime isDay");
        } else if (this.f28122c.isWeekData()) {
            calendar.add(5, 6);
        } else if (this.f28122c.isMonthData()) {
            calendar.add(2, 1);
            calendar.add(5, -1);
        } else {
            LogUtil.e("KnitTemperatureLineChartProvider", "getQueryEndTime failed, cause unknown data type of dataInfos = ", this.f28122c);
        }
        return calendar.getTimeInMillis();
    }

    private void c(String str, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext().getApplicationContext(), str, map, 0);
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void onDataDeleted() {
        LogUtil.a("KnitTemperatureLineChartProvider", "temperatureDataDeleted");
        this.j = true;
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void onDataInserted(long j) {
        LogUtil.a("KnitTemperatureLineChartProvider", "temperatureDataInserted");
        this.h = true;
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void setSubscribeList(List<Integer> list) {
        this.y = list;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.y, new Cfor("KnitTemperatureLineChartProvider_" + this.f28122c));
        ObserverManagerUtil.a(this.f28121b);
        ObserverManagerUtil.a(this.s);
        ObserverManagerUtil.a(this.e);
        ObserverManagerUtil.a("REFRESH_TEMPERATURE_CHART");
        ObserverManagerUtil.a(this.p, "data_changed_week_month_resume");
    }

    static class c implements ResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<TemperatureLineChartProvider> f28125b;

        public c(TemperatureLineChartProvider temperatureLineChartProvider) {
            this.f28125b = new WeakReference<>(temperatureLineChartProvider);
        }

        @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
        public void onResult(int i, Object obj) {
            LogUtil.a("KnitTemperatureLineChartProvider", "DataRspCallBack");
            TemperatureLineChartProvider temperatureLineChartProvider = this.f28125b.get();
            if (temperatureLineChartProvider != null) {
                if (temperatureLineChartProvider.m) {
                    return;
                }
                temperatureLineChartProvider.notifyMinorProviders(temperatureLineChartProvider.v);
                return;
            }
            LogUtil.a("KnitTemperatureLineChartProvider", "provider is destroy");
        }
    }

    static class e implements CommonUiBaseResponse {
        private WeakReference<TemperatureLineChartProvider> d;
        private WeakReference<SectionBean> e;

        public e(TemperatureLineChartProvider temperatureLineChartProvider, SectionBean sectionBean) {
            this.d = new WeakReference<>(temperatureLineChartProvider);
            this.e = new WeakReference<>(sectionBean);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            WeakReference<SectionBean> weakReference;
            LogUtil.a("KnitTemperatureLineChartProvider", "CommonUiRspCallBack");
            TemperatureLineChartProvider temperatureLineChartProvider = this.d.get();
            if (temperatureLineChartProvider == null || (weakReference = this.e) == null) {
                LogUtil.a("KnitTemperatureLineChartProvider", "provider is destroy");
                return;
            }
            SectionBean sectionBean = weakReference.get();
            if (sectionBean == null) {
                LogUtil.a("KnitTemperatureLineChartProvider", "mSectionBean is null");
                return;
            }
            List list = obj instanceof List ? (List) obj : null;
            if (!temperatureLineChartProvider.h) {
                if (!temperatureLineChartProvider.j || (temperatureLineChartProvider.k >= temperatureLineChartProvider.o && temperatureLineChartProvider.k <= temperatureLineChartProvider.n)) {
                    if (temperatureLineChartProvider.j) {
                        LogUtil.a("KnitTemperatureLineChartProvider", "on data deleted");
                        temperatureLineChartProvider.j = false;
                        temperatureLineChartProvider.v.d(temperatureLineChartProvider.t > 0 ? temperatureLineChartProvider.t : temperatureLineChartProvider.o);
                        sectionBean.c(temperatureLineChartProvider.v);
                        return;
                    }
                    LogUtil.a("KnitTemperatureLineChartProvider", "on data normal");
                    return;
                }
                LogUtil.a("KnitTemperatureLineChartProvider", "on data delet and date null");
                temperatureLineChartProvider.j = false;
                if (njy.e(list)) {
                    return;
                }
                if (temperatureLineChartProvider.k > temperatureLineChartProvider.v.d()) {
                    temperatureLineChartProvider.v.d(temperatureLineChartProvider.k);
                }
                sectionBean.c(temperatureLineChartProvider.v);
                return;
            }
            LogUtil.a("KnitTemperatureLineChartProvider", "on data insert");
            temperatureLineChartProvider.v.d(temperatureLineChartProvider.k >= 0 ? temperatureLineChartProvider.k : System.currentTimeMillis());
            temperatureLineChartProvider.k = -1L;
            temperatureLineChartProvider.h = false;
            sectionBean.c(temperatureLineChartProvider.v);
        }
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<TemperatureLineChartProvider> f28124a;
        private WeakReference<CommonUiBaseResponse> d;

        public b(TemperatureLineChartProvider temperatureLineChartProvider, CommonUiBaseResponse commonUiBaseResponse) {
            this.f28124a = new WeakReference<>(temperatureLineChartProvider);
            this.d = new WeakReference<>(commonUiBaseResponse);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("KnitTemperatureLineChartProvider", "BaseResponseCallback");
            TemperatureLineChartProvider temperatureLineChartProvider = this.f28124a.get();
            if (temperatureLineChartProvider == null) {
                LogUtil.a("KnitTemperatureLineChartProvider", "provider is destroy");
                return;
            }
            List list = obj instanceof List ? (List) obj : null;
            CommonUiBaseResponse commonUiBaseResponse = this.d.get();
            if (commonUiBaseResponse != null) {
                temperatureLineChartProvider.d((List<HiHealthData>) list, commonUiBaseResponse);
            } else {
                LogUtil.e("KnitTemperatureLineChartProvider", "BaseResponseCallback onResponse abort, response is null!");
            }
        }
    }
}
