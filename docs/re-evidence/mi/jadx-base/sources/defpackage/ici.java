package defpackage;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public class ici extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseBody f20996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gci f20997b;
    public BufferedSource c;
    public long d = 0;

    public class a extends ForwardingSource {
        public a(Source source) {
            super(source);
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            long j2 = super.read(buffer, j);
            ici.b(ici.this, j2 != -1 ? j2 : 0L);
            ici.this.f20997b.a(ici.this.d, ici.this.f20996a.getContentLength(), j2 == -1);
            return j2;
        }
    }

    public ici(ResponseBody responseBody, gci gciVar) {
        this.f20996a = responseBody;
        this.f20997b = gciVar;
    }

    public static /* synthetic */ long b(ici iciVar, long j) {
        long j2 = iciVar.d + j;
        iciVar.d = j2;
        return j2;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public long getContentLength() {
        return this.f20996a.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.f20996a.get$contentType();
    }

    public final Source l(Source source) {
        return new a(source);
    }

    public long m() {
        return this.d;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public BufferedSource getBodySource() {
        if (this.c == null) {
            this.c = Okio.buffer(l(this.f20996a.getBodySource()));
        }
        return this.c;
    }
}
