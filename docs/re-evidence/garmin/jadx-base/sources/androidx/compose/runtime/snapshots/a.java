package androidx.compose.runtime.snapshots;

import e23.l;
import f21.g0;
import f4.e;
import f4.f;
import f4.g;
import f4.j;
import f4.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/a;", "Lf4/a;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lf4/j;", "invalid", "<init>", "(JLf4/j;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f6037p = 0;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0079a implements l<j, f4.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Object, Unit> f6038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Object, Unit> f6039b;

        public C0079a(l<Object, Unit> lVar, l<Object, Unit> lVar2) {
            this.f6038a = lVar;
            this.f6039b = lVar2;
        }

        @Override // e23.l
        public final f4.a invoke(j jVar) {
            long j8;
            j jVar2 = jVar;
            synchronized (f4.l.f68775c) {
                j8 = f4.l.f68777e;
                f4.l.f68777e = ((long) 1) + j8;
            }
            return new f4.a(j8, jVar2, this.f6038a, this.f6039b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements l<j, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Object, Unit> f6040a;

        public b(l<Object, Unit> lVar) {
            this.f6040a = lVar;
        }

        @Override // e23.l
        public final e invoke(j jVar) {
            long j8;
            j jVar2 = jVar;
            synchronized (f4.l.f68775c) {
                j8 = f4.l.f68777e;
                f4.l.f68777e = ((long) 1) + j8;
            }
            return new e(j8, jVar2, this.f6040a);
        }
    }

    public a(long j8, j jVar) {
        super(j8, jVar, null, new g0(1));
    }

    @Override // f4.a
    public final f4.a C(l<Object, Unit> lVar, l<Object, Unit> lVar2) {
        return (f4.a) ((f) f4.l.d(new ci0.f(new C0079a(lVar, lVar2), 24)));
    }

    @Override // f4.a, f4.f
    public final void c() {
        synchronized (f4.l.f68775c) {
            o();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // f4.a, f4.f
    public final void k() {
        t.g();
        throw null;
    }

    @Override // f4.a, f4.f
    public final void l() {
        t.g();
        throw null;
    }

    @Override // f4.a, f4.f
    public final void m() {
        f4.l.d(f4.l.f68773a);
    }

    @Override // f4.a, f4.f
    public final f u(l<Object, Unit> lVar) {
        return (e) ((f) f4.l.d(new ci0.f(new b(lVar), 24)));
    }

    @Override // f4.a
    public final g w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
