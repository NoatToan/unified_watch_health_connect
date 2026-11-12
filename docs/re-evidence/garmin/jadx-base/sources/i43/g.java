package i43;

import java.util.Collection;
import java.util.List;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f91051d = {s0.f105811a.h(new i0(g.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.e f91052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.j f91053c;

    public g(o43.n nVar, t23.e eVar) {
        nVar.getClass();
        eVar.getClass();
        this.f91052b = eVar;
        this.f91053c = nVar.g(new e(this));
    }

    @Override // i43.m, i43.l
    public final Collection<r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        List list = (List) gl1.d.B(this.f91053c, f91051d[0]);
        if (list.isEmpty()) {
            return j0.f134944a;
        }
        z43.i iVar = new z43.i();
        for (Object obj : list) {
            if ((obj instanceof r0) && p005kotlin.jvm.internal.s.g(((r0) obj).getName(), fVar)) {
                iVar.add(obj);
            }
        }
        return iVar;
    }

    @Override // i43.m, i43.l
    public final Collection<x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        List list = (List) gl1.d.B(this.f91053c, f91051d[0]);
        if (list.isEmpty()) {
            return j0.f134944a;
        }
        z43.i iVar = new z43.i();
        for (Object obj : list) {
            if ((obj instanceof x0) && p005kotlin.jvm.internal.s.g(((x0) obj).getName(), fVar)) {
                iVar.add(obj);
            }
        }
        return iVar;
    }

    @Override // i43.m, i43.o
    public final Collection<t23.l> g(d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        if (!dVar.a(d.f91038m.f91045b)) {
            return j0.f134944a;
        }
        return (List) gl1.d.B(this.f91053c, f91051d[0]);
    }

    public abstract List<t23.v> h();
}
