package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import defpackage.gxq;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SleepReportDataOrigin02Provider extends SleepReportDataOriginProvider {
    private boolean e = false;

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepReportDataOriginProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepReportDataOriginProvider, com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: d */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL && (gxqVar.h().t() || gxqVar.h().q())) {
            Map<String, Object> mapM = gxqVar.m();
            if (mapM != null) {
                Object obj = mapM.get("BAR_CHART_HELP_ICON_VISIBILITY");
                if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
                    this.e = true;
                    sectionBean.c(gxqVar);
                    return;
                }
                return;
            }
            return;
        }
        this.e = false;
        sectionBean.c(gxqVar);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepReportDataOriginProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        map.put("REPORT_TEXT", e());
        map.put("CORE_SLEEP_BTN_TIPS", true);
    }
}
