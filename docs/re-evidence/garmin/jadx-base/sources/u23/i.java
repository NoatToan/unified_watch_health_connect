package u23;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f168229a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends c> list) {
        list.getClass();
        this.f168229a = list;
    }

    @Override // u23.h
    public final /* bridge */ boolean I3(x33.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // u23.h
    public final boolean isEmpty() {
        return this.f168229a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        return this.f168229a.iterator();
    }

    public final String toString() {
        return this.f168229a.toString();
    }

    @Override // u23.h
    public final /* bridge */ c z(x33.c cVar) {
        return h.b.a(this, cVar);
    }
}
