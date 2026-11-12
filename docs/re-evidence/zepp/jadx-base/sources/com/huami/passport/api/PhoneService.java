package com.huami.passport.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.PhoneService;
import com.huami.passport.api.error.ErrorMsg;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.Message;
import com.huami.passport.entity.OAuthUser;
import com.huami.passport.entity.SmsCode;
import com.huami.passport.net.RequestQueueHolder;
import com.huami.passport.net.RestfulRequest;
import com.huami.passport.net.WebAPI;
import com.huami.passport.user.IAuthService;
import com.huami.passport.user.IPhoneService;
import com.huami.passport.user.Keeper;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class PhoneService extends BaseUserService implements IPhoneService {
    private static final int INVALID_PASSWORD = 400;
    private static final int MANY_REQUESTS = 429;
    private static final int SUCCESS = 200;
    private static final int SUCCESS_ACCEPTED = 202;
    private Context mContext;

    /* JADX INFO: renamed from: com.huami.passport.api.PhoneService$14, reason: invalid class name */
    public class AnonymousClass14 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass14(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0() {
            return "[GET] checkSmsBinding error";
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            try {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse == null) {
                    HMLog.error(new Function0() { // from class: com.huami.passport.api.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PhoneService.AnonymousClass14.lambda$onErrorResponse$0();
                        }
                    });
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                } else {
                    PhoneService.this.smsBindingParser(networkResponse, this.val$callback);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.PhoneService$16, reason: invalid class name */
    public class AnonymousClass16 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass16(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0() {
            return "[GET] checkSmsBinding error";
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            try {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse == null) {
                    HMLog.error(new Function0() { // from class: com.huami.passport.api.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PhoneService.AnonymousClass16.lambda$onErrorResponse$0();
                        }
                    });
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                } else {
                    PhoneService.this.smsVerifyParser(networkResponse, this.val$callback);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.PhoneService$2, reason: invalid class name */
    public class AnonymousClass2 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$redirect;

        public AnonymousClass2(String str, IAccount.Callback callback) {
            this.val$redirect = str;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0(String str) {
            return "location:" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$1(String str, String str2, String str3, String str4, String str5, String str6) {
            return "successsignin state " + str + " region " + str2 + " token " + str3 + " sub " + str4 + " refresh " + str5 + " expiration " + str6;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00dd  */
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
                        if (i == 400 || i == 401) {
                            ErrorCode errorCode = null;
                            try {
                                errorCode = (ErrorCode) new Gson().fromJson(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers)), ErrorCode.class);
                            } catch (Exception unused) {
                            }
                            if (errorCode != null) {
                                code = errorCode.getCode();
                            }
                        }
                        int i2 = networkResponse.statusCode;
                        if (i2 == 400) {
                            objValueOf = networkResponse.statusCode + ":" + code;
                        } else {
                            objValueOf = Integer.valueOf(i2);
                        }
                        ErrorCode errorCode2 = new ErrorCode(String.valueOf(objValueOf), ErrorMsg.mapErrMsg4SignupRsp(networkResponse));
                        errorCode2.setCode(code);
                        ApiResult.onErrorCallback(this.val$callback, errorCode2);
                        return;
                    }
                    Map<String, String> map = networkResponse.headers;
                    if (map != null) {
                        final String str3 = map.get("Location");
                        HMLog.debug(new Function0() { // from class: com.huami.passport.api.p
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PhoneService.AnonymousClass2.lambda$onErrorResponse$0(str3);
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
                            String queryParameter5 = uri.getQueryParameter(Configs.Params.COUNTRY_STATE);
                            final String queryParameter6 = uri.getQueryParameter("access");
                            final String queryParameter7 = uri.getQueryParameter("sub");
                            final String queryParameter8 = uri.getQueryParameter("refresh");
                            final String queryParameter9 = uri.getQueryParameter(Configs.Params.EXPIRATION);
                            str2 = "";
                            try {
                                HMLog.debug(new Function0() { // from class: com.huami.passport.api.q
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PhoneService.AnonymousClass2.lambda$onErrorResponse$1(queryParameter2, queryParameter3, queryParameter6, queryParameter7, queryParameter8, queryParameter9);
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
                                    loginInfo.setLastUpdateTtl(System.currentTimeMillis());
                                    if (Keeper.setLoginInfo(PhoneService.this.mContext, loginInfo) & true) {
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

    /* JADX INFO: renamed from: com.huami.passport.api.PhoneService$4, reason: invalid class name */
    public class AnonymousClass4 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass4(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0(String str) {
            return "Content type:" + str;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            NetworkResponse networkResponse = volleyError.networkResponse;
            if (networkResponse == null) {
                ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                return;
            }
            Map<String, String> map = networkResponse.headers;
            if (map != null) {
                final String str = map.get("Content-Type");
                HMLog.debug(new Function0() { // from class: com.huami.passport.api.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhoneService.AnonymousClass4.lambda$onErrorResponse$0(str);
                    }
                });
            }
            PhoneService.this.responseParser(networkResponse, this.val$callback);
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.PhoneService$6, reason: invalid class name */
    public class AnonymousClass6 implements Response.ErrorListener {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$redirectUrl;

        public AnonymousClass6(String str, IAccount.Callback callback) {
            this.val$redirectUrl = str;
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

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$2() {
            return "phone user -->login error";
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            try {
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse != null) {
                    WebAPI.debugInfo(networkResponse);
                    int i = networkResponse.statusCode;
                    if (i != 303) {
                        ApiResult.onErrorCallback(this.val$callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4SigninRsp(networkResponse.statusCode)));
                        return;
                    }
                    Map<String, String> map = networkResponse.headers;
                    final String str = map != null ? map.get("Location") : null;
                    if (!TextUtils.isEmpty(str)) {
                        HMLog.debug(new Function0() { // from class: com.huami.passport.api.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PhoneService.AnonymousClass6.lambda$onErrorResponse$0(str);
                            }
                        });
                        Uri uri = Uri.parse(str);
                        if ((this.val$redirectUrl == null && str.contains(IAuthService.REDIRECT.DEFAULT_REDIRECT_URI)) || str.contains(this.val$redirectUrl)) {
                            String queryParameter = uri.getQueryParameter("error");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                ErrorCode errorCode = new ErrorCode(queryParameter, ErrorMsg.mapErrMsg4SigninRsp(networkResponse.statusCode));
                                errorCode.setExtras(str);
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
                            HMLog.debug(new Function0() { // from class: com.huami.passport.api.t
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PhoneService.AnonymousClass6.lambda$onErrorResponse$1(queryParameter2, queryParameter3, queryParameter6, queryParameter7, queryParameter8, queryParameter9);
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
                                loginInfo.setLastUpdateTtl(System.currentTimeMillis());
                                loginInfo.setRefresh(queryParameter8);
                                if (Keeper.setLoginInfo(PhoneService.this.mContext, loginInfo) & true) {
                                    ApiResult.onSuccessCallback(this.val$callback, loginInfo);
                                    return;
                                }
                            }
                        }
                    }
                    HMLog.error(new Function0() { // from class: com.huami.passport.api.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PhoneService.AnonymousClass6.lambda$onErrorResponse$2();
                        }
                    });
                    ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, "location is empty"));
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.PhoneService$8, reason: invalid class name */
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
            NetworkResponse networkResponse;
            if (volleyError == null || (networkResponse = volleyError.networkResponse) == null) {
                ApiResult.onErrorCallback(this.val$callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, "network is error"));
                return;
            }
            Map<String, String> map = networkResponse.headers;
            if (map != null) {
                final String str = map.get("Content-Type");
                HMLog.debug(new Function0() { // from class: com.huami.passport.api.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhoneService.AnonymousClass8.lambda$onErrorResponse$0(str);
                    }
                });
            }
            PhoneService.this.responseParser(networkResponse, this.val$callback);
        }
    }

    public PhoneService(Context context) {
        this.mContext = context;
    }

    public static String getResetPasswordUrl(Context context, String str, String str2, String str3) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
            if (!TextUtils.isEmpty(str2)) {
                str2 = URLEncoder.encode(str2, "UTF-8");
            }
            if (!TextUtils.isEmpty(str3)) {
                str3 = URLEncoder.encode(str3, "UTF-8");
            }
        } catch (Exception unused) {
        }
        final String str4 = String.format(HttpDnsCache.getIdUrl(context) + Configs.PATH.RESET_PASSWORD_1, str, str2, str3);
        HMLog.debug(new Function0() { // from class: sx5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$getResetPasswordUrl$7(str4);
            }
        });
        return str4;
    }

    private String getUrlByPhoneNumber(Context context, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
        } catch (Exception unused) {
        }
        final String str3 = String.format(HttpDnsCache.getIdUrl(this.mContext) + str, str2);
        HMLog.debug(new Function0() { // from class: hy5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$getUrlByPhoneNumber$3(str3);
            }
        });
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$changePassword$11(String str, String str2, String str3, String str4, String str5, String str6) {
        return "[POST] changePassword userName:" + str + " sub:" + str2 + " password:" + str3 + " newPassword:" + str4 + " region:" + str5 + " code:" + str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$changeUserName$10(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return "[POST] changeUserName phone:" + str + " newUserName:" + str2 + " password:" + str3 + " region:" + str4 + " marketing:" + str5 + " captcha:" + str6 + " code:" + str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$checkSmsBinding$13(String str) {
        return "[GET] checkSmsBinding userName:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$checkUserNameStatus$2(String str) {
        return "[GET] checkPhoneStatus userName:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getLoginInfo$4(LoginInfo loginInfo) {
        return "getLoginInfo " + loginInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getResetPasswordUrl$7(String str) {
        return "getResetPasswordUrl " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getUrlByPhoneNumber$3(String str) {
        return "getUrlByPhoneNumber " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$login$5(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$login$6(int i, String str) {
        return "token[" + i + "] = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$parserMessage$12(NetworkResponse networkResponse, String str) {
        return "DebugInfo statusCode:" + networkResponse.statusCode + "Header:" + Utils.encodeParameters(networkResponse.headers) + " Body:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registrations$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registrations$1(int i, String str) {
        return "token[" + i + "] = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$resendConfirmation$9(String str) {
        return "[phone] resendConfirmation not support userName = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$resetPassword$8(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$smsVerifyParser$16() {
        return "smsVerifyParser error | response is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$smsVerifyParser$17(int i) {
        return "smsVerifyParser error ->" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$smsVerifyParser$18(NetworkResponse networkResponse, String str) {
        return "DebugInfo statusCode:" + networkResponse.statusCode + "Header:" + Utils.encodeParameters(networkResponse.headers) + " Body:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$verfyCode$14(String str, String str2) {
        return "verfyCode->param is:" + str + " code:" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$verfyCode$15(String str, String str2, String str3) {
        return "[GET] verfyCode userName:" + str + " ,codeType:" + str2 + " ,code:" + str3;
    }

    private Message parserMessage(final NetworkResponse networkResponse) {
        try {
            final String str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
            HMLog.debug(new Function0() { // from class: ey5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneService.lambda$parserMessage$12(networkResponse, str);
                }
            });
            return (Message) new Gson().fromJson(str, Message.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void responseParser(NetworkResponse networkResponse, IAccount.Callback<String, ErrorCode> callback) {
        WebAPI.debugInfo(networkResponse);
        int i = networkResponse.statusCode;
        if (i == 202 || i == 200) {
            ApiResult.onSuccessCallback(callback, String.valueOf(i));
            return;
        }
        Message message = parserMessage(networkResponse);
        if (i != 429 || message == null) {
            ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4ResetPasswordRsp(i)));
        } else {
            ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void smsBindingParser(NetworkResponse networkResponse, IAccount.Callback<Message, ErrorCode> callback) {
        int i = networkResponse.statusCode;
        if (i != 200 && i != 400 && i != 429) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.LOGIN_SERVER_INNER_ERROR, ""));
            return;
        }
        Message message = parserMessage(networkResponse);
        if (message == null) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
        } else if (i == 429) {
            ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), message));
        } else {
            ApiResult.onSuccessCallback(callback, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void smsVerifyParser(final NetworkResponse networkResponse, IAccount.Callback<SmsCode, ErrorCode> callback) {
        if (networkResponse == null && callback != null) {
            HMLog.error(new Function0() { // from class: ay5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneService.lambda$smsVerifyParser$16();
                }
            });
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, "smsVerifyError:" + networkResponse));
            return;
        }
        final int i = networkResponse.statusCode;
        if (i == 401) {
            ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), "invalid code"));
            HMLog.error(new Function0() { // from class: rx5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneService.lambda$smsVerifyParser$17(i);
                }
            });
            return;
        }
        SmsCode smsCode = null;
        if (i == 200) {
            try {
                final String str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
                HMLog.debug(new Function0() { // from class: dy5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhoneService.lambda$smsVerifyParser$18(networkResponse, str);
                    }
                });
                smsCode = (SmsCode) new Gson().fromJson(str, SmsCode.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (smsCode == null) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, "smsVerifyParser"));
        } else {
            ApiResult.onSuccessCallback(callback, smsCode);
        }
    }

    @Override // com.huami.passport.user.IAuthService
    public void changePassword(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str6)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, ""));
            return;
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str3)) {
            map.put(Configs.Params.OLD, str3);
        }
        map.put(Configs.Params.RESET, str6);
        map.put("new", str4);
        if (!TextUtils.isEmpty(str2)) {
            map.put("sub", str2);
        }
        if (!TextUtils.isEmpty(str5)) {
            map.put("region", str5);
        }
        HMLog.debug(new Function0() { // from class: yx5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$changePassword$11(str, str2, str3, str4, str5, str6);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByPhoneNumber(this.mContext, Configs.PATH.CHANGE_PASSWORD, str), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.PhoneService.11
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
        }, new Response.ErrorListener() { // from class: com.huami.passport.api.PhoneService.12
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
    public void changeUserName(final String str, final String str2, final String str3, String str4, final String str5, String str6, final String str7, final String str8, final String str9, final IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, ""));
            return;
        }
        String country = TextUtils.isEmpty(str6) ? Locale.getDefault().getCountry() : str6;
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str3)) {
            map.put("password", str3);
        }
        map.put("new", str2);
        if (TextUtils.isEmpty(country)) {
            country = "unknown";
        }
        map.put("country_code", country);
        if (!TextUtils.isEmpty(str5)) {
            map.put("region", str5);
        }
        if (!TextUtils.isEmpty(str7)) {
            map.put(Configs.Params.MARKETING, str7);
        }
        if (!TextUtils.isEmpty(str8)) {
            map.put(Configs.Params.CAPTCHA, str8);
        }
        if (!TextUtils.isEmpty(str9)) {
            map.put("code", str9);
        }
        HMLog.debug(new Function0() { // from class: zx5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$changeUserName$10(str, str2, str3, str5, str7, str8, str9);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByPhoneNumber(this.mContext, Configs.PATH.CHANGE_URL, str), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.PhoneService.9
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
        }, new Response.ErrorListener() { // from class: com.huami.passport.api.PhoneService.10
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

    public void checkSmsBinding(final String str, String str2, final IAccount.Callback<Message, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "userName is null"));
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = Locale.getDefault().getCountry();
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
        }
        HMLog.debug(new Function0() { // from class: tx5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$checkSmsBinding$13(str);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(0, buildUrlByParams(Configs.PATH.CHECK_SMS_BINDING, this.mContext, str, str2), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.PhoneService.13
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                PhoneService.this.smsBindingParser(networkResponse, callback);
            }
        }, new AnonymousClass14(callback));
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setShouldCache(false);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    @Override // com.huami.passport.user.IAuthService
    public void checkUserNameStatus(String str, IAccount.Callback<String, ErrorCode> callback) {
        checkUserNameStatus(str, Locale.getDefault().getCountry(), callback);
    }

    @Override // com.huami.passport.user.IPhoneService
    public LoginInfo getCurrentLoginInfo() {
        return getLoginInfo();
    }

    @Override // com.huami.passport.user.IPhoneService
    public String getLastLoginPhone() {
        return null;
    }

    @Override // com.huami.passport.user.IPhoneService
    public LoginInfo getLoginInfo(String str) {
        return getLoginInfo();
    }

    @Override // com.huami.passport.user.IAuthService
    public void getOAuthUser(String str, String str2, String str3, String str4, IAccount.Callback<OAuthUser, ErrorCode> callback) {
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(String str, String str2, String str3, String str4, String[] strArr, String str5, String str6, String str7, String str8, String str9, String str10, String str11, final IAccount.Callback<LoginInfo, ErrorCode> callback) {
        LoginInfo loginInfo;
        String[] strArr2 = strArr;
        String str12 = str10;
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, ""));
            return;
        }
        String str13 = TextUtils.isEmpty(str3) ? IAuthService.STATE.REDIRECTION : str3;
        String str14 = TextUtils.isEmpty(str4) ? "HuaMi" : str4;
        String country = TextUtils.isEmpty(str11) ? Locale.getDefault().getCountry() : str11;
        if (strArr2 == null || strArr2.length == 0) {
            strArr2 = new String[]{"access", "refresh"};
        }
        String region = (!TextUtils.isEmpty(str5) || (loginInfo = getLoginInfo(str)) == null) ? str5 : loginInfo.getRegion();
        final String str15 = "[POST] login userName:" + str + " ,password: ,state:" + str13 + " ,clientId:" + str14 + " ,region:" + region + " ,scope:" + str6 + " ,objects:" + str7 + " ,properties:" + str8 + " ,redirectUri:" + str12;
        HMLog.debug(new Function0() { // from class: vx5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$login$5(str15);
            }
        });
        int length = strArr2.length;
        for (final int i = 0; i < length; i++) {
            final String str16 = strArr2[i];
            HMLog.debug(new Function0() { // from class: cy5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneService.lambda$login$6(i, str16);
                }
            });
        }
        RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByPhoneNumber(this.mContext, Configs.PATH.LOGIN, str), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.PhoneService.5
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
        restfulRequest.addParams(Configs.Params.PHONE_NUMBER, str);
        restfulRequest.addParams("password", str2);
        restfulRequest.addParams("state", str13);
        restfulRequest.addParams("client_id", str14);
        if (TextUtils.isEmpty(country)) {
            country = "unknown";
        }
        restfulRequest.addParams("country_code", country);
        for (String str17 : strArr2) {
            restfulRequest.addParams("token", str17);
        }
        if (!TextUtils.isEmpty(region)) {
            restfulRequest.addParams("region", region);
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
        if (str12 == null) {
            str12 = IAuthService.REDIRECT.DEFAULT_REDIRECT_URI;
        }
        restfulRequest.addParams("redirect_uri", str12);
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setInstanceFollowRedirects(false);
        restfulRequest.setShouldCache(false);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    @Override // com.huami.passport.user.IAuthService
    public LoginInfo refreshToken(String str, String str2, String str3, String str4) {
        return null;
    }

    public void registrations(String str, String str2, String str3, String str4, String str5, IAccount.Callback callback) {
        registrations(str, str2, str3, null, null, null, null, str4, null, str5, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void resendConfirmation(final String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback) {
        if (callback != null) {
            HMLog.debug(new Function0() { // from class: iy5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneService.lambda$resendConfirmation$9(str);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.NOT_SUPPORT_ERROR));
        }
    }

    @Override // com.huami.passport.user.IAuthService
    public void resetPassword(String str, String str2, String str3, final IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, ""));
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = Locale.getDefault().getCountry();
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "HuaMi";
        }
        final String str4 = "[DELETE] resetPassword phoneNumber:" + str + " region:" + str2 + " marketing:" + str3;
        HMLog.debug(new Function0() { // from class: ux5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$resetPassword$8(str4);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(3, getResetPasswordUrl(this.mContext, str, str2, str3), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.PhoneService.7
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                PhoneService.this.responseParser(networkResponse, callback);
            }
        }, new AnonymousClass8(callback));
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setShouldCache(false);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    public void verfyCode(final String str, final String str2, final String str3, final IAccount.Callback<SmsCode, ErrorCode> callback) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            HMLog.error(new Function0() { // from class: wx5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneService.lambda$verfyCode$14(str2, str3);
                }
            });
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "verfyCode->param is null"));
            return;
        }
        HMLog.debug(new Function0() { // from class: xx5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$verfyCode$15(str, str2, str3);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(1, buildUrlByParams(Configs.PATH.SMS_VERIFY, this.mContext, str, str2), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.PhoneService.15
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                PhoneService.this.smsVerifyParser(networkResponse, callback);
            }
        }, new AnonymousClass16(callback));
        restfulRequest.addParams("code", str3);
        restfulRequest.addSystemParams(this.mContext);
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
            ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "userName is null"));
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = Locale.getDefault().getCountry();
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
        }
        HMLog.debug(new Function0() { // from class: jy5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$checkUserNameStatus$2(str);
            }
        });
        RestfulRequest restfulRequest = new RestfulRequest(0, buildUrlByParams(Configs.PATH.CHECK_BY_EMAIL_PHONE, this.mContext, str, str2), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.PhoneService.3
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                PhoneService.this.responseParser(networkResponse, callback);
            }
        }, new AnonymousClass4(callback));
        restfulRequest.addSystemParams(this.mContext);
        restfulRequest.setShouldCache(false);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(this.mContext, restfulRequest);
    }

    @Override // com.huami.passport.user.IPhoneService
    public LoginInfo getLoginInfo() {
        final LoginInfo loginInfo = Keeper.getLoginInfo(this.mContext);
        HMLog.debug(new Function0() { // from class: fy5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneService.lambda$getLoginInfo$4(loginInfo);
            }
        });
        return loginInfo;
    }

    public void registrations(String str, String str2, String str3, String str4, IAccount.Callback callback) {
        registrations(str, str2, str3, null, str4, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void registrations(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback callback) {
        registrations(str, str2, str3, str5, null, null, new String[]{"access", "refresh"}, str4, null, str6, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public LoginInfo getLoginInfo(Context context) {
        return Keeper.getLoginInfo(context);
    }

    @Override // com.huami.passport.user.IAuthService
    public void registrations(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, IAccount.Callback callback) {
        registrations(str, str2, str3, str5, null, null, null, str4, null, str6, str7, null, callback);
    }

    @Override // com.huami.passport.user.IPhoneService
    public void registrations(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, String str8, String str9, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        registrations(str, str2, str3, str4, str5, str6, strArr, str7, str8, str9, null, null, callback);
    }

    @Override // com.huami.passport.user.IPhoneService
    public void registrations(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, String str8, String str9, String str10, String str11, final IAccount.Callback<LoginInfo, ErrorCode> callback) {
        String str12 = str;
        String[] strArr2 = strArr;
        if (callback == null) {
            return;
        }
        String country = TextUtils.isEmpty(str10) ? Locale.getDefault().getCountry() : str10;
        String str13 = TextUtils.isEmpty(str5) ? IAuthService.STATE.REDIRECTION : str5;
        String str14 = TextUtils.isEmpty(str6) ? "HuaMi" : str6;
        if (strArr2 == null || strArr2.length == 0) {
            strArr2 = new String[]{"access", "refresh"};
        }
        boolean zIsEmpty = TextUtils.isEmpty(str8);
        String str15 = IAuthService.REDIRECT.DEFAULT_REDIRECT_URI;
        String str16 = zIsEmpty ? IAuthService.REDIRECT.DEFAULT_REDIRECT_URI : str8;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str9)) {
            final String str17 = "[POST] registrations nickName:" + str12 + " ,userName:" + str2 + " ,password:" + str3 + " ,region:" + str4 + " ,state:" + str13 + " ,clientId:" + str14 + " ,marketing:" + str7 + " ,redirectUri:" + str16 + " ,code:" + str9;
            HMLog.debug(new Function0() { // from class: gy5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneService.lambda$registrations$0(str17);
                }
            });
            final int i = 0;
            for (int length = strArr2.length; i < length; length = length) {
                String str18 = str15;
                final String str19 = strArr2[i];
                HMLog.debug(new Function0() { // from class: by5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhoneService.lambda$registrations$1(i, str19);
                    }
                });
                i++;
                str15 = str18;
            }
            String str20 = str15;
            RestfulRequest restfulRequest = new RestfulRequest(1, getUrlByPhoneNumber(this.mContext, Configs.PATH.REGIST_BY_EMAIL_PHONE, str2), new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.api.PhoneService.1
                @Override // com.android.volley.Response.Listener
                public void onResponse(NetworkResponse networkResponse) {
                    try {
                        WebAPI.debugInfo(networkResponse);
                        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.INNER_HANDLE_ERROR, ""));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, new AnonymousClass2(str16, callback));
            if (str12 == null) {
                str12 = "";
            }
            restfulRequest.addParams("name", str12);
            if (TextUtils.isEmpty(country)) {
                country = "unknown";
            }
            restfulRequest.addParams("country_code", country);
            restfulRequest.addParams("password", str3);
            if (!TextUtils.isEmpty(str4)) {
                restfulRequest.addParams("region", str4);
            }
            if (!TextUtils.isEmpty(str11)) {
                restfulRequest.addParams(Configs.Params.COUNTRY_STATE, str11);
            }
            restfulRequest.addParams("state", str13);
            restfulRequest.addParams("client_id", str14);
            if (!TextUtils.isEmpty(str7)) {
                restfulRequest.addParams(Configs.Params.MARKETING, str7);
            }
            if (TextUtils.isEmpty(str16)) {
                str16 = str20;
            }
            restfulRequest.addParams("redirect_uri", str16);
            for (String str21 : strArr2) {
                restfulRequest.addParams("token", str21);
            }
            restfulRequest.addParams("code", str9);
            restfulRequest.addSystemParams(this.mContext);
            restfulRequest.setInstanceFollowRedirects(false);
            restfulRequest.setShouldCache(false);
            restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
            RequestQueueHolder.addRequest(this.mContext, restfulRequest);
            return;
        }
        ApiResult.onErrorCallback(callback, new ErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR, "params is null"));
    }

    @Override // com.huami.passport.user.IPhoneService
    public void changePassword(String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback) {
        changePassword(str, null, null, str2, str3, str4, callback);
    }

    @Override // com.huami.passport.user.IPhoneService
    public void changePassword(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull IAccount.Callback<String, ErrorCode> callback) {
        changePassword(str, null, null, str2, null, str3, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    @Deprecated
    public void changeUserName(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<String, ErrorCode> callback) {
        LoginInfo loginInfo = getLoginInfo(str);
        changeUserName(str, str2, str3, (!TextUtils.isEmpty(str4) || loginInfo == null) ? str4 : loginInfo.getRegion(), str5, null, str6, callback);
    }

    @Override // com.huami.passport.user.IPhoneService
    @Deprecated
    public void changeUserName(String str, String str2, String str3, String str4, String str5, String str6, String str7, IAccount.Callback<String, ErrorCode> callback) {
        changeUserName(str, str2, str3, null, str4, null, str5, str6, str7, callback);
    }

    @Override // com.huami.passport.user.IPhoneService
    @Deprecated
    public void changeUserName(String str, String str2, String str3, String str4, String str5, IAccount.Callback<String, ErrorCode> callback) {
        changeUserName(str, str2, str3, null, str4, str5, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(String str, String str2, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        login(str, str2, null, null, null, null, null, null, null, null, null, null, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(String str, String str2, String str3, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        login(str, str2, null, null, null, null, null, null, null, null, null, str3, callback);
    }
}
