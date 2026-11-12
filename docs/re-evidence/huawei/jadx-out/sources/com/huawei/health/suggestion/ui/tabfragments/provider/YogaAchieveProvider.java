package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes31.dex */
public class YogaAchieveProvider extends FitnessAchieveProvider {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 23;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider
    public String getEntranceTitle() {
        return BaseApplication.getContext().getString(R.string.sug_my_yoga_class);
    }
}
