package h33;

/* JADX INFO: loaded from: classes3.dex */
public class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.j f81509a;

    public w(o13.j jVar) {
        this.f81509a = jVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.c cVar = (x33.c) obj;
        cVar.getClass();
        x33.c cVar2 = u.f81500a;
        o13.j jVar = this.f81509a;
        jVar.getClass();
        e0.f81454a.getClass();
        g0 g0Var = e0.a.f81456b;
        g0Var.getClass();
        h0 h0Var = (h0) g0Var.f81461c.invoke(cVar);
        if (h0Var != null) {
            return h0Var;
        }
        g0 g0Var2 = u.f81502c;
        g0Var2.getClass();
        v vVar = (v) g0Var2.f81461c.invoke(cVar);
        if (vVar == null) {
            return h0.IGNORE;
        }
        o13.j jVar2 = vVar.f81507b;
        return (jVar2 == null || jVar2.f128587d - jVar.f128587d > 0) ? vVar.f81506a : vVar.f81508c;
    }
}
