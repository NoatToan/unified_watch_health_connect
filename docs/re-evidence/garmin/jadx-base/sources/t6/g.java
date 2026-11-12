package t6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class g extends l {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public e[] f162665g1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public int O0 = -1;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public float U0 = 0.5f;
    public int V0 = 0;
    public int W0 = 0;
    public int X0 = 2;
    public int Y0 = 2;
    public int Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f162659a1 = -1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f162660b1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final ArrayList<a> f162661c1 = new ArrayList<>();

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public e[] f162662d1 = null;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public e[] f162663e1 = null;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int[] f162664f1 = null;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f162666h1 = 0;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f162667a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f162670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f162671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f162672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d f162673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f162674h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f162675i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f162676j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f162677k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f162683q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f162668b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162669c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f162678l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f162679m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f162680n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f162681o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f162682p = 0;

        public a(int i14, d dVar, d dVar2, d dVar3, d dVar4, int i15) {
            this.f162674h = 0;
            this.f162675i = 0;
            this.f162676j = 0;
            this.f162677k = 0;
            this.f162683q = 0;
            this.f162667a = i14;
            this.f162670d = dVar;
            this.f162671e = dVar2;
            this.f162672f = dVar3;
            this.f162673g = dVar4;
            this.f162674h = g.this.C0;
            this.f162675i = g.this.f162693y0;
            this.f162676j = g.this.D0;
            this.f162677k = g.this.f162694z0;
            this.f162683q = i15;
        }

        public final void a(e eVar) {
            int i14 = this.f162667a;
            g gVar = g.this;
            if (i14 == 0) {
                int iD0 = gVar.d0(eVar, this.f162683q);
                if (eVar.W[0] == e.b.MATCH_CONSTRAINT) {
                    this.f162682p++;
                    iD0 = 0;
                }
                this.f162678l = iD0 + (eVar.f162623k0 != 8 ? gVar.V0 : 0) + this.f162678l;
                int iC0 = gVar.c0(eVar, this.f162683q);
                if (this.f162668b == null || this.f162669c < iC0) {
                    this.f162668b = eVar;
                    this.f162669c = iC0;
                    this.f162679m = iC0;
                }
            } else {
                int iD1 = gVar.d0(eVar, this.f162683q);
                int iC1 = gVar.c0(eVar, this.f162683q);
                if (eVar.W[1] == e.b.MATCH_CONSTRAINT) {
                    this.f162682p++;
                    iC1 = 0;
                }
                this.f162679m = iC1 + (eVar.f162623k0 != 8 ? gVar.W0 : 0) + this.f162679m;
                if (this.f162668b == null || this.f162669c < iD1) {
                    this.f162668b = eVar;
                    this.f162669c = iD1;
                    this.f162678l = iD1;
                }
            }
            this.f162681o++;
        }

        /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
          0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
          0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
        public final void b(int i14, boolean z14, boolean z15) {
            g gVar;
            int i15;
            int i16;
            e eVar;
            boolean z16;
            char c14;
            int i17;
            float f14;
            int i18;
            int i19 = this.f162681o;
            int i24 = 0;
            while (true) {
                gVar = g.this;
                if (i24 >= i19 || (i18 = this.f162680n + i24) >= gVar.f162666h1) {
                    break;
                }
                e eVar2 = gVar.f162665g1[i18];
                if (eVar2 != null) {
                    eVar2.F();
                }
                i24++;
            }
            if (i19 == 0 || this.f162668b == null) {
                return;
            }
            boolean z17 = z15 && i14 == 0;
            int i25 = -1;
            int i26 = -1;
            for (int i27 = 0; i27 < i19; i27++) {
                int i28 = this.f162680n + (z14 ? (i19 - 1) - i27 : i27);
                if (i28 >= gVar.f162666h1) {
                    break;
                }
                e eVar3 = gVar.f162665g1[i28];
                if (eVar3 != null && eVar3.f162623k0 == 0) {
                    if (i25 == -1) {
                        i25 = i27;
                    }
                    i26 = i27;
                }
            }
            int i29 = this.f162667a;
            e eVar4 = this.f162668b;
            if (i29 == 0) {
                eVar4.f162631o0 = gVar.K0;
                d dVar = eVar4.O;
                d dVar2 = eVar4.M;
                int i30 = this.f162675i;
                if (i14 > 0) {
                    i30 += gVar.W0;
                }
                dVar2.a(this.f162671e, i30);
                if (z15) {
                    dVar.a(this.f162673g, this.f162677k);
                }
                if (i14 > 0) {
                    this.f162671e.f162586d.O.a(dVar2, 0);
                }
                if (gVar.Y0 != 3 || eVar4.G) {
                    eVar = eVar4;
                    break;
                }
                int i34 = 0;
                while (true) {
                    if (i34 < i19) {
                        int i35 = this.f162680n + (z14 ? (i19 - 1) - i34 : i34);
                        if (i35 < gVar.f162666h1) {
                            eVar = gVar.f162665g1[i35];
                            if (eVar.G) {
                                break;
                            } else {
                                i34++;
                            }
                        }
                    }
                    eVar = eVar4;
                    break;
                }
                int i36 = 0;
                e eVar5 = null;
                while (i36 < i19) {
                    int i37 = z14 ? (i19 - 1) - i36 : i36;
                    int i38 = this.f162680n + i37;
                    if (i38 >= gVar.f162666h1) {
                        return;
                    }
                    e eVar6 = gVar.f162665g1[i38];
                    if (eVar6 == null) {
                        i19 = i19;
                        z16 = z17;
                        i26 = i26;
                        c14 = 3;
                    } else {
                        d dVar3 = eVar6.M;
                        d dVar4 = eVar6.O;
                        d dVar5 = eVar6.L;
                        z16 = z17;
                        if (i36 == 0) {
                            eVar6.g(dVar5, this.f162670d, this.f162674h);
                        }
                        if (i37 == 0) {
                            int i39 = gVar.J0;
                            float f15 = gVar.P0;
                            if (z14) {
                                f15 = 1.0f - f15;
                            }
                            if (this.f162680n == 0 && (i17 = gVar.L0) != -1) {
                                f14 = gVar.R0;
                                if (z14) {
                                    f14 = 1.0f - f14;
                                }
                            } else if (!z15 || (i17 = gVar.N0) == -1) {
                                i17 = i39;
                                f14 = f15;
                            } else {
                                f14 = gVar.T0;
                                if (z14) {
                                    f14 = 1.0f - f14;
                                }
                            }
                            eVar6.f162629n0 = i17;
                            eVar6.f162617h0 = f14;
                        }
                        if (i36 == i19 - 1) {
                            eVar6.g(eVar6.N, this.f162672f, this.f162676j);
                        }
                        if (eVar5 != null) {
                            d dVar6 = eVar5.N;
                            dVar5.a(dVar6, gVar.V0);
                            if (i36 == i25) {
                                int i44 = this.f162674h;
                                if (dVar5.h()) {
                                    dVar5.f162590h = i44;
                                }
                            }
                            dVar6.a(dVar5, 0);
                            if (i36 == i26 + 1) {
                                int i45 = this.f162676j;
                                if (dVar6.h()) {
                                    dVar6.f162590h = i45;
                                }
                            }
                        }
                        if (eVar6 != eVar4) {
                            int i46 = gVar.Y0;
                            c14 = 3;
                            if (i46 == 3 && eVar.G && eVar6 != eVar && eVar6.G) {
                                eVar6.P.a(eVar.P, 0);
                            } else if (i46 == 0) {
                                dVar3.a(dVar2, 0);
                            } else if (i46 == 1) {
                                dVar4.a(dVar, 0);
                            } else if (z16) {
                                dVar3.a(this.f162671e, this.f162675i);
                                dVar4.a(this.f162673g, this.f162677k);
                            } else {
                                dVar3.a(dVar2, 0);
                                dVar4.a(dVar, 0);
                            }
                        } else {
                            c14 = 3;
                        }
                        eVar5 = eVar6;
                    }
                    i36++;
                    z17 = z16;
                    i26 = i26;
                    i19 = i19;
                }
                return;
            }
            int i47 = i19;
            boolean z18 = z17;
            int i48 = i26;
            eVar4.f162629n0 = gVar.J0;
            d dVar7 = eVar4.L;
            d dVar8 = eVar4.N;
            int i49 = this.f162674h;
            if (i14 > 0) {
                i49 += gVar.V0;
            }
            if (z14) {
                dVar8.a(this.f162672f, i49);
                if (z15) {
                    dVar7.a(this.f162670d, this.f162676j);
                }
                if (i14 > 0) {
                    this.f162672f.f162586d.L.a(dVar8, 0);
                }
            } else {
                dVar7.a(this.f162670d, i49);
                if (z15) {
                    dVar8.a(this.f162672f, this.f162676j);
                }
                if (i14 > 0) {
                    this.f162670d.f162586d.N.a(dVar7, 0);
                }
            }
            int i54 = 0;
            e eVar7 = null;
            while (true) {
                int i55 = i47;
                if (i54 >= i55 || (i15 = this.f162680n + i54) >= gVar.f162666h1) {
                    return;
                }
                e eVar8 = gVar.f162665g1[i15];
                if (eVar8 == null) {
                    i47 = i55;
                } else {
                    d dVar9 = eVar8.L;
                    d dVar10 = eVar8.M;
                    d dVar11 = eVar8.N;
                    if (i54 == 0) {
                        eVar8.g(dVar10, this.f162671e, this.f162675i);
                        int i56 = gVar.K0;
                        float f16 = gVar.Q0;
                        if (this.f162680n == 0) {
                            int i57 = gVar.M0;
                            i47 = i55;
                            i16 = -1;
                            if (i57 != -1) {
                                f16 = gVar.S0;
                            }
                            i56 = i57;
                            eVar8.f162631o0 = i56;
                            eVar8.f162619i0 = f16;
                        } else {
                            i47 = i55;
                            i16 = -1;
                        }
                        if (z15 && (i57 = gVar.O0) != i16) {
                            f16 = gVar.U0;
                            i56 = i57;
                        }
                        eVar8.f162631o0 = i56;
                        eVar8.f162619i0 = f16;
                    } else {
                        i47 = i55;
                    }
                    if (i54 == i47 - 1) {
                        eVar8.g(eVar8.O, this.f162673g, this.f162677k);
                    }
                    if (eVar7 != null) {
                        d dVar12 = eVar7.O;
                        dVar10.a(dVar12, gVar.W0);
                        if (i54 == i25) {
                            int i58 = this.f162675i;
                            if (dVar10.h()) {
                                dVar10.f162590h = i58;
                            }
                        }
                        dVar12.a(dVar10, 0);
                        if (i54 == i48 + 1) {
                            int i59 = this.f162677k;
                            if (dVar12.h()) {
                                dVar12.f162590h = i59;
                            }
                        }
                    }
                    if (eVar8 != eVar4) {
                        int i64 = gVar.X0;
                        if (z14) {
                            if (i64 == 0) {
                                dVar11.a(dVar8, 0);
                            } else if (i64 == 1) {
                                dVar9.a(dVar7, 0);
                            } else if (i64 == 2) {
                                dVar9.a(dVar7, 0);
                                dVar11.a(dVar8, 0);
                            }
                        } else if (i64 == 0) {
                            dVar9.a(dVar7, 0);
                        } else if (i64 == 1) {
                            dVar11.a(dVar8, 0);
                        } else if (i64 == 2) {
                            if (z18) {
                                dVar9.a(this.f162670d, this.f162674h);
                                dVar11.a(this.f162672f, this.f162676j);
                            } else {
                                dVar9.a(dVar7, 0);
                                dVar11.a(dVar8, 0);
                            }
                        }
                    }
                    eVar7 = eVar8;
                }
                i54++;
            }
        }

        public final int c() {
            int i14 = this.f162667a;
            int i15 = this.f162679m;
            return i14 == 1 ? i15 - g.this.W0 : i15;
        }

        public final int d() {
            int i14 = this.f162667a;
            int i15 = this.f162678l;
            return i14 == 0 ? i15 - g.this.V0 : i15;
        }

        public final void e(int i14) {
            int i15 = this.f162682p;
            if (i15 == 0) {
                return;
            }
            int i16 = this.f162681o;
            int i17 = i14 / i15;
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = this.f162680n;
                int i24 = i19 + i18;
                g gVar = g.this;
                if (i24 >= gVar.f162666h1) {
                    break;
                }
                e eVar = gVar.f162665g1[i19 + i18];
                if (this.f162667a == 0) {
                    if (eVar != null) {
                        e.b[] bVarArr = eVar.W;
                        if (bVarArr[0] == e.b.MATCH_CONSTRAINT && eVar.f162640t == 0) {
                            gVar.b0(eVar, e.b.FIXED, i17, bVarArr[1], eVar.m());
                        }
                    }
                } else if (eVar != null) {
                    e.b[] bVarArr2 = eVar.W;
                    if (bVarArr2[1] == e.b.MATCH_CONSTRAINT && eVar.f162642u == 0) {
                        int i25 = i17;
                        gVar.b0(eVar, bVarArr2[0], eVar.s(), e.b.FIXED, i25);
                        i17 = i25;
                    }
                }
            }
            this.f162678l = 0;
            this.f162679m = 0;
            this.f162668b = null;
            this.f162669c = 0;
            int i26 = this.f162681o;
            for (int i27 = 0; i27 < i26; i27++) {
                int i28 = this.f162680n + i27;
                g gVar2 = g.this;
                if (i28 >= gVar2.f162666h1) {
                    return;
                }
                e eVar2 = gVar2.f162665g1[i28];
                if (this.f162667a == 0) {
                    int iS = eVar2.s();
                    int i29 = gVar2.V0;
                    if (eVar2.f162623k0 == 8) {
                        i29 = 0;
                    }
                    this.f162678l = iS + i29 + this.f162678l;
                    int iC0 = gVar2.c0(eVar2, this.f162683q);
                    if (this.f162668b == null || this.f162669c < iC0) {
                        this.f162668b = eVar2;
                        this.f162669c = iC0;
                        this.f162679m = iC0;
                    }
                } else {
                    int iD0 = gVar2.d0(eVar2, this.f162683q);
                    int iC1 = gVar2.c0(eVar2, this.f162683q);
                    int i30 = gVar2.W0;
                    if (eVar2.f162623k0 == 8) {
                        i30 = 0;
                    }
                    this.f162679m = iC1 + i30 + this.f162679m;
                    if (this.f162668b == null || this.f162669c < iD0) {
                        this.f162668b = eVar2;
                        this.f162669c = iD0;
                        this.f162678l = iD0;
                    }
                }
            }
        }

        public final void f(int i14, d dVar, d dVar2, d dVar3, d dVar4, int i15, int i16, int i17, int i18, int i19) {
            this.f162667a = i14;
            this.f162670d = dVar;
            this.f162671e = dVar2;
            this.f162672f = dVar3;
            this.f162673g = dVar4;
            this.f162674h = i15;
            this.f162675i = i16;
            this.f162676j = i17;
            this.f162677k = i18;
            this.f162683q = i19;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0102  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // t6.l
    public final void a0(int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        int i24;
        int[] iArr;
        int i25;
        int i26;
        a aVar;
        char c14;
        int i27;
        int i28;
        int i29;
        int iCeil;
        Object obj;
        e eVar;
        int i30;
        int i34;
        int i35;
        int i36;
        if (this.f162691x0 > 0) {
            e eVar2 = this.X;
            u6.b.InterfaceC3163b interfaceC3163b = eVar2 != null ? ((f) eVar2).A0 : null;
            if (interfaceC3163b == null) {
                this.F0 = 0;
                this.G0 = 0;
                this.E0 = false;
                return;
            }
            for (int i37 = 0; i37 < this.f162691x0; i37++) {
                e eVar3 = this.f162690w0[i37];
                if (eVar3 != null && !(eVar3 instanceof h)) {
                    e.b bVarL = eVar3.l(0);
                    e.b bVarL2 = eVar3.l(1);
                    e.b bVar = e.b.MATCH_CONSTRAINT;
                    if (bVarL != bVar || eVar3.f162640t == 1 || bVarL2 != bVar || eVar3.f162642u == 1) {
                        if (bVarL == bVar) {
                            bVarL = e.b.WRAP_CONTENT;
                        }
                        if (bVarL2 == bVar) {
                            bVarL2 = e.b.WRAP_CONTENT;
                        }
                        u6.b.a aVar2 = this.H0;
                        aVar2.f168783a = bVarL;
                        aVar2.f168784b = bVarL2;
                        aVar2.f168785c = eVar3.s();
                        aVar2.f168786d = eVar3.m();
                        interfaceC3163b.a(eVar3, aVar2);
                        eVar3.T(aVar2.f168787e);
                        eVar3.O(aVar2.f168788f);
                        eVar3.K(aVar2.f168789g);
                    }
                }
            }
        }
        int i38 = this.C0;
        int i39 = this.D0;
        int i44 = this.f162693y0;
        int i45 = this.f162694z0;
        int[] iArr2 = new int[2];
        int i46 = (i15 - i38) - i39;
        int i47 = this.f162660b1;
        if (i47 == 1) {
            i46 = (i17 - i44) - i45;
        }
        int i48 = i46;
        int i49 = this.J0;
        if (i47 == 0) {
            if (i49 == -1) {
                this.J0 = 0;
            }
            if (this.K0 == -1) {
                this.K0 = 0;
            }
        } else {
            if (i49 == -1) {
                this.J0 = 0;
            }
            if (this.K0 == -1) {
                this.K0 = 0;
            }
        }
        e[] eVarArr = this.f162690w0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        while (true) {
            i18 = this.f162691x0;
            if (i54 >= i18) {
                break;
            }
            if (this.f162690w0[i54].f162623k0 == 8) {
                i55++;
            }
            i54++;
        }
        if (i55 > 0) {
            eVarArr = new e[i18 - i55];
            int i57 = 0;
            for (int i58 = 0; i58 < this.f162691x0; i58++) {
                e eVar4 = this.f162690w0[i58];
                if (eVar4.f162623k0 != 8) {
                    eVarArr[i57] = eVar4;
                    i57++;
                }
            }
            i18 = i57;
        }
        e[] eVarArr2 = eVarArr;
        this.f162665g1 = eVarArr2;
        this.f162666h1 = i18;
        int i59 = this.Z0;
        ArrayList<a> arrayList = this.f162661c1;
        if (i59 != 0) {
            d dVar = this.M;
            d dVar2 = this.L;
            i25 = i38;
            d dVar3 = this.N;
            d dVar4 = this.O;
            if (i59 == 1) {
                i24 = i45;
                iArr = iArr2;
                i26 = i39;
                i19 = i44;
                int i64 = this.f162660b1;
                if (i18 != 0) {
                    arrayList.clear();
                    a aVar3 = new a(i64, this.L, this.M, this.N, this.O, i48);
                    arrayList.add(aVar3);
                    if (i64 == 0) {
                        i27 = 0;
                        int i65 = 0;
                        int i66 = 0;
                        while (i66 < i18) {
                            e eVar5 = eVarArr2[i66];
                            int iD0 = d0(eVar5, i48);
                            if (eVar5.W[0] == e.b.MATCH_CONSTRAINT) {
                                i27++;
                            }
                            int i67 = i27;
                            boolean z14 = (i65 == i48 || (this.V0 + i65) + iD0 > i48) && aVar3.f162668b != null;
                            if (!z14 && i66 > 0 && (i29 = this.f162659a1) > 0 && i66 % i29 == 0) {
                                z14 = true;
                            }
                            if (z14) {
                                aVar3 = new a(i64, this.L, this.M, this.N, this.O, i48);
                                aVar3.f162680n = i66;
                                arrayList.add(aVar3);
                            } else {
                                if (i66 > 0) {
                                    i65 = this.V0 + iD0 + i65;
                                }
                                aVar3.a(eVar5);
                                i66++;
                                i27 = i67;
                            }
                            i65 = iD0;
                            aVar3.a(eVar5);
                            i66++;
                            i27 = i67;
                        }
                    } else {
                        i27 = 0;
                        int i68 = 0;
                        int i69 = 0;
                        while (i69 < i18) {
                            e eVar6 = eVarArr2[i69];
                            int iC0 = c0(eVar6, i48);
                            if (eVar6.W[1] == e.b.MATCH_CONSTRAINT) {
                                i27++;
                            }
                            int i74 = i27;
                            boolean z15 = (i68 == i48 || (this.W0 + i68) + iC0 > i48) && aVar3.f162668b != null;
                            if (!z15 && i69 > 0 && (i28 = this.f162659a1) > 0 && i69 % i28 == 0) {
                                z15 = true;
                            }
                            if (z15) {
                                aVar3 = new a(i64, this.L, this.M, this.N, this.O, i48);
                                aVar3.f162680n = i69;
                                arrayList.add(aVar3);
                            } else {
                                if (i69 > 0) {
                                    i68 = this.W0 + iC0 + i68;
                                }
                                aVar3.a(eVar6);
                                i69++;
                                i27 = i74;
                            }
                            i68 = iC0;
                            aVar3.a(eVar6);
                            i69++;
                            i27 = i74;
                        }
                    }
                    int size = arrayList.size();
                    int i75 = this.C0;
                    int i76 = this.f162693y0;
                    int i77 = this.D0;
                    int i78 = this.f162694z0;
                    e.b[] bVarArr = this.W;
                    e.b bVar2 = bVarArr[0];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    boolean z16 = bVar2 == bVar3 || bVarArr[1] == bVar3;
                    if (i27 > 0 && z16) {
                        for (int i79 = 0; i79 < size; i79++) {
                            a aVar4 = arrayList.get(i79);
                            if (i64 == 0) {
                                aVar4.e(i48 - aVar4.d());
                            } else {
                                aVar4.e(i48 - aVar4.c());
                            }
                        }
                    }
                    int i84 = i75;
                    int i85 = i76;
                    int i86 = i77;
                    int i87 = i78;
                    d dVar5 = dVar2;
                    d dVar6 = dVar;
                    int iMax = 0;
                    int i88 = 0;
                    d dVar7 = dVar3;
                    d dVar8 = dVar4;
                    for (int i89 = 0; i89 < size; i89++) {
                        a aVar5 = arrayList.get(i89);
                        if (i64 == 0) {
                            if (i89 < size - 1) {
                                dVar8 = arrayList.get(i89 + 1).f162668b.M;
                                i87 = 0;
                            } else {
                                i87 = this.f162694z0;
                                dVar8 = dVar4;
                            }
                            d dVar9 = aVar5.f162668b.O;
                            aVar5.f(i64, dVar5, dVar6, dVar7, dVar8, i84, i85, i86, i87, i48);
                            iMax = Math.max(iMax, aVar5.d());
                            int iC = aVar5.c() + i88;
                            if (i89 > 0) {
                                iC += this.W0;
                            }
                            i88 = iC;
                            dVar6 = dVar9;
                            i85 = 0;
                        } else {
                            if (i89 < size - 1) {
                                dVar7 = arrayList.get(i89 + 1).f162668b.L;
                                i86 = 0;
                            } else {
                                i86 = this.D0;
                                dVar7 = dVar3;
                            }
                            d dVar10 = aVar5.f162668b.N;
                            aVar5.f(i64, dVar5, dVar6, dVar7, dVar8, i84, i85, i86, i87, i48);
                            int iD = aVar5.d() + iMax;
                            int iMax2 = Math.max(i88, aVar5.c());
                            if (i89 > 0) {
                                iD += this.V0;
                            }
                            i88 = iMax2;
                            iMax = iD;
                            dVar5 = dVar10;
                            i84 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i88;
                }
            } else if (i59 == 2) {
                i24 = i45;
                iArr = iArr2;
                i26 = i39;
                i19 = i44;
                int i93 = this.f162660b1;
                int iCeil2 = this.f162659a1;
                if (i93 == 0) {
                    if (iCeil2 <= 0) {
                        int i94 = 0;
                        iCeil = 0;
                        for (int i95 = 0; i95 < i18; i95++) {
                            if (i95 > 0) {
                                i94 += this.V0;
                            }
                            e eVar7 = eVarArr2[i95];
                            if (eVar7 != null) {
                                int iD1 = d0(eVar7, i48) + i94;
                                if (iD1 > i48) {
                                    break;
                                }
                                iCeil++;
                                i94 = iD1;
                            }
                        }
                    } else {
                        iCeil = iCeil2;
                    }
                    iCeil2 = 0;
                } else {
                    if (iCeil2 <= 0) {
                        int i96 = 0;
                        int i97 = 0;
                        for (int i98 = 0; i98 < i18; i98++) {
                            if (i98 > 0) {
                                i96 += this.W0;
                            }
                            e eVar8 = eVarArr2[i98];
                            if (eVar8 != null) {
                                int iC1 = c0(eVar8, i48) + i96;
                                if (iC1 > i48) {
                                    break;
                                }
                                i97++;
                                i96 = iC1;
                            }
                        }
                        iCeil2 = i97;
                    }
                    iCeil = 0;
                }
                if (this.f162664f1 == null) {
                    this.f162664f1 = new int[2];
                }
                boolean z17 = (iCeil2 == 0 && i93 == 1) || (iCeil == 0 && i93 == 0);
                while (!z17) {
                    if (i93 == 0) {
                        iCeil2 = (int) Math.ceil(i18 / iCeil);
                    } else {
                        iCeil = (int) Math.ceil(i18 / iCeil2);
                    }
                    e[] eVarArr3 = this.f162663e1;
                    if (eVarArr3 == null || eVarArr3.length < iCeil) {
                        obj = null;
                        this.f162663e1 = new e[iCeil];
                    } else {
                        obj = null;
                        Arrays.fill(eVarArr3, (Object) null);
                    }
                    e[] eVarArr4 = this.f162662d1;
                    if (eVarArr4 == null || eVarArr4.length < iCeil2) {
                        this.f162662d1 = new e[iCeil2];
                    } else {
                        Arrays.fill(eVarArr4, obj);
                    }
                    for (int i99 = 0; i99 < iCeil; i99++) {
                        for (int i100 = 0; i100 < iCeil2; i100++) {
                            int i101 = (i100 * iCeil) + i99;
                            if (i93 == 1) {
                                i101 = (i99 * iCeil2) + i100;
                            }
                            if (i101 < eVarArr2.length && (eVar = eVarArr2[i101]) != null) {
                                int iD2 = d0(eVar, i48);
                                e eVar9 = this.f162663e1[i99];
                                if (eVar9 == null || eVar9.s() < iD2) {
                                    this.f162663e1[i99] = eVar;
                                }
                                int iC2 = c0(eVar, i48);
                                e eVar10 = this.f162662d1[i100];
                                if (eVar10 == null || eVar10.m() < iC2) {
                                    this.f162662d1[i100] = eVar;
                                }
                            }
                        }
                    }
                    int iD3 = 0;
                    for (int i102 = 0; i102 < iCeil; i102++) {
                        e eVar11 = this.f162663e1[i102];
                        if (eVar11 != null) {
                            if (i102 > 0) {
                                iD3 += this.V0;
                            }
                            iD3 = d0(eVar11, i48) + iD3;
                        }
                    }
                    int iC3 = 0;
                    for (int i103 = 0; i103 < iCeil2; i103++) {
                        e eVar12 = this.f162662d1[i103];
                        if (eVar12 != null) {
                            if (i103 > 0) {
                                iC3 += this.W0;
                            }
                            iC3 = c0(eVar12, i48) + iC3;
                        }
                    }
                    iArr[0] = iD3;
                    iArr[1] = iC3;
                    if (i93 == 0) {
                        if (iD3 <= i48 || iCeil <= 1) {
                            z17 = true;
                        } else {
                            iCeil--;
                        }
                    } else if (iC3 <= i48 || iCeil2 <= 1) {
                        z17 = true;
                    } else {
                        iCeil2--;
                    }
                }
                int[] iArr3 = this.f162664f1;
                iArr3[0] = iCeil;
                iArr3[1] = iCeil2;
                c14 = 1;
            } else if (i59 != 3) {
                i24 = i45;
                iArr = iArr2;
                i26 = i39;
                i19 = i44;
            } else {
                int i104 = this.f162660b1;
                if (i18 == 0) {
                    i24 = i45;
                    iArr = iArr2;
                    i26 = i39;
                    i19 = i44;
                } else {
                    arrayList.clear();
                    iArr = iArr2;
                    i19 = i44;
                    i24 = i45;
                    a aVar6 = new a(i104, this.L, this.M, this.N, this.O, i48);
                    arrayList.add(aVar6);
                    if (i104 == 0) {
                        int i105 = 0;
                        int i106 = 0;
                        i30 = 0;
                        int i107 = 0;
                        while (i105 < i18) {
                            i106++;
                            int i108 = i39;
                            e eVar13 = eVarArr2[i105];
                            int iD4 = d0(eVar13, i48);
                            int i109 = i104;
                            int i110 = i105;
                            if (eVar13.W[0] == e.b.MATCH_CONSTRAINT) {
                                i30++;
                            }
                            int i111 = i30;
                            boolean z18 = (i107 == i48 || (this.V0 + i107) + iD4 > i48) && aVar6.f162668b != null;
                            if (!z18 && i110 > 0 && (i36 = this.f162659a1) > 0 && i106 > i36) {
                                z18 = true;
                            }
                            if (z18) {
                                i104 = i109;
                                i35 = i110;
                                aVar6 = new a(i104, this.L, this.M, this.N, this.O, i48);
                                aVar6.f162680n = i35;
                                arrayList.add(aVar6);
                                i107 = iD4;
                                i106 = 1;
                            } else {
                                i104 = i109;
                                i35 = i110;
                                i107 = i35 > 0 ? this.V0 + iD4 + i107 : iD4;
                            }
                            aVar6.a(eVar13);
                            i105 = i35 + 1;
                            i30 = i111;
                            i39 = i108;
                        }
                        i26 = i39;
                    } else {
                        i26 = i39;
                        int i112 = 0;
                        int i113 = 0;
                        int i114 = 0;
                        int i115 = 0;
                        while (i115 < i18) {
                            i112++;
                            e eVar14 = eVarArr2[i115];
                            int iC4 = c0(eVar14, i48);
                            int i116 = i104;
                            if (eVar14.W[1] == e.b.MATCH_CONSTRAINT) {
                                i113++;
                            }
                            int i117 = i113;
                            boolean z19 = (i114 == i48 || (this.W0 + i114) + iC4 > i48) && aVar6.f162668b != null;
                            if (!z19 && i115 > 0 && (i34 = this.f162659a1) > 0 && i112 > i34) {
                                z19 = true;
                            }
                            if (z19) {
                                i104 = i116;
                                aVar6 = new a(i104, this.L, this.M, this.N, this.O, i48);
                                aVar6.f162680n = i115;
                                arrayList.add(aVar6);
                                i114 = iC4;
                                i112 = 1;
                            } else {
                                i104 = i116;
                                i114 = i115 > 0 ? this.W0 + iC4 + i114 : iC4;
                            }
                            aVar6.a(eVar14);
                            i115++;
                            i113 = i117;
                        }
                        i30 = i113;
                    }
                    int size2 = arrayList.size();
                    int i118 = this.C0;
                    int i119 = this.f162693y0;
                    int i120 = this.D0;
                    int i121 = this.f162694z0;
                    e.b[] bVarArr2 = this.W;
                    e.b bVar4 = bVarArr2[0];
                    e.b bVar5 = e.b.WRAP_CONTENT;
                    boolean z24 = bVar4 == bVar5 || bVarArr2[1] == bVar5;
                    if (i30 > 0 && z24) {
                        for (int i122 = 0; i122 < size2; i122++) {
                            a aVar7 = arrayList.get(i122);
                            if (i104 == 0) {
                                aVar7.e(i48 - aVar7.d());
                            } else {
                                aVar7.e(i48 - aVar7.c());
                            }
                        }
                    }
                    int i123 = i118;
                    int i124 = i119;
                    int i125 = i120;
                    int i126 = i121;
                    d dVar11 = dVar2;
                    d dVar12 = dVar;
                    int iMax3 = 0;
                    int i127 = 0;
                    d dVar13 = dVar3;
                    d dVar14 = dVar4;
                    for (int i128 = 0; i128 < size2; i128++) {
                        a aVar8 = arrayList.get(i128);
                        if (i104 == 0) {
                            if (i128 < size2 - 1) {
                                dVar14 = arrayList.get(i128 + 1).f162668b.M;
                                i126 = 0;
                            } else {
                                i126 = this.f162694z0;
                                dVar14 = dVar4;
                            }
                            d dVar15 = aVar8.f162668b.O;
                            aVar8.f(i104, dVar11, dVar12, dVar13, dVar14, i123, i124, i125, i126, i48);
                            iMax3 = Math.max(iMax3, aVar8.d());
                            int iC5 = aVar8.c() + i127;
                            if (i128 > 0) {
                                iC5 += this.W0;
                            }
                            i127 = iC5;
                            dVar12 = dVar15;
                            i124 = 0;
                        } else {
                            if (i128 < size2 - 1) {
                                dVar13 = arrayList.get(i128 + 1).f162668b.L;
                                i125 = 0;
                            } else {
                                i125 = this.D0;
                                dVar13 = dVar3;
                            }
                            d dVar16 = aVar8.f162668b.N;
                            aVar8.f(i104, dVar11, dVar12, dVar13, dVar14, i123, i124, i125, i126, i48);
                            int iD5 = aVar8.d() + iMax3;
                            int iMax4 = Math.max(i127, aVar8.c());
                            if (i128 > 0) {
                                iD5 += this.V0;
                            }
                            i127 = iMax4;
                            iMax3 = iD5;
                            dVar11 = dVar16;
                            i123 = 0;
                        }
                    }
                    iArr[0] = iMax3;
                    iArr[1] = i127;
                }
            }
            c14 = 1;
        } else {
            i19 = i44;
            i24 = i45;
            iArr = iArr2;
            i25 = i38;
            i26 = i39;
            int i129 = this.f162660b1;
            if (i18 == 0) {
                c14 = 1;
            } else {
                if (arrayList.size() == 0) {
                    aVar = new a(i129, this.L, this.M, this.N, this.O, i48);
                    arrayList.add(aVar);
                } else {
                    a aVar9 = arrayList.get(0);
                    aVar9.f162669c = 0;
                    aVar9.f162668b = null;
                    aVar9.f162678l = 0;
                    aVar9.f162679m = 0;
                    aVar9.f162680n = 0;
                    aVar9.f162681o = 0;
                    aVar9.f162682p = 0;
                    aVar9.f(i129, this.L, this.M, this.N, this.O, this.C0, this.f162693y0, this.D0, this.f162694z0, i48);
                    aVar = aVar9;
                }
                for (int i130 = 0; i130 < i18; i130++) {
                    aVar.a(eVarArr2[i130]);
                }
                i56 = 0;
                iArr[0] = aVar.d();
                c14 = 1;
                iArr[1] = aVar.c();
            }
        }
        int iMin = iArr[i56] + i25 + i26;
        int iMin2 = iArr[c14] + i19 + i24;
        if (i14 == 1073741824) {
            iMin = i15;
        } else if (i14 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i15);
        } else if (i14 != 0) {
            iMin = i56;
        }
        if (i16 == 1073741824) {
            iMin2 = i17;
        } else if (i16 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i17);
        } else if (i16 != 0) {
            iMin2 = i56;
        }
        this.F0 = iMin;
        this.G0 = iMin2;
        T(iMin);
        O(iMin2);
        this.E0 = this.f162691x0 > 0 ? c14 : i56;
    }

    @Override // t6.e
    public final void c(m6.d dVar, boolean z14) {
        e eVar;
        float f14;
        int i14;
        super.c(dVar, z14);
        e eVar2 = this.X;
        boolean z15 = eVar2 != null && ((f) eVar2).B0;
        int i15 = this.Z0;
        ArrayList<a> arrayList = this.f162661c1;
        if (i15 != 0) {
            if (i15 == 1) {
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    arrayList.get(i16).b(i16, z15, i16 == size + (-1));
                    i16++;
                }
            } else if (i15 != 2) {
                if (i15 == 3) {
                    int size2 = arrayList.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        arrayList.get(i17).b(i17, z15, i17 == size2 + (-1));
                        i17++;
                    }
                }
            } else if (this.f162664f1 != null && this.f162663e1 != null && this.f162662d1 != null) {
                for (int i18 = 0; i18 < this.f162666h1; i18++) {
                    this.f162665g1[i18].F();
                }
                int[] iArr = this.f162664f1;
                int i19 = iArr[0];
                int i24 = iArr[1];
                float f15 = this.P0;
                e eVar3 = null;
                int i25 = 0;
                while (i25 < i19) {
                    if (z15) {
                        i14 = (i19 - i25) - 1;
                        f14 = 1.0f - this.P0;
                    } else {
                        f14 = f15;
                        i14 = i25;
                    }
                    e eVar4 = this.f162663e1[i14];
                    if (eVar4 != null) {
                        d dVar2 = eVar4.L;
                        if (eVar4.f162623k0 != 8) {
                            if (i25 == 0) {
                                eVar4.g(dVar2, this.L, this.C0);
                                eVar4.f162629n0 = this.J0;
                                eVar4.f162617h0 = f14;
                            }
                            if (i25 == i19 - 1) {
                                eVar4.g(eVar4.N, this.N, this.D0);
                            }
                            if (i25 > 0 && eVar3 != null) {
                                d dVar3 = eVar3.N;
                                eVar4.g(dVar2, dVar3, this.V0);
                                eVar3.g(dVar3, dVar2, 0);
                            }
                            eVar3 = eVar4;
                        }
                    }
                    i25++;
                    f15 = f14;
                }
                for (int i26 = 0; i26 < i24; i26++) {
                    e eVar5 = this.f162662d1[i26];
                    if (eVar5 != null) {
                        d dVar4 = eVar5.M;
                        if (eVar5.f162623k0 != 8) {
                            if (i26 == 0) {
                                eVar5.g(dVar4, this.M, this.f162693y0);
                                eVar5.f162631o0 = this.K0;
                                eVar5.f162619i0 = this.Q0;
                            }
                            if (i26 == i24 - 1) {
                                eVar5.g(eVar5.O, this.O, this.f162694z0);
                            }
                            if (i26 > 0 && eVar3 != null) {
                                d dVar5 = eVar3.O;
                                eVar5.g(dVar4, dVar5, this.W0);
                                eVar3.g(dVar5, dVar4, 0);
                            }
                            eVar3 = eVar5;
                        }
                    }
                }
                for (int i27 = 0; i27 < i19; i27++) {
                    for (int i28 = 0; i28 < i24; i28++) {
                        int i29 = (i28 * i19) + i27;
                        if (this.f162660b1 == 1) {
                            i29 = (i27 * i24) + i28;
                        }
                        e[] eVarArr = this.f162665g1;
                        if (i29 < eVarArr.length && (eVar = eVarArr[i29]) != null && eVar.f162623k0 != 8) {
                            e eVar6 = this.f162663e1[i27];
                            e eVar7 = this.f162662d1[i28];
                            if (eVar != eVar6) {
                                eVar.g(eVar.L, eVar6.L, 0);
                                eVar.g(eVar.N, eVar6.N, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.g(eVar.M, eVar7.M, 0);
                                eVar.g(eVar.O, eVar7.O, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z15, true);
        }
        this.E0 = false;
    }

    public final int c0(e eVar, int i14) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.W[1] == e.b.MATCH_CONSTRAINT) {
            int i15 = eVar.f162642u;
            if (i15 == 0) {
                return 0;
            }
            if (i15 == 2) {
                int i16 = (int) (eVar.B * i14);
                if (i16 != eVar.m()) {
                    eVar.f162614g = true;
                    b0(eVar, eVar.W[0], eVar.s(), e.b.FIXED, i16);
                }
                return i16;
            }
            eVar2 = eVar;
            if (i15 == 1) {
                return eVar2.m();
            }
            if (i15 == 3) {
                return (int) ((eVar2.s() * eVar2.f162603a0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.m();
    }

    public final int d0(e eVar, int i14) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.W[0] == e.b.MATCH_CONSTRAINT) {
            int i15 = eVar.f162640t;
            if (i15 == 0) {
                return 0;
            }
            if (i15 == 2) {
                int i16 = (int) (eVar.f162648y * i14);
                if (i16 != eVar.s()) {
                    eVar.f162614g = true;
                    b0(eVar, e.b.FIXED, i16, eVar.W[1], eVar.m());
                }
                return i16;
            }
            eVar2 = eVar;
            if (i15 == 1) {
                return eVar2.s();
            }
            if (i15 == 3) {
                return (int) ((eVar2.m() * eVar2.f162603a0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.s();
    }

    @Override // t6.i, t6.e
    public final void h(e eVar, HashMap<e, e> map) {
        super.h(eVar, map);
        g gVar = (g) eVar;
        this.J0 = gVar.J0;
        this.K0 = gVar.K0;
        this.L0 = gVar.L0;
        this.M0 = gVar.M0;
        this.N0 = gVar.N0;
        this.O0 = gVar.O0;
        this.P0 = gVar.P0;
        this.Q0 = gVar.Q0;
        this.R0 = gVar.R0;
        this.S0 = gVar.S0;
        this.T0 = gVar.T0;
        this.U0 = gVar.U0;
        this.V0 = gVar.V0;
        this.W0 = gVar.W0;
        this.X0 = gVar.X0;
        this.Y0 = gVar.Y0;
        this.Z0 = gVar.Z0;
        this.f162659a1 = gVar.f162659a1;
        this.f162660b1 = gVar.f162660b1;
    }
}
