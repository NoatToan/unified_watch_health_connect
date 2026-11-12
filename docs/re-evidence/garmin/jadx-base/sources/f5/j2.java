package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\t¨\u0006\f"}, d2 = {"Lf5/j2;", "", "Lf5/l2;", "slotReusePolicy", "<init>", "(Lf5/l2;)V", "()V", "", "maxSlotsToRetainForReuse", "(I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f68977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f68978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f68979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f68980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f68981e;

    public interface a {
        boolean a(com.google.android.exoplayer2.analytics.q qVar);

        b apply();

        void cancel();

        boolean isComplete();
    }

    public interface b {
        default int b() {
            return 0;
        }

        default long c(int i14) {
            g6.m.f76012b.getClass();
            return 0L;
        }

        default void d(int i14, long j8) {
        }

        void dispose();

        default void e(c2.s0 s0Var) {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh5/e0;", "Lp3/p;", "it", "", "invoke", "(Lh5/e0;Lp3/p;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.p<h5.e0, p3.p, Unit> {
        public c() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(h5.e0 e0Var, p3.p pVar) {
            j2.this.a().f69024b = pVar;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh5/e0;", "Lkotlin/Function2;", "Lf5/k2;", "Lg6/a;", "Lf5/a1;", "it", "", "invoke", "(Lh5/e0;Le23/p;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.p<h5.e0, e23.p<? super k2, ? super g6.a, ? extends a1>, Unit> {
        public d() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(h5.e0 e0Var, e23.p<? super k2, ? super g6.a, ? extends a1> pVar) {
            q0 q0VarA = j2.this.a();
            e0Var.i(new r0(q0VarA, pVar, q0VarA.f69038p));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh5/e0;", "Lf5/j2;", "it", "", "invoke", "(Lh5/e0;Lf5/j2;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.p<h5.e0, j2, Unit> {
        public e() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(h5.e0 e0Var, j2 j2Var) {
            h5.e0 e0Var2 = e0Var;
            q0 q0Var = e0Var2.X;
            j2 j2Var2 = j2.this;
            if (q0Var == null) {
                q0Var = new q0(e0Var2, j2Var2.f68977a);
                e0Var2.X = q0Var;
            }
            j2Var2.f68978b = q0Var;
            j2Var2.a().h();
            q0 q0VarA = j2Var2.a();
            l2 l2Var = j2Var2.f68977a;
            if (q0VarA.f69025c != l2Var) {
                q0VarA.f69025c = l2Var;
                q0VarA.i(false);
                h5.e0.j0(q0VarA.f69023a, false, 7);
            }
            return Unit.INSTANCE;
        }
    }

    public j2(l2 l2Var) {
        this.f68977a = l2Var;
        this.f68979c = new e();
        this.f68980d = new c();
        this.f68981e = new d();
    }

    public final q0 a() {
        q0 q0Var = this.f68978b;
        if (q0Var != null) {
            return q0Var;
        }
        vb.h.s("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    public j2() {
        this(g1.f68952a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public j2(int i14) {
        this(new m(i14));
        i2.a aVar = i2.f68961a;
    }
}
