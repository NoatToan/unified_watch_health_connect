package g2;

import g2.t1.a;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B-\b\u0017\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\nB!\b\u0017\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Lg2/z0;", "", "<init>", "()V", "Lg2/x1;", "prefetchScheduler", "Lkotlin/Function1;", "Lg2/r1;", "", "onNestedPrefetch", "(Lg2/x1;Le23/l;)V", "(Le23/l;)V", "b", "c", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f75312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<? super r1, Unit> f75313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f75314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t1 f75315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f75317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75318g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg2/z0$a;", "Lg2/r1;", "", "nestedPrefetchItemCount", "<init>", "(Lg2/z0;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a implements r1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f75319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f75320b = new ArrayList();

        public a(int i14) {
            this.f75319a = i14;
        }

        @Override // g2.r1
        public final void a(int i14) {
            z0 z0Var = z0.this;
            t1 t1Var = z0Var.f75315d;
            if (t1Var == null) {
                return;
            }
            u1 u1Var = z0Var.f75314c;
            x1 x1Var = t1Var.f75219c;
            this.f75320b.add(t1Var.new a(i14, u1Var, x1Var instanceof z1 ? (z1) x1Var : null, null));
        }

        @Override // g2.r1
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF75319a() {
            return this.f75319a;
        }
    }

    public interface b {
        void cancel();

        void d();
    }

    public interface c {
        int b();

        long c(int i14);
    }

    public z0() {
        this.f75314c = new u1();
        this.f75316e = -1;
        this.f75317f = -1;
    }

    public final b a(int i14, long j8, boolean z14, e23.l<? super c, Unit> lVar) {
        t1 t1Var = this.f75315d;
        if (t1Var == null) {
            return i.f75132a;
        }
        x1 x1Var = t1Var.f75219c;
        boolean z15 = x1Var instanceof z1;
        t1.a aVar = new t1.a(t1Var, i14, j8, this.f75314c, z15 ? (z1) x1Var : null, lVar, null);
        if (!z15) {
            x1Var.a(aVar);
        } else if (z14) {
            ((z1) x1Var).c(aVar);
        } else {
            ((z1) x1Var).b(aVar);
        }
        i6.a.a(i14, "compose:lazy:schedule_prefetch:index");
        return aVar;
    }

    public /* synthetic */ z0(x1 x1Var, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : x1Var, (i14 & 2) != 0 ? null : lVar);
    }

    @o13.e
    public z0(x1 x1Var, e23.l<? super r1, Unit> lVar) {
        this();
        this.f75312a = x1Var;
        this.f75313b = lVar;
    }

    public z0(e23.l<? super r1, Unit> lVar) {
        this();
        this.f75313b = lVar;
    }

    public /* synthetic */ z0(e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : lVar);
    }
}
