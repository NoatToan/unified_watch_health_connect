package com.huawei.ui.main.stories.soical.member;

import android.content.Context;
import android.view.View;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.operationbundle.R;
import defpackage.fca;
import defpackage.fcn;
import defpackage.qrs;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class MemberTextProvider extends BaseKnitDataProvider {
    private Map<String, Object> d;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(final Context context, SectionBean sectionBean) {
        HashMap map = new HashMap();
        this.d = map;
        map.put("ITEM_TITLE", context.getResources().getString(R.string.IDS_vip_renewal));
        this.d.put("CLICK_EVENT_LISTENER", new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.member.MemberTextProvider.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                fcn.a("", "VipPage");
                fca.d(context, 0);
            }
        });
        sectionBean.c(this.d);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        map.putAll((Map) obj);
    }
}
