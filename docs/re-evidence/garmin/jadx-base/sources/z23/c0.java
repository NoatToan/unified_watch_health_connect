package z23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends b0 implements o33.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f202035a;

    public c0(Method method) {
        method.getClass();
        this.f202035a = method;
    }

    @Override // o33.o
    public final g0 D() {
        g0.a aVar = g0.f202047a;
        Type genericReturnType = this.f202035a.getGenericReturnType();
        genericReturnType.getClass();
        aVar.getClass();
        return g0.a.a(genericReturnType);
    }

    @Override // o33.o
    public final boolean G() {
        Object defaultValue = this.f202035a.getDefaultValue();
        h hVarA = null;
        if (defaultValue != null) {
            h.f202048b.getClass();
            hVarA = h.a.a(null, defaultValue);
        }
        return hVarA != null;
    }

    @Override // z23.b0
    public final Member H() {
        return this.f202035a;
    }

    @Override // o33.o
    public final List<o33.w> f() {
        Method method = this.f202035a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        parameterAnnotations.getClass();
        return I(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // o33.v
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f202035a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new h0(typeVariable));
        }
        return arrayList;
    }
}
