package li;

import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import w63.g0;
import w63.h0;
import w63.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\t\n\u000bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lli/i;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lw63/g;", "source", "", "boundary", "<init>", "(Lw63/g;Ljava/lang/String;)V", "a", "b", "c", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f112590i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w63.g f112591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w63.h f112592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w63.h f112593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f112595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f112596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f112597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f112598h;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lli/i$b;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "Lwh/e;", "headers", "Lw63/g;", TtmlNode.TAG_BODY, "<init>", "(Ljava/util/List;Lw63/g;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<wh.e> f112599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w63.g f112600b;

        public b(List<wh.e> list, w63.g gVar) {
            list.getClass();
            gVar.getClass();
            this.f112599a = list;
            this.f112600b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f112600b.close();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lli/i$c;", "Lw63/g0;", "<init>", "(Lli/i;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class c implements g0 {
        public c() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            i iVar = i.this;
            if (s.g(iVar.f112597g, this)) {
                iVar.f112597g = null;
            }
        }

        @Override // w63.g0
        public final long read(w63.e eVar, long j8) {
            eVar.getClass();
            if (j8 < 0) {
                vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
                return 0L;
            }
            i iVar = i.this;
            if (!s.g(iVar.f112597g, this)) {
                vb.h.z("closed");
                return 0L;
            }
            long jA = iVar.a(j8);
            if (jA == 0) {
                return -1L;
            }
            return iVar.f112591a.read(eVar, jA);
        }

        @Override // w63.g0
        public final h0 timeout() {
            return i.this.f112591a.timeout();
        }
    }

    public i(w63.g gVar, String str) {
        gVar.getClass();
        str.getClass();
        this.f112591a = gVar;
        w63.e eVar = new w63.e();
        eVar.R("--");
        eVar.R(str);
        this.f112592b = eVar.h0(eVar.f183349b);
        w63.e eVar2 = new w63.e();
        eVar2.R("\r\n--");
        eVar2.R(str);
        this.f112593c = eVar2.h0(eVar2.f183349b);
        w.a aVar = w.f183403d;
        w63.h.f183361d.getClass();
        w63.h[] hVarArr = {w63.h.a.c("\r\n--" + str + "--"), w63.h.a.c(IOUtils.LINE_SEPARATOR_WINDOWS), w63.h.a.c("--"), w63.h.a.c(StringUtils.SPACE), w63.h.a.c(SyslogAppender.DEFAULT_STACKTRACE_PATTERN)};
        aVar.getClass();
        this.f112598h = w.a.b(hVarArr);
    }

    public final long a(long j8) {
        w63.h hVar = this.f112593c;
        long jD = hVar.d();
        w63.g gVar = this.f112591a;
        gVar.E3(jD);
        w63.e f183329b = gVar.getF183329b();
        f183329b.getClass();
        long jO3 = f183329b.o3(Long.MAX_VALUE, hVar);
        return jO3 == -1 ? Math.min(j8, (gVar.getF183329b().f183349b - ((long) hVar.d())) + 1) : Math.min(j8, jO3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f112595e) {
            return;
        }
        this.f112595e = true;
        this.f112597g = null;
        this.f112591a.close();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lli/i$a;", "", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
