package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.views.SpecialShapedPictureLayout;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
class eus implements ILayoutGenerator {
    eus() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null) {
            LogUtil.j("SpecialShapePicLayoutGenerator", "context is null when getGridTemplate.");
            return null;
        }
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        if (baseTemplateA == null) {
            LogUtil.j("SpecialShapePicLayoutGenerator", "getGridTemplate filterTemplate is null");
            return null;
        }
        SpecialShapedPictureLayout specialShapedPictureLayout = new SpecialShapedPictureLayout(context);
        specialShapedPictureLayout.d(i, resourceBriefInfo, baseTemplateA);
        return specialShapedPictureLayout;
    }
}
