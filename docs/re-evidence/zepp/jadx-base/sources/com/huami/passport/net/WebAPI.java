package com.huami.passport.net;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.RequestFuture;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.data.net.VolleyEx;
import com.huami.passport.entity.AppInfo;
import com.huami.passport.entity.BindAccount;
import com.huami.passport.entity.BindList;
import com.huami.passport.entity.BindResult;
import com.huami.passport.entity.Device;
import com.huami.passport.entity.Entity;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.Result;
import com.huami.passport.entity.ThirdPartyToken;
import com.huami.passport.entity.TokenInfo;
import com.huami.passport.entity.UserRegion;
import com.huami.passport.error.ArgumentError;
import com.huami.passport.net.WebAPI;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class WebAPI {

    /* JADX INFO: renamed from: com.huami.passport.net.WebAPI$10, reason: invalid class name */
    public class AnonymousClass10 implements Response.ErrorListener {
        public final /* synthetic */ HttpCallback val$callback;

        public AnonymousClass10(HttpCallback httpCallback) {
            this.val$callback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onErrorResponse$0(VolleyError volleyError) {
            StringBuilder sb = new StringBuilder();
            sb.append("search domain result error");
            sb.append(volleyError == null ? "null" : volleyError.getMessage());
            return sb.toString();
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(final VolleyError volleyError) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.net.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebAPI.AnonymousClass10.lambda$onErrorResponse$0(volleyError);
                }
            });
            HttpCallback httpCallback = this.val$callback;
            if (httpCallback != null) {
                httpCallback.onFailure(volleyError);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.net.WebAPI$11, reason: invalid class name */
    public class AnonymousClass11 implements Response.Listener<BindResult> {
        public final /* synthetic */ HttpCallback val$callback;

        public AnonymousClass11(HttpCallback httpCallback) {
            this.val$callback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$0(String str) {
            return "getAccount list error" + str;
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(BindResult bindResult) {
            if (bindResult == null) {
                this.val$callback.onFailure(new ServiceError(ErrorCode.SERVER_ERROR));
                return;
            }
            final String errorCode = bindResult.getErrorCode();
            if (!TextUtils.isEmpty(errorCode)) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.net.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebAPI.AnonymousClass11.lambda$onResponse$0(errorCode);
                    }
                });
                this.val$callback.onFailure(new ServiceError(errorCode, bindResult.getData() == null ? null : bindResult.getData().getThirdId()));
            } else if (TextUtils.equals(bindResult.getResult(), Configs.Params.OK)) {
                this.val$callback.onSuccess(bindResult);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.net.WebAPI$13, reason: invalid class name */
    public class AnonymousClass13 implements Response.Listener<BindAccount> {
        public final /* synthetic */ HttpCallback val$callback;

        public AnonymousClass13(HttpCallback httpCallback) {
            this.val$callback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$0(String str) {
            return "getAccount list error" + str;
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(BindAccount bindAccount) {
            if (bindAccount == null) {
                this.val$callback.onFailure(new ServiceError(ErrorCode.SERVER_ERROR));
                return;
            }
            final String errorCode = bindAccount.getErrorCode();
            if (!TextUtils.isEmpty(errorCode)) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.net.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebAPI.AnonymousClass13.lambda$onResponse$0(errorCode);
                    }
                });
                this.val$callback.onFailure(new ServiceError(errorCode));
            } else if (TextUtils.equals(bindAccount.getResult(), Configs.Params.OK)) {
                this.val$callback.onSuccess(bindAccount);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.net.WebAPI$15, reason: invalid class name */
    public class AnonymousClass15 implements Response.Listener<BindList> {
        public final /* synthetic */ HttpCallback val$callback;

        public AnonymousClass15(HttpCallback httpCallback) {
            this.val$callback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$0(String str) {
            return "getAccount list error" + str;
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(BindList bindList) {
            if (bindList == null) {
                this.val$callback.onFailure(new ServiceError(ErrorCode.SERVER_ERROR));
                return;
            }
            final String errorCode = bindList.getErrorCode();
            if (!TextUtils.isEmpty(errorCode)) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.net.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebAPI.AnonymousClass15.lambda$onResponse$0(errorCode);
                    }
                });
                this.val$callback.onFailure(new ServiceError(errorCode));
            } else if (TextUtils.equals(bindList.getResult(), Configs.Params.OK)) {
                this.val$callback.onSuccess(bindList);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.net.WebAPI$23, reason: invalid class name */
    public class AnonymousClass23 implements Response.Listener<UserRegion> {
        public final /* synthetic */ HttpCallback val$callback;

        public AnonymousClass23(HttpCallback httpCallback) {
            this.val$callback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$0() {
            return "checkUserTransferCountry error-->user region is null";
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(UserRegion userRegion) {
            if (userRegion == null) {
                HMLog.error(new Function0() { // from class: com.huami.passport.net.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebAPI.AnonymousClass23.lambda$onResponse$0();
                    }
                });
                this.val$callback.onFailure(new ServiceError(ErrorCode.SERVER_ERROR));
            } else {
                HttpCallback httpCallback = this.val$callback;
                if (httpCallback != null) {
                    httpCallback.onSuccess(userRegion);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.net.WebAPI$25, reason: invalid class name */
    public class AnonymousClass25 implements Response.Listener<ThirdPartyToken> {
        public final /* synthetic */ HttpCallback val$callback;

        public AnonymousClass25(HttpCallback httpCallback) {
            this.val$callback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$0() {
            return "getThirdPartyAccessToken error-->user region is null";
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(ThirdPartyToken thirdPartyToken) {
            if (thirdPartyToken == null) {
                HMLog.error(new Function0() { // from class: com.huami.passport.net.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebAPI.AnonymousClass25.lambda$onResponse$0();
                    }
                });
                this.val$callback.onFailure(new ServiceError(ErrorCode.SERVER_ERROR));
            } else {
                HttpCallback httpCallback = this.val$callback;
                if (httpCallback != null) {
                    httpCallback.onSuccess(thirdPartyToken);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.net.WebAPI$27, reason: invalid class name */
    public class AnonymousClass27 implements Response.Listener<ThirdPartyToken> {
        public final /* synthetic */ HttpCallback val$callback;

        public AnonymousClass27(HttpCallback httpCallback) {
            this.val$callback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$0() {
            return "thirdPartyRefreshToken error";
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(ThirdPartyToken thirdPartyToken) {
            if (thirdPartyToken == null) {
                HMLog.error(new Function0() { // from class: com.huami.passport.net.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebAPI.AnonymousClass27.lambda$onResponse$0();
                    }
                });
                this.val$callback.onFailure(new ServiceError(ErrorCode.SERVER_ERROR));
            } else {
                HttpCallback httpCallback = this.val$callback;
                if (httpCallback != null) {
                    httpCallback.onSuccess(thirdPartyToken);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.net.WebAPI$9, reason: invalid class name */
    public class AnonymousClass9 implements Response.Listener<Result> {
        public final /* synthetic */ HttpCallback val$callback;

        public AnonymousClass9(HttpCallback httpCallback) {
            this.val$callback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$0(Result result) {
            return "search domain result " + result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$1(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onResponse$2() {
            return "search domain result error cause:callback is null";
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(final Result result) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.net.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebAPI.AnonymousClass9.lambda$onResponse$0(result);
                }
            });
            if (result == null) {
                return;
            }
            if (this.val$callback == null) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.net.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebAPI.AnonymousClass9.lambda$onResponse$2();
                    }
                });
                return;
            }
            final String errorCode = result.getErrorCode();
            if (!TextUtils.isEmpty(errorCode)) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.net.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebAPI.AnonymousClass9.lambda$onResponse$1(errorCode);
                    }
                });
                this.val$callback.onFailure(new ServiceError(errorCode));
            } else if (TextUtils.equals(result.getResult(), Configs.Params.OK)) {
                this.val$callback.onSuccess(result);
            }
        }
    }

    public interface HttpCallback<T> {
        void onFailure(VolleyError volleyError);

        void onSuccess(T t);
    }

    public static void bindAccount(Context context, final String str, final String str2, final String str3, final String str4, String str5, final HttpCallback<BindResult> httpCallback) {
        if (httpCallback == null) {
            HMLog.debug(new Function0() { // from class: hp8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebAPI.lambda$bindAccount$6();
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            httpCallback.onFailure(new ArgumentError());
        }
        String country = TextUtils.isEmpty(str5) ? Locale.getDefault().getCountry() : str5;
        final String str6 = country;
        HMLog.debug(new Function0() { // from class: np8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$bindAccount$7(str, str2, str3, str4, str6);
            }
        });
        HashMap map = new HashMap();
        map.put("third_name", str);
        map.put("code", str2);
        map.put("grant_type", str3);
        if (TextUtils.isEmpty(country)) {
            country = "unknown";
        }
        map.put("country_code", country);
        map.put(Configs.Params.APP_TOKEN, str4);
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.BIND_ACCOUNT), map, BindResult.class, new AnonymousClass11(httpCallback), new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.12
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                httpCallback.onFailure(volleyError);
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static void checkUserTransferCountry(Context context, String str, final String str2, final String str3, final HttpCallback<UserRegion> httpCallback) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            httpCallback.onFailure(new ArgumentError());
            return;
        }
        HMLog.debug(new Function0() { // from class: ip8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$checkUserTransferCountry$18(str2, str3);
            }
        });
        HashMap map = new HashMap();
        map.put(Configs.Params.APP_TOKEN, str2);
        map.put("user_id", str);
        map.put("country_code", str3);
        EntityRequest entityRequest = new EntityRequest(0, HttpDnsCache.getAccountUrl(context, Configs.PATH.CHECK_USER_TRANSFER_COUNTRY) + "?" + Utils.encodeParameters(map), null, UserRegion.class, new AnonymousClass23(httpCallback), new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.24
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                httpCallback.onFailure(volleyError);
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static void debugInfo(final NetworkResponse networkResponse) {
        try {
            final String str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
            HMLog.debug(new Function0() { // from class: vo8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebAPI.lambda$debugInfo$17(networkResponse, str);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LoginToken getAppToken(Context context, String str) {
        return syncToken(context, false, str);
    }

    public static String getError(Exception exc) {
        if (exc instanceof ExecutionException) {
            try {
                exc = (VolleyError) exc.getCause();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (exc instanceof ServiceError) {
            return ((ServiceError) exc).errorCode;
        }
        if (exc instanceof AuthFailureError) {
            return ErrorCode.ID_AUTH_DENIED_ERROR;
        }
        if (exc instanceof NoConnectionError) {
            return ErrorCode.NO_CONNECTION_ERROR;
        }
        if (exc instanceof ParseError) {
            return ErrorCode.PARSE_ERROR;
        }
        if (exc instanceof ServerError) {
            return ErrorCode.SERVER_ERROR;
        }
        if (exc instanceof TimeoutError) {
            return ErrorCode.TIMEOUT_ERROR;
        }
        return exc instanceof ArgumentError ? ErrorCode.PARAMS_IS_NULL_ERROR : ErrorCode.UNKOWN_ERROR;
    }

    private static String getScopeData(String str, String str2) {
        return Base64.encodeToString(String.format("{\"d\":\"%s\",\"md\":\"%s\"}", str, str2).getBytes(), 11);
    }

    public static void getThirdPartyAccessToken(Context context, String str, String str2, String str3, HttpCallback<ThirdPartyToken> httpCallback) {
        getThirdPartyAccessToken(context, str, str2, str3, null, null, httpCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$bindAccount$6() {
        return "bindAccount callback is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$bindAccount$7(String str, String str2, String str3, String str4, String str5) {
        return "thirdName:" + str + " code:" + str2 + " grantType:" + str3 + " appToken:" + str4 + " countryCode:" + str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$checkUserTransferCountry$18(String str, String str2) {
        return "appToken:" + str + " countryCode:" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$debugInfo$17(NetworkResponse networkResponse, String str) {
        return "DebugInfo statusCode:" + networkResponse.statusCode + "Header:" + Utils.encodeParameters(networkResponse.headers) + " Body:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getThirdPartyAccessToken$19(String str, String str2, String str3) {
        return "appToken:" + str + " code:" + str2 + " thirdName:" + str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$listAccount$10() {
        return "listAccount callback is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$listAccount$11(String str, String str2, boolean z) {
        return "appToken:" + str + " osVersion:" + str2 + " shouldCache:" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginV2$13(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, String str13) {
        return "loginV2----->\nprovider:" + str + "\nthirdName:" + str2 + "\nappName:" + str3 + "\ngrantType:" + str4 + "\ncode:" + str5 + "\ndeviceId:" + str6 + "\ndeviceModel:" + str7 + "\nappVersion:" + str8 + "\ncountryCode:" + str9 + "\ncountryState:" + str10 + "\nlang:" + str11 + "\ndn:" + str12 + "\nallowFastLogin:" + z + "\nisLogin:" + z2 + "\nsource:" + str13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$searchExistingUserAccount$5(Map map) {
        return "search user region--->\n" + Utils.encodeParameters(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$syncToken$2(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$thirdPartyRefreshToken$20(String str, String str2, String str3) {
        return "appToken:" + str + " refreshToken:" + str2 + " thirdName:" + str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$tokenLogin$15(String str, String str2) {
        return "tokenLogin----->\nloginToken:" + str + "\nappName:" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$unbindAccount$8() {
        return "unbindAccount callback is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$unbindAccount$9(String str, String str2, String str3) {
        return "thirdName:" + str + " thirdId:" + str2 + " appToken:" + str3;
    }

    public static void listAccount(Context context, final String str, final String str2, final boolean z, final HttpCallback<BindList> httpCallback) {
        if (httpCallback == null) {
            HMLog.debug(new Function0() { // from class: ep8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebAPI.lambda$listAccount$10();
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str)) {
            httpCallback.onFailure(new ArgumentError());
        }
        HMLog.debug(new Function0() { // from class: pp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$listAccount$11(str, str2, z);
            }
        });
        HashMap map = new HashMap();
        map.put(Configs.Params.APP_TOKEN, str);
        map.put(Configs.Params.OS_VERSION, str2);
        EntityRequest entityRequest = new EntityRequest(0, HttpDnsCache.getAccountUrl(context, Configs.PATH.LIST_ACCOUNTS) + "?" + Utils.encodeParameters(map), null, BindList.class, new AnonymousClass15(httpCallback), new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.16
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                httpCallback.onFailure(volleyError);
            }
        });
        if (z) {
            HashMap map2 = new HashMap();
            map2.put("Cache-Control", "max-age=0, stale-while-revalidate=7776000");
            entityRequest.setHeaders(map2);
        }
        entityRequest.setShouldCache(z);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static void loginV2(Context context, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final String str13, final boolean z, final boolean z2, final HttpCallback<LoginToken> httpCallback) {
        HMLog.debug(new Function0() { // from class: op8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$loginV2$13(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str13, z, z2, str12);
            }
        });
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7) || TextUtils.isEmpty(str8) || TextUtils.isEmpty(str9)) {
            throw new IllegalArgumentException("The request parameter can not be null");
        }
        final HashMap map = new HashMap();
        map.put("third_name", str2);
        map.put("app_name", str3);
        map.put("grant_type", str4);
        map.put("code", str5);
        map.put("device_id", str6);
        map.put(Configs.Params.DEVICE_MODEL, str7);
        map.put("app_version", str8);
        map.put("country_code", str9);
        map.put(Configs.Params.DN, str13);
        if (z2) {
            map.put(Configs.Params.ALLOW_REGISTRATION, Boolean.toString(z));
        }
        if (!TextUtils.isEmpty(str10)) {
            map.put(Configs.Params.COUNTRY_STATE, str10);
        }
        if (!TextUtils.isEmpty(str11)) {
            map.put("lang", str11);
        }
        if (!TextUtils.isEmpty(str12)) {
            map.put("source", str12);
        }
        HMLog.debug(new Function0() { // from class: yo8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.encodeParameters(map);
            }
        });
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrlIndex(z2), map, LoginToken.class, new Response.Listener<LoginToken>() { // from class: com.huami.passport.net.WebAPI.19
            @Override // com.android.volley.Response.Listener
            public void onResponse(LoginToken loginToken) {
                if (httpCallback != null) {
                    loginToken.setProvider(str);
                    httpCallback.onSuccess(loginToken);
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.20
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    httpCallback2.onFailure(volleyError);
                }
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setNoRetryPolicy(entityRequest));
    }

    public static void logout(Context context, String str, final HttpCallback<Entity> httpCallback) {
        if (httpCallback == null || TextUtils.isEmpty(str)) {
            return;
        }
        final HashMap map = new HashMap();
        map.put("login_token", str);
        map.put(Configs.Params.OS_VERSION, Configs.SDK_VERSION);
        HMLog.debug(new Function0() { // from class: dp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.encodeParameters(map);
            }
        });
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.LOGOUT), map, Entity.class, new Response.Listener<Entity>() { // from class: com.huami.passport.net.WebAPI.3
            @Override // com.android.volley.Response.Listener
            public void onResponse(Entity entity) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    httpCallback2.onSuccess(entity);
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.4
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    httpCallback2.onFailure(volleyError);
                }
            }
        });
        entityRequest.addSystemParams(context);
        entityRequest.setShouldCache(false);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static void relogin(Context context, final String str, String str2, final HttpCallback<LoginToken> httpCallback) {
        AppInfo appInfo = Utils.getAppInfo(context);
        Device deviceCache = Utils.getDeviceCache(context);
        final HashMap map = new HashMap();
        map.put("login_token", str2);
        map.put("app_name", appInfo.getAppId());
        map.put("device_id_type", deviceCache.getDeviceidType());
        map.put("device_id", deviceCache.getDeviceid());
        map.put("lang", Locale.getDefault().getLanguage());
        map.put("source", appInfo.buildParams());
        map.put(Configs.Params.DEVICE_MODEL, deviceCache.getDeviceModel());
        map.put(Configs.Params.OS_VERSION, Configs.SDK_VERSION);
        HMLog.debug(new Function0() { // from class: ap8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.encodeParameters(map);
            }
        });
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.RELOGIN), map, LoginToken.class, new Response.Listener<LoginToken>() { // from class: com.huami.passport.net.WebAPI.5
            @Override // com.android.volley.Response.Listener
            public void onResponse(LoginToken loginToken) {
                if (httpCallback != null) {
                    loginToken.setProvider(str);
                    httpCallback.onSuccess(loginToken);
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.6
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    httpCallback2.onFailure(volleyError);
                }
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static LoginToken renewLoginToken(Context context, String str) {
        return syncToken(context, true, str);
    }

    public static void searchExistingUserAccount(Context context, String str, final Map<String, String> map, HttpCallback<Result> httpCallback) {
        HMLog.debug(new Function0() { // from class: zo8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$searchExistingUserAccount$5(map);
            }
        });
        EntityRequest entityRequest = new EntityRequest(1, Configs.getSearchDomain(str), map, Result.class, new AnonymousClass9(httpCallback), new AnonymousClass10(httpCallback));
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static Request<?> setNoRetryPolicy(Request<?> request) {
        request.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 0, 1.0f));
        return request;
    }

    public static Request<?> setRetryPolicy(Request<?> request) {
        request.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        return request;
    }

    private static LoginToken syncToken(Context context, boolean z, String str) {
        if (str == null) {
            return null;
        }
        AppInfo appInfo = Utils.getAppInfo(context);
        RequestFuture requestFutureNewFuture = RequestFuture.newFuture();
        HashMap map = new HashMap();
        map.put("login_token", str);
        map.put(Configs.Params.OS_VERSION, Configs.SDK_VERSION);
        map.put("source", appInfo.buildParams());
        map.put(Configs.Params.DN, Configs.getDomain());
        String str2 = Configs.PATH.RENEW_LOGIN_TOKEN;
        if (!z) {
            str2 = Configs.PATH.GET_APP_TOKEN;
        }
        final String str3 = HttpDnsCache.getAccountUrl(context, str2) + "?" + Utils.encodeParameters(map);
        EntityRequest entityRequest = new EntityRequest(0, str3, null, LoginToken.class, requestFutureNewFuture, requestFutureNewFuture);
        entityRequest.addSystemParams(context);
        entityRequest.setShouldCache(false);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
        HMLog.debug(new Function0() { // from class: gp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$syncToken$2(str3);
            }
        });
        try {
            return (LoginToken) requestFutureNewFuture.get();
        } catch (Exception e) {
            LoginToken loginToken = new LoginToken();
            loginToken.setErrorCode(getError(e));
            return loginToken;
        }
    }

    public static void thirdPartyLogin(Context context, final String str, final Map<String, String> map, final HttpCallback<LoginToken> httpCallback) {
        HMLog.debug(new Function0() { // from class: wo8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.encodeParameters(map);
            }
        });
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.THIRD_PARTY_LOGIN), map, LoginToken.class, new Response.Listener<LoginToken>() { // from class: com.huami.passport.net.WebAPI.7
            @Override // com.android.volley.Response.Listener
            public void onResponse(LoginToken loginToken) {
                if (httpCallback != null) {
                    loginToken.setProvider(str);
                    httpCallback.onSuccess(loginToken);
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.8
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    httpCallback2.onFailure(volleyError);
                }
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static void thirdPartyRefreshToken(Context context, final String str, final String str2, final String str3, final HttpCallback<ThirdPartyToken> httpCallback) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            httpCallback.onFailure(new ArgumentError());
            return;
        }
        HMLog.debug(new Function0() { // from class: mp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$thirdPartyRefreshToken$20(str2, str3, str);
            }
        });
        HashMap map = new HashMap();
        map.put(Configs.Params.APP_TOKEN, str2);
        map.put("refresh_token", str3);
        map.put("third_name", str);
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.THIRD_PARTY_REFRESH_TOKEN) + "?" + Utils.encodeParameters(map), null, ThirdPartyToken.class, new AnonymousClass27(httpCallback), new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.28
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                httpCallback.onFailure(volleyError);
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static void tokenLogin(@NonNull Context context, @NonNull final String str, @Nullable final String str2, @Nullable String str3, @NonNull final HttpCallback<LoginToken> httpCallback) {
        HMLog.debug(new Function0() { // from class: jp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$tokenLogin$15(str, str2);
            }
        });
        final HashMap map = new HashMap();
        if (str2 == null || TextUtils.isEmpty(str2)) {
            map.put("appName", context.getPackageName());
        } else {
            map.put("appName", str2);
        }
        if (str3 == null || TextUtils.isEmpty(str3)) {
            map.put(Configs.Params.DN, Configs.getDomain());
        } else {
            map.put(Configs.Params.DN, str3);
        }
        HMLog.debug(new Function0() { // from class: cp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.encodeParameters(map);
            }
        });
        EntityRequest entityRequest = new EntityRequest(0, HttpDnsCache.getAccountUrl(context, Configs.PATH.TOKEN_LOGIN) + "?" + Utils.encodeParameters(map), null, LoginToken.class, new Response.Listener<LoginToken>() { // from class: com.huami.passport.net.WebAPI.21
            @Override // com.android.volley.Response.Listener
            public void onResponse(LoginToken loginToken) {
                httpCallback.onSuccess(loginToken);
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.22
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                httpCallback.onFailure(volleyError);
            }
        });
        VolleyEx.addHeaders((EntityRequest<?>) entityRequest, str);
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setNoRetryPolicy(entityRequest));
    }

    public static void unbindAccount(Context context, final String str, final String str2, final String str3, final HttpCallback<BindAccount> httpCallback) {
        if (httpCallback == null) {
            HMLog.debug(new Function0() { // from class: fp8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebAPI.lambda$unbindAccount$8();
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            httpCallback.onFailure(new ArgumentError());
        }
        HMLog.debug(new Function0() { // from class: kp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$unbindAccount$9(str, str2, str3);
            }
        });
        HashMap map = new HashMap();
        map.put("third_name", str);
        map.put(Configs.Params.THIRD_ID, str2);
        map.put(Configs.Params.APP_TOKEN, str3);
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.UNBIND_ACCOUNT), map, BindAccount.class, new AnonymousClass13(httpCallback), new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.14
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                httpCallback.onFailure(volleyError);
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static void verifyAppToken(Context context, String str, final HttpCallback<TokenInfo> httpCallback) {
        AppInfo appInfo = Utils.getAppInfo(context);
        final HashMap map = new HashMap();
        map.put("app_name", appInfo.getAppId());
        map.put(Configs.Params.APP_TOKEN, str);
        map.put(Configs.Params.OS_VERSION, Configs.SDK_VERSION);
        HMLog.debug(new Function0() { // from class: bp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.encodeParameters(map);
            }
        });
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.VERIFY_APP_TOKEN), map, TokenInfo.class, new Response.Listener<TokenInfo>() { // from class: com.huami.passport.net.WebAPI.1
            @Override // com.android.volley.Response.Listener
            public void onResponse(TokenInfo tokenInfo) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    httpCallback2.onSuccess(tokenInfo);
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.2
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    httpCallback2.onFailure(volleyError);
                }
            }
        });
        entityRequest.addSystemParams(context);
        entityRequest.setShouldCache(false);
        RequestQueueHolder.addRequest(context, entityRequest);
    }

    public static class ServiceError extends VolleyError {
        public String errorCode;
        public String errorMsg;

        public ServiceError(String str) {
            this.errorCode = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServiceError [errorMsg=" + this.errorMsg + ", errorCode=" + this.errorCode + "]";
        }

        public ServiceError(String str, String str2) {
            this.errorCode = str;
            this.errorMsg = str2;
        }
    }

    public static void getThirdPartyAccessToken(Context context, final String str, final String str2, final String str3, @Nullable String str4, @Nullable String str5, final HttpCallback<ThirdPartyToken> httpCallback) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            httpCallback.onFailure(new ArgumentError());
            return;
        }
        HMLog.debug(new Function0() { // from class: lp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAPI.lambda$getThirdPartyAccessToken$19(str2, str3, str);
            }
        });
        HashMap map = new HashMap();
        map.put(Configs.Params.APP_TOKEN, str2);
        map.put("code", str3);
        map.put("third_name", str);
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            map.put("scope", getScopeData(str4, str5));
        }
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.THIRD_PARTY_ACCESS_TOKEN) + "?" + Utils.encodeParameters(map), null, ThirdPartyToken.class, new AnonymousClass25(httpCallback), new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.26
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                httpCallback.onFailure(volleyError);
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        RequestQueueHolder.addRequest(context, setRetryPolicy(entityRequest));
    }

    public static void renewLoginToken(Context context, String str, final HttpCallback<LoginToken> httpCallback) {
        final HashMap map = new HashMap();
        map.put("login_token", str);
        map.put(Configs.Params.OS_VERSION, Configs.SDK_VERSION);
        HMLog.debug(new Function0() { // from class: xo8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.encodeParameters(map);
            }
        });
        EntityRequest entityRequest = new EntityRequest(1, HttpDnsCache.getAccountUrl(context, Configs.PATH.RENEW_LOGIN_TOKEN), map, LoginToken.class, new Response.Listener<LoginToken>() { // from class: com.huami.passport.net.WebAPI.17
            @Override // com.android.volley.Response.Listener
            public void onResponse(LoginToken loginToken) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    if (loginToken == null) {
                        httpCallback2.onFailure(new ServiceError(ErrorCode.UNKOWN_ERROR));
                        return;
                    }
                    String errorCode = loginToken.getErrorCode();
                    if (!TextUtils.isEmpty(errorCode)) {
                        httpCallback.onFailure(new ServiceError(errorCode));
                    } else if (TextUtils.equals(loginToken.getResult(), Configs.Params.OK)) {
                        httpCallback.onSuccess(loginToken);
                    }
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.net.WebAPI.18
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                HttpCallback httpCallback2 = httpCallback;
                if (httpCallback2 != null) {
                    httpCallback2.onFailure(volleyError);
                }
            }
        });
        entityRequest.setShouldCache(false);
        entityRequest.addSystemParams(context);
        entityRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(context, entityRequest);
    }
}
