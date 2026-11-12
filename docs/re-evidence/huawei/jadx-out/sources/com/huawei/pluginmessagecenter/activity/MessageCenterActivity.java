package com.huawei.pluginmessagecenter.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.InternalLetterTemplate;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.pluginachievement.AchieveDataApi;
import com.huawei.pluginmessagecenter.R;
import com.huawei.pluginmessagecenter.adapter.MessageCenterListAdapter;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi;
import defpackage.lmf;
import defpackage.njy;
import defpackage.pgz;
import defpackage.pha;
import defpackage.pho;
import defpackage.php;
import defpackage.qrs;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class MessageCenterActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AchieveDataApi f22386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22387b;
    private ExecutorService f;
    private ListView i;
    private MarketingApi k;
    private HealthProgressBar l;
    private LinearLayout m;
    private LinearLayout n;
    private MessageCenterListAdapter o;
    private String q;
    private RelativeLayout r;
    private boolean h = false;
    private boolean g = false;
    private boolean j = false;
    private final AtomicInteger e = new AtomicInteger(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f22388c = false;
    private Map<Integer, List<MessageObject>> t = new ConcurrentHashMap(16);
    private c s = new c(this);
    private List<MessageObject> p = new ArrayList(16);
    private List<MessageObject> d = new ArrayList(16);
    private Handler v = new Handler() { // from class: com.huawei.pluginmessagecenter.activity.MessageCenterActivity.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                LogUtil.a("UIDV_MessageCenterActivity", "refresh message");
                MessageCenterActivity.this.c((List<MessageObject>) message.obj);
                MessageCenterActivity.this.c();
                return;
            }
            if (i == 1) {
                MessageCenterActivity.this.k();
                MessageCenterActivity.this.c();
            } else if (i == 2) {
                MessageCenterActivity.this.c();
            } else {
                if (i != 3) {
                    return;
                }
                MessageCenterActivity.this.h();
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d("UIDV_MessageCenterActivity", "onCreate to enter");
        setContentView(R.layout.activity_message_center_list);
        clearBackgroundDrawable();
        d();
        this.i = (ListView) findViewById(R.id.items_listView1);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hw_messagecenter_loading);
        this.m = linearLayout;
        HealthProgressBar healthProgressBar = (HealthProgressBar) linearLayout.findViewById(R.id.hw_messagecenter_loading_hpb);
        this.l = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        this.j = ((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isOperation(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        if (!Utils.o() || this.j) {
            pha.e(this).d(this.s);
        }
        this.r = (RelativeLayout) findViewById(R.id.messageCenter_layout_no_message);
        f();
        this.h = false;
        MessageCenterListAdapter messageCenterListAdapter = new MessageCenterListAdapter(this, new ArrayList());
        this.o = messageCenterListAdapter;
        this.i.setAdapter((ListAdapter) messageCenterListAdapter);
        g();
        this.f = Executors.newSingleThreadExecutor();
        int iB = b();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        this.f.execute(new d(this, iB, countDownLatch));
        b(iB, countDownLatch);
        if (this.v != null) {
            LogUtil.a("UIDV_MessageCenterActivity", "send delay message");
            this.v.removeMessages(2);
            this.v.sendEmptyMessageDelayed(2, 30000L);
        }
        this.f22386a = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
        this.n = (LinearLayout) findViewById(R.id.msg_marketing_layout);
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        marketingApi.getResourceResultInfo(4170).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.pluginmessagecenter.activity.MessageCenterActivity.1
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                List<View> marketingViewList = marketingApi.getMarketingViewList(BaseApplication.getContext(), marketingApi.filterMarketingRules(map));
                LogUtil.a("UIDV_MessageCenterActivity", "testmarketing viewList.SIZE : ", Integer.valueOf(marketingViewList.size()));
                Iterator<View> it = marketingViewList.iterator();
                while (it.hasNext()) {
                    MessageCenterActivity.this.n.addView(it.next());
                }
            }
        });
        LogUtil.a("UIDV_MessageCenterActivity", "Leave onCreate!");
    }

    private void f() {
        this.i.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.pluginmessagecenter.activity.MessageCenterActivity.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (qrs.e(view)) {
                    LogUtil.j("UIDV_MessageCenterActivity", "click too fast");
                    return;
                }
                LogUtil.a("UIDV_MessageCenterActivity", "start onItemClick position = ", Integer.valueOf(i));
                MessageObject messageObject = adapterView.getItemAtPosition(i) instanceof MessageObject ? (MessageObject) adapterView.getItemAtPosition(i) : null;
                if (messageObject != null) {
                    MessageCenterActivity.this.d(messageObject, i);
                } else {
                    LogUtil.j("UIDV_MessageCenterActivity", "messageObject is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MessageObject messageObject, int i) {
        String type = messageObject.getType();
        LogUtil.a("UIDV_MessageCenterActivity", "onItemClick position = ", Integer.valueOf(i), " messageObject = ", messageObject.getMsgId(), "type = ", type);
        Intent intent = new Intent();
        intent.putExtra("msgId", messageObject.getMsgId());
        intent.putExtra(CommonUtil.DETAIL_URI, messageObject.getDetailUri());
        intent.putExtra("imagUri", messageObject.getImgUri());
        intent.putExtra("module", messageObject.getModule());
        if (String.valueOf(70).equals(messageObject.getModule())) {
            intent.putExtra("messages", this.q);
            e();
            i();
        }
        if (String.valueOf(80).equals(messageObject.getModule())) {
            intent.putExtra("asset", this.f22387b);
            j();
        }
        intent.setClass(this, MessageDetailActivity.class);
        startActivity(intent);
        LogUtil.a("UIDV_MessageCenterActivity", "Leave onItemClick position = ", Integer.valueOf(i));
    }

    private void i() {
        LogUtil.a("UIDV_MessageCenterActivity", "enter setLocalMessageRead");
        if (njy.b(this.p)) {
            for (MessageObject messageObject : this.p) {
                if (messageObject.getReadFlag() == 0) {
                    messageObject.setReadFlag(1);
                }
            }
            l();
        }
    }

    private void j() {
        LogUtil.a("UIDV_MessageCenterActivity", "enter setAssetMessageRead");
        if (njy.b(this.d)) {
            for (MessageObject messageObject : this.d) {
                if (messageObject.getReadFlag() == 0) {
                    messageObject.setReadFlag(1);
                }
            }
            l();
        }
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("UIDV_MessageCenterActivity", "getData intent is null");
            return;
        }
        this.q = intent.getExtras() != null ? intent.getExtras().getString("messages") : intent.getStringExtra("messages");
        this.f22387b = intent.getExtras() != null ? intent.getExtras().getString("asset") : intent.getStringExtra("asset");
        try {
            this.p = (List) new Gson().fromJson(this.q, new TypeToken<List<MessageObject>>() { // from class: com.huawei.pluginmessagecenter.activity.MessageCenterActivity.4
            }.getType());
            this.d = (List) new Gson().fromJson(this.f22387b, new TypeToken<List<MessageObject>>() { // from class: com.huawei.pluginmessagecenter.activity.MessageCenterActivity.5
            }.getType());
        } catch (JsonParseException unused) {
            LogUtil.a("UIDV_MessageCenterActivity", "getData JsonParseException");
        }
    }

    private void g() {
        this.i.setVisibility(8);
        this.r.setVisibility(8);
        this.m.setVisibility(0);
        this.l.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.m.setVisibility(8);
        this.l.setVisibility(8);
    }

    private int b() {
        return this.e.incrementAndGet();
    }

    /* JADX INFO: loaded from: classes14.dex */
    static class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f22396c;
        private final WeakReference<MessageCenterActivity> d;

        d(MessageCenterActivity messageCenterActivity, int i, CountDownLatch countDownLatch) {
            this.d = new WeakReference<>(messageCenterActivity);
            this.f22395b = i;
            this.f22396c = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageCenterActivity messageCenterActivity = this.d.get();
            if (messageCenterActivity == null || messageCenterActivity.isDestroyed() || messageCenterActivity.isFinishing()) {
                return;
            }
            messageCenterActivity.c(this.f22395b, this.f22396c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, CountDownLatch countDownLatch) {
        boolean zIsOperation = ((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isOperation(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        if (!Utils.o() || zIsOperation) {
            LogUtil.a("UIDV_MessageCenterActivity", "Start messageCenterRunnable!");
            List<MessageObject> listE = e(i, countDownLatch);
            if (listE.isEmpty()) {
                LogUtil.a("UIDV_MessageCenterActivity", "dorefresh");
                pha.e(this).d();
                return;
            }
            LogUtil.a("UIDV_MessageCenterActivity", "messageObjectList size = ", Integer.valueOf(listE.size()));
            if (this.v != null) {
                if (listE.size() <= 0 && a() == null) {
                    this.v.sendEmptyMessage(1);
                } else {
                    Handler handler = this.v;
                    handler.sendMessage(handler.obtainMessage(0, i, 0, listE));
                }
                LogUtil.a("UIDV_MessageCenterActivity", "showReport_MessageCenter generateReportHealthData.");
                AchieveDataApi achieveDataApi = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
                if (achieveDataApi != null) {
                    achieveDataApi.generateReportHealthData(getApplicationContext());
                } else {
                    LogUtil.a("UIDV_MessageCenterActivity", "handleMessageCenter achieveDetailApi is null");
                }
            }
            LogUtil.a("UIDV_MessageCenterActivity", "Leave messageCenterRunnable!");
        }
    }

    private List<MessageObject> e(int i, CountDownLatch countDownLatch) {
        List<MessageObject> listB = pha.e(this).b();
        e(listB);
        b(listB);
        countDownLatch.countDown();
        if (countDownLatch.getCount() < 2) {
            try {
                LogUtil.a("UIDV_MessageCenterActivity", "handleMessageCenter reached = ", Boolean.valueOf(countDownLatch.await(10000L, TimeUnit.MILLISECONDS)));
            } catch (InterruptedException e2) {
                LogUtil.e("UIDV_MessageCenterActivity", e2.getMessage());
            }
        }
        List<MessageObject> listRemove = this.t.remove(Integer.valueOf(i));
        if (njy.b(listRemove)) {
            LogUtil.a("UIDV_MessageCenterActivity", "theOtherMsgList size: ", Integer.valueOf(listRemove.size()));
            listB.addAll(listRemove);
        }
        if (njy.b(this.p)) {
            LogUtil.a("UIDV_MessageCenterActivity", "mMessageObjects.size:", Integer.valueOf(this.p.size()));
            listB.addAll(this.p);
        } else {
            LogUtil.a("UIDV_MessageCenterActivity", "mMessageObjects is empty");
        }
        if (njy.b(this.d)) {
            LogUtil.a("UIDV_MessageCenterActivity", "mAssetMessageObjects.size:", Integer.valueOf(this.d.size()));
            listB.addAll(this.d);
        } else {
            LogUtil.a("UIDV_MessageCenterActivity", "mAssetMessageObjects is empty");
        }
        MessageObject messageObjectA = a();
        if (messageObjectA != null) {
            boolean zA = pgz.c(BaseApplication.getContext()).a(messageObjectA);
            listB.add(messageObjectA);
            LogUtil.a("UIDV_MessageCenterActivity", "showMessageCenterList, insert KakaMessages to DB success is: ", Boolean.valueOf(zA));
        }
        List<MessageObject> listB2 = pha.e(this).b(php.d(listB));
        LogUtil.a("UIDV_MessageCenterActivity", "mixedMessage resultMessages: ", listB2);
        return listB2;
    }

    private void e(List<MessageObject> list) {
        if (!health.compact.a.CommonUtil.ap()) {
            LogUtil.j("UIDV_MessageCenterActivity", "version is not beta");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("UIDV_MessageCenterActivity", "filterUpdateAppMsg, messageObjects is empty");
            return;
        }
        Iterator<MessageObject> it = list.iterator();
        while (it.hasNext()) {
            MessageObject next = it.next();
            if (next == null) {
                LogUtil.j("UIDV_MessageCenterActivity", "filterUpdateAppMsg, msgObj is null");
            } else if ("device_app_update".equals(next.getType()) && String.valueOf(19).equals(next.getModule())) {
                it.remove();
                pha.e(BaseApplication.getContext()).a(next.getMsgId());
            }
        }
    }

    private void b(List<MessageObject> list) {
        if (njy.e(list)) {
            LogUtil.j("UIDV_MessageCenterActivity", "resetBenefitMsgReceiveTime, messageObjects is empty");
            return;
        }
        for (MessageObject messageObject : list) {
            if (messageObject == null) {
                LogUtil.j("UIDV_MessageCenterActivity", "resetBenefitMsgReceiveTime, msgObj is null");
            } else if (String.valueOf(90).equals(messageObject.getModule())) {
                messageObject.setReceiveTime(messageObject.getCreateTime());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("UIDV_MessageCenterActivity", "removeKakaMessage");
        if (a() == null) {
            LogUtil.a("UIDV_MessageCenterActivity", "removeKakaMessage = null");
            this.o.b();
            this.o.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("UIDV_MessageCenterActivity", "showNoMessages");
        this.i.setVisibility(8);
        this.r.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<MessageObject> list) {
        LogUtil.a("UIDV_MessageCenterActivity", "showMessageCenterList");
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        this.i.setVisibility(0);
        this.r.setVisibility(8);
        this.o.e(arrayList);
        this.o.notifyDataSetChanged();
    }

    private MessageObject a() {
        AchieveDataApi achieveDataApi = this.f22386a;
        if (achieveDataApi != null && achieveDataApi.getKakaTaskRedDot(BaseApplication.getContext())) {
            MessageObject messageObject = new MessageObject();
            messageObject.setPosition(1);
            messageObject.setMsgType(2);
            messageObject.setDetailUri("messagecenter://kakaMessage?module=17&type=unclaimedKaka");
            messageObject.setModule(String.valueOf(17));
            messageObject.setMsgTitle(BaseApplication.getContext().getString(R.string.IDS_hw_kaka_unclaimed));
            messageObject.setMsgContent(BaseApplication.getContext().getString(R.string.IDS_hw_messagecenter_kaka_notification_content));
            messageObject.setExpireTime(0L);
            messageObject.setMsgId("kakaMessage");
            messageObject.setReceiveTime(System.currentTimeMillis());
            messageObject.setReadFlag(0);
            messageObject.setType("unclaimedKaka");
            this.g = true;
            return messageObject;
        }
        this.g = false;
        return null;
    }

    /* JADX INFO: loaded from: classes14.dex */
    static class c implements MessageObserver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<MessageCenterActivity> f22394b;

        c(MessageCenterActivity messageCenterActivity) {
            this.f22394b = new WeakReference<>(messageCenterActivity);
        }

        @Override // com.huawei.pluginmessagecenter.service.MessageObserver
        public void onChange(int i, MessageChangeEvent messageChangeEvent) {
            LogUtil.a("UIDV_MessageCenterActivity", "Enter onChange() flag: ", Integer.valueOf(i));
            MessageCenterActivity messageCenterActivity = this.f22394b.get();
            if (messageCenterActivity != null) {
                if (!Utils.o() || messageCenterActivity.j) {
                    messageCenterActivity.l();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ExecutorService executorService = this.f;
        if (executorService == null || executorService.isShutdown()) {
            LogUtil.a("UIDV_MessageCenterActivity", "executorService is shutdown");
            this.f = Executors.newSingleThreadExecutor();
        }
        int iB = b();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        this.f.execute(new e(this, iB, countDownLatch));
        b(iB, countDownLatch);
    }

    private void o() {
        ExecutorService executorService = this.f;
        if (executorService == null || executorService.isShutdown()) {
            LogUtil.a("UIDV_MessageCenterActivity", "executorService is shutdown");
            this.f = Executors.newSingleThreadExecutor();
        }
        int iB = b();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        this.f.execute(new e(this, iB, countDownLatch));
        b(iB, countDownLatch);
    }

    /* JADX INFO: loaded from: classes14.dex */
    static class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<MessageCenterActivity> f22397b;
        private final int d;
        private final CountDownLatch e;

        e(MessageCenterActivity messageCenterActivity, int i, CountDownLatch countDownLatch) {
            this.f22397b = new WeakReference<>(messageCenterActivity);
            this.d = i;
            this.e = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageCenterActivity messageCenterActivity = this.f22397b.get();
            if (messageCenterActivity == null || messageCenterActivity.isFinishing() || messageCenterActivity.isDestroyed()) {
                return;
            }
            try {
                messageCenterActivity.d(this.d, this.e);
            } catch (Exception e) {
                LogUtil.e("UIDV_MessageCenterActivity", "handle message exception ", e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, CountDownLatch countDownLatch) {
        LogUtil.a("UIDV_MessageCenterActivity", "handleMessageList");
        List<MessageObject> listE = e(i, countDownLatch);
        LogUtil.a("UIDV_MessageCenterActivity", "onChange() getMessageList.size:", Integer.valueOf(listE.size()));
        if (this.v != null) {
            if (listE.size() <= 0 && a() == null) {
                this.v.sendEmptyMessage(1);
                return;
            } else {
                Handler handler = this.v;
                handler.sendMessage(handler.obtainMessage(0, i, 0, listE));
                return;
            }
        }
        LogUtil.a("UIDV_MessageCenterActivity", "messageCenterHandler is null");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.h && (!Utils.o() || this.j)) {
            if (this.g) {
                AchieveDataApi achieveDataApi = this.f22386a;
                if (achieveDataApi != null) {
                    achieveDataApi.dealKakaTask(BaseApplication.getContext(), this.v, 3);
                } else {
                    LogUtil.e("UIDV_MessageCenterActivity", "onResume mAchieveDataApi is null.");
                }
            }
            pha.e(this).d();
        }
        if (!Utils.o() || this.j) {
            return;
        }
        o();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.h = true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f22388c = true;
        super.onDestroy();
        if (!Utils.o() && this.j) {
            pha.e(this).a(this.s);
        }
        this.v.removeMessages(2);
        c();
        this.t.clear();
    }

    private void b(int i, CountDownLatch countDownLatch) {
        if (this.k == null) {
            this.k = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        }
        b bVar = new b(this, countDownLatch, i);
        this.k.getResourceResultInfo(11001).addOnSuccessListener(bVar).addOnFailureListener(bVar);
    }

    /* JADX INFO: loaded from: classes14.dex */
    static class b implements OnSuccessListener<Map<Integer, ResourceResultInfo>>, OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22392a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<MessageCenterActivity> f22393c;
        private final CountDownLatch e;

        b(MessageCenterActivity messageCenterActivity, CountDownLatch countDownLatch, int i) {
            this.f22393c = new WeakReference<>(messageCenterActivity);
            this.e = countDownLatch;
            this.f22392a = i;
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            MessageCenterActivity messageCenterActivity = this.f22393c.get();
            if (messageCenterActivity == null || messageCenterActivity.isFinishing() || messageCenterActivity.isDestroyed()) {
                return;
            }
            this.e.countDown();
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            MessageCenterActivity messageCenterActivity = this.f22393c.get();
            if (messageCenterActivity == null || messageCenterActivity.isFinishing() || messageCenterActivity.isDestroyed()) {
                return;
            }
            messageCenterActivity.t.put(Integer.valueOf(this.f22392a), messageCenterActivity.d(map));
            this.e.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MessageObject> d(Map<Integer, ResourceResultInfo> map) {
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules;
        ArrayList arrayList = new ArrayList();
        MarketingApi marketingApi = this.k;
        if (marketingApi != null && (mapFilterMarketingRules = marketingApi.filterMarketingRules(map)) != null && mapFilterMarketingRules.containsKey(11001) && mapFilterMarketingRules.get(11001) != null) {
            List<ResourceBriefInfo> resources = mapFilterMarketingRules.get(11001).getResources();
            if (!njy.e(resources) && !this.f22388c) {
                Gson gson = new Gson();
                SocialFragmentFactoryApi socialFragmentFactoryApi = (SocialFragmentFactoryApi) Services.d("OperationBundle", SocialFragmentFactoryApi.class);
                if (socialFragmentFactoryApi == null) {
                    LogUtil.a("UIDV_MessageCenterActivity", "socialFragmentFactoryApi is null");
                    return arrayList;
                }
                for (ResourceBriefInfo resourceBriefInfo : resources) {
                    if (resourceBriefInfo == null || resourceBriefInfo.getContentType() != 13 || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent()) || !socialFragmentFactoryApi.isValidResource(resourceBriefInfo.getEffectiveTime(), resourceBriefInfo.getExpirationTime())) {
                        LogUtil.a("UIDV_MessageCenterActivity", "resource brief info invalid");
                    } else {
                        String content = resourceBriefInfo.getContent().getContent();
                        LogUtil.a("UIDV_MessageCenterActivity", " marketing2.0: ", content);
                        InternalLetterTemplate internalLetterTemplate = (InternalLetterTemplate) gson.fromJson(content, InternalLetterTemplate.class);
                        if (internalLetterTemplate == null) {
                            LogUtil.a("UIDV_MessageCenterActivity", "resource template parse exception");
                        } else {
                            arrayList.add(c(resourceBriefInfo, internalLetterTemplate));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private MessageObject c(ResourceBriefInfo resourceBriefInfo, InternalLetterTemplate internalLetterTemplate) {
        MessageObject messageObject = new MessageObject();
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
        String strValueOf = String.valueOf(0);
        messageObject.setReadFlag(!TextUtils.equals(pho.e(resourceBriefInfo.getResourceId(), strValueOf), strValueOf) ? 1 : 0);
        return messageObject;
    }

    private void e() {
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.VIP_MESSAGE_CLICK.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
