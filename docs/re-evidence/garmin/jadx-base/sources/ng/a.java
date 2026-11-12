package ng;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements i, j {
    @Override // ng.j
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(f.b(obj2));
        }
        return arrayList;
    }

    @Override // ng.i
    public final Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        if (type instanceof GenericArrayType) {
            vb.h.s("Does not support generic array!");
            return null;
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int iA = aVar.a();
        Object objNewInstance = Array.newInstance(componentType, iA);
        for (int i14 = 0; i14 < iA; i14++) {
            Array.set(objNewInstance, i14, e.a(aVar.a(i14), componentType));
        }
        return objNewInstance;
    }

    @Override // ng.i, ng.j
    public final boolean a(Class<?> cls) {
        return cls.isArray();
    }
}
