package gs;

import aq.m2;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.t1;
import l72.x0;
import nr.l0;
import nr.p0;
import o4.f0;
import p13.h0;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    public static final void a(List<l0> list, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1746741144);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l0 l0Var = (l0) h0.e0(0, list);
            r22.p pVar = l0Var != null ? l0Var.f127250a : null;
            l0 l0Var2 = (l0) h0.e0(1, list);
            r22.p pVar2 = l0Var2 != null ? l0Var2.f127250a : null;
            x0 x0Var = x0.f111346a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            x0Var.e(c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), z3.f.c(-328729041, new b(pVar, pVar2, 3), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    public static final void b(h4.r rVar, List<? extends List<LatLng>> list, int i14, p3.m mVar, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int iJ;
        Object objQ;
        p3.m.a.C2565a c2565a;
        boolean zR;
        Object objQ2;
        o0 o0VarE = mVar.E(-1029254944);
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i24 = i17 | (o0VarE.r(list) ? 32 : 16) | (((i16 & 4) == 0 && o0VarE.k(i14)) ? 256 : 128);
        boolean z14 = true;
        if (o0VarE.n(i24 & 1, (i24 & 147) != 146)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                if ((i16 & 4) != 0) {
                    d92.b.f58623a.getClass();
                    i19 = i24 & (-897);
                    iJ = f0.j(d92.b.a(o0VarE).f().f63508c);
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                if (list == null) {
                    o0VarE.C(-762340121);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-762340120);
                    h4.r rVarG = c2.l.g(rVar, 1.0f);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new g11.e(21);
                        o0VarE.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    if ((((i19 & 896) ^ 384) > 256 || !o0VarE.k(iJ)) && (i19 & 384) != 256) {
                    }
                    zR = o0VarE.r(list) | z14;
                    objQ2 = o0VarE.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new k(iJ, list);
                        o0VarE.K(objQ2);
                    }
                    p002j6.c.b(lVar, rVarG, (e23.l) objQ2, o0VarE, 6, 0);
                    o0VarE.g0(false);
                }
                i18 = iJ;
            } else {
                o0VarE.e();
                if ((i16 & 4) != 0) {
                    i24 &= -897;
                }
            }
            i19 = i24;
            iJ = i14;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            if (list == null) {
                o0VarE.C(-762340121);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-762340120);
                h4.r rVarG2 = c2.l.g(rVar, 1.0f);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new g11.e(21);
                    o0VarE.K(objQ);
                }
                e23.l lVar2 = (e23.l) objQ;
                z14 = ((i19 & 896) ^ 384) > 256 ? false : false;
                zR = o0VarE.r(list) | z14;
                objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new k(iJ, list);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new k(iJ, list);
                    o0VarE.K(objQ2);
                }
                p002j6.c.b(lVar2, rVarG2, (e23.l) objQ2, o0VarE, 6, 0);
                o0VarE.g0(false);
            }
            i18 = iJ;
        } else {
            o0VarE.e();
            i18 = i14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m2(rVar, list, i18, i15, i16, 2);
        }
    }

    public static final void c(h4.r rVar, p0 p0Var, float f14, ds.n nVar, p3.m mVar, int i14) {
        p0Var.getClass();
        o0 o0VarE = mVar.E(-1954995679);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.k(nVar == null ? -1 : nVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p0.a aVar = p0Var.f127286e;
            p0.a.f fVar = aVar instanceof p0.a.f ? (p0.a.f) aVar : null;
            List<List<LatLng>> list = fVar != null ? fVar.f127299a : null;
            y3 y3Var = t1.f91490h;
            v.a(y3Var.c(new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f)), z3.f.c(270796129, new g52.d(rVar, nVar, p0Var, list, 4), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(rVar, p0Var, f14, nVar, i14, 3);
        }
    }
}
