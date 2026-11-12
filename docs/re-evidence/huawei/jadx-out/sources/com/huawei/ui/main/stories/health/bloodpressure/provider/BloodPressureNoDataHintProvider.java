package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.content.Context;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureNoDataHintProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SectionBean f27852c;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("BloodPressureNoDataTopProvider", "loadData");
        this.f27852c = sectionBean;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("BloodPressureNoDataTopProvider", "loadDefaultData");
        super.loadDefaultData(sectionBean);
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("BloodPressureNoDataTopProvider", "parseParams");
        map.put("REPORT_TEXT", context.getString(R.string.IDS_blood_pressure_no_data_hint));
        map.put("MARGIN_TOP", 0);
    }
}
