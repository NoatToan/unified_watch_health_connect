package h33;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f81474a = new j();

    private j() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public static String a(t23.b bVar) {
        p005kotlin.reflect.jvm.internal.impl.builtins.d.A(bVar);
        t23.b bVarB = f43.e.b(f43.e.i(bVar), i.f81472a);
        if (bVarB == null) {
            return null;
        }
        h.f81462a.getClass();
        x33.f fVar = (x33.f) h.f81463b.get(f43.e.g(bVarB));
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public static boolean b(t23.b bVar) {
        bVar.getClass();
        h.f81462a.getClass();
        if (!h.f81466e.contains(bVar.getName())) {
            return false;
        }
        if (p13.h0.R(h.f81465d, f43.e.c(bVar)) && bVar.f().isEmpty()) {
            return true;
        }
        if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.A(bVar)) {
            return false;
        }
        Collection<? extends t23.b> collectionO = bVar.o();
        collectionO.getClass();
        Collection<? extends t23.b> collection = collectionO;
        if (collection.isEmpty()) {
            return false;
        }
        for (t23.b bVar2 : collection) {
            bVar2.getClass();
            f81474a.getClass();
            if (b(bVar2)) {
                return true;
            }
        }
        return false;
    }
}
