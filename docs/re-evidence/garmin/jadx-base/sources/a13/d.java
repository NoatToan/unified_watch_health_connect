package a13;

import q03.p;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends q03.g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.l<T> f418b;

    public static final class a<T> implements p<T>, b83.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b83.b<? super T> f419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s03.b f420b;

        public a(b83.b<? super T> bVar) {
            this.f419a = bVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            this.f420b = bVar;
            this.f419a.d(this);
        }

        @Override // b83.c
        public final void b(long j8) {
        }

        @Override // q03.p
        public final void c(T t7) {
            this.f419a.c(t7);
        }

        @Override // b83.c
        public final void cancel() {
            this.f420b.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            this.f419a.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            this.f419a.onError(th3);
        }
    }

    public d(q03.l<T> lVar) {
        this.f418b = lVar;
    }

    @Override // q03.g
    public final void c(q03.h hVar) {
        this.f418b.b(new a(hVar));
    }
}
