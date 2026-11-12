package c83;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public interface h<F, T> {

    public static abstract class a {
        public h<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
            return null;
        }

        public h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
            return null;
        }
    }

    T convert(F f14);
}
