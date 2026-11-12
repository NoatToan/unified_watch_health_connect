package com.huawei.ui.homehealth.operation.base;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.operation.ResourceCallback;
import defpackage.njy;
import defpackage.sru;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseOperation<T extends sru> {
    private static final long ONE_DAY = TimeUnit.DAYS.toMillis(1);
    protected Gson gson;
    private volatile boolean isCancel = false;

    protected abstract T generateResource(Gson gson, List<ResourceBriefInfo> list);

    protected abstract int getPositionId();

    protected abstract Type getResourceType();

    protected abstract String getSpCacheKey();

    protected abstract String getTag();

    public void requestResource(ResourceCallback<T> resourceCallback) {
        this.gson = new Gson();
        sru resourceFromCache = readResourceFromCache();
        if (resourceFromCache != null) {
            ReleaseLogUtil.d(getTag(), "load  resource from cache");
            resourceCallback.obtainResource(resourceFromCache);
        }
        if (resourceFromCache == null || resourceFromCache.e() + ONE_DAY < System.currentTimeMillis()) {
            refreshResource(resourceCallback);
        }
    }

    private void refreshResource(final ResourceCallback<T> resourceCallback) {
        ThreadPoolManager.c().a(getTag(), new Runnable() { // from class: srt
            @Override // java.lang.Runnable
            public final void run() {
                this.f48576b.m1677x2516ed67(resourceCallback);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$refreshResource$0$com-huawei-ui-homehealth-operation-base-BaseOperation, reason: not valid java name */
    public /* synthetic */ void m1677x2516ed67(ResourceCallback resourceCallback) {
        requestInfoFromMarket(getPositionId(), resourceCallback);
    }

    private void requestInfoFromMarket(final int i, final ResourceCallback<T> resourceCallback) {
        final MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
        marketingApi.getResourceResultInfo(i).addOnSuccessListener(new OnSuccessListener() { // from class: srr
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f48571b.m1679xcdb113e3(marketingApi, i, resourceCallback, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$requestInfoFromMarket$2$com-huawei-ui-homehealth-operation-base-BaseOperation, reason: not valid java name */
    public /* synthetic */ void m1679xcdb113e3(final MarketingApi marketingApi, final int i, final ResourceCallback resourceCallback, final Map map) {
        ThreadPoolManager.c().a(getTag(), new Runnable() { // from class: srs
            @Override // java.lang.Runnable
            public final void run() {
                this.f48574b.m1678xa45cbea2(marketingApi, map, i, resourceCallback);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$requestInfoFromMarket$1$com-huawei-ui-homehealth-operation-base-BaseOperation, reason: not valid java name */
    public /* synthetic */ void m1678xa45cbea2(MarketingApi marketingApi, Map map, int i, ResourceCallback resourceCallback) {
        filterMarketResult(i, resourceCallback, marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map));
    }

    private void filterMarketResult(int i, final ResourceCallback<T> resourceCallback, Map<Integer, ResourceResultInfo> map) {
        if (map.containsKey(Integer.valueOf(i))) {
            ResourceResultInfo resourceResultInfo = map.get(Integer.valueOf(i));
            if (resourceResultInfo == null) {
                LogUtil.j(getTag(), "filterResultInfoMap = null");
                cacheResource(null);
                if (this.isCancel) {
                    return;
                }
                HandlerExecutor.c(new Runnable() { // from class: srv
                    @Override // java.lang.Runnable
                    public final void run() {
                        resourceCallback.obtainResource(null);
                    }
                });
                return;
            }
            List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
            if (njy.e(resourceResultInfo.getResources())) {
                LogUtil.a(getTag(), "filterResultInfoMap is empty");
                cacheResource(null);
                if (this.isCancel) {
                    return;
                }
                HandlerExecutor.c(new Runnable() { // from class: srx
                    @Override // java.lang.Runnable
                    public final void run() {
                        resourceCallback.obtainResource(null);
                    }
                });
                return;
            }
            LogUtil.a(getTag(), "filterResultInfoMap size:", Integer.valueOf(resources.size()));
            LogUtil.a(getTag(), "filterResultInfoMap thread:", Thread.currentThread().getName());
            final sru sruVarGenerateResource = generateResource(this.gson, resources);
            cacheResource(sruVarGenerateResource);
            if (this.isCancel) {
                return;
            }
            HandlerExecutor.c(new Runnable() { // from class: sry
                @Override // java.lang.Runnable
                public final void run() {
                    resourceCallback.obtainResource(sruVarGenerateResource);
                }
            });
        }
    }

    private void cacheResource(T t) {
        if (t == null) {
            LogUtil.a(getTag(), "cacheResource resource == null, isHonor:", Boolean.valueOf(CommonUtil.bd()));
            if (CommonUtil.bd()) {
                SharedPreferenceManager.b(BaseApplication.getContext(), getSpCacheKey(), getSpCacheKey());
                return;
            }
            return;
        }
        if (t.d()) {
            LogUtil.a(getTag(), "cacheResource");
            SharedPreferenceManager.e(BaseApplication.getContext(), getSpCacheKey(), getSpCacheKey(), this.gson.toJson(t), new StorageParams());
        }
    }

    public void cancel() {
        this.isCancel = true;
    }

    private T readResourceFromCache() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), getSpCacheKey(), getSpCacheKey());
        LogUtil.a(getTag(), "cache resource:", strE);
        if (TextUtils.isEmpty(strE) || !strE.contains("cacheTime")) {
            return null;
        }
        return (T) this.gson.fromJson(strE, getResourceType());
    }
}
