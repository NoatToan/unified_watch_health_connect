package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;

/* JADX INFO: loaded from: classes12.dex */
public class iv implements jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpClient f19278a;

    @Override // com.huawei.openalliance.ad.jc
    public void a(jd jdVar, final jc.a aVar) {
        this.f19278a.newSubmit(a(jdVar, "GET")).enqueue(new Callback() { // from class: com.huawei.openalliance.ad.iv.1
            @Override // com.huawei.hms.network.httpclient.Callback
            public void onResponse(Submit submit, Response response) {
                jc.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(iv.this.a(response));
                }
            }

            @Override // com.huawei.hms.network.httpclient.Callback
            public void onFailure(Submit submit, Throwable th) {
                hw.d("NetworkKitHttpClient", "onFailure: %s", th.getClass().getSimpleName());
                jc.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public je a(Response response) {
        jb jbVar = new jb();
        if (response.getHeaders() != null) {
            for (String str : response.getHeaders().keySet()) {
                jbVar.a(str, response.getHeaders().get(str).toString());
            }
        }
        return new je(jbVar, response.getCode(), new ja(response.getBody() == null ? null : ((ResponseBody) response.getBody()).getInputStream()), response.getMessage());
    }

    private Request a(jd jdVar, String str) {
        jb jbVarB = jdVar.b();
        Request.Builder builderNewRequest = this.f19278a.newRequest();
        builderNewRequest.url(jdVar.a()).method(str);
        if (jbVarB != null) {
            for (String str2 : jbVarB.a()) {
                String strA = jbVarB.a(str2);
                if (!TextUtils.isEmpty(strA)) {
                    builderNewRequest.addHeader(str2, strA);
                }
            }
        }
        if ("POST".equalsIgnoreCase(str)) {
            builderNewRequest.requestBody(RequestBodyProviders.create(jdVar.c()));
        }
        return builderNewRequest.build();
    }

    public iv(int i, int i2, int i3) {
        HttpClient.Builder timeout = new HttpClient.Builder().callTimeout(i).connectTimeout(i2).readTimeout(i3);
        if (il.a() != null && il.b() != null) {
            timeout.sslSocketFactory(il.a(), il.b());
        }
        this.f19278a = timeout.build();
    }
}
