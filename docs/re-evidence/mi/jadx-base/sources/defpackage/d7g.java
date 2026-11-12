package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface d7g<Model, Data> {

    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pzd f15175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<pzd> f15176b;
        public final jl5<Data> c;

        public a(pzd pzdVar, jl5<Data> jl5Var) {
            this(pzdVar, Collections.emptyList(), jl5Var);
        }

        public a(pzd pzdVar, List<pzd> list, jl5<Data> jl5Var) {
            this.f15175a = (pzd) a6i.d(pzdVar);
            this.f15176b = (List) a6i.d(list);
            this.c = (jl5) a6i.d(jl5Var);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i, int i2, cch cchVar);
}
