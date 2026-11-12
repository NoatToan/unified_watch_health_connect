package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u69 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g<Object> f35450a = new a();

    public class a implements g<Object> {
        @Override // u69.g
        public void a(Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements d<List<T>> {
        @Override // u69.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> implements g<List<T>> {
        @Override // u69.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    public interface d<T> {
        T create();
    }

    public static final class e<T> implements Pools.Pool<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<T> f35451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g<T> f35452b;
        public final Pools.Pool<T> c;

        public e(Pools.Pool<T> pool, d<T> dVar, g<T> gVar) {
            this.c = pool;
            this.f35451a = dVar;
            this.f35452b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            T tAcquire = this.c.acquire();
            if (tAcquire == null) {
                tAcquire = this.f35451a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(tAcquire.getClass());
                }
            }
            if (tAcquire instanceof f) {
                ((f) tAcquire).e().b(false);
            }
            return tAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T t) {
            if (t instanceof f) {
                ((f) t).e().b(true);
            }
            this.f35452b.a(t);
            return this.c.release(t);
        }
    }

    public interface f {
        ado e();
    }

    public interface g<T> {
        void a(T t);
    }

    public static <T extends f> Pools.Pool<T> a(Pools.Pool<T> pool, d<T> dVar) {
        return b(pool, dVar, c());
    }

    public static <T> Pools.Pool<T> b(Pools.Pool<T> pool, d<T> dVar, g<T> gVar) {
        return new e(pool, dVar, gVar);
    }

    public static <T> g<T> c() {
        return (g<T>) f35450a;
    }

    public static <T extends f> Pools.Pool<T> d(int i, d<T> dVar) {
        return a(new Pools.SynchronizedPool(i), dVar);
    }

    public static <T> Pools.Pool<List<T>> e() {
        return f(20);
    }

    public static <T> Pools.Pool<List<T>> f(int i) {
        return b(new Pools.SynchronizedPool(i), new b(), new c());
    }
}
