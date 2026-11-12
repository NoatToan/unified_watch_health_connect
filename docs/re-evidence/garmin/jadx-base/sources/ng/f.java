package ng;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f125900a;

    static {
        ArrayList arrayList = new ArrayList();
        f125900a = arrayList;
        arrayList.add(new l());
        arrayList.add(new d());
        arrayList.add(new c());
        arrayList.add(new h());
        arrayList.add(new b());
        arrayList.add(new a());
        arrayList.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objB = b(obj);
        if (og.a.p(objB.getClass())) {
            return org.json.alipay.b.c(objB.toString());
        }
        if (Collection.class.isAssignableFrom(objB.getClass())) {
            return new org.json.alipay.a((Collection) objB).toString();
        }
        if (Map.class.isAssignableFrom(objB.getClass())) {
            return new org.json.alipay.b((Map) objB).toString();
        }
        n23.j.A(objB.getClass(), "Unsupported Class : ");
        return null;
    }

    public static Object b(Object obj) {
        Object objA;
        if (obj == null) {
            return null;
        }
        for (j jVar : f125900a) {
            if (jVar.a(obj.getClass()) && (objA = jVar.a(obj)) != null) {
                return objA;
            }
        }
        n23.j.A(obj.getClass(), "Unsupported Class : ");
        return null;
    }
}
