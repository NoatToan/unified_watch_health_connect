package com.xiaomi.fitness.health.bloodglucose.ui;

import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import defpackage.g3a;
import defpackage.jui;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseFingerMonthItemFragment;", "Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseFingerBaseWeekMonthFragment;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "Lg3a;", "", "initViewBinding", "()V", "", "getLayoutId", "()I", "layoutId", "getFragmentPosition", "fragmentPosition", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseFingerMonthItemFragment extends Hilt_BloodGlucoseFingerMonthItemFragment<BloodGlucoseViewModel, g3a> {
    @Override // com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerBaseWeekMonthFragment
    public int getFragmentPosition() {
        return 2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerBaseWeekMonthFragment
    public void initViewBinding() {
        setContainerView(((g3a) getMBinding()).A);
        setLineChartRecyclerView(((g3a) getMBinding()).D);
        setDataTitleView(((g3a) getMBinding()).B);
        setRecyclerDetail(((g3a) getMBinding()).H);
        setMDistributeRecyclerView(((g3a) getMBinding()).J);
        setUnderstandCard(((g3a) getMBinding()).K);
        setRecyclerMealTime(((g3a) getMBinding()).I);
        setMealTimeLinearView(((g3a) getMBinding()).E);
        setMealTimeTitleView(((g3a) getMBinding()).F);
        setMoreDeviceCard(((g3a) getMBinding()).G);
        setHealthBannerCardSetView(((g3a) getMBinding()).C);
    }
}
