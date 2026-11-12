package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleEntryContent;
import com.huawei.health.marketing.datatype.templates.QuickEntryTemplate;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewj implements ITemplateGenerator<QuickEntryTemplate> {
    ewj() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public QuickEntryTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        QuickEntryTemplate quickEntryTemplate = (QuickEntryTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), QuickEntryTemplate.class);
        if (quickEntryTemplate == null) {
            LogUtil.j("QuickEntryTemplateGenerator", "quickEntryTemplate is null.");
            return null;
        }
        QuickEntryTemplate quickEntryTemplateC = c(quickEntryTemplate);
        Collections.sort(quickEntryTemplateC.getGridContents(), new Comparator<SingleEntryContent>() { // from class: ewj.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(SingleEntryContent singleEntryContent, SingleEntryContent singleEntryContent2) {
                return singleEntryContent2.getPriority() - singleEntryContent.getPriority();
            }
        });
        return quickEntryTemplateC;
    }

    private QuickEntryTemplate c(QuickEntryTemplate quickEntryTemplate) {
        ArrayList arrayList = new ArrayList();
        List<SingleEntryContent> gridContents = quickEntryTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            for (SingleEntryContent singleEntryContent : gridContents) {
                if (fxl.d(singleEntryContent.getItemEffectiveTime(), singleEntryContent.getItemExpirationTime())) {
                    arrayList.add(singleEntryContent);
                }
            }
            quickEntryTemplate.setGridContents(arrayList);
        }
        return quickEntryTemplate;
    }
}
