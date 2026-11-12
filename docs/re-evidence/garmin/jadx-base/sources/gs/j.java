package gs;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import nr.p0;
import o4.f0;
import p13.h0;
import p13.y;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import ps.r0;
import ps.s0;
import w02.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public static final void a(h4.r rVar, p0 p0Var, float f14, ds.n nVar, p3.m mVar, int i14) {
        List listB1;
        s0 s0Var;
        p0Var.getClass();
        o0 o0VarE = mVar.E(-1805393187);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.k(nVar == null ? -1 : nVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p0.a aVar = p0Var.f127286e;
            List listB2 = null;
            p0.a.e eVar = aVar instanceof p0.a.e ? (p0.a.e) aVar : null;
            List<r0> listD = (eVar == null || (s0Var = eVar.f127298a) == null) ? null : s0Var.d();
            if (listD != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (b0.r((r0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List<String> list = ((r0) it.next()).f140203j;
                    if (list != null) {
                        arrayList2.add(list);
                    }
                }
                listB1 = h0.b1(h0.f1(y.s(arrayList2)));
            } else {
                listB1 = null;
            }
            if (listD != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listD) {
                    if (b0.r((r0) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    List<String> list2 = ((r0) it3.next()).f140204k;
                    if (list2 != null) {
                        arrayList4.add(list2);
                    }
                }
                listB2 = h0.b1(h0.f1(y.s(arrayList4)));
            }
            zw1.c cVar = new zw1.c();
            gl.c.f77766a.getClass();
            int iJ = f0.j(gl.c.a(o0VarE).l());
            int iJ2 = f0.j(gl.c.a(o0VarE).r());
            int iJ3 = f0.j(j92.a.a().c().g());
            y3 y3Var = t1.f91490h;
            v.a(y3Var.c(new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f)), z3.f.c(-1902672355, new f10.j(rVar, p0Var, nVar, context, listB1, listB2, iJ, iJ2, iJ3, cVar), o0VarE), o0VarE, 56);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(rVar, p0Var, f14, nVar, i14, 2);
        }
    }
}
