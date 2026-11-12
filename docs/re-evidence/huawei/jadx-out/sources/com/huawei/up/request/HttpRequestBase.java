package com.huawei.up.request;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hwbasemgr.CloudUrlManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.utils.HttpConnectionAdaptor;
import com.huawei.up.utils.NSPException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HttpRequestBase {
    private static final int CONNECT_SECONDS_TIMEOUT = 30;
    public static final String REQUEST_CLIENT_TYPE = "39";
    private static final String TAG = "HttpRequestBase";
    public static final String TAG_ERROR_DESC = "errorDesc";
    protected static final String TAG_RESULT = "result";
    public static final String TAG_RESULT_CODE = "resultCode";
    public static final String UP_SERVER_URL_CHINA = "/AccountServer";
    private static String sBaseUrl = "";
    private static String sBaseUrlKey;
    private static CloudUrlManager sCloudUrlManager;
    private Context mContext;
    private String mRequestURL;

    protected abstract String getRealRequestUrl(String str);

    public abstract HashMap<String, String> packageRequest();

    public abstract String packageXML() throws IllegalStateException, IOException, IllegalArgumentException;

    public abstract Bundle unPackageRequest(HttpResponse httpResponse);

    public abstract Bundle unPackageXML(String str) throws XmlPullParserException, IOException;

    public HttpRequestBase(Context context) {
        this.mContext = context;
    }

    public static void resetBaseUrl(CloudUrlManager cloudUrlManager, String str) {
        LogUtil.a(TAG, "resetBaseUrl baseUrlKey=", str);
        sCloudUrlManager = cloudUrlManager;
        sBaseUrlKey = str;
        sBaseUrl = "";
    }

    private static String getBaseUrl() {
        if (TextUtils.isEmpty(sBaseUrl)) {
            CloudUrlManager cloudUrlManager = sCloudUrlManager;
            String url = cloudUrlManager != null ? cloudUrlManager.getUrl(sBaseUrlKey) : null;
            if (!TextUtils.isEmpty(url)) {
                sBaseUrl = url + UP_SERVER_URL_CHINA;
            } else {
                LogUtil.e(TAG, "getBaseUrl is empty, baseUrlKey=", sBaseUrlKey);
            }
        }
        return sBaseUrl;
    }

    public final String getRequestUrl() {
        if (TextUtils.isEmpty(this.mRequestURL)) {
            this.mRequestURL = getRealRequestUrl(getBaseUrl());
        }
        return this.mRequestURL;
    }

    public HttpResponse execute(HashMap<String, String> map) {
        HttpHost httpHost;
        HttpClient httpClient;
        HttpPost httpPost = HttpConnectionAdaptor.getHttpPost(getRequestUrl(), 30, 30, false);
        try {
            httpHost = HttpConnectionAdaptor.getHttpHost(getRequestUrl());
        } catch (NSPException e) {
            LogUtil.d(TAG, "execute NSPException() e:", e.getMessage());
            httpHost = null;
        }
        if (httpPost == null) {
            LogUtil.d(TAG, "execute httpPost is null");
            return null;
        }
        if (httpHost == null) {
            LogUtil.d(TAG, "execute httpHost is null");
            return null;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        if (strValueOf != null && strValueOf.length() > 0) {
            httpPost.addHeader("Authorization", strValueOf);
        }
        try {
            httpClient = HttpConnectionAdaptor.getHttpClient(this.mContext, getRequestUrl());
        } catch (NSPException e2) {
            LogUtil.d(TAG, "execute NSPException() e:", e2.getMessage());
            httpClient = null;
        }
        if (httpClient == null) {
            LogUtil.d(TAG, "execute httpClient is null");
            return null;
        }
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(getNameValuePairParam(map), "UTF-8"));
        } catch (UnsupportedEncodingException e3) {
            LogUtil.d(TAG, "execute UnsupportedEncodingException() e:", e3.getMessage());
        }
        try {
            return httpClient.execute(httpHost, httpPost);
        } catch (IOException e4) {
            LogUtil.d(TAG, "execute IOException() e:", e4.getMessage());
            return null;
        }
    }

    private List<NameValuePair> getNameValuePairParam(HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
                sb.append("&" + entry.getKey() + "=" + entry.getValue());
            }
        }
        LogUtil.d(TAG, "execute() url=", getRequestUrl(), ", data=", sb.toString());
        return arrayList;
    }

    public String execute(String str) {
        HttpHost httpHost;
        HttpClient httpClient;
        LogUtil.d(TAG, "execute requestURL=", getRequestUrl(), ", xml=", str);
        HttpPost httpPost = HttpConnectionAdaptor.getHttpPost(getRequestUrl(), 30, 30, false);
        HttpResponse httpResponseExecute = null;
        try {
            httpHost = HttpConnectionAdaptor.getHttpHost(getRequestUrl());
        } catch (NSPException e) {
            LogUtil.d(TAG, "execute NSPException() e=", e.getMessage());
            httpHost = null;
        }
        if (httpPost == null) {
            LogUtil.j(TAG, "execute httpPost == null");
            return "";
        }
        if (httpHost == null) {
            LogUtil.j(TAG, "execute httpPost == null");
            return "";
        }
        httpPost.addHeader("Content-Type", "text/xml");
        try {
            httpPost.setEntity(new StringEntity(str));
        } catch (UnsupportedEncodingException e2) {
            LogUtil.d(TAG, "execute UnsupportedEncodingException e=", e2.getMessage());
        }
        try {
            httpClient = HttpConnectionAdaptor.getHttpClient(this.mContext, getRequestUrl());
        } catch (NSPException e3) {
            LogUtil.d(TAG, "execute NSPException() e=", e3.getMessage());
            httpClient = null;
        }
        if (httpClient == null) {
            LogUtil.j(TAG, "execute httpClient == null");
            return "";
        }
        try {
            httpResponseExecute = httpClient.execute(httpHost, httpPost);
        } catch (IOException e4) {
            LogUtil.d(TAG, "execute IOException() e=", e4.getMessage());
        }
        if (httpResponseExecute == null) {
            return "";
        }
        try {
            return EntityUtils.toString(httpResponseExecute.getEntity(), "UTF-8");
        } catch (IOException e5) {
            LogUtil.d(TAG, "execute IOException() e1=", e5.getMessage());
            return "";
        }
    }
}
