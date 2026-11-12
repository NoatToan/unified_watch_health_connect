package com.huawei.ui.homehealth.operationcard;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
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
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.operationcard.OperationCardData;
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

/* JADX INFO: loaded from: classes17.dex */
public class OperationCardData extends AbstractBaseCardData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceResultInfo f25671c;
    private final Handler e;
    private MessageObserver g;
    private MessageCenterApi h;
    private List<MessageObject> i;
    private OperationCardViewHolder j;
    private CopyOnWriteArrayList<MessageObject> l;
    private Map<Integer, ResourceResultInfo> d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25669a = 0;
    private boolean f = true;

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
    }

    static /* synthetic */ int e(OperationCardData operationCardData) {
        int i = operationCardData.f25669a;
        operationCardData.f25669a = i + 1;
        return i;
    }

    static class e extends BaseHandler<OperationCardData> {
        e(OperationCardData operationCardData) {
            super(operationCardData);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(OperationCardData operationCardData, Message message) {
            if (message.what != 0) {
                return;
            }
            if (operationCardData.j != null) {
                if (operationCardData.l.size() != 0) {
                    LogUtil.a("OperationCardData", "handleMessage UPDATE mThreadList size is ", Integer.valueOf(operationCardData.l.size()));
                    operationCardData.j.b(0);
                    operationCardData.i.clear();
                    operationCardData.i.addAll(operationCardData.l);
                    LogUtil.a("OperationCardData", "handleMessage UPDATE mList size is ", Integer.valueOf(operationCardData.i.size()));
                    boolean zC = operationCardData.j.c();
                    LogUtil.a("OperationCardData", "handleMessage UPDATE isNotify is ", Boolean.valueOf(zC));
                    if (!zC) {
                        if (operationCardData.f25669a < 5) {
                            LogUtil.a("OperationCardData", "handleMessage UPDATE again");
                            OperationCardData.e(operationCardData);
                            sendEmptyMessageDelayed(0, 300L);
                            return;
                        }
                        return;
                    }
                    operationCardData.f25669a = 0;
                    return;
                }
                LogUtil.j("OperationCardData", "handleMessage UPDATE mThreadList size is zero");
                operationCardData.j.b(8);
                return;
            }
            LogUtil.j("OperationCardData", "handleMessage UPDATE mOperationCardViewHolder is null");
        }
    }

    public static class c implements MessageObserver {
        private final WeakReference<OperationCardData> e;

        c(OperationCardData operationCardData) {
            this.e = new WeakReference<>(operationCardData);
        }

        @Override // com.huawei.pluginmessagecenter.service.MessageObserver
        public void onChange(int i, MessageChangeEvent messageChangeEvent) {
            LogUtil.a("OperationCardData", "MessageObserver onChange start");
            final OperationCardData operationCardData = this.e.get();
            if (operationCardData == null) {
                LogUtil.j("OperationCardData", "cardData is null");
            } else {
                ThreadPoolManager.c().b("OperationCardData", new Runnable() { // from class: srz
                    @Override // java.lang.Runnable
                    public final void run() {
                        OperationCardData.c.d(operationCardData);
                    }
                });
                LogUtil.a("OperationCardData", "MessageObserver onChange end");
            }
        }

        public static /* synthetic */ void d(OperationCardData operationCardData) {
            operationCardData.f = false;
            operationCardData.j();
        }
    }

    public OperationCardData(Context context) {
        LogUtil.a("OperationCardData", "OperationCardData");
        this.f25670b = context;
        this.mPositionTag = 80;
        this.i = new ArrayList();
        this.l = new CopyOnWriteArrayList<>();
        this.e = new e(this);
        b();
    }

    private void b() {
        if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            g();
        } else {
            a();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onConfigurationChanged(Configuration configuration) {
        OperationCardViewHolder operationCardViewHolder = this.j;
        if (operationCardViewHolder != null) {
            operationCardViewHolder.c();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.j = new OperationCardViewHolder(layoutInflater.inflate(R.layout.home_item_layout_operation, viewGroup, false), this.f25670b, false);
        e();
        return this.j;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "OperationCardData";
    }

    private void e() {
        this.j.b(this.i, this.d);
        this.j.b(8);
        if (!njy.e(this.l) || !this.d.isEmpty()) {
            LogUtil.a("OperationCardData", "data is ready,show");
            this.e.sendEmptyMessage(0);
        } else {
            a();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        i();
        this.j = null;
        this.e.removeCallbacksAndMessages(null);
        this.g = null;
        this.mNotifyCardManager = null;
        this.l.clear();
        this.i.clear();
    }

    private void g() {
        LogUtil.a("OperationCardData", "registerObserver");
        this.g = new c(this);
        this.h = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        ThreadPoolManager.c().execute(new Runnable() { // from class: ssb
            @Override // java.lang.Runnable
            public final void run() {
                this.f48582a.d();
            }
        });
    }

    public /* synthetic */ void d() {
        this.h.registerMessageObserver(this.g);
    }

    private void i() {
        LogUtil.a("OperationCardData", "unregisterObserver");
        if (this.g == null || this.h == null) {
            return;
        }
        LogUtil.a("OperationCardData", "unregisterObserver mMessageCenter and mMessageObs is not null");
        this.h.unregisterMessageObserver(this.g);
    }

    private void a() {
        ThreadPoolManager.c().b("OperationCardData", new Runnable() { // from class: com.huawei.ui.homehealth.operationcard.OperationCardData.4
            @Override // java.lang.Runnable
            public void run() {
                if (OperationCardData.this.f) {
                    OperationCardData.this.j();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ReleaseLogUtil.d("R_OperationCardData", "enter operationCardMessage");
        this.l.clear();
        if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            ReleaseLogUtil.d("R_OperationCardData", "get operationCardMessage from messageCenter");
            if (this.h == null) {
                this.h = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
            }
            List<MessageObject> messages = this.h.getMessages(30);
            if (njy.b(messages)) {
                a(messages);
                Collections.sort(messages, new ssd());
                for (int i = 0; i < messages.size() && i < 3; i++) {
                    this.l.add(messages.get(i));
                    LogUtil.a("OperationCardData", "messageObjectList id:", messages.get(i).getMsgId());
                }
            }
            ReleaseLogUtil.d("R_OperationCardData", "operationCardMessage mThreadList size is ", Integer.valueOf(this.l.size()));
            this.e.sendEmptyMessage(0);
            return;
        }
        c();
    }

    private void c() {
        ReleaseLogUtil.d("R_OperationCardData", "enter getBannerData");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1001);
        arrayList.add(4167);
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.getResourceResultInfo(arrayList).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.homehealth.operationcard.OperationCardData.5
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                    boolean z = false;
                    for (Map.Entry<Integer, ResourceResultInfo> entry : mapFilterMarketingRules.entrySet()) {
                        if (entry.getKey().intValue() != 1001) {
                            if (OperationCardData.this.d.containsKey(entry.getKey()) && !z) {
                                if (!qqt.b((ResourceResultInfo) OperationCardData.this.d.get(entry.getKey())).equals(qqt.b(entry.getValue()))) {
                                    ReleaseLogUtil.e("R_OperationCardData", "other resourceResultInfo is diff");
                                    z = true;
                                }
                            }
                            OperationCardData.this.d.put(entry.getKey(), entry.getValue());
                        } else {
                            ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(1001);
                            if (resourceResultInfo == null) {
                                ReleaseLogUtil.e("R_OperationCardData", "resourceResultInfo = null");
                            } else {
                                List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
                                if (!njy.e(resources)) {
                                    if (!qqt.b(OperationCardData.this.f25671c).equals(qqt.b(resourceResultInfo))) {
                                        ReleaseLogUtil.e("R_OperationCardData", "banner resourceResultInfo is diff");
                                        if (OperationCardData.this.j != null) {
                                            OperationCardData.this.f25671c = resourceResultInfo;
                                        }
                                        ReleaseLogUtil.d("R_OperationCardData", "resourceBriefInfoList size:", Integer.valueOf(resources.size()));
                                        OperationCardData.this.b(resources);
                                        z = true;
                                    }
                                } else {
                                    ReleaseLogUtil.d("R_OperationCardData", "resourceBriefInfoList is empty");
                                }
                            }
                        }
                    }
                    ReleaseLogUtil.e("R_OperationCardData", "getBannerData isNeedUpdate:", Boolean.valueOf(z));
                    if (z) {
                        OperationCardData.this.e.sendEmptyMessage(0);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<ResourceBriefInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ResourceBriefInfo resourceBriefInfo : list) {
            DailyRecommendTemplate dailyRecommendTemplateC = c(resourceBriefInfo);
            if (dailyRecommendTemplateC != null) {
                MessageObject messageObject = new MessageObject();
                messageObject.setImgUri(dailyRecommendTemplateC.getPicture());
                messageObject.setDetailUri(dailyRecommendTemplateC.getLinkValue());
                messageObject.setMsgTitle(dailyRecommendTemplateC.getThemeVisibility() ? dailyRecommendTemplateC.getTheme() : "");
                messageObject.setMsgContent(dailyRecommendTemplateC.getDescriptionVisibility() ? dailyRecommendTemplateC.getDescription() : "");
                messageObject.setMsgId(resourceBriefInfo.getResourceId());
                messageObject.setWeight(resourceBriefInfo.getPriority());
                messageObject.setMsgFrom(resourceBriefInfo.getResourceName());
                messageObject.setCategory(resourceBriefInfo.getCategory());
                messageObject.setResBriefInfo(resourceBriefInfo);
                messageObject.setDynamicDataId(dailyRecommendTemplateC.getDynamicDataId());
                arrayList.add(messageObject);
            }
        }
        LogUtil.a("OperationCardData", "messageObjectList:", Integer.valueOf(arrayList.size()));
        Collections.sort(arrayList, new ssd());
        this.l.clear();
        ArrayList arrayList2 = new ArrayList(10);
        for (int i = 0; i < arrayList.size() && i < 3; i++) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(i);
            this.l.add(messageObject2);
            LogUtil.a("OperationCardData", "messageObjectList id:", messageObject2.getMsgId());
            String category = messageObject2.getCategory();
            String dynamicDataId = messageObject2.getDynamicDataId();
            if (TextUtils.equals(category, SingleDailyMomentContent.ACTIVITY_TYPE) && !TextUtils.isEmpty(dynamicDataId) && !arrayList2.contains(dynamicDataId)) {
                arrayList2.add(dynamicDataId);
            }
        }
        if (njy.e(arrayList2)) {
            return;
        }
        e(arrayList2);
    }

    private void e(final List<String> list) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ssa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48581c.c(list);
                }
            });
            return;
        }
        List<ActivityIdInfo> listRequestActivityInfo = ColumnRequestUtils.requestActivityInfo(this.f25670b, 1001, list);
        HashSet hashSet = new HashSet(10);
        for (ActivityIdInfo activityIdInfo : listRequestActivityInfo) {
            String activityId = activityIdInfo.getActivityId();
            int numberOfPeople = activityIdInfo.getNumberOfPeople();
            for (MessageObject messageObject : this.l) {
                String msgId = messageObject.getMsgId();
                if (!hashSet.contains(msgId) && TextUtils.equals(activityId, messageObject.getDynamicDataId())) {
                    messageObject.setActivityJoinNum(numberOfPeople);
                    hashSet.add(msgId);
                    break;
                }
            }
        }
        this.e.sendEmptyMessage(0);
    }

    public /* synthetic */ void c(List list) {
        e((List<String>) list);
    }

    public static DailyRecommendTemplate c(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || resourceBriefInfo.getContent().getContent() == null) {
            LogUtil.a("OperationCardData", "resourceBriefInfo = null");
            return null;
        }
        String content = resourceBriefInfo.getContent().getContent();
        LogUtil.a("OperationCardData", "popUpTemplateStr: ", content);
        try {
            return (DailyRecommendTemplate) new Gson().fromJson(content, DailyRecommendTemplate.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("OperationCardData", "getDailyRecommendTemplate json syntax exception");
            return null;
        }
    }

    private void a(List<MessageObject> list) {
        String url = GRSManager.c(this.f25670b).getUrl("domainClubHuawei");
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
}
