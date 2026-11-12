package com.xiaomi.fitness.health.hearing;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.base.BasicDataViewModel;
import defpackage.jui;
import defpackage.o7a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/hearing/HearingWeekItemFragment;", "Lcom/xiaomi/fitness/health/hearing/HearingDayWeekMonthItemFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Lo7a;", "", "initViewBinding", "()V", "onInvisible", "", "getFragmentPosition", "()I", "fragmentPosition", "getLayoutId", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HearingWeekItemFragment extends Hilt_HearingWeekItemFragment<BasicDataViewModel, o7a> {
    @Override // com.xiaomi.fitness.health.hearing.HearingDayWeekMonthItemFragment
    public int getFragmentPosition() {
        return 1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.hearing.HearingDayWeekMonthItemFragment
    public void initViewBinding() {
        setMBarChartRecyclerView(((o7a) getMBinding()).A);
        setDataTitleView(((o7a) getMBinding()).C);
        setTvVolumeCountTextView(((o7a) getMBinding()).F);
        setVolumeCard(((o7a) getMBinding()).B);
        setUnderstandCard(((o7a) getMBinding()).G);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797");
        Object[] objArr = new Object[8];
        objArr[0] = "name";
        objArr[1] = "hear_detail_page";
        objArr[2] = "page_fragment";
        objArr[3] = "week";
        objArr[4] = "title";
        objArr[5] = "听音";
        objArr[6] = "data";
        objArr[7] = getMHearingReport() == null ? "0" : "1";
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        super.onInvisible();
    }
}
