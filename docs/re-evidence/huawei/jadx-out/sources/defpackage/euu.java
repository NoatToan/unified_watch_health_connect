package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.views.TextLinkLayout;

/* JADX INFO: loaded from: classes28.dex */
public class euu implements ILayoutGenerator {
    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null) {
            return null;
        }
        TextLinkLayout textLinkLayout = new TextLinkLayout(context);
        textLinkLayout.b(i, resourceBriefInfo);
        return textLinkLayout;
    }
}
