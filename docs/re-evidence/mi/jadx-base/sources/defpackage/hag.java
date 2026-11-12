package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class hag<Model, Data> implements d7g<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d7g<Model, Data>> f19860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f19861b;

    public static class a<Data> implements jl5<Data>, jl5.a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<jl5<Data>> f19862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pools.Pool<List<Throwable>> f19863b;
        public int c;
        public Priority d;
        public jl5.a<? super Data> e;
        public List<Throwable> f;
        public boolean g;

        public a(List<jl5<Data>> list, Pools.Pool<List<Throwable>> pool) {
            this.f19863b = pool;
            a6i.c(list);
            this.f19862a = list;
            this.c = 0;
        }

        @Override // defpackage.jl5
        public Class<Data> a() {
            return this.f19862a.get(0).a();
        }

        @Override // defpackage.jl5
        public void b() {
            List<Throwable> list = this.f;
            if (list != null) {
                this.f19863b.release(list);
            }
            this.f = null;
            Iterator<jl5<Data>> it = this.f19862a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super Data> aVar) {
            this.d = priority;
            this.e = aVar;
            this.f = this.f19863b.acquire();
            this.f19862a.get(this.c).c(priority, this);
            if (this.g) {
                cancel();
            }
        }

        @Override // defpackage.jl5
        public void cancel() {
            this.g = true;
            Iterator<jl5<Data>> it = this.f19862a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // defpackage.jl5
        public DataSource d() {
            return this.f19862a.get(0).d();
        }

        @Override // jl5.a
        public void e(Data data) {
            if (data != null) {
                this.e.e(data);
            } else {
                g();
            }
        }

        @Override // jl5.a
        public void f(Exception exc) {
            ((List) a6i.d(this.f)).add(exc);
            g();
        }

        public final void g() {
            if (this.g) {
                return;
            }
            if (this.c < this.f19862a.size() - 1) {
                this.c++;
                c(this.d, this.e);
            } else {
                a6i.d(this.f);
                this.e.f(new GlideException("Fetch failed", new ArrayList(this.f)));
            }
        }
    }

    public hag(List<d7g<Model, Data>> list, Pools.Pool<List<Throwable>> pool) {
        this.f19860a = list;
        this.f19861b = pool;
    }

    @Override // defpackage.d7g
    public boolean a(Model model) {
        Iterator<d7g<Model, Data>> it = this.f19860a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.d7g
    public d7g.a<Data> b(Model model, int i, int i2, cch cchVar) {
        d7g.a<Data> aVarB;
        int size = this.f19860a.size();
        ArrayList arrayList = new ArrayList(size);
        pzd pzdVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            d7g<Model, Data> d7gVar = this.f19860a.get(i3);
            if (d7gVar.a(model) && (aVarB = d7gVar.b(model, i, i2, cchVar)) != null) {
                pzdVar = aVarB.f15175a;
                arrayList.add(aVarB.c);
            }
        }
        if (arrayList.isEmpty() || pzdVar == null) {
            return null;
        }
        return new d7g.a<>(pzdVar, new a(arrayList, this.f19861b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f19860a.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
