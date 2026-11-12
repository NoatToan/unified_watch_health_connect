package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lh5/w;", "Lh5/c1;", "Lh5/e0;", "layoutNode", "<init>", "(Lh5/e0;)V", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends c1 {
    public static final o4.h W0;
    public final b2 U0;
    public b V0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/w$b;", "Lh5/m0;", "<init>", "(Lh5/w;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends m0 {
        public b(w wVar) {
            super(wVar);
        }

        @Override // h5.l0
        public final int I0(f5.a aVar) {
            n0 n0Var = this.f81889p.f81711p.T.f81854q;
            n0Var.getClass();
            k0 k0Var = n0Var.f81911t;
            if (!n0Var.f81903k) {
                j0 j0Var = n0Var.f81898f;
                if (j0Var.f81841d == e0.e.LookaheadMeasuring) {
                    k0Var.f81666f = true;
                    if (k0Var.f81662b) {
                        j0Var.f81843f = true;
                        j0Var.f81844g = true;
                    }
                } else {
                    k0Var.f81667g = true;
                }
            }
            b bVar = n0Var.K().V0;
            if (bVar != null) {
                bVar.f81865k = true;
            }
            n0Var.J();
            b bVar2 = n0Var.K().V0;
            if (bVar2 != null) {
                bVar2.f81865k = false;
            }
            Integer num = (Integer) k0Var.f81669i.get(aVar);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            this.f81894w.h(aVar, iIntValue);
            return iIntValue;
        }

        @Override // h5.m0, f5.w
        public final int O(int i14) {
            y yVarJ = this.f81889p.f81711p.J();
            f5.z0 z0VarA = yVarJ.a();
            e0 e0Var = yVarJ.f82020a;
            return z0VarA.c(e0Var.P.f81683d, e0Var.x(), i14);
        }

        @Override // f5.y0
        public final f5.v1 Q(long j8) {
            E0(j8);
            c1 c1Var = this.f81889p;
            q3.c<e0> cVarN = c1Var.f81711p.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i14 = cVarN.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                n0 n0Var = e0VarArr[i15].T.f81854q;
                n0Var.getClass();
                n0Var.f81902j = e0.g.NotUsed;
            }
            e0 e0Var = c1Var.f81711p;
            m0.g1(this, e0Var.f81783y.f(this, e0Var.x(), j8));
            return this;
        }

        @Override // h5.m0, f5.w
        public final int a0(int i14) {
            y yVarJ = this.f81889p.f81711p.J();
            f5.z0 z0VarA = yVarJ.a();
            e0 e0Var = yVarJ.f82020a;
            return z0VarA.h(e0Var.P.f81683d, e0Var.x(), i14);
        }

        @Override // h5.m0, f5.w
        public final int e0(int i14) {
            y yVarJ = this.f81889p.f81711p.J();
            f5.z0 z0VarA = yVarJ.a();
            e0 e0Var = yVarJ.f82020a;
            return z0VarA.g(e0Var.P.f81683d, e0Var.x(), i14);
        }

        @Override // h5.m0, f5.w
        public final int l0(int i14) {
            y yVarJ = this.f81889p.f81711p.J();
            f5.z0 z0VarA = yVarJ.a();
            e0 e0Var = yVarJ.f82020a;
            return z0VarA.i(e0Var.P.f81683d, e0Var.x(), i14);
        }

        @Override // h5.m0
        public final void n1() {
            n0 n0Var = this.f81889p.f81711p.T.f81854q;
            n0Var.getClass();
            n0Var.P0();
        }
    }

    static {
        new a(null);
        o4.h hVar = new o4.h();
        o4.d0.f128823b.getClass();
        hVar.e(o4.d0.f128827f);
        hVar.q(1.0f);
        o4.e1.f128845b.getClass();
        hVar.r(o4.e1.f128846c);
        W0 = hVar;
    }

    public w(e0 e0Var) {
        super(e0Var);
        b2 b2Var = new b2();
        this.U0 = b2Var;
        b2Var.updateCoordinator$ui(this);
        this.V0 = e0Var.f81767h != null ? new b(this) : null;
    }

    @Override // h5.c1
    public final m0 D1() {
        return this.V0;
    }

    @Override // h5.c1
    public final h4.r.c F1() {
        return this.U0;
    }

    @Override // h5.l0
    public final int I0(f5.a aVar) {
        b bVar = this.V0;
        if (bVar != null) {
            return bVar.I0(aVar);
        }
        r0 r0Var = this.f81711p.T.f81853p;
        g0 g0Var = r0Var.A;
        if (!r0Var.f81963m) {
            if (r0Var.f81955f.f81841d == e0.e.Measuring) {
                g0Var.f81666f = true;
                if (g0Var.f81662b) {
                    r0Var.f81973y = true;
                    r0Var.f81974z = true;
                }
            } else {
                g0Var.f81667g = true;
            }
        }
        w wVarK = r0Var.K();
        boolean z14 = wVarK.f81865k;
        wVarK.f81865k = true;
        r0Var.J();
        wVarK.f81865k = z14;
        Integer num = (Integer) g0Var.f81669i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // f5.w
    public final int O(int i14) {
        y yVarJ = this.f81711p.J();
        f5.z0 z0VarA = yVarJ.a();
        e0 e0Var = yVarJ.f82020a;
        return z0VarA.c(e0Var.P.f81683d, e0Var.C(), i14);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2 A[EDGE_INSN: B:41:0x00a2->B:39:0x00a2 BREAK  A[LOOP:0: B:16:0x004e->B:38:0x009c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // h5.c1
    public final void P1(c1.f fVar, long j8, v vVar, int i14, boolean z14) {
        int i15;
        boolean z15;
        boolean z16;
        e0[] e0VarArr;
        int i16;
        e0 e0Var;
        long jA;
        boolean z17;
        long j14 = j8;
        e0 e0Var2 = this.f81711p;
        if (fVar.c(e0Var2)) {
            if (m2(j14)) {
                i15 = i14;
                z15 = z14;
                z16 = true;
            } else {
                b5.m0.f15849b.getClass();
                i15 = i14;
                if (i15 == b5.m0.f15850c && (Float.floatToRawIntBits(o1(j14, E1())) & Integer.MAX_VALUE) < 2139095040) {
                    z16 = true;
                    z15 = false;
                }
            }
            if (z16) {
                int i17 = vVar.f82002c;
                q3.c<e0> cVarM = e0Var2.M();
                e0VarArr = cVarM.f142356a;
                i16 = cVarM.f142358c - 1;
                while (i16 >= 0) {
                    e0Var = e0VarArr[i16];
                    if (e0Var.g()) {
                        fVar.f(e0Var, j14, vVar, i15, z15);
                        jA = vVar.a();
                        if (q.b(jA) < 0.0f || !q.d(jA) || q.c(jA)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (!h4.i.f81566h) {
                            if (z17 && !fVar.d(vVar, e0Var)) {
                                break;
                            }
                        } else if (z17) {
                            if (e0Var.P.f81683d.e2()) {
                                break;
                            } else {
                                vVar.f82002c = vVar.f82000a.f134668b - 1;
                            }
                        } else {
                            continue;
                        }
                    }
                    i16--;
                    j14 = j8;
                    i15 = i14;
                }
                vVar.f82002c = i17;
            }
        }
        i15 = i14;
        z15 = z14;
        z16 = false;
        if (z16) {
            int i18 = vVar.f82002c;
            q3.c<e0> cVarM2 = e0Var2.M();
            e0VarArr = cVarM2.f142356a;
            i16 = cVarM2.f142358c - 1;
            while (i16 >= 0) {
                e0Var = e0VarArr[i16];
                if (e0Var.g()) {
                    fVar.f(e0Var, j14, vVar, i15, z15);
                    jA = vVar.a();
                    if (q.b(jA) < 0.0f) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (!h4.i.f81566h) {
                        if (z17) {
                            if (e0Var.P.f81683d.e2()) {
                                break;
                                break;
                            }
                            vVar.f82002c = vVar.f82000a.f134668b - 1;
                        } else {
                            continue;
                        }
                    } else if (z17) {
                        continue;
                    }
                }
                i16--;
                j14 = j8;
                i15 = i14;
            }
            vVar.f82002c = i18;
        }
    }

    @Override // f5.y0
    public final f5.v1 Q(long j8) {
        if (this.f81713r) {
            b bVar = this.V0;
            bVar.getClass();
            j8 = bVar.f69147d;
        }
        E0(j8);
        e0 e0Var = this.f81711p;
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0VarArr[i15].T.f81853p.f81962l = e0.g.NotUsed;
        }
        d2(e0Var.f81783y.f(this, e0Var.C(), j8));
        U1();
        return this;
    }

    @Override // h5.c1
    public final void Z1(o4.y yVar, r4.c cVar) {
        e0 e0Var = this.f81711p;
        o1 o1VarA = i0.a(e0Var);
        q3.c<e0> cVarM = e0Var.M();
        e0[] e0VarArr = cVarM.f142356a;
        int i14 = cVarM.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var2 = e0VarArr[i15];
            if (e0Var2.g()) {
                e0Var2.v(yVar, cVar);
            }
        }
        if (o1VarA.getShowLayoutBounds()) {
            long j8 = this.f69146c;
            yVar.k(0.5f, 0.5f, ((int) (j8 >> 32)) - 0.5f, ((int) (j8 & 4294967295L)) - 0.5f, W0);
        }
    }

    @Override // f5.w
    public final int a0(int i14) {
        y yVarJ = this.f81711p.J();
        f5.z0 z0VarA = yVarJ.a();
        e0 e0Var = yVarJ.f82020a;
        return z0VarA.h(e0Var.P.f81683d, e0Var.C(), i14);
    }

    @Override // f5.w
    public final int e0(int i14) {
        y yVarJ = this.f81711p.J();
        f5.z0 z0VarA = yVarJ.a();
        e0 e0Var = yVarJ.f82020a;
        return z0VarA.g(e0Var.P.f81683d, e0Var.C(), i14);
    }

    @Override // f5.w
    public final int l0(int i14) {
        y yVarJ = this.f81711p.J();
        f5.z0 z0VarA = yVarJ.a();
        e0 e0Var = yVarJ.f82020a;
        return z0VarA.i(e0Var.P.f81683d, e0Var.C(), i14);
    }

    @Override // h5.c1, f5.v1
    public final void u0(float f14, long j8, e23.l lVar) {
        super.u0(f14, j8, lVar);
        if (this.f81864j) {
            return;
        }
        this.f81711p.T.f81853p.O0();
    }

    @Override // h5.c1
    public final void v1() {
        if (this.V0 == null) {
            this.V0 = new b(this);
        }
    }

    @Override // h5.c1, f5.v1
    public final void z0(long j8, float f14, r4.c cVar) {
        super.z0(j8, f14, cVar);
        if (this.f81864j) {
            return;
        }
        this.f81711p.T.f81853p.O0();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/w$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
