package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.configuredpage.api.ConfiguredPageDataCallback;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.stories.configuredpage.views.ConfiguredPageLinearLayout;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class trd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f49563a;
    private static Context d;
    private static ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> f = new ConcurrentHashMap<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<Integer, ConfiguredPageDataCallback> f49565c = new ConcurrentHashMap<>(16);
    private static ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> e = new ConcurrentHashMap<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<Integer, CopyOnWriteArrayList<trb>> f49564b = new ConcurrentHashMap<>(16);
    private static ConcurrentHashMap<String, Map<Integer, WeakReference<ConfiguredPageLinearLayout>>> j = new ConcurrentHashMap<>(16);

    public static void a(int i, LinearLayout linearLayout, ConfiguredPageDataCallback configuredPageDataCallback) {
        a(i, linearLayout, false, configuredPageDataCallback);
    }

    public static void a(final int i, LinearLayout linearLayout, boolean z, ConfiguredPageDataCallback configuredPageDataCallback) {
        ConcurrentHashMap<Integer, ConfiguredPageDataCallback> concurrentHashMap;
        ConfiguredPageDataCallback configuredPageDataCallback2;
        final LinearLayout linearLayout2 = (LinearLayout) new WeakReference(linearLayout).get();
        if (linearLayout2 == null) {
            LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "layout is null");
            return;
        }
        if (!Utils.o() || !VersionControlUtil.isSupportOperationAccount()) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "use marketing 2.0.");
            linearLayout2.setVisibility(8);
            return;
        }
        if (!z && OperationUtils.switchToMarketingTwo()) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "initOperationConfiguredPage, using marketing 2.0");
            linearLayout2.setVisibility(8);
            return;
        }
        d = BaseApplication.getContext();
        linearLayout2.setId(View.generateViewId());
        LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "initOperationConfiguredPage() pageType = ", Integer.valueOf(i), ", layout = ", Integer.valueOf(linearLayout2.getId()));
        if (configuredPageDataCallback != null) {
            f49565c.put(Integer.valueOf(i), configuredPageDataCallback);
        }
        boolean zF = f(i, linearLayout2);
        boolean zH = h(i, linearLayout2);
        if (!zF) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "initOperationConfiguredPage() no memory cached.");
        } else {
            if (zH) {
                f = a(i, f, f49564b);
            }
            k(i, linearLayout2);
        }
        if (!oco.d(d)) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "initOperationConfiguredPage() network is not connected. return back!");
            if (zF || zH || (concurrentHashMap = f49565c) == null || concurrentHashMap.size() <= 0 || !f49565c.containsKey(Integer.valueOf(i)) || (configuredPageDataCallback2 = f49565c.get(Integer.valueOf(i))) == null) {
                return;
            }
            configuredPageDataCallback2.getConfiguredDataSize(0);
            configuredPageDataCallback2.onDataResponse(null);
            return;
        }
        e(i, new HttpResCallback() { // from class: trd.3
            @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
            public void onFinished(int i2, String str) {
                if (i2 != 200 || TextUtils.isEmpty(str)) {
                    LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "/getPageModule resCode = ", Integer.valueOf(i2), " or result is empty.");
                    trd.k(i, linearLayout2);
                } else {
                    LogUtil.d("ConfiguredPage_ConfiguredPageInteraction", "getConfiguredPageDataFromCloud() /getPageModule result = ", str);
                    trd.a(str, i, linearLayout2);
                }
            }
        });
    }

    private static void g(int i, LinearLayout linearLayout) {
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> concurrentHashMap = f;
        if (concurrentHashMap == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "removePageModuleData() mPageModuleObjectMap is null.");
            return;
        }
        if (njy.b(concurrentHashMap.get(Integer.valueOf(i)))) {
            f.remove(Integer.valueOf(i));
        }
        k(i, linearLayout);
    }

    private static void i(int i, LinearLayout linearLayout) {
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> concurrentHashMap = f;
        if (concurrentHashMap == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "removeHuaweiActivityData() mActivityObjectMap is null.");
            return;
        }
        if (concurrentHashMap.containsKey(Integer.valueOf(i))) {
            CopyOnWriteArrayList<dlo> copyOnWriteArrayList = f.get(Integer.valueOf(i));
            if (njy.e(copyOnWriteArrayList)) {
                return;
            }
            CopyOnWriteArrayList<dlo> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            for (dlo dloVar : copyOnWriteArrayList) {
                if (dloVar != null && dloVar.a() != 3) {
                    copyOnWriteArrayList2.add(dloVar);
                }
            }
            f.remove(Integer.valueOf(i));
            f.put(Integer.valueOf(i), copyOnWriteArrayList2);
            k(i, linearLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, int i, LinearLayout linearLayout) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("resultCode");
            if (!"0".equals(string)) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "hasPageModuleJsonData /getPageModule resultCode = ", string, ", resultDesc = ", jSONObject.getString("resultDesc"));
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("pageModuleList");
            int length = jSONArray.length();
            if (length == 0) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "/getPageModule pageModuleListJsonArray is empty! no pageModuleList!");
                g(i, linearLayout);
                return;
            }
            ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> concurrentHashMap = f;
            if (concurrentHashMap != null && concurrentHashMap.containsKey(Integer.valueOf(i))) {
                CopyOnWriteArrayList<dlo> copyOnWriteArrayList = f.get(Integer.valueOf(i));
                if (njy.b(copyOnWriteArrayList) && copyOnWriteArrayList.toString().equals(jSONArray.toString())) {
                    a(i, linearLayout);
                    return;
                }
            }
            CopyOnWriteArrayList<dlo> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            for (int i2 = 0; i2 < length; i2++) {
                dlo dloVarD = d(jSONArray.getJSONObject(i2), i);
                if (dloVarD == null || copyOnWriteArrayList2.contains(dloVarD)) {
                    LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "getPageModuleData() pageModuleObject is null or contains");
                } else {
                    copyOnWriteArrayList2.add(dloVarD);
                }
            }
            if (njy.e(copyOnWriteArrayList2)) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "/getPageModule pageModuleObjectList is empty! ");
                g(i, linearLayout);
                return;
            }
            f.put(Integer.valueOf(i), copyOnWriteArrayList2);
            SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageModuleData" + i, jSONArray.toString(), new StorageParams());
            a(i, linearLayout);
        } catch (JSONException e2) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "parse page module data meet exception.", e2.getMessage());
        }
    }

    private static void a(int i, LinearLayout linearLayout) {
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> concurrentHashMap = f;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "dealPageActivityData() mPageModuleObjectMap is empty.");
            return;
        }
        CopyOnWriteArrayList<dlo> copyOnWriteArrayList = f.get(Integer.valueOf(i));
        if (njy.e(copyOnWriteArrayList)) {
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        int i2 = 0;
        for (dlo dloVar : copyOnWriteArrayList) {
            if (dloVar != null && dloVar.a() == 3) {
                List<dlm> listE = dloVar.e();
                if (njy.e(listE)) {
                    return;
                }
                for (dlm dlmVar : listE) {
                    if (dlmVar == null || dlmVar.a() != 1) {
                        i2++;
                    } else {
                        String strB = dlmVar.b();
                        if (TextUtils.isEmpty(strB) || arrayList.contains(strB)) {
                            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "dealPageActivityData() activityDetailId is empty or already exists");
                        } else {
                            arrayList.add(strB);
                        }
                    }
                }
            }
        }
        if (i2 > 0 && njy.e(arrayList)) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "dealPageActivityData() only tripartite activity.");
            return;
        }
        if (i2 == 0 && njy.e(arrayList)) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "dealPageActivityData() huaweiActivityDetailIdList is empty.");
            i(i, linearLayout);
        } else {
            LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "dealPageActivityData() mHuaweiActivityIdList = ", arrayList.toString());
            c(i, linearLayout, arrayList);
        }
    }

    private static void c(final int i, final LinearLayout linearLayout, List<String> list) {
        b(list, new ResultCallback<String>() { // from class: trd.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "dealPageActivityData success:", str);
                trd.e(str, i, linearLayout);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "dealPageActivityData fail:");
                trd.k(i, linearLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(int i, LinearLayout linearLayout) {
        b(i, linearLayout, true);
    }

    private static void b(final int i, final LinearLayout linearLayout, final boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerExecutor.c(new Runnable() { // from class: trd.2
                @Override // java.lang.Runnable
                public void run() {
                    trd.a(i, linearLayout, z);
                }
            });
        } else {
            a(i, linearLayout, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, int i, LinearLayout linearLayout) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "/resolveHuaweiActivityJsonData result is empty! ");
            k(i, linearLayout);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("resultCode");
            if (!"0".equals(string)) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "/resolveHuaweiActivityJsonData resultCode = ", string, ", resultDesc = ", jSONObject.getString("resultDesc"));
                k(i, linearLayout);
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("pageActivityList");
            int length = jSONArray.length();
            if (length == 0) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "/resolveHuaweiActivityJsonData no pageActivityList.");
                i(i, linearLayout);
                return;
            }
            if (f49564b.containsKey(Integer.valueOf(i))) {
                CopyOnWriteArrayList<trb> copyOnWriteArrayList = f49564b.get(Integer.valueOf(i));
                if (njy.b(copyOnWriteArrayList) && copyOnWriteArrayList.toString().equals(jSONArray.toString())) {
                    k(i, linearLayout);
                    return;
                }
            }
            SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageActivitiesData" + i, jSONArray.toString(), new StorageParams());
            e(i, jSONObject);
            CopyOnWriteArrayList<trb> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            for (int i2 = 0; i2 < length; i2++) {
                trb trbVarE = e(jSONArray.getJSONObject(i2));
                if (trbVarE != null && !copyOnWriteArrayList2.contains(trbVarE)) {
                    copyOnWriteArrayList2.add(trbVarE);
                }
            }
            if (njy.e(copyOnWriteArrayList2)) {
                i(i, linearLayout);
                return;
            }
            f49564b.put(Integer.valueOf(i), copyOnWriteArrayList2);
            f = a(i, f, f49564b);
            k(i, linearLayout);
        } catch (JSONException e2) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "Json data error! JSONException:", e2.getMessage());
            k(i, linearLayout);
        }
    }

    private static void e(int i, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("currentTime")) {
            String string = jSONObject.getString("currentTime");
            StorageParams storageParams = new StorageParams();
            SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageActivityServerCurrentTime" + i, string, storageParams);
        }
    }

    public static void b(int i, LinearLayout linearLayout) {
        a(i, linearLayout, false);
    }

    public static void a(int i, LinearLayout linearLayout, boolean z) {
        d = BaseApplication.getContext();
        if (!VersionControlUtil.isSupportOperationAccount()) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "use marketing 2.0. or kidAccount");
            return;
        }
        if (!Utils.o()) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "use marketing 2.0. or kidAccount");
            return;
        }
        if (!z && OperationUtils.switchToMarketingTwo()) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "refreshConfiguredPageUi, using marketing 2.0");
            linearLayout.setVisibility(8);
            return;
        }
        LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "refreshConfiguredPageUi() ENTER. pageType = ", Integer.valueOf(i));
        if (linearLayout == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "refreshConfiguredPageUi() layout is null.");
            return;
        }
        ConcurrentHashMap<Integer, ConfiguredPageDataCallback> concurrentHashMap = f49565c;
        ConfiguredPageDataCallback configuredPageDataCallback = (concurrentHashMap == null || concurrentHashMap.size() <= 0 || !f49565c.containsKey(Integer.valueOf(i))) ? null : f49565c.get(Integer.valueOf(i));
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> concurrentHashMap2 = f;
        if (concurrentHashMap2 == null || concurrentHashMap2.size() <= 0) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "refreshConfiguredPageUi() mPageModuleObjectMap is null.");
            if (configuredPageDataCallback != null) {
                configuredPageDataCallback.getConfiguredDataSize(0);
                configuredPageDataCallback.onDataResponse(null);
            }
            linearLayout.removeAllViews();
            return;
        }
        CopyOnWriteArrayList<dlo> copyOnWriteArrayList = f.get(Integer.valueOf(i));
        CopyOnWriteArrayList<dlo> copyOnWriteArrayList2 = e.get(Integer.valueOf(i));
        if (!njy.e(copyOnWriteArrayList2)) {
            if (f49563a) {
                if (njy.e(copyOnWriteArrayList)) {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                } else {
                    copyOnWriteArrayList.removeAll(copyOnWriteArrayList2);
                    copyOnWriteArrayList.addAll(copyOnWriteArrayList2);
                }
                Collections.sort(copyOnWriteArrayList, new Comparator<dlo>() { // from class: trd.5
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public int compare(dlo dloVar, dlo dloVar2) {
                        return dloVar2.g() - dloVar.g();
                    }
                });
            } else if (njy.b(copyOnWriteArrayList)) {
                copyOnWriteArrayList.removeAll(copyOnWriteArrayList2);
            }
        }
        if (njy.e(copyOnWriteArrayList)) {
            linearLayout.removeAllViews();
            return;
        }
        Map<Integer, WeakReference<ConfiguredPageLinearLayout>> map = j.get(c(i, linearLayout));
        if (map == null || map.size() <= 0) {
            map = new HashMap<>();
        }
        linearLayout.removeAllViews();
        Iterator<dlo> it = copyOnWriteArrayList.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA = a(linearLayout, map, iA, it.next());
        }
        if (i == 16 && map.size() > 0 && !j.contains(map)) {
            j.put(c(i, linearLayout), map);
        }
        LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "refreshConfiguredPageUi() size = ", Integer.valueOf(copyOnWriteArrayList.size()), ", viewInvisibleNumber = ", Integer.valueOf(iA));
        qsp.c((View) linearLayout, linearLayout.getChildCount() != 0 ? 0 : 8);
        if (configuredPageDataCallback != null) {
            configuredPageDataCallback.getConfiguredDataSize(copyOnWriteArrayList.size() - iA);
            configuredPageDataCallback.onDataResponse(copyOnWriteArrayList);
        }
    }

    private static int a(LinearLayout linearLayout, Map<Integer, WeakReference<ConfiguredPageLinearLayout>> map, int i, dlo dloVar) {
        WeakReference<ConfiguredPageLinearLayout> weakReference;
        ConfiguredPageLinearLayout configuredPageLinearLayout;
        if (dloVar == null || linearLayout == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "getViewInvisibleNumber() pageModuleObject or layout is null.");
            return i;
        }
        if (dloVar.a() == 5 && CommonUtil.bd()) {
            return i + 1;
        }
        WeakReference<ConfiguredPageLinearLayout> weakReference2 = map.get(Integer.valueOf(dloVar.h()));
        if (weakReference2 == null) {
            configuredPageLinearLayout = new ConfiguredPageLinearLayout(d);
            configuredPageLinearLayout.setId(dloVar.h());
            configuredPageLinearLayout.a(dloVar);
            weakReference = new WeakReference<>(configuredPageLinearLayout);
        } else {
            ConfiguredPageLinearLayout configuredPageLinearLayout2 = weakReference2.get();
            if (configuredPageLinearLayout2 != null) {
                configuredPageLinearLayout2.d(dloVar);
            }
            weakReference = weakReference2;
            configuredPageLinearLayout = configuredPageLinearLayout2;
        }
        if (configuredPageLinearLayout == null || !configuredPageLinearLayout.a()) {
            return i + 1;
        }
        ViewParent parent = configuredPageLinearLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(configuredPageLinearLayout);
        }
        linearLayout.addView(configuredPageLinearLayout);
        if (!map.containsKey(Integer.valueOf(dloVar.h()))) {
            map.put(Integer.valueOf(dloVar.h()), weakReference);
        }
        return i;
    }

    private static String c(int i, LinearLayout linearLayout) {
        if (linearLayout == null) {
            return String.valueOf(i);
        }
        return String.valueOf(i) + linearLayout.getId();
    }

    private static ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> a(int i, ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> concurrentHashMap, ConcurrentHashMap<Integer, CopyOnWriteArrayList<trb>> concurrentHashMap2) {
        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
            CopyOnWriteArrayList<dlo> copyOnWriteArrayList = concurrentHashMap.get(Integer.valueOf(i));
            if (!njy.e(copyOnWriteArrayList)) {
                CopyOnWriteArrayList<trb> copyOnWriteArrayList2 = concurrentHashMap2.get(Integer.valueOf(i));
                if (!njy.e(copyOnWriteArrayList2)) {
                    for (dlo dloVar : copyOnWriteArrayList) {
                        if (dloVar != null && dloVar.a() == 3) {
                            List<dlm> listE = dloVar.e();
                            if (njy.e(listE)) {
                                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "combineModuleActivityList() cardItemObjectList is empty.");
                            } else {
                                for (dlm dlmVar : listE) {
                                    if (dlmVar != null && dlmVar.a() == 1) {
                                        String strB = dlmVar.b();
                                        for (trb trbVar : copyOnWriteArrayList2) {
                                            if (trbVar != null && strB.equals(trbVar.a())) {
                                                dlmVar.c(trbVar.e());
                                                dlmVar.a(trbVar.c());
                                                dlmVar.b(trbVar.b());
                                                dlmVar.s(trbVar.d());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return concurrentHashMap;
    }

    private static dlo d(JSONObject jSONObject, int i) {
        int i2;
        if (jSONObject == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "resolvePageModuleJsonData() pageModuleJsonObject is null.");
            return null;
        }
        try {
            dlo dloVarB = b(jSONObject);
            if (dloVarB == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "resolvePageModuleJsonData() pageModuleObject is null.");
                return null;
            }
            if (jSONObject.isNull("moduleType")) {
                i2 = 0;
            } else {
                i2 = jSONObject.getInt("moduleType");
                dloVarB.c(i2);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (!jSONObject.isNull("pageModuleDetail")) {
                jSONObject2 = jSONObject.getJSONObject("pageModuleDetail");
            }
            String strE = e(i2);
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "resolvePageModuleJsonData() detailJsonKey is empty. moduleType = ", Integer.valueOf(i2));
                return null;
            }
            JSONArray jSONArray = jSONObject2.getJSONArray(strE);
            int length = jSONArray.length();
            if (length == 0) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "resolvePageModuleJsonData() pageModuleDetailJsonArrayLength == 0.detailJsonKey = ", strE);
                return null;
            }
            for (int i3 = 0; i3 < length; i3++) {
                dlm dlmVarA = a(jSONArray.getJSONObject(i3), i2);
                if (dlmVarA == null) {
                    LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "resolvePageModuleJsonData() cardItemObject is null.");
                } else {
                    dlmVarA.k(i);
                    dloVarB.c(dlmVarA);
                }
            }
            return dloVarB;
        } catch (JSONException e2) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "expoundConfigureModule Json data error! JSONException:", e2.getMessage());
            return null;
        }
    }

    private static trb e(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "expoundActivityItemObject() jsonActivityObject is null.");
            return null;
        }
        trb trbVar = new trb();
        try {
            if (!jSONObject.isNull("activityId")) {
                trbVar.a(jSONObject.getString("activityId"));
            }
            if (!jSONObject.isNull(ParsedFieldTag.BEGIN_DATE)) {
                trbVar.d(jSONObject.getString(ParsedFieldTag.BEGIN_DATE));
            }
            if (!jSONObject.isNull("endDate")) {
                trbVar.c(jSONObject.getString("endDate"));
            }
            if (!jSONObject.isNull("numberOfPeople")) {
                trbVar.e(jSONObject.getInt("numberOfPeople"));
            }
            if (!jSONObject.isNull("timeZone")) {
                trbVar.e(jSONObject.getString("timeZone"));
            }
            return trbVar;
        } catch (JSONException e2) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "expoundActivityItemObject Json data error! JSONException:", e2.getMessage());
            return null;
        }
    }

    private static dlm a(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "expoundActivityItemObject() jsonObject is null.");
            return null;
        }
        dlm dlmVar = new dlm();
        try {
            dlmVar.e(trg.c(jSONObject, "pageModuleId"));
            dlmVar.h(trg.b(jSONObject, "imgUrl"));
            dlmVar.g(trg.b(jSONObject, "ux10ImgUrl"));
            if (!jSONObject.isNull("imgUrlDaxi")) {
                dlmVar.f(jSONObject.getString("imgUrlDaxi"));
            } else if (!jSONObject.isNull("imgUrl")) {
                dlmVar.f(jSONObject.getString("imgUrl"));
            } else {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "expoundCardItemObject() imageUrlTahiti and imageUrl are empty");
            }
            dlmVar.d(trg.b(jSONObject, "detailUrl"));
            dlmVar.g(trg.c(jSONObject, "weight"));
            if (!jSONObject.isNull("display")) {
                dlmVar.c(jSONObject.getInt("display"));
            }
            dlmVar.b(trg.b(jSONObject, "description"));
            if (!jSONObject.isNull("desDisplay")) {
                dlmVar.f(jSONObject.getInt("desDisplay"));
            }
            if (!jSONObject.isNull("labelType")) {
                dlmVar.o(jSONObject.getInt("labelType"));
            }
            if (!jSONObject.isNull("heatCount")) {
                dlmVar.h(jSONObject.getInt("heatCount"));
            }
            dlmVar.o(trg.b(jSONObject, "pageAttribute"));
            dlmVar.l(trg.b(jSONObject, "pageLabel"));
            dlmVar.n(trg.b(jSONObject, "pageAttributeKey"));
            return c(i, dlmVar, jSONObject);
        } catch (JSONException e2) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "expoundCardItemObject Json data error! JSONException:", e2.getMessage());
            return null;
        }
    }

    private static dlm c(int i, dlm dlmVar, JSONObject jSONObject) {
        try {
            if (i == 1) {
                d(dlmVar, jSONObject, "serviceId");
                c(dlmVar, jSONObject, JsUtil.SERVICE_NAME);
                dlmVar.j(trg.c(jSONObject, "serviceUrlType"));
                e(dlmVar, jSONObject);
                return dlmVar;
            }
            if (i == 2) {
                d(dlmVar, jSONObject, "planId");
                c(dlmVar, jSONObject, "planName");
                dlmVar.i(trg.b(jSONObject, "planDco"));
                return dlmVar;
            }
            if (i == 3) {
                d(dlmVar, jSONObject, "activityId");
                c(dlmVar, jSONObject, "activityName");
                dlmVar.d(trg.c(jSONObject, SyncDataConstant.BI_KEY_ACTIVITY_TYPE));
                dlmVar.e(trg.b(jSONObject, "activityDetailId"));
                dlmVar.m(trg.c(jSONObject, "informationId"));
                dlmVar.l(trg.c(jSONObject, "readCount"));
                return dlmVar;
            }
            if (i == 4) {
                d(dlmVar, jSONObject, "infoId");
                c(dlmVar, jSONObject, "infoName");
                b(dlmVar, jSONObject);
                return dlmVar;
            }
            if (i != 5) {
                return dlmVar;
            }
            d(dlmVar, jSONObject, "optimizationId");
            c(dlmVar, jSONObject, "optimizationName");
            b(dlmVar, jSONObject);
            return dlmVar;
        } catch (JSONException e2) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "getModuleTypeCard() Json data error! JSONException:", e2.getMessage());
            return null;
        }
    }

    private static void e(dlm dlmVar, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull("serviceFlag")) {
            dlmVar.m(jSONObject.getString("serviceFlag"));
        }
        if (!jSONObject.isNull("webUrl")) {
            dlmVar.r(jSONObject.getString("webUrl"));
        }
        if (jSONObject.isNull("innerPagePath")) {
            return;
        }
        dlmVar.k(jSONObject.getString("innerPagePath"));
    }

    private static void b(dlm dlmVar, JSONObject jSONObject) throws JSONException {
        if (jSONObject.isNull("imgType")) {
            return;
        }
        dlmVar.i(jSONObject.getInt("imgType"));
    }

    private static void c(dlm dlmVar, JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.isNull(str)) {
            return;
        }
        dlmVar.j(jSONObject.getString(str));
    }

    private static void d(dlm dlmVar, JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.isNull(str)) {
            return;
        }
        dlmVar.a(jSONObject.getInt(str));
    }

    private static String e(int i) {
        if (i == 1) {
            return "pageServiceList";
        }
        if (i == 2) {
            return "pagePlanList";
        }
        if (i == 3) {
            return "pageActivityList";
        }
        if (i == 4) {
            return "pageInformationList";
        }
        if (i == 5) {
            return "pageOptimizationList";
        }
        return "";
    }

    private static dlo b(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "resolvePageModuleJsonData() pageModuleJsonObject is null.");
            return null;
        }
        dlo dloVar = new dlo();
        try {
            if (!jSONObject.isNull("pageModuleId")) {
                dloVar.a(jSONObject.getInt("pageModuleId"));
            }
            if (!jSONObject.isNull(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE)) {
                dloVar.d(jSONObject.getInt(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE));
            }
            if (!jSONObject.isNull("layout")) {
                dloVar.b(jSONObject.getInt("layout"));
            }
            if (!jSONObject.isNull("name")) {
                dloVar.b(jSONObject.getString("name"));
            }
            if (!jSONObject.isNull("weight")) {
                dloVar.f(jSONObject.getInt("weight"));
            }
            if (!jSONObject.isNull("display")) {
                dloVar.e(jSONObject.getInt("display"));
            }
            if (!jSONObject.isNull("moreInfoUrl")) {
                dloVar.c(jSONObject.getString("moreInfoUrl"));
            }
            if (!jSONObject.isNull("extLayout")) {
                dloVar.j(jSONObject.getInt("extLayout"));
            }
            if (!jSONObject.isNull("textPosition")) {
                dloVar.i(jSONObject.getInt("textPosition"));
            }
            return dloVar;
        } catch (JSONException e2) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "resolvePageModuleBasicInformation json data error! JSONException:", e2.getMessage());
            return null;
        }
    }

    private static boolean f(int i, LinearLayout linearLayout) {
        j(i, linearLayout);
        if (f.containsKey(Integer.valueOf(i))) {
            return true;
        }
        String strE = SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageModuleData" + i);
        try {
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "showCachedData() mPageModuleCached is empty.");
            } else {
                JSONArray jSONArray = new JSONArray(strE);
                int length = jSONArray.length();
                CopyOnWriteArrayList<dlo> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                for (int i2 = 0; i2 < length; i2++) {
                    dlo dloVarD = d(jSONArray.getJSONObject(i2), i);
                    if (dloVarD != null && !copyOnWriteArrayList.contains(dloVarD)) {
                        copyOnWriteArrayList.add(dloVarD);
                    }
                }
                if (njy.b(copyOnWriteArrayList)) {
                    f.put(Integer.valueOf(i), copyOnWriteArrayList);
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "initPageModuleMemoryCached resolve page module data exception.");
            return false;
        }
    }

    private static boolean h(int i, LinearLayout linearLayout) {
        j(i, linearLayout);
        if (f49564b.containsKey(Integer.valueOf(i))) {
            return true;
        }
        String strE = SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageActivitiesData" + i);
        try {
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "showCachedData() mPageActivityCached is empty.");
            } else {
                JSONArray jSONArray = new JSONArray(strE);
                CopyOnWriteArrayList<trb> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    trb trbVarE = e(jSONArray.getJSONObject(i2));
                    if (trbVarE != null && !copyOnWriteArrayList.contains(trbVarE)) {
                        copyOnWriteArrayList.add(trbVarE);
                    }
                }
                if (njy.b(copyOnWriteArrayList)) {
                    f49564b.put(Integer.valueOf(i), copyOnWriteArrayList);
                    return true;
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "initActivityMemoryCached resolve page module data exception.");
        }
        return false;
    }

    private static void b(List<String> list, final ResultCallback<String> resultCallback) {
        if (njy.e(list)) {
            LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "requestPageActivityCloudData() huaweiActivityIdList is empty.");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        final JSONObject jSONObjectB = b(jSONArray);
        GRSManager.c(d).d("activityUrl", new GrsQueryCallback() { // from class: trd.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "requestPageActivityCloudData() GRSManager onCallBackSuccess ACTIVITY_KEY.");
                lqb.a(str + "/activity/getActivityInfoByIds", jSONObjectB, resultCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "requestPageActivityCloudData() GRSManager onCallBackFail() errorCode = ", Integer.valueOf(i));
            }
        });
    }

    private static JSONObject b(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject(new ActivityInfoListFactory(BaseApplication.getContext()).getBody(null));
        try {
            jSONObject.put("activityIdList", jSONArray);
        } catch (JSONException e2) {
            LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "getActivityParams ", e2.getMessage());
        }
        LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "getActivityParams() activityParams = ", jSONObject.toString());
        return jSONObject;
    }

    private static void e(int i, final HttpResCallback httpResCallback) {
        final HashMap<String, String> mapC = c();
        mapC.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, String.valueOf(i));
        LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "requestPageModuleCloudData() params = ", mapC.toString());
        final HashMap<String, String> mapD = d();
        GRSManager.c(d).d("messageCenterUrl", new GrsQueryCallback() { // from class: trd.6
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a("ConfiguredPage_ConfiguredPageInteraction", "requestPageModuleCloudData() GRSManager onCallBackSuccess URL_PAGE_MODULE.");
                trd.c(str + "/messageCenter/getPageModule" + com.huawei.health.messagecenter.model.CommonUtil.getUrlSuffix(), mapC, mapD, httpResCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.j("ConfiguredPage_ConfiguredPageInteraction", "requestPageModuleCloudData() GRSManager onCallBackFail() errorCode = ", Integer.valueOf(i2));
                httpResCallback.onFinished(-1, "");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final String str, final HashMap<String, String> map, final HashMap<String, String> map2, final HttpResCallback httpResCallback) {
        if (ost.a()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: trd.9
                @Override // java.lang.Runnable
                public void run() {
                    trd.c(str, map, map2, httpResCallback);
                }
            });
            return;
        }
        String strA = ltg.a(str, map, map2);
        if (TextUtils.isEmpty(strA)) {
            httpResCallback.onFinished(-1, "");
        } else {
            httpResCallback.onFinished(200, strA);
        }
    }

    public static HashMap<String, String> d() {
        HashMap<String, String> map = new HashMap<>(16);
        if (!LoginInit.getInstance(d).isBrowseMode()) {
            map.put("x-huid", LoginInit.getInstance(d).getAccountInfo(1011));
        }
        map.put("x-version", CommonUtil.c(d));
        return map;
    }

    public static HashMap<String, String> c() {
        HashMap<String, String> map = new HashMap<>(16);
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("phoneType", PhoneInfoUtils.getHuaweiManufaturerOrEmui());
        String deviceId = LoginInit.getInstance(d).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("bindDeviceType", String.valueOf(CommonUtil.h(d)));
        map.put("wearType", "");
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", String.valueOf(1));
        map.put("countryCode", LoginInit.getInstance(d).getAccountInfo(1010));
        map.put("language", pjn.b(null));
        map.put("ts", String.valueOf(tre.j()));
        String accountInfo = LoginInit.getInstance(d).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                map.put("token", URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException e2) {
                LogUtil.e("ConfiguredPage_ConfiguredPageInteraction", "token encode Exception ", e2.toString());
            }
        }
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("upDeviceType", LoginInit.getInstance(d).getDeviceType());
        if (LoginInit.getInstance(d).isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", BaseApplication.getAppPackage());
        }
        map.put("siteId", LoginInit.getInstance(d).getAccountInfo(1009));
        map.put("currentManufacturer", Build.MANUFACTURER);
        return map;
    }

    private static void j(int i, LinearLayout linearLayout) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        String strE = SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageLastLoginCountryCode");
        if (TextUtils.isEmpty(strE) || !strE.equals(accountInfo)) {
            SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageLastLoginCountryCode", accountInfo, new StorageParams(1));
            e(i, linearLayout);
            return;
        }
        String accountInfo2 = LoginInit.getInstance(d).getAccountInfo(1011);
        String strE2 = SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageLastLoginUserId");
        if (TextUtils.isEmpty(strE2) || !strE2.equals(accountInfo2)) {
            SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageLastLoginUserId", accountInfo2, new StorageParams(1));
            e(i, linearLayout);
        }
    }

    private static void e(int i, LinearLayout linearLayout) {
        for (int i2 = 1; i2 <= 22; i2++) {
            SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageModuleData" + i2, "", new StorageParams());
            SharedPreferenceManager.e(d, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageActivitiesData" + i2, "", new StorageParams());
        }
        ConcurrentHashMap<String, Map<Integer, WeakReference<ConfiguredPageLinearLayout>>> concurrentHashMap = j;
        if (concurrentHashMap != null) {
            Map<Integer, WeakReference<ConfiguredPageLinearLayout>> map = concurrentHashMap.get(c(i, linearLayout));
            if (map != null && map.size() > 0) {
                map.clear();
            }
            j.clear();
        }
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<dlo>> concurrentHashMap2 = f;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<trb>> concurrentHashMap3 = f49564b;
        if (concurrentHashMap3 != null) {
            concurrentHashMap3.clear();
        }
    }

    public static void c(int i, LinearLayout linearLayout, CopyOnWriteArrayList<dlo> copyOnWriteArrayList) {
        if (njy.e(copyOnWriteArrayList)) {
            f49563a = false;
            b(i, linearLayout, false);
        } else {
            f49563a = true;
            e.clear();
            e.put(Integer.valueOf(i), copyOnWriteArrayList);
            b(i, linearLayout, false);
        }
    }
}
