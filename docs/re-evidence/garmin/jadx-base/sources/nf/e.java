package nf;

import java.nio.ByteBuffer;
import p005kotlin.Metadata;
import w63.g0;
import w63.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnf/e;", "Lw63/g0;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f125745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125746b;

    public e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f125745a = byteBufferSlice;
        this.f125746b = byteBufferSlice.capacity();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // w63.g0
    public final long read(w63.e eVar, long j8) {
        ByteBuffer byteBuffer = this.f125745a;
        int iPosition = byteBuffer.position();
        int i14 = this.f125746b;
        if (iPosition == i14) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j8);
        if (iPosition2 <= i14) {
            i14 = iPosition2;
        }
        byteBuffer.limit(i14);
        return eVar.write(byteBuffer);
    }

    @Override // w63.g0
    public final h0 timeout() {
        return h0.NONE;
    }
}
