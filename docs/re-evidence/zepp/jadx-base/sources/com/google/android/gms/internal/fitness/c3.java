package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class c3 implements w3 {
    private static final k3 b = new f3();
    private final k3 a;

    public c3() {
        this(new e3(t2.c(), c()));
    }

    private static boolean b(l3 l3Var) {
        return l3Var.a() == zziw.zzaaw;
    }

    private static k3 c() {
        try {
            return (k3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // com.google.android.gms.internal.fitness.w3
    public final <T> x3<T> a(Class<T> cls) {
        z3.E(cls);
        l3 l3VarB = this.a.b(cls);
        if (l3VarB.b()) {
            return zzgy.class.isAssignableFrom(cls) ? n3.f(z3.w(), n2.b(), l3VarB.c()) : n3.f(z3.u(), n2.c(), l3VarB.c());
        }
        if (zzgy.class.isAssignableFrom(cls)) {
            return b(l3VarB) ? o3.g(cls, l3VarB, q3.b(), z2.d(), z3.w(), n2.b(), i3.b()) : o3.g(cls, l3VarB, q3.b(), z2.d(), z3.w(), null, i3.b());
        }
        return b(l3VarB) ? o3.g(cls, l3VarB, q3.a(), z2.c(), z3.u(), n2.c(), i3.a()) : o3.g(cls, l3VarB, q3.a(), z2.c(), z3.v(), null, i3.a());
    }

    private c3(k3 k3Var) {
        this.a = (k3) zzhc.c(k3Var, "messageInfoFactory");
    }
}
