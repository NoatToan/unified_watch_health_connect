package com.huami.passport.utils;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.toolbox.HttpStack;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.Charsets;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0011\u001a\u00020\u00102\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J(\u0010\u0016\u001a\u00020\u00152\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/passport/utils/OkHttp3Stack;", "Lcom/android/volley/toolbox/HttpStack;", "Lokhttp3/Response;", "r", "Lorg/apache/http/HttpEntity;", "entityFromOkHttpResponse", "Lokhttp3/Request$Builder;", "builder", "Lcom/android/volley/Request;", "request", "", "setConnectionParametersForRequest", "Lokhttp3/Protocol;", com.google.android.exoplayer2.text.ttml.b.r, "Lorg/apache/http/ProtocolVersion;", "parseProtocol", "Lokhttp3/RequestBody;", "createRequestBody", "", "", "additionalHeaders", "Lorg/apache/http/HttpResponse;", "performRequest", "Lokhttp3/OkHttpClient;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "Lokhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "passport_release"}, k = 1, mv = {1, 5, 1})
public final class OkHttp3Stack implements HttpStack {

    @NotNull
    private final OkHttpClient client;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Protocol.values().length];
            iArr[Protocol.HTTP_1_0.ordinal()] = 1;
            iArr[Protocol.HTTP_1_1.ordinal()] = 2;
            iArr[Protocol.HTTP_2.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OkHttp3Stack(@NotNull OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    private final RequestBody createRequestBody(Request<?> r) throws AuthFailureError {
        byte[] body = r.getBody();
        if (body == null) {
            body = "".getBytes(Charsets.UTF_8);
        }
        return RequestBody.create(MediaType.parse(r.getBodyContentType()), body);
    }

    private final HttpEntity entityFromOkHttpResponse(Response r) throws IOException {
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        ResponseBody responseBodyBody = r.body();
        basicHttpEntity.setContent(responseBodyBody.byteStream());
        basicHttpEntity.setContentLength(responseBodyBody.contentLength());
        basicHttpEntity.setContentEncoding(r.header("Content-Encoding"));
        if (responseBodyBody.contentType() != null) {
            basicHttpEntity.setContentType(responseBodyBody.contentType().type());
        }
        return basicHttpEntity;
    }

    private final ProtocolVersion parseProtocol(Protocol p) {
        int i = WhenMappings.$EnumSwitchMapping$0[p.ordinal()];
        if (i == 1) {
            return new ProtocolVersion("HTTP", 1, 0);
        }
        if (i == 2) {
            return new ProtocolVersion("HTTP", 1, 1);
        }
        if (i == 3) {
            return new ProtocolVersion("HTTP", 2, 0);
        }
        throw new IllegalAccessError("Unknown protocol");
    }

    private final void setConnectionParametersForRequest(okhttp3.Request.Builder builder, Request<?> request) throws IOException, AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    builder.post(RequestBody.create(MediaType.parse(request.getPostBodyContentType()), postBody));
                    return;
                }
                return;
            case 0:
                builder.get();
                return;
            case 1:
                builder.post(createRequestBody(request));
                return;
            case 2:
                builder.put(createRequestBody(request));
                return;
            case 3:
                builder.delete();
                return;
            case 4:
                builder.head();
                return;
            case 5:
                builder.method(FirebasePerformance.HttpMethod.OPTIONS, null);
                return;
            case 6:
                builder.method(FirebasePerformance.HttpMethod.TRACE, null);
                return;
            case 7:
                builder.patch(createRequestBody(request));
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // com.android.volley.toolbox.HttpStack
    @NotNull
    public HttpResponse performRequest(@NotNull Request<?> request, @NotNull Map<String, String> additionalHeaders) throws IOException, AuthFailureError {
        okhttp3.Request.Builder builderUrl = new okhttp3.Request.Builder().url(request.getUrl());
        if (request.getTag() != null) {
            builderUrl.tag(request.getTag());
        }
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : additionalHeaders.entrySet()) {
            builderUrl.addHeader(entry2.getKey(), entry2.getValue());
        }
        setConnectionParametersForRequest(builderUrl, request);
        Response responseExecute = FirebasePerfOkHttpClient.execute(this.client.newCall(builderUrl.build()));
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(parseProtocol(responseExecute.protocol()), responseExecute.code(), responseExecute.message()));
        basicHttpResponse.setEntity(entityFromOkHttpResponse(responseExecute));
        Headers headers = responseExecute.headers();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            basicHttpResponse.addHeader(new BasicHeader(headers.name(i), headers.value(i)));
        }
        return basicHttpResponse;
    }
}
