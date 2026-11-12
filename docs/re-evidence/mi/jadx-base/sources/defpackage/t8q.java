package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class t8q implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UdpDataSource f34458a = new UdpDataSource();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t8q f34459b;

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws IOException {
        return this.f34458a.b(bVar);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public int c() {
        int iC = this.f34458a.c();
        if (iC == -1) {
            return -1;
        }
        return iC;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f34458a.close();
        t8q t8qVar = this.f34459b;
        if (t8qVar != null) {
            t8qVar.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void f(fxp fxpVar) {
        this.f34458a.f(fxpVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.f34458a.h();
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public String j() {
        int iC = c();
        rk1.g(iC != -1);
        return wlq.D("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(iC), Integer.valueOf(iC + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public boolean m() {
        return false;
    }

    public void r(t8q t8qVar) {
        rk1.a(this != t8qVar);
        this.f34459b = t8qVar;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f34458a.read(bArr, i, i2);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public void write(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
