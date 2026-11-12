package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.MultiFunctionTemplate;
import com.huawei.health.marketing.datatype.templates.SingleFunctionGridContent;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewf implements ITemplateGenerator<MultiFunctionTemplate> {
    ewf() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MultiFunctionTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        MultiFunctionTemplate multiFunctionTemplate = (MultiFunctionTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), MultiFunctionTemplate.class);
        if (multiFunctionTemplate == null) {
            LogUtil.j("MultiFunctionTemplateGenerator", "gridTemplate is null.");
            return null;
        }
        MultiFunctionTemplate multiFunctionTemplateA = a(multiFunctionTemplate);
        List<SingleFunctionGridContent> gridContents = multiFunctionTemplateA.getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.a("MultiFunctionTemplateGenerator", "singleGridContentList is null.");
            return null;
        }
        if (multiFunctionTemplateA.isIntelligentFlag()) {
            return multiFunctionTemplateA;
        }
        Collections.sort(gridContents, new Comparator<SingleGridContent>() { // from class: ewf.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(SingleGridContent singleGridContent, SingleGridContent singleGridContent2) {
                return singleGridContent2.getPriority() - singleGridContent.getPriority();
            }
        });
        return multiFunctionTemplateA;
    }

    private MultiFunctionTemplate a(MultiFunctionTemplate multiFunctionTemplate) {
        ArrayList arrayList = new ArrayList();
        List<SingleFunctionGridContent> gridContents = multiFunctionTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            for (SingleFunctionGridContent singleFunctionGridContent : gridContents) {
                if (fxl.d(singleFunctionGridContent.getItemEffectiveTime(), singleFunctionGridContent.getItemExpirationTime())) {
                    arrayList.add(singleFunctionGridContent);
                }
            }
            multiFunctionTemplate.setGridContents(arrayList);
        }
        return multiFunctionTemplate;
    }
}
