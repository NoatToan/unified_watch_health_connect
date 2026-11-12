package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public final class rht implements jit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f32560a;

    public rht(ByteBuffer byteBuffer) {
        this.f32560a = byteBuffer.slice();
    }

    @Override // defpackage.jit
    public final void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f32560a) {
            int i2 = (int) j;
            this.f32560a.position(i2);
            this.f32560a.limit(i2 + i);
            byteBufferSlice = this.f32560a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // defpackage.jit
    public final long zza() {
        return this.f32560a.capacity();
    }
}
