package b53;

import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f16118a = new d();

    @Override // e23.l
    public final Object invoke(Object obj) {
        Class<?> declaringClass;
        k23.d dVar = (k23.d) obj;
        dVar.getClass();
        if (!dVar.l() || (declaringClass = dh.b.u(dVar).getDeclaringClass()) == null) {
            return null;
        }
        return s0.f105811a.b(declaringClass);
    }
}
