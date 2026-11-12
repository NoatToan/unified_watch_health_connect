package bj0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import g6.o;
import gl1.y;
import h4.r;
import j53.l;
import java.util.List;
import kotlin.t1;
import m92.h0;
import n92.j;
import n92.n;
import o13.p;
import o82.g;
import p005kotlin.Unit;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;
import w5.q;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18340a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130853f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130854g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18340a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x024f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0252  */
    /* JADX WARN: Code duplicated, block: B:109:0x0257  */
    /* JADX WARN: Code duplicated, block: B:111:0x0262  */
    /* JADX WARN: Code duplicated, block: B:113:0x0265  */
    /* JADX WARN: Code duplicated, block: B:118:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:122:0x0308  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final yi0.c cVar, final yi0.b bVar, gj0.f fVar, final r rVar, float f14, float f15, float f16, int i14, m mVar, final int i15) {
        int i16;
        final gj0.f fVar2;
        final float f17;
        final float f18;
        final float f19;
        final int i17;
        i53.c<h0.e.a> cVarB;
        double d14;
        double dFloor;
        double d15;
        double dCeil;
        Object pVar;
        float f22;
        float f24;
        boolean z14;
        boolean z15;
        y3 y3Var;
        y3 y3Var2;
        y3 y3Var3;
        j92.f fVar3;
        x0 x0Var;
        g gVar;
        int i18;
        n dVar;
        n lVar;
        List listB;
        i53.d<yi0.b, i53.c<h0.e.a>> dVar2;
        o0 o0VarE = mVar.E(-605772985);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(cVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(bVar.ordinal()) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= (i15 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        int i19 = i16 | 14376960;
        if (o0VarE.n(i19 & 1, (4793491 & i19) != 4793490)) {
            zi0.a aVar = zi0.a.f204842a;
            aVar.getClass();
            float f25 = zi0.a.f204845d;
            aVar.getClass();
            float f26 = zi0.a.f204846e;
            aVar.getClass();
            float f27 = zi0.a.f204847f;
            x1 x1Var = p3.n.f135158a;
            if (fVar == null || (dVar2 = fVar.f77512a) == null || (cVarB = dVar2.get(bVar)) == null) {
                cVarB = l.b();
            }
            boolean zB = ((i19 & 112) == 32) | o0VarE.B(cVarB);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                if (bVar == yi0.b.W_PER_KG) {
                    pVar = new cj0.a(cVarB).e(5);
                } else {
                    cj0.b bVar2 = new cj0.b(cVarB);
                    d14 = bVar2.f27735a;
                    dFloor = Math.floor(d14 / 50.0d) * 50.0d;
                    if (dFloor == d14) {
                        dFloor = d14 - 50.0d;
                    }
                    Float fValueOf = Float.valueOf((float) dFloor);
                    d15 = bVar2.f27736b;
                    dCeil = Math.ceil(d15 / 50.0d) * 50.0d;
                    if (dCeil == d15) {
                        dCeil = d15 + 50.0d;
                    }
                    pVar = new p(fValueOf, Float.valueOf((float) dCeil));
                }
                o0VarE.K(pVar);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    if (bVar == yi0.b.W_PER_KG) {
                        pVar = new cj0.a(cVarB).e(5);
                    } else {
                        cj0.b bVar3 = new cj0.b(cVarB);
                        d14 = bVar3.f27735a;
                        dFloor = Math.floor(d14 / 50.0d) * 50.0d;
                        if (dFloor == d14) {
                            dFloor = d14 - 50.0d;
                        }
                        Float fValueOf2 = Float.valueOf((float) dFloor);
                        d15 = bVar3.f27736b;
                        dCeil = Math.ceil(d15 / 50.0d) * 50.0d;
                        if (dCeil == d15) {
                            dCeil = d15 + 50.0d;
                        }
                        pVar = new p(fValueOf2, Float.valueOf((float) dCeil));
                    }
                    o0VarE.K(pVar);
                } else {
                    f26 = f26;
                    pVar = objQ;
                }
            }
            p pVar2 = (p) pVar;
            gl.c.f77766a.getClass();
            long jF = gl.c.a(o0VarE).f();
            boolean zB2 = ((i19 & 896) == 256 || ((i19 & 512) != 0 && o0VarE.B(fVar))) | ((i19 & 14) == 4) | o0VarE.B(pVar2);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                i53.c<h0.e.a> cVar2 = cVarB;
                float f28 = f26;
                bj0.a aVar3 = new bj0.a(jF, cVar2, pVar2, fVar, f28);
                f22 = f28;
                bj0.a aVar4 = new bj0.a(cVar2, pVar2, fVar, f27, jF);
                fVar2 = fVar;
                f24 = f27;
                pVar2 = pVar2;
                objQ2 = p0.n(i53.a.a(aVar3, aVar4));
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    i53.c<h0.e.a> cVar3 = cVarB;
                    float f29 = f26;
                    bj0.a aVar5 = new bj0.a(jF, cVar3, pVar2, fVar, f29);
                    f22 = f29;
                    bj0.a aVar6 = new bj0.a(cVar3, pVar2, fVar, f27, jF);
                    fVar2 = fVar;
                    f24 = f27;
                    pVar2 = pVar2;
                    objQ2 = p0.n(i53.a.a(aVar5, aVar6));
                    o0VarE.K(objQ2);
                } else {
                    f22 = f26;
                    fVar2 = fVar;
                    f24 = f27;
                }
            }
            r rVarH = x2.h(x2.f(rVar, 1.0f), f25);
            i53.f fVar4 = (i53.f) ((p1) objQ2).getF182175a();
            String strP = y.P(R.string.common_no_certain_data, new Object[]{y.Q(o0VarE, R.string.lbl_functional_threshold_power_short)}, o0VarE);
            if (fVar2 != null) {
                i53.c<h0.e.a> cVar4 = fVar2.f77512a.get(bVar);
                z14 = true;
                if (!(cVar4 == null || cVar4.isEmpty())) {
                    z15 = true;
                }
                boolean z16 = z15 ^ z14;
                j jVar = new j(new d02.b(), (Float) pVar2.f128594a, (Float) pVar2.f128595b, 5);
                y3Var = t1.f91493k;
                q.b bVar4 = (q.b) o0VarE.A(y3Var);
                y3Var2 = t1.f91490h;
                g6.d dVar3 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
                y3Var3 = t1.f91496n;
                s0 s0Var = new s0(bVar4, dVar3, (o) o0VarE.A(y3Var3), 0, 8, null);
                d92.b.f58623a.getClass();
                fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0Var = j92.f.f97935l;
                n92.g gVar2 = new n92.g(sn.a.c(o0VarE), s0Var, d92.c.f(x0Var, o0VarE), null, 8, null);
                if (fVar2 != null) {
                    gVar = fVar2.f77515d;
                } else {
                    gVar = null;
                }
                if (gVar == null) {
                    i18 = -1;
                } else {
                    i18 = a.f18340a[gVar.ordinal()];
                }
                if (i18 != 1) {
                    if (i18 != 2) {
                        o0VarE.C(874293504);
                        if (fVar2 != null || (listB = fVar2.f77514c) == null) {
                            listB = l.b();
                        }
                        s0 s0Var2 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                        fVar3.getClass();
                        lVar = new n92.m(listB, s0Var2, d92.c.f(x0Var, o0VarE));
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(873699327);
                        i53.c<String> cVar5 = fVar2.f77514c;
                        s0 s0Var3 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                        fVar3.getClass();
                        lVar = new n92.l(cVar5, s0Var3, d92.c.f(x0Var, o0VarE));
                        o0VarE.g0(false);
                    }
                    dVar = lVar;
                } else {
                    o0VarE.C(873085155);
                    i53.c<String> cVar6 = fVar2.f77514c;
                    s0 s0Var4 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                    fVar3.getClass();
                    dVar = new n92.d(cVar6, s0Var4, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                    o0VarE.g0(false);
                }
                m92.r.b(rVarH, fVar4, null, "", z16, strP, 0.0f, 0.0f, new n92.a(jVar, null, gVar2, dVar, 2, null), null, z3.f.c(-913018410, new a42.a(fVar2, 8, bVar, cVar), o0VarE), o0VarE, 3072, 6, 708);
                f17 = f25;
                i17 = 5;
                f18 = f22;
                f19 = f24;
            } else {
                z14 = true;
            }
            z15 = false;
            boolean z17 = z15 ^ z14;
            j jVar2 = new j(new d02.b(), (Float) pVar2.f128594a, (Float) pVar2.f128595b, 5);
            y3Var = t1.f91493k;
            q.b bVar5 = (q.b) o0VarE.A(y3Var);
            y3Var2 = t1.f91490h;
            g6.d dVar4 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3Var3 = t1.f91496n;
            s0 s0Var5 = new s0(bVar5, dVar4, (o) o0VarE.A(y3Var3), 0, 8, null);
            d92.b.f58623a.getClass();
            fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0Var = j92.f.f97935l;
            n92.g gVar3 = new n92.g(sn.a.c(o0VarE), s0Var5, d92.c.f(x0Var, o0VarE), null, 8, null);
            if (fVar2 != null) {
                gVar = fVar2.f77515d;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                i18 = -1;
            } else {
                i18 = a.f18340a[gVar.ordinal()];
            }
            if (i18 != 1) {
                if (i18 != 2) {
                    o0VarE.C(874293504);
                    if (fVar2 != null) {
                        listB = l.b();
                    } else {
                        listB = l.b();
                    }
                    s0 s0Var6 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                    fVar3.getClass();
                    lVar = new n92.m(listB, s0Var6, d92.c.f(x0Var, o0VarE));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(873699327);
                    i53.c<String> cVar7 = fVar2.f77514c;
                    s0 s0Var7 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                    fVar3.getClass();
                    lVar = new n92.l(cVar7, s0Var7, d92.c.f(x0Var, o0VarE));
                    o0VarE.g0(false);
                }
                dVar = lVar;
            } else {
                o0VarE.C(873085155);
                i53.c<String> cVar8 = fVar2.f77514c;
                s0 s0Var8 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                fVar3.getClass();
                dVar = new n92.d(cVar8, s0Var8, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                o0VarE.g0(false);
            }
            m92.r.b(rVarH, fVar4, null, "", z17, strP, 0.0f, 0.0f, new n92.a(jVar2, null, gVar3, dVar, 2, null), null, z3.f.c(-913018410, new a42.a(fVar2, 8, bVar, cVar), o0VarE), o0VarE, 3072, 6, 708);
            f17 = f25;
            i17 = 5;
            f18 = f22;
            f19 = f24;
        } else {
            fVar2 = fVar;
            o0VarE.e();
            f17 = f14;
            f18 = f15;
            f19 = f16;
            i17 = i14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: bj0.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.a(cVar, bVar, fVar2, rVar, f17, f18, f19, i17, (m) obj, p0.t(i15 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
