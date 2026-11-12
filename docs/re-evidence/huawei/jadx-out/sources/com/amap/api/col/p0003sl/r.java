package com.amap.api.col.p0003sl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Integer, a> f3265a = new ConcurrentHashMap<>();

    final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<T> f3266a = Collections.synchronizedList(new ArrayList());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f3267b = null;

        public a() {
        }
    }

    public final <T> void a(Integer num, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap;
        if (t == null || (concurrentHashMap = this.f3265a) == null) {
            return;
        }
        try {
            a aVar = concurrentHashMap.get(num);
            if (aVar == null) {
                aVar = new a();
                this.f3265a.putIfAbsent(num, aVar);
            }
            if (aVar.f3266a == null || aVar.f3266a.contains(t)) {
                return;
            }
            aVar.f3266a.add(t);
        } catch (Throwable unused) {
        }
    }

    public final <T> void b(Integer num, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap;
        a aVar;
        if (t == null || (concurrentHashMap = this.f3265a) == null) {
            return;
        }
        try {
            if (!concurrentHashMap.containsKey(num) || (aVar = this.f3265a.get(num)) == null || aVar.f3266a == null || !aVar.f3266a.contains(t)) {
                return;
            }
            aVar.f3266a.remove(t);
        } catch (Throwable unused) {
        }
    }

    public final <T> void a(Integer num) {
        a aVar;
        try {
            if (!this.f3265a.containsKey(num) || (aVar = this.f3265a.get(num)) == null || aVar.f3266a == null) {
                return;
            }
            aVar.f3266a.clear();
        } catch (Throwable unused) {
        }
    }

    public final <T> List<T> a(int i) {
        try {
            a aVar = this.f3265a.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar.f3266a;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> void a(int i, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap = this.f3265a;
        if (concurrentHashMap == null) {
            return;
        }
        try {
            a aVar = concurrentHashMap.get(Integer.valueOf(i));
            if (aVar == null) {
                aVar = new a();
                this.f3265a.putIfAbsent(Integer.valueOf(i), aVar);
            }
            if (aVar.f3267b == t) {
                return;
            }
            b(Integer.valueOf(i), aVar.f3267b);
            aVar.f3267b = t;
            a(Integer.valueOf(i), t);
        } catch (Throwable unused) {
        }
    }

    public final <T> void a() {
        ConcurrentHashMap<Integer, a> concurrentHashMap = this.f3265a;
        if (concurrentHashMap == null) {
            return;
        }
        try {
            Iterator<Map.Entry<Integer, a>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                value.f3266a.clear();
                value.f3267b = null;
            }
            this.f3265a.clear();
        } catch (Throwable unused) {
        }
    }
}
