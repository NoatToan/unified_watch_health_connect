package defpackage;

import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class iag {
    public static final c e = new c();
    public static final d7g<Object, Object> f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b<?, ?>> f20939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20940b;
    public final Set<b<?, ?>> c;
    public final Pools.Pool<List<Throwable>> d;

    public static class a implements d7g<Object, Object> {
        @Override // defpackage.d7g
        public boolean a(Object obj) {
            return false;
        }

        @Override // defpackage.d7g
        public d7g.a<Object> b(Object obj, int i, int i2, cch cchVar) {
            return null;
        }
    }

    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Model> f20941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<Data> f20942b;
        public final e7g<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, e7g<? extends Model, ? extends Data> e7gVar) {
            this.f20941a = cls;
            this.f20942b = cls2;
            this.c = e7gVar;
        }

        public boolean a(Class<?> cls) {
            return this.f20941a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f20942b.isAssignableFrom(cls2);
        }
    }

    public static class c {
        public <Model, Data> hag<Model, Data> a(List<d7g<Model, Data>> list, Pools.Pool<List<Throwable>> pool) {
            return new hag<>(list, pool);
        }
    }

    public iag(Pools.Pool<List<Throwable>> pool) {
        this(pool, e);
    }

    public static <Model, Data> d7g<Model, Data> f() {
        return (d7g<Model, Data>) f;
    }

    public final <Model, Data> void a(Class<Model> cls, Class<Data> cls2, e7g<? extends Model, ? extends Data> e7gVar, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, e7gVar);
        List<b<?, ?>> list = this.f20939a;
        list.add(z ? list.size() : 0, bVar);
    }

    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, e7g<? extends Model, ? extends Data> e7gVar) {
        a(cls, cls2, e7gVar, true);
    }

    public final <Model, Data> d7g<Model, Data> c(b<?, ?> bVar) {
        return (d7g) a6i.d(bVar.c.d(this));
    }

    public synchronized <Model, Data> d7g<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f20939a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f20940b.a(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (d7g) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public synchronized <Model> List<d7g<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f20939a) {
                if (!this.c.contains(bVar) && bVar.a(cls)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f20939a) {
            if (!arrayList.contains(bVar.f20942b) && bVar.a(cls)) {
                arrayList.add(bVar.f20942b);
            }
        }
        return arrayList;
    }

    public final <Model, Data> e7g<Model, Data> h(b<?, ?> bVar) {
        return (e7g<Model, Data>) bVar.c;
    }

    public synchronized <Model, Data> List<e7g<? extends Model, ? extends Data>> i(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f20939a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> List<e7g<? extends Model, ? extends Data>> j(Class<Model> cls, Class<Data> cls2, e7g<? extends Model, ? extends Data> e7gVar) {
        List<e7g<? extends Model, ? extends Data>> listI;
        listI = i(cls, cls2);
        b(cls, cls2, e7gVar);
        return listI;
    }

    @VisibleForTesting
    public iag(Pools.Pool<List<Throwable>> pool, c cVar) {
        this.f20939a = new ArrayList();
        this.c = new HashSet();
        this.d = pool;
        this.f20940b = cVar;
    }
}
