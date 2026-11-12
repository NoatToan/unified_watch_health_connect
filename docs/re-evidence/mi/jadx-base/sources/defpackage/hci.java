package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public class hci extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestBody f19933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gci f19934b;
    public long c = 0;

    public hci(RequestBody requestBody, gci gciVar) {
        this.f19933a = requestBody;
        this.f19934b = gciVar;
    }

    public final Sink b(BufferedSink bufferedSink) {
        return Okio.sink(new a(bufferedSink.outputStream()));
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        if (this.c == 0) {
            this.c = this.f19933a.contentLength();
        }
        return this.c;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getContentType() {
        return this.f19933a.getContentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        BufferedSink bufferedSinkBuffer = Okio.buffer(b(bufferedSink));
        contentLength();
        this.f19933a.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }

    public class a extends zl4 {
        public a(OutputStream outputStream) {
            super(outputStream);
        }

        public final void b() throws IOException {
            long jA = a();
            long jContentLength = hci.this.contentLength();
            hci.this.f19934b.a(jA, jContentLength, jA == jContentLength);
        }

        @Override // defpackage.zl4, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            super.write(bArr, i, i2);
            b();
        }

        @Override // defpackage.zl4, java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            super.write(i);
            b();
        }
    }
}
