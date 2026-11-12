package com.huawei.healthcloud.plugintrack.ui.fragment;

import androidx.lifecycle.ViewModelProvider;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.CrossJumpViewModel;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel;
import defpackage.jpq;

/* JADX INFO: loaded from: classes10.dex */
public class CrossJumpIntroduceFragment extends SportExamIntroduceFragment {
    private SportExamViewModel e;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getTitle() {
        return getString(R.string.IDS_track_cross_jump_use_desc);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected void enableCanStart() {
        SportExamViewModel sportExamViewModel = this.e;
        if (sportExamViewModel != null) {
            sportExamViewModel.enableCanStart(true);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getFirstTips() {
        return getString(R.string.IDS_track_cross_jump_use_one, 1, jpq.c(getActivity(), 2));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getSecondTips() {
        return getString(R.string.IDS_track_cross_jump_use_two, 2);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getFistBitmapName() {
        return "public_cross_jump_first";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getSecondBitmapName() {
        return "public_cross_jump_second";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        super.initViewModel();
        this.e = (SportExamViewModel) new ViewModelProvider(requireActivity()).get(CrossJumpViewModel.class);
    }
}
