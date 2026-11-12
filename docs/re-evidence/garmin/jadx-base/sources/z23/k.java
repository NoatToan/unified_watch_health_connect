package z23;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends g0 implements o33.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f202059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f202060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p13.j0 f202061d;

    public k(Type type) {
        g0 g0VarA;
        type.getClass();
        this.f202059b = type;
        boolean z14 = type instanceof GenericArrayType;
        g0.a aVar = g0.f202047a;
        if (!z14) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    aVar.getClass();
                    g0VarA = g0.a.a(componentType);
                }
            }
            org.apache.commons.lang3.e.m("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        aVar.getClass();
        g0VarA = g0.a.a(genericComponentType);
        this.f202060c = g0VarA;
        this.f202061d = p13.j0.f134944a;
    }

    @Override // o33.e
    public final g0 C() {
        return this.f202060c;
    }

    @Override // z23.g0
    public final Type H() {
        return this.f202059b;
    }

    @Override // o33.c
    public final Collection<o33.a> getAnnotations() {
        return this.f202061d;
    }
}
