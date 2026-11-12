package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm63/o;", "T", "Lm63/v1;", "Lkotlin/Function1;", "Lk23/d;", "Li63/c;", "compute", "<init>", "(Le23/l;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o<T> implements v1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<k23.d<?>, i63.c<T>> f116998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<j<T>> f116999b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e23.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k23.d f117001b;

        public a(k23.d dVar) {
            this.f117001b = dVar;
        }

        @Override // e23.a
        public final T invoke() {
            return (T) new j(o.this.f116998a.invoke(this.f117001b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(e23.l<? super k23.d<?>, ? extends i63.c<T>> lVar) {
        lVar.getClass();
        this.f116998a = lVar;
        this.f116999b = new r<>();
    }

    @Override // m63.v1
    public final i63.c<T> a(k23.d<Object> dVar) {
        Object obj = this.f116999b.get(dh.b.u(dVar));
        obj.getClass();
        z0 z0Var = (z0) obj;
        T t7 = z0Var.reference.get();
        if (t7 == null) {
            t7 = (T) z0Var.a(new a(dVar));
        }
        return t7.f116964a;
    }
}
