package gb;

import androidx.media3.common.ParserException;
import androidx.media3.common.w;
import bb.a0;
import bb.f0;
import bb.g0;
import bb.i;
import bb.l0;
import bb.n;
import bb.o;
import bb.o0;
import bb.p;
import bb.s;
import bb.t;
import bb.u;
import bb.v;
import com.google.common.collect.ImmutableList;
import fa.q;
import fa.r;
import fa.z;
import j20.x;
import java.util.Arrays;
import pb.g;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f76622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f76623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.a f76625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f76626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f76627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f76628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f76629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f76630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f76631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f76632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f76633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f76634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f76635n;

    public b(int i14) {
        this.f76622a = new byte[42];
        this.f76623b = new r(new byte[32768], 0);
        this.f76624c = (i14 & 1) != 0;
        this.f76625d = new s.a();
        this.f76628g = 0;
    }

    @Override // bb.n
    public final int b(o oVar, f0 f0Var) throws ParserException {
        g0 bVar;
        boolean z14;
        long j8;
        boolean zA;
        int i14 = this.f76628g;
        w wVar = null;
        if (i14 == 0) {
            oVar.resetPeekPosition();
            long peekPosition = oVar.getPeekPosition();
            w wVarA = new a0().a(oVar, !this.f76624c ? null : g.f136807b);
            if (wVarA != null && wVarA.f8574a.length != 0) {
                wVar = wVarA;
            }
            oVar.skipFully((int) (oVar.getPeekPosition() - peekPosition));
            this.f76629h = wVar;
            this.f76628g = 1;
            return 0;
        }
        byte[] bArr = this.f76622a;
        if (i14 == 1) {
            oVar.peekFully(bArr, 0, bArr.length);
            oVar.resetPeekPosition();
            this.f76628g = 2;
            return 0;
        }
        if (i14 == 2) {
            r rVar = new r(4);
            oVar.readFully(rVar.f70054a, 0, 4);
            if (rVar.w() != 1716281667) {
                throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
            }
            this.f76628g = 3;
            return 0;
        }
        if (i14 == 3) {
            t.a aVar = new t.a(this.f76630i);
            boolean z15 = false;
            while (!z15) {
                oVar.resetPeekPosition();
                q qVar = new q(new byte[4]);
                oVar.peekFully(qVar.f70047a, 0, 4);
                boolean zF = qVar.f();
                int iG = qVar.g(7);
                int iG2 = qVar.g(24) + 4;
                if (iG == 0) {
                    byte[] bArr2 = new byte[38];
                    oVar.readFully(bArr2, 0, 38);
                    aVar.f17254a = new v(bArr2, 4);
                } else {
                    v vVar = aVar.f17254a;
                    if (vVar == null) {
                        h.w();
                        return 0;
                    }
                    if (iG == 3) {
                        r rVar2 = new r(iG2);
                        oVar.readFully(rVar2.f70054a, 0, iG2);
                        aVar.f17254a = vVar.b(t.a(rVar2));
                    } else if (iG == 4) {
                        r rVar3 = new r(iG2);
                        oVar.readFully(rVar3.f70054a, 0, iG2);
                        rVar3.H(4);
                        aVar.f17254a = vVar.c(Arrays.asList(o0.b(rVar3, false, false).f17244a));
                    } else if (iG == 6) {
                        r rVar4 = new r(iG2);
                        oVar.readFully(rVar4.f70054a, 0, iG2);
                        rVar4.H(4);
                        aVar.f17254a = vVar.a(ImmutableList.of(nb.a.b(rVar4)));
                    } else {
                        oVar.skipFully(iG2);
                    }
                }
                v vVar2 = aVar.f17254a;
                int i15 = z.f70071a;
                this.f76630i = vVar2;
                z15 = zF;
            }
            this.f76630i.getClass();
            this.f76631j = Math.max(this.f76630i.f17259c, 6);
            l0 l0Var = this.f76627f;
            int i16 = z.f70071a;
            l0Var.d(this.f76630i.f(bArr, this.f76629h));
            this.f76628g = 4;
            return 0;
        }
        if (i14 == 4) {
            oVar.resetPeekPosition();
            r rVar5 = new r(2);
            oVar.peekFully(rVar5.f70054a, 0, 2);
            int iA = rVar5.A();
            if ((iA >> 2) != 16382) {
                oVar.resetPeekPosition();
                throw ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
            }
            oVar.resetPeekPosition();
            this.f76632k = iA;
            p pVar = this.f76626e;
            int i17 = z.f70071a;
            long position = oVar.getPosition();
            long length = oVar.getLength();
            this.f76630i.getClass();
            v vVar3 = this.f76630i;
            if (vVar3.f17267k != null) {
                bVar = new u(vVar3, position);
            } else if (length == -1 || vVar3.f17266j <= 0) {
                bVar = new g0.b(vVar3.e());
            } else {
                a aVar2 = new a(vVar3, this.f76632k, position, length);
                this.f76633l = aVar2;
                bVar = aVar2.f17144a;
            }
            pVar.a(bVar);
            this.f76628g = 5;
            return 0;
        }
        if (i14 != 5) {
            x.h();
            return 0;
        }
        this.f76627f.getClass();
        this.f76630i.getClass();
        a aVar3 = this.f76633l;
        if (aVar3 != null && aVar3.f17146c != null) {
            return aVar3.a(oVar, f0Var);
        }
        if (this.f76635n == -1) {
            v vVar4 = this.f76630i;
            oVar.resetPeekPosition();
            oVar.advancePeekPosition(1);
            byte[] bArr3 = new byte[1];
            oVar.peekFully(bArr3, 0, 1);
            z14 = (bArr3[0] & 1) == 1;
            oVar.advancePeekPosition(2);
            int i18 = z14 ? 7 : 6;
            r rVar6 = new r(i18);
            byte[] bArr4 = rVar6.f70054a;
            int i19 = 0;
            while (i19 < i18) {
                int iPeek = oVar.peek(bArr4, i19, i18 - i19);
                if (iPeek == -1) {
                    break;
                }
                i19 += iPeek;
            }
            rVar6.F(i19);
            oVar.resetPeekPosition();
            s.a aVar4 = new s.a();
            try {
                long jB = rVar6.B();
                if (!z14) {
                    jB *= (long) vVar4.f17258b;
                }
                aVar4.f17253a = jB;
                this.f76635n = jB;
                return 0;
            } catch (NumberFormatException unused) {
                throw ParserException.createForMalformedContainer(null, null);
            }
        }
        r rVar7 = this.f76623b;
        int i24 = rVar7.f70056c;
        if (i24 < 32768) {
            int i25 = oVar.read(rVar7.f70054a, i24, 32768 - i24);
            z14 = i25 == -1;
            if (!z14) {
                rVar7.F(i24 + i25);
            } else if (rVar7.a() == 0) {
                long j14 = this.f76635n * 1000000;
                v vVar5 = this.f76630i;
                int i26 = z.f70071a;
                this.f76627f.c(j14 / ((long) vVar5.f17261e), 1, this.f76634m, 0, null);
                return -1;
            }
        } else {
            z14 = false;
        }
        int i27 = rVar7.f70055b;
        int i28 = this.f76634m;
        int i29 = this.f76631j;
        if (i28 < i29) {
            rVar7.H(Math.min(i29 - i28, rVar7.a()));
        }
        this.f76630i.getClass();
        int i30 = rVar7.f70055b;
        while (true) {
            int i34 = rVar7.f70056c - 16;
            s.a aVar5 = this.f76625d;
            if (i30 > i34) {
                if (z14) {
                    while (true) {
                        int i35 = rVar7.f70056c;
                        if (i30 <= i35 - this.f76631j) {
                            rVar7.G(i30);
                            try {
                                zA = s.a(rVar7, this.f76630i, this.f76632k, aVar5);
                            } catch (IndexOutOfBoundsException unused2) {
                                zA = false;
                            }
                            if (rVar7.f70055b > rVar7.f70056c) {
                                zA = false;
                            }
                            if (zA) {
                                rVar7.G(i30);
                                j8 = aVar5.f17253a;
                                break;
                            }
                            i30++;
                        } else {
                            rVar7.G(i35);
                        }
                    }
                } else {
                    rVar7.G(i30);
                }
                j8 = -1;
                break;
            }
            rVar7.G(i30);
            if (s.a(rVar7, this.f76630i, this.f76632k, aVar5)) {
                rVar7.G(i30);
                j8 = aVar5.f17253a;
                break;
            }
            i30++;
        }
        int i36 = rVar7.f70055b - i27;
        rVar7.G(i27);
        this.f76627f.f(i36, rVar7);
        int i37 = this.f76634m + i36;
        this.f76634m = i37;
        if (j8 != -1) {
            long j15 = this.f76635n * 1000000;
            v vVar6 = this.f76630i;
            int i38 = z.f70071a;
            this.f76627f.c(j15 / ((long) vVar6.f17261e), 1, i37, 0, null);
            this.f76634m = 0;
            this.f76635n = j8;
        }
        if (rVar7.a() < 16) {
            int iA2 = rVar7.a();
            byte[] bArr5 = rVar7.f70054a;
            System.arraycopy(bArr5, rVar7.f70055b, bArr5, 0, iA2);
            rVar7.G(0);
            rVar7.F(iA2);
        }
        return 0;
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f76626e = pVar;
        this.f76627f = pVar.track(0, 1);
        pVar.endTracks();
    }

    @Override // bb.n
    public final boolean d(o oVar) {
        w wVarA = new a0().a(oVar, g.f136807b);
        if (wVarA != null) {
            int length = wVarA.f8574a.length;
        }
        r rVar = new r(4);
        ((i) oVar).peekFully(rVar.f70054a, 0, 4, false);
        return rVar.w() == 1716281667;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        if (j8 == 0) {
            this.f76628g = 0;
        } else {
            a aVar = this.f76633l;
            if (aVar != null) {
                aVar.c(j14);
            }
        }
        this.f76635n = j14 != 0 ? -1L : 0L;
        this.f76634m = 0;
        this.f76623b.D(0);
    }

    public b() {
        this(0);
    }
}
