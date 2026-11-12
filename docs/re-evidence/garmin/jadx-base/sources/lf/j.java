package lf;

import java.io.IOException;
import java.io.InputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llf/j;", "Ljava/io/InputStream;", "delegate", "<init>", "(Ljava/io/InputStream;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f112097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112098b = 1073741824;

    public j(InputStream inputStream) {
        this.f112097a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f112098b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112097a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i14 = this.f112097a.read();
        if (i14 == -1) {
            this.f112098b = 0;
        }
        return i14;
    }

    @Override // java.io.InputStream
    public final long skip(long j8) {
        return this.f112097a.skip(j8);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i14 = this.f112097a.read(bArr);
        if (i14 == -1) {
            this.f112098b = 0;
        }
        return i14;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i14, int i15) throws IOException {
        int i16 = this.f112097a.read(bArr, i14, i15);
        if (i16 == -1) {
            this.f112098b = 0;
        }
        return i16;
    }
}
