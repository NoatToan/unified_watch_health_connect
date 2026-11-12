package defpackage;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class bvq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, f<?, ?>> f4652a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Class<?>, e<?>> f4653b = new HashMap();

    public static class b<T extends oej> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, cvq.l> f4654a;

        @Override // bvq.e
        public void a(oej oejVar, String str, Object obj) {
            cvq.l lVar = this.f4654a.get(str);
            if (lVar != null) {
                lVar.d(oejVar, obj);
            }
        }

        @Override // bvq.d
        public void b(Map<String, String> map) {
            for (cvq.l lVar : this.f4654a.values()) {
                map.put(lVar.a(), lVar.b());
            }
        }

        public b(Class<? extends oej> cls) {
            this.f4654a = cvq.f(cls);
        }
    }

    public static class c<T extends ViewManager, V extends View> implements f<T, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, cvq.l> f4655a;

        @Override // bvq.d
        public void b(Map<String, String> map) {
            for (cvq.l lVar : this.f4655a.values()) {
                map.put(lVar.a(), lVar.b());
            }
        }

        @Override // bvq.f
        public void c(T t, V v, String str, Object obj) {
            cvq.l lVar = this.f4655a.get(str);
            if (lVar != null) {
                lVar.e(t, v, obj);
            }
        }

        public c(Class<? extends ViewManager> cls) {
            this.f4655a = cvq.g(cls);
        }
    }

    public interface d {
        void b(Map<String, String> map);
    }

    public interface e<T extends oej> extends d {
        void a(T t, String str, Object obj);
    }

    public interface f<T extends ViewManager, V extends View> extends d {
        void c(T t, V v, String str, Object obj);
    }

    public static void a() {
        cvq.a();
        f4652a.clear();
        f4653b.clear();
    }

    public static <T> T b(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            cm8.C("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    public static <T extends ViewManager, V extends View> f<T, V> c(Class<? extends ViewManager> cls) {
        Map<Class<?>, f<?, ?>> map = f4652a;
        f<T, V> cVar = (f) map.get(cls);
        if (cVar == null) {
            cVar = (f) b(cls);
            if (cVar == null) {
                cVar = new c<>(cls);
            }
            map.put(cls, (f<?, ?>) cVar);
        }
        return cVar;
    }

    public static <T extends oej> e<T> d(Class<? extends oej> cls) {
        Map<Class<?>, e<?>> map = f4653b;
        e<T> bVar = (e) map.get(cls);
        if (bVar == null) {
            bVar = (e) b(cls);
            if (bVar == null) {
                bVar = new b<>(cls);
            }
            map.put(cls, (e<?>) bVar);
        }
        return bVar;
    }

    public static Map<String, String> e(Class<? extends ViewManager> cls, Class<? extends oej> cls2) {
        HashMap map = new HashMap();
        c(cls).b(map);
        d(cls2).b(map);
        return map;
    }

    public static <T extends oej> void f(T t, yej yejVar) {
        e eVarD = d(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = yejVar.f40101a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            eVarD.a(t, next.getKey(), next.getValue());
        }
    }

    public static <T extends ViewManager, V extends View> void g(T t, V v, yej yejVar) {
        f fVarC = c(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = yejVar.f40101a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            fVarC.c(t, v, next.getKey(), next.getValue());
        }
    }
}
