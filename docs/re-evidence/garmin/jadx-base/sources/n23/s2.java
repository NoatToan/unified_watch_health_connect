package n23;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class s2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p43.n0 f122605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f122606b;

    public s2(p43.n0 n0Var, f2 f2Var) {
        this.f122605a = n0Var;
        this.f122606b = f2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        t23.h hVarT = this.f122605a.F0().t();
        if (!(hVarT instanceof t23.e)) {
            lc.u0.t(hVarT, "Supertype not a class: ");
            return null;
        }
        Class<?> clsI = s4.i((t23.e) hVarT);
        f2 f2Var = this.f122606b;
        if (clsI == null) {
            j.B("Unsupported superclass of ", f2Var, ": ", hVarT);
            return null;
        }
        Class<T> cls = f2Var.f122441d;
        if (p005kotlin.jvm.internal.s.g(cls.getSuperclass(), clsI)) {
            Type genericSuperclass = cls.getGenericSuperclass();
            genericSuperclass.getClass();
            return genericSuperclass;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        int iM = p13.u.M(interfaces, clsI);
        if (iM < 0) {
            j.B("No superclass of ", f2Var, " in Java reflection for ", hVarT);
            return null;
        }
        Type type = cls.getGenericInterfaces()[iM];
        type.getClass();
        return type;
    }
}
