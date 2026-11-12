package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.ui.main.R;
import defpackage.qho;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveHoursIntroductionProvider extends BaseKnitDataProvider {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        map.put("STAND_WHAT", qho.d(R.string.IDS_hour_introduction_title, "IDS_hour_introduction_title", R.string.class));
        map.put("STAND_EXPLAIN", qho.d(R.string.IDS_hour_introduction_new, "IDS_hour_introduction_new", R.string.class));
    }
}
