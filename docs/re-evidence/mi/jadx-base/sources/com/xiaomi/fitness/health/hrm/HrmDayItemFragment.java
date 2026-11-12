package com.xiaomi.fitness.health.hrm;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import defpackage.a8a;
import defpackage.jui;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrmDayItemFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmDayWeekMonthFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "La8a;", "", "initViewBinding", "()V", "onInvisible", "", "getFragmentPosition", "()I", "fragmentPosition", "getLayoutId", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HrmDayItemFragment extends Hilt_HrmDayItemFragment<HrmViewModel, a8a> {
    @Override // com.xiaomi.fitness.health.hrm.HrmDayWeekMonthFragment
    public int getFragmentPosition() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.hrm.HrmDayWeekMonthFragment
    public void initViewBinding() {
        setContainerView(((a8a) getMBinding()).C);
        setRecyclerView(((a8a) getMBinding()).E);
        setDataTitleView(((a8a) getMBinding()).A);
        setRecyclerDetail(((a8a) getMBinding()).D.F);
        setLowHrmRecycler(((a8a) getMBinding()).D.E);
        setHighHrmRecycler(((a8a) getMBinding()).D.D);
        setAbnormalFibRecycler(((a8a) getMBinding()).D.C);
        setRecyclerRateDistribute(((a8a) getMBinding()).D.G);
        setHrmPhoneRecordCard(((a8a) getMBinding()).D.B);
        setMUnderstandView(((a8a) getMBinding()).D.H);
        setHealthBannerCardSetView(((a8a) getMBinding()).D.A);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797"), "name", "heart_rate_detail_page", "page_fragment", "day", "title", "心率", "data", getOneTrackReportData());
        super.onInvisible();
    }
}
