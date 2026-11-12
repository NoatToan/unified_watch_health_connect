package com.huawei.healthcloud.plugintrack.ui.fragment;

import androidx.lifecycle.ViewModelProvider;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SupineLegRaiseModel;
import defpackage.jpq;

/* JADX INFO: loaded from: classes10.dex */
public class SupineLegIntroduceFragment extends SportExamIntroduceFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SupineLegRaiseModel f11114c;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    public String getTitle() {
        return getString(R.string.IDS_track_supine_leg_use_desc);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected void enableCanStart() {
        this.f11114c.enableCanStart(true);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getFirstTips() {
        return getString(R.string.IDS_track_supine_leg_use_one, 1, jpq.c(getActivity(), 2));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getSecondTips() {
        return getString(R.string.IDS_track_supine_leg_use_two, 2);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getFistBitmapName() {
        return "pic_supineleg_introduce_first";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment
    protected String getSecondBitmapName() {
        return "pic_supineleg_introduce_second";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportExamIntroduceFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        super.initViewModel();
        this.f11114c = (SupineLegRaiseModel) new ViewModelProvider(requireActivity()).get(SupineLegRaiseModel.class);
    }
}
