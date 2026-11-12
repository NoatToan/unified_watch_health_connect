package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp3/n3;", "Lf4/h0;", "Lp3/o1;", "Lf4/q;", "", "value", "<init>", "(J)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class n3 extends f4.h0 implements o1, f4.q<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f135175b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp3/n3$a;", "Lf4/i0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "value", "<init>", "(JJ)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f4.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f135176c;

        public a(long j8, long j14) {
            super(j8);
            this.f135176c = j14;
        }

        @Override // f4.i0
        public final void a(f4.i0 i0Var) {
            i0Var.getClass();
            this.f135176c = ((a) i0Var).f135176c;
        }

        @Override // f4.i0
        public final f4.i0 b() {
            return c(f4.l.i().getF68737b());
        }

        @Override // f4.i0
        public final f4.i0 c(long j8) {
            return new a(j8, this.f135176c);
        }
    }

    public n3(long j8) {
        f4.f fVarI = f4.l.i();
        a aVar = new a(fVarI.getF68737b(), j8);
        if (!(fVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.f68750b = new a(1, j8);
        }
        this.f135175b = aVar;
    }

    @Override // f4.q
    public final p3<Long> b() {
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        return a4Var;
    }

    @Override // p3.o1
    public final long j() {
        return ((a) f4.l.s(this.f135175b, this)).f135176c;
    }

    @Override // p3.o1
    public final void k(long j8) {
        f4.f fVarI;
        a aVar = (a) f4.l.g(this.f135175b);
        if (aVar.f135176c != j8) {
            a aVar2 = this.f135175b;
            synchronized (f4.l.f68775c) {
                f4.f.f68735e.getClass();
                fVarI = f4.l.i();
                ((a) f4.l.n(aVar2, this, fVarI, aVar)).f135176c = j8;
                Unit unit = Unit.INSTANCE;
            }
            f4.l.m(fVarI, this);
        }
    }

    @Override // f4.g0
    public final f4.i0 m() {
        return this.f135175b;
    }

    @Override // f4.g0
    public final f4.i0 o(f4.i0 i0Var, f4.i0 i0Var2, f4.i0 i0Var3) {
        if (((a) i0Var2).f135176c == ((a) i0Var3).f135176c) {
            return i0Var2;
        }
        return null;
    }

    @Override // f4.g0
    public final void q(f4.i0 i0Var) {
        i0Var.getClass();
        this.f135175b = (a) i0Var;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((a) f4.l.g(this.f135175b)).f135176c + ")@" + hashCode();
    }

    @Override // p3.p1
    public final e23.l<Long, Unit> y() {
        return new q1(this, 7);
    }

    @Override // p3.p1
    public final Long z() {
        return Long.valueOf(j());
    }
}
