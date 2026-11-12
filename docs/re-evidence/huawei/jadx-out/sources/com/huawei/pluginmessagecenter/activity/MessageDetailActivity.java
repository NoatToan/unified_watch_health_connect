package com.huawei.pluginmessagecenter.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.ProxyConfig;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.InternalLetterTemplate;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.model.BenefitMessage;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.vip.api.VipApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.pluginmessagecenter.R;
import com.huawei.pluginmessagecenter.adapter.MessageDetailAdapter;
import com.huawei.pluginmessagecenter.listener.OnItemVisibleListener;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi;
import defpackage.irz;
import defpackage.lmf;
import defpackage.njy;
import defpackage.pha;
import defpackage.phn;
import defpackage.pho;
import defpackage.php;
import defpackage.qqt;
import defpackage.qrs;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class MessageDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22399b;
    private CustomTitleBar d;
    private ListView e;
    private MessageDetailAdapter i;
    private MarketingApi j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExecutorService f22400c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f22398a = false;
    private Map<Integer, List<MessageObject>> h = new ConcurrentHashMap(16);
    private Handler f = new Handler() { // from class: com.huawei.pluginmessagecenter.activity.MessageDetailActivity.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 0) {
                return;
            }
            MessageDetailActivity.this.a((List<MessageObject>) message.obj);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("module");
        setContentView(R.layout.activity_message_datail_list);
        LogUtil.a("UIDV_MessageDetailActivity", "module", stringExtra);
        clearBackgroundDrawable();
        this.e = (ListView) findViewById(R.id.items_detail_listView);
        this.d = (CustomTitleBar) findViewById(R.id.message_detail_title);
        if (stringExtra != null) {
            b(stringExtra);
        }
        this.e.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.pluginmessagecenter.activity.MessageDetailActivity.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                MessageDetailActivity.this.a(adapterView, view, i, j);
            }
        });
        MessageDetailAdapter messageDetailAdapter = new MessageDetailAdapter(this, new ArrayList(0));
        this.i = messageDetailAdapter;
        messageDetailAdapter.e(new e(this));
        this.e.setAdapter((ListAdapter) this.i);
        if (String.valueOf(14).equals(stringExtra)) {
            int iD = d();
            CountDownLatch countDownLatch = new CountDownLatch(2);
            c cVar = new c(this, stringExtra, iD, countDownLatch);
            e(iD, countDownLatch);
            this.f22400c.execute(cVar);
            return;
        }
        if (String.valueOf(80).equals(stringExtra)) {
            e();
        } else {
            this.f22400c.execute(new c(this, stringExtra));
        }
    }

    private void e() {
        List<MessageObject> listA = a();
        if (njy.e(listA)) {
            LogUtil.j("UIDV_MessageDetailActivity", "showAssetMessage messageObjects is empty");
            finish();
        } else {
            Handler handler = this.f;
            handler.sendMessage(handler.obtainMessage(0, listA));
            c(listA);
        }
    }

    private void d(List<MessageObject> list) {
        LogUtil.a("UIDV_MessageDetailActivity", "setMemberMessageRead");
        ArrayList arrayList = new ArrayList();
        for (MessageObject messageObject : list) {
            if (messageObject.getReadFlag() == 0) {
                arrayList.add(messageObject.getMsgId());
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("UIDV_MessageDetailActivity", "messageIds is empty");
            return;
        }
        LogUtil.a("UIDV_MessageDetailActivity", "messageIds:", arrayList.toString());
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("UIDV_MessageDetailActivity", "getVipMessages VipApi is null");
        } else {
            vipApi.setVipMessageRead(arrayList);
        }
    }

    private void c(List<MessageObject> list) {
        LogUtil.a("UIDV_MessageDetailActivity", "setAssetMessageRead");
        ArrayList arrayList = new ArrayList();
        for (MessageObject messageObject : list) {
            if (messageObject.getReadFlag() == 0) {
                arrayList.add(messageObject.getMsgId());
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("UIDV_MessageDetailActivity", " setAssetMessageRead messageIds is empty");
            return;
        }
        LogUtil.a("UIDV_MessageDetailActivity", "setAssetMessageRead messageIds:", arrayList.toString());
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("UIDV_MessageDetailActivity", "setAssetMessageRead VipApi is null");
        } else {
            payApi.assetMsgVisited(arrayList, null);
        }
    }

    private List<MessageObject> b() {
        LogUtil.a("UIDV_MessageDetailActivity", "enter getData");
        ArrayList arrayList = new ArrayList();
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("UIDV_MessageDetailActivity", "getData intent is null");
            return arrayList;
        }
        String stringExtra = intent.getStringExtra("messages");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.j("UIDV_MessageDetailActivity", "json is empty");
            return arrayList;
        }
        try {
            return (List) HiJsonUtil.d(stringExtra, new TypeToken<List<MessageObject>>() { // from class: com.huawei.pluginmessagecenter.activity.MessageDetailActivity.3
            }.getType());
        } catch (JsonParseException unused) {
            LogUtil.a("UIDV_MessageDetailActivity", "getData JsonParseException");
            return arrayList;
        }
    }

    private List<MessageObject> a() {
        LogUtil.a("UIDV_MessageDetailActivity", "enter getAssetData");
        ArrayList arrayList = new ArrayList();
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("UIDV_MessageDetailActivity", "getAssetData intent is null");
            return arrayList;
        }
        try {
            return (List) HiJsonUtil.d(intent.getStringExtra("asset"), new TypeToken<List<MessageObject>>() { // from class: com.huawei.pluginmessagecenter.activity.MessageDetailActivity.4
            }.getType());
        } catch (JsonParseException unused) {
            LogUtil.a("UIDV_MessageDetailActivity", "getAssetData JsonParseException");
            return arrayList;
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22406a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CountDownLatch f22407c;
        private final WeakReference<MessageDetailActivity> d;
        private final String e;

        c(MessageDetailActivity messageDetailActivity, String str, int i, CountDownLatch countDownLatch) {
            this.f22406a = 0;
            this.d = new WeakReference<>(messageDetailActivity);
            this.e = str;
            this.f22406a = i;
            this.f22407c = countDownLatch;
        }

        c(MessageDetailActivity messageDetailActivity, String str) {
            this(messageDetailActivity, str, 0, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageDetailActivity messageDetailActivity = this.d.get();
            if (messageDetailActivity == null || messageDetailActivity.isFinishing() || messageDetailActivity.isDestroyed()) {
                return;
            }
            messageDetailActivity.e(this.e, this.f22406a, this.f22407c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, int i, CountDownLatch countDownLatch) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<MessageObject> listC = pha.e(this).c(str);
        if (String.valueOf(14).equals(str) && countDownLatch != null) {
            countDownLatch.countDown();
            if (countDownLatch.getCount() < 2) {
                try {
                    LogUtil.a("UIDV_MessageDetailActivity", "handleMessageCenter reached = ", Boolean.valueOf(countDownLatch.await(10000L, TimeUnit.MILLISECONDS)));
                } catch (InterruptedException e2) {
                    LogUtil.e("UIDV_MessageDetailActivity", e2.getMessage());
                }
            }
            Collection<? extends MessageObject> collection = (List) this.h.remove(Integer.valueOf(i));
            if (njy.b(collection)) {
                listC.addAll(collection);
                Collections.sort(listC, new Comparator<MessageObject>() { // from class: com.huawei.pluginmessagecenter.activity.MessageDetailActivity.1
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public int compare(MessageObject messageObject, MessageObject messageObject2) {
                        return Long.compare(messageObject2.getReceiveTime(), messageObject.getReceiveTime());
                    }
                });
                pho.a();
            }
        }
        if (String.valueOf(70).equals(str)) {
            List<MessageObject> listB = b();
            if (njy.b(listB)) {
                listC.addAll(listB);
                d(listB);
            }
            php.b(listC);
            c();
        }
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(0, listC));
        if (String.valueOf(90).equals(str)) {
            d(listC);
        }
        Iterator<MessageObject> it = listC.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    private void b(MessageObject messageObject) {
        if (messageObject.getPageType() == 43) {
            messageObject.setReadFlag(1);
            pho.e(messageObject.getMsgId(), 1);
        } else if (messageObject.getReadFlag() == 0) {
            pha.e(this).d(messageObject.getMsgId());
        }
    }

    private void b(String str) {
        Context context = BaseApplication.getContext();
        if (context != null) {
            try {
                this.d.setTitleText(context.getString(php.c(str)));
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("UIDV_MessageDetailActivity", "Resources NotFound");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterView<?> adapterView, View view, int i, long j) {
        if (qrs.e(view)) {
            LogUtil.j("UIDV_MessageDetailActivity", "click too fast");
            return;
        }
        MessageObject messageObject = adapterView.getItemAtPosition(i) instanceof MessageObject ? (MessageObject) adapterView.getItemAtPosition(i) : null;
        if (messageObject == null) {
            LogUtil.j("UIDV_MessageDetailActivity", "messageObject is null");
            return;
        }
        if (messageObject.getNewMsg() == 1) {
            LogUtil.a("UIDV_MessageDetailActivity", "messegeItemClick, this is a new type message");
            messageObject.jumpToTargetPage(this);
        } else if (a(messageObject.getDetailUri())) {
            LogUtil.a("UIDV_MessageDetailActivity", "messegeItemClick jumpToPlanTab");
        } else if (e(messageObject)) {
            LogUtil.a("UIDV_MessageDetailActivity", "messegeItemClick jumpBenefitDialog");
        } else if (d(messageObject)) {
            LogUtil.a("UIDV_MessageDetailActivity", "messegeItemClick isJumpRecommendPage.");
        } else {
            Intent intent = new Intent();
            intent.putExtra("msgId", messageObject.getMsgId());
            String detailUri = messageObject.getDetailUri();
            intent.putExtra(CommonUtil.DETAIL_URI, detailUri);
            intent.putExtra(MessageConstant.MESSAGE_TITLE, messageObject.getMsgTitle());
            if (String.valueOf(17).equals(messageObject.getModule())) {
                phn.d(this, Uri.parse(detailUri), 1);
                return;
            } else {
                intent.setClass(this, DispatchSkipEventActivity.class);
                startActivity(intent);
            }
        }
        Object tag = view.getTag(R.layout.message_detail_layout);
        long jLongValue = tag instanceof Long ? ((Long) tag).longValue() : 0L;
        if (messageObject.getPageType() == 43) {
            c(messageObject, jLongValue, 2);
        } else {
            a(messageObject);
        }
    }

    private boolean d(MessageObject messageObject) {
        String detailUri = messageObject.getDetailUri();
        if (TextUtils.isEmpty(detailUri) || !String.valueOf(14).equals(messageObject.getModule()) || detailUri.toLowerCase().startsWith("HuaweiHealth".toLowerCase())) {
            return false;
        }
        LogUtil.a("UIDV_MessageDetailActivity", "skipMarketRouter router:", detailUri);
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(detailUri);
        return true;
    }

    private boolean e(MessageObject messageObject) {
        BenefitMessage benefitMessage;
        DevicePerfPurchaseInfo devicePerfPurchaseInfo;
        if (!TextUtils.equals(messageObject.getModule(), String.valueOf(70)) && !TextUtils.equals(messageObject.getModule(), String.valueOf(90))) {
            return false;
        }
        String detailUriExt = messageObject.getDetailUriExt();
        if (TextUtils.isEmpty(detailUriExt) || (benefitMessage = (BenefitMessage) qqt.e(detailUriExt, BenefitMessage.class)) == null) {
            return false;
        }
        String benefitData = benefitMessage.getBenefitData();
        String benefitType = benefitMessage.getBenefitType();
        if (MessageConstant.BENEFIT_INBOX_TYPE.equals(benefitType)) {
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) qqt.e(benefitData, DeviceInboxInfo.class);
            if (deviceInboxInfo == null) {
                return false;
            }
            irz.e(BaseApplication.getContext(), deviceInboxInfo, 4, deviceInboxInfo.getDeviceBenefitInfos());
            return true;
        }
        if (!MessageConstant.BENEFIT_PURCHASE_TYPE.equals(benefitType) || (devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) qqt.e(benefitData, DevicePerfPurchaseInfo.class)) == null) {
            return false;
        }
        irz.e(BaseApplication.getContext(), devicePerfPurchaseInfo, 4, (List<DeviceBenefitInfo>) null);
        return true;
    }

    private boolean a(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return false;
        }
        LogUtil.a("UIDV_MessageDetailActivity", "jumpToPlanTab host = " + host);
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi == null) {
            LogUtil.e("UIDV_MessageDetailActivity", "jumpToPlanTab fitnessAdviceApi is null.");
            return false;
        }
        if (!"intPlan".equals(host)) {
            return false;
        }
        fitnessAdviceApi.launchPlanTab();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MessageObject> list) {
        LogUtil.a("UIDV_MessageDetailActivity", "showMessageCenterList");
        this.e.setVisibility(0);
        this.i.d(list);
        this.i.notifyDataSetChanged();
    }

    private void a(MessageObject messageObject) {
        String scheme;
        String host;
        if ("kakaMessage".equals(messageObject.getMsgId())) {
            HashMap map = new HashMap();
            map.put("from", "2");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_KAKA_1100007.value(), map, 0);
        }
        Uri uri = Uri.parse(messageObject.getDetailUri());
        if (uri == null || (scheme = uri.getScheme()) == null || (host = uri.getHost()) == null) {
            return;
        }
        if (MessageConstant.NEW_MEDAL_TYPE.equals(messageObject.getType()) || MessageConstant.ACQUIRE_MEDAL_TYPE.equals(messageObject.getType())) {
            HashMap map2 = new HashMap(3);
            map2.put("from", "2");
            map2.put("click", "1");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_MINE_MY_MEDAL_2040012.value(), map2, 0);
        }
        if ("sportReport".equals(host)) {
            HashMap map3 = new HashMap(3);
            if (health.compact.a.CommonUtil.n(BaseApplication.getContext(), uri.getQueryParameter("report_stype")) == 0) {
                map3.put("report", "1");
            } else {
                map3.put("report", "0");
            }
            map3.put("from", "2");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_REPORT_1100009.value(), map3, 0);
        }
        e(uri, scheme);
    }

    private void e(Uri uri, String str) {
        if ("http".equals(str) || ProxyConfig.MATCH_HTTPS.equals(str)) {
            HashMap map = new HashMap(3);
            map.put("click", "1");
            map.put("type", "cloud");
            map.put("from", "2");
            map.put("activityId", uri.getQueryParameter("activityId"));
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_ACTIVITY_1100005.value(), map, 0);
            return;
        }
        HashMap map2 = new HashMap(3);
        map2.put("click", "1");
        map2.put("type", "local");
        map2.put("from", "2");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_ACTIVITY_1100005.value(), map2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MessageObject messageObject, long j, int i) {
        HashMap map = new HashMap();
        map.put("resourcePositionId", 11001);
        map.put("resourceId", messageObject.getMsgId());
        map.put("resourceName", messageObject.getMsgFrom());
        map.put("itemCardName", messageObject.getMsgTitle());
        map.put("pullOrder", 1);
        if (messageObject.getResBriefInfo() != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(messageObject.getResBriefInfo().getSmartRecommend()));
        }
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
        }
        map.put("event", Integer.valueOf(i));
        lmf.d().c(this, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f22398a = true;
        this.h.clear();
        super.onDestroy();
    }

    private int d() {
        int i = this.f22399b + 1;
        this.f22399b = i;
        if (i >= Integer.MAX_VALUE) {
            this.f22399b = 0;
        }
        return this.f22399b;
    }

    private void e(int i, CountDownLatch countDownLatch) {
        if (this.j == null) {
            this.j = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        }
        a aVar = new a(this, countDownLatch, i);
        this.j.getResourceResultInfo(11001).addOnSuccessListener(aVar).addOnFailureListener(aVar);
    }

    static class a implements OnSuccessListener<Map<Integer, ResourceResultInfo>>, OnFailureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f22404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f22405c;
        private final WeakReference<MessageDetailActivity> d;

        a(MessageDetailActivity messageDetailActivity, CountDownLatch countDownLatch, int i) {
            this.d = new WeakReference<>(messageDetailActivity);
            this.f22404b = countDownLatch;
            this.f22405c = i;
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            MessageDetailActivity messageDetailActivity = this.d.get();
            if (messageDetailActivity == null || messageDetailActivity.isFinishing() || messageDetailActivity.isDestroyed()) {
                return;
            }
            this.f22404b.countDown();
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            MessageDetailActivity messageDetailActivity = this.d.get();
            if (messageDetailActivity == null || messageDetailActivity.isFinishing() || messageDetailActivity.isDestroyed()) {
                return;
            }
            messageDetailActivity.h.put(Integer.valueOf(this.f22405c), messageDetailActivity.b(map));
            this.f22404b.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MessageObject> b(Map<Integer, ResourceResultInfo> map) {
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules;
        ArrayList arrayList = new ArrayList();
        MarketingApi marketingApi = this.j;
        if (marketingApi != null && (mapFilterMarketingRules = marketingApi.filterMarketingRules(map)) != null && mapFilterMarketingRules.containsKey(11001) && mapFilterMarketingRules.get(11001) != null) {
            List<ResourceBriefInfo> resources = mapFilterMarketingRules.get(11001).getResources();
            if (!njy.e(resources) && !this.f22398a) {
                SocialFragmentFactoryApi socialFragmentFactoryApi = (SocialFragmentFactoryApi) Services.d("OperationBundle", SocialFragmentFactoryApi.class);
                if (socialFragmentFactoryApi == null) {
                    LogUtil.a("UIDV_MessageDetailActivity", "socialFragmentFactoryApi is null");
                    return arrayList;
                }
                String string = getString(R.string.IDS_hw_messagecenter_recommendation);
                Gson gson = new Gson();
                for (ResourceBriefInfo resourceBriefInfo : resources) {
                    if (resourceBriefInfo == null || resourceBriefInfo.getContentType() != 13 || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent()) || !socialFragmentFactoryApi.isValidResource(resourceBriefInfo.getEffectiveTime(), resourceBriefInfo.getExpirationTime())) {
                        LogUtil.a("UIDV_MessageDetailActivity", "resource brief info invalid");
                    } else {
                        String content = resourceBriefInfo.getContent().getContent();
                        LogUtil.a("UIDV_MessageDetailActivity", " marketing2.0: ", content);
                        InternalLetterTemplate internalLetterTemplate = (InternalLetterTemplate) gson.fromJson(content, InternalLetterTemplate.class);
                        if (internalLetterTemplate == null) {
                            LogUtil.a("UIDV_MessageDetailActivity", "resource template parse exception");
                        } else {
                            arrayList.add(e(resourceBriefInfo, internalLetterTemplate, string));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private MessageObject e(ResourceBriefInfo resourceBriefInfo, InternalLetterTemplate internalLetterTemplate, String str) {
        MessageObject messageObject = new MessageObject();
        messageObject.setInfoClassify(str);
        messageObject.setWeight(resourceBriefInfo.getPriority());
        messageObject.setMsgId(resourceBriefInfo.getResourceId());
        messageObject.setModule(String.valueOf(14));
        messageObject.setCreateTime(resourceBriefInfo.getEffectiveTime());
        messageObject.setExpireTime(resourceBriefInfo.getExpirationTime());
        messageObject.setMsgFrom(resourceBriefInfo.getResourceName());
        messageObject.setMsgTitle(internalLetterTemplate.getTheme());
        messageObject.setMsgContent(internalLetterTemplate.getSummary());
        messageObject.setHarmonyImgUrl(internalLetterTemplate.getPicture());
        messageObject.setImgUri(internalLetterTemplate.getPicture());
        messageObject.setImgBigUri(internalLetterTemplate.getPicture());
        messageObject.setMsgPosition(11);
        messageObject.setPosition(1);
        messageObject.setDetailUri(internalLetterTemplate.getLinkValue());
        messageObject.setHuid(SharedPreferenceUtil.getInstance(this).getUserID());
        messageObject.setReceiveTime(resourceBriefInfo.getModifyTime());
        messageObject.setPageType(43);
        return messageObject;
    }

    static class e implements OnItemVisibleListener<View, MessageObject> {
        private final WeakReference<MessageDetailActivity> e;

        e(MessageDetailActivity messageDetailActivity) {
            this.e = new WeakReference<>(messageDetailActivity);
        }

        @Override // com.huawei.pluginmessagecenter.listener.OnItemVisibleListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onItemVisible(View view, int i, MessageObject messageObject) {
            if (messageObject == null) {
                LogUtil.e("UIDV_MessageDetailActivity", "onItemClicked Wrong Position: ", Integer.valueOf(i));
                return;
            }
            MessageDetailActivity messageDetailActivity = this.e.get();
            if (messageDetailActivity == null || messageDetailActivity.isFinishing() || messageDetailActivity.isDestroyed()) {
                return;
            }
            messageDetailActivity.c(messageObject, 0L, 1);
        }
    }

    private void c() {
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.VIP_MESSAGES.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
