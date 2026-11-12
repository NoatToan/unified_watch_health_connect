package com.huawei.ui.main.stories.fitness.activity.sportintensity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hms.mlsdk.asr.engine.AsrError;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.ActiveTipStringUtils;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.ClassType;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.scrollview.HealthNestedScrollView;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.ActiveTargetActivity;
import com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity;
import com.huawei.ui.main.stories.fitness.common.IChartLayerHolderProvider;
import com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper;
import com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder;
import com.huawei.ui.main.stories.fitness.views.base.chart.DayProgressBarScrollView;
import com.huawei.ui.main.stories.fitness.views.base.chart.DaySingleViewDataObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.UserEvent;
import defpackage.ive;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qgm;
import defpackage.qhb;
import defpackage.qqn;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.ujq;
import health.compact.a.CommonUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class FitnessSportIntensityDetailActivity extends BaseStepDetailActivity implements IChartLayerHolderProvider<StepModuleBarChartHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DaySingleViewDataObserverView f26998c;
    private long g;
    private DayProgressBarScrollView h;
    private List<Integer> i;
    private int k;
    private MarketingOption n;
    private final Context e = BaseApplication.b();
    private final AtomicInteger j = new AtomicInteger();
    private final SparseIntArray d = new SparseIntArray();
    private final a o = new a(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SportIntensityDataInteractor f26996a = new SportIntensityDataInteractor(this);
    private BaseStepDetailActivity.TextShowFormatter f = new BaseStepDetailActivity.TextShowFormatter() { // from class: com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity.2
        @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity.TextShowFormatter
        public String convertFloat2TextShow(float f) {
            return UnitUtil.e(f, 1, 0);
        }
    };

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initStartArguement(Intent intent) {
        if (intent == null) {
            LogUtil.e("Step_FitnessSportIntensityDetailActivity", "intent is null");
        } else if (intent.hasExtra("today_current_middle_and_high_total")) {
            this.mCurrentDayValueMinimum = intent.getIntExtra("today_current_middle_and_high_total", (int) this.mCurrentDayValueMinimum);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(7);
        if (this.mChartLayerHolder.acquireStorageHelper() instanceof StepModuleChartStorageHelper) {
            ((StepModuleChartStorageHelper) this.mChartLayerHolder.acquireStorageHelper()).b(arrayList);
        }
        d();
        b();
        this.mScrollView = (HealthNestedScrollView) findViewById(R.id.intensity_scroll_view);
        ScrollUtil.a(this.mScrollView, getWindow().getDecorView(), AsrError.SERVICE_OUT_CREDIT);
        e();
        j();
        f();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(103);
        HiHealthNativeApi.a(this.e).subscribeHiHealthData(arrayList2, new d(this));
        lrd.c(this.o);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        MarketingOption marketingOption = this.n;
        if (marketingOption != null) {
            marketingOption.cancel();
        }
        super.onDestroy();
        ReleaseLogUtil.d("Step_FitnessSportIntensityDetailActivity", "onDestroy");
        lrd.b(this.o);
        if (njy.b(this.i)) {
            HiHealthNativeApi.a(this.e).unSubscribeHiHealthData(this.i, new HiUnSubscribeListener() { // from class: uhe
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("Step_FitnessSportIntensityDetailActivity", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
    }

    private void e() {
        this.mMarketingLayout = (LinearLayout) findViewById(R.id.intensity_marketing_layout);
        BaseActivity.cancelLayoutById(this.mMarketingLayout);
        if (this.mMarketingApi != null) {
            this.n = new MarketingOption.Builder().setContext(this).setPageId(11).setLayoutMap(g()).build();
            this.mMarketingApi.requestMarketingResource(this.n);
        }
    }

    private void j() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.view_proportionSubHeader_title);
        HealthCardView healthCardView = (HealthCardView) findViewById(R.id.card_view_detail_data);
        HealthCardView healthCardView2 = (HealthCardView) findViewById(R.id.card_view_what_sports);
        setViewSafeRegion(true, healthTextView);
        setViewSafeRegion(true, healthCardView);
        setViewSafeRegion(true, healthCardView2);
        setViewSafeRegion(false, this.mMarketingLayout);
    }

    private Map<Integer, LinearLayout> g() {
        HashMap map = new HashMap();
        map.put(4018, this.mMarketingLayout);
        return map;
    }

    private void f() {
        HashMap map = new HashMap();
        map.put("intensity_total_time", Integer.valueOf((int) this.mCurrentDayValueMinimum));
        this.mMarketingApi.triggerMarketingResourceEvent(new MarketingOption.Builder().setContext(this).setPageId(11).setTypeId(100).setTriggerEventParams(map).build());
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartLayerHolderData(IChartLayerHolder iChartLayerHolder) {
        iChartLayerHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity.3
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public boolean isAccept(DataInfos dataInfos) {
                if (dataInfos != null) {
                    return dataInfos.isTimeStrengthData();
                }
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "isAccept failed, dataInfos is null");
                return false;
            }
        }, getString(R.string.IDS_hw_show_main_home_page_minutes));
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initSportIntensityData() {
        this.f26996a.a(this);
        a();
        c();
        i();
    }

    private void i() {
        Intent intent = new Intent(this, (Class<?>) DaemonService.class);
        intent.setAction("event_manual_ui");
        try {
            startService(intent);
        } catch (Exception e) {
            LogUtil.e("Step_FitnessSportIntensityDetailActivity", "update Sport Intensity calc", LogAnonymous.b(e));
        }
    }

    protected void c() {
        LogUtil.a("Step_FitnessSportIntensityDetailActivity", " requestDayData ");
        this.f26996a.b(lsl.r(System.currentTimeMillis()), lsl.c(System.currentTimeMillis()), 3);
    }

    private void d() {
        if (LanguageUtil.ba(this)) {
            ((ImageView) findViewById(R.id.fitness_detail_second_type_iv)).setBackground(qqz.e(this, R.mipmap.ic_health_list_run));
            ((ImageView) findViewById(R.id.fitness_detail_first_type_iv)).setBackground(qqz.e(this, R.mipmap.ic_health_list_walk));
            ((ImageView) findViewById(R.id.fitness_detail_third_type_iv)).setBackground(qqz.e(this, R.mipmap.ic_health_list_bike));
            ((ImageView) findViewById(R.id.fitness_detail_fourth_type_iv)).setBackground(qqz.e(this, R.mipmap.ic_train));
            ((ImageView) findViewById(R.id.fitness_detail_five_type_iv)).setBackground(qqz.e(this, R.mipmap.ic_health_list_other_sport));
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public int configSubTabStyle() {
        return R.layout.knit_sub_tab_widget_sport_intensity;
    }

    private void a() {
        this.mClassifiedViewList.e(new IOnDataShowListener() { // from class: com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity.5
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onUserEvent(UserEvent userEvent) {
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onDataShowChanged(DataInfos dataInfos, int i, int i2, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
                int i3;
                if (dataInfos == null) {
                    LogUtil.j("Step_FitnessSportIntensityDetailActivity", "onDataShowChanged failed, dataType is null");
                    return;
                }
                LogUtil.a("Step_FitnessSportIntensityDetailActivity", "onDataShowChanged，startX = ", Integer.valueOf(i), ",endX = ", Integer.valueOf(i2));
                long j = i;
                long j2 = j * 60000;
                long j3 = (((long) i2) * 60000) - 1;
                LogUtil.a("Step_FitnessSportIntensityDetailActivity", "startTime ", Long.valueOf(j2), "endTime ", Long.valueOf(j3));
                if (dataInfos.isMonthData()) {
                    i3 = 5;
                } else if (dataInfos.isYearData()) {
                    i3 = 6;
                } else {
                    i3 = dataInfos.isDayData() ? 3 : 4;
                }
                FitnessSportIntensityDetailActivity.this.f26996a.b(j2, j3, i3);
                FitnessSportIntensityDetailActivity.this.b(dataInfos, j, hwHealthBaseBarLineChart);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DataInfos dataInfos, long j, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        if (dataInfos != null && dataInfos.isDayData()) {
            this.f26998c.setTargetLayoutVisibility(0);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j * 60000);
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            long timeInMillis = calendar.getTimeInMillis();
            this.g = timeInMillis;
            if (lsl.aa(timeInMillis)) {
                this.f26997b = 0;
                this.f26998c.setEditTargetVisibility(0);
                int i = this.j.get();
                if (i > 0) {
                    b(i);
                    return;
                } else {
                    qgm.c("900200008", new c(this));
                    return;
                }
            }
            this.f26997b = 8;
            this.f26998c.setEditTargetVisibility(8);
            this.f26998c.setTipVisibility(8);
            int i2 = this.d.get(HiDateUtil.d(this.g));
            if (i2 > 0) {
                b(i2);
                return;
            } else {
                qhb.c(this.g, "900200008", new b(this));
                return;
            }
        }
        this.f26998c.setTargetLayoutVisibility(8);
        this.f26998c.setTipVisibility(8);
        int i3 = this.k;
        if (i3 <= 0 || !(hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart)) {
            return;
        }
        hwHealthBaseBarLineChart.enableManualReferenceLine(i3, qqn.d(R.color.active_workout_target));
        ((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart).reCalculateDynamicBoardForManualRefLine();
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public BaseStepDetailActivity.TextShowFormatter getTextShowFormatter() {
        return this.f;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateDayClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateDayClassifiedView = super.onCreateDayClassifiedView(textShowFormatter);
        enableProgressClassifiedViewObserver(observeredClassifiedViewOnCreateDayClassifiedView);
        ScrollChartObserverView scrollChartObserverViewAcquireScrollChartObserverView = observeredClassifiedViewOnCreateDayClassifiedView.acquireScrollChartObserverView();
        if (scrollChartObserverViewAcquireScrollChartObserverView instanceof DaySingleViewDataObserverView) {
            DaySingleViewDataObserverView daySingleViewDataObserverView = (DaySingleViewDataObserverView) scrollChartObserverViewAcquireScrollChartObserverView;
            this.f26998c = daySingleViewDataObserverView;
            this.mScrollChartObserverView = daySingleViewDataObserverView.c();
            RelativeLayout relativeLayoutD = this.f26998c.d();
            if (relativeLayoutD instanceof DayProgressBarScrollView) {
                this.h = (DayProgressBarScrollView) relativeLayoutD;
            }
            if (this.mScrollChartObserverView instanceof ScrollChartObserverTotalDataView) {
                ((ScrollChartObserverTotalDataView) this.mScrollChartObserverView).b(new ScrollChartObserverTotalDataView.c(this.mCurrentDayValueMinimum, 47101, DataInfos.query(getClassType(), DateType.DATE_DAY)));
                return observeredClassifiedViewOnCreateDayClassifiedView;
            }
        }
        return observeredClassifiedViewOnCreateDayClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateWeekClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateWeekClassifiedView = super.onCreateWeekClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateWeekClassifiedView, new BaseStepDetailActivity.b(getString(R.string.IDS_user_profile_achieve_sum), getString(R.string.IDS_hw_show_main_home_page_minutes), qre.f(R.string.IDS_daily_average), getString(R.string.IDS_hw_show_main_home_page_minutes)));
        return observeredClassifiedViewOnCreateWeekClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateMonthClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateMonthClassifiedView = super.onCreateMonthClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateMonthClassifiedView, new BaseStepDetailActivity.b(getString(R.string.IDS_user_profile_achieve_sum), getString(R.string.IDS_hw_show_main_home_page_minutes), qre.f(R.string.IDS_daily_average), getString(R.string.IDS_hw_show_main_home_page_minutes)));
        return observeredClassifiedViewOnCreateMonthClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateYearClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateYearClassifiedView = super.onCreateYearClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateYearClassifiedView, new HwHealthBaseScrollBarLineChart.DataRatioProvider() { // from class: com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity.1
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.DataRatioProvider
            public float computeRatio(int i) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((long) i) * 60000);
                calendar.set(5, 1);
                calendar.roll(5, -1);
                return calendar.get(5);
            }
        }, new BaseStepDetailActivity.b(getString(R.string.IDS_user_profile_achieve_sum), getString(R.string.IDS_hw_show_main_home_page_minutes), qre.f(R.string.IDS_daily_average), getString(R.string.IDS_hw_show_main_home_page_minutes)));
        return observeredClassifiedViewOnCreateYearClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initTitleBar() {
        this.mTitleBar.setTitleText(getString(R.string.IDS_active_workout));
        this.mTitleBar.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_health_toolbar_help), qre.f(R.string.IDS_lactate_tittlebar_top));
        this.mTitleBar.setRightButtonClickable(true);
        this.mTitleBar.setRightButtonVisibility(8);
        this.mTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.a("Step_FitnessSportIntensityDetailActivity", "click too fast");
                    return;
                }
                FitnessSportIntensityDetailActivity.this.startActivity(new Intent(FitnessSportIntensityDetailActivity.this, (Class<?>) SportIntensityExplain.class));
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(FitnessSportIntensityDetailActivity.this.getApplicationContext(), AnalyticsValue.HEALTH_TIME_STRENGTH_CLICK_2010090.value(), map, 0);
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ClassType getClassType() {
        return ClassType.TYPE_STRENGTH_TIME;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public int getContentView() {
        return R.layout.activity_time_strength_detail_layout;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initActivityData() {
        qgm.c("900200008", new c(this));
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueMinimum() {
        return this.mScrollChartObserverView.getContentTextView().getText().toString();
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueUnit() {
        return getString(R.string.IDS_hw_show_main_home_page_minutes);
    }

    private void b() {
        if (LanguageUtil.aj(this.e) || LanguageUtil.k(this.e)) {
            ((HealthTextView) findViewById(R.id.fitness_detail_total_run_unit_tv)).setTextSize(0, qrs.d(this.e, 10.0f));
            ((HealthTextView) findViewById(R.id.fitness_detail_total_walk_unit_tv)).setTextSize(0, qrs.d(this.e, 10.0f));
            ((HealthTextView) findViewById(R.id.fitness_detail_total_ride_unit_tv)).setTextSize(0, qrs.d(this.e, 10.0f));
            ((HealthTextView) findViewById(R.id.fitness_detail_total_train_unit_tv)).setTextSize(0, qrs.d(this.e, 10.0f));
            ((HealthTextView) findViewById(R.id.fitness_detail_total_other_unit_tv)).setTextSize(0, qrs.d(this.e, 10.0f));
        }
    }

    public void d(int i, int i2) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.f26998c;
        if (daySingleViewDataObserverView == null || i < 0) {
            LogUtil.j("Step_FitnessSportIntensityDetailActivity", "updateTargetProgress mDayObserverView is null value ", Integer.valueOf(i), " target ", Integer.valueOf(i2));
        } else {
            updateTargetProgress(daySingleViewDataObserverView.getTargetTextView(), i, i2, R.plurals.IDS_min_insert_unit);
            this.f26998c.setEditTargetOnClickListener(new View.OnClickListener() { // from class: uhh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50093b.e(view);
                }
            });
        }
    }

    public /* synthetic */ void e(View view) {
        if (qrs.c(500)) {
            LogUtil.j("Step_FitnessSportIntensityDetailActivity", "jumpTarget isFastClick");
        } else {
            ActiveTargetActivity.e(this, 3, 2);
        }
    }

    public void b(int i, int i2) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.f26998c;
        if (daySingleViewDataObserverView == null || i2 <= 0 || i < 0) {
            LogUtil.j("Step_FitnessSportIntensityDetailActivity", "updateTip mDayObserverView ", daySingleViewDataObserverView, " mTodayTarget ", Integer.valueOf(this.k), " target ", Integer.valueOf(i2), " value ", Integer.valueOf(i));
            return;
        }
        if (!lsl.aa(this.g) || WheelChairStateManager.a().d()) {
            this.f26998c.setTipVisibility(8);
            return;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            this.f26998c.setTipVisibility(8);
            this.k = i2;
        } else {
            if (isStopUpdateTargetTip(i, this.f26998c)) {
                return;
            }
            c(i2, i3);
        }
    }

    private void c(int i, int i2) {
        HashMap<String, String> mapD = ActiveTipStringUtils.d(i2, ActiveTipStringUtils.TipType.WORKOUT);
        String str = mapD.get("description_key");
        if (TextUtils.isEmpty(str)) {
            this.f26998c.setTipVisibility(8);
            this.k = i;
            return;
        }
        final int iJ = CommonUtils.j(mapD.get("sport_type_key"));
        this.f26998c.setTipVisibility(0);
        this.f26998c.setTipText(str);
        this.f26998c.setTipButton(R.color.active_workout_focus, mapD.get("button_key"), new View.OnClickListener() { // from class: uhc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(iJ, view);
            }
        });
        if (i == this.k) {
            return;
        }
        this.k = i;
        ujq.c(0, 3, iJ, ActiveTipStringUtils.TipType.WORKOUT);
    }

    public /* synthetic */ void d(int i, View view) {
        ujq.c(1, 3, i, ActiveTipStringUtils.TipType.WORKOUT);
        if (ive.c().c(0, ive.c().b(i, -1, -1.0f, -1, 10), (ISportDataCallback) null, this, (String) null) == 0) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        HandlerExecutor.c(new Runnable() { // from class: uhd
            @Override // java.lang.Runnable
            public final void run() {
                this.f50086c.d(i);
            }
        });
    }

    public /* synthetic */ void d(int i) {
        DayProgressBarScrollView dayProgressBarScrollView = this.h;
        if (dayProgressBarScrollView == null) {
            return;
        }
        if (i <= 0) {
            i = this.k;
        }
        dayProgressBarScrollView.c(i);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<FitnessSportIntensityDetailActivity> f27002c;

        a(FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity) {
            this.f27002c = new WeakReference<>(fitnessSportIntensityDetailActivity);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity = this.f27002c.get();
            if (fitnessSportIntensityDetailActivity != null && !fitnessSportIntensityDetailActivity.isFinishing() && !fitnessSportIntensityDetailActivity.isDestroyed()) {
                int i = fitnessSportIntensityDetailActivity.f26997b;
                LogUtil.a("Step_FitnessSportIntensityDetailActivity", "TouchExplorationStateChangeListener onTouchExplorationStateChanged enabled ", Boolean.valueOf(z), " mEditTargetVisibility ", Integer.valueOf(i), " mDayObserverView ", fitnessSportIntensityDetailActivity.f26998c);
                if (fitnessSportIntensityDetailActivity.f26998c == null) {
                    return;
                }
                fitnessSportIntensityDetailActivity.f26998c.setEditTargetAccessibilityVisibility(fitnessSportIntensityDetailActivity.f26997b);
                return;
            }
            ReleaseLogUtil.e("Step_FitnessSportIntensityDetailActivity", "TouchExplorationStateChangeListener onTouchExplorationStateChanged activity ", fitnessSportIntensityDetailActivity);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements IBaseResponseCallback {
        private final WeakReference<FitnessSportIntensityDetailActivity> e;

        c(FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity) {
            this.e = new WeakReference<>(fitnessSportIntensityDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (!(obj instanceof Integer)) {
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "TargetCallback onResponse object ", obj);
                return;
            }
            FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity = this.e.get();
            if (fitnessSportIntensityDetailActivity == null || fitnessSportIntensityDetailActivity.isFinishing() || fitnessSportIntensityDetailActivity.isDestroyed()) {
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "TargetCallback onResponse activity ", fitnessSportIntensityDetailActivity);
                return;
            }
            fitnessSportIntensityDetailActivity.j.set(((Integer) obj).intValue());
            fitnessSportIntensityDetailActivity.b(fitnessSportIntensityDetailActivity.j.get());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements ResponseCallback<List<HiHealthData>> {
        private final WeakReference<FitnessSportIntensityDetailActivity> e;

        b(FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity) {
            this.e = new WeakReference<>(fitnessSportIntensityDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<HiHealthData> list) {
            if (njy.e(list)) {
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "HistoryTargetCallback onResponse list ", list);
                return;
            }
            HiHealthData hiHealthData = list.get(0);
            if (hiHealthData == null) {
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "HistoryTargetCallback onResponse data is null");
                return;
            }
            FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity = this.e.get();
            if (fitnessSportIntensityDetailActivity != null && !fitnessSportIntensityDetailActivity.isFinishing() && !fitnessSportIntensityDetailActivity.isDestroyed()) {
                fitnessSportIntensityDetailActivity.d.append(HiDateUtil.d(hiHealthData.getStartTime()), hiHealthData.getInt("durationGoalValue"));
                fitnessSportIntensityDetailActivity.b(fitnessSportIntensityDetailActivity.d.get(HiDateUtil.d(fitnessSportIntensityDetailActivity.g)));
            } else {
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "HistoryTargetCallback onResponse activity ", fitnessSportIntensityDetailActivity);
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<FitnessSportIntensityDetailActivity> f27003c;

        d(FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity) {
            this.f27003c = new WeakReference<>(fitnessSportIntensityDetailActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.e(list)) {
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "ConfigGoalCallback onResult successList ", list);
                return;
            }
            FitnessSportIntensityDetailActivity fitnessSportIntensityDetailActivity = this.f27003c.get();
            if (fitnessSportIntensityDetailActivity != null && !fitnessSportIntensityDetailActivity.isFinishing() && !fitnessSportIntensityDetailActivity.isDestroyed()) {
                fitnessSportIntensityDetailActivity.i = list;
            } else {
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "ConfigGoalCallback onResult activity ", fitnessSportIntensityDetailActivity);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (i != 103) {
                LogUtil.j("Step_FitnessSportIntensityDetailActivity", "ConfigGoalCallback onChange type ", Integer.valueOf(i));
            } else if ("900200008".equals(str)) {
                qgm.c("900200008", new c(this.f27003c.get()));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
