package com.sogou.map.loc;

import com.google.firebase.perf.network.FirebasePerfHttpClient;
import com.loopj.android.http.AsyncHttpClient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

/* JADX INFO: loaded from: classes18.dex */
class n0 {
    private HttpResponse b(HttpUriRequest httpUriRequest) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, "utf-8");
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpProtocolParams.setUserAgent(basicHttpParams, "");
        int i = 1;
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, true);
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(null, basicHttpParams);
        while (true) {
            int i2 = i - 1;
            if (i < 0) {
                return null;
            }
            try {
                r0.b("executeRequest() starting:" + i2);
                return FirebasePerfHttpClient.execute(defaultHttpClient, httpUriRequest);
            } catch (Exception e) {
                r0.b("executeRequest():" + e.getMessage());
                r0.b("executeRequest():" + e.getLocalizedMessage());
                i = i2;
            }
        }
    }

    public o0 a(String str, HttpEntity httpEntity) {
        r0.a(4, "http", "httpPost, url:" + str);
        r0.b("doPost(), url:" + str);
        HttpPost httpPost = new HttpPost(str);
        httpPost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
        httpPost.addHeader("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");
        if (httpEntity != null) {
            httpPost.setEntity(httpEntity);
        }
        r0.b("doPost().executeRequest()");
        return new g0(this, b(httpPost));
    }
}
