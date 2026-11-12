package q2;

import f5.c0;
import f5.d0;
import p005kotlin.jvm.internal.r0;
import p40.o0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f142149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2.e f142150c;

    public /* synthetic */ b(d dVar, s2.e eVar, int i14) {
        this.f142148a = i14;
        this.f142149b = dVar;
        this.f142150c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f142148a) {
            case 0:
                d dVar = this.f142149b;
                a aVar = dVar.f142159f;
                ov1.u uVar = new ov1.u(this.f142150c, 27);
                r0 r0Var = new r0();
                dVar.f142158e.d("dataBuilder", aVar, new o0(17, r0Var, uVar));
                T t7 = r0Var.f105810a;
                if (t7 != 0) {
                    return (o2.d) t7;
                }
                p005kotlin.jvm.internal.s.m("result");
                throw null;
            case 1:
                d dVar2 = this.f142149b;
                a aVar2 = dVar2.f142160g;
                b bVar = new b(dVar2, this.f142150c, 2);
                r0 r0Var2 = new r0();
                dVar2.f142158e.d("positioner", aVar2, new o0(17, r0Var2, bVar));
                T t14 = r0Var2.f105810a;
                if (t14 != 0) {
                    return (n4.d) t14;
                }
                p005kotlin.jvm.internal.s.m("result");
                throw null;
            default:
                c0 c0VarInvoke = this.f142149b.f142156c.invoke();
                if (!c0VarInvoke.isAttached()) {
                    c0VarInvoke = null;
                }
                c0 c0Var = c0VarInvoke;
                if (c0Var != null) {
                    return this.f142150c.v1(c0Var).o(d0.e(c0Var));
                }
                n4.d.f123545e.getClass();
                return n4.d.f123546f;
        }
    }
}
