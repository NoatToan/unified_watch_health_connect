package com.amap.api.col.p0003sl;

import com.huawei.hms.network.embedded.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
class gu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2600a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2601b = k.b.m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2602c = 10;
    private long d = 0;
    private final LinkedHashMap<gt.b, Object> e = new LinkedHashMap<>();
    private final Object f = new Object();
    private final LinkedHashMap<gt.b, Object> g = new LinkedHashMap<>();
    private final Object h = new Object();
    private ArrayList<String> i = new ArrayList<>();

    public gu(String... strArr) {
        a(strArr);
    }

    private void a(String... strArr) {
        this.d = System.currentTimeMillis();
        this.e.clear();
        this.i.clear();
        for (String str : strArr) {
            if (str != null) {
                this.i.add(str);
            }
        }
    }

    protected boolean a(LinkedHashMap<gt.b, Object> linkedHashMap, gt.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return false;
        }
        return linkedHashMap.containsKey(bVar);
    }

    protected Object b(LinkedHashMap<gt.b, Object> linkedHashMap, gt.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.get(bVar);
    }

    protected Object c(LinkedHashMap<gt.b, Object> linkedHashMap, gt.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.remove(bVar);
    }

    public final gt.c a(gt.b bVar) {
        if (!this.f2600a || bVar == null || !b(bVar)) {
            return null;
        }
        b();
        synchronized (this.f) {
            if (a(this.e, bVar)) {
                return new gt.c(b(this.e, bVar), true);
            }
            synchronized (this.h) {
                if (a(this.g, bVar)) {
                    while (!a(this.e, bVar) && a(this.g, bVar)) {
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
            return new gt.c(b(this.e, bVar), false);
        }
    }

    public final void a(gt.b bVar, Object obj) {
        if (this.f2600a && bVar != null && b(bVar)) {
            b(bVar, obj);
            synchronized (this.h) {
                c(this.g, bVar);
                this.h.notify();
            }
        }
    }

    private void b(gt.b bVar, Object obj) {
        synchronized (this.f) {
            a();
            b();
            this.e.put(bVar, obj);
        }
    }

    private void a() {
        int size = this.e.size();
        if (size <= 0 || size < this.f2602c) {
            return;
        }
        for (gt.b bVar : this.e.keySet()) {
            if (bVar != null) {
                c(this.e, bVar);
            }
        }
        bVar = null;
        c(this.e, bVar);
    }

    private void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((jCurrentTimeMillis - this.d) / 1000 > this.f2601b) {
            this.e.clear();
            this.d = jCurrentTimeMillis;
        }
    }

    public final boolean b(gt.b bVar) {
        if (bVar == null || bVar.f2596a == null) {
            return false;
        }
        for (String str : this.i) {
            if (str != null && bVar.f2596a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void a(gt.a aVar) {
        if (aVar != null) {
            this.f2600a = aVar.a();
            this.f2601b = aVar.b();
            this.f2602c = aVar.c();
        }
    }
}
