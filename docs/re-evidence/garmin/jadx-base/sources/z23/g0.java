package z23;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 implements o33.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f202047a = new a(null);

    public abstract Type H();

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && p005kotlin.jvm.internal.s.g(H(), ((g0) obj).H());
    }

    public final int hashCode() {
        return H().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + H();
    }

    @Override // o33.c
    public o33.a z(x33.c cVar) {
        Object next;
        cVar.getClass();
        Iterator<T> it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p005kotlin.jvm.internal.s.g(((o33.a) next).d().a(), cVar)) {
                return (o33.a) next;
            }
        }
        next = null;
        return (o33.a) next;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g0 a(Type type) {
            type.getClass();
            boolean z14 = type instanceof Class;
            if (z14) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new e0(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z14 && ((Class) type).isArray())) {
                return new k(type);
            }
            return type instanceof WildcardType ? new j0((WildcardType) type) : new v(type);
        }

        private a() {
        }
    }
}
