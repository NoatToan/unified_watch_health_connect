package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.ui.main.R;
import defpackage.exz;
import defpackage.vei;

/* JADX INFO: loaded from: classes19.dex */
public class AiBodyShapeWaistToHipRatioFragment extends AbstractWaistToHipRatioFragment {
    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 28;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.mGender = MultiUsersManager.INSTANCE.getMainUser().d();
        this.f27950b = this.mAiBodyShapeBean.f();
        this.f27951c = this.mResources.getString(R.string.IDS_weight_waist_to_hip_ratio);
        this.d = exz.c(this.mGender, this.f27950b);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.weightbodydata.AbstractWaistToHipRatioFragment, com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public long getTrendEndTime() {
        return this.mAiBodyShapeBean.h();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public HiAggregateOption getHiAggregateOption() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(getTrendStartTime(), getTrendEndTime());
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setSortOrder(0);
        vei.e(hiAggregateOption);
        return hiAggregateOption;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return "waistHipRatio";
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getAIBodyShapeImageKey() {
        return "waist_hip_ratio";
    }
}
