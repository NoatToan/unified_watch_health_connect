package p43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f135838e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f135839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.c1 f135840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<t1> f135841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<t23.d1, t1> f135842d;

    /* JADX WARN: Multi-variable type inference failed */
    private g1(g1 g1Var, t23.c1 c1Var, List<? extends t1> list, Map<t23.d1, ? extends t1> map) {
        this.f135839a = g1Var;
        this.f135840b = c1Var;
        this.f135841c = list;
        this.f135842d = map;
    }

    public final boolean a(t23.c1 c1Var) {
        if (p005kotlin.jvm.internal.s.g(this.f135840b, c1Var)) {
            return true;
        }
        g1 g1Var = this.f135839a;
        return g1Var != null ? g1Var.a(c1Var) : false;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g1 a(g1 g1Var, t23.c1 c1Var, List list) {
            list.getClass();
            List<t23.d1> parameters = c1Var.h().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(p13.y.r(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((t23.d1) it.next()).a());
            }
            return new g1(g1Var, c1Var, list, p13.u0.l(p13.h0.k1(arrayList, list)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ g1(g1 g1Var, t23.c1 c1Var, List list, Map map, p005kotlin.jvm.internal.j jVar) {
        this(g1Var, c1Var, list, map);
    }
}
