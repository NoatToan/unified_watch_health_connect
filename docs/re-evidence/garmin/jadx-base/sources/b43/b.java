package b43;

import java.util.Iterator;
import java.util.LinkedHashSet;
import p43.n0;
import t23.c1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f15718a = new b();

    private b() {
    }

    public static final void a(t23.e eVar, LinkedHashSet<t23.e> linkedHashSet, i43.l lVar, boolean z14) {
        for (t23.l lVar2 : i43.o.a.a(lVar, i43.d.f91039n, 2)) {
            if (lVar2 instanceof t23.e) {
                t23.e eVarZ = (t23.e) lVar2;
                if (eVarZ.O()) {
                    x33.f name = eVarZ.getName();
                    name.getClass();
                    t23.h hVarF = lVar.f(name, b33.b.WHEN_GET_ALL_DESCRIPTORS);
                    eVarZ = hVarF instanceof t23.e ? (t23.e) hVarF : hVarF instanceof c1 ? ((c1) hVarF).z() : null;
                }
                if (eVarZ == null) {
                    continue;
                } else {
                    if (eVar == null) {
                        i.a(27);
                        throw null;
                    }
                    int i14 = i.f15728a;
                    Iterator<n0> it = eVarZ.h().b().iterator();
                    while (it.hasNext()) {
                        if (i.n(it.next(), eVar.a())) {
                            linkedHashSet.add(eVarZ);
                            break;
                        }
                    }
                    if (z14) {
                        i43.l lVarB0 = eVarZ.b0();
                        lVarB0.getClass();
                        a(eVar, linkedHashSet, lVarB0, z14);
                    }
                }
            }
        }
    }
}
