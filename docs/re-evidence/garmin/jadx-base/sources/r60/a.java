package r60;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j92.e;
import j92.f;
import l72.y0;
import oi0.h;
import org.joda.time.DateTime;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:47:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0223  */
    /* JADX WARN: Code duplicated, block: B:57:0x0290  */
    public static final void a(g60.b bVar, m mVar, int i14) {
        o0 o0Var;
        Double d14;
        o0 o0VarE = mVar.E(2021564134);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            s60.a aVar = new s60.a(context);
            h hVar = new h(context);
            DateTime dateTimeF = bVar != null ? bVar.f() : null;
            l22.a aVar2 = aVar.f157613a;
            String strA = dateTimeF != null ? aVar2.a(R.string.lbl_common_since_date, j0.n(dateTimeF, 'M')) : aVar.f157616d;
            Double dB = bVar != null ? bVar.b() : null;
            String strD = (bVar == null || (d14 = bVar.d()) == null) ? null : hVar.d((long) d14.doubleValue(), false);
            r.a aVar3 = r.S;
            r rVarD = x2.d(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            r rVarB = a2.b(l.C(rVarD, f14, eVar.f97921f, f15, 0.0f, 8), a2.a(o0VarE), true);
            h4.d.f81522a.getClass();
            g.a aVar4 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_css);
            f fVar = d92.b.f58624b;
            fVar.getClass();
            String str = strD;
            String str2 = strA;
            Double d15 = dB;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(f.f97931h), o0VarE), o0VarE, 0, 0, 131070);
            bVar2.getClass();
            float f16 = eVar.f97917b;
            bVar2.getClass();
            r rVarC2 = l.C(aVar3, 0.0f, f16, 0.0f, eVar.f97922g, 5);
            boolean zB = o0VarE.B(str2) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            m.a aVar6 = m.f135153a;
            if (zB) {
                objQ = new a42.b(str2, context, 12);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a42.b(str2, context, 12);
                    o0VarE.K(objQ);
                }
            }
            r rVarB2 = v.b(rVarC2, (e23.l) objQ);
            fVar.getClass();
            mh.c(str2, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            String strA2 = aVar.a(d15, null);
            bVar2.getClass();
            r rVarC3 = l.C(aVar3, 0.0f, eVar.f97922g, 0.0f, 0.0f, 13);
            boolean zB2 = o0VarE.B(str) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new a42.b(str, context, 13);
                o0VarE.K(objQ2);
            } else {
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new a42.b(str, context, 13);
                    o0VarE.K(objQ2);
                }
            }
            r rVarB3 = v.b(rVarC3, (e23.l) objQ2);
            fVar.getClass();
            mh.c(strA2, rVarB3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(f.f97928e), o0VarE), o0VarE, 0, 0, 131068);
            String strA3 = aVar2.a(R.string.chart_pace_title, aVar2.getString(R.string.lbl_minute_100_meters));
            boolean zB3 = o0VarE.B(strA3) | o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zB3) {
                objQ3 = new a42.b(strA3, context, 14);
                o0VarE.K(objQ3);
            } else {
                aVar6.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a42.b(strA3, context, 14);
                    o0VarE.K(objQ3);
                }
            }
            r rVarB4 = v.b(aVar3, (e23.l) objQ3);
            fVar.getClass();
            x0 x0Var = f.f97932i;
            mh.c(strA3, rVarB4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            l.f(b0Var.a(aVar3, 1.0f, true), o0VarE);
            bVar2.getClass();
            r rVarC4 = l.C(aVar3, 0.0f, eVar.f97923h, 0.0f, 0.0f, 13);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_css_representation);
            fVar.getClass();
            mh.c(strQ2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(bVar, i14, 17);
        }
    }
}
