package aj;

import com.bumptech.glide.Registry;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3386e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3387f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f3390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k7.e<List<Throwable>> f3391d;

    public static class a implements o<Object, Object> {
        @Override // aj.o
        public final o.a<Object> a(Object obj, int i14, int i15, ui.h hVar) {
            return null;
        }

        @Override // aj.o
        public final boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Model> f3392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<Data> f3393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p<? extends Model, ? extends Data> f3394c;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f3392a = cls;
            this.f3393b = cls2;
            this.f3394c = pVar;
        }
    }

    public static class c {
    }

    public s(k7.e<List<Throwable>> eVar, c cVar) {
        this.f3388a = new ArrayList();
        this.f3390c = new HashSet();
        this.f3391d = eVar;
        this.f3389b = cVar;
    }

    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        b bVar = new b(cls, cls2, pVar);
        ArrayList arrayList = this.f3388a;
        arrayList.add(arrayList.size(), bVar);
    }

    public final <Model, Data> o<Model, Data> b(b<?, ?> bVar) {
        o<Model, Data> oVar = (o<Model, Data>) bVar.f3394c.d(this);
        qj.l.c(oVar, "Argument must not be null");
        return oVar;
    }

    public final synchronized <Model, Data> o<Model, Data> c(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f3388a.iterator();
            boolean z14 = false;
            while (true) {
                boolean z15 = true;
                if (!it.hasNext()) {
                    break;
                }
                b<?, ?> bVar = (b) it.next();
                if (this.f3390c.contains(bVar)) {
                    z14 = true;
                } else {
                    if (!bVar.f3392a.isAssignableFrom(cls) || !bVar.f3393b.isAssignableFrom(cls2)) {
                        z15 = false;
                    }
                    if (z15) {
                        this.f3390c.add(bVar);
                        arrayList.add(b(bVar));
                        this.f3390c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f3389b;
                k7.e<List<Throwable>> eVar = this.f3391d;
                cVar.getClass();
                return new r(arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z14) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f3387f;
        } catch (Throwable th3) {
            this.f3390c.clear();
            throw th3;
        }
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f3388a) {
                if (!this.f3390c.contains(bVar) && bVar.f3392a.isAssignableFrom(cls)) {
                    this.f3390c.add(bVar);
                    arrayList.add(b(bVar));
                    this.f3390c.remove(bVar);
                }
            }
        } catch (Throwable th3) {
            this.f3390c.clear();
            throw th3;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList e(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f3388a) {
            if (!arrayList.contains(bVar.f3393b) && bVar.f3392a.isAssignableFrom((Class<?>) cls)) {
                arrayList.add(bVar.f3393b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList f() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f3388a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f3392a.isAssignableFrom(h.class) && bVar.f3393b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(bVar.f3394c);
            }
        }
        return arrayList;
    }

    public s(k7.e<List<Throwable>> eVar) {
        this(eVar, f3386e);
    }
}
