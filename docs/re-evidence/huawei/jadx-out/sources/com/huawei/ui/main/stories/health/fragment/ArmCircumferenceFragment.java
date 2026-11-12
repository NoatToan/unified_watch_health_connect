package com.huawei.ui.main.stories.health.fragment;

import com.huawei.ui.main.R;
import defpackage.uww;

/* JADX INFO: loaded from: classes19.dex */
public class ArmCircumferenceFragment extends AiBodyDimensionFragment {
    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected int getBiType() {
        return 32;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.AiBodyDimensionFragment
    double getValueFrom(uww uwwVar) {
        return uwwVar.b();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected String getBodyDataKey() {
        return "armCircumference";
    }

    @Override // com.huawei.ui.main.stories.health.fragment.AiBodyDimensionFragment
    int getTitleId() {
        return R.string.IDS_aibs_large_arm;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected String getAIBodyShapeImageKey() {
        return "large_arm";
    }
}
