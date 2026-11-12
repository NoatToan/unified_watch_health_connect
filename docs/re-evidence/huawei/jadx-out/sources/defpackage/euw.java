package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.QuestionnaireTemplate;
import com.huawei.health.marketing.views.QuestionAndAnswerLayout;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
class euw implements ILayoutGenerator {
    euw() {
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
        QuestionnaireTemplate questionnaireTemplate = (QuestionnaireTemplate) HiJsonUtil.d(content, QuestionnaireTemplate.class);
        if (questionnaireTemplate == null) {
            LogUtil.j("", "questionnaireTemplate is null");
            return null;
        }
        LogUtil.a("", "questionnaireTemplate:", questionnaireTemplate.toString());
        QuestionAndAnswerLayout questionAndAnswerLayout = new QuestionAndAnswerLayout(context);
        questionAndAnswerLayout.c(i, resourceBriefInfo, questionnaireTemplate);
        return questionAndAnswerLayout;
    }
}
