package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.views.MemberBannerCardLayout;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
class eun implements ILayoutGenerator {
    eun() {
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
        if ((baseTemplateA instanceof GridTemplate) && njy.e(((GridTemplate) baseTemplateA).getGridContents())) {
            LogUtil.d("", "singleGridContentList is empty.");
            return null;
        }
        MemberBannerCardLayout memberBannerCardLayout = new MemberBannerCardLayout(context);
        memberBannerCardLayout.b(i, resourceBriefInfo, baseTemplateA);
        return memberBannerCardLayout;
    }
}
