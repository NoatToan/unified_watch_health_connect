package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp3/k3;", "Lf4/h0;", "Lp3/l1;", "Lf4/q;", "", "value", "<init>", "(D)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class k3 extends f4.h0 implements l1, f4.q<Double> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f135145b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp3/k3$a;", "Lf4/i0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "", "value", "<init>", "(JD)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f4.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f135146c;

        public a(long j8, double d14) {
            super(j8);
            this.f135146c = d14;
        }

        @Override // f4.i0
        public final void a(f4.i0 i0Var) {
            i0Var.getClass();
            this.f135146c = ((a) i0Var).f135146c;
        }

        @Override // f4.i0
        public final f4.i0 b() {
            return c(this.f68749a);
        }

        @Override // f4.i0
        public final f4.i0 c(long j8) {
            return new a(j8, this.f135146c);
        }
    }

    public k3(double d14) {
        f4.f fVarI = f4.l.i();
        a aVar = new a(fVarI.getF68737b(), d14);
        if (!(fVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.f68750b = new a(1, d14);
        }
        this.f135145b = aVar;
    }

    @Override // f4.q
    public final p3<Double> b() {
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        return a4Var;
    }

    @Override // p3.l1
    public final double getDoubleValue() {
        return ((a) f4.l.s(this.f135145b, this)).f135146c;
    }

    @Override // f4.g0
    public final f4.i0 m() {
        return this.f135145b;
    }

    @Override // f4.g0
    public final f4.i0 o(f4.i0 i0Var, f4.i0 i0Var2, f4.i0 i0Var3) {
        if (((a) i0Var2).f135146c == ((a) i0Var3).f135146c) {
            return i0Var2;
        }
        return null;
    }

    @Override // f4.g0
    public final void q(f4.i0 i0Var) {
        i0Var.getClass();
        this.f135145b = (a) i0Var;
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((a) f4.l.g(this.f135145b)).f135146c + ")@" + hashCode();
    }

    @Override // p3.l1
    public final void u(double d14) {
        f4.f fVarI;
        a aVar = (a) f4.l.g(this.f135145b);
        if (aVar.f135146c == d14) {
            return;
        }
        a aVar2 = this.f135145b;
        synchronized (f4.l.f68775c) {
            f4.f.f68735e.getClass();
            fVarI = f4.l.i();
            ((a) f4.l.n(aVar2, this, fVarI, aVar)).f135146c = d14;
            Unit unit = Unit.INSTANCE;
        }
        f4.l.m(fVarI, this);
    }

    @Override // p3.p1
    public final e23.l<Double, Unit> y() {
        return new q1(this, 4);
    }

    @Override // p3.p1
    public final Double z() {
        return Double.valueOf(getDoubleValue());
    }
}
