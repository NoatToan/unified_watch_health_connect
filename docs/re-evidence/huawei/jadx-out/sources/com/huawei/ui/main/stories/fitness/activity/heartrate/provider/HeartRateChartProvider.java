package com.huawei.ui.main.stories.fitness.activity.heartrate.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.api.CombineChartRangeShowCallback;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HorizontalHeartRateDayActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder;
import com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder;
import com.huawei.ui.main.stories.fitness.views.base.chart.HwHealthDetailCombinedChart;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.heartrate.linechart.RestHeartRateLineChart;
import defpackage.Cfor;
import defpackage.fpv;
import defpackage.ftq;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.qnh;
import defpackage.qnn;
import defpackage.ueu;
import defpackage.uid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class HeartRateChartProvider extends MajorProvider<uid> implements CombineChartRangeShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwHealthBaseScrollBarLineChart f26926a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SectionBean f26928c;
    private Observer d;
    private Context e;
    private int h;
    private Observer l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataInfos f26927b = DataInfos.NoDataPlaceHolder;
    private long i = 0;
    private boolean f = true;
    private uid g = new uid();
    private final List<Integer> j = new ArrayList();

    private HashMap<String, Object> d(final Context context) {
        long jCurrentTimeMillis;
        if (this.d == null) {
            this.d = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.2
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    if (objArr != null) {
                        Object obj = objArr[0];
                        if (obj instanceof HwHealthBaseScrollBarLineChart) {
                            HeartRateChartProvider.this.f26926a = (HwHealthBaseScrollBarLineChart) obj;
                        }
                    }
                }
            };
        }
        ObserverManagerUtil.d(this.d, "SECTION_CHART");
        if (this.l == null) {
            this.l = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.1
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    if (objArr != null) {
                        Object obj = objArr[0];
                        if (obj instanceof Integer) {
                            HeartRateChartProvider.this.h = ((Integer) obj).intValue();
                        }
                    }
                }
            };
        }
        ObserverManagerUtil.d(this.l, "CARD_ITEM_INDEX");
        Bundle extra = getExtra();
        Serializable serializable = extra != null ? extra.getSerializable("key_bundle_health_line_chart_data_infos") : null;
        this.f26927b = serializable instanceof DataInfos ? (DataInfos) serializable : DataInfos.NoDataPlaceHolder;
        HashMap<String, Object> map = new HashMap<>();
        map.put("DATA_INFO", this.f26927b);
        if (extra != null) {
            jCurrentTimeMillis = extra.getLong("key_bundle_health_last_data_time", System.currentTimeMillis());
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.i = jCurrentTimeMillis;
        map.put("START_TIME", Long.valueOf(jCurrentTimeMillis));
        map.put("CURSOR_UP_AVERAGE_UNIT", context.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
        map.put("HORIZONTAL_BTN", Integer.valueOf(R.drawable.ic_full_screen));
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.4
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (str.equals("HORIZONTAL_BTN")) {
                    LogUtil.a("HeartRateGradualLineChartProvider", "horizontal jump onclick");
                    HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = HeartRateChartProvider.this.f26926a;
                    if (hwHealthBaseScrollBarLineChart == null) {
                        LogUtil.j("HeartRateGradualLineChartProvider", "horizontal jump failed, the context or chart is null");
                        return;
                    }
                    long jQueryMarkerViewTimeRangeMin = hwHealthBaseScrollBarLineChart.queryMarkerViewTimeRangeMin();
                    HashMap map2 = new HashMap(1);
                    map2.put("click", 1);
                    lmf.d().c(HeartRateChartProvider.this.e, AnalyticsValue.HEALTH_HEART_RATE_DAY_HORIZONTAL_2090011.value(), map2, 0);
                    Intent intent = new Intent(context, (Class<?>) HorizontalHeartRateDayActivity.class);
                    intent.putExtra(ObserveredClassifiedView.JUMP_TIME_ID, qnh.k(jQueryMarkerViewTimeRangeMin));
                    HeartRateChartProvider heartRateChartProvider = HeartRateChartProvider.this;
                    intent.putExtra(ObserveredClassifiedView.JUMP_DATA_LAYER_ID, heartRateChartProvider.b(heartRateChartProvider.h));
                    intent.putExtra(ObserveredClassifiedView.JUMP_DATA_TYPE, HeartRateChartProvider.this.f26927b);
                    try {
                        HeartRateChartProvider.this.e.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        LogUtil.e("HeartRateGradualLineChartProvider", "HorizontalHeartRateDayActivity", e.getMessage());
                    }
                }
            }
        });
        if (DataInfos.HeartRateDayDetail.equals(this.f26927b)) {
            HeartRateLineChartHolder heartRateLineChartHolder = new HeartRateLineChartHolder(context);
            map.put("HEALTH_CHART_HOLDER", heartRateLineChartHolder);
            map.put("CUSTOM_CALCULATOR", new ArrayList<ICustomCalculator>(heartRateLineChartHolder.a(), heartRateLineChartHolder.c(), heartRateLineChartHolder.e(), heartRateLineChartHolder.d(), heartRateLineChartHolder.b()) { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ICustomCalculator f26930a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ICustomCalculator f26931b;
                final /* synthetic */ ICustomCalculator d;
                final /* synthetic */ ICustomCalculator e;
                final /* synthetic */ ICustomCalculator g;

                {
                    this.g = iCustomCalculator;
                    this.f26931b = iCustomCalculator;
                    this.f26930a = iCustomCalculator;
                    this.d = iCustomCalculator;
                    this.e = iCustomCalculator;
                    add(iCustomCalculator);
                    add(iCustomCalculator);
                    add(iCustomCalculator);
                    add(iCustomCalculator);
                    add(iCustomCalculator);
                }
            });
        } else {
            HeartRateBarChartHolder heartRateBarChartHolder = new HeartRateBarChartHolder(context);
            map.put("HEALTH_CHART_HOLDER", heartRateBarChartHolder);
            map.put("CUSTOM_CALCULATOR", new ArrayList<ICustomCalculator>(heartRateBarChartHolder.a(), heartRateBarChartHolder.d(), heartRateBarChartHolder.g(), heartRateBarChartHolder.h()) { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.5

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ICustomCalculator f26936b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ICustomCalculator f26937c;
                final /* synthetic */ ICustomCalculator d;
                final /* synthetic */ ICustomCalculator e;

                {
                    this.d = iCustomCalculator;
                    this.f26937c = iCustomCalculator;
                    this.f26936b = iCustomCalculator;
                    this.e = iCustomCalculator;
                    add(iCustomCalculator);
                    add(iCustomCalculator);
                    add(iCustomCalculator);
                    add(iCustomCalculator);
                }
            });
        }
        map.put("RANGE_SHOW_CALL_BACK", this);
        map.put("COMBINED_RANGE_SHOW_CALL_BACK", this);
        ArrayList arrayList = new ArrayList();
        if (this.f26927b == DataInfos.HeartRateDayDetail) {
            arrayList.add(new RestHeartRateLineChart(context));
            arrayList.add(new RestHeartRateLineChart(context));
            arrayList.add(new RestHeartRateLineChart(context));
            arrayList.add(new RestHeartRateLineChart(context));
        } else {
            arrayList.add(new HwHealthDetailCombinedChart(context));
            arrayList.add(new HwHealthDetailCombinedChart(context));
            arrayList.add(new HwHealthDetailCombinedChart(context));
            arrayList.add(new HwHealthDetailCombinedChart(context));
        }
        map.put("SECTION_CHART", arrayList);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i) {
        if (i == 0) {
            return HwHealthChartHolder.LAYER_ID_NORMAL_HR;
        }
        if (i == 1) {
            return HwHealthChartHolder.LAYER_ID_REST_HR;
        }
        if (i == 2) {
            return HwHealthChartHolder.LAYER_ID_WARNING_HR;
        }
        if (i == 3) {
            return HwHealthChartHolder.LAYER_ID_BRADYCARDIA;
        }
        LogUtil.a("HeartRateGradualLineChartProvider", "acquireLayerId fail");
        return HwHealthChartHolder.LAYER_ID_NORMAL_HR;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.f26928c = sectionBean;
        HashMap<String, Object> mapD = d(BaseApplication.getContext());
        sectionBean.c(mapD);
        this.g.c(((Long) mapD.get("START_TIME")).longValue());
        sectionBean.c(this.g);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.e = context;
    }

    public void c(Map<Long, IStorageModel> map) {
        if (map == null || map.size() == 0) {
            this.g.e("--");
            return;
        }
        float fG = -2.1474836E9f;
        float fB = 2.1474836E9f;
        for (IStorageModel iStorageModel : map.values()) {
            if (iStorageModel instanceof StorageGenericModel) {
                StorageGenericModel storageGenericModel = (StorageGenericModel) iStorageModel;
                if (this.f26927b == DataInfos.HeartRateDayDetail) {
                    float f = qnn.f(storageGenericModel);
                    if (f > fG) {
                        fG = f;
                    }
                    if (f < fB) {
                        fB = f;
                    }
                } else {
                    fG = qnn.g(storageGenericModel);
                    fB = qnn.b(storageGenericModel);
                }
            }
        }
        this.g.e(((int) fB) + Constants.LINK + ((int) fG));
        notifyMinorProviders(this.g);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, uid uidVar) {
        map.put("FIRST_TIME_BIND", Boolean.valueOf(this.f));
        if (!this.f) {
            map.put("START_TIME", Long.valueOf(uidVar.e()));
        }
        this.f = false;
        long jR = lsl.r(this.i);
        long jC = lsl.c(this.i);
        HwHealthChartHolder.c cVar = new HwHealthChartHolder.c();
        cVar.a(this.f26927b);
        cVar.e(HwHealthChartHolder.LAYER_ID_NORMAL_HR);
        ftq.e().queryStepDayData(context, jR, jC, this.f26927b, cVar, new ResponseCallback<Map<Long, IStorageModel>>() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.6
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onResult(int i, Map<Long, IStorageModel> map2) {
                HeartRateChartProvider.this.c(map2);
            }
        });
        cVar.e(HwHealthChartHolder.LAYER_ID_REST_HR);
        ftq.e().queryStepDayData(context, jR, jC, this.f26927b, cVar, new ResponseCallback<Map<Long, IStorageModel>>() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.7
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onResult(int i, Map<Long, IStorageModel> map2) {
                HeartRateChartProvider.this.b(map2);
            }
        });
        cVar.e(HwHealthChartHolder.LAYER_ID_WARNING_HR);
        ftq.e().queryStepDayData(context, jR, jC, this.f26927b, cVar, new ResponseCallback<Map<Long, IStorageModel>>() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.9
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onResult(int i, Map<Long, IStorageModel> map2) {
                HeartRateChartProvider.this.a(map2);
            }
        });
        cVar.e(HwHealthChartHolder.LAYER_ID_BRADYCARDIA);
        ftq.e().queryStepDayData(context, jR, jC, this.f26927b, cVar, new ResponseCallback<Map<Long, IStorageModel>>() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateChartProvider.8
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResult(int i, Map<Long, IStorageModel> map2) {
                HeartRateChartProvider.this.e(map2);
            }
        });
    }

    public void b(Map<Long, IStorageModel> map) {
        if (map == null || map.size() == 0) {
            this.g.a("--");
            return;
        }
        float f = 0.0f;
        for (IStorageModel iStorageModel : map.values()) {
            if (iStorageModel instanceof StorageGenericModel) {
                f += qnn.f((StorageGenericModel) iStorageModel);
            }
        }
        this.g.a(String.valueOf((int) (f / map.size())));
        notifyMinorProviders(this.g);
    }

    public void e(Map<Long, IStorageModel> map) {
        if (map == null || map.size() == 0) {
            this.g.c("--");
            return;
        }
        int iC = Integer.MIN_VALUE;
        int iE = Integer.MAX_VALUE;
        for (IStorageModel iStorageModel : map.values()) {
            if (iStorageModel instanceof StorageGenericModel) {
                for (Object obj : ((StorageGenericModel) iStorageModel).e("BRADYCARDIA_DETAIL")) {
                    if (obj instanceof ueu) {
                        ueu ueuVar = (ueu) obj;
                        if (ueuVar.c() > iC) {
                            iC = ueuVar.c();
                        }
                        if (ueuVar.e() < iE) {
                            iE = ueuVar.e();
                        }
                    }
                }
            }
        }
        this.g.d(iE + Constants.LINK + iC);
        notifyMinorProviders(this.g);
    }

    public void a(Map<Long, IStorageModel> map) {
        if (map == null || map.size() == 0) {
            this.g.c("--");
            return;
        }
        int iC = Integer.MIN_VALUE;
        int iE = Integer.MAX_VALUE;
        for (IStorageModel iStorageModel : map.values()) {
            if (iStorageModel instanceof StorageGenericModel) {
                for (Object obj : ((StorageGenericModel) iStorageModel).e("HR_WARNING_DETAIL")) {
                    if (obj instanceof ueu) {
                        ueu ueuVar = (ueu) obj;
                        if (ueuVar.c() > iC) {
                            iC = ueuVar.c();
                        }
                        if (ueuVar.e() < iE) {
                            iE = ueuVar.e();
                        }
                    }
                }
            }
        }
        this.g.c(iE + Constants.LINK + iC);
        notifyMinorProviders(this.g);
    }

    @Override // com.huawei.health.knit.api.CombineChartRangeShowCallback
    public void onRangeChange(fpv fpvVar) {
        this.g.e(fpvVar.d());
        notifyMinorProviders(this.g);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.j, new Cfor("HeartRateGradualLineChartProvider_" + this.f26927b));
    }
}
