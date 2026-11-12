package com.huawei.ui.homehealth.device.util;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.callback.IMarketingCallback;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqt;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class CardDeviceFragmentMarketingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25328a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25329c = new a(this);
    private ResourceBriefInfo d;
    private IMarketingCallback e;

    public CardDeviceFragmentMarketingUtil(Context context) {
    }

    public void a(IMarketingCallback iMarketingCallback) {
        this.e = iMarketingCallback;
        ResourceBriefInfo resourceBriefInfoA = a();
        this.d = resourceBriefInfoA;
        if (resourceBriefInfoA != null) {
            b(resourceBriefInfoA, true);
        }
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(4050);
        resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: rtl
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.e.e(marketingApi, (Map) obj);
            }
        });
        resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: rtm
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LogUtil.e("CardDeviceFragmentMarketingUtil", "requestMarketResource onFailure");
            }
        });
    }

    public /* synthetic */ void e(final MarketingApi marketingApi, final Map map) {
        LogUtil.a("CardDeviceFragmentMarketingUtil", "requestMarketResource onSuccess");
        if (map == null || map.isEmpty()) {
            LogUtil.e("CardDeviceFragmentMarketingUtil", "marketingResponse is invalid");
            this.f25329c.sendEmptyMessage(100);
        } else {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.device.util.CardDeviceFragmentMarketingUtil.2
                @Override // java.lang.Runnable
                public void run() {
                    final Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                    HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.device.util.CardDeviceFragmentMarketingUtil.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Map map2 = mapFilterMarketingRules;
                            if (map2 == null || map2.isEmpty()) {
                                LogUtil.e("CardDeviceFragmentMarketingUtil", "filterResultInfoMap is invalid");
                                CardDeviceFragmentMarketingUtil.this.f25329c.sendEmptyMessage(100);
                                return;
                            }
                            ResourceResultInfo resourceResultInfo = (ResourceResultInfo) mapFilterMarketingRules.get(4050);
                            if (resourceResultInfo != null) {
                                Message messageObtainMessage = CardDeviceFragmentMarketingUtil.this.f25329c.obtainMessage(200);
                                messageObtainMessage.obj = resourceResultInfo;
                                CardDeviceFragmentMarketingUtil.this.f25329c.sendMessage(messageObtainMessage);
                            } else {
                                LogUtil.e("CardDeviceFragmentMarketingUtil", "resourceResultInfo is invalid");
                                CardDeviceFragmentMarketingUtil.this.f25329c.sendEmptyMessage(100);
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        List<ResourceBriefInfo> resources = obj instanceof ResourceResultInfo ? ((ResourceResultInfo) obj).getResources() : null;
        List<ResourceBriefInfo> listE = resources != null ? e(resources) : null;
        if (njy.e(listE)) {
            LogUtil.a("CardDeviceFragmentMarketingUtil", "cardResource is null");
            c();
            return;
        }
        ResourceBriefInfo resourceBriefInfo = listE.get(0);
        LogUtil.a("CardDeviceFragmentMarketingUtil", "briefInfo: ", resourceBriefInfo);
        b(resourceBriefInfo);
        if (this.f25328a && resourceBriefInfo != null && this.d != null && TextUtils.equals(resourceBriefInfo.toString(), this.d.toString())) {
            LogUtil.a("CardDeviceFragmentMarketingUtil", "resource is same with cache");
        } else {
            b(resourceBriefInfo, false);
        }
    }

    private void b(ResourceBriefInfo resourceBriefInfo, boolean z) {
        ResourceContentBase content = resourceBriefInfo != null ? resourceBriefInfo.getContent() : null;
        String content2 = content != null ? content.getContent() : null;
        if (TextUtils.isEmpty(content2)) {
            LogUtil.a("CardDeviceFragmentMarketingUtil", "content is null");
            c();
            return;
        }
        GridTemplate gridTemplate = (GridTemplate) qqt.e(content2, GridTemplate.class);
        if (gridTemplate == null) {
            LogUtil.a("CardDeviceFragmentMarketingUtil", "gridTemplate is null");
            c();
        } else if (this.e != null) {
            if (z) {
                this.f25328a = true;
                LogUtil.a("CardDeviceFragmentMarketingUtil", "return cached resource");
            }
            this.e.onSuccess(gridTemplate, resourceBriefInfo);
        }
    }

    private List<ResourceBriefInfo> e(List<ResourceBriefInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ResourceBriefInfo resourceBriefInfo : list) {
            if (resourceBriefInfo != null && resourceBriefInfo.getContentType() == 36 && a(resourceBriefInfo)) {
                arrayList.add(resourceBriefInfo);
            }
        }
        return arrayList;
    }

    private boolean a(ResourceBriefInfo resourceBriefInfo) {
        long effectiveTime = resourceBriefInfo.getEffectiveTime();
        long expirationTime = resourceBriefInfo.getExpirationTime();
        if (effectiveTime == 0 || expirationTime == 0) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis > effectiveTime && jCurrentTimeMillis < expirationTime;
    }

    private void b(ResourceBriefInfo resourceBriefInfo) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_DEVICE_FUNCTION_MARKETING", qqt.b(resourceBriefInfo), null);
    }

    private ResourceBriefInfo a() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_DEVICE_FUNCTION_MARKETING");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return (ResourceBriefInfo) qqt.e(strE, ResourceBriefInfo.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("CardDeviceFragmentMarketingUtil", "getResourceCache json syntax exception: ", strE);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_DEVICE_FUNCTION_MARKETING", null, null);
    }

    static class a extends BaseHandler<CardDeviceFragmentMarketingUtil> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<CardDeviceFragmentMarketingUtil> f25332b;

        public a(CardDeviceFragmentMarketingUtil cardDeviceFragmentMarketingUtil) {
            super(cardDeviceFragmentMarketingUtil);
            this.f25332b = new WeakReference<>(cardDeviceFragmentMarketingUtil);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(CardDeviceFragmentMarketingUtil cardDeviceFragmentMarketingUtil, Message message) {
            if (message == null || cardDeviceFragmentMarketingUtil == null) {
                return;
            }
            CardDeviceFragmentMarketingUtil cardDeviceFragmentMarketingUtil2 = this.f25332b.get();
            int i = message.what;
            if (i != 100) {
                if (i == 200 && cardDeviceFragmentMarketingUtil2 != null) {
                    cardDeviceFragmentMarketingUtil2.b(message.obj);
                    return;
                }
                return;
            }
            LogUtil.a("CardDeviceFragmentMarketingUtil", "data is invalid");
            if (cardDeviceFragmentMarketingUtil2 != null) {
                cardDeviceFragmentMarketingUtil2.c();
            }
        }
    }
}
