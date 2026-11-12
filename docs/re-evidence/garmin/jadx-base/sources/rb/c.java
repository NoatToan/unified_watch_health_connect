package rb;

import fa.q;
import fa.r;
import fa.w;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c extends kb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f151501a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f151502b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f151503c;

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // kb.b
    public final androidx.media3.common.w b(kb.a aVar, ByteBuffer byteBuffer) {
        androidx.media3.common.w.b eVar;
        long j8;
        r rVar = this.f151501a;
        q qVar = this.f151502b;
        w wVar = this.f151503c;
        if (wVar != null) {
            long j14 = aVar.f103756j;
            synchronized (wVar) {
                j8 = wVar.f70068b;
            }
            if (j14 != j8) {
                w wVar2 = new w(aVar.f8633f);
                this.f151503c = wVar2;
                wVar2.a(aVar.f8633f - aVar.f103756j);
            }
        } else {
            w wVar3 = new w(aVar.f8633f);
            this.f151503c = wVar3;
            wVar3.a(aVar.f8633f - aVar.f103756j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        rVar.E(bArrArray, iLimit);
        qVar.l(bArrArray, iLimit);
        qVar.o(39);
        long jG = (((long) qVar.g(1)) << 32) | ((long) qVar.g(32));
        qVar.o(20);
        int iG = qVar.g(12);
        int iG2 = qVar.g(8);
        rVar.H(14);
        if (iG2 == 0) {
            eVar = new e();
        } else if (iG2 == 255) {
            eVar = a.b(rVar, iG, jG);
        } else if (iG2 == 4) {
            eVar = f.b(rVar);
        } else if (iG2 != 5) {
            eVar = iG2 != 6 ? null : g.b(rVar, jG, this.f151503c);
        } else {
            eVar = d.b(rVar, jG, this.f151503c);
        }
        return eVar == null ? new androidx.media3.common.w(new androidx.media3.common.w.b[0]) : new androidx.media3.common.w(eVar);
    }
}
