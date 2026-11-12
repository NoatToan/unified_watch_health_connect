package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp3/d;", "Lp3/e1;", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Le23/a;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f135049c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f135050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3.c<a<?>> f135051b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp3/d$a;", "R", "Lz3/c$a;", "Lkotlin/Function1;", "", "onFrame", "Lo53/j;", "continuation", "<init>", "(Le23/l;Lo53/j;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> extends z3.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j<? super R> f135052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e23.l<? super Long, ? extends R> f135053b;

        public a(e23.l<? super Long, ? extends R> lVar, o53.j<? super R> jVar) {
            this.f135052a = jVar;
            this.f135053b = lVar;
        }

        @Override // z3.c.a
        public final void a() {
            this.f135053b = null;
            this.f135052a = null;
        }

        @Override // z3.c.a
        public final void b(Throwable th3) {
            o53.j<? super R> jVar = this.f135052a;
            if (jVar != null) {
                int i14 = o13.q.f128596b;
                jVar.resumeWith(o13.r.a(th3));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f135054a;

        public b(e eVar) {
            this.f135054a = eVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            this.f135054a.cancel();
            return Unit.INSTANCE;
        }
    }

    public d(e23.a<Unit> aVar) {
        this.f135050a = aVar;
        this.f135051b = new z3.c<>();
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) t13.g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return t13.g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }

    @Override // p3.e1
    public final <R> Object v(e23.l<? super Long, ? extends R> lVar, t13.d<? super R> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        kVar.r(new b(this.f135051b.a(new a(lVar, kVar), this.f135050a)));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ d(e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : aVar);
    }
}
