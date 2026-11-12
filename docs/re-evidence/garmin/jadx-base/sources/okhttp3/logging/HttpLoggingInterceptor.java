package okhttp3.logging;

import am.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.common.net.HttpHeaders;
import d53.u;
import fb1.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import jg.b;
import o13.e;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.platform.Platform;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.d0;
import p13.l0;
import sn.a;
import w63.g;
import w63.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\n\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "headersToRedact", "", "", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "bodyHasUnknownEncoding", "", "headers", "Lokhttp3/Headers;", "-deprecated_level", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logHeader", "", IntegerTokenConverter.CONVERTER_KEY, "", "redactHeader", "name", "setLevel", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", "message", "", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "()V", "log", "", "message", "", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    message.getClass();
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String message);
    }

    public HttpLoggingInterceptor(Logger logger) {
        logger.getClass();
        this.logger = logger;
        this.headersToRedact = l0.f134950a;
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get(HttpHeaders.CONTENT_ENCODING);
        return (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) ? false : true;
    }

    private final void logHeader(Headers headers, int i14) {
        String strValue = this.headersToRedact.contains(headers.name(i14)) ? "██" : headers.value(i14);
        this.logger.log(headers.name(i14) + ": " + strValue);
    }

    @e
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        long j8;
        Long lValueOf;
        chain.getClass();
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z14 = true;
        boolean z15 = level == Level.BODY;
        if (!z15 && level != Level.HEADERS) {
            z14 = false;
        }
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb3 = new StringBuilder("--> ");
        sb3.append(request.method());
        sb3.append(' ');
        sb3.append(request.url());
        sb3.append(connection != null ? s.k(connection.protocol(), StringUtils.SPACE) : "");
        String string = sb3.toString();
        if (!z14 && requestBodyBody != null) {
            StringBuilder sbI = a.i(string, " (");
            sbI.append(requestBodyBody.contentLength());
            sbI.append("-byte body)");
            string = sbI.toString();
        }
        this.logger.log(string);
        if (z14) {
            Headers headers = request.headers();
            j8 = -1;
            if (requestBodyBody != null) {
                MediaType f121556a = requestBodyBody.getContentType();
                if (f121556a != null && headers.get(HttpHeaders.CONTENT_TYPE) == null) {
                    this.logger.log(s.k(f121556a, "Content-Type: "));
                }
                if (requestBodyBody.contentLength() != -1 && headers.get(HttpHeaders.CONTENT_LENGTH) == null) {
                    this.logger.log(s.k(Long.valueOf(requestBodyBody.contentLength()), "Content-Length: "));
                }
            }
            int size = headers.size();
            for (int i14 = 0; i14 < size; i14++) {
                logHeader(headers, i14);
            }
            if (!z15 || requestBodyBody == null) {
                this.logger.log(s.k(request.method(), "--> END "));
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else if (requestBodyBody.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
            } else if (requestBodyBody.isOneShot()) {
                this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
            } else {
                w63.e eVar = new w63.e();
                requestBodyBody.writeTo(eVar);
                MediaType f121556a2 = requestBodyBody.getContentType();
                Charset charset = f121556a2 == null ? null : f121556a2.charset(StandardCharsets.UTF_8);
                if (charset == null) {
                    charset = StandardCharsets.UTF_8;
                    charset.getClass();
                }
                this.logger.log("");
                boolean zIsProbablyUtf8 = Utf8Kt.isProbablyUtf8(eVar);
                Logger logger = this.logger;
                if (zIsProbablyUtf8) {
                    logger.log(eVar.w(eVar.f183349b, charset));
                    this.logger.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                } else {
                    logger.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                }
            }
        } else {
            j8 = -1;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            ResponseBody responseBodyBody = responseProceed.body();
            responseBodyBody.getClass();
            long contentLength = responseBodyBody.getContentLength();
            String str = contentLength != j8 ? contentLength + "-byte" : "unknown-length";
            Logger logger2 = this.logger;
            StringBuilder sb4 = new StringBuilder("<-- ");
            sb4.append(responseProceed.code());
            sb4.append(responseProceed.message().length() == 0 ? r11 : c.n(StringUtils.SPACE, responseProceed.message()));
            sb4.append(' ');
            sb4.append(responseProceed.request().url());
            sb4.append(" (");
            sb4.append(jNanoTime2);
            sb4.append("ms");
            sb4.append(!z14 ? j.m(", ", str, " body") : r11);
            sb4.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            logger2.log(sb4.toString());
            if (z14) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    logHeader(headers2, i15);
                }
                if (z15 && okhttp3.internal.http.HttpHeaders.promisesBody(responseProceed)) {
                    if (bodyHasUnknownEncoding(responseProceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                        return responseProceed;
                    }
                    g bodySource = responseBodyBody.getBodySource();
                    bodySource.b(Long.MAX_VALUE);
                    w63.e f183329b = bodySource.getF183329b();
                    if ("gzip".equalsIgnoreCase(headers2.get(HttpHeaders.CONTENT_ENCODING))) {
                        lValueOf = Long.valueOf(f183329b.f183349b);
                        q qVar = new q(f183329b.e());
                        try {
                            f183329b = new w63.e();
                            f183329b.G3(qVar);
                            qVar.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                b.l(qVar, th3);
                                throw th4;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    MediaType mediaType = responseBodyBody.get$contentType();
                    Charset charset2 = mediaType == null ? null : mediaType.charset(StandardCharsets.UTF_8);
                    if (charset2 == null) {
                        charset2 = StandardCharsets.UTF_8;
                        charset2.getClass();
                    }
                    if (!Utf8Kt.isProbablyUtf8(f183329b)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + f183329b.f183349b + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        Logger logger3 = this.logger;
                        w63.e eVarE = f183329b.e();
                        logger3.log(eVarE.w(eVarE.f183349b, charset2));
                    }
                    Logger logger4 = this.logger;
                    if (lValueOf == null) {
                        logger4.log("<-- END HTTP (" + f183329b.f183349b + "-byte body)");
                        return responseProceed;
                    }
                    logger4.log("<-- END HTTP (" + f183329b.f183349b + "-byte, " + lValueOf + "-gzipped-byte body)");
                    return responseProceed;
                }
                this.logger.log("<-- END HTTP");
            }
            return responseProceed;
        } catch (Exception e4) {
            this.logger.log(s.k(e4, "<-- HTTP FAILED: "));
            throw e4;
        }
    }

    public final void level(Level level) {
        level.getClass();
        this.level = level;
    }

    public final void redactHeader(String name) {
        name.getClass();
        u.s(x0.f105818a);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        d0.v(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        level.getClass();
        level(level);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
