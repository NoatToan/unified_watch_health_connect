package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListContent;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListStandardContent;
import com.huawei.health.marketing.datatype.templates.CourseRecommendListTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class ewh implements ITemplateGenerator<CourseRecommendListTemplate> {
    ewh() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CourseRecommendListTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        CourseRecommendListTemplate courseRecommendListTemplate = (CourseRecommendListTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), CourseRecommendListTemplate.class);
        if (courseRecommendListTemplate == null) {
            LogUtil.j("SeriesCourseSlidingTemplateGenerator", "CourseRecommendListTemplate is null.");
            return null;
        }
        List<SingleCourseRecommendListStandardContent> gridContents = courseRecommendListTemplate.getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.j("SeriesCourseSlidingTemplateGenerator", "singleEntryContentList is null.");
            return courseRecommendListTemplate;
        }
        LogUtil.a("SeriesCourseSlidingTemplateGenerator", "singleEntryContentList rcmTabList:", resourceBriefInfo.getRcmTabList() != null ? resourceBriefInfo.getRcmTabList().toString() : "");
        ArrayList arrayList = new ArrayList();
        for (SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent : gridContents) {
            List<SingleCourseRecommendListContent> listA = a(singleCourseRecommendListStandardContent.getSubContents());
            if (!njy.e(listA)) {
                LogUtil.a("SeriesCourseSlidingTemplateGenerator", "singleEntryContentList recommendList:", singleCourseRecommendListStandardContent.getRecommendList() != null ? singleCourseRecommendListStandardContent.getRecommendList().toString() : "");
                for (SingleCourseRecommendListContent singleCourseRecommendListContent : listA) {
                    String strE = fxl.e(singleCourseRecommendListStandardContent.getRecommendList(), singleCourseRecommendListContent.getItemId());
                    if (!TextUtils.isEmpty(strE)) {
                        singleCourseRecommendListContent.setAlgId(strE);
                        singleCourseRecommendListContent.setSmartRecommend(true);
                    }
                    singleCourseRecommendListContent.setAbInfo(MarketingBiUtils.c(resourceBriefInfo));
                    singleCourseRecommendListContent.setRecommendInfoGenerated(true);
                }
                String strE2 = fxl.e(resourceBriefInfo.getRcmTabList(), singleCourseRecommendListStandardContent.getTabId());
                if (!TextUtils.isEmpty(strE2)) {
                    singleCourseRecommendListStandardContent.setAlgId(strE2);
                    singleCourseRecommendListStandardContent.setSmartRecommend(true);
                }
                singleCourseRecommendListStandardContent.setAbInfo(MarketingBiUtils.c(resourceBriefInfo));
                singleCourseRecommendListStandardContent.setSubContents(listA);
                arrayList.add(singleCourseRecommendListStandardContent);
            }
        }
        Collections.sort(arrayList, new Comparator<SingleCourseRecommendListStandardContent>() { // from class: ewh.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent2, SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent3) {
                return singleCourseRecommendListStandardContent3.getTabPriority() - singleCourseRecommendListStandardContent2.getTabPriority();
            }
        });
        courseRecommendListTemplate.setGridContents(arrayList);
        return courseRecommendListTemplate;
    }

    private List<SingleCourseRecommendListContent> a(List<SingleCourseRecommendListContent> list) {
        if (njy.e(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SingleCourseRecommendListContent singleCourseRecommendListContent : list) {
            if (fxl.d(singleCourseRecommendListContent.getItemEffectiveTime(), singleCourseRecommendListContent.getItemExpirationTime())) {
                arrayList.add(singleCourseRecommendListContent);
            }
        }
        if (njy.e(arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<SingleCourseRecommendListContent>() { // from class: ewh.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(SingleCourseRecommendListContent singleCourseRecommendListContent2, SingleCourseRecommendListContent singleCourseRecommendListContent3) {
                return singleCourseRecommendListContent3.getPriority() - singleCourseRecommendListContent2.getPriority();
            }
        });
        return arrayList;
    }
}
