package com.huawei.ui.main.stories.health.model.weight;

import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.view.GoodThingsBaseSection;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.views.ResourceBriefInfoOwnable;
import health.compact.a.util.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SectionWeightView extends GoodThingsBaseSection implements ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Observer f28002a;
    private ResourceBriefInfo e;

    @Override // com.huawei.health.knit.section.view.GoodThingsBaseSection, com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        super.bindParamsToView(map);
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        boolean z = (resourceBriefInfo == null || this.e == null || !resourceBriefInfo.getResourceId().equals(this.e.getResourceId())) ? false : true;
        LogUtil.a("SectionWeightView", "isOwnedByBriefInfo: " + z);
        return z;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.e;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.f7600c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LogUtil.a("SectionWeightView", "onDetachedFromWindow, unregisterObserver");
        ObserverManagerUtil.a(this.f28002a, "MARKETING_GOOD_THING_CLOSE" + this.e.getResourceId());
    }
}
