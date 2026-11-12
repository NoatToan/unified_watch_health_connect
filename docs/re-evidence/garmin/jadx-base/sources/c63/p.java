package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lc63/p;", "Lc63/a;", "Lc63/m;", "Lc63/o;", "Le63/f;", "actualFormat", "<init>", "(Le63/f;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends c63.a<m, o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e63.f<o> f25036a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc63/p$a;", "Lc63/b;", "Lc63/o;", "Lc63/d;", "Lc63/e;", "Lc63/s$c;", "Le63/d;", "actualBuilder", "<init>", "(Le63/d;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements b<o, a>, d, e, s.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e63.d<o> f25037a;

        public a(e63.d<o> dVar) {
            dVar.getClass();
            this.f25037a = dVar;
        }

        @Override // c63.b
        public final e63.d<o> A() {
            return this.f25037a;
        }

        @Override // c63.b
        public final b C() {
            return new a(new e63.d());
        }

        @Override // c63.s.c
        public final void G() {
            this.f25037a.a(new e63.e(new x0()));
        }

        @Override // c63.e
        public final void M(e63.o<? super c1> oVar) {
            oVar.getClass();
            this.f25037a.a(oVar);
        }

        @Override // c63.s.c
        public final void N(r<m> rVar) {
            rVar.getClass();
            if (rVar instanceof p) {
                this.f25037a.a(((p) rVar).f25036a);
            }
        }

        @Override // c63.d
        public final void O(e63.o<Object> oVar) {
            oVar.getClass();
            this.f25037a.a(oVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(e63.f<? super o> fVar) {
        super(null);
        fVar.getClass();
        this.f25036a = fVar;
    }

    @Override // c63.a
    public final e63.f<o> c() {
        return this.f25036a;
    }

    @Override // c63.a
    public final g63.c d() {
        return q.f25043b;
    }

    @Override // c63.a
    public final g63.c e(m mVar) {
        m mVar2 = mVar;
        mVar2.getClass();
        return mVar2.f25015a;
    }

    @Override // c63.a
    public final m f(g63.c cVar) {
        o oVar = (o) cVar;
        oVar.getClass();
        return new m(oVar);
    }
}
