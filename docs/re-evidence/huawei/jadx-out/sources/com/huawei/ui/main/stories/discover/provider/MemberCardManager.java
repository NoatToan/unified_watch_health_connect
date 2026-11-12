package com.huawei.ui.main.stories.discover.provider;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.RecommendResourceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import defpackage.inr;
import defpackage.iny;
import defpackage.ioi;
import defpackage.njy;
import health.compact.a.HiBroadcastManager;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class MemberCardManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26436b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, MemberBaseCardReader> f26437c = new ConcurrentHashMap();
    private boolean h = false;
    private boolean d = false;
    private inr g = new inr();
    private BroadcastReceiver e = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.discover.provider.MemberCardManager.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            LogUtil.a("VIPCard_MemberCardManager", "enter mCloudAsycReceiver");
            if (intent == null) {
                LogUtil.e("VIPCard_MemberCardManager", "intent is null");
            } else if (intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6) == 2) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.discover.provider.MemberCardManager.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MemberCardManager.this.d(intent);
                    }
                });
            }
        }
    };

    public MemberCardManager(Context context) {
        LogUtil.a("VIPCard_MemberCardManager", "MemberCardManager");
        this.f26435a = context;
        a("vipPageSleep", new MemberSleepCardReader(this.f26435a));
        a("vipPageBMI", new MemberWeightCardReader(this.f26435a));
        a("vipPageFitness", new MemberSportsCardReader(this.f26435a));
        e();
    }

    private void e() {
        LogUtil.a("VIPCard_MemberCardManager", "registerSyncStatus");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_sync");
        HiBroadcastManager.e(this.f26435a, this.e, intentFilter);
    }

    public void b(List<RecommendResourceInfo> list, MemberCardListener memberCardListener) {
        if (njy.e(list)) {
            LogUtil.a("VIPCard_MemberCardManager", "recommendResource is empty");
            return;
        }
        HashMap map = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, MemberBaseCardReader> entry : this.f26437c.entrySet()) {
            map.put(entry.getKey(), new ArrayList());
            arrayList.add(entry.getKey());
        }
        for (RecommendResourceInfo recommendResourceInfo : list) {
            for (String str : arrayList) {
                if (recommendResourceInfo.getLabelScenario() != null && recommendResourceInfo.getLabelScenario().contains(str)) {
                    ((List) map.get(str)).add(recommendResourceInfo);
                }
            }
        }
        for (String str2 : arrayList) {
            if (njy.e((Collection<?>) map.get(str2))) {
                map.remove(str2);
                LogUtil.a("VIPCard_MemberCardManager", "remove label ", str2);
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            MemberBaseCardReader memberBaseCardReader = this.f26437c.get(entry2.getKey());
            if (memberBaseCardReader != null) {
                LogUtil.a("VIPCard_MemberCardManager", "reader key = ", entry2.getKey());
                memberBaseCardReader.registerCardListener(memberCardListener);
                memberBaseCardReader.initCardReader((List) entry2.getValue());
            }
        }
        this.f26436b = true;
    }

    public void d() {
        LogUtil.a("VIPCard_MemberCardManager", "release");
        Iterator<Map.Entry<String, MemberBaseCardReader>> it = this.f26437c.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().unRegisterListener();
        }
        this.f26437c.clear();
        this.f26436b = false;
        HiBroadcastManager.d(this.f26435a, this.e);
    }

    public void a() {
        LogUtil.a("VIPCard_MemberCardManager", "preProcess");
        ThreadPoolManager.c().execute(new Runnable() { // from class: tsg
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    public /* synthetic */ void c() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        e(countDownLatch);
        try {
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("VIPCard_MemberCardManager", "InterruptedException");
        }
        b();
    }

    private void b() {
        for (Map.Entry<String, MemberBaseCardReader> entry : this.f26437c.entrySet()) {
            entry.getValue().setPrivacyStatus(this.h, this.d, this.g);
            entry.getValue().queryLabel();
        }
    }

    static class c implements ResultCallback<inr> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CountDownLatch f26440a;
        private WeakReference<MemberCardManager> d;

        c(MemberCardManager memberCardManager, CountDownLatch countDownLatch) {
            this.d = new WeakReference<>(memberCardManager);
            this.f26440a = countDownLatch;
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(inr inrVar) {
            MemberCardManager memberCardManager = this.d.get();
            if (memberCardManager != null && inrVar != null) {
                memberCardManager.g = inrVar;
                CountDownLatch countDownLatch = this.f26440a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                LogUtil.a("VIPCard_MemberCardManager", "queryUserLabelConfig onSuccess ", HiJsonUtil.d(inrVar));
                return;
            }
            LogUtil.e("VIPCard_MemberCardManager", "manager is null or GetLabelsRsp is null");
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            CountDownLatch countDownLatch = this.f26440a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            LogUtil.j("VIPCard_MemberCardManager", "queryUserLabelConfig onFailure ", th.getMessage());
        }
    }

    private void e(CountDownLatch countDownLatch) {
        this.d = false;
        this.h = false;
        this.g = new inr();
        String strE = SharedPreferenceManager.e(this.f26435a, Integer.toString(10000), "health_product_recommend");
        if ("1".equals(strE)) {
            this.d = true;
        }
        String strC = ioi.d().c(12);
        String strE2 = SharedPreferenceManager.e(this.f26435a, Integer.toString(10000), "personalized_recommend");
        if ("true".equals(strC) || "1".equals(strE2)) {
            this.h = true;
        }
        iny.a(1, new c(this, countDownLatch));
        LogUtil.a("VIPCard_MemberCardManager", "privacyHealthData:", strE, "personalInitValue:", strC, "personalSwitchValue:", strE2);
    }

    private void a(String str, Object obj) {
        if (obj instanceof MemberBaseCardReader) {
            if (this.f26437c.get(str) == null) {
                this.f26437c.put(str, (MemberBaseCardReader) obj);
                return;
            }
            return;
        }
        LogUtil.a("VIPCard_MemberCardManager", "other types waiting to add");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6);
        if ((intExtra == 1000 || intExtra == 2) && this.f26436b) {
            LogUtil.a("VIPCard_MemberCardManager", "queryLabel after finish asyc cloud");
            for (Map.Entry<String, MemberBaseCardReader> entry : this.f26437c.entrySet()) {
                entry.getValue().setDataChangeTrue();
                entry.getValue().queryLabel();
            }
        }
    }
}
