package ng;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements i, j {
    @Override // ng.j
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(f.b(it.next()));
        }
        return arrayList;
    }

    @Override // ng.i
    public final Object b(Object obj, Type type) {
        Collection collectionNoneOf;
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        Type rawType = type;
        while (!(rawType instanceof Class)) {
            if (!(rawType instanceof ParameterizedType)) {
                vb.h.s("TODO");
                return null;
            }
            rawType = ((ParameterizedType) rawType).getRawType();
        }
        Class cls = (Class) rawType;
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        if (cls == AbstractCollection.class) {
            collectionNoneOf = new ArrayList();
        } else if (cls.isAssignableFrom(HashSet.class)) {
            collectionNoneOf = new HashSet();
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            collectionNoneOf = new LinkedHashSet();
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            collectionNoneOf = new TreeSet();
        } else if (cls.isAssignableFrom(ArrayList.class)) {
            collectionNoneOf = new ArrayList();
        } else if (cls.isAssignableFrom(EnumSet.class)) {
            collectionNoneOf = EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        } else {
            try {
                collectionNoneOf = (Collection) cls.newInstance();
            } catch (Exception unused) {
                vb.h.s("create instane error, class ".concat(cls.getName()));
                return null;
            }
        }
        if (!(type instanceof ParameterizedType)) {
            vb.h.s("Does not support the implement for generics.");
            return null;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        for (int i14 = 0; i14 < aVar.a(); i14++) {
            collectionNoneOf.add(e.a(aVar.a(i14), type2));
        }
        return collectionNoneOf;
    }

    @Override // ng.i, ng.j
    public final boolean a(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }
}
