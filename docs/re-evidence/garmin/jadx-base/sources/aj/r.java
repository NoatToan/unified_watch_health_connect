package aj;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class r<Model, Data> implements o<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<o<Model, Data>> f3377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.e<List<Throwable>> f3378b;

    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, com.bumptech.glide.load.data.d.a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f3379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k7.e<List<Throwable>> f3380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.bumptech.glide.g f3382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.bumptech.glide.load.data.d.a<? super Data> f3383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<Throwable> f3384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3385g;

        public a(List<com.bumptech.glide.load.data.d<Data>> list, k7.e<List<Throwable>> eVar) {
            this.f3380b = eVar;
            if (list.isEmpty()) {
                vb.h.s("Must not be empty.");
                throw null;
            }
            this.f3379a = list;
            this.f3381c = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f3379a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final ui.a b() {
            return this.f3379a.get(0).b();
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void c(Data data) {
            if (data != null) {
                this.f3383e.c(data);
            } else {
                f();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f3385g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f3379a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
            List<Throwable> list = this.f3384f;
            if (list != null) {
                this.f3380b.a(list);
            }
            this.f3384f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f3379a.iterator();
            while (it.hasNext()) {
                it.next().cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            this.f3382d = gVar;
            this.f3383e = aVar;
            this.f3384f = this.f3380b.acquire();
            this.f3379a.get(this.f3381c).d(gVar, this);
            if (this.f3385g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void e(Exception exc) {
            List<Throwable> list = this.f3384f;
            qj.l.c(list, "Argument must not be null");
            list.add(exc);
            f();
        }

        public final void f() {
            if (this.f3385g) {
                return;
            }
            if (this.f3381c < this.f3379a.size() - 1) {
                this.f3381c++;
                d(this.f3382d, this.f3383e);
            } else {
                qj.l.b(this.f3384f);
                this.f3383e.e(new GlideException("Fetch failed", new ArrayList(this.f3384f)));
            }
        }
    }

    public r(List<o<Model, Data>> list, k7.e<List<Throwable>> eVar) {
        this.f3377a = list;
        this.f3378b = eVar;
    }

    @Override // aj.o
    public final o.a<Data> a(Model model, int i14, int i15, ui.h hVar) {
        o.a<Data> aVarA;
        List<o<Model, Data>> list = this.f3377a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        ui.e eVar = null;
        for (int i16 = 0; i16 < size; i16++) {
            o<Model, Data> oVar = list.get(i16);
            if (oVar.b(model) && (aVarA = oVar.a(model, i14, i15, hVar)) != null) {
                eVar = aVarA.f3370a;
                arrayList.add(aVarA.f3372c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new o.a<>(eVar, new a(arrayList, this.f3378b));
    }

    @Override // aj.o
    public final boolean b(Model model) {
        Iterator<o<Model, Data>> it = this.f3377a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f3377a.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
