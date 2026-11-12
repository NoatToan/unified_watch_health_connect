package z03;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.f f200747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.f f200748b;

    /* JADX INFO: renamed from: z03.a$a, reason: collision with other inner class name */
    public static final class C3750a implements q03.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<s03.b> f200749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.d f200750b;

        public C3750a(AtomicReference<s03.b> atomicReference, q03.d dVar) {
            this.f200749a = atomicReference;
            this.f200750b = dVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            v03.c.d(this.f200749a, bVar);
        }

        @Override // q03.d
        public final void onComplete() {
            this.f200750b.onComplete();
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f200750b.onError(th3);
        }
    }

    public static final class b extends AtomicReference<s03.b> implements q03.d, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.f f200752b;

        public b(q03.d dVar, q03.f fVar) {
            this.f200751a = dVar;
            this.f200752b = fVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f200751a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // q03.d
        public final void onComplete() {
            this.f200752b.a(new C3750a(this, this.f200751a));
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f200751a.onError(th3);
        }
    }

    public a(q03.f fVar, q03.f fVar2) {
        this.f200747a = fVar;
        this.f200748b = fVar2;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        this.f200747a.a(new b(dVar, this.f200748b));
    }
}
