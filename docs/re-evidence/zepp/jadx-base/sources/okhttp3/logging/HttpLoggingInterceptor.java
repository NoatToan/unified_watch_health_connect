package okhttp3.logging;

import com.loopj.android.http.AsyncHttpClient;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import io.netty.util.internal.StringUtil;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
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
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;

/* JADX INFO: loaded from: classes23.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private static final Charset d = Charset.forName("UTF-8");
    private final Logger a;
    private volatile Set<String> b;
    private volatile Level c;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Logger DEFAULT = new a();

        public class a implements Logger {
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String str) {
                Platform.get().log(4, str, null);
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    private static boolean a(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || str.equalsIgnoreCase(LoseWeightPropertyKey.IDENTITY) || str.equalsIgnoreCase(AsyncHttpClient.ENCODING_GZIP)) ? false : true;
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

    private void c(Headers headers, int i) {
        String strValue = this.b.contains(headers.name(i)) ? "██" : headers.value(i);
        this.a.log(headers.name(i) + ": " + strValue);
    }

    public Level getLevel() {
        return this.c;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        char c;
        String string;
        Level level = this.c;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        boolean z3 = requestBodyBody != null;
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(StringUtil.SPACE);
        sb.append(request.url());
        sb.append(connection != null ? " " + connection.protocol() : "");
        String string2 = sb.toString();
        if (!z2 && z3) {
            string2 = string2 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.a.log(string2);
        if (z2) {
            if (z3) {
                if (requestBodyBody.contentType() != null) {
                    this.a.log("Content-Type: " + requestBodyBody.contentType());
                }
                if (requestBodyBody.contentLength() != -1) {
                    this.a.log("Content-Length: " + requestBodyBody.contentLength());
                }
            }
            Headers headers = request.headers();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String strName = headers.name(i);
                if (!"Content-Type".equalsIgnoreCase(strName) && !"Content-Length".equalsIgnoreCase(strName)) {
                    c(headers, i);
                }
            }
            if (!z || !z3) {
                this.a.log("--> END " + request.method());
            } else if (a(request.headers())) {
                this.a.log("--> END " + request.method() + " (encoded body omitted)");
            } else {
                Buffer buffer = new Buffer();
                requestBodyBody.writeTo(buffer);
                Charset charset = d;
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null) {
                    charset = mediaTypeContentType.charset(charset);
                }
                this.a.log("");
                if (b(buffer)) {
                    this.a.log(buffer.readString(charset));
                    this.a.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                } else {
                    this.a.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            long jContentLength = responseBodyBody.contentLength();
            String str = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            Logger logger = this.a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(responseProceed.code());
            if (responseProceed.message().isEmpty()) {
                string = "";
                c = StringUtil.SPACE;
            } else {
                StringBuilder sb3 = new StringBuilder();
                c = StringUtil.SPACE;
                sb3.append(StringUtil.SPACE);
                sb3.append(responseProceed.message());
                string = sb3.toString();
            }
            sb2.append(string);
            sb2.append(c);
            sb2.append(responseProceed.request().url());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z2 ? "" : ", " + str + " body");
            sb2.append(')');
            logger.log(sb2.toString());
            if (z2) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c(headers2, i2);
                }
                if (!z || !HttpHeaders.hasBody(responseProceed)) {
                    this.a.log("<-- END HTTP");
                } else if (a(responseProceed.headers())) {
                    this.a.log("<-- END HTTP (encoded body omitted)");
                } else {
                    BufferedSource bufferedSourceSource = responseBodyBody.source();
                    bufferedSourceSource.request(Long.MAX_VALUE);
                    Buffer buffer2 = bufferedSourceSource.buffer();
                    Long l = null;
                    GzipSource gzipSource = null;
                    if (AsyncHttpClient.ENCODING_GZIP.equalsIgnoreCase(headers2.get("Content-Encoding"))) {
                        Long lValueOf = Long.valueOf(buffer2.size());
                        try {
                            GzipSource gzipSource2 = new GzipSource(buffer2.clone());
                            try {
                                buffer2 = new Buffer();
                                buffer2.writeAll(gzipSource2);
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
                    Charset charset2 = d;
                    MediaType mediaTypeContentType2 = responseBodyBody.contentType();
                    if (mediaTypeContentType2 != null) {
                        charset2 = mediaTypeContentType2.charset(charset2);
                    }
                    if (!b(buffer2)) {
                        this.a.log("");
                        this.a.log("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (jContentLength != 0) {
                        this.a.log("");
                        this.a.log(buffer2.clone().readString(charset2));
                    }
                    if (l != null) {
                        this.a.log("<-- END HTTP (" + buffer2.size() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.a.log("<-- END HTTP (" + buffer2.size() + "-byte body)");
                    }
                }
            }
            return responseProceed;
        } catch (Exception e) {
            this.a.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public void redactHeader(String str) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(this.b);
        treeSet.add(str);
        this.b = treeSet;
    }

    public HttpLoggingInterceptor setLevel(Level level) {
        Objects.requireNonNull(level, "level == null. Use Level.NONE instead.");
        this.c = level;
        return this;
    }

    public HttpLoggingInterceptor(Logger logger) {
        this.b = Collections.emptySet();
        this.c = Level.NONE;
        this.a = logger;
    }
}
