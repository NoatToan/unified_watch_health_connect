package com.xiaomi.fitness.health.calorie;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.base.BasicDataViewModel;
import defpackage.i4a;
import defpackage.jui;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/calorie/CalorieDayItemFragment;", "Lcom/xiaomi/fitness/health/calorie/CalorieBaseDayWeekMonthFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Li4a;", "", "initViewBinding", "()V", "onInvisible", "", "getFragmentPosition", "()I", "fragmentPosition", "getLayoutId", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CalorieDayItemFragment extends Hilt_CalorieDayItemFragment<BasicDataViewModel, i4a> {
    @Override // com.xiaomi.fitness.health.calorie.CalorieBaseDayWeekMonthFragment
    public int getFragmentPosition() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.calorie.CalorieBaseDayWeekMonthFragment
    public void initViewBinding() {
        setContainerView(((i4a) getMBinding()).D);
        setRecyclerView(((i4a) getMBinding()).B);
        setDataTitleView(((i4a) getMBinding()).A);
        setRecyclerCalorieDetail(((i4a) getMBinding()).C);
        setUnderstandCard(((i4a) getMBinding()).E);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797"), "name", "calorie_detail_page", "page_fragment", "day", "title", "卡路里", "data", getOneTrackReportData());
        super.onInvisible();
    }
}
