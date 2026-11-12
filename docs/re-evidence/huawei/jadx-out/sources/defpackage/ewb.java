package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.MultiGridsSleepPageTemplate;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewb implements ITemplateGenerator<MultiGridsSleepPageTemplate> {
    ewb() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MultiGridsSleepPageTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        MultiGridsSleepPageTemplate multiGridsSleepPageTemplate = (MultiGridsSleepPageTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), MultiGridsSleepPageTemplate.class);
        if (multiGridsSleepPageTemplate == null) {
            LogUtil.j("GridTemplateGenerator", "gridTemplate is null.");
            return null;
        }
        MultiGridsSleepPageTemplate multiGridsSleepPageTemplateE = e(multiGridsSleepPageTemplate);
        Collections.sort(multiGridsSleepPageTemplateE.getGridContents(), new Comparator<SingleGridContent>() { // from class: ewb.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(SingleGridContent singleGridContent, SingleGridContent singleGridContent2) {
                return singleGridContent2.getPriority() - singleGridContent.getPriority();
            }
        });
        return multiGridsSleepPageTemplateE;
    }

    private MultiGridsSleepPageTemplate e(MultiGridsSleepPageTemplate multiGridsSleepPageTemplate) {
        ArrayList arrayList = new ArrayList();
        List<SingleGridContent> gridContents = multiGridsSleepPageTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            for (SingleGridContent singleGridContent : gridContents) {
                if (fxl.d(singleGridContent.getItemEffectiveTime(), singleGridContent.getItemExpirationTime())) {
                    arrayList.add(singleGridContent);
                }
            }
            multiGridsSleepPageTemplate.setGridContents(arrayList);
        }
        return multiGridsSleepPageTemplate;
    }
}
