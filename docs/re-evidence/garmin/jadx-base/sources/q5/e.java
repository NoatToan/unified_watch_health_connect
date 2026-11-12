package q5;

import android.os.Trace;
import g6.k;
import h5.a1;
import h5.c1;
import h5.e0;
import h5.n1;
import h5.r0;
import o4.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p1.i0;
import p1.n;
import p1.o;
import p1.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq5/e;", "", "Lp1/n;", "Lh5/e0;", "layoutNodes", "Lq5/b;", "executeDelayed", "<init>", "(Lp1/n;Lq5/b;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f142831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f142832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f142833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0<e23.a<Unit>> f142834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f142835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f142836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f142837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f142838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f142839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f142840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n4.b f142841k;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements e23.a<Unit> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            e eVar = e.this;
            eVar.f142838h = null;
            Trace.beginSection("OnPositionedDispatch");
            try {
                eVar.a();
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    }

    public e(n<e0> nVar, b bVar) {
        this.f142831a = bVar;
        this.f142832b = new c();
        this.f142833c = new g();
        this.f142834d = new q0<>(0, 1, null);
        this.f142839i = -1L;
        this.f142840j = new a();
        this.f142841k = new n4.b(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static long d(e0 e0Var) {
        c1 c1Var = e0Var.P.f81683d;
        k.f76003b.getClass();
        long jE = 0;
        for (c1 c1Var2 = e0Var.P.f81682c; c1Var2 != null && c1Var2 != c1Var; c1Var2 = c1Var2.f81715v) {
            n1 n1Var = c1Var2.K0;
            if (n1Var != null && !l1.c(n1Var.mo322getUnderlyingMatrixsQKQjiQ())) {
                k.f76003b.getClass();
                return k.f76004c;
            }
            jE = k.e(jE, c1Var2.E);
        }
        return jE;
    }

    public static void g(e0 e0Var) {
        if (e0Var.f81762c) {
            n1 n1Var = e0Var.P.f81683d.K0;
            if (n1Var == null || l1.c(n1Var.mo322getUnderlyingMatrixsQKQjiQ())) {
                e0Var.f81762c = false;
                if (e0Var.f81764e) {
                    e0Var.f81763d = d(e0Var);
                    e0Var.f81764e = false;
                }
                long j8 = e0Var.f81763d;
                k.f76003b.getClass();
                if (k.c(j8, k.f76004c)) {
                    return;
                }
                q3.c<e0> cVarN = e0Var.N();
                e0[] e0VarArr = cVarN.f142356a;
                int i14 = cVarN.f142358c;
                for (int i15 = 0; i15 < i14; i15++) {
                    g(e0VarArr[i15]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0224  */
    /* JADX WARN: Code duplicated, block: B:110:0x0249  */
    /* JADX WARN: Code duplicated, block: B:112:0x025f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0273  */
    /* JADX WARN: Code duplicated, block: B:117:0x0283  */
    /* JADX WARN: Code duplicated, block: B:119:0x0289  */
    /* JADX WARN: Code duplicated, block: B:121:0x0292 A[LOOP:11: B:120:0x0290->B:121:0x0292, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02da A[LOOP:9: B:113:0x0264->B:128:0x02da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ec A[LOOP:12: B:134:0x02ea->B:135:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:143:0x0308  */
    /* JADX WARN: Code duplicated, block: B:167:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02e5 A[EDGE_INSN: B:168:0x02e5->B:131:0x02e5 BREAK  A[LOOP:9: B:113:0x0264->B:128:0x02da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b9 A[LOOP:7: B:92:0x01b7->B:93:0x01b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0202  */
    public final void a() {
        boolean z14;
        long j8;
        long j14;
        long j15;
        long j16;
        g gVar;
        c cVar;
        long j17;
        long j18;
        float[] fArr;
        Object[] objArr;
        long[] jArr;
        int length;
        long jA;
        g.a aVar;
        long j19;
        g.a aVar2;
        int i14;
        long j24;
        long j25;
        long j26;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j27;
        int i24;
        int i25;
        g.a aVar3;
        long[] jArr2;
        long[] jArr3;
        int i26;
        int i27;
        int i28;
        long j28;
        long j29;
        float[] fArr2;
        g.a aVar4;
        g.a aVar5;
        long j34;
        long j35;
        Object obj = this.f142838h;
        if (obj != null) {
            this.f142831a.g(obj);
            this.f142838h = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z15 = this.f142835e;
        boolean z16 = z15 || this.f142836f;
        long j36 = 0;
        c cVar2 = this.f142832b;
        boolean z17 = true;
        g gVar2 = this.f142833c;
        if (z15) {
            this.f142835e = false;
            q0<e23.a<Unit>> q0Var = this.f142834d;
            Object[] objArr2 = q0Var.f134667a;
            int i29 = q0Var.f134668b;
            for (int i30 = 0; i30 < i29; i30++) {
                ((e23.a) objArr2[i30]).invoke();
            }
            long[] jArr4 = cVar2.f142825a;
            int i34 = cVar2.f142827c;
            int i35 = 0;
            while (i35 < jArr4.length - 2 && i35 < i34) {
                boolean z18 = z17;
                int i36 = i34;
                long j37 = jArr4[i35 + 2];
                boolean z19 = z16;
                if ((((int) (j37 >> 60)) & 1) != 0) {
                    long j38 = jArr4[i35];
                    long j39 = jArr4[i35 + 1];
                    g.a aVarB = gVar2.f142850a.b(((int) j37) & 33554431);
                    while (aVarB != null) {
                        g.a aVar6 = aVarB.f142862f;
                        int i37 = i35;
                        long j44 = aVarB.f142865i;
                        long j45 = aVarB.f142858b;
                        long j46 = aVarB.f142859c;
                        boolean z24 = (jCurrentTimeMillis - j44 >= j45 || j44 == Long.MIN_VALUE) ? z18 : false;
                        boolean z25 = j46 == j36 ? z18 : false;
                        boolean z26 = j45 == j36 ? z18 : false;
                        aVarB.f142863g = j38;
                        aVarB.f142864h = j39;
                        boolean z27 = ((z25 || z26) && !z25) ? false : z18;
                        if (z24 && z27) {
                            j34 = j39;
                            aVarB.f142866j = -1L;
                            aVarB.f142865i = jCurrentTimeMillis;
                            j35 = j36;
                            aVarB.a(j38, j34, gVar2.f142853d, gVar2.f142854e, gVar2.f142856g);
                        } else {
                            j34 = j39;
                            j35 = j36;
                            if (!z25) {
                                aVarB.f142866j = jCurrentTimeMillis;
                                long j47 = gVar2.f142852c;
                                long j48 = j46 + jCurrentTimeMillis;
                                if (j47 > j35 && j48 < j47) {
                                    gVar2.f142852c = j47;
                                }
                            }
                        }
                        i35 = i37;
                        aVarB = aVar6;
                        j39 = j34;
                        j36 = j35;
                    }
                }
                i35 += 3;
                i34 = i36;
                z16 = z19;
                z17 = z18;
                j36 = j36;
            }
            z14 = z16;
            j8 = j36;
            long[] jArr5 = cVar2.f142825a;
            int i38 = cVar2.f142827c;
            for (int i39 = 0; i39 < jArr5.length - 2 && i39 < i38; i39 += 3) {
                int i44 = i39 + 2;
                jArr5[i44] = jArr5[i44] & (-1152921504606846977L);
            }
        } else {
            z14 = z16;
            j8 = 0;
        }
        if (this.f142836f) {
            this.f142836f = false;
            long j49 = gVar2.f142853d;
            long j54 = gVar2.f142854e;
            j14 = jCurrentTimeMillis;
            float[] fArr3 = gVar2.f142856g;
            i0<g.a> i0Var = gVar2.f142850a;
            j15 = 128;
            Object[] objArr3 = i0Var.f134774c;
            long[] jArr6 = i0Var.f134772a;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                int i45 = 0;
                j16 = 255;
                while (true) {
                    long j55 = jArr6[i45];
                    long[] jArr7 = jArr6;
                    g gVar3 = gVar2;
                    if ((((~j55) << 7) & j55 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i46 = 8 - ((~(i45 - length2)) >>> 31);
                        long j56 = j55;
                        int i47 = 0;
                        while (i47 < i46) {
                            if ((j56 & 255) < 128) {
                                g.a aVar7 = (g.a) objArr3[(i45 << 3) + i47];
                                while (aVar7 != null) {
                                    c cVar3 = cVar2;
                                    g.a aVar8 = aVar7;
                                    gVar3.b(aVar8, j49, j54, fArr3, j14);
                                    aVar7 = aVar8.f142862f;
                                    cVar2 = cVar3;
                                }
                            }
                            j56 >>= 8;
                            i47++;
                            gVar3 = gVar3;
                            cVar2 = cVar2;
                        }
                        cVar2 = cVar2;
                        gVar2 = gVar3;
                        if (i46 != 8) {
                            break;
                        }
                    } else {
                        cVar2 = cVar2;
                        gVar2 = gVar3;
                    }
                    if (i45 == length2) {
                        break;
                    }
                    i45++;
                    cVar2 = cVar2;
                    jArr6 = jArr7;
                }
            }
            if (z14) {
                j28 = gVar2.f142853d;
                j29 = gVar2.f142854e;
                fArr2 = gVar2.f142856g;
                aVar4 = gVar2.f142851b;
                if (aVar4 != null) {
                    aVar5 = aVar4;
                    while (aVar5 != null) {
                        e0 e0VarG = h5.k.g(aVar5.f142860d);
                        long jB = h5.i0.a(e0VarG).getRectManager().b(e0VarG);
                        aVar5.f142863g = jB;
                        k.a aVar9 = k.f76003b;
                        r0 r0Var = e0VarG.T.f81853p;
                        aVar5.f142864h = (((long) (r0Var.f69144a + ((int) (jB >> 32)))) << 32) | (((long) (r0Var.f69145b + ((int) (jB & 4294967295L)))) & 4294967295L);
                        gVar2.b(aVar5, j28, j29, fArr2, j14);
                        aVar5 = aVar5.f142862f;
                        cVar2 = cVar2;
                    }
                }
            }
            gVar = gVar2;
            cVar = cVar2;
            if (this.f142837g) {
                this.f142837g = false;
                jArr2 = cVar.f142825a;
                int i48 = cVar.f142827c;
                jArr3 = cVar.f142826b;
                i27 = 0;
                for (i26 = 0; i26 < jArr2.length - 2 && i27 < jArr3.length - 2 && i26 < i48; i26 += 3) {
                    i28 = i26 + 2;
                    if (jArr2[i28] != d.f142830c) {
                        jArr3[i27] = jArr2[i26];
                        jArr3[i27 + 1] = jArr2[i26 + 1];
                        jArr3[i27 + 2] = jArr2[i28];
                        i27 += 3;
                    }
                }
                cVar.f142827c = i27;
                cVar.f142825a = jArr3;
                cVar.f142826b = jArr2;
            }
            if (gVar.f142852c <= j14) {
                j17 = gVar.f142853d;
                j18 = gVar.f142854e;
                fArr = gVar.f142856g;
                i0<g.a> i0Var2 = gVar.f142850a;
                objArr = i0Var2.f134774c;
                jArr = i0Var2.f134772a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i14 = 0;
                    j24 = Long.MAX_VALUE;
                    while (true) {
                        j25 = jArr[i14];
                        j26 = j17;
                        i15 = length;
                        if ((((~j25) << 7) & j25 & (-9187201950435737472L)) != -9187201950435737472L) {
                            i18 = 8;
                            i19 = 8 - ((~(i14 - i15)) >>> 31);
                            jA = j24;
                            j27 = j25;
                            i24 = 0;
                            while (i24 < i19) {
                                if ((j27 & j16) < j15) {
                                    aVar3 = (g.a) objArr[(i14 << 3) + i24];
                                    while (aVar3 != null) {
                                        int i49 = i19;
                                        g.a aVar10 = aVar3;
                                        long j57 = j26;
                                        int i54 = i24;
                                        int i55 = i18;
                                        int i56 = i14;
                                        long j58 = j14;
                                        jA = g.a(aVar10, j57, j18, fArr, j58, jA);
                                        j14 = j58;
                                        i14 = i56;
                                        i18 = i55;
                                        i24 = i54;
                                        j26 = j57;
                                        i15 = i15;
                                        aVar3 = aVar10.f142862f;
                                        i19 = i49;
                                    }
                                }
                                int i57 = i19;
                                long j59 = j26;
                                int i58 = i24;
                                int i59 = i18;
                                j27 >>= i59;
                                int i64 = i58 + 1;
                                j26 = j59;
                                i15 = i15;
                                i14 = i14;
                                i18 = i59;
                                i24 = i64;
                                i19 = i57;
                            }
                            i16 = i15;
                            i25 = i18;
                            j17 = j26;
                            i17 = i14;
                            if (i19 == i25) {
                                break;
                            } else {
                                j24 = jA;
                            }
                        } else {
                            i16 = i15;
                            i17 = i14;
                            j17 = j26;
                        }
                        if (i17 != i16) {
                            jA = j24;
                            break;
                        } else {
                            i14 = i17 + 1;
                            length = i16;
                        }
                    }
                } else {
                    jA = Long.MAX_VALUE;
                }
                aVar = gVar.f142851b;
                if (aVar != null) {
                    for (aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f142862f) {
                        long j64 = j14;
                        jA = g.a(aVar2, j17, j18, fArr, j64, jA);
                        j14 = j64;
                    }
                }
                if (jA == Long.MAX_VALUE) {
                    j19 = -1;
                } else {
                    j19 = jA;
                }
                gVar.f142852c = j19;
            }
            if (gVar.f142852c > j8) {
                h();
            }
        }
        j14 = jCurrentTimeMillis;
        j15 = 128;
        j16 = 255;
        if (z14) {
            j28 = gVar2.f142853d;
            j29 = gVar2.f142854e;
            fArr2 = gVar2.f142856g;
            aVar4 = gVar2.f142851b;
            if (aVar4 != null) {
                aVar5 = aVar4;
                while (aVar5 != null) {
                    e0 e0VarG2 = h5.k.g(aVar5.f142860d);
                    long jB2 = h5.i0.a(e0VarG2).getRectManager().b(e0VarG2);
                    aVar5.f142863g = jB2;
                    k.a aVar11 = k.f76003b;
                    r0 r0Var2 = e0VarG2.T.f81853p;
                    aVar5.f142864h = (((long) (r0Var2.f69144a + ((int) (jB2 >> 32)))) << 32) | (((long) (r0Var2.f69145b + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    gVar2.b(aVar5, j28, j29, fArr2, j14);
                    aVar5 = aVar5.f142862f;
                    cVar2 = cVar2;
                }
            }
        }
        gVar = gVar2;
        cVar = cVar2;
        if (this.f142837g) {
            this.f142837g = false;
            jArr2 = cVar.f142825a;
            int i410 = cVar.f142827c;
            jArr3 = cVar.f142826b;
            i27 = 0;
            while (i26 < jArr2.length - 2) {
                i28 = i26 + 2;
                if (jArr2[i28] != d.f142830c) {
                    jArr3[i27] = jArr2[i26];
                    jArr3[i27 + 1] = jArr2[i26 + 1];
                    jArr3[i27 + 2] = jArr2[i28];
                    i27 += 3;
                }
            }
            cVar.f142827c = i27;
            cVar.f142825a = jArr3;
            cVar.f142826b = jArr2;
        }
        if (gVar.f142852c <= j14) {
            j17 = gVar.f142853d;
            j18 = gVar.f142854e;
            fArr = gVar.f142856g;
            i0<g.a> i0Var3 = gVar.f142850a;
            objArr = i0Var3.f134774c;
            jArr = i0Var3.f134772a;
            length = jArr.length - 2;
            if (length >= 0) {
                i14 = 0;
                j24 = Long.MAX_VALUE;
                while (true) {
                    j25 = jArr[i14];
                    j26 = j17;
                    i15 = length;
                    if ((((~j25) << 7) & j25 & (-9187201950435737472L)) != -9187201950435737472L) {
                        i18 = 8;
                        i19 = 8 - ((~(i14 - i15)) >>> 31);
                        jA = j24;
                        j27 = j25;
                        i24 = 0;
                        while (i24 < i19) {
                            if ((j27 & j16) < j15) {
                                aVar3 = (g.a) objArr[(i14 << 3) + i24];
                                while (aVar3 != null) {
                                    int i411 = i19;
                                    g.a aVar12 = aVar3;
                                    long j510 = j26;
                                    int i510 = i24;
                                    int i511 = i18;
                                    int i512 = i14;
                                    long j511 = j14;
                                    jA = g.a(aVar12, j510, j18, fArr, j511, jA);
                                    j14 = j511;
                                    i14 = i512;
                                    i18 = i511;
                                    i24 = i510;
                                    j26 = j510;
                                    i15 = i15;
                                    aVar3 = aVar12.f142862f;
                                    i19 = i411;
                                }
                            }
                            int i513 = i19;
                            long j512 = j26;
                            int i514 = i24;
                            int i515 = i18;
                            j27 >>= i515;
                            int i65 = i514 + 1;
                            j26 = j512;
                            i15 = i15;
                            i14 = i14;
                            i18 = i515;
                            i24 = i65;
                            i19 = i513;
                        }
                        i16 = i15;
                        i25 = i18;
                        j17 = j26;
                        i17 = i14;
                        if (i19 == i25) {
                            break;
                            break;
                        }
                        j24 = jA;
                    } else {
                        i16 = i15;
                        i17 = i14;
                        j17 = j26;
                    }
                    if (i17 != i16) {
                        jA = j24;
                        break;
                    } else {
                        i14 = i17 + 1;
                        length = i16;
                    }
                }
            } else {
                jA = Long.MAX_VALUE;
            }
            aVar = gVar.f142851b;
            if (aVar != null) {
                while (aVar2 != null) {
                    long j65 = j14;
                    jA = g.a(aVar2, j17, j18, fArr, j65, jA);
                    j14 = j65;
                }
            }
            if (jA == Long.MAX_VALUE) {
                j19 = -1;
            } else {
                j19 = jA;
            }
            gVar.f142852c = j19;
        }
        if (gVar.f142852c > j8) {
            h();
        }
    }

    public final long b(e0 e0Var) {
        long j8;
        int i14 = e0Var.f81761b & 33554431;
        c cVar = this.f142832b;
        long[] jArr = cVar.f142825a;
        int i15 = cVar.f142827c;
        int i16 = 0;
        while (true) {
            if (i16 >= jArr.length - 2 || i16 >= i15) {
                j8 = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i16 + 2]) & 33554431) == i14) {
                j8 = jArr[i16];
                break;
            }
            i16 += 3;
        }
        if (j8 == Long.MAX_VALUE) {
            k.f76003b.getClass();
            return k.f76004c;
        }
        long j14 = (((long) ((int) (j8 >> 32))) << 32) | (((long) ((int) j8)) & 4294967295L);
        k.a aVar = k.f76003b;
        return j14;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0102  */
    /* JADX WARN: Code duplicated, block: B:33:0x0106  */
    public final void c(e0 e0Var) {
        char c14;
        boolean z14;
        e0 e0VarK;
        int i14;
        boolean z15 = true;
        e0Var.f81762c = true;
        a1 a1Var = e0Var.P;
        c1 c1Var = a1Var.f81683d;
        r0 r0Var = e0Var.T.f81853p;
        int iN0 = r0Var.n0();
        float fM0 = r0Var.m0();
        n4.b bVar = this.f142841k;
        bVar.f123537a = 0.0f;
        bVar.f123538b = 0.0f;
        bVar.f123539c = iN0;
        bVar.f123540d = fM0;
        while (true) {
            c14 = ' ';
            if (c1Var == null) {
                break;
            }
            e0 e0Var2 = c1Var.f81711p;
            if (c1Var == e0Var2.P.f81683d && !e0Var2.f81762c) {
                long jB = b(e0Var2);
                k.f76003b.getClass();
                if (!k.c(jB, k.f76004c)) {
                    long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB >> 32));
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jB & 4294967295L));
                    n4.c.a aVar = n4.c.f123541b;
                    bVar.c((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
                    break;
                }
            }
            n1 n1Var = c1Var.K0;
            if (n1Var != null) {
                float[] fArrMo322getUnderlyingMatrixsQKQjiQ = n1Var.mo322getUnderlyingMatrixsQKQjiQ();
                if (!l1.c(fArrMo322getUnderlyingMatrixsQKQjiQ)) {
                    o4.a1.d(fArrMo322getUnderlyingMatrixsQKQjiQ, bVar);
                }
            }
            long j8 = c1Var.E;
            k.a aVar2 = k.f76003b;
            long jFloatToRawIntBits3 = (4294967295L & ((long) Float.floatToRawIntBits((int) (j8 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32);
            n4.c.a aVar3 = n4.c.f123541b;
            bVar.c(jFloatToRawIntBits3);
            c1Var = c1Var.f81715v;
        }
        int i15 = (int) bVar.f123537a;
        int i16 = (int) bVar.f123538b;
        int i17 = (int) bVar.f123539c;
        int i18 = (int) bVar.f123540d;
        int i19 = e0Var.f81761b;
        boolean z16 = e0Var.f81766g;
        e0Var.f81766g = true;
        if (z16) {
            int i24 = i19 & 33554431;
            c cVar = this.f142832b;
            long[] jArr = cVar.f142825a;
            int i25 = cVar.f142827c;
            int i26 = 0;
            while (true) {
                if (i26 >= jArr.length - 2 || i26 >= i25) {
                    z14 = z15;
                    e0VarK = e0Var.K();
                    if (e0VarK != null) {
                        i14 = e0VarK.f81761b;
                    } else {
                        i14 = -1;
                    }
                    this.f142832b.a(i19, i15, i16, i17, i18, (512 & 32) != 0 ? -1 : i14, a1Var.d(1024), a1Var.d(16), this.f142833c.f142850a.a(i19), -1);
                } else {
                    int i27 = i26 + 2;
                    char c15 = c14;
                    long j14 = jArr[i27];
                    z14 = z15;
                    if ((((int) j14) & 33554431) == i24) {
                        jArr[i26] = (((long) i15) << c15) | (((long) i16) & 4294967295L);
                        jArr[i26 + 1] = (((long) i17) << c15) | (((long) i18) & 4294967295L);
                        jArr[i27] = (((j14 >> 63) & 1) << 60) | j14;
                    } else {
                        i26 += 3;
                        c14 = c15;
                        z15 = z14;
                    }
                }
            }
        } else {
            z14 = z15;
            e0VarK = e0Var.K();
            if (e0VarK != null) {
                i14 = e0VarK.f81761b;
            } else {
                i14 = -1;
            }
            this.f142832b.a(i19, i15, i16, i17, i18, (512 & 32) != 0 ? -1 : i14, a1Var.d(1024), a1Var.d(16), this.f142833c.f142850a.a(i19), -1);
        }
        e0Var.f81765f = false;
        this.f142835e = z14;
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i28 = cVarN.f142358c;
        for (int i29 = 0; i29 < i28; i29++) {
            e0 e0Var3 = e0VarArr[i29];
            if (e0Var3.g()) {
                c(e0Var3);
            }
        }
    }

    public final void e(e0 e0Var) {
        long j8;
        n1 n1Var;
        int i14;
        int i15;
        int i16;
        char c14;
        boolean zG = e0Var.g();
        a1 a1Var = e0Var.P;
        if (zG && e0Var.f81765f) {
            e0 e0VarK = e0Var.K();
            if (e0VarK != null && !e0VarK.f81762c) {
                if (e0VarK.f81764e) {
                    e0VarK.f81764e = false;
                    e0VarK.f81763d = d(e0VarK);
                }
                j8 = e0VarK.f81763d;
            } else if (e0VarK == null) {
                k.f76003b.getClass();
                j8 = 0;
            } else {
                k.f76003b.getClass();
                j8 = k.f76004c;
            }
            c1 c1Var = a1Var.f81683d;
            k.f76003b.getClass();
            if (k.c(j8, k.f76004c) || !((n1Var = c1Var.K0) == null || l1.c(n1Var.mo322getUnderlyingMatrixsQKQjiQ()))) {
                c(e0Var);
            } else if (e0Var.f81762c) {
                c(e0Var);
                g(e0Var);
            } else {
                long jE = k.e(j8, c1Var.E);
                r0 r0Var = e0Var.T.f81853p;
                int iN0 = r0Var.n0();
                int iM0 = r0Var.m0();
                int i17 = e0Var.f81761b;
                char c15 = ' ';
                if (e0Var.f81766g) {
                    c cVar = this.f142832b;
                    if (e0VarK != null) {
                        int i18 = e0VarK.f81761b;
                        int i19 = (int) (jE >> 32);
                        int i24 = (int) (jE & 4294967295L);
                        int i25 = i17 & 33554431;
                        long[] jArr = cVar.f142825a;
                        int i26 = cVar.f142827c;
                        int i27 = 0;
                        loop0: while (i27 < jArr.length - 2 && i27 < i26) {
                            int i28 = i24;
                            if ((((int) jArr[i27 + 2]) & 33554431) == i18) {
                                long j14 = jArr[i27];
                                int i29 = ((int) (j14 >> c15)) + i19;
                                int i30 = ((int) j14) + i28;
                                int i34 = i29 + iN0;
                                int i35 = i30 + iM0;
                                i27 += 3;
                                c14 = c15;
                                while (i27 < jArr.length - 2 && i27 < i26) {
                                    int i36 = i27 + 2;
                                    int i37 = iM0;
                                    int i38 = iN0;
                                    long j15 = jArr[i36];
                                    int i39 = i18;
                                    if ((((int) j15) & 33554431) == i25) {
                                        long j16 = jArr[i27];
                                        int i44 = i29 - ((int) (j16 >> c14));
                                        int i45 = i30 - ((int) j16);
                                        jArr[i27] = (((long) i29) << c14) | (((long) i30) & 4294967295L);
                                        jArr[i27 + 1] = (((long) i34) << c14) | (((long) i35) & 4294967295L);
                                        jArr[i36] = j15 | (((j15 >> 63) & 1) << 60);
                                        if (i44 != 0 || i45 != 0) {
                                            cVar.d(i44, i45, (j15 & d.f142829b) | (((long) ((i27 + 3) & 33554431)) << 25));
                                            break loop0;
                                        }
                                        break loop0;
                                    }
                                    i27 += 3;
                                    iN0 = i38;
                                    iM0 = i37;
                                    i18 = i39;
                                }
                                i14 = i18;
                                i15 = iM0;
                                i16 = iN0;
                            } else {
                                i14 = i18;
                                i15 = iM0;
                                i16 = iN0;
                                c14 = c15;
                            }
                            i27 += 3;
                            i24 = i28;
                            c15 = c14;
                            iN0 = i16;
                            iM0 = i15;
                            i18 = i14;
                        }
                    } else {
                        int i46 = (int) (jE >> 32);
                        int i47 = (int) (jE & 4294967295L);
                        int i48 = i46 + iN0;
                        int i49 = i47 + iM0;
                        int i54 = i17 & 33554431;
                        long[] jArr2 = cVar.f142825a;
                        int i55 = cVar.f142827c;
                        for (int i56 = 0; i56 < jArr2.length - 2 && i56 < i55; i56 += 3) {
                            int i57 = i56 + 2;
                            long j17 = jArr2[i57];
                            if ((((int) j17) & 33554431) == i54) {
                                long j18 = jArr2[i56];
                                jArr2[i56] = (((long) i46) << 32) | (((long) i47) & 4294967295L);
                                jArr2[i56 + 1] = (((long) i49) & 4294967295L) | (((long) i48) << 32);
                                jArr2[i57] = (((j17 >> 63) & 1) << 60) | j17;
                                int i58 = i46 - ((int) (j18 >> 32));
                                int i59 = i47 - ((int) j18);
                                if (!(i58 != 0) && !(i59 != 0)) {
                                    break;
                                }
                                cVar.d(i58, i59, (d.f142829b & j17) | (((long) ((i56 + 3) & 33554431)) << 25));
                                break;
                            }
                        }
                    }
                } else {
                    e0Var.f81766g = true;
                    boolean zD = a1Var.d(1024);
                    boolean zD2 = a1Var.d(16);
                    boolean zA = this.f142833c.f142850a.a(i17);
                    c cVar2 = this.f142832b;
                    if (e0VarK != null) {
                        int i64 = e0VarK.f81761b;
                        int i65 = (int) (jE >> 32);
                        int i66 = (int) (jE & 4294967295L);
                        int i67 = i17 & 33554431;
                        long[] jArr3 = cVar2.f142825a;
                        for (int i68 = cVar2.f142827c - 3; i68 >= 0; i68 -= 3) {
                            if ((((int) jArr3[i68 + 2]) & 33554431) == i64) {
                                long j19 = jArr3[i68];
                                int i69 = ((int) (j19 >> 32)) + i65;
                                int i74 = ((int) j19) + i66;
                                cVar2.a(i67, i69, i74, i69 + iN0, i74 + iM0, i64, zD, zD2, zA, i68);
                                break;
                            }
                        }
                    } else {
                        int i75 = (int) (jE >> 32);
                        int i76 = (int) (jE & 4294967295L);
                        cVar2.a(i17, i75, i76, i75 + iN0, i76 + iM0, (512 & 32) != 0 ? -1 : 0, zD, zD2, zA, -1);
                    }
                }
            }
            e0Var.f81765f = false;
            this.f142835e = true;
            h();
        }
    }

    public final void f(e0 e0Var) {
        if (e0Var.f81766g) {
            int i14 = e0Var.f81761b & 33554431;
            c cVar = this.f142832b;
            long[] jArr = cVar.f142825a;
            int i15 = cVar.f142827c;
            for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
                int i17 = i16 + 2;
                if ((((int) jArr[i17]) & 33554431) == i14) {
                    jArr[i16] = -1;
                    jArr[i16 + 1] = -1;
                    jArr[i17] = d.f142830c;
                    break;
                }
            }
            e0Var.f81766g = false;
            e0Var.f81765f = true;
            this.f142835e = true;
            this.f142837g = true;
        }
    }

    public final void h() {
        Object obj = this.f142838h;
        boolean z14 = obj != null;
        long j8 = this.f142833c.f142852c;
        if (j8 >= 0 || !z14) {
            if (this.f142839i == j8 && z14) {
                return;
            }
            b bVar = this.f142831a;
            if (obj != null) {
                bVar.g(obj);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j8, ((long) 16) + jCurrentTimeMillis);
            this.f142839i = jMax;
            this.f142838h = bVar.x(jMax - jCurrentTimeMillis, this.f142840j);
        }
    }

    public e() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(n nVar, b bVar, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            nVar = o.f134780a;
            nVar.getClass();
        }
        this(nVar, (i14 & 2) != 0 ? q5.a.f142824a : bVar);
    }
}
