package w02;

import c2.h2;
import c2.l2;
import f5.z0;
import java.util.HashSet;
import o4.s0;
import p008y1.b2;
import p008y1.e1;
import p008y1.r2;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import p3.y3;
import u1.r1;
import u1.t1;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3 f181115a = new y3(new vv0.u(23));

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181116a;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f181116a = iArr;
        }
    }

    public static final void a(h4.r rVar, r rVar2, h2 h2Var, c2.j.l lVar, h4.d.b bVar, e1 e1Var, boolean z14, r1 r1Var, e23.l lVar2, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar3;
        h2 h2Var2;
        c2.j.l lVar3;
        h4.d.b bVar2;
        e1 e1Var2;
        r1 r1VarA;
        lVar2.getClass();
        o0 o0VarE = mVar.E(1381880412);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i18 = i16 | (o0VarE.B(rVar2) ? 32 : 16) | 46869888 | (o0VarE.r(lVar2) ? 536870912 : 268435456);
        boolean z15 = true;
        if (o0VarE.n(i18 & 1, (306783379 & i18) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r rVar4 = i17 != 0 ? h4.r.S : rVar;
                g6.f.a aVar = g6.f.f75994b;
                l2 l2VarA = c2.l.a(0);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                h4.g.a aVar2 = h4.d.a.f81536n;
                r2.f193614a.getClass();
                p008y1.b0 b0VarA = r2.a(o0VarE);
                r1VarA = t1.a(o0VarE);
                e1Var2 = b0VarA;
                bVar2 = aVar2;
                lVar3 = kVar;
                h2Var2 = l2VarA;
                rVar3 = rVar4;
            } else {
                o0VarE.e();
                rVar3 = rVar;
                h2Var2 = h2Var;
                lVar3 = lVar;
                bVar2 = bVar;
                e1Var2 = e1Var;
                z15 = z14;
                r1VarA = r1Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p3.v.a(f181115a.c(rVar2), z3.f.c(-810646116, new f21.r(rVar3, rVar2, h2Var2, lVar3, bVar2, e1Var2, z15, r1VarA, lVar2), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
            rVar3 = rVar;
            h2Var2 = h2Var;
            lVar3 = lVar;
            bVar2 = bVar;
            e1Var2 = e1Var;
            z15 = z14;
            r1VarA = r1Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e2.b(rVar3, rVar2, h2Var2, lVar3, bVar2, e1Var2, z15, r1VarA, lVar2, i14, i15, 9);
        }
    }

    public static final void b(e2.d dVar, Object obj, e2.d dVar2, h4.r rVar, boolean z14, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        boolean z15;
        h4.r rVarC;
        boolean z16;
        o0 o0VarE = mVar.E(-269426986);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(obj) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(dVar2) ? 256 : 128;
        }
        int i16 = i15 | 27648;
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            r rVar3 = (r) o0VarE.A(f181115a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj2 = p3.m.a.f135155b;
            if (objQ == obj2) {
                objQ = p0.f(new k(rVar3, 0));
                o0VarE.K(objQ);
            }
            x3 x3Var = (x3) objQ;
            rVar3.getClass();
            obj.getClass();
            p3.d0 d0VarF = p0.f(new vv0.n(8, obj, rVar3));
            if (((Boolean) d0VarF.getF182175a()).booleanValue()) {
                o0VarE.C(794994108);
                h4.r rVarB = h4.p.b(aVar, 1.0f);
                boolean zB = o0VarE.B(rVar3);
                Object objQ2 = o0VarE.q();
                if (zB || objQ2 == obj2) {
                    objQ2 = new b(2, rVar3, x3Var);
                    o0VarE.K(objQ2);
                }
                rVarC = s0.a(rVarB, (e23.l) objQ2);
                o0VarE.g0(false);
            } else {
                o0VarE.C(795416390);
                o0VarE.g0(false);
                rVarC = e2.d.c(dVar, aVar);
            }
            aVar.getClass();
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            boolean zB2 = o0VarE.B(rVar3) | o0VarE.B(obj);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == obj2) {
                objQ3 = new j(dVar2, rVar3, obj);
                o0VarE.K(objQ3);
            }
            Object obj3 = (Boolean) d0VarF.getF182175a();
            obj3.getClass();
            eVar.invoke((j) objQ3, obj3, o0VarE, Integer.valueOf((i16 >> 9) & 896));
            o0VarE.g0(true);
            HashSet<Object> hashSet = rVar3.f181133l;
            boolean zB3 = ((i16 & 57344) == 16384) | o0VarE.B(rVar3) | o0VarE.r(obj);
            Object objQ4 = o0VarE.q();
            if (zB3 || objQ4 == obj2) {
                z16 = true;
                objQ4 = new l(true, rVar3, obj, null);
                o0VarE.K(objQ4);
            } else {
                z16 = true;
            }
            l0.f(hashSet, true, (e23.p) objQ4, o0VarE);
            z15 = z16;
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ux1.e(dVar, obj, dVar2, rVar2, z15, eVar, i14);
        }
    }
}
