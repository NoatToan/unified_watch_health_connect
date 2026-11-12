package com.xiaomi.fitness.relative.spo2;

import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import defpackage.ada;
import defpackage.jui;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/relative/spo2/Spo2DayItemRFragment;", "Lcom/xiaomi/fitness/relative/spo2/Spo2BaseRelativeFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "Lada;", "", "initViewBinding", "()V", "", "getFragmentPosition", "()I", "fragmentPosition", "getLayoutId", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class Spo2DayItemRFragment extends Hilt_Spo2DayItemRFragment<BasicRelativeDataViewModel, ada> {
    @Override // com.xiaomi.fitness.relative.spo2.Spo2BaseRelativeFragment
    public int getFragmentPosition() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return jui.c1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.relative.spo2.Spo2BaseRelativeFragment
    public void initViewBinding() {
        setContainerView(((ada) getMBinding()).C);
        setDataTitleView(((ada) getMBinding()).A);
        setRecyclerDetail(((ada) getMBinding()).B.B);
        setLowSpo2Recycler(((ada) getMBinding()).B.C);
        setUnderstandCard(((ada) getMBinding()).B.D);
    }
}
