package com.huawei.agconnect.https;

import com.huawei.openalliance.ad.constant.Constants;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* JADX INFO: loaded from: classes22.dex */
class GzipRequestInterceptor implements Interceptor {

    public static class GzipRequestBody extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestBody f5013a;

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(bufferedSink));
            this.f5013a.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return MediaType.parse("application/x-gzip");
        }

        public GzipRequestBody(RequestBody requestBody) {
            this.f5013a = requestBody;
        }
    }

    public static class RequestBodyMod extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RequestBody f5014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Buffer f5015b;

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f5015b.snapshot());
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.f5014a.get$contentType();
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f5015b.size();
        }

        public RequestBodyMod(RequestBody requestBody) throws IOException {
            this.f5015b = null;
            this.f5014a = requestBody;
            Buffer buffer = new Buffer();
            this.f5015b = buffer;
            requestBody.writeTo(buffer);
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        return (request.header("Content-Encoding") != null || request.body() == null) ? chain.proceed(request) : chain.proceed(request.newBuilder().header("Content-Encoding", Constants.GZIP).method(request.method(), a(b(request.body()))).build());
    }

    public final RequestBody b(RequestBody requestBody) {
        return new GzipRequestBody(requestBody);
    }

    public final RequestBody a(RequestBody requestBody) throws IOException {
        return new RequestBodyMod(requestBody);
    }
}
