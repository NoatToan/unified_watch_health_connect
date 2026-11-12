package ue;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lue/x;", "Lue/j0;", "Lue/x$a;", "builder", "<init>", "(Lue/x$a;)V", "a", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f170131e = new b(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a aVar) {
        super(aVar.f170097b, aVar.f170098c, aVar.f170099d);
        aVar.getClass();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lue/x$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lue/x$a;", "Lue/j0$a;", "Lue/x;", "Ljava/lang/Class;", "Landroidx/work/d;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Lk23/d;", "(Lk23/d;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends j0.a<a, x> {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(k23.d<? extends androidx.work.d> dVar) {
            this((Class<? extends androidx.work.d>) dh.b.u(dVar));
            dVar.getClass();
        }

        @Override // ue.j0.a
        public final j0 b() {
            if (!this.f170096a || !this.f170098c.f26950j.f170046d) {
                return new x(this);
            }
            vb.h.s("Cannot set backoff criteria on an idle mode job");
            return null;
        }

        @Override // ue.j0.a
        public final j0.a c() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.d> cls) {
            super(cls);
            cls.getClass();
        }
    }
}
