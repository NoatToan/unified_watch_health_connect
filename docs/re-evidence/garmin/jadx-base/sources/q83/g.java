package q83;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends j83.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f143411a = new g();

    public final class a extends j83.h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y83.a f143412a = new y83.a();

        public a(g gVar) {
        }

        @Override // j83.h.a
        public final j83.o a(n83.a aVar) {
            aVar.d();
            return y83.d.f195249a;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143412a.e();
        }

        @Override // j83.o
        public final void f() {
            this.f143412a.f();
        }
    }

    private g() {
    }

    @Override // j83.h
    public final j83.h.a createWorker() {
        return new a(this);
    }
}
