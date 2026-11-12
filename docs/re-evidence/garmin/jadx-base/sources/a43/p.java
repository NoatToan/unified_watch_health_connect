package a43;

/* JADX INFO: loaded from: classes3.dex */
public class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d f1171b;

    public p(w wVar, p005kotlin.reflect.jvm.internal.impl.builtins.d dVar) {
        this.f1170a = wVar;
        this.f1171b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = w.f1179g;
        w wVar = this.f1170a;
        c0 c0Var = wVar.f1180e;
        b bVar = (b) c0Var.f1110b.getValue(c0Var, c0.Y[0]);
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVar = this.f1171b;
        dVar.getClass();
        t23.e eVarJ = dVar.j(kotlin.reflect.jvm.internal.impl.builtins.f.a.D);
        if (eVarJ != null) {
            return d53.w.g0(bVar.a(eVarJ, wVar), "Collection");
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.d.a(35);
        throw null;
    }
}
