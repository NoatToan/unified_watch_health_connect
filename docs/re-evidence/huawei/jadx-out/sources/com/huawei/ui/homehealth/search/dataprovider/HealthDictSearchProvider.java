package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.HealthDictSearchContent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import defpackage.fpw;
import defpackage.gvi;
import defpackage.njy;
import defpackage.qrs;
import defpackage.tal;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class HealthDictSearchProvider extends BaseKnitDataProvider<List<fpw>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26051b;
    private List<String> e;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<fpw> list) {
        e(context, map, list);
    }

    private void e(Context context, HashMap<String, Object> map, List<fpw> list) {
        map.put("TITLE", this.f26051b);
        map.put("SECTION_HEALTH_DICT_BEAN", list);
        a(context, map);
        String strB = GlobalSearchActivity.b();
        String str = this.f26051b;
        map.put("ITEM_BI_EVENT_MAP", tal.b(301, 200, strB, str, str));
        map.put("SUBTITLE", b());
    }

    private void a(final Context context, HashMap<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.HealthDictSearchProvider.2
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                if (marketRouterApi == null || TextUtils.isEmpty(HealthDictSearchProvider.this.f26050a)) {
                    return;
                }
                gvi.b(context, GlobalSearchActivity.b(), HealthDictSearchProvider.this.f26051b, HealthDictSearchProvider.this.f26050a);
                marketRouterApi.router(tal.e(HealthDictSearchProvider.this.f26050a));
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        this.f26051b = null;
        this.f26050a = null;
        this.e = null;
        List<GlobalSearchContent> listA = tal.a();
        if (njy.e(listA) || listA.get(0) == null) {
            LogUtil.d("HealthDictSearchProvider", "loadData invalid content: ", listA);
            sectionBean.c((Object) null);
            return;
        }
        GlobalSearchContent globalSearchContent = listA.get(0);
        this.f26050a = globalSearchContent.getGotourl();
        this.e = globalSearchContent.getDisdepart();
        Map<String, List<fpw>> mapD = d(globalSearchContent.getTabs());
        for (Map.Entry<String, List<fpw>> entry : mapD.entrySet()) {
            String key = entry.getKey();
            List<fpw> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !njy.e(value)) {
                this.f26051b = key;
                sectionBean.c(value);
                return;
            }
        }
        LogUtil.d("HealthDictSearchProvider", "invalid beanMap: ", mapD);
        sectionBean.c((Object) null);
    }

    private Map<String, List<fpw>> d(List<HealthDictSearchContent> list) {
        HashMap map = new HashMap();
        if (!njy.e(list)) {
            for (HealthDictSearchContent healthDictSearchContent : list) {
                if (healthDictSearchContent == null || !qrs.e(healthDictSearchContent.getDisease(), healthDictSearchContent.getTab(), healthDictSearchContent.getMdText(), healthDictSearchContent.getEntry())) {
                    LogUtil.a("HealthDictSearchProvider", "invalid content: ", healthDictSearchContent);
                } else {
                    String disease = healthDictSearchContent.getDisease();
                    if (!map.containsKey(disease)) {
                        map.put(disease, new ArrayList());
                    }
                    fpw fpwVar = new fpw(healthDictSearchContent.getTab(), healthDictSearchContent.getMdText());
                    List list2 = (List) map.get(disease);
                    if (list2 != null) {
                        list2.add(fpwVar);
                    }
                }
            }
        }
        return map;
    }

    private String b() {
        if (njy.e(this.e)) {
            return "";
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_health_dict_department) + ": " + qrs.a(", ", this.e);
    }
}
