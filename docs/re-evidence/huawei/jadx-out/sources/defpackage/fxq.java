package defpackage;

import android.text.TextUtils;
import com.airbnb.lottie.LottieListener;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.overlay.Picture;
import com.huawei.health.marketing.datatype.overlay.SpEffect;
import com.huawei.health.marketing.datatype.overlay.SpEffectFile;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes29.dex */
public class fxq {
    public static SpEffect b(String str, Map<String, SpEffect> map) {
        if (TextUtils.isEmpty(str) || map == null || !map.containsKey(str)) {
            return null;
        }
        return map.get(str);
    }

    public static Map<Integer, String> b(List<Picture> list) {
        if (CollectionUtils.a(list)) {
            return null;
        }
        HashMap map = new HashMap(3);
        for (Picture picture : list) {
            if (picture.getResolution() < 3) {
                map.put(Integer.valueOf(picture.getResolution()), picture.getUrl());
            }
        }
        return map;
    }

    public static void d(final String str, final int i, final ResourceBriefInfo resourceBriefInfo) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("OverlayUtils", "jumpUrl is empty");
            return;
        }
        LogUtil.a("OverlayUtils", "jumpPage jumpUrl = ", str);
        if (!fxk.b(str)) {
            a(str, i, resourceBriefInfo);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fxp
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    fxq.e(str, i, resourceBriefInfo, i2, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    static /* synthetic */ void e(String str, int i, ResourceBriefInfo resourceBriefInfo, int i2, Object obj) {
        if (i2 == 0) {
            a(str, i, resourceBriefInfo);
        } else {
            LogUtil.j("OverlayUtils", "errorCode = ", Integer.valueOf(i2));
        }
    }

    private static void a(String str, int i, ResourceBriefInfo resourceBriefInfo) {
        LogUtil.a("OverlayUtils", "goToDetail ");
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(fxl.d(str, resourceBriefInfo, i, 1));
        }
    }

    public static void e(Map<String, Object> map) {
        if (CollectionUtils.c(map)) {
            LogUtil.j("OverlayUtils", "fullScreenAnimateBiEvent contentMap is empty");
            return;
        }
        LogUtil.a("OverlayUtils", "fullScreenAnimateBiEvent contentMap is:", map);
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.MARKETING_OVERLAY_H1000006.value(), lmnVar, 0);
    }

    public static void d(SpEffect spEffect, final ResponseCallback<Boolean> responseCallback) {
        if (spEffect == null) {
            LogUtil.j("OverlayUtils", "preloadLottie, spEffect is null");
            return;
        }
        final List<SpEffectFile> spEffectFileList = spEffect.getSpEffectFileList();
        if (CollectionUtils.a(spEffectFileList)) {
            LogUtil.j("OverlayUtils", "preloadLottie, spEffectFiles is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fxw
                @Override // java.lang.Runnable
                public final void run() {
                    fxq.d(spEffectFileList, responseCallback);
                }
            });
        }
    }

    static /* synthetic */ void d(List list, ResponseCallback responseCallback) {
        boolean z = qrs.ah(BaseApplication.getContext()) || qrs.t();
        LogUtil.a("OverlayUtils", "preloadLottie, isWidthScreenDev : ", Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList(3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SpEffectFile spEffectFile = (SpEffectFile) it.next();
            if (spEffectFile != null && !"MP4".equals(spEffectFile.getType())) {
                if (spEffectFile.getResolution() == 0 && !z) {
                    arrayList.add(spEffectFile);
                } else if (z) {
                    arrayList.add(spEffectFile);
                }
            }
        }
        try {
            a(arrayList, responseCallback);
        } catch (Exception e) {
            LogUtil.e("OverlayUtils", "preloadLottie exception:", ExceptionUtils.c(e));
        }
    }

    private static void a(final List<SpEffectFile> list, final ResponseCallback<Boolean> responseCallback) {
        if (CollectionUtils.a(list)) {
            LogUtil.j("OverlayUtils", "loadLottieFile needPreloadList is empty");
            if (responseCallback != null) {
                responseCallback.onResponse(0, true);
                return;
            }
            return;
        }
        LogUtil.a("OverlayUtils", "loadLottieFile needPreloadList size ：", Integer.valueOf(list.size()));
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(list.size());
        final AtomicInteger atomicInteger = new AtomicInteger();
        for (final SpEffectFile spEffectFile : list) {
            da.c(BaseApplication.getContext(), spEffectFile.getFileUrl()).b(new LottieListener() { // from class: fxt
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    fxq.c(spEffectFile, atomicInteger, concurrentHashMap, responseCallback, list, (cx) obj);
                }
            });
        }
    }

    static /* synthetic */ void c(SpEffectFile spEffectFile, AtomicInteger atomicInteger, ConcurrentHashMap concurrentHashMap, ResponseCallback responseCallback, List list, cx cxVar) {
        LogUtil.a("OverlayUtils", "preloadLottie end, Url :", spEffectFile.getFileUrl());
        if (cxVar != null) {
            LogUtil.a("OverlayUtils", "preloadLottie success");
            atomicInteger.addAndGet(1);
        }
        concurrentHashMap.put(spEffectFile.getFileUrl(), Boolean.valueOf(cxVar != null));
        if (responseCallback == null || concurrentHashMap.size() != list.size()) {
            return;
        }
        LogUtil.a("OverlayUtils", "preloadLottie end");
        responseCallback.onResponse(0, Boolean.valueOf(atomicInteger.get() >= list.size()));
    }
}
