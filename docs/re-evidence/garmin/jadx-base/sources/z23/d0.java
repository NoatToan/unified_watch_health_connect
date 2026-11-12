package z23;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends x implements o33.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.c f202037a;

    public d0(x33.c cVar) {
        cVar.getClass();
        this.f202037a = cVar;
    }

    @Override // o33.r
    public final x33.c c() {
        return this.f202037a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return p005kotlin.jvm.internal.s.g(this.f202037a, ((d0) obj).f202037a);
        }
        return false;
    }

    @Override // o33.c
    public final Collection getAnnotations() {
        return p13.j0.f134944a;
    }

    public final int hashCode() {
        return this.f202037a.hashCode();
    }

    @Override // o33.r
    public final p13.j0 i() {
        return p13.j0.f134944a;
    }

    @Override // o33.r
    public final p13.j0 s(e23.l lVar) {
        lVar.getClass();
        return p13.j0.f134944a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        androidx.core.view.j.o(d0.class, sb3, ": ");
        sb3.append(this.f202037a);
        return sb3.toString();
    }

    @Override // o33.c
    public final o33.a z(x33.c cVar) {
        cVar.getClass();
        return null;
    }
}
