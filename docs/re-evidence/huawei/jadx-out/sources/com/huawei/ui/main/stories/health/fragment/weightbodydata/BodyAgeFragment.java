package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.text.SpannableString;
import android.view.View;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import defpackage.vcw;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class BodyAgeFragment extends WeightBodyDataFragment {
    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 9;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initView(View view) {
        super.initView(view);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        int iA = (int) this.mWeightBean.a();
        String strE = UnitUtil.e(iA, 1, 0);
        updateTitleTextStyle(strE, new SpannableString(this.mResources.getQuantityString(R.plurals.IDS_hw_show_bodyage_unit_years_old, iA, strE)), R.string.IDS_hw_show_bodyage);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        initAbout(vcw.e(0), vcw.e(1));
    }
}
