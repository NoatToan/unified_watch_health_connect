package hc;

import androidx.media3.common.ParserException;
import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.r f83093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fa.q f83094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0 f83095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f83096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.media3.common.q f83097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f83098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f83099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f83100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f83101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f83102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f83103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f83104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f83105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f83106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f83107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f83108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f83109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f83110t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f83111u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f83112v;

    public p(String str, int i14) {
        this.f83091a = str;
        this.f83092b = i14;
        fa.r rVar = new fa.r(1024);
        this.f83093c = rVar;
        this.f83094d = new fa.q(rVar.f70054a);
        this.f83102l = C.TIME_UNSET;
    }

    @Override // hc.j
    public final void b(fa.r rVar) throws ParserException {
        int iG;
        boolean zF;
        fa.a.f(this.f83095e);
        while (rVar.a() > 0) {
            int i14 = this.f83098h;
            if (i14 != 0) {
                if (i14 != 1) {
                    fa.r rVar2 = this.f83093c;
                    fa.q qVar = this.f83094d;
                    if (i14 == 2) {
                        int iU = ((this.f83101k & (-225)) << 8) | rVar.u();
                        this.f83100j = iU;
                        if (iU > rVar2.f70054a.length) {
                            rVar2.D(iU);
                            byte[] bArr = rVar2.f70054a;
                            qVar.getClass();
                            qVar.l(bArr, bArr.length);
                        }
                        this.f83099i = 0;
                        this.f83098h = 3;
                    } else {
                        if (i14 != 3) {
                            j20.x.h();
                            return;
                        }
                        int iMin = Math.min(rVar.a(), this.f83100j - this.f83099i);
                        rVar.e(qVar.f70047a, this.f83099i, iMin);
                        int i15 = this.f83099i + iMin;
                        this.f83099i = i15;
                        if (i15 == this.f83100j) {
                            qVar.m(0);
                            if (qVar.f()) {
                                if (this.f83103m) {
                                }
                                this.f83098h = 0;
                            } else {
                                this.f83103m = true;
                                int iG2 = qVar.g(1);
                                int iG3 = iG2 == 1 ? qVar.g(1) : 0;
                                this.f83104n = iG3;
                                if (iG3 != 0) {
                                    throw ParserException.createForMalformedContainer(null, null);
                                }
                                if (iG2 == 1) {
                                    qVar.g((qVar.g(2) + 1) * 8);
                                }
                                if (!qVar.f()) {
                                    throw ParserException.createForMalformedContainer(null, null);
                                }
                                this.f83105o = qVar.g(6);
                                int iG4 = qVar.g(4);
                                int iG5 = qVar.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ParserException.createForMalformedContainer(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = qVar.e();
                                    int iB = qVar.b();
                                    bb.a.b bVarB = bb.a.b(qVar, true);
                                    this.f83112v = bVarB.f17090c;
                                    this.f83109s = bVarB.f17088a;
                                    this.f83111u = bVarB.f17089b;
                                    int iB2 = iB - qVar.b();
                                    qVar.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    qVar.h(iB2, bArr2);
                                    androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                                    bVar.f8399a = this.f83096f;
                                    bVar.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_AAC);
                                    bVar.f8408j = this.f83112v;
                                    bVar.B = this.f83111u;
                                    bVar.C = this.f83109s;
                                    bVar.f8414p = Collections.singletonList(bArr2);
                                    bVar.f8402d = this.f83091a;
                                    bVar.f8404f = this.f83092b;
                                    androidx.media3.common.q qVarA = bVar.a();
                                    if (!qVarA.equals(this.f83097g)) {
                                        this.f83097g = qVarA;
                                        this.f83110t = 1024000000 / ((long) qVarA.D);
                                        this.f83095e.d(qVarA);
                                    }
                                } else {
                                    int iG6 = qVar.g((qVar.g(2) + 1) * 8);
                                    int iB3 = qVar.b();
                                    bb.a.b bVarB2 = bb.a.b(qVar, true);
                                    this.f83112v = bVarB2.f17090c;
                                    this.f83109s = bVarB2.f17088a;
                                    this.f83111u = bVarB2.f17089b;
                                    qVar.o(iG6 - (iB3 - qVar.b()));
                                }
                                int iG7 = qVar.g(3);
                                this.f83106p = iG7;
                                if (iG7 == 0) {
                                    qVar.o(8);
                                } else if (iG7 == 1) {
                                    qVar.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    qVar.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        j20.x.h();
                                        return;
                                    }
                                    qVar.o(1);
                                }
                                boolean zF2 = qVar.f();
                                this.f83107q = zF2;
                                this.f83108r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.f83108r = qVar.g((qVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = qVar.f();
                                            this.f83108r = (this.f83108r << 8) + ((long) qVar.g(8));
                                        } while (zF);
                                    }
                                }
                                if (qVar.f()) {
                                    qVar.o(8);
                                }
                            }
                            if (this.f83104n != 0) {
                                throw ParserException.createForMalformedContainer(null, null);
                            }
                            if (this.f83105o != 0) {
                                throw ParserException.createForMalformedContainer(null, null);
                            }
                            if (this.f83106p != 0) {
                                throw ParserException.createForMalformedContainer(null, null);
                            }
                            int i16 = 0;
                            do {
                                iG = qVar.g(8);
                                i16 += iG;
                            } while (iG == 255);
                            int iE2 = qVar.e();
                            if ((iE2 & 7) == 0) {
                                rVar2.G(iE2 >> 3);
                            } else {
                                qVar.h(i16 * 8, rVar2.f70054a);
                                rVar2.G(0);
                            }
                            this.f83095e.f(i16, rVar2);
                            fa.a.d(this.f83102l != C.TIME_UNSET);
                            this.f83095e.c(this.f83102l, 1, i16, 0, null);
                            this.f83102l += this.f83110t;
                            if (this.f83107q) {
                                qVar.o((int) this.f83108r);
                            }
                            this.f83098h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = rVar.u();
                    if ((iU2 & 224) == 224) {
                        this.f83101k = iU2;
                        this.f83098h = 2;
                    } else if (iU2 != 86) {
                        this.f83098h = 0;
                    }
                }
            } else if (rVar.u() == 86) {
                this.f83098h = 1;
            }
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f83095e = pVar.track(dVar.f82932d, 1);
        dVar.b();
        this.f83096f = dVar.f82933e;
    }

    @Override // hc.j
    public final void d(boolean z14) {
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f83102l = j8;
    }

    @Override // hc.j
    public final void seek() {
        this.f83098h = 0;
        this.f83102l = C.TIME_UNSET;
        this.f83103m = false;
    }
}
