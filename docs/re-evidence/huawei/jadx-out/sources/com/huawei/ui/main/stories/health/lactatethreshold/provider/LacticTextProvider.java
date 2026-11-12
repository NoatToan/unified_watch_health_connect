package com.huawei.ui.main.stories.health.lactatethreshold.provider;

import android.content.Context;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class LacticTextProvider extends BaseKnitDataProvider {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        sectionBean.c(b(BaseApplication.getContext()));
        sectionBean.c(new Object());
    }

    private HashMap<String, Object> b(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("TITLE", context.getResources().getString(R.string.IDS_running_lactate_threshold_q));
        map.put("TEXT1", context.getResources().getString(R.string.IDS_running_lactate_threshold_a));
        map.put("SUB_HEADER_MAX_LINES", 3);
        return map;
    }
}
