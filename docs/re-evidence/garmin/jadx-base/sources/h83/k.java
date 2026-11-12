package h83;

import c83.b0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends c83.h.a {
    private k() {
    }

    public static k c() {
        return new k();
    }

    @Override // c83.h.a
    public final c83.h<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return a.f82498a;
        }
        return null;
    }

    @Override // c83.h.a
    public final c83.h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (type == String.class) {
            return j.f82508a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return b.f82500a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return c.f82501a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return d.f82502a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return e.f82503a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return f.f82504a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return g.f82505a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return h.f82506a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return i.f82507a;
        }
        return null;
    }
}
