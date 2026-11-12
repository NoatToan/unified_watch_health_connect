package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.MultiGridsSleepPageTemplate;
import com.huawei.health.marketing.views.CarouselsLayout;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
class eug implements ILayoutGenerator {
    eug() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        LogUtil.a("", "getCarouselsPager");
        if (context == null || resourceBriefInfo == null) {
            return null;
        }
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        LogUtil.a("", "resourceBriefInfo: " + resourceBriefInfo.toString());
        if (!(baseTemplateA instanceof MultiGridsSleepPageTemplate)) {
            return null;
        }
        if (njy.e(((MultiGridsSleepPageTemplate) baseTemplateA).getGridContents())) {
            LogUtil.a("", "singleGridContentList is empty.");
            return null;
        }
        CarouselsLayout carouselsLayout = new CarouselsLayout(context);
        carouselsLayout.e(i, resourceBriefInfo, baseTemplateA);
        return carouselsLayout;
    }
}
