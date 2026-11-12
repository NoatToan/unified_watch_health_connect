package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class uqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f36033a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f36034b = new HashMap();

    public static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f36035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f36036b;
        public final tqk<T, R> c;

        public a(Class<T> cls, Class<R> cls2, tqk<T, R> tqkVar) {
            this.f36035a = cls;
            this.f36036b = cls2;
            this.c = tqkVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f36035a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f36036b);
        }
    }

    public synchronized <T, R> void a(String str, tqk<T, R> tqkVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, tqkVar));
    }

    public synchronized <T, R> List<tqk<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f36033a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f36034b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f36033a.contains(str)) {
                this.f36033a.add(str);
            }
            arrayList = this.f36034b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f36034b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f36033a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f36034b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f36036b)) {
                        arrayList.add(aVar.f36036b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f36033a);
            this.f36033a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f36033a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f36033a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
