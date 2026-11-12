package okhttp3.internal.http;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okio.BufferedSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder responseHeaders;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody requestBodyBody = request.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        exchange.writeRequestHeaders(request);
        if (!HttpMethod.permitsRequestBody(request.method()) || requestBodyBody == null) {
            exchange.noRequestBody();
            z = true;
            responseHeaders = null;
        } else {
            if (StringsKt__StringsJVMKt.equals(HTTP.EXPECT_CONTINUE, request.header(HTTP.EXPECT_DIRECTIVE), true)) {
                exchange.flushRequest();
                responseHeaders = exchange.readResponseHeaders(true);
                exchange.responseHeadersStart();
                z = false;
            } else {
                z = true;
                responseHeaders = null;
            }
            if (responseHeaders != null) {
                exchange.noRequestBody();
                if (!exchange.getConnection().isMultiplexed$okhttp()) {
                    exchange.noNewExchangesOnConnection();
                }
            } else if (requestBodyBody.isDuplex()) {
                exchange.flushRequest();
                requestBodyBody.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
            } else {
                BufferedSink bufferedSinkBuffer = Okio.buffer(exchange.createRequestBody(request, false));
                requestBodyBody.writeTo(bufferedSinkBuffer);
                bufferedSinkBuffer.close();
            }
        }
        if (requestBodyBody == null || !requestBodyBody.isDuplex()) {
            exchange.finishRequest();
        }
        if (responseHeaders == null) {
            responseHeaders = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders);
            if (z) {
                exchange.responseHeadersStart();
                z = false;
            }
        }
        Response responseBuild = responseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int iCode = responseBuild.code();
        if (iCode == 100) {
            Response.Builder responseHeaders2 = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders2);
            if (z) {
                exchange.responseHeadersStart();
            }
            responseBuild = responseHeaders2.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
        }
        exchange.responseHeadersEnd(responseBuild);
        Response responseBuild2 = (this.forWebSocket && iCode == 101) ? responseBuild.newBuilder().body(Util.EMPTY_RESPONSE).build() : responseBuild.newBuilder().body(exchange.openResponseBody(responseBuild)).build();
        if (StringsKt__StringsJVMKt.equals(Constants.EXTRA_CLOSE_TAI, responseBuild2.request().header(HTTP.CONN_DIRECTIVE), true) || StringsKt__StringsJVMKt.equals(Constants.EXTRA_CLOSE_TAI, Response.header$default(responseBuild2, HTTP.CONN_DIRECTIVE, null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (iCode == 204 || iCode == 205) {
            ResponseBody responseBodyBody = responseBuild2.body();
            if ((responseBodyBody == null ? -1L : responseBodyBody.getContentLength()) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iCode);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild2.body();
                sb.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.getContentLength()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return responseBuild2;
    }
}
