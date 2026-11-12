package n43;

import java.util.Iterator;
import java.util.List;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
public class a implements u23.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f123616b = {s0.f105811a.h(new p005kotlin.jvm.internal.i0(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o43.j f123617a;

    public a(o43.n nVar, e23.a<? extends List<? extends u23.c>> aVar) {
        nVar.getClass();
        aVar.getClass();
        this.f123617a = nVar.g(aVar);
    }

    @Override // u23.h
    public final /* bridge */ boolean I3(x33.c cVar) {
        return u23.h.b.b(this, cVar);
    }

    @Override // u23.h
    public boolean isEmpty() {
        return ((List) gl1.d.B(this.f123617a, f123616b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<u23.c> iterator() {
        return ((List) gl1.d.B(this.f123617a, f123616b[0])).iterator();
    }

    @Override // u23.h
    public final /* bridge */ u23.c z(x33.c cVar) {
        return u23.h.b.a(this, cVar);
    }
}
