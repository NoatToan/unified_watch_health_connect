package i91;

import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d6.p;
import e23.l;
import g02.o;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.c1;
import i3.mh;
import i3.p7;
import java.util.List;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import r1.c0;
import r1.g0;
import r1.u0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(s5.c cVar, r rVar, int i14, x0 x0Var, p1 p1Var, String str, String str2, x0 x0Var2, List list, l lVar, m mVar, int i15) {
        int i16;
        x0 x0Var3;
        String str3;
        String str4;
        x0 x0Var4;
        int i17;
        x0 x0Var5;
        int i18;
        x0 x0Var6;
        String str5;
        String str6;
        float f14;
        p1 p1Var2;
        String str7;
        String str8;
        x0 x0Var7;
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1603586482);
        int i19 = i15 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | 4785536 | (o0VarE.r(list) ? 67108864 : 33554432) | (o0VarE.r(lVar) ? 536870912 : 268435456);
        if (o0VarE.n(i19 & 1, (306783379 & i19) != 306783378)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                d92.b bVar = d92.b.f58623a;
                bVar.getClass();
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0Var8 = j92.f.f97932i;
                x0 x0VarB = d92.c.b(x0Var8, o0VarE);
                String strQ = y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                String strQ2 = y.Q(o0VarE, R.string.lbl_show_less);
                bVar.getClass();
                fVar.getClass();
                x0 x0VarA = x0.a(x0Var8, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                i17 = i19 & (-33496065);
                x0Var5 = x0VarA;
                i18 = 3;
                x0Var6 = x0VarB;
                str5 = strQ;
                str6 = strQ2;
            } else {
                o0VarE.e();
                x0Var6 = x0Var;
                str5 = str;
                str6 = str2;
                x0Var5 = x0Var2;
                i17 = i19 & (-33496065);
                i18 = i14;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            boolean zIsEmpty = list.isEmpty();
            boolean z14 = !zIsEmpty;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(z14, o0VarE);
            }
            p1 p1Var3 = (p1) objQ;
            boolean zR = o0VarE.r(list);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ad.b(list, 8);
                o0VarE.K(objQ2);
            }
            h2.b bVarB = h2.o0.b(0, (e23.a) objQ2, o0VarE, 0, 3);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            String str9 = str5;
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            String str10 = str6;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            x0 x0Var9 = x0Var5;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar2 = r.S;
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                f14 = 0;
                g6.f.a aVar3 = g6.f.f75994b;
            } else {
                c1.f87691a.getClass();
                f14 = c1.f87693c.f22739d;
            }
            r rVarA = g0.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f14, 7), null, 3);
            int i24 = ((Boolean) p1Var.getF182175a()).booleanValue() ? Integer.MAX_VALUE : i18;
            p.f57793b.getClass();
            int i25 = p.f57795d;
            boolean zH = o0VarE.h(z14);
            Object objQ3 = o0VarE.q();
            if (zH || objQ3 == c2565a) {
                p1Var2 = p1Var;
                objQ3 = new bg2.e(z14, p1Var2, i18, p1Var3);
                o0VarE.K(objQ3);
            } else {
                p1Var2 = p1Var;
            }
            mh.d(cVar, rVarA, 0L, 0L, 0L, null, 0L, i25, false, i24, 0, null, (l) objQ3, x0Var6, o0VarE, i17 & 14, 384, 110588);
            c0.c(b0Var, ((Boolean) p1Var2.getF182175a()).booleanValue() && !zIsEmpty, null, u0.c(null, null, 15), u0.j(null, null, 15), null, z3.f.c(878776476, new gw1.e(bVarB, 10, list, lVar), o0VarE), o0VarE, 1600518, 18);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarE.C(2036067913);
                y3 y3Var = p7.f89282d;
                g6.f.f75994b.getClass();
                str7 = str9;
                str8 = str10;
                x0Var7 = x0Var9;
                v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-408564769, new o(p1Var2, str8, str7, x0Var7, 1), o0VarE), o0VarE, 56);
                o0VarE.g0(false);
            } else {
                str7 = str9;
                str8 = str10;
                x0Var7 = x0Var9;
                o0VarE.C(2036826142);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            i16 = i18;
            str4 = str8;
            str3 = str7;
            x0Var4 = x0Var7;
            x0Var3 = x0Var6;
        } else {
            o0VarE.e();
            i16 = i14;
            x0Var3 = x0Var;
            str3 = str;
            str4 = str2;
            x0Var4 = x0Var2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(cVar, rVar, i16, x0Var3, p1Var, str3, str4, x0Var4, list, lVar, i15);
        }
    }
}
