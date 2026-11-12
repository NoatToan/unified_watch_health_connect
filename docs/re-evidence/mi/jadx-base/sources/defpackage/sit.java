package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class sit extends tit {
    public sit(Object obj, Field field, Class cls) {
        super(obj, field, Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public final void d(Collection collection) {
        Object[] objArr = (Object[]) a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) f(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        c(objArr2);
    }

    public final void e(Collection collection) {
        Object[] objArr = (Object[]) a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) f(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        c(objArr2);
    }

    public final Class f() {
        return b().getType().getComponentType();
    }
}
