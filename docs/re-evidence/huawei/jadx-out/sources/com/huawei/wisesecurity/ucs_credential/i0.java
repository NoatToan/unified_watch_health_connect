package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.SecureX509TrustManager;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkRequest;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import defpackage.yol;
import defpackage.yqi;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yra;
import defpackage.yrb;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes20.dex */
public class i0 implements NetworkCapability {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f30831a;
    public Context d;

    public final String b(Response<String> response) {
        if (response.isSuccessful()) {
            return response.getBody();
        }
        try {
            return new String(response.getErrorBody().bytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            StringBuilder sbB = yql.b("getErrorBody fail : ");
            sbB.append(e.getMessage());
            yqi.e("RemoteRestClient", sbB.toString(), new Object[0]);
            return "";
        }
    }

    @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
    public void initConfig(int i, int i2) throws yqj {
        Context context = this.d;
        try {
            NetworkKit.init(context, new yrb(this));
            this.f30831a = (j0) new RestClient.Builder().httpClient(new HttpClient.Builder().connectTimeout(i).callTimeout(i).sslSocketFactory((SSLSocketFactory) SecureSSLSocketFactoryNew.getInstance(context, yol.c()), (X509TrustManager) new SecureX509TrustManager(context)).retryTimeOnConnectionFailure(i2).build()).build().create(j0.class);
        } catch (Exception e) {
            StringBuilder sbB = yql.b("RemoteRestClient init failed, ");
            sbB.append(e.getMessage());
            String string = sbB.toString();
            throw yra.e("RemoteRestClient", string, new Object[0], 2001L, string);
        }
    }

    @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
    public NetworkResponse post(NetworkRequest networkRequest) throws IOException {
        NetworkResponse networkResponse = new NetworkResponse();
        Response<String> responseExecute = this.f30831a.a(networkRequest.getUrl(), networkRequest.getHeaders(), networkRequest.getBody()).execute();
        networkResponse.setCode(responseExecute.getCode());
        networkResponse.setHeaders(responseExecute.getHeaders());
        networkResponse.setBody(b(responseExecute));
        return networkResponse;
    }

    @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
    public NetworkResponse get(NetworkRequest networkRequest) throws IOException {
        NetworkResponse networkResponse = new NetworkResponse();
        Response<String> responseExecute = this.f30831a.a(networkRequest.getUrl(), networkRequest.getHeaders()).execute();
        networkResponse.setCode(responseExecute.getCode());
        networkResponse.setHeaders(responseExecute.getHeaders());
        networkResponse.setBody(b(responseExecute));
        return networkResponse;
    }

    public i0(Context context) {
        this.d = context;
    }
}
