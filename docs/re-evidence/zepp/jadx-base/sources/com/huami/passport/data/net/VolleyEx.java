package com.huami.passport.data.net;

import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.huami.passport.ErrorCode;
import com.huami.passport.data.entity.ErrorEntity;
import com.huami.passport.error.ArgumentError;
import com.huami.passport.net.EntityRequest;
import com.huami.passport.net.RestfulRequest;
import com.huami.passport.net.WebAPI;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes12.dex */
public class VolleyEx {
    public static void addHeaders(RestfulRequest restfulRequest, String str) {
        restfulRequest.addHeaders("Accept", "application/json");
        restfulRequest.addHeaders("Content-Typ", "application/x-www-form-urlencoded");
        restfulRequest.addHeaders("Authorization", "Bearer " + str);
        restfulRequest.addAcceptLangHeader();
    }

    public static ErrorEntity errorMap(ErrorEntity errorEntity, int i) {
        if (TextUtils.isEmpty(errorEntity.getErrorCode())) {
            errorEntity.setErrorCode("http_" + i);
        }
        return errorEntity;
    }

    public static String parseCharset(Map<String, String> map) {
        return HttpHeaderParser.parseCharset(map, "UTF-8");
    }

    public static ErrorEntity parseException(Exception exc) {
        NetworkResponse networkResponse;
        boolean z = exc instanceof ExecutionException;
        ServerError serverError = null;
        if (z) {
            Throwable cause = ((ExecutionException) exc).getCause();
            if (cause instanceof ServerError) {
                serverError = (ServerError) cause;
            }
        } else if (exc instanceof ServerError) {
            serverError = (ServerError) exc;
        }
        if (serverError != null && (networkResponse = serverError.networkResponse) != null) {
            try {
                ErrorEntity errorEntity = (ErrorEntity) new Gson().fromJson(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers)), ErrorEntity.class);
                errorMap(errorEntity, networkResponse.statusCode);
                return errorEntity;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ErrorEntity errorEntity2 = new ErrorEntity();
        if (z) {
            try {
                exc = (VolleyError) exc.getCause();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (exc instanceof WebAPI.ServiceError) {
            errorEntity2.setErrorCode(((WebAPI.ServiceError) exc).errorCode);
        } else if (exc instanceof AuthFailureError) {
            errorEntity2.setErrorCode(ErrorCode.ID_AUTH_DENIED_ERROR);
        } else if (exc instanceof NoConnectionError) {
            errorEntity2.setErrorCode(ErrorCode.NO_CONNECTION_ERROR);
        } else if (exc instanceof ParseError) {
            errorEntity2.setErrorCode(ErrorCode.PARSE_ERROR);
        } else if (exc instanceof ServerError) {
            errorEntity2.setErrorCode(ErrorCode.SERVER_ERROR);
        } else if (exc instanceof TimeoutError) {
            errorEntity2.setErrorCode(ErrorCode.TIMEOUT_ERROR);
        } else if (exc instanceof ArgumentError) {
            errorEntity2.setErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR);
        } else {
            errorEntity2.setErrorCode(ErrorCode.UNKOWN_ERROR);
        }
        return errorEntity2;
    }

    public static void addHeaders(EntityRequest<?> entityRequest, String str) {
        entityRequest.addHeaders("Authorization", "Bearer " + str);
    }
}
