package t21;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import l72.f3;
import org.joda.time.format.DateTimeFormat;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 {
    public static final void a(s21.w wVar, v21.e eVar, p3.m mVar, int i14) {
        String string;
        Object obj = wVar;
        v21.e eVar2 = eVar;
        obj.getClass();
        eVar2.getClass();
        l22.a aVar = eVar2.f175325b;
        p3.o0 o0VarE = mVar.E(438799639);
        int i15 = i14 | (o0VarE.r(obj) ? 4 : 2) | (o0VarE.r(eVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF2 = x2.f(aVar2, 1.0f);
            h4.g.a aVar4 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(rVarF2, aVar4);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            float f15 = eVar3.f97920e;
            h4.r rVarC2 = c2.l.C(rVarB, 0.0f, f14, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.confirm_personal_details);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            h4.r rVarB2 = b0Var.b(x2.f(aVar2, 1.0f), aVar4);
            bVar2.getClass();
            float f16 = eVar3.f97918c;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(rVarB2, 0.0f, f16, 0.0f, eVar3.f97920e, 5);
            bVar2.getClass();
            h4.r rVarA = c2.l.A(rVarC3, f15, 0.0f, 2);
            String strQ2 = gl1.y.Q(o0VarE, R.string.personal_details_usage_info);
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97933j;
            mh.c(strQ2, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 130044);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_gender);
            String str = wVar.f156188a;
            s21.f0.f156107c.getClass();
            f3.a(strQ3, null, aVar.getString(s21.f0.a.a(str).f156114b), null, null, o0VarE, 0, 26);
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_birthdate);
            b63.o oVar = wVar.f156189b;
            if (oVar == null || (string = DateTimeFormat.mediumDate().print(g22.l.h(oVar))) == null) {
                string = aVar.getString(R.string.no_value);
            }
            f3.a(strQ4, null, string, null, null, o0VarE, 0, 26);
            f3.a(gl1.y.Q(o0VarE, R.string.lbl_height), null, eVar.q(wVar.f156190c, wVar.f156191d), null, null, o0VarE, 0, 26);
            h4.r rVarF3 = x2.f(aVar2, 1.0f);
            bVar2.getClass();
            h4.r rVarC4 = c2.l.C(rVarF3, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(rVarC4, f15, 0.0f, 2);
            String strQ5 = gl1.y.Q(o0VarE, R.string.personal_details_edit_info);
            int i17 = d6.h.f57753c;
            fVar.getClass();
            s5.x0 x0VarB = d92.c.b(x0Var, o0VarE);
            d6.h hVarA = d6.h.a(i17);
            obj = wVar;
            eVar2 = eVar;
            mh.c(strQ5, rVarA2, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(obj, eVar2, i14, 4);
        }
    }
}
