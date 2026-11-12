package u6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f168826k = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168827a;

        static {
            int[] iArr = new int[p.b.values().length];
            f168827a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f168827a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f168827a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(t6.e eVar) {
        super(eVar);
        this.f168846h.f168807e = f.a.LEFT;
        this.f168847i.f168807e = f.a.RIGHT;
        this.f168844f = 0;
    }

    public static void m(int[] iArr, int i14, int i15, int i16, int i17, float f14, int i18) {
        int i19 = i15 - i14;
        int i24 = i17 - i16;
        if (i18 != -1) {
            if (i18 == 0) {
                iArr[0] = (int) ((i24 * f14) + 0.5f);
                iArr[1] = i24;
                return;
            } else {
                if (i18 != 1) {
                    return;
                }
                iArr[0] = i19;
                iArr[1] = (int) ((i19 * f14) + 0.5f);
                return;
            }
        }
        int i25 = (int) ((i24 * f14) + 0.5f);
        int i26 = (int) ((i19 / f14) + 0.5f);
        if (i25 <= i19) {
            iArr[0] = i25;
            iArr[1] = i24;
        } else if (i26 <= i24) {
            iArr[0] = i19;
            iArr[1] = i26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x0271  */
    @Override // u6.p, u6.d
    public final void a(d dVar) {
        int iG;
        int i14;
        int iG2;
        float f14;
        float f15;
        float f16;
        int i15;
        if (a.f168827a[this.f168848j.ordinal()] == 3) {
            t6.e eVar = this.f168840b;
            l(eVar.L, eVar.N, 0);
            return;
        }
        g gVar = this.f168843e;
        boolean z14 = gVar.f168812j;
        f fVar = this.f168846h;
        f fVar2 = this.f168847i;
        if (!z14 && this.f168842d == t6.e.b.MATCH_CONSTRAINT) {
            t6.e eVar2 = this.f168840b;
            int i16 = eVar2.f162640t;
            if (i16 == 2) {
                t6.e eVar3 = eVar2.X;
                if (eVar3 != null) {
                    g gVar2 = eVar3.f162608d.f168843e;
                    if (gVar2.f168812j) {
                        gVar.d((int) ((gVar2.f168809g * eVar2.f162648y) + 0.5f));
                    }
                }
            } else if (i16 == 3) {
                int i17 = eVar2.f162642u;
                if (i17 == 0 || i17 == 3) {
                    n nVar = eVar2.f162610e;
                    f fVar3 = nVar.f168846h;
                    f fVar4 = nVar.f168847i;
                    boolean z15 = eVar2.L.f162588f != null;
                    boolean z16 = eVar2.M.f162588f != null;
                    boolean z17 = eVar2.N.f162588f != null;
                    boolean z18 = eVar2.O.f162588f != null;
                    int i18 = eVar2.f162605b0;
                    if (z15 && z16 && z17 && z18) {
                        float f17 = eVar2.f162603a0;
                        boolean z19 = fVar3.f168812j;
                        ArrayList arrayList = fVar3.f168814l;
                        int[] iArr = f168826k;
                        if (z19 && fVar4.f168812j) {
                            if (fVar.f168805c && fVar2.f168805c) {
                                m(iArr, ((f) fVar.f168814l.get(0)).f168809g + fVar.f168808f, ((f) fVar2.f168814l.get(0)).f168809g - fVar2.f168808f, fVar3.f168809g + fVar3.f168808f, fVar4.f168809g - fVar4.f168808f, f17, i18);
                                gVar.d(iArr[0]);
                                this.f168840b.f162610e.f168843e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.f168812j && fVar2.f168812j) {
                            if (!fVar3.f168805c || !fVar4.f168805c) {
                                return;
                            }
                            m(iArr, fVar.f168809g + fVar.f168808f, fVar2.f168809g - fVar2.f168808f, ((f) arrayList.get(0)).f168809g + fVar3.f168808f, ((f) fVar4.f168814l.get(0)).f168809g - fVar4.f168808f, f17, i18);
                            gVar.d(iArr[0]);
                            this.f168840b.f162610e.f168843e.d(iArr[1]);
                        }
                        if (!fVar.f168805c || !fVar2.f168805c || !fVar3.f168805c || !fVar4.f168805c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f168814l.get(0)).f168809g + fVar.f168808f, ((f) fVar2.f168814l.get(0)).f168809g - fVar2.f168808f, ((f) arrayList.get(0)).f168809g + fVar3.f168808f, ((f) fVar4.f168814l.get(0)).f168809g - fVar4.f168808f, f17, i18);
                        gVar.d(iArr[0]);
                        this.f168840b.f162610e.f168843e.d(iArr[1]);
                    } else if (z15 && z17) {
                        if (!fVar.f168805c || !fVar2.f168805c) {
                            return;
                        }
                        float f18 = eVar2.f162603a0;
                        int i19 = ((f) fVar.f168814l.get(0)).f168809g + fVar.f168808f;
                        int i24 = ((f) fVar2.f168814l.get(0)).f168809g - fVar2.f168808f;
                        if (i18 == -1 || i18 == 0) {
                            int iG3 = g(i24 - i19, 0);
                            int i25 = (int) ((iG3 * f18) + 0.5f);
                            int iG4 = g(i25, 1);
                            if (i25 != iG4) {
                                iG3 = (int) ((iG4 / f18) + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f168840b.f162610e.f168843e.d(iG4);
                        } else if (i18 == 1) {
                            int iG5 = g(i24 - i19, 0);
                            int i26 = (int) ((iG5 / f18) + 0.5f);
                            int iG6 = g(i26, 1);
                            if (i26 != iG6) {
                                iG5 = (int) ((iG6 * f18) + 0.5f);
                            }
                            gVar.d(iG5);
                            this.f168840b.f162610e.f168843e.d(iG6);
                        }
                    } else if (z16 && z18) {
                        if (!fVar3.f168805c || !fVar4.f168805c) {
                            return;
                        }
                        float f19 = eVar2.f162603a0;
                        int i27 = ((f) fVar3.f168814l.get(0)).f168809g + fVar3.f168808f;
                        int i28 = ((f) fVar4.f168814l.get(0)).f168809g - fVar4.f168808f;
                        if (i18 == -1) {
                            iG = g(i28 - i27, 1);
                            i14 = (int) ((iG / f19) + 0.5f);
                            iG2 = g(i14, 0);
                            if (i14 != iG2) {
                                iG = (int) ((iG2 * f19) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f168840b.f162610e.f168843e.d(iG);
                        } else if (i18 == 0) {
                            int iG7 = g(i28 - i27, 1);
                            int i29 = (int) ((iG7 * f19) + 0.5f);
                            int iG8 = g(i29, 0);
                            if (i29 != iG8) {
                                iG7 = (int) ((iG8 / f19) + 0.5f);
                            }
                            gVar.d(iG8);
                            this.f168840b.f162610e.f168843e.d(iG7);
                        } else if (i18 == 1) {
                            iG = g(i28 - i27, 1);
                            i14 = (int) ((iG / f19) + 0.5f);
                            iG2 = g(i14, 0);
                            if (i14 != iG2) {
                                iG = (int) ((iG2 * f19) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f168840b.f162610e.f168843e.d(iG);
                        }
                    }
                } else {
                    int i30 = eVar2.f162605b0;
                    if (i30 != -1) {
                        if (i30 == 0) {
                            f16 = eVar2.f162610e.f168843e.f168809g / eVar2.f162603a0;
                            i15 = (int) (f16 + 0.5f);
                        } else if (i30 != 1) {
                            i15 = 0;
                        } else {
                            f14 = eVar2.f162610e.f168843e.f168809g;
                            f15 = eVar2.f162603a0;
                        }
                        gVar.d(i15);
                    } else {
                        f14 = eVar2.f162610e.f168843e.f168809g;
                        f15 = eVar2.f162603a0;
                    }
                    f16 = f14 * f15;
                    i15 = (int) (f16 + 0.5f);
                    gVar.d(i15);
                }
            }
        }
        boolean z24 = fVar.f168805c;
        ArrayList arrayList2 = fVar.f168814l;
        if (z24) {
            boolean z25 = fVar2.f168805c;
            ArrayList arrayList3 = fVar2.f168814l;
            if (z25) {
                if (fVar.f168812j && fVar2.f168812j && gVar.f168812j) {
                    return;
                }
                if (!gVar.f168812j && this.f168842d == t6.e.b.MATCH_CONSTRAINT) {
                    t6.e eVar4 = this.f168840b;
                    if (eVar4.f162640t == 0 && !eVar4.z()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i34 = fVar5.f168809g + fVar.f168808f;
                        int i35 = fVar6.f168809g + fVar2.f168808f;
                        fVar.d(i34);
                        fVar2.d(i35);
                        gVar.d(i35 - i34);
                        return;
                    }
                }
                if (!gVar.f168812j && this.f168842d == t6.e.b.MATCH_CONSTRAINT && this.f168839a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((f) arrayList3.get(0)).f168809g + fVar2.f168808f) - (((f) arrayList2.get(0)).f168809g + fVar.f168808f), gVar.f168824m);
                    t6.e eVar5 = this.f168840b;
                    int i36 = eVar5.f162647x;
                    int iMax = Math.max(eVar5.f162646w, iMin);
                    if (i36 > 0) {
                        iMax = Math.min(i36, iMax);
                    }
                    gVar.d(iMax);
                }
                if (gVar.f168812j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i37 = fVar7.f168809g;
                    int i38 = fVar.f168808f + i37;
                    int i39 = fVar8.f168809g;
                    int i44 = fVar2.f168808f + i39;
                    float f22 = this.f168840b.f162617h0;
                    if (fVar7 == fVar8) {
                        f22 = 0.5f;
                    } else {
                        i37 = i38;
                        i39 = i44;
                    }
                    fVar.d((int) ((((i39 - i37) - gVar.f168809g) * f22) + i37 + 0.5f));
                    fVar2.d(fVar.f168809g + gVar.f168809g);
                }
            }
        }
    }

    @Override // u6.p
    public final void d() {
        t6.e eVar;
        t6.e eVar2;
        t6.e.b bVar;
        t6.e eVar3;
        t6.e eVar4;
        t6.e.b bVar2;
        t6.e eVar5 = this.f168840b;
        boolean z14 = eVar5.f162602a;
        g gVar = this.f168843e;
        if (z14) {
            gVar.d(eVar5.s());
        }
        boolean z15 = gVar.f168812j;
        ArrayList arrayList = gVar.f168813k;
        ArrayList arrayList2 = gVar.f168814l;
        f fVar = this.f168847i;
        f fVar2 = this.f168846h;
        if (z15) {
            t6.e.b bVar3 = this.f168842d;
            t6.e.b bVar4 = t6.e.b.MATCH_PARENT;
            if (bVar3 == bVar4 && (eVar2 = (eVar = this.f168840b).X) != null && ((bVar = eVar2.W[0]) == t6.e.b.FIXED || bVar == bVar4)) {
                p.b(fVar2, eVar2.f162608d.f168846h, eVar.L.e());
                p.b(fVar, eVar2.f162608d.f168847i, -this.f168840b.N.e());
                return;
            }
        } else {
            t6.e eVar6 = this.f168840b;
            t6.e.b bVar5 = eVar6.W[0];
            this.f168842d = bVar5;
            if (bVar5 != t6.e.b.MATCH_CONSTRAINT) {
                t6.e.b bVar6 = t6.e.b.MATCH_PARENT;
                if (bVar5 == bVar6 && (eVar4 = eVar6.X) != null && ((bVar2 = eVar4.W[0]) == t6.e.b.FIXED || bVar2 == bVar6)) {
                    int iS = (eVar4.s() - this.f168840b.L.e()) - this.f168840b.N.e();
                    p.b(fVar2, eVar4.f162608d.f168846h, this.f168840b.L.e());
                    p.b(fVar, eVar4.f162608d.f168847i, -this.f168840b.N.e());
                    gVar.d(iS);
                    return;
                }
                if (bVar5 == t6.e.b.FIXED) {
                    gVar.d(eVar6.s());
                }
            }
        }
        if (gVar.f168812j) {
            t6.e eVar7 = this.f168840b;
            if (eVar7.f162602a) {
                t6.d[] dVarArr = eVar7.T;
                t6.d dVar = dVarArr[0];
                t6.d dVar2 = dVar.f162588f;
                if (dVar2 != null && dVarArr[1].f162588f != null) {
                    boolean z16 = eVar7.z();
                    t6.e eVar8 = this.f168840b;
                    if (z16) {
                        fVar2.f168808f = eVar8.T[0].e();
                        fVar.f168808f = -this.f168840b.T[1].e();
                        return;
                    }
                    f fVarH = p.h(eVar8.T[0]);
                    if (fVarH != null) {
                        p.b(fVar2, fVarH, this.f168840b.T[0].e());
                    }
                    f fVarH2 = p.h(this.f168840b.T[1]);
                    if (fVarH2 != null) {
                        p.b(fVar, fVarH2, -this.f168840b.T[1].e());
                    }
                    fVar2.f168804b = true;
                    fVar.f168804b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = p.h(dVar);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f168840b.T[0].e());
                        p.b(fVar, fVar2, gVar.f168809g);
                        return;
                    }
                    return;
                }
                t6.d dVar3 = dVarArr[1];
                if (dVar3.f162588f != null) {
                    f fVarH4 = p.h(dVar3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f168840b.T[1].e());
                        p.b(fVar2, fVar, -gVar.f168809g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof t6.i) || eVar7.X == null || eVar7.k(t6.d.a.CENTER).f162588f != null) {
                    return;
                }
                t6.e eVar9 = this.f168840b;
                p.b(fVar2, eVar9.X.f162608d.f168846h, eVar9.t());
                p.b(fVar, fVar2, gVar.f168809g);
                return;
            }
        }
        if (this.f168842d == t6.e.b.MATCH_CONSTRAINT) {
            t6.e eVar10 = this.f168840b;
            int i14 = eVar10.f162640t;
            if (i14 == 2) {
                t6.e eVar11 = eVar10.X;
                if (eVar11 != null) {
                    g gVar2 = eVar11.f162610e.f168843e;
                    arrayList2.add(gVar2);
                    gVar2.f168813k.add(gVar);
                    gVar.f168804b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i14 == 3) {
                if (eVar10.f162642u == 3) {
                    fVar2.f168803a = this;
                    fVar.f168803a = this;
                    n nVar = eVar10.f162610e;
                    nVar.f168846h.f168803a = this;
                    nVar.f168847i.f168803a = this;
                    gVar.f168803a = this;
                    if (eVar10.A()) {
                        arrayList2.add(this.f168840b.f162610e.f168843e);
                        this.f168840b.f162610e.f168843e.f168813k.add(gVar);
                        n nVar2 = this.f168840b.f162610e;
                        nVar2.f168843e.f168803a = this;
                        arrayList2.add(nVar2.f168846h);
                        arrayList2.add(this.f168840b.f162610e.f168847i);
                        this.f168840b.f162610e.f168846h.f168813k.add(gVar);
                        this.f168840b.f162610e.f168847i.f168813k.add(gVar);
                    } else {
                        boolean z17 = this.f168840b.z();
                        t6.e eVar12 = this.f168840b;
                        if (z17) {
                            eVar12.f162610e.f168843e.f168814l.add(gVar);
                            arrayList.add(this.f168840b.f162610e.f168843e);
                        } else {
                            eVar12.f162610e.f168843e.f168814l.add(gVar);
                        }
                    }
                } else {
                    g gVar3 = eVar10.f162610e.f168843e;
                    arrayList2.add(gVar3);
                    gVar3.f168813k.add(gVar);
                    this.f168840b.f162610e.f168846h.f168813k.add(gVar);
                    this.f168840b.f162610e.f168847i.f168813k.add(gVar);
                    gVar.f168804b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f168814l.add(gVar);
                    fVar.f168814l.add(gVar);
                }
            }
        }
        t6.e eVar13 = this.f168840b;
        t6.d[] dVarArr2 = eVar13.T;
        t6.d dVar4 = dVarArr2[0];
        t6.d dVar5 = dVar4.f162588f;
        if (dVar5 != null && dVarArr2[1].f162588f != null) {
            boolean z18 = eVar13.z();
            t6.e eVar14 = this.f168840b;
            if (z18) {
                fVar2.f168808f = eVar14.T[0].e();
                fVar.f168808f = -this.f168840b.T[1].e();
                return;
            }
            f fVarH5 = p.h(eVar14.T[0]);
            f fVarH6 = p.h(this.f168840b.T[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f168848j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = p.h(dVar4);
            if (fVarH7 != null) {
                p.b(fVar2, fVarH7, this.f168840b.T[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        t6.d dVar6 = dVarArr2[1];
        if (dVar6.f162588f != null) {
            f fVarH8 = p.h(dVar6);
            if (fVarH8 != null) {
                p.b(fVar, fVarH8, -this.f168840b.T[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((eVar13 instanceof t6.i) || (eVar3 = eVar13.X) == null) {
            return;
        }
        p.b(fVar2, eVar3.f162608d.f168846h, eVar13.t());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // u6.p
    public final void e() {
        f fVar = this.f168846h;
        if (fVar.f168812j) {
            this.f168840b.f162607c0 = fVar.f168809g;
        }
    }

    @Override // u6.p
    public final void f() {
        this.f168841c = null;
        this.f168846h.c();
        this.f168847i.c();
        this.f168843e.c();
        this.f168845g = false;
    }

    @Override // u6.p
    public final boolean k() {
        return this.f168842d != t6.e.b.MATCH_CONSTRAINT || this.f168840b.f162640t == 0;
    }

    public final void n() {
        this.f168845g = false;
        f fVar = this.f168846h;
        fVar.c();
        fVar.f168812j = false;
        f fVar2 = this.f168847i;
        fVar2.c();
        fVar2.f168812j = false;
        this.f168843e.f168812j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f168840b.f162627m0;
    }
}
