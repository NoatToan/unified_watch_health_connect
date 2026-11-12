package com.huawei.health.h5pro.jsbridge.system.analyzer;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.dfx.bi.AnalyzerObj;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.ui.commonui.base.BaseDialog;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class AnalyzerEntry extends JsBaseModule {
    private Analyzer d = new Analyzer();

    private JSONObject a(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            jSONObject.put(jSONObject2.getString("name"), jSONObject2.getString("value"));
        }
        return jSONObject;
    }

    private void a(long j, String str, boolean z) {
        H5ProInstance h5ProInstance;
        if (this.d == null || (h5ProInstance = this.mH5ProInstance) == null) {
            LogUtil.w(this.TAG, "analyzer or h5ProInstance is null");
            onFailureCallback(j, "report failed");
            return;
        }
        String url = h5ProInstance.getUrl();
        H5ProAppInfo appInfo = this.mH5ProInstance.getAppInfo();
        if (!H5ProTrustListChecker.isTrusted(appInfo, url)) {
            onFailureCallback(j, "authentication failed");
            return;
        }
        AnalyzerObj analyzerObj = (AnalyzerObj) GsonUtil.parseContainsMapJson(str, AnalyzerObj.class);
        if (analyzerObj == null) {
            onFailureCallback(j, "invalid param");
            return;
        }
        if (z) {
            this.d.resume(url, appInfo, analyzerObj);
        } else {
            this.d.pause(url, appInfo, analyzerObj);
        }
        onSuccessCallback(j, 0);
    }

    private void a(String str, JSONObject jSONObject, long j) {
        if (this.d == null) {
            LogUtil.w(this.TAG, "putBiEvent: analyzer is null");
            return;
        }
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        if (h5ProInstance != null && h5ProInstance.getAppInfo() != null) {
            this.d.setAppInfo(this.mH5ProInstance.getAppInfo());
        }
        this.d.putBiEvent(this.mContext, str, jSONObject);
        Locale locale = Locale.ENGLISH;
        onSuccessCallback(j, "bi report success, key = " + str);
    }

    @JavascriptInterface
    public void aiopsReport(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("msg");
            if (jSONArrayOptJSONArray == null) {
                onFailureCallback(j, "aiopsReport fail: param invalid");
                return;
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                linkedHashMap.put(jSONObject2.getString("name"), jSONObject2.getString("value"));
            }
            if (this.d == null) {
                LogUtil.w(this.TAG, "aiopsReport: analyzer is null");
                return;
            }
            String strOptString = jSONObject.optString(MedalConstants.EVENT_KEY);
            H5ProInstance h5ProInstance = this.mH5ProInstance;
            if (h5ProInstance != null && h5ProInstance.getAppInfo() != null) {
                this.d.setAppInfo(this.mH5ProInstance.getAppInfo());
            }
            this.d.putAiopsEvent(strOptString, linkedHashMap);
            Locale locale = Locale.ENGLISH;
            onSuccessCallback(j, "aiops report success, key = " + strOptString + ", msg = " + jSONArrayOptJSONArray.toString());
        } catch (JSONException unused) {
            onFailureCallback(j, "aiops report fail:param invalid");
        }
    }

    @JavascriptInterface
    public void biReport(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(MedalConstants.EVENT_KEY);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("msg");
            if (jSONArrayOptJSONArray != null) {
                a(strOptString, a(jSONArrayOptJSONArray), j);
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("msg");
            if (jSONObjectOptJSONObject != null) {
                a(strOptString, jSONObjectOptJSONObject, j);
            } else {
                onFailureCallback(j, "biReport fail: param invalid");
            }
        } catch (JSONException unused) {
            onFailureCallback(j, "biReport fail: param invalid");
        }
    }

    @JavascriptInterface
    public void biReportOnPageEnd(long j, String str) {
        LogUtil.i(this.TAG, "biReportOnPageEnd");
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        H5ProAppInfo appInfo = h5ProInstance == null ? null : h5ProInstance.getAppInfo();
        String pkgName = appInfo == null ? "" : appInfo.getPkgName();
        if (TextUtils.isEmpty(pkgName)) {
            onFailureCallback(j, "packageName is empty");
            return;
        }
        this.d.setAppInfo(appInfo);
        if (this.d.biReportOnPageEnd(pkgName, str)) {
            onSuccessCallback(j);
        } else {
            onFailureCallback(j, "no loading record is found");
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        this.d = null;
    }

    @JavascriptInterface
    public void onPause(long j, String str) {
        LogUtil.i(this.TAG, BaseDialog.LIFE_CYCLE_ON_PAUSE);
        a(j, str, false);
    }

    @JavascriptInterface
    public void onResume(long j, String str) {
        LogUtil.i(this.TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        a(j, str, true);
    }
}
