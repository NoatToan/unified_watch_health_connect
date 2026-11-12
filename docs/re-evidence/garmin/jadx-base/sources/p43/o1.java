package p43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o1 extends w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f135897b = new a(null);

    @Override // p43.w1
    public final t1 d(n0 n0Var) {
        return g(n0Var.F0());
    }

    public abstract t1 g(m1 m1Var);

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static n1 b(a aVar, Map map) {
            aVar.getClass();
            return new n1(map, false);
        }

        public final w1 a(m1 m1Var, List<? extends t1> list) {
            m1Var.getClass();
            list.getClass();
            List<t23.d1> parameters = m1Var.getParameters();
            parameters.getClass();
            t23.d1 d1Var = (t23.d1) p13.h0.n0(parameters);
            if (d1Var == null || !d1Var.u()) {
                return new i0(parameters, list);
            }
            List<t23.d1> parameters2 = m1Var.getParameters();
            parameters2.getClass();
            ArrayList arrayList = new ArrayList(p13.y.r(parameters2, 10));
            Iterator<T> it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((t23.d1) it.next()).h());
            }
            return new n1(p13.u0.l(p13.h0.k1(arrayList, list)), false);
        }

        private a() {
        }
    }
}
