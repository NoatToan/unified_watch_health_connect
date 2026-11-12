package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.CourseNoticeStandardTemplate;
import com.huawei.health.marketing.datatype.templates.SingleCourseNoticeStandardContent;
import com.huawei.health.marketing.views.CoursePreviewLayout;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class euh implements ILayoutGenerator {
    euh() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            LogUtil.j("CoursePreviewLayoutGenerator", "briefInfo content is null, CoursePreviewLayoutGenerator  return");
            return null;
        }
        LogUtil.a("CoursePreviewLayoutGenerator", "briefInfo.getContent().getContent():", resourceBriefInfo.getContent().getContent());
        String content = resourceBriefInfo.getContent().getContent();
        LogUtil.a("CoursePreviewLayoutGenerator", "combinationTemplateStr:", content);
        CourseNoticeStandardTemplate courseNoticeStandardTemplate = (CourseNoticeStandardTemplate) HiJsonUtil.d(content, CourseNoticeStandardTemplate.class);
        if (courseNoticeStandardTemplate == null) {
            LogUtil.j("CoursePreviewLayoutGenerator", "courseNoticeStandardTemplate is null");
            return null;
        }
        LogUtil.a("CoursePreviewLayoutGenerator", "courseNoticeStandardTemplate:", courseNoticeStandardTemplate.toString());
        List<SingleCourseNoticeStandardContent> gridContents = courseNoticeStandardTemplate.getGridContents();
        Collections.sort(gridContents, new Comparator() { // from class: eud
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return euh.a((SingleCourseNoticeStandardContent) obj, (SingleCourseNoticeStandardContent) obj2);
            }
        });
        if (njy.e(gridContents)) {
            LogUtil.j("CoursePreviewLayoutGenerator", "courseContents is empty");
            return null;
        }
        CoursePreviewLayout coursePreviewLayout = new CoursePreviewLayout(context);
        coursePreviewLayout.e(i, resourceBriefInfo, courseNoticeStandardTemplate);
        return coursePreviewLayout;
    }

    static /* synthetic */ int a(SingleCourseNoticeStandardContent singleCourseNoticeStandardContent, SingleCourseNoticeStandardContent singleCourseNoticeStandardContent2) {
        return singleCourseNoticeStandardContent2.getTabPriority() - singleCourseNoticeStandardContent.getTabPriority();
    }
}
