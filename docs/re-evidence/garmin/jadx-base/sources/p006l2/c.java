package p006l2;

import com.garmin.android.apps.connectmobile.workouts.data.model.g0;
import e23.q;
import f5.a1;
import f5.b1;
import f5.y0;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.y;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p<List<s5.c.d<y>>, List<s5.c.d<q<String, m, Integer, Unit>>>> f108419a;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f108420a = new a();

        @Override // f5.z0
        public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.add(list.get(i14).Q(j8));
            }
            return b1.h0(b1Var, g6.a.j(j8), g6.a.i(j8), new g0(8, arrayList));
        }
    }

    static {
        j0 j0Var = j0.f134944a;
        f108419a = new p<>(j0Var, j0Var);
    }

    public static final void a(s5.c cVar, List<s5.c.d<q<String, m, Integer, Unit>>> list, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1794596951);
        int i15 = (i14 & 6) == 0 ? (o0VarE.B(cVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                s5.c.d<q<String, m, Integer, Unit>> dVar = list.get(i16);
                q<String, m, Integer, Unit> qVar = dVar.f157149a;
                int i17 = dVar.f157150b;
                int i18 = dVar.f157151c;
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = a.f108420a;
                    o0VarE.K(objQ);
                }
                z0 z0Var = (z0) objQ;
                r.a aVar = r.S;
                x1 x1Var2 = n.f135158a;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(aVar, o0VarE);
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
                b4.c(g.a.f81810g, z0Var, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                b4.a(o0VarE, Integer.valueOf(iHashCode), g.a.f81813j);
                b4.b(g.a.f81814k, o0VarE);
                b4.c(g.a.f81807d, rVarC, o0VarE);
                qVar.invoke(cVar.subSequence(i17, i18).f157138b, o0VarE, 0);
                o0VarE.g0(true);
            }
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(cVar, list, i14, 20);
        }
    }
}
