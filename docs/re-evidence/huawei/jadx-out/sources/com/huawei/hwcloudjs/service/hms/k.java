package com.huawei.hwcloudjs.service.hms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.api.HuaweiApiClientImpl;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.hwid.SignInResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcloudjs.core.JsCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes37.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17165a = "HmsCoreApiHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f17166b = 9004;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17167c = 9003;
    public static final int d = 1;

    public static boolean a(List<Scope> list, List<Scope> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Scope scope : list) {
                if (scope != null && !arrayList.contains(scope.getScopeUri())) {
                    arrayList.add(scope.getScopeUri());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            for (Scope scope2 : list2) {
                if (scope2 != null && !arrayList2.contains(scope2.getScopeUri())) {
                    arrayList2.add(scope2.getScopeUri());
                }
            }
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        return arrayList.equals(arrayList2);
    }

    public static final class b implements HuaweiApiClient.OnConnectionFailedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HuaweiApiClient> f17170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JsCallback f17171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Activity> f17172c;

        static final class a implements com.huawei.hwcloudjs.service.hms.a.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final String f17173a = "intent.extra.RESULT";

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WeakReference<HuaweiApiClient> f17174b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private WeakReference<Activity> f17175c;
            private JsCallback d;

            @Override // com.huawei.hwcloudjs.service.hms.a.c
            public void a(com.huawei.hwcloudjs.service.hms.a.b bVar) {
                Intent intentA;
                int intExtra = -1;
                if (bVar != null && bVar.c() == -1 && (intentA = bVar.a()) != null) {
                    intExtra = intentA.getIntExtra("intent.extra.RESULT", -1);
                }
                com.huawei.hwcloudjs.f.d.b(k.f17165a, "ConnFailResult result:" + intExtra, true);
                if (intExtra != 0) {
                    String str = intExtra + "";
                    com.huawei.hwcloudjs.f.d.b(k.f17165a, "ConnFailResult onConnectionFailed" + str, true);
                    this.d.failure(str);
                    return;
                }
                HuaweiApiClient huaweiApiClient = this.f17174b.get();
                if (huaweiApiClient == null || huaweiApiClient.isConnecting() || huaweiApiClient.isConnected()) {
                    return;
                }
                com.huawei.hwcloudjs.f.d.c(k.f17165a, "ConnFailResult connect", true);
                WeakReference<Activity> weakReference = this.f17175c;
                if (weakReference != null) {
                    huaweiApiClient.connect(weakReference.get());
                } else {
                    huaweiApiClient.connect((Activity) null);
                }
            }

            public a(WeakReference<HuaweiApiClient> weakReference, WeakReference<Activity> weakReference2, JsCallback jsCallback) {
                this.f17174b = weakReference;
                this.f17175c = weakReference2;
                this.d = jsCallback;
            }
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            int errorCode = connectionResult.getErrorCode();
            HuaweiApiAvailability huaweiApiAvailability = HuaweiApiAvailability.getInstance();
            if (huaweiApiAvailability.isUserResolvableError(errorCode)) {
                com.huawei.hwcloudjs.f.d.b(k.f17165a, "InvokeResultCallback onConnectionFailed REQUEST_CODE_CONN_ERROR", true);
                com.huawei.hwcloudjs.service.hms.a.a().a(9004, new a(this.f17170a, this.f17172c, this.f17171b));
                new Handler(Looper.getMainLooper()).post(new l(this, huaweiApiAvailability, errorCode));
                return;
            }
            String str = errorCode + "";
            com.huawei.hwcloudjs.f.d.b(k.f17165a, "InvokeResultCallback onConnectionFailed errorCode:" + str, true);
            this.f17171b.failure(str);
        }

        public b(WeakReference<HuaweiApiClient> weakReference, JsCallback jsCallback, WeakReference<Activity> weakReference2) {
            this.f17170a = weakReference;
            this.f17171b = jsCallback;
            this.f17172c = weakReference2;
        }
    }

    public static void a(WeakReference<HuaweiApiClient> weakReference, String str, JSONObject jSONObject, JsCallback jsCallback) {
        HuaweiApiClient huaweiApiClient = weakReference.get();
        if (huaweiApiClient == null || !(huaweiApiClient instanceof HuaweiApiClientImpl)) {
            jsCallback.failure();
        } else {
            ((HuaweiApiClientImpl) huaweiApiClient).asyncRequest(u.a(2).a(jSONObject, new Bundle()), str, 2, new d(weakReference, jsCallback));
        }
    }

    static final class a implements com.huawei.hwcloudjs.service.hms.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f17168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JsCallback f17169b;

        @Override // com.huawei.hwcloudjs.service.hms.a.c
        public void a(com.huawei.hwcloudjs.service.hms.a.b bVar) {
            Bundle extras;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("resultCode", bVar.c());
            } catch (JSONException unused) {
                com.huawei.hwcloudjs.f.d.b(k.f17165a, "getResultFromActivityResult put json error", true);
            }
            Intent intentA = bVar.a();
            if (intentA != null && (extras = intentA.getExtras()) != null) {
                t tVarA = u.a(2);
                JSONObject jSONObject2 = new JSONObject();
                tVarA.a(this.f17168a, extras, jSONObject2);
                try {
                    jSONObject.put("result", jSONObject2);
                } catch (JSONException unused2) {
                    com.huawei.hwcloudjs.f.d.b(k.f17165a, "InvokeResultCallback onResult JSONException", true);
                    this.f17169b.failure();
                }
            }
            this.f17169b.success(jSONObject.toString());
        }

        public a(String str, JsCallback jsCallback) {
            this.f17168a = str;
            this.f17169b = jsCallback;
        }
    }

    public static final class c implements HuaweiApiClient.ConnectionCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HuaweiApiClient> f17176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JsCallback f17177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17178c;
        private JSONObject d;

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnected() {
            k.a(this.f17176a, this.f17178c, this.d, this.f17177b);
        }

        public c(WeakReference<HuaweiApiClient> weakReference, JsCallback jsCallback, String str, JSONObject jSONObject) {
            this.f17176a = weakReference;
            this.f17177b = jsCallback;
            this.f17178c = str;
            this.d = jSONObject;
        }
    }

    static final class d implements ResultCallback<BundleResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HuaweiApiClient> f17179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JsCallback f17180b;

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(BundleResult bundleResult) {
            HuaweiApiClient huaweiApiClient = this.f17179a.get();
            if (huaweiApiClient != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("statusCode", bundleResult.getResultCode());
                    if (bundleResult.getRspBody() != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        u.a(2).a(huaweiApiClient.getAppID(), bundleResult.getRspBody(), jSONObject2);
                        jSONObject.put("result", jSONObject2);
                    }
                    this.f17180b.success(jSONObject.toString());
                    return;
                } catch (JSONException unused) {
                    com.huawei.hwcloudjs.f.d.b(k.f17165a, "InvokeResultCallback JSONException", true);
                }
            }
            this.f17180b.failure();
        }

        public d(WeakReference<HuaweiApiClient> weakReference, JsCallback jsCallback) {
            this.f17179a = weakReference;
            this.f17180b = jsCallback;
        }
    }

    public static void a(String str, JsCallback jsCallback) {
        com.huawei.hwcloudjs.service.hms.a.a().a(9003, new a(str, jsCallback));
    }

    public static String a(SignInResult signInResult, boolean z) {
        String familyName;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (z) {
                familyName = signInResult.getAuthHuaweiId().getAuthorizationCode();
                str = "serverAuthCode";
            } else {
                jSONObject.put("openId", signInResult.getAuthHuaweiId().getOpenId());
                jSONObject.put("accessToken", signInResult.getAuthHuaweiId().getAccessToken());
                jSONObject.put("displayName", signInResult.getAuthHuaweiId().getDisplayName());
                jSONObject.put("photoUrl", signInResult.getAuthHuaweiId().getAvatarUriString());
                jSONObject.put(CommonConstant.KEY_UNION_ID, signInResult.getAuthHuaweiId().getUnionId());
                jSONObject.put("email", signInResult.getAuthHuaweiId().getEmail());
                jSONObject.put(CommonConstant.KEY_GIVEN_NAME, signInResult.getAuthHuaweiId().getGivenName());
                familyName = signInResult.getAuthHuaweiId().getFamilyName();
                str = CommonConstant.KEY_FAMILY_NAME;
            }
            jSONObject.put(str, familyName);
        } catch (JSONException unused) {
            com.huawei.hwcloudjs.f.d.b(f17165a, "signInRes2Json put json error", true);
        }
        return jSONObject.toString();
    }
}
