package u7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu7/w1;", "Ljava/io/OutputStream;", "Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f169358a;

    public w1(FileOutputStream fileOutputStream) {
        fileOutputStream.getClass();
        this.f169358a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f169358a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        bArr.getClass();
        this.f169358a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i14) throws IOException {
        this.f169358a.write(i14);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i14, int i15) throws IOException {
        bArr.getClass();
        this.f169358a.write(bArr, i14, i15);
    }
}
