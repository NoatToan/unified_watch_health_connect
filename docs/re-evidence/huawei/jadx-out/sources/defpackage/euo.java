package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.MultiTabHorizontalTemplate;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.views.MultiTabHorizontalLayout;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
class euo implements ILayoutGenerator {
    euo() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        LogUtil.a("", "getMultiTabHorizontalLayout");
        if (context == null || resourceBriefInfo == null) {
            return null;
        }
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        if (baseTemplateA == null) {
            LogUtil.a("", "getMultiTabHorizontalLayout filterTemplate is null");
            return null;
        }
        if ((baseTemplateA instanceof MultiTabHorizontalTemplate) && njy.e(((MultiTabHorizontalTemplate) baseTemplateA).getGridContents())) {
            LogUtil.d("", "gridContents is empty.");
            return null;
        }
        MultiTabHorizontalLayout multiTabHorizontalLayout = new MultiTabHorizontalLayout(context);
        multiTabHorizontalLayout.e(i, resourceBriefInfo, baseTemplateA);
        return multiTabHorizontalLayout;
    }
}
