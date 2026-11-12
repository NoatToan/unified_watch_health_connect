package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.content.Context;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureNoDataTopProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SectionBean f27853b;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("BloodPressureNoDataTopProvider", "loadData");
        this.f27853b = sectionBean;
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
        map.put("DEVICE_INFO_FLAG", false);
        map.put("IS_SHOW_TOAST", true);
        map.put("TOP_IMAGE", Integer.valueOf(R.drawable.no_data_head_blood_pressure));
        map.put("TOP_IMAGE_TAHITI", Integer.valueOf(R.drawable.no_data_head_blood_pressure_tahiti));
        map.put("ROUND_CORNER_IMAGE", Integer.valueOf(R.drawable.round_corner));
    }
}
