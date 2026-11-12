package com.huami.passport.net;

import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.RequestFuture;
import com.google.gson.Gson;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.ApiResult;
import com.huami.passport.api.error.ErrorMsg;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.OAuthUser;

/* JADX INFO: loaded from: classes12.dex */
public class LoginServiceAPI {
    private static void addHeaders(RestfulRequest restfulRequest, String str, String str2, String str3, String str4) {
        restfulRequest.addHeaders("Accept", "application/json");
        restfulRequest.addHeaders("Content-Typ", "application/x-www-form-urlencoded");
        restfulRequest.addHeaders("Authorization", "Bearer " + str);
        restfulRequest.addParams("client_id", str2);
        restfulRequest.addParams("client_secret", str3);
        restfulRequest.addParams("region", str4);
    }

    public static void getOAuthUser(Context context, String str, String str2, String str3, String str4, final IAccount.Callback<OAuthUser, ErrorCode> callback) {
        RestfulRequest restfulRequest = new RestfulRequest(1, HttpDnsCache.getIdUrl(context) + Configs.PATH.GET_OAUTHUSER_URL, new Response.Listener<NetworkResponse>() { // from class: com.huami.passport.net.LoginServiceAPI.1
            @Override // com.android.volley.Response.Listener
            public void onResponse(NetworkResponse networkResponse) {
                WebAPI.debugInfo(networkResponse);
                int i = networkResponse.statusCode;
                if (i != 200) {
                    ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(i), ErrorMsg.mapErrMsg4UserInfoRsp(networkResponse.statusCode)));
                    return;
                }
                try {
                    String str5 = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
                    try {
                        if (VolleyLog.DEBUG) {
                            VolleyLog.d(str5);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    ApiResult.onSuccessCallback(callback, (OAuthUser) new Gson().fromJson(str5, OAuthUser.class));
                } catch (Exception unused) {
                }
            }
        }, new Response.ErrorListener() { // from class: com.huami.passport.net.LoginServiceAPI.2
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                try {
                    NetworkResponse networkResponse = volleyError.networkResponse;
                    if (networkResponse != null) {
                        WebAPI.debugInfo(networkResponse);
                        ApiResult.onErrorCallback(callback, new ErrorCode(String.valueOf(networkResponse.statusCode), ErrorMsg.mapErrMsg4UserInfoRsp(networkResponse.statusCode)));
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
        addHeaders(restfulRequest, str4, str, str2, str3);
        restfulRequest.addSystemParams(context);
        restfulRequest.setRetryPolicy(new DefaultRetryPolicy(Configs.timeoutMillis, 1, 1.0f));
        RequestQueueHolder.addRequest(context, restfulRequest);
    }

    public static LoginInfo refreshToken(Context context, String str, String str2, String str3, String str4) {
        RequestFuture requestFutureNewFuture = RequestFuture.newFuture();
        RestfulRequest restfulRequest = new RestfulRequest(1, HttpDnsCache.getIdUrl(context) + Configs.PATH.REFRESH_ACCESS_URL, requestFutureNewFuture, requestFutureNewFuture);
        addHeaders(restfulRequest, str4, str, str2, str3);
        restfulRequest.addSystemParams(context);
        restfulRequest.setShouldCache(false);
        RequestQueueHolder.addRequest(context, WebAPI.setRetryPolicy(restfulRequest));
        LoginInfo loginInfo = new LoginInfo();
        try {
            NetworkResponse networkResponse = (NetworkResponse) requestFutureNewFuture.get();
            int i = networkResponse.statusCode;
            if (i == 200) {
                LoginInfo loginInfo2 = (LoginInfo) new Gson().fromJson(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers)), LoginInfo.class);
                loginInfo.setLastUpdateTtl(System.currentTimeMillis());
                loginInfo.setExpiration(loginInfo2.getExpiration());
                loginInfo.setAccess(loginInfo2.getAccess());
            } else {
                loginInfo.setErrorCode(String.valueOf(i));
                loginInfo.setErrorMsg(ErrorMsg.mapErrMsg4RefreshRsp(networkResponse.statusCode));
            }
        } catch (Exception e) {
            e.printStackTrace();
            loginInfo.setErrorCode(ErrorMsg.mapErrMsg4ServerError(e));
        }
        return loginInfo;
    }
}
