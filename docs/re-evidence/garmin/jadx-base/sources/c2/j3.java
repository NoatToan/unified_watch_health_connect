package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc2/j3;", "Lh5/s1;", "Lh4/r$c;", "Lh4/d$c;", "vertical", "<init>", "(Lh4/d$c;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j3 extends h4.r.c implements h5.s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h4.d.c f22717a;

    public j3(h4.d.c cVar) {
        this.f22717a = cVar;
    }

    @Override // h5.s1
    public final Object r(g6.c cVar, Object obj) {
        p2 p2Var = obj instanceof p2 ? (p2) obj : null;
        if (p2Var == null) {
            p2Var = new p2(0.0f, false, null, null, 15, null);
        }
        f0.b bVar = f0.f22642a;
        h4.d.c cVar2 = this.f22717a;
        bVar.getClass();
        p2Var.f22813c = new f0.d(cVar2);
        return p2Var;
    }
}
