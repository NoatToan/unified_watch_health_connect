package hc;

import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f82982l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f82983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.r f82984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f82985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f82986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f82987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f82988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f82990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l0 f82991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f82992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f82993k;

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f82994f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f82995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f82996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f82997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f82998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f82999e;

        public a(int i14) {
            this.f82999e = new byte[i14];
        }

        public final void a(byte[] bArr, int i14, int i15) {
            if (this.f82995a) {
                int i16 = i15 - i14;
                byte[] bArr2 = this.f82999e;
                int length = bArr2.length;
                int i17 = this.f82997c + i16;
                if (length < i17) {
                    this.f82999e = Arrays.copyOf(bArr2, i17 * 2);
                }
                System.arraycopy(bArr, i14, this.f82999e, this.f82997c, i16);
                this.f82997c += i16;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f83000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f83001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f83002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f83003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f83004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f83005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f83006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f83007h;

        public b(l0 l0Var) {
            this.f83000a = l0Var;
        }

        public final void a(byte[] bArr, int i14, int i15) {
            if (this.f83002c) {
                int i16 = this.f83005f;
                int i17 = (i14 + 1) - i16;
                if (i17 >= i15) {
                    this.f83005f = (i15 - i14) + i16;
                } else {
                    this.f83003d = ((bArr[i17] & 192) >> 6) == 0;
                    this.f83002c = false;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void b(long j8, int i14, boolean z14) {
            fa.a.d(this.f83007h != C.TIME_UNSET);
            if (this.f83004e == 182 && z14 && this.f83001b) {
                this.f83000a.c(this.f83007h, this.f83003d ? 1 : 0, (int) (j8 - this.f83006g), i14, null);
            }
            if (this.f83004e != 179) {
                this.f83006g = j8;
            }
        }
    }

    public l(h0 h0Var) {
        this.f82983a = h0Var;
        this.f82985c = new boolean[4];
        this.f82986d = new a(128);
        this.f82993k = C.TIME_UNSET;
        if (h0Var != null) {
            this.f82987e = new t(178, 128);
            this.f82984b = new fa.r();
        } else {
            this.f82987e = null;
            this.f82984b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x022d  */
    @Override // hc.j
    public final void b(fa.r rVar) {
        boolean z14;
        int i14;
        int i15;
        float f14;
        fa.a.f(this.f82988f);
        fa.a.f(this.f82991i);
        int i16 = rVar.f70055b;
        int i17 = rVar.f70056c;
        byte[] bArr = rVar.f70054a;
        this.f82989g += (long) rVar.a();
        this.f82991i.f(rVar.a(), rVar);
        while (true) {
            int iB = ga.e.b(bArr, i16, i17, this.f82985c);
            a aVar = this.f82986d;
            t tVar = this.f82987e;
            if (iB == i17) {
                if (!this.f82992j) {
                    aVar.a(bArr, i16, i17);
                }
                this.f82988f.a(bArr, i16, i17);
                if (tVar != null) {
                    tVar.a(bArr, i16, i17);
                    return;
                }
                return;
            }
            int i18 = iB + 3;
            byte b14 = rVar.f70054a[i18];
            int i19 = b14 & UnsignedBytes.MAX_VALUE;
            int i24 = iB - i16;
            if (this.f82992j) {
                i17 = i17;
            } else {
                if (i24 > 0) {
                    aVar.a(bArr, i16, iB);
                }
                int i25 = i24 < 0 ? -i24 : 0;
                int i26 = aVar.f82996b;
                if (i26 == 0) {
                    i17 = i17;
                    i15 = 0;
                    if (i19 == 176) {
                        aVar.f82996b = 1;
                        aVar.f82995a = true;
                    }
                } else if (i26 == 1) {
                    i17 = i17;
                    i15 = 0;
                    if (i19 != 181) {
                        fa.k.g("Unexpected start code value");
                        aVar.f82995a = false;
                        aVar.f82997c = 0;
                        aVar.f82996b = 0;
                    } else {
                        aVar.f82996b = 2;
                    }
                } else if (i26 == 2) {
                    i17 = i17;
                    i15 = 0;
                    if (i19 > 31) {
                        fa.k.g("Unexpected start code value");
                        aVar.f82995a = false;
                        aVar.f82997c = 0;
                        aVar.f82996b = 0;
                    } else {
                        aVar.f82996b = 3;
                    }
                } else if (i26 == 3) {
                    i17 = i17;
                    if ((b14 & 240) != 32) {
                        fa.k.g("Unexpected start code value");
                        i15 = 0;
                        aVar.f82995a = false;
                        aVar.f82997c = 0;
                        aVar.f82996b = 0;
                    } else {
                        i15 = 0;
                        aVar.f82998d = aVar.f82997c;
                        aVar.f82996b = 4;
                    }
                } else {
                    if (i26 != 4) {
                        j20.x.h();
                        return;
                    }
                    if (i19 == 179 || i19 == 181) {
                        aVar.f82997c -= i25;
                        aVar.f82995a = false;
                        l0 l0Var = this.f82991i;
                        int i27 = aVar.f82998d;
                        String str = this.f82990h;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(aVar.f82999e, aVar.f82997c);
                        fa.q qVar = new fa.q(bArrCopyOf);
                        qVar.p(i27);
                        qVar.p(4);
                        qVar.n();
                        qVar.o(8);
                        if (qVar.f()) {
                            qVar.o(4);
                            qVar.o(3);
                        }
                        int iG = qVar.g(4);
                        if (iG == 15) {
                            int iG2 = qVar.g(8);
                            int iG3 = qVar.g(8);
                            if (iG3 == 0) {
                                fa.k.g("Invalid aspect ratio");
                                f14 = 1.0f;
                            } else {
                                f14 = iG2 / iG3;
                            }
                        } else if (iG < 7) {
                            f14 = f82982l[iG];
                        } else {
                            fa.k.g("Invalid aspect ratio");
                            f14 = 1.0f;
                        }
                        if (qVar.f()) {
                            qVar.o(2);
                            qVar.o(1);
                            if (qVar.f()) {
                                qVar.o(15);
                                qVar.n();
                                qVar.o(15);
                                qVar.n();
                                qVar.o(15);
                                qVar.n();
                                qVar.o(3);
                                qVar.o(11);
                                qVar.n();
                                qVar.o(15);
                                qVar.n();
                            }
                        }
                        if (qVar.g(2) != 0) {
                            fa.k.g("Unhandled video object layer shape");
                        }
                        qVar.n();
                        int iG4 = qVar.g(16);
                        qVar.n();
                        if (qVar.f()) {
                            if (iG4 == 0) {
                                fa.k.g("Invalid vop_increment_time_resolution");
                            } else {
                                int i28 = 0;
                                for (int i29 = iG4 - 1; i29 > 0; i29 >>= 1) {
                                    i28++;
                                }
                                qVar.o(i28);
                            }
                        }
                        qVar.n();
                        int iG5 = qVar.g(13);
                        qVar.n();
                        int iG6 = qVar.g(13);
                        qVar.n();
                        qVar.n();
                        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                        bVar.f8399a = str;
                        bVar.f8411m = androidx.media3.common.x.n(MimeTypes.VIDEO_MP4V);
                        bVar.f8418t = iG5;
                        bVar.f8419u = iG6;
                        bVar.f8422x = f14;
                        bVar.f8414p = Collections.singletonList(bArrCopyOf);
                        l0Var.d(bVar.a());
                        this.f82992j = true;
                    } else {
                        i17 = i17;
                        i15 = 0;
                    }
                }
                aVar.a(a.f82994f, i15, 3);
            }
            this.f82988f.a(bArr, i16, iB);
            if (tVar == null) {
                z14 = true;
            } else {
                if (i24 > 0) {
                    tVar.a(bArr, i16, iB);
                    i14 = 0;
                } else {
                    i14 = -i24;
                }
                if (tVar.b(i14)) {
                    int iK = ga.e.k(tVar.f83157d, tVar.f83158e);
                    int i30 = fa.z.f70071a;
                    byte[] bArr2 = tVar.f83157d;
                    fa.r rVar2 = this.f82984b;
                    rVar2.E(bArr2, iK);
                    this.f82983a.a(this.f82993k, rVar2);
                }
                if (i19 == 178) {
                    z14 = true;
                    if (rVar.f70054a[iB + 2] == 1) {
                        tVar.d(i19);
                    }
                } else {
                    z14 = true;
                }
            }
            int i34 = i17 - iB;
            this.f82988f.b(this.f82989g - ((long) i34), i34, this.f82992j);
            b bVar2 = this.f82988f;
            long j8 = this.f82993k;
            bVar2.f83004e = i19;
            bVar2.f83003d = false;
            bVar2.f83001b = (i19 == 182 || i19 == 179) ? z14 : false;
            bVar2.f83002c = i19 == 182 ? z14 : false;
            bVar2.f83005f = 0;
            bVar2.f83007h = j8;
            i16 = i18;
            i17 = i17;
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f82990h = dVar.f82933e;
        dVar.b();
        l0 l0VarTrack = pVar.track(dVar.f82932d, 2);
        this.f82991i = l0VarTrack;
        this.f82988f = new b(l0VarTrack);
        h0 h0Var = this.f82983a;
        if (h0Var != null) {
            h0Var.b(pVar, dVar);
        }
    }

    @Override // hc.j
    public final void d(boolean z14) {
        fa.a.f(this.f82988f);
        if (z14) {
            this.f82988f.b(this.f82989g, 0, this.f82992j);
            b bVar = this.f82988f;
            bVar.f83001b = false;
            bVar.f83002c = false;
            bVar.f83003d = false;
            bVar.f83004e = -1;
        }
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f82993k = j8;
    }

    @Override // hc.j
    public final void seek() {
        ga.e.a(this.f82985c);
        a aVar = this.f82986d;
        aVar.f82995a = false;
        aVar.f82997c = 0;
        aVar.f82996b = 0;
        b bVar = this.f82988f;
        if (bVar != null) {
            bVar.f83001b = false;
            bVar.f83002c = false;
            bVar.f83003d = false;
            bVar.f83004e = -1;
        }
        t tVar = this.f82987e;
        if (tVar != null) {
            tVar.c();
        }
        this.f82989g = 0L;
        this.f82993k = C.TIME_UNSET;
    }

    public l() {
        this(null);
    }
}
