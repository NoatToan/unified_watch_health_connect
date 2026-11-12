package com.huawei.ui.main.stories.fitness.activity.calorie;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.ActiveTipStringUtils;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.ClassType;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.MotionType;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.ActiveTargetActivity;
import com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity;
import com.huawei.ui.main.stories.fitness.views.base.chart.DayProgressBarScrollView;
import com.huawei.ui.main.stories.fitness.views.base.chart.DaySingleViewDataObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ICustomMotionTypeCalculator;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.UserEvent;
import com.huawei.up.model.UserInfomation;
import defpackage.ive;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qgm;
import defpackage.qhb;
import defpackage.qre;
import defpackage.qrs;
import defpackage.ujq;
import defpackage.wkb;
import health.compact.a.CommonUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class FitnessCalorieDetailActivity extends BaseStepDetailActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26643b;
    private DaySingleViewDataObserverView e;
    private DayProgressBarScrollView i;
    private long k;
    private List<Integer> o;
    private int t;
    private final Context d = BaseApplication.b();
    private final AtomicInteger l = new AtomicInteger();
    private final SparseIntArray f = new SparseIntArray();
    private final e s = new e(this);
    private ProportionView j = null;
    private List<ProportionView.ProportionItem> h = new ArrayList();
    private ProportionView.ProportionItem m = null;
    private ProportionView.ProportionItem r = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ProportionView.ProportionItem f26642a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProportionView.ProportionItem f26644c = null;
    private ProportionView.ProportionItem g = null;
    private LinearLayout p = null;
    private BaseStepDetailActivity.TextShowFormatter n = new BaseStepDetailActivity.TextShowFormatter() { // from class: com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity.1
        @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity.TextShowFormatter
        public String convertFloat2TextShow(float f) {
            if (f < 1.0f && f != 0.0f) {
                return HiDataFilter.DataFilterExpression.LESS_THAN + UnitUtil.e(1.0d, 1, 0);
            }
            return UnitUtil.e(f, 1, 0);
        }
    };

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(103);
        HiHealthNativeApi.a(this.d).subscribeHiHealthData(arrayList, new c(this));
        lrd.c(this.s);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("FitnessCalorieDetailActivity", "onDestroy");
        lrd.b(this.s);
        if (njy.b(this.o)) {
            HiHealthNativeApi.a(this.d).unSubscribeHiHealthData(this.o, new HiUnSubscribeListener() { // from class: twz
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("FitnessCalorieDetailActivity", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public View getExtensionView() {
        LinearLayout linearLayout = this.p;
        if (linearLayout != null) {
            return linearLayout;
        }
        this.p = new LinearLayout(this);
        this.j = new ProportionView(this);
        this.m = new ProportionView.e(this, Color.argb(255, 250, 168, 154));
        this.r = new ProportionView.b(this, Color.argb(255, 250, 149, UserInfomation.WEIGHT_DEFAULT_ENGLISH));
        this.f26642a = new ProportionView.c(this, Color.argb(255, 248, 129, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
        this.f26644c = new ProportionView.d(this, Color.argb(255, 246, 91, 64));
        this.g = new ProportionView.a(this, Color.argb(255, 245, 62, 31));
        this.h.add(this.m);
        this.h.add(this.r);
        this.h.add(this.f26642a);
        this.h.add(this.f26644c);
        this.h.add(this.g);
        this.j.e(this.h);
        this.j.setSubHeaderText(getResources().getString(R.string.IDS_fitness_subheader_title, getResources().getString(R.string.IDS_active_caloric)));
        this.p.setOrientation(1);
        this.p.addView(this.j, -1, -2);
        String strA = qre.a(R.string.IDS_heat_introduction_new_1, UnitUtil.e(300.0d, 1, 0), UnitUtil.e(260.0d, 1, 0));
        LayoutInflater layoutInflater = getLayoutInflater();
        if (layoutInflater != null) {
            ((HealthTextView) layoutInflater.inflate(R.layout.view_what_calorie, (ViewGroup) this.p, true).findViewById(R.id.card_view_what_heat_introduction)).setText(strA);
        }
        return this.p;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initStartArguement(Intent intent) {
        if (intent != null && intent.hasExtra("today_current_colories_total")) {
            this.mCurrentDayValueMinimum = intent.getIntExtra("today_current_colories_total", (int) this.mCurrentDayValueMinimum);
            this.mCurrentDayValueMinimum = (float) UnitUtil.d(this.mCurrentDayValueMinimum / 1000.0f, 0);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public int configSubTabStyle() {
        return R.layout.knit_sub_tab_widget_calorie;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initTitleBar() {
        this.mTitleBar.setTitleText(getString(R.string.IDS_active_caloric));
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(getString(R.string.IDS_privacy_all_data));
        setTitleBarRightButton(this, arrayList);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initActivityData() {
        qgm.c("900200007", new d(this));
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartListener() {
        this.mClassifiedViewList.e(new IOnDataShowListener() { // from class: com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity.2
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onUserEvent(UserEvent userEvent) {
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onDataShowChanged(DataInfos dataInfos, int i, int i2, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
                if (hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) {
                    FitnessCalorieDetailActivity.this.b((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart, dataInfos);
                    FitnessCalorieDetailActivity.this.a(dataInfos, i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
        ICustomMotionTypeCalculator iCustomMotionTypeCalculatorD = this.mChartLayerHolder.d();
        this.r.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.WALK));
        this.m.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.RUN));
        this.f26642a.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.BIKE));
        this.f26644c.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.CLIMB));
        ProportionView.ProportionItem proportionItem = this.g;
        float fCalculate = iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.SUM);
        float fCalculate2 = iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.WALK);
        float fCalculate3 = iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.RUN);
        proportionItem.setDataValue((((fCalculate - fCalculate2) - fCalculate3) - iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.BIKE)) - iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.CLIMB));
        this.j.e(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DataInfos dataInfos, long j) {
        if (dataInfos != null && dataInfos.isDayData()) {
            this.e.setTargetLayoutVisibility(0);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j * 60000);
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            long timeInMillis = calendar.getTimeInMillis();
            this.k = timeInMillis;
            if (lsl.aa(timeInMillis)) {
                this.f26643b = 0;
                this.e.setEditTargetVisibility(0);
                int i = this.l.get();
                if (i > 0) {
                    d(i);
                    return;
                } else {
                    qgm.c("900200007", new d(this));
                    return;
                }
            }
            this.f26643b = 8;
            this.e.setEditTargetVisibility(8);
            this.e.setTipVisibility(8);
            int i2 = this.f.get(HiDateUtil.d(this.k));
            if (i2 > 0) {
                d(i2);
                return;
            } else {
                qhb.c(this.k, "900200007", new a(this));
                return;
            }
        }
        this.e.setTargetLayoutVisibility(8);
        this.e.setTipVisibility(8);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartLayerHolderData(IChartLayerHolder iChartLayerHolder) {
        iChartLayerHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity.3
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public boolean isAccept(DataInfos dataInfos) {
                return dataInfos.isCaloriesData();
            }
        }, getString(R.string.IDS_band_data_sport_energy_unit));
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public BaseStepDetailActivity.TextShowFormatter getTextShowFormatter() {
        return this.n;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateDayClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateDayClassifiedView = super.onCreateDayClassifiedView(textShowFormatter);
        enableProgressClassifiedViewObserver(observeredClassifiedViewOnCreateDayClassifiedView);
        ScrollChartObserverView scrollChartObserverViewAcquireScrollChartObserverView = observeredClassifiedViewOnCreateDayClassifiedView.acquireScrollChartObserverView();
        if (!(scrollChartObserverViewAcquireScrollChartObserverView instanceof DaySingleViewDataObserverView)) {
            LogUtil.j("FitnessCalorieDetailActivity", "onCreateDayClassifiedView !(scrollChartObserverView instanceof DoubleViewDataObserverView)");
            return observeredClassifiedViewOnCreateDayClassifiedView;
        }
        DaySingleViewDataObserverView daySingleViewDataObserverView = (DaySingleViewDataObserverView) scrollChartObserverViewAcquireScrollChartObserverView;
        this.e = daySingleViewDataObserverView;
        this.mScrollChartObserverView = daySingleViewDataObserverView.c();
        RelativeLayout relativeLayoutD = this.e.d();
        if (relativeLayoutD instanceof DayProgressBarScrollView) {
            this.i = (DayProgressBarScrollView) relativeLayoutD;
        }
        if (!(this.mScrollChartObserverView instanceof ScrollChartObserverTotalDataView)) {
            LogUtil.j("FitnessCalorieDetailActivity", "onCreateDayClassifiedView", "!(scrollChartObserverViewCalorie instanceof ScrollChartObserverTotalDataView)");
            return observeredClassifiedViewOnCreateDayClassifiedView;
        }
        ((ScrollChartObserverTotalDataView) this.mScrollChartObserverView).b(new ScrollChartObserverTotalDataView.c(this.mCurrentDayValueMinimum, 40003, DataInfos.query(getClassType(), DateType.DATE_DAY)));
        return observeredClassifiedViewOnCreateDayClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateWeekClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateWeekClassifiedView = super.onCreateWeekClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateWeekClassifiedView, new BaseStepDetailActivity.b(qre.f(R.string.IDS_user_profile_achieve_sum), getString(R.string.IDS_band_data_sport_energy_unit), qre.f(R.string.IDS_daily_average), getString(R.string.IDS_band_data_sport_energy_unit)));
        return observeredClassifiedViewOnCreateWeekClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateMonthClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateMonthClassifiedView = super.onCreateMonthClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateMonthClassifiedView, new BaseStepDetailActivity.b(qre.f(R.string.IDS_user_profile_achieve_sum), getString(R.string.IDS_band_data_sport_energy_unit), qre.f(R.string.IDS_daily_average), getString(R.string.IDS_band_data_sport_energy_unit)));
        return observeredClassifiedViewOnCreateMonthClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateYearClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateYearClassifiedView = super.onCreateYearClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateYearClassifiedView, new HwHealthBaseScrollBarLineChart.DataRatioProvider() { // from class: com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity.4
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.DataRatioProvider
            public float computeRatio(int i) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((long) i) * 60000);
                calendar.set(5, 1);
                calendar.roll(5, -1);
                return calendar.get(5);
            }
        }, new BaseStepDetailActivity.b(qre.f(R.string.IDS_user_profile_achieve_sum), getString(R.string.IDS_band_data_sport_energy_unit), qre.f(R.string.IDS_daily_average), getString(R.string.IDS_band_data_sport_energy_unit)));
        return observeredClassifiedViewOnCreateYearClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ClassType getClassType() {
        return ClassType.TYPE_CALORIES;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueMinimum() {
        return this.mScrollChartObserverView.getContentTextView().getText().toString();
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueUnit() {
        return getString(R.string.IDS_band_data_sport_energy_unit);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void handleTitleBarRightButtonOnClick(int i) {
        LogUtil.a("FitnessCalorieDetailActivity", "PopViewList setOnClick position is ", Integer.valueOf(i));
        if (i == 0) {
            wkb.b(111, this);
        } else {
            LogUtil.j("FitnessCalorieDetailActivity", "PopViewList setOnClick position is else");
        }
    }

    public void a(float f, int i) {
        if (this.e == null || f < 0.0f) {
            LogUtil.j("FitnessCalorieDetailActivity", "updateTargetProgress mDayObserverView is null value ", Float.valueOf(f), " target ", Integer.valueOf(i));
            return;
        }
        updateTargetProgress(this.e.getTargetTextView(), (int) UnitUtil.d(f, 0), i, R.plurals.IDS_caloric_diff_kcals);
        this.e.setEditTargetOnClickListener(new View.OnClickListener() { // from class: txc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49750a.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        if (qrs.c(500)) {
            LogUtil.j("FitnessCalorieDetailActivity", "jumpTarget isFastClick");
        } else {
            ActiveTargetActivity.e(this, 2, 4);
        }
    }

    public void b(float f, int i) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.e;
        if (daySingleViewDataObserverView == null || i <= 0 || f < 0.0f) {
            LogUtil.j("FitnessCalorieDetailActivity", "updateTip mDayObserverView ", daySingleViewDataObserverView, " mTodayTarget ", Integer.valueOf(this.t), " target ", Integer.valueOf(i), " value ", Float.valueOf(f));
            return;
        }
        if (!lsl.aa(this.k) || WheelChairStateManager.a().d()) {
            this.e.setTipVisibility(8);
            return;
        }
        int iD = i - ((int) UnitUtil.d(f, 0));
        if (iD <= 0) {
            this.e.setTipVisibility(8);
            this.t = i;
        } else {
            if (isStopUpdateTargetTip(f, this.e)) {
                return;
            }
            a(i, iD);
        }
    }

    private void a(int i, int i2) {
        HashMap<String, String> mapD = ActiveTipStringUtils.d(i2 * 1000, ActiveTipStringUtils.TipType.CALORIES);
        String str = mapD.get("description_key");
        if (TextUtils.isEmpty(str)) {
            this.e.setTipVisibility(8);
            this.t = i;
            return;
        }
        final int iJ = CommonUtils.j(mapD.get("sport_type_key"));
        this.e.setTipVisibility(0);
        this.e.setTipText(str);
        this.e.setTipButton(R.color.active_caloric_focus, mapD.get("button_key"), new View.OnClickListener() { // from class: txa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49749b.a(iJ, view);
            }
        });
        if (i == this.t) {
            return;
        }
        this.t = i;
        ujq.c(0, 2, iJ, ActiveTipStringUtils.TipType.CALORIES);
    }

    public /* synthetic */ void a(int i, View view) {
        ujq.c(1, 2, i, ActiveTipStringUtils.TipType.CALORIES);
        if (ive.c().c(0, ive.c().b(i, -1, -1.0f, -1, 9), (ISportDataCallback) null, this, (String) null) == 0) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i) {
        HandlerExecutor.c(new Runnable() { // from class: twy
            @Override // java.lang.Runnable
            public final void run() {
                this.f49746b.e(i);
            }
        });
    }

    public /* synthetic */ void e(int i) {
        DayProgressBarScrollView dayProgressBarScrollView = this.i;
        if (dayProgressBarScrollView == null) {
            return;
        }
        if (i <= 0) {
            i = this.t;
        }
        dayProgressBarScrollView.c(i);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FitnessCalorieDetailActivity> f26649a;

        e(FitnessCalorieDetailActivity fitnessCalorieDetailActivity) {
            this.f26649a = new WeakReference<>(fitnessCalorieDetailActivity);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            FitnessCalorieDetailActivity fitnessCalorieDetailActivity = this.f26649a.get();
            if (fitnessCalorieDetailActivity != null && !fitnessCalorieDetailActivity.isFinishing() && !fitnessCalorieDetailActivity.isDestroyed()) {
                int i = fitnessCalorieDetailActivity.f26643b;
                LogUtil.a("FitnessCalorieDetailActivity", "TouchExplorationStateChangeListener onTouchExplorationStateChanged enabled ", Boolean.valueOf(z), " mEditTargetVisibility ", Integer.valueOf(i), " mDayObserverView ", fitnessCalorieDetailActivity.e);
                if (fitnessCalorieDetailActivity.e == null) {
                    return;
                }
                fitnessCalorieDetailActivity.e.setEditTargetAccessibilityVisibility(fitnessCalorieDetailActivity.f26643b);
                return;
            }
            ReleaseLogUtil.e("FitnessCalorieDetailActivity", "TouchExplorationStateChangeListener onTouchExplorationStateChanged activity ", fitnessCalorieDetailActivity);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<FitnessCalorieDetailActivity> f26648c;

        d(FitnessCalorieDetailActivity fitnessCalorieDetailActivity) {
            this.f26648c = new WeakReference<>(fitnessCalorieDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (!(obj instanceof Integer)) {
                LogUtil.j("FitnessCalorieDetailActivity", "TargetCallback onResponse object ", obj);
                return;
            }
            FitnessCalorieDetailActivity fitnessCalorieDetailActivity = this.f26648c.get();
            if (fitnessCalorieDetailActivity == null || fitnessCalorieDetailActivity.isFinishing() || fitnessCalorieDetailActivity.isDestroyed()) {
                LogUtil.j("FitnessCalorieDetailActivity", "TargetCallback onResponse activity ", fitnessCalorieDetailActivity);
                return;
            }
            fitnessCalorieDetailActivity.l.set(((Integer) obj).intValue() / 1000);
            fitnessCalorieDetailActivity.d(fitnessCalorieDetailActivity.l.get());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements ResponseCallback<List<HiHealthData>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<FitnessCalorieDetailActivity> f26647b;

        a(FitnessCalorieDetailActivity fitnessCalorieDetailActivity) {
            this.f26647b = new WeakReference<>(fitnessCalorieDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<HiHealthData> list) {
            if (CollectionUtils.a(list)) {
                LogUtil.j("FitnessCalorieDetailActivity", "HistoryTargetCallback onResponse list ", list);
                return;
            }
            HiHealthData hiHealthData = list.get(0);
            if (hiHealthData == null) {
                LogUtil.j("FitnessCalorieDetailActivity", "HistoryTargetCallback onResponse data is null");
                return;
            }
            FitnessCalorieDetailActivity fitnessCalorieDetailActivity = this.f26647b.get();
            if (fitnessCalorieDetailActivity != null && !fitnessCalorieDetailActivity.isFinishing() && !fitnessCalorieDetailActivity.isDestroyed()) {
                fitnessCalorieDetailActivity.f.append(HiDateUtil.d(hiHealthData.getStartTime()), hiHealthData.getInt("calorieGoalValue") / 1000);
                fitnessCalorieDetailActivity.d(fitnessCalorieDetailActivity.f.get(HiDateUtil.d(fitnessCalorieDetailActivity.k)));
            } else {
                LogUtil.j("FitnessCalorieDetailActivity", "HistoryTargetCallback onResponse activity ", fitnessCalorieDetailActivity);
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements HiSubscribeListener {
        private final WeakReference<FitnessCalorieDetailActivity> e;

        c(FitnessCalorieDetailActivity fitnessCalorieDetailActivity) {
            this.e = new WeakReference<>(fitnessCalorieDetailActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (CollectionUtils.a(list)) {
                LogUtil.j("FitnessCalorieDetailActivity", "ConfigGoalCallback onResult successList ", list);
                return;
            }
            FitnessCalorieDetailActivity fitnessCalorieDetailActivity = this.e.get();
            if (fitnessCalorieDetailActivity != null && !fitnessCalorieDetailActivity.isFinishing() && !fitnessCalorieDetailActivity.isDestroyed()) {
                fitnessCalorieDetailActivity.o = list;
            } else {
                LogUtil.j("FitnessCalorieDetailActivity", "ConfigGoalCallback onResult activity ", fitnessCalorieDetailActivity);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (i != 103) {
                LogUtil.j("FitnessCalorieDetailActivity", "ConfigGoalCallback onChange type ", Integer.valueOf(i));
            } else if ("900200007".equals(str)) {
                qgm.c("900200007", new d(this.e.get()));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
