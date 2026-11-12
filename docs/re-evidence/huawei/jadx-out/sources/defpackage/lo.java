package defpackage;

import com.alipay.sdk.m.g.i;
import com.alipay.sdk.m.g.j;
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
import org.json.alipay.a;

/* JADX INFO: loaded from: classes4.dex */
public class lo implements i, j {
    @Override // com.alipay.sdk.m.g.i, com.alipay.sdk.m.g.j
    public boolean a(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.sdk.m.g.i
    public Object a(Object obj, Type type) {
        if (!obj.getClass().equals(a.class)) {
            return null;
        }
        a aVar = (a) obj;
        Collection<Object> collectionD = d(mb.b(type), type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Does not support the implement for generics.");
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        for (int i = 0; i < aVar.a(); i++) {
            collectionD.add(lv.d(aVar.a(i), type2));
        }
        return collectionD;
    }

    @Override // com.alipay.sdk.m.g.j
    public Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(lw.d(it.next()));
        }
        return arrayList;
    }

    public static Collection<Object> d(Class<?> cls, Type type) {
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception unused) {
            throw new IllegalArgumentException("create instane error, class " + cls.getName());
        }
    }
}
