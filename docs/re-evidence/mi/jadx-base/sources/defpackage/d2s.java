package defpackage;

import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* JADX INFO: loaded from: classes7.dex */
public class d2s implements Interceptor {

    public class a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RequestBody f15017a;

        public a(d2s d2sVar, RequestBody requestBody) {
            this.f15017a = requestBody;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getContentType() {
            return this.f15017a.getContentType();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(bufferedSink));
            this.f15017a.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
        }
    }

    public final RequestBody a(RequestBody requestBody) {
        return new a(this, requestBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        return (request.body() == null || request.header(HTTP.CONTENT_ENCODING) != null) ? chain.proceed(request) : chain.proceed(request.newBuilder().header(HTTP.CONTENT_ENCODING, "gzip").method(request.method(), a(request.body())).build());
    }
}
