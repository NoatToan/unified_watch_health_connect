package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.content.Context;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.KnitHealthDataChangeListener;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.LineChartRangeShowCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.bloodpressure.chart.BloodPressureChartHolder;
import com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureLineChartProvider;
import defpackage.Cfor;
import defpackage.ezo;
import defpackage.fop;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qnh;
import defpackage.utk;
import defpackage.utl;
import defpackage.uwh;
import defpackage.vdd;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureLineChartProvider extends MajorProvider<utl> implements LineChartRangeShowCallback, KnitHealthDataChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SectionBean f27835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Integer> f27836c;
    private String e;
    private long k;
    private List<Integer> l;
    private String m;
    private long o;
    private utl d = new utl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataInfos f27834a = DataInfos.NoDataPlaceHolder;
    private long n = 0;
    private long i = -1;
    private boolean h = true;
    private boolean g = false;
    private boolean f = false;
    private boolean j = true;

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f27841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f27842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f27843c;
        long e;
    }

    static /* synthetic */ long b(BloodPressureLineChartProvider bloodPressureLineChartProvider) {
        long j = bloodPressureLineChartProvider.o - 1;
        bloodPressureLineChartProvider.o = j;
        return j;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        a(context, (HashMap<String, Object>) map, (utl) obj);
    }

    public BloodPressureLineChartProvider() {
        ArrayList arrayList = new ArrayList();
        this.f27836c = arrayList;
        this.l = new ArrayList();
        this.k = -1L;
        this.o = -1L;
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()));
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(arrayList, new fop(this, "BloodPressureLineChartProvider"));
    }

    private HashMap<String, Object> b(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        Bundle extra = getExtra();
        Serializable serializable = extra != null ? extra.getSerializable("key_bundle_health_line_chart_data_infos") : null;
        DataInfos dataInfos = serializable instanceof DataInfos ? (DataInfos) serializable : DataInfos.NoDataPlaceHolder;
        this.f27834a = dataInfos;
        map.put("DATA_INFO", dataInfos);
        long j = extra != null ? extra.getLong("key_marker_view_time") : 0L;
        if (j != 0) {
            map.put("key_marker_view_time", Long.valueOf(j));
        }
        List<String> listE = e(context);
        List<String> listC = c(context);
        map.put("CURSOR_UP_AVERAGE_TEXT", listE);
        map.put("CURSOR_UP_AVERAGE_UNIT", context.getString(R.string.IDS_device_measure_pressure_value_unit));
        map.put("CURSOR_DOWN_AVERAGE_TEXT", listC);
        map.put("CURSOR_DOWN_AVERAGE_UNIT", context.getResources().getQuantityString(R.plurals.IDS_hw_pulse_unit, 3).replace(TimeModel.NUMBER_FORMAT, ""));
        e(context, map);
        return map;
    }

    private void e(Context context, HashMap<String, Object> map) {
        map.put("LEFT_BOTTOM_LEGEND_SIGN", Integer.valueOf(ContextCompat.getColor(context, R.color.emui_color_fg_10)));
        map.put("LEFT_BOTTOM_LEGEND_TEXT", context.getString(R.string.IDS_hw_high_pressure));
        map.put("RIGHT_BOTTOM_LEGEND_SIGN", Integer.valueOf(ContextCompat.getColor(context, R.color.emui_color_fg_2)));
        map.put("RIGHT_BOTTOM_LEGEND_TEXT", context.getString(R.string.IDS_hw_low_pressure));
        Bundle extra = getExtra();
        DataInfos dataInfos = DataInfos.NoDataPlaceHolder;
        long jCurrentTimeMillis = 0;
        if (extra != null) {
            long j = extra.getLong("key_bundle_health_last_data_time", 0L);
            jCurrentTimeMillis = j == 0 ? System.currentTimeMillis() : j;
            dataInfos = (DataInfos) extra.getSerializable("key_bundle_health_line_chart_data_infos");
        }
        this.f27834a = dataInfos;
        this.d.b(dataInfos);
        this.n = jCurrentTimeMillis;
        map.put("START_TIME", Long.valueOf(jCurrentTimeMillis));
        map.put("DATA_INFO", dataInfos);
        map.put("HEALTH_CHART_HOLDER", new BloodPressureChartHolder(context));
        map.put("RANGE_SHOW_CALL_BACK", this);
    }

    private List<String> c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.IDS_hw_health_show_pulse_heart_bmp));
        arrayList.add(context.getString(R.string.IDS_hw_ave_pulse));
        return arrayList;
    }

    private List<String> e(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.IDS_hw_show_main_home_page_bloodpressure));
        arrayList.add(context.getString(R.string.IDS_hw_ave_blood_pressure));
        return arrayList;
    }

    private void e() {
        this.e = "KnitHealthData_Edit_" + this.f27834a;
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureLineChartProvider.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Long)) {
                    return;
                }
                BloodPressureLineChartProvider.this.k = ((Long) obj).longValue();
            }
        }, this.e);
        this.m = "KnitHealthData_MarkView_" + this.f27834a;
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureLineChartProvider.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (objArr == null || objArr.length <= 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Long) {
                    BloodPressureLineChartProvider.this.o = ((Long) obj).longValue();
                    if (BloodPressureLineChartProvider.this.i <= 0 || BloodPressureLineChartProvider.this.o <= BloodPressureLineChartProvider.this.i) {
                        return;
                    }
                    BloodPressureLineChartProvider.b(BloodPressureLineChartProvider.this);
                }
            }
        }, this.m);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.f27835b = sectionBean;
        HashMap<String, Object> mapB = b(BaseApplication.getContext());
        sectionBean.c(mapB);
        e();
        utl utlVar = new utl();
        utlVar.e(((Long) mapB.get("START_TIME")).longValue());
        sectionBean.c(utlVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void e(Context context, SectionBean sectionBean) {
        utk utkVar = new utk();
        long jC = ltb.c(this.n);
        utkVar.d(true, jC, d(jC), new a(this, 0, sectionBean, null));
    }

    public void a(Context context, HashMap<String, Object> map, utl utlVar) {
        map.put("FIRST_TIME_BIND", Boolean.valueOf(this.h));
        if (!this.h) {
            map.put("START_TIME", Long.valueOf(utlVar.h()));
        }
        this.h = false;
    }

    private long d(long j) {
        long jB = ltb.b(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jB);
        DataInfos dataInfos = this.f27834a;
        if (dataInfos == null) {
            LogUtil.j("BloodPressureLineChartProvider", "mDataInfos is null");
            return calendar.getTimeInMillis();
        }
        if (dataInfos.isDayData()) {
            LogUtil.a("BloodPressureLineChartProvider", "getQueryEndTime isDay");
        } else if (this.f27834a.isWeekData()) {
            calendar.add(5, 6);
        } else if (this.f27834a.isMonthData()) {
            calendar.add(2, 1);
            calendar.add(5, -1);
        } else {
            LogUtil.e("BloodPressureLineChartProvider", "getQueryEndTime failed, cause unknown data type of dataInfos = ", this.f27834a);
        }
        return calendar.getTimeInMillis();
    }

    @Override // com.huawei.health.knit.section.listener.LineChartRangeShowCallback
    public void onRangeChange(Context context, long j) {
        long j2;
        long jI;
        long jC = ltb.c(j);
        long jD = d(jC);
        if (qnh.s(j)) {
            if (this.n != jC || this.j) {
                c cVar = new c();
                cVar.f27843c = jC;
                cVar.f27841a = jD;
                if (b()) {
                    if (this.f27834a == DataInfos.BloodPressureWeekDetail) {
                        j2 = ezo.h(jC);
                    } else {
                        j2 = ezo.j(jC);
                    }
                    cVar.f27843c = j2;
                    if (this.f27834a == DataInfos.BloodPressureWeekDetail) {
                        jI = ezo.g(jC).longValue();
                    } else {
                        jI = ezo.i(jC);
                    }
                    cVar.f27841a = jI;
                }
                cVar.f27842b = jC;
                cVar.e = jD;
                new utk().d(true, cVar.f27843c, cVar.e, new a(this, 1, null, cVar));
                this.n = jC;
                this.i = jD;
                this.j = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, List<uwh>> c(List<uwh> list, c cVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        map.put(0, arrayList2);
        map.put(1, arrayList);
        if (!njy.e(list)) {
            for (uwh uwhVar : list) {
                long jG = uwhVar.g();
                if (jG >= cVar.f27843c && jG <= cVar.f27841a) {
                    arrayList.add(uwhVar);
                }
                if (jG >= cVar.f27842b && jG <= cVar.e) {
                    arrayList2.add(uwhVar);
                }
            }
        }
        return map;
    }

    private boolean b() {
        return this.f27834a == DataInfos.BloodPressureMonthDetail || this.f27834a == DataInfos.BloodPressureWeekDetail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<Integer, List<uwh>> map, c cVar) {
        this.d.d(map.get(1), cVar.f27843c, cVar.f27841a);
        this.d.b(map.get(0), cVar.f27842b, cVar.e);
        notifyMinorProviders(this.d);
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void onDataDeleted() {
        this.g = true;
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void onDataInserted(long j) {
        this.f = true;
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void setSubscribeList(List<Integer> list) {
        this.l = list;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.l, new Cfor("BloodPressureLineChartProvider_" + this.f27834a));
        ObserverManagerUtil.a(this.e);
        ObserverManagerUtil.a(this.m);
    }

    public static final class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BloodPressureLineChartProvider> f27839a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SectionBean> f27840c;
        private int d;
        private c e;

        public a(BloodPressureLineChartProvider bloodPressureLineChartProvider, int i, SectionBean sectionBean, c cVar) {
            this.f27839a = new WeakReference<>(bloodPressureLineChartProvider);
            this.d = i;
            this.f27840c = new WeakReference<>(sectionBean);
            this.e = cVar;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BloodPressureLineChartProvider bloodPressureLineChartProvider = this.f27839a.get();
            SectionBean sectionBean = this.f27840c.get();
            if (bloodPressureLineChartProvider == null) {
                LogUtil.e("BloodPressureLineChartProvider", "handle mReadType ", Integer.valueOf(this.d), ", failed! cause provider has gone!");
                return;
            }
            int i2 = this.d;
            if (i2 == 0) {
                if (sectionBean == null) {
                    LogUtil.a("BloodPressureLineChartProvider", "sectionBean is null");
                    return;
                } else {
                    d(bloodPressureLineChartProvider, sectionBean, obj);
                    return;
                }
            }
            if (i2 != 1) {
                LogUtil.e("BloodPressureLineChartProvider", "handle mReadType ", Integer.valueOf(i2), " is unknown!");
            } else {
                c(bloodPressureLineChartProvider, obj);
            }
        }

        private void c(BloodPressureLineChartProvider bloodPressureLineChartProvider, Object obj) {
            bloodPressureLineChartProvider.b((Map<Integer, List<uwh>>) bloodPressureLineChartProvider.c((List<uwh>) (obj instanceof List ? (List) obj : null), this.e), this.e);
        }

        private void d(BloodPressureLineChartProvider bloodPressureLineChartProvider, final SectionBean sectionBean, Object obj) {
            List list = obj instanceof List ? (List) obj : null;
            final utl utlVar = new utl();
            if (bloodPressureLineChartProvider.f) {
                utlVar.e(bloodPressureLineChartProvider.k >= 0 ? bloodPressureLineChartProvider.k : System.currentTimeMillis());
                bloodPressureLineChartProvider.k = -1L;
                bloodPressureLineChartProvider.f = false;
                sectionBean.c(utlVar);
            } else if (!njy.e(list) || !bloodPressureLineChartProvider.g) {
                if (bloodPressureLineChartProvider.g) {
                    long jG = vdd.c(list, bloodPressureLineChartProvider.o > 0 ? bloodPressureLineChartProvider.o : bloodPressureLineChartProvider.n).g();
                    bloodPressureLineChartProvider.g = false;
                    utlVar.e(jG);
                    sectionBean.c(utlVar);
                }
            } else {
                bloodPressureLineChartProvider.g = false;
                utk.d(new IBaseResponseCallback() { // from class: utq
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj2) {
                        BloodPressureLineChartProvider.a.b(utlVar, sectionBean, i, obj2);
                    }
                });
            }
            bloodPressureLineChartProvider.j = true;
        }

        public static /* synthetic */ void b(utl utlVar, SectionBean sectionBean, int i, Object obj) {
            if (obj instanceof List) {
                List list = (List) obj;
                if (njy.e(list)) {
                    return;
                }
                utlVar.e(((HiHealthData) list.get(0)).getStartTime());
                sectionBean.c(utlVar);
            }
        }
    }
}
