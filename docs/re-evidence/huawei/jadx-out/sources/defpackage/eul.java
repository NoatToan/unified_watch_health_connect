package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.HomePageRecommendTemplate;
import com.huawei.health.marketing.views.HomePageRecommendLayout;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class eul implements ILayoutGenerator {
    eul() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null) {
            LogUtil.j("HomePageRecommendLayoutGenerator", "HomePageRecommendLayoutGenerator context is null.");
            return null;
        }
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        if (baseTemplateA == null) {
            LogUtil.j("HomePageRecommendLayoutGenerator", "filterTemplate is null");
            return null;
        }
        HomePageRecommendLayout homePageRecommendLayout = new HomePageRecommendLayout(context);
        homePageRecommendLayout.d(i, resourceBriefInfo, baseTemplateA);
        if (homePageRecommendLayout.getVisibility() != 0) {
            return null;
        }
        return homePageRecommendLayout;
    }

    public List<View> a(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        if (!(baseTemplateA instanceof HomePageRecommendTemplate)) {
            LogUtil.j("HomePageRecommendLayoutGenerator", "filterTemplate is error");
            return null;
        }
        List<SingleGridContent> gridContents = ((HomePageRecommendTemplate) baseTemplateA).getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.j("HomePageRecommendLayoutGenerator", "gridContents is empty");
            return null;
        }
        if (njy.b(resourceBriefInfo.getRecommendList())) {
            LogUtil.a("HomePageRecommendLayoutGenerator", "resourceBriefInfo recommendList ： ", resourceBriefInfo.getRecommendList().toString());
        }
        ArrayList arrayList = new ArrayList();
        for (SingleGridContent singleGridContent : gridContents) {
            if (singleGridContent != null) {
                LogUtil.a("HomePageRecommendLayoutGenerator", "gridContent itemId ： ", singleGridContent.getItemId());
                HomePageRecommendLayout homePageRecommendLayout = new HomePageRecommendLayout(context);
                homePageRecommendLayout.b(i, resourceBriefInfo, baseTemplateA, singleGridContent);
                if (homePageRecommendLayout.getVisibility() == 0) {
                    arrayList.add(homePageRecommendLayout);
                }
            }
        }
        return arrayList;
    }
}
