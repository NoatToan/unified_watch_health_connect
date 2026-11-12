package defpackage;

import android.content.Context;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.common.statfs.StatFsHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class qy6 implements kl9, ty6 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Class<?> f31953r = qy6.class;
    public static final long s = TimeUnit.HOURS.toMillis(2);
    public static final long t = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31955b;
    public final CountDownLatch c;
    public long d;
    public final CacheEventListener e;
    public final Set<String> f;
    public long g;
    public final long h;
    public final StatFsHelper i;
    public final py6 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fc8 f31956k;
    public final CacheErrorLogger l;
    public final boolean m;
    public final b n;
    public final e14 o;
    public final Object p = new Object();
    public boolean q;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (qy6.this.p) {
                qy6.this.n();
            }
            qy6.this.q = true;
            qy6.this.c.countDown();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f31958a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f31959b = -1;
        public long c = -1;

        public synchronized long a() {
            return this.c;
        }

        public synchronized long b() {
            return this.f31959b;
        }

        public synchronized void c(long j, long j2) {
            if (this.f31958a) {
                this.f31959b += j;
                this.c += j2;
            }
        }

        public synchronized boolean d() {
            return this.f31958a;
        }

        public synchronized void e() {
            this.f31958a = false;
            this.c = -1L;
            this.f31959b = -1L;
        }

        public synchronized void f(long j, long j2) {
            this.c = j2;
            this.f31959b = j;
            this.f31958a = true;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f31960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f31961b;
        public final long c;

        public c(long j, long j2, long j3) {
            this.f31960a = j;
            this.f31961b = j2;
            this.c = j3;
        }
    }

    public qy6(py6 py6Var, fc8 fc8Var, c cVar, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, uy6 uy6Var, Context context, Executor executor, boolean z) {
        this.f31954a = cVar.f31961b;
        long j = cVar.c;
        this.f31955b = j;
        this.d = j;
        this.i = StatFsHelper.d();
        this.j = py6Var;
        this.f31956k = fc8Var;
        this.g = -1L;
        this.e = cacheEventListener;
        this.h = cVar.f31960a;
        this.l = cacheErrorLogger;
        this.n = new b();
        this.o = tvo.a();
        this.m = z;
        this.f = new HashSet();
        if (uy6Var != null) {
            uy6Var.a(this);
        }
        if (!z) {
            this.c = new CountDownLatch(0);
        } else {
            this.c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    @Override // defpackage.kl9
    public void a(c93 c93Var) {
        synchronized (this.p) {
            try {
                List<String> listB = g93.b(c93Var);
                for (int i = 0; i < listB.size(); i++) {
                    String str = listB.get(i);
                    this.j.remove(str);
                    this.f.remove(str);
                }
            } catch (IOException e) {
                this.l.a(CacheErrorLogger.CacheErrorCategory.DELETE_FILE, f31953r, "delete: " + e.getMessage(), e);
            }
        }
    }

    @Override // defpackage.kl9
    public ej2 b(c93 c93Var, gpr gprVar) throws IOException {
        String strA;
        j0m j0mVarD = j0m.a().d(c93Var);
        this.e.c(j0mVarD);
        synchronized (this.p) {
            strA = g93.a(c93Var);
        }
        j0mVarD.j(strA);
        try {
            try {
                py6.b bVarP = p(strA, c93Var);
                try {
                    bVarP.c(gprVar, c93Var);
                    ej2 ej2VarJ = j(bVarP, c93Var, strA);
                    j0mVarD.i(ej2VarJ.size()).f(this.n.b());
                    this.e.f(j0mVarD);
                    if (!bVarP.a()) {
                        cm8.e(f31953r, "Failed to delete temp file");
                    }
                    j0mVarD.b();
                    return ej2VarJ;
                } catch (Throwable th) {
                    if (!bVarP.a()) {
                        cm8.e(f31953r, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e) {
                j0mVarD.h(e);
                this.e.g(j0mVarD);
                cm8.f(f31953r, "Failed inserting a file into the cache", e);
                throw e;
            }
        } catch (Throwable th2) {
            j0mVarD.b();
            throw th2;
        }
    }

    @Override // defpackage.kl9
    public boolean c(c93 c93Var) {
        synchronized (this.p) {
            if (d(c93Var)) {
                return true;
            }
            try {
                List<String> listB = g93.b(c93Var);
                for (int i = 0; i < listB.size(); i++) {
                    String str = listB.get(i);
                    if (this.j.c(str, c93Var)) {
                        this.f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.kl9
    public void clearAll() {
        synchronized (this.p) {
            try {
                this.j.clearAll();
                this.f.clear();
                this.e.a();
            } catch (IOException | NullPointerException e) {
                this.l.a(CacheErrorLogger.CacheErrorCategory.EVICTION, f31953r, "clearAll: " + e.getMessage(), e);
            }
            this.n.e();
        }
    }

    @Override // defpackage.kl9
    public boolean d(c93 c93Var) {
        synchronized (this.p) {
            try {
                List<String> listB = g93.b(c93Var);
                for (int i = 0; i < listB.size(); i++) {
                    if (this.f.contains(listB.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kl9
    public ej2 e(c93 c93Var) {
        ej2 ej2VarE;
        j0m j0mVarD = j0m.a().d(c93Var);
        try {
            try {
                synchronized (this.p) {
                    try {
                        List<String> listB = g93.b(c93Var);
                        String str = null;
                        ej2VarE = null;
                        for (int i = 0; i < listB.size(); i++) {
                            str = listB.get(i);
                            j0mVarD.j(str);
                            ej2VarE = this.j.e(str, c93Var);
                            if (ej2VarE != null) {
                                break;
                            }
                        }
                        if (ej2VarE == null) {
                            this.e.e(j0mVarD);
                            this.f.remove(str);
                        } else {
                            this.e.h(j0mVarD);
                            this.f.add(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                j0mVarD.b();
                return ej2VarE;
            } catch (IOException e) {
                this.l.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f31953r, "getResource", e);
                j0mVarD.h(e);
                this.e.b(j0mVarD);
                j0mVarD.b();
                return null;
            }
        } catch (Throwable th2) {
            j0mVarD.b();
            throw th2;
        }
    }

    public final ej2 j(py6.b bVar, c93 c93Var, String str) throws IOException {
        ej2 ej2VarB;
        synchronized (this.p) {
            ej2VarB = bVar.b(c93Var);
            this.f.add(str);
            this.n.c(ej2VarB.size(), 1L);
        }
        return ej2VarB;
    }

    public final void k(long j, CacheEventListener.EvictionReason evictionReason) throws IOException {
        try {
            Collection<py6.a> collectionL = l(this.j.f());
            long jB = this.n.b();
            long j2 = jB - j;
            int i = 0;
            long j3 = 0;
            for (py6.a aVar : collectionL) {
                if (j3 > j2) {
                    break;
                }
                long jA = this.j.a(aVar);
                this.f.remove(aVar.getId());
                if (jA > 0) {
                    i++;
                    j3 += jA;
                    j0m j0mVarE = j0m.a().j(aVar.getId()).g(evictionReason).i(jA).f(jB - j3).e(j);
                    this.e.d(j0mVarE);
                    j0mVarE.b();
                }
            }
            this.n.c(-j3, -i);
            this.j.d();
        } catch (IOException e) {
            this.l.a(CacheErrorLogger.CacheErrorCategory.EVICTION, f31953r, "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    public final Collection<py6.a> l(Collection<py6.a> collection) {
        long jNow = this.o.now() + s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (py6.a aVar : collection) {
            if (aVar.getTimestamp() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f31956k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final void m() throws IOException {
        synchronized (this.p) {
            try {
                boolean zN = n();
                q();
                long jB = this.n.b();
                if (jB > this.d && !zN) {
                    this.n.e();
                    n();
                }
                long j = this.d;
                if (jB > j) {
                    k((j * 9) / 10, CacheEventListener.EvictionReason.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n() {
        long jNow = this.o.now();
        if (this.n.d()) {
            long j = this.g;
            if (j != -1 && jNow - j <= t) {
                return false;
            }
        }
        return o();
    }

    public final boolean o() {
        Set<String> set;
        long j;
        long jNow = this.o.now();
        long j2 = s + jNow;
        Set<String> hashSet = (this.m && this.f.isEmpty()) ? this.f : this.m ? new HashSet<>() : null;
        try {
            long size = 0;
            long jMax = -1;
            int size2 = 0;
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (py6.a aVar : this.j.f()) {
                i++;
                size += aVar.getSize();
                if (aVar.getTimestamp() > j2) {
                    i2++;
                    size2 = (int) (((long) size2) + aVar.getSize());
                    j = j2;
                    jMax = Math.max(aVar.getTimestamp() - jNow, jMax);
                    z = true;
                } else {
                    j = j2;
                    if (this.m) {
                        hashSet.add(aVar.getId());
                    }
                }
                j2 = j;
            }
            if (z) {
                this.l.a(CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY, f31953r, "Future timestamp found in " + i2 + " files , with a total size of " + size2 + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j3 = i;
            if (this.n.a() != j3 || this.n.b() != size) {
                if (this.m && (set = this.f) != hashSet) {
                    set.clear();
                    this.f.addAll(hashSet);
                }
                this.n.f(size, j3);
            }
            this.g = jNow;
            return true;
        } catch (IOException e) {
            this.l.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f31953r, "calcFileCacheSize: " + e.getMessage(), e);
            return false;
        }
    }

    public final py6.b p(String str, c93 c93Var) throws IOException {
        m();
        return this.j.b(str, c93Var);
    }

    public final void q() {
        if (this.i.f(this.j.isExternal() ? StatFsHelper.StorageType.EXTERNAL : StatFsHelper.StorageType.INTERNAL, this.f31955b - this.n.b())) {
            this.d = this.f31954a;
        } else {
            this.d = this.f31955b;
        }
    }
}
