package com.huawei.healthcloud.plugintrack.ui.fragment;

import androidx.lifecycle.ViewModelProvider;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.StandingFlexionViewModel;
import defpackage.jpq;

/* JADX INFO: loaded from: classes10.dex */
public class StandFlexIntroduceFragment extends SportExamIntroduceFragment {
    private StandingFlexionViewModel e;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getTitle() {
        return getString(R.string.IDS_track_stand_flexion_use_desc);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected void enableCanStart() {
        StandingFlexionViewModel standingFlexionViewModel = this.e;
        if (standingFlexionViewModel != null) {
            standingFlexionViewModel.enableCanStart(true);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getFirstTips() {
        return getString(R.string.IDS_track_stand_flexion_use_one, 1, jpq.c(getActivity(), 2));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getSecondTips() {
        return getString(R.string.IDS_track_stand_flexion_use_two, 2);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getFistBitmapName() {
        return "pic_standflex_introduce_first";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getSecondBitmapName() {
        return "pic_standflex_introduce_second";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        super.initViewModel();
        this.e = (StandingFlexionViewModel) new ViewModelProvider(requireActivity()).get(StandingFlexionViewModel.class);
    }
}
