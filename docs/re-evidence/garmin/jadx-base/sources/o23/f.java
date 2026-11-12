package o23;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.t;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final <T> T a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        cls.getClass();
        list.getClass();
        t tVarB = o13.m.b(new b(map));
        T t7 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new d(cls, map, o13.m.b(new c(cls, map)), tVarB, list));
        t7.getClass();
        return t7;
    }

    public static /* synthetic */ Object b(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(y.r(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return a(cls, map, arrayList);
    }
}
