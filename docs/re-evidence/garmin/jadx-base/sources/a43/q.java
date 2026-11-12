package a43;

/* JADX INFO: loaded from: classes3.dex */
public class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d f1173b;

    public q(w wVar, p005kotlin.reflect.jvm.internal.impl.builtins.d dVar) {
        this.f1172a = wVar;
        this.f1173b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = w.f1179g;
        w wVar = this.f1172a;
        c0 c0Var = wVar.f1180e;
        b bVar = (b) c0Var.f1110b.getValue(c0Var, c0.Y[0]);
        t23.e eVarK = this.f1173b.k("Array");
        eVarK.getClass();
        return d53.w.g0(bVar.a(eVarK, wVar), "Array");
    }
}
