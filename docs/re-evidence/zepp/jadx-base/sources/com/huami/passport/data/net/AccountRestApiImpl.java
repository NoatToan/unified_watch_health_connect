package com.huami.passport.data.net;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.RequestFuture;
import com.google.gson.Gson;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.data.entity.ErrorEntity;
import com.huami.passport.data.entity.TokenEntity;
import com.huami.passport.net.RequestQueueHolder;
import com.huami.passport.net.RestfulRequest;
import com.huami.passport.net.WebAPI;

/* JADX INFO: loaded from: classes12.dex */
public class AccountRestApiImpl implements AccountRestApi {
    private Context context;

    public AccountRestApiImpl(Context context) {
        this.context = context;
    }

    @Override // com.huami.passport.data.net.AccountRestApi
    public ApiResponse<TokenEntity, ErrorEntity> authorize(String str, String str2, boolean z, String str3, String str4) {
        RequestFuture requestFutureNewFuture = RequestFuture.newFuture();
        String strReplace = HttpDnsCache.getAccountUrl(this.context, AccountRestApi.API_AUTHORIZATION_URL).replace("{appName}", str);
        try {
            Uri.Builder builderBuildUpon = Uri.parse(strReplace).buildUpon();
            builderBuildUpon.appendQueryParameter("device_authorization", z ? "true" : "false");
            if (!TextUtils.isEmpty(str3)) {
                builderBuildUpon.appendQueryParameter(Configs.Params.DEVICE_MODEL, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                builderBuildUpon.appendQueryParameter("device_identifier", str4);
            }
            strReplace = builderBuildUpon.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        RestfulRequest restfulRequest = new RestfulRequest(0, strReplace, requestFutureNewFuture, requestFutureNewFuture);
        VolleyEx.addHeaders(restfulRequest, str2);
        restfulRequest.setShouldCache(false);
        RequestQueueHolder.addRequest(this.context, WebAPI.setRetryPolicy(restfulRequest));
        ErrorEntity errorEntity = new ErrorEntity(ErrorCode.UNKOWN_ERROR);
        try {
            NetworkResponse networkResponse = (NetworkResponse) requestFutureNewFuture.get();
            if (networkResponse != null) {
                int i = networkResponse.statusCode;
                String str5 = null;
                byte[] bArr = networkResponse.data;
                if (bArr != null && bArr.length > 0) {
                    str5 = new String(bArr, HttpHeaderParser.parseCharset(networkResponse.headers));
                }
                if (!TextUtils.isEmpty(str5)) {
                    Gson gson = new Gson();
                    if (i == 200) {
                        return VolleyApiResponse.success((TokenEntity) gson.fromJson(str5, TokenEntity.class));
                    }
                    errorEntity = (ErrorEntity) gson.fromJson(str5, ErrorEntity.class);
                }
                VolleyEx.errorMap(errorEntity, i);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            errorEntity = VolleyEx.parseException(e2);
        }
        return VolleyApiResponse.error(errorEntity);
    }
}
