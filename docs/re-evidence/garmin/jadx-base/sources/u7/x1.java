package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lu7/x1;", "Lt13/g$a;", "parent", "Lu7/m;", "instance", "<init>", "(Lu7/x1;Lu7/m;)V", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x1 implements t13.g.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f169363c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f169364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m<?> f169365b;

    static {
        new a(null);
        f169363c = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    }

    public x1(x1 x1Var, m<?> mVar) {
        mVar.getClass();
        this.f169364a = x1Var;
        this.f169365b = mVar;
    }

    public final void b(m mVar) {
        if (this.f169365b == mVar) {
            throw new IllegalStateException(f169363c.toString());
        }
        x1 x1Var = this.f169364a;
        if (x1Var != null) {
            x1Var.b(mVar);
        }
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) t13.g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g.a
    public final t13.g.b<?> getKey() {
        return a.C3168a.f169366a;
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return t13.g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu7/x1$a;", "", "<init>", "()V", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: u7.x1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu7/x1$a$a;", "Lt13/g$b;", "Lu7/x1;", "<init>", "()V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C3168a implements t13.g.b<x1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3168a f169366a = new C3168a();

            private C3168a() {
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
