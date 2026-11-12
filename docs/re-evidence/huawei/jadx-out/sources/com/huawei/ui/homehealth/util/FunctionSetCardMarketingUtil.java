package com.huawei.ui.homehealth.util;

import android.content.Context;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cct;
import defpackage.ltg;
import defpackage.njy;
import defpackage.trd;
import defpackage.vdo;
import health.compact.a.GRSManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardMarketingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<FunctionSetCardMarketingUtil> f26161b;

    public FunctionSetCardMarketingUtil(Context context) {
        this.f26160a = context;
        if (this.f26161b == null) {
            this.f26161b = new WeakReference<>(this);
        }
    }

    public void d(final HttpResCallback httpResCallback) {
        final HashMap<String, String> mapC = trd.c();
        final HashMap<String, String> mapD = trd.d();
        GRSManager.c(BaseApplication.getContext()).d("healthRecommendUrl", new GrsQueryCallback() { // from class: com.huawei.ui.homehealth.util.FunctionSetCardMarketingUtil.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a("FunctionSetCardMarketingUtil", "requestFavoritesCloudData onCallBackSuccess");
                String str2 = str + "/dataRecommend/privacy/userPrivacySort" + CommonUtil.getUrlSuffix();
                LogUtil.a("FunctionSetCardMarketingUtil", "url: ", str2);
                LogUtil.a("FunctionSetCardMarketingUtil", "params: ", mapC.toString());
                LogUtil.a("FunctionSetCardMarketingUtil", "headers: ", mapD.toString());
                ltg.c(str2, mapC, mapD, httpResCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("FunctionSetCardMarketingUtil", "requestFavoritesCloudData grs get url errorCode ", Integer.valueOf(i));
            }
        });
    }

    public JSONObject a(Object obj) {
        if (!(obj instanceof List)) {
            LogUtil.a("FunctionSetCardMarketingUtil", "not list");
            return null;
        }
        List list = (List) obj;
        if (list == null || list.size() == 0) {
            LogUtil.a("FunctionSetCardMarketingUtil", "list is null");
            return null;
        }
        Object obj2 = list.get(0);
        if (!(obj2 instanceof HiSampleConfig)) {
            LogUtil.a("FunctionSetCardMarketingUtil", "HiSampleConfig is null");
            return null;
        }
        String configData = ((HiSampleConfig) obj2).getConfigData();
        LogUtil.a("FunctionSetCardMarketingUtil", "data: ", configData);
        try {
            return new JSONObject(configData);
        } catch (JSONException unused) {
            LogUtil.a("FunctionSetCardMarketingUtil", "JSONException");
            return null;
        }
    }

    public void a(LinkedList<CardConfig> linkedList, ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("FunctionSetCardMarketingUtil", "objectResponseCallback is null");
            return;
        }
        if (njy.e(linkedList)) {
            responseCallback.onResponse(-1, linkedList);
            return;
        }
        LinkedList linkedList2 = new LinkedList(linkedList);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < linkedList2.size(); i++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cardId", ((CardConfig) linkedList2.get(i)).getCardId());
                jSONObject2.put("showFlag", ((CardConfig) linkedList2.get(i)).isShow() ? "1" : "0");
                jSONObject2.put("isEdit", ((CardConfig) linkedList2.get(i)).getEditFlag());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("userCardOrders", jSONArray);
        } catch (JSONException unused) {
            LogUtil.a("FunctionSetCardMarketingUtil", "JSONException");
        }
        LogUtil.a("FunctionSetCardMarketingUtil", "uploadConfig userOrders:", jSONObject.toString());
        String string = jSONObject.toString();
        Objects.requireNonNull(responseCallback);
        vdo.e("900100010", string, new cct(responseCallback));
    }

    public void e(boolean z, ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("FunctionSetCardMarketingUtil", "uploadRecommendSwitch objectResponseCallback is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("recommendOrderFlag", z ? 1 : 0);
        } catch (JSONException unused) {
            LogUtil.a("FunctionSetCardMarketingUtil", "JSONException");
        }
        String string = jSONObject.toString();
        Objects.requireNonNull(responseCallback);
        vdo.e("900100011", string, new cct(responseCallback));
    }

    public void a(HiDataReadResultListener hiDataReadResultListener) {
        if (hiDataReadResultListener == null) {
            LogUtil.j("FunctionSetCardMarketingUtil", "getUserRecommendSwitch callback is null");
        } else {
            vdo.a("900100011", hiDataReadResultListener);
        }
    }

    public void c(HiDataReadResultListener hiDataReadResultListener) {
        if (hiDataReadResultListener == null) {
            LogUtil.j("FunctionSetCardMarketingUtil", "getUserConfig callback is null");
        } else {
            vdo.a("900100010", hiDataReadResultListener);
        }
    }
}
