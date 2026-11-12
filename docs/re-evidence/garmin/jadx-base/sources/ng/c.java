package ng;

import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements i, j {
    @Override // ng.j
    public final Object a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // ng.i
    public final Object b(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // ng.i, ng.j
    public final boolean a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
