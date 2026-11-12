package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.views.MultiFunctionLayout;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
public class eur implements ILayoutGenerator {
    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null) {
            LogUtil.e("MultiFunctionLayoutGenerator", "context is null when getGridTemplate.");
            return null;
        }
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        if (baseTemplateA == null) {
            LogUtil.e("MultiFunctionLayoutGenerator", "getGridTemplate filterTemplate is null");
            return null;
        }
        if ((baseTemplateA instanceof GridTemplate) && njy.e(((GridTemplate) baseTemplateA).getGridContents())) {
            LogUtil.e("MultiFunctionLayoutGenerator", "singleGridContentList is empty.");
            return null;
        }
        MultiFunctionLayout multiFunctionLayout = new MultiFunctionLayout(BaseApplication.b());
        multiFunctionLayout.d(i, resourceBriefInfo, baseTemplateA);
        return multiFunctionLayout;
    }
}
