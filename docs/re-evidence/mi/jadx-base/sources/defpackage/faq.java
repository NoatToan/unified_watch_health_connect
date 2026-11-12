package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes4.dex */
public class faq<Model> implements d7g<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final faq<?> f17610a = new faq<>();

    public static class a<Model> implements e7g<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<?> f17611a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f17611a;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Model, Model> d(iag iagVar) {
            return faq.c();
        }
    }

    public static class b<Model> implements jl5<Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Model f17612a;

        public b(Model model) {
            this.f17612a = model;
        }

        @Override // defpackage.jl5
        public Class<Model> a() {
            return (Class<Model>) this.f17612a.getClass();
        }

        @Override // defpackage.jl5
        public void b() {
        }

        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super Model> aVar) {
            aVar.e(this.f17612a);
        }

        @Override // defpackage.jl5
        public void cancel() {
        }

        @Override // defpackage.jl5
        public DataSource d() {
            return DataSource.LOCAL;
        }
    }

    @Deprecated
    public faq() {
    }

    public static <T> faq<T> c() {
        return (faq<T>) f17610a;
    }

    @Override // defpackage.d7g
    public boolean a(Model model) {
        return true;
    }

    @Override // defpackage.d7g
    public d7g.a<Model> b(Model model, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(model), new b(model));
    }
}
