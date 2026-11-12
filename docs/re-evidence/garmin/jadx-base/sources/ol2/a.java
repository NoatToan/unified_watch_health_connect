package ol2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import ml2.y;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends FilterInputStream implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f132872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f132873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PipedOutputStream f132874c;

    public a(int i14) {
        super(new PipedInputStream());
        this.f132872a = LoggerFactory.getLogger("ML#MultiLinkInputStream");
        this.f132873b = i14;
        this.f132874c = new PipedOutputStream((PipedInputStream) ((FilterInputStream) this).in);
    }

    @Override // ml2.y
    public final void a(int i14, byte[] bArr) {
        PipedOutputStream pipedOutputStream = this.f132874c;
        if (i14 != this.f132873b) {
            return;
        }
        try {
            pipedOutputStream.write(bArr);
            pipedOutputStream.flush();
        } catch (IOException e4) {
            this.f132872a.error("Failed to write characteristic change", (Throwable) e4);
        }
    }

    @Override // ml2.y
    public final void c(int i14) {
        if (this.f132873b != i14) {
            return;
        }
        try {
            close();
        } catch (IOException e4) {
            this.f132872a.warn("Exception closing streams.", (Throwable) e4);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f132874c.close();
    }
}
