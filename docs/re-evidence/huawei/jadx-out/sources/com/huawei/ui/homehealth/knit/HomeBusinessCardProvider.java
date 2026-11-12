package com.huawei.ui.homehealth.knit;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.qqt;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class HomeBusinessCardProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ColumnLinearLayout f25604a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25605c;
    private SectionBean e;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("HomeBusinessCardProvider", "loadDefaultData");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("HomeBusinessCardProvider", "loadData");
        this.f25605c = context;
        this.e = sectionBean;
        e();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("HomeBusinessCardProvider", "parseParams");
        ColumnLinearLayout columnLinearLayout = this.f25604a;
        if (columnLinearLayout == null) {
            LogUtil.a("HomeBusinessCardProvider", "parsePcolumnLinearLayout is null");
        } else {
            map.put("BUSINESS_HOME", columnLinearLayout);
        }
    }

    public void e() {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(4043);
        resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: spl
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f48495a.e(marketingApi, (Map) obj);
            }
        });
        resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: spk
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LogUtil.e("HomeBusinessCardProvider", "requestMarketResource onFailure");
            }
        });
    }

    public /* synthetic */ void e(MarketingApi marketingApi, Map map) {
        if (map == null || map.isEmpty()) {
            LogUtil.e("HomeBusinessCardProvider", "marketingResponse is invalid");
            return;
        }
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map);
        if (mapFilterMarketingRules == null || mapFilterMarketingRules.isEmpty()) {
            LogUtil.e("HomeBusinessCardProvider", "filterResultInfoMap is invalid");
        } else if (mapFilterMarketingRules.get(4043) != null) {
            e(mapFilterMarketingRules.get(4043));
        }
    }

    public void e(ResourceResultInfo resourceResultInfo) {
        boolean z = true;
        for (ResourceBriefInfo resourceBriefInfo : resourceResultInfo.getResources()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis < resourceBriefInfo.getExpirationTime() && resourceBriefInfo.getContentType() == 47) {
                String content = resourceBriefInfo.getContent().getContent();
                if (!TextUtils.isEmpty(content)) {
                    GridTemplate gridTemplate = (GridTemplate) qqt.e(content, GridTemplate.class);
                    if (gridTemplate == null || njy.e(gridTemplate.getGridContents())) {
                        z = false;
                    } else {
                        ColumnLinearLayout columnLinearLayout = new ColumnLinearLayout(BaseApplication.b());
                        this.f25604a = columnLinearLayout;
                        columnLinearLayout.b(4043, resourceBriefInfo, gridTemplate);
                        this.e.c(new Object());
                    }
                }
            }
        }
        if (z) {
            return;
        }
        this.e.c((Object) null);
    }
}
