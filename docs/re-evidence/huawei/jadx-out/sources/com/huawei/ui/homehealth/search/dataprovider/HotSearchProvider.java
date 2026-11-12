package com.huawei.ui.homehealth.search.dataprovider;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleTextContent;
import com.huawei.health.marketing.datatype.TextLinkTemplate;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.dataprovider.HotSearchProvider;
import com.huawei.ui.main.R;
import defpackage.gvi;
import defpackage.njy;
import defpackage.qqt;
import defpackage.tal;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
public class HotSearchProvider extends BaseKnitDataProvider<List<SingleTextContent>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f26063c = new HashSet();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<SingleTextContent> list) {
        b(context, map, list);
    }

    private void b(Context context, HashMap<String, Object> map, List<SingleTextContent> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SingleTextContent singleTextContent : list) {
            arrayList.add(singleTextContent.getTheme());
            String marketingIcon = singleTextContent.getMarketingIcon();
            if (marketingIcon == null) {
                marketingIcon = "";
            }
            arrayList2.add(marketingIcon);
            if (!this.f26063c.contains(singleTextContent.getTheme())) {
                this.f26063c.add(singleTextContent.getTheme());
                gvi.d(context, singleTextContent);
            }
        }
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_global_search_hot_search));
        map.put("IS_LOAD_DEFAULT_VIEW", false);
        map.put("ITEM_TITLE", arrayList);
        map.put("RIGHT_ICON_TEXT", arrayList2);
        e(context, map, list);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.search.dataprovider.HotSearchProvider$3, reason: invalid class name */
    public class AnonymousClass3 implements OnClickSectionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f26068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26069c;

        public static /* synthetic */ void a(int i, Object obj) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
        }

        AnonymousClass3(List list, Context context) {
            this.f26069c = list;
            this.f26068b = context;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
            if (njy.e(this.f26069c, i)) {
                return;
            }
            SingleTextContent singleTextContent = (SingleTextContent) this.f26069c.get(i);
            gvi.e(this.f26068b, singleTextContent);
            String linkType = singleTextContent.getLinkType() != null ? singleTextContent.getLinkType() : "search";
            linkType.hashCode();
            if (!linkType.equals("normal")) {
                if (linkType.equals("search")) {
                    Activity activity = BaseApplication.getActivity();
                    if (activity instanceof GlobalSearchActivity) {
                        ((GlobalSearchActivity) activity).b(str);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!LoginInit.getInstance(this.f26068b).getIsLogined()) {
                LoginInit.getInstance(this.f26068b).browsingToLogin(new IBaseResponseCallback() { // from class: tai
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj) {
                        HotSearchProvider.AnonymousClass3.a(i2, obj);
                    }
                }, "");
                return;
            }
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(singleTextContent.getLinkValue());
            }
        }
    }

    private void e(Context context, Map<String, Object> map, List<SingleTextContent> list) {
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass3(list, context));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, final SectionBean sectionBean) {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(9002);
        resourceResultInfo.addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.HotSearchProvider.2
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                LogUtil.a("HotSearchProvider", "requestMarketResource onSuccess");
                tal.c(sectionBean, map);
                Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                tal.b(sectionBean, mapFilterMarketingRules);
                if (mapFilterMarketingRules.get(9002) != null) {
                    List listE = HotSearchProvider.this.e(mapFilterMarketingRules.get(9002));
                    Collections.sort(listE, new Comparator<SingleTextContent>() { // from class: com.huawei.ui.homehealth.search.dataprovider.HotSearchProvider.2.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public int compare(SingleTextContent singleTextContent, SingleTextContent singleTextContent2) {
                            return singleTextContent.getPriority() - singleTextContent2.getPriority();
                        }
                    });
                    sectionBean.c(njy.e(listE) ? null : listE);
                    return;
                }
                sectionBean.c((Object) null);
            }
        });
        resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.HotSearchProvider.1
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                sectionBean.c((Object) null);
                LogUtil.e("HotSearchProvider", "requestMarketResource onFailure");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SingleTextContent> e(ResourceResultInfo resourceResultInfo) {
        TextLinkTemplate textLinkTemplate;
        ArrayList arrayList = new ArrayList();
        if (resourceResultInfo != null) {
            List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
            if (!njy.e(resources)) {
                for (ResourceBriefInfo resourceBriefInfo : resources) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis > resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis < resourceBriefInfo.getExpirationTime() && resourceBriefInfo.getContentType() == 35) {
                        String content = resourceBriefInfo.getContent().getContent();
                        LogUtil.a("HotSearchProvider", "text link content: ", content);
                        if (!TextUtils.isEmpty(content) && (textLinkTemplate = (TextLinkTemplate) qqt.e(content, TextLinkTemplate.class)) != null && !njy.e(textLinkTemplate.getGridContents())) {
                            return textLinkTemplate.getGridContents();
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
