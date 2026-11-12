package gt1;

import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g02.h0;
import gl1.y;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    public static final void a(String str, String str2, h4.r rVar, e23.a aVar, p3.m mVar, int i14) {
        g11.e eVar;
        s5.c.b bVar;
        j92.f fVar;
        x0 x0Var;
        int iJ;
        int iJ2;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(2071316054);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_description);
            String strQ2 = y.Q(o0VarE, R.string.lbl_community_notes);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                eVar = new g11.e(26);
                bVar = new s5.c.b(0, 1, null);
                d92.b.f58623a.getClass();
                fVar = d92.b.f58624b;
                fVar.getClass();
                x0Var = j92.f.f97930g;
                iJ = bVar.j(x0Var.f157322a);
                bVar.b(strQ);
                Unit unit = Unit.INSTANCE;
                bVar.f(iJ);
                eVar.invoke(bVar);
                bVar.b(str);
                if (str2.length() > 0) {
                    eVar.invoke(bVar);
                    fVar.getClass();
                    iJ2 = bVar.j(x0Var.f157322a);
                    bVar.b(strQ2);
                    bVar.f(iJ2);
                    eVar.invoke(bVar);
                    bVar.b(str2);
                }
                objQ = bVar.k();
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    eVar = new g11.e(26);
                    bVar = new s5.c.b(0, 1, null);
                    d92.b.f58623a.getClass();
                    fVar = d92.b.f58624b;
                    fVar.getClass();
                    x0Var = j92.f.f97930g;
                    iJ = bVar.j(x0Var.f157322a);
                    try {
                        bVar.b(strQ);
                        Unit unit2 = Unit.INSTANCE;
                        bVar.f(iJ);
                        eVar.invoke(bVar);
                        bVar.b(str);
                        if (str2.length() > 0) {
                            eVar.invoke(bVar);
                            fVar.getClass();
                            iJ2 = bVar.j(x0Var.f157322a);
                            try {
                                bVar.b(strQ2);
                                bVar.f(iJ2);
                                eVar.invoke(bVar);
                                bVar.b(str2);
                            } catch (Throwable th3) {
                                bVar.f(iJ2);
                                throw th3;
                            }
                        }
                        objQ = bVar.k();
                        o0VarE.K(objQ);
                    } catch (Throwable th4) {
                        bVar.f(iJ);
                        throw th4;
                    }
                }
            }
            s5.c cVar = (s5.c) objQ;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var2 = j92.f.f97931h;
            g02.q.c(cVar, null, 5, null, null, null, null, x0.a(x0Var2, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 384, 122);
            String strQ3 = y.Q(o0VarE, R.string.suggest_a_description_update_sentence_case);
            h4.r.a aVar4 = h4.r.S;
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new h0(aVar, 22);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new h0(aVar, 22);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarD = u1.w.d(aVar4, false, null, null, (e23.a) objQ2, 15);
            fVar2.getClass();
            mh.c(strQ3, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var2, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(str, str2, rVar, aVar, i14, 6);
        }
    }
}
