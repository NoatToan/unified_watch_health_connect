package ng;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements i, j {
    @Override // ng.j
    public final Object a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // ng.i
    public final Object b(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // ng.i, ng.j
    public final boolean a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
