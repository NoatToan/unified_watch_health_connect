package aj;

/* JADX INFO: loaded from: classes7.dex */
public class x<Model> implements o<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x<?> f3406a = new x<>();

    public static class a<Model> implements p<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<?> f3407a = new a<>();

        @Deprecated
        public a() {
        }

        @Override // aj.p
        public final o<Model, Model> d(s sVar) {
            return x.f3406a;
        }
    }

    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Model f3408a;

        public b(Model model) {
            this.f3408a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Model> a() {
            return (Class<Model>) this.f3408a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public final ui.a b() {
            return ui.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Model> aVar) {
            aVar.c(this.f3408a);
        }
    }

    @Deprecated
    public x() {
    }

    @Override // aj.o
    public final o.a<Model> a(Model model, int i14, int i15, ui.h hVar) {
        return new o.a<>(new pj.d(model), new b(model));
    }

    @Override // aj.o
    public final boolean b(Model model) {
        return true;
    }
}
