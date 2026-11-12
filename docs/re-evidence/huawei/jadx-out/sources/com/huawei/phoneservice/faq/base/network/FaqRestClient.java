package com.huawei.phoneservice.faq.base.network;

import android.content.Context;
import com.google.gson.Gson;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.MediaType;
import com.huawei.hms.framework.network.restclient.hwhttp.Request;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.hms.framework.network.util.HttpUtils;
import com.huawei.hms.network.base.common.MultipartBody;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.k;
import defpackage.zcm;
import defpackage.zcp;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
public class FaqRestClient {
    public static final Companion Companion = new Companion(null);
    private static volatile FaqRestClient instance;
    private HttpClient attachClient;
    private com.huawei.hms.framework.network.restclient.hwhttp.HttpClient restClient;
    private final Gson gson = new Gson();
    private final Map<String, List<Submit>> submitMap = new ConcurrentHashMap();
    private final Map<String, List<com.huawei.hms.network.httpclient.Submit<ResponseBody>>> attachSubmitMap = new ConcurrentHashMap();
    private final int CONNECT_TIME_OUT = 8000;
    private final int UPLOAD_ZIP_TIME_OUT = 30000;
    private final int UPLOAD_ZIP_RETRY_TIME = 3;
    private final String HEAD_CHANNEL_KEY = "channelId";
    private final String HEAD_VERSION_KEY = "sdkVersion";
    private final String HEAD_SWG_KEY = "SGW-APP-ID";
    private final String SGW_APP_ID = "26C7C8265E4924A6757A52FD571E03F4";

    public Submit uploadZipFileToService(Context context, String str, Map<String, String> map, String str2, File file, String str3) {
        zcp.c(str, "");
        zcp.c(map, "");
        zcp.c(str2, "");
        zcp.c(file, "");
        if (!HttpUtils.isHttpOrGrsUrl(str)) {
            return null;
        }
        Request requestBuild = new Request.Builder().method(str3).headers(Headers.of(map).newBuilder()).url(str).connectTimeout(this.UPLOAD_ZIP_TIME_OUT).readTimeout(this.UPLOAD_ZIP_TIME_OUT).writeTimeout(this.UPLOAD_ZIP_TIME_OUT).retryTimeOnConnectionFailure(this.UPLOAD_ZIP_RETRY_TIME).requestBody(RequestBody.create(MediaType.parse(str2), file)).build();
        com.huawei.hms.framework.network.restclient.hwhttp.HttpClient httpClient = this.restClient;
        zcp.e(httpClient);
        Submit submitNewSubmit = httpClient.newSubmit(requestBuild);
        zcp.b((Object) submitNewSubmit, "");
        putSubmit(context, submitNewSubmit);
        return submitNewSubmit;
    }

    public Submit uploadZipFile(Context context, String str, Map<String, String> map, String str2, File file, String str3) {
        zcp.c(str, "");
        zcp.c(map, "");
        zcp.c(str3, "");
        if (!HttpUtils.isHttpOrGrsUrl(str)) {
            return null;
        }
        Request requestBuild = new Request.Builder().method("POST").headers(Headers.of(map).newBuilder()).url(str).requestBody(RequestBody.create(str3)).build();
        com.huawei.hms.framework.network.restclient.hwhttp.HttpClient httpClient = this.restClient;
        zcp.e(httpClient);
        Submit submitNewSubmit = httpClient.newSubmit(requestBuild);
        zcp.b((Object) submitNewSubmit, "");
        putSubmit(context, submitNewSubmit);
        return submitNewSubmit;
    }

    public com.huawei.hms.network.httpclient.Submit<ResponseBody> uploadAttachs(Context context, String str, String str2, String str3, File file, Callback<ResponseBody> callback) {
        zcp.c(str, "");
        zcp.c(file, "");
        zcp.c(callback, "");
        if (!HttpUtils.isHttpOrGrsUrl(str)) {
            return null;
        }
        HttpClient httpClient = this.attachClient;
        zcp.e(httpClient);
        com.huawei.hms.network.httpclient.Request.Builder builderMethod = httpClient.newRequest().url(str).method("POST");
        MultipartBody multipartBodyBuild = new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("file", file.getName(), RequestBodyProviders.create(com.huawei.hms.network.base.common.MediaType.parse(str3), file)).build();
        if (!k.b(str2)) {
            builderMethod.addHeader("accessToken", str2);
        }
        builderMethod.requestBody(multipartBodyBuild);
        com.huawei.hms.network.httpclient.Request requestBuild = builderMethod.build();
        zcp.b((Object) requestBuild, "");
        HttpClient httpClient2 = this.attachClient;
        zcp.e(httpClient2);
        com.huawei.hms.network.httpclient.Submit<ResponseBody> submitNewSubmit = httpClient2.newSubmit(requestBuild);
        zcp.b((Object) submitNewSubmit, "");
        submitNewSubmit.enqueue(callback);
        putAttachSubmit(context, submitNewSubmit);
        return submitNewSubmit;
    }

    public final void setRestClient(com.huawei.hms.framework.network.restclient.hwhttp.HttpClient httpClient) {
        this.restClient = httpClient;
    }

    public final void setAttachClient(HttpClient httpClient) {
        this.attachClient = httpClient;
    }

    public final com.huawei.hms.framework.network.restclient.hwhttp.HttpClient getRestClient() {
        return this.restClient;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public final HttpClient getAttachClient() {
        return this.attachClient;
    }

    public final Submit downloadFile(Context context, String str, String str2, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(callback, "");
        if (!HttpUtils.isHttpOrGrsUrl(str)) {
            return null;
        }
        Request requestBuild = new Request.Builder().url(str).addHeader("accessToken", str2).build();
        com.huawei.hms.framework.network.restclient.hwhttp.HttpClient httpClient = this.restClient;
        zcp.e(httpClient);
        Submit submitNewSubmit = httpClient.newSubmit(requestBuild);
        submitNewSubmit.enqueue(callback);
        zcp.b((Object) submitNewSubmit, "");
        putSubmit(context, submitNewSubmit);
        return submitNewSubmit;
    }

    public void canceledSubmit(Context context) {
        String name = context != null ? context.getClass().getName() : null;
        if (name == null) {
            return;
        }
        List<Submit> list = this.submitMap.get(name);
        if (!com.huawei.phoneservice.faq.base.util.d.c(list)) {
            zcp.e(list);
            for (Submit submit : list) {
                if (!submit.isCanceled()) {
                    submit.cancel();
                }
            }
        }
        canceledAttachSubmit(name);
    }

    public Submit asyncRequestWithJson(Context context, String str, String str2, Headers headers, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(headers, "");
        zcp.c(callback, "");
        if (!HttpUtils.isHttpOrGrsUrl(str)) {
            return null;
        }
        Request requestBuild = new Request.Builder().headers(headers.newBuilder()).method("POST").requestBody(RequestBody.create(MediaType.parse("application/json"), str2)).url(str).build();
        com.huawei.hms.framework.network.restclient.hwhttp.HttpClient httpClient = this.restClient;
        zcp.e(httpClient);
        Submit submitNewSubmit = httpClient.newSubmit(requestBuild);
        submitNewSubmit.enqueue(callback);
        return submitNewSubmit;
    }

    public Submit asyncRequestWitHead(Context context, String str, Headers headers, String str2, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(str, "");
        zcp.c(headers, "");
        zcp.c(callback, "");
        if (!HttpUtils.isHttpOrGrsUrl(str)) {
            return null;
        }
        Request requestBuild = new Request.Builder().method("POST").headers(headers.newBuilder()).requestBody(RequestBody.create(str2)).url(str).callTimeout(this.CONNECT_TIME_OUT).build();
        com.huawei.hms.framework.network.restclient.hwhttp.HttpClient httpClient = this.restClient;
        zcp.e(httpClient);
        Submit submitNewSubmit = httpClient.newSubmit(requestBuild);
        submitNewSubmit.enqueue(callback);
        zcp.b((Object) submitNewSubmit, "");
        putSubmit(context, submitNewSubmit);
        return submitNewSubmit;
    }

    public Submit asyncRequest(Context context, String str, String str2, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(callback, "");
        if (!HttpUtils.isHttpOrGrsUrl(str)) {
            return null;
        }
        Request requestBuild = new Request.Builder().headers(new Headers.Builder().add(this.HEAD_CHANNEL_KEY, i.d().getSdk("channel")).add(this.HEAD_VERSION_KEY, i.d().getSdkVersion()).add(this.HEAD_SWG_KEY, this.SGW_APP_ID).build().newBuilder()).method("POST").requestBody(RequestBody.create(str2)).url(str).build();
        com.huawei.hms.framework.network.restclient.hwhttp.HttpClient httpClient = this.restClient;
        zcp.e(httpClient);
        Submit submitNewSubmit = httpClient.newSubmit(requestBuild);
        submitNewSubmit.enqueue(callback);
        return submitNewSubmit;
    }

    private final void putSubmit(Context context, Submit submit) {
        String name = context != null ? context.getClass().getName() : null;
        if (name == null) {
            return;
        }
        List<Submit> arrayList = this.submitMap.get(name);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.submitMap.put(name, arrayList);
        }
        arrayList.add(submit);
    }

    private final void putAttachSubmit(Context context, com.huawei.hms.network.httpclient.Submit<ResponseBody> submit) {
        String name = context != null ? context.getClass().getName() : null;
        if (name == null) {
            return;
        }
        List<com.huawei.hms.network.httpclient.Submit<ResponseBody>> arrayList = this.attachSubmitMap.get(name);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.attachSubmitMap.put(name, arrayList);
        }
        arrayList.add(submit);
    }

    @JvmStatic
    public static final FaqRestClient initRestClientAnno(Context context) {
        return Companion.initRestClientAnno(context);
    }

    private final void canceledAttachSubmit(String str) {
        List<com.huawei.hms.network.httpclient.Submit<ResponseBody>> list = this.attachSubmitMap.get(str);
        if (com.huawei.phoneservice.faq.base.util.d.c(list)) {
            return;
        }
        zcp.e(list);
        for (com.huawei.hms.network.httpclient.Submit<ResponseBody> submit : list) {
            if (!submit.isCanceled()) {
                submit.cancel();
            }
        }
    }

    public static final class Companion {
        @JvmStatic
        public final FaqRestClient initRestClientAnno(Context context) {
            if (FaqRestClient.instance == null) {
                FaqRestClient.instance = new FaqRestClient(context);
            }
            return FaqRestClient.instance;
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }

        private Companion() {
        }
    }

    public FaqRestClient(Context context) {
        HttpClientGlobalInstance.getInstance().init(context);
        com.huawei.hms.framework.network.restclient.hwhttp.HttpClient.Builder builderIsReportable = new com.huawei.hms.framework.network.restclient.hwhttp.HttpClient.Builder().callTimeout(151000).readTimeout(151000).retryTimeOnConnectionFailure(2).addInterceptor(new b().a(b.a.BODY)).isReportable(true);
        HttpClient.Builder builderAddInterceptor = new HttpClient.Builder().callTimeout(151000).readTimeout(151000).retryTimeOnConnectionFailure(2).addInterceptor((Interceptor) new a().e(a.EnumC0254a.BODY));
        this.restClient = builderIsReportable.build();
        this.attachClient = builderAddInterceptor.build();
    }
}
