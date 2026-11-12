package q43;

import p43.f2;
import p43.l1;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f142809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f142810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005kotlin.reflect.jvm.internal.impl.resolve.b f142811e;

    public o(f fVar, e eVar) {
        fVar.getClass();
        eVar.getClass();
        this.f142809c = fVar;
        this.f142810d = eVar;
        this.f142811e = p005kotlin.reflect.jvm.internal.impl.resolve.b.h(fVar);
    }

    @Override // q43.d
    public final boolean a(n0 n0Var, n0 n0Var2) {
        n0Var.getClass();
        n0Var2.getClass();
        l1 l1VarA = a.a(false, null, this.f142810d, this.f142809c, 6);
        f2 f2VarI0 = n0Var.I0();
        f2 f2VarI1 = n0Var2.I0();
        p43.h.f135849a.getClass();
        return p43.h.f(l1VarA, f2VarI0, f2VarI1);
    }

    @Override // q43.n
    public final f b() {
        return this.f142809c;
    }

    @Override // q43.n
    public final p005kotlin.reflect.jvm.internal.impl.resolve.b c() {
        return this.f142811e;
    }

    public final boolean d(n0 n0Var, n0 n0Var2) {
        n0Var.getClass();
        n0Var2.getClass();
        return p43.h.j(p43.h.f135849a, a.a(true, null, this.f142810d, this.f142809c, 6), n0Var.I0(), n0Var2.I0());
    }

    public /* synthetic */ o(f fVar, e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fVar, (i14 & 2) != 0 ? e.a.f142787a : eVar);
    }
}
