package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MultiGridsTemplate;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.search.dataprovider.HotListProvider;
import com.huawei.ui.main.R;
import defpackage.fxl;
import defpackage.gvi;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqt;
import defpackage.qrs;
import defpackage.tal;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
public class HotListProvider extends BaseKnitDataProvider<List<SingleGridContent>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f26057a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26058b;
    private ResourceBriefInfo d;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<SingleGridContent> list) {
        e(context, map, list);
    }

    private void e(Context context, HashMap<String, Object> map, List<SingleGridContent> list) {
        if (list == null) {
            return;
        }
        this.f26058b = System.currentTimeMillis();
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_global_search_hot_list));
        map.put("ITEMS", list);
        int i = -1;
        for (SingleGridContent singleGridContent : list) {
            if (!this.f26057a.contains(singleGridContent.getTheme())) {
                this.f26057a.add(singleGridContent.getTheme());
                gvi.d(context, singleGridContent);
                i++;
                e(singleGridContent, 1, i);
            }
        }
        d(context, map, list);
    }

    private void d(Context context, Map<String, Object> map, Object obj) {
        if (njy.b(obj, SingleGridContent.class)) {
            map.put("CLICK_EVENT_LISTENER", new AnonymousClass3((List) obj, context));
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.search.dataprovider.HotListProvider$3, reason: invalid class name */
    public class AnonymousClass3 implements OnClickSectionListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f26059c;
        final /* synthetic */ List d;

        public static /* synthetic */ void e(int i, Object obj) {
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
        }

        AnonymousClass3(List list, Context context) {
            this.d = list;
            this.f26059c = context;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
            if (qrs.r()) {
                LogUtil.a("HotListProvider", "click too fast");
                return;
            }
            if (njy.e(this.d, i)) {
                return;
            }
            if (!LoginInit.getInstance(this.f26059c).getIsLogined()) {
                LoginInit.getInstance(this.f26059c).browsingToLogin(new IBaseResponseCallback() { // from class: taj
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj) {
                        HotListProvider.AnonymousClass3.e(i2, obj);
                    }
                }, "");
                return;
            }
            SingleGridContent singleGridContent = (SingleGridContent) this.d.get(i);
            if (singleGridContent == null) {
                return;
            }
            gvi.c(this.f26059c, singleGridContent);
            HotListProvider.this.e(singleGridContent, 2, i);
            String linkValue = singleGridContent.getLinkValue();
            LogUtil.a("HotListProvider", "open link: ", linkValue);
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(HotListProvider.this.d(linkValue, singleGridContent, i + 1));
            }
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, final SectionBean sectionBean) {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(4038);
        resourceResultInfo.addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.HotListProvider.5
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                LogUtil.a("HotListProvider", "requestMarketResource onSuccess");
                tal.c(sectionBean, map);
                Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                tal.b(sectionBean, mapFilterMarketingRules);
                if (mapFilterMarketingRules.get(4038) != null) {
                    List listC = HotListProvider.this.c(mapFilterMarketingRules.get(4038));
                    sectionBean.c(njy.e(listC) ? null : listC);
                } else {
                    LogUtil.j("HotListProvider", "resultMap does not contain search default page resource id");
                    sectionBean.c((Object) null);
                }
            }
        });
        resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.HotListProvider.4
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                LogUtil.e("HotListProvider", "requestMarketResource onFailure");
                sectionBean.c((Object) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SingleGridContent> c(ResourceResultInfo resourceResultInfo) {
        ArrayList arrayList = new ArrayList();
        if (resourceResultInfo != null) {
            List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
            if (!njy.e(resources)) {
                for (ResourceBriefInfo resourceBriefInfo : resources) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis > resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis < resourceBriefInfo.getExpirationTime() && resourceBriefInfo.getContentType() == 44) {
                        String content = resourceBriefInfo.getContent().getContent();
                        LogUtil.a("HotListProvider", "hot list content: ", content);
                        if (TextUtils.isEmpty(content)) {
                            continue;
                        } else {
                            this.d = resourceBriefInfo;
                            MultiGridsTemplate multiGridsTemplate = (MultiGridsTemplate) qqt.e(content, MultiGridsTemplate.class);
                            if (multiGridsTemplate != null) {
                                List<SingleGridContent> gridContents = multiGridsTemplate.getGridContents();
                                if (njy.b(gridContents)) {
                                    Iterator<SingleGridContent> it = gridContents.iterator();
                                    while (it.hasNext()) {
                                        fxl.d(it.next(), resourceBriefInfo);
                                    }
                                }
                                return gridContents;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SingleGridContent singleGridContent, int i, int i2) {
        if (this.d == null || singleGridContent == null) {
            LogUtil.a("HotListProvider", "setMarketingBiEvent mResourceBriefInfo or content is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put("resourcePositionId", 4038);
        map.put("resourceId", this.d.getResourceId());
        map.put("resourceName", this.d.getResourceName());
        map.put("itemCardName", singleGridContent.getTheme());
        map.put("itemId", singleGridContent.getDynamicDataId());
        map.put("smartRecommend", Boolean.valueOf(this.d.getSmartRecommend()));
        map.put("algId", "");
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        if (i == 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("durationTime", Long.valueOf(jCurrentTimeMillis - this.f26058b));
            this.f26058b = jCurrentTimeMillis;
        }
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str, SingleGridContent singleGridContent, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&pullfrom=" : "?pullfrom=");
        sb.append(4038);
        String string = sb.toString();
        if (this.d == null) {
            return string;
        }
        return string + "&resourceName=" + this.d.getResourceName() + "&resourceId=" + this.d.getResourceId() + "&pullOrder=" + i + "&itemId=" + singleGridContent.getDynamicDataId();
    }
}
