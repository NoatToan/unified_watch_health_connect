package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleHorizontalGridStandardContent;
import com.huawei.health.marketing.datatype.templates.HorizontalThreeGridTemplate;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewc implements ITemplateGenerator<HorizontalThreeGridTemplate> {
    ewc() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HorizontalThreeGridTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        HorizontalThreeGridTemplate horizontalThreeGridTemplate = (HorizontalThreeGridTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), HorizontalThreeGridTemplate.class);
        if (horizontalThreeGridTemplate == null) {
            LogUtil.j("HorizontalThreeGridTemplateGenerator", "CrossedCardOneCardTemplate is null.");
            return null;
        }
        List<SingleHorizontalGridStandardContent> gridContents = horizontalThreeGridTemplate.getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.j("HorizontalThreeGridTemplateGenerator", "CrossedCardOneCardContent is null.");
            return horizontalThreeGridTemplate;
        }
        ArrayList arrayList = new ArrayList();
        for (SingleHorizontalGridStandardContent singleHorizontalGridStandardContent : gridContents) {
            if (fxl.d(singleHorizontalGridStandardContent.getItemEffectiveTime(), singleHorizontalGridStandardContent.getItemExpirationTime())) {
                arrayList.add(singleHorizontalGridStandardContent);
            }
        }
        if (njy.e(arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<SingleHorizontalGridStandardContent>() { // from class: ewc.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(SingleHorizontalGridStandardContent singleHorizontalGridStandardContent2, SingleHorizontalGridStandardContent singleHorizontalGridStandardContent3) {
                return singleHorizontalGridStandardContent3.getPriority() - singleHorizontalGridStandardContent2.getPriority();
            }
        });
        horizontalThreeGridTemplate.setGridContents(arrayList);
        return horizontalThreeGridTemplate;
    }
}
