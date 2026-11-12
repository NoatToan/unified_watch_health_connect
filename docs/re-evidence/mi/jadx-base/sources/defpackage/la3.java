package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public interface la3<R, T> {

    public static abstract class a {
        public static Type b(int i, ParameterizedType parameterizedType) {
            return kmq.g(i, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return kmq.h(type);
        }

        public abstract la3<?, ?> a(Type type, Annotation[] annotationArr, etk etkVar);
    }

    Type a();

    T b(ka3<R> ka3Var);
}
