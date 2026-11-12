package com.huawei.maps.offlinedata.network;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.framework.network.restclient.hwhttp.url.HttpUrl;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.hms.network.base.common.MediaType;
import com.huawei.hms.network.base.common.ResponseBodyProviders;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.maps.offlinedata.service.cloud.utils.e;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.secure.android.common.util.SafeString;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class a extends Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f17863a = new C0186a();

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.network.a$a, reason: collision with other inner class name */
    class C0186a extends HashMap {
        C0186a() {
            put("/open-service/v1/offline-data/authenticate", "authenticate");
            put("/open-service/v1/offline-data/getWorldMap", "getWorldMap");
            put("/open-service/v1/offline-data/getCountryMapList", "getCountryMapList");
            put("/open-service/v1/offline-data/getRegionMapList", "getRegionMapList");
            put("/open-service/v1/offline-data/getDownloadUrl", "getDownloadUrl");
            put("/open-service/v1/offline-data/getRegionsByLatLngs", "getRegionsByLatLngs");
        }
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Throwable {
        HttpUrl httpUrl = new HttpUrl(chain.request().getUrl());
        String str = (String) f17863a.get(httpUrl.getURL().getPath());
        com.huawei.maps.offlinedata.logpush.dto.a aVarA = com.huawei.maps.offlinedata.logpush.dto.a.C0185a.b().a(str).a();
        com.huawei.maps.offlinedata.network.converter.b bVarA = a(chain);
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        String strA = com.huawei.maps.offlinedata.service.cloud.utils.c.a(str, com.huawei.maps.offlinedata.service.cloud.utils.b.a(com.huawei.maps.offlinedata.utils.a.b()));
        aVarA.c(strA);
        String strA2 = com.huawei.maps.offlinedata.service.cloud.utils.a.a(com.huawei.maps.offlinedata.utils.a.b(), AgConnectInfo.AgConnectKey.API_KEY);
        builderNewBuilder.addHeader("offlineClientVersion", String.valueOf(e.a()));
        builderNewBuilder.addHeader("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + strA2);
        if ("GET".equals(chain.request().getMethod())) {
            a(builderNewBuilder, strA);
        } else if ("POST".equals(chain.request().getMethod())) {
            builderNewBuilder.addHeader("Content-Type", "application/json");
            a(bVarA, builderNewBuilder, strA);
        }
        Request requestBuild = builderNewBuilder.url(httpUrl.getUrl()).build();
        Locale locale = Locale.ENGLISH;
        g.a("CommonInterceptor", String.format(locale, "start: [%s]", httpUrl.getURL().getPath()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        Response<ResponseBody> responseProceed = chain.proceed(requestBuild);
        g.a("CommonInterceptor", String.format(locale, "end: [%s] result：%s [cost time]: %s", httpUrl.getURL().getPath(), Boolean.valueOf(responseProceed.isOK()), Integer.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis))));
        ResponseBody body = responseProceed.isSuccessful() ? responseProceed.getBody() : responseProceed.getErrorBody();
        if (body == null) {
            a(responseProceed, aVarA);
            return responseProceed;
        }
        ByteArrayOutputStream byteArrayOutputStreamA = a(body.getInputStream());
        try {
            if (byteArrayOutputStreamA == null) {
                a(responseProceed, aVarA);
                if (byteArrayOutputStreamA != null) {
                    byteArrayOutputStreamA.close();
                }
                return responseProceed;
            }
            ResponseBody responseBodyCreate = ResponseBodyProviders.create(MediaType.parse(body.getContentType()), body.getContentLength(), new ByteArrayInputStream(byteArrayOutputStreamA.toByteArray()));
            ResponseBody responseBodyCreate2 = ResponseBodyProviders.create(MediaType.parse(body.getContentType()), body.getContentLength(), new ByteArrayInputStream(byteArrayOutputStreamA.toByteArray()));
            Response responseBuild = responseProceed.createBuilder().body(responseBodyCreate).build();
            a(responseProceed.createBuilder().body(responseBodyCreate2).build(), aVarA);
            byteArrayOutputStreamA.close();
            return responseBuild;
        } catch (Throwable th) {
            if (byteArrayOutputStreamA != null) {
                try {
                    byteArrayOutputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void a(Response response, com.huawei.maps.offlinedata.logpush.dto.a aVar) {
        ResponseBody responseBody = (ResponseBody) response.getBody();
        String strValueOf = "";
        if (responseBody != null) {
            try {
                JsonObject jsonObjectB = com.huawei.maps.offlinedata.utils.d.b(new String(responseBody.bytes(), StandardCharsets.UTF_8));
                strValueOf = jsonObjectB.has("returnCode") ? jsonObjectB.get("returnCode").getAsString() : "";
                com.huawei.maps.offlinedata.utils.e.a("CommonInterceptor", response);
            } catch (JsonParseException | IOException unused) {
                com.huawei.maps.offlinedata.utils.e.a("CommonInterceptor", response);
            } catch (Throwable th) {
                com.huawei.maps.offlinedata.utils.e.a("CommonInterceptor", response);
                throw th;
            }
        }
        if (TextUtils.isEmpty(strValueOf)) {
            strValueOf = String.valueOf(response.getCode());
        }
        g.c("CommonInterceptor", "response body returnCode:" + strValueOf);
        aVar.b(strValueOf);
        com.huawei.maps.offlinedata.logpush.b.b(aVar);
    }

    private void a(Request.Builder builder, String str) {
        builder.addHeader("requestId", str);
    }

    private com.huawei.maps.offlinedata.network.converter.b a(Interceptor.Chain chain) {
        JSONObject jSONObject = null;
        if (chain.request().getBody() == null || TextUtils.isEmpty(chain.request().getBody().contentType())) {
            return null;
        }
        com.huawei.maps.offlinedata.network.converter.b bVar = (com.huawei.maps.offlinedata.network.converter.b) com.huawei.maps.offlinedata.utils.d.a(chain.request().getBody().contentType(), com.huawei.maps.offlinedata.network.converter.b.class);
        if (bVar != null) {
            try {
                jSONObject = new JSONObject(new String(bVar.a(), a(bVar.b())));
            } catch (UnsupportedEncodingException | JSONException unused) {
                g.b("CommonInterceptor", "resetContentType error");
            }
            if (jSONObject != null) {
                chain.request().newBuilder().requestBody(com.huawei.maps.offlinedata.network.converter.a.b("application/json; charset=utf-8", String.valueOf(jSONObject).getBytes(StandardCharsets.UTF_8)));
            }
        }
        return bVar;
    }

    private void a(com.huawei.maps.offlinedata.network.converter.b bVar, Request.Builder builder, String str) {
        if (bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bVar.a(), a(bVar.b())));
                if (!jSONObject.has("requestId")) {
                    jSONObject.put("requestId", str);
                }
                builder.requestBody(com.huawei.maps.offlinedata.network.converter.a.b("application/json; charset=utf-8", String.valueOf(jSONObject).getBytes(StandardCharsets.UTF_8)));
            } catch (UnsupportedEncodingException | JSONException e) {
                g.b("CommonInterceptor", e.getMessage());
            }
        }
    }

    private String a(String str) {
        int iIndexOf;
        return (str == null || (iIndexOf = str.indexOf("charset=")) == -1) ? StandardCharsets.UTF_8.name() : SafeString.substring(str, iIndexOf + 8);
    }

    private ByteArrayOutputStream a(InputStream inputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i > -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            byteArrayOutputStream.flush();
                            com.huawei.maps.offlinedata.utils.e.a("CommonInterceptor", byteArrayOutputStream);
                            return byteArrayOutputStream;
                        }
                        th = th;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        com.huawei.maps.offlinedata.utils.e.a("CommonInterceptor", byteArrayOutputStream2);
                        throw th;
                    }
                } catch (IOException unused) {
                    g.b("CommonInterceptor", "IOException");
                    com.huawei.maps.offlinedata.utils.e.a("CommonInterceptor", byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
            }
        } catch (IOException unused2) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
