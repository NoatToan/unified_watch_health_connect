package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.ui.homehealth.R;
import defpackage.tal;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class MaterialSearchProvider extends BaseKnitDataProvider<List<GlobalSearchContent>> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        List<GlobalSearchContent> listB = tal.b(a.w);
        if (tal.d(this) && listB.size() > 3) {
            listB = listB.subList(0, 3);
        }
        sectionBean.c(listB);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        super.parseParams(context, map, list);
        map.put("SECTION_SIMPLE_LIST_DATA", list);
        boolean zD = tal.d(this);
        map.put("TITLE", context.getString(R.string.IDS_search_material));
        if (zD) {
            map.put("SHOWMORE", context.getString(R.string.IDS_device_show_more_heartrate_device));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, a.w);
            map.put("ITEM_LIMIT", 3);
        } else {
            map.put("SHOWMORE", null);
            map.put("SHOW_MORE_CLICK_EVENT", null);
        }
    }
}
