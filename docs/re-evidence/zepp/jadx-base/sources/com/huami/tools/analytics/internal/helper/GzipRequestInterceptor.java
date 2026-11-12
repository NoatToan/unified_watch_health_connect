package com.huami.tools.analytics.internal.helper;

import androidx.annotation.NonNull;
import com.loopj.android.http.AsyncHttpClient;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* JADX INFO: loaded from: classes15.dex */
public class GzipRequestInterceptor implements Interceptor {
    private static final String a = "Content-Encoding";

    public class a extends RequestBody {
        public final /* synthetic */ RequestBody a;

        public a(RequestBody requestBody) {
            this.a = requestBody;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.a.contentType();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(@NonNull BufferedSink bufferedSink) throws IOException {
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(bufferedSink));
            this.a.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
        }
    }

    private RequestBody a(RequestBody requestBody) {
        return new a(requestBody);
    }

    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        return (request.body() == null || request.header("Content-Encoding") != null) ? chain.proceed(request) : chain.proceed(request.newBuilder().header("Content-Encoding", AsyncHttpClient.ENCODING_GZIP).method(request.method(), a(request.body())).build());
    }
}
