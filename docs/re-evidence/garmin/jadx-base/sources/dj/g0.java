package dj;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class g0 extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f59832a;

    public g0(f0.d dVar, ByteBuffer byteBuffer) {
        this.f59832a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f59832a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j8, byte[] bArr, int i14, int i15) {
        ByteBuffer byteBuffer = this.f59832a;
        if (j8 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j8);
        int iMin = Math.min(i15, byteBuffer.remaining());
        byteBuffer.get(bArr, i14, iMin);
        return iMin;
    }
}
