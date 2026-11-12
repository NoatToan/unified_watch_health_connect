package hc;

import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.q f82814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.r f82815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f82819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f82821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f82823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.media3.common.q f82824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f82825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f82826m;

    public b(String str, int i14) {
        fa.q qVar = new fa.q(new byte[128]);
        this.f82814a = qVar;
        this.f82815b = new fa.r(qVar.f70047a);
        this.f82820g = 0;
        this.f82826m = C.TIME_UNSET;
        this.f82816c = str;
        this.f82817d = i14;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0212  */
    /* JADX WARN: Code duplicated, block: B:149:0x0254  */
    /* JADX WARN: Code duplicated, block: B:220:0x0357  */
    /* JADX WARN: Code duplicated, block: B:222:0x037c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // hc.j
    public final void b(fa.r rVar) {
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        int i18;
        int i19;
        int i24;
        androidx.media3.common.q.b bVar;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        fa.a.f(this.f82819f);
        while (rVar.a() > 0) {
            int i45 = this.f82820g;
            fa.r rVar2 = this.f82815b;
            if (i45 == 0) {
                while (rVar.a() > 0) {
                    if (this.f82822i) {
                        int iU = rVar.u();
                        if (iU == 119) {
                            this.f82822i = false;
                            this.f82820g = 1;
                            byte[] bArr = rVar2.f70054a;
                            bArr[0] = Ascii.VT;
                            bArr[1] = 119;
                            this.f82821h = 2;
                            break;
                        }
                        this.f82822i = iU == 11;
                    } else {
                        this.f82822i = rVar.u() == 11;
                    }
                }
            } else if (i45 == 1) {
                byte[] bArr2 = rVar2.f70054a;
                int iMin = Math.min(rVar.a(), 128 - this.f82821h);
                rVar.e(bArr2, this.f82821h, iMin);
                int i46 = this.f82821h + iMin;
                this.f82821h = i46;
                if (i46 == 128) {
                    fa.q qVar = this.f82814a;
                    qVar.m(0);
                    int iE = qVar.e();
                    qVar.o(40);
                    Object[] objArr = qVar.g(5) > 10;
                    qVar.m(iE);
                    int[] iArr = bb.b.f17095d;
                    int[] iArr2 = bb.b.f17093b;
                    if (objArr == true) {
                        qVar.o(16);
                        int iG = qVar.g(2);
                        if (iG == 0) {
                            i26 = 0;
                        } else if (iG != 1) {
                            i26 = iG != 2 ? -1 : 2;
                        } else {
                            i26 = 1;
                        }
                        qVar.o(3);
                        int iG2 = (qVar.g(11) + 1) * 2;
                        int iG3 = qVar.g(2);
                        if (iG3 == 3) {
                            i15 = bb.b.f17094c[qVar.g(2)];
                            i27 = 3;
                            i28 = 6;
                        } else {
                            int iG4 = qVar.g(2);
                            int i47 = bb.b.f17092a[iG4];
                            i15 = iArr2[iG3];
                            i27 = iG4;
                            i28 = i47;
                        }
                        int i48 = i28 * 256;
                        int i49 = (iG2 * i15) / (i28 * 32);
                        int iG5 = qVar.g(3);
                        boolean zF = qVar.f();
                        i16 = iArr[iG5] + (zF ? 1 : 0);
                        qVar.o(10);
                        if (qVar.f()) {
                            qVar.o(8);
                        }
                        if (iG5 == 0) {
                            qVar.o(5);
                            if (qVar.f()) {
                                qVar.o(8);
                            }
                        }
                        if (i26 == 1 && qVar.f()) {
                            qVar.o(16);
                        }
                        if (qVar.f()) {
                            if (iG5 > 2) {
                                qVar.o(2);
                            }
                            if ((iG5 & 1) == 0 || iG5 <= 2) {
                                i36 = 6;
                            } else {
                                i36 = 6;
                                qVar.o(6);
                            }
                            if ((iG5 & 4) != 0) {
                                qVar.o(i36);
                            }
                            if (zF && qVar.f()) {
                                qVar.o(5);
                            }
                            if (i26 != 0) {
                                i29 = i27;
                            } else {
                                if (qVar.f()) {
                                    i37 = 6;
                                    qVar.o(6);
                                } else {
                                    i37 = 6;
                                }
                                if (iG5 == 0 && qVar.f()) {
                                    qVar.o(i37);
                                }
                                if (qVar.f()) {
                                    qVar.o(i37);
                                }
                                int iG6 = qVar.g(2);
                                if (iG6 == 1) {
                                    qVar.o(5);
                                    i39 = 2;
                                } else {
                                    if (iG6 == 2) {
                                        qVar.o(12);
                                    } else if (iG6 == 3) {
                                        int iG7 = qVar.g(5);
                                        if (qVar.f()) {
                                            qVar.o(5);
                                            if (qVar.f()) {
                                                i44 = 4;
                                                qVar.o(4);
                                            } else {
                                                i44 = 4;
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i44);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i44);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i44);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i44);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i44);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i44);
                                            }
                                            if (qVar.f()) {
                                                if (qVar.f()) {
                                                    qVar.o(i44);
                                                }
                                                if (qVar.f()) {
                                                    qVar.o(i44);
                                                }
                                            }
                                        }
                                        if (qVar.f()) {
                                            qVar.o(5);
                                            if (qVar.f()) {
                                                qVar.o(7);
                                                if (qVar.f()) {
                                                    i38 = 8;
                                                    qVar.o(8);
                                                } else {
                                                    i38 = 8;
                                                }
                                            } else {
                                                i38 = 8;
                                            }
                                        } else {
                                            i38 = 8;
                                        }
                                        i39 = 2;
                                        qVar.o((iG7 + 2) * i38);
                                        qVar.c();
                                    }
                                    i39 = 2;
                                }
                                if (iG5 < i39) {
                                    if (qVar.f()) {
                                        qVar.o(14);
                                    }
                                    if (iG5 == 0 && qVar.f()) {
                                        qVar.o(14);
                                    }
                                }
                                if (qVar.f()) {
                                    i29 = i27;
                                    if (i29 == 0) {
                                        qVar.o(5);
                                    } else {
                                        for (int i54 = 0; i54 < i28; i54++) {
                                            if (qVar.f()) {
                                                qVar.o(5);
                                            }
                                        }
                                    }
                                } else {
                                    i29 = i27;
                                }
                            }
                        } else {
                            i29 = i27;
                        }
                        if (qVar.f()) {
                            qVar.o(5);
                            if (iG5 == 2) {
                                qVar.o(4);
                            }
                            if (iG5 >= 6) {
                                qVar.o(2);
                            }
                            if (qVar.f()) {
                                i35 = 8;
                                qVar.o(8);
                            } else {
                                i35 = 8;
                            }
                            if (iG5 == 0 && qVar.f()) {
                                qVar.o(i35);
                            }
                            i30 = 3;
                            if (iG3 < 3) {
                                qVar.n();
                            }
                        } else {
                            i30 = 3;
                        }
                        if (i26 == 0 && i29 != i30) {
                            qVar.n();
                        }
                        if (i26 == 2 && (i29 == i30 || qVar.f())) {
                            i34 = 6;
                            qVar.o(6);
                        } else {
                            i34 = 6;
                        }
                        str = (qVar.f() && qVar.g(i34) == 1 && qVar.g(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
                        i18 = iG2;
                        i17 = i48;
                        i24 = i26;
                        i19 = i49;
                    } else {
                        qVar.o(32);
                        int iG8 = qVar.g(2);
                        String str2 = iG8 == 3 ? null : MimeTypes.AUDIO_AC3;
                        int iG9 = qVar.g(6);
                        int i55 = bb.b.f17096e[iG9 / 2] * 1000;
                        int iA = bb.b.a(iG8, iG9);
                        qVar.o(8);
                        int iG10 = qVar.g(3);
                        if ((iG10 & 1) == 0 || iG10 == 1) {
                            i14 = 2;
                        } else {
                            i14 = 2;
                            qVar.o(2);
                        }
                        if ((iG10 & 4) != 0) {
                            qVar.o(i14);
                        }
                        if (iG10 == i14) {
                            qVar.o(i14);
                        }
                        i15 = iG8 < 3 ? iArr2[iG8] : -1;
                        i16 = iArr[iG10] + (qVar.f() ? 1 : 0);
                        i17 = 1536;
                        str = str2;
                        i18 = iA;
                        i19 = i55;
                        i24 = -1;
                    }
                    bb.b.C0239b c0239b = new bb.b.C0239b(str, i24, i16, i15, i18, i17, i19);
                    androidx.media3.common.q qVar2 = this.f82824k;
                    int i56 = c0239b.f17099b;
                    int i57 = c0239b.f17100c;
                    String str3 = c0239b.f17098a;
                    if (qVar2 != null && i57 == qVar2.C && i56 == qVar2.D) {
                        String str4 = qVar2.f8386n;
                        int i58 = fa.z.f70071a;
                        if (!Objects.equals(str3, str4)) {
                            bVar = new androidx.media3.common.q.b();
                            bVar.f8399a = this.f82818e;
                            bVar.f8411m = androidx.media3.common.x.n(str3);
                            bVar.B = i57;
                            bVar.C = i56;
                            bVar.f8402d = this.f82816c;
                            bVar.f8404f = this.f82817d;
                            i25 = c0239b.f17103f;
                            bVar.f8407i = i25;
                            if (MimeTypes.AUDIO_AC3.equals(str3)) {
                                bVar.f8406h = i25;
                            }
                            androidx.media3.common.q qVarA = bVar.a();
                            this.f82824k = qVarA;
                            this.f82819f.d(qVarA);
                        }
                    } else {
                        bVar = new androidx.media3.common.q.b();
                        bVar.f8399a = this.f82818e;
                        bVar.f8411m = androidx.media3.common.x.n(str3);
                        bVar.B = i57;
                        bVar.C = i56;
                        bVar.f8402d = this.f82816c;
                        bVar.f8404f = this.f82817d;
                        i25 = c0239b.f17103f;
                        bVar.f8407i = i25;
                        if (MimeTypes.AUDIO_AC3.equals(str3)) {
                            bVar.f8406h = i25;
                        }
                        androidx.media3.common.q qVarA2 = bVar.a();
                        this.f82824k = qVarA2;
                        this.f82819f.d(qVarA2);
                    }
                    this.f82825l = c0239b.f17101d;
                    this.f82823j = (((long) c0239b.f17102e) * 1000000) / ((long) this.f82824k.D);
                    rVar2.G(0);
                    this.f82819f.f(128, rVar2);
                    this.f82820g = 2;
                }
            } else if (i45 == 2) {
                int iMin2 = Math.min(rVar.a(), this.f82825l - this.f82821h);
                this.f82819f.f(iMin2, rVar);
                int i59 = this.f82821h + iMin2;
                this.f82821h = i59;
                if (i59 == this.f82825l) {
                    fa.a.d(this.f82826m != C.TIME_UNSET);
                    this.f82819f.c(this.f82826m, 1, this.f82825l, 0, null);
                    this.f82826m += this.f82823j;
                    this.f82820g = 0;
                }
            }
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f82818e = dVar.f82933e;
        dVar.b();
        this.f82819f = pVar.track(dVar.f82932d, 1);
    }

    @Override // hc.j
    public final void d(boolean z14) {
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f82826m = j8;
    }

    @Override // hc.j
    public final void seek() {
        this.f82820g = 0;
        this.f82821h = 0;
        this.f82822i = false;
        this.f82826m = C.TIME_UNSET;
    }

    public b() {
        this(null, 0);
    }
}
