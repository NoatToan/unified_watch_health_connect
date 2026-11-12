package com.service.mi.common.http;

import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;

/* JADX INFO: loaded from: classes6.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    public static final Charset c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Level f10599b = Level.NONE;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface a {
        void log(String str);
    }

    public HttpLoggingInterceptor(a aVar) {
        this.f10598a = aVar;
    }

    public static boolean b(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i = 0; i < 16 && !buffer2.exhausted(); i++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final boolean a(Headers headers) {
        String str = headers.get(HTTP.CONTENT_ENCODING);
        return (str == null || str.equalsIgnoreCase(HTTP.IDENTITY_CODING) || str.equalsIgnoreCase("gzip")) ? false : true;
    }

    public HttpLoggingInterceptor c(Level level) {
        if (level == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.f10599b = level;
        return this;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        boolean z;
        char c2;
        String string;
        Level level = this.f10599b;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z2 = level == Level.BODY;
        boolean z3 = z2 || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        boolean z4 = requestBodyBody != null;
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        sb.append(connection != null ? " " + connection.protocol() : "");
        String string2 = sb.toString();
        if (!z3 && z4) {
            string2 = string2 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.f10598a.log(string2);
        if (z3) {
            if (z4) {
                if (requestBodyBody.getContentType() != null) {
                    this.f10598a.log("Content-Type: " + requestBodyBody.getContentType());
                }
                if (requestBodyBody.contentLength() != -1) {
                    this.f10598a.log("Content-Length: " + requestBodyBody.contentLength());
                }
            }
            Headers headers = request.headers();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                String strName = headers.name(i);
                int i2 = size;
                if (!"Content-Type".equalsIgnoreCase(strName) && !HTTP.CONTENT_LEN.equalsIgnoreCase(strName)) {
                    this.f10598a.log(strName + ": " + headers.value(i));
                }
                i++;
                size = i2;
                z3 = z3;
            }
            z = z3;
            if (!z2 || !z4) {
                this.f10598a.log("--> END " + request.method());
            } else if (a(request.headers())) {
                this.f10598a.log("--> END " + request.method() + " (encoded body omitted)");
            } else {
                Buffer buffer = new Buffer();
                requestBodyBody.writeTo(buffer);
                Charset charset = c;
                MediaType contentType = requestBodyBody.getContentType();
                if (contentType != null) {
                    charset = contentType.charset(charset);
                }
                this.f10598a.log("");
                if (b(buffer)) {
                    this.f10598a.log(buffer.readString(charset));
                    this.f10598a.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                } else {
                    this.f10598a.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                }
            }
        } else {
            z = z3;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            long contentLength = responseBodyBody.getContentLength();
            String str = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            a aVar = this.f10598a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(responseProceed.code());
            if (responseProceed.message().isEmpty()) {
                string = "";
                c2 = ' ';
            } else {
                StringBuilder sb3 = new StringBuilder();
                c2 = ' ';
                sb3.append(' ');
                sb3.append(responseProceed.message());
                string = sb3.toString();
            }
            sb2.append(string);
            sb2.append(c2);
            sb2.append(responseProceed.request().url());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z ? "" : ", " + str + " body");
            sb2.append(')');
            aVar.log(sb2.toString());
            if (z) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    this.f10598a.log(headers2.name(i3) + ": " + headers2.value(i3));
                }
                if (!z2 || !HttpHeaders.hasBody(responseProceed)) {
                    this.f10598a.log("<-- END HTTP");
                } else if (a(responseProceed.headers())) {
                    this.f10598a.log("<-- END HTTP (encoded body omitted)");
                } else {
                    BufferedSource source = responseBodyBody.getSource();
                    source.request(Long.MAX_VALUE);
                    Buffer bufferField = source.getBufferField();
                    Long l = null;
                    GzipSource gzipSource = null;
                    if ("gzip".equalsIgnoreCase(headers2.get(HTTP.CONTENT_ENCODING))) {
                        Long lValueOf = Long.valueOf(bufferField.size());
                        try {
                            GzipSource gzipSource2 = new GzipSource(bufferField.clone());
                            try {
                                bufferField = new Buffer();
                                bufferField.writeAll(gzipSource2);
                                gzipSource2.close();
                                l = lValueOf;
                            } catch (Throwable th) {
                                th = th;
                                gzipSource = gzipSource2;
                                if (gzipSource != null) {
                                    gzipSource.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Charset charset2 = c;
                    MediaType mediaType = responseBodyBody.get$contentType();
                    if (mediaType != null) {
                        charset2 = mediaType.charset(charset2);
                    }
                    if (!b(bufferField)) {
                        this.f10598a.log("");
                        this.f10598a.log("<-- END HTTP (binary " + bufferField.size() + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (contentLength != 0) {
                        this.f10598a.log("");
                        this.f10598a.log(bufferField.clone().readString(charset2));
                    }
                    if (l != null) {
                        this.f10598a.log("<-- END HTTP (" + bufferField.size() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.f10598a.log("<-- END HTTP (" + bufferField.size() + "-byte body)");
                    }
                }
            }
            return responseProceed;
        } catch (Exception e) {
            e.printStackTrace();
            this.f10598a.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }
}
