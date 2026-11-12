package hc;

import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f83058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f83059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f83060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f83061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f83062e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f83069l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f83063f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f83064g = new t(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f83065h = new t(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f83066i = new t(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f83067j = new t(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f83068k = new t(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f83070m = C.TIME_UNSET;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fa.r f83071n = new fa.r();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f83072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f83073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f83074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f83076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f83077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f83078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f83079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f83080i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f83081j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f83082k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f83083l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f83084m;

        public a(l0 l0Var) {
            this.f83072a = l0Var;
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
        public final void a(int i14) {
            long j8 = this.f83083l;
            if (j8 == C.TIME_UNSET) {
                return;
            }
            boolean z14 = this.f83084m;
            this.f83072a.c(j8, z14 ? 1 : 0, (int) (this.f83073b - this.f83082k), i14, null);
        }
    }

    public n(b0 b0Var) {
        this.f83058a = b0Var;
    }

    public final void a(int i14, int i15, byte[] bArr) {
        a aVar = this.f83061d;
        if (aVar.f83077f) {
            int i16 = aVar.f83075d;
            int i17 = (i14 + 2) - i16;
            if (i17 < i15) {
                aVar.f83078g = (bArr[i17] & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                aVar.f83077f = false;
            } else {
                aVar.f83075d = (i15 - i14) + i16;
            }
        }
        if (!this.f83062e) {
            this.f83064g.a(bArr, i14, i15);
            this.f83065h.a(bArr, i14, i15);
            this.f83066i.a(bArr, i14, i15);
        }
        this.f83067j.a(bArr, i14, i15);
        this.f83068k.a(bArr, i14, i15);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0185  */
    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0225  */
    /* JADX WARN: Code duplicated, block: B:94:0x022c  */
    @Override // hc.j
    public final void b(fa.r rVar) {
        boolean z14;
        t tVar;
        t tVar2;
        t tVar3;
        b0 b0Var;
        t tVar4;
        boolean zB;
        fa.r rVar2;
        t tVar5;
        boolean z15;
        boolean z16;
        boolean z17;
        fa.a.f(this.f83060c);
        int i14 = fa.z.f70071a;
        while (rVar.a() > 0) {
            int i15 = rVar.f70055b;
            int i16 = rVar.f70056c;
            byte[] bArr = rVar.f70054a;
            this.f83069l += (long) rVar.a();
            this.f83060c.f(rVar.a(), rVar);
            while (i15 < i16) {
                int iB = ga.e.b(bArr, i15, i16, this.f83063f);
                if (iB == i16) {
                    a(i15, i16, bArr);
                    return;
                }
                int i17 = iB + 3;
                int i18 = (bArr[i17] & 126) >> 1;
                int i19 = iB - i15;
                if (i19 > 0) {
                    a(i15, iB, bArr);
                }
                int i24 = i16 - iB;
                long j8 = this.f83069l - ((long) i24);
                int i25 = i19 < 0 ? -i19 : 0;
                long j14 = this.f83070m;
                a aVar = this.f83061d;
                boolean z18 = this.f83062e;
                if (aVar.f83081j && aVar.f83078g) {
                    aVar.f83084m = aVar.f83074c;
                    aVar.f83081j = false;
                } else {
                    if (aVar.f83079h || aVar.f83078g) {
                        if (z18 && aVar.f83080i) {
                            aVar.a(((int) (j8 - aVar.f83073b)) + i24);
                        }
                        aVar.f83082k = aVar.f83073b;
                        aVar.f83083l = aVar.f83076e;
                        aVar.f83084m = aVar.f83074c;
                        aVar.f83080i = true;
                    }
                    z14 = this.f83062e;
                    tVar = this.f83064g;
                    tVar2 = this.f83065h;
                    tVar3 = this.f83066i;
                    b0Var = this.f83058a;
                    if (!z14) {
                        tVar.b(i25);
                        tVar2.b(i25);
                        tVar3.b(i25);
                        if (!tVar.f83156c && tVar2.f83156c && tVar3.f83156c) {
                            String str = this.f83059b;
                            int i26 = tVar.f83158e;
                            byte[] bArr2 = new byte[tVar2.f83158e + i26 + tVar3.f83158e];
                            System.arraycopy(tVar.f83157d, 0, bArr2, 0, i26);
                            System.arraycopy(tVar2.f83157d, 0, bArr2, tVar.f83158e, tVar2.f83158e);
                            System.arraycopy(tVar3.f83157d, 0, bArr2, tVar.f83158e + tVar2.f83158e, tVar3.f83158e);
                            ga.e.h hVarG = ga.e.g(tVar2.f83157d, 3, tVar2.f83158e, null);
                            ga.e.c cVar = hVarG.f76538a;
                            String strA = cVar != null ? fa.d.a(cVar.f76522a, cVar.f76523b, cVar.f76524c, cVar.f76525d, cVar.f76526e, cVar.f76527f) : null;
                            androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                            bVar.f8399a = str;
                            bVar.f8411m = androidx.media3.common.x.n(MimeTypes.VIDEO_H265);
                            bVar.f8408j = strA;
                            bVar.f8418t = hVarG.f76541d;
                            bVar.f8419u = hVarG.f76542e;
                            androidx.media3.common.i.b bVar2 = new androidx.media3.common.i.b();
                            bVar2.f8322a = hVarG.f76545h;
                            bVar2.f8323b = hVarG.f76546i;
                            bVar2.f8324c = hVarG.f76547j;
                            bVar2.f8326e = hVarG.f76539b + 8;
                            bVar2.f8327f = hVarG.f76540c + 8;
                            bVar.A = bVar2.a();
                            bVar.f8422x = hVarG.f76543f;
                            bVar.f8413o = hVarG.f76544g;
                            bVar.f8414p = Collections.singletonList(bArr2);
                            androidx.media3.common.q qVarA = bVar.a();
                            int i27 = qVarA.f8388p;
                            this.f83060c.d(qVarA);
                            Preconditions.checkState(i27 != -1);
                            ga.g gVar = b0Var.f82829c;
                            gVar.getClass();
                            fa.a.d(i27 >= 0);
                            gVar.f76587e = i27;
                            gVar.b(i27);
                            this.f83062e = true;
                        }
                    }
                    tVar4 = this.f83067j;
                    zB = tVar4.b(i25);
                    rVar2 = this.f83071n;
                    if (zB) {
                        rVar2.E(tVar4.f83157d, ga.e.k(tVar4.f83157d, tVar4.f83158e));
                        rVar2.H(5);
                        b0Var.f82829c.a(j14, rVar2);
                    }
                    tVar5 = this.f83068k;
                    if (tVar5.b(i25)) {
                        rVar2.E(tVar5.f83157d, ga.e.k(tVar5.f83157d, tVar5.f83158e));
                        rVar2.H(5);
                        b0Var.f82829c.a(j14, rVar2);
                    }
                    long j15 = this.f83070m;
                    a aVar2 = this.f83061d;
                    boolean z19 = this.f83062e;
                    aVar2.f83078g = false;
                    aVar2.f83079h = false;
                    aVar2.f83076e = j15;
                    aVar2.f83075d = 0;
                    aVar2.f83073b = j8;
                    if (i18 >= 32 || i18 == 40) {
                        z15 = true;
                        z16 = false;
                    } else {
                        if (!aVar2.f83080i || aVar2.f83081j) {
                            z16 = false;
                        } else {
                            if (z19) {
                                aVar2.a(i24);
                            }
                            z16 = false;
                            aVar2.f83080i = false;
                        }
                        if ((32 > i18 || i18 > 35) && i18 != 39) {
                            z15 = true;
                        } else {
                            z15 = true;
                            aVar2.f83079h = !aVar2.f83081j;
                            aVar2.f83081j = true;
                        }
                    }
                    if (i18 >= 16 || i18 > 21) {
                        z17 = z16;
                    } else {
                        z17 = z15;
                    }
                    aVar2.f83074c = z17;
                    if (z17 || i18 <= 9) {
                        z16 = z15;
                    }
                    aVar2.f83077f = z16;
                    if (!this.f83062e) {
                        tVar.d(i18);
                        tVar2.d(i18);
                        tVar3.d(i18);
                    }
                    tVar4.d(i18);
                    tVar5.d(i18);
                    i16 = i16;
                    bArr = bArr;
                    i15 = i17;
                }
                i17 = i17;
                z14 = this.f83062e;
                tVar = this.f83064g;
                tVar2 = this.f83065h;
                tVar3 = this.f83066i;
                b0Var = this.f83058a;
                if (!z14) {
                    tVar.b(i25);
                    tVar2.b(i25);
                    tVar3.b(i25);
                    if (!tVar.f83156c) {
                    }
                }
                tVar4 = this.f83067j;
                zB = tVar4.b(i25);
                rVar2 = this.f83071n;
                if (zB) {
                    rVar2.E(tVar4.f83157d, ga.e.k(tVar4.f83157d, tVar4.f83158e));
                    rVar2.H(5);
                    b0Var.f82829c.a(j14, rVar2);
                }
                tVar5 = this.f83068k;
                if (tVar5.b(i25)) {
                    rVar2.E(tVar5.f83157d, ga.e.k(tVar5.f83157d, tVar5.f83158e));
                    rVar2.H(5);
                    b0Var.f82829c.a(j14, rVar2);
                }
                long j16 = this.f83070m;
                a aVar3 = this.f83061d;
                boolean z110 = this.f83062e;
                aVar3.f83078g = false;
                aVar3.f83079h = false;
                aVar3.f83076e = j16;
                aVar3.f83075d = 0;
                aVar3.f83073b = j8;
                if (i18 >= 32) {
                    z15 = true;
                    z16 = false;
                } else {
                    z15 = true;
                    z16 = false;
                }
                if (i18 >= 16) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                aVar3.f83074c = z17;
                if (z17) {
                    z16 = z15;
                } else {
                    z16 = z15;
                }
                aVar3.f83077f = z16;
                if (!this.f83062e) {
                    tVar.d(i18);
                    tVar2.d(i18);
                    tVar3.d(i18);
                }
                tVar4.d(i18);
                tVar5.d(i18);
                i16 = i16;
                bArr = bArr;
                i15 = i17;
            }
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f83059b = dVar.f82933e;
        dVar.b();
        l0 l0VarTrack = pVar.track(dVar.f82932d, 2);
        this.f83060c = l0VarTrack;
        this.f83061d = new a(l0VarTrack);
        this.f83058a.a(pVar, dVar);
    }

    @Override // hc.j
    public final void d(boolean z14) {
        fa.a.f(this.f83060c);
        int i14 = fa.z.f70071a;
        if (z14) {
            this.f83058a.f82829c.b(0);
            a aVar = this.f83061d;
            long j8 = this.f83069l;
            aVar.f83084m = aVar.f83074c;
            aVar.a((int) (j8 - aVar.f83073b));
            aVar.f83082k = aVar.f83073b;
            aVar.f83073b = j8;
            aVar.a(0);
            aVar.f83080i = false;
        }
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f83070m = j8;
    }

    @Override // hc.j
    public final void seek() {
        this.f83069l = 0L;
        this.f83070m = C.TIME_UNSET;
        ga.e.a(this.f83063f);
        this.f83064g.c();
        this.f83065h.c();
        this.f83066i.c();
        this.f83067j.c();
        this.f83068k.c();
        this.f83058a.f82829c.b(0);
        a aVar = this.f83061d;
        if (aVar != null) {
            aVar.f83077f = false;
            aVar.f83078g = false;
            aVar.f83079h = false;
            aVar.f83080i = false;
            aVar.f83081j = false;
        }
    }
}
