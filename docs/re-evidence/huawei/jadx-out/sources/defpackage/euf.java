package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.views.CourseSeriesSidingLayout;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
class euf implements ILayoutGenerator {
    euf() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null) {
            return null;
        }
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        if (baseTemplateA == null) {
            LogUtil.j("", "getSportBanner filterTemplate is null");
            return null;
        }
        if (context == null) {
            LogUtil.j("", "context is null");
            return null;
        }
        CourseSeriesSidingLayout courseSeriesSidingLayout = new CourseSeriesSidingLayout(context);
        courseSeriesSidingLayout.initData(i, resourceBriefInfo, baseTemplateA);
        return courseSeriesSidingLayout;
    }
}
