package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lp3/o3;", "T", "Lf4/h0;", "Lf4/q;", "value", "Lp3/p3;", "policy", "<init>", "(Ljava/lang/Object;Lp3/p3;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class o3<T> extends f4.h0 implements f4.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3<T> f135211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a<T> f135212c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp3/o3$a;", "T", "Lf4/i0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "myValue", "<init>", "(JLjava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends f4.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f135213c;

        public a(long j8, T t7) {
            super(j8);
            this.f135213c = t7;
        }

        @Override // f4.i0
        public final void a(f4.i0 i0Var) {
            i0Var.getClass();
            this.f135213c = ((a) i0Var).f135213c;
        }

        @Override // f4.i0
        public final f4.i0 b() {
            return new a(f4.l.i().getF68737b(), this.f135213c);
        }

        @Override // f4.i0
        public final f4.i0 c(long j8) {
            return new a(f4.l.i().getF68737b(), this.f135213c);
        }
    }

    public o3(T t7, p3<T> p3Var) {
        this.f135211b = p3Var;
        f4.f fVarI = f4.l.i();
        a<T> aVar = new a<>(fVarI.getF68737b(), t7);
        if (!(fVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.f68750b = new a(1, t7);
        }
        this.f135212c = aVar;
    }

    @Override // f4.q
    public final p3<T> b() {
        return this.f135211b;
    }

    @Override // p3.x3
    /* JADX INFO: renamed from: getValue */
    public final T getF182175a() {
        return ((a) f4.l.s(this.f135212c, this)).f135213c;
    }

    @Override // f4.g0
    public final f4.i0 m() {
        return this.f135212c;
    }

    @Override // f4.g0
    public final f4.i0 o(f4.i0 i0Var, f4.i0 i0Var2, f4.i0 i0Var3) {
        if (this.f135211b.a(((a) i0Var2).f135213c, ((a) i0Var3).f135213c)) {
            return i0Var2;
        }
        return null;
    }

    @Override // f4.g0
    public final void q(f4.i0 i0Var) {
        i0Var.getClass();
        this.f135212c = (a) i0Var;
    }

    @Override // p3.p1
    public final void setValue(T t7) {
        f4.f fVarI;
        a aVar = (a) f4.l.g(this.f135212c);
        if (this.f135211b.a(aVar.f135213c, t7)) {
            return;
        }
        a<T> aVar2 = this.f135212c;
        synchronized (f4.l.f68775c) {
            f4.f.f68735e.getClass();
            fVarI = f4.l.i();
            ((a) f4.l.n(aVar2, this, fVarI, aVar)).f135213c = t7;
            Unit unit = Unit.INSTANCE;
        }
        f4.l.m(fVarI, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a) f4.l.g(this.f135212c)).f135213c + ")@" + hashCode();
    }

    @Override // p3.p1
    public final e23.l<T, Unit> y() {
        return new q1(this, 8);
    }

    @Override // p3.p1
    public final T z() {
        return getF182175a();
    }
}
