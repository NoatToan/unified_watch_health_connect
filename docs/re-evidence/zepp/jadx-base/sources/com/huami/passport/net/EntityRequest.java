package com.huami.passport.net;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.ext.GsonRequest;
import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huami.passport.entity.AppInfo;
import com.huami.passport.net.EntityRequest;
import com.huami.passport.net.tools.LinkedMultiValueMap;
import com.huami.passport.net.tools.MultiValueMap;
import com.huami.passport.net.tools.RequestHandler;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes12.dex */
public class EntityRequest<T> extends GsonRequest {
    private Class<T> clazz;
    private Gson gson;
    private Map<String, String> headers;
    private MultiValueMap<String, Object> mParamKeyValues;
    private Map<String, String> params;

    public EntityRequest(int i, String str, Map map, Class cls, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, map, cls, listener, errorListener);
        this.gson = new Gson();
        this.clazz = cls;
    }

    public static StringBuilder buildCommonParams(MultiValueMap<String, Object> multiValueMap, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : multiValueMap.keySet()) {
            for (Object obj : multiValueMap.getValues(str2)) {
                if (obj != null && (obj instanceof CharSequence)) {
                    sb.append(com.alipay.sdk.m.s.a.l);
                    try {
                        sb.append(URLEncoder.encode(str2, str));
                        sb.append(SearchCriteria.EQ);
                        sb.append(URLEncoder.encode(obj.toString(), str));
                    } catch (UnsupportedEncodingException unused) {
                        VolleyLog.e("Encoding " + str + " format is not supported by the system", new Object[0]);
                        sb.append(str2);
                        sb.append(SearchCriteria.EQ);
                        sb.append(obj.toString());
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getBody$0(String str) {
        return "getBody：" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getBody$1(String str) {
        return "getBody:" + str;
    }

    public void addHeaders(String str, String str2) {
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        this.headers.put(str, str2);
    }

    public void addParams(String str, String str2) {
        if (this.mParamKeyValues == null) {
            this.mParamKeyValues = new LinkedMultiValueMap();
        }
        if (str2 != null) {
            this.mParamKeyValues.add(str, str2);
        }
    }

    public void addSystemParams(Context context) {
        AppInfo appInfo = Utils.getAppInfo(context);
        if (appInfo != null) {
            addHeaders("app_name", appInfo.getAppId());
        }
        Locale locale = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault();
        addHeaders(HttpHeaders.ACCEPT_LANGUAGE, locale.getLanguage() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + locale.getCountry());
    }

    @Override // com.android.volley.Request
    public byte[] getBody() throws AuthFailureError {
        MultiValueMap<String, Object> multiValueMap = this.mParamKeyValues;
        if (multiValueMap == null || multiValueMap.isEmpty()) {
            byte[] body = super.getBody();
            try {
                final String str = new String(body, getParamsEncoding());
                HMLog.debug(new Function0() { // from class: cm1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EntityRequest.lambda$getBody$0(str);
                    }
                });
            } catch (Exception unused) {
            }
            return body;
        }
        try {
            final String string = buildCommonParams(this.mParamKeyValues, getParamsEncoding()).toString();
            HMLog.debug(new Function0() { // from class: bm1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EntityRequest.lambda$getBody$1(string);
                }
            });
            return string.getBytes(getParamsEncoding());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.android.volley.toolbox.ext.GsonRequest, com.android.volley.Request
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> headers = HttpConfig.getHeaders();
        if (headers.size() > 0) {
            if (this.headers == null) {
                this.headers = new HashMap();
            }
            this.headers.putAll(headers);
        }
        Map<String, String> headers2 = this.headers;
        if (headers2 == null) {
            headers2 = super.getHeaders();
        }
        HttpConfig.appendRequestId(this.headers);
        return headers2;
    }

    @Override // com.android.volley.toolbox.ext.GsonRequest, com.android.volley.Request
    public Map<String, String> getParams() throws AuthFailureError {
        Map<String, String> map = this.params;
        return map != null ? map : super.getParams();
    }

    @Override // com.android.volley.Request
    public VolleyError parseNetworkError(VolleyError volleyError) {
        RequestHandler.handle(this, volleyError.networkResponse);
        Utils.parseNetworkError(volleyError, getUrl());
        return super.parseNetworkError(volleyError);
    }

    @Override // com.android.volley.toolbox.ext.GsonRequest, com.android.volley.Request
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        RequestHandler.handle(this, networkResponse);
        Map<String, String> map = networkResponse.headers;
        if (map != null) {
            String str = map.get("Date");
            if (!TextUtils.isEmpty(str)) {
                Utils.setServerDate(str);
            }
        }
        return parseNetworkResponseInner(networkResponse);
    }

    public Response<T> parseNetworkResponseInner(NetworkResponse networkResponse) {
        try {
            String str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, StandardCharsets.UTF_8.name()));
            try {
                if (VolleyLog.DEBUG) {
                    VolleyLog.d(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Response.success(this.gson.fromJson(str, (Class) this.clazz), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (JsonSyntaxException | UnsupportedEncodingException e2) {
            return Response.error(new ParseError(e2));
        }
    }

    @Override // com.android.volley.toolbox.ext.GsonRequest
    public void setHeaders(Map map) {
        this.headers = map;
    }

    @Override // com.android.volley.toolbox.ext.GsonRequest
    public void setParams(Map map) {
        MultiValueMap<String, Object> multiValueMap = this.mParamKeyValues;
        if (multiValueMap != null && !multiValueMap.isEmpty()) {
            throw new IllegalArgumentException("AddParams method has been used, please do not use the setParams method");
        }
        this.params = map;
    }

    public EntityRequest(int i, String str, Class cls, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, cls, listener, errorListener);
        this.gson = new Gson();
        this.clazz = cls;
    }
}
