package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleHotSeriesRecommendContent;
import com.huawei.health.marketing.datatype.templates.HotSeriesRecommendTemplate;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewd implements ITemplateGenerator<HotSeriesRecommendTemplate> {
    ewd() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HotSeriesRecommendTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        HotSeriesRecommendTemplate hotSeriesRecommendTemplate = (HotSeriesRecommendTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), HotSeriesRecommendTemplate.class);
        if (hotSeriesRecommendTemplate == null) {
            LogUtil.j("HotSeriesRecommendTemplateGenerator", "HotSeriesRecommendTemplate is null.");
            return null;
        }
        HotSeriesRecommendTemplate hotSeriesRecommendTemplateD = d(hotSeriesRecommendTemplate);
        Collections.sort(hotSeriesRecommendTemplateD.getGridContents(), new Comparator() { // from class: ewe
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ewd.e((SingleHotSeriesRecommendContent) obj, (SingleHotSeriesRecommendContent) obj2);
            }
        });
        return hotSeriesRecommendTemplateD;
    }

    static /* synthetic */ int e(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent, SingleHotSeriesRecommendContent singleHotSeriesRecommendContent2) {
        return singleHotSeriesRecommendContent2.getPriority() - singleHotSeriesRecommendContent.getPriority();
    }

    private HotSeriesRecommendTemplate d(HotSeriesRecommendTemplate hotSeriesRecommendTemplate) {
        ArrayList arrayList = new ArrayList();
        List<SingleHotSeriesRecommendContent> gridContents = hotSeriesRecommendTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            for (SingleHotSeriesRecommendContent singleHotSeriesRecommendContent : gridContents) {
                if (fxl.d(singleHotSeriesRecommendContent.getItemEffectiveTime(), singleHotSeriesRecommendContent.getItemExpirationTime())) {
                    arrayList.add(singleHotSeriesRecommendContent);
                }
            }
            hotSeriesRecommendTemplate.setGridContents(arrayList);
        }
        return hotSeriesRecommendTemplate;
    }
}
