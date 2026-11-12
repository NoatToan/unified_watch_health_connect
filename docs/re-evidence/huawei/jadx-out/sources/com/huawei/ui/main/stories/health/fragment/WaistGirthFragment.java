package com.huawei.ui.main.stories.health.fragment;

import com.huawei.ui.main.R;
import defpackage.uww;

/* JADX INFO: loaded from: classes19.dex */
public class WaistGirthFragment extends AiBodyDimensionFragment {
    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected int getBiType() {
        return 30;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.AiBodyDimensionFragment
    double getValueFrom(uww uwwVar) {
        return uwwVar.g();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected String getBodyDataKey() {
        return "waistGirth";
    }

    @Override // com.huawei.ui.main.stories.health.fragment.AiBodyDimensionFragment
    int getTitleId() {
        return R.string.IDS_aibs_waist_girth;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    protected String getAIBodyShapeImageKey() {
        return "waist_girth";
    }
}
