package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleTextContent;
import com.huawei.health.marketing.datatype.TextLinkTemplate;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewn implements ITemplateGenerator<TextLinkTemplate> {
    ewn() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public TextLinkTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        TextLinkTemplate textLinkTemplate = (TextLinkTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), TextLinkTemplate.class);
        if (textLinkTemplate == null) {
            LogUtil.j("GridTemplateGenerator", "gridTemplate is null.");
            return null;
        }
        TextLinkTemplate textLinkTemplateE = e(textLinkTemplate);
        if (!njy.e(textLinkTemplateE.getGridContents())) {
            return textLinkTemplateE;
        }
        LogUtil.a("GridTemplateGenerator", "multi tab horizontal grid content is empty");
        return null;
    }

    private TextLinkTemplate e(TextLinkTemplate textLinkTemplate) {
        ArrayList arrayList = new ArrayList();
        List<SingleTextContent> gridContents = textLinkTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            for (SingleTextContent singleTextContent : gridContents) {
                if (fxl.d(singleTextContent.getItemEffectiveTime(), singleTextContent.getItemExpirationTime())) {
                    arrayList.add(singleTextContent);
                }
            }
            textLinkTemplate.setGridContents(arrayList);
        }
        return textLinkTemplate;
    }
}
