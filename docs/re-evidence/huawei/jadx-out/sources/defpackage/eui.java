package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.featuremarketing.layout.ILayoutGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.request.ColumnProvider;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.marketing.request.CustomConfigValue;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class eui implements ILayoutGenerator {
    eui() {
    }

    @Override // com.huawei.health.featuremarketing.layout.ILayoutGenerator
    public View generate(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null) {
            LogUtil.j("GridLayoutGenerator", "context is null when getGridTemplate.");
            return null;
        }
        BaseTemplate baseTemplateA = ewg.a(resourceBriefInfo);
        if (baseTemplateA == null) {
            LogUtil.j("GridLayoutGenerator", "getGridTemplate filterTemplate is null");
            return null;
        }
        if (baseTemplateA instanceof GridTemplate) {
            GridTemplate gridTemplate = (GridTemplate) baseTemplateA;
            List<SingleGridContent> gridContents = gridTemplate.getGridContents();
            if (njy.e(gridContents)) {
                LogUtil.d("GridLayoutGenerator", "singleGridContentList is empty.");
                return null;
            }
            if (resourceBriefInfo.getContentType() == 47) {
                List<CustomConfigValue> favoriteList = ColumnProvider.getInstance(BaseApplication.b()).getFavoriteList();
                List<SingleGridContent> functionMenuFinallyData = ColumnRequestUtils.getFunctionMenuFinallyData(gridContents, favoriteList);
                LogUtil.d("GridLayoutGenerator", "getGridTemplate jsonStr: ", ofe.c(favoriteList));
                gridTemplate.setGridContents(functionMenuFinallyData);
            }
        }
        ColumnLinearLayout columnLinearLayout = new ColumnLinearLayout(BaseApplication.b());
        columnLinearLayout.b(i, resourceBriefInfo, baseTemplateA);
        return columnLinearLayout;
    }
}
