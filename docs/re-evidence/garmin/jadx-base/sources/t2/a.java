package t2;

import h4.r;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt2/a;", "Lh5/x0;", "Lt2/c;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Le23/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a extends x0<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f161751a;

    public a(e23.a<Unit> aVar) {
        this.f161751a = aVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new c(this.f161751a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f161751a == ((a) obj).f161751a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f161751a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "stylusHandwriting";
        m2Var.f91343c.c(this.f161751a, "onHandwritingSlopExceeded");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        ((c) cVar).f161753c = this.f161751a;
    }
}
