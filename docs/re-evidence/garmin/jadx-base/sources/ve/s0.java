package ve;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class s0 implements p.a<List<cf.t.c>, ue.h0> {
    public s0(t0 t0Var) {
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public final Object mo330apply(Object obj) {
        List list = (List) obj;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return ((cf.t.c) list.get(0)).a();
    }
}
