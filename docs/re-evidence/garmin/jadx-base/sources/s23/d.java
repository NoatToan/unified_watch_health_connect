package s23;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f156251a = new d();

    private d() {
    }

    public static t23.e a(t23.e eVar) {
        x33.d dVarF = b43.i.f(eVar);
        c.f156232a.getClass();
        x33.c cVar = c.f156243l.get(dVarF);
        if (cVar == null) {
            org.apache.commons.lang3.e.l("Given class ", eVar, " is not a read-only collection");
            return null;
        }
        t23.e eVarJ = f43.e.e(eVar).j(cVar);
        eVarJ.getClass();
        return eVarJ;
    }

    public static boolean b(t23.e eVar) {
        eVar.getClass();
        c cVar = c.f156232a;
        x33.d dVarF = b43.i.f(eVar);
        cVar.getClass();
        return c.f156242k.containsKey(dVarF);
    }

    public static t23.e c(d dVar, x33.c cVar, p005kotlin.reflect.jvm.internal.impl.builtins.d dVar2) {
        dVar.getClass();
        dVar2.getClass();
        c.f156232a.getClass();
        x33.b bVar = c.f156240i.get(cVar.f188596a);
        if (bVar != null) {
            return dVar2.j(bVar.a());
        }
        return null;
    }
}
