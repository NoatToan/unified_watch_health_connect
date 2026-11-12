package defpackage;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* JADX INFO: loaded from: classes3.dex */
class off extends ForwardingSink {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44274b;

    protected void b(IOException iOException) {
    }

    off(Sink sink) {
        super(sink);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        if (this.f44274b) {
            buffer.skip(j);
            return;
        }
        try {
            super.write(buffer, j);
        } catch (IOException e) {
            this.f44274b = true;
            b(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.f44274b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f44274b = true;
            b(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f44274b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f44274b = true;
            b(e);
        }
    }
}
