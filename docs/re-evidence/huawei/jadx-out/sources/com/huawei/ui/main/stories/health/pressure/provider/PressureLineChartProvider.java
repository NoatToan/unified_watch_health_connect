package com.huawei.ui.main.stories.health.pressure.provider;

import android.content.Context;
import android.os.Bundle;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.data.KnitHealthDataChangeListener;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.BarChartRangeShowCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import defpackage.Cfor;
import defpackage.eej;
import defpackage.fop;
import defpackage.ltb;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qre;
import defpackage.uey;
import defpackage.uis;
import defpackage.uyb;
import defpackage.uyg;
import defpackage.wux;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class PressureLineChartProvider extends MajorProvider<uyg> implements BarChartRangeShowCallback, KnitHealthDataChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Integer> f28018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uis f28019b;
    private SectionBean h;
    private List<Integer> j;
    private uyg g = new uyg();
    private DataInfos e = DataInfos.NoDataPlaceHolder;
    private long f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28020c = true;
    private boolean i = true;
    private boolean d = false;

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void onDataInserted(long j) {
    }

    public PressureLineChartProvider() {
        ArrayList arrayList = new ArrayList();
        this.f28018a = arrayList;
        this.j = new ArrayList();
        arrayList.add(14);
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(arrayList, new fop(this, "PressureLineChartProvider"));
    }

    private HashMap<String, Object> d(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        Bundle extra = getExtra();
        Serializable serializable = extra != null ? extra.getSerializable("key_bundle_health_line_chart_data_infos") : null;
        DataInfos dataInfos = serializable instanceof DataInfos ? (DataInfos) serializable : DataInfos.NoDataPlaceHolder;
        this.e = dataInfos;
        map.put("DATA_INFO", dataInfos);
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.IDS_hw_pressure_day_average));
        arrayList.add(context.getString(R.string.IDS_hw_pressure_month_average));
        map.put("CURSOR_UP_AVERAGE_TEXT", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(qre.f(R.string.IDS_hw_pressure_relaxed));
        arrayList2.add(qre.f(R.string.IDS_hw_pressure_normal));
        arrayList2.add(qre.f(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_item_3));
        arrayList2.add(qre.f(R.string.IDS_hw_pressure_highly));
        map.put("CURSOR_UP_AVERAGE_STATUS", arrayList2);
        map.put("LEGEND_ONE_TEXT", qre.f(R.string.IDS_hw_pressure_relaxed));
        map.put("LEGEND_TWO_TEXT", qre.f(R.string.IDS_hw_pressure_normal));
        map.put("LEGEND_THREE_TEXT", qre.f(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_item_3));
        map.put("LEGEND_FOUR_TEXT", qre.f(R.string.IDS_hw_pressure_highly));
        Bundle extra2 = getExtra();
        DataInfos dataInfos2 = DataInfos.NoDataPlaceHolder;
        long j = 0;
        if (extra2 != null) {
            j = extra2.getLong("key_bundle_health_last_data_time", 0L);
            LogUtil.a("PressureLineChartProvider", "latestDataTime extra: ", String.valueOf(j));
            dataInfos2 = (DataInfos) extra2.getSerializable("key_bundle_health_line_chart_data_infos");
        }
        this.e = dataInfos2;
        this.f = j;
        map.put("START_TIME", Long.valueOf(j));
        map.put("DATA_INFO", dataInfos2);
        map.put("HEALTH_CHART_HOLDER", new uyb(context, this.e));
        map.put("RANGE_SHOW_CALL_BACK", this);
        return map;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("PressureLineChartProvider", "loadDefaultData : ", "START_TIME");
        this.h = sectionBean;
        HashMap<String, Object> mapD = d(BaseApplication.getContext());
        sectionBean.c(mapD);
        uyg uygVar = new uyg();
        uygVar.c(((Long) mapD.get("START_TIME")).longValue());
        sectionBean.c(uygVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.h = sectionBean;
        this.f28019b = new uis();
        LogUtil.a("PressureLineChartProvider", "mDataInfos: ", this.e);
        d();
        DataInfos dataInfos = this.e;
        if (dataInfos == null || !dataInfos.isDayData()) {
            return;
        }
        b(context);
    }

    private void d() {
        long jO = uey.a().o();
        LogUtil.a("PressureLineChartProvider", "refreshUi lastStorageTime: ", Long.valueOf(jO));
        if (jO != 0) {
            this.g.c(jO);
            this.h.c(this.g);
            this.i = true;
        }
        if (this.d) {
            this.d = false;
            uey.a().b(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.pressure.provider.PressureLineChartProvider.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("PressureLineChartProvider", "errorCode: ", Integer.valueOf(i));
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (njy.e(list)) {
                            return;
                        }
                        PressureLineChartProvider.this.g.c(((HiHealthData) list.get(0)).getStartTime());
                        PressureLineChartProvider.this.h.c(PressureLineChartProvider.this.g);
                        PressureLineChartProvider pressureLineChartProvider = PressureLineChartProvider.this;
                        pressureLineChartProvider.notifyMinorProviders(pressureLineChartProvider.g);
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, uyg uygVar) {
        map.put("FIRST_TIME_BIND", Boolean.valueOf(this.f28020c));
        if (!this.f28020c) {
            map.put("START_TIME", Long.valueOf(uygVar.b()));
        }
        map.put("TOAST_TEXT", uygVar.h());
        this.f28020c = false;
    }

    @Override // com.huawei.health.knit.section.listener.BarChartRangeShowCallback
    public void onRangeChange(int i, int i2) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        long millis2 = TimeUnit.MINUTES.toMillis(i2);
        long jC = ltb.c(millis);
        LogUtil.a("PressureLineChartProvider", "queryTimeInterval : ", Long.valueOf(millis), " -- ", Long.valueOf(millis2));
        if (qnh.s(millis)) {
            if (this.f != jC || this.i) {
                this.g.c(millis, millis2);
                this.g.c(this.e);
                this.f = jC;
                c();
                this.i = false;
            }
        }
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void onDataDeleted() {
        LogUtil.a("PressureLineChartProvider", "onDataDeleted");
        this.d = true;
    }

    @Override // com.huawei.health.knit.data.KnitHealthDataChangeListener
    public void setSubscribeList(List<Integer> list) {
        this.j = list;
    }

    static class b extends BaseCallback<PressureLineChartProvider> {
        private final int e;

        b(PressureLineChartProvider pressureLineChartProvider, int i) {
            super(pressureLineChartProvider);
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.huawei.ui.main.stories.health.pressure.provider.BaseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCall(PressureLineChartProvider pressureLineChartProvider, int i, Object obj) {
            int i2 = this.e;
            if (i2 == 2) {
                if (pressureLineChartProvider == null) {
                    return;
                }
                uyg uygVar = pressureLineChartProvider.g;
                uygVar.a(obj != null && (obj instanceof List) && ((List) obj).size() > 0);
                pressureLineChartProvider.notifyMinorProviders(uygVar);
                return;
            }
            if (i2 != 3) {
                LogUtil.e("PressureLineChartProvider", "error type");
                return;
            }
            if (i == -1) {
                pressureLineChartProvider.a();
                return;
            }
            if (i != 0 || !(obj instanceof String)) {
                LogUtil.e("PressureLineChartProvider", "checkWearPressSwitch errorCode is other.");
            } else if ("false".equals((String) obj)) {
                pressureLineChartProvider.a();
            }
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.j, new Cfor("PressureLineChartProvider_" + this.e));
    }

    private void c() {
        if (this.e.isDayData()) {
            this.f28019b.d(ltb.b(new Date(this.g.j())), 1, new b(this, 2));
            return;
        }
        if (this.e.isWeekData()) {
            this.f28019b.a(this.g.j() / 1000, this.g.a() / 1000, 2, new b(this, 2));
            return;
        }
        if (this.e.isMonthData()) {
            this.f28019b.a(this.g.j() / 1000, this.g.a() / 1000, 3, new b(this, 2));
        } else if (this.e.isYearData()) {
            this.f28019b.a(this.g.j() / 1000, this.g.a() / 1000, 4, new b(this, 2));
        } else {
            LogUtil.e("PressureLineChartProvider", "requestPressureData failed, cause unknown data type of dataInfos = ", this.e);
        }
    }

    private void b(Context context) {
        DeviceInfo deviceInfoC = mgg.c("PressureLineChartProvider");
        boolean isLogined = LoginInit.getInstance(context).getIsLogined();
        LogUtil.a("PressureLineChartProvider", "onResume ", "isLogin = ", Boolean.valueOf(isLogined));
        if (isLogined && deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            DeviceCapability deviceCapabilityC = eej.c();
            if (deviceCapabilityC == null) {
                LogUtil.a("PressureLineChartProvider", "capability is null");
                return;
            }
            boolean zIsSupportPressAutoMonitor = deviceCapabilityC.isSupportPressAutoMonitor();
            LogUtil.d("PressureLineChartProvider", "onResume ", "isSupportPressAutoMonitor = ", Boolean.valueOf(zIsSupportPressAutoMonitor));
            if (zIsSupportPressAutoMonitor) {
                mhs.a().getSwitchSetting("press_auto_monitor_switch_status", new b(this, 3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.g.d(BaseApplication.getContext().getString(R.string.IDS_hw_open_auto_pressure_detector_content, wux.e()));
        SectionBean sectionBean = this.h;
        if (sectionBean != null) {
            sectionBean.c(this.g);
        }
    }
}
