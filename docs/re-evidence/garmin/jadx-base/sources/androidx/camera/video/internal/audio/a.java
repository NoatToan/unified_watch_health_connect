package androidx.camera.video.internal.audio;

import ab.j;
import g1.y;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.Executor;
import k7.h;
import z0.a0;

/* JADX INFO: loaded from: classes.dex */
public class a implements l0.c<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1.c f5927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f5928b;

    public a(b bVar, b1.c cVar) {
        this.f5928b = bVar;
        this.f5927a = cVar;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        b bVar = this.f5928b;
        if (bVar.f5940l == this.f5927a && !(th3 instanceof IllegalStateException)) {
            Executor executor = bVar.f5938j;
            a0.c cVar = bVar.f5939k;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new j(28, cVar, th3));
        }
    }

    @Override // l0.c
    public final void onSuccess(y yVar) {
        y yVar2 = yVar;
        b bVar = this.f5928b;
        boolean z14 = bVar.f5937i;
        AudioStream audioStream = bVar.f5933e;
        f fVar = bVar.f5932d;
        if (!z14 || bVar.f5940l != this.f5927a) {
            yVar2.cancel();
            return;
        }
        if (bVar.f5943o) {
            h.f(bVar.f5944p > 0, null);
            if (System.nanoTime() - bVar.f5944p >= bVar.f5934f) {
                h.f(bVar.f5943o, null);
                try {
                    fVar.start();
                    audioStream.stop();
                    bVar.f5943o = false;
                } catch (AudioStream.AudioStreamException unused) {
                    bVar.f5944p = System.nanoTime();
                }
            }
        }
        if (!bVar.f5943o) {
            audioStream = fVar;
        }
        ByteBuffer byteBufferI = yVar2.i();
        e eVar = audioStream.read(byteBufferI);
        long j8 = eVar.f5969b;
        int i14 = eVar.f5968a;
        if (i14 > 0) {
            Executor executor = bVar.f5938j;
            if (executor != null && j8 - bVar.f5948t >= 200) {
                bVar.f5948t = j8;
                a0.c cVar = bVar.f5939k;
                if (bVar.f5949u == 2) {
                    ShortBuffer shortBufferAsShortBuffer = byteBufferI.asShortBuffer();
                    double dMax = 0.0d;
                    while (shortBufferAsShortBuffer.hasRemaining()) {
                        dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                    }
                    bVar.f5947s = dMax / 32767.0d;
                    if (cVar != null) {
                        executor.execute(new j(27, bVar, cVar));
                    }
                }
            }
            byteBufferI.limit(i14 + byteBufferI.position());
            yVar2.b(j8 / 1000);
            yVar2.a();
        } else {
            yVar2.cancel();
        }
        b1.c<? extends y> cVar2 = bVar.f5940l;
        Objects.requireNonNull(cVar2);
        androidx.concurrent.futures.b.d dVarE = cVar2.e();
        a aVar = bVar.f5941m;
        Objects.requireNonNull(aVar);
        l0.j.a(dVarE, aVar, bVar.f5929a);
    }
}
