package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.FamousTeacherSeriesRecTemplate;
import com.huawei.health.marketing.datatype.templates.SingleFamousTeacherStandardContent;
import com.huawei.health.marketing.views.FamousTeacherLayout;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes28.dex */
class euk implements ILayoutGenerator {
    euk() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            LogUtil.j("", "is null, setQuestionAndAnswer return");
            return null;
        }
        LogUtil.a("", "briefInfo.getContent().getContent():", resourceBriefInfo.getContent().getContent());
        String content = resourceBriefInfo.getContent().getContent();
        LogUtil.a("", "combinationTemplateStr:", content);
        FamousTeacherSeriesRecTemplate famousTeacherSeriesRecTemplate = (FamousTeacherSeriesRecTemplate) HiJsonUtil.d(content, FamousTeacherSeriesRecTemplate.class);
        if (famousTeacherSeriesRecTemplate == null) {
            LogUtil.j("", "famousTeacherSeriesRecTemplate is null");
            return null;
        }
        LogUtil.a("", "famousTeacherSeriesRecTemplate:", famousTeacherSeriesRecTemplate.toString());
        if (njy.e(famousTeacherSeriesRecTemplate.getGridContents())) {
            LogUtil.j("", "famousTeacherSeriesRecTemplate GridContents is empty");
            return null;
        }
        Collections.sort(famousTeacherSeriesRecTemplate.getGridContents(), new Comparator() { // from class: euj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return euk.e((SingleFamousTeacherStandardContent) obj, (SingleFamousTeacherStandardContent) obj2);
            }
        });
        FamousTeacherLayout famousTeacherLayout = new FamousTeacherLayout(context);
        famousTeacherLayout.d(i, resourceBriefInfo, famousTeacherSeriesRecTemplate);
        return famousTeacherLayout;
    }

    static /* synthetic */ int e(SingleFamousTeacherStandardContent singleFamousTeacherStandardContent, SingleFamousTeacherStandardContent singleFamousTeacherStandardContent2) {
        return singleFamousTeacherStandardContent2.getTabPriority() - singleFamousTeacherStandardContent.getTabPriority();
    }
}
