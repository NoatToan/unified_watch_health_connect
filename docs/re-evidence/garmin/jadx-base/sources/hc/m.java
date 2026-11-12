package hc;

import android.util.SparseArray;
import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f83008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83010c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f83014g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f83016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l0 f83017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f83018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f83019l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f83021n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f83015h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f83011d = new t(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f83012e = new t(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f83013f = new t(6, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f83020m = C.TIME_UNSET;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fa.r f83022o = new fa.r();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f83023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f83025c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ga.f f83028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f83029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f83030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f83031i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f83032j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f83034l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a f83035m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a f83036n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f83038p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f83039q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f83040r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f83041s;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<ga.e.m> f83026d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<ga.e.l> f83027e = new SparseArray<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f83033k = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f83037o = false;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f83042a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f83043b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ga.e.m f83044c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f83045d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f83046e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f83047f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f83048g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f83049h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f83050i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f83051j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f83052k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f83053l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f83054m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f83055n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f83056o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f83057p;

            private a() {
            }
        }

        public b(l0 l0Var, boolean z14, boolean z15) {
            this.f83023a = l0Var;
            this.f83024b = z14;
            this.f83025c = z15;
            this.f83035m = new a();
            this.f83036n = new a();
            byte[] bArr = new byte[128];
            this.f83029g = bArr;
            this.f83028f = new ga.f(bArr, 0, 0);
            a aVar = this.f83036n;
            aVar.f83043b = false;
            aVar.f83042a = false;
        }

        public final void a() {
            boolean z14;
            int i14;
            boolean z15 = false;
            if (this.f83024b) {
                a aVar = this.f83036n;
                z14 = aVar.f83043b && ((i14 = aVar.f83046e) == 7 || i14 == 2);
            } else {
                z14 = this.f83041s;
            }
            boolean z16 = this.f83040r;
            int i15 = this.f83031i;
            if (i15 == 5 || (z14 && i15 == 1)) {
                z15 = true;
            }
            this.f83040r = z16 | z15;
        }
    }

    public m(b0 b0Var, boolean z14, boolean z15) {
        this.f83008a = b0Var;
        this.f83009b = z14;
        this.f83010c = z15;
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    public final void a(byte[] bArr, int i14, int i15) {
        boolean zD;
        boolean zD2;
        boolean z14;
        boolean z15;
        int iF;
        int i16;
        int iG;
        int iG2;
        int iE;
        int iG3;
        if (!this.f83019l || this.f83018k.f83025c) {
            this.f83011d.a(bArr, i14, i15);
            this.f83012e.a(bArr, i14, i15);
        }
        this.f83013f.a(bArr, i14, i15);
        b bVar = this.f83018k;
        SparseArray<ga.e.l> sparseArray = bVar.f83027e;
        ga.f fVar = bVar.f83028f;
        if (bVar.f83033k) {
            int i17 = i15 - i14;
            byte[] bArr2 = bVar.f83029g;
            int length = bArr2.length;
            int i18 = bVar.f83030h + i17;
            if (length < i18) {
                bVar.f83029g = Arrays.copyOf(bArr2, i18 * 2);
            }
            System.arraycopy(bArr, i14, bVar.f83029g, bVar.f83030h, i17);
            int i19 = bVar.f83030h + i17;
            bVar.f83030h = i19;
            fVar.f76579a = bVar.f83029g;
            fVar.f76581c = 0;
            fVar.f76580b = i19;
            fVar.f76582d = 0;
            fVar.a();
            if (fVar.b(8)) {
                fVar.i();
                int iE2 = fVar.e(2);
                fVar.j(5);
                if (fVar.c()) {
                    fVar.f();
                    if (fVar.c()) {
                        int iF2 = fVar.f();
                        if (!bVar.f83025c) {
                            bVar.f83033k = false;
                            b.a aVar = bVar.f83036n;
                            aVar.f83046e = iF2;
                            aVar.f83043b = true;
                            return;
                        }
                        if (fVar.c()) {
                            int iF3 = fVar.f();
                            if (sparseArray.indexOfKey(iF3) < 0) {
                                bVar.f83033k = false;
                                return;
                            }
                            ga.e.l lVar = sparseArray.get(iF3);
                            SparseArray<ga.e.m> sparseArray2 = bVar.f83026d;
                            int i24 = lVar.f76558b;
                            boolean z16 = lVar.f76559c;
                            ga.e.m mVar = sparseArray2.get(i24);
                            boolean z17 = mVar.f76569j;
                            int i25 = mVar.f76573n;
                            int i26 = mVar.f76571l;
                            if (z17) {
                                if (!fVar.b(2)) {
                                    return;
                                } else {
                                    fVar.j(2);
                                }
                            }
                            if (fVar.b(i26)) {
                                int iE3 = fVar.e(i26);
                                if (!mVar.f76570k) {
                                    if (fVar.b(1)) {
                                        zD = fVar.d();
                                        if (!zD) {
                                            zD2 = false;
                                        } else {
                                            if (!fVar.b(1)) {
                                                return;
                                            }
                                            zD2 = fVar.d();
                                            z14 = true;
                                        }
                                        if (bVar.f83031i == 5) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            iF = 0;
                                        } else if (!fVar.c()) {
                                            return;
                                        } else {
                                            iF = fVar.f();
                                        }
                                        i16 = mVar.f76572m;
                                        if (i16 == 0) {
                                            if (i16 == 1 || mVar.f76574o) {
                                                iG = 0;
                                                iG2 = 0;
                                                iE = 0;
                                            } else {
                                                if (!fVar.c()) {
                                                    return;
                                                }
                                                iG3 = fVar.g();
                                                if (!z16 || zD) {
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!fVar.c()) {
                                                        return;
                                                    }
                                                    iG2 = fVar.g();
                                                    iG = 0;
                                                }
                                                iE = 0;
                                            }
                                            b.a aVar2 = bVar.f83036n;
                                            aVar2.f83044c = mVar;
                                            aVar2.f83045d = iE2;
                                            aVar2.f83046e = iF2;
                                            aVar2.f83047f = iE3;
                                            aVar2.f83048g = iF3;
                                            aVar2.f83049h = zD;
                                            aVar2.f83050i = z14;
                                            aVar2.f83051j = zD2;
                                            aVar2.f83052k = z15;
                                            aVar2.f83053l = iF;
                                            aVar2.f83054m = iE;
                                            aVar2.f83055n = iG;
                                            aVar2.f83056o = iG3;
                                            aVar2.f83057p = iG2;
                                            aVar2.f83042a = true;
                                            aVar2.f83043b = true;
                                            bVar.f83033k = false;
                                        }
                                        if (!fVar.b(i25)) {
                                            return;
                                        }
                                        iE = fVar.e(i25);
                                        if (z16 || zD) {
                                            iG = 0;
                                        } else if (!fVar.c()) {
                                            return;
                                        } else {
                                            iG = fVar.g();
                                        }
                                        iG2 = 0;
                                        iG3 = 0;
                                        b.a aVar3 = bVar.f83036n;
                                        aVar3.f83044c = mVar;
                                        aVar3.f83045d = iE2;
                                        aVar3.f83046e = iF2;
                                        aVar3.f83047f = iE3;
                                        aVar3.f83048g = iF3;
                                        aVar3.f83049h = zD;
                                        aVar3.f83050i = z14;
                                        aVar3.f83051j = zD2;
                                        aVar3.f83052k = z15;
                                        aVar3.f83053l = iF;
                                        aVar3.f83054m = iE;
                                        aVar3.f83055n = iG;
                                        aVar3.f83056o = iG3;
                                        aVar3.f83057p = iG2;
                                        aVar3.f83042a = true;
                                        aVar3.f83043b = true;
                                        bVar.f83033k = false;
                                    }
                                    return;
                                }
                                zD = false;
                                zD2 = false;
                                z14 = zD2;
                                if (bVar.f83031i == 5) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    iF = 0;
                                } else if (!fVar.c()) {
                                    return;
                                } else {
                                    iF = fVar.f();
                                }
                                i16 = mVar.f76572m;
                                if (i16 == 0) {
                                    if (i16 == 1) {
                                    }
                                    iG = 0;
                                    iG2 = 0;
                                    iE = 0;
                                } else {
                                    if (!fVar.b(i25)) {
                                        return;
                                    }
                                    iE = fVar.e(i25);
                                    if (z16) {
                                        iG = 0;
                                    } else {
                                        iG = 0;
                                    }
                                    iG2 = 0;
                                }
                                iG3 = 0;
                                b.a aVar4 = bVar.f83036n;
                                aVar4.f83044c = mVar;
                                aVar4.f83045d = iE2;
                                aVar4.f83046e = iF2;
                                aVar4.f83047f = iE3;
                                aVar4.f83048g = iF3;
                                aVar4.f83049h = zD;
                                aVar4.f83050i = z14;
                                aVar4.f83051j = zD2;
                                aVar4.f83052k = z15;
                                aVar4.f83053l = iF;
                                aVar4.f83054m = iE;
                                aVar4.f83055n = iG;
                                aVar4.f83056o = iG3;
                                aVar4.f83057p = iG2;
                                aVar4.f83042a = true;
                                aVar4.f83043b = true;
                                bVar.f83033k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0202  */
    /* JADX WARN: Code duplicated, block: B:91:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x026e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0285  */
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
    @Override // hc.j
    public final void b(fa.r rVar) {
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        long j8;
        t tVar;
        b bVar;
        boolean z14;
        boolean z15;
        long j14;
        int i17;
        long j15;
        b bVar2;
        b.a aVar;
        b.a aVar2;
        int i18;
        int i19;
        int i24;
        boolean z16;
        fa.a.f(this.f83017j);
        int i25 = fa.z.f70071a;
        int i26 = rVar.f70055b;
        int i27 = rVar.f70056c;
        byte[] bArr2 = rVar.f70054a;
        this.f83014g += (long) rVar.a();
        this.f83017j.f(rVar.a(), rVar);
        while (true) {
            int iB = ga.e.b(bArr2, i26, i27, this.f83015h);
            if (iB == i27) {
                a(bArr2, i26, i27);
                return;
            }
            int i28 = iB + 3;
            int i29 = bArr2[i28] & Ascii.US;
            int i30 = iB - i26;
            if (i30 > 0) {
                a(bArr2, i26, iB);
            }
            int i34 = i27 - iB;
            long j16 = this.f83014g - ((long) i34);
            int i35 = i30 < 0 ? -i30 : 0;
            long j17 = this.f83020m;
            boolean z17 = this.f83019l;
            t tVar2 = this.f83012e;
            t tVar3 = this.f83011d;
            b0 b0Var = this.f83008a;
            if (!z17 || this.f83018k.f83025c) {
                tVar3.b(i35);
                tVar2.b(i35);
                boolean z18 = this.f83019l;
                boolean z19 = tVar3.f83156c;
                i14 = i34;
                if (z18) {
                    i15 = i27;
                    bArr = bArr2;
                    i16 = i28;
                    j8 = j16;
                    if (z19) {
                        ga.e.m mVarI = ga.e.i(3, tVar3.f83158e, tVar3.f83157d);
                        int i36 = mVarI.f76578s;
                        ga.g gVar = b0Var.f82829c;
                        gVar.getClass();
                        fa.a.d(i36 >= 0);
                        gVar.f76587e = i36;
                        gVar.b(i36);
                        this.f83018k.f83026d.append(mVarI.f76563d, mVarI);
                        tVar3.c();
                    } else if (tVar2.f83156c) {
                        ga.f fVar = new ga.f(tVar2.f83157d, 4, tVar2.f83158e);
                        int iF = fVar.f();
                        int iF2 = fVar.f();
                        fVar.i();
                        ga.e.l lVar = new ga.e.l(iF, iF2, fVar.d());
                        this.f83018k.f83027e.append(lVar.f76557a, lVar);
                        tVar2.c();
                    }
                } else if (z19 && tVar2.f83156c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(tVar3.f83157d, tVar3.f83158e));
                    arrayList.add(Arrays.copyOf(tVar2.f83157d, tVar2.f83158e));
                    i15 = i27;
                    ga.e.m mVarI2 = ga.e.i(3, tVar3.f83158e, tVar3.f83157d);
                    int i37 = mVarI2.f76578s;
                    bArr = bArr2;
                    i16 = i28;
                    j8 = j16;
                    ga.f fVar2 = new ga.f(tVar2.f83157d, 4, tVar2.f83158e);
                    int iF3 = fVar2.f();
                    int iF4 = fVar2.f();
                    fVar2.i();
                    ga.e.l lVar2 = new ga.e.l(iF3, iF4, fVar2.d());
                    int i38 = mVarI2.f76560a;
                    int i39 = mVarI2.f76561b;
                    int i44 = mVarI2.f76562c;
                    byte[] bArr3 = fa.d.f70005a;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i38), Integer.valueOf(i39), Integer.valueOf(i44));
                    l0 l0Var = this.f83017j;
                    androidx.media3.common.q.b bVar3 = new androidx.media3.common.q.b();
                    bVar3.f8399a = this.f83016i;
                    bVar3.f8411m = androidx.media3.common.x.n(MimeTypes.VIDEO_H264);
                    bVar3.f8408j = str;
                    bVar3.f8418t = mVarI2.f76564e;
                    bVar3.f8419u = mVarI2.f76565f;
                    androidx.media3.common.i.b bVar4 = new androidx.media3.common.i.b();
                    bVar4.f8322a = mVarI2.f76575p;
                    bVar4.f8323b = mVarI2.f76576q;
                    bVar4.f8324c = mVarI2.f76577r;
                    bVar4.f8326e = mVarI2.f76567h + 8;
                    bVar4.f8327f = mVarI2.f76568i + 8;
                    bVar3.A = bVar4.a();
                    bVar3.f8422x = mVarI2.f76566g;
                    bVar3.f8414p = arrayList;
                    bVar3.f8413o = i37;
                    l0Var.d(bVar3.a());
                    this.f83019l = true;
                    ga.g gVar2 = b0Var.f82829c;
                    gVar2.getClass();
                    fa.a.d(i37 >= 0);
                    gVar2.f76587e = i37;
                    gVar2.b(i37);
                    this.f83018k.f83026d.append(mVarI2.f76563d, mVarI2);
                    this.f83018k.f83027e.append(lVar2.f76557a, lVar2);
                    tVar3.c();
                    tVar2.c();
                }
                tVar = this.f83013f;
                if (tVar.b(i35)) {
                    int iK = ga.e.k(tVar.f83157d, tVar.f83158e);
                    byte[] bArr4 = tVar.f83157d;
                    fa.r rVar2 = this.f83022o;
                    rVar2.E(bArr4, iK);
                    rVar2.G(4);
                    b0Var.f82829c.a(j17, rVar2);
                }
                bVar = this.f83018k;
                z14 = this.f83019l;
                if (bVar.f83031i == 9) {
                    if (z14 && bVar.f83037o) {
                        j14 = bVar.f83032j;
                        i17 = i14 + ((int) (j8 - j14));
                        j15 = bVar.f83039q;
                        if (j15 != C.TIME_UNSET) {
                            bVar.f83023a.c(j15, bVar.f83040r ? 1 : 0, (int) (j14 - bVar.f83038p), i17, null);
                        }
                    }
                    bVar.f83038p = bVar.f83032j;
                    bVar.f83039q = bVar.f83034l;
                    z15 = false;
                    bVar.f83040r = false;
                    bVar.f83037o = true;
                } else {
                    if (bVar.f83025c) {
                        aVar = bVar.f83036n;
                        aVar2 = bVar.f83035m;
                        if (aVar.f83042a) {
                            if (aVar2.f83042a) {
                                ga.e.m mVar = aVar.f83044c;
                                fa.a.f(mVar);
                                ga.e.m mVar2 = aVar2.f83044c;
                                fa.a.f(mVar2);
                                int i45 = mVar2.f76572m;
                                if (aVar.f83047f == aVar2.f83047f || aVar.f83048g != aVar2.f83048g || aVar.f83049h != aVar2.f83049h || ((aVar.f83050i && aVar2.f83050i && aVar.f83051j != aVar2.f83051j) || (((i18 = aVar.f83045d) != (i19 = aVar2.f83045d) && (i18 == 0 || i19 == 0)) || (((i24 = mVar.f76572m) == 0 && i45 == 0 && (aVar.f83054m != aVar2.f83054m || aVar.f83055n != aVar2.f83055n)) || ((i24 == 1 && i45 == 1 && (aVar.f83056o != aVar2.f83056o || aVar.f83057p != aVar2.f83057p)) || (z16 = aVar.f83052k) != aVar2.f83052k || (z16 && aVar.f83053l != aVar2.f83053l)))))) {
                                }
                            }
                            if (z14) {
                                j14 = bVar.f83032j;
                                i17 = i14 + ((int) (j8 - j14));
                                j15 = bVar.f83039q;
                                if (j15 != C.TIME_UNSET) {
                                    bVar.f83023a.c(j15, bVar.f83040r ? 1 : 0, (int) (j14 - bVar.f83038p), i17, null);
                                }
                            }
                            bVar.f83038p = bVar.f83032j;
                            bVar.f83039q = bVar.f83034l;
                            z15 = false;
                            bVar.f83040r = false;
                            bVar.f83037o = true;
                        }
                    }
                    z15 = false;
                }
                bVar.a();
                if (bVar.f83040r) {
                    this.f83021n = z15;
                }
                long j18 = this.f83020m;
                if (this.f83019l || this.f83018k.f83025c) {
                    tVar3.d(i29);
                    tVar2.d(i29);
                }
                tVar.d(i29);
                bVar2 = this.f83018k;
                boolean z24 = this.f83021n;
                bVar2.f83031i = i29;
                bVar2.f83034l = j18;
                bVar2.f83032j = j8;
                bVar2.f83041s = z24;
                if ((!bVar2.f83024b && i29 == 1) || (bVar2.f83025c && (i29 == 5 || i29 == 1 || i29 == 2))) {
                    b.a aVar3 = bVar2.f83035m;
                    bVar2.f83035m = bVar2.f83036n;
                    bVar2.f83036n = aVar3;
                    aVar3.f83043b = false;
                    aVar3.f83042a = false;
                    bVar2.f83030h = 0;
                    bVar2.f83033k = true;
                }
                i27 = i15;
                bArr2 = bArr;
                i26 = i16;
            } else {
                i14 = i34;
            }
            i15 = i27;
            bArr = bArr2;
            i16 = i28;
            j8 = j16;
            tVar = this.f83013f;
            if (tVar.b(i35)) {
                int iK2 = ga.e.k(tVar.f83157d, tVar.f83158e);
                byte[] bArr5 = tVar.f83157d;
                fa.r rVar3 = this.f83022o;
                rVar3.E(bArr5, iK2);
                rVar3.G(4);
                b0Var.f82829c.a(j17, rVar3);
            }
            bVar = this.f83018k;
            z14 = this.f83019l;
            if (bVar.f83031i == 9) {
                if (z14) {
                    j14 = bVar.f83032j;
                    i17 = i14 + ((int) (j8 - j14));
                    j15 = bVar.f83039q;
                    if (j15 != C.TIME_UNSET) {
                        bVar.f83023a.c(j15, bVar.f83040r ? 1 : 0, (int) (j14 - bVar.f83038p), i17, null);
                    }
                }
                bVar.f83038p = bVar.f83032j;
                bVar.f83039q = bVar.f83034l;
                z15 = false;
                bVar.f83040r = false;
                bVar.f83037o = true;
            } else {
                if (bVar.f83025c) {
                    aVar = bVar.f83036n;
                    aVar2 = bVar.f83035m;
                    if (aVar.f83042a) {
                        if (aVar2.f83042a) {
                            ga.e.m mVar3 = aVar.f83044c;
                            fa.a.f(mVar3);
                            ga.e.m mVar4 = aVar2.f83044c;
                            fa.a.f(mVar4);
                            int i46 = mVar4.f76572m;
                            if (aVar.f83047f == aVar2.f83047f) {
                            }
                        }
                        if (z14) {
                            j14 = bVar.f83032j;
                            i17 = i14 + ((int) (j8 - j14));
                            j15 = bVar.f83039q;
                            if (j15 != C.TIME_UNSET) {
                                bVar.f83023a.c(j15, bVar.f83040r ? 1 : 0, (int) (j14 - bVar.f83038p), i17, null);
                            }
                        }
                        bVar.f83038p = bVar.f83032j;
                        bVar.f83039q = bVar.f83034l;
                        z15 = false;
                        bVar.f83040r = false;
                        bVar.f83037o = true;
                    }
                }
                z15 = false;
            }
            bVar.a();
            if (bVar.f83040r) {
                this.f83021n = z15;
            }
            long j19 = this.f83020m;
            if (this.f83019l) {
                tVar3.d(i29);
                tVar2.d(i29);
            } else {
                tVar3.d(i29);
                tVar2.d(i29);
            }
            tVar.d(i29);
            bVar2 = this.f83018k;
            boolean z25 = this.f83021n;
            bVar2.f83031i = i29;
            bVar2.f83034l = j19;
            bVar2.f83032j = j8;
            bVar2.f83041s = z25;
            if (!bVar2.f83024b) {
            }
            i27 = i15;
            bArr2 = bArr;
            i26 = i16;
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f83016i = dVar.f82933e;
        dVar.b();
        l0 l0VarTrack = pVar.track(dVar.f82932d, 2);
        this.f83017j = l0VarTrack;
        this.f83018k = new b(l0VarTrack, this.f83009b, this.f83010c);
        this.f83008a.a(pVar, dVar);
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
    @Override // hc.j
    public final void d(boolean z14) {
        fa.a.f(this.f83017j);
        int i14 = fa.z.f70071a;
        if (z14) {
            this.f83008a.f82829c.b(0);
            b bVar = this.f83018k;
            long j8 = this.f83014g;
            bVar.a();
            bVar.f83032j = j8;
            long j14 = bVar.f83039q;
            if (j14 != C.TIME_UNSET) {
                boolean z15 = bVar.f83040r;
                bVar.f83023a.c(j14, z15 ? 1 : 0, (int) (j8 - bVar.f83038p), 0, null);
            }
            bVar.f83037o = false;
        }
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f83020m = j8;
        this.f83021n |= (i14 & 2) != 0;
    }

    @Override // hc.j
    public final void seek() {
        this.f83014g = 0L;
        this.f83021n = false;
        this.f83020m = C.TIME_UNSET;
        ga.e.a(this.f83015h);
        this.f83011d.c();
        this.f83012e.c();
        this.f83013f.c();
        this.f83008a.f82829c.b(0);
        b bVar = this.f83018k;
        if (bVar != null) {
            bVar.f83033k = false;
            bVar.f83037o = false;
            b.a aVar = bVar.f83036n;
            aVar.f83043b = false;
            aVar.f83042a = false;
        }
    }
}
