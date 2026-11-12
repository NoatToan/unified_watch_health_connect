package com.huawei.health.h5pro.dfx.bi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.utils.AppInfoUtil;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.webkit.H5ProLoadingRecordManager;
import com.huawei.hianalytics.v2.HiAnalytics;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;
import com.huawei.operation.OpAnalyticsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Analyzer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f6781b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f6782c = false;
    private static volatile Map<String, String> g;
    private static AnalyzerProxy j;
    private H5ProAppInfo f;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LinkedHashMap<String, String> f6780a = new LinkedHashMap<>();
    private static final List<String> e = new ArrayList();
    private static final ArrayList<String> i = new ArrayList<>();
    private static final Object h = new Object();
    private long n = 0;
    private String m = "";
    private String k = "";

    private boolean a(String str) {
        return (f6781b || (!TextUtils.isEmpty(str) && e.contains(str))) && c();
    }

    public static void addForceBiPackageName(String str) {
        synchronized (Analyzer.class) {
            if (!TextUtils.isEmpty(str)) {
                List<String> list = e;
                if (!list.contains(str)) {
                    list.add(str);
                }
            }
        }
    }

    public static void addGlobalParamKeys(List<String> list) {
        synchronized (Analyzer.class) {
            i.addAll(list);
        }
    }

    private LinkedHashMap<String, String> c(H5ProAppInfo h5ProAppInfo) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        Map<String, String> globalParams = getGlobalParams();
        if (!globalParams.isEmpty()) {
            linkedHashMap.putAll(globalParams);
        }
        synchronized (d) {
            linkedHashMap.putAll(f6780a);
        }
        if (h5ProAppInfo != null) {
            if (!TextUtils.isEmpty(h5ProAppInfo.getVersion())) {
                linkedHashMap.put("version", h5ProAppInfo.getVersion());
            }
            if (!TextUtils.isEmpty(h5ProAppInfo.getPkgName())) {
                linkedHashMap.put(SdkCfgSha256Record.PKGNAME, h5ProAppInfo.getPkgName());
            }
        }
        return linkedHashMap;
    }

    private boolean c() {
        if (f6782c) {
            return true;
        }
        if (HiAnalytics.getInitFlag()) {
            f6782c = true;
        }
        return f6782c;
    }

    public static void enable(boolean z) {
        f6781b = z;
    }

    public static Map<String, String> getGlobalParams() {
        synchronized (h) {
            if (g != null && !g.isEmpty()) {
                return Collections.unmodifiableMap(g);
            }
            return Collections.EMPTY_MAP;
        }
    }

    public static boolean isGlobalParamKeys(String str) {
        boolean zContains;
        synchronized (Analyzer.class) {
            zContains = i.contains(str);
        }
        return zContains;
    }

    public static void setAnalyzerProxy(AnalyzerProxy analyzerProxy) {
        synchronized (Analyzer.class) {
            if (j == null && analyzerProxy != null) {
                j = analyzerProxy;
            }
        }
    }

    public static void setEnvironmentParam(JSONObject jSONObject) {
        synchronized (d) {
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        f6780a.put(next, jSONObject2.optString(next));
                    }
                } catch (JSONException e2) {
                    LogUtil.e("H5PRO_BIAnalytics", "setEnvironmentParam: exception -> " + e2.getMessage());
                }
                f6780a.put("MANUFACTURER", Build.MANUFACTURER);
            } else {
                f6780a.put("MANUFACTURER", Build.MANUFACTURER);
            }
            throw th;
        }
    }

    public void biFinishLoadH5App(String str, String str2) {
        biH5Load(str, str2, 3);
    }

    public void biH5Load(String str, String str2, int i2) {
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        putBiEvent("2120165", new ParamBuilder().putClickType().put("Steps", String.valueOf(i2)).put("H5package", str).toJson());
    }

    public boolean biReportOnPageEnd(String str, String str2) {
        JSONObject loadingRecord = H5ProLoadingRecordManager.d.getLoadingRecord(str);
        if (loadingRecord == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str2);
            }
            jSONObject.put("pageId", jSONObject.optString("pageId", str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                loadingRecord.put(next, jSONObject.get(next));
            }
        } catch (JSONException e2) {
            LogUtil.e("H5PRO_BIAnalytics", b.a(e2, new StringBuilder("biReportOnPageEnd: exception -> ")));
        }
        putBiEvent("2120006", loadingRecord.toString());
        return true;
    }

    public void biStartLoadH5App(String str, String str2) {
        biH5Load(str, str2, 2);
    }

    public void endLoading(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strFilterUrl = CommonUtil.filterUrl(str);
        if (TextUtils.isEmpty(this.m) || !this.m.equals(strFilterUrl)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.n;
        this.n = 0L;
        this.m = "";
        putAiopsEvent("80060002", new ParamBuilder().putDomain(strFilterUrl).put(OpAnalyticsConstants.DELAY_MS, String.valueOf(jCurrentTimeMillis - j2)).put(OpAnalyticsConstants.URL_HEADER, strFilterUrl).build());
    }

    public void leave() {
        this.k = "";
        this.n = 0L;
        this.m = "";
        HiAnalytics.onReport();
    }

    public void loadNewPage(String str, H5ProAppInfo h5ProAppInfo) {
        if (a(h5ProAppInfo == null ? "" : h5ProAppInfo.getPkgName())) {
            if (!TextUtils.isEmpty(this.k) && !this.k.equals(str) && !this.k.equals(CommonUtil.filterUrl(str))) {
                pause(this.k, h5ProAppInfo);
                resume(str, h5ProAppInfo);
            }
            this.k = str;
        }
    }

    public void loadPageErr(H5ProInstance h5ProInstance, String str, int i2) {
        if (h5ProInstance.getAppInfo() != null) {
            this.f = h5ProInstance.getAppInfo();
        }
        putAiopsEvent("80060003", new ParamBuilder().withInstance(h5ProInstance).put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(i2)).put("resourceUrl", str).build());
    }

    public void pause(String str, H5ProAppInfo h5ProAppInfo) {
        pause(str, h5ProAppInfo, null);
    }

    public void putAiopsEvent(String str, LinkedHashMap<String, String> linkedHashMap) {
        synchronized (this) {
            H5ProAppInfo h5ProAppInfo = this.f;
            if (a(h5ProAppInfo == null ? "" : h5ProAppInfo.getPkgName())) {
                H5ProAppInfo h5ProAppInfo2 = this.f;
                if (h5ProAppInfo2 != null) {
                    if (!TextUtils.isEmpty(h5ProAppInfo2.getVersion())) {
                        linkedHashMap.put("version", this.f.getVersion());
                    }
                    if (!TextUtils.isEmpty(this.f.getPkgName())) {
                        linkedHashMap.put(SdkCfgSha256Record.PKGNAME, this.f.getPkgName());
                    }
                }
                HiAnalytics.onEvent(1, str, linkedHashMap);
            }
        }
    }

    public void putBiEvent(String str, String str2) {
        H5ProAppInfo h5ProAppInfo = this.f;
        if (!a(h5ProAppInfo == null ? "" : h5ProAppInfo.getPkgName())) {
            LogUtil.w("H5PRO_BIAnalytics", "putBiEvent-1: !isReady");
            return;
        }
        LinkedHashMap<String, String> linkedHashMapC = c(this.f);
        Locale locale = Locale.ENGLISH;
        linkedHashMapC.put("CONTENT", "[" + str2 + "]");
        HiAnalytics.onEvent(0, str, linkedHashMapC);
        LogUtil.d("H5PRO_BIAnalytics", "putBiEvent-1 key:" + str + " content:" + linkedHashMapC);
    }

    public void reportCode(H5ProInstance h5ProInstance, String str) {
        putAiopsEvent("80060003", new ParamBuilder().withInstance(h5ProInstance).put(OpAnalyticsConstants.ERROR_CODE, str).build());
    }

    public void reportLoadResult(String str, String str2, H5ProAppInfo h5ProAppInfo) {
        setAppInfo(h5ProAppInfo);
        putAiopsEvent("80060001", new ParamBuilder().withUrl(str, h5ProAppInfo).put("flag", str2).build());
    }

    public void resume(String str, H5ProAppInfo h5ProAppInfo) {
        resume(str, h5ProAppInfo, null);
    }

    public void setAppInfo(H5ProAppInfo h5ProAppInfo) {
        this.f = h5ProAppInfo;
    }

    public void setGlobalParams(HashMap<String, String> map) {
        synchronized (h) {
            g = map;
        }
    }

    public void startLoading(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.m = CommonUtil.filterUrl(str);
        this.n = System.currentTimeMillis();
    }

    public void visitH5App(String str, String str2) {
        if (a(str)) {
            if (!TextUtils.isEmpty(str)) {
                putBiEvent("2120006", new ParamBuilder().putClickType().put("source", str).toJson());
            } else if (TextUtils.isEmpty(str2)) {
                LogUtil.w("H5PRO_BIAnalytics", "visitH5App: Invalid parameter");
            } else {
                putBiEvent("2120006", new ParamBuilder().putClickType().put("source", AppInfoUtil.getInstance().getHostFromUrl(str2)).put("url", str2).toJson());
            }
        }
    }

    public void pause(String str, H5ProAppInfo h5ProAppInfo, AnalyzerObj analyzerObj) {
        if (a(h5ProAppInfo == null ? "" : h5ProAppInfo.getPkgName())) {
            HiAnalytics.onPause((analyzerObj == null || TextUtils.isEmpty(analyzerObj.getId())) ? AppInfoUtil.getInstance().getHostOrPkgNameFroUrl(str, h5ProAppInfo).replace(".", "_") : analyzerObj.getId(), new ParamBuilder().putUrl(str).putCustomData(analyzerObj == null ? null : analyzerObj.getCustomData()).build());
        }
    }

    public void resume(String str, H5ProAppInfo h5ProAppInfo, AnalyzerObj analyzerObj) {
        if (a(h5ProAppInfo == null ? "" : h5ProAppInfo.getPkgName())) {
            String strReplace = (analyzerObj == null || TextUtils.isEmpty(analyzerObj.getId())) ? AppInfoUtil.getInstance().getHostOrPkgNameFroUrl(str, h5ProAppInfo).replace(".", "_") : analyzerObj.getId();
            if (TextUtils.isEmpty(strReplace)) {
                LogUtil.w("H5PRO_BIAnalytics", "resume: id is empty");
            } else {
                HiAnalytics.onResume(strReplace, new ParamBuilder().putUrl(str).putCustomData(analyzerObj == null ? null : analyzerObj.getCustomData()).build());
                this.k = str;
            }
        }
    }

    public static void addForceBiPackageName(List<String> list) {
        synchronized (Analyzer.class) {
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        addForceBiPackageName(it.next());
                    }
                }
            }
        }
    }

    public void putBiEvent(Context context, String str, JSONObject jSONObject) {
        H5ProAppInfo h5ProAppInfo = this.f;
        if (!a(h5ProAppInfo == null ? "" : h5ProAppInfo.getPkgName())) {
            LogUtil.w("H5PRO_BIAnalytics", "putBiEvent-2: !isReady");
            return;
        }
        LinkedHashMap<String, String> linkedHashMapC = c(this.f);
        AnalyzerProxy analyzerProxy = j;
        if (analyzerProxy != null && analyzerProxy.putBiEvent(context, str, linkedHashMapC, jSONObject)) {
            LogUtil.w("H5PRO_BIAnalytics", "putBiEvent-2: consumed by proxy");
            return;
        }
        Locale locale = Locale.ENGLISH;
        linkedHashMapC.put("CONTENT", "[" + jSONObject.toString() + "]");
        HiAnalytics.onEvent(0, str, linkedHashMapC);
        LogUtil.d("H5PRO_BIAnalytics", "putBiEvent-2 key:" + str + " content:" + linkedHashMapC);
    }
}
