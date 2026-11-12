package com.amap.api.col.p0003sl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6011a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6012b = 86400;
    public int c = 10;
    public long d = 0;
    public final LinkedHashMap<d0.b, Object> e = new LinkedHashMap<>();
    public final Object f = new Object();
    public final LinkedHashMap<d0.b, Object> g = new LinkedHashMap<>();
    public final Object h = new Object();
    public ArrayList<String> i = new ArrayList<>();

    public e0(String... strArr) {
        e(strArr);
    }

    public final d0.c a(d0.b bVar) {
        if (!this.f6011a || bVar == null || !j(bVar)) {
            return null;
        }
        h();
        synchronized (this.f) {
            try {
                if (f(this.e, bVar)) {
                    return new d0.c(g(this.e, bVar), true);
                }
                synchronized (this.h) {
                    if (f(this.g, bVar)) {
                        while (!f(this.e, bVar) && f(this.g, bVar)) {
                            try {
                                this.h.wait(1000L);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        this.g.put(bVar, null);
                    }
                }
                return new d0.c(g(this.e, bVar), false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        int size = this.e.size();
        if (size <= 0 || size < this.c) {
            return;
        }
        for (d0.b bVar : this.e.keySet()) {
            if (bVar != null) {
                k(this.e, bVar);
            }
        }
        bVar = null;
        k(this.e, bVar);
    }

    public void c(d0.a aVar) {
        if (aVar != null) {
            this.f6011a = aVar.e();
            this.f6012b = aVar.f();
            this.c = aVar.g();
        }
    }

    public final void d(d0.b bVar, Object obj) {
        if (this.f6011a && bVar != null && j(bVar)) {
            i(bVar, obj);
            synchronized (this.h) {
                k(this.g, bVar);
                this.h.notify();
            }
        }
    }

    public final void e(String... strArr) {
        this.d = System.currentTimeMillis();
        this.e.clear();
        this.i.clear();
        for (String str : strArr) {
            if (str != null) {
                this.i.add(str);
            }
        }
    }

    public boolean f(LinkedHashMap<d0.b, Object> linkedHashMap, d0.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return false;
        }
        return linkedHashMap.containsKey(bVar);
    }

    public Object g(LinkedHashMap<d0.b, Object> linkedHashMap, d0.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.get(bVar);
    }

    public final void h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((jCurrentTimeMillis - this.d) / 1000 > this.f6012b) {
            this.e.clear();
            this.d = jCurrentTimeMillis;
        }
    }

    public final void i(d0.b bVar, Object obj) {
        synchronized (this.f) {
            b();
            h();
            this.e.put(bVar, obj);
        }
    }

    public final boolean j(d0.b bVar) {
        if (bVar != null && bVar.f5985a != null) {
            for (String str : this.i) {
                if (str != null && bVar.f5985a.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Object k(LinkedHashMap<d0.b, Object> linkedHashMap, d0.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.remove(bVar);
    }
}
