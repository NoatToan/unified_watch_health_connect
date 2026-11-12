package com.huawei.ui.main.stories.health.sleep;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepBarChartView;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView;
import defpackage.ltb;
import defpackage.qnh;
import defpackage.uik;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Date;

/* JADX INFO: loaded from: classes43.dex */
public class SleepMonthBarLineChartProvider extends SleepBaseBarLineChartProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Observer f28075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uik f28076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f28077c;
    private c d;

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected int getCoreSleepType() {
        return 3;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected View initView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.mView == null) {
            this.mView = layoutInflater.inflate(R.layout.fragment_fitness_core_sleep_month_detail, viewGroup, false);
        }
        Bundle extra = getExtra();
        if (extra == null) {
            LogUtil.e("SleepMonthBarLineChartProvider", "getArguments is null ");
        } else {
            this.mLastTimestamp = extra.getLong("key_bundle_health_last_data_time", 0L);
            LogUtil.a("SleepMonthBarLineChartProvider", "mLastTimestamp= ", Long.valueOf(this.mLastTimestamp));
        }
        this.mHealthScrollView = (HealthScrollView) this.mView.findViewById(R.id.core_sleep_year_scrollview);
        this.mHealthScrollView.setScrollViewVerticalDirectionEvent(true);
        Activity activity = this.sleepActivityWeakReference.get();
        if (activity != null) {
            ScrollUtil.a(this.mHealthScrollView, activity.getWindow().getDecorView(), IEventListener.EVENT_ID_DEVICE_DLNA_CONN_SUCC);
        }
        ((CoreSleepServiceView) this.mView.findViewById(R.id.core_sleep_service_view)).setSleepViewCallback(this);
        return this.mView;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void showCurrentDate() {
        LogUtil.a("SleepMonthBarLineChartProvider", "Last Timestamp=", Long.valueOf(this.mLastTimestamp));
        Date dateD = ltb.d();
        if (this.mLastTimestamp > 0) {
            dateD = new Date(this.mLastTimestamp);
        }
        setEndDay(ltb.n(dateD));
        setStartDay(ltb.f(dateD));
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    public void showLastSleepData(CoreSleepBarChartView coreSleepBarChartView) {
        if (this.mLastTimestamp <= 0 || coreSleepBarChartView.acquireScrollAdapter() == null) {
            return;
        }
        int iH = qnh.h(qnh.i(this.mLastTimestamp));
        LogUtil.a("SleepMonthBarLineChartProvider", "startTimestamp=", Integer.valueOf(iH));
        coreSleepBarChartView.setShowRange(iH, coreSleepBarChartView.acquireScrollAdapter().acquireRange());
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected int getLayoutId() {
        return R.layout.fragment_fitness_core_sleep_month_detail;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected String getTag() {
        return "SleepMonthBarLineChartProvider";
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void requestData(boolean z) {
        d(z);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected DataInfos getDataInfo() {
        return DataInfos.CoreSleepMonthDetail;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected LinearLayout getConfiguredLayout() {
        return (LinearLayout) this.mView.findViewById(R.id.sleep_month_operation_config_layout);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected LinearLayout getMarketingLayout() {
        return (LinearLayout) this.mView.findViewById(R.id.sleep_month_operation_Marketing_layout);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        Observer observer = this.f28075a;
        if (observer != null) {
            ObserverManagerUtil.a(observer, "SleepYearBarLineChartProvider");
        }
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void initOtherView() {
        this.d = new c();
        this.f28076b = getInteractor();
        this.f28077c = getBaseHandler();
        Observer observer = new Observer() { // from class: com.huawei.ui.main.stories.health.sleep.SleepMonthBarLineChartProvider.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (objArr[0] instanceof Integer) {
                    SleepMonthBarLineChartProvider.this.mUiDataMap.put("YEAR_JUMP_TO_MONTH_TIME", objArr[0]);
                    SleepMonthBarLineChartProvider.this.mSleepChartData.e(SleepMonthBarLineChartProvider.this.mUiDataMap);
                    SleepMonthBarLineChartProvider.this.mSectionBean.c(SleepMonthBarLineChartProvider.this.mSleepChartData);
                }
            }
        };
        this.f28075a = observer;
        ObserverManagerUtil.d(observer, "SleepYearBarLineChartProvider");
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getNextEndDay() {
        return ltb.k(getEndDay());
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getNextStartDay() {
        return ltb.i(getStartDay());
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getPreviousStartDay() {
        return ltb.g(getStartDay());
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getPreviousEndDay() {
        return ltb.t(getEndDay());
    }

    public void d(boolean z) {
        ReleaseLogUtil.d("R_Sleep_SleepYearBarLineChartProvider", "Month SleepMonthDetail enter requestMonthDatas");
        Date startDay = getStartDay();
        if (startDay == null && !z) {
            showCurrentDate();
        }
        if (startDay != null) {
            uik uikVar = this.f28076b;
            if (uikVar != null) {
                uikVar.b(new Date[]{getStartDay(), getEndDay()}, getTag(), 3, false, (CommonUiBaseResponse) this.d);
            } else {
                LogUtil.a("SleepMonthBarLineChartProvider", "mInteractor is null!");
                setLoadingState(false);
            }
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepViewCallback
    public void sleepToTop() {
        this.mHealthScrollView.fullScroll(33);
    }

    static class c implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<SleepMonthBarLineChartProvider> f28078a;

        private c(SleepMonthBarLineChartProvider sleepMonthBarLineChartProvider) {
            this.f28078a = new WeakReference<>(sleepMonthBarLineChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            SleepMonthBarLineChartProvider sleepMonthBarLineChartProvider = this.f28078a.get();
            if (sleepMonthBarLineChartProvider == null) {
                return;
            }
            sleepMonthBarLineChartProvider.setLoadingState(false);
            if (i == 0 && obj != null) {
                LogUtil.a("SleepMonthBarLineChartProvider", "SleepMonthDetail requestSleepDetailUIData objData is not null!");
                LogUtil.d("SleepMonthBarLineChartProvider", "SleepMonthDetail data success objData = ", obj);
            }
            sleepMonthBarLineChartProvider.f28077c.sendEmptyMessage(6001);
        }
    }
}
