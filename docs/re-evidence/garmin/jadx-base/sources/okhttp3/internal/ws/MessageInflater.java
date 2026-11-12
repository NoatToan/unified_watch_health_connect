package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import p005kotlin.Metadata;
import vb.h;
import w63.e;
import w63.g0;
import w63.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lw63/e;", "buffer", "", "inflate", "(Lw63/e;)V", "close", "()V", "Z", "deflatedBytes", "Lw63/e;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lw63/r;", "inflaterSource", "Lw63/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageInflater implements Closeable {
    private final e deflatedBytes;
    private final Inflater inflater;
    private final r inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z14) {
        this.noContextTakeover = z14;
        e eVar = new e();
        this.deflatedBytes = eVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new r((g0) eVar, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(e buffer) throws IOException {
        buffer.getClass();
        if (this.deflatedBytes.f183349b != 0) {
            h.s("Failed requirement.");
            return;
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.G3(buffer);
        this.deflatedBytes.L(65535);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.f183349b;
        do {
            this.inflaterSource.a(buffer, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
