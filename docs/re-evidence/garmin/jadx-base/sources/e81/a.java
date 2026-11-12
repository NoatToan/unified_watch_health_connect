package e81;

import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d50.i;
import ds.c0;
import f02.e;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import i53.f;
import java.util.ArrayList;
import n61.d;
import o13.p;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v.h;
import z72.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(r rVar, Integer num, d dVar, n61.b bVar, m mVar, int i14) {
        Float fValueOf;
        f fVarJ;
        int i15;
        rVar.getClass();
        o0 o0VarE = mVar.E(-360422703);
        int i16 = i14 | (o0VarE.B(num) ? 32 : 16) | (o0VarE.B(dVar) ? 256 : 128) | (o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (num == null || dVar == null) {
                fValueOf = null;
            } else {
                double dIntValue = num.intValue();
                double d14 = dVar.f123847h;
                fValueOf = Float.valueOf((float) ((dIntValue - d14) / (((double) dVar.f123848i) - d14)));
            }
            if (dVar != null) {
                p<Integer, Integer> pVar = dVar.f123846g;
                p<Integer, Integer> pVar2 = dVar.f123845f;
                p<Integer, Integer> pVar3 = dVar.f123844e;
                p<Integer, Integer> pVar4 = dVar.f123843d;
                p<Integer, Integer> pVar5 = dVar.f123842c;
                p<Integer, Integer> pVar6 = dVar.f123841b;
                p<Integer, Integer> pVar7 = dVar.f123840a;
                o0VarE.C(66044280);
                float fIntValue = pVar7.f128595b.intValue() - pVar7.f128594a.intValue();
                float fIntValue2 = pVar6.f128595b.intValue() - pVar6.f128594a.intValue();
                float fIntValue3 = pVar5.f128595b.intValue() - pVar5.f128594a.intValue();
                float fIntValue4 = pVar4.f128595b.intValue() - pVar4.f128594a.intValue();
                float fIntValue5 = pVar3.f128595b.intValue() - pVar3.f128594a.intValue();
                float fIntValue6 = pVar2.f128595b.intValue() - pVar2.f128594a.intValue();
                float fIntValue7 = pVar.f128595b.intValue() - pVar.f128594a.intValue();
                n61.b.a aVar = n61.b.f123808d;
                n61.b bVar2 = n61.b.RECREATIONAL;
                aVar.getClass();
                fVarJ = i53.a.a(new l(fIntValue, n61.b.a.b(bVar2, o0VarE), null), new l(fIntValue2, n61.b.a.b(n61.b.INTERMEDIATE, o0VarE), null), new l(fIntValue3, n61.b.a.b(n61.b.TRAINED, o0VarE), null), new l(fIntValue4, n61.b.a.b(n61.b.WELL_TRAINED, o0VarE), null), new l(fIntValue5, n61.b.a.b(n61.b.EXPERT, o0VarE), null), new l(fIntValue6, n61.b.a.b(n61.b.SUPERIOR, o0VarE), null), new l(fIntValue7, n61.b.a.b(n61.b.ELITE, o0VarE), null));
                i15 = 0;
                o0VarE.g0(false);
            } else {
                o0VarE.C(67655567);
                float length = 1.0f / n61.b.values().length;
                ArrayList arrayList = new ArrayList();
                int length2 = n61.b.values().length;
                if (1 <= length2) {
                    int i17 = 1;
                    while (true) {
                        e.f67730a.getClass();
                        arrayList.add(new l(length, e.c(o0VarE), null));
                        if (i17 == length2) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                fVarJ = i53.a.j(arrayList);
                i15 = 0;
                o0VarE.g0(false);
            }
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, i15);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar3 = r.S;
            z72.k.a(x2.h(aVar3, yz1.y.k(o0VarE)), fVarJ, fValueOf, null, null, yz1.y.g(o0VarE), 3.0f, false, false, z3.f.c(-1702611973, new c0(num, 1), o0VarE), o0VarE, 806879232, 408);
            String strQ = gl1.y.Q(o0VarE, bVar != null ? bVar.f123819b : R.string.no_data_label);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarB = b0Var.b(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), h4.d.a.f81537o);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar, num, dVar, bVar, i14, 11);
        }
    }
}
