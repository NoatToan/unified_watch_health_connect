package com.mapbox.common.module.okhttp;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.ReadStream;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.HttpClientDetail;
import com.mapbox.common.module.RequestDetail;
import e23.l;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0015\u001a\u0016\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", "Lcom/mapbox/common/module/HttpClientDetail;", "<init>", "()V", "", "max", "", "setMaxRequestsPerHost", "(B)V", "", "supportsKeepCompression", "()Z", "Lcom/mapbox/common/http_backend/Request;", "request", "", "Lcom/mapbox/common/module/RequestId;", TtmlNode.ATTR_ID, "Lcom/mapbox/common/http_backend/RequestObserver;", "requestObserver", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "Lcom/mapbox/common/module/RequestDetail;", "buildRequest", "(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Le23/l;)Lcom/mapbox/common/module/RequestDetail;", "Ljava/util/concurrent/ExecutorService;", "executor", "()Ljava/util/concurrent/ExecutorService;", "Lcom/mapbox/common/module/okhttp/LazyClient;", "httpClient", "Lcom/mapbox/common/module/okhttp/LazyClient;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OkHttpClientDetail implements HttpClientDetail {
    private final LazyClient httpClient = new LazyClient(null, false);

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.HEAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpMethod.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public RequestDetail buildRequest(Request request, long id3, RequestObserver requestObserver, l<? super Long, Unit> onRequestFinished) {
        request.getClass();
        requestObserver.getClass();
        onRequestFinished.getClass();
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        String url = request.getUrl();
        url.getClass();
        okhttp3.Request.Builder builderUrl = builder.url(url);
        String lowerCase = url.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        builderUrl.tag(lowerCase);
        HashMap<String, String> headers = request.getHeaders();
        headers.getClass();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            key.getClass();
            value.getClass();
            builder.addHeader(key, value);
        }
        if ((request.getFlags() & 1) != 0) {
            builder.addHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[request.getMethod().ordinal()];
        if (i14 == 1) {
            builder.head();
        } else if (i14 == 2) {
            builder.get();
        } else if (i14 == 3) {
            ReadStream body = request.getBody();
            if (body == null) {
                builder.post(RequestBody.Companion.create$default(RequestBody.INSTANCE, new byte[0], (MediaType) null, 0, 0, 7, (Object) null));
            } else {
                builder.post(new StreamingRequestBody(body, null));
            }
        }
        Call callNewCall = this.httpClient.get().newCall(builder.build());
        callNewCall.timeout().timeout(request.getTimeout(), TimeUnit.SECONDS);
        return new OkHttpRequestDetail(callNewCall, new CallbackWrapper(this, id3, callNewCall, new HttpCallback(id3, requestObserver, onRequestFinished), onRequestFinished));
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public ExecutorService executor() {
        return this.httpClient.get().dispatcher().executorService();
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public void setMaxRequestsPerHost(byte max) {
        this.httpClient.setMaxRequestsPerHost(max);
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public boolean supportsKeepCompression() {
        return true;
    }
}
