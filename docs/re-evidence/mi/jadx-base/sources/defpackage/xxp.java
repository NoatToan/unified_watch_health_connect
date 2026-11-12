package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.upstream.b;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class xxp extends m62 implements a {
    public final LinkedBlockingQueue<byte[]> e;
    public byte[] f;
    public int g;

    public xxp() {
        super(true);
        this.e = new LinkedBlockingQueue<>();
        this.f = new byte[0];
        this.g = -1;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) {
        this.g = bVar.f8404a.getPort();
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public int c() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public String j() {
        rk1.g(this.g != -1);
        return wlq.D("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.g), Integer.valueOf(this.g + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public boolean m() {
        return true;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.f.length);
        System.arraycopy(this.f, 0, bArr, i, iMin);
        byte[] bArr2 = this.f;
        this.f = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i2) {
            return iMin;
        }
        try {
            byte[] bArrPoll = this.e.poll(FusionLocationRequest.timeout, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                throw new IOException(new SocketTimeoutException());
            }
            int iMin2 = Math.min(i2 - iMin, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i + iMin, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.f = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public void write(byte[] bArr) {
        this.e.add(bArr);
    }
}
