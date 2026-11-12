package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ldt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<Integer, a> f24953a = new ConcurrentHashMap<>();

    public class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<T> f24954a = Collections.synchronizedList(new ArrayList());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f24955b = null;

        public a() {
        }
    }

    public final <T> List<T> a(int i) {
        try {
            a aVar = this.f24953a.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar.f24954a;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> void b() {
        ConcurrentHashMap<Integer, a> concurrentHashMap = this.f24953a;
        if (concurrentHashMap == null) {
            return;
        }
        try {
            Iterator<Map.Entry<Integer, a>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                value.f24954a.clear();
                value.f24955b = null;
            }
            this.f24953a.clear();
        } catch (Throwable unused) {
        }
    }

    public final <T> void c(int i, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap = this.f24953a;
        if (concurrentHashMap == null) {
            return;
        }
        try {
            a aVar = concurrentHashMap.get(Integer.valueOf(i));
            if (aVar == null) {
                aVar = new a();
                this.f24953a.putIfAbsent(Integer.valueOf(i), aVar);
            }
            if (aVar.f24955b == t) {
                return;
            }
            f(Integer.valueOf(i), aVar.f24955b);
            aVar.f24955b = t;
            e(Integer.valueOf(i), t);
        } catch (Throwable unused) {
        }
    }

    public final <T> void d(Integer num) {
        a aVar;
        List<T> list;
        try {
            if (!this.f24953a.containsKey(num) || (aVar = this.f24953a.get(num)) == null || (list = aVar.f24954a) == null) {
                return;
            }
            list.clear();
        } catch (Throwable unused) {
        }
    }

    public final <T> void e(Integer num, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap;
        if (t == null || (concurrentHashMap = this.f24953a) == null) {
            return;
        }
        try {
            a aVar = concurrentHashMap.get(num);
            if (aVar == null) {
                aVar = new a();
                this.f24953a.putIfAbsent(num, aVar);
            }
            List<T> list = aVar.f24954a;
            if (list == null || list.contains(t)) {
                return;
            }
            aVar.f24954a.add(t);
        } catch (Throwable unused) {
        }
    }

    public final <T> void f(Integer num, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap;
        a aVar;
        List<T> list;
        if (t == null || (concurrentHashMap = this.f24953a) == null) {
            return;
        }
        try {
            if (!concurrentHashMap.containsKey(num) || (aVar = this.f24953a.get(num)) == null || (list = aVar.f24954a) == null || !list.contains(t)) {
                return;
            }
            aVar.f24954a.remove(t);
        } catch (Throwable unused) {
        }
    }
}
