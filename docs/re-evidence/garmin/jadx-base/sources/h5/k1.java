package h5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lh5/k1;", "Lh5/p1;", "Lh5/i1;", "observerNode", "<init>", "(Lh5/i1;)V", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k1 implements p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f81855b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f81856c = a.f81858a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f81857a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/k1;", "it", "", "invoke", "(Lh5/k1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<k1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81858a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(k1 k1Var) {
            k1 k1Var2 = k1Var;
            if (k1Var2.X0()) {
                k1Var2.f81857a.x1();
            }
            return Unit.INSTANCE;
        }
    }

    public k1(i1 i1Var) {
        this.f81857a = i1Var;
    }

    @Override // h5.p1
    public final boolean X0() {
        return this.f81857a.getNode().getIsAttached();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/k1$b;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
