package d33;

import java.lang.Enum;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b<Node, E extends Enum<E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.j<Node, Integer> f57395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33.b.d<? extends z33.h.a> f57396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w13.a<E> f57397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<l> f57398d;

    public b(k23.j<Node, Integer> jVar, u33.b.d<? extends z33.h.a> dVar, w13.a<E> aVar, List<l> list) {
        jVar.getClass();
        dVar.getClass();
        aVar.getClass();
        list.getClass();
        this.f57395a = jVar;
        this.f57396b = dVar;
        this.f57397c = aVar;
        this.f57398d = list;
    }

    public final Enum a(c33.f fVar, k23.l lVar) {
        lVar.getClass();
        return this.f57397c.get(this.f57396b.d(this.f57395a.get(fVar).intValue()).getNumber());
    }

    public final void b(c33.f fVar, k23.l lVar, Enum r14) {
        lVar.getClass();
        r14.getClass();
        l lVar2 = this.f57398d.get(r14.ordinal());
        k23.j<Node, Integer> jVar = this.f57395a;
        int iIntValue = jVar.get(fVar).intValue();
        int i14 = (1 << lVar2.f57408b) - 1;
        int i15 = lVar2.f57407a;
        jVar.p(fVar, Integer.valueOf((iIntValue & (~(i14 << i15))) + (lVar2.f57409c << i15)));
    }
}
