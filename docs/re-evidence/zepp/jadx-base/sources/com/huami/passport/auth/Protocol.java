package com.huami.passport.auth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public class Protocol {
    public static final String ACCESS_TOKEN_PATH = "/openapi/access_token";
    public static String AUTH_HOST = "https://users-auth.huami.com";
    public static String AUTH_STAGING_HOST = "https://users-auth-staging.huami.com";
    public static final String AUTH_URL = "%s/huami.health.authorization.do?%s";
    public static final String HOST = "huami.com";
    public static final String HUAMI_BUNDLE = "huami_bundle";
    public static final String SCHEME = "oauth";

    public interface Params {
        public static final String ACCESS_TOKEN = "access_token";
        public static final String CODE_SIGNATURE = "code_signature";
        public static final String ERROR_CODE = "error_code";
        public static final String ERROR_MESSAGE = "error_message";
        public static final String EXPIRES_IN = "expires_in";
        public static final String PACKAGE_ID = "package_id";
        public static final String PAYLOAD = "payload";
        public static final String REDIRECT_URI = "redirect_uri";
        public static final String REFRESH_TOKEN = "refresh_token";
        public static final String REGION = "region";
        public static final String TOKEN_TYPE = "token_type";
    }

    private static Intent getAuthError(IError iError) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        String str = iError.errorMsg;
        bundle.putInt("error_code", iError.errorCode);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("error_message", str);
        }
        intent.putExtra(HUAMI_BUNDLE, bundle);
        return intent;
    }

    private static Intent getAuthSuccess(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("payload", str);
        Intent intent = new Intent();
        intent.putExtra(HUAMI_BUNDLE, bundle);
        return intent;
    }

    public static void onErrorCallback(Activity activity, IError iError) {
        activity.setResult(1, getAuthError(iError));
    }

    public static void onSuccessCallback(Activity activity, String str) {
        activity.setResult(1, getAuthSuccess(str));
    }

    public static boolean verifyUri(Uri uri, String str) {
        if (uri == null) {
            return false;
        }
        return TextUtils.equals("oauth", uri.getScheme()) && TextUtils.equals(HOST, uri.getHost()) && TextUtils.equals(str, uri.getPath());
    }
}
