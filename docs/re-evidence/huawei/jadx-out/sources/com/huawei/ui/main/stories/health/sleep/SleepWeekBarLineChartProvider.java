package com.huawei.ui.main.stories.health.sleep;

import android.os.Handler;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepBarChartView;
import defpackage.ltb;
import defpackage.qnh;
import defpackage.uik;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes43.dex */
public class SleepWeekBarLineChartProvider extends SleepBaseBarLineChartProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uik f28083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f28084c;
    private Handler d;

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected int getCoreSleepType() {
        return 2;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void showCurrentDate() {
        Date date = new Date(System.currentTimeMillis());
        setEndDay(d(date));
        setStartDay(c(date));
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    public void showLastSleepData(CoreSleepBarChartView coreSleepBarChartView) {
        if (this.mLastTimestamp <= 0 || coreSleepBarChartView.acquireScrollAdapter() == null) {
            return;
        }
        int iH = qnh.h(qnh.o(this.mLastTimestamp));
        LogUtil.a("SleepWeekBarChartProvider", "startTimestamp=", Integer.valueOf(iH));
        coreSleepBarChartView.setShowRange(iH, coreSleepBarChartView.acquireScrollAdapter().acquireRange());
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected int getLayoutId() {
        return R.layout.fragment_fitness_core_sleep_week_detail;
    }

    public Date d(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(7, 1);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTime();
    }

    public Date c(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(7, 2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTime();
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected DataInfos getDataInfo() {
        return DataInfos.CoreSleepWeekDetail;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected LinearLayout getConfiguredLayout() {
        return (LinearLayout) this.mView.findViewById(R.id.sleep_week_operation_config_layout);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected LinearLayout getMarketingLayout() {
        return (LinearLayout) this.mView.findViewById(R.id.sleep_week_operation_marketing_layout);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void initOtherView() {
        this.f28084c = new c();
        this.f28083b = getInteractor();
        this.d = getBaseHandler();
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void requestData(boolean z) {
        a(z);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected String getTag() {
        return "SleepWeekBarChartProvider";
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getNextEndDay() {
        return new Date(ltb.a(getEndDay(), 7) * 1000);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getNextStartDay() {
        return new Date(ltb.a(getStartDay(), 7) * 1000);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getPreviousStartDay() {
        return new Date(ltb.a(getStartDay(), -7) * 1000);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getPreviousEndDay() {
        return new Date(ltb.a(getEndDay(), -7) * 1000);
    }

    public void a(boolean z) {
        LogUtil.a("SleepWeekBarChartProvider", "week enter requestWeekDatas");
        Date startDay = getStartDay();
        if (startDay == null && !z) {
            showCurrentDate();
        }
        if (startDay != null) {
            uik uikVar = this.f28083b;
            if (uikVar != null) {
                uikVar.b(new Date[]{getStartDay(), getEndDay()}, getTag(), 2, false, (CommonUiBaseResponse) this.f28084c);
            } else {
                LogUtil.a("SleepWeekBarChartProvider", "mInteractor is null! ");
                setLoadingState(false);
            }
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepViewCallback
    public void sleepToTop() {
        this.mHealthScrollView.fullScroll(33);
    }

    static class c implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SleepWeekBarLineChartProvider> f28085c;

        private c(SleepWeekBarLineChartProvider sleepWeekBarLineChartProvider) {
            this.f28085c = new WeakReference<>(sleepWeekBarLineChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            SleepWeekBarLineChartProvider sleepWeekBarLineChartProvider = this.f28085c.get();
            if (sleepWeekBarLineChartProvider == null) {
                return;
            }
            sleepWeekBarLineChartProvider.setLoadingState(false);
            if (i == 0 && obj != null) {
                LogUtil.a("SleepWeekBarChartProvider", "SleepWeekDetail requestSleepDetailUIData objData is not null!");
            }
            sleepWeekBarLineChartProvider.d.sendEmptyMessage(6001);
        }
    }
}
