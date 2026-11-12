package com.xiaomi.fitness.health.stand;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import defpackage.aia;
import defpackage.jui;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/stand/StandDayItemFragment;", "Lcom/xiaomi/fitness/health/stand/StandDayWeekMonthFragment;", "Lcom/xiaomi/fitness/health/stand/StandViewModel;", "Laia;", "", "initViewBinding", "()V", "onInvisible", "", "getFragmentPosition", "()I", "fragmentPosition", "getLayoutId", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StandDayItemFragment extends Hilt_StandDayItemFragment<StandViewModel, aia> {
    @Override // com.xiaomi.fitness.health.stand.StandDayWeekMonthFragment
    public int getFragmentPosition() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.l1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.stand.StandDayWeekMonthFragment
    public void initViewBinding() {
        setContainerView(((aia) getMBinding()).D);
        setBarChartRecyclerView(((aia) getMBinding()).C);
        setRecyclerDetail(((aia) getMBinding()).B.A);
        setUnderstandCard(((aia) getMBinding()).B.C);
        setDataTitleView(((aia) getMBinding()).A);
        setStandManualSetView(((aia) getMBinding()).B.B);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797"), "name", "stand_detail_page", "page_fragment", "day", "title", "有效站立", "data", getOneTrackReportData());
        super.onInvisible();
    }
}
