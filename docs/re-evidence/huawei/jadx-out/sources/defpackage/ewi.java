package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.MultiTabHorizontalTemplate;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGrid4Tab;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewi implements ITemplateGenerator<MultiTabHorizontalTemplate> {
    ewi() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MultiTabHorizontalTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        MultiTabHorizontalTemplate multiTabHorizontalTemplate = (MultiTabHorizontalTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), MultiTabHorizontalTemplate.class);
        if (multiTabHorizontalTemplate == null) {
            LogUtil.j("MultiTabHorizontalTemplateGenerator", "gridTemplate is null.");
            return null;
        }
        MultiTabHorizontalTemplate multiTabHorizontalTemplateE = e(multiTabHorizontalTemplate);
        if (!njy.e(multiTabHorizontalTemplateE.getGridContents())) {
            return multiTabHorizontalTemplateE;
        }
        LogUtil.a("MultiTabHorizontalTemplateGenerator", "multi tab horizontal grid content is empty");
        return null;
    }

    private MultiTabHorizontalTemplate e(MultiTabHorizontalTemplate multiTabHorizontalTemplate) {
        ArrayList arrayList = new ArrayList();
        List<SingleGrid4Tab> gridContents = multiTabHorizontalTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            for (SingleGrid4Tab singleGrid4Tab : gridContents) {
                if (fxl.d(singleGrid4Tab.getItemEffectiveTime(), singleGrid4Tab.getItemExpirationTime())) {
                    arrayList.add(singleGrid4Tab);
                }
            }
            multiTabHorizontalTemplate.setGridContents(arrayList);
        }
        return multiTabHorizontalTemplate;
    }
}
