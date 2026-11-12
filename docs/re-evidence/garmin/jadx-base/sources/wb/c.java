package wb;

import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import bb.f0;
import bb.g0;
import bb.l0;
import bb.n;
import bb.o;
import bb.o0;
import bb.p;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import fa.r;
import fa.z;
import j20.x;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f183824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f183825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f183826c;

    /* JADX WARN: Code duplicated, block: B:70:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0169  */
    @Override // bb.n
    public final int b(o oVar, f0 f0Var) throws ParserException {
        byte[] bArr;
        fa.a.f(this.f183824a);
        h.a aVar = null;
        if (this.f183825b == null) {
            if (!f(oVar)) {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            oVar.resetPeekPosition();
        }
        if (!this.f183826c) {
            l0 l0VarTrack = this.f183824a.track(0, 1);
            this.f183824a.endTracks();
            h hVar = this.f183825b;
            hVar.f183844c = this.f183824a;
            hVar.f183843b = l0VarTrack;
            hVar.d(true);
            this.f183826c = true;
        }
        h hVar2 = this.f183825b;
        d dVar = hVar2.f183842a;
        fa.a.f(hVar2.f183843b);
        int i14 = z.f70071a;
        int i15 = hVar2.f183849h;
        long j8 = -1;
        if (i15 != 0) {
            if (i15 == 1) {
                oVar.skipFully((int) hVar2.f183847f);
                hVar2.f183849h = 2;
                return 0;
            }
            if (i15 != 2) {
                if (i15 == 3) {
                    return -1;
                }
                x.h();
                return 0;
            }
            long jA = hVar2.f183845d.a(oVar);
            if (jA >= 0) {
                f0Var.f17167a = jA;
                return 1;
            }
            if (jA < -1) {
                hVar2.a(-(jA + 2));
            }
            if (!hVar2.f183853l) {
                g0 g0VarCreateSeekMap = hVar2.f183845d.createSeekMap();
                fa.a.f(g0VarCreateSeekMap);
                hVar2.f183844c.a(g0VarCreateSeekMap);
                hVar2.f183853l = true;
            }
            if (hVar2.f183852k <= 0 && !dVar.b(oVar)) {
                hVar2.f183849h = 3;
                return -1;
            }
            hVar2.f183852k = 0L;
            r rVar = dVar.f183828b;
            long jB = hVar2.b(rVar);
            if (jB >= 0) {
                long j14 = hVar2.f183848g;
                if (j14 + jB >= hVar2.f183846e) {
                    long j15 = (j14 * 1000000) / ((long) hVar2.f183850i);
                    hVar2.f183843b.f(rVar.f70056c, rVar);
                    hVar2.f183843b.c(j15, 1, rVar.f70056c, 0, null);
                    hVar2.f183846e = -1L;
                }
            }
            hVar2.f183848g += jB;
            return 0;
        }
        while (true) {
            boolean zB = dVar.b(oVar);
            r rVar2 = dVar.f183828b;
            if (!zB) {
                hVar2.f183849h = 3;
                return -1;
            }
            long position = oVar.getPosition();
            long j16 = j8;
            long j17 = hVar2.f183847f;
            hVar2.f183852k = position - j17;
            if (!hVar2.c(rVar2, j17, hVar2.f183851j)) {
                q qVar = hVar2.f183851j.f183855a;
                hVar2.f183850i = qVar.D;
                if (!hVar2.f183854m) {
                    hVar2.f183843b.d(qVar);
                    hVar2.f183854m = true;
                }
                b.a aVar2 = hVar2.f183851j.f183856b;
                if (aVar2 == null) {
                    if (oVar.getLength() == j16) {
                        hVar2.f183845d = new h.c();
                    } else {
                        e eVar = dVar.f183827a;
                        hVar2.f183845d = new a(hVar2, hVar2.f183847f, oVar.getLength(), eVar.f183835d + eVar.f183836e, eVar.f183833b, (eVar.f183832a & 4) != 0);
                    }
                    hVar2.f183849h = 2;
                    bArr = rVar2.f70054a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    rVar2.E(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, rVar2.f70056c)), rVar2.f70056c);
                    return 0;
                }
                hVar2.f183845d = aVar2;
                hVar2.f183849h = 2;
                bArr = rVar2.f70054a;
                if (bArr.length == 65025) {
                    return 0;
                }
                rVar2.E(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, rVar2.f70056c)), rVar2.f70056c);
                return 0;
            }
            hVar2.f183847f = oVar.getPosition();
            j8 = j16;
        }
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f183824a = pVar;
    }

    @Override // bb.n
    public final boolean d(o oVar) {
        try {
            return f(oVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final boolean f(o oVar) {
        boolean zC;
        e eVar = new e();
        if (eVar.a(oVar, true) && (eVar.f183832a & 2) == 2) {
            int iMin = Math.min(eVar.f183836e, 8);
            r rVar = new r(iMin);
            oVar.peekFully(rVar.f70054a, 0, iMin);
            rVar.G(0);
            if (rVar.a() >= 5 && rVar.u() == 127 && rVar.w() == 1179402563) {
                this.f183825b = new b();
                return true;
            }
            rVar.G(0);
            try {
                zC = o0.c(1, rVar, true);
            } catch (ParserException unused) {
                zC = false;
            }
            if (zC) {
                this.f183825b = new i();
            } else {
                rVar.G(0);
                if (g.e(rVar, g.f183839o)) {
                    this.f183825b = new g();
                }
            }
            return true;
        }
        return false;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        h hVar = this.f183825b;
        if (hVar != null) {
            d dVar = hVar.f183842a;
            e eVar = dVar.f183827a;
            eVar.f183832a = 0;
            eVar.f183833b = 0L;
            eVar.f183834c = 0;
            eVar.f183835d = 0;
            eVar.f183836e = 0;
            dVar.f183828b.D(0);
            dVar.f183829c = -1;
            dVar.f183831e = false;
            if (j8 == 0) {
                hVar.d(!hVar.f183853l);
                return;
            }
            if (hVar.f183849h != 0) {
                long j15 = (((long) hVar.f183850i) * j14) / 1000000;
                hVar.f183846e = j15;
                f fVar = hVar.f183845d;
                int i14 = z.f70071a;
                fVar.startSeek(j15);
                hVar.f183849h = 2;
            }
        }
    }
}
