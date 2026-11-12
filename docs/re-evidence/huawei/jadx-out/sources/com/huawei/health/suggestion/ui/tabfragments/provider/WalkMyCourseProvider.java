package com.huawei.health.suggestion.ui.tabfragments.provider;

import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.util.ClickEventUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes31.dex */
public class WalkMyCourseProvider extends RunMyCourseProvider {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 257;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 5;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 257;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Track_WalkMyCourseProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return BaseApplication.getContext().getString(R.string.IDS_my_walk_course);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider
    protected ClickEventUtils.ClickEventType d() {
        return ClickEventUtils.ClickEventType.MY_ALL_WALK_COURSE;
    }
}
