package cq0;

import c2.b0;
import c2.x2;
import c62.m1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import h5.e0;
import java.util.ArrayList;
import java.util.List;
import l72.r1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new l20.a(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "John", "Doe", null, null, null, null, null, null, null, null, null, null, 8184, null));
        arrayList.add(new l20.a("2", "Jane", "Smith", null, null, null, null, null, null, null, null, null, null, 8184, null));
        arrayList.add(new l20.a("3", "Mary", "Williams", null, null, null, null, null, null, null, null, null, null, 8184, null));
    }

    public static final void a(List<l20.a> list, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1156203075);
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        boolean z14 = true;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (list == null || list.isEmpty()) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a(list, i14, 0);
                    return;
                }
                return;
            }
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r1.b(gl1.y.Q(o0VarE, list.size() == 1 ? R.string.assistance_contact : R.string.pn_assistance_contacts_title), null, o0VarE, 0, 2);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar, j92.b.f97899b.f97918c), o0VarE);
            o0VarE.C(26270473);
            for (l20.a aVar3 : list) {
                l72.p2.f111205a.g(aVar3.j(), null, null, z3.f.c(-277823131, new m1(aVar3, 17), o0VarE), null, false, false, null, o0VarE, 3072, 502);
                z14 = true;
            }
            o0VarE.g0(false);
            i15 = 1;
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new a(list, i14, i15);
        }
    }
}
