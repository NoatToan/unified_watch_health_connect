package defpackage;

import com.google.common.collect.i0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Type> f24700a = i0.d();

    public final void a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f24700a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        b((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            String strValueOf = String.valueOf(type);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
                            sb.append("Unknown type: ");
                            sb.append(strValueOf);
                            throw new AssertionError(sb.toString());
                        }
                        c((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    this.f24700a.remove(type);
                    throw th;
                }
            }
        }
    }

    public void b(Class<?> cls) {
    }

    public void c(GenericArrayType genericArrayType) {
    }

    public void d(ParameterizedType parameterizedType) {
    }

    public abstract void e(TypeVariable<?> typeVariable);

    public abstract void f(WildcardType wildcardType);
}
