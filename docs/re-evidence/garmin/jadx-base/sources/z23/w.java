package z23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends b0 implements o33.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor<?> f202074a;

    public w(Constructor<?> constructor) {
        constructor.getClass();
        this.f202074a = constructor;
    }

    @Override // z23.b0
    public final Member H() {
        return this.f202074a;
    }

    @Override // o33.j
    public final List<o33.w> f() {
        Constructor<?> constructor = this.f202074a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        genericParameterTypes.getClass();
        if (genericParameterTypes.length == 0) {
            return p13.j0.f134944a;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) p13.s.l(1, genericParameterTypes.length, genericParameterTypes);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            com.google.firebase.messaging.l.n(constructor, "Illegal generic signature: ");
            return null;
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            parameterAnnotations = (Annotation[][]) p13.s.l(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
        }
        return I(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
    }

    @Override // o33.v
    public final ArrayList getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f202074a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new h0(typeVariable));
        }
        return arrayList;
    }
}
