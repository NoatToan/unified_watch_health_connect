package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.servicesui.R;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gxq;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SleepReportTextProvider extends MinorProvider<gxq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gxq f26845a;
    private boolean d = true;
    private SectionBean e;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        gxq gxqVar;
        return this.d && (gxqVar = this.f26845a) != null && gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE && this.f26845a.g().i() > 0;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        this.e = sectionBean;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        this.f26845a = gxqVar;
        map.put("REPORT_TEXT", context.getResources().getString(R.string.IDS_sleep_report_text));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL && (gxqVar.h().t() || gxqVar.h().q())) {
            LogUtil.a("SleepReportTextProvider", "isManualOnlyBedTime");
            this.d = false;
            sectionBean.d(this, gxqVar);
        } else {
            this.f26845a = gxqVar;
            this.e = sectionBean;
            sectionBean.d(this, gxqVar);
        }
    }
}
