package jb2;

import androidx.core.view.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f98118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedList f98119e = new LinkedList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f98120a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f98121b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f98122c = new HashMap();

    private b(Collection<a> collection) {
        for (a aVar : collection) {
            aVar.configure();
            this.f98120a.putAll(aVar.getInstanceFactoryMap());
            this.f98121b.putAll(aVar.getSingletonFactoryMap());
        }
    }

    public static <T> T a(Class<T> cls) {
        if (f98118d == null) {
            synchronized (b.class) {
                try {
                    if (f98118d == null) {
                        f98118d = new b(f98119e);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        b bVar = f98118d;
        HashMap map = bVar.f98122c;
        T t7 = (T) map.get(cls);
        if (t7 != null) {
            return t7;
        }
        ib2.a aVar = (ib2.a) bVar.f98121b.get(cls);
        if (aVar == null) {
            e.w(j.i(cls, "Could not get instance of class ", ", please register one when instantiating an injector."));
            return null;
        }
        T t14 = (T) aVar.b();
        map.put(cls, t14);
        return t14;
    }
}
