package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.CrossedCardOneCardContent;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.CrossedCardOneCardTemplate;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewk implements ITemplateGenerator<CrossedCardOneCardTemplate> {
    ewk() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CrossedCardOneCardTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        CrossedCardOneCardTemplate crossedCardOneCardTemplate = (CrossedCardOneCardTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), CrossedCardOneCardTemplate.class);
        if (crossedCardOneCardTemplate == null) {
            LogUtil.j("SeriesDietAnalysisSidingTemplateGenerator", "CrossedCardOneCardTemplate is null.");
            return null;
        }
        List<CrossedCardOneCardContent> gridContents = crossedCardOneCardTemplate.getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.j("SeriesDietAnalysisSidingTemplateGenerator", "CrossedCardOneCardContent is null.");
            return crossedCardOneCardTemplate;
        }
        ArrayList arrayList = new ArrayList();
        for (CrossedCardOneCardContent crossedCardOneCardContent : gridContents) {
            if (fxl.d(crossedCardOneCardContent.getItemEffectiveTime(), crossedCardOneCardContent.getItemExpirationTime())) {
                arrayList.add(crossedCardOneCardContent);
            }
        }
        if (njy.e(arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<CrossedCardOneCardContent>() { // from class: ewk.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(CrossedCardOneCardContent crossedCardOneCardContent2, CrossedCardOneCardContent crossedCardOneCardContent3) {
                return crossedCardOneCardContent3.getPriority() - crossedCardOneCardContent2.getPriority();
            }
        });
        crossedCardOneCardTemplate.setGridContents(arrayList);
        return crossedCardOneCardTemplate;
    }
}
