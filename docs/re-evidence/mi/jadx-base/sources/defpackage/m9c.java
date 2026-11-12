package defpackage;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class m9c implements k9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9c f25914b;
    public int c = -1;

    public m9c(q9c q9cVar, int i) {
        this.f25914b = q9cVar;
        this.f25913a = i;
    }

    @Override // defpackage.k9l
    public void a() throws IOException {
        int i = this.c;
        if (i == -2) {
            throw new SampleQueueMappingException(this.f25914b.n().a(this.f25913a).a(0).l);
        }
        if (i == -1) {
            this.f25914b.T();
        } else if (i != -3) {
            this.f25914b.U(i);
        }
    }

    public void b() {
        rk1.a(this.c == -1);
        this.c = this.f25914b.y(this.f25913a);
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.k9l
    public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if (this.c == -3) {
            decoderInputBuffer.e(4);
            return -4;
        }
        if (c()) {
            return this.f25914b.d0(this.c, a1aVar, decoderInputBuffer, i);
        }
        return -3;
    }

    public void e() {
        if (this.c != -1) {
            this.f25914b.o0(this.f25913a);
            this.c = -1;
        }
    }

    @Override // defpackage.k9l
    public boolean isReady() {
        return this.c == -3 || (c() && this.f25914b.Q(this.c));
    }

    @Override // defpackage.k9l
    public int k(long j) {
        if (c()) {
            return this.f25914b.n0(this.c, j);
        }
        return 0;
    }
}
