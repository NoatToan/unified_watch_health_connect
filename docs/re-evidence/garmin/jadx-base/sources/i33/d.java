package i33;

import h33.c0;
import o13.p;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f90793a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x33.f f90794b = x33.f.e("message");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x33.f f90795c = x33.f.e("allowedTargets");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x33.f f90796d = x33.f.e("value");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f90797e = u0.e(new p(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105895u, c0.f81421c), new p(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105898x, c0.f81422d), new p(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105899y, c0.f81424f));

    private d() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public static j33.g a(x33.c cVar, o33.c cVar2, k33.i iVar) {
        o33.a aVarZ;
        cVar.getClass();
        cVar2.getClass();
        iVar.getClass();
        if (cVar.equals(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105888n)) {
            x33.c cVar3 = c0.f81423e;
            cVar3.getClass();
            o33.a aVarZ2 = cVar2.z(cVar3);
            if (aVarZ2 != null) {
                return new h(aVarZ2, iVar);
            }
        }
        x33.c cVar4 = (x33.c) f90797e.get(cVar);
        if (cVar4 == null || (aVarZ = cVar2.z(cVar4)) == null) {
            return null;
        }
        f90793a.getClass();
        return b(iVar, aVarZ, false);
    }

    public static j33.g b(k33.i iVar, o33.a aVar, boolean z14) {
        aVar.getClass();
        iVar.getClass();
        x33.b bVarD = aVar.d();
        x33.b.a aVar2 = x33.b.f188590d;
        x33.c cVar = c0.f81421c;
        cVar.getClass();
        aVar2.getClass();
        if (bVarD.equals(x33.b.a.b(cVar))) {
            return new n(aVar, iVar);
        }
        x33.c cVar2 = c0.f81422d;
        cVar2.getClass();
        if (bVarD.equals(x33.b.a.b(cVar2))) {
            return new l(aVar, iVar);
        }
        x33.c cVar3 = c0.f81424f;
        cVar3.getClass();
        if (bVarD.equals(x33.b.a.b(cVar3))) {
            return new c(iVar, aVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105899y);
        }
        x33.c cVar4 = c0.f81423e;
        cVar4.getClass();
        if (bVarD.equals(x33.b.a.b(cVar4))) {
            return null;
        }
        return new l33.i(iVar, aVar, z14);
    }
}
