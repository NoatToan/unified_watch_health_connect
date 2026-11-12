package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gyt {
    private gyt() {
    }

    public static boolean e() {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            return false;
        }
        boolean zB = fns.b();
        LogUtil.a("Login_PageStartAction", " isNeedShowPrivacy = ", Boolean.valueOf(!zB));
        return zB;
    }

    public static boolean c() {
        if (!LanguageUtil.l(BaseApplication.getContext())) {
            LogUtil.a("Login_PageStartAction", "not chineseSimplify");
            return false;
        }
        if (Utils.o()) {
            LogUtil.a("Login_PageStartAction", "oversea version, dont collect label");
            return false;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("Login_PageStartAction", "browse mode, dont collect label");
            return false;
        }
        if (CommonUtil.ab(BaseApplication.getContext())) {
            return true;
        }
        LogUtil.a("Login_PageStartAction", "no network, dont collect label");
        return false;
    }

    public static void d(final Handler handler) {
        if (c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gyu
                @Override // java.lang.Runnable
                public final void run() {
                    gyt.e(handler);
                }
            });
        }
    }

    static /* synthetic */ void e(Handler handler) {
        a((loq.a) null);
        c(handler);
        a();
        d();
    }

    private static void d() {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.e("Login_PageStartAction", "marketingApi is null");
            return;
        }
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(4043);
        if (resourceResultInfo == null) {
            LogUtil.e("Login_PageStartAction", "marketingTask is null");
        } else {
            resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: gys
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    gyt.e(marketingApi, (Map) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(MarketingApi marketingApi, Map map) {
        if (map == null || map.isEmpty()) {
            LogUtil.e("Login_PageStartAction", "marketingResponse is invalid");
            return;
        }
        if (marketingApi == null) {
            LogUtil.e("Login_PageStartAction", "marketingApi is null");
            return;
        }
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map);
        if (mapFilterMarketingRules == null || mapFilterMarketingRules.isEmpty()) {
            LogUtil.e("Login_PageStartAction", "filterResultInfoMap is invalid");
        } else if (mapFilterMarketingRules.get(4043) != null) {
            a(mapFilterMarketingRules.get(4043));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final ResourceResultInfo resourceResultInfo) {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gyt.2
                @Override // java.lang.Runnable
                public void run() {
                    gyt.a(resourceResultInfo);
                }
            });
            return;
        }
        if (resourceResultInfo == null) {
            return;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (resources == null) {
            LogUtil.e("Login_PageStartAction", "resources is null");
            return;
        }
        LogUtil.a("Login_PageStartAction", "size: ", Integer.valueOf(resources.size()), ", List<ResourceBriefInfo> : ", resources);
        for (int size = resources.size() - 1; size >= 0; size--) {
            ResourceBriefInfo resourceBriefInfo = resources.get(size);
            if (resourceBriefInfo != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis < resourceBriefInfo.getExpirationTime() && resourceBriefInfo.getContentType() == 47) {
                    List<String> strategyIds = resourceBriefInfo.getStrategyIds();
                    List<String> bucketIds = resourceBriefInfo.getBucketIds();
                    LogUtil.a("Login_PageStartAction", "strategyIds: ", strategyIds, ", bucketIds: ", bucketIds);
                    if (strategyIds == null || bucketIds == null) {
                        return;
                    }
                    b(new loq.a(strategyIds, bucketIds));
                    return;
                }
            }
        }
    }

    private static void a() {
        lqo.b(BaseApplication.getContext()).b("function_card", new lop(), new ResultCallback<loq>() { // from class: gyt.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(loq loqVar) {
                if (loqVar == null) {
                    LogUtil.j("Login_PageStartAction", "rsp is null.");
                    return;
                }
                LogUtil.a("Login_PageStartAction", "rsp: ", loqVar.toString());
                if (loqVar.getResultCode().intValue() != 0) {
                    LogUtil.j("Login_PageStartAction", "getStrategy rsp resultCode is ", loqVar.getResultCode());
                    return;
                }
                if (njy.e(loqVar.a()) || njy.e(loqVar.e()) || njy.e(loqVar.c())) {
                    LogUtil.j("Login_PageStartAction", "getStrategy rsp data empty");
                } else {
                    LogUtil.a("Login_PageStartAction", "json: ", qqt.b(loqVar));
                    gyt.b(new loq.a(loqVar));
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("Login_PageStartAction", "get strategy error:", ExceptionUtils.c(th));
            }
        });
    }

    private static void c(Handler handler) {
        lqo.b(BaseApplication.getContext()).d(new lop(), new b(handler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(loq.a aVar) {
        loq.a aVar2;
        synchronized (gyt.class) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "AB_TEST_BI_INFO");
            try {
                if (TextUtils.isEmpty(strE) || (aVar2 = (loq.a) qqt.c(strE, new TypeToken<loq.a>() { // from class: com.huawei.health.splash.PageStartAction$3
                }.getType())) == null) {
                    aVar2 = new loq.a(new ArrayList(), new ArrayList());
                }
                List<String> listB = aVar2.b();
                List<String> listA = aVar2.a();
                List<String> listB2 = aVar.b();
                List<String> listA2 = aVar.a();
                if (listB != null && njy.b(listB2)) {
                    for (int i = 0; i < listB2.size(); i++) {
                        String str = listB2.get(i);
                        if (!TextUtils.isEmpty(str) && !listB.contains(str)) {
                            listB.add(str);
                            if (listA != null && listA2 != null && njy.c(listA2, i) && listA2.get(i) != null) {
                                listA.add(listA2.get(i));
                            }
                        }
                    }
                }
                a(aVar2);
            } catch (JsonSyntaxException unused) {
                LogUtil.e("Login_PageStartAction", "JsonSyntaxException");
            }
        }
    }

    public static String b() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "strategyName");
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        LogUtil.j("Login_PageStartAction", " ab strategy null, return");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(loq.a aVar) {
        String strB;
        if (aVar == null) {
            strB = "";
        } else {
            strB = qqt.b(aVar);
        }
        LogUtil.a("Login_PageStartAction", "abTestBiInfo: ", strB);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "AB_TEST_BI_INFO", strB, null);
    }

    static class b implements ResultCallback<loq> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<Handler> f36245c;

        b(Handler handler) {
            this.f36245c = new WeakReference<>(handler);
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(loq loqVar) {
            Handler handler = this.f36245c.get();
            Message messageObtain = Message.obtain();
            messageObtain.what = 18;
            if (handler == null) {
                a();
                LogUtil.e("Login_PageStartAction", "getStrategy handler is null");
                return;
            }
            if (loqVar.getResultCode().intValue() != 0) {
                a();
                messageObtain.obj = false;
                handler.sendMessage(messageObtain);
                LogUtil.j("Login_PageStartAction", "getStrategy rsp resultCode is ", loqVar.getResultCode());
                return;
            }
            if (njy.e(loqVar.a()) || njy.e(loqVar.e()) || njy.e(loqVar.c())) {
                a();
                messageObtain.obj = false;
                handler.sendMessage(messageObtain);
                LogUtil.j("Login_PageStartAction", "getStrategy rsp data empty");
                return;
            }
            LogUtil.a("Login_PageStartAction", "bucketId", ":", loqVar.a(), " ", "strategyId", ":", loqVar.e(), " ", "strategyName", ":", loqVar.c());
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "AB_TEST_STRATEGY_INFO", qqt.b(loqVar), null);
            boolean zContains = loqVar.c().contains("[VIP]");
            ObserverManagerUtil.e("AB_TEST_STRATEGY_SET_SP_DONE", Boolean.valueOf(zContains));
            messageObtain.obj = Boolean.valueOf(zContains);
            handler.sendMessage(messageObtain);
            gyt.a(new loq.a(loqVar));
        }

        private void a() {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10000), "AB_TEST_STRATEGY_INFO");
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10000), "AB_TEST_BI_INFO");
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            LogUtil.e("Login_PageStartAction", "get strategy error:", ExceptionUtils.c(th));
        }
    }
}
