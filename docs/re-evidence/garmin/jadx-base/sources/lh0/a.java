package lh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g02.f1;
import h5.e0;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(Double d14, Double d15, String str, p3.m mVar, int i14) {
        h4.r.a aVar;
        int i15;
        boolean z14;
        str.getClass();
        o0 o0VarE = mVar.E(163391500);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(d14) ? 4 : 2) | (o0VarE.B(str) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            ih0.i iVar = new ih0.i((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            h4.r.a aVar2 = h4.r.S;
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarA = c2.l.A(aVar2, f14, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (d14 == null || Double.isNaN(d14.doubleValue())) {
                aVar = aVar2;
                i15 = i16;
                z14 = true;
                o0VarE.C(-299992976);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-300817514);
                double dDoubleValue = !Double.isNaN(d15.doubleValue()) ? d15.doubleValue() : d14.doubleValue();
                float fDoubleValue = (float) ((d14.doubleValue() * ((double) 100)) / dDoubleValue);
                h4.r rVarC3 = u2Var.c(c2.l.C(u2Var.a(aVar2, 1.0f, true), 0.0f, 0.0f, f14, 0.0f, 11), h4.d.a.f81534l);
                gl.c.f77766a.getClass();
                aVar = aVar2;
                f1.j(rVarC3, R.color.gcm_progress_indicator_empty, false, gl.c.f77767b.f77805s, fDoubleValue, 0.0f, 0.0f, o0VarE, 0, 100);
                String strA = iVar.f93454a.a(R.string.lbl_value1_of_value2, ih0.i.c(d14), ih0.i.c(Double.valueOf(dDoubleValue)));
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                i15 = i16;
                z14 = true;
                mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
            h4.r rVarC4 = c2.l.C(aVar, 0.0f, 8, 0.0f, 0.0f, 13);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0 o0Var = o0VarE;
            mh.c(str, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, ((i15 >> 6) & 14) | 48, 0, 131068);
            o0VarE = o0Var;
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a(d14, d15, str, i14, 2);
        }
    }
}
