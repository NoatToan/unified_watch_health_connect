package t6;

import i3.e5;
import java.util.HashMap;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f162564y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f162565z0 = true;
    public int A0 = 0;
    public boolean B0 = false;

    public a(String str) {
        this.f162627m0 = str;
    }

    @Override // t6.e
    public final boolean C() {
        return this.B0;
    }

    @Override // t6.e
    public final boolean D() {
        return this.B0;
    }

    public final boolean a0() {
        int i14;
        int i15;
        int i16;
        boolean z14 = true;
        int i17 = 0;
        while (true) {
            i14 = this.f162691x0;
            if (i17 >= i14) {
                break;
            }
            e eVar = this.f162690w0[i17];
            if ((this.f162565z0 || eVar.d()) && ((((i15 = this.f162564y0) == 0 || i15 == 1) && !eVar.C()) || (((i16 = this.f162564y0) == 2 || i16 == 3) && !eVar.D()))) {
                z14 = false;
            }
            i17++;
        }
        if (!z14 || i14 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z15 = false;
        for (int i18 = 0; i18 < this.f162691x0; i18++) {
            e eVar2 = this.f162690w0[i18];
            if (this.f162565z0 || eVar2.d()) {
                if (!z15) {
                    int i19 = this.f162564y0;
                    if (i19 == 0) {
                        iMax = eVar2.k(d.a.LEFT).d();
                    } else if (i19 == 1) {
                        iMax = eVar2.k(d.a.RIGHT).d();
                    } else if (i19 == 2) {
                        iMax = eVar2.k(d.a.TOP).d();
                    } else if (i19 == 3) {
                        iMax = eVar2.k(d.a.BOTTOM).d();
                    }
                    z15 = true;
                }
                int i24 = this.f162564y0;
                if (i24 == 0) {
                    iMax = Math.min(iMax, eVar2.k(d.a.LEFT).d());
                } else if (i24 == 1) {
                    iMax = Math.max(iMax, eVar2.k(d.a.RIGHT).d());
                } else if (i24 == 2) {
                    iMax = Math.min(iMax, eVar2.k(d.a.TOP).d());
                } else if (i24 == 3) {
                    iMax = Math.max(iMax, eVar2.k(d.a.BOTTOM).d());
                }
            }
        }
        int i25 = iMax + this.A0;
        int i26 = this.f162564y0;
        if (i26 == 0 || i26 == 1) {
            M(i25, i25);
        } else {
            N(i25, i25);
        }
        this.B0 = true;
        return true;
    }

    public final int b0() {
        int i14 = this.f162564y0;
        if (i14 == 0 || i14 == 1) {
            return 0;
        }
        return (i14 == 2 || i14 == 3) ? 1 : -1;
    }

    @Override // t6.e
    public final void c(m6.d dVar, boolean z14) {
        boolean z15;
        int i14;
        int i15;
        d[] dVarArr = this.T;
        d dVar2 = this.L;
        dVarArr[0] = dVar2;
        int i16 = 2;
        d dVar3 = this.M;
        dVarArr[2] = dVar3;
        d dVar4 = this.N;
        dVarArr[1] = dVar4;
        d dVar5 = this.O;
        dVarArr[3] = dVar5;
        for (d dVar6 : dVarArr) {
            dVar6.f162591i = dVar.k(dVar6);
        }
        int i17 = this.f162564y0;
        if (i17 < 0 || i17 >= 4) {
            return;
        }
        d dVar7 = dVarArr[i17];
        if (!this.B0) {
            a0();
        }
        if (this.B0) {
            this.B0 = false;
            int i18 = this.f162564y0;
            if (i18 == 0 || i18 == 1) {
                dVar.d(dVar2.f162591i, this.f162607c0);
                dVar.d(dVar4.f162591i, this.f162607c0);
                return;
            } else {
                if (i18 == 2 || i18 == 3) {
                    dVar.d(dVar3.f162591i, this.f162609d0);
                    dVar.d(dVar5.f162591i, this.f162609d0);
                    return;
                }
                return;
            }
        }
        int i19 = 0;
        while (true) {
            if (i19 >= this.f162691x0) {
                z15 = false;
                break;
            }
            e eVar = this.f162690w0[i19];
            if ((this.f162565z0 || eVar.d()) && ((((i15 = this.f162564y0) == 0 || i15 == 1) && eVar.W[0] == e.b.MATCH_CONSTRAINT && eVar.L.f162588f != null && eVar.N.f162588f != null) || ((i15 == 2 || i15 == 3) && eVar.W[1] == e.b.MATCH_CONSTRAINT && eVar.M.f162588f != null && eVar.O.f162588f != null))) {
                z15 = true;
                break;
            }
            i19++;
        }
        boolean z16 = dVar2.g() || dVar4.g();
        boolean z17 = dVar3.g() || dVar5.g();
        int i24 = !(!z15 && (((i14 = this.f162564y0) == 0 && z16) || ((i14 == 2 && z17) || ((i14 == 1 && z16) || (i14 == 3 && z17))))) ? 4 : 5;
        int i25 = 0;
        while (i25 < this.f162691x0) {
            e eVar2 = this.f162690w0[i25];
            if (this.f162565z0 || eVar2.d()) {
                m6.h hVarK = dVar.k(eVar2.T[this.f162564y0]);
                d[] dVarArr2 = eVar2.T;
                int i26 = this.f162564y0;
                d dVar8 = dVarArr2[i26];
                dVar8.f162591i = hVarK;
                d dVar9 = dVar8.f162588f;
                int i27 = (dVar9 == null || dVar9.f162586d != this) ? 0 : dVar8.f162589g;
                if (i26 == 0 || i26 == i16) {
                    m6.h hVar = dVar7.f162591i;
                    int i28 = this.A0 - i27;
                    m6.b bVarL = dVar.l();
                    m6.h hVarM = dVar.m();
                    hVarM.f116857e = 0;
                    bVarL.d(hVar, hVarK, hVarM, i28);
                    dVar.c(bVarL);
                } else {
                    m6.h hVar2 = dVar7.f162591i;
                    int i29 = this.A0 + i27;
                    m6.b bVarL2 = dVar.l();
                    m6.h hVarM2 = dVar.m();
                    hVarM2.f116857e = 0;
                    bVarL2.c(hVar2, hVarK, hVarM2, i29);
                    dVar.c(bVarL2);
                }
                dVar.e(dVar7.f162591i, hVarK, this.A0 + i27, i24);
            }
            i25++;
            i16 = 2;
        }
        int i30 = this.f162564y0;
        if (i30 == 0) {
            dVar.e(dVar4.f162591i, dVar2.f162591i, 0, 8);
            dVar.e(dVar2.f162591i, this.X.N.f162591i, 0, 4);
            dVar.e(dVar2.f162591i, this.X.L.f162591i, 0, 0);
            return;
        }
        if (i30 == 1) {
            dVar.e(dVar2.f162591i, dVar4.f162591i, 0, 8);
            dVar.e(dVar2.f162591i, this.X.L.f162591i, 0, 4);
            dVar.e(dVar2.f162591i, this.X.N.f162591i, 0, 0);
        } else if (i30 == 2) {
            dVar.e(dVar5.f162591i, dVar3.f162591i, 0, 8);
            dVar.e(dVar3.f162591i, this.X.O.f162591i, 0, 4);
            dVar.e(dVar3.f162591i, this.X.M.f162591i, 0, 0);
        } else if (i30 == 3) {
            dVar.e(dVar3.f162591i, dVar5.f162591i, 0, 8);
            dVar.e(dVar3.f162591i, this.X.M.f162591i, 0, 4);
            dVar.e(dVar3.f162591i, this.X.O.f162591i, 0, 0);
        }
    }

    @Override // t6.e
    public final boolean d() {
        return true;
    }

    @Override // t6.i, t6.e
    public final void h(e eVar, HashMap<e, e> map) {
        super.h(eVar, map);
        a aVar = (a) eVar;
        this.f162564y0 = aVar.f162564y0;
        this.f162565z0 = aVar.f162565z0;
        this.A0 = aVar.A0;
    }

    @Override // t6.e
    public final String toString() {
        String strO = am.j.o(this.f162627m0, " {", new StringBuilder("[Barrier] "));
        for (int i14 = 0; i14 < this.f162691x0; i14++) {
            e eVar = this.f162690w0[i14];
            if (i14 > 0) {
                strO = strO.concat(", ");
            }
            StringBuilder sbK = e5.k(strO);
            sbK.append(eVar.f162627m0);
            strO = sbK.toString();
        }
        return strO.concat(StringSubstitutor.DEFAULT_VAR_END);
    }

    public a() {
    }
}
