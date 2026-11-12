package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes7.dex */
public class u0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f35253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<b> f35254b = new ArrayList();
    public ReadWriteLock c = new ReentrantReadWriteLock();

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<t0l, b> f35255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35256b;
        public List<s0l> c;

        public b() {
            this.f35255a = new HashMap();
        }

        public void a(s0l s0lVar) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(s0lVar);
        }

        public Map<t0l, b> b() {
            return this.f35255a;
        }

        public int c() {
            return this.f35256b;
        }

        public List<s0l> d() {
            return this.c;
        }

        public void e(int i) {
            this.f35256b = i;
        }
    }

    public u0l() {
        b bVar = new b();
        this.f35253a = bVar;
        bVar.e(0);
        this.f35254b.add(this.f35253a);
    }

    public List<s0l> a(int i, gzk gzkVar) {
        if (i < 1 || i >= this.f35254b.size() || this.f35254b.get(i).d() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<s0l> it = this.f35254b.get(i).d().iterator();
        while (it.hasNext()) {
            s0l s0lVarC = it.next().c();
            if (s0lVarC != null) {
                s0lVarC.m(gzkVar);
                arrayList.add(s0lVarC);
            }
        }
        return arrayList;
    }

    public void b(s0l s0lVar) {
        b bVar;
        this.c.writeLock().lock();
        try {
            Map<t0l, b> mapB = this.f35253a.b();
            for (int i = 0; i < s0lVar.h().size(); i++) {
                t0l t0lVar = s0lVar.h().get(i);
                if (mapB.containsKey(t0lVar)) {
                    bVar = mapB.get(t0lVar);
                    for (t0l t0lVar2 : mapB.keySet()) {
                        if (t0lVar2.equals(t0lVar)) {
                            t0lVar.l(t0lVar2.a());
                            break;
                        }
                    }
                } else {
                    bVar = new b();
                    bVar.e(this.f35254b.size());
                    t0lVar.l(this.f35254b.size());
                    mapB.put(t0lVar, bVar);
                    this.f35254b.add(bVar);
                }
                mapB = bVar.b();
                if (i == s0lVar.h().size() - 1) {
                    bVar.a(s0lVar);
                }
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public int c(int i, t0l t0lVar) {
        this.c.readLock().lock();
        try {
            Map<t0l, b> mapB = this.f35254b.get(i).b();
            b bVar = mapB.containsKey(t0lVar) ? mapB.get(t0lVar) : null;
            if (bVar != null) {
                return bVar.c();
            }
            return -1;
        } finally {
            this.c.readLock().unlock();
        }
    }

    public String toString() {
        return "<start>------\n" + this.f35254b.toString() + "\n---------<end>";
    }
}
