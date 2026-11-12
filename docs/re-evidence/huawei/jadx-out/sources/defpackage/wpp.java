package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.health.messagecenter.model.CommonUtil;
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
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wpp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile wpp f52316b;
    private static final Byte[] d = new Byte[1];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f52317a;
    private ConcurrentHashMap<Integer, List<dlo>> f = new ConcurrentHashMap<>(16);
    private ConcurrentHashMap<Integer, List<trb>> e = new ConcurrentHashMap<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52318c = true;
    private Handler h = new wpi();

    private wpp(Context context) {
        this.f52317a = context;
    }

    public static wpp a() {
        if (f52316b == null) {
            synchronized (d) {
                if (f52316b == null) {
                    f52316b = new wpp(BaseApplication.getContext());
                }
            }
        }
        return f52316b;
    }

    public List<dlo> a(int i) {
        return this.f.get(Integer.valueOf(i));
    }

    public void c(final int i) {
        LogUtil.a("TemplatePage_ConfiguredPageInteraction", "initOperationConfiguredPage() pageType = ", Integer.valueOf(i));
        if (!VersionControlUtil.isSupportOperationAccount() || !Utils.o()) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "initOperationConfiguredPage() isMinorAccount no support.");
            return;
        }
        boolean z = i(i) || h(i);
        if (z) {
            this.f = b(i, this.f, this.e);
            g(i);
        } else {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "initOperationConfiguredPage() no memory cached.");
        }
        if (!oco.d(this.f52317a)) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "initOperationConfiguredPage() network is not connected. return back!");
            if (z) {
                return;
            }
            g(i);
            return;
        }
        c(i, new HttpResCallback() { // from class: wpp.1
            @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
            public void onFinished(int i2, String str) {
                if (i2 != 200 || TextUtils.isEmpty(str)) {
                    LogUtil.j("TemplatePage_ConfiguredPageInteraction", "/getPageModule resCode = ", Integer.valueOf(i2), " or result is empty.");
                    wpp.this.g(i);
                } else {
                    LogUtil.d("TemplatePage_ConfiguredPageInteraction", "getConfiguredPageDataFromCloud() /getPageModule result = ", str);
                    if (wpp.this.e(str, i)) {
                        wpp.this.g(i);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("resultCode");
            if (!"0".equals(string)) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "hasPageModuleJsonData /getPageModule resultCode = ", string, ", resultDesc = ", jSONObject.getString("resultDesc"));
                return false;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("pageModuleList");
            int length = jSONArray.length();
            if (length == 0) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "/getPageModule pageModuleListJsonArray is empty! no pageModuleList!");
                return false;
            }
            ConcurrentHashMap<Integer, List<dlo>> concurrentHashMap = this.f;
            if (concurrentHashMap != null && concurrentHashMap.containsKey(Integer.valueOf(i))) {
                List<dlo> list = this.f.get(Integer.valueOf(i));
                if (njy.b(list) && list.toString().equals(jSONArray.toString())) {
                    d(i);
                    return false;
                }
            }
            ArrayList arrayList = new ArrayList(10);
            for (int i2 = 0; i2 < length; i2++) {
                dlo dloVarC = c(jSONArray.getJSONObject(i2), i);
                if (dloVarC == null || arrayList.contains(dloVarC)) {
                    LogUtil.j("TemplatePage_ConfiguredPageInteraction", "getPageModuleData() pageModuleObject is null or contains");
                } else {
                    arrayList.add(dloVarC);
                }
            }
            if (njy.e(arrayList)) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "/getPageModule mPageModuleObjectList is empty! ");
                return false;
            }
            this.f.put(Integer.valueOf(i), arrayList);
            SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageModuleData" + i, jSONArray.toString(), new StorageParams());
            d(i);
            return true;
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "parse page module data meet exception.");
        }
    }

    private void d(int i) {
        ConcurrentHashMap<Integer, List<dlo>> concurrentHashMap = this.f;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "dealPageActivityData() mPageModuleObjectMap is empty.");
            return;
        }
        List<dlo> list = this.f.get(Integer.valueOf(i));
        if (njy.e(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (dlo dloVar : list) {
            if (dloVar != null && dloVar.a() == 3) {
                List<dlm> listE = dloVar.e();
                if (njy.e(listE)) {
                    return;
                }
                for (dlm dlmVar : listE) {
                    if (dlmVar != null && dlmVar.a() == 1) {
                        String strB = dlmVar.b();
                        if (TextUtils.isEmpty(strB) || arrayList.contains(strB)) {
                            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "dealPageActivityData() activityDetailId is empty or already exists");
                        } else {
                            arrayList.add(strB);
                        }
                    }
                }
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "dealPageActivityData() huaweiActivityDetailIdList is empty.");
            g(i);
        } else {
            LogUtil.a("TemplatePage_ConfiguredPageInteraction", "dealPageActivityData() mHuaweiActivityIdList = ", arrayList.toString());
            d(i, arrayList);
        }
    }

    private void d(final int i, List<String> list) {
        e(list, new ResultCallback<String>() { // from class: wpp.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    LogUtil.a("TemplatePage_ConfiguredPageInteraction", "dealPageActivityData success:", str);
                    wpp.this.d(str, i);
                }
                wpp.this.g(i);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("TemplatePage_ConfiguredPageInteraction", "dealPageActivityData fail:");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        Message messageObtainMessage = this.h.obtainMessage();
        messageObtainMessage.what = 4097;
        messageObtainMessage.arg1 = i;
        this.h.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "/resolveHuaweiActivityJsonData result is empty! ");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("resultCode");
            if (!"0".equals(string)) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "/resolveHuaweiActivityJsonData resultCode = ", string, ", resultDesc = ", jSONObject.getString("resultDesc"));
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("pageActivityList");
            int length = jSONArray.length();
            if (length == 0) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "/resolveHuaweiActivityJsonData no pageActivityList.");
                return;
            }
            if (this.e.containsKey(Integer.valueOf(i))) {
                List<trb> list = this.e.get(Integer.valueOf(i));
                if (njy.b(list) && list.toString().equals(jSONArray.toString())) {
                    return;
                }
            }
            SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageActivitiesData" + i, jSONArray.toString(), new StorageParams());
            a(i, jSONObject);
            ArrayList arrayList = new ArrayList(10);
            for (int i2 = 0; i2 < length; i2++) {
                trb trbVarC = c(jSONArray.getJSONObject(i2));
                if (trbVarC != null && !arrayList.contains(trbVarC)) {
                    arrayList.add(trbVarC);
                }
            }
            if (njy.e(arrayList)) {
                return;
            }
            this.e.put(Integer.valueOf(i), arrayList);
            this.f = b(i, this.f, this.e);
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "Json data error! JSONException");
        }
    }

    private void a(int i, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("currentTime")) {
            String string = jSONObject.getString("currentTime");
            StorageParams storageParams = new StorageParams();
            SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageActivityServerCurrentTime" + i, string, storageParams);
        }
    }

    private ConcurrentHashMap<Integer, List<dlo>> b(int i, ConcurrentHashMap<Integer, List<dlo>> concurrentHashMap, ConcurrentHashMap<Integer, List<trb>> concurrentHashMap2) {
        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
            List<dlo> list = concurrentHashMap.get(Integer.valueOf(i));
            if (!njy.e(list)) {
                List<trb> list2 = concurrentHashMap2.get(Integer.valueOf(i));
                if (!njy.e(list2)) {
                    for (dlo dloVar : list) {
                        if (dloVar != null && dloVar.a() == 3) {
                            List<dlm> listE = dloVar.e();
                            if (njy.e(listE)) {
                                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "combineModuleActivityList() cardItemObjectList is empty.");
                            } else {
                                for (dlm dlmVar : listE) {
                                    if (dlmVar != null && dlmVar.a() == 1) {
                                        String strB = dlmVar.b();
                                        for (trb trbVar : list2) {
                                            if (trbVar != null && strB.equals(trbVar.a())) {
                                                dlmVar.c(trbVar.e());
                                                dlmVar.a(trbVar.c());
                                                dlmVar.b(trbVar.b());
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

    private dlo c(JSONObject jSONObject, int i) {
        int i2;
        if (jSONObject == null) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "resolvePageModuleJsonData() pageModuleData is null.");
            return null;
        }
        try {
            dlo dloVarB = b(jSONObject);
            if (dloVarB == null) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "resolvePageModuleJsonData() pageModuleObject is null.");
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
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "resolvePageModuleJsonData() detailJsonKey is empty. moduleType = ", Integer.valueOf(i2));
                return null;
            }
            JSONArray jSONArray = jSONObject2.getJSONArray(strE);
            int length = jSONArray.length();
            if (length == 0) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "resolvePageModuleJsonData() pageModuleDetailJsonArrayLength == 0.detailJsonKey = ", strE);
                return null;
            }
            for (int i3 = 0; i3 < length; i3++) {
                dlm dlmVarD = d(jSONArray.getJSONObject(i3), i2);
                if (dlmVarD == null) {
                    LogUtil.j("TemplatePage_ConfiguredPageInteraction", "resolvePageModuleJsonData() cardItemObject is null.");
                } else {
                    dlmVarD.k(i);
                    dloVarB.c(dlmVarD);
                }
            }
            return dloVarB;
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "expoundConfigureModule Json data error!");
            return null;
        }
    }

    private trb c(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "expoundActivityItemObject() jsonActivityObject is null.");
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
            return trbVar;
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "expoundActivityItemObject Json data error!");
            return null;
        }
    }

    private dlm d(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "expoundActivityItemObject() jsonObject is null.");
            return null;
        }
        dlm dlmVar = new dlm();
        try {
            if (!jSONObject.isNull("pageModuleId")) {
                dlmVar.e(jSONObject.getInt("pageModuleId"));
            }
            if (!jSONObject.isNull("imgUrl")) {
                dlmVar.h(jSONObject.getString("imgUrl"));
            }
            if (!jSONObject.isNull("imgUrlDaxi")) {
                dlmVar.f(jSONObject.getString("imgUrlDaxi"));
            } else if (!jSONObject.isNull("imgUrl")) {
                dlmVar.f(jSONObject.getString("imgUrl"));
            } else {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "expoundCardItemObject() imageUrlTahiti and imageUrl are empty");
            }
            if (!jSONObject.isNull("detailUrl")) {
                dlmVar.d(jSONObject.getString("detailUrl"));
            }
            if (!jSONObject.isNull("weight")) {
                dlmVar.g(jSONObject.getInt("weight"));
            }
            if (!jSONObject.isNull("display")) {
                dlmVar.c(jSONObject.getInt("display"));
            }
            if (!jSONObject.isNull("description")) {
                dlmVar.b(jSONObject.getString("description"));
            }
            if (!jSONObject.isNull("desDisplay")) {
                dlmVar.f(jSONObject.getInt("desDisplay"));
            }
            return c(i, dlmVar, jSONObject);
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "expoundCardItemObject Json data error!");
            return null;
        }
    }

    private dlm c(int i, dlm dlmVar, JSONObject jSONObject) {
        try {
            if (i == 1) {
                e(dlmVar, jSONObject, "serviceId");
                d(dlmVar, jSONObject, JsUtil.SERVICE_NAME);
                if (!jSONObject.isNull("serviceUrlType")) {
                    dlmVar.j(jSONObject.getInt("serviceUrlType"));
                }
                b(dlmVar, jSONObject);
                return dlmVar;
            }
            if (i == 2) {
                e(dlmVar, jSONObject, "planId");
                d(dlmVar, jSONObject, "planName");
                if (!jSONObject.isNull("planDco")) {
                    dlmVar.i(jSONObject.getString("planDco"));
                }
            } else if (i == 3) {
                e(dlmVar, jSONObject, "activityId");
                d(dlmVar, jSONObject, "activityName");
                if (!jSONObject.isNull(SyncDataConstant.BI_KEY_ACTIVITY_TYPE)) {
                    dlmVar.d(jSONObject.getInt(SyncDataConstant.BI_KEY_ACTIVITY_TYPE));
                }
                if (!jSONObject.isNull("activityDetailId")) {
                    dlmVar.e(jSONObject.getString("activityDetailId"));
                    return dlmVar;
                }
            } else {
                if (i == 4) {
                    e(dlmVar, jSONObject, "infoId");
                    d(dlmVar, jSONObject, "infoName");
                    d(dlmVar, jSONObject);
                    return dlmVar;
                }
                if (i == 5) {
                    e(dlmVar, jSONObject, "optimizationId");
                    d(dlmVar, jSONObject, "optimizationName");
                    d(dlmVar, jSONObject);
                    return dlmVar;
                }
            }
            return dlmVar;
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "getModuleTypeCard() Json data error!");
            return null;
        }
    }

    private void b(dlm dlmVar, JSONObject jSONObject) throws JSONException {
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

    private void d(dlm dlmVar, JSONObject jSONObject) throws JSONException {
        if (jSONObject.isNull("imgType")) {
            return;
        }
        dlmVar.i(jSONObject.getInt("imgType"));
    }

    private void d(dlm dlmVar, JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.isNull(str)) {
            return;
        }
        dlmVar.j(jSONObject.getString(str));
    }

    private void e(dlm dlmVar, JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.isNull(str)) {
            return;
        }
        dlmVar.a(jSONObject.getInt(str));
    }

    private String e(int i) {
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

    private dlo b(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "resolvePageModuleJsonData() pageModuleJsonObject is null.");
            return null;
        }
        dlo dloVar = new dlo();
        try {
            if (!jSONObject.isNull("pageModuleId")) {
                dloVar.a(jSONObject.getInt("pageModuleId"));
            }
            if (!jSONObject.isNull(CommonUtil.PAGE_TYPE)) {
                dloVar.d(jSONObject.getInt(CommonUtil.PAGE_TYPE));
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
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "resolvePageModuleBasicInformation json data error!");
            return null;
        }
    }

    private boolean i(int i) {
        if (this.f.containsKey(Integer.valueOf(i))) {
            return true;
        }
        j(i);
        String strE = SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageModuleData" + i);
        try {
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "showCachedData() mPageModuleCached is empty.");
            } else {
                JSONArray jSONArray = new JSONArray(strE);
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(10);
                for (int i2 = 0; i2 < length; i2++) {
                    dlo dloVarC = c(jSONArray.getJSONObject(i2), i);
                    if (dloVarC != null && !arrayList.contains(dloVarC)) {
                        arrayList.add(dloVarC);
                    }
                }
                if (njy.b(arrayList)) {
                    this.f.put(Integer.valueOf(i), arrayList);
                    return true;
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "initPageModuleMemoryCached resolve page module data exception.");
        }
        return false;
    }

    private boolean h(int i) {
        if (this.e.containsKey(Integer.valueOf(i))) {
            return true;
        }
        j(i);
        String strE = SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageActivitiesData" + i);
        try {
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "showCachedData() mPageActivityCached is empty.");
            } else {
                JSONArray jSONArray = new JSONArray(strE);
                ArrayList arrayList = new ArrayList(10);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    trb trbVarC = c(jSONArray.getJSONObject(i2));
                    if (trbVarC != null && !arrayList.contains(trbVarC)) {
                        arrayList.add(trbVarC);
                    }
                }
                if (njy.b(arrayList)) {
                    this.e.put(Integer.valueOf(i), arrayList);
                    return true;
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "initActivityMemoryCached resolve page module data exception.");
        }
        return false;
    }

    private void e(List<String> list, final ResultCallback<String> resultCallback) {
        if (njy.e(list)) {
            LogUtil.j("TemplatePage_ConfiguredPageInteraction", "requestPageActivityCloudData() huaweiActivityIdList is empty.");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        final JSONObject jSONObjectD = d(jSONArray);
        GRSManager.c(this.f52317a).d("activityUrl", new GrsQueryCallback() { // from class: wpp.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a("TemplatePage_ConfiguredPageInteraction", "requestPageActivityCloudData() GRSManager onCallBackSuccess ACTIVITY_KEY.");
                lqb.a(str + "/activity/getActivityInfoByIds", jSONObjectD, resultCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "requestPageActivityCloudData() GRSManager onCallBackFail() errorCode = ", Integer.valueOf(i));
            }
        });
    }

    private JSONObject d(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject(new ActivityInfoListFactory(BaseApplication.getContext()).getBody(null));
        try {
            jSONObject.put("activityIdList", jSONArray);
        } catch (JSONException unused) {
            LogUtil.e("TemplatePage_ConfiguredPageInteraction", "getActivityParams exception");
        }
        LogUtil.d("TemplatePage_ConfiguredPageInteraction", "getActivityParams() activityParams = ", jSONObject.toString());
        return jSONObject;
    }

    private void c(int i, final HttpResCallback httpResCallback) {
        final HashMap<String, String> mapD = d();
        mapD.put(CommonUtil.PAGE_TYPE, String.valueOf(i));
        LogUtil.a("TemplatePage_ConfiguredPageInteraction", "requestPageModuleCloudData() params = ", mapD.toString());
        final HashMap<String, String> mapB = b();
        GRSManager.c(this.f52317a).d("messageCenterUrl", new GrsQueryCallback() { // from class: wpp.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a("TemplatePage_ConfiguredPageInteraction", "requestPageModuleCloudData() GRSManager onCallBackSuccess URL_PAGE_MODULE.");
                ltg.c(str + "/messageCenter/getPageModule" + CommonUtil.getUrlSuffix(), mapD, mapB, httpResCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.j("TemplatePage_ConfiguredPageInteraction", "requestPageModuleCloudData() GRSManager onCallBackFail() errorCode = ", Integer.valueOf(i2));
            }
        });
    }

    private HashMap<String, String> b() {
        HashMap<String, String> map = new HashMap<>(16);
        map.put("x-huid", LoginInit.getInstance(this.f52317a).getAccountInfo(1011));
        map.put("x-version", health.compact.a.CommonUtil.c(this.f52317a));
        return map;
    }

    private HashMap<String, String> d() {
        HashMap<String, String> map = new HashMap<>(16);
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("phoneType", PhoneInfoUtils.getHuaweiManufaturerOrEmui());
        String deviceId = LoginInit.getInstance(this.f52317a).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("bindDeviceType", String.valueOf(health.compact.a.CommonUtil.h(this.f52317a)));
        map.put("wearType", "");
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", String.valueOf(1));
        String accountInfo = LoginInit.getInstance(this.f52317a).getAccountInfo(1010);
        map.put("countryCode", accountInfo);
        map.put("language", pjn.b(null));
        map.put("ts", String.valueOf(tre.j()));
        String accountInfo2 = LoginInit.getInstance(this.f52317a).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo2)) {
            try {
                map.put("token", URLEncoder.encode(accountInfo2, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("TemplatePage_ConfiguredPageInteraction", "token encode Exception ", e.toString());
            }
        }
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("upDeviceType", LoginInit.getInstance(this.f52317a).getDeviceType());
        if (LoginInit.getInstance(this.f52317a).isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", BaseApplication.getAppPackage());
        }
        boolean zIsOperation = OperationUtils.isOperation(accountInfo);
        String accountInfo3 = LoginInit.getInstance(this.f52317a).getAccountInfo(1009);
        if (Utils.o() && zIsOperation) {
            map.put("siteId", accountInfo3);
        }
        map.put("currentManufacturer", Build.MANUFACTURER);
        return map;
    }

    private void j(int i) {
        if (this.f52318c) {
            this.f52318c = false;
            String accountInfo = LoginInit.getInstance(this.f52317a).getAccountInfo(1010);
            String strE = SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageLastLoginCountryCode");
            if (TextUtils.isEmpty(strE) || !strE.equals(accountInfo)) {
                SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageLastLoginCountryCode", accountInfo, new StorageParams(1));
                b(i);
                return;
            }
            String accountInfo2 = LoginInit.getInstance(this.f52317a).getAccountInfo(1011);
            String strE2 = SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageLastLoginUserId");
            if (TextUtils.isEmpty(strE2) || !strE2.equals(accountInfo2)) {
                SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageLastLoginUserId", accountInfo2, new StorageParams(1));
                b(i);
            }
        }
    }

    public void b(int i) {
        SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageModuleData" + i, "", new StorageParams());
        SharedPreferenceManager.e(this.f52317a, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "templatePageActivitiesData" + i, "", new StorageParams());
    }

    public void e() {
        ConcurrentHashMap<Integer, List<dlo>> concurrentHashMap = this.f;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        ConcurrentHashMap<Integer, List<trb>> concurrentHashMap2 = this.e;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
    }
}
