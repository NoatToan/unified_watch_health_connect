package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public interface dk4<F, T> {

    public static abstract class a {
        public static Type a(int i, ParameterizedType parameterizedType) {
            return kmq.g(i, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return kmq.h(type);
        }

        public dk4<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, etk etkVar) {
            return null;
        }

        public dk4<ResponseBody, ?> d(Type type, Annotation[] annotationArr, etk etkVar) {
            return null;
        }

        public dk4<?, String> e(Type type, Annotation[] annotationArr, etk etkVar) {
            return null;
        }
    }

    T convert(F f) throws IOException;
}
