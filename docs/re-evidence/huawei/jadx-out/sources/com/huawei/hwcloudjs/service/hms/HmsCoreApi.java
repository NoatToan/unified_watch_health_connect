package com.huawei.hwcloudjs.service.hms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.api.HuaweiApiClientImpl;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.hwid.SignInResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager;
import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hwcloudjs.annotation.JSMethod;
import com.huawei.hwcloudjs.api.JsParam;
import com.huawei.hwcloudjs.core.JSRequest;
import com.huawei.hwcloudjs.core.JsCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HmsCoreApi extends JSRequest implements com.huawei.hwcloudjs.core.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17127b = "HmsCoreApi";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f17128c = 9001;
    private static final int d = 9002;
    private static final int e = 9005;

    @JSMethod(isOpen = true, name = "silentSignIn")
    public void silentSignIn(LoginReq loginReq, JsCallback jsCallback) {
        com.huawei.hwcloudjs.f.d.c(f17127b, "silentSignIn begin", true);
        WebView webView = jsCallback.getWebView();
        if (!a(loginReq, jsCallback, webView)) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "silentSignIn checkparam false", true);
            return;
        }
        if (!(webView.getContext() instanceof Activity)) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "webView is error", true);
            return;
        }
        try {
            Task<AuthHuaweiId> taskSilentSignIn = a(loginReq, (Activity) webView.getContext()).silentSignIn();
            if (taskSilentSignIn != null) {
                com.huawei.hwcloudjs.f.d.c(f17127b, "silentSignIn task is not null", true);
                if (taskSilentSignIn.isSuccessful()) {
                    a(taskSilentSignIn.getResult(), loginReq.needAuthCode, jsCallback);
                    return;
                } else {
                    taskSilentSignIn.addOnCompleteListener(new c(this, loginReq, jsCallback));
                    return;
                }
            }
            com.huawei.hwcloudjs.f.d.b(f17127b, "silentSignIn failed, task is null", true);
            jsCallback.failure("silentSignIn failed, task is null");
        } catch (ApiException unused) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "silentSignIn appid is not correct", true);
            jsCallback.failure("appid is not correct");
        }
    }

    @JSMethod(isOpen = true, name = "signOut")
    public void signOut(JsParam jsParam, JsCallback jsCallback) {
        com.huawei.hwcloudjs.f.d.c(f17127b, "signOut begin", true);
        String appId = jsParam.getAppId();
        String bridgeId = jsParam.getBridgeId();
        HuaweiIdAuthService huaweiIdAuthServiceA = r.a().a(bridgeId, appId);
        HuaweiApiClient huaweiApiClientB = r.a().b(bridgeId, appId);
        if (huaweiIdAuthServiceA == null && huaweiApiClientB == null) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "signOut failed, HuaweiIdAuthService is null", true);
            jsCallback.failure("signOut failed, please invoke signIn/getSignInIntent/silentSignIn first");
        } else if (huaweiIdAuthServiceA != null) {
            com.huawei.hwcloudjs.f.d.c(f17127b, "signOut service is not null", true);
            huaweiIdAuthServiceA.signOut().addOnCompleteListener(new f(this, jsCallback));
        } else {
            com.huawei.hwcloudjs.f.d.c(f17127b, "signOut service is null", true);
            HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService.signOut(huaweiApiClientB).setResultCallback(new g(this, jsCallback));
        }
    }

    @JSMethod(isOpen = true, name = "signIn")
    public void signIn(LoginReq loginReq, JsCallback jsCallback) {
        WebView webView = jsCallback.getWebView();
        boolean z = true;
        if (!a(loginReq, jsCallback, webView)) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "signIn checkparam false", true);
            return;
        }
        if (!(webView.getContext() instanceof Activity)) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "webView is error", true);
            jsCallback.failure("webView is error");
            return;
        }
        String appId = loginReq.getAppId();
        String bridgeId = loginReq.getBridgeId();
        List<Scope> listA = a(loginReq.scope);
        boolean zIsEmpty = listA.isEmpty();
        boolean z2 = loginReq.needAuthCode;
        try {
            a(loginReq, (Activity) webView.getContext());
            HuaweiApiClient huaweiApiClientB = r.a().b(bridgeId, appId);
            boolean z3 = false;
            if (huaweiApiClientB == null || !(huaweiApiClientB instanceof HuaweiApiClientImpl)) {
                z = false;
            } else {
                HuaweiApiClientImpl huaweiApiClientImpl = (HuaweiApiClientImpl) huaweiApiClientB;
                boolean zA = k.a(listA, huaweiApiClientImpl.getScopes());
                List<PermissionInfo> permissionInfos = huaweiApiClientImpl.getPermissionInfos();
                if (permissionInfos == null) {
                    z = false;
                    break;
                }
                Iterator<PermissionInfo> it = permissionInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    PermissionInfo next = it.next();
                    if (next != null && "https://www.huawei.com/auth/account/base.profile/serviceauthcode".equals(next.getPermission())) {
                        break;
                    }
                }
                z3 = zA;
            }
            if (huaweiApiClientB == null || !z3 || z != z2) {
                if (huaweiApiClientB != null) {
                    huaweiApiClientB.disconnect();
                }
                huaweiApiClientB = a(webView.getContext().getApplicationContext(), z2, listA);
                huaweiApiClientB.setSubAppInfo(new SubAppInfo(appId));
                r.a().a(bridgeId, appId, huaweiApiClientB);
            }
            Activity activity = (Activity) webView.getContext();
            WeakReference<HuaweiApiClient> weakReference = new WeakReference<>(huaweiApiClientB);
            WeakReference<Activity> weakReference2 = new WeakReference<>(activity);
            if (huaweiApiClientB.isConnected()) {
                a(weakReference, jsCallback, weakReference2, z2, zIsEmpty);
                return;
            }
            huaweiApiClientB.setConnectionCallbacks(new h(this, weakReference, jsCallback, weakReference2, z2, zIsEmpty));
            huaweiApiClientB.setConnectionFailedListener(new k.b(weakReference, jsCallback, weakReference2));
            huaweiApiClientB.connect(activity);
        } catch (ApiException unused) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "appid is not correct", true);
            jsCallback.failure("appid is not correct");
        }
    }

    @Override // com.huawei.hwcloudjs.core.c
    public void onDestroy(String str) {
        r.a().b(str);
        r.a().a(str);
    }

    @Override // com.huawei.hwcloudjs.core.c
    public void onCompletedConfig(Context context, String str, String str2, String str3, JSONObject jSONObject) {
        String strOptString;
        boolean zOptBoolean = false;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("scope", null);
            zOptBoolean = jSONObject.optBoolean("needAuthCode", false);
        } else {
            strOptString = null;
        }
        List<Scope> listA = a(strOptString);
        if (listA.isEmpty()) {
            return;
        }
        HuaweiApiClient huaweiApiClientA = a(context, zOptBoolean, listA);
        huaweiApiClientA.setSubAppInfo(new SubAppInfo(str));
        if (context instanceof Activity) {
            huaweiApiClientA.connect((Activity) context);
        } else {
            huaweiApiClientA.connect((Activity) null);
        }
        r.a().a(str3, str, huaweiApiClientA);
    }

    @JSMethod(isOpen = true, name = "getSignInIntent")
    public void getSignInIntent(LoginReq loginReq, JsCallback jsCallback) {
        com.huawei.hwcloudjs.f.d.c(f17127b, "getSignInIntent begin", true);
        WebView webView = jsCallback.getWebView();
        Activity activity = (Activity) webView.getContext();
        if (!a(loginReq, jsCallback, webView)) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "getSignInIntent checkparam false", true);
            return;
        }
        try {
            com.huawei.hwcloudjs.service.hms.a.a().a(activity, a(loginReq, activity).getSignInIntent(), 9005, new b(this, loginReq, jsCallback));
        } catch (ApiException unused) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "appid is not correct", true);
            jsCallback.failure("appid is not correct");
        }
    }

    @Override // com.huawei.hwcloudjs.core.c
    public String getApi() {
        return com.huawei.hwcloudjs.g.a.f17122c;
    }

    @JSMethod(isOpen = true, name = "cancelAuthorization")
    public void cancelAuthorization(JsParam jsParam, JsCallback jsCallback) {
        com.huawei.hwcloudjs.f.d.c(f17127b, "cancelAuthorization begin", true);
        String appId = jsParam.getAppId();
        String bridgeId = jsParam.getBridgeId();
        HuaweiIdAuthService huaweiIdAuthServiceA = r.a().a(bridgeId, appId);
        HuaweiApiClient huaweiApiClientB = r.a().b(bridgeId, appId);
        if (huaweiIdAuthServiceA == null && huaweiApiClientB == null) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "cancelAuthorization failed, HuaweiIdAuthService is null", true);
            jsCallback.failure("cancelAuthorization failed, please invoke signIn/getSignInIntent/silentSignIn first");
        } else if (huaweiIdAuthServiceA != null) {
            com.huawei.hwcloudjs.f.d.c(f17127b, "cancelAuthorization service is not null", true);
            huaweiIdAuthServiceA.cancelAuthorization().addOnCompleteListener(new d(this, jsCallback));
        } else {
            com.huawei.hwcloudjs.f.d.c(f17127b, "cancelAuthorization service is null", true);
            HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService.cancelAuthorization(huaweiApiClientB).setResultCallback(new e(this, jsCallback));
        }
    }

    private boolean a(LoginReq loginReq, JsCallback jsCallback, WebView webView) {
        if (webView == null) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "signIn webview is null", true);
            jsCallback.failure("webview is null");
            return false;
        }
        if (loginReq == null) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "signIn JS_RET_CODE_PARSE_PARAM_ERROR", true);
            jsCallback.failure(13);
            return false;
        }
        if (loginReq.getAppId() != null && !loginReq.getAppId().isEmpty()) {
            return true;
        }
        com.huawei.hwcloudjs.f.d.b(f17127b, "appid is not config", true);
        jsCallback.failure("appid is not config");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeakReference<HuaweiApiClient> weakReference, JsCallback jsCallback, WeakReference<Activity> weakReference2, boolean z, boolean z2) {
        PendingResult<SignInResult> pendingResultSignIn;
        com.huawei.hwcloudjs.f.d.c(f17127b, "signIn begin", true);
        HuaweiApiClient huaweiApiClient = weakReference.get();
        if (huaweiApiClient == null) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "client is null", true);
            jsCallback.failure();
            return;
        }
        if (z2) {
            pendingResultSignIn = HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService.signInBackend(huaweiApiClient);
        } else {
            Activity activity = weakReference2.get();
            if (activity == null) {
                com.huawei.hwcloudjs.f.d.b(f17127b, "signIn with null activity", true);
                jsCallback.failure();
                return;
            }
            pendingResultSignIn = HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService.signIn(activity, huaweiApiClient);
        }
        pendingResultSignIn.setResultCallback(new i(this, z, weakReference2, weakReference, z2, jsCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.huawei.hwcloudjs.service.hms.a.b bVar, WeakReference<HuaweiApiClient> weakReference, JsCallback jsCallback, WeakReference<Activity> weakReference2, boolean z, boolean z2) {
        if (bVar.c() == -1) {
            com.huawei.hwcloudjs.f.d.c(f17127b, "signIn Activity.RESULT_OK", true);
            a(weakReference, jsCallback, weakReference2, z, z2);
        } else {
            com.huawei.hwcloudjs.f.d.b(f17127b, "signIn JS_RET_CODE_USER_DENAL", true);
            jsCallback.failure(1);
        }
    }

    /* JADX INFO: loaded from: classes37.dex */
    public static final class LoginReq extends JsParam {
        private boolean needAuthCode = false;
        private boolean needIdToken = false;
        private String scope;

        public void setneedAuthCode(boolean z) {
            this.needAuthCode = z;
        }

        public void setScope(String str) {
            this.scope = str;
        }

        public boolean getneedAuthCode() {
            return this.needAuthCode;
        }

        public String getScope() {
            return this.scope;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AuthHuaweiId authHuaweiId, boolean z, JsCallback jsCallback) {
        String familyName;
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                familyName = authHuaweiId.getAuthorizationCode();
                str = "serverAuthCode";
            } else {
                jSONObject.put("openId", authHuaweiId.getOpenId());
                jSONObject.put("accessToken", authHuaweiId.getAccessToken());
                jSONObject.put("displayName", authHuaweiId.getDisplayName());
                jSONObject.put("photoUrl", authHuaweiId.getAvatarUriString());
                jSONObject.put(CommonConstant.KEY_ID_TOKEN, authHuaweiId.getIdToken());
                jSONObject.put(CommonConstant.KEY_UNION_ID, authHuaweiId.getUnionId());
                jSONObject.put("email", authHuaweiId.getEmail());
                jSONObject.put(CommonConstant.KEY_GIVEN_NAME, authHuaweiId.getGivenName());
                familyName = authHuaweiId.getFamilyName();
                str = CommonConstant.KEY_FAMILY_NAME;
            }
            jSONObject.put(str, familyName);
            jsCallback.success(jSONObject.toString());
        } catch (JSONException unused) {
            com.huawei.hwcloudjs.f.d.b(f17127b, "handleAuthHuaweiId JSONException", true);
            jsCallback.failure();
        }
    }

    private void a(SignInResult signInResult, boolean z, WeakReference<Activity> weakReference, WeakReference<HuaweiApiClient> weakReference2, boolean z2, JsCallback jsCallback, Activity activity) {
        com.huawei.hwcloudjs.service.hms.a.a().a(activity, signInResult.getData(), 9001, new j(this, weakReference2, jsCallback, weakReference, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SignInResult signInResult, boolean z, WeakReference<Activity> weakReference, WeakReference<HuaweiApiClient> weakReference2, boolean z2, JsCallback jsCallback) {
        if (signInResult != null) {
            com.huawei.hwcloudjs.f.d.c(f17127b, "signIn result is not null", true);
            if (signInResult.isSuccess()) {
                com.huawei.hwcloudjs.f.d.c(f17127b, "signIn result isSuccess", true);
                jsCallback.success(k.a(signInResult, z));
                return;
            }
            int statusCode = signInResult.getStatus().getStatusCode();
            com.huawei.hwcloudjs.f.d.c(f17127b, "signIn result statusCode:" + statusCode, true);
            if (statusCode == 2001 || statusCode == 2004) {
                Activity activity = weakReference.get();
                if (activity != null) {
                    a(signInResult, z, weakReference, weakReference2, z2, jsCallback, activity);
                    return;
                } else {
                    com.huawei.hwcloudjs.f.d.b(f17127b, "signIn webViewActivity == null", true);
                    jsCallback.failure();
                    return;
                }
            }
            if (statusCode != 2002) {
                jsCallback.failure(signInResult.getStatus().getStatusCode());
                return;
            }
            com.huawei.hwcloudjs.f.d.c(f17127b, "signIn SIGN_IN_AUTH", true);
            Activity activity2 = weakReference.get();
            if (activity2 == null) {
                com.huawei.hwcloudjs.f.d.c(f17127b, "webViewActivity is null", true);
                jsCallback.failure();
                return;
            } else {
                com.huawei.hwcloudjs.service.hms.a.a().a(activity2, signInResult.getData(), 9002, new a(jsCallback, z));
                return;
            }
        }
        com.huawei.hwcloudjs.f.d.b(f17127b, "signIn failed, result is null", true);
        jsCallback.failure("signIn failed, result is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ApiException apiException, JsCallback jsCallback) {
        com.huawei.hwcloudjs.f.d.b(f17127b, "silentSignIn failed, statusCode:" + apiException.getStatusCode() + " msg:" + apiException.getStatusMessage(), true);
        String statusMessage = apiException.getStatusMessage();
        if (apiException.getStatusCode() == 2002) {
            statusMessage = "silentSignIn failed, please invoke signIn/getSignInIntent first";
        }
        jsCallback.failure(apiException.getStatusCode(), statusMessage);
    }

    private static List<Scope> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwcloudjs.f.d.c(f17127b, "parserScope scopeEmpty", true);
            return arrayList;
        }
        for (String str2 : str.split("\\,")) {
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(new Scope(str2));
            }
        }
        return arrayList;
    }

    /* JADX INFO: loaded from: classes37.dex */
    static final class a implements com.huawei.hwcloudjs.service.hms.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JsCallback f17129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17130b;

        @Override // com.huawei.hwcloudjs.service.hms.a.c
        public void a(com.huawei.hwcloudjs.service.hms.a.b bVar) {
            Intent intentA = bVar.a();
            if (intentA == null) {
                if (bVar.c() != -1) {
                    com.huawei.hwcloudjs.f.d.b(HmsCoreApi.f17127b, "signIn onResult JS_RET_CODE_USER_DENAL", true);
                    this.f17129a.failure(1);
                    return;
                } else {
                    com.huawei.hwcloudjs.f.d.b(HmsCoreApi.f17127b, "signIn onResult hms not ret data", true);
                    this.f17129a.failure("hms not ret data");
                    return;
                }
            }
            SignInResult hwIdSignInResultFromIntent = HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService.getHwIdSignInResultFromIntent(intentA);
            if (hwIdSignInResultFromIntent == null) {
                com.huawei.hwcloudjs.f.d.b(HmsCoreApi.f17127b, "signIn onResult signInResult is null", true);
                this.f17129a.failure("signInResult is null");
            } else if (hwIdSignInResultFromIntent.isSuccess()) {
                com.huawei.hwcloudjs.f.d.c(HmsCoreApi.f17127b, "signIn onResult isSuccess", true);
                this.f17129a.success(k.a(hwIdSignInResultFromIntent, this.f17130b));
            } else {
                com.huawei.hwcloudjs.f.d.b(HmsCoreApi.f17127b, "signIn onResult" + hwIdSignInResultFromIntent.getStatus().getStatusCode(), true);
                this.f17129a.failure(hwIdSignInResultFromIntent.getStatus().getStatusCode());
            }
        }

        public a(JsCallback jsCallback, boolean z) {
            this.f17129a = jsCallback;
            this.f17130b = z;
        }
    }

    private HuaweiIdAuthService a(LoginReq loginReq, Activity activity) throws ApiException {
        String appId = loginReq.getAppId();
        String bridgeId = loginReq.getBridgeId();
        List<Scope> listA = a(loginReq.scope);
        com.huawei.hwcloudjs.f.d.c(f17127b, "getAuthService appId:" + appId, false);
        com.huawei.hwcloudjs.f.d.c(f17127b, "getAuthService bridgeId:" + bridgeId, false);
        com.huawei.hwcloudjs.f.d.c(f17127b, "getAuthService scopeList:" + listA, false);
        HuaweiIdAuthParamsHelper scopeList = new HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setScopeList(listA);
        if (loginReq.needAuthCode) {
            scopeList.setAuthorizationCode();
        } else {
            scopeList.setAccessToken().setId();
        }
        if (loginReq.needIdToken) {
            scopeList.setIdToken();
        }
        HuaweiIdAuthService service = HuaweiIdAuthManager.getService(activity, scopeList.createParams());
        service.setSubAppId(appId);
        r.a().a(bridgeId, appId, service);
        return service;
    }

    private HuaweiApiClient a(Context context, boolean z, List<Scope> list) {
        HuaweiIdAuthParamsHelper huaweiIdAuthParamsHelper = new HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM);
        if (z) {
            huaweiIdAuthParamsHelper.setAuthorizationCode();
        } else {
            huaweiIdAuthParamsHelper.setAccessToken().setId();
        }
        HuaweiApiClient.Builder builder = new HuaweiApiClient.Builder(context.getApplicationContext());
        builder.addApi(HuaweiIdAuthAPIManager.HUAWEI_OAUTH_API, huaweiIdAuthParamsHelper.createParams());
        if (list != null) {
            Iterator<Scope> it = list.iterator();
            while (it.hasNext()) {
                builder.addScope(it.next());
            }
        }
        return builder.build();
    }
}
