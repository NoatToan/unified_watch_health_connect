package p5;

import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp5/c;", "Lh5/x0;", "Lp5/f;", "Lp5/u;", "Lkotlin/Function1;", "Lp5/k0;", "", "properties", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends x0<f> implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<k0, Unit> f135955a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(e23.l<? super k0, Unit> lVar) {
        this.f135955a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new f(false, true, this.f135955a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f135955a == ((c) obj).f135955a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f135955a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "clearAndSetSemantics";
        v.a(m2Var, y());
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((f) cVar).f136011c = this.f135955a;
    }

    @Override // p5.u
    public final q y() {
        q qVar = new q();
        qVar.f136088d = false;
        qVar.f136089e = true;
        this.f135955a.invoke(qVar);
        return qVar;
    }
}
