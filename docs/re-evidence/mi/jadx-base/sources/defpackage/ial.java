package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ial extends dk4.a {
    public static ial f() {
        return new ial();
    }

    @Override // dk4.a
    public dk4<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, etk etkVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return x9l.f38892a;
        }
        return null;
    }

    @Override // dk4.a
    public dk4<ResponseBody, ?> d(Type type, Annotation[] annotationArr, etk etkVar) {
        if (type == String.class) {
            return gal.f18786a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return y9l.f39965a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return z9l.f41051a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return aal.f839a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return bal.f3990a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return cal.f5131a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return dal.f15318a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return eal.f16451a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return fal.f17605a;
        }
        return null;
    }
}
