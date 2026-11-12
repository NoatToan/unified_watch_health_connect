package com.huawei.ui.homehealth.util;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.views.HomePageRecommendLayout;
import com.huawei.hmf.tasks.OnSuccessListener;
import defpackage.njy;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionCardBannerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f26156a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IResponseCallback f26157c;
    private ConcurrentHashMap<String, HomePageRecommendLayout> e = new ConcurrentHashMap<>();

    public interface IResponseCallback {
        public static final int RESULT_FAIL = -1;
        public static final int RESULT_SUCCESS = 0;

        void onResponse(int i);
    }

    public FunctionCardBannerHelper(Context context, IResponseCallback iResponseCallback) {
        this.f26156a = new WeakReference<>(context);
        this.f26157c = iResponseCallback;
    }

    public View a(String str, int i) {
        LogUtil.b("FunctionCardBannerHelper", "getting bottom banner view... cardID:" + str, " cardPosition:", Integer.valueOf(i));
        ConcurrentHashMap<String, HomePageRecommendLayout> concurrentHashMap = this.e;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            LogUtil.b("FunctionCardBannerHelper", "bottom banner view list is empty, return null view");
            return null;
        }
        HomePageRecommendLayout homePageRecommendLayout = this.e.get(str);
        if (homePageRecommendLayout != null) {
            homePageRecommendLayout.setCardPosition(i);
        }
        return homePageRecommendLayout;
    }

    public void c(List<String> list) {
        ReleaseLogUtil.d("R_FunctionCardBannerHelper", "start requesting data...");
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            ReleaseLogUtil.a("R_FunctionCardBannerHelper", "get marketingApi failed");
            this.f26157c.onResponse(-1);
        } else {
            marketingApi.getResourceResultInfo(4161, e(list)).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.homehealth.util.FunctionCardBannerHelper.2
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    if (map == null) {
                        ReleaseLogUtil.a("R_FunctionCardBannerHelper", "request cloud data failed, marketingResponse is null");
                        FunctionCardBannerHelper.this.f26157c.onResponse(-1);
                        return;
                    }
                    if (map.isEmpty()) {
                        ReleaseLogUtil.e("R_FunctionCardBannerHelper", "marketingResponse is empty");
                        FunctionCardBannerHelper.this.c();
                        return;
                    }
                    ReleaseLogUtil.d("R_FunctionCardBannerHelper", "request marketing resource onSuccess");
                    Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                    if (mapFilterMarketingRules != null && !mapFilterMarketingRules.isEmpty()) {
                        Context context = (Context) FunctionCardBannerHelper.this.f26156a.get();
                        if (context == null) {
                            ReleaseLogUtil.e("R_FunctionCardBannerHelper", "context has been recycled, no need to instantiate views...");
                            return;
                        }
                        List<View> marketingViewList = marketingApi.getMarketingViewList(context, mapFilterMarketingRules);
                        if (marketingViewList != null && !marketingViewList.isEmpty()) {
                            Map mapD = FunctionCardBannerHelper.this.d(marketingViewList);
                            FunctionCardBannerHelper functionCardBannerHelper = FunctionCardBannerHelper.this;
                            if (functionCardBannerHelper.d(functionCardBannerHelper.e, mapD)) {
                                LogUtil.b("FunctionCardBannerHelper", "need to refresh.");
                                FunctionCardBannerHelper.this.e.clear();
                                FunctionCardBannerHelper.this.e.putAll(mapD);
                                FunctionCardBannerHelper.this.f26157c.onResponse(0);
                                return;
                            }
                            return;
                        }
                        ReleaseLogUtil.e("R_FunctionCardBannerHelper", "viewList is null or empty");
                        FunctionCardBannerHelper.this.c();
                        return;
                    }
                    ReleaseLogUtil.a("FunctionCardBannerHelper", "filterResultInfoMap is invalid");
                    FunctionCardBannerHelper.this.c();
                }
            });
        }
    }

    private String e(List<String> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_FunctionCardBannerHelper", "getMarketingExtendParam cardLists is empty");
            return null;
        }
        ReleaseLogUtil.d("R_FunctionCardBannerHelper", "getMarketingExtendParam cardLists:", list.toString());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        HashMap map = new HashMap(1);
        map.put("HomePageCardSort", sb.toString());
        HashMap map2 = new HashMap(16);
        map2.put(String.valueOf(4161), new JSONObject(map).toString());
        JSONObject jSONObject = new JSONObject(map2);
        LogUtil.b("FunctionCardBannerHelper", "extendParamJson : ", jSONObject.toString());
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f26157c == null) {
            LogUtil.e("FunctionCardBannerHelper", "processNoData callback is null.");
        } else if (!this.e.isEmpty()) {
            this.e.clear();
            this.f26157c.onResponse(0);
        } else {
            this.f26157c.onResponse(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Map<String, HomePageRecommendLayout> map, Map<String, HomePageRecommendLayout> map2) {
        if (map2 == null) {
            LogUtil.b("FunctionCardBannerHelper", "layoutMap == null.");
            return false;
        }
        boolean z = !map2.equals(map);
        LogUtil.b("FunctionCardBannerHelper", "isSameLayouts = ", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, HomePageRecommendLayout> d(List<View> list) {
        HashMap map = new HashMap();
        for (View view : list) {
            if (view instanceof HomePageRecommendLayout) {
                HomePageRecommendLayout homePageRecommendLayout = (HomePageRecommendLayout) view;
                if (!map.containsKey(homePageRecommendLayout.getRecommendCard())) {
                    map.put(homePageRecommendLayout.getRecommendCard(), homePageRecommendLayout);
                }
            } else {
                LogUtil.d("FunctionCardBannerHelper", "view Type is INCORRECT, we want HomePageRecommendLayout, but got " + view.getClass().getSimpleName());
            }
        }
        return map;
    }
}
