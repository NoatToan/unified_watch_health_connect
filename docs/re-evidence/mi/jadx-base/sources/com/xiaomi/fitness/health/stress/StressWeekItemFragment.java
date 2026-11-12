package com.xiaomi.fitness.health.stress;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import defpackage.bka;
import defpackage.jui;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressWeekItemFragment;", "Lcom/xiaomi/fitness/health/stress/StressDayWeekMonthItemFragment;", "Lcom/xiaomi/fitness/health/stress/StressViewModel;", "Lbka;", "", "initStressFaceChart", "()V", "refreshStressFaceView", "initViewBinding", "onInvisible", "", "getLayoutId", "()I", "layoutId", "getFragmentPosition", "fragmentPosition", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StressWeekItemFragment extends Hilt_StressWeekItemFragment<StressViewModel, bka> {
    @Override // com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment
    public int getFragmentPosition() {
        return 1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getLayoutRes() {
        return jui.L1;
    }

    @Override // com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment
    public void initStressFaceChart() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment
    public void initViewBinding() {
        setContainerView(((bka) getMBinding()).D);
        setMBarChartRecyclerView(((bka) getMBinding()).A);
        setRecyclerDetail(((bka) getMBinding()).C.C);
        setRecyclerStressDistribute(((bka) getMBinding()).C.D);
        setMDeviceListView(((bka) getMBinding()).C.A);
        setUnderstandCard(((bka) getMBinding()).C.E);
        setDataTitleView(((bka) getMBinding()).B);
        setHealthBannerCardSetView(((bka) getMBinding()).C.B);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797");
        Object[] objArr = new Object[8];
        objArr[0] = "name";
        objArr[1] = "stress_detail_page";
        objArr[2] = "page_fragment";
        objArr[3] = "week";
        objArr[4] = "title";
        objArr[5] = "压力";
        objArr[6] = "data";
        DailyStressReport mDailyStressReport = getMDailyStressReport();
        objArr[7] = (mDailyStressReport == null || mDailyStressReport.getAvgStress() != 0) ? "1" : "0";
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        super.onInvisible();
    }

    @Override // com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment
    public void refreshStressFaceView() {
    }
}
