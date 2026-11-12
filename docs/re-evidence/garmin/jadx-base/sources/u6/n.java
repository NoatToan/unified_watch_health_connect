package u6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f168830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u6.a f168831l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168832a;

        static {
            int[] iArr = new int[p.b.values().length];
            f168832a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f168832a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f168832a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(t6.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f168830k = fVar;
        this.f168831l = null;
        this.f168846h.f168807e = f.a.TOP;
        this.f168847i.f168807e = f.a.BOTTOM;
        fVar.f168807e = f.a.BASELINE;
        this.f168844f = 1;
    }

    @Override // u6.p, u6.d
    public final void a(d dVar) {
        float f14;
        float f15;
        float f16;
        int i14;
        if (a.f168832a[this.f168848j.ordinal()] == 3) {
            t6.e eVar = this.f168840b;
            l(eVar.M, eVar.O, 1);
            return;
        }
        g gVar = this.f168843e;
        if (gVar.f168805c && !gVar.f168812j && this.f168842d == t6.e.b.MATCH_CONSTRAINT) {
            t6.e eVar2 = this.f168840b;
            int i15 = eVar2.f162642u;
            if (i15 == 2) {
                t6.e eVar3 = eVar2.X;
                if (eVar3 != null) {
                    g gVar2 = eVar3.f162610e.f168843e;
                    if (gVar2.f168812j) {
                        gVar.d((int) ((gVar2.f168809g * eVar2.B) + 0.5f));
                    }
                }
            } else if (i15 == 3) {
                g gVar3 = eVar2.f162608d.f168843e;
                if (gVar3.f168812j) {
                    int i16 = eVar2.f162605b0;
                    if (i16 != -1) {
                        if (i16 == 0) {
                            f16 = gVar3.f168809g * eVar2.f162603a0;
                            i14 = (int) (f16 + 0.5f);
                        } else if (i16 != 1) {
                            i14 = 0;
                        } else {
                            f14 = gVar3.f168809g;
                            f15 = eVar2.f162603a0;
                        }
                        gVar.d(i14);
                    } else {
                        f14 = gVar3.f168809g;
                        f15 = eVar2.f162603a0;
                    }
                    f16 = f14 / f15;
                    i14 = (int) (f16 + 0.5f);
                    gVar.d(i14);
                }
            }
        }
        f fVar = this.f168846h;
        boolean z14 = fVar.f168805c;
        ArrayList arrayList = fVar.f168814l;
        if (z14) {
            f fVar2 = this.f168847i;
            boolean z15 = fVar2.f168805c;
            ArrayList arrayList2 = fVar2.f168814l;
            if (z15) {
                if (fVar.f168812j && fVar2.f168812j && gVar.f168812j) {
                    return;
                }
                if (!gVar.f168812j && this.f168842d == t6.e.b.MATCH_CONSTRAINT) {
                    t6.e eVar4 = this.f168840b;
                    if (eVar4.f162640t == 0 && !eVar4.A()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i17 = fVar3.f168809g + fVar.f168808f;
                        int i18 = fVar4.f168809g + fVar2.f168808f;
                        fVar.d(i17);
                        fVar2.d(i18);
                        gVar.d(i18 - i17);
                        return;
                    }
                }
                if (!gVar.f168812j && this.f168842d == t6.e.b.MATCH_CONSTRAINT && this.f168839a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i19 = (((f) arrayList2.get(0)).f168809g + fVar2.f168808f) - (fVar5.f168809g + fVar.f168808f);
                    int i24 = gVar.f168824m;
                    if (i19 < i24) {
                        gVar.d(i19);
                    } else {
                        gVar.d(i24);
                    }
                }
                if (gVar.f168812j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i25 = fVar6.f168809g;
                    int i26 = fVar.f168808f + i25;
                    int i27 = fVar7.f168809g;
                    int i28 = fVar2.f168808f + i27;
                    float f17 = this.f168840b.f162619i0;
                    if (fVar6 == fVar7) {
                        f17 = 0.5f;
                    } else {
                        i25 = i26;
                        i27 = i28;
                    }
                    fVar.d((int) ((((i27 - i25) - gVar.f168809g) * f17) + i25 + 0.5f));
                    fVar2.d(fVar.f168809g + gVar.f168809g);
                }
            }
        }
    }

    @Override // u6.p
    public final void d() {
        t6.e eVar;
        t6.e eVar2;
        t6.e eVar3;
        t6.e eVar4;
        t6.e eVar5 = this.f168840b;
        boolean z14 = eVar5.f162602a;
        g gVar = this.f168843e;
        if (z14) {
            gVar.d(eVar5.m());
        }
        boolean z15 = gVar.f168812j;
        ArrayList arrayList = gVar.f168813k;
        ArrayList arrayList2 = gVar.f168814l;
        f fVar = this.f168847i;
        f fVar2 = this.f168846h;
        if (!z15) {
            t6.e eVar6 = this.f168840b;
            this.f168842d = eVar6.W[1];
            if (eVar6.G) {
                this.f168831l = new u6.a(this);
            }
            t6.e.b bVar = this.f168842d;
            if (bVar != t6.e.b.MATCH_CONSTRAINT) {
                if (bVar == t6.e.b.MATCH_PARENT && (eVar4 = this.f168840b.X) != null && eVar4.W[1] == t6.e.b.FIXED) {
                    int iM = (eVar4.m() - this.f168840b.M.e()) - this.f168840b.O.e();
                    p.b(fVar2, eVar4.f162610e.f168846h, this.f168840b.M.e());
                    p.b(fVar, eVar4.f162610e.f168847i, -this.f168840b.O.e());
                    gVar.d(iM);
                    return;
                }
                if (bVar == t6.e.b.FIXED) {
                    gVar.d(this.f168840b.m());
                }
            }
        } else if (this.f168842d == t6.e.b.MATCH_PARENT && (eVar2 = (eVar = this.f168840b).X) != null && eVar2.W[1] == t6.e.b.FIXED) {
            p.b(fVar2, eVar2.f162610e.f168846h, eVar.M.e());
            p.b(fVar, eVar2.f162610e.f168847i, -this.f168840b.O.e());
            return;
        }
        boolean z16 = gVar.f168812j;
        f fVar3 = this.f168830k;
        if (z16) {
            t6.e eVar7 = this.f168840b;
            if (eVar7.f162602a) {
                t6.d[] dVarArr = eVar7.T;
                t6.d dVar = dVarArr[2];
                t6.d dVar2 = dVar.f162588f;
                if (dVar2 != null && dVarArr[3].f162588f != null) {
                    boolean zA = eVar7.A();
                    t6.e eVar8 = this.f168840b;
                    if (zA) {
                        fVar2.f168808f = eVar8.T[2].e();
                        fVar.f168808f = -this.f168840b.T[3].e();
                    } else {
                        f fVarH = p.h(eVar8.T[2]);
                        if (fVarH != null) {
                            p.b(fVar2, fVarH, this.f168840b.T[2].e());
                        }
                        f fVarH2 = p.h(this.f168840b.T[3]);
                        if (fVarH2 != null) {
                            p.b(fVar, fVarH2, -this.f168840b.T[3].e());
                        }
                        fVar2.f168804b = true;
                        fVar.f168804b = true;
                    }
                    t6.e eVar9 = this.f168840b;
                    if (eVar9.G) {
                        p.b(fVar3, fVar2, eVar9.f162611e0);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = p.h(dVar);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f168840b.T[2].e());
                        p.b(fVar, fVar2, gVar.f168809g);
                        t6.e eVar10 = this.f168840b;
                        if (eVar10.G) {
                            p.b(fVar3, fVar2, eVar10.f162611e0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                t6.d dVar3 = dVarArr[3];
                if (dVar3.f162588f != null) {
                    f fVarH4 = p.h(dVar3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f168840b.T[3].e());
                        p.b(fVar2, fVar, -gVar.f168809g);
                    }
                    t6.e eVar11 = this.f168840b;
                    if (eVar11.G) {
                        p.b(fVar3, fVar2, eVar11.f162611e0);
                        return;
                    }
                    return;
                }
                t6.d dVar4 = dVarArr[4];
                if (dVar4.f162588f != null) {
                    f fVarH5 = p.h(dVar4);
                    if (fVarH5 != null) {
                        p.b(fVar3, fVarH5, 0);
                        p.b(fVar2, fVar3, -this.f168840b.f162611e0);
                        p.b(fVar, fVar2, gVar.f168809g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof t6.i) || eVar7.X == null || eVar7.k(t6.d.a.CENTER).f162588f != null) {
                    return;
                }
                t6.e eVar12 = this.f168840b;
                p.b(fVar2, eVar12.X.f162610e.f168846h, eVar12.u());
                p.b(fVar, fVar2, gVar.f168809g);
                t6.e eVar13 = this.f168840b;
                if (eVar13.G) {
                    p.b(fVar3, fVar2, eVar13.f162611e0);
                    return;
                }
                return;
            }
        }
        if (z16 || this.f168842d != t6.e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            t6.e eVar14 = this.f168840b;
            int i14 = eVar14.f162642u;
            if (i14 == 2) {
                t6.e eVar15 = eVar14.X;
                if (eVar15 != null) {
                    g gVar2 = eVar15.f162610e.f168843e;
                    arrayList2.add(gVar2);
                    gVar2.f168813k.add(gVar);
                    gVar.f168804b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i14 == 3 && !eVar14.A()) {
                t6.e eVar16 = this.f168840b;
                if (eVar16.f162640t != 3) {
                    g gVar3 = eVar16.f162608d.f168843e;
                    arrayList2.add(gVar3);
                    gVar3.f168813k.add(gVar);
                    gVar.f168804b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            }
        }
        t6.e eVar17 = this.f168840b;
        t6.d[] dVarArr2 = eVar17.T;
        t6.d dVar5 = dVarArr2[2];
        t6.d dVar6 = dVar5.f162588f;
        if (dVar6 != null && dVarArr2[3].f162588f != null) {
            boolean zA2 = eVar17.A();
            t6.e eVar18 = this.f168840b;
            if (zA2) {
                fVar2.f168808f = eVar18.T[2].e();
                fVar.f168808f = -this.f168840b.T[3].e();
            } else {
                f fVarH6 = p.h(eVar18.T[2]);
                f fVarH7 = p.h(this.f168840b.T[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f168848j = p.b.CENTER;
            }
            if (this.f168840b.G) {
                c(fVar3, fVar2, 1, this.f168831l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = p.h(dVar5);
            if (fVarH8 != null) {
                p.b(fVar2, fVarH8, this.f168840b.T[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f168840b.G) {
                    c(fVar3, fVar2, 1, this.f168831l);
                }
                t6.e.b bVar2 = this.f168842d;
                t6.e.b bVar3 = t6.e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3) {
                    t6.e eVar19 = this.f168840b;
                    if (eVar19.f162603a0 > 0.0f) {
                        l lVar = eVar19.f162608d;
                        if (lVar.f168842d == bVar3) {
                            lVar.f168843e.f168813k.add(gVar);
                            arrayList2.add(this.f168840b.f162608d.f168843e);
                            gVar.f168803a = this;
                        }
                    }
                }
            }
        } else {
            t6.d dVar7 = dVarArr2[3];
            if (dVar7.f162588f != null) {
                f fVarH9 = p.h(dVar7);
                if (fVarH9 != null) {
                    p.b(fVar, fVarH9, -this.f168840b.T[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f168840b.G) {
                        c(fVar3, fVar2, 1, this.f168831l);
                    }
                }
            } else {
                t6.d dVar8 = dVarArr2[4];
                if (dVar8.f162588f != null) {
                    f fVarH10 = p.h(dVar8);
                    if (fVarH10 != null) {
                        p.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f168831l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(eVar17 instanceof t6.i) && (eVar3 = eVar17.X) != null) {
                    p.b(fVar2, eVar3.f162610e.f168846h, eVar17.u());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f168840b.G) {
                        c(fVar3, fVar2, 1, this.f168831l);
                    }
                    t6.e.b bVar4 = this.f168842d;
                    t6.e.b bVar5 = t6.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5) {
                        t6.e eVar20 = this.f168840b;
                        if (eVar20.f162603a0 > 0.0f) {
                            l lVar2 = eVar20.f162608d;
                            if (lVar2.f168842d == bVar5) {
                                lVar2.f168843e.f168813k.add(gVar);
                                arrayList2.add(this.f168840b.f162608d.f168843e);
                                gVar.f168803a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f168805c = true;
        }
    }

    @Override // u6.p
    public final void e() {
        f fVar = this.f168846h;
        if (fVar.f168812j) {
            this.f168840b.f162609d0 = fVar.f168809g;
        }
    }

    @Override // u6.p
    public final void f() {
        this.f168841c = null;
        this.f168846h.c();
        this.f168847i.c();
        this.f168830k.c();
        this.f168843e.c();
        this.f168845g = false;
    }

    @Override // u6.p
    public final boolean k() {
        return this.f168842d != t6.e.b.MATCH_CONSTRAINT || this.f168840b.f162642u == 0;
    }

    public final void m() {
        this.f168845g = false;
        f fVar = this.f168846h;
        fVar.c();
        fVar.f168812j = false;
        f fVar2 = this.f168847i;
        fVar2.c();
        fVar2.f168812j = false;
        f fVar3 = this.f168830k;
        fVar3.c();
        fVar3.f168812j = false;
        this.f168843e.f168812j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f168840b.f162627m0;
    }
}
