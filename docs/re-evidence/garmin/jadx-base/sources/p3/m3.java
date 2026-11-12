package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp3/m3;", "Lf4/h0;", "Lp3/n1;", "Lf4/q;", "", "value", "<init>", "(I)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class m3 extends f4.h0 implements n1, f4.q<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f135156b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp3/m3$a;", "Lf4/i0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "", "value", "<init>", "(JI)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f4.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f135157c;

        public a(long j8, int i14) {
            super(j8);
            this.f135157c = i14;
        }

        @Override // f4.i0
        public final void a(f4.i0 i0Var) {
            i0Var.getClass();
            this.f135157c = ((a) i0Var).f135157c;
        }

        @Override // f4.i0
        public final f4.i0 b() {
            return c(f4.l.i().getF68737b());
        }

        @Override // f4.i0
        public final f4.i0 c(long j8) {
            return new a(j8, this.f135157c);
        }
    }

    public m3(int i14) {
        f4.f fVarI = f4.l.i();
        a aVar = new a(fVarI.getF68737b(), i14);
        if (!(fVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.f68750b = new a(1, i14);
        }
        this.f135156b = aVar;
    }

    @Override // f4.q
    public final p3<Integer> b() {
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        return a4Var;
    }

    @Override // p3.n1
    public final int getIntValue() {
        return ((a) f4.l.s(this.f135156b, this)).f135157c;
    }

    @Override // f4.g0
    public final f4.i0 m() {
        return this.f135156b;
    }

    @Override // f4.g0
    public final f4.i0 o(f4.i0 i0Var, f4.i0 i0Var2, f4.i0 i0Var3) {
        if (((a) i0Var2).f135157c == ((a) i0Var3).f135157c) {
            return i0Var2;
        }
        return null;
    }

    @Override // f4.g0
    public final void q(f4.i0 i0Var) {
        i0Var.getClass();
        this.f135156b = (a) i0Var;
    }

    @Override // p3.n1
    public final void t(int i14) {
        f4.f fVarI;
        a aVar = (a) f4.l.g(this.f135156b);
        if (aVar.f135157c != i14) {
            a aVar2 = this.f135156b;
            synchronized (f4.l.f68775c) {
                f4.f.f68735e.getClass();
                fVarI = f4.l.i();
                ((a) f4.l.n(aVar2, this, fVarI, aVar)).f135157c = i14;
                Unit unit = Unit.INSTANCE;
            }
            f4.l.m(fVarI, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((a) f4.l.g(this.f135156b)).f135157c + ")@" + hashCode();
    }

    @Override // p3.p1
    public final e23.l<Integer, Unit> y() {
        return new q1(this, 6);
    }

    @Override // p3.p1
    public final Integer z() {
        return Integer.valueOf(getIntValue());
    }
}
