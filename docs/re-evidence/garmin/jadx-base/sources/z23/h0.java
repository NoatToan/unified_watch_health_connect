package z23;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends x implements o33.c, o33.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable<?> f202050a;

    public h0(TypeVariable<?> typeVariable) {
        typeVariable.getClass();
        this.f202050a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return p005kotlin.jvm.internal.s.g(this.f202050a, ((h0) obj).f202050a);
        }
        return false;
    }

    @Override // o33.c
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.f202050a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? p13.j0.f134944a : w5.r.i(declaredAnnotations);
    }

    @Override // o33.q
    public final x33.f getName() {
        return x33.f.e(this.f202050a.getName());
    }

    @Override // o33.u
    public final Collection getUpperBounds() {
        Type[] bounds = this.f202050a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new v(type));
        }
        v vVar = (v) p13.h0.K0(arrayList);
        Collection collection = arrayList;
        if (p005kotlin.jvm.internal.s.g(vVar != null ? vVar.f202072b : null, Object.class)) {
            collection = p13.j0.f134944a;
        }
        return collection;
    }

    public final int hashCode() {
        return this.f202050a.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        androidx.core.view.j.o(h0.class, sb3, ": ");
        sb3.append(this.f202050a);
        return sb3.toString();
    }

    @Override // o33.c
    public final o33.a z(x33.c cVar) {
        Annotation[] declaredAnnotations;
        cVar.getClass();
        TypeVariable<?> typeVariable = this.f202050a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return w5.r.g(declaredAnnotations, cVar);
    }
}
