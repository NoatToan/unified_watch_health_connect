package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.overlay.OverlayTemplate;
import com.huawei.health.marketing.views.OverlayLayout;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
class euq implements ILayoutGenerator {
    euq() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            LogUtil.j("OverlayAnimateGenerator", "is null, OverlayAnimateGenerator  return");
            return null;
        }
        LogUtil.a("OverlayAnimateGenerator", "briefInfo.getContent().getContent():", resourceBriefInfo.getContent().getContent());
        String content = resourceBriefInfo.getContent().getContent();
        LogUtil.a("OverlayAnimateGenerator", "overlayTemplateStr:", content);
        OverlayTemplate overlayTemplate = (OverlayTemplate) HiJsonUtil.d(content, OverlayTemplate.class);
        if (overlayTemplate == null) {
            LogUtil.j("OverlayAnimateGenerator", "overlayTemplate is empty");
            return null;
        }
        LogUtil.a("OverlayAnimateGenerator", "overlayTemplate:", overlayTemplate.toString());
        OverlayLayout overlayLayout = new OverlayLayout(context);
        overlayLayout.a(i, resourceBriefInfo, overlayTemplate);
        return overlayLayout;
    }
}
