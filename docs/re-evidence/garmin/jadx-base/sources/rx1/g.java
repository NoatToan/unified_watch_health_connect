package rx1;

import android.content.Context;
import e2.f0;
import j02.h0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154963a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dy1.v f154964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f154965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p f154966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f154967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f154968f;

    public /* synthetic */ g(dy1.v vVar, Context context, e23.p pVar, h0 h0Var, e23.l lVar) {
        this.f154964b = vVar;
        this.f154965c = context;
        this.f154966d = pVar;
        this.f154967e = h0Var;
        this.f154968f = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        switch (this.f154963a) {
            case 0:
                f0Var.getClass();
                dy1.v vVar = this.f154964b;
                e23.p pVar = this.f154966d;
                f0.b(f0Var, null, new z3.e(-932541003, true, new e(vVar, pVar, 1)), 3);
                i53.c<dy1.u> cVar = vVar.f61642c;
                f0Var.a(cVar.size(), new h.c(new rk2.b((byte) 0, 12), cVar), new h.d(cVar), new z3.e(2039820996, true, new h.e(cVar, this.f154967e, vVar, this.f154965c, this.f154968f)));
                f0.b(f0Var, null, new z3.e(674953246, true, new e(vVar, pVar, 0)), 3);
                break;
            default:
                f0Var.getClass();
                dy1.v vVar2 = this.f154964b;
                f0.b(f0Var, null, new z3.e(1915114946, true, new xn.t(vVar2, 3)), 3);
                Context context = this.f154965c;
                f0.b(f0Var, null, new z3.e(-1278416263, true, new vv0.e(26, vVar2, context)), 3);
                e23.p pVar2 = this.f154966d;
                f0.b(f0Var, null, new z3.e(-1867350790, true, new e(vVar2, pVar2, 4)), 3);
                i53.c<dy1.u> cVar2 = vVar2.f61642c;
                f0Var.a(cVar2.size(), new xx1.b.c(new xg0.v(28), cVar2), new xx1.b.d(cVar2), new z3.e(2039820996, true, new xx1.b.e(cVar2, this.f154967e, vVar2, context, this.f154968f)));
                f0.b(f0Var, null, new z3.e(1838681979, true, new e(vVar2, pVar2, 5)), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(dy1.v vVar, e23.p pVar, h0 h0Var, Context context, e23.l lVar) {
        this.f154964b = vVar;
        this.f154966d = pVar;
        this.f154967e = h0Var;
        this.f154965c = context;
        this.f154968f = lVar;
    }
}
