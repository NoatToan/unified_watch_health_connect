package f4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf4/a0;", "T", "Lf4/i0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lu3/c;", "list", "<init>", "(JLu3/c;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0<T> extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u3.c<? extends T> f68716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68718e;

    public a0(long j8, u3.c<? extends T> cVar) {
        super(j8);
        this.f68716c = cVar;
    }

    @Override // f4.i0
    public final void a(i0 i0Var) {
        synchronized (t.f68805a) {
            i0Var.getClass();
            this.f68716c = ((a0) i0Var).f68716c;
            this.f68717d = ((a0) i0Var).f68717d;
            this.f68718e = ((a0) i0Var).f68718e;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // f4.i0
    public final i0 b() {
        return c(l.i().getF68737b());
    }

    @Override // f4.i0
    public final i0 c(long j8) {
        return new a0(j8, this.f68716c);
    }
}
