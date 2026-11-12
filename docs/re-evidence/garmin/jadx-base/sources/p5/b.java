package p5;

import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp5/b;", "Lh5/x0;", "Lp5/f;", "Lp5/u;", "", "mergeDescendants", "Lkotlin/Function1;", "Lp5/k0;", "", "properties", "<init>", "(ZLe23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends x0<f> implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f135949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<k0, Unit> f135950b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(boolean z14, e23.l<? super k0, Unit> lVar) {
        this.f135949a = z14;
        this.f135950b = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new f(this.f135949a, false, this.f135950b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f135949a == bVar.f135949a && this.f135950b == bVar.f135950b;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f135950b.hashCode() + (Boolean.hashCode(this.f135949a) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "semantics";
        m2Var.f91343c.c(Boolean.valueOf(this.f135949a), "mergeDescendants");
        v.a(m2Var, y());
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        f fVar = (f) cVar;
        fVar.f136009a = this.f135949a;
        fVar.f136011c = this.f135950b;
    }

    @Override // p5.u
    public final q y() {
        q qVar = new q();
        qVar.f136088d = this.f135949a;
        this.f135950b.invoke(qVar);
        return qVar;
    }
}
