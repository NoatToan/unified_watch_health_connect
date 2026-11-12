package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
abstract class WebLoginMethodHandler extends LoginMethodHandler {
    private static final String c = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String d = "TOKEN";
    private String b;
    public AccessTokenSource tokenSource;

    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private String a() {
        return getLoginClient().j().getSharedPreferences(c, 0).getString(d, "");
    }

    private void b(String str) {
        getLoginClient().j().getSharedPreferences(c, 0).edit().putString(d, str).apply();
    }

    public Bundle addExtraParameters(Bundle bundle, LoginClient.Request request) {
        bundle.putString("redirect_uri", getRedirectUrl());
        if (request.l()) {
            bundle.putString("app_id", request.a());
        } else {
            bundle.putString("client_id", request.a());
        }
        getLoginClient();
        bundle.putString("e2e", LoginClient.m());
        if (request.l()) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES);
        } else if (request.i().contains("openid")) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST);
            bundle.putString("nonce", request.getNonce());
        } else {
            bundle.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST);
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, "true");
        bundle.putString("auth_type", request.c());
        bundle.putString("login_behavior", request.g().name());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", FacebookSdk.getSdkVersion()));
        if (getSSODevice() != null) {
            bundle.putString("sso", getSSODevice());
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_CUSTOM_TABS_PREFETCHING, FacebookSdk.hasCustomTabsPrefetching ? "1" : "0");
        if (request.k()) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_FX_APP, request.h().getTargetApp());
        }
        if (request.v()) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, "true");
        }
        if (request.getMessengerPageId() != null) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_MESSENGER_PAGE_ID, request.getMessengerPageId());
            bundle.putString(ServerProtocol.DIALOG_PARAM_RESET_MESSENGER_STATE, request.getResetMessengerState() ? "1" : "0");
        }
        return bundle;
    }

    public Bundle getParameters(LoginClient.Request request) {
        Bundle bundle = new Bundle();
        if (!Utility.isNullOrEmpty(request.i())) {
            String strJoin = TextUtils.join(",", request.i());
            bundle.putString("scope", strJoin);
            addLoggingExtra("scope", strJoin);
        }
        bundle.putString("default_audience", request.d().getNativeProtocolAudience());
        bundle.putString("state", getClientState(request.b()));
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        String token = currentAccessToken != null ? currentAccessToken.getToken() : null;
        if (token == null || !token.equals(a())) {
            Utility.clearFacebookCookies(getLoginClient().j());
            addLoggingExtra("access_token", "0");
        } else {
            bundle.putString("access_token", token);
            addLoggingExtra("access_token", "1");
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_CBT, String.valueOf(System.currentTimeMillis()));
        bundle.putString(ServerProtocol.DIALOG_PARAM_IES, FacebookSdk.getAutoLogAppEventsEnabled() ? "1" : "0");
        return bundle;
    }

    public String getRedirectUrl() {
        return "fb" + FacebookSdk.getApplicationId() + "://authorize/";
    }

    public String getSSODevice() {
        return null;
    }

    public abstract AccessTokenSource getTokenSource();

    public void onComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String str;
        LoginClient.Result resultD;
        LoginClient loginClient = getLoginClient();
        this.b = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.b = bundle.getString("e2e");
            }
            try {
                AccessToken accessTokenCreateAccessTokenFromWebBundle = LoginMethodHandler.createAccessTokenFromWebBundle(request.i(), bundle, getTokenSource(), request.a());
                resultD = LoginClient.Result.b(loginClient.getPendingRequest(), accessTokenCreateAccessTokenFromWebBundle, LoginMethodHandler.createAuthenticationTokenFromWebBundle(bundle, request.getNonce()));
                CookieSyncManager.createInstance(loginClient.j()).sync();
                if (accessTokenCreateAccessTokenFromWebBundle != null) {
                    b(accessTokenCreateAccessTokenFromWebBundle.getToken());
                }
            } catch (FacebookException e) {
                resultD = LoginClient.Result.c(loginClient.getPendingRequest(), null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            resultD = LoginClient.Result.a(loginClient.getPendingRequest(), "User canceled log in.");
        } else {
            this.b = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                str = String.format(Locale.ROOT, TimeModel.NUMBER_FORMAT, Integer.valueOf(requestError.getErrorCode()));
                message = requestError.toString();
            } else {
                str = null;
            }
            resultD = LoginClient.Result.d(loginClient.getPendingRequest(), null, message, str);
        }
        if (!Utility.isNullOrEmpty(this.b)) {
            logWebLoginCompleted(this.b);
        }
        loginClient.h(resultD);
    }

    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
