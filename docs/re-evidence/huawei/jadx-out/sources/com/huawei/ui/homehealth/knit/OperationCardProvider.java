package com.huawei.ui.homehealth.knit;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.templates.DailyRecommendTemplate;
import com.huawei.health.marketing.request.ActivityIdInfo;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import com.huawei.ui.homehealth.knit.OperationCardProvider;
import defpackage.ddv;
import defpackage.njy;
import defpackage.qqt;
import defpackage.ssd;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class OperationCardProvider extends BaseKnitDataProvider<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResourceResultInfo f25632a;
    private Context e;
    private MessageObserver g;
    private MessageCenterApi h;
    private SectionBean n;
    private CopyOnWriteArrayList<MessageObject> j = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, ResourceResultInfo> f25633b = new HashMap();
    private List<View> o = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<DailyRecommendTemplate> f25634c = new ArrayList();
    private boolean i = true;
    private Map<String, Object> f = new HashMap();
    private long d = System.currentTimeMillis();

    public OperationCardProvider() {
        c();
    }

    private void c() {
        if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            j();
        } else {
            a();
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap<String, Object> map, Object obj) {
        LogUtil.a("OperationCardProvider", "operation card parseParams, size: ", Integer.valueOf(this.f.size()));
        map.clear();
        map.putAll(this.f);
        this.f.remove("NOTIFY_UPDATE");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("OperationCardProvider", "operation card loadData");
        this.e = context;
        this.n = sectionBean;
        if (!njy.e(this.j) || !this.f25633b.isEmpty()) {
            LogUtil.a("OperationCardProvider", "data is ready,show");
            f();
        } else {
            a();
        }
    }

    private void e() {
        this.f.put("DATA_LIST", this.j);
        this.f.put("TEMPLATE_LIST", this.f25634c);
    }

    public static class e implements MessageObserver {
        private final WeakReference<OperationCardProvider> d;

        e(OperationCardProvider operationCardProvider) {
            this.d = new WeakReference<>(operationCardProvider);
        }

        @Override // com.huawei.pluginmessagecenter.service.MessageObserver
        public void onChange(int i, MessageChangeEvent messageChangeEvent) {
            LogUtil.a("OperationCardProvider", "MessageObserver onChange start");
            final OperationCardProvider operationCardProvider = this.d.get();
            if (operationCardProvider == null) {
                LogUtil.j("OperationCardProvider", "cardData is null");
            } else {
                ThreadPoolManager.c().b("OperationCardProvider", new Runnable() { // from class: sqk
                    @Override // java.lang.Runnable
                    public final void run() {
                        OperationCardProvider.e.d(operationCardProvider);
                    }
                });
                LogUtil.a("OperationCardProvider", "MessageObserver onChange end");
            }
        }

        public static /* synthetic */ void d(OperationCardProvider operationCardProvider) {
            operationCardProvider.i = false;
            operationCardProvider.i();
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        h();
        this.g = null;
        this.j.clear();
    }

    private void j() {
        LogUtil.a("OperationCardProvider", "registerObserver");
        this.g = new e(this);
        this.h = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        ThreadPoolManager.c().execute(new Runnable() { // from class: sqi
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        });
    }

    public /* synthetic */ void b() {
        this.h.registerMessageObserver(this.g);
    }

    private void h() {
        LogUtil.a("OperationCardProvider", "unregisterObserver");
        if (this.g == null || this.h == null) {
            return;
        }
        LogUtil.a("OperationCardProvider", "unregisterObserver mMessageCenter and mMessageObs is not null");
        this.h.unregisterMessageObserver(this.g);
    }

    private void a() {
        ThreadPoolManager.c().b("OperationCardProvider", new Runnable() { // from class: com.huawei.ui.homehealth.knit.OperationCardProvider.4
            @Override // java.lang.Runnable
            public void run() {
                if (OperationCardProvider.this.i) {
                    OperationCardProvider.this.i();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ReleaseLogUtil.d("R_OperationCardProvider", "enter operationCardMessage");
        this.j.clear();
        if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            ReleaseLogUtil.d("R_OperationCardProvider", "get operationCardMessage from messageCenter");
            if (this.h == null) {
                this.h = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
            }
            List<MessageObject> messages = this.h.getMessages(30);
            if (njy.b(messages)) {
                c(messages);
                Collections.sort(messages, new ssd());
                for (int i = 0; i < messages.size() && i < 3; i++) {
                    this.j.add(messages.get(i));
                    LogUtil.a("OperationCardProvider", "messageObjectList id:", messages.get(i).getMsgId());
                }
            }
            ReleaseLogUtil.d("R_OperationCardProvider", "operationCardMessage mThreadList size is ", Integer.valueOf(this.j.size()));
            f();
            return;
        }
        d();
    }

    private void d() {
        ReleaseLogUtil.d("R_OperationCardProvider", "enter getBannerData");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1001);
        arrayList.add(4167);
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.getResourceResultInfo(arrayList).addOnSuccessListener(new OnSuccessListener() { // from class: sqc
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f48517b.d(marketingApi, (Map) obj);
                }
            });
        }
    }

    public /* synthetic */ void d(MarketingApi marketingApi, Map map) {
        c(marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map));
    }

    private void c(Map<Integer, ResourceResultInfo> map) {
        boolean z = false;
        for (Map.Entry<Integer, ResourceResultInfo> entry : map.entrySet()) {
            if (entry.getKey().intValue() == 1001) {
                ResourceResultInfo resourceResultInfo = map.get(1001);
                if (resourceResultInfo == null) {
                    ReleaseLogUtil.e("R_OperationCardProvider", "resourceResultInfo = null");
                } else {
                    List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
                    if (njy.e(resources)) {
                        ReleaseLogUtil.d("R_OperationCardProvider", "resourceBriefInfoList is empty");
                    } else if (!qqt.b(this.f25632a).equals(qqt.b(resourceResultInfo))) {
                        ReleaseLogUtil.e("R_OperationCardProvider", "banner resourceResultInfo is diff");
                        if (!this.j.isEmpty()) {
                            this.f25632a = resourceResultInfo;
                        }
                        ReleaseLogUtil.d("R_OperationCardProvider", "resourceBriefInfoList size:", Integer.valueOf(resources.size()));
                        e(resources);
                        z = true;
                    }
                }
            } else {
                if (this.f25633b.containsKey(entry.getKey()) && !z) {
                    if (!qqt.b(this.f25633b.get(entry.getKey())).equals(qqt.b(entry.getValue()))) {
                        ReleaseLogUtil.e("R_OperationCardProvider", "other resourceResultInfo is diff");
                        z = true;
                    }
                }
                this.f25633b.put(entry.getKey(), entry.getValue());
            }
        }
        ReleaseLogUtil.e("R_OperationCardProvider", "getBannerData isNeedUpdate:", Boolean.valueOf(z));
        if (z) {
            f();
        }
    }

    private void e(List<ResourceBriefInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ResourceBriefInfo resourceBriefInfo : list) {
            DailyRecommendTemplate dailyRecommendTemplateB = b(resourceBriefInfo);
            if (dailyRecommendTemplateB != null) {
                MessageObject messageObject = new MessageObject();
                messageObject.setImgUri(dailyRecommendTemplateB.getPicture());
                messageObject.setDetailUri(dailyRecommendTemplateB.getLinkValue());
                messageObject.setMsgTitle(dailyRecommendTemplateB.getThemeVisibility() ? dailyRecommendTemplateB.getTheme() : "");
                messageObject.setMsgContent(dailyRecommendTemplateB.getDescriptionVisibility() ? dailyRecommendTemplateB.getDescription() : "");
                messageObject.setMsgId(resourceBriefInfo.getResourceId());
                messageObject.setWeight(resourceBriefInfo.getPriority());
                messageObject.setMsgFrom(resourceBriefInfo.getResourceName());
                messageObject.setCategory(resourceBriefInfo.getCategory());
                messageObject.setResBriefInfo(resourceBriefInfo);
                messageObject.setDynamicDataId(dailyRecommendTemplateB.getDynamicDataId());
                arrayList.add(messageObject);
            }
        }
        LogUtil.a("OperationCardProvider", "messageObjectList:", Integer.valueOf(arrayList.size()));
        Collections.sort(arrayList, new ssd());
        this.j.clear();
        ArrayList arrayList2 = new ArrayList(10);
        for (int i = 0; i < arrayList.size() && i < 3; i++) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(i);
            this.j.add(messageObject2);
            LogUtil.a("OperationCardProvider", "messageObjectList id:", messageObject2.getMsgId());
            String category = messageObject2.getCategory();
            String dynamicDataId = messageObject2.getDynamicDataId();
            if (TextUtils.equals(category, SingleDailyMomentContent.ACTIVITY_TYPE) && !TextUtils.isEmpty(dynamicDataId) && !arrayList2.contains(dynamicDataId)) {
                arrayList2.add(dynamicDataId);
            }
        }
        if (njy.e(arrayList2)) {
            return;
        }
        d(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(final List<String> list) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: sqh
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(list);
                }
            });
            return;
        }
        List<ActivityIdInfo> listRequestActivityInfo = ColumnRequestUtils.requestActivityInfo(this.e, 1001, list);
        HashSet hashSet = new HashSet(10);
        for (ActivityIdInfo activityIdInfo : listRequestActivityInfo) {
            String activityId = activityIdInfo.getActivityId();
            int numberOfPeople = activityIdInfo.getNumberOfPeople();
            for (MessageObject messageObject : this.j) {
                String msgId = messageObject.getMsgId();
                if (!hashSet.contains(msgId) && TextUtils.equals(activityId, messageObject.getDynamicDataId())) {
                    messageObject.setActivityJoinNum(numberOfPeople);
                    hashSet.add(msgId);
                    break;
                }
            }
        }
        f();
    }

    public static DailyRecommendTemplate b(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || resourceBriefInfo.getContent().getContent() == null) {
            LogUtil.j("OperationCardProvider", "resourceBriefInfo = null");
            return null;
        }
        String content = resourceBriefInfo.getContent().getContent();
        LogUtil.a("OperationCardProvider", "popUpTemplateStr: ", content);
        return (DailyRecommendTemplate) qqt.e(content, DailyRecommendTemplate.class);
    }

    private void c(List<MessageObject> list) {
        String url = GRSManager.c(this.e).getUrl("domainClubHuawei");
        Iterator<MessageObject> it = list.iterator();
        while (it.hasNext()) {
            String detailUri = it.next().getDetailUri();
            if (!TextUtils.isEmpty(detailUri)) {
                if (detailUri.contains(url + "/")) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.knit.OperationCardProvider.1
                @Override // java.lang.Runnable
                public void run() {
                    OperationCardProvider.this.f();
                }
            });
            return;
        }
        if (!this.j.isEmpty()) {
            this.f25634c.clear();
            Iterator<MessageObject> it = this.j.iterator();
            while (it.hasNext()) {
                this.f25634c.add(b(it.next().getResBriefInfo()));
            }
        }
        List<View> marketingViewList = ((MarketingApi) Services.b("FeatureMarketing", MarketingApi.class)).getMarketingViewList(this.e, this.f25633b);
        this.o = marketingViewList;
        this.f.put("VIEW_LIST", marketingViewList);
        this.f.put("NOTIFY_UPDATE", true);
        g();
    }

    private void g() {
        LogUtil.a("OperationCardProvider", "operation card refreshSection");
        e();
        SectionBean sectionBean = this.n;
        if (sectionBean != null) {
            sectionBean.c(new Object());
        }
    }
}
