package com.huami.passport.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.ext.RequestManager;
import com.google.gson.Gson;
import com.huami.passport.AccountManager;
import com.huami.passport.Configs;
import com.huami.passport.IAccount;
import com.huami.passport.Keeper;
import com.huami.passport.auth.OpenAuthService;
import com.huami.passport.auth.entity.AppInfo;
import com.huami.passport.auth.entity.AuthError;
import com.huami.passport.auth.entity.Entity;
import com.huami.passport.auth.entity.TokenInfo;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.SingInfo;
import com.huami.passport.net.RestfulRequest;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class OpenAuthService {
    private static final boolean VERIFY_ENABLE = true;
    private AccountManager mAccountManager;
    private Context mConext;

    public OpenAuthService(@NonNull AccountManager accountManager) {
        this.mConext = accountManager.getContext();
        this.mAccountManager = accountManager;
        Log.i("HmOAuth", "Auth SDK Version:" + Configs.SDK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void convert(Class<? extends Entity> cls, final NetworkResponse networkResponse, IAccount.Callback<T, AuthError> callback) {
        if (callback == null) {
            return;
        }
        Entity entity = null;
        try {
            Gson gson = new Gson();
            final String str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
            HMLog.debug(new Function0() { // from class: hk5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenAuthService.lambda$convert$7(networkResponse, str);
                }
            });
            entity = (Entity) gson.fromJson(str, (Class) cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (entity == null) {
            callback.onError(new AuthError(IError.EC_10002));
            return;
        }
        int i = networkResponse.statusCode;
        if (i == 200) {
            callback.onSuccess(entity);
            return;
        }
        if (i == 401 && entity.getCode() == 0) {
            entity.setCode(-401);
        }
        callback.onError(new AuthError(entity.getCode(), entity.getMessage()));
    }

    private String getHost(String str) {
        if (Configs.isDebugMode) {
            if (TextUtils.equals(str, "cn")) {
                return "https://account-staging.huami.cn/";
            }
            if (TextUtils.equals(str, Configs.Params.US)) {
                return "https://account-staging-us.huami.com/";
            }
            throw new UnsupportedOperationException("region is not cn or us");
        }
        if (TextUtils.equals(str, "cn")) {
            return "https://api-auth.huami.com/";
        }
        if (TextUtils.equals(str, Configs.Params.US)) {
            return "https://api-auth-us.huami.com/";
        }
        throw new UnsupportedOperationException("region is not cn or us");
    }

    private String getUrlByAuthorize(String str) {
        return getHost(str) + "oauth2/huamiAuthorize";
    }

    private String getUrlByPartnerApps(String str, String str2) {
        return String.format(getHost(str2) + "partnerApps/%s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$authorize$0() {
        return "get local third app singinfo is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$authorize$1(String str, AppInfo appInfo, String str2) {
        return "Signature verification failed-->local singinfo:" + str + " codeSignature:" + appInfo.getCodeSignature() + " callingPackage:" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$authorize$2(String str) {
        return "local singinfo:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$authorize$3() {
        return "No login error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$authorize$4(String str) {
        return "scopeObjects ---> " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$convert$7(NetworkResponse networkResponse, String str) {
        return "convert entity:" + networkResponse.statusCode + "Header:" + Utils.encodeParameters(networkResponse.headers) + " Body:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAppInfo$5(Intent intent) {
        return "[GET] getPartnerApps intent getData = " + intent.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAppInfo$6(String str, String str2, String str3) {
        return "getAppInfo,path=" + str + " appid=" + str2 + " region=" + str3;
    }

    public void authorize(@NonNull final String str, @NonNull final AppInfo appInfo, final IAccount.Callback<TokenInfo, AuthError> callback) {
        if (callback == null) {
            return;
        }
        SingInfo singInfo = Utils.getSingInfo(this.mConext, str);
        final String keyHash = singInfo == null ? null : singInfo.getKeyHash();
        if (TextUtils.isEmpty(keyHash)) {
            HMLog.debug(new Function0() { // from class: mk5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenAuthService.lambda$authorize$0();
                }
            });
            callback.onError(AuthError.builder(IError.EC_10003));
            return;
        }
        if (!TextUtils.isEmpty(appInfo.getCodeSignature()) && !TextUtils.equals(keyHash, appInfo.getCodeSignature())) {
            HMLog.debug(new Function0() { // from class: kk5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenAuthService.lambda$authorize$1(keyHash, appInfo, str);
                }
            });
            callback.onError(AuthError.builder(IError.EC_10003));
            return;
        }
        HMLog.debug(new Function0() { // from class: jk5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenAuthService.lambda$authorize$2(keyHash);
            }
        });
        LoginToken tokenCache = Keeper.getTokenCache(this.mConext);
        if (tokenCache == null || tokenCache.getTokenInfo() == null) {
            HMLog.debug(new Function0() { // from class: nk5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenAuthService.lambda$authorize$3();
                }
            });
            callback.onError(AuthError.builder(IError.EC_10004));
            return;
        }
        RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByAuthorize(this.mAccountManager.getCurrentRegion()), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.auth.OpenAuthService.1
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                OpenAuthService.this.convert(TokenInfo.class, networkResponse, callback);
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.auth.OpenAuthService.2
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse != null) {
                    OpenAuthService.this.convert(TokenInfo.class, networkResponse, callback);
                    return;
                }
                IAccount.Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.onError(AuthError.builder(IError.EC_10005));
                }
            }
        });
        restfulRequest.setShouldCache(false);
        restfulRequest.addParams("refresh_token", tokenCache.getTokenInfo().getLoginToken());
        restfulRequest.addParams("client_id", appInfo.getAppId());
        StringBuilder sb = new StringBuilder();
        int size = appInfo.getScopes().size();
        for (int i = 0; i < size; i++) {
            sb.append("model=='");
            sb.append(appInfo.getScopes().get(i).getId());
            sb.append("'");
            if (i != size - 1) {
                sb.append("||");
            }
        }
        final String string = sb.toString();
        HMLog.debug(new Function0() { // from class: ik5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenAuthService.lambda$authorize$4(string);
            }
        });
        if (!TextUtils.isEmpty(sb.toString())) {
            restfulRequest.addParams("scopeObjects", string);
        }
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 0, 1.0f));
        RequestManager.getDefault(this.mConext).add(restfulRequest);
    }

    public void getAppInfo(@NonNull Intent intent, IAccount.Callback<AppInfo, AuthError> callback) {
        getAppInfo(intent, false, callback);
    }

    public void getAppInfoCache(@NonNull Intent intent, IAccount.Callback<AppInfo, AuthError> callback) {
        getAppInfo(intent, true, callback);
    }

    public Intent getAuthError(int i) {
        return getAuthError(i, null);
    }

    public Intent getAuthSuccess(TokenInfo tokenInfo) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("access_token", tokenInfo.getAccessToken());
        bundle.putString("refresh_token", tokenInfo.getRefreshToken());
        bundle.putString("token_type", tokenInfo.getTokenType());
        bundle.putInt("expires_in", tokenInfo.getExpiresIn());
        String currentRegion = this.mAccountManager.getCurrentRegion();
        if (!TextUtils.isEmpty(currentRegion)) {
            bundle.putString("region", currentRegion);
        }
        intent.putExtra(Protocol.HUAMI_BUNDLE, bundle);
        return intent;
    }

    public void onErrorCallback(Activity activity, int i, String str) {
        activity.setResult(1, getAuthError(i, str));
    }

    public void onSuccessCallback(Activity activity, TokenInfo tokenInfo) {
        activity.setResult(1, getAuthSuccess(tokenInfo));
    }

    private void getAppInfo(@NonNull final Intent intent, boolean z, final IAccount.Callback<AppInfo, AuthError> callback) {
        HMLog.debug(new Function0() { // from class: gk5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenAuthService.lambda$getAppInfo$5(intent);
            }
        });
        if (callback == null) {
            return;
        }
        try {
            Uri data = intent.getData();
            String scheme = data.getScheme();
            String host = data.getHost();
            if (!TextUtils.equals("oauth", scheme) || !TextUtils.equals(Protocol.HOST, host)) {
                callback.onError(AuthError.builder(IError.EC_10001));
                return;
            }
            final String path = data.getPath();
            if (TextUtils.equals(Protocol.ACCESS_TOKEN_PATH, path)) {
                final String queryParameter = data.getQueryParameter("appid");
                final String currentRegion = this.mAccountManager.getCurrentRegion();
                HMLog.debug(new Function0() { // from class: lk5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OpenAuthService.lambda$getAppInfo$6(path, queryParameter, currentRegion);
                    }
                });
                try {
                    RestfulRequest restfulRequest = new RestfulRequest(0, getUrlByPartnerApps(queryParameter, currentRegion), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.auth.OpenAuthService.3
                        @Override // com.android.volley.Response.Listener
                        public void onResponse(NetworkResponse networkResponse) {
                            OpenAuthService.this.convert(AppInfo.class, networkResponse, callback);
                        }
                    }, new Response.ErrorListener() { // from class: com.huami.passport.auth.OpenAuthService.4
                        @Override // com.android.volley.Response.ErrorListener
                        public void onErrorResponse(VolleyError volleyError) {
                            NetworkResponse networkResponse = volleyError.networkResponse;
                            if (networkResponse != null) {
                                OpenAuthService.this.convert(AppInfo.class, networkResponse, callback);
                                return;
                            }
                            IAccount.Callback callback2 = callback;
                            if (callback2 != null) {
                                callback2.onError(AuthError.builder(IError.EC_10005));
                            }
                        }
                    });
                    restfulRequest.addHeaders("lang", Locale.getDefault().getLanguage());
                    restfulRequest.setShouldCache(z);
                    restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
                    RequestManager.getDefault(this.mConext).add(restfulRequest);
                    return;
                } catch (UnsupportedOperationException unused) {
                    callback.onError(AuthError.builder(IError.EC_10001));
                    return;
                }
            }
            callback.onError(AuthError.builder(IError.EC_10002));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Intent getAuthError(int i, String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("error_message", str);
        }
        intent.putExtra(Protocol.HUAMI_BUNDLE, bundle);
        return intent;
    }
}
