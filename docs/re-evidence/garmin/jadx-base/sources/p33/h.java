package p33;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements u23.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.c f135443a;

    public h(x33.c cVar) {
        cVar.getClass();
        this.f135443a = cVar;
    }

    @Override // u23.h
    public final /* bridge */ boolean I3(x33.c cVar) {
        return u23.h.b.b(this, cVar);
    }

    @Override // u23.h
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<u23.c> iterator() {
        p13.j0.f134944a.getClass();
        return p13.i0.f134941a;
    }

    @Override // u23.h
    public final u23.c z(x33.c cVar) {
        cVar.getClass();
        if (cVar.equals(this.f135443a)) {
            return g.f135436a;
        }
        return null;
    }
}
