package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o4q<T> {
    public final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        c6i.j(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
