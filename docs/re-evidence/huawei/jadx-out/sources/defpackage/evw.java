package defpackage;

import android.text.TextUtils;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
class evw implements ITemplateGenerator<GridTemplate> {
    evw() {
    }

    @Override // com.huawei.health.featuremarketing.template.ITemplateGenerator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public GridTemplate generate(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return null;
        }
        GridTemplate gridTemplate = (GridTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), GridTemplate.class);
        if (gridTemplate == null) {
            LogUtil.j("GridTemplateGenerator", "gridTemplate is null.");
            return null;
        }
        GridTemplate gridTemplateB = b(gridTemplate);
        List<SingleGridContent> gridContents = gridTemplateB.getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.a("GridTemplateGenerator", "singleGridContentList is null.");
            return null;
        }
        Iterator<SingleGridContent> it = gridContents.iterator();
        while (it.hasNext()) {
            fxl.d(it.next(), resourceBriefInfo);
        }
        if (gridTemplateB.isIntelligentFlag()) {
            return gridTemplateB;
        }
        Collections.sort(gridContents, new Comparator<SingleGridContent>() { // from class: evw.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(SingleGridContent singleGridContent, SingleGridContent singleGridContent2) {
                return singleGridContent2.getPriority() - singleGridContent.getPriority();
            }
        });
        return gridTemplateB;
    }

    private GridTemplate b(GridTemplate gridTemplate) {
        ArrayList arrayList = new ArrayList();
        List<SingleGridContent> gridContents = gridTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            for (SingleGridContent singleGridContent : gridContents) {
                if (fxl.d(singleGridContent.getItemEffectiveTime(), singleGridContent.getItemExpirationTime())) {
                    arrayList.add(singleGridContent);
                }
            }
            gridTemplate.setGridContents(new ewa().a(arrayList));
        }
        return gridTemplate;
    }
}
