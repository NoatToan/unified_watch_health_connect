package com.xiaomi.fitness.health.runningindicator;

import com.xiaomi.fitness.base.BasicDataViewModel;
import defpackage.aba;
import defpackage.jui;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorWeekItemFragment;", "Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorBaseWeekMonthFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Laba;", "", "initViewBinding", "()V", "", "getFragmentPosition", "()I", "fragmentPosition", "getLayoutId", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RunningIndicatorWeekItemFragment extends RunningIndicatorBaseWeekMonthFragment<BasicDataViewModel, aba> {
    @Override // com.xiaomi.fitness.health.runningindicator.RunningIndicatorBaseWeekMonthFragment
    public int getFragmentPosition() {
        return 1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.F0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.runningindicator.RunningIndicatorBaseWeekMonthFragment
    public void initViewBinding() {
        setMLineChartRecyclerView(((aba) getMBinding()).B);
        setUnderstandCard(((aba) getMBinding()).E);
        setMDataTitleView(((aba) getMBinding()).A);
        setRunningIndicatorWidgetBinding(((aba) getMBinding()).D);
        setRunningIndicatorGradePrediction(((aba) getMBinding()).C);
    }
}
