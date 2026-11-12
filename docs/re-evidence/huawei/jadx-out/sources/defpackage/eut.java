package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.TextLinkTemplate;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.views.TextLinkNestingLayout;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
class eut implements ILayoutGenerator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FragmentManager f33497b;

    public eut(FragmentManager fragmentManager) {
        this.f33497b = fragmentManager;
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null) {
            return null;
        }
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        if (!(baseTemplateA instanceof TextLinkTemplate)) {
            LogUtil.j("", "getTextLinkNestingLayout baseTemplate is null");
            return null;
        }
        TextLinkTemplate textLinkTemplate = (TextLinkTemplate) baseTemplateA;
        if (njy.e(textLinkTemplate.getGridContents())) {
            LogUtil.d("", "singleTextContentList is empty.");
            return null;
        }
        TextLinkNestingLayout textLinkNestingLayout = new TextLinkNestingLayout(context);
        textLinkNestingLayout.b(i, resourceBriefInfo, textLinkTemplate, this.f33497b);
        return textLinkNestingLayout;
    }
}
