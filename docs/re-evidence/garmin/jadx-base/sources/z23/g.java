package z23;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends x implements o33.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotation f202046a;

    public g(Annotation annotation) {
        annotation.getClass();
        this.f202046a = annotation;
    }

    @Override // o33.a
    public final x33.b d() {
        return f.a(dh.b.u(dh.b.s(this.f202046a)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f202046a == ((g) obj).f202046a;
        }
        return false;
    }

    @Override // o33.a
    public final ArrayList h() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f202046a;
        Method[] declaredMethods = dh.b.u(dh.b.s(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            h.a aVar = h.f202048b;
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            x33.f fVarE = x33.f.e(method.getName());
            aVar.getClass();
            arrayList.add(h.a.a(fVarE, objInvoke));
        }
        return arrayList;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f202046a);
    }

    @Override // o33.a
    public final t j() {
        return new t(dh.b.u(dh.b.s(this.f202046a)));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        androidx.core.view.j.o(g.class, sb3, ": ");
        sb3.append(this.f202046a);
        return sb3.toString();
    }
}
