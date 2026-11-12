package okhttp3.internal.http;

import com.huawei.hms.network.embedded.y;
import defpackage.yyl;
import defpackage.zcp;
import defpackage.zes;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.BufferedSink;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", y.b.j}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[Catch: IOException -> 0x0098, TRY_LEAVE, TryCatch #2 {IOException -> 0x0098, blocks: (B:15:0x0051, B:17:0x0057, B:26:0x008d, B:28:0x0093, B:18:0x0066, B:19:0x0075, B:21:0x0082), top: B:85:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r9v4, types: [okhttp3.Response$Builder] */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        ?? PermitsRequestBody;
        ?? responseHeaders;
        Response responseBuild;
        ?? r9;
        zcp.c(chain, "");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.getExchange();
        zcp.e(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody requestBodyBody = request.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            exchange.writeRequestHeaders(request);
            PermitsRequestBody = HttpMethod.permitsRequestBody(request.method());
            try {
                if (PermitsRequestBody != 0 && requestBodyBody != null) {
                    if (zes.d("100-continue", request.header("Expect"), true)) {
                        exchange.flushRequest();
                        PermitsRequestBody = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z = false;
                            r9 = PermitsRequestBody;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange.getHasFailure()) {
                                responseHeaders = PermitsRequestBody;
                                throw e;
                            }
                        }
                    } else {
                        z = true;
                        r9 = 0;
                    }
                    if (r9 == 0) {
                        if (requestBodyBody.isDuplex()) {
                            exchange.flushRequest();
                            requestBodyBody.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
                        } else {
                            BufferedSink bufferedSinkBuffer = Okio.buffer(exchange.createRequestBody(request, false));
                            requestBodyBody.writeTo(bufferedSinkBuffer);
                            bufferedSinkBuffer.close();
                        }
                    } else {
                        exchange.noRequestBody();
                        if (!exchange.getConnection().isMultiplexed$okhttp()) {
                            PermitsRequestBody = r9;
                            exchange.noNewExchangesOnConnection();
                            PermitsRequestBody = r9;
                        }
                    }
                } else {
                    exchange.noRequestBody();
                    z = true;
                    PermitsRequestBody = 0;
                }
                if (requestBodyBody != null) {
                    PermitsRequestBody = r9;
                    if (!requestBodyBody.isDuplex()) {
                        PermitsRequestBody = r9;
                        PermitsRequestBody = r9;
                        PermitsRequestBody = r9;
                        exchange.finishRequest();
                    }
                } else {
                    PermitsRequestBody = r9;
                    PermitsRequestBody = r9;
                    PermitsRequestBody = r9;
                    exchange.finishRequest();
                }
                PermitsRequestBody = r9;
                e = null;
                responseHeaders = PermitsRequestBody;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            PermitsRequestBody = 0;
        }
        if (responseHeaders == 0) {
            try {
                responseHeaders = exchange.readResponseHeaders(false);
                zcp.e((Object) responseHeaders);
                if (z) {
                    exchange.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e4) {
                if (e != null) {
                    yyl.d(e, e4);
                    throw e;
                }
                throw e4;
            }
        }
        Response responseBuild2 = responseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int iCode = responseBuild2.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            Response.Builder responseHeaders2 = exchange.readResponseHeaders(false);
            zcp.e(responseHeaders2);
            if (z) {
                exchange.responseHeadersStart();
            }
            responseBuild2 = responseHeaders2.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild2.code();
        }
        exchange.responseHeadersEnd(responseBuild2);
        if (this.forWebSocket && iCode == 101) {
            responseBuild = responseBuild2.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            responseBuild = responseBuild2.newBuilder().body(exchange.openResponseBody(responseBuild2)).build();
        }
        if (zes.d("close", responseBuild.request().header("Connection"), true) || zes.d("close", Response.header$default(responseBuild, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (iCode == 204 || iCode == 205) {
            ResponseBody responseBodyBody = responseBuild.body();
            if ((responseBodyBody != null ? responseBodyBody.getContentLength() : -1L) > 0) {
                StringBuilder sb = new StringBuilder("HTTP ");
                sb.append(iCode);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild.body();
                sb.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.getContentLength()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return responseBuild;
    }
}
