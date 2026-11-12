package okhttp3;

import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import w63.b0;
import w63.e;
import w63.g;
import w63.g0;
import w63.h;
import w63.h0;
import w63.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lw63/g;", "source", "", "boundary", "<init>", "(Lw63/g;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "", "maxResult", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "", "close", "()V", "Lw63/g;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lw63/h;", "dashDashBoundary", "Lw63/h;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final w afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final h crlfDashDashBoundary;
    private PartSource currentPart;
    private final h dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final g source;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lw63/g;", TtmlNode.TAG_BODY, "<init>", "(Lokhttp3/Headers;Lw63/g;)V", "", "close", "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lw63/g;", "()Lw63/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements Closeable {
        private final g body;
        private final Headers headers;

        public Part(Headers headers, g gVar) {
            headers.getClass();
            gVar.getClass();
            this.headers = headers;
            this.body = gVar;
        }

        /* JADX INFO: renamed from: body, reason: from getter */
        public final g getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        /* JADX INFO: renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lw63/g0;", "<init>", "(Lokhttp3/MultipartReader;)V", "", "close", "()V", "Lw63/e;", "sink", "", "byteCount", "read", "(Lw63/e;J)J", "Lw63/h0;", "timeout", "()Lw63/h0;", "Lw63/h0;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PartSource implements g0 {
        private final h0 timeout = new h0();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (s.g(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // w63.g0
        public long read(e sink, long byteCount) {
            sink.getClass();
            if (byteCount < 0) {
                vb.h.x(org.apache.commons.lang3.e.e(byteCount, "byteCount < 0: "));
                return 0L;
            }
            if (!s.g(MultipartReader.this.currentPart, this)) {
                vb.h.z("closed");
                return 0L;
            }
            h0 timeout = MultipartReader.this.source.getTimeout();
            h0 h0Var = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.getTimeoutNanos();
            h0.Companion companion = h0.INSTANCE;
            long timeoutNanos2 = h0Var.getTimeoutNanos();
            long timeoutNanos3 = timeout.getTimeoutNanos();
            companion.getClass();
            if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                timeoutNanos2 = timeoutNanos3;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(timeoutNanos2, timeUnit);
            if (!timeout.getHasDeadline()) {
                if (h0Var.getHasDeadline()) {
                    timeout.deadlineNanoTime(h0Var.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                } finally {
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (h0Var.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (h0Var.getHasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), h0Var.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
            } finally {
                timeout.timeout(timeoutNanos, timeUnit);
                if (h0Var.getHasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // w63.g0
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public h0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        w.a aVar = w.f183403d;
        h.f183361d.getClass();
        h[] hVarArr = {h.a.c(IOUtils.LINE_SEPARATOR_WINDOWS), h.a.c("--"), h.a.c(StringUtils.SPACE), h.a.c(SyslogAppender.DEFAULT_STACKTRACE_PATTERN)};
        aVar.getClass();
        afterBoundaryOptions = w.a.b(hVarArr);
    }

    public MultipartReader(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        this.source = gVar;
        this.boundary = str;
        e eVar = new e();
        eVar.R("--");
        eVar.R(str);
        this.dashDashBoundary = eVar.h0(eVar.f183349b);
        e eVar2 = new e();
        eVar2.R("\r\n--");
        eVar2.R(str);
        this.crlfDashDashBoundary = eVar2.h0(eVar2.f183349b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxResult) {
        this.source.E3(this.crlfDashDashBoundary.d());
        long jE0 = this.source.getF183329b().E0(this.crlfDashDashBoundary);
        return jE0 == -1 ? Math.min(maxResult, (this.source.getF183329b().f183349b - ((long) this.crlfDashDashBoundary.d())) + 1) : Math.min(maxResult, jE0);
    }

    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws ProtocolException {
        g gVar;
        if (this.closed) {
            vb.h.z("closed");
            return null;
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.F3(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.d());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(8192L);
                gVar = this.source;
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                gVar.skip(jCurrentPartBytesRemaining);
            }
            gVar.skip(this.crlfDashDashBoundary.d());
        }
        boolean z14 = false;
        while (true) {
            int iJ1 = this.source.j1(afterBoundaryOptions);
            if (iJ1 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iJ1 == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, new b0(partSource));
            }
            if (iJ1 == 1) {
                if (z14) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iJ1 == 2 || iJ1 == 3) {
                z14 = true;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Lw63/w;", "afterBoundaryOptions", "Lw63/w;", "getAfterBoundaryOptions", "()Lw63/w;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final w getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws ProtocolException {
        String strParameter;
        responseBody.getClass();
        g bodySource = responseBody.getBodySource();
        MediaType mediaType = responseBody.get$contentType();
        if (mediaType != null && (strParameter = mediaType.parameter("boundary")) != null) {
            this(bodySource, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
