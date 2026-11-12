package com.huawei.hianalytics.core.transport.net;

import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.embedded.y;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends TransportHandler {
    public final int d;
    public final boolean e;

    public b(String str, Map map, byte[] bArr, int i, boolean z) {
        super(str, map, bArr);
        this.d = i;
        this.e = z;
    }

    @Override // com.huawei.hianalytics.core.transport.net.TransportHandler
    public final Response a() {
        return a("GET");
    }

    @Override // com.huawei.hianalytics.core.transport.net.TransportHandler
    public final Response b() {
        return a("POST");
    }

    public final Response a(String str) {
        HttpClient.Builder timeout = new HttpClient.Builder().readTimeout(y.f15619c);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metric_policy", this.d);
        } catch (Exception unused) {
            HiLog.w("NetworkKitHandler", "fail to build custom option");
        }
        HttpClient httpClientBuild = timeout.options(jSONObject.toString()).writeTimeout(y.f15619c).connectTimeout(y.f15619c).retryTimeOnConnectionFailure(0).build();
        Request.Builder builderMethod = httpClientBuild.newRequest().url(this.f11477a).method(str);
        Map map = this.f11478b;
        if (map != null) {
            for (String str2 : map.keySet()) {
                builderMethod.addHeader(str2, (String) this.f11478b.get(str2));
            }
        }
        if (!"GET".equals(str)) {
            builderMethod.addHeader("Conntent-Length", String.valueOf(this.f11479c.length));
            builderMethod.requestBody(RequestBodyProviders.create("application/json; charset=UTF-8", this.f11479c));
        }
        if (this.e) {
            HiLog.d("NetworkKitHandler", "enable http shortLink");
            builderMethod.addHeader("Connection", "close");
        }
        Request requestBuild = builderMethod.build();
        AutoCloseable autoCloseable = null;
        try {
            try {
                com.huawei.hms.network.httpclient.Response<ResponseBody> responseExecute = httpClientBuild.newSubmit(requestBuild).execute();
                if (responseExecute.getBody() == null) {
                    Response response = new Response(responseExecute.getCode(), "");
                    try {
                        responseExecute.close();
                    } catch (IOException unused2) {
                        HiLog.e("NetworkKitHandler", "NetworkKit IOException");
                    }
                    return response;
                }
                Response response2 = new Response(responseExecute.getCode(), new String(responseExecute.getBody().bytes(), StandardCharsets.UTF_8));
                try {
                    responseExecute.close();
                } catch (IOException unused3) {
                    HiLog.e("NetworkKitHandler", "NetworkKit IOException");
                }
                return response2;
            } catch (IOException e) {
                Response response3 = new Response(-108, e.getMessage());
                if (0 != 0) {
                    try {
                        autoCloseable.close();
                    } catch (IOException unused4) {
                        HiLog.e("NetworkKitHandler", "NetworkKit IOException");
                    }
                }
                return response3;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    autoCloseable.close();
                } catch (IOException unused5) {
                    HiLog.e("NetworkKitHandler", "NetworkKit IOException");
                }
            }
            throw th;
        }
    }
}
