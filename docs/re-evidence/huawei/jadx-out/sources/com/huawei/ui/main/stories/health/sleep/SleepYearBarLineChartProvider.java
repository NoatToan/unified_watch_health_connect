package com.huawei.ui.main.stories.health.sleep;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepBarChartView;
import com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils.AsyncSelectorSerialize;
import com.huawei.ui.main.stories.health.sleep.SleepYearBarLineChartProvider;
import defpackage.ltb;
import defpackage.qng;
import defpackage.qnh;
import defpackage.uik;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SleepYearBarLineChartProvider extends SleepBaseBarLineChartProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private uik f28086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f28087b;
    private Handler d;

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected int getCoreSleepType() {
        return 4;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void processJump(long j) {
        Activity activity = this.sleepActivityWeakReference.get();
        if (activity == null) {
            return;
        }
        AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(new Handler(Looper.getMainLooper())) { // from class: com.huawei.ui.main.stories.health.sleep.SleepYearBarLineChartProvider.1
            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils.AsyncSelectorSerialize
            public void onFailed(int i) {
            }

            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils.AsyncSelectorSerialize
            public void onSuccess(Map map) {
            }
        };
        asyncSelectorSerialize.add(new AnonymousClass5(j, (KnitSleepDetailActivity) activity));
        asyncSelectorSerialize.run();
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.sleep.SleepYearBarLineChartProvider$5, reason: invalid class name */
    public class AnonymousClass5 implements AsyncSelectorSerialize.Action {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KnitSleepDetailActivity f28089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f28090c;

        @Override // com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils.AsyncSelectorSerialize.Action
        public int getFailedValue() {
            return 0;
        }

        AnonymousClass5(long j, KnitSleepDetailActivity knitSleepDetailActivity) {
            this.f28090c = j;
            this.f28089b = knitSleepDetailActivity;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils.AsyncSelectorSerialize.Action
        public void execute(Map map) {
            qng qngVar = new qng();
            final long j = this.f28090c;
            final KnitSleepDetailActivity knitSleepDetailActivity = this.f28089b;
            qngVar.d(new ValueAnimator.AnimatorUpdateListener() { // from class: uzm
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SleepYearBarLineChartProvider.AnonymousClass5.e(j, knitSleepDetailActivity, valueAnimator);
                }
            }, 800);
        }

        public static /* synthetic */ void e(long j, KnitSleepDetailActivity knitSleepDetailActivity, ValueAnimator valueAnimator) {
            ObserverManagerUtil.e("SleepYearBarLineChartProvider", Integer.valueOf((int) (ltb.f(j) / 60000)));
            knitSleepDetailActivity.getViewPager().setCurrentItem(2);
        }
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void initOtherView() {
        this.f28087b = new b();
        this.f28086a = getInteractor();
        this.d = getBaseHandler();
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void showCurrentDate() {
        LogUtil.a("SleepYearBarLineChartProvider", "Last Timestamp=", Long.valueOf(this.mLastTimestamp));
        Date dateJ = ltb.j(new Date(this.mLastTimestamp > 0 ? this.mLastTimestamp : System.currentTimeMillis()));
        long jC = ltb.c(dateJ, -11);
        setEndDay(ltb.c(ltb.d(ltb.b(dateJ, 1), -1)));
        setStartDay(new Date(jC * 1000));
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    public void showLastSleepData(CoreSleepBarChartView coreSleepBarChartView) {
        if (this.mLastTimestamp <= 0 || coreSleepBarChartView.acquireScrollAdapter() == null) {
            return;
        }
        int iH = qnh.h(qnh.t(this.mLastTimestamp));
        LogUtil.a("SleepYearBarLineChartProvider", "startTimestamp=", Integer.valueOf(iH));
        coreSleepBarChartView.setShowRange(iH, coreSleepBarChartView.acquireScrollAdapter().acquireRange());
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected int getLayoutId() {
        return R.layout.fragment_fitness_coresleepbase_detail;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected LinearLayout getConfiguredLayout() {
        return (LinearLayout) this.mView.findViewById(R.id.sleep_year_operation_config_layout);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected String getTag() {
        return "SleepYearBarLineChartProvider";
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected LinearLayout getMarketingLayout() {
        return (LinearLayout) this.mView.findViewById(R.id.sleep_year_operation_marketing_layout);
    }

    public void c(boolean z) {
        if (!z) {
            setLoadingState(true);
        }
        LogUtil.a("SleepYearBarLineChartProvider", "SleepYearDetail enter requestYearDatas");
        Date startDay = getStartDay();
        if (startDay == null && !z) {
            showCurrentDate();
        }
        if (startDay != null) {
            uik uikVar = this.f28086a;
            if (uikVar == null) {
                LogUtil.a("SleepYearBarLineChartProvider", "mInteractor is null!");
            } else {
                uikVar.b(new Date[]{getStartDay(), getEndDay()}, getTag(), 4, false, (CommonUiBaseResponse) this.f28087b);
            }
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepViewCallback
    public void sleepToTop() {
        this.mHealthScrollView.fullScroll(33);
    }

    static class b implements CommonUiBaseResponse {
        private WeakReference<SleepYearBarLineChartProvider> d;

        private b(SleepYearBarLineChartProvider sleepYearBarLineChartProvider) {
            this.d = new WeakReference<>(sleepYearBarLineChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            SleepYearBarLineChartProvider sleepYearBarLineChartProvider = this.d.get();
            if (sleepYearBarLineChartProvider == null) {
                return;
            }
            if (i == 0 && obj != null) {
                LogUtil.a("SleepYearBarLineChartProvider", "SleepYearDetail objData is not null!");
            }
            sleepYearBarLineChartProvider.d.sendEmptyMessage(6001);
            sleepYearBarLineChartProvider.d.sendEmptyMessageDelayed(6002, 1L);
        }
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected void requestData(boolean z) {
        c(z);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getNextEndDay() {
        return new Date(ltb.c(getEndDay(), 12) * 1000);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getNextStartDay() {
        return new Date(ltb.c(getStartDay(), 12) * 1000);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getPreviousStartDay() {
        return new Date(ltb.c(getStartDay(), -12) * 1000);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected Date getPreviousEndDay() {
        return new Date(ltb.c(getEndDay(), -12) * 1000);
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected DataInfos getDataInfo() {
        return DataInfos.CoreSleepYearDetail;
    }

    @Override // com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider
    protected boolean getIfVerify(long j) {
        int iR = ltb.r(new Date(j));
        int iX = ltb.x(new Date(j));
        int iC = ltb.c();
        int iE = ltb.e();
        if (iX < iE) {
            return true;
        }
        return iX == iE && iR <= iC;
    }
}
