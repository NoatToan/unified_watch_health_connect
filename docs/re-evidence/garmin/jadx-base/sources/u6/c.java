package u6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<p> f168793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f168794l;

    public c(t6.e eVar, int i14) {
        t6.e eVar2;
        super(eVar);
        ArrayList<p> arrayList = new ArrayList<>();
        this.f168793k = arrayList;
        this.f168844f = i14;
        t6.e eVar3 = this.f168840b;
        t6.e eVarO = eVar3.o(i14);
        while (true) {
            eVar2 = eVar3;
            eVar3 = eVarO;
            if (eVar3 == null) {
                break;
            } else {
                eVarO = eVar3.o(this.f168844f);
            }
        }
        this.f168840b = eVar2;
        int i15 = this.f168844f;
        arrayList.add(i15 == 0 ? eVar2.f162608d : i15 == 1 ? eVar2.f162610e : null);
        t6.e eVarN = eVar2.n(this.f168844f);
        while (eVarN != null) {
            int i16 = this.f168844f;
            arrayList.add(i16 == 0 ? eVarN.f162608d : i16 == 1 ? eVarN.f162610e : null);
            eVarN = eVarN.n(this.f168844f);
        }
        for (p pVar : arrayList) {
            int i17 = this.f168844f;
            if (i17 == 0) {
                pVar.f168840b.f162604b = this;
            } else if (i17 == 1) {
                pVar.f168840b.f162606c = this;
            }
        }
        if (this.f168844f == 0 && ((t6.f) this.f168840b.X).B0 && arrayList.size() > 1) {
            this.f168840b = ((p) am.j.f(1, arrayList)).f168840b;
        }
        int i18 = this.f168844f;
        t6.e eVar4 = this.f168840b;
        this.f168794l = i18 == 0 ? eVar4.f162629n0 : eVar4.f162631o0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2 A[ADDED_TO_REGION] */
    @Override // u6.p, u6.d
    public final void a(d dVar) {
        int i14;
        int i15;
        boolean z14;
        float f14;
        float f15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f16;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float f17;
        f fVar = this.f168846h;
        if (fVar.f168812j) {
            f fVar2 = this.f168847i;
            if (fVar2.f168812j) {
                t6.e eVar = this.f168840b.X;
                boolean z15 = eVar instanceof t6.f ? ((t6.f) eVar).B0 : false;
                int i29 = fVar2.f168809g - fVar.f168809g;
                ArrayList<p> arrayList = this.f168793k;
                int size = arrayList.size();
                int i30 = 0;
                while (true) {
                    i14 = -1;
                    i15 = 8;
                    if (i30 >= size) {
                        i30 = -1;
                        break;
                    } else if (arrayList.get(i30).f168840b.f162623k0 != 8) {
                        break;
                    } else {
                        i30++;
                    }
                }
                int i34 = size - 1;
                for (int i35 = i34; i35 >= 0; i35--) {
                    if (arrayList.get(i35).f168840b.f162623k0 != 8) {
                        i14 = i35;
                        break;
                    }
                }
                int i36 = 0;
                while (true) {
                    if (i36 >= 2) {
                        z14 = z15;
                        f14 = 0.0f;
                        f15 = 0.0f;
                        i16 = 0;
                        i17 = 0;
                        i18 = 0;
                        break;
                    }
                    f14 = 0.0f;
                    i17 = 0;
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 0;
                    f15 = 0.0f;
                    while (i37 < size) {
                        p pVar = arrayList.get(i37);
                        t6.e eVar2 = pVar.f168840b;
                        boolean z16 = z15;
                        if (eVar2.f162623k0 != i15) {
                            i39++;
                            if (i37 > 0 && i37 >= i30) {
                                i17 += pVar.f168846h.f168808f;
                            }
                            g gVar = pVar.f168843e;
                            int i44 = gVar.f168809g;
                            int i45 = i17;
                            boolean z17 = pVar.f168842d != t6.e.b.MATCH_CONSTRAINT;
                            if (z17) {
                                int i46 = this.f168844f;
                                if (i46 == 0 && !eVar2.f162608d.f168843e.f168812j) {
                                    return;
                                }
                                if (i46 == 1 && !eVar2.f162610e.f168843e.f168812j) {
                                    return;
                                }
                            } else {
                                if (pVar.f168839a == 1 && i36 == 0) {
                                    i28 = gVar.f168824m;
                                    i38++;
                                } else {
                                    if (gVar.f168812j) {
                                        i28 = i44;
                                    }
                                    if (z17) {
                                        i17 = i45 + i28;
                                    } else {
                                        i38++;
                                        f17 = eVar2.f162633p0[this.f168844f];
                                        if (f17 >= 0.0f) {
                                            f15 += f17;
                                        }
                                        i17 = i45;
                                    }
                                    if (i37 >= i34 && i37 < i14) {
                                        i17 += -pVar.f168847i.f168808f;
                                    }
                                }
                                z17 = true;
                                if (z17) {
                                    i38++;
                                    f17 = eVar2.f162633p0[this.f168844f];
                                    if (f17 >= 0.0f) {
                                        f15 += f17;
                                    }
                                    i17 = i45;
                                } else {
                                    i17 = i45 + i28;
                                }
                                if (i37 >= i34) {
                                }
                            }
                            i28 = i44;
                            if (z17) {
                                i38++;
                                f17 = eVar2.f162633p0[this.f168844f];
                                if (f17 >= 0.0f) {
                                    f15 += f17;
                                }
                                i17 = i45;
                            } else {
                                i17 = i45 + i28;
                            }
                            if (i37 >= i34) {
                            }
                        }
                        i37++;
                        z15 = z16;
                        i15 = 8;
                    }
                    z14 = z15;
                    if (i17 < i29 || i38 == 0) {
                        i16 = i38;
                        i18 = i39;
                        break;
                    } else {
                        i36++;
                        z15 = z14;
                        i15 = 8;
                    }
                }
                int i47 = fVar.f168809g;
                if (z14) {
                    i47 = fVar2.f168809g;
                }
                float f18 = 0.5f;
                if (i17 > i29) {
                    i47 = z14 ? i47 + ((int) (((i17 - i29) / 2.0f) + 0.5f)) : i47 - ((int) (((i17 - i29) / 2.0f) + 0.5f));
                }
                if (i16 > 0) {
                    float f19 = i29 - i17;
                    int i48 = (int) ((f19 / i16) + 0.5f);
                    int i49 = 0;
                    int i54 = 0;
                    while (i49 < size) {
                        float f22 = f18;
                        p pVar2 = arrayList.get(i49);
                        int i55 = i47;
                        t6.e eVar3 = pVar2.f168840b;
                        int i56 = i16;
                        g gVar2 = pVar2.f168843e;
                        int i57 = i17;
                        float f24 = f19;
                        if (eVar3.f162623k0 != 8 && pVar2.f168842d == t6.e.b.MATCH_CONSTRAINT && !gVar2.f168812j) {
                            int i58 = f15 > f14 ? (int) (((eVar3.f162633p0[this.f168844f] * f24) / f15) + f22) : i48;
                            if (this.f168844f == 0) {
                                i26 = eVar3.f162647x;
                                i27 = eVar3.f162646w;
                            } else {
                                i26 = eVar3.A;
                                i27 = eVar3.f162649z;
                            }
                            int iMax = Math.max(i27, pVar2.f168839a == 1 ? Math.min(i58, gVar2.f168824m) : i58);
                            if (i26 > 0) {
                                iMax = Math.min(i26, iMax);
                            }
                            if (iMax != i58) {
                                i54++;
                                i58 = iMax;
                            }
                            gVar2.d(i58);
                        }
                        i49++;
                        i47 = i55;
                        f18 = f22;
                        i16 = i56;
                        i17 = i57;
                        f19 = f24;
                        i48 = i48;
                    }
                    i19 = i47;
                    f16 = f18;
                    int i59 = i16;
                    int i64 = i17;
                    if (i54 > 0) {
                        i16 = i59 - i54;
                        i17 = 0;
                        for (int i65 = 0; i65 < size; i65++) {
                            p pVar3 = arrayList.get(i65);
                            if (pVar3.f168840b.f162623k0 != 8) {
                                if (i65 > 0 && i65 >= i30) {
                                    i17 += pVar3.f168846h.f168808f;
                                }
                                i17 += pVar3.f168843e.f168809g;
                                if (i65 < i34 && i65 < i14) {
                                    i17 += -pVar3.f168847i.f168808f;
                                }
                            }
                        }
                    } else {
                        i16 = i59;
                        i17 = i64;
                    }
                    i25 = 2;
                    if (this.f168794l == 2 && i54 == 0) {
                        i24 = 0;
                        this.f168794l = 0;
                    } else {
                        i24 = 0;
                    }
                } else {
                    i19 = i47;
                    f16 = 0.5f;
                    i24 = 0;
                    i25 = 2;
                }
                if (i17 > i29) {
                    this.f168794l = i25;
                }
                if (i18 > 0 && i16 == 0 && i30 == i14) {
                    this.f168794l = i25;
                }
                int i66 = this.f168794l;
                if (i66 == 1) {
                    int i67 = i18 > 1 ? (i29 - i17) / (i18 - 1) : i18 == 1 ? (i29 - i17) / 2 : i24;
                    if (i16 > 0) {
                        i67 = i24;
                    }
                    int i68 = i19;
                    for (int i69 = i24; i69 < size; i69++) {
                        p pVar4 = arrayList.get(z14 ? size - (i69 + 1) : i69);
                        t6.e eVar4 = pVar4.f168840b;
                        f fVar3 = pVar4.f168847i;
                        f fVar4 = pVar4.f168846h;
                        if (eVar4.f162623k0 == 8) {
                            fVar4.d(i68);
                            fVar3.d(i68);
                        } else {
                            if (i69 > 0) {
                                i68 = z14 ? i68 - i67 : i68 + i67;
                            }
                            if (i69 > 0 && i69 >= i30) {
                                i68 = z14 ? i68 - fVar4.f168808f : i68 + fVar4.f168808f;
                            }
                            if (z14) {
                                fVar3.d(i68);
                            } else {
                                fVar4.d(i68);
                            }
                            g gVar3 = pVar4.f168843e;
                            int i74 = gVar3.f168809g;
                            if (pVar4.f168842d == t6.e.b.MATCH_CONSTRAINT && pVar4.f168839a == 1) {
                                i74 = gVar3.f168824m;
                            }
                            i68 = z14 ? i68 - i74 : i68 + i74;
                            if (z14) {
                                fVar4.d(i68);
                            } else {
                                fVar3.d(i68);
                            }
                            pVar4.f168845g = true;
                            if (i69 < i34 && i69 < i14) {
                                i68 = z14 ? i68 - (-fVar3.f168808f) : i68 + (-fVar3.f168808f);
                            }
                        }
                    }
                    return;
                }
                if (i66 == 0) {
                    int i75 = (i29 - i17) / (i18 + 1);
                    if (i16 > 0) {
                        i75 = i24;
                    }
                    int i76 = i19;
                    for (int i77 = i24; i77 < size; i77++) {
                        p pVar5 = arrayList.get(z14 ? size - (i77 + 1) : i77);
                        t6.e eVar5 = pVar5.f168840b;
                        f fVar5 = pVar5.f168847i;
                        f fVar6 = pVar5.f168846h;
                        if (eVar5.f162623k0 == 8) {
                            fVar6.d(i76);
                            fVar5.d(i76);
                        } else {
                            int i78 = z14 ? i76 - i75 : i76 + i75;
                            if (i77 > 0 && i77 >= i30) {
                                i78 = z14 ? i78 - fVar6.f168808f : i78 + fVar6.f168808f;
                            }
                            if (z14) {
                                fVar5.d(i78);
                            } else {
                                fVar6.d(i78);
                            }
                            g gVar4 = pVar5.f168843e;
                            int iMin = gVar4.f168809g;
                            if (pVar5.f168842d == t6.e.b.MATCH_CONSTRAINT && pVar5.f168839a == 1) {
                                iMin = Math.min(iMin, gVar4.f168824m);
                            }
                            i76 = z14 ? i78 - iMin : i78 + iMin;
                            if (z14) {
                                fVar6.d(i76);
                            } else {
                                fVar5.d(i76);
                            }
                            if (i77 < i34 && i77 < i14) {
                                i76 = z14 ? i76 - (-fVar5.f168808f) : i76 + (-fVar5.f168808f);
                            }
                        }
                    }
                    return;
                }
                if (i66 == 2) {
                    int i79 = this.f168844f;
                    t6.e eVar6 = this.f168840b;
                    float f25 = i79 == 0 ? eVar6.f162617h0 : eVar6.f162619i0;
                    if (z14) {
                        f25 = 1.0f - f25;
                    }
                    int i84 = (int) (((i29 - i17) * f25) + f16);
                    if (i84 < 0 || i16 > 0) {
                        i84 = i24;
                    }
                    int i85 = z14 ? i19 - i84 : i19 + i84;
                    for (int i86 = i24; i86 < size; i86++) {
                        p pVar6 = arrayList.get(z14 ? size - (i86 + 1) : i86);
                        t6.e eVar7 = pVar6.f168840b;
                        f fVar7 = pVar6.f168847i;
                        f fVar8 = pVar6.f168846h;
                        if (eVar7.f162623k0 == 8) {
                            fVar8.d(i85);
                            fVar7.d(i85);
                        } else {
                            if (i86 > 0 && i86 >= i30) {
                                i85 = z14 ? i85 - fVar8.f168808f : i85 + fVar8.f168808f;
                            }
                            if (z14) {
                                fVar7.d(i85);
                            } else {
                                fVar8.d(i85);
                            }
                            g gVar5 = pVar6.f168843e;
                            int i87 = gVar5.f168809g;
                            if (pVar6.f168842d == t6.e.b.MATCH_CONSTRAINT && pVar6.f168839a == 1) {
                                i87 = gVar5.f168824m;
                            }
                            i85 = z14 ? i85 - i87 : i85 + i87;
                            if (z14) {
                                fVar8.d(i85);
                            } else {
                                fVar7.d(i85);
                            }
                            if (i86 < i34 && i86 < i14) {
                                i85 = z14 ? i85 - (-fVar7.f168808f) : i85 + (-fVar7.f168808f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // u6.p
    public final void d() {
        ArrayList<p> arrayList = this.f168793k;
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        t6.e eVar = arrayList.get(0).f168840b;
        t6.e eVar2 = arrayList.get(size - 1).f168840b;
        int i14 = this.f168844f;
        f fVar = this.f168847i;
        f fVar2 = this.f168846h;
        if (i14 == 0) {
            t6.d dVar = eVar.L;
            t6.d dVar2 = eVar2.N;
            f fVarI = p.i(dVar, 0);
            int iE = dVar.e();
            t6.e eVarM = m();
            if (eVarM != null) {
                iE = eVarM.L.e();
            }
            if (fVarI != null) {
                p.b(fVar2, fVarI, iE);
            }
            f fVarI2 = p.i(dVar2, 0);
            int iE2 = dVar2.e();
            t6.e eVarN = n();
            if (eVarN != null) {
                iE2 = eVarN.N.e();
            }
            if (fVarI2 != null) {
                p.b(fVar, fVarI2, -iE2);
            }
        } else {
            t6.d dVar3 = eVar.M;
            t6.d dVar4 = eVar2.O;
            f fVarI3 = p.i(dVar3, 1);
            int iE3 = dVar3.e();
            t6.e eVarM2 = m();
            if (eVarM2 != null) {
                iE3 = eVarM2.M.e();
            }
            if (fVarI3 != null) {
                p.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = p.i(dVar4, 1);
            int iE4 = dVar4.e();
            t6.e eVarN2 = n();
            if (eVarN2 != null) {
                iE4 = eVarN2.O.e();
            }
            if (fVarI4 != null) {
                p.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f168803a = this;
        fVar.f168803a = this;
    }

    @Override // u6.p
    public final void e() {
        int i14 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f168793k;
            if (i14 >= arrayList.size()) {
                return;
            }
            arrayList.get(i14).e();
            i14++;
        }
    }

    @Override // u6.p
    public final void f() {
        this.f168841c = null;
        Iterator<p> it = this.f168793k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // u6.p
    public final long j() {
        ArrayList<p> arrayList = this.f168793k;
        int size = arrayList.size();
        long j8 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            p pVar = arrayList.get(i14);
            j8 = ((long) pVar.f168847i.f168808f) + pVar.j() + j8 + ((long) pVar.f168846h.f168808f);
        }
        return j8;
    }

    @Override // u6.p
    public final boolean k() {
        ArrayList<p> arrayList = this.f168793k;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!arrayList.get(i14).k()) {
                return false;
            }
        }
        return true;
    }

    public final t6.e m() {
        int i14 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f168793k;
            if (i14 >= arrayList.size()) {
                return null;
            }
            t6.e eVar = arrayList.get(i14).f168840b;
            if (eVar.f162623k0 != 8) {
                return eVar;
            }
            i14++;
        }
    }

    public final t6.e n() {
        ArrayList<p> arrayList = this.f168793k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t6.e eVar = arrayList.get(size).f168840b;
            if (eVar.f162623k0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChainRun ");
        sb3.append(this.f168844f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f168793k) {
            sb3.append("<");
            sb3.append(pVar);
            sb3.append("> ");
        }
        return sb3.toString();
    }
}
