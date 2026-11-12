package com.huami.discovery.bridge.jsbridge;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.facebook.internal.ServerProtocol;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.JsBridgeApi;
import com.huami.discovery.bridge.jsbridge.api.callback.VerifiedCallback;
import com.huami.discovery.bridge.jsbridge.handler.InternalPushNoticeHandler;
import com.huami.discovery.bridge.jsbridge.share.FunctionBtnAnalyzeUtil;
import com.huami.discovery.bridge.jsbridge.share.ShareAnalyzeUtil;
import com.huami.discovery.bridge.jsbridge.util.IOUtil;
import com.huami.discovery.bridge.model.JsCashierReq;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class JsBridgeNativeAPI implements VerifiedCallback {
    private static final String FUNC_ALIPAY_PAY = "alipay";
    private static final String FUNC_GET_STATUS_BAR_HEIGHT = "getStatusBarHeight";
    private static final String FUNC_PUSH_BOLT_NOTICE = "pushBoltNotice";
    private static final String FUNC_PUSH_DEVICE_CUSTOM_NOTICE = "pushDeviceCustomNotice";
    private static final String FUNC_PUSH_NOTICE = "pushNotice";
    private static final String FUNC_SHARE = "share";
    private static final String FUNC_THIRD_MONITOR = "thirdMonitor";
    public static final String FUNC_VERIFY_JSAPI = "preVerifyJsApi";
    private static final String FUNC_WEBVIEW_EXIT = "exit";
    public static final String INVOKE_SUCCESS = "{\"status\":\"success\"}";
    public static final String INVOKE_SUCCESS_NEW = "{\"message\":\"success\"}";
    private static final String REQ_VERIFY_URL = "jsbridge/verify";
    private static final String TAG = "JsBridgeNativeAPI";
    private Context mContext;
    private JsBridgeApi mJsBridgeApi;
    private JsBridgeCallback mJsListener;
    private JsBridgeWebView mWebView;
    private static Map<String, JsCallBackFunction> mFunctionMap = new HashMap();
    private static final String FUNC_SET_TITLE_VISIBLE = "setTitleVisibility";
    private static final String FUNC_SET_TITLE_BG_COLOR = "setTitleBgColor";
    private static final String FUNC_SET_TITLE_FG_COLOR = "setTitleFgColor";
    private static final String FUNC_NAVIGATE_TO = "navigateTo";
    private static final String FUNC_OPEN_EXTERNAL_APP = "openExternalApp";
    private static final String FUNC_CHECK_APP_INSTALL = "checkAppInstall";
    private static final String FUNC_OPEN_IN_BROWSER = "openInBrowser";
    private static final String FUNC_GET_LOCATION = "getLocation";
    private static final String FUNC_GET_USER_TOKEN = "getUserToken";
    private static final String FUNC_GET_USERS_INFO = "getUsersInfo";
    private static final String FUNC_SET_RIGHT_BTNS = "setFunctionButtons";
    private static final String FUNC_BTN_CLICK_EVENT = "functionButtonsEvent";
    private static final String FUNC_WEIXIN_PAY = "weixinPay";
    private static final String FUNC_PUSH_SYSTEM_NOTICE = "pushSystemNotice";
    private static final String FUNC_PUSH_DEVICE_NOTICE = "pushDeviceNotice";
    private static final String FUNC_SET_CANCEL_AUTH = "setCancelAuth";
    private static final String FUNC_SYNC_WATCH_SKIN = "syncWatchSkin";
    private static final String FUNC_GET_DEVICES_INFO = "getDevicesInfo";
    private static final String FUNC_GET_SMART_DEVICES = "getSmartDevices";
    private static final String FUNC_LAUNCH_CASHIER_DESK = "launchCashierDesk";
    private static final String[] FUNC_LIST = {FUNC_SET_TITLE_VISIBLE, FUNC_SET_TITLE_BG_COLOR, FUNC_SET_TITLE_FG_COLOR, "exit", FUNC_NAVIGATE_TO, FUNC_OPEN_EXTERNAL_APP, FUNC_CHECK_APP_INSTALL, FUNC_OPEN_IN_BROWSER, FUNC_GET_LOCATION, FUNC_GET_USER_TOKEN, FUNC_GET_USERS_INFO, "share", FUNC_SET_RIGHT_BTNS, FUNC_BTN_CLICK_EVENT, FUNC_WEIXIN_PAY, FUNC_PUSH_SYSTEM_NOTICE, FUNC_PUSH_DEVICE_NOTICE, FUNC_SET_CANCEL_AUTH, FUNC_SYNC_WATCH_SKIN, FUNC_GET_DEVICES_INFO, FUNC_GET_SMART_DEVICES, FUNC_LAUNCH_CASHIER_DESK};

    public class a implements JsBridgeHandler {
        public a() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            boolean z = false;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("protocol")) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.missParamError("protocol")));
                    return;
                }
                if (!jSONObject.has("behavior")) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.missParamError("behavior")));
                    return;
                }
                JsBridgeNativeAPI.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jSONObject.getString("protocol") + "://" + jSONObject.getString("behavior"))));
                z = true;
                if (z) {
                    jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
                }
            } catch (ActivityNotFoundException unused) {
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4040701L, new String[0])));
            } catch (JSONException e) {
                e.printStackTrace();
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
            }
        }
    }

    public class a0 implements JsBridgeHandler {
        public a0() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("position");
                String strOptString2 = jSONObject.optString("data");
                String strOptString3 = jSONObject.optString("fallbackEvent");
                HMLog.i(JsBridgeNativeAPI.TAG, "way=" + strOptString + " ,afterOut=" + strOptString3, new Object[0]);
                if (("login".equals(strOptString) || "discovery".equals(strOptString) || "status".equals(strOptString) || "mine".equals(strOptString) || "smartplay".equals(strOptString)) && !"exit".equals(strOptString3)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4040603L, strOptString, strOptString3)));
                    return;
                }
                if (!"exit".equals(strOptString3) && !"keep".equals(strOptString3) && !"refresh".equals(strOptString3)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4040602L, strOptString3)));
                    return;
                }
                if (JsBridgeNativeAPI.this.mJsBridgeApi != null && !JsBridgeNativeAPI.this.mJsBridgeApi.navigateTo(JsBridgeNativeAPI.this.mContext, strOptString, strOptString2)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4040601L, strOptString)));
                }
                if ("exit".equals(strOptString3)) {
                    if (JsBridgeNativeAPI.this.mJsListener != null) {
                        JsBridgeNativeAPI.this.mJsListener.onFinishActivity();
                    }
                } else if ("keep".equals(strOptString3)) {
                    HMLog.i(JsBridgeNativeAPI.TAG, "webView out keep", new Object[0]);
                } else if ("refresh".equals(strOptString3)) {
                    JsBridgeNativeAPI.this.mJsListener.setIsRefresh(true);
                }
                jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
            } catch (JSONException e) {
                e.printStackTrace();
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
            }
        }
    }

    public class b implements JsBridgeHandler {
        public b() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            String str2;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("packageName");
                if (!jSONObject.has("packageName")) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.missParamError("packageName")));
                    return;
                }
                if (TextUtils.isEmpty(strOptString)) {
                    jsCallBackFunction.onCallBack("{installed:false}");
                    return;
                }
                boolean z = true;
                try {
                    str2 = JsBridgeNativeAPI.this.mContext.getPackageManager().getPackageInfo(strOptString, 1).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    z = false;
                    str2 = "";
                }
                jsCallBackFunction.onCallBack("{installed:" + z + ", version:\"" + str2 + "\"}");
            } catch (JSONException e2) {
                e2.printStackTrace();
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
            }
        }
    }

    public class c implements JsBridgeHandler {
        public c() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("url")) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.missParamError("url")));
                    return;
                }
                String strOptString = jSONObject.optString("url");
                if (!IOUtil.isValidUrl(strOptString) && !IOUtil.isMarketUrl(strOptString)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4010401L, new String[0])));
                } else {
                    JsBridgeNativeAPI.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)));
                    jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
                }
            } catch (JSONException e) {
                e.printStackTrace();
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
            }
        }
    }

    public class d implements JsBridgeHandler {
        public d() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            ShareAnalyzeUtil.JSShareStruct jSShareStructAnalyzeShareCode = ShareAnalyzeUtil.analyzeShareCode(str);
            if (jSShareStructAnalyzeShareCode.jsBridgeError == null) {
                JsBridgeNativeAPI.this.initShareUI(jSShareStructAnalyzeShareCode);
                jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
            } else {
                String json = IOUtil.getGson().toJson(jSShareStructAnalyzeShareCode.jsBridgeError);
                jsCallBackFunction.onCallBack(json);
                Toast.makeText(JsBridgeNativeAPI.this.mContext, json, 0).show();
            }
        }
    }

    public class e implements JsBridgeHandler {

        public class a implements View.OnClickListener {
            public final /* synthetic */ String a;

            public a(String str) {
                this.a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(this.a)) {
                    Toast.makeText(JsBridgeNativeAPI.this.mContext, "Couldn't restrict permissions", 1).show();
                    return;
                }
                if (JsBridgeNativeAPI.this.mJsListener != null) {
                    JsBridgeNativeAPI.this.mJsListener.loadPage(this.a);
                }
                Analytics.event(JsBridgeNativeAPI.this.mContext, StatEvent.DISCOVERY_SERVICE_DEAUTH_VIEW);
            }
        }

        public e() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.optBoolean(ServerProtocol.DIALOG_PARAM_DISPLAY)) {
                    if (JsBridgeNativeAPI.this.mJsListener == null) {
                        jsCallBackFunction.onCallBack(JsBridgeNativeAPI.this.getErrorCallback("app not handle this action"));
                        return;
                    } else {
                        JsBridgeNativeAPI.this.mJsListener.showCancelAuthButton(false, null);
                        jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
                        return;
                    }
                }
                String strOptString = jSONObject.optString("url");
                if (!IOUtil.isValidUrl(strOptString)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4010401L, strOptString)));
                } else if (JsBridgeNativeAPI.this.mJsListener == null) {
                    jsCallBackFunction.onCallBack(JsBridgeNativeAPI.this.getErrorCallback("app not handle this action"));
                } else {
                    JsBridgeNativeAPI.this.mJsListener.showCancelAuthButton(true, new a(strOptString));
                    jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
                }
            } catch (JSONException e) {
                e.printStackTrace();
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
            }
        }
    }

    public class f implements JsBridgeHandler {
        public f() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.syncWatchSkin(str, jsCallBackFunction);
            }
        }
    }

    public class g implements JsBridgeHandler {

        public class a implements View.OnClickListener {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ FunctionBtnAnalyzeUtil.JSBtnItem b;

            public a(boolean z, FunctionBtnAnalyzeUtil.JSBtnItem jSBtnItem) {
                this.a = z;
                this.b = jSBtnItem;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.a && this.b.shareStruct == null) {
                    String title = JsBridgeNativeAPI.this.mWebView.getTitle();
                    String url = JsBridgeNativeAPI.this.mWebView.getUrl();
                    String url2 = JsBridgeNativeAPI.this.mWebView.getUrl();
                    this.b.shareStruct = new ShareAnalyzeUtil.JSShareStruct();
                    this.b.shareStruct.setDefaultShareItem("card", title, url, url2);
                }
                JsBridgeNativeAPI.this.initMoreBtnUI(this.a ? this.b.shareStruct : null);
            }
        }

        public g() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            FunctionBtnAnalyzeUtil.FunctionBtnStruct functionBtnStructAnalyzeFuncBtnCode = FunctionBtnAnalyzeUtil.analyzeFuncBtnCode(str);
            if (functionBtnStructAnalyzeFuncBtnCode.jsBridgeError != null) {
                String json = IOUtil.getGson().toJson(functionBtnStructAnalyzeFuncBtnCode.jsBridgeError);
                jsCallBackFunction.onCallBack(json);
                Toast.makeText(JsBridgeNativeAPI.this.mContext, json, 0).show();
                return;
            }
            FunctionBtnAnalyzeUtil.JSBtnItem jSBtnItem = functionBtnStructAnalyzeFuncBtnCode.btnItemMap.get("refresh");
            FunctionBtnAnalyzeUtil.JSBtnItem jSBtnItem2 = functionBtnStructAnalyzeFuncBtnCode.btnItemMap.get("share");
            boolean z = jSBtnItem != null && jSBtnItem.display;
            boolean z2 = jSBtnItem2 != null && jSBtnItem2.display;
            new HashMap().put("refresh", Boolean.valueOf(z));
            if (JsBridgeNativeAPI.this.mJsListener != null) {
                JsBridgeNativeAPI.this.mJsListener.setFunctionButtonVisible(z2 || z, new a(z2, jSBtnItem2));
            }
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        }
    }

    public class h implements JsBridgeHandler {
        public h() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
        }
    }

    public class i implements JsBridgeHandler {
        public i() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.getUsersInfo(str, jsCallBackFunction);
            }
        }
    }

    public class j implements JsBridgeHandler {
        public j() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.getLocation(str, jsCallBackFunction);
            }
        }
    }

    public class k implements JsBridgeHandler {
        public k() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                HMLog.d(JsBridgeNativeAPI.TAG, "preVerifyJsApi handler():data=" + str, new Object[0]);
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString(com.alipay.sdk.m.s.a.p);
                String strOptString2 = jSONObject.optString("timestamp");
                String strOptString3 = jSONObject.optString("nonceStr");
                String strOptString4 = jSONObject.optString("signature");
                if (TextUtils.isEmpty(strOptString)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.missParamError(com.alipay.sdk.m.s.a.p)));
                    return;
                }
                if (TextUtils.isEmpty(strOptString2)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.missParamError("timestamp")));
                    return;
                }
                if (TextUtils.isEmpty(strOptString3)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.missParamError("nonceStr")));
                    return;
                }
                if (TextUtils.isEmpty(strOptString4)) {
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.missParamError("signature")));
                    return;
                }
                JsBridgeNativeAPI.this.mWebView.clearHandlers();
                StringBuilder sb = new StringBuilder();
                if (jSONObject.has("jsApiList")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("jsApiList");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        sb.append(jSONArray.getString(i));
                        sb.append(",");
                    }
                    sb = new StringBuilder(sb.substring(0, sb.length() - 1));
                }
                String cleanUrl = JsBridgeUtil.getCleanUrl(JsBridgeNativeAPI.this.mWebView.getUrl());
                Map<String, String> map = new HashMap<>();
                map.put(com.alipay.sdk.m.s.a.p, strOptString);
                map.put("timestamp", strOptString2);
                map.put("nonceStr", strOptString3);
                map.put("signature", strOptString4);
                if (!TextUtils.isEmpty(sb.toString())) {
                    map.put("jsApiList", sb.toString());
                }
                map.put("url", cleanUrl);
                for (String str2 : map.keySet()) {
                    HMLog.i(JsBridgeNativeAPI.TAG, "key=" + str2 + ",value=" + map.get(str2), new Object[0]);
                }
                if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                    JsBridgeNativeAPI.this.mJsBridgeApi.requestToVerify(map, jsCallBackFunction, JsBridgeNativeAPI.this);
                }
            } catch (JSONException e) {
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
                e.printStackTrace();
                HMLog.e(JsBridgeNativeAPI.TAG, "preVerifyJsApi param to json error", new Object[0]);
            }
        }
    }

    public class l implements JsBridgeHandler {
        public l() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.weixinPay(str, jsCallBackFunction);
            }
            JsBridgeNativeAPI.mFunctionMap.put(JsBridgeNativeAPI.FUNC_WEIXIN_PAY, jsCallBackFunction);
        }
    }

    public class m implements JsBridgeHandler {
        public m() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                jsCallBackFunction.onCallBack(JsBridgeNativeAPI.this.mJsBridgeApi.getDevicesInfo());
            }
        }
    }

    public class n implements JsBridgeHandler {
        public n() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("adid");
                boolean z = jSONObject.getBoolean("onlyShow");
                String strOptString = jSONObject.optString("json");
                if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                    JsBridgeNativeAPI.this.mJsBridgeApi.thirdMonitor(string, z, strOptString);
                } else {
                    HMLog.e(JsBridgeNativeAPI.TAG, "thirdMonitor need mJsBridgeApi", new Object[0]);
                }
            } catch (Exception e) {
                e.printStackTrace();
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
                HMLog.e(JsBridgeNativeAPI.TAG, "thirdMonitor param to json error", new Object[0]);
            }
        }
    }

    public class o implements JsBridgeHandler {
        public o() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("devices");
                int iOptInt = jSONObject.optInt("status", -1);
                int[] iArr = null;
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    iArr = new int[jSONArrayOptJSONArray.length()];
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        iArr[i] = jSONArrayOptJSONArray.getInt(i);
                    }
                }
                if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                    jsCallBackFunction.onCallBack(JsBridgeNativeAPI.this.mJsBridgeApi.getSmartDevices(iArr, iOptInt));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
                HMLog.e(JsBridgeNativeAPI.TAG, "getSmartDevices param to json error", new Object[0]);
            }
        }
    }

    public class p implements JsBridgeHandler {
        public p() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.pushDeviceCustomNotice(str, jsCallBackFunction);
            }
        }
    }

    public class q implements JsBridgeHandler {
        public q() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.pushBoltNotice(str, jsCallBackFunction);
            }
        }
    }

    public class r implements JsBridgeHandler {
        public r() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.getStatusBarHeight(str, jsCallBackFunction);
            }
        }
    }

    public class s implements JsBridgeHandler {
        public s() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            new InternalPushNoticeHandler(JsBridgeNativeAPI.this.mContext).handle(str, jsCallBackFunction);
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.pushNotice(str, jsCallBackFunction);
            }
        }
    }

    public class t implements JsBridgeHandler {
        public t() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.pushSystemNotice(str, jsCallBackFunction);
            }
        }
    }

    public class u implements JsBridgeHandler {
        public u() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.pushDeviceNotice(str, jsCallBackFunction);
            }
        }
    }

    public class v implements JsBridgeHandler {
        public v() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("r", -1);
                int iOptInt2 = jSONObject.optInt("g", -1);
                int iOptInt3 = jSONObject.optInt("b", -1);
                float fOptDouble = (float) jSONObject.optDouble("a", -1.0d);
                if (iOptInt >= 0 && iOptInt <= 255 && iOptInt2 >= 0 && iOptInt2 <= 255 && iOptInt3 >= 0 && iOptInt3 <= 255) {
                    if (fOptDouble <= 1.0f && fOptDouble >= 0.0f) {
                        int iArgb = Color.argb((int) (fOptDouble * 255.0f), iOptInt, iOptInt2, iOptInt3);
                        if (JsBridgeNativeAPI.this.mJsListener != null) {
                            JsBridgeNativeAPI.this.mJsListener.setTitleBarBackgroundColor(iArgb);
                        }
                        jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
                        return;
                    }
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4020202L, new String[0])));
                    return;
                }
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4020201L, new String[0])));
            } catch (JSONException e) {
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
                e.printStackTrace();
                HMLog.e(JsBridgeNativeAPI.TAG, "setTitleBgColor param to json error", new Object[0]);
            }
        }
    }

    public class w implements JsBridgeHandler {
        public w() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("r", -1);
                int iOptInt2 = jSONObject.optInt("g", -1);
                int iOptInt3 = jSONObject.optInt("b", -1);
                float fOptDouble = (float) jSONObject.optDouble("a", -1.0d);
                if (iOptInt >= 0 && iOptInt <= 255 && iOptInt2 >= 0 && iOptInt2 <= 255 && iOptInt3 >= 0 && iOptInt3 <= 255) {
                    if (fOptDouble <= 1.0f && fOptDouble >= 0.0f) {
                        int iArgb = Color.argb((int) (fOptDouble * 255.0f), iOptInt, iOptInt2, iOptInt3);
                        if (JsBridgeNativeAPI.this.mJsListener != null) {
                            JsBridgeNativeAPI.this.mJsListener.setTitleFgColor(iArgb);
                        }
                        jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
                        return;
                    }
                    jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4020202L, new String[0])));
                    return;
                }
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4020201L, new String[0])));
            } catch (JSONException e) {
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
                e.printStackTrace();
                HMLog.e(JsBridgeNativeAPI.TAG, "setTitleFgColor param to json error", new Object[0]);
            }
        }
    }

    public class x implements JsBridgeHandler {
        public x() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            try {
                boolean z = new JSONObject(str).getBoolean(ServerProtocol.DIALOG_PARAM_DISPLAY);
                if (JsBridgeNativeAPI.this.mJsListener != null) {
                    JsBridgeNativeAPI.this.mJsListener.setTitleVisibility(z);
                }
                jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
            } catch (JSONException e) {
                e.printStackTrace();
                jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
                HMLog.e(JsBridgeNativeAPI.TAG, "setTitleVisibility param to json error", new Object[0]);
            }
        }
    }

    public class y implements JsBridgeHandler {
        public y() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsBridgeApi != null) {
                JsBridgeNativeAPI.this.mJsBridgeApi.getUserToken(str, jsCallBackFunction);
            }
        }
    }

    public class z implements JsBridgeHandler {
        public z() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
        public void handler(String str, JsCallBackFunction jsCallBackFunction) {
            if (JsBridgeNativeAPI.this.mJsListener != null) {
                JsBridgeNativeAPI.this.mJsListener.onFinishActivity();
            }
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        }
    }

    public JsBridgeNativeAPI(Context context, JsBridgeWebView jsBridgeWebView) {
        this.mContext = context;
        this.mWebView = jsBridgeWebView;
    }

    private void alipay() {
        this.mWebView.registerHandler("alipay", new JsBridgeHandler() { // from class: oj4
            @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
            public final void handler(String str, JsCallBackFunction jsCallBackFunction) {
                this.a.lambda$alipay$1(str, jsCallBackFunction);
            }
        });
    }

    private void checkAppInstall() {
        this.mWebView.registerHandler(FUNC_CHECK_APP_INSTALL, new b());
    }

    private void exit() {
        this.mWebView.registerHandler("exit", new z());
    }

    private void functionButtonsEvent() {
        this.mWebView.registerHandler(FUNC_BTN_CLICK_EVENT, new h());
    }

    private List<String> getAllApiList() {
        return Arrays.asList(FUNC_LIST);
    }

    private void getDevicesInfo() {
        this.mWebView.registerHandler(FUNC_GET_DEVICES_INFO, new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getErrorCallback(String str) {
        return IOUtil.getGson().toJson(new JsBridgeError(4010401L, str));
    }

    private void getLocation() {
        HMLog.i(TAG, "register getLocation:", new Object[0]);
        this.mWebView.registerHandler(FUNC_GET_LOCATION, new j());
    }

    private void getSmartDevices() {
        this.mWebView.registerHandler(FUNC_GET_SMART_DEVICES, new o());
    }

    private void getStatusBarHeight() {
        this.mWebView.registerHandler(FUNC_GET_STATUS_BAR_HEIGHT, new r());
    }

    private void getUserToken() {
        HMLog.i(TAG, "register token-->>>getUserToken", new Object[0]);
        this.mWebView.registerHandler(FUNC_GET_USER_TOKEN, new y());
    }

    private void getUsersInfo() {
        this.mWebView.registerHandler(FUNC_GET_USERS_INFO, new i());
    }

    private boolean handleResponse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("code") != 1) {
                HMLog.i(TAG, "verify no permission", new Object[0]);
                return false;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("jsApiList");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    String string = jSONArrayOptJSONArray.getString(i2);
                    HMLog.i(TAG, "verify:" + string, new Object[0]);
                    arrayList.add(string);
                }
                registerNativeApi(arrayList);
            }
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void handleWechatPayCallback(int i2) {
        String str;
        if (i2 == 0) {
            str = "{\"status\":\"success\"}";
        } else {
            str = "{\"errorCode\":\"" + i2 + "\",\"errorMessage\":\"\"}";
        }
        if (mFunctionMap.containsKey(FUNC_WEIXIN_PAY)) {
            mFunctionMap.get(FUNC_WEIXIN_PAY).onCallBack(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMoreBtnUI(ShareAnalyzeUtil.JSShareStruct jSShareStruct) {
        JsBridgeCallback jsBridgeCallback = this.mJsListener;
        if (jsBridgeCallback != null) {
            jsBridgeCallback.onShowFunctionSheet(jSShareStruct, this.mWebView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initShareUI(ShareAnalyzeUtil.JSShareStruct jSShareStruct) {
        JsBridgeCallback jsBridgeCallback = this.mJsListener;
        if (jsBridgeCallback != null) {
            jsBridgeCallback.onShowShareDialog(jSShareStruct, this.mWebView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$alipay$1(String str, JsCallBackFunction jsCallBackFunction) {
        JsBridgeCallback jsBridgeCallback = this.mJsListener;
        if (jsBridgeCallback != null) {
            jsBridgeCallback.aliPay(str, jsCallBackFunction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$launchCashierDesk$0(String str, JsCallBackFunction jsCallBackFunction) {
        HMLog.i(TAG, "FUNC_LAUNCH_INTEGRATED_CASHIER_DESK:" + str, new Object[0]);
        try {
            JsCashierReq jsCashierReq = (JsCashierReq) IOUtil.getGson().fromJson(str, JsCashierReq.class);
            JsBridgeCallback jsBridgeCallback = this.mJsListener;
            if (jsBridgeCallback != null) {
                jsBridgeCallback.onShowCashierDesk(jsCashierReq, jsCallBackFunction);
            }
        } catch (Exception unused) {
            jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(JsBridgeError.jsonParseError()));
        }
    }

    private void launchCashierDesk() {
        this.mWebView.registerHandler(FUNC_LAUNCH_CASHIER_DESK, new JsBridgeHandler() { // from class: nj4
            @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
            public final void handler(String str, JsCallBackFunction jsCallBackFunction) {
                this.a.lambda$launchCashierDesk$0(str, jsCallBackFunction);
            }
        });
    }

    private void navigateTo() {
        this.mWebView.registerHandler(FUNC_NAVIGATE_TO, new a0());
    }

    private void openExternalApp() {
        this.mWebView.registerHandler(FUNC_OPEN_EXTERNAL_APP, new a());
    }

    private void openInBrowser() {
        this.mWebView.registerHandler(FUNC_OPEN_IN_BROWSER, new c());
    }

    private void pushBoltNotice() {
        this.mWebView.registerHandler(FUNC_PUSH_BOLT_NOTICE, new q());
    }

    private void pushDeviceCustomNotice() {
        this.mWebView.registerHandler(FUNC_PUSH_DEVICE_CUSTOM_NOTICE, new p());
    }

    private void pushDeviceNotice() {
        this.mWebView.registerHandler(FUNC_PUSH_DEVICE_NOTICE, new u());
    }

    private void pushNotice() {
        this.mWebView.registerHandler(FUNC_PUSH_NOTICE, new s());
    }

    private void pushSystemNotice() {
        this.mWebView.registerHandler(FUNC_PUSH_SYSTEM_NOTICE, new t());
    }

    private void registerNativeApi(List<String> list) {
        for (String str : list) {
            try {
                getClass().getDeclaredMethod(str, new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e2) {
                HMLog.e(TAG, str + " name not defined !!", new Object[0]);
                e2.printStackTrace();
            }
        }
    }

    private void setCancelAuth() {
        this.mWebView.registerHandler(FUNC_SET_CANCEL_AUTH, new e());
    }

    private void setFunctionButtons() {
        this.mWebView.registerHandler(FUNC_SET_RIGHT_BTNS, new g());
    }

    private void setTitleBgColor() {
        this.mWebView.registerHandler(FUNC_SET_TITLE_BG_COLOR, new v());
    }

    private void setTitleFgColor() {
        this.mWebView.registerHandler(FUNC_SET_TITLE_FG_COLOR, new w());
    }

    private void setTitleVisibility() {
        this.mWebView.registerHandler(FUNC_SET_TITLE_VISIBLE, new x());
    }

    private void share() {
        HMLog.i(TAG, "--> register share ", new Object[0]);
        this.mWebView.registerHandler("share", new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startActivity(Intent intent) {
        intent.setFlags(268435456);
        this.mContext.startActivity(intent);
    }

    private void syncWatchSkin() {
        this.mWebView.registerHandler(FUNC_SYNC_WATCH_SKIN, new f());
    }

    private void thirdMonitor() {
        this.mWebView.registerHandler(FUNC_THIRD_MONITOR, new n());
    }

    private void weixinPay() {
        HMLog.i(TAG, "register weixinPay", new Object[0]);
        this.mWebView.registerHandler(FUNC_WEIXIN_PAY, new l());
    }

    public void preVerifyJsApi() {
        this.mWebView.clearHandlers();
        this.mWebView.registerHandler(FUNC_VERIFY_JSAPI, new k());
    }

    public void registerAllNativeApi() {
        registerNativeApi(getAllApiList());
    }

    public void setJsBridgeApi(JsBridgeApi jsBridgeApi) {
        this.mJsBridgeApi = jsBridgeApi;
    }

    public void setJsBridgeListener(JsBridgeCallback jsBridgeCallback) {
        this.mJsListener = jsBridgeCallback;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.callback.VerifiedCallback
    public void signed(boolean z2, String str, JsCallBackFunction jsCallBackFunction) {
        if (!z2) {
            jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4020101L, new String[0])));
        } else if (handleResponse(str)) {
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        } else {
            jsCallBackFunction.onCallBack(IOUtil.getGson().toJson(new JsBridgeError(4020101L, new String[0])));
        }
    }
}
