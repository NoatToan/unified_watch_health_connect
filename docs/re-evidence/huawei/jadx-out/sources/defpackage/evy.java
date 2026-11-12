package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.HomePageRecommendTemplate;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class evy implements ITemplateGenerator<HomePageRecommendTemplate> {
    evy() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public HomePageRecommendTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        HomePageRecommendTemplate homePageRecommendTemplate = (HomePageRecommendTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), HomePageRecommendTemplate.class);
        if (homePageRecommendTemplate == null) {
            LogUtil.j("HomePageTemplateGenerator", "getHomePageRecommendTemplate is null.");
            return null;
        }
        HomePageRecommendTemplate homePageRecommendTemplateD = d(homePageRecommendTemplate);
        List<SingleGridContent> gridContents = homePageRecommendTemplateD.getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.j("HomePageTemplateGenerator", "getHomePageRecommendTemplate singleGridContentList is null.");
            return null;
        }
        Iterator<SingleGridContent> it = gridContents.iterator();
        while (it.hasNext()) {
            fxl.d(it.next(), resourceBriefInfo);
        }
        Collections.sort(gridContents, new Comparator() { // from class: evx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return evy.a((SingleGridContent) obj, (SingleGridContent) obj2);
            }
        });
        return homePageRecommendTemplateD;
    }

    static /* synthetic */ int a(SingleGridContent singleGridContent, SingleGridContent singleGridContent2) {
        return singleGridContent2.getPriority() - singleGridContent.getPriority();
    }

    private HomePageRecommendTemplate d(HomePageRecommendTemplate homePageRecommendTemplate) {
        List<SingleGridContent> gridContents = homePageRecommendTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            ArrayList arrayList = new ArrayList();
            for (SingleGridContent singleGridContent : gridContents) {
                if (fxl.d(singleGridContent.getItemEffectiveTime(), singleGridContent.getItemExpirationTime())) {
                    arrayList.add(singleGridContent);
                }
            }
            homePageRecommendTemplate.setGridContents(arrayList);
        }
        return homePageRecommendTemplate;
    }
}
