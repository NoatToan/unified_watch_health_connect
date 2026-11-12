package com.huami.passport.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.MailService;
import com.huami.passport.api.error.ErrorMsg;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.OAuthUser;
import com.huami.passport.net.LoginServiceAPI;
import com.huami.passport.net.RequestQueueHolder;
import com.huami.passport.net.RestfulRequest;
import com.huami.passport.net.WebAPI;
import com.huami.passport.user.IAuthService;
import com.huami.passport.user.IMailService;
import com.huami.passport.user.Keeper;
import com.huami.tools.log.HMLog;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class MailService extends BaseUserService implements IMailService {
    private static final String APPLICATION_JSON_TYPE = "application/json";
    private static final String IMAGE_JPG_TYPE = "image/jpg";
    private Context mContext;

    /* JADX INFO: renamed from: com.huami.passport.api.MailService$12, reason: invalid class name */
    public class AnonymousClass12 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass12(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0(String str) {
            return "Content type:" + str;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            try {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse == null) {
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                    return;
                }
                WebAPI.debugInfo(networkResponse);
                Map<String, String> map = networkResponse.headers;
                if (map != null) {
                    final String str = map.get("Content-Type");
                    HMLog.debug(new Function0() { // from class: com.huami.passport.api.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MailService.AnonymousClass12.lambda$onErrorResponse$0(str);
                        }
                    });
                }
                ApiResult.onErrorCallback(this.val$callback, new ErrorCode(String.valueOf(networkResponse.statusCode), ErrorMsg.mapErrMsg4ResendConfirmationRsp(networkResponse.statusCode)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.MailService$2, reason: invalid class name */
    public class AnonymousClass2 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass2(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0(String str) {
            return "Content type:" + str;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            try {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse == null) {
                    volleyError.printStackTrace();
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, "netword exception"));
                    return;
                }
                WebAPI.debugInfo(networkResponse);
                Map<String, String> map = networkResponse.headers;
                if (map != null) {
                    final String str = map.get("Content-Type");
                    HMLog.debug(new Function0() { // from class: com.huami.passport.api.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MailService.AnonymousClass2.lambda$onErrorResponse$0(str);
                        }
                    });
                }
                ApiResult.onErrorCallback(this.val$callback, new ErrorCode(String.valueOf(networkResponse.statusCode), ErrorMsg.mapErrMsg4ForgotPasswordRsp(networkResponse.statusCode)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.MailService$4, reason: invalid class name */
    public class AnonymousClass4 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$redirect;

        public AnonymousClass4(String str, IAccount.Callback callback) {
            this.val$redirect = str;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0(String str) {
            return "location:" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$1(String str, String str2, String str3, String str4, String str5, String str6) {
            return "registrations success state " + str + " region " + str2 + " token " + str3 + " sub " + str4 + " refresh " + str5 + " expiration " + str6;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4 */
        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            ?? r5;
            String str;
            Object objValueOf;
            String str2;
            try {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse == null) {
                    str = "";
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, str));
                    return;
                }
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                r5 = 303;
                try {
                    if (i != 303) {
                        int code = 0;
                        if (i == 400) {
                            ErrorCode errorCode = null;
                            try {
                                errorCode = (ErrorCode) new Gson().fromJson(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers)), ErrorCode.class);
                            } catch (Exception unused) {
                            }
                            if (errorCode != null) {
                                code = errorCode.getCode();
                            }
                        }
                        IAccount.Callback callback = this.val$callback;
                        int i2 = networkResponse.statusCode;
                        if (i2 == 400) {
                            objValueOf = networkResponse.statusCode + ":" + code;
                        } else {
                            objValueOf = Integer.valueOf(i2);
                        }
                        ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(objValueOf), ErrorMsg.mapErrMsg4SignupRsp(networkResponse)));
                        return;
                    }
                    Map<String, String> map = networkResponse.headers;
                    if (map != null) {
                        final String str3 = map.get("Location");
                        HMLog.debug(new Function0() { // from class: com.huami.passport.api.i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MailService.AnonymousClass4.lambda$onErrorResponse$0(str3);
                            }
                        });
                        Uri uri = Uri.parse(str3);
                        if (str3.contains(this.val$redirect)) {
                            String queryParameter = uri.getQueryParameter("error");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                ApiResult.onErrorCallback(this.val$callback, new ErrorCode(queryParameter, ErrorMsg.mapErrMsg4SignupRsp(networkResponse)));
                                return;
                            }
                            final String queryParameter2 = uri.getQueryParameter("state");
                            final String queryParameter3 = uri.getQueryParameter("region");
                            String queryParameter4 = uri.getQueryParameter("country_code");
                            uri.getQueryParameter(Configs.Params.COUNTRY_STATE);
                            final String queryParameter5 = uri.getQueryParameter("access");
                            final String queryParameter6 = uri.getQueryParameter("sub");
                            final String queryParameter7 = uri.getQueryParameter("refresh");
                            final String queryParameter8 = uri.getQueryParameter(Configs.Params.EXPIRATION);
                            str2 = "";
                            try {
                                HMLog.debug(new Function0() { // from class: com.huami.passport.api.j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MailService.AnonymousClass4.lambda$onErrorResponse$1(queryParameter2, queryParameter3, queryParameter5, queryParameter6, queryParameter7, queryParameter8);
                                    }
                                });
                                if (!TextUtils.isEmpty(queryParameter5)) {
                                    LoginInfo loginInfo = new LoginInfo();
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        loginInfo.setRegion(queryParameter3);
                                    }
                                    loginInfo.setState(queryParameter2);
                                    loginInfo.setAccess(queryParameter5);
                                    loginInfo.setCountryCode(queryParameter4);
                                    loginInfo.setCountryState(queryParameter2);
                                    if (!TextUtils.isEmpty(queryParameter8)) {
                                        loginInfo.setExpiration(Long.parseLong(queryParameter8));
                                    }
                                    loginInfo.setRefresh(queryParameter7);
                                    if (!TextUtils.isEmpty(queryParameter6) && Configs.supportSubEnable) {
                                        loginInfo.setOauthId(queryParameter6);
                                    }
                                    loginInfo.setLastUpdateTtl(System.currentTimeMillis());
                                    if (Keeper.setLoginInfo(MailService.this.mContext, loginInfo) & true) {
                                        ApiResult.onSuccessCallback(this.val$callback, loginInfo);
                                        return;
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                r5 = str2;
                                e.printStackTrace();
                                str = r5;
                                ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, str));
                                return;
                            }
                        } else {
                            str2 = "";
                        }
                    } else {
                        str2 = "";
                    }
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, str2));
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                r5 = "";
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.MailService$6, reason: invalid class name */
    public class AnonymousClass6 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$redirectUri;

        public AnonymousClass6(String str, IAccount.Callback callback) {
            this.val$redirectUri = str;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0(String str) {
            return "location:" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$1(String str, String str2, String str3, String str4, String str5, String str6) {
            return "login success state " + str + " region " + str2 + " token " + str3 + " sub " + str4 + " refresh " + str5 + " expiration " + str6;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0101  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            ?? r4;
            ?? r5;
            String str;
            try {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse == null) {
                    r5 = ErrorCode.INNER_HANDLE_ERROR;
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode((String) r5, ""));
                    return;
                }
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                r4 = 303;
                try {
                    if (i == 303) {
                        Map<String, String> map = networkResponse.headers;
                        final String str2 = map != null ? map.get("Location") : null;
                        if (TextUtils.isEmpty(str2)) {
                            str = ErrorCode.INNER_HANDLE_ERROR;
                        } else {
                            HMLog.debug(new Function0() { // from class: com.huami.passport.api.k
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MailService.AnonymousClass6.lambda$onErrorResponse$0(str2);
                                }
                            });
                            Uri uri = Uri.parse(str2);
                            if ((this.val$redirectUri == null && str2.contains(IAuthService.REDIRECT.DEFAULT_REDIRECT_URI)) || str2.contains(this.val$redirectUri)) {
                                String queryParameter = uri.getQueryParameter("error");
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    ErrorCode errorCode = new ErrorCode(queryParameter, ErrorMsg.mapErrMsg4SigninRsp(networkResponse.statusCode));
                                    errorCode.setExtras(str2);
                                    ApiResult.onErrorCallback(this.val$callback, errorCode);
                                    return;
                                }
                                final String queryParameter2 = uri.getQueryParameter("state");
                                final String queryParameter3 = uri.getQueryParameter("region");
                                String queryParameter4 = uri.getQueryParameter("country_code");
                                String queryParameter5 = uri.getQueryParameter(Configs.Params.COUNTRY_STATE);
                                final String queryParameter6 = uri.getQueryParameter("access");
                                final String queryParameter7 = uri.getQueryParameter("sub");
                                final String queryParameter8 = uri.getQueryParameter("refresh");
                                final String queryParameter9 = uri.getQueryParameter(Configs.Params.EXPIRATION);
                                str = ErrorCode.INNER_HANDLE_ERROR;
                                try {
                                    HMLog.debug(new Function0() { // from class: com.huami.passport.api.l
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MailService.AnonymousClass6.lambda$onErrorResponse$1(queryParameter2, queryParameter3, queryParameter6, queryParameter7, queryParameter8, queryParameter9);
                                        }
                                    });
                                    if (!TextUtils.isEmpty(queryParameter6)) {
                                        LoginInfo loginInfo = new LoginInfo();
                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                            loginInfo.setRegion(queryParameter3);
                                        }
                                        loginInfo.setState(queryParameter2);
                                        loginInfo.setAccess(queryParameter6);
                                        loginInfo.setCountryCode(queryParameter4);
                                        loginInfo.setCountryState(queryParameter5);
                                        if (!TextUtils.isEmpty(queryParameter9)) {
                                            loginInfo.setExpiration(Long.parseLong(queryParameter9));
                                        }
                                        loginInfo.setRefresh(queryParameter8);
                                        if (!TextUtils.isEmpty(queryParameter7) && Configs.supportSubEnable) {
                                            loginInfo.setOauthId(queryParameter7);
                                        }
                                        loginInfo.setLastUpdateTtl(System.currentTimeMillis());
                                        if (Keeper.setLoginInfo(MailService.this.mContext, loginInfo) & true) {
                                            ApiResult.onSuccessCallback(this.val$callback, loginInfo);
                                            return;
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    r4 = str;
                                    e.printStackTrace();
                                    r5 = r4;
                                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode((String) r5, ""));
                                    return;
                                }
                            } else {
                                str = ErrorCode.INNER_HANDLE_ERROR;
                            }
                        }
                        String str3 = str;
                        ApiResult.onErrorCallback(this.val$callback, new ErrorCode(str3, "location is empty"));
                        r4 = str3;
                    } else {
                        r4 = ErrorCode.INNER_HANDLE_ERROR;
                        ApiResult.onErrorCallback(this.val$callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4SigninRsp(networkResponse.statusCode)));
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                r4 = ErrorCode.INNER_HANDLE_ERROR;
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.MailService$8, reason: invalid class name */
    public class AnonymousClass8 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass8(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0(String str) {
            return "Content type:" + str;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            try {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse == null) {
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                    return;
                }
                WebAPI.debugInfo(networkResponse);
                Map<String, String> map = networkResponse.headers;
                if (map != null) {
                    final String str = map.get("Content-Type");
                    HMLog.debug(new Function0() { // from class: com.huami.passport.api.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MailService.AnonymousClass8.lambda$onErrorResponse$0(str);
                        }
                    });
                }
                ApiResult.onErrorCallback(this.val$callback, new ErrorCode(String.valueOf(networkResponse.statusCode), ErrorMsg.mapErrMsg4ResetPasswordRsp(networkResponse.statusCode)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MailService(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static String getResendConfirmationUrl(Context context, String str, String str2, String str3, String str4) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
            if (!TextUtils.isEmpty(str3)) {
                str3 = URLEncoder.encode(str3, "UTF-8");
            }
            str4 = URLEncoder.encode(str4, "UTF-8");
            if (!TextUtils.isEmpty(str2)) {
                str2 = URLEncoder.encode(str2, "UTF-8");
            }
        } catch (Exception unused) {
        }
        final String str5 = String.format(HttpDnsCache.getIdUrl(context) + Configs.PATH.RESEND_CONFIRMATION_1, str, str3, str4);
        if (Configs.supportSubEnable && !TextUtils.isEmpty(str2)) {
            str5 = String.format(HttpDnsCache.getIdUrl(context) + Configs.PATH.RESEND_CONFIRMATION, str, str2, str3, str4);
        }
        HMLog.debug(new Function0() { // from class: hu4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MailService.lambda$getResendConfirmationUrl$8(str5);
            }
        });
        return str5;
    }

    public static String getResetPasswordUrl(Context context, String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            HMLog.error(new Function0() { // from class: lu4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MailService.lambda$getResetPasswordUrl$6();
                }
            });
            return null;
        }
        try {
            Uri.Builder builderBuildUpon = Uri.parse(String.format(HttpDnsCache.getIdUrl(context) + Configs.PATH.RESET_PASSWORD, URLEncoder.encode(str, "UTF-8"))).buildUpon();
            if (Configs.supportSubEnable && !TextUtils.isEmpty(str2)) {
                builderBuildUpon.appendQueryParameter("sub", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                builderBuildUpon.appendQueryParameter("region", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                builderBuildUpon.appendQueryParameter(Configs.Params.MARKETING, str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                builderBuildUpon.appendQueryParameter("code", str5);
            }
            final String string = builderBuildUpon.toString();
            HMLog.debug(new Function0() { // from class: gu4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MailService.lambda$getResetPasswordUrl$7(string);
                }
            });
            return string;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getUrlByEmail(Context context, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
        } catch (Exception unused) {
        }
        final String str3 = String.format(HttpDnsCache.getIdUrl(context) + str, str2);
        HMLog.debug(new Function0() { // from class: ju4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MailService.lambda$getUrlByEmail$5(str3);
            }
        });
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$changePassword$3(String str, String str2, String str3, String str4, String str5) {
        return "[POST] changePassword userName:" + str + " password:" + str2 + " newPassword:" + str3 + " region:" + str4 + " sub:" + str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$changeUserName$9(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$checkUserNameStatus$0(String str) {
        return "[GET] checkuserNameAddress mail:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getResendConfirmationUrl$8(String str) {
        return "getResendConfirmationUrl:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getResetPasswordUrl$6() {
        return "getResetPasswordUrl-->userName is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getResetPasswordUrl$7(String str) {
        return "getResetPasswordUrl " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getUrlByEmail$5(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registrations$1(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$resendConfirmation$4(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$resetPassword$2(String str) {
        return str;
    }

    public void changePassword(final String str, final String str2, final String str3, final String str4, String str5, final IAccount.Callback<String, ErrorCode> callback, String str6) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = IAuthService.REGION.US_WEST_2;
        }
        final String str7 = str5;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, ""));
            return;
        }
        HashMap map = new HashMap();
        map.put(Configs.Params.OLD, str3);
        map.put("new", str4);
        map.put("region", str7);
        if (!TextUtils.isEmpty(str6)) {
            map.put("code", str6);
        }
        if (!TextUtils.isEmpty(str2) && Configs.supportSubEnable) {
            map.put("sub", str2);
        }
        HMLog.debug(new Function0() { // from class: ku4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MailService.lambda$changePassword$3(str, str3, str4, str7, str2);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByEmail(this.mContext, Configs.PATH.CHANGE_PASSWORD, str), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.MailService.9
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                if (i == 200) {
                    ApiResult.onSuccessCallback(callback, String.valueOf(i));
                } else {
                    ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4ChangePasswordRsp(networkResponse.statusCode)));
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.api.MailService.10
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                try {
                    NetworkResponse networkResponse = volleyError.networkResponse;
                    if (networkResponse == null) {
                        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                    } else {
                        WebAPI.debugInfo(networkResponse);
                        ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(networkResponse.statusCode), ErrorMsg.mapErrMsg4ChangePasswordRsp(networkResponse.statusCode)));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        restfulRequest.setParams(map);
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setInstanceFollowRedirects(false);
        restfulRequest.setShouldCache(false);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    @Override // com.huami.passport.user.IAuthService
    public void changeUserName(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, final IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, ""));
            return;
        }
        if (TextUtils.isEmpty(str6)) {
            str6 = Locale.getDefault().getCountry();
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = IAuthService.REGION.US_WEST_2;
        }
        if (TextUtils.isEmpty(str7)) {
            str7 = IAuthService.MARKETING.AMAZFIT;
        }
        HashMap map = new HashMap();
        map.put("password", str3);
        map.put("new", str2);
        map.put("region", str5);
        if (TextUtils.isEmpty(str6)) {
            str6 = "unknown";
        }
        map.put("country_code", str6);
        map.put(Configs.Params.MARKETING, str7);
        if (!TextUtils.isEmpty(str4) && Configs.supportSubEnable) {
            map.put("sub", str4);
        }
        if (!TextUtils.isEmpty(str8)) {
            map.put(Configs.Params.CAPTCHA, str8);
        }
        if (!TextUtils.isEmpty(str9)) {
            map.put("code", str9);
        }
        final String str10 = "[POST] changeEmailAddress email:" + str + " newEmail:" + str2 + " password:" + str3 + " region:" + str5 + " marketing:" + str7 + " captcha:" + str8 + " sub:" + str4 + " code:" + str9;
        HMLog.debug(new Function0() { // from class: iu4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MailService.lambda$changeUserName$9(str10);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByEmail(this.mContext, Configs.PATH.CHANGE_URL, str), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.MailService.13
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                if (i == 202) {
                    ApiResult.onSuccessCallback(callback, String.valueOf(i));
                } else {
                    ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4ChangeRsp(networkResponse.statusCode)));
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.api.MailService.14
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                try {
                    NetworkResponse networkResponse = volleyError.networkResponse;
                    if (networkResponse == null) {
                        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                    } else {
                        WebAPI.debugInfo(networkResponse);
                        ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(networkResponse.statusCode), ErrorMsg.mapErrMsg4ChangeRsp(networkResponse.statusCode)));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        restfulRequest.setParams(map);
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setInstanceFollowRedirects(false);
        restfulRequest.setShouldCache(false);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    @Override // com.huami.passport.user.IAuthService
    public void checkUserNameStatus(final String str, String str2, final IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "mail is null"));
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = Locale.getDefault().getCountry();
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
        }
        HMLog.debug(new Function0() { // from class: du4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MailService.lambda$checkUserNameStatus$0(str);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(0, buildUrlByParams(Configs.PATH.CHECK_BY_EMAIL_PHONE, this.mContext, str, str2), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.MailService.1
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                if (i == 200 || i == 202) {
                    ApiResult.onSuccessCallback(callback, String.valueOf(i));
                } else {
                    ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4SignupRsp(networkResponse)));
                }
            }
        }, new AnonymousClass2(callback));
        restfulRequest.setShouldCache(false);
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    @Override // com.huami.passport.user.IMailService
    public void getCaptcha(String str, final IAccount.Callback<byte[], ErrorCode> callback) {
        RestfulRequest restfulRequest = new RestfulRequest(0, HttpDnsCache.getIdUrl(this.mContext) + String.format(Configs.PATH.CAPTCHA_URL, str), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.MailService.15
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                if (i == 200) {
                    ApiResult.onSuccessCallback(callback, networkResponse.data);
                } else {
                    ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4SignupRsp(networkResponse)));
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.api.MailService.16
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                try {
                    NetworkResponse networkResponse = volleyError.networkResponse;
                    if (networkResponse != null) {
                        WebAPI.debugInfo(networkResponse);
                        ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(networkResponse.statusCode), ErrorMsg.mapErrMsg4CaptchaRsp(networkResponse.statusCode)));
                    } else {
                        volleyError.printStackTrace();
                        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, "netword exception"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        restfulRequest.setShouldCache(false);
        restfulRequest.addHeaders("Accept", IMAGE_JPG_TYPE);
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    @Override // com.huami.passport.user.IMailService
    public LoginInfo getCurrentLoginInfo() {
        return Keeper.getLoginInfo(this.mContext);
    }

    @Override // com.huami.passport.user.IAuthService
    public LoginInfo getLoginInfo(Context context) {
        return Keeper.getLoginInfo(context);
    }

    @Override // com.huami.passport.user.IAuthService
    public void getOAuthUser(String str, String str2, String str3, String str4, IAccount.Callback<OAuthUser, ErrorCode> callback) {
        LoginServiceAPI.getOAuthUser(this.mContext, str, str2, str3, str4, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(String str, String str2, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        login(str, str2, null, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public LoginInfo refreshToken(String str, String str2, String str3, String str4) {
        return LoginServiceAPI.refreshToken(this.mContext, str, str2, str3, str4);
    }

    @Override // com.huami.passport.user.IAuthService
    public void registrations(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        registrations(str, str2, str3, str5, str4, null, null, str7, str8, null, callback);
    }

    @Override // com.huami.passport.user.IMailService
    public void resendConfirmation(String str, String str2, String str3, String str4, final IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "userName is null"));
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = IAuthService.REGION.US_WEST_2;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = IAuthService.MARKETING.AMAZFIT;
        }
        final String str5 = "[GET] resendConfirmation sub:" + str2 + " emailAddress:" + str + " marketing:" + str3 + " region:" + str4;
        HMLog.debug(new Function0() { // from class: fu4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MailService.lambda$resendConfirmation$4(str5);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(1, getResendConfirmationUrl(this.mContext, str, str2, str3, str4), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.MailService.11
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                if (i == 202 || i == 200) {
                    ApiResult.onSuccessCallback(callback, String.valueOf(i));
                } else {
                    ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4ResendConfirmationRsp(networkResponse.statusCode)));
                }
            }
        }, new AnonymousClass12(callback));
        restfulRequest.setShouldCache(false);
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    public void resetPassword(String str, String str2, String str3, String str4, String str5, final IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "userName is null"));
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = IAuthService.REGION.US_WEST_2;
        }
        String str6 = str3;
        if (TextUtils.isEmpty(str4)) {
            str4 = IAuthService.MARKETING.AMAZFIT;
        }
        String str7 = str4;
        final String str8 = "[DELETE] resetPassword email:" + str + " sub:" + str2 + " region:" + str6 + " marketing:" + str7;
        HMLog.debug(new Function0() { // from class: cu4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MailService.lambda$resetPassword$2(str8);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(3, getResetPasswordUrl(this.mContext, str, str2, str6, str7, str5), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.MailService.7
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                if (i == 202 || i == 200) {
                    ApiResult.onSuccessCallback(callback, String.valueOf(i));
                } else {
                    ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4ResetPasswordRsp(networkResponse.statusCode)));
                }
            }
        }, new AnonymousClass8(callback));
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setShouldCache(false);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(String str, String str2, String str3, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        login(str, str2, null, null, null, null, null, null, null, null, null, str3, callback);
    }

    @Override // com.huami.passport.user.IMailService
    public void registrations(String str, String str2, String str3, String str4, String str5, String[] strArr, String str6, String str7, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        registrations(str, str2, str3, str4, str5, strArr, str6, str7, null, null, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(String str, String str2, String str3, String str4, String[] strArr, String str5, String str6, String str7, String str8, String str9, String str10, String str11, final IAccount.Callback<LoginInfo, ErrorCode> callback) {
        String[] strArr2 = strArr;
        String str12 = str10;
        if (callback == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String country = TextUtils.isEmpty(str11) ? Locale.getDefault().getCountry() : str11;
            String str13 = TextUtils.isEmpty(str3) ? IAuthService.STATE.REDIRECTION : str3;
            String str14 = TextUtils.isEmpty(str4) ? "HuaMi" : str4;
            String str15 = TextUtils.isEmpty(str5) ? IAuthService.REGION.US_WEST_2 : str5;
            if (strArr2 == null || strArr2.length == 0) {
                strArr2 = new String[]{"access", "refresh"};
            }
            RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByEmail(this.mContext, Configs.PATH.LOGIN, str), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.MailService.5
                @Override // com.android.volley.Response.Listener
                public void onResponse(NetworkResponse networkResponse) {
                    try {
                        WebAPI.debugInfo(networkResponse);
                        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, new AnonymousClass6(str12, callback));
            restfulRequest.addParams("state", str13);
            restfulRequest.addParams("client_id", str14);
            restfulRequest.addParams("password", str2);
            if (str12 == null) {
                str12 = IAuthService.REDIRECT.DEFAULT_REDIRECT_URI;
            }
            restfulRequest.addParams("redirect_uri", str12);
            restfulRequest.addParams("region", str15);
            for (String str16 : strArr2) {
                restfulRequest.addParams("token", str16);
            }
            if (!TextUtils.isEmpty(str9) && Configs.supportSubEnable) {
                restfulRequest.addParams("sub", str9);
            }
            if (!TextUtils.isEmpty(str6)) {
                restfulRequest.addParams("scope", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                restfulRequest.addParams(Configs.Params.OBJECTS, str7);
            }
            if (!TextUtils.isEmpty(str8)) {
                restfulRequest.addParams(Configs.Params.PROPERTIES, str8);
            }
            if (TextUtils.isEmpty(country)) {
                country = "unknown";
            }
            restfulRequest.addParams("country_code", country);
            restfulRequest.setInstanceFollowRedirects(false);
            restfulRequest.addSystemParams(this.mContext);
            restfulRequest.setShouldCache(false);
            restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
            RequestQueueHolder.addRequest(this.mContext, restfulRequest);
            return;
        }
        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "userName or password is null"));
    }

    public void registrations(String str, String str2, String str3, String str4, String str5, String[] strArr, String str6, String str7, String str8, String str9, final IAccount.Callback<LoginInfo, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str7)) {
                str7 = Locale.getDefault().getCountry();
            }
            if (strArr == null || strArr.length == 0) {
                strArr = new String[]{"access", "refresh"};
            }
            if (TextUtils.isEmpty(str6)) {
                str6 = IAuthService.REDIRECT.DEFAULT_REDIRECT_URI;
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = IAuthService.REGION.US_WEST_2;
            }
            if (TextUtils.isEmpty(str5)) {
                str5 = IAuthService.MARKETING.AMAZFIT;
            }
            final String str10 = "[POST] registrations userName:" + str2 + " redirectUri:" + str6 + " token:" + strArr.length + " marketing:" + str5;
            HMLog.debug(new Function0() { // from class: eu4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MailService.lambda$registrations$1(str10);
                }
            });
            RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByEmail(this.mContext, Configs.PATH.REGIST_BY_EMAIL_PHONE, str2), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.MailService.3
                @Override // com.android.volley.Response.Listener
                public void onResponse(NetworkResponse networkResponse) {
                    try {
                        WebAPI.debugInfo(networkResponse);
                        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, new AnonymousClass4(str6, callback));
            if (!TextUtils.isEmpty(str9)) {
                restfulRequest.addParams("code", str9);
            }
            restfulRequest.addParams("client_id", "HuaMi");
            restfulRequest.addParams("password", str3);
            restfulRequest.addParams("redirect_uri", str6);
            restfulRequest.addParams("region", str4);
            restfulRequest.addParams(Configs.Params.MARKETING, str5);
            if (TextUtils.isEmpty(str7)) {
                str7 = "unknown";
            }
            restfulRequest.addParams("country_code", str7);
            if (Configs.emailFaceSubscribe) {
                restfulRequest.addParams("subscriptions", Configs.Params.MARKETING);
            }
            if (!TextUtils.isEmpty(str)) {
                restfulRequest.addParams("name", str);
            }
            if (!TextUtils.isEmpty(str8)) {
                restfulRequest.addParams(Configs.Params.COUNTRY_STATE, str8);
            }
            restfulRequest.addParams("state", IAuthService.STATE.REDIRECTION);
            for (String str11 : strArr) {
                restfulRequest.addParams("token", str11);
            }
            restfulRequest.setInstanceFollowRedirects(false);
            restfulRequest.setShouldCache(false);
            restfulRequest.addSystemParams(this.mContext);
            restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
            RequestQueueHolder.addRequest(this.mContext, restfulRequest);
            return;
        }
        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "params is null"));
    }

    @Override // com.huami.passport.user.IAuthService
    @Deprecated
    public void checkUserNameStatus(String str, IAccount.Callback<String, ErrorCode> callback) {
        checkUserNameStatus(str, Locale.getDefault().getCountry(), callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void resendConfirmation(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback) {
        resendConfirmation(str, null, str2, str3, callback);
    }

    @Override // com.huami.passport.user.IMailService
    public void resetPassword(String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback) {
        resetPassword(str, str2, str3, str4, null, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void resetPassword(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback) {
        resetPassword(str, null, str2, str3, callback);
    }

    @Override // com.huami.passport.user.IMailService
    public void changePassword(String str, String str2, String str3, String str4, String str5, IAccount.Callback<String, ErrorCode> callback) {
        changePassword(str, str2, str3, str4, str5, callback, (String) null);
    }

    @Override // com.huami.passport.user.IAuthService
    public void changePassword(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<String, ErrorCode> callback) {
        changePassword(str, str2, str3, str4, str5, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    @Deprecated
    public void changeUserName(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<String, ErrorCode> callback) {
        changeUserName(str, str2, str3, null, str4, null, str5, str6, null, callback);
    }

    @Override // com.huami.passport.user.IMailService
    @Deprecated
    public void login(String str, String str2, String str3, String str4, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        login(str, str2, null, null, null, str4, null, null, null, str3, null, null, callback);
    }

    @Override // com.huami.passport.user.IMailService
    @Deprecated
    public void registrations(String str, String str2, String str3, String str4, String str5, String[] strArr, String str6, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        registrations(str, str2, str3, str4, str5, strArr, str6, (String) null, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    @Deprecated
    public void registrations(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        registrations(str, str2, str3, str5, str4, "access", IAuthService.REDIRECT.DEFAULT_REDIRECT_URI, (String) null, callback);
    }
}
