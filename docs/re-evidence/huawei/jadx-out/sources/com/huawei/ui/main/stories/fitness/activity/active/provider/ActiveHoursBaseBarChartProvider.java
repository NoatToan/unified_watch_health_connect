package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.ChartStatisticChangeCallback;
import com.huawei.health.knit.section.listener.OnMarkViewTextNotify;
import com.huawei.health.knit.section.listener.OnXRangeTextCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder;
import defpackage.ieg;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.qnh;
import defpackage.qnn;
import defpackage.qre;
import defpackage.qri;
import defpackage.tty;
import defpackage.vdo;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public abstract class ActiveHoursBaseBarChartProvider extends MajorProvider<tty> {
    private static final Long HALF_HOUR_TIME_MILLIS = 1800000L;
    private static final String TAG = "SCUI_ActiveHoursBaseBarChartProvider";
    private boolean isFirst;
    private Date lastReqDate;
    private tty mActiveHoursData;
    private final Context mAppContext;
    private HealthCalendar mCalendar;
    private b mCalendarSelectResponseCallback;
    private int mCurrentTimes;
    private String mCursorTime;
    private boolean mHasInsertCurTime;
    private boolean mIsCompleted;
    private long mRefreshTimestamp;
    private SectionBean mSectionBean;
    private int mStartTimestamp;
    private StepModuleBarChartHolder mStepModuleBarChartHolder;
    private String mTextDate;

    protected abstract DataInfos getDataInfo();

    protected abstract int getStartTimestamp(long j);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (tty) obj);
    }

    public ActiveHoursBaseBarChartProvider() {
        Context contextB = BaseApplication.b();
        this.mAppContext = contextB;
        this.mStartTimestamp = 0;
        this.lastReqDate = new Date();
        this.isFirst = true;
        this.mRefreshTimestamp = ieg.a(System.currentTimeMillis()) + HALF_HOUR_TIME_MILLIS.longValue();
        this.mStartTimestamp = getStartTimestamp(System.currentTimeMillis());
        this.mStepModuleBarChartHolder = new StepModuleBarChartHolder(contextB);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        this.mCalendarSelectResponseCallback = new b(this);
        this.mSectionBean = sectionBean;
        this.mActiveHoursData = new tty();
        Bundle extra = getExtra();
        if (extra != null) {
            long j = extra.getLong("default_time_millis");
            if (j > 0) {
                long jA = ieg.a(j) + HALF_HOUR_TIME_MILLIS.longValue();
                this.mRefreshTimestamp = jA;
                this.mStartTimestamp = getStartTimestamp(jA);
            }
        }
        sectionBean.c(this.mActiveHoursData);
        registerObserver();
    }

    public void parseParams(Context context, HashMap<String, Object> map, tty ttyVar) {
        LogUtil.a(TAG, "enter parseParams data is ", ttyVar.toString());
        map.clear();
        map.put("BAR_CHART_DATE_TEXT", this.mTextDate);
        if (getDataInfo().isDayData()) {
            map.put("BAR_CHART_LEGEND_ONE_TEXT", this.mIsCompleted ? new SpannableString(context.getResources().getString(R.string.IDS_completed)) : new SpannableString(context.getResources().getString(R.string.IDS_fitness_undone)));
        } else {
            map.put("BAR_CHART_LEGEND_ONE_TEXT", subTitleValueSpannable(context, context.getResources().getQuantityString(R.plurals.IDS_single_circle_active_target_desc, this.mCurrentTimes, UnitUtil.e(this.mCurrentTimes, 1, 0))));
        }
        map.put("BAR_CHART_PERIOD_STRING", this.mCursorTime);
        map.put("BAR_COMMON_START_TIME", Integer.valueOf(this.mStartTimestamp));
        long j = this.mRefreshTimestamp;
        if (j > 0) {
            map.put("BAR_COMMON_REFLESH_TIME", Long.valueOf(j));
        }
        map.put("BAR_COMMON_CHART_HOLDER", this.mStepModuleBarChartHolder);
        map.put("BAR_DATA_INFOS", getDataInfo());
        setOnXRangeSetCallback(map);
        setOnMarkViewTextNotify(context, map);
        setStatisticChangeCallback(map, ttyVar);
        setClickListener(map);
        this.mRefreshTimestamp = 0L;
    }

    private SpannableString subTitleValueSpannable(Context context, String str) {
        return UnitUtil.b(context, "\\d", str, R.style.health_chart_cursor_bar_sub_value, R.style.health_chart_cursor_bar_sub_unit);
    }

    private void setStatisticChangeCallback(HashMap<String, Object> map, final tty ttyVar) {
        map.put("BAR_OBSERVER_LABEL_CUMULATIVE_AVERAGE", new ChartStatisticChangeCallback() { // from class: tts
            @Override // com.huawei.health.knit.section.listener.ChartStatisticChangeCallback
            public final void onStatisticChange(int i, int i2) {
                this.f49658a.m1704x591d1a1f(ttyVar, i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setStatisticChangeCallback$0$com-huawei-ui-main-stories-fitness-activity-active-provider-ActiveHoursBaseBarChartProvider, reason: not valid java name */
    public /* synthetic */ void m1704x591d1a1f(tty ttyVar, int i, int i2) {
        LogUtil.a(TAG, "ChartStatisticChangeCallback cumulativeSum is", Integer.valueOf(i), "dailyAverage is", Integer.valueOf(i2));
        ttyVar.d(i);
        ttyVar.a(i2);
        notifyMinorProviders(ttyVar);
    }

    private void setOnXRangeSetCallback(HashMap<String, Object> map) {
        map.put("BAR_COMMON_MARK_CHANGE_CALL_BACK", new OnXRangeTextCallback() { // from class: ttz
            @Override // com.huawei.health.knit.section.listener.OnXRangeTextCallback
            public final void onRangeShow(int i, int i2, String str) {
                this.f49674a.m1703x91c72fde(i, i2, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setOnXRangeSetCallback$1$com-huawei-ui-main-stories-fitness-activity-active-provider-ActiveHoursBaseBarChartProvider, reason: not valid java name */
    public /* synthetic */ void m1703x91c72fde(int i, int i2, String str) {
        boolean zC;
        LogUtil.a(TAG, "OnXRangeTextCallback startx is", Integer.valueOf(i));
        LogUtil.a(TAG, "OnXRangeTextCallback endx is", Integer.valueOf(i2));
        long j = i;
        long millis = TimeUnit.MINUTES.toMillis(j);
        Date date = new Date(millis);
        long j2 = i2;
        Date date2 = new Date(TimeUnit.MINUTES.toMillis(j2));
        LogUtil.a(TAG, "OnXRangeTextCallback startxDate is", date);
        LogUtil.a(TAG, "OnXRangeTextCallback endxDate is", date2);
        if (getDataInfo() == DataInfos.ActiveHoursYearDetail) {
            zC = lsl.f(millis, this.lastReqDate.getTime());
        } else {
            zC = lsl.c(millis, this.lastReqDate.getTime());
        }
        if ((isInBegin(date) && !zC) || this.isFirst) {
            this.lastReqDate = date;
            LogUtil.a(TAG, "OnXRangeTextCallback startTime is", Long.valueOf(TimeUnit.MINUTES.toMillis(j)));
            this.isFirst = false;
        }
        if (str.equals(this.mTextDate)) {
            return;
        }
        this.mTextDate = str;
        if (lsl.c(TimeUnit.MINUTES.toMillis(j), TimeUnit.MINUTES.toMillis(j2))) {
            this.mCalendar = vdo.c(this.mCalendar, i);
        }
        SectionBean sectionBean = this.mSectionBean;
        sectionBean.c(sectionBean.d());
    }

    private void setOnMarkViewTextNotify(final Context context, HashMap<String, Object> map) {
        map.put("BAR_COMMON_MARK_TEXT_CALL_BACK", new OnMarkViewTextNotify() { // from class: ttw
            @Override // com.huawei.health.knit.section.listener.OnMarkViewTextNotify
            public final void onTextChanged(String str, List list, float f) {
                this.f49668a.m1702x59c75cd(context, str, list, f);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setOnMarkViewTextNotify$2$com-huawei-ui-main-stories-fitness-activity-active-provider-ActiveHoursBaseBarChartProvider, reason: not valid java name */
    public /* synthetic */ void m1702x59c75cd(Context context, String str, List list, float f) {
        if (getDataInfo().isYearData()) {
            this.mCursorTime = getYearTimeRange(str);
        } else {
            this.mCursorTime = str;
        }
        int iF = qnh.f((int) f);
        this.mCalendar = vdo.c(this.mCalendar, iF);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HwHealthMarkerView.d dVar = (HwHealthMarkerView.d) it.next();
            if (dVar != null) {
                HwHealthBaseEntry hwHealthBaseEntry = dVar.f23737a;
                if (hwHealthBaseEntry instanceof HwHealthBarEntry) {
                    float fD = qnn.d(((HwHealthBarEntry) hwHealthBaseEntry).acquireModel());
                    this.mIsCompleted = fD == 4.0f;
                    this.mCurrentTimes = Math.round(fD);
                } else {
                    this.mIsCompleted = false;
                    this.mCurrentTimes = 0;
                }
            }
        }
        setActiveHoursData(context, this.mIsCompleted, this.mCursorTime, TimeUnit.MINUTES.toMillis(iF));
        notifyMinorProviders(this.mActiveHoursData);
        this.mSectionBean.c(this.mActiveHoursData);
    }

    private boolean isInBegin(Date date) {
        boolean z = date.getHours() == 0 && date.getMinutes() == 0 && date.getSeconds() == 0;
        if (getDataInfo() != DataInfos.ActiveHoursYearDetail) {
            return z;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5) == 1 && z;
    }

    private void setClickListener(HashMap<String, Object> map) {
        map.put("BAR_CHART_CLICK_EVENT", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveHoursBaseBarChartProvider.3
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
                if ("BAR_CHART_CALENDAR_CLICK_EVENT".equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("calendar", ActiveHoursBaseBarChartProvider.this.mCalendar);
                    HealthCalendarActivity.c(BaseApplication.j(), bundle, ActiveHoursBaseBarChartProvider.this.mCalendarSelectResponseCallback);
                }
            }
        });
    }

    private void registerObserver() {
        if (getDataInfo().isDayData()) {
            ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveHoursBaseBarChartProvider.5
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    if (objArr == null || objArr.length <= 0 || objArr[0] == null) {
                        return;
                    }
                    ActiveHoursBaseBarChartProvider.this.handleObserverData(objArr);
                }
            }, "observer_label_mark_stand");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleObserverData(Object[] objArr) {
        Object obj = objArr[0];
        if (obj instanceof Long) {
            Long l = (Long) obj;
            long jLongValue = l.longValue();
            LogUtil.a(TAG, "handleObserverData time is ", l);
            this.mRefreshTimestamp = jLongValue;
            SectionBean sectionBean = this.mSectionBean;
            if (sectionBean != null) {
                sectionBean.c(sectionBean.d());
            }
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        if (getDataInfo().isDayData()) {
            ObserverManagerUtil.a("observer_label_mark_stand");
        }
        exitBiForSport();
    }

    private void exitBiForSport() {
        HashMap map = new HashMap(3);
        map.put("click", "1");
        map.put(CommonUtil.PAGE_TYPE, Integer.valueOf(this.mHasInsertCurTime ? 1 : 0));
        map.put("event", 2);
        lmf.d().c(this.mAppContext, AnalyticsValue.HEALTH_HOME_ACTIVE_HOUR_1040092.value(), map, 0);
    }

    private void setActiveHoursData(Context context, boolean z, String str, long j) {
        if (this.mActiveHoursData == null) {
            LogUtil.j(TAG, "setActiveHoursData mActiveHoursData is null");
            return;
        }
        String strF = qre.f(R.string.IDS_stand_now);
        int i = R.color.active_time_color;
        if (z) {
            strF = qre.f(R.string.IDS_active_standing);
            i = R.color.textColorSecondary;
        } else if (ieg.a(j) > ieg.a(System.currentTimeMillis())) {
            i = R.color.textColorSecondary;
        }
        SpannableString spannableString = new SpannableString(strF);
        qri.b(spannableString, strF, i);
        this.mActiveHoursData.b(spannableString);
        this.mActiveHoursData.a(str);
        this.mActiveHoursData.e(j);
        this.mActiveHoursData.d(z);
        setIsInsertCurrentHourTime(j, z);
    }

    private void setIsInsertCurrentHourTime(long j, boolean z) {
        if (j < ieg.a(System.currentTimeMillis()) || j > ieg.d(System.currentTimeMillis()) || !z) {
            return;
        }
        this.mHasInsertCurTime = true;
    }

    private String getYearTimeRange(String str) {
        return qre.a(R.string.IDS_active_daily_average, str);
    }

    static class b implements CommonUiBaseResponse {
        private WeakReference<ActiveHoursBaseBarChartProvider> d;

        b(ActiveHoursBaseBarChartProvider activeHoursBaseBarChartProvider) {
            this.d = new WeakReference<>(activeHoursBaseBarChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            ActiveHoursBaseBarChartProvider activeHoursBaseBarChartProvider = this.d.get();
            if (activeHoursBaseBarChartProvider == null) {
                LogUtil.j(ActiveHoursBaseBarChartProvider.TAG, "onResponse: provider is null");
                return;
            }
            if (i == 1 && (obj instanceof HealthCalendar)) {
                activeHoursBaseBarChartProvider.mCalendar = (HealthCalendar) obj;
                activeHoursBaseBarChartProvider.mStartTimestamp = qnh.h(qnh.b(activeHoursBaseBarChartProvider.mCalendar.transformCalendar().getTimeInMillis()));
                activeHoursBaseBarChartProvider.mRefreshTimestamp = activeHoursBaseBarChartProvider.mCalendar.transformCalendar().getTimeInMillis();
                if (activeHoursBaseBarChartProvider.mSectionBean != null) {
                    activeHoursBaseBarChartProvider.mSectionBean.c(activeHoursBaseBarChartProvider.mSectionBean.d());
                }
            }
        }
    }
}
