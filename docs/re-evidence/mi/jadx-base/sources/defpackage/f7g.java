package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class f7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iag f17497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17498b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, C0933a<?>> f17499a = new HashMap();

        /* JADX INFO: renamed from: f7g$a$a, reason: collision with other inner class name */
        public static class C0933a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<d7g<Model, ?>> f17500a;

            public C0933a(List<d7g<Model, ?>> list) {
                this.f17500a = list;
            }
        }

        public void a() {
            this.f17499a.clear();
        }

        public <Model> List<d7g<Model, ?>> b(Class<Model> cls) {
            C0933a<?> c0933a = this.f17499a.get(cls);
            if (c0933a == null) {
                return null;
            }
            return (List<d7g<Model, ?>>) c0933a.f17500a;
        }

        public <Model> void c(Class<Model> cls, List<d7g<Model, ?>> list) {
            if (this.f17499a.put(cls, new C0933a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public f7g(Pools.Pool<List<Throwable>> pool) {
        this(new iag(pool));
    }

    public static <A> Class<A> b(A a2) {
        return (Class<A>) a2.getClass();
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, e7g<? extends Model, ? extends Data> e7gVar) {
        this.f17497a.b(cls, cls2, e7gVar);
        this.f17498b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f17497a.g(cls);
    }

    public <A> List<d7g<A, ?>> d(A a2) {
        List<d7g<A, ?>> listE = e(b(a2));
        if (listE.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a2);
        }
        int size = listE.size();
        List<d7g<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            d7g<A, ?> d7gVar = listE.get(i);
            if (d7gVar.a(a2)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(d7gVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a2, listE);
        }
        return listEmptyList;
    }

    public final synchronized <A> List<d7g<A, ?>> e(Class<A> cls) {
        List<d7g<A, ?>> listB;
        listB = this.f17498b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f17497a.e(cls));
            this.f17498b.c(cls, listB);
        }
        return listB;
    }

    public synchronized <Model, Data> void f(Class<Model> cls, Class<Data> cls2, e7g<? extends Model, ? extends Data> e7gVar) {
        g(this.f17497a.j(cls, cls2, e7gVar));
        this.f17498b.a();
    }

    public final <Model, Data> void g(List<e7g<? extends Model, ? extends Data>> list) {
        Iterator<e7g<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public f7g(iag iagVar) {
        this.f17498b = new a();
        this.f17497a = iagVar;
    }
}
