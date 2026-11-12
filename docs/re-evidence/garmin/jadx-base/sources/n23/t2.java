package n23;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class t2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f122620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f122621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x33.b f122622c;

    public t2(f2 f2Var, Class cls, x33.b bVar) {
        this.f122620a = f2Var;
        this.f122621b = cls;
        this.f122622c = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        f2 f2Var = this.f122620a;
        Class superclass = f2Var.f122441d.getSuperclass();
        Class cls = this.f122621b;
        boolean zG = p005kotlin.jvm.internal.s.g(superclass, cls);
        Class<T> cls2 = f2Var.f122441d;
        if (zG) {
            Type genericSuperclass = cls2.getGenericSuperclass();
            genericSuperclass.getClass();
            return genericSuperclass;
        }
        Class<?>[] interfaces = cls2.getInterfaces();
        interfaces.getClass();
        int iM = p13.u.M(interfaces, cls);
        if (iM < 0) {
            j.B("No superclass of ", f2Var, " in Java reflection for ", this.f122622c);
            return null;
        }
        Type type = cls2.getGenericInterfaces()[iM];
        type.getClass();
        return type;
    }
}
