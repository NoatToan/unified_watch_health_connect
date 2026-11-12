package lv1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import fy1.i;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.List;
import l72.p2;
import mv1.d;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;
import tw1.h;
import u1.a2;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(d dVar, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        h hVar;
        o0 o0VarE = mVar.E(-1444496891);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r rVarB = a2.b(x2.f(r.S, 1.0f), a2.a(o0VarE), true);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            String str = null;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            q.a aVar4 = q.f187120f;
            List<String> list = dVar.f121182a;
            aVar4.getClass();
            String strB = q.a.b(context, list);
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_days_available);
            if (strB == null) {
                strB = "";
            }
            p2Var.h(strQ, strB, null, null, null, false, false, null, null, null, aVar, o0VarE, 0, (i15 >> 3) & 14, 1020);
            i.f73924a.getClass();
            if (i.a.q()) {
                o0VarE.C(-1943388910);
                vt1.h.a aVar5 = vt1.h.f180113e;
                List<h> list2 = dVar.f121183b;
                if (list2 != null && (hVar = (h) h0.d0(list2)) != null) {
                    str = hVar.f166715a;
                }
                aVar5.getClass();
                p2Var.h(gl1.y.Q(o0VarE, R.string.strength_workouts), gl1.y.Q(o0VarE, vt1.h.a.a(str).f180121b), null, null, null, false, false, null, null, null, aVar2, o0VarE, 0, (i15 >> 6) & 14, 1020);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1943030457);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) dVar, (Object) aVar, (Object) aVar2, i14, 8);
        }
    }
}
