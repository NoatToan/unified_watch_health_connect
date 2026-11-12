package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.TopBannerTemplate;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wsl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TopBannerTemplate f52406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResourceBriefInfo f52407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MarketingApi f52408c;
    private final Handler d;
    private final Context e;
    private volatile MessageObject f;
    private final PersonalCenterUiApi i;

    public wsl(PersonalCenterFragment personalCenterFragment, Handler handler) {
        this.e = personalCenterFragment.getContext();
        this.i = personalCenterFragment;
        this.d = handler;
    }

    public MessageObject b() {
        return this.f;
    }

    public void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wsn
            @Override // java.lang.Runnable
            public final void run() {
                this.f52414b.d();
            }
        });
    }

    /* synthetic */ void d() {
        LogUtil.a("MyBannerAdManager", " fetchBannerAd into");
        MarketingApi marketingApiE = e();
        this.f52408c = marketingApiE;
        if (marketingApiE == null) {
            LogUtil.j("MyBannerAdManager", " fetchBannerAd mMarketingApi is null,return");
            return;
        }
        LogUtil.a("MyBannerAdManager", " fetchBannerAd into valid");
        e eVar = new e(this);
        this.f52408c.getResourceResultInfo(8001).addOnSuccessListener(eVar).addOnFailureListener(eVar);
    }

    private MarketingApi e() {
        if (this.f52408c == null) {
            this.f52408c = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        }
        return this.f52408c;
    }

    static class e implements OnSuccessListener<Map<Integer, ResourceResultInfo>>, OnFailureListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<wsl> f52410c;

        e(wsl wslVar) {
            this.f52410c = new WeakReference<>(wslVar);
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Map<Integer, ResourceResultInfo> map) {
            final wsl wslVar = this.f52410c.get();
            if (wslVar == null) {
                LogUtil.j("MyBannerAdManager", " OnAdDataSuccessListener myBannerAdManager is null");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: wsk
                    @Override // java.lang.Runnable
                    public final void run() {
                        wslVar.b(map);
                    }
                });
            }
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            LogUtil.e("MyBannerAdManager", "Banner AD Load Failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<Integer, ResourceResultInfo> map) {
        if (this.f52408c == null || map == null) {
            LogUtil.j("MyBannerAdManager", "mMarketingApi is null.");
            this.d.sendEmptyMessage(com.huawei.hms.kit.awareness.barrier.internal.e.a.A);
            return;
        }
        LogUtil.a("MyBannerAdManager", "handleData resultInfoMap size = ", Integer.valueOf(map.size()));
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = this.f52408c.filterMarketingRules(map);
        if (mapFilterMarketingRules == null || !mapFilterMarketingRules.containsKey(8001) || mapFilterMarketingRules.get(8001) == null) {
            LogUtil.j("MyBannerAdManager", "filterResult is invalid data.");
            this.d.sendEmptyMessage(com.huawei.hms.kit.awareness.barrier.internal.e.a.A);
            return;
        }
        List<ResourceBriefInfo> resources = mapFilterMarketingRules.get(8001).getResources();
        if (njy.e(resources)) {
            LogUtil.j("MyBannerAdManager", "resInfoList is empty.");
            this.d.sendEmptyMessage(com.huawei.hms.kit.awareness.barrier.internal.e.a.A);
            return;
        }
        Gson gson = new Gson();
        ResourceBriefInfo resourceBriefInfo = null;
        TopBannerTemplate topBannerTemplate = null;
        for (ResourceBriefInfo resourceBriefInfo2 : resources) {
            if (resourceBriefInfo2 == null || resourceBriefInfo2.getContentType() != 30 || resourceBriefInfo2.getContent() == null || TextUtils.isEmpty(resourceBriefInfo2.getContent().getContent())) {
                LogUtil.j("MyBannerAdManager", "resource brief info invalid");
            } else {
                String content = resourceBriefInfo2.getContent().getContent();
                LogUtil.a("MyBannerAdManager", " marketing2.0: ", content);
                TopBannerTemplate topBannerTemplate2 = (TopBannerTemplate) gson.fromJson(content, TopBannerTemplate.class);
                if (topBannerTemplate2 == null) {
                    LogUtil.j("MyBannerAdManager", "resource template parse exception");
                } else if (resourceBriefInfo == null || resourceBriefInfo.getPriority() < resourceBriefInfo2.getPriority()) {
                    resourceBriefInfo = resourceBriefInfo2;
                    topBannerTemplate = topBannerTemplate2;
                }
            }
        }
        d(resourceBriefInfo, topBannerTemplate);
    }

    private void d(ResourceBriefInfo resourceBriefInfo, TopBannerTemplate topBannerTemplate) {
        if (topBannerTemplate == null || resourceBriefInfo == null || TextUtils.isEmpty(topBannerTemplate.getPicture()) || TextUtils.isEmpty(topBannerTemplate.getLinkValue())) {
            LogUtil.j("MyBannerAdManager", " tmpTemplate or tmpHealthInfo is null, or tmpTemplate data invalid.");
            return;
        }
        MessageObject messageObject = new MessageObject();
        messageObject.setImgUri(topBannerTemplate.getPicture());
        messageObject.setDetailUri(topBannerTemplate.getLinkValue());
        messageObject.setMsgId(resourceBriefInfo.getResourceId());
        messageObject.setMetaData(resourceBriefInfo.getResourceName());
        messageObject.setCreateTime(resourceBriefInfo.getEffectiveTime());
        messageObject.setExpireTime(resourceBriefInfo.getExpirationTime());
        messageObject.setWeight(resourceBriefInfo.getPriority());
        messageObject.setMsgType(resourceBriefInfo.getContentType());
        messageObject.setResBriefInfo(resourceBriefInfo);
        this.f = messageObject;
        ResourceBriefInfo resourceBriefInfo2 = this.f52407b;
        if (resourceBriefInfo2 == null || !(resourceBriefInfo2.equals(resourceBriefInfo) || topBannerTemplate.getPicture().equals(this.f52406a.getPicture()) || topBannerTemplate.getLinkValue().equals(this.f52406a.getLinkValue()))) {
            Handler handler = this.d;
            handler.sendMessage(handler.obtainMessage(com.huawei.hms.kit.awareness.barrier.internal.e.a.A, topBannerTemplate.getPicture()));
            this.f52407b = resourceBriefInfo;
            this.f52406a = topBannerTemplate;
            e(this.f, 0L, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MessageObject messageObject, long j, int i) {
        if (messageObject == null) {
            LogUtil.j("MyBannerAdManager", "biEvent msgObj is null");
            return;
        }
        LogUtil.j("MyBannerAdManager", "biEvent event = ", Integer.valueOf(i));
        HashMap map = new HashMap();
        map.put("resourcePositionId", 8001);
        map.put("resourceId", messageObject.getMsgId());
        map.put("resourceName", messageObject.getMetaData());
        map.put("itemCardName", "ADV_BANNER");
        map.put("itemId", "");
        map.put("pullOrder", 1);
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
        }
        if (messageObject.getResBriefInfo() != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(messageObject.getResBriefInfo().getSmartRecommend()));
        }
        map.put("event", Integer.valueOf(i));
        lmf.d().c(this.e, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
        if (i != 4) {
            if (i != 2) {
                LogUtil.j("MyBannerAdManager", "biEvent error event = ", Integer.valueOf(i));
                return;
            } else {
                fxl.d(messageObject.getDetailUri(), 8001, a(messageObject));
                return;
            }
        }
        this.f52408c = e();
        ResourceBriefInfo resBriefInfo = messageObject.getResBriefInfo();
        MarketingApi marketingApi = this.f52408c;
        if (marketingApi != null && resBriefInfo != null) {
            marketingApi.recordResourcePresent(8001, 1, resBriefInfo);
        }
        this.i.updateBannerAd(null, null);
        this.f = null;
    }

    private ResourceBriefInfo a(MessageObject messageObject) {
        return new ResourceBriefInfo.Builder().setResourceId(messageObject.getMsgId()).setResourceName(messageObject.getMetaData()).build();
    }

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<wsl> f52409b;

        public a(wsl wslVar) {
            this.f52409b = new WeakReference<>(wslVar);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qrs.e(view)) {
                LogUtil.a("MyBannerAdManager", "click too fast");
                return;
            }
            wsl wslVar = this.f52409b.get();
            if (wslVar == null) {
                return;
            }
            Object tag = view.getTag(R.layout.item_personal_center_banner_ad);
            long jLongValue = tag instanceof Long ? ((Long) tag).longValue() : 0L;
            int id = view.getId();
            if (id == R.id.item_banner_ad_img) {
                wslVar.e(wslVar.f, jLongValue, 2);
            } else if (id == R.id.item_banner_ad_close_icon) {
                wslVar.e(wslVar.f, jLongValue, 4);
            } else {
                LogUtil.a("MyBannerAdManager", "onClick id:", Integer.valueOf(id));
            }
        }
    }
}
