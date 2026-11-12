package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp3/u1;", "", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Le23/a;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3.b f135321a = new z3.b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3.c<a> f135322b = new z3.c<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oe.j f135323c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/u1$a;", "Lz3/c$a;", "Lkotlin/Function0;", "", "onNextFrameEnd", "<init>", "(Le23/a;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends z3.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e23.a<Unit> f135324a;

        public a(e23.a<Unit> aVar) {
            this.f135324a = aVar;
        }

        @Override // z3.c.a
        public final void a() {
            this.f135324a = null;
        }

        @Override // z3.c.a
        public final void b(Throwable th3) throws Throwable {
            throw th3;
        }
    }

    public u1(e23.a<Unit> aVar) {
        this.f135323c = new oe.j(27, this, aVar);
    }
}
