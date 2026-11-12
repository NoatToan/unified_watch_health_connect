package i43;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p13.j0;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements l {
    @Override // i43.l
    public Collection<? extends r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return j0.f134944a;
    }

    @Override // i43.l
    public Set<x33.f> b() {
        Collection<t23.l> collectionG = g(d.f91040o, z43.h.f202421a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof x0) {
                x33.f name = ((x0) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // i43.l
    public Collection<? extends x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return j0.f134944a;
    }

    @Override // i43.l
    public Set<x33.f> d() {
        Collection<t23.l> collectionG = g(d.f91041p, z43.h.f202421a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof x0) {
                x33.f name = ((x0) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // i43.l
    public Set<x33.f> e() {
        return null;
    }

    @Override // i43.o
    public t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return null;
    }

    @Override // i43.o
    public Collection<t23.l> g(d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        return j0.f134944a;
    }
}
